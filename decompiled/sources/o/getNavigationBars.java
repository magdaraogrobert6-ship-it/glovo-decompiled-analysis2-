package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getNavigationBars implements getSafeGestures {
    public static final Object IconCompatParcelizer = new Object();
    public volatile getSafeGestures RemoteActionCompatParcelizer;
    public volatile Object serializer;

    @Override // o.getSafeGestures
    public final Object m_() {
        Object objM_;
        Object obj = this.serializer;
        Object obj2 = IconCompatParcelizer;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            objM_ = this.serializer;
            if (objM_ == obj2) {
                objM_ = this.RemoteActionCompatParcelizer.m_();
                Object obj3 = this.serializer;
                if (obj3 != obj2 && obj3 != objM_) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objM_ + ". This is likely due to a circular dependency.");
                }
                this.serializer = objM_;
                this.RemoteActionCompatParcelizer = null;
            }
        }
        return objM_;
    }

    public static getSafeGestures read(getSafeGestures getsafegestures) {
        if (getsafegestures instanceof getNavigationBars) {
            return getsafegestures;
        }
        getNavigationBars getnavigationbars = new getNavigationBars();
        getnavigationbars.serializer = IconCompatParcelizer;
        getnavigationbars.RemoteActionCompatParcelizer = getsafegestures;
        return getnavigationbars;
    }
}
