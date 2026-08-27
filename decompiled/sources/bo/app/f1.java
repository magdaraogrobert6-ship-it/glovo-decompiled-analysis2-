package bo.app;

import com.braze.models.IPutIntoJson;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class f1 implements IPutIntoJson {
    public final String a;

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        return this.a;
    }

    public final String toString() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public f1(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, ((f1) obj).a}, getCieXyz.write())).booleanValue();
    }
}
