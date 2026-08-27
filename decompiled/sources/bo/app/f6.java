package bo.app;

/* JADX INFO: loaded from: classes.dex */
public final class f6 implements s9 {
    public final long a;
    public final String b;
    public final r9 c = r9.DISCONNECT_AND_RETRY;

    @Override // bo.app.s9
    public final r9 a() {
        return this.c;
    }

    public f6(long j, String str) {
        this.a = j;
        this.b = str;
    }
}
