package o;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* JADX INFO: loaded from: classes4.dex */
public final class getDefaultRule extends getChangeVersionControl {
    public getDefaultRule() {
        super(0);
    }

    @Override // o.getChangeVersionControl
    public final Object write(Method method, Class cls, Object obj, Object[] objArr) {
        return accessgetResourcep.RemoteActionCompatParcelizer(method, cls, obj, objArr);
    }

    @Override // o.getChangeVersionControl
    public final boolean write(Method method) {
        return method.isDefault();
    }

    @Override // o.getChangeVersionControl
    public final String IconCompatParcelizer(Method method, int i) {
        Parameter parameter = method.getParameters()[i];
        if (!parameter.isNamePresent()) {
            return super.IconCompatParcelizer(method, i);
        }
        return "parameter '" + parameter.getName() + '\'';
    }
}
