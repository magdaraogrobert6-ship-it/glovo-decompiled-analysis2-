package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.EmojiSupportMatch;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.Density;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import java.util.Locale;
import o.nearestAncestorIncludingSelf64DMado;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidParagraphIntrinsics_androidKt {
    /* JADX INFO: renamed from: resolveTextDirectionHeuristics-HklW4sA, reason: not valid java name */
    public static final int m3339resolveTextDirectionHeuristicsHklW4sA(int i, LocaleList localeList) {
        Locale platformLocale;
        TextDirection.Companion companion = TextDirection.Companion;
        if (TextDirection.m3524equalsimpl0(i, companion.m3529getContentOrLtrs_7Xco())) {
            return 2;
        }
        if (TextDirection.m3524equalsimpl0(i, companion.m3530getContentOrRtls_7Xco())) {
            return 3;
        }
        if (TextDirection.m3524equalsimpl0(i, companion.m3531getLtrs_7Xco())) {
            return 0;
        }
        if (TextDirection.m3524equalsimpl0(i, companion.m3532getRtls_7Xco())) {
            return 1;
        }
        if (!TextDirection.m3524equalsimpl0(i, companion.m3528getContents_7Xco()) && !TextDirection.m3524equalsimpl0(i, companion.m3533getUnspecifieds_7Xco())) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Invalid TextDirection.");
            return 0;
        }
        if (localeList == null || (platformLocale = localeList.get(0).getPlatformLocale()) == null) {
            platformLocale = Locale.getDefault();
        }
        int iSerializer = nearestAncestorIncludingSelf64DMado.serializer(platformLocale);
        return (iSerializer == 0 || iSerializer != 1) ? 2 : 3;
    }

    /* JADX INFO: renamed from: resolveTextDirectionHeuristics-HklW4sA$default, reason: not valid java name */
    public static /* synthetic */ int m3340resolveTextDirectionHeuristicsHklW4sA$default(int i, LocaleList localeList, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            localeList = null;
        }
        return m3339resolveTextDirectionHeuristicsHklW4sA(i, localeList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHasEmojiCompat(TextStyle textStyle) {
        PlatformParagraphStyle paragraphStyle;
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        EmojiSupportMatch emojiSupportMatchM2896boximpl = (platformStyle == null || (paragraphStyle = platformStyle.getParagraphStyle()) == null) ? null : EmojiSupportMatch.m2896boximpl(paragraphStyle.m2978getEmojiSupportMatch_3YsG6Y());
        return !(emojiSupportMatchM2896boximpl == null ? false : EmojiSupportMatch.m2899equalsimpl0(emojiSupportMatchM2896boximpl.m2902unboximpl(), EmojiSupportMatch.Companion.m2905getNone_3YsG6Y()));
    }

    public static final ParagraphIntrinsics ActualParagraphIntrinsics(String str, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, List<AnnotatedString.Range<Placeholder>> list2, Density density, FontFamily.Resolver resolver) {
        return new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density);
    }
}
