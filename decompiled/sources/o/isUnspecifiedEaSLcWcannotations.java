package o;

import com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.presentation.PinValidationTaskUiModelImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class isUnspecifiedEaSLcWcannotations extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaSessionCompatQueueItem;
    public apiLevel IconCompatParcelizer;
    public final /* synthetic */ PinValidationTaskUiModelImpl MediaMetadataCompat;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public PreviewLightDark read;
    public int serializer;
    public r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isUnspecifiedEaSLcWcannotations(PinValidationTaskUiModelImpl pinValidationTaskUiModelImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaMetadataCompat = pinValidationTaskUiModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 33;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objAccess$validatePinOffline = PinValidationTaskUiModelImpl.access$validatePinOffline(this.MediaMetadataCompat, null, null, this);
        int i4 = MediaSessionCompatQueueItem + 105;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objAccess$validatePinOffline;
    }
}
