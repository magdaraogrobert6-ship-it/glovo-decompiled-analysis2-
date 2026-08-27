package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class getListIndexOrDefault extends ContinuationImpl {
    public int IconCompatParcelizer;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ androidx.compose.material3.internal.AnchoredDraggableState write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getListIndexOrDefault(androidx.compose.material3.internal.AnchoredDraggableState anchoredDraggableState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = anchoredDraggableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return this.write.anchoredDrag(null, null, this);
    }
}
