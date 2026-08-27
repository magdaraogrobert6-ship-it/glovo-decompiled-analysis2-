package o;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class accessgetNumPad0cp implements OuterPlacementScope, PausedPrecompositionImpl {
    public static final /* synthetic */ accessgetNumPad0cp RemoteActionCompatParcelizer = new accessgetNumPad0cp();
    public static final /* synthetic */ accessgetNumPad0cp read = new accessgetNumPad0cp();

    @Override // o.OuterPlacementScope
    public Object then(Task task) throws IOException {
        if (task.isSuccessful()) {
            return (Bundle) task.getResult();
        }
        if (Log.isLoggable("Rpc", 3)) {
            "Error making request: ".concat(String.valueOf(task.getException()));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
    }

    @Override // o.PausedPrecompositionImpl
    public Task then(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = Rpc.RemoteActionCompatParcelizer;
        if (bundle != null && bundle.containsKey("google.messenger")) {
            return LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);
        }
        return LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(bundle);
    }
}
