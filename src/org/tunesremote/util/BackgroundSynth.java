package org.tunesremote.util;

/**
 * Author: aml.curran
 * Date: 15/07/2012
 * Time: 16:17
 */

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

/**
 * Used to create the backgrounds for ControlActivity.
 * Currently just experimental
 */
public class BackgroundSynth {

	public static Bitmap translucentCover(Bitmap src) {

		Bitmap bitmap = Bitmap.createBitmap(src.getWidth(), src.getHeight(), Bitmap.Config.ARGB_8888);
		Canvas c = new Canvas(bitmap);
		Paint transPaint = new Paint();
		transPaint.setAlpha(120);
		c.drawBitmap(bitmap, new Matrix(), transPaint);
		return bitmap;

	}

}
