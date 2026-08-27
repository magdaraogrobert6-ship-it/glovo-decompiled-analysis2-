package androidx.compose.ui.text.android;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import androidx.compose.ui.node.LayoutNode$$ExternalSyntheticLambda1;
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.ui.text.android.style.LetterSpacingSpanPx;
import java.util.Comparator;
import o.ensureSubscribedToInAppMessageEventslambda7;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutIntrinsics_androidKt {
    private static final Comparator<ensureSubscribedToInAppMessageEventslambda7> IntRangeComparator = new LayoutNode$$ExternalSyntheticLambda1(2);
    private static final boolean stripNonMetricAffectingCharSpans = true;

    private static /* synthetic */ void getStripNonMetricAffectingCharSpans$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int IntRangeComparator$lambda$0(ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7, ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda8) {
        return (ensuresubscribedtoinappmessageeventslambda7.read - ensuresubscribedtoinappmessageeventslambda7.write) - (ensuresubscribedtoinappmessageeventslambda8.read - ensuresubscribedtoinappmessageeventslambda8.write);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence stripNonMetricAffectingCharacterStyleSpans(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (SpannedExtensions_androidKt.hasSpan(spanned, CharacterStyle.class)) {
                CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence.length(), CharacterStyle.class);
                if (characterStyleArr != null && characterStyleArr.length != 0) {
                    SpannableString spannableString = null;
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence);
                            }
                            spannableString.removeSpan(characterStyle);
                        }
                    }
                    if (spannableString != null) {
                        return spannableString;
                    }
                }
            }
        }
        return charSequence;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldIncreaseMaxIntrinsic(float f, CharSequence charSequence, TextPaint textPaint) {
        if (f == 0.0f) {
            return false;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (SpannedExtensions_androidKt.hasSpan(spanned, LetterSpacingSpanPx.class) || SpannedExtensions_androidKt.hasSpan(spanned, LetterSpacingSpanEm.class)) {
                return true;
            }
        }
        return textPaint.getLetterSpacing() != 0.0f;
    }
}
