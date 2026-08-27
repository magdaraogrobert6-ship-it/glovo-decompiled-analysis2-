package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class PointMode extends ContinuationImpl {
    public Object IconCompatParcelizer;
    public createInAppMessageEventSubscriber MediaBrowserCompatMediaItem;
    public /* synthetic */ Object MediaDescriptionCompat;
    public final /* synthetic */ coil3.intercept.EngineInterceptor MediaMetadataCompat;
    public createInAppMessageEventSubscriber MediaSessionCompatQueueItem;
    public int RatingCompat;
    public createInAppMessageEventSubscriber RemoteActionCompatParcelizer;
    public createInAppMessageEventSubscriber read;
    public Object serializer;
    public ShaderKt write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointMode(coil3.intercept.EngineInterceptor engineInterceptor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaMetadataCompat = engineInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaDescriptionCompat = obj;
        this.RatingCompat |= Integer.MIN_VALUE;
        return coil3.intercept.EngineInterceptor.access$execute(this.MediaMetadataCompat, null, null, null, null, this);
    }
}
