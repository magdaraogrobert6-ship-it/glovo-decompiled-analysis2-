package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class setCurrentItemInternal {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ setCurrentItemInternal[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public static final setCurrentItemInternal ShowPushNotification = new setCurrentItemInternal("ShowPushNotification", 0);
    public static final setCurrentItemInternal IgnorePushNotification = new setCurrentItemInternal("IgnorePushNotification", 1);
    public static final setCurrentItemInternal DuplicatePushForNewDelivery = new setCurrentItemInternal("DuplicatePushForNewDelivery", 2);

    private setCurrentItemInternal(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 39;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 77;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        setCurrentItemInternal[] setcurrentiteminternalArr$values = $values();
        $VALUES = setcurrentiteminternalArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) setcurrentiteminternalArr$values);
        int i = IconCompatParcelizer + 67;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static setCurrentItemInternal valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 99;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setCurrentItemInternal setcurrentiteminternal = (setCurrentItemInternal) Enum.valueOf(setCurrentItemInternal.class, str);
        int i4 = serializer + 5;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setcurrentiteminternal;
    }

    public static setCurrentItemInternal[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 47;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        setCurrentItemInternal[] setcurrentiteminternalArr = (setCurrentItemInternal[]) $VALUES.clone();
        int i3 = serializer + 21;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return setcurrentiteminternalArr;
        }
        throw null;
    }

    private static final /* synthetic */ setCurrentItemInternal[] $values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 81;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        setCurrentItemInternal[] setcurrentiteminternalArr = {ShowPushNotification, IgnorePushNotification, DuplicatePushForNewDelivery};
        int i5 = i2 + 47;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 64 / 0;
        }
        return setcurrentiteminternalArr;
    }
}
