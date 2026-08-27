package o;

import com.roadrunner.localPushNotifications.smartPolling.domain.AutoAcceptLocalPushHandlerImpl;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class setUserInputEnabled extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public List IconCompatParcelizer;
    public /* synthetic */ Object MediaBrowserCompatMediaItem;
    public int MediaMetadataCompat;
    public final /* synthetic */ AutoAcceptLocalPushHandlerImpl MediaSessionCompatQueueItem;
    public String RemoteActionCompatParcelizer;
    public String read;
    public Object serializer;
    public copyNs73l9sdefault write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setUserInputEnabled(AutoAcceptLocalPushHandlerImpl autoAcceptLocalPushHandlerImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaSessionCompatQueueItem = autoAcceptLocalPushHandlerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 97;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.MediaBrowserCompatMediaItem = obj;
            this.MediaMetadataCompat |= Integer.MIN_VALUE;
            return this.MediaSessionCompatQueueItem.invoke(null, null, this);
        }
        this.MediaBrowserCompatMediaItem = obj;
        this.MediaMetadataCompat |= Integer.MIN_VALUE;
        this.MediaSessionCompatQueueItem.invoke(null, null, this);
        throw null;
    }
}
