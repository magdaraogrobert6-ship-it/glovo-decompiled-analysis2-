package bo.app;

import java.util.Comparator;
import o.setNativeShader;

/* JADX INFO: loaded from: classes.dex */
public final class y implements Comparator {
    public final /* synthetic */ x a;

    public y(x xVar) {
        this.a = xVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iCompare = this.a.compare(obj, obj2);
        if (iCompare != 0) {
            return iCompare;
        }
        return setNativeShader.RemoteActionCompatParcelizer(Long.valueOf(((rd) obj).b), Long.valueOf(((rd) obj2).b));
    }
}
