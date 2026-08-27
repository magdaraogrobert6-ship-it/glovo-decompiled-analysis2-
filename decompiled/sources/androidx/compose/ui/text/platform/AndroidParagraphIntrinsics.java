package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.LayoutIntrinsics;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.List;
import o.onViewAttachedToWindow;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidParagraphIntrinsics implements ParagraphIntrinsics {
    public static final int $stable = 8;
    private final List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> annotations;
    private final CharSequence charSequence;
    private final Density density;
    private final boolean emojiCompatProcessed;
    private final FontFamily.Resolver fontFamilyResolver;
    private final LayoutIntrinsics layoutIntrinsics;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private TypefaceDirtyTrackerLinkedList resolvedTypefaces;
    private final TextStyle style;
    private final String text;
    private final int textDirectionHeuristic;
    private final AndroidTextPaint textPaint;

    public final List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> getAnnotations() {
        return this.annotations;
    }

    public final CharSequence getCharSequence$ui_text() {
        return this.charSequence;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    public final LayoutIntrinsics getLayoutIntrinsics$ui_text() {
        return this.layoutIntrinsics;
    }

    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    public final TextStyle getStyle() {
        return this.style;
    }

    public final String getText() {
        return this.text;
    }

    public final int getTextDirectionHeuristic$ui_text() {
        return this.textDirectionHeuristic;
    }

    public final AndroidTextPaint getTextPaint$ui_text() {
        return this.textPaint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface _init_$lambda$0(AndroidParagraphIntrinsics androidParagraphIntrinsics, FontFamily fontFamily, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis) {
        onViewAttachedToWindow onviewattachedtowindowMo3162resolveDPcqOEQ = androidParagraphIntrinsics.fontFamilyResolver.mo3162resolveDPcqOEQ(fontFamily, fontWeight, fontStyle.m3193unboximpl(), fontSynthesis.m3206unboximpl());
        if (onviewattachedtowindowMo3162resolveDPcqOEQ instanceof TypefaceResult.Immutable) {
            Object value = ((TypefaceResult.Immutable) onviewattachedtowindowMo3162resolveDPcqOEQ).getValue();
            value.getClass();
            return (Typeface) value;
        }
        TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList = new TypefaceDirtyTrackerLinkedList(onviewattachedtowindowMo3162resolveDPcqOEQ, androidParagraphIntrinsics.resolvedTypefaces);
        androidParagraphIntrinsics.resolvedTypefaces = typefaceDirtyTrackerLinkedList;
        return typefaceDirtyTrackerLinkedList.getTypeface();
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMaxIntrinsicWidth() {
        return this.layoutIntrinsics.getMaxIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMinIntrinsicWidth() {
        return this.layoutIntrinsics.getMinIntrinsicWidth();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidParagraphIntrinsics(String str, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, List<AnnotatedString.Range<Placeholder>> list2, FontFamily.Resolver resolver, Density density) {
        Object obj;
        List list3;
        this.text = str;
        this.style = textStyle;
        this.annotations = list;
        this.placeholders = list2;
        this.fontFamilyResolver = resolver;
        this.density = density;
        AndroidTextPaint androidTextPaint = new AndroidTextPaint(1, density.getDensity());
        this.textPaint = androidTextPaint;
        int i = 0;
        this.emojiCompatProcessed = !AndroidParagraphIntrinsics_androidKt.getHasEmojiCompat(textStyle) ? false : ((Boolean) EmojiCompatStatus.INSTANCE.getFontLoaded().getValue()).booleanValue();
        this.textDirectionHeuristic = AndroidParagraphIntrinsics_androidKt.m3339resolveTextDirectionHeuristicsHklW4sA(textStyle.m3119getTextDirections_7Xco(), textStyle.getLocaleList());
        AndroidParagraphIntrinsics$$ExternalSyntheticLambda0 androidParagraphIntrinsics$$ExternalSyntheticLambda0 = new AndroidParagraphIntrinsics$$ExternalSyntheticLambda0(i, this);
        TextPaintExtensions_androidKt.setTextMotion(androidTextPaint, textStyle.getTextMotion());
        SpanStyle spanStyle = textStyle.toSpanStyle();
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i2);
            if (((AnnotatedString.Range) obj).getItem() instanceof SpanStyle) {
                break;
            } else {
                i2++;
            }
        }
        SpanStyle spanStyleApplySpanStyle = TextPaintExtensions_androidKt.applySpanStyle(androidTextPaint, spanStyle, androidParagraphIntrinsics$$ExternalSyntheticLambda0, density, obj != null);
        List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> list4 = this.annotations;
        if (spanStyleApplySpanStyle != null) {
            int size2 = list4.size() + 1;
            ArrayList arrayList = new ArrayList(size2);
            int i3 = 0;
            while (i3 < size2) {
                arrayList.add(i3 == 0 ? new AnnotatedString.Range<>(spanStyleApplySpanStyle, 0, this.text.length()) : this.annotations.get(i3 - 1));
                i3++;
            }
            list3 = arrayList;
        } else {
            list3 = list4;
        }
        CharSequence charSequenceCreateCharSequence = AndroidParagraphHelper_androidKt.createCharSequence(this.text, this.textPaint.getTextSize(), this.style, list3, this.placeholders, this.density, androidParagraphIntrinsics$$ExternalSyntheticLambda0, this.emojiCompatProcessed);
        this.charSequence = charSequenceCreateCharSequence;
        this.layoutIntrinsics = new LayoutIntrinsics(charSequenceCreateCharSequence, this.textPaint, this.textDirectionHeuristic);
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public boolean getHasStaleResolvedFonts() {
        TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList = this.resolvedTypefaces;
        if (typefaceDirtyTrackerLinkedList == null || !typefaceDirtyTrackerLinkedList.isStaleResolvedFont()) {
            return !this.emojiCompatProcessed && AndroidParagraphIntrinsics_androidKt.getHasEmojiCompat(this.style) && ((Boolean) EmojiCompatStatus.INSTANCE.getFontLoaded().getValue()).booleanValue();
        }
        return true;
    }
}
