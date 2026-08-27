package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class NestfgetmView extends logHtmlInAppMessageClick {
    public short[] IconCompatParcelizer;
    public int serializer;

    @Override // o.logHtmlInAppMessageClick
    public final int serializer() {
        return this.serializer;
    }

    @Override // o.logHtmlInAppMessageClick
    public final void RemoteActionCompatParcelizer(int i) {
        short[] sArr = this.IconCompatParcelizer;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.IconCompatParcelizer = Arrays.copyOf(sArr, i);
        }
    }

    @Override // o.logHtmlInAppMessageClick
    public final Object read() {
        return new DefaultContentCardsUpdateHandlerCompanion(Arrays.copyOf(this.IconCompatParcelizer, this.serializer));
    }

    public NestfgetmView(short[] sArr) {
        this.IconCompatParcelizer = sArr;
        this.serializer = sArr.length;
        RemoteActionCompatParcelizer(10);
    }

    public final void serializer(short s) {
        RemoteActionCompatParcelizer(serializer() + 1);
        short[] sArr = this.IconCompatParcelizer;
        int i = this.serializer;
        this.serializer = i + 1;
        sArr[i] = s;
    }
}
