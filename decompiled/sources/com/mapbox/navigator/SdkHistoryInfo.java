package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes3.dex */
public class SdkHistoryInfo implements Serializable {
    private final String sdkName;
    private final String sdkVersion;

    public String getSdkName() {
        return this.sdkName;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.sdkVersion, this.sdkName);
    }

    public SdkHistoryInfo(String str, String str2) {
        this.sdkVersion = str;
        this.sdkName = str2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[sdkVersion: ");
        IconCompatParcelizer.read(sb, this.sdkVersion, ", sdkName: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.sdkName, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SdkHistoryInfo sdkHistoryInfo = (SdkHistoryInfo) obj;
        return Objects.equals(this.sdkVersion, sdkHistoryInfo.sdkVersion) && Objects.equals(this.sdkName, sdkHistoryInfo.sdkName);
    }
}
