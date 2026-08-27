package o;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getLayoutNode {
    public static final java.util.logging.Logger IconCompatParcelizer = java.util.logging.Logger.getLogger(getLayoutNode.class.getName());
    public static final AtomicBoolean write = new AtomicBoolean(false);

    public static boolean IconCompatParcelizer() {
        return write.get();
    }
}
