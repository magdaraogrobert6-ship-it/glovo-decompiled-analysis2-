package androidx.compose.ui.text;

import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.compose.runtime.GapComposer$$ExternalSyntheticLambda3;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.selection.WordBoundary_androidKt;
import androidx.compose.ui.text.android.selection.WordIterator;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.instance_delegatelambda0;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidParagraph implements Paragraph {
    public static final int $stable = 8;
    private final CharSequence charSequence;
    private final long constraints;
    private final TextLayout layout;
    private final int maxLines;
    private final int overflow;
    private final AndroidParagraphIntrinsics paragraphIntrinsics;
    private final List<Rect> placeholderRects;

    public static /* synthetic */ boolean $r8$lambda$FJiDYYxJs4YNXmAXK_YJia8TzKI(TextInclusionStrategy textInclusionStrategy, RectF rectF, RectF rectF2) {
        return getRangeForRect_8_6BmAI$lambda$0(textInclusionStrategy, rectF, rectF2);
    }

    public static /* synthetic */ void getCharSequence$ui_text$annotations() {
    }

    public static /* synthetic */ void getTextLocale$ui_text$annotations() {
    }

    public static /* synthetic */ void getTextPaint$ui_text$annotations() {
    }

    private final boolean hasSpan(Spanned spanned, Class<?> cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public final CharSequence getCharSequence$ui_text() {
        return this.charSequence;
    }

    /* JADX INFO: renamed from: getConstraints-msEJaDk, reason: not valid java name */
    public final long m2861getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getFirstBaseline() {
        return getLineBaseline(0);
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    /* JADX INFO: renamed from: getOverflow-gIe3tQ8, reason: not valid java name */
    public final int m2863getOverflowgIe3tQ8() {
        return this.overflow;
    }

    public final AndroidParagraphIntrinsics getParagraphIntrinsics() {
        return this.paragraphIntrinsics;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    private final TextLayout constructTextLayout(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        return new TextLayout(charSequence, getWidth(), getTextPaint$ui_text(), i, truncateAt, this.paragraphIntrinsics.getTextDirectionHeuristic$ui_text(), 1.0f, 0.0f, AndroidParagraphHelper_androidKt.isIncludeFontPaddingEnabled(this.paragraphIntrinsics.getStyle()), true, i3, i5, i6, i7, i4, i2, null, null, this.paragraphIntrinsics.getLayoutIntrinsics$ui_text(), 196736, null);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: fillBoundingBoxes-8ffj60Q, reason: not valid java name */
    public void mo2860fillBoundingBoxes8ffj60Q(long j, float[] fArr, int i) {
        this.layout.fillBoundingBoxes(TextRange.m3074getMinimpl(j), TextRange.m3073getMaximpl(j), fArr, i);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public ResolvedTextDirection getBidiRunDirection(int i) {
        return this.layout.isRtlCharAt(i) ? ResolvedTextDirection.Rtl : ResolvedTextDirection.Ltr;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public boolean getDidExceedMaxLines() {
        return this.layout.getDidExceedMaxLines();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getHeight() {
        return this.layout.getHeight();
    }

    public final float getLineAscent$ui_text(int i) {
        return this.layout.getLineAscent(i);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineBaseline(int i) {
        return this.layout.getLineBaseline(i);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineBottom(int i) {
        return this.layout.getLineBottom(i);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineCount() {
        return this.layout.getLineCount();
    }

    public final float getLineDescent$ui_text(int i) {
        return this.layout.getLineDescent(i);
    }

    public final int getLineEllipsisCount$ui_text(int i) {
        return this.layout.getLineEllipsisCount(i);
    }

    public final int getLineEllipsisOffset$ui_text(int i) {
        return this.layout.getLineEllipsisOffset(i);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineForOffset(int i) {
        return this.layout.getLineForOffset(i);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineHeight(int i) {
        return this.layout.getLineHeight(i);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineLeft(int i) {
        return this.layout.getLineLeft(i);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineRight(int i) {
        return this.layout.getLineRight(i);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineStart(int i) {
        return this.layout.getLineStart(i);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineTop(int i) {
        return this.layout.getLineTop(i);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineWidth(int i) {
        return this.layout.getLineWidth(i);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getMaxIntrinsicWidth() {
        return this.paragraphIntrinsics.getMaxIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getMinIntrinsicWidth() {
        return this.paragraphIntrinsics.getMinIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public ResolvedTextDirection getParagraphDirection(int i) {
        return this.layout.getParagraphDirection(this.layout.getLineForOffset(i)) == 1 ? ResolvedTextDirection.Ltr : ResolvedTextDirection.Rtl;
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: getRangeForRect-8-6BmAI, reason: not valid java name */
    public long mo2864getRangeForRect86BmAI(Rect rect, int i, TextInclusionStrategy textInclusionStrategy) {
        int[] rangeForRect = this.layout.getRangeForRect(RectHelper_androidKt.toAndroidRectF(rect), AndroidParagraph_androidKt.m2880toLayoutTextGranularityduNsdkg(i), new GapComposer$$ExternalSyntheticLambda3(9, textInclusionStrategy));
        return rangeForRect == null ? TextRange.Companion.m3081getZerod9O1mEE() : TextRangeKt.TextRange(rangeForRect[0], rangeForRect[1]);
    }

    public final Locale getTextLocale$ui_text() {
        return this.paragraphIntrinsics.getTextPaint$ui_text().getTextLocale();
    }

    public final AndroidTextPaint getTextPaint$ui_text() {
        return this.paragraphIntrinsics.getTextPaint$ui_text();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getWidth() {
        return Constraints.m3626getMaxWidthimpl(this.constraints);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public long mo2865getWordBoundaryjx7JFs(int i) {
        WordIterator wordIterator = this.layout.getWordIterator();
        return TextRangeKt.TextRange(WordBoundary_androidKt.getWordStart(wordIterator, i), WordBoundary_androidKt.getWordEnd(wordIterator, i));
    }

    @Override // androidx.compose.ui.text.Paragraph
    public boolean isLineEllipsized(int i) {
        return this.layout.isLineEllipsized(i);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public Rect getBoundingBox(int i) {
        if (i < 0 || i >= this.charSequence.length()) {
            StringBuilder sbM = ff$$ExternalSyntheticOutline0.m(i, "offset(", ") is out of bounds [0,");
            sbM.append(this.charSequence.length());
            sbM.append(')');
            InlineClassHelperKt.throwIllegalArgumentException(sbM.toString());
        }
        RectF boundingBox = this.layout.getBoundingBox(i);
        return new Rect(boundingBox.left, boundingBox.top, boundingBox.right, boundingBox.bottom);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public Rect getCursorRect(int i) {
        if (i < 0 || i > this.charSequence.length()) {
            StringBuilder sbM = ff$$ExternalSyntheticOutline0.m(i, "offset(", ") is out of bounds [0,");
            sbM.append(this.charSequence.length());
            sbM.append(']');
            InlineClassHelperKt.throwIllegalArgumentException(sbM.toString());
        }
        float primaryHorizontal$default = TextLayout.getPrimaryHorizontal$default(this.layout, i, false, 2, null);
        int lineForOffset = this.layout.getLineForOffset(i);
        return new Rect(primaryHorizontal$default, this.layout.getLineTop(lineForOffset), primaryHorizontal$default, this.layout.getLineBottom(lineForOffset));
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineForVerticalPosition(float f) {
        return this.layout.getLineForVertical((int) f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getRangeForRect_8_6BmAI$lambda$0(TextInclusionStrategy textInclusionStrategy, RectF rectF, RectF rectF2) {
        return textInclusionStrategy.isIncluded(RectHelper_androidKt.toComposeRect(rectF), RectHelper_androidKt.toComposeRect(rectF2));
    }

    private final ShaderBrushSpan[] getShaderBrushSpans(TextLayout textLayout) {
        if (!(textLayout.getText() instanceof Spanned)) {
            return null;
        }
        CharSequence text = textLayout.getText();
        text.getClass();
        if (!hasSpan((Spanned) text, ShaderBrushSpan.class)) {
            return null;
        }
        CharSequence text2 = textLayout.getText();
        text2.getClass();
        return (ShaderBrushSpan[]) ((Spanned) text2).getSpans(0, textLayout.getText().length(), ShaderBrushSpan.class);
    }

    private final void paint(Canvas canvas) {
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.save();
            nativeCanvas.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.layout.paint(nativeCanvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.restore();
        }
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineEnd(int i, boolean z) {
        TextLayout textLayout = this.layout;
        return z ? textLayout.getLineVisibleEnd(i) : textLayout.getLineEnd(i);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public Path getPathForRange(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.charSequence.length()) {
            StringBuilder sbM = m1$$ExternalSyntheticOutline0.m(i, i2, "start(", ") or end(", ") is out of range [0..");
            sbM.append(this.charSequence.length());
            sbM.append("], or start > end!");
            InlineClassHelperKt.throwIllegalArgumentException(sbM.toString());
        }
        android.graphics.Path path = new android.graphics.Path();
        this.layout.getSelectionPath(i, i2, path);
        return AndroidPath_androidKt.asComposePath(path);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: paint-LG529CI, reason: not valid java name */
    public void mo2866paintLG529CI(Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i) {
        int iM3345getBlendMode0nO6VwU = getTextPaint$ui_text().m3345getBlendMode0nO6VwU();
        AndroidTextPaint textPaint$ui_text = getTextPaint$ui_text();
        textPaint$ui_text.m3350setColor8_81llA(j);
        textPaint$ui_text.setShadow(shadow);
        textPaint$ui_text.setTextDecoration(textDecoration);
        textPaint$ui_text.setDrawStyle(drawStyle);
        textPaint$ui_text.m3347setBlendModes9anfk8(i);
        paint(canvas);
        getTextPaint$ui_text().m3347setBlendModes9anfk8(iM3345getBlendMode0nO6VwU);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: paint-RPmYEkk, reason: not valid java name */
    public void mo2867paintRPmYEkk(Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration) {
        AndroidTextPaint textPaint$ui_text = getTextPaint$ui_text();
        textPaint$ui_text.m3350setColor8_81llA(j);
        textPaint$ui_text.setShadow(shadow);
        textPaint$ui_text.setTextDecoration(textDecoration);
        paint(canvas);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: paint-hn5TExg, reason: not valid java name */
    public void mo2868painthn5TExg(Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i) {
        int iM3345getBlendMode0nO6VwU = getTextPaint$ui_text().m3345getBlendMode0nO6VwU();
        AndroidTextPaint textPaint$ui_text = getTextPaint$ui_text();
        float width = getWidth();
        textPaint$ui_text.m3348setBrush12SF9DM(brush, Size.m537constructorimpl((((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (((long) Float.floatToRawIntBits(width)) << 32)), f);
        textPaint$ui_text.setShadow(shadow);
        textPaint$ui_text.setTextDecoration(textDecoration);
        textPaint$ui_text.setDrawStyle(drawStyle);
        textPaint$ui_text.m3347setBlendModes9anfk8(i);
        paint(canvas);
        getTextPaint$ui_text().m3347setBlendModes9anfk8(iM3345getBlendMode0nO6VwU);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:105:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:106:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:108:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:109:0x030a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0313  */
    /* JADX WARN: Code duplicated, block: B:111:0x0318  */
    /* JADX WARN: Code duplicated, block: B:114:0x032e  */
    /* JADX WARN: Code duplicated, block: B:121:0x02bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x019f  */
    /* JADX WARN: Code duplicated, block: B:57:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:59:0x01dd A[LOOP:0: B:58:0x01db->B:59:0x01dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x0204  */
    /* JADX WARN: Code duplicated, block: B:63:0x0208  */
    /* JADX WARN: Code duplicated, block: B:65:0x021f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0235  */
    /* JADX WARN: Code duplicated, block: B:68:0x0237  */
    /* JADX WARN: Code duplicated, block: B:74:0x0251  */
    /* JADX WARN: Code duplicated, block: B:77:0x025a  */
    /* JADX WARN: Code duplicated, block: B:78:0x025c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [int] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [int] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v14, types: [android.text.Spanned] */
    /* JADX WARN: Type inference failed for: r6v15, types: [androidx.compose.ui.text.android.TextLayout] */
    /* JADX WARN: Type inference failed for: r6v22, types: [androidx.compose.ui.text.android.TextLayout] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [androidx.compose.ui.text.android.TextLayout] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i, int i2, long j) {
        CharSequence charSequence$ui_text;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        TextLayout textLayoutConstructTextLayout$default;
        ?? r11;
        ShaderBrushSpan[] shaderBrushSpans;
        CharSequence charSequence;
        ?? r1;
        Object[] spans;
        ArrayList arrayList;
        int length;
        ?? r12;
        List<Rect> list;
        int spanEnd;
        int lineForOffset;
        ?? r8;
        ?? r9;
        ?? r6;
        Rect rect;
        float secondaryHorizontal;
        int widthPx;
        float primaryHorizontal;
        int widthPx2;
        float f;
        TextLayout textLayout;
        float lineBaseline;
        int heightPx;
        float lineTop;
        float heightPx2;
        float lineBaseline2;
        int length2;
        ?? r13;
        this.paragraphIntrinsics = androidParagraphIntrinsics;
        this.maxLines = i;
        this.overflow = i2;
        this.constraints = j;
        if (Constraints.m3627getMinHeightimpl(j) != 0 || Constraints.m3628getMinWidthimpl(j) != 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            InlineClassHelperKt.throwIllegalArgumentException("maxLines should be greater than 0");
        }
        TextStyle style = androidParagraphIntrinsics.getStyle();
        TextOverflow.Companion companion = TextOverflow.Companion;
        if (AndroidParagraph_androidKt.shouldAttachIndentationFixSpan(style, TextOverflow.m3559equalsimpl0(i2, companion.m3569getEllipsisgIe3tQ8()))) {
            charSequence$ui_text = AndroidParagraph_androidKt.attachIndentationFixSpan(androidParagraphIntrinsics.getCharSequence$ui_text());
        } else {
            charSequence$ui_text = androidParagraphIntrinsics.getCharSequence$ui_text();
        }
        CharSequence charSequence2 = charSequence$ui_text;
        this.charSequence = charSequence2;
        int iM2875toLayoutAlignaXe7zB0 = AndroidParagraph_androidKt.m2875toLayoutAlignaXe7zB0(style.m3117getTextAligne0LSkKk());
        boolean zM3507equalsimpl0 = TextAlign.m3507equalsimpl0(style.m3117getTextAligne0LSkKk(), TextAlign.Companion.m3513getJustifye0LSkKk());
        int iM2877toLayoutHyphenationFrequency3fSNIE = AndroidParagraph_androidKt.m2877toLayoutHyphenationFrequency3fSNIE(style.getParagraphStyle$ui_text().m2950getHyphensvmbZdU8());
        int iM2876toLayoutBreakStrategyxImikfE = AndroidParagraph_androidKt.m2876toLayoutBreakStrategyxImikfE(LineBreak.m3416getStrategyfcGXIks(style.m3114getLineBreakrAG3T2k()));
        int iM2878toLayoutLineBreakStylehpcqdu8 = AndroidParagraph_androidKt.m2878toLayoutLineBreakStylehpcqdu8(LineBreak.m3417getStrictnessusljTpc(style.m3114getLineBreakrAG3T2k()));
        int iM2879toLayoutLineBreakWordStylewPN0Rpw = AndroidParagraph_androidKt.m2879toLayoutLineBreakWordStylewPN0Rpw(LineBreak.m3418getWordBreakjp8hJ3c(style.m3114getLineBreakrAG3T2k()));
        if (TextOverflow.m3559equalsimpl0(i2, companion.m3569getEllipsisgIe3tQ8())) {
            truncateAt2 = TextUtils.TruncateAt.END;
        } else if (TextOverflow.m3559equalsimpl0(i2, companion.m3570getMiddleEllipsisgIe3tQ8())) {
            truncateAt2 = TextUtils.TruncateAt.MIDDLE;
        } else {
            if (TextOverflow.m3559equalsimpl0(i2, companion.m3571getStartEllipsisgIe3tQ8())) {
                truncateAt2 = TextUtils.TruncateAt.START;
            } else {
                truncateAt = null;
            }
            textLayoutConstructTextLayout$default = constructTextLayout$default(this, iM2875toLayoutAlignaXe7zB0, zM3507equalsimpl0 ? 1 : 0, truncateAt, i, iM2877toLayoutHyphenationFrequency3fSNIE, iM2876toLayoutBreakStrategyxImikfE, iM2878toLayoutLineBreakStylehpcqdu8, iM2879toLayoutLineBreakWordStylewPN0Rpw, null, Fields.RotationX, null);
            r11 = 0;
            if (Build.VERSION.SDK_INT < 35 && getTextPaint$ui_text().getLetterSpacing() != 0.0f && ((TextOverflow.m3559equalsimpl0(i2, companion.m3571getStartEllipsisgIe3tQ8()) || TextOverflow.m3559equalsimpl0(i2, companion.m3570getMiddleEllipsisgIe3tQ8())) && textLayoutConstructTextLayout$default.getLineEllipsisCount(0) > 0)) {
                int lineEllipsisOffset = textLayoutConstructTextLayout$default.getLineEllipsisOffset(0);
                textLayoutConstructTextLayout$default = constructTextLayout(iM2875toLayoutAlignaXe7zB0, zM3507equalsimpl0 ? 1 : 0, truncateAt, i, iM2877toLayoutHyphenationFrequency3fSNIE, iM2876toLayoutBreakStrategyxImikfE, iM2878toLayoutLineBreakStylehpcqdu8, iM2879toLayoutLineBreakWordStylewPN0Rpw, TextUtils.concat(charSequence2.subSequence(0, lineEllipsisOffset), "…", charSequence2.subSequence(textLayoutConstructTextLayout$default.getLineEllipsisCount(0) + lineEllipsisOffset, charSequence2.length())));
            }
            if (!TextOverflow.m3559equalsimpl0(i2, companion.m3569getEllipsisgIe3tQ8()) && textLayoutConstructTextLayout$default.getHeight() > Constraints.m3625getMaxHeightimpl(j) && i > 1) {
                int iNumberOfLinesThatFitMaxHeight = AndroidParagraph_androidKt.numberOfLinesThatFitMaxHeight(textLayoutConstructTextLayout$default, Constraints.m3625getMaxHeightimpl(j));
                if (iNumberOfLinesThatFitMaxHeight >= 0 && iNumberOfLinesThatFitMaxHeight != i) {
                    textLayoutConstructTextLayout$default = constructTextLayout$default(this, iM2875toLayoutAlignaXe7zB0, zM3507equalsimpl0 ? 1 : 0, truncateAt, iNumberOfLinesThatFitMaxHeight < 1 ? 1 : iNumberOfLinesThatFitMaxHeight, iM2877toLayoutHyphenationFrequency3fSNIE, iM2876toLayoutBreakStrategyxImikfE, iM2878toLayoutLineBreakStylehpcqdu8, iM2879toLayoutLineBreakWordStylewPN0Rpw, null, Fields.RotationX, null);
                }
                this.layout = textLayoutConstructTextLayout$default;
            } else {
                r11 = 0;
                this.layout = textLayoutConstructTextLayout$default;
            }
            getTextPaint$ui_text().m3348setBrush12SF9DM(style.getBrush(), Size.m537constructorimpl((((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (((long) Float.floatToRawIntBits(getWidth())) << 32)), style.getAlpha());
            shaderBrushSpans = getShaderBrushSpans(this.layout);
            if (shaderBrushSpans != null) {
                length2 = shaderBrushSpans.length;
                for (r13 = r11; r13 < length2; r13++) {
                    shaderBrushSpans[r13].m3372setSizeuvyYCjk(Size.m537constructorimpl((((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (((long) Float.floatToRawIntBits(getWidth())) << 32)));
                }
            }
            charSequence = this.charSequence;
            if (!(charSequence instanceof Spanned)) {
                list = instance_delegatelambda0.write;
            } else {
                r1 = (Spanned) charSequence;
                spans = r1.getSpans(r11, charSequence.length(), PlaceholderSpan.class);
                arrayList = new ArrayList(spans.length);
                length = spans.length;
                for (r12 = r11; r12 < length; r12++) {
                    PlaceholderSpan placeholderSpan = (PlaceholderSpan) spans[r12];
                    int spanStart = r1.getSpanStart(placeholderSpan);
                    spanEnd = r1.getSpanEnd(placeholderSpan);
                    lineForOffset = this.layout.getLineForOffset(spanStart);
                    if (lineForOffset >= this.maxLines) {
                        r8 = 1;
                    } else {
                        r8 = r11;
                    }
                    if (this.layout.getLineEllipsisCount(lineForOffset) > 0 || spanEnd <= this.layout.getLineEllipsisOffset(lineForOffset) + this.layout.getLineStart(lineForOffset)) {
                        r9 = r11;
                    } else {
                        r9 = 1;
                    }
                    if (spanEnd > this.layout.getLineEnd(lineForOffset)) {
                        r6 = 1;
                    } else {
                        r6 = r11;
                    }
                    if (r9 != 0 && r6 == 0 && r8 == 0) {
                        ?? r7 = this.layout.getParagraphDirection(lineForOffset) == 1 ? 1 : r11;
                        boolean zIsRtlCharAt = this.layout.isRtlCharAt(spanStart);
                        if (r7 != 0 && !zIsRtlCharAt) {
                            secondaryHorizontal = this.layout.getPrimaryHorizontal(spanStart, r11);
                            widthPx = placeholderSpan.getWidthPx();
                        } else {
                            if (r7 != 0 && zIsRtlCharAt) {
                                primaryHorizontal = this.layout.getSecondaryHorizontal(spanStart, r11);
                                widthPx2 = placeholderSpan.getWidthPx();
                            } else {
                                ?? r10 = this.layout;
                                if (zIsRtlCharAt) {
                                    primaryHorizontal = r10.getPrimaryHorizontal(spanStart, r11);
                                    widthPx2 = placeholderSpan.getWidthPx();
                                } else {
                                    secondaryHorizontal = r10.getSecondaryHorizontal(spanStart, r11);
                                    widthPx = placeholderSpan.getWidthPx();
                                }
                            }
                            f = primaryHorizontal - widthPx2;
                            textLayout = this.layout;
                            switch (placeholderSpan.getVerticalAlign()) {
                                case 0:
                                    lineBaseline = textLayout.getLineBaseline(lineForOffset);
                                    heightPx = placeholderSpan.getHeightPx();
                                    lineTop = lineBaseline - heightPx;
                                    rect = new Rect(f, lineTop, primaryHorizontal, placeholderSpan.getHeightPx() + lineTop);
                                    break;
                                case 1:
                                    lineTop = textLayout.getLineTop(lineForOffset);
                                    rect = new Rect(f, lineTop, primaryHorizontal, placeholderSpan.getHeightPx() + lineTop);
                                    break;
                                case 2:
                                    lineBaseline = textLayout.getLineBottom(lineForOffset);
                                    heightPx = placeholderSpan.getHeightPx();
                                    lineTop = lineBaseline - heightPx;
                                    rect = new Rect(f, lineTop, primaryHorizontal, placeholderSpan.getHeightPx() + lineTop);
                                    break;
                                case 3:
                                    lineTop = ((textLayout.getLineBottom(lineForOffset) + textLayout.getLineTop(lineForOffset)) - placeholderSpan.getHeightPx()) / 2.0f;
                                    rect = new Rect(f, lineTop, primaryHorizontal, placeholderSpan.getHeightPx() + lineTop);
                                    break;
                                case 4:
                                    heightPx2 = placeholderSpan.getFontMetrics().ascent;
                                    lineBaseline2 = textLayout.getLineBaseline(lineForOffset);
                                    lineTop = lineBaseline2 + heightPx2;
                                    rect = new Rect(f, lineTop, primaryHorizontal, placeholderSpan.getHeightPx() + lineTop);
                                    break;
                                case 5:
                                    lineBaseline = textLayout.getLineBaseline(lineForOffset) + placeholderSpan.getFontMetrics().descent;
                                    heightPx = placeholderSpan.getHeightPx();
                                    lineTop = lineBaseline - heightPx;
                                    rect = new Rect(f, lineTop, primaryHorizontal, placeholderSpan.getHeightPx() + lineTop);
                                    break;
                                case 6:
                                    Paint.FontMetricsInt fontMetrics = placeholderSpan.getFontMetrics();
                                    heightPx2 = ((fontMetrics.ascent + fontMetrics.descent) - placeholderSpan.getHeightPx()) / 2;
                                    lineBaseline2 = textLayout.getLineBaseline(lineForOffset);
                                    lineTop = lineBaseline2 + heightPx2;
                                    rect = new Rect(f, lineTop, primaryHorizontal, placeholderSpan.getHeightPx() + lineTop);
                                    break;
                                default:
                                    ScreenStartObserver$$ExternalSyntheticLambda0.write("unexpected verticalAlignment");
                                    throw null;
                            }
                        }
                        float f2 = widthPx + secondaryHorizontal;
                        f = secondaryHorizontal;
                        primaryHorizontal = f2;
                        textLayout = this.layout;
                        switch (placeholderSpan.getVerticalAlign()) {
                            case 0:
                                lineBaseline = textLayout.getLineBaseline(lineForOffset);
                                heightPx = placeholderSpan.getHeightPx();
                                lineTop = lineBaseline - heightPx;
                                rect = new Rect(f, lineTop, primaryHorizontal, placeholderSpan.getHeightPx() + lineTop);
                                break;
                            case 1:
                                lineTop = textLayout.getLineTop(lineForOffset);
                                rect = new Rect(f, lineTop, primaryHorizontal, placeholderSpan.getHeightPx() + lineTop);
                                break;
                            case 2:
                                lineBaseline = textLayout.getLineBottom(lineForOffset);
                                heightPx = placeholderSpan.getHeightPx();
                                lineTop = lineBaseline - heightPx;
                                rect = new Rect(f, lineTop, primaryHorizontal, placeholderSpan.getHeightPx() + lineTop);
                                break;
                            case 3:
                                lineTop = ((textLayout.getLineBottom(lineForOffset) + textLayout.getLineTop(lineForOffset)) - placeholderSpan.getHeightPx()) / 2.0f;
                                rect = new Rect(f, lineTop, primaryHorizontal, placeholderSpan.getHeightPx() + lineTop);
                                break;
                            case 4:
                                heightPx2 = placeholderSpan.getFontMetrics().ascent;
                                lineBaseline2 = textLayout.getLineBaseline(lineForOffset);
                                lineTop = lineBaseline2 + heightPx2;
                                rect = new Rect(f, lineTop, primaryHorizontal, placeholderSpan.getHeightPx() + lineTop);
                                break;
                            case 5:
                                lineBaseline = textLayout.getLineBaseline(lineForOffset) + placeholderSpan.getFontMetrics().descent;
                                heightPx = placeholderSpan.getHeightPx();
                                lineTop = lineBaseline - heightPx;
                                rect = new Rect(f, lineTop, primaryHorizontal, placeholderSpan.getHeightPx() + lineTop);
                                break;
                            case 6:
                                Paint.FontMetricsInt fontMetrics2 = placeholderSpan.getFontMetrics();
                                heightPx2 = ((fontMetrics2.ascent + fontMetrics2.descent) - placeholderSpan.getHeightPx()) / 2;
                                lineBaseline2 = textLayout.getLineBaseline(lineForOffset);
                                lineTop = lineBaseline2 + heightPx2;
                                rect = new Rect(f, lineTop, primaryHorizontal, placeholderSpan.getHeightPx() + lineTop);
                                break;
                            default:
                                ScreenStartObserver$$ExternalSyntheticLambda0.write("unexpected verticalAlignment");
                                throw null;
                        }
                    } else {
                        rect = null;
                    }
                    arrayList.add(rect);
                }
                list = arrayList;
            }
            this.placeholderRects = list;
        }
        truncateAt = truncateAt2;
        textLayoutConstructTextLayout$default = constructTextLayout$default(this, iM2875toLayoutAlignaXe7zB0, zM3507equalsimpl0 ? 1 : 0, truncateAt, i, iM2877toLayoutHyphenationFrequency3fSNIE, iM2876toLayoutBreakStrategyxImikfE, iM2878toLayoutLineBreakStylehpcqdu8, iM2879toLayoutLineBreakWordStylewPN0Rpw, null, Fields.RotationX, null);
        r11 = 0;
        if (Build.VERSION.SDK_INT < 35) {
            int lineEllipsisOffset2 = textLayoutConstructTextLayout$default.getLineEllipsisOffset(0);
            textLayoutConstructTextLayout$default = constructTextLayout(iM2875toLayoutAlignaXe7zB0, zM3507equalsimpl0 ? 1 : 0, truncateAt, i, iM2877toLayoutHyphenationFrequency3fSNIE, iM2876toLayoutBreakStrategyxImikfE, iM2878toLayoutLineBreakStylehpcqdu8, iM2879toLayoutLineBreakWordStylewPN0Rpw, TextUtils.concat(charSequence2.subSequence(0, lineEllipsisOffset2), "…", charSequence2.subSequence(textLayoutConstructTextLayout$default.getLineEllipsisCount(0) + lineEllipsisOffset2, charSequence2.length())));
        }
        if (!TextOverflow.m3559equalsimpl0(i2, companion.m3569getEllipsisgIe3tQ8())) {
            r11 = 0;
            this.layout = textLayoutConstructTextLayout$default;
        } else {
            r11 = 0;
            this.layout = textLayoutConstructTextLayout$default;
        }
        getTextPaint$ui_text().m3348setBrush12SF9DM(style.getBrush(), Size.m537constructorimpl((((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (((long) Float.floatToRawIntBits(getWidth())) << 32)), style.getAlpha());
        shaderBrushSpans = getShaderBrushSpans(this.layout);
        if (shaderBrushSpans != null) {
            length2 = shaderBrushSpans.length;
            while (r13 < length2) {
                shaderBrushSpans[r13].m3372setSizeuvyYCjk(Size.m537constructorimpl((((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (((long) Float.floatToRawIntBits(getWidth())) << 32)));
            }
        }
        charSequence = this.charSequence;
        if (!(charSequence instanceof Spanned)) {
            list = instance_delegatelambda0.write;
        } else {
            r1 = (Spanned) charSequence;
            spans = r1.getSpans(r11, charSequence.length(), PlaceholderSpan.class);
            arrayList = new ArrayList(spans.length);
            length = spans.length;
            while (r12 < length) {
                PlaceholderSpan placeholderSpan2 = (PlaceholderSpan) spans[r12];
                int spanStart2 = r1.getSpanStart(placeholderSpan2);
                spanEnd = r1.getSpanEnd(placeholderSpan2);
                lineForOffset = this.layout.getLineForOffset(spanStart2);
                if (lineForOffset >= this.maxLines) {
                    r8 = 1;
                } else {
                    r8 = r11;
                }
                if (this.layout.getLineEllipsisCount(lineForOffset) > 0) {
                    r9 = r11;
                } else {
                    r9 = r11;
                }
                if (spanEnd > this.layout.getLineEnd(lineForOffset)) {
                    r6 = 1;
                } else {
                    r6 = r11;
                }
                if (r9 != 0) {
                    rect = null;
                } else {
                    rect = null;
                }
                arrayList.add(rect);
            }
            list = arrayList;
        }
        this.placeholderRects = list;
    }

    public static /* synthetic */ TextLayout constructTextLayout$default(AndroidParagraph androidParagraph, int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence, int i8, Object obj) {
        return androidParagraph.constructTextLayout(i, i2, truncateAt, i3, i4, i5, i6, i7, (i8 & Fields.RotationX) != 0 ? androidParagraph.charSequence : charSequence);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLastBaseline() {
        return getLineBaseline(getLineCount() - 1);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getHorizontalPosition(int i, boolean z) {
        TextLayout textLayout = this.layout;
        return z ? TextLayout.getPrimaryHorizontal$default(textLayout, i, false, 2, null) : TextLayout.getSecondaryHorizontal$default(textLayout, i, false, 2, null);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public int mo2862getOffsetForPositionk4lQ0M(long j) {
        int lineForVerticalUnbounded = this.layout.getLineForVerticalUnbounded((int) Float.intBitsToFloat((int) (4294967295L & j)));
        int lineCount = getLineCount();
        TextLayout textLayout = this.layout;
        return lineForVerticalUnbounded >= lineCount ? textLayout.getText().length() : textLayout.getOffsetForHorizontal(lineForVerticalUnbounded, Float.intBitsToFloat((int) (j >> 32)));
    }

    public /* synthetic */ AndroidParagraph(String str, TextStyle textStyle, List list, List list2, int i, int i2, long j, FontFamily.Resolver resolver, Density density, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, list, list2, i, i2, j, resolver, density);
    }

    public /* synthetic */ AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i, int i2, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(androidParagraphIntrinsics, i, i2, j);
    }

    private AndroidParagraph(String str, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, List<AnnotatedString.Range<Placeholder>> list2, int i, int i2, long j, FontFamily.Resolver resolver, Density density) {
        this(new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density), i, i2, j, null);
    }
}
