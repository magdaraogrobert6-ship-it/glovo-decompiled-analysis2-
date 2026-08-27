package o;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class getAsFeature extends getChangeVersionControl {
    @Override // o.getChangeVersionControl
    public final Object write(Method method, Class cls, Object obj, Object[] objArr) {
        return accessgetResourcep.RemoteActionCompatParcelizer(method, cls, obj, objArr);
    }

    @Override // o.getChangeVersionControl
    public final boolean write(Method method) {
        return method.isDefault();
    }

    public getAsFeature(int i) {
        super(i);
    }
}
