package o;

import com.huawei.hms.android.SystemUtils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class bindLong {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ bindLong[] $VALUES;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public static final bindLong HUAWEI = new bindLong(SystemUtils.PRODUCT_HUAWEI, 0);
    public static final bindLong GOOGLE = new bindLong("GOOGLE", 1);

    private bindLong(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write + 47;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        throw null;
    }

    static {
        bindLong[] bindlongArr$values = $values();
        $VALUES = bindlongArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) bindlongArr$values);
        int i = serializer + 69;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ bindLong[] $values() {
        int i = 2 % 2;
        int i2 = write + 83;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        bindLong[] bindlongArr = {HUAWEI, GOOGLE};
        int i5 = i3 + 27;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return bindlongArr;
        }
        throw null;
    }

    public static bindLong valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 37;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        bindLong bindlong = (bindLong) Enum.valueOf(bindLong.class, str);
        int i4 = write + 97;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return bindlong;
    }

    public static bindLong[] values() {
        int i = 2 % 2;
        int i2 = write + 61;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        bindLong[] bindlongArr = (bindLong[]) $VALUES.clone();
        int i3 = write + 47;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return bindlongArr;
        }
        obj.hashCode();
        throw null;
    }
}
