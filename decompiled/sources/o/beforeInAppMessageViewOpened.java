package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class beforeInAppMessageViewOpened extends logHtmlInAppMessageClick {
    public int RemoteActionCompatParcelizer;
    public byte[] write;

    @Override // o.logHtmlInAppMessageClick
    public final int serializer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.logHtmlInAppMessageClick
    public final void RemoteActionCompatParcelizer(int i) {
        byte[] bArr = this.write;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.write = Arrays.copyOf(bArr, i);
        }
    }

    @Override // o.logHtmlInAppMessageClick
    public final Object read() {
        return new ContentCardAdapterCardListDiffCallback(Arrays.copyOf(this.write, this.RemoteActionCompatParcelizer));
    }

    public beforeInAppMessageViewOpened(byte[] bArr) {
        this.write = bArr;
        this.RemoteActionCompatParcelizer = bArr.length;
        RemoteActionCompatParcelizer(10);
    }

    public final void serializer(byte b) {
        RemoteActionCompatParcelizer(serializer() + 1);
        byte[] bArr = this.write;
        int i = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = i + 1;
        bArr[i] = b;
    }
}
