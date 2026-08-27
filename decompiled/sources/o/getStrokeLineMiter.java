package o;

import com.deliveryhero.perseus.di.NetworkModule;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class getStrokeLineMiter extends ContinuationImpl {
    public NetworkModule RemoteActionCompatParcelizer;
    public final /* synthetic */ NetworkModule read;
    public int serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getStrokeLineMiter(NetworkModule networkModule, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = networkModule;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.serializer |= Integer.MIN_VALUE;
        return this.read.initialize(this);
    }
}
