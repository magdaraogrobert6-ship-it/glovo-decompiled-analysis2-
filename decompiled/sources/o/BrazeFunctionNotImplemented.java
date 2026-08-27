package o;

import com.sentiance.visitessentials.VenueType;

/* JADX INFO: loaded from: classes4.dex */
public final class BrazeFunctionNotImplemented {
    public static VenueType write(String str) {
        str.getClass();
        for (VenueType venueType : VenueType.values()) {
            if (setCarryoverInAppMessage.serializer(venueType.name(), str, true)) {
                return venueType;
            }
        }
        return VenueType.unknown;
    }
}
