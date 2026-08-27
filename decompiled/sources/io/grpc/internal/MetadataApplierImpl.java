package io.grpc.internal;

import com.google.android.gms.internal.mlkit_vision_face.zzmg;
import com.mapbox.navigation.base.internal.route.parsing.ParsingEntryPoint;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.base.route.RouteAlternativesOptions;
import com.mapbox.navigation.core.routealternatives.RouteAlternativesController$pause$1;
import com.mapbox.navigation.core.trip.session.MapboxTripSession;
import com.mapbox.navigation.navigator.internal.MapboxNativeNavigatorImpl;
import com.mapbox.navigation.utils.internal.ThreadController;
import com.mapbox.navigator.RouteAlternative;
import com.mapbox.navigator.RouteAlternativesControllerInterface;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import io.grpc.Status;
import io.sentry.JsonObjectSerializer;
import io.sentry.SentryClient;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.io.TextStreamsKt;
import o.JsonUtilsExternalSyntheticLambda1;
import o.getCacheMapKey;
import o.getCieXyz;
import o.isAdapterPositionOnScreen;
import o.isValidLogPurchaseInput;
import o.isValidLogPurchaseInputlambda2;
import o.isValidPushStoryClickInput;
import o.mergeJsonObjectslambda10;
import o.r8lambda4JvXn8cf5aij3slyZU_izDVcP_4;
import o.r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0;
import o.r8lambdaHMza2HwvD2qpEDNMeHrXqzjzano;
import o.r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;
import o.setResourcePackageName;

/* JADX INFO: loaded from: classes4.dex */
public final class MetadataApplierImpl {
    public boolean IconCompatParcelizer;
    public final Object MediaBrowserCompatMediaItem;
    public Object MediaDescriptionCompat;
    public final Object MediaMetadataCompat;
    public final Object MediaSessionCompatQueueItem;
    public final Object PlaybackStateCompat;
    public Object RatingCompat;
    public final Object RemoteActionCompatParcelizer;
    public Object read;
    public Object serializer;
    public final Object write;

    public r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0 read() {
        synchronized (this.MediaMetadataCompat) {
            r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0 r8lambda7hj8zhiew8owwyp0e05lxeu0sn0 = (r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0) this.MediaDescriptionCompat;
            if (r8lambda7hj8zhiew8owwyp0e05lxeu0sn0 != null) {
                return r8lambda7hj8zhiew8owwyp0e05lxeu0sn0;
            }
            isValidLogPurchaseInput isvalidlogpurchaseinput = new isValidLogPurchaseInput();
            this.serializer = isvalidlogpurchaseinput;
            this.MediaDescriptionCompat = isvalidlogpurchaseinput;
            return isvalidlogpurchaseinput;
        }
    }

    public void updateNativeObserver(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        AnalyticsServiceImpl analyticsServiceImpl = (AnalyticsServiceImpl) this.serializer;
        boolean z = this.IconCompatParcelizer && ((AnalyticsServiceImpl) this.MediaDescriptionCompat) != null;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        boolean z2 = this.IconCompatParcelizer && ((AnalyticsServiceImpl) this.MediaDescriptionCompat) != null;
        if (z2 && !z) {
            ((RouteAlternativesControllerInterface) this.RatingCompat).addObserver(analyticsServiceImpl);
        }
        if (z2 || !z) {
            return;
        }
        ((RouteAlternativesControllerInterface) this.RatingCompat).removeObserver(analyticsServiceImpl);
    }

    public MetadataApplierImpl(RouteAlternativesOptions routeAlternativesOptions, MapboxNativeNavigatorImpl mapboxNativeNavigatorImpl, MapboxTripSession mapboxTripSession, ThreadController threadController, ParsingEntryPoint parsingEntryPoint) {
        routeAlternativesOptions.getClass();
        threadController.getClass();
        this.PlaybackStateCompat = routeAlternativesOptions;
        this.MediaBrowserCompatMediaItem = mapboxTripSession;
        this.MediaSessionCompatQueueItem = threadController;
        this.RemoteActionCompatParcelizer = parsingEntryPoint;
        this.write = new isAdapterPositionOnScreen(new RouteAlternativesController$pause$1(this, 1));
        this.RatingCompat = setupNativeController(mapboxNativeNavigatorImpl);
        this.MediaMetadataCompat = new LinkedHashMap();
        this.IconCompatParcelizer = true;
        this.serializer = new AnalyticsServiceImpl(9, this);
    }

