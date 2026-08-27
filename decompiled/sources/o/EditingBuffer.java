package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class EditingBuffer implements writeGlobalCallbackParametersI {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ EditingBuffer[] $VALUES;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    private final String variantName;
    public static final EditingBuffer CONTROL = new EditingBuffer("CONTROL", 0, "Control");
    public static final EditingBuffer TREATMENT = new EditingBuffer("TREATMENT", 1, "Variation1");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 77;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 43;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    @Override // o.writeGlobalCallbackParametersI
    public String getVariantName() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 63;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        String str = this.variantName;
        int i5 = i3 + 15;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    private EditingBuffer(String str, int i, String str2) {
        super(str, i);
        this.variantName = str2;
    }

    static {
        EditingBuffer[] editingBufferArr$values = $values();
        $VALUES = editingBufferArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) editingBufferArr$values);
        int i = read + 51;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ EditingBuffer[] $values() {
        int i = 2 % 2;
        int i2 = write + 107;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        EditingBuffer[] editingBufferArr = {CONTROL, TREATMENT};
        int i5 = i3 + 25;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return editingBufferArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EditingBuffer valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 15;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        EditingBuffer editingBuffer = (EditingBuffer) Enum.valueOf(EditingBuffer.class, str);
        int i3 = write + 57;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return editingBuffer;
    }

    public static EditingBuffer[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 63;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        EditingBuffer[] editingBufferArr = (EditingBuffer[]) $VALUES.clone();
        int i4 = write + 99;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return editingBufferArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
