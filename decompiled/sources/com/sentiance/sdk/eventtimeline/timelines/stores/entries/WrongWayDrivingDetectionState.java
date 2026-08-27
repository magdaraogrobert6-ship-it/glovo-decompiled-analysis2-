package com.sentiance.sdk.eventtimeline.timelines.stores.entries;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public enum WrongWayDrivingDetectionState {
    NOT_ATTEMPTED(0),
    DETECTED(1);

    public static final IconCompatParcelizer Companion = new IconCompatParcelizer(null);
    private final int intValue;

    public static final class IconCompatParcelizer {
        public IconCompatParcelizer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final int getIntValue() {
        return this.intValue;
    }

    WrongWayDrivingDetectionState(int i) {
        this.intValue = i;
    }
}
