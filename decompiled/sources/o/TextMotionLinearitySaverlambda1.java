package o;

import com.roadrunner.heatmap.data.HeatmapDataStore$get$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class TextMotionLinearitySaverlambda1 extends ContinuationImpl {
    private static int MediaDescriptionCompat = 0;
    private static int RatingCompat = 1;
    public int IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public /* synthetic */ Object MediaMetadataCompat;
    public final /* synthetic */ HeatmapDataStore$get$$inlined$map$1.AnonymousClass2 MediaSessionCompatQueueItem;
    public setFitInsetsSides RemoteActionCompatParcelizer;
    public FlowCollector read;
    public AndroidPopup_androidKtLocalIsInPopupLayout1 serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextMotionLinearitySaverlambda1(HeatmapDataStore$get$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.MediaSessionCompatQueueItem = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = RatingCompat + 27;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.MediaMetadataCompat = obj;
        this.MediaBrowserCompatMediaItem |= Integer.MIN_VALUE;
        Object objEmit = this.MediaSessionCompatQueueItem.emit(null, this);
        int i4 = MediaDescriptionCompat + 79;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 16 / 0;
        }
        return objEmit;
    }
}
