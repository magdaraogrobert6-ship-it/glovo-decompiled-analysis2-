package o;

import com.sentiance.sdk.api.requests.SdkInitConfigRequestReason;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class BrazeInternalLocationApiCompanion {
    public static final /* synthetic */ int[] IconCompatParcelizer;

    static {
        int[] iArr = new int[SdkInitConfigRequestReason.values().length];
        try {
            iArr[SdkInitConfigRequestReason.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SdkInitConfigRequestReason.SDK_DETECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SdkInitConfigRequestReason.APP_REPORTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        IconCompatParcelizer = iArr;
    }
}
