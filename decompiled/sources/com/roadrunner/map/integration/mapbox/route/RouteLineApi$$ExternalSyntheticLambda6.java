package com.roadrunner.map.integration.mapbox.route;

import androidx.compose.ui.graphics.Fields;
import com.huawei.location.ut;
import com.mapbox.bindgen.Expected;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.Style;
import com.mapbox.navigation.base.internal.performance.PerformanceTracker;
import com.mapbox.navigation.ui.base.util.MapboxNavigationConsumer;
import com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView;
import com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView$renderRouteDrawDataInternal$1;
import com.mapbox.navigation.ui.maps.route.line.api.RoutesRenderedCallbackWrapper;
import com.mapbox.navigation.ui.maps.route.line.api.RoutesRenderedResult;
import com.sentiance.core.model.events.C$b;
import com.sentiance.core.model.events.H$b;
import java.util.List;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.BrazeInAppMessageManagerWhenMappings;
import o.DefaultInAppMessageViewWrapper;
import o.m7;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RouteLineApi$$ExternalSyntheticLambda6 implements MapboxNavigationConsumer {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaSessionCompatQueueItem;
    public final /* synthetic */ Style IconCompatParcelizer;
    public final /* synthetic */ MapboxMap RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 read;
    public final /* synthetic */ m7 serializer;
    public final /* synthetic */ List write;

    public /* synthetic */ RouteLineApi$$ExternalSyntheticLambda6(m7 m7Var, Style style, MapboxMap mapboxMap, List list, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.serializer = m7Var;
        this.IconCompatParcelizer = style;
        this.RemoteActionCompatParcelizer = mapboxMap;
        this.write = list;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    @Override // com.mapbox.navigation.ui.base.util.MapboxNavigationConsumer
    public final void accept(Object obj) {
        int i = 2 % 2;
        Expected expected = (Expected) obj;
        expected.getClass();
        m7 m7Var = this.serializer;
        MapboxRouteLineView mapboxRouteLineViewRemoteActionCompatParcelizer = m7Var.RemoteActionCompatParcelizer();
        C$b c$b = new C$b(m7Var, this.write, this.read);
        H$b h$b = mapboxRouteLineViewRemoteActionCompatParcelizer.scope;
        MapboxMap mapboxMap = this.RemoteActionCompatParcelizer;
        mapboxMap.getClass();
        boolean trackingIsActive = PerformanceTracker.getTrackingIsActive();
        Style style = this.IconCompatParcelizer;
        if (!trackingIsActive) {
            ut utVar = new ut(13, c$b);
            h$b.launchWithMutex(new MapboxRouteLineView$renderRouteDrawDataInternal$1(mapboxRouteLineViewRemoteActionCompatParcelizer, style, expected, new RoutesRenderedCallbackWrapper(mapboxMap, utVar), null));
            utVar.write = true;
            RoutesRenderedResult routesRenderedResult = (RoutesRenderedResult) utVar.MediaBrowserCompatMediaItem;
            if (routesRenderedResult != null) {
                c$b.onRoutesRendered(routesRenderedResult);
            }
            utVar.MediaBrowserCompatMediaItem = null;
            int i2 = MediaSessionCompatQueueItem + 105;
            MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        PerformanceTracker.syncSectionStarted("MapboxRouteLineView#renderRouteDrawData");
        try {
            long jWrite = BrazeInAppMessageManagerWhenMappings.write();
            ut utVar2 = new ut(13, c$b);
            h$b.launchWithMutex(new MapboxRouteLineView$renderRouteDrawDataInternal$1(mapboxRouteLineViewRemoteActionCompatParcelizer, style, expected, new RoutesRenderedCallbackWrapper(mapboxMap, utVar2), null));
            utVar2.write = true;
            RoutesRenderedResult routesRenderedResult2 = (RoutesRenderedResult) utVar2.MediaBrowserCompatMediaItem;
            if (routesRenderedResult2 != null) {
                c$b.onRoutesRendered(routesRenderedResult2);
                int i3 = MediaBrowserCompatMediaItem + 107;
                MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
            }
            utVar2.MediaBrowserCompatMediaItem = null;
            PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxRouteLineView#renderRouteDrawData", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite)));
        } catch (Throwable th) {
            PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxRouteLineView#renderRouteDrawData", null);
            throw th;
        }
    }
}
