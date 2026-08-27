package o;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
final class properties_delegatelambda00 {
    private final int IconCompatParcelizer;
    private final File RemoteActionCompatParcelizer;
    private final int read;
    private final int write;

    public final int IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final int read() {
        return this.write;
    }

    public final String serializer() {
        return this.RemoteActionCompatParcelizer.getName();
    }

    public properties_delegatelambda00(int i, int i2, File file, int i3) {
        this.write = i;
        this.read = i2;
        this.RemoteActionCompatParcelizer = file;
        this.IconCompatParcelizer = i3;
    }
}
