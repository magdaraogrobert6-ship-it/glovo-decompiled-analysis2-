package o;

import com.deliveryhero.perseus.di.NetworkModule;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class getStrokeLineCapKaPHkGw extends ContinuationImpl {
    public int IconCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ NetworkModule write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getStrokeLineCapKaPHkGw(NetworkModule networkModule, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = networkModule;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.read = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return this.write.retrofitBuilder$perseus_release(this);
    }
}
