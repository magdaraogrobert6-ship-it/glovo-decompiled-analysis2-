package com.mapbox.navigation.core;

import androidx.compose.ui.graphics.Fields;
import androidx.room.Room;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import coil3.network.NetworkFetcher$doFetch$fetchResult$1;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_vision_face.zznc;
import com.mapbox.navigation.base.trip.model.RouteProgress;
import com.mapbox.navigation.core.accounts.BillingController$$ExternalSyntheticLambda1;
import com.mapbox.navigation.core.accounts.BillingController$arrivalObserver$1;
import com.mapbox.navigation.core.arrival.ArrivalProgressObserver;
import com.mapbox.navigation.core.directions.session.DirectionsSessionKt;
import com.mapbox.navigation.core.directions.session.MapboxDirectionsSession;
import com.mapbox.navigation.core.preview.RoutesPreview;
import com.mapbox.navigation.core.preview.RoutesPreviewUpdate;
import com.mapbox.navigation.core.trip.session.MapboxTripSession;
import com.mapbox.navigation.core.trip.session.NavigationSession;
import com.mapbox.navigation.core.trip.session.RouteProgressObserver;
import com.mapbox.search.SearchOptionsKt$validateLimit$1;
import com.roadrunner.login.presentation.otp.OtpNavigationKt$$ExternalSyntheticLambda4;
import io.grpc.LoadBalancer$Helper;
import java.util.List;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.internal.ContextScope;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getQueryParameterslambda2;
import o.l4;
import o.l7;
import o.la;
import o.onContentCardDismissed;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxNavigation$prepareNavigationForRoutesParsing$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ int $r8$classId;
    public Object L$0;
    public int label;
    public final /* synthetic */ MapboxNavigation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MapboxNavigation$prepareNavigationForRoutesParsing$2(MapboxNavigation mapboxNavigation, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.$r8$classId = i;
        this.this$0 = mapboxNavigation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = read + 91;
        serializer = i3 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.$r8$classId;
        MapboxNavigation mapboxNavigation = this.this$0;
        int i5 = 3;
        int i6 = 0;
        switch (i4) {
            case 0:
                return new MapboxNavigation$prepareNavigationForRoutesParsing$2(mapboxNavigation, shortNewsContentCardView, i6);
            case 1:
                MapboxNavigation$prepareNavigationForRoutesParsing$2 mapboxNavigation$prepareNavigationForRoutesParsing$2 = new MapboxNavigation$prepareNavigationForRoutesParsing$2(mapboxNavigation, shortNewsContentCardView, 1);
                mapboxNavigation$prepareNavigationForRoutesParsing$2.L$0 = obj;
                return mapboxNavigation$prepareNavigationForRoutesParsing$2;
            case 2:
                MapboxNavigation$prepareNavigationForRoutesParsing$2 mapboxNavigation$prepareNavigationForRoutesParsing$3 = new MapboxNavigation$prepareNavigationForRoutesParsing$2(mapboxNavigation, shortNewsContentCardView, i);
                mapboxNavigation$prepareNavigationForRoutesParsing$3.L$0 = obj;
                return mapboxNavigation$prepareNavigationForRoutesParsing$3;
            case 3:
                MapboxNavigation$prepareNavigationForRoutesParsing$2 mapboxNavigation$prepareNavigationForRoutesParsing$4 = new MapboxNavigation$prepareNavigationForRoutesParsing$2(mapboxNavigation, shortNewsContentCardView, i5);
                mapboxNavigation$prepareNavigationForRoutesParsing$4.L$0 = obj;
                return mapboxNavigation$prepareNavigationForRoutesParsing$4;
            case 4:
                MapboxNavigation$prepareNavigationForRoutesParsing$2 mapboxNavigation$prepareNavigationForRoutesParsing$5 = new MapboxNavigation$prepareNavigationForRoutesParsing$2(mapboxNavigation, shortNewsContentCardView, 4);
                mapboxNavigation$prepareNavigationForRoutesParsing$5.L$0 = obj;
                return mapboxNavigation$prepareNavigationForRoutesParsing$5;
            case 5:
                MapboxNavigation$prepareNavigationForRoutesParsing$2 mapboxNavigation$prepareNavigationForRoutesParsing$6 = new MapboxNavigation$prepareNavigationForRoutesParsing$2(mapboxNavigation, shortNewsContentCardView, 5);
                mapboxNavigation$prepareNavigationForRoutesParsing$6.L$0 = obj;
                return mapboxNavigation$prepareNavigationForRoutesParsing$6;
            case 6:
                MapboxNavigation$prepareNavigationForRoutesParsing$2 mapboxNavigation$prepareNavigationForRoutesParsing$7 = new MapboxNavigation$prepareNavigationForRoutesParsing$2(mapboxNavigation, shortNewsContentCardView, 6);
                mapboxNavigation$prepareNavigationForRoutesParsing$7.L$0 = obj;
                int i7 = read + 71;
                serializer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    return mapboxNavigation$prepareNavigationForRoutesParsing$7;
                }
                obj2.hashCode();
                throw null;
            case 7:
                MapboxNavigation$prepareNavigationForRoutesParsing$2 mapboxNavigation$prepareNavigationForRoutesParsing$8 = new MapboxNavigation$prepareNavigationForRoutesParsing$2(mapboxNavigation, shortNewsContentCardView, 7);
                mapboxNavigation$prepareNavigationForRoutesParsing$8.L$0 = obj;
                int i8 = read + 9;
                serializer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    return mapboxNavigation$prepareNavigationForRoutesParsing$8;
                }
                obj2.hashCode();
                throw null;
            default:
                MapboxNavigation$prepareNavigationForRoutesParsing$2 mapboxNavigation$prepareNavigationForRoutesParsing$9 = new MapboxNavigation$prepareNavigationForRoutesParsing$2(mapboxNavigation, shortNewsContentCardView, 8);
                mapboxNavigation$prepareNavigationForRoutesParsing$9.L$0 = obj;
                int i9 = read + 3;
                serializer = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    int i10 = 69 / 0;
                }
                return mapboxNavigation$prepareNavigationForRoutesParsing$9;
        }
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = read + 59;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        switch (i4) {
            case 0:
                return ((MapboxNavigation$prepareNavigationForRoutesParsing$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 1:
                return ((MapboxNavigation$prepareNavigationForRoutesParsing$2) create((InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 2:
                Object objInvokeSuspend = ((MapboxNavigation$prepareNavigationForRoutesParsing$2) create((InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i5 = read + 37;
                serializer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    return objInvokeSuspend;
                }
                throw null;
            case 3:
                Object objInvokeSuspend2 = ((MapboxNavigation$prepareNavigationForRoutesParsing$2) create((InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i6 = read + 17;
                serializer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return objInvokeSuspend2;
            case 4:
                return ((MapboxNavigation$prepareNavigationForRoutesParsing$2) create((InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 5:
                return ((MapboxNavigation$prepareNavigationForRoutesParsing$2) create((InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 6:
                return ((MapboxNavigation$prepareNavigationForRoutesParsing$2) create((InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 7:
                return ((MapboxNavigation$prepareNavigationForRoutesParsing$2) create((InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            default:
                return ((MapboxNavigation$prepareNavigationForRoutesParsing$2) create((InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        MapboxNavigation mapboxNavigation = this.this$0;
        int i3 = 9;
        int i4 = 8;
        Object obj2 = null;
        switch (i2) {
            case 0:
                DropShadowEffect dropShadowEffect = mapboxNavigation.routesPreviewController;
                MapboxDirectionsSession mapboxDirectionsSession = mapboxNavigation.directionsSession;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    if (DirectionsSessionKt.getRoutesPlusIgnored(mapboxDirectionsSession).size() > 1) {
                        this.L$0 = mapboxNavigation;
                        this.label = 1;
                        SafeContinuation safeContinuation = new SafeContinuation(LoadBalancer$Helper.intercepted(this), CoroutineSingletons.UNDECIDED);
                        mapboxNavigation.setNavigationRoutes(onContentCardDismissed.read(mapboxDirectionsSession.getRoutes(), 1), mapboxNavigation.currentLegIndex(), new MapboxNavigation$prepareNavigationForRoutesParsing$2$1$1(0, safeContinuation));
                        if (safeContinuation.getOrThrow() != coroutineSingletons) {
                        }
                    }
                    return coroutineSingletons;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i6 = read + 37;
                    serializer = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    throw null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                RoutesPreviewUpdate routesPreviewUpdate = (RoutesPreviewUpdate) dropShadowEffect.serializer;
                RoutesPreview routesPreview = routesPreviewUpdate != null ? routesPreviewUpdate.routesPreview : null;
                if (routesPreview == null || routesPreview.routesList.size() <= 1) {
                    return createfromparcel;
                }
                this.L$0 = routesPreview;
                this.label = 2;
                SafeContinuation safeContinuation2 = new SafeContinuation(LoadBalancer$Helper.intercepted(this), CoroutineSingletons.UNDECIDED);
                BuildersKt.RemoteActionCompatParcelizer((ContextScope) dropShadowEffect.RatingCompat, null, null, new NetworkFetcher$doFetch$fetchResult$1(dropShadowEffect, new SearchOptionsKt$validateLimit$1(8, safeContinuation2), (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{routesPreview.originalRoutesList.get(routesPreview.primaryRouteIndex)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()), null), 3);
                if (safeContinuation2.getOrThrow() != coroutineSingletons) {
                    return createfromparcel;
                }
                return coroutineSingletons;
            case 1:
                InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 = (InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    l4 l4Var = new l4(inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, 1);
                    mapboxNavigation.getClass();
                    mapboxNavigation.tripSession.registerLocationObserver(l4Var);
                    OtpNavigationKt$$ExternalSyntheticLambda4 otpNavigationKt$$ExternalSyntheticLambda4 = new OtpNavigationKt$$ExternalSyntheticLambda4(mapboxNavigation, 6, l4Var);
                    this.L$0 = null;
                    this.label = 1;
                    return Room.awaitClose(inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, otpNavigationKt$$ExternalSyntheticLambda4, this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
                }
                int i8 = read + 83;
                serializer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0 ? i7 != 1 : i7 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            case 2:
                InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback2 = (InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 != 0) {
                    if (i9 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                BillingController$$ExternalSyntheticLambda1 billingController$$ExternalSyntheticLambda1 = new BillingController$$ExternalSyntheticLambda1(1, inAppMessageBackEventHandler1inAppMessageBackAnimationCallback2);
                mapboxNavigation.getClass();
                NavigationSession navigationSession = mapboxNavigation.navigationSession;
                navigationSession.stateObservers.add(billingController$$ExternalSyntheticLambda1);
                billingController$$ExternalSyntheticLambda1.onNavigationSessionStateChanged(navigationSession.state);
                OtpNavigationKt$$ExternalSyntheticLambda4 otpNavigationKt$$ExternalSyntheticLambda5 = new OtpNavigationKt$$ExternalSyntheticLambda4(mapboxNavigation, 7, billingController$$ExternalSyntheticLambda1);
                this.L$0 = null;
                this.label = 1;
                if (Room.awaitClose(inAppMessageBackEventHandler1inAppMessageBackAnimationCallback2, otpNavigationKt$$ExternalSyntheticLambda5, this) != coroutineSingletons3) {
                    return createfromparcel;
                }
                int i10 = read + 51;
                serializer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                return coroutineSingletons3;
            case 3:
                InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback3 = (InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) this.L$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 != 0) {
                    if (i12 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                l4 l4Var2 = new l4(inAppMessageBackEventHandler1inAppMessageBackAnimationCallback3, 0);
                mapboxNavigation.getClass();
                mapboxNavigation.tripSession.registerLocationObserver(l4Var2);
                OtpNavigationKt$$ExternalSyntheticLambda4 otpNavigationKt$$ExternalSyntheticLambda6 = new OtpNavigationKt$$ExternalSyntheticLambda4(mapboxNavigation, i4, l4Var2);
                this.L$0 = null;
                this.label = 1;
                return Room.awaitClose(inAppMessageBackEventHandler1inAppMessageBackAnimationCallback3, otpNavigationKt$$ExternalSyntheticLambda6, this) == coroutineSingletons4 ? coroutineSingletons4 : createfromparcel;
            case 4:
                InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback4 = (InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) this.L$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 != 0) {
                    int i14 = serializer + 29;
                    read = i14 % Fields.SpotShadowColor;
                    if (i14 % 2 != 0 ? i13 != 1 : i13 != 0) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                BillingController$arrivalObserver$1 billingController$arrivalObserver$1 = new BillingController$arrivalObserver$1(1, inAppMessageBackEventHandler1inAppMessageBackAnimationCallback4);
                mapboxNavigation.getClass();
                ArrivalProgressObserver arrivalProgressObserver = mapboxNavigation.arrivalProgressObserver;
                arrivalProgressObserver.getClass();
                arrivalProgressObserver.arrivalObservers.add(billingController$arrivalObserver$1);
                OtpNavigationKt$$ExternalSyntheticLambda4 otpNavigationKt$$ExternalSyntheticLambda7 = new OtpNavigationKt$$ExternalSyntheticLambda4(mapboxNavigation, i3, billingController$arrivalObserver$1);
                this.L$0 = null;
                this.label = 1;
                return Room.awaitClose(inAppMessageBackEventHandler1inAppMessageBackAnimationCallback4, otpNavigationKt$$ExternalSyntheticLambda7, this) == coroutineSingletons5 ? coroutineSingletons5 : createfromparcel;
            case 5:
                InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback5 = (InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) this.L$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 != 0) {
                    if (i15 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i16 = read + 119;
                    serializer = i16 % Fields.SpotShadowColor;
                    if (i16 % 2 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    obj2.hashCode();
                    throw null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                l7 l7Var = new l7(inAppMessageBackEventHandler1inAppMessageBackAnimationCallback5);
                zznc zzncVar = mapboxNavigation.rerouteController;
                if (zzncVar != null) {
                    zzncVar.registerRerouteStateObserver(l7Var);
                }
                OtpNavigationKt$$ExternalSyntheticLambda4 otpNavigationKt$$ExternalSyntheticLambda8 = new OtpNavigationKt$$ExternalSyntheticLambda4(mapboxNavigation, 11, l7Var);
                this.L$0 = null;
                this.label = 1;
                if (Room.awaitClose(inAppMessageBackEventHandler1inAppMessageBackAnimationCallback5, otpNavigationKt$$ExternalSyntheticLambda8, this) != coroutineSingletons6) {
                    return createfromparcel;
                }
                int i17 = read + 9;
                serializer = i17 % Fields.SpotShadowColor;
                if (i17 % 2 == 0) {
                    return coroutineSingletons6;
                }
                throw null;
            case 6:
                final InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback6 = (InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) this.L$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 != 0) {
                    int i19 = serializer + 115;
                    read = i19 % Fields.SpotShadowColor;
                    if (i19 % 2 != 0 ? i18 != 1 : i18 != 0) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                RouteProgressObserver routeProgressObserver = new RouteProgressObserver() { // from class: o.l8
                    private static int RemoteActionCompatParcelizer = 1;
                    private static int read;

                    @Override // com.mapbox.navigation.core.trip.session.RouteProgressObserver
                    public final void onRouteProgressChanged(RouteProgress routeProgress) {
                        int i20 = 2 % 2;
                        int i21 = read + 39;
                        RemoteActionCompatParcelizer = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i22 = i21 % 2;
                        ((ProducerCoroutine) inAppMessageBackEventHandler1inAppMessageBackAnimationCallback6).b_(routeProgress);
                        int i23 = RemoteActionCompatParcelizer + 29;
                        read = i23 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i24 = i23 % 2;
                    }
                };
                mapboxNavigation.getClass();
                mapboxNavigation.tripSession.registerRouteProgressObserver(routeProgressObserver);
                OtpNavigationKt$$ExternalSyntheticLambda4 otpNavigationKt$$ExternalSyntheticLambda9 = new OtpNavigationKt$$ExternalSyntheticLambda4(mapboxNavigation, 12, routeProgressObserver);
                this.L$0 = null;
                this.label = 1;
                if (Room.awaitClose(inAppMessageBackEventHandler1inAppMessageBackAnimationCallback6, otpNavigationKt$$ExternalSyntheticLambda9, this) != coroutineSingletons7) {
                    return createfromparcel;
                }
                int i20 = serializer + 95;
                read = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
                return coroutineSingletons7;
            case 7:
                InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback7 = (InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) this.L$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    MapboxNavigation$$ExternalSyntheticLambda3 mapboxNavigation$$ExternalSyntheticLambda3 = new MapboxNavigation$$ExternalSyntheticLambda3(2, inAppMessageBackEventHandler1inAppMessageBackAnimationCallback7);
                    mapboxNavigation.registerRoutesObserver(mapboxNavigation$$ExternalSyntheticLambda3);
                    OtpNavigationKt$$ExternalSyntheticLambda4 otpNavigationKt$$ExternalSyntheticLambda10 = new OtpNavigationKt$$ExternalSyntheticLambda4(mapboxNavigation, 13, mapboxNavigation$$ExternalSyntheticLambda3);
                    this.L$0 = null;
                    this.label = 1;
                    return Room.awaitClose(inAppMessageBackEventHandler1inAppMessageBackAnimationCallback7, otpNavigationKt$$ExternalSyntheticLambda10, this) == coroutineSingletons8 ? coroutineSingletons8 : createfromparcel;
                }
                int i23 = read + 115;
                serializer = i23 % Fields.SpotShadowColor;
                if (i23 % 2 == 0 ? i22 != 1 : i22 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            default:
                InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback8 = (InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) this.L$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 != 0) {
                    int i25 = serializer + 21;
                    read = i25 % Fields.SpotShadowColor;
                    if (i25 % 2 != 0 ? i24 != 1 : i24 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                la laVar = new la(inAppMessageBackEventHandler1inAppMessageBackAnimationCallback8);
                mapboxNavigation.getClass();
                MapboxTripSession mapboxTripSession = mapboxNavigation.tripSession;
                mapboxTripSession.getClass();
                mapboxTripSession.voiceInstructionsObservers.add(laVar);
                OtpNavigationKt$$ExternalSyntheticLambda4 otpNavigationKt$$ExternalSyntheticLambda11 = new OtpNavigationKt$$ExternalSyntheticLambda4(mapboxNavigation, 14, laVar);
                this.L$0 = null;
                this.label = 1;
                return Room.awaitClose(inAppMessageBackEventHandler1inAppMessageBackAnimationCallback8, otpNavigationKt$$ExternalSyntheticLambda11, this) == coroutineSingletons9 ? coroutineSingletons9 : createfromparcel;
        }
    }
}
