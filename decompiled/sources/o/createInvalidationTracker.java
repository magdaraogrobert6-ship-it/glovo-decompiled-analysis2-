package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class createInvalidationTracker {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ createInvalidationTracker[] $VALUES;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    private final int value;
    public static final createInvalidationTracker COMPANY = new createInvalidationTracker("COMPANY", 0, com.logistics.rider.glovo.R.string.all_company);
    public static final createInvalidationTracker BUILDING = new createInvalidationTracker("BUILDING", 1, com.logistics.rider.glovo.R.string.COURIER_AND_DELIVERIES_VIEWHOLDER_ADDRESS_BUILDING);
    public static final createInvalidationTracker INTERCOM = new createInvalidationTracker("INTERCOM", 2, com.logistics.rider.glovo.R.string.COURIER_AND_DELIVERIES_VIEWHOLDER_ADDRESS_INTERCOM);
    public static final createInvalidationTracker APARTMENT_NUMBER = new createInvalidationTracker("APARTMENT_NUMBER", 3, com.logistics.rider.glovo.R.string.COURIER_AND_DELIVERIES_VIEWHOLDER_ADDRESS_APARTMENT);
    public static final createInvalidationTracker ENTRANCE = new createInvalidationTracker("ENTRANCE", 4, com.logistics.rider.glovo.R.string.COURIER_AND_DELIVERIES_VIEWHOLDER_ADDRESS_ENTRANCE);
    public static final createInvalidationTracker FLOOR = new createInvalidationTracker("FLOOR", 5, com.logistics.rider.glovo.R.string.COURIER_AND_DELIVERIES_VIEWHOLDER_ADDRESS_FLOOR);
    public static final createInvalidationTracker DISTRICT = new createInvalidationTracker("DISTRICT", 6, com.logistics.rider.glovo.R.string.COURIER_AND_DELIVERIES_VIEWHOLDER_ADDRESS_DISTRICT);
    public static final createInvalidationTracker BLOCK = new createInvalidationTracker("BLOCK", 7, com.logistics.rider.glovo.R.string.COURIER_AND_DELIVERIES_VIEWHOLDER_ADDRESS_BLOCK);

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read + 7;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        throw null;
    }

    public final int getValue() {
        int i = 2 % 2;
        int i2 = read + 93;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private createInvalidationTracker(String str, int i, int i2) {
        super(str, i);
        this.value = i2;
    }

    static {
        createInvalidationTracker[] createinvalidationtrackerArr$values = $values();
        $VALUES = createinvalidationtrackerArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) createinvalidationtrackerArr$values);
        int i = serializer + 41;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static createInvalidationTracker valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 5;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        createInvalidationTracker createinvalidationtracker = (createInvalidationTracker) Enum.valueOf(createInvalidationTracker.class, str);
        int i4 = read + 53;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return createinvalidationtracker;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static createInvalidationTracker[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 97;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        createInvalidationTracker[] createinvalidationtrackerArr = (createInvalidationTracker[]) $VALUES.clone();
        int i4 = RemoteActionCompatParcelizer + 105;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return createinvalidationtrackerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ createInvalidationTracker[] $values() {
        int i = 2 % 2;
        int i2 = read + 25;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        createInvalidationTracker[] createinvalidationtrackerArr = {COMPANY, BUILDING, INTERCOM, APARTMENT_NUMBER, ENTRANCE, FLOOR, DISTRICT, BLOCK};
        int i5 = i3 + 49;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return createinvalidationtrackerArr;
        }
        throw null;
    }
}
