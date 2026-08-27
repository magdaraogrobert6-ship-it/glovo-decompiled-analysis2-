package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class getKeyTemplate {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ getKeyTemplate[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public static final getKeyTemplate Instruction = new getKeyTemplate("Instruction", 0);
    public static final getKeyTemplate Recording = new getKeyTemplate("Recording", 1);
    public static final getKeyTemplate Failure = new getKeyTemplate("Failure", 2);
    public static final getKeyTemplate Review = new getKeyTemplate("Review", 3);

    private getKeyTemplate(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 7;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 105;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        getKeyTemplate[] getkeytemplateArr$values = $values();
        $VALUES = getkeytemplateArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) getkeytemplateArr$values);
        int i = serializer + 41;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static getKeyTemplate valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 13;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (getKeyTemplate) Enum.valueOf(getKeyTemplate.class, str);
        }
        throw null;
    }

    public static getKeyTemplate[] values() {
        int i = 2 % 2;
        int i2 = write + 7;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getKeyTemplate[] getkeytemplateArr = (getKeyTemplate[]) $VALUES.clone();
        int i4 = IconCompatParcelizer + 11;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return getkeytemplateArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ getKeyTemplate[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 85;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        getKeyTemplate[] getkeytemplateArr = {Instruction, Recording, Failure, Review};
        int i5 = i2 + 51;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return getkeytemplateArr;
    }
}
