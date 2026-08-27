package com.sentiance.sdk.diagnostics;

import com.sentiance.sdk.DontObfuscate;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class SdkDiagnostics {
    private final GooglePlayServicesObserver mGooglePlayServicesObserver;
    private final ServiceLifecycleObserver mServiceLifecycleObserver;

    public GooglePlayServicesObserver getGooglePlayServicesObserver() {
        return this.mGooglePlayServicesObserver;
    }

    public ServiceLifecycleObserver getServiceLifecycleObserver() {
        return this.mServiceLifecycleObserver;
    }

    /* JADX INFO: loaded from: classes4.dex */
    @DontObfuscate
    public static class Builder {
        private GooglePlayServicesObserver mGooglePlayServicesObserver;
        private ServiceLifecycleObserver mServiceLifecycleObserver;

        public Builder googlePlayServicesObserver(GooglePlayServicesObserver googlePlayServicesObserver) {
            this.mGooglePlayServicesObserver = googlePlayServicesObserver;
            return this;
        }

        public Builder serviceLifecycleObserver(ServiceLifecycleObserver serviceLifecycleObserver) {
            this.mServiceLifecycleObserver = serviceLifecycleObserver;
            return this;
        }

        public SdkDiagnostics build() {
            return new SdkDiagnostics(this);
        }
    }

    private SdkDiagnostics(Builder builder) {
        this.mGooglePlayServicesObserver = builder.mGooglePlayServicesObserver;
        this.mServiceLifecycleObserver = builder.mServiceLifecycleObserver;
    }
}
