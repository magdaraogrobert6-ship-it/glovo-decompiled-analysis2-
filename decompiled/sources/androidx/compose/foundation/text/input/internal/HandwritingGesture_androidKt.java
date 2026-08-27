package androidx.compose.foundation.text.input.internal;

import android.graphics.PointF;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextInclusionStrategy;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class HandwritingGesture_androidKt {
    public static final boolean IconCompatParcelizer(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    public static final boolean RemoteActionCompatParcelizer(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final long access$toOffset(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: getLineForHandwritingGesture-d-4ec7I, reason: not valid java name */
    public static final int m103getLineForHandwritingGestured4ec7I(MultiParagraph multiParagraph, long j, ViewConfiguration viewConfiguration) {
        float handwritingGestureLineMargin = viewConfiguration != null ? viewConfiguration.getHandwritingGestureLineMargin() : 0.0f;
        int i = (int) (4294967295L & j);
        int lineForVerticalPosition = multiParagraph.getLineForVerticalPosition(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) < multiParagraph.getLineTop(lineForVerticalPosition) - handwritingGestureLineMargin || Float.intBitsToFloat(i) > multiParagraph.getLineBottom(lineForVerticalPosition) + handwritingGestureLineMargin) {
            return -1;
        }
        int i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) < (-handwritingGestureLineMargin) || Float.intBitsToFloat(i2) > multiParagraph.getWidth() + handwritingGestureLineMargin) {
            return -1;
        }
        return lineForVerticalPosition;
    }

    public static final long write(LegacyTextFieldState legacyTextFieldState, Rect rect, Rect rect2, int i, TextInclusionStrategy textInclusionStrategy) {
        long jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(legacyTextFieldState, rect, i, textInclusionStrategy);
        if (TextRange.m3070getCollapsedimpl(jRemoteActionCompatParcelizer)) {
            return TextRange.Companion.m3081getZerod9O1mEE();
        }
        long jRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(legacyTextFieldState, rect2, i, textInclusionStrategy);
        return TextRange.m3070getCollapsedimpl(jRemoteActionCompatParcelizer2) ? TextRange.Companion.m3081getZerod9O1mEE() : TextRangeKt.TextRange(Math.min(TextRange.m3076getStartimpl(jRemoteActionCompatParcelizer), TextRange.m3076getStartimpl(jRemoteActionCompatParcelizer)), Math.max(TextRange.m3071getEndimpl(jRemoteActionCompatParcelizer2), TextRange.m3071getEndimpl(jRemoteActionCompatParcelizer2)));
    }

    public static final boolean write(TextLayoutResult textLayoutResult, int i) {
        int lineForOffset = textLayoutResult.getLineForOffset(i);
        return i == textLayoutResult.getLineStart(lineForOffset) || i == TextLayoutResult.getLineEnd$default(textLayoutResult, lineForOffset, false, 2, null) ? textLayoutResult.getParagraphDirection(i) != textLayoutResult.getBidiRunDirection(i) : textLayoutResult.getBidiRunDirection(i) != textLayoutResult.getBidiRunDirection(i - 1);
    }

    public static final long RemoteActionCompatParcelizer(LegacyTextFieldState legacyTextFieldState, Rect rect, int i, TextInclusionStrategy textInclusionStrategy) {
        TextLayoutResultProxy textLayoutResultProxySerializer = legacyTextFieldState.serializer();
        MultiParagraph multiParagraph = textLayoutResultProxySerializer != null ? textLayoutResultProxySerializer.RemoteActionCompatParcelizer.getMultiParagraph() : null;
        LayoutCoordinates layoutCoordinates = legacyTextFieldState.read();
        return (multiParagraph == null || layoutCoordinates == null) ? TextRange.Companion.m3081getZerod9O1mEE() : multiParagraph.m2911getRangeForRect86BmAI(rect.m514translatek4lQ0M(layoutCoordinates.mo2223screenToLocalMKHz9U(Offset.Companion.m493getZeroF1C5BW0())), i, textInclusionStrategy);
    }

    public static final boolean serializer(int i) {
        int type;
        return (!IconCompatParcelizer(i) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
    }

    public static final int IconCompatParcelizer(LegacyTextFieldState legacyTextFieldState, long j, ViewConfiguration viewConfiguration) {
        MultiParagraph multiParagraph;
        LayoutCoordinates layoutCoordinates;
        long jMo2223screenToLocalMKHz9U;
        int iM103getLineForHandwritingGestured4ec7I;
        TextLayoutResultProxy textLayoutResultProxySerializer = legacyTextFieldState.serializer();
        if (textLayoutResultProxySerializer == null || (multiParagraph = textLayoutResultProxySerializer.RemoteActionCompatParcelizer.getMultiParagraph()) == null || (layoutCoordinates = legacyTextFieldState.read()) == null || (iM103getLineForHandwritingGestured4ec7I = m103getLineForHandwritingGestured4ec7I(multiParagraph, (jMo2223screenToLocalMKHz9U = layoutCoordinates.mo2223screenToLocalMKHz9U(j)), viewConfiguration)) == -1) {
            return -1;
        }
        return multiParagraph.m2910getOffsetForPositionk4lQ0M(Offset.m471copydBAh8RU$default(jMo2223screenToLocalMKHz9U, 0.0f, (multiParagraph.getLineBottom(iM103getLineForHandwritingGestured4ec7I) + multiParagraph.getLineTop(iM103getLineForHandwritingGestured4ec7I)) / 2.0f, 1, null));
    }
}
