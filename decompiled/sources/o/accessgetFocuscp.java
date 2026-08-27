package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetFocuscp implements r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ {
    public static final Object serializer = new Object();
    public volatile accessgetFivecp IconCompatParcelizer;
    public volatile Object write;

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        Object objWrite;
        Object obj = this.write;
        Object obj2 = serializer;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            objWrite = this.write;
            if (objWrite == obj2) {
                objWrite = this.IconCompatParcelizer.write();
                Object obj3 = this.write;
                if (obj3 != obj2 && obj3 != objWrite) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objWrite + ". This is likely due to a circular dependency.");
                }
                this.write = objWrite;
                this.IconCompatParcelizer = null;
            }
        }
        return objWrite;
    }

    public static r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ IconCompatParcelizer(accessgetFivecp accessgetfivecp) {
        if (accessgetfivecp instanceof accessgetFocuscp) {
            return accessgetfivecp;
        }
        accessgetFocuscp accessgetfocuscp = new accessgetFocuscp();
        accessgetfocuscp.write = serializer;
        accessgetfocuscp.IconCompatParcelizer = accessgetfivecp;
        return accessgetfocuscp;
    }
}
