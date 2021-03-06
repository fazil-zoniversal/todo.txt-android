package com.todotxt.todotxttouch;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.RelativeLayout;

public class RelativeLayoutCheckable extends RelativeLayout implements Checkable {


	    public RelativeLayoutCheckable(Context context, AttributeSet attrs) {
	        super(context, attrs);
	    }

	    private boolean checked;


	    @Override
	    public boolean isChecked() {
	        return checked;
	    }

	    @Override
	    public void setChecked(boolean checked) {
	        this.checked = checked; 

	        this.setBackgroundColor(checked ? getResources().getColor(R.color.activated_background) : getResources().getColor(R.color.grey));
	        //FIXME: this is a hack to get a grey background when swiping without breaking highlight when selected:
	        this.findViewById(R.id.swipe_view).setBackgroundColor(checked ? getResources().getColor(android.R.color.transparent) : getResources().getColor(R.color.white));
	    }

	    @Override
	    public void toggle() {
	        this.checked = !this.checked;
	    }
	}