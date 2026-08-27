package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class displayInAppMessage implements Iterator, displayInAppMessagelambda121 {
    public int IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public final CharSequence write;

    public displayInAppMessage(CharSequence charSequence) {
        charSequence.getClass();
        this.write = charSequence;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        this.RemoteActionCompatParcelizer = 0;
        int i = this.serializer;
        int i2 = this.read;
        this.read = this.IconCompatParcelizer + i;
        return this.write.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.RemoteActionCompatParcelizer;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.IconCompatParcelizer < 0) {
            this.RemoteActionCompatParcelizer = 2;
            return false;
        }
        CharSequence charSequence = this.write;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i4 = this.read; i4 < length2; i4++) {
            char cCharAt = charSequence.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.RemoteActionCompatParcelizer = 1;
                this.IconCompatParcelizer = i;
                this.serializer = length;
                return true;
            }
        }
        i = -1;
        this.RemoteActionCompatParcelizer = 1;
        this.IconCompatParcelizer = i;
        this.serializer = length;
        return true;
    }
}
