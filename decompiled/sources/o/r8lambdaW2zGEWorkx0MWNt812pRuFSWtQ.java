package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaW2zGEWorkx0MWNt812pRuFSWtQ extends r8lambdaSZ2Qv5o_Tom9JUx0KS0E99hczu8 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaW2zGEWorkx0MWNt812pRuFSWtQ(long j, long j2, List<? extends handleLogClickdefault> list) {
        super(j, j2, list);
        list.getClass();
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(serializer());
        return MediaDescriptionCompat().hashCode() + ((Long.hashCode(IconCompatParcelizer()) + (iHashCode * 31)) * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r8lambdaW2zGEWorkx0MWNt812pRuFSWtQ.class != obj.getClass()) {
            return false;
        }
        r8lambdaW2zGEWorkx0MWNt812pRuFSWtQ r8lambdaw2zgeworkx0mwnt812prufswtq = (r8lambdaW2zGEWorkx0MWNt812pRuFSWtQ) obj;
        return serializer() == r8lambdaw2zgeworkx0mwnt812prufswtq.serializer() && IconCompatParcelizer() == r8lambdaw2zgeworkx0mwnt812prufswtq.IconCompatParcelizer() && MediaDescriptionCompat().equals(r8lambdaw2zgeworkx0mwnt812prufswtq.MediaDescriptionCompat());
    }
}
