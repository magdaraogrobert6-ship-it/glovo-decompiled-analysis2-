package bo.app;

/* JADX INFO: loaded from: classes.dex */
public final class w3 extends k7 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(w5 w5Var) {
        super(k9.CONTENT_CARD_SYNC, w5Var);
        w5Var.getClass();
    }

    @Override // bo.app.k7
    public final void a(long j, rd rdVar, vb vbVar) {
        rdVar.getClass();
        vbVar.getClass();
        super.a(j, rdVar, vbVar);
        Long l = vbVar.b;
        if (l != null) {
            rdVar.b = l.longValue() + j;
            rdVar.a(j, sd.PENDING_RETRY);
            l9 l9Var = rdVar.a;
            e4 e4Var = l9Var instanceof e4 ? (e4) l9Var : null;
            if (e4Var != null) {
                e4Var.n = rdVar.h;
            }
        }
    }

    @Override // bo.app.k7
    public final void a(long j) {
        c(j);
    }
}
