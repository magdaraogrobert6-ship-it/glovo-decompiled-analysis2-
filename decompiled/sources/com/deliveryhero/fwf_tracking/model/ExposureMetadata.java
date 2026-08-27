package com.deliveryhero.fwf_tracking.model;

import bo.app.ff$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class ExposureMetadata {
    private final PerseusBrand brand;
    private final String sdkVersion;
    private final String service;
    private final String sessionId;

    public final PerseusBrand component1() {
        return this.brand;
    }

    public final String component2() {
        return this.sdkVersion;
    }

    public final String component3() {
        return this.service;
    }

    public final String component4() {
        return this.sessionId;
    }

    public final PerseusBrand getBrand() {
        return this.brand;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final String getService() {
        return this.service;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        int iHashCode = this.brand.hashCode();
        String str = this.sdkVersion;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.service;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.sessionId;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        PerseusBrand perseusBrand = this.brand;
        String str = this.sdkVersion;
        String str2 = this.service;
        String str3 = this.sessionId;
        StringBuilder sb = new StringBuilder("ExposureMetadata(brand=");
        sb.append(perseusBrand);
        sb.append(", sdkVersion=");
        sb.append(str);
        sb.append(", service=");
        return ff$$ExternalSyntheticOutline0.m(sb, str2, ", sessionId=", str3, ")");
    }

    public ExposureMetadata(PerseusBrand perseusBrand, String str, String str2, String str3) {
        perseusBrand.getClass();
        this.brand = perseusBrand;
        this.sdkVersion = str;
        this.service = str2;
        this.sessionId = str3;
    }

    public static /* synthetic */ ExposureMetadata copy$default(ExposureMetadata exposureMetadata, PerseusBrand perseusBrand, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            perseusBrand = exposureMetadata.brand;
        }
        if ((i & 2) != 0) {
            str = exposureMetadata.sdkVersion;
        }
        if ((i & 4) != 0) {
            str2 = exposureMetadata.service;
        }
        if ((i & 8) != 0) {
            str3 = exposureMetadata.sessionId;
        }
        return exposureMetadata.copy(perseusBrand, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExposureMetadata)) {
            return false;
        }
        ExposureMetadata exposureMetadata = (ExposureMetadata) obj;
        if (this.brand != exposureMetadata.brand) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sdkVersion, exposureMetadata.sdkVersion}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.service, exposureMetadata.service}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sessionId, exposureMetadata.sessionId}, getCieXyz.write())).booleanValue();
    }

    public final ExposureMetadata copy(PerseusBrand perseusBrand, String str, String str2, String str3) {
        perseusBrand.getClass();
        return new ExposureMetadata(perseusBrand, str, str2, str3);
    }
}
