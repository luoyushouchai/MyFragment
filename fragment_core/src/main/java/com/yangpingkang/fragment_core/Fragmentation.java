package com.yangpingkang.fragment_core;

import android.support.annotation.IntDef;

import com.yangpingkang.fragment_core.helper.ExceptionHandler;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by yangpingkang on 2018/1/14.
 */

public class Fragmentation {

    public static final int NONE = 0;

    public static final int SHAKE = 1;

    public static final int BUBBLE = 2;

    static volatile Fragmentation INSTANCE;
    private boolean debug;
    private int mode = BUBBLE;
    private ExceptionHandler handler;

    @IntDef({NONE, SHAKE, BUBBLE})
    @Retention(RetentionPolicy.SOURCE)
    @interface StackViewMode {
    }

    public static Fragmentation getDefault() {
        if (INSTANCE == null) {
            synchronized (Fragmentation.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Fragmentation(new FragmentationBuilder());
                }
            }

        }
        return INSTANCE;
    }

    Fragmentation(FragmentationBuilder builder) {

    }


    public static class FragmentationBuilder {
        private boolean debug;
        private int mode;
        private ExceptionHandler handler;

        public FragmentationBuilder debug(boolean debug) {
            this.debug = debug;
            return this;
        }

        public FragmentationBuilder mode(@StackViewMode int mode) {
            this.mode = mode;
            return this;
        }

        public FragmentationBuilder handler(ExceptionHandler handler) {
            this.handler = handler;
            return this;
        }

        public Fragmentation install() {
            synchronized (Fragmentation.class) {
                if (Fragmentation.INSTANCE != null) {
                    throw new RuntimeException("Default instance already exists. It may be only set once before it's used the first time to ensure consistent behavior.");
                }
                Fragmentation.INSTANCE = new Fragmentation(this);
                return Fragmentation.INSTANCE;
            }
        }

    }


}































