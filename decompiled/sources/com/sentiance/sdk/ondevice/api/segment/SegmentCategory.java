package com.sentiance.sdk.ondevice.api.segment;

import com.sentiance.sdk.DontObfuscate;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public enum SegmentCategory {
    LEISURE(30400),
    MOBILITY(30600),
    WORK_LIFE(30800);

    private final int uniqueId;

    public int getUniqueId() {
        return this.uniqueId;
    }

    SegmentCategory(int i) {
        this.uniqueId = i;
    }

    public static SegmentCategory fromEngineCategory(int i) {
        for (SegmentCategory segmentCategory : values()) {
            if (segmentCategory.uniqueId == i) {
                return segmentCategory;
            }
        }
        return null;
    }
}
