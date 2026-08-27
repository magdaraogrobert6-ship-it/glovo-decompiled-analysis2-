package o;

import com.roadrunner.customerchat.selfservice.data.cache.ChatIdCacheHelper;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class mapAnnotations extends ContinuationImpl {
    private static int MediaSessionCompatQueueItem = 1;
    private static int write;
    public final /* synthetic */ ChatIdCacheHelper IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public MutexImpl read;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mapAnnotations(ChatIdCacheHelper chatIdCacheHelper, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = chatIdCacheHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 81;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objClear = this.IconCompatParcelizer.clear(this);
        int i4 = write + 95;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objClear;
    }
}
