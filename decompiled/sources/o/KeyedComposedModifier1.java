package o;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class KeyedComposedModifier1 {
    public androidx.compose.ui.geometry.Rect IconCompatParcelizer;
    public final accessgetGreencp MediaBrowserCompatMediaItem;
    public androidx.compose.ui.geometry.Rect MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public boolean MediaSessionCompatResultReceiverWrapper;
    public final getFrameRate MediaSessionCompatToken;
    public androidx.compose.ui.text.input.OffsetMapping PlaybackStateCompatCustomAction;
    public boolean RatingCompat;
    public androidx.compose.ui.text.input.TextFieldValue ResultReceiver;
    public androidx.compose.ui.text.TextLayoutResult r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public boolean read;
    public boolean write;
    public final Object ParcelableVolumeInfo = new Object();
    public final CursorAnchorInfo.Builder serializer = new CursorAnchorInfo.Builder();
    public final float[] PlaybackStateCompat = androidx.compose.ui.graphics.Matrix.m969constructorimpl$default(null, 1, null);
    public final android.graphics.Matrix RemoteActionCompatParcelizer = new android.graphics.Matrix();

    /* JADX WARN: Code duplicated, block: B:56:0x01b8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    public final void serializer() {
        androidx.compose.ui.text.TextLayoutResult textLayoutResult;
        int i;
        ?? r4;
        accessgetGreencp accessgetgreencp = this.MediaBrowserCompatMediaItem;
        android.view.inputmethod.InputMethodManager inputMethodManagerParcelableVolumeInfo = accessgetgreencp.ParcelableVolumeInfo();
        View view = (View) accessgetgreencp.IconCompatParcelizer;
        if (!inputMethodManagerParcelableVolumeInfo.isActive(view) || this.ResultReceiver == null || this.PlaybackStateCompatCustomAction == null || this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == null || this.MediaDescriptionCompat == null || this.IconCompatParcelizer == null) {
            return;
        }
        float[] fArr = this.PlaybackStateCompat;
        androidx.compose.ui.graphics.Matrix.m978resetimpl(fArr);
        this.MediaSessionCompatToken.invoke(androidx.compose.ui.graphics.Matrix.m967boximpl(fArr));
        androidx.compose.ui.geometry.Rect rect = this.IconCompatParcelizer;
        rect.getClass();
        float f = -rect.getLeft();
        androidx.compose.ui.geometry.Rect rect2 = this.IconCompatParcelizer;
        rect2.getClass();
        androidx.compose.ui.graphics.Matrix.m990translateimpl(fArr, f, -rect2.getTop(), 0.0f);
        android.graphics.Matrix matrix = this.RemoteActionCompatParcelizer;
        androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt.m589setFromEL8BTi8(matrix, fArr);
        androidx.compose.ui.text.input.TextFieldValue textFieldValue = this.ResultReceiver;
        textFieldValue.getClass();
        androidx.compose.ui.text.input.OffsetMapping offsetMapping = this.PlaybackStateCompatCustomAction;
        offsetMapping.getClass();
        androidx.compose.ui.text.TextLayoutResult textLayoutResult2 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        textLayoutResult2.getClass();
        androidx.compose.ui.geometry.Rect rect3 = this.MediaDescriptionCompat;
        rect3.getClass();
        androidx.compose.ui.geometry.Rect rect4 = this.IconCompatParcelizer;
        rect4.getClass();
        boolean z = this.MediaMetadataCompat;
        boolean z2 = this.read;
        boolean z3 = this.RatingCompat;
        boolean z4 = this.MediaSessionCompatQueueItem;
        CursorAnchorInfo.Builder builder = this.serializer;
        builder.reset();
        builder.setMatrix(matrix);
        int iM3074getMinimpl = androidx.compose.ui.text.TextRange.m3074getMinimpl(textFieldValue.m3330getSelectiond9O1mEE());
        builder.setSelectionRange(iM3074getMinimpl, androidx.compose.ui.text.TextRange.m3073getMaximpl(textFieldValue.m3330getSelectiond9O1mEE()));
        if (!z || iM3074getMinimpl < 0) {
            textLayoutResult = textLayoutResult2;
            i = 0;
        } else {
            int iOriginalToTransformed = offsetMapping.originalToTransformed(iM3074getMinimpl);
            androidx.compose.ui.geometry.Rect cursorRect = textLayoutResult2.getCursorRect(iOriginalToTransformed);
            float fWrite = RangesKt.write(cursorRect.getLeft(), 0.0f, (int) (textLayoutResult2.m3047getSizeYbymL2g() >> 32));
            boolean zIconCompatParcelizer = PointerInteropFilterpointerInputFilter1stopDispatching1.IconCompatParcelizer(rect3, fWrite, cursorRect.getTop());
            boolean zIconCompatParcelizer2 = PointerInteropFilterpointerInputFilter1stopDispatching1.IconCompatParcelizer(rect3, fWrite, cursorRect.getBottom());
            textLayoutResult = textLayoutResult2;
            int i2 = 1;
            boolean z5 = textLayoutResult.getBidiRunDirection(iOriginalToTransformed) == androidx.compose.ui.text.style.ResolvedTextDirection.Rtl;
            if (!zIconCompatParcelizer && !zIconCompatParcelizer2) {
                i2 = 0;
            }
            if (!zIconCompatParcelizer || !zIconCompatParcelizer2) {
                i2 |= 2;
            }
            i = 0;
            builder.setInsertionMarkerLocation(fWrite, cursorRect.getTop(), cursorRect.getBottom(), cursorRect.getBottom(), z5 ? i2 | 4 : i2);
        }
        if (z2) {
            androidx.compose.ui.text.TextRange textRangeM3329getCompositionMzsxiRA = textFieldValue.m3329getCompositionMzsxiRA();
            int iM3074getMinimpl2 = textRangeM3329getCompositionMzsxiRA != null ? androidx.compose.ui.text.TextRange.m3074getMinimpl(textRangeM3329getCompositionMzsxiRA.m3080unboximpl()) : -1;
            androidx.compose.ui.text.TextRange textRangeM3329getCompositionMzsxiRA2 = textFieldValue.m3329getCompositionMzsxiRA();
            int iM3073getMaximpl = textRangeM3329getCompositionMzsxiRA2 != null ? androidx.compose.ui.text.TextRange.m3073getMaximpl(textRangeM3329getCompositionMzsxiRA2.m3080unboximpl()) : -1;
            if (iM3074getMinimpl2 >= 0 && iM3074getMinimpl2 < iM3073getMaximpl) {
                builder.setComposingText(iM3074getMinimpl2, textFieldValue.getText().subSequence(iM3074getMinimpl2, iM3073getMaximpl));
                int iOriginalToTransformed2 = offsetMapping.originalToTransformed(iM3074getMinimpl2);
                int iOriginalToTransformed3 = offsetMapping.originalToTransformed(iM3073getMaximpl);
                float[] fArr2 = new float[(iOriginalToTransformed3 - iOriginalToTransformed2) * 4];
                textLayoutResult.getMultiParagraph().m2909fillBoundingBoxes8ffj60Q(androidx.compose.ui.text.TextRangeKt.TextRange(iOriginalToTransformed2, iOriginalToTransformed3), fArr2, i);
                while (iM3074getMinimpl2 < iM3073getMaximpl) {
                    int iOriginalToTransformed4 = offsetMapping.originalToTransformed(iM3074getMinimpl2);
                    int i3 = (iOriginalToTransformed4 - iOriginalToTransformed2) * 4;
                    int i4 = iOriginalToTransformed2;
                    androidx.compose.ui.geometry.Rect rect5 = new androidx.compose.ui.geometry.Rect(fArr2[i3], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3]);
                    boolean zOverlaps = rect3.overlaps(rect5);
                    if (!PointerInteropFilterpointerInputFilter1stopDispatching1.IconCompatParcelizer(rect3, rect5.getLeft(), rect5.getTop()) || !PointerInteropFilterpointerInputFilter1stopDispatching1.IconCompatParcelizer(rect3, rect5.getRight(), rect5.getBottom())) {
                        r4 = zOverlaps;
                        r4 = (zOverlaps ? 1 : 0) | 2;
                    }
                    r4 = zOverlaps;
                    if (textLayoutResult.getBidiRunDirection(iOriginalToTransformed4) == androidx.compose.ui.text.style.ResolvedTextDirection.Rtl) {
                        r4 = (r4 == true ? 1 : 0) | 4;
                    }
                    builder.addCharacterBounds(iM3074getMinimpl2, rect5.getLeft(), rect5.getTop(), rect5.getRight(), rect5.getBottom(), r4 == true ? 1 : 0);
                    iM3074getMinimpl2++;
                    iOriginalToTransformed2 = i4;
                }
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33 && z3) {
            scheduleInvalidation.serializer(builder, rect4);
        }
        if (i5 >= 34 && z4) {
            preferredFrameRate.write(builder, textLayoutResult, rect3);
        }
        accessgetgreencp.ParcelableVolumeInfo().updateCursorAnchorInfo(view, builder.build());
        this.write = false;
    }

    public KeyedComposedModifier1(getFrameRate getframerate, accessgetGreencp accessgetgreencp) {
        this.MediaSessionCompatToken = getframerate;
        this.MediaBrowserCompatMediaItem = accessgetgreencp;
    }
}
