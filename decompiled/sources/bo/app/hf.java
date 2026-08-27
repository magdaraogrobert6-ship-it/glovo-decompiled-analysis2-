package bo.app;

import com.braze.models.IPutIntoJson;
import java.util.UUID;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class hf implements IPutIntoJson {
    public final UUID a;
    public final String b;

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        return this.b;
    }

    public final String toString() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public hf(UUID uuid) {
        uuid.getClass();
        this.a = uuid;
        String string = uuid.toString();
        string.getClass();
        this.b = string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, ((hf) obj).a}, getCieXyz.write())).booleanValue();
    }
}
