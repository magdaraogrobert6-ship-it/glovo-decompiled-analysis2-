package com.sentiance.visitessentials;

import com.huawei.hms.android.SystemUtils;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.BrazeFunctionNotImplemented;
import o.instance_delegatelambda0;
import o.r8lambdahGXI0amv9Sg71oOyVOj_ccS1mI;

/* JADX INFO: loaded from: classes4.dex */
public enum VenueType {
    unknown(VenueTypeUid.unknown, SystemUtils.UNKNOWN, null, 4, null),
    drink_day(VenueTypeUid.drink_day, "drink_day", null, 4, null),
    drink_evening(VenueTypeUid.drink_evening, "drink_evening", null, 4, null),
    education_independent(VenueTypeUid.education_independent, "education_independent", null, 4, null),
    education_parents(VenueTypeUid.education_parents, "education_parents", null, 4, null),
    health(VenueTypeUid.health, "health", null, 4, null),
    industrial(VenueTypeUid.industrial, "industrial", null, 4, null),
    leisure_beach(VenueTypeUid.leisure_beach, "leisure_beach", null, 4, null),
    leisure_day(VenueTypeUid.leisure_day, "leisure_day", null, 4, null),
    leisure_evening(VenueTypeUid.leisure_evening, "leisure_evening", null, 4, null),
    leisure_museum(VenueTypeUid.leisure_museum, "leisure_museum", null, 4, null),
    leisure_nature(VenueTypeUid.leisure_nature, "leisure_nature", null, 4, null),
    leisure_park(VenueTypeUid.leisure_park, "leisure_park", null, 4, null),
    office(VenueTypeUid.office, "office", null, 4, null),
    religion(VenueTypeUid.religion, "religion", null, 4, null),
    residential(VenueTypeUid.residential, "residential", null, 4, null),
    resto_mid(VenueTypeUid.resto_mid, "resto_mid", null, 4, null),
    resto_short(VenueTypeUid.resto_short, "resto_short", null, 4, null),
    shop_long(VenueTypeUid.shop_long, "shop_long", null, 4, null),
    shop_short(VenueTypeUid.shop_short, "shop_short", null, 4, null),
    sport(VenueTypeUid.sport, "sport", null, 4, null),
    sport_attend(VenueTypeUid.sport_attend, "sport_attend", null, 4, null),
    travel_bus(VenueTypeUid.travel_bus, "travel_bus", null, 4, null),
    travel_conference(VenueTypeUid.travel_conference, "travel_conference", null, 4, null),
    travel_fill(VenueTypeUid.travel_fill, "travel_fill", null, 4, null),
    travel_hotel(VenueTypeUid.travel_hotel, "travel_hotel", null, 4, null),
    travel_long(VenueTypeUid.travel_long, "travel_long", null, 4, null),
    travel_short(VenueTypeUid.travel_short, "travel_short", null, 4, null);

    public static final BrazeFunctionNotImplemented Companion = new BrazeFunctionNotImplemented();
    private final List<String> categoricalHierarchy;
    private final VenueTypeUid uid;
    private final String value;

    public final List<String> getCategoricalHierarchy() {
        return this.categoricalHierarchy;
    }

    public final VenueTypeUid getUid() {
        return this.uid;
    }

    public final String getValue() {
        return this.value;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    VenueType(VenueTypeUid venueTypeUid, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            Map map = r8lambdahGXI0amv9Sg71oOyVOj_ccS1mI.write;
            str.getClass();
            list = (List) r8lambdahGXI0amv9Sg71oOyVOj_ccS1mI.write.get(str);
            if (list == null) {
                list = instance_delegatelambda0.write;
            }
        }
        this(venueTypeUid, str, list);
    }

    VenueType(VenueTypeUid venueTypeUid, String str, List list) {
        this.uid = venueTypeUid;
        this.value = str;
        this.categoricalHierarchy = list;
    }
}
