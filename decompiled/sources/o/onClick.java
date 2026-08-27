package o;

import com.roadrunner.auth.domain.mapper.MapAuthEntityToRefreshTokenRequest;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class onClick extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaMetadataCompat;
    public String IconCompatParcelizer;
    public /* synthetic */ Object MediaDescriptionCompat;
    public final /* synthetic */ MapAuthEntityToRefreshTokenRequest MediaSessionCompatQueueItem;
    public String RemoteActionCompatParcelizer;
    public String read;
    public String serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onClick(MapAuthEntityToRefreshTokenRequest mapAuthEntityToRefreshTokenRequest, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaSessionCompatQueueItem = mapAuthEntityToRefreshTokenRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 39;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.MediaDescriptionCompat = obj;
        this.write |= Integer.MIN_VALUE;
        Object objInvoke = this.MediaSessionCompatQueueItem.invoke(null, null, this);
        int i4 = MediaMetadataCompat + 37;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvoke;
    }
}
