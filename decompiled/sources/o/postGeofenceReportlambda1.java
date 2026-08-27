package o;

import android.app.Service;
import com.sentiance.sdk.diagnostics.SdkDiagnostics;
import com.sentiance.sdk.diagnostics.ServiceLifecycleObserver;

/* JADX INFO: loaded from: classes3.dex */
public final class postGeofenceReportlambda1 {
    private final r8lambda7zCvOdb3YpLJDzJMGkbnvobYklg write;

    public final void IconCompatParcelizer(Class<? extends Service> cls) {
        SdkDiagnostics sdkDiagnosticsWrite = this.write.write();
        ServiceLifecycleObserver serviceLifecycleObserver = sdkDiagnosticsWrite != null ? sdkDiagnosticsWrite.getServiceLifecycleObserver() : null;
        if (serviceLifecycleObserver != null) {
            readBoolean.read(new isGeofencesEnabledFromEnvironmentlambda6(serviceLifecycleObserver, cls, 0));
        }
    }

    public final void RemoteActionCompatParcelizer(Class<? extends Service> cls) {
        SdkDiagnostics sdkDiagnosticsWrite = this.write.write();
        ServiceLifecycleObserver serviceLifecycleObserver = sdkDiagnosticsWrite != null ? sdkDiagnosticsWrite.getServiceLifecycleObserver() : null;
        if (serviceLifecycleObserver != null) {
            readBoolean.read(new isGeofencesEnabledFromEnvironmentlambda6(serviceLifecycleObserver, cls, 3));
        }
    }

    public final void serializer(Class<? extends Service> cls) {
        SdkDiagnostics sdkDiagnosticsWrite = this.write.write();
        ServiceLifecycleObserver serviceLifecycleObserver = sdkDiagnosticsWrite != null ? sdkDiagnosticsWrite.getServiceLifecycleObserver() : null;
        if (serviceLifecycleObserver != null) {
            readBoolean.read(new isGeofencesEnabledFromEnvironmentlambda6(serviceLifecycleObserver, cls, 2));
        }
    }

    public final void write(Class<? extends Service> cls) {
        SdkDiagnostics sdkDiagnosticsWrite = this.write.write();
        ServiceLifecycleObserver serviceLifecycleObserver = sdkDiagnosticsWrite != null ? sdkDiagnosticsWrite.getServiceLifecycleObserver() : null;
        if (serviceLifecycleObserver != null) {
            readBoolean.read(new isGeofencesEnabledFromEnvironmentlambda6(serviceLifecycleObserver, cls, 1));
        }
    }

    public postGeofenceReportlambda1(r8lambda7zCvOdb3YpLJDzJMGkbnvobYklg r8lambda7zcvodb3ypljdzjmgkbnvobyklg) {
        r8lambda7zcvodb3ypljdzjmgkbnvobyklg.getClass();
        this.write = r8lambda7zcvodb3ypljdzjmgkbnvobyklg;
    }
}
