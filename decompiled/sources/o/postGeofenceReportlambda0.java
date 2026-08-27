package o;

import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import com.incognia.internal.ZM$$ExternalSyntheticLambda0;
import com.sentiance.sdk.diagnostics.GooglePlayServicesObserver;
import com.sentiance.sdk.diagnostics.SdkDiagnostics;
import com.sentiance.sdk.tile.j$$ExternalSyntheticLambda1;

/* JADX INFO: loaded from: classes3.dex */
public final class postGeofenceReportlambda0 {
    private final r8lambda7zCvOdb3YpLJDzJMGkbnvobYklg RemoteActionCompatParcelizer;

    public postGeofenceReportlambda0(r8lambda7zCvOdb3YpLJDzJMGkbnvobYklg r8lambda7zcvodb3ypljdzjmgkbnvobyklg) {
        r8lambda7zcvodb3ypljdzjmgkbnvobyklg.getClass();
        this.RemoteActionCompatParcelizer = r8lambda7zcvodb3ypljdzjmgkbnvobyklg;
    }

    public final void RemoteActionCompatParcelizer(LocationRequest locationRequest, Task task) {
        locationRequest.getClass();
        SdkDiagnostics sdkDiagnosticsWrite = this.RemoteActionCompatParcelizer.write();
        GooglePlayServicesObserver googlePlayServicesObserver = sdkDiagnosticsWrite != null ? sdkDiagnosticsWrite.getGooglePlayServicesObserver() : null;
        if (googlePlayServicesObserver != null) {
            readBoolean.read(new j$$ExternalSyntheticLambda1(googlePlayServicesObserver, locationRequest, task, 6));
        }
    }

    public final void read(Task task) {
        SdkDiagnostics sdkDiagnosticsWrite = this.RemoteActionCompatParcelizer.write();
        GooglePlayServicesObserver googlePlayServicesObserver = sdkDiagnosticsWrite != null ? sdkDiagnosticsWrite.getGooglePlayServicesObserver() : null;
        if (googlePlayServicesObserver != null) {
            readBoolean.read(new ZM$$ExternalSyntheticLambda0(googlePlayServicesObserver, 28, task));
        }
    }
}
