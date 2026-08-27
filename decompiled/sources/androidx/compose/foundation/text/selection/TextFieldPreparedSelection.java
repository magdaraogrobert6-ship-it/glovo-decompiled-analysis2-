package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.SetSelectionCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.sqlite.SQLite;
import java.util.List;
import o.getQueryParameterslambda2;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.runAttachLifecycleui;

/* JADX INFO: loaded from: classes.dex */
public final class TextFieldPreparedSelection extends BaseTextPreparedSelection {
    public final TextFieldValue MediaMetadataCompat;
    public final TextLayoutResultProxy MediaSessionCompatQueueItem;

    public final List IconCompatParcelizer(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (!TextRange.m3070getCollapsedimpl(this.MediaDescriptionCompat)) {
            return SQLite.read(new CommitTextCommand("", 0), new SetSelectionCommand(TextRange.m3074getMinimpl(this.MediaDescriptionCompat), TextRange.m3074getMinimpl(this.MediaDescriptionCompat)));
        }
        EditCommand editCommand = (EditCommand) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(this);
        if (editCommand == null) {
            return null;
        }
        int iSerializer = getQueryParameterslambda2.serializer();
        return (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{editCommand}, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0013  */
    public final int jumpByPagesOffset(TextLayoutResultProxy textLayoutResultProxy, int i) {
        Rect zero;
        LayoutCoordinates layoutCoordinates = textLayoutResultProxy.serializer;
        TextLayoutResult textLayoutResult = textLayoutResultProxy.RemoteActionCompatParcelizer;
        if (layoutCoordinates != null) {
            LayoutCoordinates layoutCoordinates2 = textLayoutResultProxy.write;
            zero = layoutCoordinates2 != null ? LayoutCoordinates.localBoundingBoxOf$default(layoutCoordinates2, layoutCoordinates, false, 2, null) : null;
            if (zero == null) {
                zero = Rect.Companion.getZero();
            }
        } else {
            zero = Rect.Companion.getZero();
        }
        int iM3071getEndimpl = TextRange.m3071getEndimpl(this.MediaMetadataCompat.m3330getSelectiond9O1mEE());
        OffsetMapping offsetMapping = this.write;
        Rect cursorRect = textLayoutResult.getCursorRect(offsetMapping.originalToTransformed(iM3071getEndimpl));
        return offsetMapping.transformedToOriginal(textLayoutResult.m3046getOffsetForPositionk4lQ0M(Offset.m469constructorimpl((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (zero.m510getSizeNHjbRc() & 4294967295L)) * i) + cursorRect.getTop())) & 4294967295L) | (((long) Float.floatToRawIntBits(cursorRect.getLeft())) << 32))));
    }

    public TextFieldPreparedSelection(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResultProxy textLayoutResultProxy, runAttachLifecycleui runattachlifecycleui) {
        super(textFieldValue.getAnnotatedString(), textFieldValue.m3330getSelectiond9O1mEE(), textLayoutResultProxy != null ? textLayoutResultProxy.RemoteActionCompatParcelizer : null, offsetMapping, runattachlifecycleui);
        this.MediaMetadataCompat = textFieldValue;
        this.MediaSessionCompatQueueItem = textLayoutResultProxy;
    }
}
