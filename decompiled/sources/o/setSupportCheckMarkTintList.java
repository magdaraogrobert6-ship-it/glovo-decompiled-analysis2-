package o;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class setSupportCheckMarkTintList extends getSuperCaller {
    public final HashMap RemoteActionCompatParcelizer = new HashMap();

    @Override // o.getSuperCaller
    public final getSupportImageTintMode RemoteActionCompatParcelizer(Object obj) {
        return (getSupportImageTintMode) this.RemoteActionCompatParcelizer.get(obj);
    }

    @Override // o.getSuperCaller
    public final Object read(Object obj) {
        Object obj2 = super.read(obj);
        this.RemoteActionCompatParcelizer.remove(obj);
        return obj2;
    }
}
