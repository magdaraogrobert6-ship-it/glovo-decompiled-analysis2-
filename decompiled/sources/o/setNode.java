package o;

import androidx.work.WorkerKt$$ExternalSyntheticLambda2;
import com.google.firebase.firestore.FirebaseFirestoreException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class setNode implements resetStateui {
    public final headToTailaLcG6gQui RemoteActionCompatParcelizer;
    public volatile boolean read = false;
    public final Executor serializer;

    public setNode(Executor executor, headToTailaLcG6gQui headtotailalcg6gqui) {
        this.serializer = executor;
        this.RemoteActionCompatParcelizer = headtotailalcg6gqui;
    }

    @Override // o.resetStateui
    public final void serializer(Object obj, FirebaseFirestoreException firebaseFirestoreException) {
        this.serializer.execute(new WorkerKt$$ExternalSyntheticLambda2(this, obj, firebaseFirestoreException, 24));
    }
}
