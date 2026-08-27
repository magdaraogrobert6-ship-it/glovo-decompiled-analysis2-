package o;

/* JADX INFO: loaded from: classes2.dex */
public final class setAccessibilityEventBatchIntervalMillis implements onUncaughtException {
    public static final Object IconCompatParcelizer = new Object();
    public volatile Object read;
    public volatile onUncaughtException serializer;

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        Object objWrite;
        Object obj = this.read;
        Object obj2 = IconCompatParcelizer;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            objWrite = this.read;
            if (objWrite == obj2) {
                objWrite = this.serializer.write();
                Object obj3 = this.read;
                if (obj3 != obj2 && obj3 != objWrite) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objWrite + ". This is likely due to a circular dependency.");
                }
                this.read = objWrite;
                this.serializer = null;
            }
        }
        return objWrite;
    }

    public static onUncaughtException IconCompatParcelizer(onUncaughtException onuncaughtexception) {
        if (onuncaughtexception instanceof setAccessibilityEventBatchIntervalMillis) {
            return onuncaughtexception;
        }
        setAccessibilityEventBatchIntervalMillis setaccessibilityeventbatchintervalmillis = new setAccessibilityEventBatchIntervalMillis();
        setaccessibilityeventbatchintervalmillis.read = IconCompatParcelizer;
        setaccessibilityeventbatchintervalmillis.serializer = onuncaughtexception;
        return setaccessibilityeventbatchintervalmillis;
    }
}
