package o;

import com.roadrunner.rider.state.domain.GetStatusUseCaseImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class setSessionInterval extends ContinuationImpl {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public setSdkPrefix IconCompatParcelizer;
    public final /* synthetic */ GetStatusUseCaseImpl MediaBrowserCompatMediaItem;
    public /* synthetic */ Object MediaDescriptionCompat;
    public boolean RemoteActionCompatParcelizer;
    public getFailureResponseData read;
    public int serializer;
    public getFailureResponseData write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setSessionInterval(GetStatusUseCaseImpl getStatusUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaBrowserCompatMediaItem = getStatusUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = RatingCompat + 39;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object obj2 = null;
        this.MediaDescriptionCompat = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objAccess$getStatus = GetStatusUseCaseImpl.access$getStatus(this.MediaBrowserCompatMediaItem, null, null, false, this);
        int i4 = RatingCompat + 79;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objAccess$getStatus;
        }
        obj2.hashCode();
        throw null;
    }
}
