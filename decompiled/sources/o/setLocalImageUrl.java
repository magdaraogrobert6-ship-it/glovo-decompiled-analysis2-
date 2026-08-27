package o;

import com.sentiance.sdk.eventtimeline.timelines.stores.entries.VenueType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class setLocalImageUrl {
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[VenueType.values().length];
        serializer = iArr;
        try {
            iArr[VenueType.DRINK_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            serializer[VenueType.DRINK_EVENING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            serializer[VenueType.EDUCATION_INDEPENDENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            serializer[VenueType.EDUCATION_PARENTS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            serializer[VenueType.HEALTH.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            serializer[VenueType.INDUSTRIAL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            serializer[VenueType.LEISURE_BEACH.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            serializer[VenueType.LEISURE_DAY.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            serializer[VenueType.LEISURE_EVENING.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            serializer[VenueType.LEISURE_MUSEUM.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            serializer[VenueType.LEISURE_NATURE.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            serializer[VenueType.LEISURE_PARK.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            serializer[VenueType.OFFICE.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            serializer[VenueType.RELIGION.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            serializer[VenueType.RESIDENTIAL.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            serializer[VenueType.RESTO_MID.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            serializer[VenueType.RESTO_SHORT.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            serializer[VenueType.SHOP_LONG.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            serializer[VenueType.SHOP_SHORT.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            serializer[VenueType.SPORT.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            serializer[VenueType.SPORT_ATTEND.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            serializer[VenueType.TRAVEL_BUS.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            serializer[VenueType.TRAVEL_CONFERENCE.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            serializer[VenueType.TRAVEL_FILL.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            serializer[VenueType.TRAVEL_HOTEL.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            serializer[VenueType.TRAVEL_LONG.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            serializer[VenueType.TRAVEL_SHORT.ordinal()] = 27;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            serializer[VenueType.UNKNOWN.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
    }
}
