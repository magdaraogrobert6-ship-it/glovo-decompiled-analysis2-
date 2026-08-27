package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidTextContextMenuToolbarProvider extends ContinuationImpl {
    public androidx.compose.ui.input.pointer.AwaitPointerEventScope IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;
    public createBrazeUserChangeEventSubscriberlambda0 serializer;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.DragGestureDetectorKt.m30awaitDragOrCancellationrnUCldI(null, 0L, this);
    }

    public AndroidTextContextMenuToolbarProvider(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
