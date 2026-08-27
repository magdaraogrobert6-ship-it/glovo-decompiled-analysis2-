package o;

import com.huawei.hms.android.SystemUtils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class setPaddingTop {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ setPaddingTop[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int write;
    public static final setPaddingTop HUAWEI = new setPaddingTop(SystemUtils.PRODUCT_HUAWEI, 0);
    public static final setPaddingTop GOOGLE = new setPaddingTop("GOOGLE", 1);
    public static final setPaddingTop NONE = new setPaddingTop("NONE", 2);

    private setPaddingTop(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 83;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 79;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        setPaddingTop[] setpaddingtopArr$values = $values();
        $VALUES = setpaddingtopArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) setpaddingtopArr$values);
        int i = write + 47;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static setPaddingTop valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 115;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (setPaddingTop) Enum.valueOf(setPaddingTop.class, str);
        }
        throw null;
    }

    public static setPaddingTop[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 113;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setPaddingTop[] setpaddingtopArr = (setPaddingTop[]) $VALUES.clone();
        int i3 = RemoteActionCompatParcelizer + 87;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 6 / 0;
        }
        return setpaddingtopArr;
    }

    private static final /* synthetic */ setPaddingTop[] $values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 17;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return new setPaddingTop[]{HUAWEI, GOOGLE, NONE};
        }
        setPaddingTop setpaddingtop = HUAWEI;
        setPaddingTop[] setpaddingtopArr = {GOOGLE, setpaddingtop};
        setpaddingtopArr[5] = NONE;
        return setpaddingtopArr;
    }
}
