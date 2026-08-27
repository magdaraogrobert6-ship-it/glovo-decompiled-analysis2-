package o;

import com.sentiance.sdk.reset.ResetFailureReason;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class handlePush {
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[ResetFailureReason.values().length];
        try {
            iArr[ResetFailureReason.SDK_RESET_IN_PROGRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ResetFailureReason.SDK_INIT_IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ResetFailureReason.EXCEPTION_OR_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        read = iArr;
    }
}
