package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class onClicked extends logHtmlInAppMessageClick {
    public int RemoteActionCompatParcelizer;
    public long[] read;

    @Override // o.logHtmlInAppMessageClick
    public final int serializer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.logHtmlInAppMessageClick
    public final void RemoteActionCompatParcelizer(int i) {
        long[] jArr = this.read;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.read = Arrays.copyOf(jArr, i);
        }
    }

    @Override // o.logHtmlInAppMessageClick
    public final Object read() {
        return Arrays.copyOf(this.read, this.RemoteActionCompatParcelizer);
    }

    public onClicked(long[] jArr) {
        jArr.getClass();
        this.read = jArr;
        this.RemoteActionCompatParcelizer = jArr.length;
        RemoteActionCompatParcelizer(10);
    }

    public final void RemoteActionCompatParcelizer(long j) {
        RemoteActionCompatParcelizer(serializer() + 1);
        long[] jArr = this.read;
        int i = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = i + 1;
        jArr[i] = j;
    }
}
