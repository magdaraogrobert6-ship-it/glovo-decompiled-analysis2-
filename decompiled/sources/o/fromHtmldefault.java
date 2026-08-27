package o;

import com.roadrunner.customerchat.selfservice.domain.imageselection.usecase.WebChatCacheGalleryImageUseCase;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class fromHtmldefault extends ContinuationImpl {
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ WebChatCacheGalleryImageUseCase IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fromHtmldefault(WebChatCacheGalleryImageUseCase webChatCacheGalleryImageUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = webChatCacheGalleryImageUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 103;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objCacheGalleryImage = this.IconCompatParcelizer.cacheGalleryImage(null, this);
        int i4 = serializer + 29;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objCacheGalleryImage;
        }
        obj2.hashCode();
        throw null;
    }
}
