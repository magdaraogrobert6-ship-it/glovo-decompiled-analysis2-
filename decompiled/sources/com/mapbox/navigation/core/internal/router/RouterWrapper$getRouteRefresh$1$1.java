package com.mapbox.navigation.core.internal.router;

import android.os.SystemClock;
import androidx.lifecycle.BlockRunner;
import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.network.okhttp.internal.CallsKt$await$2$2;
import com.huawei.wisesecurity.ucs_credential.x;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.LoggingLevel;
import com.mapbox.navigation.base.internal.RouteRefreshRequestData;
import com.mapbox.navigation.base.internal.performance.AsyncSection;
import com.mapbox.navigation.base.internal.performance.PerformanceTracker;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.mapbox.navigator.RouteRefreshOptions;
import com.mapbox.navigator.RouterError;
import com.mapbox.navigator.RouterInterface;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.getContentViewGroupParentLayout;
import o.isCurrentlyDisplayingInAppMessage;
import o.onContentCardDismissed;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
public final class RouterWrapper$getRouteRefresh$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ CallsKt$await$2$2 $callback;
    public final /* synthetic */ createInAppMessageEventSubscriber $id;
    public final /* synthetic */ RouterInterface $originRouter;
    public final /* synthetic */ RouteRefreshOptions $refreshOptions;
    public final /* synthetic */ String $requestUuid;
    public final /* synthetic */ Expected $result;
    public final /* synthetic */ NavigationRoute $route;
    public final /* synthetic */ RouteRefreshRequestData $routeRefreshRequestData;
    public final /* synthetic */ AsyncSection $routeRefreshSection;
    public final /* synthetic */ BlockRunner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouterWrapper$getRouteRefresh$1$1(AsyncSection asyncSection, BlockRunner blockRunner, createInAppMessageEventSubscriber createinappmessageeventsubscriber, RouterInterface routerInterface, String str, RouteRefreshRequestData routeRefreshRequestData, RouteRefreshOptions routeRefreshOptions, NavigationRoute navigationRoute, Expected expected, CallsKt$await$2$2 callsKt$await$2$2, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.$routeRefreshSection = asyncSection;
        this.this$0 = blockRunner;
        this.$id = createinappmessageeventsubscriber;
        this.$originRouter = routerInterface;
        this.$requestUuid = str;
        this.$routeRefreshRequestData = routeRefreshRequestData;
        this.$refreshOptions = routeRefreshOptions;
        this.$route = navigationRoute;
        this.$result = expected;
        this.$callback = callsKt$await$2$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        return new RouterWrapper$getRouteRefresh$1$1(this.$routeRefreshSection, this.this$0, this.$id, this.$originRouter, this.$requestUuid, this.$routeRefreshRequestData, this.$refreshOptions, this.$route, this.$result, this.$callback, shortNewsContentCardView);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        RouterWrapper$getRouteRefresh$1$1 routerWrapper$getRouteRefresh$1$1 = (RouterWrapper$getRouteRefresh$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        routerWrapper$getRouteRefresh$1$1.invokeSuspend(createfromparcel);
        return createfromparcel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        PerformanceTracker performanceTracker = PerformanceTracker.INSTANCE;
        PerformanceTracker.asyncSectionCompleted(this.$routeRefreshSection);
        Long l = (Long) this.$id.IconCompatParcelizer;
        CallsKt$await$2$2 callsKt$await$2$2 = this.$callback;
        BlockRunner blockRunner = this.this$0;
        final x xVar = new x(blockRunner, l, callsKt$await$2$2, 19);
        if (l == null || ((LinkedHashMap) blockRunner.write).get(l) != null) {
            if (this.$originRouter.equals(blockRunner.getRouter$navigation_release())) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime() / 1000;
                final String str = this.$requestUuid;
                final RouteRefreshRequestData routeRefreshRequestData = this.$routeRefreshRequestData;
                final NavigationRoute navigationRoute = this.$route;
                this.$result.fold(new Expected.Transformer() { // from class: com.mapbox.navigation.core.internal.router.RouterWrapper$$ExternalSyntheticLambda1
                    @Override // com.mapbox.bindgen.Expected.Transformer
                    public final Object invoke(Object obj2) {
                        List list = (List) obj2;
                        String str2 = str;
                        str2.getClass();
                        NavigationRoute navigationRoute2 = navigationRoute;
                        navigationRoute2.getClass();
                        list.getClass();
                        RouterError routerError = (RouterError) onContentCardDismissed.read(list);
                        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("\n                               Route refresh failed.\n                               requestUuid = ", str2, "\n                               message = ");
                        sbM.append(routerError.getMessage());
                        sbM.append("\n                               type = ");
                        sbM.append(routerError.getType());
                        sbM.append("\n                               requestId = ");
                        sbM.append(routerError.getRequestId());
                        sbM.append("\n                               refreshTTL = ");
                        sbM.append(routerError.getRefreshTtl());
                        sbM.append("\n                               routeRefreshRequestData = ");
                        sbM.append(routeRefreshRequestData);
                        sbM.append("\n                        ");
                        String strMediaSessionCompatQueueItem = isCurrentlyDisplayingInAppMessage.MediaSessionCompatQueueItem(sbM.toString());
                        LoggerProviderKt.logW(strMediaSessionCompatQueueItem, "RouterWrapper");
                        Integer refreshTtl = routerError.getRefreshTtl();
                        if (refreshTtl != null) {
                            navigationRoute2.expirationTimeElapsedSeconds = Long.valueOf(((long) refreshTtl.intValue()) + jElapsedRealtime);
                        }
                        xVar.onFailure(new NavigationRouterRefreshError("Route refresh failed", new Exception(strMediaSessionCompatQueueItem), routerError.getRefreshTtl(), 4));
                        return createFromParcel.INSTANCE;
                    }
                }, new RouterWrapper$$ExternalSyntheticLambda2(blockRunner, l, navigationRoute, this.$refreshOptions, routeRefreshRequestData, jElapsedRealtime, xVar));
            } else {
                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.DEBUG)) {
                    LoggerProviderKt.logD("router was recreated, onFailure callback will be fired", "RouterWrapper");
                }
                xVar.onFailure(new NavigationRouterRefreshError("Failed to refresh a route", null, null, 14));
            }
        } else if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
            LoggerProviderKt.logI("Response for refresh request " + l + " has already been processed", null);
        }
        return createFromParcel.INSTANCE;
    }
}
