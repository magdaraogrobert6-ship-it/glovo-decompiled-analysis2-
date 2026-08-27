package androidx.compose.ui.text.input;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.ranges.RangesKt;
import o.onItemDismisslambda0;

/* JADX INFO: loaded from: classes.dex */
public final class CursorAnchorInfoBuilder_androidKt {
    @onItemDismisslambda0
    public static final CursorAnchorInfo build(CursorAnchorInfo.Builder builder, TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Matrix matrix, Rect rect, Rect rect2, boolean z, boolean z2, boolean z3, boolean z4) {
        builder.reset();
        builder.setMatrix(matrix);
        int iM3074getMinimpl = TextRange.m3074getMinimpl(textFieldValue.m3330getSelectiond9O1mEE());
        builder.setSelectionRange(iM3074getMinimpl, TextRange.m3073getMaximpl(textFieldValue.m3330getSelectiond9O1mEE()));
        if (z) {
            setInsertionMarker(builder, iM3074getMinimpl, offsetMapping, textLayoutResult, rect);
        }
        if (z2) {
            TextRange textRangeM3329getCompositionMzsxiRA = textFieldValue.m3329getCompositionMzsxiRA();
            int iM3074getMinimpl2 = textRangeM3329getCompositionMzsxiRA != null ? TextRange.m3074getMinimpl(textRangeM3329getCompositionMzsxiRA.m3080unboximpl()) : -1;
            TextRange textRangeM3329getCompositionMzsxiRA2 = textFieldValue.m3329getCompositionMzsxiRA();
            int iM3073getMaximpl = textRangeM3329getCompositionMzsxiRA2 != null ? TextRange.m3073getMaximpl(textRangeM3329getCompositionMzsxiRA2.m3080unboximpl()) : -1;
            if (iM3074getMinimpl2 >= 0 && iM3074getMinimpl2 < iM3073getMaximpl) {
                builder.setComposingText(iM3074getMinimpl2, textFieldValue.getText().subSequence(iM3074getMinimpl2, iM3073getMaximpl));
                addCharacterBounds(builder, iM3074getMinimpl2, iM3073getMaximpl, offsetMapping, textLayoutResult, rect);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 && z3) {
            CursorAnchorInfoApi33Helper.setEditorBoundsInfo(builder, rect2);
        }
        if (i >= 34 && z4) {
            CursorAnchorInfoApi34Helper.addVisibleLineBounds(builder, textLayoutResult, rect);
        }
        return builder.build();
    }

    private static final CursorAnchorInfo.Builder setInsertionMarker(CursorAnchorInfo.Builder builder, int i, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Rect rect) {
        if (i < 0) {
            return builder;
        }
        int iOriginalToTransformed = offsetMapping.originalToTransformed(i);
        Rect cursorRect = textLayoutResult.getCursorRect(iOriginalToTransformed);
        float fWrite = RangesKt.write(cursorRect.getLeft(), 0.0f, (int) (textLayoutResult.m3047getSizeYbymL2g() >> 32));
        boolean zContainsInclusive = containsInclusive(rect, fWrite, cursorRect.getTop());
        boolean zContainsInclusive2 = containsInclusive(rect, fWrite, cursorRect.getBottom());
        int i2 = 1;
        boolean z = textLayoutResult.getBidiRunDirection(iOriginalToTransformed) == ResolvedTextDirection.Rtl;
        if (!zContainsInclusive && !zContainsInclusive2) {
            i2 = 0;
        }
        if (!zContainsInclusive || !zContainsInclusive2) {
            i2 |= 2;
        }
        builder.setInsertionMarkerLocation(fWrite, cursorRect.getTop(), cursorRect.getBottom(), cursorRect.getBottom(), z ? i2 | 4 : i2);
        return builder;
    }

    private static final boolean containsInclusive(Rect rect, float f, float f2) {
        float left = rect.getLeft();
        if (f > rect.getRight() || left > f) {
            return false;
        }
        return f2 <= rect.getBottom() && rect.getTop() <= f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [int] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r17v0, types: [android.view.inputmethod.CursorAnchorInfo$Builder] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    private static final CursorAnchorInfo.Builder addCharacterBounds(CursorAnchorInfo.Builder builder, int i, int i2, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Rect rect) {
        ?? r7;
        int i3 = i;
        int iOriginalToTransformed = offsetMapping.originalToTransformed(i3);
        int iOriginalToTransformed2 = offsetMapping.originalToTransformed(i2);
        float[] fArr = new float[(iOriginalToTransformed2 - iOriginalToTransformed) * 4];
        textLayoutResult.getMultiParagraph().m2909fillBoundingBoxes8ffj60Q(TextRangeKt.TextRange(iOriginalToTransformed, iOriginalToTransformed2), fArr, 0);
        while (i3 < i2) {
            int iOriginalToTransformed3 = offsetMapping.originalToTransformed(i3);
            int i4 = (iOriginalToTransformed3 - iOriginalToTransformed) * 4;
            Rect rect2 = new Rect(fArr[i4], fArr[i4 + 1], fArr[i4 + 2], fArr[i4 + 3]);
            boolean zOverlaps = rect.overlaps(rect2);
            if (!containsInclusive(rect, rect2.getLeft(), rect2.getTop()) || !containsInclusive(rect, rect2.getRight(), rect2.getBottom())) {
                r7 = zOverlaps;
                r7 = (zOverlaps ? 1 : 0) | 2;
            }
            r7 = zOverlaps;
            builder.addCharacterBounds(i3, rect2.getLeft(), rect2.getTop(), rect2.getRight(), rect2.getBottom(), textLayoutResult.getBidiRunDirection(iOriginalToTransformed3) == ResolvedTextDirection.Rtl ? r7 | 4 : r7);
            i3++;
        }
        return builder;
    }
}
