package o;

/* JADX INFO: loaded from: classes2.dex */
public final class provideRulerValue implements AbstractComposeViewExternalSyntheticLambda0 {
    public static final Object serializer = new Object();
    public volatile Object read = serializer;
    public volatile AbstractComposeViewExternalSyntheticLambda0 write;

    @Override // o.AbstractComposeViewExternalSyntheticLambda0
    public final Object write() {
        Object objWrite;
        Object obj = this.read;
        Object obj2 = serializer;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            objWrite = this.read;
            if (objWrite == obj2) {
                objWrite = this.write.write();
                this.read = objWrite;
                this.write = null;
            }
        }
        return objWrite;
    }

    public provideRulerValue(AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0) {
        this.write = abstractComposeViewExternalSyntheticLambda0;
    }
}
