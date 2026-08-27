package o;

import com.sentiance.sdk.devicestate.LocationPermissionLevel;
import com.sentiance.sdk.offthegrid.OffTheGridLocationSettingStateProvider;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class r8lambdaXW0ch65c0ovp6MIs5jryjUa2cbA {
    static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[LocationPermissionLevel.values().length];
        write = iArr;
        try {
            iArr[LocationPermissionLevel.ALWAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            write[LocationPermissionLevel.ONLY_WHILE_IN_USE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[OffTheGridLocationSettingStateProvider.State.values().length];
        RemoteActionCompatParcelizer = iArr2;
        try {
            iArr2[OffTheGridLocationSettingStateProvider.State.OFF.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            RemoteActionCompatParcelizer[OffTheGridLocationSettingStateProvider.State.BATTERY_SAVING.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            RemoteActionCompatParcelizer[OffTheGridLocationSettingStateProvider.State.DEVICE_ONLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
