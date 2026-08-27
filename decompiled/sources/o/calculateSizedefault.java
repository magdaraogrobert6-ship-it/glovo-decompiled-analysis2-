package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class calculateSizedefault extends ContinuationImpl {
    public getDefaultInAppMessageViewFactory IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ coil3.decode.StaticImageDecoder serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public calculateSizedefault(coil3.decode.StaticImageDecoder staticImageDecoder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = staticImageDecoder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return this.serializer.decode(this);
    }
}
