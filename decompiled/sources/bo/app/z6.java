package bo.app;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import o.SimpleItemTouchHelperCallback;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class z6 implements aa {
    public final z7 a;
    public final h2 b;

    public z6(z7 z7Var, h2 h2Var) {
        z7Var.getClass();
        h2Var.getClass();
        this.a = z7Var;
        this.b = h2Var;
        new ArrayList();
    }

    @Override // bo.app.aa
    public final void a(rd rdVar, md mdVar) {
        rdVar.getClass();
        mdVar.getClass();
        l9 l9Var = rdVar.a;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda0(27, l9Var), 7, (Object) null);
        vb vbVar = new vb(l9Var, new v9(201, SimpleItemTouchHelperCallback.serializer, 4), this.b);
        z7 z7Var = this.a;
        l9Var.a(z7Var, z7Var, vbVar);
        l9Var.b(this.a);
        mdVar.a(vbVar);
        this.a.b(new y5(l9Var), y5.class);
    }

    public static final String a(l9 l9Var) {
        return d$$ExternalSyntheticOutline0.m(l9Var.hashCode(), "Short circuiting execution of network request (", ") and immediately marking it as succeeded.");
    }
}
