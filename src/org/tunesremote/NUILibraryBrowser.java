package org.tunesremote;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Window;

/**
 * A new way of browsing the library, similar to Google Music where it
 * uses tabs instead of multiple activitys. This shouldn't be enabled 
 * until thoroughly tested, although will show up when debugging on the 
 * ControlActivity's menu
 * @author Alex
 *
 */
public class NUILibraryBrowser extends FragmentActivity {
	
	@Override
	public void onCreate(Bundle saved) {
		super.onCreate(saved);
		if (PreferenceManager.getDefaultSharedPreferences(this).getBoolean(this.getString(R.string.pref_fullscreen), true)) {
			this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		}
		setContentView(R.layout.nui_library_browser);
		ViewPager vp = (ViewPager) findViewById(R.id.browse_pager);
		vp.setAdapter(new BrowserFragmentPager(getSupportFragmentManager()));
	}
	
	public class BrowserFragmentPager extends FragmentPagerAdapter {

		public BrowserFragmentPager(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int arg0) {
			return new Fragment();
		}

		@Override
		public int getCount() {
			return 3;
		}

		@Override
		public CharSequence getPageTitle(int position) {
			return "hi";
		}
		
	};
	

}
