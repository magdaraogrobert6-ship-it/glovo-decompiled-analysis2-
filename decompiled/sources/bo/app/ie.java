package bo.app;

/* JADX INFO: loaded from: classes.dex */
public final class ie extends k7 {
    public final boolean k;

    @Override // bo.app.k7
    public final boolean c() {
        return this.k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie(w5 w5Var) {
        super(k9.SDK_DEBUGGER_INIT, w5Var);
        w5Var.getClass();
        this.k = true;
    }

    @Override // bo.app.k7
    public final void a(long j, rd rdVar, j jVar) {
        rdVar.getClass();
        jVar.getClass();
        super.a(j, rdVar, jVar);
        rdVar.a(j, sd.COMPLETE);
    }

    @Override // bo.app.k7
    public final void a(long j) {
        c(j);
    }
}
