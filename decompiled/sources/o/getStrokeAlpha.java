package o;

import com.deliveryhero.perseus.di.NetworkModule;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class getStrokeAlpha extends ContinuationImpl {
    public final /* synthetic */ NetworkModule IconCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getStrokeAlpha(NetworkModule networkModule, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = networkModule;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.read |= Integer.MIN_VALUE;
        return this.IconCompatParcelizer.perseusHitsApi(this);
    }
}
