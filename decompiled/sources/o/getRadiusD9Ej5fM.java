package o;

import androidx.cardview.widget.CardView$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class getRadiusD9Ej5fM extends ContinuationImpl {
    public final /* synthetic */ CardView$1 IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public lerpNonNull read;
    public CardView$1 serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getRadiusD9Ej5fM(CardView$1 cardView$1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = cardView$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return this.IconCompatParcelizer.store(null, this);
    }
}
