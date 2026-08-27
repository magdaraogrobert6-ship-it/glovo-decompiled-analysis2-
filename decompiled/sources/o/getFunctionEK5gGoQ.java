package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.gtm.zzkh;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getFunctionEK5gGoQ {
    public HashMap write;

    public boolean RemoteActionCompatParcelizer(String str) {
        return false;
    }

    public abstract Object read();

    public abstract String toString();

    public Iterator write() {
        return new getHEK5gGoQ();
    }

    public getFunctionEK5gGoQ IconCompatParcelizer(String str) {
        HashMap map = this.write;
        return map != null ? (getFunctionEK5gGoQ) map.get(str) : getHelpEK5gGoQ.read;
    }

    public getDirectionDownEK5gGoQ read(String str) {
        throw new IllegalStateException(ff$$ExternalSyntheticOutline0.m("Attempting to access Native Method ", str, " on unsupported type."));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Iterator serializer() {
        HashMap map = this.write;
        return map == null ? new getHEK5gGoQ() : new zzkh(map.keySet().iterator(), 0, (boolean) (0 == true ? 1 : 0));
    }

    public final void write(getFunctionEK5gGoQ getfunctionek5ggoq, String str) {
        if (this.write == null) {
            this.write = new HashMap();
        }
        this.write.put(str, getfunctionek5ggoq);
    }
}
