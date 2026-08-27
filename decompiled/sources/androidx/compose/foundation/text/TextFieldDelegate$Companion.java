package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.unit.IntSize;
import o.getTopStart;

/* JADX INFO: loaded from: classes.dex */
public abstract class TextFieldDelegate$Companion {
    public static void notifyFocusedRect$foundation(TextFieldValue textFieldValue, getTopStart gettopstart, TextLayoutResult textLayoutResult, LayoutCoordinates layoutCoordinates, TextInputSession textInputSession, boolean z, OffsetMapping offsetMapping) {
        Rect rect;
        if (z) {
            int iOriginalToTransformed = offsetMapping.originalToTransformed(TextRange.m3073getMaximpl(textFieldValue.m3330getSelectiond9O1mEE()));
            String str = TextFieldDelegateKt.read;
            if (iOriginalToTransformed < textLayoutResult.getLayoutInput().getText().length()) {
                rect = textLayoutResult.getBoundingBox(iOriginalToTransformed);
            } else if (iOriginalToTransformed != 0) {
                rect = textLayoutResult.getBoundingBox(iOriginalToTransformed - 1);
            } else {
                rect = new Rect(0.0f, 0.0f, 1.0f, (int) (IntSize.m3836boximpl(TextFieldDelegateKt.computeSizeForDefaultText(gettopstart.MediaDescriptionCompat, gettopstart.RemoteActionCompatParcelizer, gettopstart.serializer, TextFieldDelegateKt.read, 1)).m3848unboximpl() & 4294967295L));
            }
            long jMo2220localToRootMKHz9U = layoutCoordinates.mo2220localToRootMKHz9U(Offset.m469constructorimpl((((long) Float.floatToRawIntBits(rect.getTop())) & 4294967295L) | (((long) Float.floatToRawIntBits(rect.getLeft())) << 32)));
            textInputSession.notifyFocusedRect(RectKt.m517Recttz77jQw(Offset.m469constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jMo2220localToRootMKHz9U >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jMo2220localToRootMKHz9U & 4294967295L)))) & 4294967295L)), Size.m537constructorimpl((((long) Float.floatToRawIntBits(rect.getBottom() - rect.getTop())) & 4294967295L) | (((long) Float.floatToRawIntBits(rect.getRight() - rect.getLeft())) << 32))));
        }
    }
}
