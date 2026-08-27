package o;

import bo.app.w$$ExternalSyntheticLambda0;
import java.io.OutputStream;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class isInLayerimpl extends OutputStream {
    @Override // java.io.OutputStream
    public final void write(int i) {
    }

    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        int i3 = i2 + i;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(bArr.length)};
        int iWrite = w$$ExternalSyntheticLambda0.write();
        TextStreamsKt.read(objArr, w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), 298335113, w$$ExternalSyntheticLambda0.write(), -298335113, iWrite);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        bArr.getClass();
    }
}
