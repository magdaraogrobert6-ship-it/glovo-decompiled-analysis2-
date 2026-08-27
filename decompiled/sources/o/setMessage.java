package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class setMessage {
    private final handleLogClickdefault IconCompatParcelizer;
    private final handleLogClickdefault serializer;
    private final handleLogClickdefault write;

    public final handleLogClickdefault RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final int hashCode() {
        handleLogClickdefault handlelogclickdefault = this.IconCompatParcelizer;
        int iHashCode = handlelogclickdefault == null ? 0 : handlelogclickdefault.hashCode();
        handleLogClickdefault handlelogclickdefault2 = this.write;
        int iHashCode2 = handlelogclickdefault2 == null ? 0 : handlelogclickdefault2.hashCode();
        handleLogClickdefault handlelogclickdefault3 = this.serializer;
        return (((iHashCode * 31) + iHashCode2) * 31) + (handlelogclickdefault3 != null ? handlelogclickdefault3.hashCode() : 0);
    }

    public final handleLogClickdefault serializer() {
        return this.write;
    }

    public final handleLogClickdefault write() {
        return this.serializer;
    }

    public final List<handleLogClickdefault> IconCompatParcelizer() {
        return androidx.sqlite.SQLite.read(this.IconCompatParcelizer, this.write, this.serializer);
    }

    public setMessage(handleLogClickdefault handlelogclickdefault, handleLogClickdefault handlelogclickdefault2, handleLogClickdefault handlelogclickdefault3) {
        this.IconCompatParcelizer = handlelogclickdefault;
        this.write = handlelogclickdefault2;
        this.serializer = handlelogclickdefault3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setMessage)) {
            return false;
        }
        setMessage setmessage = (setMessage) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, setmessage.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, setmessage.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, setmessage.serializer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "AdjacentWaypoints(prev=" + this.IconCompatParcelizer + ", equal=" + this.write + ", next=" + this.serializer + ')';
    }
}
