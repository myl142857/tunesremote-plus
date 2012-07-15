package org.tunesremote.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;

/**
 * Author: aml.curran
 * Date: 14/07/2012
 * Time: 21:59
 */
public class LockscreenReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		KeyEvent pressed = intent.getParcelableExtra(Intent.EXTRA_KEY_EVENT);
		Intent nService = new Intent(context, NotificationService.class);
		if (pressed.getKeyCode() == KeyEvent.KEYCODE_MEDIA_PLAY_PAUSE) {
			context.startService(nService.setAction(NotificationService.ACTION_PAUSE));
		} else {
			context.startService(nService.setAction(NotificationService.ACTION_NEXT_TRACK));
		}
	}
}
