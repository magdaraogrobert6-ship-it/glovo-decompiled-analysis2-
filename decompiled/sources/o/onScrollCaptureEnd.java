package o;

import android.location.GnssMeasurement;
import android.location.GnssMeasurementsEvent;
import android.location.LocationManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.huawei.riemann.gnsslocation.core.bean.obs.GnssClock;
import com.huawei.riemann.gnsslocation.core.bean.obs.GnssRawObservation;
import com.huawei.riemann.gnsslocation.core.bean.obs.SatelliteMeasurement;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class onScrollCaptureEnd {
    public LocationManager IconCompatParcelizer;
    public HandlerThread MediaSessionCompatQueueItem;
    public VectorResources_androidKt RemoteActionCompatParcelizer;
    public long read;
    public final BringIntoViewModifierNode serializer = new BringIntoViewModifierNode(1, this);
    public Handler write;

    public static void write(onScrollCaptureEnd onscrollcaptureend, GnssMeasurementsEvent gnssMeasurementsEvent) {
        GnssRawObservation[] gnssRawObservationArr;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (jElapsedRealtimeNanos - onscrollcaptureend.read < 600000) {
            WrappedCompositionsetContent1211.read();
            return;
        }
        onscrollcaptureend.read = jElapsedRealtimeNanos;
        long j = jElapsedRealtimeNanos / 1000000;
        Collection<GnssMeasurement> measurements = gnssMeasurementsEvent.getMeasurements();
        int i = 0;
        if (measurements == null || measurements.isEmpty() || gnssMeasurementsEvent.getClock() == null) {
            gnssRawObservationArr = new GnssRawObservation[0];
        } else {
            GnssClock gnssClockBuild = GnssClock.Builder.aGnssClock().withBiasNanos(gnssMeasurementsEvent.getClock().hasBiasNanos() ? gnssMeasurementsEvent.getClock().getBiasNanos() : 0.0d).withBiasUncertaintyNanos(gnssMeasurementsEvent.getClock().hasBiasUncertaintyNanos() ? gnssMeasurementsEvent.getClock().getBiasUncertaintyNanos() : 0.0d).withDriftNanosPerSecond(gnssMeasurementsEvent.getClock().hasDriftNanosPerSecond() ? gnssMeasurementsEvent.getClock().getDriftNanosPerSecond() : 0.0d).withDriftUncertaintyNanosPerSecond(gnssMeasurementsEvent.getClock().hasDriftUncertaintyNanosPerSecond() ? gnssMeasurementsEvent.getClock().getDriftUncertaintyNanosPerSecond() : 0.0d).withFullBiasNanos(gnssMeasurementsEvent.getClock().getFullBiasNanos()).withHardwareClockDiscontinuityCount(gnssMeasurementsEvent.getClock().getHardwareClockDiscontinuityCount()).withLeapSecond(gnssMeasurementsEvent.getClock().hasLeapSecond() ? gnssMeasurementsEvent.getClock().getLeapSecond() : 0).withTimeNanos(gnssMeasurementsEvent.getClock().getTimeNanos()).withTimeUncertaintyNanos(gnssMeasurementsEvent.getClock().hasTimeUncertaintyNanos() ? gnssMeasurementsEvent.getClock().getTimeUncertaintyNanos() : 0.0d).withElapsedRealtimeMillis(Build.VERSION.SDK_INT >= 29 ? gnssMeasurementsEvent.getClock().getElapsedRealtimeNanos() : 0L).build();
            int size = gnssMeasurementsEvent.getMeasurements().size();
            gnssRawObservationArr = new GnssRawObservation[size];
            for (GnssMeasurement gnssMeasurement : gnssMeasurementsEvent.getMeasurements()) {
                SatelliteMeasurement.Builder builderWithSvid = SatelliteMeasurement.Builder.aSatelliteMeasurement().withBootTime(j).withAccumulatedDeltaRangeMeters(gnssMeasurement.getAccumulatedDeltaRangeMeters()).withAccumulatedDeltaRangeState(gnssMeasurement.getAccumulatedDeltaRangeState()).withAccumulatedDeltaRangeUncertaintyMeters(gnssMeasurement.getAccumulatedDeltaRangeUncertaintyMeters()).withCarrierCycles(gnssMeasurement.hasCarrierCycles() ? gnssMeasurement.getCarrierCycles() : 0L).withCarrierFrequencyHz(gnssMeasurement.hasCarrierFrequencyHz() ? gnssMeasurement.getCarrierFrequencyHz() : 0.0f).withCarrierPhase(gnssMeasurement.hasCarrierPhase() ? gnssMeasurement.getCarrierPhase() : 0.0d).withCarrierPhaseUncertainty(gnssMeasurement.hasCarrierPhaseUncertainty() ? gnssMeasurement.getCarrierPhaseUncertainty() : 0.0d).withCn0DbHz(gnssMeasurement.getCn0DbHz()).withConstellationType(gnssMeasurement.getConstellationType()).withSnrInDb(gnssMeasurement.hasSnrInDb() ? gnssMeasurement.getSnrInDb() : 0.0d).withMultipathIndicator(gnssMeasurement.getMultipathIndicator()).withTimeOffsetNanos(gnssMeasurement.getTimeOffsetNanos()).withPseudorangeRateMetersPerSecond(gnssMeasurement.getPseudorangeRateMetersPerSecond()).withPseudorangeRateUncertaintyMetersPerSecond(gnssMeasurement.getPseudorangeRateUncertaintyMetersPerSecond()).withReceivedSvTimeNanos(gnssMeasurement.getReceivedSvTimeNanos()).withReceivedSvTimeUncertaintyNanos(gnssMeasurement.getReceivedSvTimeUncertaintyNanos()).withState(gnssMeasurement.getState()).withSvid(gnssMeasurement.getSvid());
                int i2 = Build.VERSION.SDK_INT;
                builderWithSvid.withAutomaticGainControlLevelInDb(gnssMeasurement.hasAutomaticGainControlLevelDb() ? gnssMeasurement.getAutomaticGainControlLevelDb() : 0.0d);
                if (i2 >= 30) {
                    builderWithSvid.withFullInterSignalBiasNanos(gnssMeasurement.hasFullInterSignalBiasNanos() ? gnssMeasurement.getFullInterSignalBiasNanos() : 0.0d);
                    builderWithSvid.withFullInterSignalBiasUncertaintyNanos(gnssMeasurement.hasFullInterSignalBiasUncertaintyNanos() ? gnssMeasurement.getFullInterSignalBiasUncertaintyNanos() : 0.0d);
                    builderWithSvid.withSatelliteInterSignalBiasNanos(gnssMeasurement.hasSatelliteInterSignalBiasNanos() ? gnssMeasurement.getSatelliteInterSignalBiasNanos() : 0.0d);
                    builderWithSvid.withSatelliteInterSignalBiasUncertaintyNanos(gnssMeasurement.hasSatelliteInterSignalBiasUncertaintyNanos() ? gnssMeasurement.getSatelliteInterSignalBiasUncertaintyNanos() : 0.0d);
                } else {
                    builderWithSvid.withFullInterSignalBiasNanos(0.0d);
                    builderWithSvid.withFullInterSignalBiasUncertaintyNanos(0.0d);
                    builderWithSvid.withSatelliteInterSignalBiasNanos(0.0d);
                    builderWithSvid.withSatelliteInterSignalBiasUncertaintyNanos(0.0d);
                }
                SatelliteMeasurement satelliteMeasurementBuild = builderWithSvid.build();
                if (i >= 0 && i < size) {
                    gnssRawObservationArr[i] = GnssRawObservation.Builder.aGnssRawObservation().withSatelliteMeasurement(satelliteMeasurementBuild).withGnssClock(gnssClockBuild).build();
                    i++;
                }
            }
        }
        if (gnssRawObservationArr.length < 10) {
            WindowInfoImplCompanion.serializer(gnssRawObservationArr.length, "GnssMeasurementsProvider", new StringBuilder("gnssRawObservations not enough, drop here. length is : "));
            return;
        }
        VectorResources_androidKt vectorResources_androidKt = onscrollcaptureend.RemoteActionCompatParcelizer;
        if (vectorResources_androidKt == null) {
            WrappedCompositionsetContent1211.read("GnssMeasurementsProvider", "gnss listener is null!");
            return;
        }
        Handler handler = vectorResources_androidKt.MediaDescriptionCompat;
        if (handler == null) {
            WrappedCompositionsetContent1211.read("VdrDataManager", "handler is null, drop gnss data here.");
            return;
        }
        handler.removeCallbacksAndMessages(null);
        if (vectorResources_androidKt.write != null) {
            vectorResources_androidKt.serializer(gnssRawObservationArr, jElapsedRealtimeNanos);
            return;
        }
        vectorResources_androidKt.IconCompatParcelizer = gnssRawObservationArr;
        vectorResources_androidKt.MediaBrowserCompatMediaItem = jElapsedRealtimeNanos;
        Handler handler2 = vectorResources_androidKt.MediaDescriptionCompat;
        handler2.sendMessageDelayed(handler2.obtainMessage(11), 40L);
    }
}
