package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class getKatakanaHiraganaEK5gGoQ extends getMannerModeEK5gGoQ {
    public final Object RemoteActionCompatParcelizer;
    public boolean write;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.write;
    }

    public getKatakanaHiraganaEK5gGoQ(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.write) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        this.write = true;
        return this.RemoteActionCompatParcelizer;
    }
}
