package o;

import com.roadrunner.customerchat.selfservice.data.cache.WebChatNativeCacheDataStore;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class pushLink extends ContinuationImpl {
    private static int RatingCompat = 1;
    private static int serializer;
    public final /* synthetic */ WebChatNativeCacheDataStore IconCompatParcelizer;
    public isRoot RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pushLink(WebChatNativeCacheDataStore webChatNativeCacheDataStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = webChatNativeCacheDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 39;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.read = obj;
            this.write |= Integer.MIN_VALUE;
            return this.IconCompatParcelizer.updateValue(null, null, this);
        }
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        int i3 = 8 / 0;
        return this.IconCompatParcelizer.updateValue(null, null, this);
    }
}
