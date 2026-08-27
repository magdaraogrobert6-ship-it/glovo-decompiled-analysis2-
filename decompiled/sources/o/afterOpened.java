package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class afterOpened extends logHtmlInAppMessageClick {
    public int[] RemoteActionCompatParcelizer;
    public int serializer;

    @Override // o.logHtmlInAppMessageClick
    public final int serializer() {
        return this.serializer;
    }

    @Override // o.logHtmlInAppMessageClick
    public final void RemoteActionCompatParcelizer(int i) {
        int[] iArr = this.RemoteActionCompatParcelizer;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.RemoteActionCompatParcelizer = Arrays.copyOf(iArr, i);
        }
    }

    @Override // o.logHtmlInAppMessageClick
    public final Object read() {
        return Arrays.copyOf(this.RemoteActionCompatParcelizer, this.serializer);
    }

    public afterOpened(int[] iArr) {
        iArr.getClass();
        this.RemoteActionCompatParcelizer = iArr;
        this.serializer = iArr.length;
        RemoteActionCompatParcelizer(10);
    }

    public final void write(int i) {
        RemoteActionCompatParcelizer(serializer() + 1);
        int[] iArr = this.RemoteActionCompatParcelizer;
        int i2 = this.serializer;
        this.serializer = i2 + 1;
        iArr[i2] = i;
    }
}
