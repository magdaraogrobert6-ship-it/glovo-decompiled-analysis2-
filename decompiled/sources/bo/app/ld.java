package bo.app;

import com.braze.coroutine.BrazeCoroutineScope;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes.dex */
public final class ld implements aa {
    public final bb a;
    public final z7 b;
    public final u9 c;
    public final df d;
    public final d4 e;
    public final h2 f;
    public final i7 g;

    public ld(bb bbVar, z7 z7Var, u9 u9Var, df dfVar, d4 d4Var, h2 h2Var, i7 i7Var) {
        bbVar.getClass();
        z7Var.getClass();
        u9Var.getClass();
        dfVar.getClass();
        d4Var.getClass();
        h2Var.getClass();
        i7Var.getClass();
        this.a = bbVar;
        this.b = z7Var;
        this.c = u9Var;
        this.d = dfVar;
        this.e = d4Var;
        this.f = h2Var;
        this.g = i7Var;
    }

    @Override // bo.app.aa
    public final void a(rd rdVar, md mdVar) {
        rdVar.getClass();
        mdVar.getClass();
        BuildersKt.RemoteActionCompatParcelizer(BrazeCoroutineScope.INSTANCE, null, null, new kd(this, rdVar, mdVar, null), 3);
    }
}
