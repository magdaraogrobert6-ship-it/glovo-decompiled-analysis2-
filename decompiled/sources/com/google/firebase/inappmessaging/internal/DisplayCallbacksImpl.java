package com.google.firebase.inappmessaging.internal;

import android.os.HandlerThread;
import android.os.SystemClock;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$$ExternalSyntheticLambda0;
import com.braze.location.GooglePlayLocationUtils$$ExternalSyntheticLambda18;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.tasks.zzw;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.CampaignImpression;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.CampaignImpressionList;
import com.google.protobuf.FieldType$$ExternalSyntheticBUOutline0;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.Cancelable;
import com.mapbox.common.location.DeviceLocationProvider;
import com.mapbox.common.location.DeviceLocationProviderType;
import com.mapbox.common.location.ExtendedLocationProviderParameters;
import com.mapbox.common.location.Location;
import com.mapbox.common.location.LocationError;
import com.mapbox.common.location.LocationProvider;
import com.mapbox.common.location.LocationService;
import com.mapbox.common.location.LocationServiceFactory;
import com.mapbox.navigation.base.options.LocationOptions;
import com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda4;
import com.mapbox.navigation.core.replay.MapboxReplayer;
import com.mapbox.navigation.core.trip.session.TripSessionLocationEngine$1;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.search.SearchOptionsKt$validateLimit$1;
import com.mapbox.search.base.location.LocationEngineAdapter$$ExternalSyntheticLambda0;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Scheduler;
import io.reactivex.functions.Action;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.completable.CompletableAndThenCompletable;
import io.reactivex.internal.operators.completable.CompletableFromAction;
import io.reactivex.internal.operators.completable.CompletableOnErrorComplete;
import io.reactivex.internal.operators.completable.CompletablePeek;
import io.reactivex.internal.operators.maybe.MaybeFlatMapCompletable;
import io.reactivex.internal.operators.maybe.MaybeFromCallable;
import io.reactivex.internal.operators.maybe.MaybeOnErrorNext;
import io.reactivex.internal.operators.maybe.MaybePeek;
import io.reactivex.internal.operators.maybe.MaybeSubscribeOn;
import io.reactivex.internal.operators.maybe.MaybeSwitchIfEmpty;
import io.sentry.HostnameCache$$ExternalSyntheticLambda1;
import o.AndroidPlatformTextInputSessionstartInputMethod3;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.OwnerSnapshotObserveronCommitAffectingLookahead1;
import o.OwnerSnapshotObserveronCommitAffectingMeasure1;
import o.ParentDataModifierDefaultImpls;
import o.ParentDataModifierNode;
import o.TraversableNodeCompanionTraverseDescendantsAction;
import o.TraversableNodeKt;
import o.disposeComposition;
import o.getHasComposition;
import o.getShowLayoutBoundsannotations;
import o.internalOnMeasureui;
import o.isAdapterPositionOnScreen;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class DisplayCallbacksImpl implements OwnerSnapshotObserveronCommitAffectingLookahead1 {
    public Object IconCompatParcelizer;
    public Object MediaBrowserCompatMediaItem;
    public final Object MediaDescriptionCompat;
    public final Object MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public Object RatingCompat;
    public final Object RemoteActionCompatParcelizer;
    public final Object read;
    public final Object serializer;
    public final Object write;

    public DisplayCallbacksImpl(LocationOptions locationOptions) {
        TripSessionLocationEngine$1 tripSessionLocationEngine$1 = TripSessionLocationEngine$1.INSTANCE;
        locationOptions.getClass();
        this.RemoteActionCompatParcelizer = tripSessionLocationEngine$1;
        this.write = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(0) { // from class: com.mapbox.navigation.core.trip.session.TripSessionLocationEngine$mapboxReplayer$2
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                return new MapboxReplayer();
            }
        });
        new isAdapterPositionOnScreen(new SearchOptionsKt$validateLimit$1(14, this));
        this.IconCompatParcelizer = TripSessionLocationEngine$1.INSTANCE$1;
        this.MediaSessionCompatQueueItem = true;
        HandlerThread handlerThread = new HandlerThread("locations inputs thread", -1);
        handlerThread.start();
        this.MediaMetadataCompat = handlerThread;
        this.serializer = new MapboxNavigation$$ExternalSyntheticLambda4(12, this);
        this.read = new LocationEngineAdapter$$ExternalSyntheticLambda0(1, this);
        DeviceLocationProviderType deviceLocationProviderType = DeviceLocationProviderType.BEST;
        LocationService orCreate = LocationServiceFactory.getOrCreate();
        ExtendedLocationProviderParameters.Builder builderDeviceLocationProviderType = new ExtendedLocationProviderParameters.Builder().looper(handlerThread.getLooper()).deviceLocationProviderType(deviceLocationProviderType);
        if (deviceLocationProviderType == DeviceLocationProviderType.ANDROID) {
            builderDeviceLocationProviderType.locationProviderName("gps");
        }
        ExtendedLocationProviderParameters extendedLocationProviderParametersBuild = builderDeviceLocationProviderType.build();
        extendedLocationProviderParametersBuild.getClass();
        Expected<LocationError, DeviceLocationProvider> deviceLocationProvider = orCreate.getDeviceLocationProvider(extendedLocationProviderParametersBuild, locationOptions.request);
        if (deviceLocationProvider.isError()) {
            StringBuilder sb = new StringBuilder("Location updates are not possible: could not find suitable location provider. Error code: ");
            LocationError error = deviceLocationProvider.getError();
            error.getClass();
            sb.append(error.getCode());
            sb.append(", message: ");
            LocationError error2 = deviceLocationProvider.getError();
            error2.getClass();
            sb.append(error2.getMessage());
            sb.append('.');
            LoggerProviderKt.logW("TripSessionLocationEngine", sb.toString());
        }
        this.MediaDescriptionCompat = deviceLocationProvider.getValue();
    }

    public static zzw serializer(Maybe maybe, Scheduler scheduler) {
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = new ParentDataModifierDefaultImpls();
        MaybeOnErrorNext maybeOnErrorNext = new MaybeOnErrorNext(new MaybeSwitchIfEmpty(new MaybePeek(maybe, new TraversableNodeCompanionTraverseDescendantsAction(parentDataModifierDefaultImpls), Functions.serializer), new MaybeFromCallable(new HostnameCache$$ExternalSyntheticLambda1(6, parentDataModifierDefaultImpls))), new TraversableNodeCompanionTraverseDescendantsAction(parentDataModifierDefaultImpls));
        ObjectHelper.write(scheduler, "scheduler is null");
        new MaybeSubscribeOn(maybeOnErrorNext, scheduler).subscribe();
        return parentDataModifierDefaultImpls.RemoteActionCompatParcelizer;
    }

    public zzw IconCompatParcelizer(ParentDataModifierNode parentDataModifierNode) {
        if (!((zzbv) this.serializer).write()) {
            IconCompatParcelizer("message dismissal to metrics logger");
            return new zzw();
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.RemoteActionCompatParcelizer();
        CompletableFromAction completableFromAction = new CompletableFromAction(new CaptureRequestOptions$Builder$$ExternalSyntheticLambda0(this, 23, parentDataModifierNode));
        if (!this.MediaSessionCompatQueueItem) {
            serializer();
        }
        return serializer(completableFromAction.serializer(), ((getShowLayoutBoundsannotations) this.MediaDescriptionCompat).IconCompatParcelizer);
    }

    public void IconCompatParcelizer(String str) {
        if (((internalOnMeasureui) this.read).MediaDescriptionCompat.write) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.RemoteActionCompatParcelizer();
        } else if (((zzbv) this.serializer).write()) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.RemoteActionCompatParcelizer();
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.RemoteActionCompatParcelizer();
        }
    }

    public Completable read() {
        String str = (String) ((internalOnMeasureui) this.read).MediaDescriptionCompat.RatingCompat;
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.RemoteActionCompatParcelizer();
        ImpressionStorageClient impressionStorageClient = (ImpressionStorageClient) this.RemoteActionCompatParcelizer;
        AndroidPlatformTextInputSessionstartInputMethod3 androidPlatformTextInputSessionstartInputMethod3NewBuilder = CampaignImpression.newBuilder();
        ((disposeComposition) this.write).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        androidPlatformTextInputSessionstartInputMethod3NewBuilder.RemoteActionCompatParcelizer();
        ((CampaignImpression) androidPlatformTextInputSessionstartInputMethod3NewBuilder.RemoteActionCompatParcelizer).setImpressionTimestampMillis(jCurrentTimeMillis);
        androidPlatformTextInputSessionstartInputMethod3NewBuilder.RemoteActionCompatParcelizer();
        ((CampaignImpression) androidPlatformTextInputSessionstartInputMethod3NewBuilder.RemoteActionCompatParcelizer).setCampaignId(str);
        CampaignImpression campaignImpression = (CampaignImpression) androidPlatformTextInputSessionstartInputMethod3NewBuilder.serializer();
        MaybePeek maybePeekIconCompatParcelizer = impressionStorageClient.IconCompatParcelizer();
        CampaignImpressionList campaignImpressionList = ImpressionStorageClient.read;
        ObjectHelper.write(campaignImpressionList, "defaultItem is null");
        MaybeFlatMapCompletable maybeFlatMapCompletable = new MaybeFlatMapCompletable(new MaybeSwitchIfEmpty(maybePeekIconCompatParcelizer, Maybe.RemoteActionCompatParcelizer(campaignImpressionList)), new CaptureRequestOptions$Builder$$ExternalSyntheticLambda0(impressionStorageClient, 24, campaignImpression));
        GooglePlayLocationUtils$$ExternalSyntheticLambda18 googlePlayLocationUtils$$ExternalSyntheticLambda18 = new GooglePlayLocationUtils$$ExternalSyntheticLambda18(28);
        Action action = Functions.read;
        CompletablePeek completablePeekSerializer = new CompletablePeek(maybeFlatMapCompletable, googlePlayLocationUtils$$ExternalSyntheticLambda18, action).serializer(new GooglePlayLocationUtils$$ExternalSyntheticLambda18(29));
        if (!((String) this.MediaBrowserCompatMediaItem).equals("ON_FOREGROUND")) {
            return completablePeekSerializer;
        }
        RateLimiterClient rateLimiterClient = (RateLimiterClient) this.RatingCompat;
        getHasComposition gethascomposition = (getHasComposition) this.IconCompatParcelizer;
        MaybePeek maybePeekRemoteActionCompatParcelizer = rateLimiterClient.RemoteActionCompatParcelizer();
        RateLimitProto$RateLimit rateLimitProto$RateLimit = RateLimiterClient.write;
        ObjectHelper.write(rateLimitProto$RateLimit, "defaultItem is null");
        return new CompletableAndThenCompletable(new CompletableOnErrorComplete(new CompletablePeek(new MaybeFlatMapCompletable(new MaybeSwitchIfEmpty(maybePeekRemoteActionCompatParcelizer, Maybe.RemoteActionCompatParcelizer(rateLimitProto$RateLimit)), new RateLimiterClient$$ExternalSyntheticLambda0(rateLimiterClient, gethascomposition, 0)), new FieldType$$ExternalSyntheticBUOutline0(1), action).serializer(new FieldType$$ExternalSyntheticBUOutline0(2))), completablePeekSerializer);
    }

    public zzw serializer() {
        if (!((zzbv) this.serializer).write() || this.MediaSessionCompatQueueItem) {
            IconCompatParcelizer("message impression to metrics logger");
            return new zzw();
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.RemoteActionCompatParcelizer();
        return serializer(new CompletableAndThenCompletable(new CompletableAndThenCompletable(read(), new CompletableFromAction(new TraversableNodeKt(this, 0))), new CompletableFromAction(new TraversableNodeKt(this, 2))).serializer(), ((getShowLayoutBoundsannotations) this.MediaDescriptionCompat).IconCompatParcelizer);
    }

    public void stopLocationUpdates() {
        this.IconCompatParcelizer = TripSessionLocationEngine$1.INSTANCE$2;
        LocationProvider locationProvider = (LocationProvider) this.RatingCompat;
        if (locationProvider != null) {
            locationProvider.removeLocationObserver((LocationEngineAdapter$$ExternalSyntheticLambda0) this.read);
            Cancelable cancelable = (Cancelable) this.MediaBrowserCompatMediaItem;
            if (cancelable != null) {
                cancelable.cancel();
            }
        }
        this.RatingCompat = null;
    }

    public zzw write(OwnerSnapshotObserveronCommitAffectingMeasure1 ownerSnapshotObserveronCommitAffectingMeasure1) {
        if (!((zzbv) this.serializer).write()) {
            IconCompatParcelizer("render error to metrics logger");
            return new zzw();
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.RemoteActionCompatParcelizer();
        return serializer(new CompletableAndThenCompletable(new CompletableAndThenCompletable(read(), new CompletableFromAction(new CaptureRequestOptions$Builder$$ExternalSyntheticLambda0(this, 22, ownerSnapshotObserveronCommitAffectingMeasure1))), new CompletableFromAction(new TraversableNodeKt(this, 2))).serializer(), ((getShowLayoutBoundsannotations) this.MediaDescriptionCompat).IconCompatParcelizer);
    }

    public void handleReceivedLocation(Location location) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        Long monotonicTimestamp = location.getMonotonicTimestamp();
        Long lValueOf = monotonicTimestamp != null ? Long.valueOf((jElapsedRealtimeNanos - monotonicTimestamp.longValue()) / 1000000) : null;
        if (lValueOf == null || lValueOf.longValue() > 500) {
            LoggerProviderKt.logW("Got an obsolete location: age = " + lValueOf + " ms", "TripSessionLocationEngine");
        }
        ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.IconCompatParcelizer).invoke(location);
    }

    public DisplayCallbacksImpl(ImpressionStorageClient impressionStorageClient, disposeComposition disposecomposition, getShowLayoutBoundsannotations getshowlayoutboundsannotations, RateLimiterClient rateLimiterClient, getHasComposition gethascomposition, MetricsLoggerClient metricsLoggerClient, zzbv zzbvVar, internalOnMeasureui internalonmeasureui, String str) {
        this.RemoteActionCompatParcelizer = impressionStorageClient;
        this.write = disposecomposition;
        this.MediaDescriptionCompat = getshowlayoutboundsannotations;
        this.RatingCompat = rateLimiterClient;
        this.IconCompatParcelizer = gethascomposition;
        this.MediaMetadataCompat = metricsLoggerClient;
        this.serializer = zzbvVar;
        this.read = internalonmeasureui;
        this.MediaBrowserCompatMediaItem = str;
        this.MediaSessionCompatQueueItem = false;
    }
}
