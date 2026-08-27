package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ExtensionWindowAreaPresentationRequirements {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ ExtensionWindowAreaPresentationRequirements[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 1;
    private static int write;
    private final int textRes;
    private final int titleRes;
    public static final ExtensionWindowAreaPresentationRequirements WORKING = new ExtensionWindowAreaPresentationRequirements("WORKING", 0, com.logistics.rider.glovo.R.string.all_working, com.logistics.rider.glovo.R.string.notification_working_message);
    public static final ExtensionWindowAreaPresentationRequirements BREAK = new ExtensionWindowAreaPresentationRequirements("BREAK", 1, com.logistics.rider.glovo.R.string.notification_break_title, com.logistics.rider.glovo.R.string.notification_break_text);

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 39;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 81;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final int getTextRes() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 71;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = this.textRes;
        int i5 = i2 + 49;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public final int getTitleRes() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 81;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.titleRes;
        int i6 = i2 + 117;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return i5;
    }

    private ExtensionWindowAreaPresentationRequirements(String str, int i, int i2, int i3) {
        super(str, i);
        this.titleRes = i2;
        this.textRes = i3;
    }

    private static final /* synthetic */ ExtensionWindowAreaPresentationRequirements[] $values() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 43;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        ExtensionWindowAreaPresentationRequirements[] extensionWindowAreaPresentationRequirementsArr = {WORKING, BREAK};
        int i5 = i2 + 55;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return extensionWindowAreaPresentationRequirementsArr;
    }

    public static ExtensionWindowAreaPresentationRequirements valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 123;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (ExtensionWindowAreaPresentationRequirements) Enum.valueOf(ExtensionWindowAreaPresentationRequirements.class, str);
        }
        throw null;
    }

    public static ExtensionWindowAreaPresentationRequirements[] values() {
        int i = 2 % 2;
        int i2 = serializer + 71;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        ExtensionWindowAreaPresentationRequirements[] extensionWindowAreaPresentationRequirementsArr = (ExtensionWindowAreaPresentationRequirements[]) $VALUES.clone();
        int i3 = serializer + 5;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return extensionWindowAreaPresentationRequirementsArr;
        }
        obj.hashCode();
        throw null;
    }

    static {
        ExtensionWindowAreaPresentationRequirements[] extensionWindowAreaPresentationRequirementsArr$values = $values();
        $VALUES = extensionWindowAreaPresentationRequirementsArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) extensionWindowAreaPresentationRequirementsArr$values);
        int i = RemoteActionCompatParcelizer + 105;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
