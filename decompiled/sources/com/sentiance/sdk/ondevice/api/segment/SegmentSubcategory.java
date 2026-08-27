package com.sentiance.sdk.ondevice.api.segment;

import com.sentiance.sdk.DontObfuscate;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public enum SegmentSubcategory {
    COMMUTE(40000),
    DRIVING(40100),
    ENTERTAINMENT(40200),
    FAMILY(40300),
    HOME(40500),
    SHOPPING(40700),
    SOCIAL(40800),
    TRANSPORT(40900),
    TRAVEL(41000),
    WELLBEING(41100),
    WINING_AND_DINING(41200),
    WORK(41300);

    private final int uniqueId;

    public int getUniqueId() {
        return this.uniqueId;
    }

    SegmentSubcategory(int i) {
        this.uniqueId = i;
    }

    public static SegmentSubcategory fromEngineCategory(int i) {
        for (SegmentSubcategory segmentSubcategory : values()) {
            if (segmentSubcategory.uniqueId == i) {
                return segmentSubcategory;
            }
        }
        return null;
    }
}
