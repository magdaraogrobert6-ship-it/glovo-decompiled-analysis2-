package o;

import com.roadrunner.customerchat.selfservice.data.cache.WebChatNativeCacheDataStore;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class flatMapAnnotationsui_text extends ContinuationImpl {
    private static int serializer = 0;
    private static int write = 1;
    public int IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ WebChatNativeCacheDataStore read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public flatMapAnnotationsui_text(WebChatNativeCacheDataStore webChatNativeCacheDataStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = webChatNativeCacheDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 25;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return this.read.updateLastSavedVersionAndTimestamp(0L, null, this);
    }
}
