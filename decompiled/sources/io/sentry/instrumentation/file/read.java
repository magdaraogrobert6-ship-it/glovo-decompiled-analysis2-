package io.sentry.instrumentation.file;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class read implements RemoteActionCompatParcelizer {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ byte[] RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Closeable serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ read(Closeable closeable, byte[] bArr, int i, int i2, int i3) {
        this.write = i3;
        this.serializer = closeable;
        this.RemoteActionCompatParcelizer = bArr;
        this.read = i;
        this.IconCompatParcelizer = i2;
    }

    @Override // io.sentry.instrumentation.file.RemoteActionCompatParcelizer
    public final Object RemoteActionCompatParcelizer() throws IOException {
        int i = this.write;
        int i2 = this.IconCompatParcelizer;
        int i3 = this.read;
        byte[] bArr = this.RemoteActionCompatParcelizer;
        Closeable closeable = this.serializer;
        if (i == 0) {
            return Integer.valueOf(((write) closeable).write.read(bArr, i3, i2));
        }
        ((serializer) closeable).RemoteActionCompatParcelizer.write(bArr, i3, i2);
        return Integer.valueOf(i2);
    }
}
