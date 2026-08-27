package bo.app;

import java.util.Comparator;
import o.setNativeShader;

/* JADX INFO: loaded from: classes.dex */
public final class k4 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return setNativeShader.RemoteActionCompatParcelizer(Long.valueOf(((rd) obj).b), Long.valueOf(((rd) obj2).b));
    }
}
