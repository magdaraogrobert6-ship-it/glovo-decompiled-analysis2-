package o;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdaubR5YzuZjuTxrplc5ra84pKHdyo implements r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 {
    private final r8lambdarI00A69l7k7NAO4I9NDF7haFpGI IconCompatParcelizer;
    private final String write;

    @Override // o.r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4
    public final void IconCompatParcelizer() {
        synchronized (this) {
            this.IconCompatParcelizer.read(this.write);
        }
    }

    @Override // o.r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4
    public final void read() {
        synchronized (this) {
            this.IconCompatParcelizer.write(this.write);
        }
    }

    @Override // o.r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4
    public final String serializer() {
        return this.write;
    }

    @Override // o.r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4
    public final void write() {
        synchronized (this) {
            this.IconCompatParcelizer.read(this.write);
        }
    }

    public r8lambdaubR5YzuZjuTxrplc5ra84pKHdyo(r8lambdarI00A69l7k7NAO4I9NDF7haFpGI r8lambdari00a69l7k7nao4i9ndf7hafpgi, String str) {
        this.IconCompatParcelizer = r8lambdari00a69l7k7nao4i9ndf7hafpgi;
        this.write = str;
    }
}
