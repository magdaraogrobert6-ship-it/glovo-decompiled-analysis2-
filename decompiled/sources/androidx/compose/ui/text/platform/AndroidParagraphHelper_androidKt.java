package androidx.compose.ui.text.platform;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.EmojiSupportMatch;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.platform.extensions.PlaceholderExtensions_androidKt;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import java.util.List;
import o.MutableRectKt;
import o.getCieXyz;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidParagraphHelper_androidKt {
    private static final AndroidParagraphHelper_androidKt$NoopSpan$1 NoopSpan = new CharacterStyle() { // from class: androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt$NoopSpan$1
        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [int] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r2v16, types: [o.MutableRectKt] */
    public static final CharSequence createCharSequence(String str, float f, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, List<AnnotatedString.Range<Placeholder>> list2, Density density, r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds, boolean z) {
        CharSequence charSequenceWrite;
        Spannable spannableString;
        PlatformParagraphStyle paragraphStyle;
        if (z && MutableRectKt.write()) {
            PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
            EmojiSupportMatch emojiSupportMatchM2896boximpl = (platformStyle == null || (paragraphStyle = platformStyle.getParagraphStyle()) == null) ? null : EmojiSupportMatch.m2896boximpl(paragraphStyle.m2978getEmojiSupportMatch_3YsG6Y());
            charSequenceWrite = MutableRectKt.RemoteActionCompatParcelizer().write(0, str.length(), emojiSupportMatchM2896boximpl == null ? 0 : EmojiSupportMatch.m2899equalsimpl0(emojiSupportMatchM2896boximpl.m2902unboximpl(), EmojiSupportMatch.Companion.m2903getAll_3YsG6Y()), str);
            charSequenceWrite.getClass();
        } else {
            charSequenceWrite = str;
        }
        if (list.isEmpty() && list2.isEmpty()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{textStyle.getTextIndent(), TextIndent.Companion.getNone()}, getCieXyz.write())).booleanValue() && TextUnit.m3865getRawTypeimpl(textStyle.m3115getLineHeightXSAIIZE()) == 0) {
                return charSequenceWrite;
            }
        }
        if (charSequenceWrite instanceof Spannable) {
            spannableString = (Spannable) charSequenceWrite;
        } else {
            spannableString = new SpannableString(charSequenceWrite);
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{textStyle.getTextDecoration(), TextDecoration.Companion.getUnderline()}, getCieXyz.write())).booleanValue()) {
            SpannableExtensions_androidKt.setSpan(spannableString, NoopSpan, 0, str.length());
        }
        if (isIncludeFontPaddingEnabled(textStyle) && textStyle.getLineHeightStyle() == null) {
            SpannableExtensions_androidKt.m3364setLineHeightr9BaKPg(spannableString, textStyle.m3115getLineHeightXSAIIZE(), f, density);
        } else {
            LineHeightStyle lineHeightStyle = textStyle.getLineHeightStyle();
            if (lineHeightStyle == null) {
                lineHeightStyle = LineHeightStyle.Companion.getDefault();
            }
            SpannableExtensions_androidKt.m3363setLineHeightKmRG4DE(spannableString, textStyle.m3115getLineHeightXSAIIZE(), f, density, lineHeightStyle);
        }
        SpannableExtensions_androidKt.setTextIndent(spannableString, textStyle.getTextIndent(), f, density);
        SpannableExtensions_androidKt.setSpanStyles(spannableString, textStyle, list, density, r8lambdafbccdpyn0hhvaib8bd2sxm5rsds);
        SpannableExtensions_androidKt.setBulletSpans(spannableString, list, f, density, textStyle.getTextIndent());
        PlaceholderExtensions_androidKt.setPlaceholders(spannableString, list2, density);
        return spannableString;
    }

    public static final boolean isIncludeFontPaddingEnabled(TextStyle textStyle) {
        PlatformParagraphStyle paragraphStyle;
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        if (platformStyle == null || (paragraphStyle = platformStyle.getParagraphStyle()) == null) {
            return false;
        }
        return paragraphStyle.getIncludeFontPadding();
    }
}
