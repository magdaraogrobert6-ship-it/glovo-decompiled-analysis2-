package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class deleteEventMetadata {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ deleteEventMetadata[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    private static int write;
    public static final deleteEventMetadata Remote = new deleteEventMetadata("Remote", 0);
    public static final deleteEventMetadata Local = new deleteEventMetadata("Local", 1);
    public static final deleteEventMetadata Firestore = new deleteEventMetadata("Firestore", 2);

    private deleteEventMetadata(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 87;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 53;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        deleteEventMetadata[] deleteeventmetadataArr$values = $values();
        $VALUES = deleteeventmetadataArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) deleteeventmetadataArr$values);
        int i = write + 15;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static deleteEventMetadata valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 63;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        deleteEventMetadata deleteeventmetadata = (deleteEventMetadata) Enum.valueOf(deleteEventMetadata.class, str);
        int i3 = serializer + 59;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return deleteeventmetadata;
        }
        throw null;
    }

    public static deleteEventMetadata[] values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 33;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        deleteEventMetadata[] deleteeventmetadataArr = (deleteEventMetadata[]) $VALUES.clone();
        int i4 = serializer + 3;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return deleteeventmetadataArr;
        }
        throw null;
    }

    private static final /* synthetic */ deleteEventMetadata[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 51;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        deleteEventMetadata[] deleteeventmetadataArr = {Remote, Local, Firestore};
        int i5 = i2 + 45;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 53 / 0;
        }
        return deleteeventmetadataArr;
    }
}
