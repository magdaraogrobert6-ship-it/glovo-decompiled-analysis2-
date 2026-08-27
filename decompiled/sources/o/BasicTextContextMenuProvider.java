package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class BasicTextContextMenuProvider extends ContinuationImpl {
    public SelectionHandleIcon IconCompatParcelizer;
    public int MediaDescriptionCompat;
    public /* synthetic */ Object RatingCompat;
    public androidx.compose.ui.input.pointer.AwaitPointerEventScope RemoteActionCompatParcelizer;
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;
    public createBrazeUserChangeEventSubscriberlambda0 serializer;
    public androidx.compose.ui.input.pointer.AwaitPointerEventScope write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RatingCompat = obj;
        this.MediaDescriptionCompat |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.DragGestureDetectorKt.m35horizontalDragjO51t88(null, 0L, null, this);
    }

    public BasicTextContextMenuProvider(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
