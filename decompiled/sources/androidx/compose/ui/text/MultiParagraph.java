package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.platform.AndroidMultiParagraphDraw_androidKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.sqlite.SQLite;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.bringIntoView;
import o.cancelPendingWebViewPauselambda0;
import o.createBrazeUserChangeEventSubscriberlambda01;
import o.createFromParcel;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import o.onItemDismisslambda0;

/* JADX INFO: loaded from: classes.dex */
public final class MultiParagraph {
    public static final int $stable = 8;
    private final boolean didExceedMaxLines;
    private final float height;
    private final MultiParagraphIntrinsics intrinsics;
    private final int lineCount;
    private final int maxLines;
    private final List<ParagraphInfo> paragraphInfoList;
    private final List<Rect> placeholderRects;
    private final float width;

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final float getHeight() {
        return this.height;
    }

    public final MultiParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final List<ParagraphInfo> getParagraphInfoList$ui_text() {
        return this.paragraphInfoList;
    }

    public final List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    public final float getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: paint-hn5TExg, reason: not valid java name */
    public final void m2915painthn5TExg(Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i) {
        AndroidMultiParagraphDraw_androidKt.m3336drawMultiParagraph7AXcY_I(this, canvas, brush, f, shadow, textDecoration, drawStyle, i);
    }

