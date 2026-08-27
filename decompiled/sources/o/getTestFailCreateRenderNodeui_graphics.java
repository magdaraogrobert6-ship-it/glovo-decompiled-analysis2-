package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class getTestFailCreateRenderNodeui_graphics extends ContinuationImpl {
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ com.deliveryhero.chatui.domain.imageselection.usecase.CacheGalleryImageUseCaseImpl RemoteActionCompatParcelizer;
    public int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getTestFailCreateRenderNodeui_graphics(com.deliveryhero.chatui.domain.imageselection.usecase.CacheGalleryImageUseCaseImpl cacheGalleryImageUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = cacheGalleryImageUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.IconCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        return this.RemoteActionCompatParcelizer.cacheGalleryImage(null, this);
    }
}
