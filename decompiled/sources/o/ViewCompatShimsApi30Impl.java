package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewCompatShimsApi30Impl {
    public static volatile ViewCompatShimsApi30Impl read;
    public static final byte[] serializer = new byte[0];
    public ArrayList RemoteActionCompatParcelizer;

    public final void IconCompatParcelizer(com.huawei.location.callback.d2 d2Var) {
        synchronized (serializer) {
            if (this.RemoteActionCompatParcelizer == null) {
                this.RemoteActionCompatParcelizer = new ArrayList();
            }
            if (!this.RemoteActionCompatParcelizer.contains(d2Var)) {
                this.RemoteActionCompatParcelizer.add(d2Var);
            }
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("LocationProxyListenerManager", "add LocationProxyListenerManager to locationProxyListenerList, size is : " + this.RemoteActionCompatParcelizer.size());
        }
    }

    public final void read(com.huawei.location.callback.d2 d2Var) {
        synchronized (serializer) {
            if (d2Var != null) {
                ArrayList arrayList = this.RemoteActionCompatParcelizer;
                if (arrayList != null && !arrayList.isEmpty()) {
                    for (com.huawei.location.callback.d2 d2Var2 : this.RemoteActionCompatParcelizer) {
                        if (d2Var2.equals(d2Var)) {
                            this.RemoteActionCompatParcelizer.remove(d2Var2);
                            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("LocationProxyListenerManager", "remove LocationProxyListenerManager from locationProxyListenerList, size is : " + this.RemoteActionCompatParcelizer.size());
                            break;
                        }
                    }
                }
            }
        }
    }

    public static ViewCompatShimsApi30Impl read() {
        if (read == null) {
            synchronized (serializer) {
                if (read == null) {
                    ViewCompatShimsApi30Impl viewCompatShimsApi30Impl = new ViewCompatShimsApi30Impl();
                    viewCompatShimsApi30Impl.RemoteActionCompatParcelizer = new ArrayList(10);
                    read = viewCompatShimsApi30Impl;
                }
            }
        }
        return read;
    }
}
