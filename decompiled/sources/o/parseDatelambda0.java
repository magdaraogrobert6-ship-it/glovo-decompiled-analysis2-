package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes4.dex */
public final class parseDatelambda0 {
    public final int IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String write;

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode() + af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, this.write.hashCode() * 31, 31);
    }

    public parseDatelambda0(String str, int i, String str2) {
        str2.getClass();
        this.write = str;
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof parseDatelambda0)) {
            return false;
        }
        parseDatelambda0 parsedatelambda0 = (parseDatelambda0) obj;
        if (!this.write.equals(parsedatelambda0.write) || this.IconCompatParcelizer != parsedatelambda0.IconCompatParcelizer) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, parsedatelambda0.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(m1$$ExternalSyntheticOutline0.m("SummationItemViewEntity(caption=", this.IconCompatParcelizer, this.write, ", icon=", ", title="), this.RemoteActionCompatParcelizer, ")");
    }
}
