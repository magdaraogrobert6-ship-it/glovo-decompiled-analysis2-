package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class onPreKeyEventZmokQxo extends onPreviewKeyEvent {
    public final int write;

    @Override // o.onPreviewKeyEvent
    public final int RemoteActionCompatParcelizer() {
        return this.write;
    }

    @Override // o.onPreviewKeyEvent
    public final byte read(int i) {
        int i2 = this.write;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.serializer[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(d$$ExternalSyntheticOutline0.m(i, "Index < 0: ", new StringBuilder(String.valueOf(i).length() + 11)));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i2).length());
        sb.append("Index > length: ");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }

    @Override // o.onPreviewKeyEvent
    public final byte write(int i) {
        return this.serializer[i];
    }

    public onPreKeyEventZmokQxo(byte[] bArr, int i) {
        super(bArr);
        onPreviewKeyEvent.serializer(0, i, bArr.length);
        this.write = i;
    }
}
