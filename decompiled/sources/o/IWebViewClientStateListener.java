package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IWebViewClientStateListener extends logHtmlInAppMessageClick {
    public long[] RemoteActionCompatParcelizer;
    public int read;

    @Override // o.logHtmlInAppMessageClick
    public final int serializer() {
        return this.read;
    }

    @Override // o.logHtmlInAppMessageClick
    public final void RemoteActionCompatParcelizer(int i) {
        long[] jArr = this.RemoteActionCompatParcelizer;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.RemoteActionCompatParcelizer = Arrays.copyOf(jArr, i);
        }
    }

    @Override // o.logHtmlInAppMessageClick
    public final Object read() {
        return new EmptyContentCardsAdapter(Arrays.copyOf(this.RemoteActionCompatParcelizer, this.read));
    }

    public IWebViewClientStateListener(long[] jArr) {
        this.RemoteActionCompatParcelizer = jArr;
        this.read = jArr.length;
        RemoteActionCompatParcelizer(10);
    }

    public final void write(long j) {
        RemoteActionCompatParcelizer(serializer() + 1);
        long[] jArr = this.RemoteActionCompatParcelizer;
        int i = this.read;
        this.read = i + 1;
        jArr[i] = j;
    }
}
