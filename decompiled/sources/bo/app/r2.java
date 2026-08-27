package bo.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import kotlinx.coroutines.BuildersKt;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class r2 extends BroadcastReceiver {
    public final /* synthetic */ t2 a;

    public r2(t2 t2Var) {
        this.a = t2Var;
    }

    public static final String a() {
        return "Session seal logic executing in broadcast";
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n4$$ExternalSyntheticLambda0(23), 6, (Object) null);
        BuildersKt.RemoteActionCompatParcelizer(BrazeCoroutineScope.INSTANCE, null, null, new q2(this.a, goAsync(), null), 3);
    }
}
