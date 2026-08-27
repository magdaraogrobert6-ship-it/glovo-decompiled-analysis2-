package bo.app;

import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import java.util.Collection;
import java.util.Set;
import kotlinx.coroutines.BuildersKt;
import o.ItemTouchHelperAdapter;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class b8 {
    public final t1 a;
    public final z7 b;
    public boolean c;

    public static final String b() {
        return "Failed to get all events from storage.";
    }

    public static final String d() {
        return "Failed to log storage exception";
    }

    public final void a(Exception exc) {
        try {
            this.b.b(new sf("A storage exception has occurred!", exc), sf.class);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda3(21), 4, (Object) null);
        }
    }

    public final Collection c() {
        boolean z = this.c;
        ItemTouchHelperAdapter itemTouchHelperAdapter = ItemTouchHelperAdapter.serializer;
        if (z) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b8$$ExternalSyntheticLambda4(0), 6, (Object) null);
            return itemTouchHelperAdapter;
        }
        try {
            return this.a.b();
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b8$$ExternalSyntheticLambda4(27), 4, (Object) null);
            a(e);
            return itemTouchHelperAdapter;
        }
    }

    public b8(t1 t1Var, z7 z7Var) {
        t1Var.getClass();
        z7Var.getClass();
        this.a = t1Var;
        this.b = z7Var;
    }

    public final void a(g9 g9Var) {
        g9Var.getClass();
        a("add event " + g9Var, new ah$$ExternalSyntheticLambda0(this, 25, g9Var));
    }

    public static final createFromParcel a(b8 b8Var, g9 g9Var) {
        b8Var.a.a(g9Var);
        return createFromParcel.INSTANCE;
    }

    public final void a(Set set) {
        set.getClass();
        a("delete events " + set, new ah$$ExternalSyntheticLambda0(this, 24, set));
    }

    public static final createFromParcel a(b8 b8Var, Set set) {
        b8Var.a.a(set);
        return createFromParcel.INSTANCE;
    }

    public static final String a() {
        return "Storage provider is closed. Not getting all events.";
    }

    public final void a(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        if (this.c) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a7$$ExternalSyntheticLambda3(str, 7), 6, (Object) null);
        } else {
            BuildersKt.RemoteActionCompatParcelizer(BrazeCoroutineScope.INSTANCE, null, null, new a8(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, this, str, null), 3);
        }
    }

    public static final String a(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Storage provider is closed. Failed to ", str);
    }
}
