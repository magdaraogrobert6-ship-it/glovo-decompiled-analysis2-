package o;

import com.sentiance.sdk.eventtimeline.timelines.creators.TransportChangeType;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.VenueType;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class getInlineImageStylelambda1 {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[TransportChangeType.values().length];
        RemoteActionCompatParcelizer = iArr;
        try {
            iArr[TransportChangeType.STATIONARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            RemoteActionCompatParcelizer[TransportChangeType.OFF_THE_GRID.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            RemoteActionCompatParcelizer[TransportChangeType.TRANSPORT_BIKING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            RemoteActionCompatParcelizer[TransportChangeType.TRANSPORT_CAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            RemoteActionCompatParcelizer[TransportChangeType.TRANSPORT_TRAIN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            RemoteActionCompatParcelizer[TransportChangeType.TRANSPORT_TRAM.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            RemoteActionCompatParcelizer[TransportChangeType.TRANSPORT_WALKING.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            RemoteActionCompatParcelizer[TransportChangeType.TRANSPORT_RUNNING.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            RemoteActionCompatParcelizer[TransportChangeType.TRANSPORT_BUS.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            RemoteActionCompatParcelizer[TransportChangeType.TRANSPORT_ON_FOOT.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            RemoteActionCompatParcelizer[TransportChangeType.TRANSPORT_VEHICLE.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            RemoteActionCompatParcelizer[TransportChangeType.TRANSPORT_RAIL.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            RemoteActionCompatParcelizer[TransportChangeType.TRANSPORT_MOTORCYCLE.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            RemoteActionCompatParcelizer[TransportChangeType.TRANSPORT_UNKNOWN.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            RemoteActionCompatParcelizer[TransportChangeType.TRANSPORT_IDLE.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        int[] iArr2 = new int[VenueType.values().length];
        read = iArr2;
        try {
            iArr2[VenueType.DRINK_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            read[VenueType.DRINK_EVENING.ordinal()] = 2;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            read[VenueType.EDUCATION_INDEPENDENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            read[VenueType.EDUCATION_PARENTS.ordinal()] = 4;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            read[VenueType.HEALTH.ordinal()] = 5;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            read[VenueType.INDUSTRIAL.ordinal()] = 6;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            read[VenueType.LEISURE_BEACH.ordinal()] = 7;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            read[VenueType.LEISURE_DAY.ordinal()] = 8;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            read[VenueType.LEISURE_EVENING.ordinal()] = 9;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            read[VenueType.LEISURE_MUSEUM.ordinal()] = 10;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            read[VenueType.LEISURE_NATURE.ordinal()] = 11;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            read[VenueType.LEISURE_PARK.ordinal()] = 12;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            read[VenueType.OFFICE.ordinal()] = 13;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            read[VenueType.RELIGION.ordinal()] = 14;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            read[VenueType.RESIDENTIAL.ordinal()] = 15;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            read[VenueType.RESTO_MID.ordinal()] = 16;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            read[VenueType.RESTO_SHORT.ordinal()] = 17;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            read[VenueType.SHOP_LONG.ordinal()] = 18;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            read[VenueType.SHOP_SHORT.ordinal()] = 19;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            read[VenueType.SPORT.ordinal()] = 20;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            read[VenueType.SPORT_ATTEND.ordinal()] = 21;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            read[VenueType.TRAVEL_BUS.ordinal()] = 22;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            read[VenueType.TRAVEL_CONFERENCE.ordinal()] = 23;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            read[VenueType.TRAVEL_FILL.ordinal()] = 24;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            read[VenueType.TRAVEL_HOTEL.ordinal()] = 25;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            read[VenueType.TRAVEL_LONG.ordinal()] = 26;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            read[VenueType.TRAVEL_SHORT.ordinal()] = 27;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            read[VenueType.UNKNOWN.ordinal()] = 28;
        } catch (NoSuchFieldError unused43) {
        }
    }
}
