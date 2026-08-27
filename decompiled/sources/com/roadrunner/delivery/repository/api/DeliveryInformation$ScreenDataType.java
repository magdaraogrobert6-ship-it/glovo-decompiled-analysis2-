package com.roadrunner.delivery.repository.api;

import androidx.annotation.Keep;
import androidx.compose.ui.graphics.Fields;
import coil3.util.UtilsKt;
import com.mapbox.common.HttpHeaders;
import o.accessgetEmcp;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class DeliveryInformation$ScreenDataType {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ DeliveryInformation$ScreenDataType[] $VALUES;
    public static final accessgetEmcp Companion;
    private static int IconCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    private final String value;
    public static final DeliveryInformation$ScreenDataType NO_DELIVERIES = new DeliveryInformation$ScreenDataType("NO_DELIVERIES", 0, "no_deliveries");
    public static final DeliveryInformation$ScreenDataType LIST = new DeliveryInformation$ScreenDataType("LIST", 1, "list");
    public static final DeliveryInformation$ScreenDataType ACCEPT = new DeliveryInformation$ScreenDataType("ACCEPT", 2, HttpHeaders.ACCEPT);
    public static final DeliveryInformation$ScreenDataType AUTO_ACCEPT = new DeliveryInformation$ScreenDataType("AUTO_ACCEPT", 3, "auto_accept");
    public static final DeliveryInformation$ScreenDataType DELIVERY_DETAILS = new DeliveryInformation$ScreenDataType("DELIVERY_DETAILS", 4, "deliveries_detail");
    public static final DeliveryInformation$ScreenDataType ON_THE_WAY = new DeliveryInformation$ScreenDataType("ON_THE_WAY", 5, "on_the_way");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 55;
        int i3 = i2 % Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i3 + 119;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        throw null;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = write + 79;
        int i3 = i2 % Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.value;
        int i5 = i3 + 113;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    private DeliveryInformation$ScreenDataType(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    static {
        DeliveryInformation$ScreenDataType[] deliveryInformation$ScreenDataTypeArr$values = $values();
        $VALUES = deliveryInformation$ScreenDataTypeArr$values;
        $ENTRIES = UtilsKt.read((Enum[]) deliveryInformation$ScreenDataTypeArr$values);
        Companion = new accessgetEmcp();
        int i = read + 85;
        serializer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static DeliveryInformation$ScreenDataType valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 113;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        DeliveryInformation$ScreenDataType deliveryInformation$ScreenDataType = (DeliveryInformation$ScreenDataType) Enum.valueOf(DeliveryInformation$ScreenDataType.class, str);
        int i3 = write + 29;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return deliveryInformation$ScreenDataType;
    }

    public static DeliveryInformation$ScreenDataType[] values() {
        int i = 2 % 2;
        int i2 = write + 101;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        DeliveryInformation$ScreenDataType[] deliveryInformation$ScreenDataTypeArr = (DeliveryInformation$ScreenDataType[]) $VALUES.clone();
        int i3 = write + 15;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return deliveryInformation$ScreenDataTypeArr;
    }

    private static final /* synthetic */ DeliveryInformation$ScreenDataType[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 121;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        DeliveryInformation$ScreenDataType[] deliveryInformation$ScreenDataTypeArr = {NO_DELIVERIES, LIST, ACCEPT, AUTO_ACCEPT, DELIVERY_DETAILS, ON_THE_WAY};
        int i5 = i2 + 55;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return deliveryInformation$ScreenDataTypeArr;
    }
}
