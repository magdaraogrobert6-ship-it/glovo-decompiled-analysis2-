package o;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class setIconBackgroundColor<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return setNativeShader.RemoteActionCompatParcelizer(Long.valueOf(((setExtras) t).write()), Long.valueOf(((setExtras) t2).write()));
    }
}
