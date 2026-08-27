package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes4.dex */
public class SystemInformation implements Serializable {
    private final String applicationBuildNumber;
    private final String applicationCachePath;
    private final String applicationDataPath;
    private final String applicationName;
    private final String applicationPackage;
    private final String applicationVersion;
    private final String architecture;
    private final String device;
    private final String deviceInfo;
    private final boolean isPhysicalDevice;
    private final Platform platform;
    private final String platformName;
    private final String platformVersion;

    private static native void nativeSelfRegister();

    public String getApplicationBuildNumber() {
        return this.applicationBuildNumber;
    }

    public String getApplicationCachePath() {
        return this.applicationCachePath;
    }

    public String getApplicationDataPath() {
        return this.applicationDataPath;
    }

    public String getApplicationName() {
        return this.applicationName;
    }

    public String getApplicationPackage() {
        return this.applicationPackage;
    }

    public String getApplicationVersion() {
        return this.applicationVersion;
    }

    public String getArchitecture() {
        return this.architecture;
    }

    public String getDevice() {
        return this.device;
    }

    public String getDeviceInfo() {
        return this.deviceInfo;
    }

    public boolean getIsPhysicalDevice() {
        return this.isPhysicalDevice;
    }

    public Platform getPlatform() {
        return this.platform;
    }

    public String getPlatformName() {
        return this.platformName;
    }

    public String getPlatformVersion() {
        return this.platformVersion;
    }

    public native String getPrettyDeviceName();

    public native long runningTime();

    public native long totalMemory();

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public int hashCode() {
        Platform platform = this.platform;
        String str = this.platformName;
        String str2 = this.platformVersion;
        String str3 = this.applicationName;
        String str4 = this.applicationPackage;
        String str5 = this.applicationVersion;
        String str6 = this.applicationBuildNumber;
        String str7 = this.device;
        String str8 = this.architecture;
        String str9 = this.deviceInfo;
        String str10 = this.applicationDataPath;
        boolean z = this.isPhysicalDevice;
        return Objects.hash(platform, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, Boolean.valueOf(z), this.applicationCachePath);
    }

    public SystemInformation(Platform platform, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, String str11) {
        this.platform = platform;
        this.platformName = str;
        this.platformVersion = str2;
        this.applicationName = str3;
        this.applicationPackage = str4;
        this.applicationVersion = str5;
        this.applicationBuildNumber = str6;
        this.device = str7;
        this.architecture = str8;
        this.deviceInfo = str9;
        this.applicationDataPath = str10;
        this.isPhysicalDevice = z;
        this.applicationCachePath = str11;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[platform: ");
        sb.append(RecordUtils.fieldToString(this.platform));
        sb.append(", platformName: ");
        IconCompatParcelizer.read(sb, this.platformName, ", platformVersion: ");
        IconCompatParcelizer.read(sb, this.platformVersion, ", applicationName: ");
        IconCompatParcelizer.read(sb, this.applicationName, ", applicationPackage: ");
        IconCompatParcelizer.read(sb, this.applicationPackage, ", applicationVersion: ");
        IconCompatParcelizer.read(sb, this.applicationVersion, ", applicationBuildNumber: ");
        IconCompatParcelizer.read(sb, this.applicationBuildNumber, ", device: ");
        IconCompatParcelizer.read(sb, this.device, ", architecture: ");
        IconCompatParcelizer.read(sb, this.architecture, ", deviceInfo: ");
        IconCompatParcelizer.read(sb, this.deviceInfo, ", applicationDataPath: ");
        IconCompatParcelizer.read(sb, this.applicationDataPath, ", isPhysicalDevice: ");
        MediaSessionCompatQueueItem.write(sb, this.isPhysicalDevice, ", applicationCachePath: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.applicationCachePath, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SystemInformation systemInformation = (SystemInformation) obj;
        return Objects.equals(this.platform, systemInformation.platform) && Objects.equals(this.platformName, systemInformation.platformName) && Objects.equals(this.platformVersion, systemInformation.platformVersion) && Objects.equals(this.applicationName, systemInformation.applicationName) && Objects.equals(this.applicationPackage, systemInformation.applicationPackage) && Objects.equals(this.applicationVersion, systemInformation.applicationVersion) && Objects.equals(this.applicationBuildNumber, systemInformation.applicationBuildNumber) && Objects.equals(this.device, systemInformation.device) && Objects.equals(this.architecture, systemInformation.architecture) && Objects.equals(this.deviceInfo, systemInformation.deviceInfo) && Objects.equals(this.applicationDataPath, systemInformation.applicationDataPath) && this.isPhysicalDevice == systemInformation.isPhysicalDevice && Objects.equals(this.applicationCachePath, systemInformation.applicationCachePath);
    }
}
