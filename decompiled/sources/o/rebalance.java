package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class rebalance extends forEachui_graphicsdefault {
    public final int RemoteActionCompatParcelizer;

    public final int IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return Integer.hashCode(this.RemoteActionCompatParcelizer);
    }

    public rebalance(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rebalance) && this.RemoteActionCompatParcelizer == ((rebalance) obj).RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return af$$ExternalSyntheticOutline0.m(new StringBuilder("ConstraintsNotMet(reason="), this.RemoteActionCompatParcelizer, ')');
    }
}
