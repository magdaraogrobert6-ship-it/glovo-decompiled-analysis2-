package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class screenToLocalMKHz9U {
    public static final Object serializer(int i, List list) {
        return list.get(((int) Math.ceil((((double) i) / 100.0d) * ((double) list.size()))) - 1);
    }
}
