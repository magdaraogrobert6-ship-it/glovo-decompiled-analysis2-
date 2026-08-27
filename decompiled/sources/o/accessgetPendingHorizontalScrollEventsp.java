package o;

/* JADX INFO: loaded from: classes4.dex */
public final class accessgetPendingHorizontalScrollEventsp implements accessgetCurrentlyFocusedANIp {
    public static final Object serializer = new Object();
    public volatile Object RemoteActionCompatParcelizer;
    public volatile accessgetFocusedVirtualViewIdp write;

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        Object objWrite;
        Object obj = this.RemoteActionCompatParcelizer;
        Object obj2 = serializer;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            objWrite = this.RemoteActionCompatParcelizer;
            if (objWrite == obj2) {
                objWrite = this.write.write();
                Object obj3 = this.RemoteActionCompatParcelizer;
                if (obj3 != obj2 && obj3 != objWrite) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objWrite + ". This is likely due to a circular dependency.");
                }
                this.RemoteActionCompatParcelizer = objWrite;
                this.write = null;
            }
        }
        return objWrite;
    }

    public static accessgetCurrentlyFocusedANIp IconCompatParcelizer(accessgetFocusedVirtualViewIdp accessgetfocusedvirtualviewidp) {
        if (accessgetfocusedvirtualviewidp instanceof accessgetPendingHorizontalScrollEventsp) {
            return accessgetfocusedvirtualviewidp;
        }
        accessgetPendingHorizontalScrollEventsp accessgetpendinghorizontalscrolleventsp = new accessgetPendingHorizontalScrollEventsp();
        accessgetpendinghorizontalscrolleventsp.RemoteActionCompatParcelizer = serializer;
        accessgetpendinghorizontalscrolleventsp.write = accessgetfocusedvirtualviewidp;
        return accessgetpendinghorizontalscrolleventsp;
    }
}
