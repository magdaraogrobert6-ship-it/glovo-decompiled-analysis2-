package o;

/* JADX INFO: loaded from: classes4.dex */
public final class measureAndLayoutForTest implements getTextInputServiceannotations {
    public static final Object RemoteActionCompatParcelizer = new Object();
    public volatile forceAccessibilityForTesting IconCompatParcelizer;
    public volatile Object read;

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        Object objWrite;
        Object obj = this.read;
        Object obj2 = RemoteActionCompatParcelizer;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            objWrite = this.read;
            if (objWrite == obj2) {
                objWrite = this.IconCompatParcelizer.write();
                Object obj3 = this.read;
                if (obj3 != obj2 && obj3 != objWrite) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objWrite + ". This is likely due to a circular dependency.");
                }
                this.read = objWrite;
                this.IconCompatParcelizer = null;
            }
        }
        return objWrite;
    }

    public static getTextInputServiceannotations read(forceAccessibilityForTesting forceaccessibilityfortesting) {
        if (forceaccessibilityfortesting instanceof measureAndLayoutForTest) {
            return forceaccessibilityfortesting;
        }
        measureAndLayoutForTest measureandlayoutfortest = new measureAndLayoutForTest();
        measureandlayoutfortest.read = RemoteActionCompatParcelizer;
        measureandlayoutfortest.IconCompatParcelizer = forceaccessibilityfortesting;
        return measureandlayoutfortest;
    }
}
