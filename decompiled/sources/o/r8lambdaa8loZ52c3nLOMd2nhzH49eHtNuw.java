package o;

import com.sentiance.sdk.ondevicecommon.CrashSeverityInternal;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class r8lambdaa8loZ52c3nLOMd2nhzH49eHtNuw {
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[CrashSeverityInternal.values().length];
        try {
            iArr[CrashSeverityInternal.LOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CrashSeverityInternal.MEDIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CrashSeverityInternal.HIGH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        read = iArr;
    }
}
