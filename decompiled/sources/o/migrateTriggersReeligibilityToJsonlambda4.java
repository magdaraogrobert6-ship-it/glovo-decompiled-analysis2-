package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract class migrateTriggersReeligibilityToJsonlambda4<T> {
    private boolean RemoteActionCompatParcelizer;
    private boolean read;
    private T write;

    public abstract T IconCompatParcelizer();

    public final T read() {
        T t;
        synchronized (this) {
            if (!this.RemoteActionCompatParcelizer) {
                T tIconCompatParcelizer = IconCompatParcelizer();
                this.write = tIconCompatParcelizer;
                this.RemoteActionCompatParcelizer = (tIconCompatParcelizer == null && this.read) ? false : true;
            }
            t = this.write;
        }
        return t;
    }

    public final void IconCompatParcelizer(T t) {
        synchronized (this) {
            this.RemoteActionCompatParcelizer = true;
            this.write = t;
        }
    }

    public final void write() {
        synchronized (this) {
            this.RemoteActionCompatParcelizer = false;
        }
    }

    public final void serializer() {
        synchronized (this) {
            this.read = true;
        }
    }
}
