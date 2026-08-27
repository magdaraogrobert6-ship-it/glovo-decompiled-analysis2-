package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class getStride extends ContinuationImpl {
    public ShaderKt IconCompatParcelizer;
    public getBlurRadiusannotations MediaBrowserCompatMediaItem;
    public final /* synthetic */ coil3.intercept.EngineInterceptor MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public /* synthetic */ Object MediaSessionCompatQueueItem;
    public accessquadraticTojd RatingCompat;
    public int RemoteActionCompatParcelizer;
    public Object read;
    public PixelMap serializer;
    public accessandjd write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getStride(coil3.intercept.EngineInterceptor engineInterceptor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaDescriptionCompat = engineInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaSessionCompatQueueItem = obj;
        this.MediaMetadataCompat |= Integer.MIN_VALUE;
        return coil3.intercept.EngineInterceptor.access$decode(this.MediaDescriptionCompat, null, null, null, null, null, null, this);
    }
}
