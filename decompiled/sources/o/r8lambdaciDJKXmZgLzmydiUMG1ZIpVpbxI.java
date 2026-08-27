package o;

import com.sentiance.sdk.eventtimeline.timelines.creators.TransportChangeType;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.OccupantRoleInternal;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.VenueSignificance;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.VenueType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class r8lambdaciDJKXmZgLzmydiUMG1ZIpVpbxI {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    public static final /* synthetic */ int[] serializer;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[OccupantRoleInternal.values().length];
        try {
            iArr[OccupantRoleInternal.DRIVER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OccupantRoleInternal.PASSENGER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OccupantRoleInternal.UNAVAILABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        write = iArr;
        int[] iArr2 = new int[TransportChangeType.values().length];
        try {
            iArr2[TransportChangeType.TRANSPORT_BIKING.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[TransportChangeType.TRANSPORT_RUNNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[TransportChangeType.TRANSPORT_WALKING.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[TransportChangeType.TRANSPORT_ON_FOOT.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[TransportChangeType.TRANSPORT_TRAIN.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[TransportChangeType.TRANSPORT_RAIL.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[TransportChangeType.TRANSPORT_TRAM.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[TransportChangeType.TRANSPORT_MOTORCYCLE.ordinal()] = 8;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[TransportChangeType.TRANSPORT_CAR.ordinal()] = 9;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[TransportChangeType.TRANSPORT_VEHICLE.ordinal()] = 10;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[TransportChangeType.TRANSPORT_BUS.ordinal()] = 11;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[TransportChangeType.TRANSPORT_UNKNOWN.ordinal()] = 12;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[TransportChangeType.TRANSPORT_IDLE.ordinal()] = 13;
        } catch (NoSuchFieldError unused16) {
        }
        IconCompatParcelizer = iArr2;
        int[] iArr3 = new int[VenueType.values().length];
        try {
            iArr3[VenueType.DRINK_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[VenueType.DRINK_EVENING.ordinal()] = 2;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[VenueType.EDUCATION_INDEPENDENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr3[VenueType.EDUCATION_PARENTS.ordinal()] = 4;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr3[VenueType.HEALTH.ordinal()] = 5;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr3[VenueType.INDUSTRIAL.ordinal()] = 6;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr3[VenueType.LEISURE_BEACH.ordinal()] = 7;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr3[VenueType.LEISURE_DAY.ordinal()] = 8;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr3[VenueType.LEISURE_EVENING.ordinal()] = 9;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr3[VenueType.LEISURE_MUSEUM.ordinal()] = 10;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr3[VenueType.LEISURE_NATURE.ordinal()] = 11;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr3[VenueType.LEISURE_PARK.ordinal()] = 12;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr3[VenueType.OFFICE.ordinal()] = 13;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr3[VenueType.RELIGION.ordinal()] = 14;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr3[VenueType.RESIDENTIAL.ordinal()] = 15;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr3[VenueType.RESTO_MID.ordinal()] = 16;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr3[VenueType.RESTO_SHORT.ordinal()] = 17;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr3[VenueType.SHOP_LONG.ordinal()] = 18;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr3[VenueType.SHOP_SHORT.ordinal()] = 19;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr3[VenueType.SPORT.ordinal()] = 20;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr3[VenueType.SPORT_ATTEND.ordinal()] = 21;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr3[VenueType.TRAVEL_BUS.ordinal()] = 22;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr3[VenueType.TRAVEL_CONFERENCE.ordinal()] = 23;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr3[VenueType.TRAVEL_FILL.ordinal()] = 24;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr3[VenueType.TRAVEL_HOTEL.ordinal()] = 25;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr3[VenueType.TRAVEL_LONG.ordinal()] = 26;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr3[VenueType.TRAVEL_SHORT.ordinal()] = 27;
        } catch (NoSuchFieldError unused43) {
        }
        serializer = iArr3;
        int[] iArr4 = new int[VenueSignificance.values().length];
        try {
            iArr4[VenueSignificance.POI.ordinal()] = 1;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr4[VenueSignificance.POI_PROVISIONAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr4[VenueSignificance.HOME.ordinal()] = 3;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr4[VenueSignificance.HOME_PROVISIONAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr4[VenueSignificance.WORK.ordinal()] = 5;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr4[VenueSignificance.WORK_PROVISIONAL.ordinal()] = 6;
        } catch (NoSuchFieldError unused49) {
        }
        RemoteActionCompatParcelizer = iArr4;
    }
}
