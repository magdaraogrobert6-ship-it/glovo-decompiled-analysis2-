package o;

import androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1;

/* JADX INFO: loaded from: classes.dex */
public abstract class getShouldAutoInvalidate {
    /* JADX WARN: Code duplicated, block: B:63:0x010a  */
    public static final void RemoteActionCompatParcelizer(boolean z, androidx.compose.ui.text.style.ResolvedTextDirection resolvedTextDirection, androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int iM3071getEndimpl;
        float lineHeight;
        androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResultProxySerializer;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1344558920);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.write(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(resolvedTextDirection.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(textFieldSelectionManager) ? androidx.compose.ui.graphics.Fields.RotationX : androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            boolean z3 = getpostalcode.read(textFieldSelectionManager);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if ((z2 | z3) || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new isAttached(textFieldSelectionManager, z);
                getpostalcode.write(objComponentActivity);
            }
            AlignmentHorizontal alignmentHorizontal = (AlignmentHorizontal) objComponentActivity;
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(textFieldSelectionManager);
            boolean z4 = i3 == 4;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if ((z4 | zIconCompatParcelizer) || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new getUpdatedNodeAwaitingAttachForInvalidationui(textFieldSelectionManager, z);
                getpostalcode.write(objComponentActivity2);
            }
            accessthenjd accessthenjdVar = (accessthenjd) objComponentActivity2;
            boolean zM3075getReversedimpl = androidx.compose.ui.text.TextRange.m3075getReversedimpl(textFieldSelectionManager.MediaDescriptionCompat().m3330getSelectiond9O1mEE());
            long jM3330getSelectiond9O1mEE = textFieldSelectionManager.MediaDescriptionCompat().m3330getSelectiond9O1mEE();
            if (z) {
                iM3071getEndimpl = androidx.compose.ui.text.TextRange.m3076getStartimpl(jM3330getSelectiond9O1mEE);
            } else {
                iM3071getEndimpl = androidx.compose.ui.text.TextRange.m3071getEndimpl(jM3330getSelectiond9O1mEE);
            }
            androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            if (legacyTextFieldState == null || (textLayoutResultProxySerializer = legacyTextFieldState.serializer()) == null) {
                lineHeight = 0.0f;
            } else {
                androidx.compose.ui.text.TextLayoutResult textLayoutResult = textLayoutResultProxySerializer.RemoteActionCompatParcelizer;
                if (iM3071getEndimpl < 0 || textLayoutResult.getLayoutInput().getText().length() == 0) {
                    lineHeight = 0.0f;
                } else {
                    int iMin = Math.min(textLayoutResult.getMultiParagraph().getLineForOffset(iM3071getEndimpl), Math.min(textLayoutResult.getMultiParagraph().getMaxLines() - 1, textLayoutResult.getMultiParagraph().getLineCount() - 1));
                    if (iM3071getEndimpl > androidx.compose.ui.text.MultiParagraph.getLineEnd$default(textLayoutResult.getMultiParagraph(), iMin, false, 2, null)) {
                        lineHeight = 0.0f;
                    } else {
                        lineHeight = textLayoutResult.getMultiParagraph().getLineHeight(iMin);
                    }
                }
            }
            float f = lineHeight;
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(alignmentHorizontal);
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer2 || objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = new LazyLayoutPagerKt$dragDirectionDetector$1(6, alignmentHorizontal);
                getpostalcode.write(objComponentActivity3);
            }
            androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.m109SelectionHandlewLIcFTc(accessthenjdVar, z, resolvedTextDirection, zM3075getReversedimpl, 0L, f, androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(companion, alignmentHorizontal, (androidx.compose.ui.input.pointer.PointerInputEventHandler) objComponentActivity3), getpostalcode, (i2 << 3) & 1008);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdanw7AWrZT1ZtNTucsvl4gTUEQRqg(z, resolvedTextDirection, textFieldSelectionManager, i, 1);
        }
    }
}
