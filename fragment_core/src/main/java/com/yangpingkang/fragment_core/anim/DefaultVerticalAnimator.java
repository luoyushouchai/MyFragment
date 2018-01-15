package com.yangpingkang.fragment_core.anim;

import android.os.Parcel;

import com.yangpingkang.fragment_core.R;

/**
 * Created by yangpingkang on 2018/1/14.
 */

public class DefaultVerticalAnimator extends FragmentAnimator {

    public DefaultVerticalAnimator() {
        enter = R.anim.v_fragment_enter;
        exit = R.anim.v_fragment_exit;
        popEnter = R.anim.v_fragment_pop_enter;
        popExit = R.anim.v_fragment_pop_exit;
    }

    protected DefaultVerticalAnimator(Parcel in) {
        super(in);
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<DefaultVerticalAnimator> CREATOR = new Creator<DefaultVerticalAnimator>() {
        @Override
        public DefaultVerticalAnimator createFromParcel(Parcel in) {
            return new DefaultVerticalAnimator(in);
        }

        @Override
        public DefaultVerticalAnimator[] newArray(int size) {
            return new DefaultVerticalAnimator[size];
        }
    };

}
