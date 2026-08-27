package com.sentiance.sdk.eventtimeline.timelines.stores.entries;

import java.util.Arrays;
import java.util.List;
import o.IInAppMessageZippedAssetHtml;

/* JADX INFO: loaded from: classes3.dex */
public enum VenueSignificance {
    UNSET(1),
    UNKNOWN_PROVISIONAL(2),
    POI_PROVISIONAL(3),
    HOME_PROVISIONAL(4),
    WORK_PROVISIONAL(5),
    UNKNOWN(6),
    POI(7),
    HOME(8),
    WORK(9);

    public final int value;

    public static List<VenueSignificance> getConfirmedTypes() {
        return Arrays.asList(UNKNOWN, POI, HOME, WORK);
    }

    public static List<VenueSignificance> getProvisionalTypes() {
        return Arrays.asList(UNKNOWN_PROVISIONAL, POI_PROVISIONAL, HOME_PROVISIONAL, WORK_PROVISIONAL);
    }

    public boolean isOfTypeProvisional() {
        int i = this.value;
        return i >= UNKNOWN_PROVISIONAL.value && i <= WORK_PROVISIONAL.value;
    }

    public VenueSignificance toConfirmedType() {
        int i = IInAppMessageZippedAssetHtml.IconCompatParcelizer[ordinal()];
        if (i == 5) {
            return UNKNOWN;
        }
        if (i == 6) {
            return POI;
        }
        if (i != 7) {
            return i != 8 ? this : WORK;
        }
        return HOME;
    }

    public byte toThriftType() {
        int i = IInAppMessageZippedAssetHtml.IconCompatParcelizer[ordinal()];
        if (i == 2) {
            return (byte) 2;
        }
        if (i != 3) {
            return i != 4 ? (byte) 1 : (byte) 3;
        }
        return (byte) 4;
    }

    VenueSignificance(int i) {
        this.value = i;
    }

    public static VenueSignificance findByValue(int i) {
        switch (i) {
            case 1:
                return UNSET;
            case 2:
                return UNKNOWN_PROVISIONAL;
            case 3:
                return POI_PROVISIONAL;
            case 4:
                return HOME_PROVISIONAL;
            case 5:
                return WORK_PROVISIONAL;
            case 6:
                return UNKNOWN;
            case 7:
                return POI;
            case 8:
                return HOME;
            case 9:
                return WORK;
            default:
                return null;
        }
    }
}
