package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class getNumberEK5gGoQ implements Iterator {
    public final /* synthetic */ getNumPadSubtractEK5gGoQ IconCompatParcelizer;
    public final /* synthetic */ int read;
    public int write = 0;

    public /* synthetic */ getNumberEK5gGoQ(getNumPadSubtractEK5gGoQ getnumpadsubtractek5ggoq, int i) {
        this.read = i;
        this.IconCompatParcelizer = getnumpadsubtractek5ggoq;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i = this.read;
        getNumPadSubtractEK5gGoQ getnumpadsubtractek5ggoq = this.IconCompatParcelizer;
        if (i != 0) {
            String str = getnumpadsubtractek5ggoq.write;
            int i2 = this.write;
            if (i2 < str.length()) {
                this.write = i2 + 1;
                return new getNumPadSubtractEK5gGoQ(String.valueOf(getnumpadsubtractek5ggoq.write.charAt(i2)));
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        String str2 = getnumpadsubtractek5ggoq.write;
        int i3 = this.write;
        if (i3 < str2.length()) {
            this.write = i3 + 1;
            return new getNumPadSubtractEK5gGoQ(String.valueOf(i3));
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.read();
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.read != 0) {
            return this.write < this.IconCompatParcelizer.write.length();
        }
        return this.write < this.IconCompatParcelizer.write.length();
    }
}
