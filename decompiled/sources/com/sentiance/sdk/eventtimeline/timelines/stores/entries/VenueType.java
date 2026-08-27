package com.sentiance.sdk.eventtimeline.timelines.stores.entries;

import o.setLocalImageUrl;

/* JADX INFO: loaded from: classes3.dex */
public enum VenueType {
    UNKNOWN(1),
    DRINK_DAY(2),
    DRINK_EVENING(3),
    EDUCATION_INDEPENDENT(4),
    EDUCATION_PARENTS(5),
    HEALTH(6),
    INDUSTRIAL(7),
    LEISURE_BEACH(8),
    LEISURE_DAY(9),
    LEISURE_EVENING(10),
    LEISURE_MUSEUM(11),
    LEISURE_NATURE(12),
    LEISURE_PARK(13),
    OFFICE(14),
    RELIGION(15),
    RESIDENTIAL(16),
    RESTO_MID(17),
    RESTO_SHORT(18),
    SHOP_LONG(19),
    SHOP_SHORT(20),
    SPORT(21),
    SPORT_ATTEND(22),
    TRAVEL_BUS(23),
    TRAVEL_CONFERENCE(24),
    TRAVEL_FILL(25),
    TRAVEL_HOTEL(26),
    TRAVEL_LONG(27),
    TRAVEL_SHORT(28);

    public final int value;

    public short toThriftConstant() {
        switch (setLocalImageUrl.serializer[ordinal()]) {
            case 1:
                return (short) 2;
            case 2:
                return (short) 3;
            case 3:
                return (short) 4;
            case 4:
                return (short) 5;
            case 5:
                return (short) 6;
            case 6:
                return (short) 7;
            case 7:
                return (short) 8;
            case 8:
                return (short) 9;
            case 9:
                return (short) 10;
            case 10:
                return (short) 11;
            case 11:
                return (short) 12;
            case 12:
                return (short) 13;
            case 13:
                return (short) 14;
            case 14:
                return (short) 15;
            case 15:
                return (short) 16;
            case 16:
                return (short) 17;
            case 17:
                return (short) 18;
            case 18:
                return (short) 19;
            case 19:
                return (short) 20;
            case 20:
                return (short) 21;
            case 21:
                return (short) 22;
            case 22:
                return (short) 23;
            case 23:
                return (short) 24;
            case 24:
                return (short) 25;
            case 25:
                return (short) 26;
            case 26:
                return (short) 27;
            case 27:
                return (short) 28;
            default:
                return (short) 1;
        }
    }

    VenueType(int i) {
        this.value = i;
    }

    public static VenueType findByValue(int i) {
        switch (i) {
            case 1:
                return UNKNOWN;
            case 2:
                return DRINK_DAY;
            case 3:
                return DRINK_EVENING;
            case 4:
                return EDUCATION_INDEPENDENT;
            case 5:
                return EDUCATION_PARENTS;
            case 6:
                return HEALTH;
            case 7:
                return INDUSTRIAL;
            case 8:
                return LEISURE_BEACH;
            case 9:
                return LEISURE_DAY;
            case 10:
                return LEISURE_EVENING;
            case 11:
                return LEISURE_MUSEUM;
            case 12:
                return LEISURE_NATURE;
            case 13:
                return LEISURE_PARK;
            case 14:
                return OFFICE;
            case 15:
                return RELIGION;
            case 16:
                return RESIDENTIAL;
            case 17:
                return RESTO_MID;
            case 18:
                return RESTO_SHORT;
            case 19:
                return SHOP_LONG;
            case 20:
                return SHOP_SHORT;
            case 21:
                return SPORT;
            case 22:
                return SPORT_ATTEND;
            case 23:
                return TRAVEL_BUS;
            case 24:
                return TRAVEL_CONFERENCE;
            case 25:
                return TRAVEL_FILL;
            case 26:
                return TRAVEL_HOTEL;
            case 27:
                return TRAVEL_LONG;
            case 28:
                return TRAVEL_SHORT;
            default:
                return UNKNOWN;
        }
    }

    public static VenueType fromThriftConstant(short s) {
        switch (s) {
            case 1:
                return UNKNOWN;
            case 2:
                return DRINK_DAY;
            case 3:
                return DRINK_EVENING;
            case 4:
                return EDUCATION_INDEPENDENT;
            case 5:
                return EDUCATION_PARENTS;
            case 6:
                return HEALTH;
            case 7:
                return INDUSTRIAL;
            case 8:
                return LEISURE_BEACH;
            case 9:
                return LEISURE_DAY;
            case 10:
                return LEISURE_EVENING;
            case 11:
                return LEISURE_MUSEUM;
            case 12:
                return LEISURE_NATURE;
            case 13:
                return LEISURE_PARK;
            case 14:
                return OFFICE;
            case 15:
                return RELIGION;
            case 16:
                return RESIDENTIAL;
            case 17:
                return RESTO_MID;
            case 18:
                return RESTO_SHORT;
            case 19:
                return SHOP_LONG;
            case 20:
                return SHOP_SHORT;
            case 21:
                return SPORT;
            case 22:
                return SPORT_ATTEND;
            case 23:
                return TRAVEL_BUS;
            case 24:
                return TRAVEL_CONFERENCE;
            case 25:
                return TRAVEL_FILL;
            case 26:
                return TRAVEL_HOTEL;
            case 27:
                return TRAVEL_LONG;
            case 28:
                return TRAVEL_SHORT;
            default:
                return UNKNOWN;
        }
    }
}
