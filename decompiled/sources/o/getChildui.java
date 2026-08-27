package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class getChildui extends ContinuationImpl {
    public AlignmentHorizontal IconCompatParcelizer;
    public /* synthetic */ Object MediaSessionCompatQueueItem;
    public androidx.compose.ui.input.pointer.AwaitPointerEventScope RemoteActionCompatParcelizer;
    public int read;
    public createBrazeUserChangeEventSubscriberlambda0 serializer;
    public long write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaSessionCompatQueueItem = obj;
        this.read |= Integer.MIN_VALUE;
        return androidx.compose.foundation.text.selection.SelectionGesturesKt.access$touchSelectionSubsequentPress(null, null, null, 0, this);
    }

    public getChildui(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
