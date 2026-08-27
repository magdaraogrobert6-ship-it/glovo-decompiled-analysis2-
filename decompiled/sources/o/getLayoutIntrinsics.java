package o;

import com.roadrunner.delivery.accept.laststop.domain.LastStopSelectionCoordinator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CompletableDeferredImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getLayoutIntrinsics extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat;
    public CompletableDeferredImpl IconCompatParcelizer;
    public final /* synthetic */ LastStopSelectionCoordinator MediaDescriptionCompat;
    public double RemoteActionCompatParcelizer;
    public double read;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getLayoutIntrinsics(LastStopSelectionCoordinator lastStopSelectionCoordinator, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaDescriptionCompat = lastStopSelectionCoordinator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 51;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.write |= Integer.MIN_VALUE;
        return this.MediaDescriptionCompat.geocodeCoordinates(0.0d, 0.0d, this);
    }
}
