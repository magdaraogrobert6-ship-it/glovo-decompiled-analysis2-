package o;

import com.deliveryhero.perseus.di.DataModule;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class getTmpPath extends ContinuationImpl {
    public int IconCompatParcelizer;
    public verticalLineToRelative read;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ DataModule write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getTmpPath(DataModule dataModule, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = dataModule;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return this.write.getPerseusHitsRemoteDataStore(this);
    }
}
