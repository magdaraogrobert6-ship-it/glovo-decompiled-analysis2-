package com.mapbox.navigation.tripdata.maneuver.api;

import androidx.room.Room;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzmb;
import com.huawei.agconnect.config.impl.m;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.navigation.base.formatter.DistanceFormatter;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.base.trip.model.RouteLegProgress;
import com.mapbox.navigation.base.trip.model.RouteProgress;
import com.mapbox.navigation.base.trip.model.RouteStepProgress;
import com.mapbox.navigation.tripdata.maneuver.ManeuverProcessor;
import com.mapbox.navigation.tripdata.maneuver.ManeuverResult$GetManeuverListWithProgress$Failure;
import com.mapbox.navigation.tripdata.maneuver.ManeuverResult$GetManeuverListWithProgress$Success;
import com.mapbox.navigation.tripdata.maneuver.ManeuverState;
import com.mapbox.navigation.tripdata.maneuver.model.LegIndexToManeuvers;
import com.mapbox.navigation.tripdata.maneuver.model.ManeuverOptions;
import com.mapbox.navigation.tripdata.maneuver.model.StepIndexToManeuvers;
import com.mapbox.navigation.tripdata.shield.RoadShieldContentManagerContainer;
import com.mapbox.navigation.utils.internal.JobControl;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import io.sentry.util.UrlUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.sequences.SequenceBuilderIterator;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.DrawableTransformation;
import o.SemanticsActionsCustomActions1;
import o.getCieXyz;
import o.getSetSelection;
import o.isAdapterPositionOnScreen;
import o.onBackInvokedlambda0;
import o.onContentCardDismissed;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.verifyOrientationStatuslambda2;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxManeuverApi {
    public final AnalyticsServiceImpl distanceFormatter;
    public final ManeuverOptions maneuverOptions;
    public final ManeuverState maneuverState;
    public final ManeuverProcessor processor;
    public final m routeShieldApi;

    public MapboxManeuverApi(AnalyticsServiceImpl analyticsServiceImpl) {
        ManeuverOptions maneuverOptions = new ManeuverOptions();
        m mVar = new m(10);
        this.distanceFormatter = analyticsServiceImpl;
        this.maneuverOptions = maneuverOptions;
        this.processor = ManeuverProcessor.INSTANCE;
        this.routeShieldApi = mVar;
        new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(0) { // from class: com.mapbox.navigation.tripdata.maneuver.api.MapboxManeuverApi$mainJobController$2
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                onBackInvokedlambda0 onbackinvokedlambda0Serializer = UrlUtils.serializer();
                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                return new JobControl(onbackinvokedlambda0Serializer, YieldKt.RemoteActionCompatParcelizer(Room.read(onbackinvokedlambda0Serializer, MainDispatcherLoader.read)));
            }
        });
        this.maneuverState = new ManeuverState();
    }

    public final void cancel() {
        m mVar = this.routeShieldApi;
        ((RoadShieldContentManagerContainer) mVar.RemoteActionCompatParcelizer).cancelAll();
        SequenceBuilderIterator sequenceBuilderIterator = LazyKt__LazyJVMKt.read((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) ((verifyOrientationStatuslambda2) ((JobControl) mVar.read).job.H_()).write);
        while (sequenceBuilderIterator.hasNext()) {
            ((setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) sequenceBuilderIterator.next()).write(null);
        }
    }

    public final Expected getManeuvers(final RouteProgress routeProgress) {
        SemanticsActionsCustomActions1 maneuverResult$GetManeuverListWithProgress$Success;
        Object next;
        Object next2;
        routeProgress.getClass();
        final ManeuverState maneuverState = this.maneuverState;
        final ManeuverOptions maneuverOptions = this.maneuverOptions;
        final AnalyticsServiceImpl analyticsServiceImpl = this.distanceFormatter;
        Object obj = new Object(routeProgress, maneuverState, maneuverOptions, analyticsServiceImpl) { // from class: com.mapbox.navigation.tripdata.maneuver.ManeuverAction$GetManeuverList
            public final DistanceFormatter distanceFormatter;
            public final ManeuverOptions maneuverOption;
            public final ManeuverState maneuverState;
            public final RouteProgress routeProgress;

            public final int hashCode() {
                int iHashCode = this.routeProgress.hashCode();
                int iHashCode2 = this.maneuverState.hashCode();
                this.maneuverOption.getClass();
                return this.distanceFormatter.hashCode() + ((Boolean.hashCode(true) + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31);
            }

            {
                routeProgress.getClass();
                maneuverState.getClass();
                maneuverOptions.getClass();
                analyticsServiceImpl.getClass();
                this.routeProgress = routeProgress;
                this.maneuverState = maneuverState;
                this.maneuverOption = maneuverOptions;
                this.distanceFormatter = analyticsServiceImpl;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ManeuverAction$GetManeuverList)) {
                    return false;
                }
                ManeuverAction$GetManeuverList maneuverAction$GetManeuverList = (ManeuverAction$GetManeuverList) obj2;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routeProgress, maneuverAction$GetManeuverList.routeProgress}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.maneuverState, maneuverAction$GetManeuverList.maneuverState}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.maneuverOption, maneuverAction$GetManeuverList.maneuverOption}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.distanceFormatter, maneuverAction$GetManeuverList.distanceFormatter}, getCieXyz.write())).booleanValue();
            }

            public final String toString() {
                return "GetManeuverList(routeProgress=" + this.routeProgress + ", maneuverState=" + this.maneuverState + ", maneuverOption=" + this.maneuverOption + ", distanceFormatter=" + this.distanceFormatter + ')';
            }
        };
        this.processor.getClass();
        try {
            NavigationRoute navigationRoute = routeProgress.navigationRoute;
            RouteLegProgress routeLegProgress = routeProgress.currentLegProgress;
            RouteStepProgress routeStepProgress = routeLegProgress.currentStepProgress;
            DirectionsRoute directionsRoute = navigationRoute.directionsRoute;
            int i = routeLegProgress.legIndex;
            int i2 = routeStepProgress.stepIndex;
            Integer num = routeStepProgress.instructionIndex;
            double d = routeStepProgress.distanceRemaining;
            if (num == null) {
                final String str = "instructionIndex is null";
                maneuverResult$GetManeuverListWithProgress$Success = new SemanticsActionsCustomActions1(str) { // from class: com.mapbox.navigation.tripdata.maneuver.ManeuverResult$GetManeuverListWithProgress$Failure
                    public final String error;

                    {
                        this.error = str;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        if (!(obj2 instanceof ManeuverResult$GetManeuverListWithProgress$Failure)) {
                            return false;
                        }
                        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.error, ((ManeuverResult$GetManeuverListWithProgress$Failure) obj2).error}, getCieXyz.write())).booleanValue();
                    }

                    public final String toString() {
                        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("Failure(error="), this.error, ')');
                    }

                    public final int hashCode() {
                        String str2 = this.error;
                        if (str2 == null) {
                            return 0;
                        }
                        return str2.hashCode();
                    }
                };
            } else {
                DirectionsRoute directionsRoute2 = maneuverState.route;
                List list = maneuverState.allManeuvers;
                if (!zzmb.isSameRoute(directionsRoute, directionsRoute2)) {
                    maneuverState.route = directionsRoute;
                    list.clear();
                    ManeuverProcessor.createAllManeuversForRoute(directionsRoute, maneuverState, analyticsServiceImpl);
                }
                int iIntValue = Integer.valueOf(i).intValue();
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((LegIndexToManeuvers) next).legIndex != iIntValue);
                LegIndexToManeuvers legIndexToManeuvers = (LegIndexToManeuvers) next;
                if (legIndexToManeuvers == null) {
                    ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(c8$$ExternalSyntheticOutline0.m(iIntValue, "Could not find leg with index "));
                    legIndexToManeuvers = null;
                }
                ArrayList arrayList = legIndexToManeuvers.stepIndexToManeuvers;
                int iIntValue2 = Integer.valueOf(i2).intValue();
                Iterator it2 = arrayList.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (((StepIndexToManeuvers) next2).stepIndex != iIntValue2);
                StepIndexToManeuvers stepIndexToManeuvers = (StepIndexToManeuvers) next2;
                if (stepIndexToManeuvers == null) {
                    throw new RuntimeException("Could not find step with index " + iIntValue2);
                }
                int iIndexOf = arrayList.indexOf(stepIndexToManeuvers);
                ManeuverProcessor.updateDistanceRemainingForCurrentManeuver(stepIndexToManeuvers, num.intValue(), Double.valueOf(d).doubleValue());
                int iIntValue3 = num.intValue();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(((StepIndexToManeuvers) arrayList.get(iIndexOf)).maneuverList.get(iIntValue3));
                List<StepIndexToManeuvers> listSerializer = onContentCardDismissed.serializer(arrayList, iIndexOf + 1);
                ArrayList arrayList3 = new ArrayList();
                for (StepIndexToManeuvers stepIndexToManeuvers2 : listSerializer) {
                    int size = stepIndexToManeuvers2.maneuverList.size();
                    ArrayList arrayList4 = stepIndexToManeuvers2.maneuverList;
                    if (size > 1) {
                        arrayList3.add(arrayList4.get(0));
                    } else {
                        arrayList3.addAll(arrayList4);
                    }
                }
                arrayList2.addAll(arrayList3);
                maneuverResult$GetManeuverListWithProgress$Success = new ManeuverResult$GetManeuverListWithProgress$Success(arrayList2);
            }
        } catch (Exception e) {
            final String message = e.getMessage();
            maneuverResult$GetManeuverListWithProgress$Success = new SemanticsActionsCustomActions1(message) { // from class: com.mapbox.navigation.tripdata.maneuver.ManeuverResult$GetManeuverListWithProgress$Failure
                public final String error;

                {
                    this.error = message;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof ManeuverResult$GetManeuverListWithProgress$Failure)) {
                        return false;
                    }
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.error, ((ManeuverResult$GetManeuverListWithProgress$Failure) obj2).error}, getCieXyz.write())).booleanValue();
                }

                public final String toString() {
                    return ff$$ExternalSyntheticOutline0.m(new StringBuilder("Failure(error="), this.error, ')');
                }

                public final int hashCode() {
                    String str2 = this.error;
                    if (str2 == null) {
                        return 0;
                    }
                    return str2.hashCode();
                }
            };
        }
        if (maneuverResult$GetManeuverListWithProgress$Success instanceof ManeuverResult$GetManeuverListWithProgress$Success) {
            Expected expectedCreateValue = ExpectedFactory.createValue(((ManeuverResult$GetManeuverListWithProgress$Success) maneuverResult$GetManeuverListWithProgress$Success).maneuvers);
            expectedCreateValue.getClass();
            return expectedCreateValue;
        }
        if (!(maneuverResult$GetManeuverListWithProgress$Success instanceof ManeuverResult$GetManeuverListWithProgress$Failure)) {
            DrawableTransformation.serializer("Inappropriate ", maneuverResult$GetManeuverListWithProgress$Success, " emitted for ", obj, 46);
            return null;
        }
        Expected expectedCreateError = ExpectedFactory.createError(new getSetSelection());
        expectedCreateError.getClass();
        return expectedCreateError;
    }
}
