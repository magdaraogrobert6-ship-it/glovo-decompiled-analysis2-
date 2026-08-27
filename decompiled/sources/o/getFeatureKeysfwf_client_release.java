package o;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes4.dex */
public final class getFeatureKeysfwf_client_release extends getFeaturesExpirationTimefwf_client_release {
    public final getLogLevelfwf_client_release RemoteActionCompatParcelizer = new getLogLevelfwf_client_release();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getFeaturesExpirationTimefwf_client_release
    public final void IconCompatParcelizer(byte[] bArr) {
        getRequestTimeoutfwf_client_release getrequesttimeoutfwf_client_release;
        getLogLevelfwf_client_release getloglevelfwf_client_release = this.RemoteActionCompatParcelizer;
        int length = bArr.length;
        if (length < 32768) {
            return;
        }
        synchronized (getloglevelfwf_client_release) {
            getrequesttimeoutfwf_client_release = (getRequestTimeoutfwf_client_release) getloglevelfwf_client_release.get(Integer.valueOf(length));
            if (getrequesttimeoutfwf_client_release == null) {
                getrequesttimeoutfwf_client_release = new getRequestTimeoutfwf_client_release();
                getloglevelfwf_client_release.put(Integer.valueOf(length), getrequesttimeoutfwf_client_release);
            }
        }
        SoftReference softReference = new SoftReference(bArr);
        synchronized (getrequesttimeoutfwf_client_release) {
            int i = (getrequesttimeoutfwf_client_release.RemoteActionCompatParcelizer + 1) & 511;
            getrequesttimeoutfwf_client_release.RemoteActionCompatParcelizer = i;
            getrequesttimeoutfwf_client_release.serializer[i] = softReference;
        }
    }

    public getFeatureKeysfwf_client_release() {
        new getLogLevelfwf_client_release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getFeaturesExpirationTimefwf_client_release
    public final byte[] IconCompatParcelizer(int i) {
        getRequestTimeoutfwf_client_release getrequesttimeoutfwf_client_release;
        Object obj;
        getLogLevelfwf_client_release getloglevelfwf_client_release = this.RemoteActionCompatParcelizer;
        Object obj2 = null;
        if (i >= 32768) {
            synchronized (getloglevelfwf_client_release) {
                getrequesttimeoutfwf_client_release = (getRequestTimeoutfwf_client_release) getloglevelfwf_client_release.get(Integer.valueOf(i));
            }
            if (getrequesttimeoutfwf_client_release != null) {
                while (true) {
                    synchronized (getrequesttimeoutfwf_client_release) {
                        Object[] objArr = getrequesttimeoutfwf_client_release.serializer;
                        int i2 = getrequesttimeoutfwf_client_release.RemoteActionCompatParcelizer;
                        obj = objArr[i2];
                        objArr[i2] = null;
                        getrequesttimeoutfwf_client_release.RemoteActionCompatParcelizer = (i2 - 1) & 511;
                    }
                    Reference reference = (Reference) obj;
                    if (reference == null) {
                        break;
                    }
                    Object obj3 = reference.get();
                    if (obj3 != null) {
                        obj2 = obj3;
                        break;
                    }
                }
            }
        }
        byte[] bArr = (byte[]) obj2;
        return bArr == null ? new byte[i] : bArr;
    }
}
