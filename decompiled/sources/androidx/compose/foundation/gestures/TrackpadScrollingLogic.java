package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.HistoricalChange;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Density;
import androidx.sqlite.SQLite;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.sequences.SequenceBuilderIterator;
import kotlinx.coroutines.channels.BufferedChannel;
import o.IInAppMessageViewWrapper;
import o.TextFieldSelectionManagercopy1;
import o.TextFieldSelectionManagermaybeSuggestSelection1;
import o.autoInvalidateUpdatedNode;
import o.onContentCardDismissed;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.resolveUnregisterDisplayedMessagelambda0;

/* JADX INFO: loaded from: classes.dex */
public final class TrackpadScrollingLogic extends NonTouchScrollingLogic {
    public final BufferedChannel IconCompatParcelizer;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU read;

    /* JADX WARN: Code duplicated, block: B:27:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a6 A[RETURN] */
    public final boolean onPan(PointerEvent pointerEvent) {
        BufferedChannel bufferedChannel;
        ScrollingLogic scrollingLogic;
        PointerInputChange pointerInputChange = (PointerInputChange) onContentCardDismissed.MediaMetadataCompat((List) pointerEvent.getChanges());
        if (pointerInputChange != null) {
            List<HistoricalChange> historical = pointerInputChange.getHistorical();
            int size = historical.size();
            int i = 0;
            boolean z = false;
            while (true) {
                bufferedChannel = this.IconCompatParcelizer;
                scrollingLogic = this.MediaMetadataCompat;
                if (i >= size) {
                    break;
                }
                HistoricalChange historicalChange = historical.get(i);
                long jM469constructorimpl = Offset.m469constructorimpl((-9223372034707292160L) ^ historicalChange.m1969getPanOffsetF1C5BW0());
                if (scrollingLogic.m60toSingleAxisDeltaFromAnglek4lQ0M(scrollingLogic.write(jM469constructorimpl)) != 0.0f) {
                    z = !(bufferedChannel.b_(new TextFieldSelectionManagercopy1(jM469constructorimpl, historicalChange.getUptimeMillis(), false)) instanceof resolveUnregisterDisplayedMessagelambda0) || z;
                }
                i++;
            }
            long jM469constructorimpl2 = Offset.m469constructorimpl(pointerInputChange.m2070getPanOffsetF1C5BW0() ^ (-9223372034707292160L));
            boolean zM2011equalsimpl0 = PointerEventType.m2011equalsimpl0(pointerEvent.m2004getType7fucELk(), PointerEventType.Companion.m2018getPanEnd7fucELk());
            if (scrollingLogic.m60toSingleAxisDeltaFromAnglek4lQ0M(scrollingLogic.write(jM469constructorimpl2)) != 0.0f || zM2011equalsimpl0 ? !(!(bufferedChannel.b_(new TextFieldSelectionManagercopy1(jM469constructorimpl2, pointerInputChange.getUptimeMillis(), zM2011equalsimpl0)) instanceof resolveUnregisterDisplayedMessagelambda0) || z) : !z) {
                if (this.serializer) {
                    return false;
                }
            }
        } else if (this.serializer) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static TextFieldSelectionManagercopy1 write(BufferedChannel bufferedChannel) {
        TextFieldSelectionManagercopy1 textFieldSelectionManagercopy1 = null;
        SequenceBuilderIterator sequenceBuilderIterator = LazyKt__LazyJVMKt.read(new ForEachGestureKt.C00342(new TextFieldSelectionManagermaybeSuggestSelection1(bufferedChannel, 0), 0 == true ? 1 : 0, 1));
        while (sequenceBuilderIterator.hasNext()) {
            TextFieldSelectionManagercopy1 textFieldSelectionManagercopy1Write = (TextFieldSelectionManagercopy1) sequenceBuilderIterator.next();
            if (textFieldSelectionManagercopy1 != null) {
                textFieldSelectionManagercopy1Write = textFieldSelectionManagercopy1.write(textFieldSelectionManagercopy1Write);
            }
            textFieldSelectionManagercopy1 = textFieldSelectionManagercopy1Write;
        }
        return textFieldSelectionManagercopy1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cd, code lost:
    
        if (r0.invoke(r1, r8) == r9) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$dispatchTrackpadScroll(androidx.compose.foundation.gestures.TrackpadScrollingLogic r16, androidx.compose.foundation.gestures.ScrollingLogic r17, o.TextFieldSelectionManagercopy1 r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TrackpadScrollingLogic.access$dispatchTrackpadScroll(androidx.compose.foundation.gestures.TrackpadScrollingLogic, androidx.compose.foundation.gestures.ScrollingLogic, o.TextFieldSelectionManagercopy1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public TrackpadScrollingLogic(ScrollingLogic scrollingLogic, autoInvalidateUpdatedNode autoinvalidateupdatednode, Density density) {
        super(scrollingLogic, autoinvalidateupdatednode, density);
        this.IconCompatParcelizer = SQLite.IconCompatParcelizer(Integer.MAX_VALUE, 6, (IInAppMessageViewWrapper) null);
    }
}
