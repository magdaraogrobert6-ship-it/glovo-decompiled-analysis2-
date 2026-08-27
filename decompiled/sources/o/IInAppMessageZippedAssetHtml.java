package o;

import com.sentiance.sdk.eventtimeline.timelines.stores.entries.VenueSignificance;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class IInAppMessageZippedAssetHtml {
    public static final /* synthetic */ int[] IconCompatParcelizer;

    static {
        int[] iArr = new int[VenueSignificance.values().length];
        IconCompatParcelizer = iArr;
        try {
            iArr[VenueSignificance.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            IconCompatParcelizer[VenueSignificance.POI.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            IconCompatParcelizer[VenueSignificance.HOME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            IconCompatParcelizer[VenueSignificance.WORK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            IconCompatParcelizer[VenueSignificance.UNKNOWN_PROVISIONAL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            IconCompatParcelizer[VenueSignificance.POI_PROVISIONAL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            IconCompatParcelizer[VenueSignificance.HOME_PROVISIONAL.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            IconCompatParcelizer[VenueSignificance.WORK_PROVISIONAL.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
