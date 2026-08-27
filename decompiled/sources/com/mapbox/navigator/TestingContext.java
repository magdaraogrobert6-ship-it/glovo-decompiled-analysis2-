package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes4.dex */
public class TestingContext implements Serializable {
    private final String projectName;
    private final String vehicleName;

    public String getProjectName() {
        return this.projectName;
    }

    public String getVehicleName() {
        return this.vehicleName;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.vehicleName, this.projectName);
    }

    public TestingContext(String str, String str2) {
        this.vehicleName = str;
        this.projectName = str2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[vehicleName: ");
        IconCompatParcelizer.read(sb, this.vehicleName, ", projectName: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.projectName, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TestingContext testingContext = (TestingContext) obj;
        return Objects.equals(this.vehicleName, testingContext.vehicleName) && Objects.equals(this.projectName, testingContext.projectName);
    }
}
