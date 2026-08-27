package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes3.dex */
public class InputsServiceHandle implements InputsServiceHandleInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class InputsServiceHandlePeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            InputsServiceHandle.cleanNativePeer(this.peer);
        }

        public InputsServiceHandlePeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native InputsServiceHandle build(ConfigHandle configHandle, HistoryRecorderHandle historyRecorderHandle);

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.InputsServiceHandleInterface
    public native void updateAltimeterData(AltimeterData altimeterData);

    @Override // com.mapbox.navigator.InputsServiceHandleInterface
    public native void updateCompassData(CompassData compassData);

    @Override // com.mapbox.navigator.InputsServiceHandleInterface
    public native void updateDetectedObjects(DetectedObjects detectedObjects);

    @Override // com.mapbox.navigator.InputsServiceHandleInterface
    public native void updateEtcGateInfo(ETCGateInfo eTCGateInfo);

    @Override // com.mapbox.navigator.InputsServiceHandleInterface
    public native void updateImuTemperatureData(ImuTemperatureData imuTemperatureData);

    @Override // com.mapbox.navigator.InputsServiceHandleInterface
    public native void updateLaneChangeAssistData(LaneChangeAssistData laneChangeAssistData);

    @Override // com.mapbox.navigator.InputsServiceHandleInterface
    public native void updateLaneSensorInfo(LaneSensorInfo laneSensorInfo);

    @Override // com.mapbox.navigator.InputsServiceHandleInterface
    public native void updateLocalizedLaneData(LocalizedLaneData localizedLaneData);

    @Override // com.mapbox.navigator.InputsServiceHandleInterface
    public native void updateOdometryData(OdometryData odometryData);

    @Override // com.mapbox.navigator.InputsServiceHandleInterface
    public native void updateOrientationData(OrientationData orientationData);

    @Override // com.mapbox.navigator.InputsServiceHandleInterface
    public native void updatePerceptionData(PerceptionData perceptionData);

    @Override // com.mapbox.navigator.InputsServiceHandleInterface
    public native void updateRawAccelerometerData(RawAccelerometerData rawAccelerometerData);

    @Override // com.mapbox.navigator.InputsServiceHandleInterface
    public native void updateRawGnssData(RawGnssData rawGnssData);

    @Override // com.mapbox.navigator.InputsServiceHandleInterface
    public native void updateRawGravityData(RawGravityData rawGravityData);

    @Override // com.mapbox.navigator.InputsServiceHandleInterface
    public native void updateRawGyroscopeData(RawGyroscopeData rawGyroscopeData);

    @Override // com.mapbox.navigator.InputsServiceHandleInterface
    public native void updateRawLocation(FixLocation fixLocation);

    @Override // com.mapbox.navigator.InputsServiceHandleInterface
    public native void updateSpeedData(SpeedData speedData);

    @Override // com.mapbox.navigator.InputsServiceHandleInterface
    public native void updateWeatherData(WeatherData weatherData);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public InputsServiceHandle(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new InputsServiceHandlePeerCleaner(j));
    }
}
