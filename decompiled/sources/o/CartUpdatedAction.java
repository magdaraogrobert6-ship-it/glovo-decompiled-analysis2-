package o;

/* JADX INFO: loaded from: classes5.dex */
public final class CartUpdatedAction {
    private final Runtime read;

    public final long IconCompatParcelizer() {
        return this.read.totalMemory();
    }

    public final long serializer() {
        return this.read.maxMemory();
    }

    public final long write() {
        return this.read.freeMemory();
    }

    public CartUpdatedAction(Runtime runtime) {
        runtime.getClass();
        this.read = runtime;
    }
}
