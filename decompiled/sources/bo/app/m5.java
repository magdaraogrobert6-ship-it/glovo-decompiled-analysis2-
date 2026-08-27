package bo.app;

import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class m5 implements Callable {
    public final /* synthetic */ r5 a;

    public m5(r5 r5Var) {
        this.a = r5Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.a) {
            r5 r5Var = this.a;
            if (r5Var.i == null) {
                return null;
            }
            while (r5Var.h > r5Var.f) {
                r5Var.d((String) ((Map.Entry) r5Var.j.entrySet().iterator().next()).getKey());
            }
            r5 r5Var2 = this.a;
            int i = r5Var2.k;
            if (i >= 2000 && i >= r5Var2.j.size()) {
                this.a.d();
                this.a.k = 0;
            }
            return null;
        }
    }
}
