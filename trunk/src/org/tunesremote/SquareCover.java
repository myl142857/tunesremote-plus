package org.tunesremote;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Author: aml.curran
 * Date: 16/07/2012
 * Time: 16:13
 */
public class SquareCover extends ImageView {

	public SquareCover(Context context) {
		super(context);
	}

	public SquareCover(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public SquareCover(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

		int widthMode = MeasureSpec.getMode(widthMeasureSpec);
		int widthSize = MeasureSpec.getSize(widthMeasureSpec);

		int heightMode = MeasureSpec.getMode(heightMeasureSpec);
		int heightSize = MeasureSpec.getSize(heightMeasureSpec);

		int chosenWidth = chooseDimension(widthMode, widthSize);
		int chosenHeight = chooseDimension(heightMode, heightSize);

		int chosenDimension = Math.min(chosenWidth, chosenHeight);

		setMeasuredDimension(chosenDimension, chosenDimension);
	}

	private int chooseDimension(int mode, int size) {
		if (mode == MeasureSpec.AT_MOST || mode == MeasureSpec.EXACTLY) {
			return size;
		} else { // (mode == MeasureSpec.UNSPECIFIED)
			return 300;
		}
	}

}
