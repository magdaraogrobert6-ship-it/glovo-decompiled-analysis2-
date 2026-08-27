package o;

import com.sentiance.sdk.devicestate.LocationPermissionLevel;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class r8lambdaLO7BTouWWM3AKC8uHzRiEgpEDYk {
    static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[LocationPermissionLevel.values().length];
        read = iArr;
        try {
            iArr[LocationPermissionLevel.ONLY_WHILE_IN_USE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            read[LocationPermissionLevel.ALWAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
