package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IInAppMessageWebViewClientListener extends logHtmlInAppMessageClick {
    public int read;
    public int[] write;

    @Override // o.logHtmlInAppMessageClick
    public final int serializer() {
        return this.read;
    }

    @Override // o.logHtmlInAppMessageClick
    public final void RemoteActionCompatParcelizer(int i) {
        int[] iArr = this.write;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.write = Arrays.copyOf(iArr, i);
        }
    }

    @Override // o.logHtmlInAppMessageClick
    public final Object read() {
        return new ContentCardAdapterExternalSyntheticLambda6(Arrays.copyOf(this.write, this.read));
    }

    public IInAppMessageWebViewClientListener(int[] iArr) {
        this.write = iArr;
        this.read = iArr.length;
        RemoteActionCompatParcelizer(10);
    }

    public final void IconCompatParcelizer(int i) {
        RemoteActionCompatParcelizer(serializer() + 1);
        int[] iArr = this.write;
        int i2 = this.read;
        this.read = i2 + 1;
        iArr[i2] = i;
    }
}
