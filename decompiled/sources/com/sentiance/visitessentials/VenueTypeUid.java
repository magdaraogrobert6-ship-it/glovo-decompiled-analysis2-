package com.sentiance.visitessentials;

import androidx.compose.ui.graphics.Fields;
import com.adjust.sdk.network.ErrorCodes;
import o.r8lambdaBfFWZbfIS2Px1jvNMXSmy15zeUo;

/* JADX INFO: loaded from: classes4.dex */
public enum VenueTypeUid {
    unknown(9999),
    drink_day(1000),
    drink_evening(1001),
    education_independent(1002),
    education_parents(ErrorCodes.MALFORMED_URL_EXCEPTION),
    health(1004),
    industrial(1005),
    leisure_beach(ErrorCodes.SSL_HANDSHAKE_EXCEPTION),
    leisure_day(ErrorCodes.IO_EXCEPTION),
    leisure_evening(1008),
    leisure_museum(1009),
    leisure_nature(1010),
    leisure_park(1011),
    office(1012),
    religion(1013),
    residential(1014),
    resto_mid(1015),
    resto_short(1016),
    shop_long(1017),
    shop_short(1018),
    sport(1019),
    sport_attend(1020),
    travel_bus(1021),
    travel_conference(1022),
    travel_fill(1023),
    travel_hotel(Fields.RotationZ),
    travel_long(1025),
    travel_short(1026);

    public static final r8lambdaBfFWZbfIS2Px1jvNMXSmy15zeUo Companion = new Object() { // from class: o.r8lambdaBfFWZbfIS2Px1jvNMXSmy15zeUo
    };
    private final int uniqueId;

    public final int getUniqueId() {
        return this.uniqueId;
    }

    VenueTypeUid(int i) {
        this.uniqueId = i;
    }
}
