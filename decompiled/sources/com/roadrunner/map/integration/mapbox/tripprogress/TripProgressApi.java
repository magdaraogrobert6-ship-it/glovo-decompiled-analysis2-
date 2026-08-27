package com.roadrunner.map.integration.mapbox.tripprogress;

import android.app.Application;
import android.content.Context;
import androidx.compose.ui.graphics.Fields;
import androidx.navigation.internal.NavContext;
import coil3.ExtrasKt;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.wisesecurity.ucs_credential.g0;
import com.mapbox.navigation.base.formatter.DistanceFormatterOptions;
import com.mapbox.navigation.base.trip.model.RouteProgress;
import com.mapbox.navigation.tripdata.progress.api.MapboxTripProgressApi;
import com.mapbox.navigation.tripdata.progress.model.TripProgressUpdateFormatter;
import com.mapbox.navigation.tripdata.progress.model.TripProgressUpdateValue;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.roadrunner.map.container.maplayer.MapLayersUiModel$1;
import com.roadrunner.map.integration.mapbox.tripprogress.TripProgressApi;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DeferredCoroutine;
import o.createFromParcel;
import o.gd;
import o.getContentViewGroupParentLayout;
import o.isAdapterPositionOnScreen;
import o.isOpenInternalroom_runtime;
import o.k6;
import o.n2;
import o.n6;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.transferSessionPackageI;

/* JADX INFO: loaded from: classes3.dex */
public final class TripProgressApi {
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public final Application IconCompatParcelizer;
    public final isAdapterPositionOnScreen MediaBrowserCompatMediaItem;
    public final n6 MediaMetadataCompat;
    public final DeferredCoroutine MediaSessionCompatQueueItem;
    public final transferSessionPackageI RemoteActionCompatParcelizer;
    public final isAdapterPositionOnScreen read;
    public final k6 serializer;
    public final getContentViewGroupParentLayout write;

