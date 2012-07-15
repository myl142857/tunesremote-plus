package org.tunesremote.util;

import android.os.Build;

public class Helper {

	public static boolean isApiAboveOrEqual(int api) {
		return Build.VERSION.SDK_INT >= api;
	}

}
