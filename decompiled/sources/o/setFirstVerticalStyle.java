package o;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class setFirstVerticalStyle {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ setFirstVerticalStyle[] $VALUES;
    public static final setHorizontalBias Companion;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static final Map<String, setFirstVerticalStyle> map;
    private static int serializer = 1;
    private static int write;
    private final int modeInt;
    private final String modeName;
    public static final setFirstVerticalStyle LIGHT = new setFirstVerticalStyle("LIGHT", 0, "mode_light", 1);
    public static final setFirstVerticalStyle DARK = new setFirstVerticalStyle("DARK", 1, "mode_dark", 2);
    public static final setFirstVerticalStyle SYSTEM = new setFirstVerticalStyle("SYSTEM", 2, "mode_follow_system", -1);

    public static final /* synthetic */ Map access$getMap$cp() {
        int i = 2 % 2;
        int i2 = write + 123;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        Map<String, setFirstVerticalStyle> map2 = map;
        int i5 = i3 + 85;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return map2;
        }
        throw null;
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write + 125;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 39;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final int getModeInt() {
        int i;
        int i2 = 2 % 2;
        int i3 = serializer + 57;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i4;
        if (i3 % 2 != 0) {
            i = this.modeInt;
            int i5 = 5 / 0;
        } else {
            i = this.modeInt;
        }
        int i6 = i4 + 11;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 34 / 0;
        }
        return i;
    }

    public final String getModeName() {
        int i = 2 % 2;
        int i2 = write + 19;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.modeName;
        }
        throw null;
    }

    private setFirstVerticalStyle(String str, int i, String str2, int i2) {
        super(str, i);
        this.modeName = str2;
        this.modeInt = i2;
    }

    static {
        setFirstVerticalStyle[] setfirstverticalstyleArr$values = $values();
        $VALUES = setfirstverticalstyleArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) setfirstverticalstyleArr$values);
        Companion = new setHorizontalBias();
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U entries = getEntries();
        int iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(entries, 10));
        if (iRemoteActionCompatParcelizer < 16) {
            int i = IconCompatParcelizer + 85;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            iRemoteActionCompatParcelizer = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
        Iterator<E> it = entries.iterator();
        while (it.hasNext()) {
            int i3 = IconCompatParcelizer + 19;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                Object next = it.next();
                linkedHashMap.put(((setFirstVerticalStyle) next).modeName, next);
                int i4 = 20 / 0;
            } else {
                Object next2 = it.next();
                linkedHashMap.put(((setFirstVerticalStyle) next2).modeName, next2);
            }
            int i5 = 2 % 2;
        }
        map = linkedHashMap;
    }

    public static setFirstVerticalStyle valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 23;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        setFirstVerticalStyle setfirstverticalstyle = (setFirstVerticalStyle) Enum.valueOf(setFirstVerticalStyle.class, str);
        int i3 = write + 119;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return setfirstverticalstyle;
    }

    public static setFirstVerticalStyle[] values() {
        int i = 2 % 2;
        int i2 = write + 125;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (setFirstVerticalStyle[]) $VALUES.clone();
        }
        int i3 = 50 / 0;
        return (setFirstVerticalStyle[]) $VALUES.clone();
    }

    private static final /* synthetic */ setFirstVerticalStyle[] $values() {
        int i = 2 % 2;
        int i2 = serializer + 15;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return new setFirstVerticalStyle[]{LIGHT, DARK, SYSTEM};
        }
        setFirstVerticalStyle setfirstverticalstyle = LIGHT;
        setFirstVerticalStyle setfirstverticalstyle2 = DARK;
        setFirstVerticalStyle setfirstverticalstyle3 = SYSTEM;
        setFirstVerticalStyle[] setfirstverticalstyleArr = new setFirstVerticalStyle[4];
        setfirstverticalstyleArr[1] = setfirstverticalstyle;
        setfirstverticalstyleArr[1] = setfirstverticalstyle2;
        setfirstverticalstyleArr[2] = setfirstverticalstyle3;
        return setfirstverticalstyleArr;
    }
}
