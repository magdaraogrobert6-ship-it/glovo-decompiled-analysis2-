package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getPausedComposition {
    public volatile java.util.logging.Logger serializer;
    public final precomposePaused read = new precomposePaused();
    public final String RemoteActionCompatParcelizer = forceRecomposeChildren.class.getName();

    public final java.util.logging.Logger serializer() {
        java.util.logging.Logger logger = this.serializer;
        if (logger != null) {
            return logger;
        }
        synchronized (this.read) {
            java.util.logging.Logger logger2 = this.serializer;
            if (logger2 != null) {
                return logger2;
            }
            java.util.logging.Logger logger3 = java.util.logging.Logger.getLogger(this.RemoteActionCompatParcelizer);
            this.serializer = logger3;
            return logger3;
        }
    }
}
