package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract class migrateTriggersReeligibilityToJsonlambda1<T> {
    private boolean IconCompatParcelizer;
    private T serializer;

    public abstract T RemoteActionCompatParcelizer();

    public final T read() {
        T t;
        synchronized (this) {
            if (!this.IconCompatParcelizer) {
                this.IconCompatParcelizer = true;
                this.serializer = RemoteActionCompatParcelizer();
            }
            t = this.serializer;
        }
        return t;
    }

    public final boolean serializer() {
        return this.IconCompatParcelizer;
    }

    public final void read(T t) {
        synchronized (this) {
            this.IconCompatParcelizer = true;
            this.serializer = t;
        }
    }

    public final void write() {
        synchronized (this) {
            this.IconCompatParcelizer = false;
        }
    }
}
