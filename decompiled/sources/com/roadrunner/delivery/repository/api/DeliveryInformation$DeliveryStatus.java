package com.roadrunner.delivery.repository.api;

import androidx.annotation.Keep;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import coil3.util.UtilsKt;
import java.util.List;
import o.accessgetSpcp;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class DeliveryInformation$DeliveryStatus {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ DeliveryInformation$DeliveryStatus[] $VALUES;
    public static final DeliveryInformation$DeliveryStatus ACCEPTED;
    public static final DeliveryInformation$DeliveryStatus COURIER_NOTIFIED;
    public static final accessgetSpcp Companion;
    public static final DeliveryInformation$DeliveryStatus DISPATCHED;
    private static int IconCompatParcelizer = 0;
    public static final DeliveryInformation$DeliveryStatus LEFT_PICKUP;
    public static final DeliveryInformation$DeliveryStatus NEAR_DROPOFF;
    public static final DeliveryInformation$DeliveryStatus NEAR_PICKUP;
    public static final DeliveryInformation$DeliveryStatus PICKED_UP;
    private static int RemoteActionCompatParcelizer = 1;
    private static final List<DeliveryInformation$DeliveryStatus> nonAcceptedDeliveryStatus;
    private static int read = 1;
    private static int serializer;
    private final String value;

    public static final /* synthetic */ List access$getNonAcceptedDeliveryStatus$cp() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 125;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        List<DeliveryInformation$DeliveryStatus> list = nonAcceptedDeliveryStatus;
        int i5 = i2 + 1;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return list;
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 117;
        int i3 = i2 % Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i3 + 45;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        throw null;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 13;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private DeliveryInformation$DeliveryStatus(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    static {
        DeliveryInformation$DeliveryStatus deliveryInformation$DeliveryStatus = new DeliveryInformation$DeliveryStatus("DISPATCHED", 0, "dispatched");
        DISPATCHED = deliveryInformation$DeliveryStatus;
        DeliveryInformation$DeliveryStatus deliveryInformation$DeliveryStatus2 = new DeliveryInformation$DeliveryStatus("COURIER_NOTIFIED", 1, "courier_notified");
        COURIER_NOTIFIED = deliveryInformation$DeliveryStatus2;
        ACCEPTED = new DeliveryInformation$DeliveryStatus("ACCEPTED", 2, "accepted");
        NEAR_PICKUP = new DeliveryInformation$DeliveryStatus("NEAR_PICKUP", 3, "near_pickup");
        PICKED_UP = new DeliveryInformation$DeliveryStatus("PICKED_UP", 4, "picked_up");
        LEFT_PICKUP = new DeliveryInformation$DeliveryStatus("LEFT_PICKUP", 5, "left_pickup");
        NEAR_DROPOFF = new DeliveryInformation$DeliveryStatus("NEAR_DROPOFF", 6, "near_dropoff");
        DeliveryInformation$DeliveryStatus[] deliveryInformation$DeliveryStatusArr$values = $values();
        $VALUES = deliveryInformation$DeliveryStatusArr$values;
        $ENTRIES = UtilsKt.read((Enum[]) deliveryInformation$DeliveryStatusArr$values);
        Companion = new accessgetSpcp();
        nonAcceptedDeliveryStatus = SQLite.read(deliveryInformation$DeliveryStatus, deliveryInformation$DeliveryStatus2, null);
        int i = serializer + 39;
        read = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static DeliveryInformation$DeliveryStatus valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 101;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        DeliveryInformation$DeliveryStatus deliveryInformation$DeliveryStatus = (DeliveryInformation$DeliveryStatus) Enum.valueOf(DeliveryInformation$DeliveryStatus.class, str);
        int i4 = RemoteActionCompatParcelizer + 81;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
        return deliveryInformation$DeliveryStatus;
    }

    public static DeliveryInformation$DeliveryStatus[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 73;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        DeliveryInformation$DeliveryStatus[] deliveryInformation$DeliveryStatusArr = (DeliveryInformation$DeliveryStatus[]) $VALUES.clone();
        int i3 = IconCompatParcelizer + 7;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 29 / 0;
        }
        return deliveryInformation$DeliveryStatusArr;
    }

    private static final /* synthetic */ DeliveryInformation$DeliveryStatus[] $values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 9;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        DeliveryInformation$DeliveryStatus[] deliveryInformation$DeliveryStatusArr = {DISPATCHED, COURIER_NOTIFIED, ACCEPTED, NEAR_PICKUP, PICKED_UP, LEFT_PICKUP, NEAR_DROPOFF};
        int i5 = i2 + 5;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return deliveryInformation$DeliveryStatusArr;
    }
}
