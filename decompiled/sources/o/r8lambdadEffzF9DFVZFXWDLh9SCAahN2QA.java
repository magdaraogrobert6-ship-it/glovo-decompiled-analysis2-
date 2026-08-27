package o;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdadEffzF9DFVZFXWDLh9SCAahN2QA implements r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 {
    private final String IconCompatParcelizer;
    private int serializer = 0;
    private final r8lambdarI00A69l7k7NAO4I9NDF7haFpGI write;

    @Override // o.r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4
    public final void IconCompatParcelizer() {
        synchronized (this) {
            int i = this.serializer;
            if (i == 0) {
                return;
            }
            int i2 = i - 1;
            this.serializer = i2;
            if (i2 == 0) {
                this.write.read(this.IconCompatParcelizer);
            }
        }
    }

    @Override // o.r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4
    public final void read() {
        synchronized (this) {
            if (this.serializer == 0) {
                this.write.write(this.IconCompatParcelizer);
            }
            this.serializer++;
        }
    }

    @Override // o.r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4
    public final String serializer() {
        return this.IconCompatParcelizer;
    }

    @Override // o.r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4
    public final void write() {
        synchronized (this) {
            if (this.serializer == 0) {
                return;
            }
            this.serializer = 0;
            this.write.read(this.IconCompatParcelizer);
        }
    }

    public r8lambdadEffzF9DFVZFXWDLh9SCAahN2QA(r8lambdarI00A69l7k7NAO4I9NDF7haFpGI r8lambdari00a69l7k7nao4i9ndf7hafpgi, String str) {
        this.write = r8lambdari00a69l7k7nao4i9ndf7hafpgi;
        this.IconCompatParcelizer = str;
    }
}
