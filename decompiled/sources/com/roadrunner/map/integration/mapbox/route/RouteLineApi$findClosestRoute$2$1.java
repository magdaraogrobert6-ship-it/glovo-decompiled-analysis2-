package com.roadrunner.map.integration.mapbox.route;

import androidx.compose.ui.graphics.Fields;
import com.mapbox.bindgen.Expected;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.ui.base.util.MapboxNavigationConsumer;
import com.mapbox.navigation.ui.maps.route.line.model.ClosestRouteValue;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.SafeContinuation;
import o.getCieXyz;
import o.instance_delegatelambda0;
import o.m7;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class RouteLineApi$findClosestRoute$2$1 implements MapboxNavigationConsumer {
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ SafeContinuation IconCompatParcelizer;
    public final /* synthetic */ m7 read;

    public RouteLineApi$findClosestRoute$2$1(m7 m7Var, SafeContinuation safeContinuation) {
        this.read = m7Var;
        this.IconCompatParcelizer = safeContinuation;
    }

    @Override // com.mapbox.navigation.ui.base.util.MapboxNavigationConsumer
    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 121;
        write = i2 % Fields.SpotShadowColor;
        NavigationRoute navigationRoute = null;
        if (i2 % 2 == 0) {
            Expected expected = (Expected) obj;
            expected.getClass();
            throw null;
        }
        Expected expected2 = (Expected) obj;
        expected2.getClass();
        ClosestRouteValue closestRouteValue = (ClosestRouteValue) expected2.getValue();
        if (closestRouteValue != null) {
            navigationRoute = closestRouteValue.navigationRoute;
        } else {
            int i3 = serializer + 97;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        SafeContinuation safeContinuation = this.IconCompatParcelizer;
        if (navigationRoute != null) {
            m7 m7Var = this.read;
            if (!navigationRoute.equals(m7Var.IconCompatParcelizer().primaryRoute)) {
                List list = m7Var.IconCompatParcelizer().routes;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    int iWrite = getCieXyz.write();
                    int iWrite2 = getCieXyz.write();
                    int iWrite3 = getCieXyz.write();
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{(NavigationRoute) obj2, navigationRoute}, iWrite3)).booleanValue()) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList2.add(0, navigationRoute);
                safeContinuation.resumeWith(arrayList2);
                return;
            }
        }
        safeContinuation.resumeWith(instance_delegatelambda0.write);
        int i5 = write + 119;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }
}
