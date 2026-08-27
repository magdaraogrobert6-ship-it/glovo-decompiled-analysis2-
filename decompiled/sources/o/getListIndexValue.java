package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class getListIndexValue extends ContinuationImpl {
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.material3.internal.AnchoredDraggableState serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getListIndexValue(androidx.compose.material3.internal.AnchoredDraggableState anchoredDraggableState, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.serializer = anchoredDraggableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        return this.serializer.anchoredDrag(null, null, null, this);
    }
}
