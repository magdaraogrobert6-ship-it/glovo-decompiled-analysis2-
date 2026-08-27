package com.roadrunner.map.integration.mapbox.maneuver;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.bindgen.Expected;
import com.mapbox.navigation.base.formatter.DistanceFormatterOptions;
import com.mapbox.navigation.base.trip.model.RouteProgress;
import com.mapbox.navigation.core.arrival.ArrivalProgressObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.tripdata.maneuver.api.MapboxManeuverApi;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.roadrunner.map.container.maplayer.MapLayersUiModel$1;
import com.roadrunner.map.integration.mapbox.maneuver.ManeuverApi;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.createFromParcel;
import o.getBottomPIaL0Z0;
import o.getContentViewGroupParentLayout;
import o.isAdapterPositionOnScreen;
import o.isOpenInternalroom_runtime;
import o.k4;
import o.k6;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.transferSessionPackageI;

/* JADX INFO: loaded from: classes3.dex */
public final class ManeuverApi {
    private static int MediaSessionCompatQueueItem = 0;
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    public final getContentViewGroupParentLayout IconCompatParcelizer;
    public final StateFlow MediaBrowserCompatMediaItem;
    public final DeferredCoroutine MediaDescriptionCompat;
    public MapboxManeuverApi MediaMetadataCompat;
    public final isAdapterPositionOnScreen RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final isAdapterPositionOnScreen read;
    public final k6 serializer;
    public final transferSessionPackageI write;

    public ManeuverApi(k6 k6Var, transferSessionPackageI transfersessionpackagei, getContentViewGroupParentLayout getcontentviewgroupparentlayout, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        this.serializer = k6Var;
        this.write = transfersessionpackagei;
        this.IconCompatParcelizer = getcontentviewgroupparentlayout;
        final int i = 0;
        this.read = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.k3
            private static int RemoteActionCompatParcelizer = 1;
            private static int serializer;
            public final /* synthetic */ ManeuverApi write;

            {
                this.write = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = RemoteActionCompatParcelizer + 47;
                serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                int i5 = i;
                ManeuverApi maneuverApi = this.write;
                if (i5 != 0) {
                    return new MapboxManeuverApi(new AnalyticsServiceImpl((DistanceFormatterOptions) maneuverApi.serializer.read.MediaSessionCompatResultReceiverWrapper(), 4));
                }
                Boolean boolValueOf = Boolean.valueOf(((FirebaseRemoteConfigImpl) maneuverApi.write).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY());
                int i6 = RemoteActionCompatParcelizer + 27;
                serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return boolValueOf;
            }
        });
        MutableStateFlow mutableStateFlow = StateFlowKt.read(getBottomPIaL0Z0.RemoteActionCompatParcelizer);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.MediaBrowserCompatMediaItem = mutableStateFlow;
        final int i2 = 1;
        this.RatingCompat = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.k3
            private static int RemoteActionCompatParcelizer = 1;
            private static int serializer;
            public final /* synthetic */ ManeuverApi write;

            {
                this.write = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = RemoteActionCompatParcelizer + 47;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                int i6 = i2;
                ManeuverApi maneuverApi = this.write;
                if (i6 != 0) {
                    return new MapboxManeuverApi(new AnalyticsServiceImpl((DistanceFormatterOptions) maneuverApi.serializer.read.MediaSessionCompatResultReceiverWrapper(), 4));
                }
                Boolean boolValueOf = Boolean.valueOf(((FirebaseRemoteConfigImpl) maneuverApi.write).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY());
                int i7 = RemoteActionCompatParcelizer + 27;
                serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return boolValueOf;
            }
        });
        this.MediaDescriptionCompat = BuildersKt.write(getcontentviewgroupparentlayout, prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer, CoroutineStart.LAZY, new MapLayersUiModel$1(this, null, 15));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    public final Object onRouteProgress$mapbox(RouteProgress routeProgress, ContinuationImpl continuationImpl) {
        k4 k4Var;
        RouteProgress routeProgress2;
        ManeuverApi maneuverApi;
        int i = 2 % 2;
        Object obj = null;
        if (!(continuationImpl instanceof k4)) {
            k4Var = new k4(this, continuationImpl);
        } else {
            int i2 = MediaSessionCompatQueueItem + 97;
            MediaSessionCompatResultReceiverWrapper = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = ((k4) continuationImpl).read;
                throw null;
            }
            k4Var = (k4) continuationImpl;
            int i4 = k4Var.read;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                k4Var.read = i4 - Integer.MIN_VALUE;
            } else {
                k4Var = new k4(this, continuationImpl);
            }
        }
        Object objAwaitInternal = k4Var.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = k4Var.read;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objAwaitInternal);
            k4Var.RemoteActionCompatParcelizer = routeProgress;
            k4Var.write = this;
            k4Var.read = 1;
            objAwaitInternal = ((Boolean) this.read.MediaSessionCompatResultReceiverWrapper()).booleanValue() ? this.MediaDescriptionCompat.awaitInternal(k4Var) : (MapboxManeuverApi) this.RatingCompat.MediaSessionCompatResultReceiverWrapper();
            if (objAwaitInternal == coroutineSingletons) {
                return coroutineSingletons;
            }
            routeProgress2 = routeProgress;
            maneuverApi = this;
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            maneuverApi = k4Var.write;
            routeProgress2 = k4Var.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(objAwaitInternal);
        }
        maneuverApi.MediaMetadataCompat = (MapboxManeuverApi) objAwaitInternal;
        MapboxManeuverApi mapboxManeuverApi = this.MediaMetadataCompat;
        Expected maneuvers = mapboxManeuverApi != null ? mapboxManeuverApi.getManeuvers(routeProgress2) : null;
        if (maneuvers != null) {
            maneuvers.fold(new MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0(9), new ArrivalProgressObserver$$ExternalSyntheticLambda0(this, 21, maneuvers));
        }
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i6 = MediaSessionCompatQueueItem + 81;
        MediaSessionCompatResultReceiverWrapper = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return createfromparcel;
        }
        obj.hashCode();
        throw null;
    }
}
