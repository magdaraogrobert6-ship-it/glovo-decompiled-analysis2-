package bo.app;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DelayedInitializationAnalyticsBehavior;
import com.braze.support.BrazeLogger;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import o.getCieXyz;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class a5 {
    public final z4 a;
    public final CopyOnWriteArrayList b;

    public a5(Context context) {
        context.getClass();
        this.a = new z4(context);
        this.b = new CopyOnWriteArrayList();
    }

    public final void a(i9 i9Var) {
        i9Var.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda0(6, this), 6, (Object) null);
        Iterator it = this.b.iterator();
        it.getClass();
        while (it.hasNext()) {
            g9 g9Var = (g9) it.next();
            g9Var.getClass();
            ((h2) i9Var).a(g9Var);
        }
        this.b.clear();
    }

    public final void b(DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) {
        delayedInitializationAnalyticsBehavior.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda3(4), 6, (Object) null);
        b(true);
        this.a.writeData(DataStoreKey.DELAYED_INIT_SET_DURING_RUNTIME_FLAG, Boolean.TRUE);
        c(delayedInitializationAnalyticsBehavior);
    }

    public final void c(DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) {
        delayedInitializationAnalyticsBehavior.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a5$$ExternalSyntheticLambda0(0, delayedInitializationAnalyticsBehavior), 6, (Object) null);
        this.a.writeData(DataStoreKey.DELAYED_INIT_ANALYTICS_BEHAVIOR_FLAG, delayedInitializationAnalyticsBehavior.getValue());
    }

    public final boolean c() {
        Object[] objArr = {this.a.readBoolean(DataStoreKey.DELAYED_INIT_ENABLED, Boolean.FALSE), Boolean.TRUE};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }

    public static final String b() {
        return "Enqueuing push analytics event";
    }

    public final void b(boolean z) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a5$$ExternalSyntheticLambda4(z, 0), 6, (Object) null);
        this.a.writeData(DataStoreKey.DELAYED_INIT_ENABLED, Boolean.valueOf(z));
    }

    public static final String a(DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Setting delayed initialization analytics behavior to: ", delayedInitializationAnalyticsBehavior.getValue());
    }

    public final void a(g9 g9Var) {
        g9Var.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda3(5), 6, (Object) null);
        if (DelayedInitializationAnalyticsBehavior.Companion.fromString(this.a.readString(DataStoreKey.DELAYED_INIT_ANALYTICS_BEHAVIOR_FLAG, "")) == DelayedInitializationAnalyticsBehavior.QUEUE) {
            this.b.add(g9Var);
        }
    }

    public static final String a() {
        return "enableDelayedInitialization invoked";
    }

    public static final String a(boolean z) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Setting delayed initialization enabled to: ", z);
    }

    public static final String a(a5 a5Var) {
        return d$$ExternalSyntheticOutline0.m(a5Var.b.size(), "Flushing push analytics queue with ", " events");
    }
}
