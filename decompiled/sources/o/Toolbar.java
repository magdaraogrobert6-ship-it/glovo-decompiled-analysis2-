package o;

/* JADX INFO: loaded from: classes.dex */
public final class Toolbar {
    public final Throwable RemoteActionCompatParcelizer;
    public final int write;

    public Toolbar(int i, Throwable th) {
        this.write = i;
        this.RemoteActionCompatParcelizer = th;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Toolbar)) {
            return false;
        }
        Toolbar toolbar = (Toolbar) obj;
        if (this.write != toolbar.write) {
            return false;
        }
        Throwable th = toolbar.RemoteActionCompatParcelizer;
        Throwable th2 = this.RemoteActionCompatParcelizer;
        if (th2 == null) {
            if (th != null) {
                return false;
            }
        } else if (!th2.equals(th)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "StateError{code=" + this.write + ", cause=" + this.RemoteActionCompatParcelizer + "}";
    }

    public final int hashCode() {
        int i = this.write;
        Throwable th = this.RemoteActionCompatParcelizer;
        return ((i ^ 1000003) * 1000003) ^ (th == null ? 0 : th.hashCode());
    }
}
