package com.qualtrics.digital;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class ViewCounter {
    private static ViewCounter mInstance;
    private HashMap<String, Integer> mViewsVisitedMap = new HashMap<>();

    public int getTotalViewsVisited() {
        Iterator<Integer> it = this.mViewsVisitedMap.values().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return iIntValue;
    }

    public int getUniqueViewsVisited() {
        return this.mViewsVisitedMap.keySet().size();
    }

    public void registerViewVisit(String str) {
        this.mViewsVisitedMap.put(str, Integer.valueOf((this.mViewsVisitedMap.containsKey(str) ? this.mViewsVisitedMap.get(str).intValue() : 0) + 1));
    }

    public void reset() {
        this.mViewsVisitedMap = new HashMap<>();
    }

    public static ViewCounter instance() {
        if (mInstance == null) {
            mInstance = new ViewCounter();
        }
        return mInstance;
    }
}
