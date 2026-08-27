package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IHtmlInAppMessageActionListener extends logHtmlInAppMessageClick {
    public int RemoteActionCompatParcelizer;
    public short[] serializer;

    @Override // o.logHtmlInAppMessageClick
    public final int serializer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.logHtmlInAppMessageClick
    public final void RemoteActionCompatParcelizer(int i) {
        short[] sArr = this.serializer;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.serializer = Arrays.copyOf(sArr, i);
        }
    }

    @Override // o.logHtmlInAppMessageClick
    public final Object read() {
        return Arrays.copyOf(this.serializer, this.RemoteActionCompatParcelizer);
    }

    public IHtmlInAppMessageActionListener(short[] sArr) {
        sArr.getClass();
        this.serializer = sArr;
        this.RemoteActionCompatParcelizer = sArr.length;
        RemoteActionCompatParcelizer(10);
    }

    public final void write(short s) {
        RemoteActionCompatParcelizer(serializer() + 1);
        short[] sArr = this.serializer;
        int i = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = i + 1;
        sArr[i] = s;
    }
}
