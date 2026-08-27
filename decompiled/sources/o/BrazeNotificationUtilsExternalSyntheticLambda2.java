package o;

import com.sentiance.sdk.TransmittableDataType;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class BrazeNotificationUtilsExternalSyntheticLambda2 {
    static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[TransmittableDataType.values().length];
        write = iArr;
        try {
            iArr[TransmittableDataType.SDK_INFO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            write[TransmittableDataType.VEHICLE_CRASH_INFO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            write[TransmittableDataType.GENERAL_DETECTIONS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
