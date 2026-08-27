package o;

import com.sentiance.core.model.events.E$b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class applyPendingRuntimeConfigurationandroid_sdk_base_release extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ E$b MediaMetadataCompat;
    public addSerializedCardJsonToStorageandroid_sdk_base_release RemoteActionCompatParcelizer;
    public getContentCardsLastUpdatedInSecondsFromEpoch read;
    public getContentCardUnviewedCount serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public applyPendingRuntimeConfigurationandroid_sdk_base_release(E$b e$b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaMetadataCompat = e$b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 97;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            this.IconCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            this.MediaMetadataCompat.fetchVendorReviewConfig(null, this);
            throw null;
        }
        this.IconCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objFetchVendorReviewConfig = this.MediaMetadataCompat.fetchVendorReviewConfig(null, this);
        int i3 = MediaSessionCompatQueueItem + 99;
        MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return objFetchVendorReviewConfig;
        }
        obj2.hashCode();
        throw null;
    }
}
