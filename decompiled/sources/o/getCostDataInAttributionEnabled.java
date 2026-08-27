package o;

import com.sentiance.core.model.thrift.k$c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getCostDataInAttributionEnabled extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public int IconCompatParcelizer;
    public /* synthetic */ Object MediaMetadataCompat;
    public final /* synthetic */ k$c RatingCompat;
    public getDefaultTracker RemoteActionCompatParcelizer;
    public int read;
    public setAdRevenuePlacement serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getCostDataInAttributionEnabled(k$c k_c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RatingCompat = k_c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 21;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.MediaMetadataCompat = obj;
            this.write |= Integer.MIN_VALUE;
            return this.RatingCompat.invoke$implementation(this);
        }
        this.MediaMetadataCompat = obj;
        this.write |= Integer.MIN_VALUE;
        int i3 = 11 / 0;
        return this.RatingCompat.invoke$implementation(this);
    }
}
