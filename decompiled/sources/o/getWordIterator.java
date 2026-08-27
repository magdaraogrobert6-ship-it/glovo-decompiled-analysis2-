package o;

import com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet.LastStopSelectionBottomSheetUiModelImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getWordIterator extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;
    public setMatrix IconCompatParcelizer;
    public /* synthetic */ Object MediaDescriptionCompat;
    public final /* synthetic */ LastStopSelectionBottomSheetUiModelImpl MediaSessionCompatQueueItem;
    public int RemoteActionCompatParcelizer;
    public int read;
    public Object serializer;
    public isOpaque write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getWordIterator(LastStopSelectionBottomSheetUiModelImpl lastStopSelectionBottomSheetUiModelImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaSessionCompatQueueItem = lastStopSelectionBottomSheetUiModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 85;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.MediaDescriptionCompat = obj;
        this.read |= Integer.MIN_VALUE;
        Object objAccess$saveLastStop = LastStopSelectionBottomSheetUiModelImpl.access$saveLastStop(this.MediaSessionCompatQueueItem, null, null, null, this);
        int i4 = MediaBrowserCompatMediaItem + 19;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objAccess$saveLastStop;
    }
}
