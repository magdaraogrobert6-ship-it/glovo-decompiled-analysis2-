package o;

import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes.dex */
public final class accesscontainsUv8p0NA {
    public int serializer = 0;

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.serializer);
        sb.append(")@");
        int iHashCode = hashCode();
        TuplesKt.RemoteActionCompatParcelizer(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        sb.append(string);
        return sb.toString();
    }
}
