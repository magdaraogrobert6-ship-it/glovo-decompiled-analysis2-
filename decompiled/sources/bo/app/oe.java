package bo.app;

import java.util.ArrayList;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class oe {
    public final ArrayList a;

    public final int hashCode() {
        return this.a.hashCode();
    }

    public oe(ArrayList arrayList) {
        arrayList.getClass();
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, ((oe) obj).a}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "SdkDebuggerSendLogEvent(logs=" + this.a + ")";
    }
}
