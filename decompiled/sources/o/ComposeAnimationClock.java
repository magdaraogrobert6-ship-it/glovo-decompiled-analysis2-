package o;

import com.roadrunner.delivery.pickupdropoff.tasks.data.GetConfirmationStateImpl;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class ComposeAnimationClock extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    public r8lambda8L8lXCy99H67Fo1WTKvaQj9opM IconCompatParcelizer;
    public final /* synthetic */ GetConfirmationStateImpl RemoteActionCompatParcelizer;
    public SaveHeatmapUrlImpl read;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeAnimationClock(GetConfirmationStateImpl getConfirmationStateImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = getConfirmationStateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 75;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objAccess$doWork = GetConfirmationStateImpl.access$doWork(this.RemoteActionCompatParcelizer, null, this);
        int i4 = MediaDescriptionCompat + 121;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objAccess$doWork;
        }
        throw null;
    }
}
