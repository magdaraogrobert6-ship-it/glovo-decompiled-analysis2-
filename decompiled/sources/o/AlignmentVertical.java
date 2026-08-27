package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class AlignmentVertical {
    public static final androidx.compose.ui.geometry.Rect read(androidx.compose.ui.layout.Placeable.PlacementScope placementScope, int i, androidx.compose.ui.text.input.TransformedText transformedText, androidx.compose.ui.text.TextLayoutResult textLayoutResult, boolean z, int i2) {
        androidx.compose.ui.geometry.Rect zero;
        if (textLayoutResult == null || (zero = textLayoutResult.getCursorRect(transformedText.getOffsetMapping().originalToTransformed(i))) == null) {
            zero = androidx.compose.ui.geometry.Rect.Companion.getZero();
        }
        androidx.compose.ui.geometry.Rect rect = zero;
        int iMo42roundToPx0680j_4 = placementScope.mo42roundToPx0680j_4(androidx.compose.foundation.text.TextFieldCursor_androidKt.write);
        return androidx.compose.ui.geometry.Rect.copy$default(rect, z ? (i2 - rect.getLeft()) - iMo42roundToPx0680j_4 : rect.getLeft(), 0.0f, z ? i2 - rect.getLeft() : iMo42roundToPx0680j_4 + rect.getLeft(), 0.0f, 10, null);
    }
}
