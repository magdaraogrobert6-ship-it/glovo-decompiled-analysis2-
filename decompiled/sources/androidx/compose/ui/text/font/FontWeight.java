package androidx.compose.ui.text.font;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import com.huawei.hms.location.LocationRequest;
import com.huawei.riemann.location.common.utils.Constant;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class FontWeight implements Comparable<FontWeight> {
    public static final int $stable = 0;
    private static final FontWeight Black;
    private static final FontWeight Bold;
    public static final Companion Companion = new Companion(null);
    private static final FontWeight ExtraBold;
    private static final FontWeight ExtraLight;
    private static final FontWeight Light;
    private static final FontWeight Medium;
    private static final FontWeight Normal;
    private static final FontWeight SemiBold;
    private static final FontWeight Thin;
    private static final FontWeight W100;
    private static final FontWeight W200;
    private static final FontWeight W300;
    private static final FontWeight W400;
    private static final FontWeight W500;
    private static final FontWeight W600;
    private static final FontWeight W700;
    private static final FontWeight W800;
    private static final FontWeight W900;
    private static final List<FontWeight> values;
    private final int weight;

    public final int getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return this.weight;
    }

    @Override // java.lang.Comparable
    public int compareTo(FontWeight fontWeight) {
        return removeNodeAtDepth.serializer(this.weight, fontWeight.weight);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getBlack$annotations() {
        }

        public static /* synthetic */ void getBold$annotations() {
        }

        public static /* synthetic */ void getExtraBold$annotations() {
        }

        public static /* synthetic */ void getExtraLight$annotations() {
        }

        public static /* synthetic */ void getLight$annotations() {
        }

        public static /* synthetic */ void getMedium$annotations() {
        }

        public static /* synthetic */ void getNormal$annotations() {
        }

        public static /* synthetic */ void getSemiBold$annotations() {
        }

        public static /* synthetic */ void getThin$annotations() {
        }

        public static /* synthetic */ void getW100$annotations() {
        }

        public static /* synthetic */ void getW200$annotations() {
        }

        public static /* synthetic */ void getW300$annotations() {
        }

        public static /* synthetic */ void getW400$annotations() {
        }

        public static /* synthetic */ void getW500$annotations() {
        }

        public static /* synthetic */ void getW600$annotations() {
        }

        public static /* synthetic */ void getW700$annotations() {
        }

        public static /* synthetic */ void getW800$annotations() {
        }

        public static /* synthetic */ void getW900$annotations() {
        }

        public final FontWeight getBlack() {
            return FontWeight.Black;
        }

        public final FontWeight getBold() {
            return FontWeight.Bold;
        }

        public final FontWeight getExtraBold() {
            return FontWeight.ExtraBold;
        }

        public final FontWeight getExtraLight() {
            return FontWeight.ExtraLight;
        }

        public final FontWeight getLight() {
            return FontWeight.Light;
        }

        public final FontWeight getMedium() {
            return FontWeight.Medium;
        }

        public final FontWeight getNormal() {
            return FontWeight.Normal;
        }

        public final FontWeight getSemiBold() {
            return FontWeight.SemiBold;
        }

        public final FontWeight getThin() {
            return FontWeight.Thin;
        }

        public final List<FontWeight> getValues$ui_text() {
            return FontWeight.values;
        }

        public final FontWeight getW100() {
            return FontWeight.W100;
        }

        public final FontWeight getW200() {
            return FontWeight.W200;
        }

        public final FontWeight getW300() {
            return FontWeight.W300;
        }

        public final FontWeight getW400() {
            return FontWeight.W400;
        }

        public final FontWeight getW500() {
            return FontWeight.W500;
        }

        public final FontWeight getW600() {
            return FontWeight.W600;
        }

        public final FontWeight getW700() {
            return FontWeight.W700;
        }

        public final FontWeight getW800() {
            return FontWeight.W800;
        }

        public final FontWeight getW900() {
            return FontWeight.W900;
        }

        private Companion() {
        }
    }

    static {
        FontWeight fontWeight = new FontWeight(100);
        W100 = fontWeight;
        FontWeight fontWeight2 = new FontWeight(200);
        W200 = fontWeight2;
        FontWeight fontWeight3 = new FontWeight(LocationRequest.PRIORITY_INDOOR);
        W300 = fontWeight3;
        FontWeight fontWeight4 = new FontWeight(400);
        W400 = fontWeight4;
        FontWeight fontWeight5 = new FontWeight(Constant.ERROR_UNKNOWN);
        W500 = fontWeight5;
        FontWeight fontWeight6 = new FontWeight(600);
        W600 = fontWeight6;
        FontWeight fontWeight7 = new FontWeight(700);
        W700 = fontWeight7;
        FontWeight fontWeight8 = new FontWeight(800);
        W800 = fontWeight8;
        FontWeight fontWeight9 = new FontWeight(900);
        W900 = fontWeight9;
        Thin = fontWeight;
        ExtraLight = fontWeight2;
        Light = fontWeight3;
        Normal = fontWeight4;
        Medium = fontWeight5;
        SemiBold = fontWeight6;
        Bold = fontWeight7;
        ExtraBold = fontWeight8;
        Black = fontWeight9;
        values = SQLite.read(fontWeight, fontWeight2, fontWeight3, fontWeight4, fontWeight5, fontWeight6, fontWeight7, fontWeight8, fontWeight9);
    }

    public FontWeight(int i) {
        this.weight = i;
        if (1 > i || i >= 1001) {
            InlineClassHelperKt.throwIllegalArgumentException("Font weight can be in range [1, 1000]. Current value: " + i);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FontWeight) && this.weight == ((FontWeight) obj).weight;
    }

    public String toString() {
        return af$$ExternalSyntheticOutline0.m(new StringBuilder("FontWeight(weight="), this.weight, ')');
    }
}
