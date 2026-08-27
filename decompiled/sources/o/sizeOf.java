package o;

import android.hardware.camera2.params.SessionConfiguration;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class sizeOf implements trimToSize {
    public final ArrayList RemoteActionCompatParcelizer;

    @Override // o.trimToSize
    public final getUseEvaluationsCachefwf_client_release RemoteActionCompatParcelizer(SessionConfiguration sessionConfiguration) {
        Iterator it = this.RemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            getUseEvaluationsCachefwf_client_release getuseevaluationscachefwf_client_releaseRemoteActionCompatParcelizer = ((trimToSize) it.next()).RemoteActionCompatParcelizer(sessionConfiguration);
            if (getuseevaluationscachefwf_client_releaseRemoteActionCompatParcelizer.write != 0) {
                return getuseevaluationscachefwf_client_releaseRemoteActionCompatParcelizer;
            }
        }
        return new getUseEvaluationsCachefwf_client_release((byte) 0, 0, 1);
    }

    public sizeOf(ArrayList arrayList) {
        this.RemoteActionCompatParcelizer = arrayList;
    }
}
