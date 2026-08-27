package o;

import com.google.firebase.firestore.model.SnapshotVersion;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class orH91voCI {
    public final ArrayList serializer;
    public final SnapshotVersion write;

    public orH91voCI(SnapshotVersion snapshotVersion, ArrayList arrayList) {
        snapshotVersion.getClass();
        this.write = snapshotVersion;
        this.serializer = arrayList;
    }
}
