package o;

import coil3.Extras$Key;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class getPivotX extends ContinuationImpl {
    public final /* synthetic */ Extras$Key IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public String read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getPivotX(Extras$Key extras$Key, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = extras$Key;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        return this.IconCompatParcelizer.report(null, this);
    }
}
