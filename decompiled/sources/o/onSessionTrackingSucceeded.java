package o;

import com.roadrunner.home.stickyfooter.HomeStickyFooterUiModelImpl$1$1$1$1$1;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class onSessionTrackingSucceeded extends ContinuationImpl {
    private static int ParcelableVolumeInfo = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public int IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public FlowCollector MediaDescriptionCompat;
    public /* synthetic */ Object MediaMetadataCompat;
    public Collection MediaSessionCompatQueueItem;
    public final /* synthetic */ HomeStickyFooterUiModelImpl$1$1$1$1$1 MediaSessionCompatResultReceiverWrapper;
    public Collection RatingCompat;
    public Iterator RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onSessionTrackingSucceeded(HomeStickyFooterUiModelImpl$1$1$1$1$1 homeStickyFooterUiModelImpl$1$1$1$1$1, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.MediaSessionCompatResultReceiverWrapper = homeStickyFooterUiModelImpl$1$1$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEmit;
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 11;
        PlaybackStateCompatCustomAction = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.MediaMetadataCompat = obj;
            this.MediaBrowserCompatMediaItem |= Integer.MIN_VALUE;
            objEmit = this.MediaSessionCompatResultReceiverWrapper.emit(null, this);
            int i3 = 33 / 0;
        } else {
            this.MediaMetadataCompat = obj;
            this.MediaBrowserCompatMediaItem |= Integer.MIN_VALUE;
            objEmit = this.MediaSessionCompatResultReceiverWrapper.emit(null, this);
        }
        int i4 = ParcelableVolumeInfo + 103;
        PlaybackStateCompatCustomAction = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
        return objEmit;
    }
}
