package com.roadrunner.map.integration.mapbox.route;

import androidx.compose.ui.graphics.Fields;
import com.mapbox.bindgen.Expected;
import com.mapbox.maps.Snapshotter$$ExternalSyntheticLambda0;
import com.mapbox.maps.Style;
import com.mapbox.navigation.base.internal.performance.AsyncSection;
import com.mapbox.navigation.base.internal.performance.PerformanceTracker;
import com.mapbox.navigation.ui.base.util.MapboxNavigationConsumer;
import o.m7;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RouteLineApi$$ExternalSyntheticLambda4 implements MapboxNavigationConsumer {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ RouteLineApi$$ExternalSyntheticLambda4(Object obj, int i, Object obj2) {
        this.write = i;
        this.IconCompatParcelizer = obj;
        this.serializer = obj2;
    }

    @Override // com.mapbox.navigation.ui.base.util.MapboxNavigationConsumer
    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = read + 9;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        Object obj2 = this.serializer;
        Object obj3 = this.IconCompatParcelizer;
        if (i4 == 0) {
            Expected expected = (Expected) obj;
            expected.getClass();
            ((m7) obj3).RemoteActionCompatParcelizer().renderRouteLineUpdate((Style) obj2, expected);
            return;
        }
        AsyncSection asyncSection = (AsyncSection) obj3;
        Expected expected2 = (Expected) obj;
        asyncSection.getClass();
        expected2.getClass();
        Expected expectedMapValue = expected2.mapValue(new Snapshotter$$ExternalSyntheticLambda0(26));
        expectedMapValue.getClass();
        PerformanceTracker performanceTracker = PerformanceTracker.INSTANCE;
        PerformanceTracker.asyncSectionCompleted(asyncSection);
        ((RouteLineApi$$ExternalSyntheticLambda6) obj2).accept(expectedMapValue);
        int i5 = RemoteActionCompatParcelizer + 105;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }
}
