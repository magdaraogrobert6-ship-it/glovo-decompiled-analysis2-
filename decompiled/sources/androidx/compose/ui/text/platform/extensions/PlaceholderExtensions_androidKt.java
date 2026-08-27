package androidx.compose.ui.text.platform.extensions;

import android.text.Spannable;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import o.isValidimpl;

/* JADX INFO: loaded from: classes.dex */
public final class PlaceholderExtensions_androidKt {
    /* JADX INFO: renamed from: getSpanUnit--R2X_6o$annotations, reason: not valid java name */
    private static /* synthetic */ void m3353getSpanUnitR2X_6o$annotations(long j) {
    }

    /* JADX INFO: renamed from: getSpanVerticalAlign-do9X-Gg$annotations, reason: not valid java name */
    private static /* synthetic */ void m3355getSpanVerticalAligndo9XGg$annotations(int i) {
    }

    public static final void setPlaceholders(Spannable spannable, List<AnnotatedString.Range<Placeholder>> list, Density density) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range<Placeholder> range = list.get(i);
            setPlaceholder(spannable, range.component1(), range.component2(), range.component3(), density);
        }
    }

    /* JADX INFO: renamed from: getSpanVerticalAlign-do9X-Gg, reason: not valid java name */
    private static final int m3354getSpanVerticalAligndo9XGg(int i) {
        PlaceholderVerticalAlign.Companion companion = PlaceholderVerticalAlign.Companion;
        if (PlaceholderVerticalAlign.m2967equalsimpl0(i, companion.m2971getAboveBaselineJ6kI3mc())) {
            return 0;
        }
        if (PlaceholderVerticalAlign.m2967equalsimpl0(i, companion.m2977getTopJ6kI3mc())) {
            return 1;
        }
        if (PlaceholderVerticalAlign.m2967equalsimpl0(i, companion.m2972getBottomJ6kI3mc())) {
            return 2;
        }
        if (PlaceholderVerticalAlign.m2967equalsimpl0(i, companion.m2973getCenterJ6kI3mc())) {
            return 3;
        }
        if (PlaceholderVerticalAlign.m2967equalsimpl0(i, companion.m2976getTextTopJ6kI3mc())) {
            return 4;
        }
        if (PlaceholderVerticalAlign.m2967equalsimpl0(i, companion.m2974getTextBottomJ6kI3mc())) {
            return 5;
        }
        if (PlaceholderVerticalAlign.m2967equalsimpl0(i, companion.m2975getTextCenterJ6kI3mc())) {
            return 6;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Invalid PlaceholderVerticalAlign");
        return 0;
    }

    private static final void setPlaceholder(Spannable spannable, Placeholder placeholder, int i, int i2, Density density) {
        for (Object obj : spannable.getSpans(i, i2, isValidimpl.class)) {
            spannable.removeSpan((isValidimpl) obj);
        }
        SpannableExtensions_androidKt.setSpan(spannable, new PlaceholderSpan(TextUnit.m3867getValueimpl(placeholder.m2963getWidthXSAIIZE()), m3352getSpanUnitR2X_6o(placeholder.m2963getWidthXSAIIZE()), TextUnit.m3867getValueimpl(placeholder.m2961getHeightXSAIIZE()), m3352getSpanUnitR2X_6o(placeholder.m2961getHeightXSAIIZE()), density, m3354getSpanVerticalAligndo9XGg(placeholder.m2962getPlaceholderVerticalAlignJ6kI3mc())), i, i2);
    }

    /* JADX INFO: renamed from: getSpanUnit--R2X_6o, reason: not valid java name */
    private static final int m3352getSpanUnitR2X_6o(long j) {
        long jM3866getTypeUIouoOA = TextUnit.m3866getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m3895equalsimpl0(jM3866getTypeUIouoOA, companion.m3900getSpUIouoOA())) {
            return 0;
        }
        return TextUnitType.m3895equalsimpl0(jM3866getTypeUIouoOA, companion.m3899getEmUIouoOA()) ? 1 : 2;
    }
}
