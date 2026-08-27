package o;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getNestedCoroutineScopeannotations {
    public final Unsafe RemoteActionCompatParcelizer;

    public abstract void IconCompatParcelizer(Object obj, long j, byte b);

    public abstract void RemoteActionCompatParcelizer(Object obj, long j, float f);

    public abstract void read(Object obj, long j, double d);

    public abstract void read(Object obj, long j, boolean z);

    public abstract boolean read(long j, Object obj);

    public abstract double serializer(long j, Object obj);

    public abstract float write(long j, Object obj);

    public getNestedCoroutineScopeannotations(Unsafe unsafe) {
        this.RemoteActionCompatParcelizer = unsafe;
    }
}
