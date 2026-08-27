package com.mapbox.navigation.core.trip.session;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.common.TelemetrySystemUtils;
import com.mapbox.navigation.core.accounts.BillingController$$ExternalSyntheticLambda1;
import com.mapbox.navigation.core.directions.session.RoutesObserver;
import com.mapbox.navigation.core.directions.session.RoutesUpdatedResult;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import o.getCieXyz;
import o.getScrollToIndex;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class NavigationSession implements RoutesObserver, TripSessionStateObserver {
    public boolean hasRoutes;
    public boolean isDriving;
    public final CopyOnWriteArraySet stateObservers = new CopyOnWriteArraySet();
    public getScrollToIndex state = NavigationSessionState$Idle.INSTANCE;

    public final void updateState() {
        getScrollToIndex navigationSessionState$ActiveGuidance;
        boolean z = this.isDriving;
        if (this.hasRoutes && z) {
            String strObtainUniversalUniqueIdentifier = TelemetrySystemUtils.obtainUniversalUniqueIdentifier();
            strObtainUniversalUniqueIdentifier.getClass();
            navigationSessionState$ActiveGuidance = new NavigationSessionState$ActiveGuidance(strObtainUniversalUniqueIdentifier);
        } else if (z) {
            String strObtainUniversalUniqueIdentifier2 = TelemetrySystemUtils.obtainUniversalUniqueIdentifier();
            strObtainUniversalUniqueIdentifier2.getClass();
            navigationSessionState$ActiveGuidance = new getScrollToIndex(strObtainUniversalUniqueIdentifier2) { // from class: com.mapbox.navigation.core.trip.session.NavigationSessionState$FreeDrive
                public final String sessionId;

                public final int hashCode() {
                    return this.sessionId.hashCode();
                }

                {
                    strObtainUniversalUniqueIdentifier2.getClass();
                    this.sessionId = strObtainUniversalUniqueIdentifier2;
                }

                public final String toString() {
                    return ff$$ExternalSyntheticOutline0.m(new StringBuilder("FreeDrive(sessionId='"), this.sessionId, "')");
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!NavigationSessionState$FreeDrive.class.equals(obj != null ? obj.getClass() : null)) {
                        return false;
                    }
                    obj.getClass();
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sessionId, ((NavigationSessionState$FreeDrive) obj).sessionId}, getCieXyz.write())).booleanValue();
                }
            };
        } else {
            navigationSessionState$ActiveGuidance = NavigationSessionState$Idle.INSTANCE;
        }
        Object[] objArr = {this.state, navigationSessionState$ActiveGuidance};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return;
        }
        this.state = navigationSessionState$ActiveGuidance;
        Iterator it = this.stateObservers.iterator();
        while (it.hasNext()) {
            ((BillingController$$ExternalSyntheticLambda1) it.next()).onNavigationSessionStateChanged(navigationSessionState$ActiveGuidance);
        }
    }

    @Override // com.mapbox.navigation.core.directions.session.RoutesObserver
    public final void onRoutesChanged(RoutesUpdatedResult routesUpdatedResult) {
        routesUpdatedResult.getClass();
        boolean z = !routesUpdatedResult.navigationRoutes.isEmpty();
        if (this.hasRoutes != z) {
            this.hasRoutes = z;
            updateState();
        }
    }

    @Override // com.mapbox.navigation.core.trip.session.TripSessionStateObserver
    public final void onSessionStateChanged(TripSessionState tripSessionState) {
        tripSessionState.getClass();
        int i = NavigationSessionUtils$WhenMappings.$EnumSwitchMapping$0[tripSessionState.ordinal()];
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return;
            }
            z = false;
        }
        if (this.isDriving != z) {
            this.isDriving = z;
            updateState();
        }
    }
}
