package com.yangpingkang.fragment_core.debug;

import java.util.List;

/**
 * Created by yangpingkang on 2018/1/14.
 */

public class DebugFragmentRecord {
    public CharSequence fragmentName;
    public List<DebugFragmentRecord> childFragmentRecord;

    public DebugFragmentRecord(CharSequence fragmentName, List<DebugFragmentRecord> childFragmentRecord) {
        this.fragmentName = fragmentName;
        this.childFragmentRecord = childFragmentRecord;
    }
}
