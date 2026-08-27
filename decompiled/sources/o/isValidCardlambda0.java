package o;

import android.location.Location;
import bo.app.af$$ExternalSyntheticOutline1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class isValidCardlambda0 {
    private final ArrayList RemoteActionCompatParcelizer;
    private final int read;

    public final int IconCompatParcelizer() {
        return this.read;
    }

    public final List<Location> write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode() + (Integer.hashCode(this.read) * 31);
    }

    public isValidCardlambda0(int i, ArrayList arrayList) {
        this.read = i;
        this.RemoteActionCompatParcelizer = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isValidCardlambda0)) {
            return false;
        }
        isValidCardlambda0 isvalidcardlambda0 = (isValidCardlambda0) obj;
        return this.read == isvalidcardlambda0.read && this.RemoteActionCompatParcelizer.equals(isvalidcardlambda0.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Chain(originalStartIndex=");
        sb.append(this.read);
        sb.append(", locations=");
        return af$$ExternalSyntheticOutline1.m(sb, this.RemoteActionCompatParcelizer, ')');
    }
}
