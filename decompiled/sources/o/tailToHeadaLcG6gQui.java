package o;

import com.google.firebase.firestore.FirebaseFirestore;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tailToHeadaLcG6gQui {
    public final accessgetPointerInputSourcecp IconCompatParcelizer;
    public final FirebaseFirestore write;

    public final int hashCode() {
        return this.write.hashCode() + (this.IconCompatParcelizer.hashCode() * 31);
    }

    public tailToHeadaLcG6gQui(accessgetPointerInputSourcecp accessgetpointerinputsourcecp, FirebaseFirestore firebaseFirestore) {
        this.IconCompatParcelizer = accessgetpointerinputsourcecp;
        this.write = firebaseFirestore;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tailToHeadaLcG6gQui)) {
            return false;
        }
        tailToHeadaLcG6gQui tailtoheadalcg6gqui = (tailToHeadaLcG6gQui) obj;
        return this.IconCompatParcelizer.equals(tailtoheadalcg6gqui.IconCompatParcelizer) && this.write.equals(tailtoheadalcg6gqui.write);
    }
}
