package o;

import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import fwfd.com.fwfsdk.constant.FWFConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class from {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ from[] $VALUES;
    public static final EmojiSupportMatch Companion;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int write;
    private final String jsonName;
    public static final from ACTIVE = new from("ACTIVE", 0, "active");
    public static final from CANDIDATE = new from("CANDIDATE", 1, "candidate");
    public static final from SCHEDULED = new from("SCHEDULED", 2, "scheduled");
    public static final from FALLBACK = new from(FWFConstants.EXPLANATION_KIND_FALLBACK, 3, "fallback");
    public static final from UNKNOWN = new from(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4, SystemUtils.UNKNOWN);

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write + 119;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 113;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 9 / 0;
        }
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final String getJsonName() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 97;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.jsonName;
        }
        int i3 = 9 / 0;
        return this.jsonName;
    }

    private from(String str, int i, String str2) {
        super(str, i);
        this.jsonName = str2;
    }

    static {
        from[] fromVarArr$values = $values();
        $VALUES = fromVarArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) fromVarArr$values);
        Companion = new EmojiSupportMatch();
        int i = read + 43;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static from valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 5;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        from fromVar = (from) Enum.valueOf(from.class, str);
        int i3 = RemoteActionCompatParcelizer + 25;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return fromVar;
    }

    public static from[] values() {
        int i = 2 % 2;
        int i2 = write + 99;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        from[] fromVarArr = (from[]) $VALUES.clone();
        int i4 = RemoteActionCompatParcelizer + 27;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
        return fromVarArr;
    }

    private static final /* synthetic */ from[] $values() {
        int i = 2 % 2;
        int i2 = write + 21;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        from[] fromVarArr = {ACTIVE, CANDIDATE, SCHEDULED, FALLBACK, UNKNOWN};
        int i5 = i3 + 65;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return fromVarArr;
    }
}
