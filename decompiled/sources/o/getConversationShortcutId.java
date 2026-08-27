package o;

import com.sentiance.sdk.feature.FeatureType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class getConversationShortcutId {
    public static final /* synthetic */ int[] IconCompatParcelizer;

    static {
        int[] iArr = new int[FeatureType.values().length];
        IconCompatParcelizer = iArr;
        try {
            iArr[FeatureType.EVENT_TIMELINING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            IconCompatParcelizer[FeatureType.CRASH_DETECTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            IconCompatParcelizer[FeatureType.LIFESTYLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            IconCompatParcelizer[FeatureType.USER_CONTEXT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            IconCompatParcelizer[FeatureType.DRIVING_INSIGHTS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            IconCompatParcelizer[FeatureType.SMART_GEOFENCES.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            IconCompatParcelizer[FeatureType.DATA_COLLECTOR.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
