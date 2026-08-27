package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class setLayoutDirectionui extends ContinuationImpl {
    public getMessageImageView RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;
    public Object write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.read |= Integer.MIN_VALUE;
        return coil3.network.okhttp.internal.CallFactoryNetworkClient.m3986executeRequestimpl(null, null, null, this);
    }

    public setLayoutDirectionui(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
