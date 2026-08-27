package o;

import android.content.Context;
import com.google.firebase.abt.FirebaseABTesting;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class LayoutTreeConsistencyChecker {
    public final AbstractComposeViewExternalSyntheticLambda0 IconCompatParcelizer;
    public final HashMap RemoteActionCompatParcelizer = new HashMap();

    public final FirebaseABTesting write(String str) {
        FirebaseABTesting firebaseABTesting;
        synchronized (this) {
            if (!this.RemoteActionCompatParcelizer.containsKey(str)) {
                this.RemoteActionCompatParcelizer.put(str, new FirebaseABTesting(this.IconCompatParcelizer, str));
            }
            firebaseABTesting = (FirebaseABTesting) this.RemoteActionCompatParcelizer.get(str);
        }
        return firebaseABTesting;
    }

    public LayoutTreeConsistencyChecker(Context context, AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0) {
        this.IconCompatParcelizer = abstractComposeViewExternalSyntheticLambda0;
    }
}
