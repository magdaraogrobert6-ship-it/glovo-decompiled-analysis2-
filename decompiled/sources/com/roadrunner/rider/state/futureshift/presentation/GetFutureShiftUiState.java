package com.roadrunner.rider.state.futureshift.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.home.floatinglayer.config.GetFloatingLayerScope$invoke$$inlined$flatMapLatest$1;
import com.roadrunner.location.toggle.domain.CanRequestLocationUpdatesImpl;
import com.roadrunner.opportunities.data.OpportunitiesRepository;
import com.roadrunner.opportunities.data.OpportunitiesRepository$get$$inlined$map$1;
import com.roadrunner.rider.state.domain.GetStatusUseCaseImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.AdjustInstance5;
import o.AdjustInstance91;
import o.AdjustInstancePreLaunchActions;
import o.vg;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes3.dex */
public final class GetFutureShiftUiState {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaSessionCompatQueueItem;
    public final OkHttpCall$1 IconCompatParcelizer;
    public final vg MediaDescriptionCompat;
    public final OpportunitiesRepository MediaMetadataCompat;
    public final AdjustInstance91 RemoteActionCompatParcelizer;
    public final AdjustInstancePreLaunchActions read;
    public final GetStatusUseCaseImpl serializer;
    public final CanRequestLocationUpdatesImpl write;

    public GetFutureShiftUiState(GetStatusUseCaseImpl getStatusUseCaseImpl, AdjustInstancePreLaunchActions adjustInstancePreLaunchActions, AdjustInstance91 adjustInstance91, OkHttpCall$1 okHttpCall$1, OpportunitiesRepository opportunitiesRepository, vg vgVar, CanRequestLocationUpdatesImpl canRequestLocationUpdatesImpl) {
        this.serializer = getStatusUseCaseImpl;
        this.read = adjustInstancePreLaunchActions;
        this.RemoteActionCompatParcelizer = adjustInstance91;
        this.IconCompatParcelizer = okHttpCall$1;
        this.MediaMetadataCompat = opportunitiesRepository;
        this.MediaDescriptionCompat = vgVar;
        this.write = canRequestLocationUpdatesImpl;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    public final Object invoke$implementation(ContinuationImpl continuationImpl) {
        AdjustInstance5 adjustInstance5;
        int i = 2 % 2;
        if (continuationImpl instanceof AdjustInstance5) {
            int i2 = MediaBrowserCompatMediaItem + 117;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            adjustInstance5 = (AdjustInstance5) continuationImpl;
            int i4 = adjustInstance5.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = MediaBrowserCompatMediaItem + 117;
                MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
                adjustInstance5.IconCompatParcelizer = i5 % 2 != 0 ? i4 - Integer.MIN_VALUE : i4 - Integer.MIN_VALUE;
            } else {
                adjustInstance5 = new AdjustInstance5(this, continuationImpl);
            }
        } else {
            adjustInstance5 = new AdjustInstance5(this, continuationImpl);
        }
        Object obj = adjustInstance5.serializer;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = adjustInstance5.IconCompatParcelizer;
        if (i6 != 0) {
            int i7 = MediaSessionCompatQueueItem + 11;
            MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0 ? i6 != 1 : i6 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            adjustInstance5.IconCompatParcelizer = 1;
            obj = this.serializer.read();
            if (obj == obj2) {
                return obj2;
            }
        }
        Flow flowSerializer = FlowKt.serializer(FlowKt.RemoteActionCompatParcelizer(FlowKt.RemoteActionCompatParcelizer((Flow) obj, new GetFloatingLayerScope$invoke$$inlined$flatMapLatest$1(this, null)), new OpportunitiesRepository$get$$inlined$map$1(this.MediaMetadataCompat.read(), 0), this.write.serializer(), this.MediaDescriptionCompat.write, new GetFutureShiftUiState$invoke$3(this, null)));
        int i8 = MediaSessionCompatQueueItem + 89;
        MediaBrowserCompatMediaItem = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return flowSerializer;
    }
}
