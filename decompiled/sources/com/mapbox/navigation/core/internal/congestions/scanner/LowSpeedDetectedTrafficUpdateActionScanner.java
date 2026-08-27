package com.mapbox.navigation.core.internal.congestions.scanner;

import android.os.SystemClock;
import coil3.UriKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.core.internal.congestions.model.SpeedAnalysisResult$FailedToAnalyze;
import com.mapbox.navigation.core.internal.congestions.model.SpeedAnalysisResult$HighSpeedDetected;
import com.mapbox.navigation.core.internal.congestions.model.SpeedAnalysisResult$LowSpeedDetected;
import com.mapbox.navigation.core.internal.congestions.model.SpeedAnalysisResult$SkippedAnalysis;
import com.mapbox.navigation.core.internal.congestions.model.SpeedAnalysisResult$SpeedIsOk;
import com.mapbox.navigation.core.internal.congestions.model.SpeedAnalysisResult$SpeedMatchesCongestionLevel;
import com.mapbox.navigation.core.internal.congestions.model.SpeedAnalysisResult$WrongFalsePositiveOverrideDetected;
import com.mapbox.navigation.core.internal.congestions.model.TrafficUpdateAction$AccumulatingLowSpeed;
import com.mapbox.navigation.core.internal.congestions.model.TrafficUpdateAction$IncreaseTraffic;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.createNodeAt;
import o.ignoreRemeasureRequests;
import o.setUnregisteredInAppMessage;
import o.unregisterInAppMessageManager;

/* JADX INFO: loaded from: classes2.dex */
public final class LowSpeedDetectedTrafficUpdateActionScanner implements TrafficUpdateActionScanner {
    public static final long TO_WAIT_UNTIL_UPDATE;

    @Override // com.mapbox.navigation.core.internal.congestions.scanner.TrafficUpdateActionScanner
    public final ignoreRemeasureRequests scan(ignoreRemeasureRequests ignoreremeasurerequests, createNodeAt createnodeat) {
        long jIconCompatParcelizer;
        ignoreremeasurerequests.getClass();
        if (!(createnodeat instanceof SpeedAnalysisResult$LowSpeedDetected)) {
            if ((createnodeat instanceof SpeedAnalysisResult$FailedToAnalyze) || (createnodeat instanceof SpeedAnalysisResult$HighSpeedDetected) || (createnodeat instanceof SpeedAnalysisResult$SkippedAnalysis) || (createnodeat instanceof SpeedAnalysisResult$SpeedIsOk) || (createnodeat instanceof SpeedAnalysisResult$SpeedMatchesCongestionLevel) || (createnodeat instanceof SpeedAnalysisResult$WrongFalsePositiveOverrideDetected)) {
                return null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        TrafficUpdateAction$AccumulatingLowSpeed trafficUpdateAction$AccumulatingLowSpeed = ignoreremeasurerequests instanceof TrafficUpdateAction$AccumulatingLowSpeed ? (TrafficUpdateAction$AccumulatingLowSpeed) ignoreremeasurerequests : null;
        if (trafficUpdateAction$AccumulatingLowSpeed != null) {
            jIconCompatParcelizer = trafficUpdateAction$AccumulatingLowSpeed.accumulationStart;
        } else {
            unregisterInAppMessageManager unregisterinappmessagemanager = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
            jIconCompatParcelizer = UriKt.IconCompatParcelizer(((SpeedAnalysisResult$LowSpeedDetected) createnodeat).resultElapsedMilliseconds, setUnregisteredInAppMessage.MILLISECONDS);
        }
        long j = jIconCompatParcelizer;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        unregisterInAppMessageManager unregisterinappmessagemanager2 = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
        long j2 = BrazeInAppMessageManagerExternalSyntheticLambda2.read(TO_WAIT_UNTIL_UPDATE, BrazeInAppMessageManagerExternalSyntheticLambda2.MediaSessionCompatQueueItem(BrazeInAppMessageManagerExternalSyntheticLambda2.read(UriKt.IconCompatParcelizer(jElapsedRealtime, setUnregisteredInAppMessage.MILLISECONDS), BrazeInAppMessageManagerExternalSyntheticLambda2.MediaSessionCompatQueueItem(j))));
        if (BrazeInAppMessageManagerExternalSyntheticLambda2.RemoteActionCompatParcelizer(j2, 0L) >= 0) {
            return new TrafficUpdateAction$AccumulatingLowSpeed(j, j2, (SpeedAnalysisResult$LowSpeedDetected) createnodeat);
        }
        SpeedAnalysisResult$LowSpeedDetected speedAnalysisResult$LowSpeedDetected = (SpeedAnalysisResult$LowSpeedDetected) createnodeat;
        return new TrafficUpdateAction$IncreaseTraffic(speedAnalysisResult$LowSpeedDetected.route, speedAnalysisResult$LowSpeedDetected.legProgress, speedAnalysisResult$LowSpeedDetected.expectedCongestion);
    }

    static {
        unregisterInAppMessageManager unregisterinappmessagemanager = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
        TO_WAIT_UNTIL_UPDATE = UriKt.RemoteActionCompatParcelizer(20, setUnregisteredInAppMessage.SECONDS);
    }
}
