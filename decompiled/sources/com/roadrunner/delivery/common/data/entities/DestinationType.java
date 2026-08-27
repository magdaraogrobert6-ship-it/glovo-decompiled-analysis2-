package com.roadrunner.delivery.common.data.entities;

import androidx.annotation.Keep;
import androidx.compose.ui.graphics.Fields;
import coil3.util.UtilsKt;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@Keep
public final class DestinationType {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ DestinationType[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 1;
    private static int write;
    public static final DestinationType PICKUP = new DestinationType("PICKUP", 0);
    public static final DestinationType DROP_OFF = new DestinationType("DROP_OFF", 1);
    public static final DestinationType RETURN = new DestinationType("RETURN", 2);
    public static final DestinationType ON_THE_WAY_TO_DROPOFF = new DestinationType("ON_THE_WAY_TO_DROPOFF", 3);
    public static final DestinationType ON_THE_WAY_TO_PICKUP = new DestinationType("ON_THE_WAY_TO_PICKUP", 4);
    public static final DestinationType ON_THE_WAY_TO_RETURN = new DestinationType("ON_THE_WAY_TO_RETURN", 5);

    private DestinationType(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 31;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        int i3 = 50 / 0;
        return $ENTRIES;
    }

    static {
        DestinationType[] destinationTypeArr$values = $values();
        $VALUES = destinationTypeArr$values;
        $ENTRIES = UtilsKt.read((Enum[]) destinationTypeArr$values);
        int i = IconCompatParcelizer + 123;
        serializer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static DestinationType valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 89;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (DestinationType) Enum.valueOf(DestinationType.class, str);
        }
        throw null;
    }

    public static DestinationType[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 67;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        DestinationType[] destinationTypeArr = (DestinationType[]) $VALUES.clone();
        int i4 = write + 5;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return destinationTypeArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ DestinationType[] $values() {
        int i = 2 % 2;
        int i2 = write + 113;
        int i3 = i2 % Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        DestinationType[] destinationTypeArr = {PICKUP, DROP_OFF, RETURN, ON_THE_WAY_TO_DROPOFF, ON_THE_WAY_TO_PICKUP, ON_THE_WAY_TO_RETURN};
        int i5 = i3 + 35;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 86 / 0;
        }
        return destinationTypeArr;
    }
}
