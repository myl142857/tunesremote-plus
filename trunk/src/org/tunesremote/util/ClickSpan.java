package org.tunesremote.util;

import org.tunesremote.LibraryActivity;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;

/**
 * Uses a fudge method to allow us to override clicks in a text view. Used in {@link LibraryActivity}. 
 * I found this on StackOverflow at http://stackoverflow.com/questions/1697084/handle-textview-link-click-in-my-android-app
 * so I cannot take the credit for this
 * @author Jonathan S.
 *
 */
public class ClickSpan extends ClickableSpan {

	private OnClickListener mListener;

	public ClickSpan(OnClickListener listener) {
		mListener = listener;
	}

	@Override
	public void onClick(View widget) {
		if (mListener != null) mListener.onClick();
	}

	public interface OnClickListener {
		/**
		 * What to do when a link is clicked.
		 */
		void onClick();
	}
	
	public static void clickify(TextView view, final String clickableText, 
		    final ClickSpan.OnClickListener listener) {

		    CharSequence text = view.getText();
		    String string = text.toString();
		    ClickSpan span = new ClickSpan(listener);

		    int start = string.indexOf(clickableText);
		    int end = start + clickableText.length();
		    if (start == -1) return;

		    if (text instanceof Spannable) {
		        ((Spannable)text).setSpan(span, start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		    } else {
		        SpannableString s = SpannableString.valueOf(text);
		        s.setSpan(span, start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		        view.setText(s);
		    }

		    MovementMethod m = view.getMovementMethod();
		    if ((m == null) || !(m instanceof LinkMovementMethod)) {
		        view.setMovementMethod(LinkMovementMethod.getInstance());
		    }
	}

}
