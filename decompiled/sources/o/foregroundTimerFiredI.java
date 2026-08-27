package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class foregroundTimerFiredI {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ foregroundTimerFiredI[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private final String value;
    public static final foregroundTimerFiredI DELIVERY_DISPATCHED = new foregroundTimerFiredI("DELIVERY_DISPATCHED", 0, "delivery_dispatched");
    public static final foregroundTimerFiredI BACK_TO_BACK_DELIVERY_DISPATCHED = new foregroundTimerFiredI("BACK_TO_BACK_DELIVERY_DISPATCHED", 1, "back_to_back_delivery_dispatched");
    public static final foregroundTimerFiredI DELIVERY_PAYMENT_DONE = new foregroundTimerFiredI("DELIVERY_PAYMENT_DONE", 2, "delivery_payment_done");
    public static final foregroundTimerFiredI FOOD_IS_READY = new foregroundTimerFiredI("FOOD_IS_READY", 3, "food_is_ready");
    public static final foregroundTimerFiredI ROUTE_CHANGED = new foregroundTimerFiredI("ROUTE_CHANGED", 4, "route_changed");
    public static final foregroundTimerFiredI ROUTE_ORDER_CHANGED = new foregroundTimerFiredI("ROUTE_ORDER_CHANGED", 5, "route_order_changed");
    public static final foregroundTimerFiredI DELIVERY_CANCELLED = new foregroundTimerFiredI("DELIVERY_CANCELLED", 6, "delivery_cancelled");
    public static final foregroundTimerFiredI DELIVERY_UNDISPATCHED = new foregroundTimerFiredI("DELIVERY_UNDISPATCHED", 7, "delivery_undispatched");
    public static final foregroundTimerFiredI NON_RETURNABLE_DELIVERY_CANCELLED = new foregroundTimerFiredI("NON_RETURNABLE_DELIVERY_CANCELLED", 8, "non_returnable_delivery_cancelled");
    public static final foregroundTimerFiredI RETURNABLE_DELIVERY_CANCELLED = new foregroundTimerFiredI("RETURNABLE_DELIVERY_CANCELLED", 9, "returnable_delivery_cancelled");
    public static final foregroundTimerFiredI COURIER_STATUS_CHANGED = new foregroundTimerFiredI("COURIER_STATUS_CHANGED", 10, "courier_status_changed");
    public static final foregroundTimerFiredI DELIVERY_STATUS_CHANGED = new foregroundTimerFiredI("DELIVERY_STATUS_CHANGED", 11, "delivery_status_changed");
    public static final foregroundTimerFiredI COURIER_GPS_OFF_FOR_X_MINUTES = new foregroundTimerFiredI("COURIER_GPS_OFF_FOR_X_MINUTES", 12, "courier_gps_off_for_x_minutes");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 31;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 117;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        throw null;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = read + 115;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.value;
        }
        int i3 = 65 / 0;
        return this.value;
    }

    private foregroundTimerFiredI(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    static {
        foregroundTimerFiredI[] foregroundtimerfirediArr$values = $values();
        $VALUES = foregroundtimerfirediArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) foregroundtimerfirediArr$values);
        int i = RemoteActionCompatParcelizer + 119;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static foregroundTimerFiredI valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 119;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (foregroundTimerFiredI) Enum.valueOf(foregroundTimerFiredI.class, str);
        }
        throw null;
    }

    public static foregroundTimerFiredI[] values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 37;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        foregroundTimerFiredI[] foregroundtimerfirediArr = (foregroundTimerFiredI[]) $VALUES.clone();
        int i4 = IconCompatParcelizer + 17;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
        return foregroundtimerfirediArr;
    }

    private static final /* synthetic */ foregroundTimerFiredI[] $values() {
        int i = 2 % 2;
        int i2 = read + 89;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        foregroundTimerFiredI[] foregroundtimerfirediArr = {DELIVERY_DISPATCHED, BACK_TO_BACK_DELIVERY_DISPATCHED, DELIVERY_PAYMENT_DONE, FOOD_IS_READY, ROUTE_CHANGED, ROUTE_ORDER_CHANGED, DELIVERY_CANCELLED, DELIVERY_UNDISPATCHED, NON_RETURNABLE_DELIVERY_CANCELLED, RETURNABLE_DELIVERY_CANCELLED, COURIER_STATUS_CHANGED, DELIVERY_STATUS_CHANGED, COURIER_GPS_OFF_FOR_X_MINUTES};
        int i5 = i3 + 51;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return foregroundtimerfirediArr;
    }
}
