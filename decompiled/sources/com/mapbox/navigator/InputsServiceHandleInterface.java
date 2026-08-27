package com.mapbox.navigator;

/* JADX INFO: loaded from: classes3.dex */
public interface InputsServiceHandleInterface {
    void updateAltimeterData(AltimeterData altimeterData);

    void updateCompassData(CompassData compassData);

    void updateDetectedObjects(DetectedObjects detectedObjects);

    void updateEtcGateInfo(ETCGateInfo eTCGateInfo);

    void updateImuTemperatureData(ImuTemperatureData imuTemperatureData);

    void updateLaneChangeAssistData(LaneChangeAssistData laneChangeAssistData);

    void updateLaneSensorInfo(LaneSensorInfo laneSensorInfo);

    void updateLocalizedLaneData(LocalizedLaneData localizedLaneData);

    void updateOdometryData(OdometryData odometryData);

    void updateOrientationData(OrientationData orientationData);

    void updatePerceptionData(PerceptionData perceptionData);

    void updateRawAccelerometerData(RawAccelerometerData rawAccelerometerData);

    void updateRawGnssData(RawGnssData rawGnssData);

    void updateRawGravityData(RawGravityData rawGravityData);

    void updateRawGyroscopeData(RawGyroscopeData rawGyroscopeData);

    void updateRawLocation(FixLocation fixLocation);

    void updateSpeedData(SpeedData speedData);

    void updateWeatherData(WeatherData weatherData);
}
