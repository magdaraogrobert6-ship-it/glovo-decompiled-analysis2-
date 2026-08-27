package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class GooglePlayInstallReferrerDetails {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ GooglePlayInstallReferrerDetails[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public static final GooglePlayInstallReferrerDetails REQUEST_BREAK = new GooglePlayInstallReferrerDetails("REQUEST_BREAK", 0);
    public static final GooglePlayInstallReferrerDetails END_BREAK = new GooglePlayInstallReferrerDetails("END_BREAK", 1);
    public static final GooglePlayInstallReferrerDetails CANCEL_BREAK = new GooglePlayInstallReferrerDetails("CANCEL_BREAK", 2);
    public static final GooglePlayInstallReferrerDetails URL_ACTION = new GooglePlayInstallReferrerDetails("URL_ACTION", 3);
    public static final GooglePlayInstallReferrerDetails STOP_WORKING = new GooglePlayInstallReferrerDetails("STOP_WORKING", 4);
    public static final GooglePlayInstallReferrerDetails UNKNOWN_ACTION = new GooglePlayInstallReferrerDetails("UNKNOWN_ACTION", 5);

    private GooglePlayInstallReferrerDetails(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 53;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 79;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        GooglePlayInstallReferrerDetails[] googlePlayInstallReferrerDetailsArr$values = $values();
        $VALUES = googlePlayInstallReferrerDetailsArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) googlePlayInstallReferrerDetailsArr$values);
        int i = read + 45;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static GooglePlayInstallReferrerDetails valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 63;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        GooglePlayInstallReferrerDetails googlePlayInstallReferrerDetails = (GooglePlayInstallReferrerDetails) Enum.valueOf(GooglePlayInstallReferrerDetails.class, str);
        int i4 = serializer + 105;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return googlePlayInstallReferrerDetails;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static GooglePlayInstallReferrerDetails[] values() {
        GooglePlayInstallReferrerDetails[] googlePlayInstallReferrerDetailsArr;
        int i = 2 % 2;
        int i2 = serializer + 23;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            googlePlayInstallReferrerDetailsArr = (GooglePlayInstallReferrerDetails[]) $VALUES.clone();
            int i3 = 7 / 0;
        } else {
            googlePlayInstallReferrerDetailsArr = (GooglePlayInstallReferrerDetails[]) $VALUES.clone();
        }
        int i4 = serializer + 33;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return googlePlayInstallReferrerDetailsArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ GooglePlayInstallReferrerDetails[] $values() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 25;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        GooglePlayInstallReferrerDetails[] googlePlayInstallReferrerDetailsArr = {REQUEST_BREAK, END_BREAK, CANCEL_BREAK, URL_ACTION, STOP_WORKING, UNKNOWN_ACTION};
        int i5 = i2 + 25;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
        return googlePlayInstallReferrerDetailsArr;
    }
}
