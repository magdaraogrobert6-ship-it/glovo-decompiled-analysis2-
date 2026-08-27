package o;

import bo.app.d$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class syncClientfwf_client_release {
    public final String serializer = d$$ExternalSyntheticOutline0.m();
    public final HashSet IconCompatParcelizer = new HashSet();
    public final HashMap write = new HashMap();
    public final HashSet read = new HashSet();
    public final ArrayList RemoteActionCompatParcelizer = new ArrayList();

    public final int hashCode() {
        return this.serializer.hashCode();
    }

    public final void read(getLoggerfwf_client_release getloggerfwf_client_release) {
        getExposureHandlerfwf_client_release getexposurehandlerfwf_client_release = getloggerfwf_client_release.write;
        this.write.put(getHttpClientfwf_client_release.write(getexposurehandlerfwf_client_release.write, getexposurehandlerfwf_client_release.read, getexposurehandlerfwf_client_release.serializer), getloggerfwf_client_release);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || syncClientfwf_client_release.class != obj.getClass()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, ((syncClientfwf_client_release) obj).serializer}, getCieXyz.write())).booleanValue();
    }
}
