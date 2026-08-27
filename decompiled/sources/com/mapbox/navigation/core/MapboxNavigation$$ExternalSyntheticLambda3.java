package com.mapbox.navigation.core;

import androidx.compose.ui.graphics.Fields;
import com.mapbox.navigation.core.directions.session.RoutesObserver;
import com.mapbox.navigation.core.directions.session.RoutesUpdatedResult;
import com.mapbox.navigation.core.trip.session.MapboxTripSession;
import kotlinx.coroutines.channels.ProducerCoroutine;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class MapboxNavigation$$ExternalSyntheticLambda3 implements RoutesObserver {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ MapboxNavigation$$ExternalSyntheticLambda3(int i, Object obj) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.mapbox.navigation.core.directions.session.RoutesObserver
    public final void onRoutesChanged(RoutesUpdatedResult routesUpdatedResult) {
        int i = 2 % 2;
        int i2 = this.$r8$classId;
        Object obj = this.f$0;
        Object obj2 = null;
        if (i2 == 0) {
            MapboxNavigation mapboxNavigation = (MapboxNavigation) obj;
            routesUpdatedResult.getClass();
            mapboxNavigation.latestLegIndex = null;
            mapboxNavigation.routesProgressDataProvider.routesProgressData = null;
            int i3 = IconCompatParcelizer + 59;
            read = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return;
            }
            obj2.hashCode();
            throw null;
        }
        if (i2 == 1) {
            routesUpdatedResult.getClass();
            ((MapboxTripSession) obj).isUpdatingRoute.set(false);
            return;
        }
        ((ProducerCoroutine) ((InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) obj)).b_(routesUpdatedResult);
        int i4 = IconCompatParcelizer + 61;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }
}
