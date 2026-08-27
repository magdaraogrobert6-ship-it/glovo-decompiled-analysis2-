package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class getBuffer extends ContinuationImpl {
    public ShaderKt IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public final /* synthetic */ coil3.intercept.EngineInterceptor MediaMetadataCompat;
    public /* synthetic */ Object MediaSessionCompatQueueItem;
    public accessquadraticTojd RatingCompat;
    public int RemoteActionCompatParcelizer;
    public getBlurRadiusannotations read;
    public Object serializer;
    public accessandjd write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getBuffer(coil3.intercept.EngineInterceptor engineInterceptor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaMetadataCompat = engineInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaSessionCompatQueueItem = obj;
        this.MediaBrowserCompatMediaItem |= Integer.MIN_VALUE;
        return this.MediaMetadataCompat.fetch(null, null, null, null, null, this);
    }
}
