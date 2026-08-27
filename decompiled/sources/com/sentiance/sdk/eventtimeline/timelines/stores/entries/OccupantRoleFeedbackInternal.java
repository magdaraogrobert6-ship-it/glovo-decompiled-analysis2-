package com.sentiance.sdk.eventtimeline.timelines.stores.entries;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getImageDownloadSuccessful;

/* JADX INFO: loaded from: classes3.dex */
public enum OccupantRoleFeedbackInternal {
    DRIVER("driver"),
    PASSENGER("passenger"),
    UNSET("unset");

    public static final read Companion = new read(null);
    private final String value;

    public static final class read {
        public read(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final String getValue() {
        return this.value;
    }

    public final OccupantRoleInternal toOccupantRole() {
        int i = getImageDownloadSuccessful.read[ordinal()];
        if (i == 1) {
            return OccupantRoleInternal.DRIVER;
        }
        if (i == 2) {
            return OccupantRoleInternal.PASSENGER;
        }
        if (i == 3) {
            return OccupantRoleInternal.UNAVAILABLE;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return null;
    }

    OccupantRoleFeedbackInternal(String str) {
        this.value = str;
    }
}
