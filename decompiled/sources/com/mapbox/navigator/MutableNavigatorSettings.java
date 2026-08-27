package com.mapbox.navigator;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface MutableNavigatorSettings {
    Float avoidManeuverSeconds();

    void setAvoidManeuverSeconds(Float f);

    void setTestingContext(TestingContext testingContext);

    void setUserLanguages(List<String> list);

    void setVehicleType(VehicleType vehicleType);

    TestingContext testingContext();

    String userLanguageSupportedByValhalla();

    List<String> userLanguages();

    VehicleType vehicleType();
}
