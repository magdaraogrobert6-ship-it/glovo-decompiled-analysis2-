package com.mapbox.navigation.ui.maps.location;

import android.animation.ValueAnimator;
import androidx.sqlite.SQLite;
import com.mapbox.common.location.Location;
import com.mapbox.geojson.Point;
import com.mapbox.maps.plugin.locationcomponent.LocationComponentPluginImpl;
import com.mapbox.maps.plugin.locationcomponent.LocationProvider;
import com.mapbox.maps.plugin.locationcomponent.LocationPuckManager;
import com.mapbox.navigation.ui.maps.internal.location.PuckAnimationEvaluatorInterpolator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Lambda;
import o.accessgetInstancedelegatecp;
import o.createFromParcel;
import o.getQueryParameterslambda2;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class NavigationLocationProvider implements LocationProvider {
    public Location lastLocation;
    public final CopyOnWriteArraySet locationConsumers = new CopyOnWriteArraySet();
    public List lastKeyPoints = instance_delegatelambda0.write;
    public final long puckAnimationDuration = 1000;

    /* JADX INFO: renamed from: com.mapbox.navigation.ui.maps.location.NavigationLocationProvider$notifyLocationUpdates$1, reason: invalid class name */
    public final class AnonymousClass1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM $latLngTransitionOptions;
        public final /* synthetic */ PuckAnimationEvaluatorInterpolator $puckAnimationEvaluatorInterpolator;
        public final /* synthetic */ int $r8$classId = 1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PuckAnimationEvaluatorInterpolator puckAnimationEvaluatorInterpolator, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            super(1);
            this.$puckAnimationEvaluatorInterpolator = puckAnimationEvaluatorInterpolator;
            this.$latLngTransitionOptions = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final Object invoke(Object obj) {
            int i = this.$r8$classId;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.$latLngTransitionOptions;
            NavigationLocationProvider navigationLocationProvider = NavigationLocationProvider.this;
            PuckAnimationEvaluatorInterpolator puckAnimationEvaluatorInterpolator = this.$puckAnimationEvaluatorInterpolator;
            if (i != 0) {
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                valueAnimator.getClass();
                valueAnimator.setInterpolator(puckAnimationEvaluatorInterpolator);
                valueAnimator.setDuration(navigationLocationProvider.puckAnimationDuration);
                if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(valueAnimator);
                }
                return createfromparcel;
            }
            ValueAnimator valueAnimator2 = (ValueAnimator) obj;
            valueAnimator2.getClass();
            valueAnimator2.setDuration(navigationLocationProvider.puckAnimationDuration);
            valueAnimator2.setInterpolator(puckAnimationEvaluatorInterpolator);
            valueAnimator2.setEvaluator(puckAnimationEvaluatorInterpolator);
            if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(valueAnimator2);
            }
            return createfromparcel;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PuckAnimationEvaluatorInterpolator puckAnimationEvaluatorInterpolator, NavigationLocationProvider navigationLocationProvider, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            super(1);
            this.$puckAnimationEvaluatorInterpolator = puckAnimationEvaluatorInterpolator;
            NavigationLocationProvider.this = navigationLocationProvider;
            this.$latLngTransitionOptions = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.ArrayList] */
    public final void notifyLocationUpdates(LocationComponentPluginImpl locationComponentPluginImpl, Location location, List list, NavigationLocationProvider$registerLocationConsumer$1$1 navigationLocationProvider$registerLocationConsumer$1$1, NavigationLocationProvider$registerLocationConsumer$1$1 navigationLocationProvider$registerLocationConsumer$1$2) {
        Point[] pointArr;
        ?? arrayList;
        List list2 = list;
        int i = 0;
        if (list2.isEmpty()) {
            pointArr = new Point[]{Point.fromLngLat(location.getLongitude(), location.getLatitude())};
        } else {
            List<Location> list3 = list;
            ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
            for (Location location2 : list3) {
                arrayList2.add(Point.fromLngLat(location2.getLongitude(), location2.getLatitude()));
            }
            Object[] array = arrayList2.toArray(new Point[0]);
            array.getClass();
            pointArr = (Point[]) array;
        }
        if (list2.isEmpty()) {
            Object[] objArr = {location.getBearing()};
            int iSerializer = getQueryParameterslambda2.serializer();
            arrayList = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
        } else {
            List list4 = list;
            arrayList = new ArrayList(accessgetInstancedelegatecp.write(list4, 10));
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(((Location) it.next()).getBearing());
            }
        }
        ArrayList arrayListRemoteActionCompatParcelizer = onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) arrayList);
        int size = arrayListRemoteActionCompatParcelizer.size();
        double[] dArr = new double[size];
        Iterator it2 = arrayListRemoteActionCompatParcelizer.iterator();
        while (it2.hasNext()) {
            dArr[i] = ((Number) it2.next()).doubleValue();
            i++;
        }
        PuckAnimationEvaluatorInterpolator puckAnimationEvaluatorInterpolator = new PuckAnimationEvaluatorInterpolator(pointArr);
        locationComponentPluginImpl.onLocationUpdated((Point[]) Arrays.copyOf(pointArr, pointArr.length), new AnonymousClass1(puckAnimationEvaluatorInterpolator, navigationLocationProvider$registerLocationConsumer$1$1));
        if (size == 0) {
            return;
        }
        double[] dArrCopyOf = Arrays.copyOf(dArr, size);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(puckAnimationEvaluatorInterpolator, this, navigationLocationProvider$registerLocationConsumer$1$2);
        LocationPuckManager locationPuckManager = locationComponentPluginImpl.locationPuckManager;
        if (locationPuckManager != null) {
            LocationPuckManager.updateCurrentBearing$default(locationPuckManager, Arrays.copyOf(dArrCopyOf, dArrCopyOf.length), anonymousClass1, 4);
        }
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationProvider
    public final void registerLocationConsumer(LocationComponentPluginImpl locationComponentPluginImpl) {
        if (this.locationConsumers.add(locationComponentPluginImpl)) {
            Location location = this.lastLocation;
            List list = this.lastKeyPoints;
            if (location == null || list == null) {
                return;
            }
            notifyLocationUpdates(locationComponentPluginImpl, location, list, NavigationLocationProvider$registerLocationConsumer$1$1.INSTANCE, NavigationLocationProvider$registerLocationConsumer$1$1.INSTANCE$1);
        }
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationProvider
    public final void unRegisterLocationConsumer(LocationComponentPluginImpl locationComponentPluginImpl) {
        this.locationConsumers.remove(locationComponentPluginImpl);
    }

    public static void changePosition$default(NavigationLocationProvider navigationLocationProvider, Location location, List list) {
        navigationLocationProvider.getClass();
        location.getClass();
        list.getClass();
        for (LocationComponentPluginImpl locationComponentPluginImpl : navigationLocationProvider.locationConsumers) {
            locationComponentPluginImpl.getClass();
            navigationLocationProvider.notifyLocationUpdates(locationComponentPluginImpl, location, list, null, null);
        }
        navigationLocationProvider.lastLocation = location;
        navigationLocationProvider.lastKeyPoints = list;
    }
}
