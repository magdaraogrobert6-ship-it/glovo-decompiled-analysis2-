package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambda14PesggIY_s2tF27Zrq3qgu3B8 extends logHtmlInAppMessageClick {
    public char[] RemoteActionCompatParcelizer;
    public int write;

    @Override // o.logHtmlInAppMessageClick
    public final int serializer() {
        return this.write;
    }

    @Override // o.logHtmlInAppMessageClick
    public final void RemoteActionCompatParcelizer(int i) {
        char[] cArr = this.RemoteActionCompatParcelizer;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.RemoteActionCompatParcelizer = Arrays.copyOf(cArr, i);
        }
    }

    @Override // o.logHtmlInAppMessageClick
    public final Object read() {
        return Arrays.copyOf(this.RemoteActionCompatParcelizer, this.write);
    }

    public r8lambda14PesggIY_s2tF27Zrq3qgu3B8(char[] cArr) {
        cArr.getClass();
        this.RemoteActionCompatParcelizer = cArr;
        this.write = cArr.length;
        RemoteActionCompatParcelizer(10);
    }

    public final void read(char c) {
        RemoteActionCompatParcelizer(serializer() + 1);
        char[] cArr = this.RemoteActionCompatParcelizer;
        int i = this.write;
        this.write = i + 1;
        cArr[i] = c;
    }
}
