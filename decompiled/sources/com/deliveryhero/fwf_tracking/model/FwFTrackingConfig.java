package com.deliveryhero.fwf_tracking.model;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class FwFTrackingConfig {
    private final String brand;
    private final FwFTrackingCallback callback;

    public final String component1() {
        return this.brand;
    }

    public final FwFTrackingCallback component2() {
        return this.callback;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final FwFTrackingCallback getCallback() {
        return this.callback;
    }

    public int hashCode() {
        return this.callback.hashCode() + (this.brand.hashCode() * 31);
    }

    public String toString() {
        return "FwFTrackingConfig(brand=" + this.brand + ", callback=" + this.callback + ")";
    }

    public FwFTrackingConfig(String str, FwFTrackingCallback fwFTrackingCallback) {
        str.getClass();
        fwFTrackingCallback.getClass();
        this.brand = str;
        this.callback = fwFTrackingCallback;
    }

    public final FwFTrackingConfig copy(String str, FwFTrackingCallback fwFTrackingCallback) {
        str.getClass();
        fwFTrackingCallback.getClass();
        return new FwFTrackingConfig(str, fwFTrackingCallback);
    }

    public static /* synthetic */ FwFTrackingConfig copy$default(FwFTrackingConfig fwFTrackingConfig, String str, FwFTrackingCallback fwFTrackingCallback, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fwFTrackingConfig.brand;
        }
        if ((i & 2) != 0) {
            fwFTrackingCallback = fwFTrackingConfig.callback;
        }
        return fwFTrackingConfig.copy(str, fwFTrackingCallback);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FwFTrackingConfig)) {
            return false;
        }
        FwFTrackingConfig fwFTrackingConfig = (FwFTrackingConfig) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.brand, fwFTrackingConfig.brand}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.callback, fwFTrackingConfig.callback}, getCieXyz.write())).booleanValue();
    }
}
