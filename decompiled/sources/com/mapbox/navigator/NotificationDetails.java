package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public class NotificationDetails implements Serializable {
    private final String actualValue;
    private final String message;
    private final String requestedValue;
    private final String unit;

    public String getActualValue() {
        return this.actualValue;
    }

    public String getMessage() {
        return this.message;
    }

    public String getRequestedValue() {
        return this.requestedValue;
    }

    public String getUnit() {
        return this.unit;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.requestedValue, this.actualValue, this.unit, this.message);
    }

    public NotificationDetails(String str, String str2, String str3, String str4) {
        this.requestedValue = str;
        this.actualValue = str2;
        this.unit = str3;
        this.message = str4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[requestedValue: ");
        IconCompatParcelizer.read(sb, this.requestedValue, ", actualValue: ");
        IconCompatParcelizer.read(sb, this.actualValue, ", unit: ");
        IconCompatParcelizer.read(sb, this.unit, ", message: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.message, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NotificationDetails notificationDetails = (NotificationDetails) obj;
        return Objects.equals(this.requestedValue, notificationDetails.requestedValue) && Objects.equals(this.actualValue, notificationDetails.actualValue) && Objects.equals(this.unit, notificationDetails.unit) && Objects.equals(this.message, notificationDetails.message);
    }
}
