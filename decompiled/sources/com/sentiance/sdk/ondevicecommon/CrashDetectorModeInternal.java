package com.sentiance.sdk.ondevicecommon;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public enum CrashDetectorModeInternal {
    UNKNOWN(0),
    CAR(1),
    TWO_WHEELER(2);

    public static final RemoteActionCompatParcelizer Companion = new RemoteActionCompatParcelizer(null);
    private final int mode;

    public static final class RemoteActionCompatParcelizer {
        public RemoteActionCompatParcelizer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final int getMode() {
        return this.mode;
    }

    CrashDetectorModeInternal(int i) {
        this.mode = i;
    }
}
