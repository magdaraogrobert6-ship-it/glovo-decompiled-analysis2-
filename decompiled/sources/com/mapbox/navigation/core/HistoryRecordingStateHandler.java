package com.mapbox.navigation.core;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_vision_face.zzmx;
import com.mapbox.common.TelemetrySystemUtils;
import com.mapbox.navigation.core.internal.HistoryRecordingSessionState$Idle;
import com.mapbox.navigation.core.trip.session.NavigationSessionUtils$WhenMappings;
import com.mapbox.navigation.core.trip.session.TripSessionState;
import com.mapbox.navigation.core.trip.session.TripSessionStateObserver;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import o.displayInAppMessagelambda1;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class HistoryRecordingStateHandler implements TripSessionStateObserver {
    public boolean hasRoutes;
    public boolean isDriving;
    public boolean savedHasRoutes;
    public zzmx currentState = HistoryRecordingSessionState$Idle.INSTANCE;
    public final CopyOnWriteArraySet historyRecordingStateChangeObservers = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet copilotSessionObservers = new CopyOnWriteArraySet();

    public final void updateStateAndNotifyObservers() {
        zzmx zzmxVar;
        boolean z = this.isDriving;
        if (this.hasRoutes && z) {
            final String strObtainUniversalUniqueIdentifier = TelemetrySystemUtils.obtainUniversalUniqueIdentifier();
            strObtainUniversalUniqueIdentifier.getClass();
            zzmxVar = new zzmx(strObtainUniversalUniqueIdentifier) { // from class: com.mapbox.navigation.core.internal.HistoryRecordingSessionState$ActiveGuidance
                public final String sessionId;

                @Override // com.google.android.gms.internal.mlkit_vision_face.zzmx
                public final String getSessionId() {
                    return this.sessionId;
                }

                public final int hashCode() {
                    return this.sessionId.hashCode();
                }

                {
                    strObtainUniversalUniqueIdentifier.getClass();
                    this.sessionId = strObtainUniversalUniqueIdentifier;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof HistoryRecordingSessionState$ActiveGuidance)) {
                        return false;
                    }
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sessionId, ((HistoryRecordingSessionState$ActiveGuidance) obj).sessionId}, getCieXyz.write())).booleanValue();
                }

                public final String toString() {
                    return ff$$ExternalSyntheticOutline0.m(new StringBuilder("ActiveGuidance(sessionId="), this.sessionId, ')');
                }
            };
        } else if (z) {
            final String strObtainUniversalUniqueIdentifier2 = TelemetrySystemUtils.obtainUniversalUniqueIdentifier();
            strObtainUniversalUniqueIdentifier2.getClass();
            zzmxVar = new zzmx(strObtainUniversalUniqueIdentifier2) { // from class: com.mapbox.navigation.core.internal.HistoryRecordingSessionState$FreeDrive
                public final String sessionId;

                @Override // com.google.android.gms.internal.mlkit_vision_face.zzmx
                public final String getSessionId() {
                    return this.sessionId;
                }

                public final int hashCode() {
                    return this.sessionId.hashCode();
                }

                {
                    strObtainUniversalUniqueIdentifier2.getClass();
                    this.sessionId = strObtainUniversalUniqueIdentifier2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof HistoryRecordingSessionState$FreeDrive)) {
                        return false;
                    }
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sessionId, ((HistoryRecordingSessionState$FreeDrive) obj).sessionId}, getCieXyz.write())).booleanValue();
                }

                public final String toString() {
                    return ff$$ExternalSyntheticOutline0.m(new StringBuilder("FreeDrive(sessionId="), this.sessionId, ')');
                }
            };
        } else {
            zzmxVar = HistoryRecordingSessionState$Idle.INSTANCE;
        }
        if (displayInAppMessagelambda1.serializer(zzmxVar.getClass()).equals(displayInAppMessagelambda1.serializer(this.currentState.getClass()))) {
            return;
        }
        zzmx zzmxVar2 = this.currentState;
        this.currentState = zzmxVar;
        boolean z2 = zzmxVar2 instanceof HistoryRecordingSessionState$Idle;
        CopyOnWriteArraySet copyOnWriteArraySet = this.historyRecordingStateChangeObservers;
        if (!z2) {
            Iterator it = copyOnWriteArraySet.iterator();
            if (it.hasNext()) {
                throw ff$$ExternalSyntheticOutline0.m(it);
            }
        }
        if (!(zzmxVar instanceof HistoryRecordingSessionState$Idle)) {
            Iterator it2 = copyOnWriteArraySet.iterator();
            if (it2.hasNext()) {
                throw ff$$ExternalSyntheticOutline0.m(it2);
            }
        }
        Iterator it3 = this.copilotSessionObservers.iterator();
        while (it3.hasNext()) {
            ((DeveloperMetadataAggregator) it3.next()).onCopilotSessionChanged(zzmxVar);
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
            updateStateAndNotifyObservers();
        }
    }
}
