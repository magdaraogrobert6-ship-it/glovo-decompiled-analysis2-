package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes4.dex */
public final class getRandom {
    public final int RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;

    public final int hashCode() {
        return d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, this.read.hashCode() * 31, 31), 31, this.serializer), 961, false);
    }

    public getRandom(String str, int i, String str2) {
        str2.getClass();
        this.read = str;
        this.RemoteActionCompatParcelizer = i;
        this.serializer = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getRandom)) {
            return false;
        }
        getRandom getrandom = (getRandom) obj;
        if (!this.read.equals(getrandom.read) || this.RemoteActionCompatParcelizer != getrandom.RemoteActionCompatParcelizer) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, getrandom.serializer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(m1$$ExternalSyntheticOutline0.m("TileViewEntity(caption=", this.RemoteActionCompatParcelizer, this.read, ", icon=", ", title="), this.serializer, ", shouldShowAction=false, actionTitle=null, action=null)");
    }
}
