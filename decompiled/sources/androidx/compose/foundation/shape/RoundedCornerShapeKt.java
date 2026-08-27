package androidx.compose.foundation.shape;

import androidx.compose.ui.unit.Dp;
import o.getBottomLeftannotations;
import o.getBottomRightannotations;
import o.getTopLeftannotations;

/* JADX INFO: loaded from: classes.dex */
public abstract class RoundedCornerShapeKt {
    public static final getTopLeftannotations IconCompatParcelizer;

    public static final getTopLeftannotations IconCompatParcelizer(float f) {
        getBottomRightannotations getbottomrightannotations = new getBottomRightannotations(f);
        return new getTopLeftannotations(getbottomrightannotations, getbottomrightannotations, getbottomrightannotations, getbottomrightannotations);
    }

    static {
        getBottomLeftannotations getbottomleftannotations = new getBottomLeftannotations(50.0f);
        IconCompatParcelizer = new getTopLeftannotations(getbottomleftannotations, getbottomleftannotations, getbottomleftannotations, getbottomleftannotations);
    }

    /* JADX INFO: renamed from: RoundedCornerShape-a9UjIt4$default, reason: not valid java name */
    public static getTopLeftannotations m97RoundedCornerShapea9UjIt4$default(float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = Dp.m3673constructorimpl(0.0f);
        }
        if ((i & 2) != 0) {
            f2 = Dp.m3673constructorimpl(0.0f);
        }
        if ((i & 4) != 0) {
            f3 = Dp.m3673constructorimpl(0.0f);
        }
        if ((i & 8) != 0) {
            f4 = Dp.m3673constructorimpl(0.0f);
        }
        return new getTopLeftannotations(new getBottomRightannotations(f), new getBottomRightannotations(f2), new getBottomRightannotations(f3), new getBottomRightannotations(f4));
    }
}