    public TripProgressApi(Application application, k6 k6Var, transferSessionPackageI transfersessionpackagei, n6 n6Var, getContentViewGroupParentLayout getcontentviewgroupparentlayout, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        this.IconCompatParcelizer = application;
        this.serializer = k6Var;
        this.RemoteActionCompatParcelizer = transfersessionpackagei;
        this.MediaMetadataCompat = n6Var;
        this.write = getcontentviewgroupparentlayout;
        final int i = 0;
        this.read = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.n3
            private static int RemoteActionCompatParcelizer = 0;
            private static int read = 1;
            public final /* synthetic */ TripProgressApi serializer;

            {
                this.serializer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = RemoteActionCompatParcelizer + 91;
                read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                int i5 = i;
                TripProgressApi tripProgressApi = this.serializer;
                if (i5 != 0) {
                    MapboxTripProgressApi mapboxTripProgressApiWrite = tripProgressApi.write();
                    int i6 = RemoteActionCompatParcelizer + 115;
                    read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return mapboxTripProgressApiWrite;
                }
                Boolean boolValueOf = Boolean.valueOf(((FirebaseRemoteConfigImpl) tripProgressApi.RemoteActionCompatParcelizer).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY());
                int i8 = RemoteActionCompatParcelizer + 33;
                read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return boolValueOf;
            }
        });
        final int i2 = 1;
        this.MediaBrowserCompatMediaItem = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.n3
            private static int RemoteActionCompatParcelizer = 0;
            private static int read = 1;
            public final /* synthetic */ TripProgressApi serializer;

            {
                this.serializer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = RemoteActionCompatParcelizer + 91;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                int i6 = i2;
                TripProgressApi tripProgressApi = this.serializer;
                if (i6 != 0) {
                    MapboxTripProgressApi mapboxTripProgressApiWrite = tripProgressApi.write();
                    int i7 = RemoteActionCompatParcelizer + 115;
                    read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    return mapboxTripProgressApiWrite;
                }
                Boolean boolValueOf = Boolean.valueOf(((FirebaseRemoteConfigImpl) tripProgressApi.RemoteActionCompatParcelizer).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY());
                int i9 = RemoteActionCompatParcelizer + 33;
                read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return boolValueOf;
            }
        });
        this.MediaSessionCompatQueueItem = BuildersKt.write(getcontentviewgroupparentlayout, prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer, CoroutineStart.LAZY, new MapLayersUiModel$1(this, null, 16));
    }

    public final MapboxTripProgressApi write() {
        int i = 2 % 2;
        Context applicationContext = this.IconCompatParcelizer.getApplicationContext();
        DistanceFormatterOptions distanceFormatterOptions = (DistanceFormatterOptions) this.serializer.read.MediaSessionCompatResultReceiverWrapper();
        applicationContext.getClass();
        DropShadowEffect dropShadowEffect = new DropShadowEffect(applicationContext);
        dropShadowEffect.distanceRemainingFormatter(new AnalyticsServiceImpl(distanceFormatterOptions, 15));
        dropShadowEffect.timeRemainingFormatter(new NavContext(applicationContext, 13));
        dropShadowEffect.percentRouteTraveledFormatter(new g0());
        dropShadowEffect.estimatedTimeToArrivalFormatter(new AnalyticsServiceImpl(applicationContext));
        MapboxTripProgressApi mapboxTripProgressApi = new MapboxTripProgressApi(dropShadowEffect.build());
        int i2 = RatingCompat + 121;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 86 / 0;
        }
        return mapboxTripProgressApi;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b A[PHI: r1 r3
  0x002b: PHI (r1v10 o.n2) = (r1v9 o.n2), (r1v12 o.n2) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x002b: PHI (r3v4 int) = (r3v3 int), (r3v6 int) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    public final Object onRouteProgress$mapbox(RouteProgress routeProgress, ContinuationImpl continuationImpl) {
        n2 n2Var;
        int i;
        int i2 = 2 % 2;
        if (continuationImpl instanceof n2) {
            int i3 = MediaDescriptionCompat + 47;
            RatingCompat = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                n2Var = (n2) continuationImpl;
                i = n2Var.serializer;
                int i4 = 41 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    n2Var.serializer = i - Integer.MIN_VALUE;
                } else {
                    n2Var = new n2(this, continuationImpl);
                }
            } else {
                n2Var = (n2) continuationImpl;
                i = n2Var.serializer;
                if ((i & Integer.MIN_VALUE) != 0) {
                    n2Var.serializer = i - Integer.MIN_VALUE;
                } else {
                    n2Var = new n2(this, continuationImpl);
                }
            }
        } else {
            n2Var = new n2(this, continuationImpl);
        }
        Object objAwaitInternal = n2Var.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = n2Var.serializer;
        Object obj = null;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objAwaitInternal);
            n2Var.read = routeProgress;
            n2Var.serializer = 1;
            if (((Boolean) this.read.MediaSessionCompatResultReceiverWrapper()).booleanValue()) {
                int i6 = RatingCompat + 11;
                MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    this.MediaSessionCompatQueueItem.awaitInternal(n2Var);
                    throw null;
                }
                objAwaitInternal = this.MediaSessionCompatQueueItem.awaitInternal(n2Var);
            } else {
                objAwaitInternal = (MapboxTripProgressApi) this.MediaBrowserCompatMediaItem.MediaSessionCompatResultReceiverWrapper();
            }
            if (objAwaitInternal == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i7 = MediaDescriptionCompat + 77;
                RatingCompat = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return null;
            }
            int i9 = MediaDescriptionCompat + 23;
            RatingCompat = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                RouteProgress routeProgress2 = n2Var.read;
                ExtrasKt.RemoteActionCompatParcelizer(objAwaitInternal);
                obj.hashCode();
                throw null;
            }
            routeProgress = n2Var.read;
            ExtrasKt.RemoteActionCompatParcelizer(objAwaitInternal);
        }
        TripProgressUpdateValue tripProgress = ((MapboxTripProgressApi) objAwaitInternal).getTripProgress(routeProgress);
        TripProgressUpdateFormatter formatter = tripProgress.getFormatter();
        String string = formatter.getTimeRemaining(tripProgress.getCurrentLegTimeRemaining()).toString();
        string.getClass();
        double distanceRemaining = tripProgress.getDistanceRemaining();
        String string2 = formatter.getDistanceRemaining(tripProgress.getDistanceRemaining()).toString();
        string2.getClass();
        this.MediaMetadataCompat.read.write(new gd(distanceRemaining, string, string2));
        return createFromParcel.INSTANCE;
    }
}
