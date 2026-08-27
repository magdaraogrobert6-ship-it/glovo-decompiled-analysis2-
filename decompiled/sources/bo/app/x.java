package bo.app;

import java.util.Comparator;
import o.setNativeShader;

/* JADX INFO: loaded from: classes.dex */
public final class x implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        l9 l9Var = ((rd) obj2).a;
        l9Var.getClass();
        int size = ((k0) l9Var).m().size();
        l9 l9Var2 = ((rd) obj).a;
        l9Var2.getClass();
        return setNativeShader.RemoteActionCompatParcelizer(Integer.valueOf(size), Integer.valueOf(((k0) l9Var2).m().size()));
    }
}
