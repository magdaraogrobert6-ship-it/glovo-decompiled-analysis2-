package com.roadrunner.map.integration.mapbox.route;

import androidx.compose.ui.graphics.Fields;
import com.mapbox.bindgen.Expected;
import com.mapbox.maps.Style;
import com.mapbox.navigation.base.internal.performance.PerformanceTracker;
import com.mapbox.navigation.ui.base.util.MapboxNavigationConsumer;
import com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView;
import com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView$renderClearRouteLineValueInternal$1;
import com.sentiance.core.model.events.H$b;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.BrazeInAppMessageManagerWhenMappings;
import o.DefaultInAppMessageViewWrapper;
import o.deserialize;
import o.m7;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RouteLineApi$$ExternalSyntheticLambda7 implements MapboxNavigationConsumer {
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ Style IconCompatParcelizer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 RemoteActionCompatParcelizer;
    public final /* synthetic */ m7 read;

    public /* synthetic */ RouteLineApi$$ExternalSyntheticLambda7(m7 m7Var, Style style, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.read = m7Var;
        this.IconCompatParcelizer = style;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    @Override // com.mapbox.navigation.ui.base.util.MapboxNavigationConsumer
    public final void accept(Object obj) {
        int i = 2 % 2;
        Expected expected = (Expected) obj;
        expected.getClass();
        m7 m7Var = this.read;
        MapboxRouteLineView mapboxRouteLineViewRemoteActionCompatParcelizer = m7Var.RemoteActionCompatParcelizer();
        H$b h$b = mapboxRouteLineViewRemoteActionCompatParcelizer.scope;
        boolean trackingIsActive = PerformanceTracker.getTrackingIsActive();
        Style style = this.IconCompatParcelizer;
        if (trackingIsActive) {
            PerformanceTracker.syncSectionStarted("MapboxRouteLineView#renderClearRouteLineValue");
            try {
                long jWrite = BrazeInAppMessageManagerWhenMappings.write();
                h$b.launchWithMutex(new MapboxRouteLineView$renderClearRouteLineValueInternal$1(mapboxRouteLineViewRemoteActionCompatParcelizer, style, expected, null));
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxRouteLineView#renderClearRouteLineValue", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite)));
            } catch (Throwable th) {
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxRouteLineView#renderClearRouteLineValue", null);
                throw th;
            }
        } else {
            h$b.launchWithMutex(new MapboxRouteLineView$renderClearRouteLineValueInternal$1(mapboxRouteLineViewRemoteActionCompatParcelizer, style, expected, null));
            int i2 = serializer + 55;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        m7Var.PlaybackStateCompat.IconCompatParcelizer.write(deserialize.read);
        this.RemoteActionCompatParcelizer.invoke();
        int i4 = serializer + 101;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
