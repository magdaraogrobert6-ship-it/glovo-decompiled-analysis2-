package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class InAppMessageJavascriptInterfacerequestPushPermission1 extends logHtmlInAppMessageClick {
    public int IconCompatParcelizer;
    public boolean[] read;

    @Override // o.logHtmlInAppMessageClick
    public final int serializer() {
        return this.IconCompatParcelizer;
    }

    @Override // o.logHtmlInAppMessageClick
    public final void RemoteActionCompatParcelizer(int i) {
        boolean[] zArr = this.read;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.read = Arrays.copyOf(zArr, i);
        }
    }

    @Override // o.logHtmlInAppMessageClick
    public final Object read() {
        return Arrays.copyOf(this.read, this.IconCompatParcelizer);
    }

    public InAppMessageJavascriptInterfacerequestPushPermission1(boolean[] zArr) {
        zArr.getClass();
        this.read = zArr;
        this.IconCompatParcelizer = zArr.length;
        RemoteActionCompatParcelizer(10);
    }

    public final void serializer(boolean z) {
        RemoteActionCompatParcelizer(serializer() + 1);
        boolean[] zArr = this.read;
        int i = this.IconCompatParcelizer;
        this.IconCompatParcelizer = i + 1;
        zArr[i] = z;
    }
}
