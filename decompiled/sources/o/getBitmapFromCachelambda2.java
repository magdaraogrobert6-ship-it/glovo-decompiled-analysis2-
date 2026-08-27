package o;

import com.sentiance.sdk.SdkStatus;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class getBitmapFromCachelambda2 {
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[SdkStatus.StartStatus.values().length];
        read = iArr;
        try {
            iArr[SdkStatus.StartStatus.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            read[SdkStatus.StartStatus.START_EXPIRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            read[SdkStatus.StartStatus.STARTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            read[SdkStatus.StartStatus.NOT_STARTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
