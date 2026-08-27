package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class setLegacyRequestDisallowInterceptTouchEventEnabled {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ setLegacyRequestDisallowInterceptTouchEventEnabled[] $VALUES;
    public static final setLegacyRequestDisallowInterceptTouchEventEnabled FailLeftMovement;
    public static final setLegacyRequestDisallowInterceptTouchEventEnabled FailRightMovement;
    public static final setLegacyRequestDisallowInterceptTouchEventEnabled FailSmile;
    private static int IconCompatParcelizer = 0;
    public static final setLegacyRequestDisallowInterceptTouchEventEnabled InfoLeftMovement;
    public static final setLegacyRequestDisallowInterceptTouchEventEnabled InfoRightMovement;
    public static final setLegacyRequestDisallowInterceptTouchEventEnabled InfoSmile;
    public static final setLegacyRequestDisallowInterceptTouchEventEnabled None;
    private static int RemoteActionCompatParcelizer = 1;
    public static final setLegacyRequestDisallowInterceptTouchEventEnabled SuccessLeftMovement;
    public static final setLegacyRequestDisallowInterceptTouchEventEnabled SuccessRightMovement;
    public static final setLegacyRequestDisallowInterceptTouchEventEnabled SuccessSmile;
    private static int serializer = 0;
    private static int write = 1;
    private final float angleSweep;
    private final Integer indicatorImage;
    private final float startAngle;

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 71;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float getAngleSweep() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 85;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        float f = this.angleSweep;
        int i5 = i3 + 109;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return f;
    }

    public final Integer getIndicatorImage() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 41;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        Integer num = this.indicatorImage;
        int i5 = i3 + 79;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final float getStartAngle() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 65;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        float f = this.startAngle;
        int i5 = i2 + 83;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return f;
        }
        throw null;
    }

    static {
        Integer numValueOf = Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_indicator_tick);
        SuccessRightMovement = new setLegacyRequestDisallowInterceptTouchEventEnabled("SuccessRightMovement", 0, numValueOf, -45.0f, 90.0f);
        Integer num = null;
        float f = 90.0f;
        int i = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        FailRightMovement = new setLegacyRequestDisallowInterceptTouchEventEnabled("FailRightMovement", 1, num, -45.0f, f, i, defaultConstructorMarker);
        InfoRightMovement = new setLegacyRequestDisallowInterceptTouchEventEnabled("InfoRightMovement", 2, Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_indicator_arrow_right), -45.0f, 90.0f);
        SuccessLeftMovement = new setLegacyRequestDisallowInterceptTouchEventEnabled("SuccessLeftMovement", 3, numValueOf, 135.0f, 90.0f);
        FailLeftMovement = new setLegacyRequestDisallowInterceptTouchEventEnabled("FailLeftMovement", 4, num, 135.0f, f, i, defaultConstructorMarker);
        InfoLeftMovement = new setLegacyRequestDisallowInterceptTouchEventEnabled("InfoLeftMovement", 5, Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_indicator_arrow_left), 135.0f, 90.0f);
        SuccessSmile = new setLegacyRequestDisallowInterceptTouchEventEnabled("SuccessSmile", 6, null, 0.0f, 360.0f, 1, null);
        FailSmile = new setLegacyRequestDisallowInterceptTouchEventEnabled("FailSmile", 7, null, 0.0f, 360.0f, 1, null);
        InfoSmile = new setLegacyRequestDisallowInterceptTouchEventEnabled("InfoSmile", 8, null, 0.0f, 360.0f, 1, null);
        None = new setLegacyRequestDisallowInterceptTouchEventEnabled("None", 9, null, 0.0f, 0.0f, 7, null);
        setLegacyRequestDisallowInterceptTouchEventEnabled[] setlegacyrequestdisallowintercepttoucheventenabledArr$values = $values();
        $VALUES = setlegacyrequestdisallowintercepttoucheventenabledArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) setlegacyrequestdisallowintercepttoucheventenabledArr$values);
        int i2 = write + 99;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static setLegacyRequestDisallowInterceptTouchEventEnabled valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 109;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (setLegacyRequestDisallowInterceptTouchEventEnabled) Enum.valueOf(setLegacyRequestDisallowInterceptTouchEventEnabled.class, str);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static setLegacyRequestDisallowInterceptTouchEventEnabled[] values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 105;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setLegacyRequestDisallowInterceptTouchEventEnabled[] setlegacyrequestdisallowintercepttoucheventenabledArr = (setLegacyRequestDisallowInterceptTouchEventEnabled[]) $VALUES.clone();
        int i4 = RemoteActionCompatParcelizer + 47;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
        return setlegacyrequestdisallowintercepttoucheventenabledArr;
    }

    private static final /* synthetic */ setLegacyRequestDisallowInterceptTouchEventEnabled[] $values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 17;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        setLegacyRequestDisallowInterceptTouchEventEnabled[] setlegacyrequestdisallowintercepttoucheventenabledArr = {SuccessRightMovement, FailRightMovement, InfoRightMovement, SuccessLeftMovement, FailLeftMovement, InfoLeftMovement, SuccessSmile, FailSmile, InfoSmile, None};
        int i5 = i3 + 111;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return setlegacyrequestdisallowintercepttoucheventenabledArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ setLegacyRequestDisallowInterceptTouchEventEnabled(String str, int i, Integer num, float f, float f2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        float f3;
        float f4;
        if ((i2 & 1) != 0) {
            int i3 = RemoteActionCompatParcelizer + 21;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
            num = null;
        }
        Integer num2 = num;
        if ((i2 & 2) != 0) {
            int i5 = 2 % 2;
            f3 = 0.0f;
        } else {
            f3 = f;
        }
        if ((i2 & 4) != 0) {
            int i6 = IconCompatParcelizer + 15;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            f4 = 0.0f;
        } else {
            f4 = f2;
        }
        this(str, i, num2, f3, f4);
    }

    private setLegacyRequestDisallowInterceptTouchEventEnabled(String str, int i, Integer num, float f, float f2) {
        super(str, i);
        this.indicatorImage = num;
        this.startAngle = f;
        this.angleSweep = f2;
    }
}