    private MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, int i2) {
        boolean z;
        int iM3625getMaxHeightimpl;
        int i3;
        Paragraph paragraphM2933ParagraphczeNHc;
        float height;
        int lineCount;
        this.intrinsics = multiParagraphIntrinsics;
        this.maxLines = i;
        if (Constraints.m3628getMinWidthimpl(j) != 0 || Constraints.m3627getMinHeightimpl(j) != 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        List<ParagraphIntrinsicInfo> infoList$ui_text = multiParagraphIntrinsics.getInfoList$ui_text();
        int size = infoList$ui_text.size();
        float f = 0.0f;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 >= size) {
                z = false;
                break;
            }
            ParagraphIntrinsicInfo paragraphIntrinsicInfo = infoList$ui_text.get(i4);
            ParagraphIntrinsics intrinsics = paragraphIntrinsicInfo.getIntrinsics();
            int iM3626getMaxWidthimpl = Constraints.m3626getMaxWidthimpl(j);
            if (Constraints.m3621getHasBoundedHeightimpl(j)) {
                iM3625getMaxHeightimpl = Constraints.m3625getMaxHeightimpl(j) - ParagraphKt.ceilToInt(f);
                i3 = iM3625getMaxHeightimpl < 0 ? 0 : i3;
                paragraphM2933ParagraphczeNHc = ParagraphKt.m2933ParagraphczeNHc(intrinsics, ConstraintsKt.Constraints$default(0, iM3626getMaxWidthimpl, 0, i3, 5, null), this.maxLines - i5, i2);
                height = paragraphM2933ParagraphczeNHc.getHeight() + f;
                lineCount = paragraphM2933ParagraphczeNHc.getLineCount() + i5;
                List<ParagraphIntrinsicInfo> list = infoList$ui_text;
                arrayList.add(new ParagraphInfo(paragraphM2933ParagraphczeNHc, paragraphIntrinsicInfo.getStartIndex(), paragraphIntrinsicInfo.getEndIndex(), i5, lineCount, f, height));
                if (!paragraphM2933ParagraphczeNHc.getDidExceedMaxLines() || (lineCount == this.maxLines && i4 != SQLite.write((List) this.intrinsics.getInfoList$ui_text()))) {
                    z = true;
                    i5 = lineCount;
                    f = height;
                    break;
                } else {
                    i4++;
                    i5 = lineCount;
                    f = height;
                    infoList$ui_text = list;
                }
            } else {
                iM3625getMaxHeightimpl = Constraints.m3625getMaxHeightimpl(j);
            }
            i3 = iM3625getMaxHeightimpl;
            paragraphM2933ParagraphczeNHc = ParagraphKt.m2933ParagraphczeNHc(intrinsics, ConstraintsKt.Constraints$default(0, iM3626getMaxWidthimpl, 0, i3, 5, null), this.maxLines - i5, i2);
            height = paragraphM2933ParagraphczeNHc.getHeight() + f;
            lineCount = paragraphM2933ParagraphczeNHc.getLineCount() + i5;
            List<ParagraphIntrinsicInfo> list2 = infoList$ui_text;
            arrayList.add(new ParagraphInfo(paragraphM2933ParagraphczeNHc, paragraphIntrinsicInfo.getStartIndex(), paragraphIntrinsicInfo.getEndIndex(), i5, lineCount, f, height));
            if (paragraphM2933ParagraphczeNHc.getDidExceedMaxLines()) {
            }
            z = true;
            i5 = lineCount;
            f = height;
            break;
        }
        this.height = f;
        this.lineCount = i5;
        this.didExceedMaxLines = z;
        this.paragraphInfoList = arrayList;
        this.width = Constraints.m3626getMaxWidthimpl(j);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i6 = 0; i6 < size2; i6++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i6);
            List<Rect> placeholderRects = paragraphInfo.getParagraph().getPlaceholderRects();
            ArrayList arrayList3 = new ArrayList(placeholderRects.size());
            int size3 = placeholderRects.size();
            for (int i7 = 0; i7 < size3; i7++) {
                Rect rect = placeholderRects.get(i7);
                arrayList3.add(rect != null ? paragraphInfo.toGlobal(rect) : null);
            }
            onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) arrayList3, (Collection) arrayList2);
        }
        if (arrayList2.size() < this.intrinsics.getPlaceholders().size()) {
            int size4 = this.intrinsics.getPlaceholders().size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            for (int i8 = 0; i8 < size4; i8++) {
                arrayList4.add(null);
            }
            arrayList2 = onContentCardDismissed.IconCompatParcelizer(arrayList4, arrayList2);
        }
        this.placeholderRects = arrayList2;
    }

    private final AnnotatedString getAnnotatedString() {
        return this.intrinsics.getAnnotatedString();
    }

    public final float getFirstBaseline() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        return this.paragraphInfoList.get(0).getParagraph().getFirstBaseline();
    }

    public final float getLastBaseline() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) onContentCardDismissed.MediaDescriptionCompat((List) this.paragraphInfoList);
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLastBaseline());
    }

    public final int getLineForVerticalPosition(float f) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByY(this.paragraphInfoList, f));
        return paragraphInfo.getLength() == 0 ? paragraphInfo.getStartLineIndex() : paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForVerticalPosition(paragraphInfo.toLocalYPosition(f)));
    }

    public final float getMaxIntrinsicWidth() {
        return this.intrinsics.getMaxIntrinsicWidth();
    }

    public final float getMinIntrinsicWidth() {
        return this.intrinsics.getMinIntrinsicWidth();
    }

    /* JADX INFO: renamed from: getRangeForRect-8-6BmAI, reason: not valid java name */
    public final long m2911getRangeForRect86BmAI(Rect rect, int i, TextInclusionStrategy textInclusionStrategy) {
        TextRange.Companion companion;
        TextRange.Companion companion2;
        int iFindParagraphByY = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, rect.getTop());
        if (this.paragraphInfoList.get(iFindParagraphByY).getBottom() >= rect.getBottom() || iFindParagraphByY == SQLite.write((List) this.paragraphInfoList)) {
            ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iFindParagraphByY);
            return ParagraphInfo.m2924toGlobalxdX6G0$default(paragraphInfo, paragraphInfo.getParagraph().mo2864getRangeForRect86BmAI(paragraphInfo.toLocal(rect), i, textInclusionStrategy), false, 1, null);
        }
        int iFindParagraphByY2 = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, rect.getBottom());
        long jM3081getZerod9O1mEE = TextRange.Companion.m3081getZerod9O1mEE();
        while (true) {
            companion = TextRange.Companion;
            if (!TextRange.m3069equalsimpl0(jM3081getZerod9O1mEE, companion.m3081getZerod9O1mEE()) || iFindParagraphByY > iFindParagraphByY2) {
                break;
            }
            ParagraphInfo paragraphInfo2 = this.paragraphInfoList.get(iFindParagraphByY);
            jM3081getZerod9O1mEE = ParagraphInfo.m2924toGlobalxdX6G0$default(paragraphInfo2, paragraphInfo2.getParagraph().mo2864getRangeForRect86BmAI(paragraphInfo2.toLocal(rect), i, textInclusionStrategy), false, 1, null);
            iFindParagraphByY++;
        }
        if (TextRange.m3069equalsimpl0(jM3081getZerod9O1mEE, companion.m3081getZerod9O1mEE())) {
            return companion.m3081getZerod9O1mEE();
        }
        long jM3081getZerod9O1mEE2 = companion.m3081getZerod9O1mEE();
        while (true) {
            companion2 = TextRange.Companion;
            if (!TextRange.m3069equalsimpl0(jM3081getZerod9O1mEE2, companion2.m3081getZerod9O1mEE()) || iFindParagraphByY > iFindParagraphByY2) {
                break;
            }
            ParagraphInfo paragraphInfo3 = this.paragraphInfoList.get(iFindParagraphByY2);
            jM3081getZerod9O1mEE2 = ParagraphInfo.m2924toGlobalxdX6G0$default(paragraphInfo3, paragraphInfo3.getParagraph().mo2864getRangeForRect86BmAI(paragraphInfo3.toLocal(rect), i, textInclusionStrategy), false, 1, null);
            iFindParagraphByY2--;
        }
        return TextRange.m3069equalsimpl0(jM3081getZerod9O1mEE2, companion2.m3081getZerod9O1mEE()) ? jM3081getZerod9O1mEE : TextRangeKt.TextRange(TextRange.m3076getStartimpl(jM3081getZerod9O1mEE), TextRange.m3071getEndimpl(jM3081getZerod9O1mEE2));
    }

    private final void requireIndexInRange(int i) {
        if (i < 0 || i >= getAnnotatedString().getText().length()) {
            StringBuilder sbM = ff$$ExternalSyntheticOutline0.m(i, "offset(", ") is out of bounds [0, ");
            sbM.append(getAnnotatedString().length());
            sbM.append(')');
            InlineClassHelperKt.throwIllegalArgumentException(sbM.toString());
        }
    }

    private final void requireIndexInRangeInclusiveEnd(int i) {
        if (i < 0 || i > getAnnotatedString().getText().length()) {
            StringBuilder sbM = ff$$ExternalSyntheticOutline0.m(i, "offset(", ") is out of bounds [0, ");
            sbM.append(getAnnotatedString().length());
            sbM.append(']');
            InlineClassHelperKt.throwIllegalArgumentException(sbM.toString());
        }
    }

    private final void requireLineIndexInRange(int i) {
        if (i < 0 || i >= this.lineCount) {
            StringBuilder sbM = ff$$ExternalSyntheticOutline0.m(i, "lineIndex(", ") is out of bounds [0, ");
            sbM.append(this.lineCount);
            sbM.append(')');
            InlineClassHelperKt.throwIllegalArgumentException(sbM.toString());
        }
    }

    public final ResolvedTextDirection getBidiRunDirection(int i) {
        requireIndexInRangeInclusiveEnd(i);
        int length = getAnnotatedString().length();
        List<ParagraphInfo> list = this.paragraphInfoList;
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i == length ? SQLite.write((List) list) : MultiParagraphKt.findParagraphByIndex(list, i));
        return paragraphInfo.getParagraph().getBidiRunDirection(paragraphInfo.toLocalIndex(i));
    }

    public final Rect getBoundingBox(int i) {
        requireIndexInRange(i);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i));
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getBoundingBox(paragraphInfo.toLocalIndex(i)));
    }

    public final Rect getCursorRect(int i) {
        requireIndexInRangeInclusiveEnd(i);
        int length = getAnnotatedString().length();
        List<ParagraphInfo> list = this.paragraphInfoList;
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i == length ? SQLite.write((List) list) : MultiParagraphKt.findParagraphByIndex(list, i));
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getCursorRect(paragraphInfo.toLocalIndex(i)));
    }

    public final float getHorizontalPosition(int i, boolean z) {
        requireIndexInRangeInclusiveEnd(i);
        int length = getAnnotatedString().length();
        List<ParagraphInfo> list = this.paragraphInfoList;
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i == length ? SQLite.write((List) list) : MultiParagraphKt.findParagraphByIndex(list, i));
        return paragraphInfo.getParagraph().getHorizontalPosition(paragraphInfo.toLocalIndex(i), z);
    }

    public final float getLineBaseline(int i) {
        requireLineIndexInRange(i);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineBaseline(paragraphInfo.toLocalLineIndex(i)));
    }

    public final float getLineBottom(int i) {
        requireLineIndexInRange(i);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineBottom(paragraphInfo.toLocalLineIndex(i)));
    }

    public final int getLineEnd(int i, boolean z) {
        requireLineIndexInRange(i);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineEnd(paragraphInfo.toLocalLineIndex(i), z));
    }

    public final float getLineHeight(int i) {
        requireLineIndexInRange(i);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i));
        return paragraphInfo.getParagraph().getLineHeight(paragraphInfo.toLocalLineIndex(i));
    }

    public final float getLineLeft(int i) {
        requireLineIndexInRange(i);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i));
        return paragraphInfo.getParagraph().getLineLeft(paragraphInfo.toLocalLineIndex(i));
    }

    public final float getLineRight(int i) {
        requireLineIndexInRange(i);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i));
        return paragraphInfo.getParagraph().getLineRight(paragraphInfo.toLocalLineIndex(i));
    }

    public final int getLineStart(int i) {
        requireLineIndexInRange(i);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineStart(paragraphInfo.toLocalLineIndex(i)));
    }

    public final float getLineTop(int i) {
        requireLineIndexInRange(i);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineTop(paragraphInfo.toLocalLineIndex(i)));
    }

    public final float getLineWidth(int i) {
        requireLineIndexInRange(i);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i));
        return paragraphInfo.getParagraph().getLineWidth(paragraphInfo.toLocalLineIndex(i));
    }

    public final ResolvedTextDirection getParagraphDirection(int i) {
        requireIndexInRangeInclusiveEnd(i);
        int length = getAnnotatedString().length();
        List<ParagraphInfo> list = this.paragraphInfoList;
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i == length ? SQLite.write((List) list) : MultiParagraphKt.findParagraphByIndex(list, i));
        return paragraphInfo.getParagraph().getParagraphDirection(paragraphInfo.toLocalIndex(i));
    }

    /* JADX INFO: renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public final long m2912getWordBoundaryjx7JFs(int i) {
        requireIndexInRangeInclusiveEnd(i);
        int length = getAnnotatedString().length();
        List<ParagraphInfo> list = this.paragraphInfoList;
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i == length ? SQLite.write((List) list) : MultiParagraphKt.findParagraphByIndex(list, i));
        return paragraphInfo.m2925toGlobalxdX6G0(paragraphInfo.getParagraph().mo2865getWordBoundaryjx7JFs(paragraphInfo.toLocalIndex(i)), false);
    }

    public final boolean isLineEllipsized(int i) {
        requireLineIndexInRange(i);
        return this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i)).getParagraph().isLineEllipsized(i);
    }

    /* JADX INFO: renamed from: paint-LG529CI, reason: not valid java name */
    public final void m2913paintLG529CI(Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i) {
        canvas.save();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ParagraphInfo paragraphInfo = list.get(i2);
            paragraphInfo.getParagraph().mo2866paintLG529CI(canvas, j, shadow, textDecoration, drawStyle, i);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.restore();
    }

    @onItemDismisslambda0
    /* JADX INFO: renamed from: paint-RPmYEkk, reason: not valid java name */
    public final /* synthetic */ void m2914paintRPmYEkk(Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration) {
        canvas.save();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ParagraphInfo paragraphInfo = list.get(i);
            Paragraph.m2918paintLG529CI$default(paragraphInfo.getParagraph(), canvas, j, shadow, textDecoration, null, 0, 48, null);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel fillBoundingBoxes_8ffj60Q$lambda$0(long j, float[] fArr, createBrazeUserChangeEventSubscriberlambda01 createbrazeuserchangeeventsubscriberlambda01, cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda0, ParagraphInfo paragraphInfo) {
        long jTextRange = TextRangeKt.TextRange(paragraphInfo.toLocalIndex(paragraphInfo.getStartIndex() > TextRange.m3074getMinimpl(j) ? paragraphInfo.getStartIndex() : TextRange.m3074getMinimpl(j)), paragraphInfo.toLocalIndex(paragraphInfo.getEndIndex() < TextRange.m3073getMaximpl(j) ? paragraphInfo.getEndIndex() : TextRange.m3073getMaximpl(j)));
        paragraphInfo.getParagraph().mo2860fillBoundingBoxes8ffj60Q(jTextRange, fArr, createbrazeuserchangeeventsubscriberlambda01.read);
        int iM3072getLengthimpl = (TextRange.m3072getLengthimpl(jTextRange) * 4) + createbrazeuserchangeeventsubscriberlambda01.read;
        for (int i = createbrazeuserchangeeventsubscriberlambda01.read; i < iM3072getLengthimpl; i += 4) {
            int i2 = i + 1;
            float f = fArr[i2];
            float f2 = cancelpendingwebviewpauselambda0.write;
            fArr[i2] = f + f2;
            int i3 = i + 3;
            fArr[i3] = fArr[i3] + f2;
        }
        createbrazeuserchangeeventsubscriberlambda01.read = iM3072getLengthimpl;
        cancelpendingwebviewpauselambda0.write = paragraphInfo.getParagraph().getHeight() + cancelpendingwebviewpauselambda0.write;
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel getPathForRange$lambda$1(Path path, int i, int i2, ParagraphInfo paragraphInfo) {
        Path.m1009addPathUv8p0NA$default(path, paragraphInfo.toGlobal(paragraphInfo.getParagraph().getPathForRange(paragraphInfo.toLocalIndex(i), paragraphInfo.toLocalIndex(i2))), 0L, 2, null);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: renamed from: paint-RPmYEkk$default, reason: not valid java name */
    public static /* synthetic */ void m2907paintRPmYEkk$default(MultiParagraph multiParagraph, Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration, int i, Object obj) {
        if ((i & 2) != 0) {
            j = Color.Companion.m758getUnspecified0d7_KjU();
        }
        multiParagraph.m2914paintRPmYEkk(canvas, j, (i & 4) != 0 ? null : shadow, (i & 8) != 0 ? null : textDecoration);
    }

    /* JADX INFO: renamed from: fillBoundingBoxes-8ffj60Q, reason: not valid java name */
    public final float[] m2909fillBoundingBoxes8ffj60Q(long j, float[] fArr, int i) {
        requireIndexInRange(TextRange.m3074getMinimpl(j));
        requireIndexInRangeInclusiveEnd(TextRange.m3073getMaximpl(j));
        createBrazeUserChangeEventSubscriberlambda01 createbrazeuserchangeeventsubscriberlambda01 = new createBrazeUserChangeEventSubscriberlambda01();
        createbrazeuserchangeeventsubscriberlambda01.read = i;
        MultiParagraphKt.m2917findParagraphsByRangeSbBc2M(this.paragraphInfoList, j, new MultiParagraph$$ExternalSyntheticLambda0(j, fArr, createbrazeuserchangeeventsubscriberlambda01, new cancelPendingWebViewPauselambda0()));
        return fArr;
    }

    public final int getLineForOffset(int i) {
        int iFindParagraphByIndex;
        if (i >= getAnnotatedString().length()) {
            iFindParagraphByIndex = SQLite.write((List) this.paragraphInfoList);
        } else {
            iFindParagraphByIndex = i < 0 ? 0 : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iFindParagraphByIndex);
        return paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForOffset(paragraphInfo.toLocalIndex(i)));
    }

    public final Path getPathForRange(int i, int i2) {
        if (i < 0 || i > i2 || i2 > getAnnotatedString().getText().length()) {
            StringBuilder sbM = m1$$ExternalSyntheticOutline0.m(i, i2, "Start(", ") or End(", ") is out of range [0..");
            sbM.append(getAnnotatedString().getText().length());
            sbM.append("), or start > end!");
            InlineClassHelperKt.throwIllegalArgumentException(sbM.toString());
        }
        if (i == i2) {
            return AndroidPath_androidKt.Path();
        }
        Path Path = AndroidPath_androidKt.Path();
        MultiParagraphKt.m2917findParagraphsByRangeSbBc2M(this.paragraphInfoList, TextRangeKt.TextRange(i, i2), new bringIntoView(i, i2, 1, Path));
        return Path;
    }

    public static /* synthetic */ int getLineEnd$default(MultiParagraph multiParagraph, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return multiParagraph.getLineEnd(i, z);
    }

    /* JADX INFO: renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public final int m2910getOffsetForPositionk4lQ0M(long j) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByY(this.paragraphInfoList, Float.intBitsToFloat((int) (4294967295L & j))));
        return paragraphInfo.getLength() == 0 ? paragraphInfo.getStartIndex() : paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().mo2862getOffsetForPositionk4lQ0M(paragraphInfo.m2926toLocalMKHz9U(j)));
    }

    @onItemDismisslambda0
    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List list, int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, j, density, resolver, (List<AnnotatedString.Range<Placeholder>>) list, i, z);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j, i, i2);
    }

    @onItemDismisslambda0
    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j, i, z);
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, j, density, resolver, (List<AnnotatedString.Range<Placeholder>>) list, i, i2);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j, (i3 & 4) != 0 ? Integer.MAX_VALUE : i, (i3 & 8) != 0 ? TextOverflow.Companion.m3568getClipgIe3tQ8() : i2, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j, (i2 & 4) != 0 ? Integer.MAX_VALUE : i, (i2 & 8) != 0 ? false : z, (DefaultConstructorMarker) null);
    }

    private MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, boolean z) {
        this(multiParagraphIntrinsics, j, i, z ? TextOverflow.Companion.m3569getEllipsisgIe3tQ8() : TextOverflow.Companion.m3568getClipgIe3tQ8(), (DefaultConstructorMarker) null);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, int i, boolean z, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, (i2 & 2) != 0 ? Integer.MAX_VALUE : i, (i2 & 4) != 0 ? false : z, f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @onItemDismisslambda0
    public MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, int i, boolean z, float f) {
        long jConstraints$default = ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f), 0, 0, 13, null);
        TextOverflow.Companion companion = TextOverflow.Companion;
        this(multiParagraphIntrinsics, jConstraints$default, i, z ? companion.m3569getEllipsisgIe3tQ8() : companion.m3568getClipgIe3tQ8(), (DefaultConstructorMarker) null);
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, List list, int i, boolean z, float f, Density density, Font.ResourceLoader resourceLoader, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, (List<AnnotatedString.Range<Placeholder>>) ((i2 & 4) != 0 ? instance_delegatelambda0.write : list), (i2 & 8) != 0 ? Integer.MAX_VALUE : i, (i2 & 16) != 0 ? false : z, f, density, resourceLoader);
    }

    @onItemDismisslambda0
    public MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i, boolean z, float f, Density density, Font.ResourceLoader resourceLoader) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader));
        TextOverflow.Companion companion = TextOverflow.Companion;
        this(multiParagraphIntrinsics, ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f), 0, 0, 13, null), i, z ? companion.m3569getEllipsisgIe3tQ8() : companion.m3568getClipgIe3tQ8(), (DefaultConstructorMarker) null);
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, float f, Density density, FontFamily.Resolver resolver, List list, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, f, density, resolver, (List<AnnotatedString.Range<Placeholder>>) ((i2 & 32) != 0 ? instance_delegatelambda0.write : list), (i2 & 64) != 0 ? Integer.MAX_VALUE : i, (i2 & Fields.SpotShadowColor) != 0 ? false : z);
    }

    @onItemDismisslambda0
    public MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, float f, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, int i, boolean z) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver);
        TextOverflow.Companion companion = TextOverflow.Companion;
        this(multiParagraphIntrinsics, ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f), 0, 0, 13, null), i, z ? companion.m3569getEllipsisgIe3tQ8() : companion.m3568getClipgIe3tQ8(), (DefaultConstructorMarker) null);
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List list, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, j, density, resolver, (i2 & 32) != 0 ? instance_delegatelambda0.write : list, (i2 & 64) != 0 ? Integer.MAX_VALUE : i, (i2 & Fields.SpotShadowColor) != 0 ? false : z, (DefaultConstructorMarker) null);
    }

    private MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, int i, boolean z) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver);
        TextOverflow.Companion companion = TextOverflow.Companion;
        this(multiParagraphIntrinsics, j, i, z ? companion.m3569getEllipsisgIe3tQ8() : companion.m3568getClipgIe3tQ8(), (DefaultConstructorMarker) null);
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List list, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, j, density, resolver, (i3 & 32) != 0 ? instance_delegatelambda0.write : list, (i3 & 64) != 0 ? Integer.MAX_VALUE : i, (i3 & Fields.SpotShadowColor) != 0 ? TextOverflow.Companion.m3568getClipgIe3tQ8() : i2, (DefaultConstructorMarker) null);
    }

    private MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, int i, int i2) {
        this(new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver), j, i, i2, (DefaultConstructorMarker) null);
    }
}
