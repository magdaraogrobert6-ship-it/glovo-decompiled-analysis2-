package o;

import com.sentiance.sdk.devicestate.LocationPermissionLevel;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class isGeofencesEnabledFromEnvironmentlambda3 {
    public static final /* synthetic */ int[] IconCompatParcelizer;

    static {
        int[] iArr = new int[LocationPermissionLevel.values().length];
        IconCompatParcelizer = iArr;
        try {
            iArr[LocationPermissionLevel.ALWAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            IconCompatParcelizer[LocationPermissionLevel.ONLY_WHILE_IN_USE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            IconCompatParcelizer[LocationPermissionLevel.NEVER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
