package o;

/* JADX INFO: loaded from: classes4.dex */
public final class finalizeViewBeforeDisplay {
    public final createClickListener IconCompatParcelizer;
    public final Throwable RemoteActionCompatParcelizer;
    public final Object read;
    public final r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY serializer;
    public final Object write;

    public final int hashCode() {
        Object obj = this.write;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        createClickListener createclicklistener = this.IconCompatParcelizer;
        int iHashCode2 = createclicklistener == null ? 0 : createclicklistener.hashCode();
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = this.serializer;
        int iHashCode3 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry == null ? 0 : r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.hashCode();
        Object obj2 = this.read;
        int iHashCode4 = obj2 == null ? 0 : obj2.hashCode();
        Throwable th = this.RemoteActionCompatParcelizer;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (th != null ? th.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof finalizeViewBeforeDisplay)) {
            return false;
        }
        finalizeViewBeforeDisplay finalizeviewbeforedisplay = (finalizeViewBeforeDisplay) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, finalizeviewbeforedisplay.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, finalizeviewbeforedisplay.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, finalizeviewbeforedisplay.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, finalizeviewbeforedisplay.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, finalizeviewbeforedisplay.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.write + ", cancelHandler=" + this.IconCompatParcelizer + ", onCancellation=" + this.serializer + ", idempotentResume=" + this.read + ", cancelCause=" + this.RemoteActionCompatParcelizer + ')';
    }

    public static finalizeViewBeforeDisplay RemoteActionCompatParcelizer(finalizeViewBeforeDisplay finalizeviewbeforedisplay, createClickListener createclicklistener, Throwable th, int i) {
        Object obj = finalizeviewbeforedisplay.write;
        if ((i & 2) != 0) {
            createclicklistener = finalizeviewbeforedisplay.IconCompatParcelizer;
        }
        createClickListener createclicklistener2 = createclicklistener;
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = finalizeviewbeforedisplay.serializer;
        Object obj2 = finalizeviewbeforedisplay.read;
        if ((i & 16) != 0) {
            th = finalizeviewbeforedisplay.RemoteActionCompatParcelizer;
        }
        return new finalizeViewBeforeDisplay(obj, createclicklistener2, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, obj2, th);
    }

    public /* synthetic */ finalizeViewBeforeDisplay(Object obj, createClickListener createclicklistener, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : createclicklistener, (i & 4) != 0 ? null : r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, (Object) null, (i & 16) != 0 ? null : th);
    }

    public finalizeViewBeforeDisplay(Object obj, createClickListener createclicklistener, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, Object obj2, Throwable th) {
        this.write = obj;
        this.IconCompatParcelizer = createclicklistener;
        this.serializer = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
        this.read = obj2;
        this.RemoteActionCompatParcelizer = th;
    }
}
