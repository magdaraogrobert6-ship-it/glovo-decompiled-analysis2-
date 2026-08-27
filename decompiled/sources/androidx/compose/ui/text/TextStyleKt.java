package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.LayoutDirection;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class TextStyleKt {
    public static final TextStyle lerp(TextStyle textStyle, TextStyle textStyle2, float f) {
        return new TextStyle(SpanStyleKt.lerp(textStyle.toSpanStyle(), textStyle2.toSpanStyle(), f), ParagraphStyleKt.lerp(textStyle.toParagraphStyle(), textStyle2.toParagraphStyle(), f));
    }

    public static final TextStyle resolveDefaults(TextStyle textStyle, LayoutDirection layoutDirection) {
        return new TextStyle(SpanStyleKt.resolveSpanStyleDefaults(textStyle.getSpanStyle$ui_text()), ParagraphStyleKt.resolveParagraphStyleDefaults(textStyle.getParagraphStyle$ui_text(), layoutDirection), textStyle.getPlatformStyle());
    }

    /* JADX INFO: renamed from: resolveTextDirection-IhaHGbI, reason: not valid java name */
    public static final int m3122resolveTextDirectionIhaHGbI(LayoutDirection layoutDirection, int i) {
        TextDirection.Companion companion = TextDirection.Companion;
        if (TextDirection.m3524equalsimpl0(i, companion.m3528getContents_7Xco())) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i2 == 1) {
                return companion.m3529getContentOrLtrs_7Xco();
            }
            if (i2 == 2) {
                return companion.m3530getContentOrRtls_7Xco();
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return 0;
        }
        if (!TextDirection.m3524equalsimpl0(i, companion.m3533getUnspecifieds_7Xco())) {
            return i;
        }
        int i3 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i3 == 1) {
            return companion.m3531getLtrs_7Xco();
        }
        if (i3 == 2) {
            return companion.m3532getRtls_7Xco();
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return 0;
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlatformTextStyle createPlatformTextStyleInternal(PlatformSpanStyle platformSpanStyle, PlatformParagraphStyle platformParagraphStyle) {
        if (platformSpanStyle == null && platformParagraphStyle == null) {
            return null;
        }
        return AndroidTextStyle_androidKt.createPlatformTextStyle(platformSpanStyle, platformParagraphStyle);
    }
}
