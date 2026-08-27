package o;

import com.sentiance.sdk.eventtimeline.timelines.creators.SafetyScoreType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class getLocalPrefetchedAssetPaths {
    public static final /* synthetic */ int[] IconCompatParcelizer;

    static {
        int[] iArr = new int[SafetyScoreType.values().length];
        try {
            iArr[SafetyScoreType.SMOOTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SafetyScoreType.FOCUS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SafetyScoreType.CALL_WHILE_MOVING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SafetyScoreType.LEGAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        IconCompatParcelizer = iArr;
    }
}
