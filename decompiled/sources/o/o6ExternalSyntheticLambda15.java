package o;

import com.roadrunner.delivery.accept.laststop.domain.LastStopSelectionCoordinator$$ExternalSyntheticLambda1;
import com.roadrunner.delivery.accept.laststop.domain.LastStopSelectionCoordinator$$ExternalSyntheticLambda2;
import com.roadrunner.map.integration.search.SelectorReverseGeocoder;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class o6ExternalSyntheticLambda15 extends ContinuationImpl {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    public LastStopSelectionCoordinator$$ExternalSyntheticLambda2 IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public final /* synthetic */ SelectorReverseGeocoder MediaSessionCompatQueueItem;
    public /* synthetic */ Object RatingCompat;
    public LastStopSelectionCoordinator$$ExternalSyntheticLambda2 RemoteActionCompatParcelizer;
    public LastStopSelectionCoordinator$$ExternalSyntheticLambda1 read;
    public nd serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6ExternalSyntheticLambda15(SelectorReverseGeocoder selectorReverseGeocoder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaSessionCompatQueueItem = selectorReverseGeocoder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 49;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RatingCompat = obj;
        this.MediaDescriptionCompat |= Integer.MIN_VALUE;
        return this.MediaSessionCompatQueueItem.legacyGeocoder(null, null, null, null, false, this);
    }
}
