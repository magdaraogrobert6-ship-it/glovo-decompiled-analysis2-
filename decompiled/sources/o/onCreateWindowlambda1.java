package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract class onCreateWindowlambda1 {
    public final boolean cancelable;
    public final String name;
    public long nextExecuteNanoTime;
    public onCreateWindowlambda3 queue;

    public abstract long read();

    public final String toString() {
        return this.name;
    }

    public onCreateWindowlambda1(String str, boolean z) {
        str.getClass();
        this.name = str;
        this.cancelable = z;
        this.nextExecuteNanoTime = -1L;
    }
}
