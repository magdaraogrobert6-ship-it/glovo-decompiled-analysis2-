package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class addRectdefault extends ContinuationImpl {
    public ShaderKt IconCompatParcelizer;
    public final /* synthetic */ coil3.RealImageLoader MediaMetadataCompat;
    public /* synthetic */ Object MediaSessionCompatQueueItem;
    public int RemoteActionCompatParcelizer;
    public Shadow read;
    public accessquadraticTojd serializer;
    public accessrewindjd write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public addRectdefault(coil3.RealImageLoader realImageLoader, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaMetadataCompat = realImageLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaSessionCompatQueueItem = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return this.MediaMetadataCompat.execute(null, 0, this);
    }
}
