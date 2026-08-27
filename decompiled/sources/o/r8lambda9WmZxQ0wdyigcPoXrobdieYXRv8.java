package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda9WmZxQ0wdyigcPoXrobdieYXRv8 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ r8lambda9WmZxQ0wdyigcPoXrobdieYXRv8[] $VALUES;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public static final r8lambda9WmZxQ0wdyigcPoXrobdieYXRv8 CLIENT_SIDE = new r8lambda9WmZxQ0wdyigcPoXrobdieYXRv8("CLIENT_SIDE", 0);
    public static final r8lambda9WmZxQ0wdyigcPoXrobdieYXRv8 SERVER_SIDE = new r8lambda9WmZxQ0wdyigcPoXrobdieYXRv8("SERVER_SIDE", 1);
    public static final r8lambda9WmZxQ0wdyigcPoXrobdieYXRv8 COMMUNICATION_TIMEOUT = new r8lambda9WmZxQ0wdyigcPoXrobdieYXRv8("COMMUNICATION_TIMEOUT", 2);

    private r8lambda9WmZxQ0wdyigcPoXrobdieYXRv8(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write + 119;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 77;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        throw null;
    }

    static {
        r8lambda9WmZxQ0wdyigcPoXrobdieYXRv8[] r8lambda9wmzxq0wdyigcpoxrobdieyxrv8Arr$values = $values();
        $VALUES = r8lambda9wmzxq0wdyigcpoxrobdieyxrv8Arr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) r8lambda9wmzxq0wdyigcpoxrobdieyxrv8Arr$values);
        int i = serializer + 87;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static r8lambda9WmZxQ0wdyigcPoXrobdieYXRv8 valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 65;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (r8lambda9WmZxQ0wdyigcPoXrobdieYXRv8) Enum.valueOf(r8lambda9WmZxQ0wdyigcPoXrobdieYXRv8.class, str);
        }
        int i3 = 47 / 0;
        return (r8lambda9WmZxQ0wdyigcPoXrobdieYXRv8) Enum.valueOf(r8lambda9WmZxQ0wdyigcPoXrobdieYXRv8.class, str);
    }

    public static r8lambda9WmZxQ0wdyigcPoXrobdieYXRv8[] values() {
        r8lambda9WmZxQ0wdyigcPoXrobdieYXRv8[] r8lambda9wmzxq0wdyigcpoxrobdieyxrv8Arr;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 73;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            r8lambda9wmzxq0wdyigcpoxrobdieyxrv8Arr = (r8lambda9WmZxQ0wdyigcPoXrobdieYXRv8[]) $VALUES.clone();
            int i3 = 24 / 0;
        } else {
            r8lambda9wmzxq0wdyigcpoxrobdieyxrv8Arr = (r8lambda9WmZxQ0wdyigcPoXrobdieYXRv8[]) $VALUES.clone();
        }
        int i4 = write + 71;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return r8lambda9wmzxq0wdyigcpoxrobdieyxrv8Arr;
        }
        throw null;
    }

    private static final /* synthetic */ r8lambda9WmZxQ0wdyigcPoXrobdieYXRv8[] $values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 25;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        r8lambda9WmZxQ0wdyigcPoXrobdieYXRv8[] r8lambda9wmzxq0wdyigcpoxrobdieyxrv8Arr = {CLIENT_SIDE, SERVER_SIDE, COMMUNICATION_TIMEOUT};
        int i5 = i3 + 31;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda9wmzxq0wdyigcpoxrobdieyxrv8Arr;
    }
}
