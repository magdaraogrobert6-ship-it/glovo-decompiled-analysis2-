package o;

import com.roadrunner.delivery.pickupdropoff.tasks.domain.UpdateTaskUseCaseImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class AnimatedVisibilitySearchInfo extends ContinuationImpl {
    private static int MediaMetadataCompat = 0;
    private static int ParcelableVolumeInfo = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ UpdateTaskUseCaseImpl MediaBrowserCompatMediaItem;
    public r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk MediaDescriptionCompat;
    public /* synthetic */ Object MediaSessionCompatQueueItem;
    public int RatingCompat;
    public String RemoteActionCompatParcelizer;
    public uiMode read;
    public long serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilitySearchInfo(UpdateTaskUseCaseImpl updateTaskUseCaseImpl, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.MediaBrowserCompatMediaItem = updateTaskUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 113;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.MediaSessionCompatQueueItem = obj;
        this.RatingCompat |= Integer.MIN_VALUE;
        Object objInvoke = this.MediaBrowserCompatMediaItem.invoke(0L, null, null, null, this);
        int i4 = MediaMetadataCompat + 13;
        ParcelableVolumeInfo = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objInvoke;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
