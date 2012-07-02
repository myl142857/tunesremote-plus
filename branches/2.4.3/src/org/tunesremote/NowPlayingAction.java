package org.tunesremote;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

/**
 * Created with IntelliJ IDEA. User: Alex Date: 26/06/2012 Time: 15:12 To change
 * this template use File | Settings | File Templates.
 */
public class NowPlayingAction extends RelativeLayout {

   public NowPlayingAction(Context context) {
      super(context, null);
   }

   public NowPlayingAction(Context context, AttributeSet attrs) {
      super(context, attrs);
      LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
      inflater.inflate(R.layout.now_playing_action, this, true);
   }
}
