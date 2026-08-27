package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class CanvasCompatS {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ CanvasCompatS[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public static final CanvasCompatS Vendor = new CanvasCompatS("Vendor", 0);
    public static final CanvasCompatS Customer = new CanvasCompatS("Customer", 1);
    public static final CanvasCompatS NewVendor = new CanvasCompatS("NewVendor", 2);
    public static final CanvasCompatS NewCustomer = new CanvasCompatS("NewCustomer", 3);
    public static final CanvasCompatS PickedUp = new CanvasCompatS("PickedUp", 4);

    private CanvasCompatS(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer + 15;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 81;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        CanvasCompatS[] canvasCompatSArr$values = $values();
        $VALUES = canvasCompatSArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) canvasCompatSArr$values);
        int i = read + 107;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static CanvasCompatS valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 85;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        CanvasCompatS canvasCompatS = (CanvasCompatS) Enum.valueOf(CanvasCompatS.class, str);
        int i4 = IconCompatParcelizer + 99;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return canvasCompatS;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static CanvasCompatS[] values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 125;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        CanvasCompatS[] canvasCompatSArr = (CanvasCompatS[]) $VALUES.clone();
        int i4 = IconCompatParcelizer + 123;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
        return canvasCompatSArr;
    }

    private static final /* synthetic */ CanvasCompatS[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 39;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        CanvasCompatS[] canvasCompatSArr = {Vendor, Customer, NewVendor, NewCustomer, PickedUp};
        int i5 = i3 + 103;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return canvasCompatSArr;
    }
}
