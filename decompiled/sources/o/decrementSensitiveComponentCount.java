package o;

import com.google.mlkit.vision.face.internal.zzm;
import io.grpc.Status;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class decrementSensitiveComponentCount implements getAutofill {
    public final /* synthetic */ getAccessibilityManager read;

    @Override // o.getAutofill
    public final void read() {
        getAccessibilityManager getaccessibilitymanager = this.read;
        Iterator it = getaccessibilitymanager.IconCompatParcelizer.values().iterator();
        while (it.hasNext()) {
            getaccessibilitymanager.RemoteActionCompatParcelizer((setLastShapeui) it.next());
        }
    }

    public decrementSensitiveComponentCount(getAccessibilityManager getaccessibilitymanager) {
        this.read = getaccessibilitymanager;
    }

    @Override // o.getAutofill
    public final void read(Status status) {
        boolean zIconCompatParcelizer = status.IconCompatParcelizer();
        getAccessibilityManager getaccessibilitymanager = this.read;
        if (zIconCompatParcelizer) {
            getRectManager.RemoteActionCompatParcelizer(!getaccessibilitymanager.RemoteActionCompatParcelizer(), "Watch stream was stopped gracefully while still needed.", new Object[0]);
        }
        getaccessibilitymanager.MediaBrowserCompatMediaItem = null;
        boolean zRemoteActionCompatParcelizer = getaccessibilitymanager.RemoteActionCompatParcelizer();
        zzm zzmVar = getaccessibilitymanager.read;
        if (!zRemoteActionCompatParcelizer) {
            zzmVar.serializer(accessgetDrawBlockCanvasp.UNKNOWN);
            return;
        }
        if (((accessgetDrawBlockCanvasp) zzmVar.IconCompatParcelizer) == accessgetDrawBlockCanvasp.ONLINE) {
            zzmVar.read(accessgetDrawBlockCanvasp.UNKNOWN);
            getRectManager.RemoteActionCompatParcelizer(zzmVar.write == 0, "watchStreamFailures must be 0", new Object[0]);
            getRectManager.RemoteActionCompatParcelizer(((com.huawei.wisesecurity.ucs_credential.x) zzmVar.read) == null, "onlineStateTimer must be null", new Object[0]);
        } else {
            int i = zzmVar.write + 1;
            zzmVar.write = i;
            if (i >= 1) {
                com.huawei.wisesecurity.ucs_credential.x xVar = (com.huawei.wisesecurity.ucs_credential.x) zzmVar.read;
                if (xVar != null) {
                    xVar.cancel();
                    zzmVar.read = null;
                }
                java.util.Locale locale = java.util.Locale.ENGLISH;
                zzmVar.read("Connection failed 1 times. Most recent error: " + status);
                zzmVar.read(accessgetDrawBlockCanvasp.OFFLINE);
            }
        }
        getaccessibilitymanager.MediaSessionCompatQueueItem();
    }
}
