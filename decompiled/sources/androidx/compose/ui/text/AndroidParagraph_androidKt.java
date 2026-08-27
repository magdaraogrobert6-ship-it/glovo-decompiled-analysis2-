package androidx.compose.ui.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.ui.text.android.SpannedExtensions_androidKt;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.style.IndentationFixSpan;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidParagraph_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toLayoutAlign-aXe7zB0, reason: not valid java name */
    public static final int m2875toLayoutAlignaXe7zB0(int i) {
        TextAlign.Companion companion = TextAlign.Companion;
        if (TextAlign.m3507equalsimpl0(i, companion.m3514getLefte0LSkKk())) {
            return 3;
        }
        if (TextAlign.m3507equalsimpl0(i, companion.m3515getRighte0LSkKk())) {
            return 4;
        }
        if (TextAlign.m3507equalsimpl0(i, companion.m3511getCentere0LSkKk())) {
            return 2;
        }
        return (!TextAlign.m3507equalsimpl0(i, companion.m3516getStarte0LSkKk()) && TextAlign.m3507equalsimpl0(i, companion.m3512getEnde0LSkKk())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toLayoutBreakStrategy-xImikfE, reason: not valid java name */
    public static final int m2876toLayoutBreakStrategyxImikfE(int i) {
        LineBreak.Strategy.Companion companion = LineBreak.Strategy.Companion;
        if (LineBreak.Strategy.m3433equalsimpl0(i, companion.m3439getSimplefcGXIks())) {
            return 0;
        }
        if (LineBreak.Strategy.m3433equalsimpl0(i, companion.m3438getHighQualityfcGXIks())) {
            return 1;
        }
        return LineBreak.Strategy.m3433equalsimpl0(i, companion.m3437getBalancedfcGXIks()) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toLayoutHyphenationFrequency--3fSNIE, reason: not valid java name */
    public static final int m2877toLayoutHyphenationFrequency3fSNIE(int i) {
        Hyphens.Companion companion = Hyphens.Companion;
        if (Hyphens.m3399equalsimpl0(i, companion.m3403getAutovmbZdU8())) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        Hyphens.m3399equalsimpl0(i, companion.m3404getNonevmbZdU8());
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toLayoutLineBreakStyle-hpcqdu8, reason: not valid java name */
    public static final int m2878toLayoutLineBreakStylehpcqdu8(int i) {
        LineBreak.Strictness.Companion companion = LineBreak.Strictness.Companion;
        if (LineBreak.Strictness.m3444equalsimpl0(i, companion.m3448getDefaultusljTpc())) {
            return 0;
        }
        if (LineBreak.Strictness.m3444equalsimpl0(i, companion.m3449getLooseusljTpc())) {
            return 1;
        }
        if (LineBreak.Strictness.m3444equalsimpl0(i, companion.m3450getNormalusljTpc())) {
            return 2;
        }
        return LineBreak.Strictness.m3444equalsimpl0(i, companion.m3451getStrictusljTpc()) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toLayoutLineBreakWordStyle-wPN0Rpw, reason: not valid java name */
    public static final int m2879toLayoutLineBreakWordStylewPN0Rpw(int i) {
        LineBreak.WordBreak.Companion companion = LineBreak.WordBreak.Companion;
        return (!LineBreak.WordBreak.m3456equalsimpl0(i, companion.m3460getDefaultjp8hJ3c()) && LineBreak.WordBreak.m3456equalsimpl0(i, companion.m3461getPhrasejp8hJ3c())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toLayoutTextGranularity-duNsdkg, reason: not valid java name */
    public static final int m2880toLayoutTextGranularityduNsdkg(int i) {
        TextGranularity.Companion companion = TextGranularity.Companion;
        return (!TextGranularity.m3033equalsimpl0(i, companion.m3037getCharacterDRrd7Zo()) && TextGranularity.m3033equalsimpl0(i, companion.m3038getWordDRrd7Zo())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldAttachIndentationFixSpan(TextStyle textStyle, boolean z) {
        if (z && !TextUnit.m3864equalsimpl0(textStyle.m3112getLetterSpacingXSAIIZE(), TextUnitKt.getSp(0)) && !TextUnit.m3864equalsimpl0(textStyle.m3112getLetterSpacingXSAIIZE(), TextUnit.Companion.m3878getUnspecifiedXSAIIZE())) {
            int iM3117getTextAligne0LSkKk = textStyle.m3117getTextAligne0LSkKk();
            TextAlign.Companion companion = TextAlign.Companion;
            if (!TextAlign.m3507equalsimpl0(iM3117getTextAligne0LSkKk, companion.m3517getUnspecifiede0LSkKk()) && !TextAlign.m3507equalsimpl0(textStyle.m3117getTextAligne0LSkKk(), companion.m3516getStarte0LSkKk()) && !TextAlign.m3507equalsimpl0(textStyle.m3117getTextAligne0LSkKk(), companion.m3513getJustifye0LSkKk())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence attachIndentationFixSpan(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannableString == null) {
            spannableString = new SpannableString(charSequence);
        }
        if (!SpannedExtensions_androidKt.hasSpan(spannableString, IndentationFixSpan.class)) {
            SpannableExtensions_androidKt.setSpan(spannableString, new IndentationFixSpan(), spannableString.length() - 1, spannableString.length() - 1);
        }
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int numberOfLinesThatFitMaxHeight(TextLayout textLayout, int i) {
        int lineCount = textLayout.getLineCount();
        for (int i2 = 0; i2 < lineCount; i2++) {
            if (textLayout.getLineBottom(i2) > i) {
                return i2;
            }
        }
        return textLayout.getLineCount();
    }
}
