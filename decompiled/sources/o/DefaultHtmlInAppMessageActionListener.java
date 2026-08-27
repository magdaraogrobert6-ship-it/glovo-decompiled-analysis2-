package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultHtmlInAppMessageActionListener extends logHtmlInAppMessageClick {
    public byte[] RemoteActionCompatParcelizer;
    public int serializer;

    @Override // o.logHtmlInAppMessageClick
    public final int serializer() {
        return this.serializer;
    }

    @Override // o.logHtmlInAppMessageClick
    public final void RemoteActionCompatParcelizer(int i) {
        byte[] bArr = this.RemoteActionCompatParcelizer;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.RemoteActionCompatParcelizer = Arrays.copyOf(bArr, i);
        }
    }

    @Override // o.logHtmlInAppMessageClick
    public final Object read() {
        return Arrays.copyOf(this.RemoteActionCompatParcelizer, this.serializer);
    }

    public DefaultHtmlInAppMessageActionListener(byte[] bArr) {
        bArr.getClass();
        this.RemoteActionCompatParcelizer = bArr;
        this.serializer = bArr.length;
        RemoteActionCompatParcelizer(10);
    }

    public final void RemoteActionCompatParcelizer(byte b) {
        RemoteActionCompatParcelizer(serializer() + 1);
        byte[] bArr = this.RemoteActionCompatParcelizer;
        int i = this.serializer;
        this.serializer = i + 1;
        bArr[i] = b;
    }
}
