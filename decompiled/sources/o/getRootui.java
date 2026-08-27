package o;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class getRootui implements Callable {
    public final /* synthetic */ AndroidViewConfigurationApi34 read;
    public final /* synthetic */ int write;

    public /* synthetic */ getRootui(AndroidViewConfigurationApi34 androidViewConfigurationApi34, int i) {
        this.write = i;
        this.read = androidViewConfigurationApi34;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.write;
        if (i == 0) {
            return this.read.serializer();
        }
        if (i != 1) {
            return i != 2 ? this.read.serializer() : this.read.serializer();
        }
        return this.read.serializer();
    }
}