    public void processAlternativesMetadata(List list, List list2) {
        Object next;
        Object[] objArr;
        list.getClass();
        list2.getClass();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.MediaMetadataCompat;
        linkedHashMap.clear();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            RouteAlternative routeAlternative = (RouteAlternative) it.next();
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                objArr = new Object[]{routeAlternative.getRoute().getRouteId(), ((NavigationRoute) next).id};
            } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue());
            NavigationRoute navigationRoute = (NavigationRoute) next;
            if (navigationRoute != null) {
                String routeId = routeAlternative.getRoute().getRouteId();
                routeId.getClass();
                linkedHashMap.put(routeId, zzmg.mapToMetadata(routeAlternative, navigationRoute));
            }
        }
    }

    public void read(r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0 r8lambda7hj8zhiew8owwyp0e05lxeu0sn0) {
        boolean z;
        TextStreamsKt.RemoteActionCompatParcelizer("already finalized", !this.IconCompatParcelizer);
        this.IconCompatParcelizer = true;
        synchronized (this.MediaMetadataCompat) {
            if (((r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0) this.MediaDescriptionCompat) == null) {
                this.MediaDescriptionCompat = r8lambda7hj8zhiew8owwyp0e05lxeu0sn0;
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            getCacheMapKey getcachemapkey = (getCacheMapKey) ((JsonObjectSerializer) this.read).jsonReflectionObjectSerializer;
            if (getcachemapkey.read.decrementAndGet() == 0) {
                getCacheMapKey.read(getcachemapkey);
                return;
            }
            return;
        }
        TextStreamsKt.RemoteActionCompatParcelizer("delayedStream is null", ((isValidLogPurchaseInput) this.serializer) != null);
        isValidLogPurchaseInputlambda2 isvalidlogpurchaseinputlambda2IconCompatParcelizer = ((isValidLogPurchaseInput) this.serializer).IconCompatParcelizer(r8lambda7hj8zhiew8owwyp0e05lxeu0sn0);
        if (isvalidlogpurchaseinputlambda2IconCompatParcelizer != null) {
            isvalidlogpurchaseinputlambda2IconCompatParcelizer.run();
        }
        getCacheMapKey getcachemapkey2 = (getCacheMapKey) ((JsonObjectSerializer) this.read).jsonReflectionObjectSerializer;
        if (getcachemapkey2.read.decrementAndGet() == 0) {
            getCacheMapKey.read(getcachemapkey2);
        }
    }

    public RouteAlternativesControllerInterface setupNativeController(MapboxNativeNavigatorImpl mapboxNativeNavigatorImpl) {
        RouteAlternativesControllerInterface routeAlternativesControllerInterface = mapboxNativeNavigatorImpl.routeAlternativesController;
        if (routeAlternativesControllerInterface != null) {
            routeAlternativesControllerInterface.setRouteAlternativesOptions(new com.mapbox.navigator.RouteAlternativesOptions((short) (((RouteAlternativesOptions) this.PlaybackStateCompat).intervalMillis / 1000), 8.0f));
            return routeAlternativesControllerInterface;
        }
        removeNodeAtDepth.serializer("routeAlternativesController");
        throw null;
    }

    public void serializer(Status status) {
        TextStreamsKt.read("Cannot fail with OK status", !status.IconCompatParcelizer());
        TextStreamsKt.RemoteActionCompatParcelizer("apply() or fail() already called", !this.IconCompatParcelizer);
        read(new isValidPushStoryClickInput(r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.RemoteActionCompatParcelizer(status), (JsonUtilsExternalSyntheticLambda1[]) this.RatingCompat));
    }

    public MetadataApplierImpl(r8lambdaHMza2HwvD2qpEDNMeHrXqzjzano r8lambdahmza2hwvd2qpednmehrxqzjzano, SentryClient sentryClient, r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa, mergeJsonObjectslambda10 mergejsonobjectslambda10, JsonObjectSerializer jsonObjectSerializer, JsonUtilsExternalSyntheticLambda1[] jsonUtilsExternalSyntheticLambda1Arr) {
        this.MediaMetadataCompat = new Object();
        this.PlaybackStateCompat = r8lambdahmza2hwvd2qpednmehrxqzjzano;
        this.MediaBrowserCompatMediaItem = sentryClient;
        this.MediaSessionCompatQueueItem = r8lambdaqn1du6uas6agx4srbugfttxtpwa;
        this.RemoteActionCompatParcelizer = mergejsonobjectslambda10;
        this.write = setResourcePackageName.read();
        this.read = jsonObjectSerializer;
        this.RatingCompat = jsonUtilsExternalSyntheticLambda1Arr;
    }
}
