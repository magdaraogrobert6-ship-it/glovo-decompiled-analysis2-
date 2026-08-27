package com.mapbox.navigation.core.internal.router;

import androidx.lifecycle.BlockRunner;
import com.huawei.wisesecurity.ucs_credential.x;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.navigation.base.internal.RouteRefreshRequestData;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.utils.internal.JobControl;
import com.mapbox.navigator.RouteRefreshOptions;
import java.util.Random;
import kotlinx.coroutines.BuildersKt;
import o.isAdapterPositionOnScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RouterWrapper$$ExternalSyntheticLambda2 implements Expected.Transformer {
    public static int IconCompatParcelizer;
    public static int read;
    public final /* synthetic */ BlockRunner f$0;
    public final /* synthetic */ Long f$1;
    public final /* synthetic */ NavigationRoute f$2;
    public final /* synthetic */ RouteRefreshOptions f$3;
    public final /* synthetic */ RouteRefreshRequestData f$4;
    public final /* synthetic */ long f$5;
    public final /* synthetic */ x f$6;

    @Override // com.mapbox.bindgen.Expected.Transformer
    public final Object invoke(Object obj) {
        DataRef dataRef = (DataRef) obj;
        NavigationRoute navigationRoute = this.f$2;
        navigationRoute.getClass();
        dataRef.getClass();
        BlockRunner blockRunner = this.f$0;
        return BuildersKt.RemoteActionCompatParcelizer(((JobControl) ((isAdapterPositionOnScreen) blockRunner.RemoteActionCompatParcelizer).MediaSessionCompatResultReceiverWrapper()).scope, null, null, new RouterWrapper$endRouteRefreshRequest$4$1(this.f$1, blockRunner, navigationRoute, dataRef, this.f$3, this.f$4, this.f$5, this.f$6, null), 3);
    }

    public /* synthetic */ RouterWrapper$$ExternalSyntheticLambda2(BlockRunner blockRunner, Long l, NavigationRoute navigationRoute, RouteRefreshOptions routeRefreshOptions, RouteRefreshRequestData routeRefreshRequestData, long j, x xVar) {
        this.f$0 = blockRunner;
        this.f$1 = l;
        this.f$2 = navigationRoute;
        this.f$3 = routeRefreshOptions;
        this.f$4 = routeRefreshRequestData;
        this.f$5 = j;
        this.f$6 = xVar;
    }

    public static int write() {
        int i = IconCompatParcelizer;
        int i2 = i % 5458088;
        IconCompatParcelizer = i + 1;
        if (i2 != 0) {
            return read;
        }
        int iNextInt = new Random().nextInt();
        read = iNextInt;
        return iNextInt;
    }
}
