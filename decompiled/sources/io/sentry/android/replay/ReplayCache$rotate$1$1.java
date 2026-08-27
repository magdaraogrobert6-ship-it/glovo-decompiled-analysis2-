package io.sentry.android.replay;

import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.core.reroute.MapboxRerouteController$requestAsync$2$1;
import com.mapbox.navigation.core.routerefresh.RouteRefresher;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import io.sentry.SentryOptions;
import java.io.File;
import java.io.Serializable;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.cancelPendingWebViewPause;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.getContentViewGroupParentLayout;
import o.onCustomEventAction;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
public final class ReplayCache$rotate$1$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ long serializer;
    public final /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReplayCache$rotate$1$1(long j, Object obj, Serializable serializable, int i) {
        super(1);
        this.read = i;
        this.serializer = j;
        this.IconCompatParcelizer = obj;
        this.write = serializable;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.read;
        long j = this.serializer;
        Object obj2 = this.write;
        Object obj3 = this.IconCompatParcelizer;
        if (i == 0) {
            MediaDescriptionCompat mediaDescriptionCompat = (MediaDescriptionCompat) obj;
            mediaDescriptionCompat.getClass();
            if (mediaDescriptionCompat.RemoteActionCompatParcelizer < j) {
                ((MediaBrowserCompatMediaItem) obj3).RemoteActionCompatParcelizer(mediaDescriptionCompat.read);
                return Boolean.TRUE;
            }
            createInAppMessageEventSubscriber createinappmessageeventsubscriber = (createInAppMessageEventSubscriber) obj2;
            if (createinappmessageeventsubscriber.IconCompatParcelizer == null) {
                createinappmessageeventsubscriber.IconCompatParcelizer = mediaDescriptionCompat.serializer;
            }
            return Boolean.FALSE;
        }
        if (i == 1) {
            LoggerProviderKt.logI("Route refresh for route " + ((NavigationRoute) obj3).id + " was cancelled after timeout", "RouteRefreshController");
            RouteRefresher routeRefresher = (RouteRefresher) obj2;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = routeRefresher.globalScope;
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, MainDispatcherLoader.read.IconCompatParcelizer(), null, new MapboxRerouteController$requestAsync$2$1.AnonymousClass1(routeRefresher, this.serializer, null, 1), 2);
            return createFromParcel.INSTANCE;
        }
        io.sentry.android.replay.capture.RatingCompat ratingCompat = (io.sentry.android.replay.capture.RatingCompat) obj;
        io.sentry.android.replay.capture.write writeVar = (io.sentry.android.replay.capture.write) obj3;
        ratingCompat.getClass();
        onCustomEventAction oncustomeventaction = ratingCompat.read;
        if (oncustomeventaction.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.getTime() >= j) {
            return Boolean.FALSE;
        }
        writeVar.IconCompatParcelizer(writeVar.RemoteActionCompatParcelizer() - 1);
        File file = oncustomeventaction.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        SentryOptions sentryOptions = writeVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (file != null) {
            try {
                if (!file.delete()) {
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to delete replay segment: %s", file.getAbsolutePath());
                }
            } catch (Throwable th) {
                sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th, "Failed to delete replay segment: %s", file.getAbsolutePath());
            }
        }
        ((cancelPendingWebViewPause) obj2).IconCompatParcelizer = true;
        return Boolean.TRUE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReplayCache$rotate$1$1(NavigationRoute navigationRoute, RouteRefresher routeRefresher, long j) {
        super(1);
        this.read = 1;
        this.IconCompatParcelizer = navigationRoute;
        this.write = routeRefresher;
        this.serializer = j;
    }
}
