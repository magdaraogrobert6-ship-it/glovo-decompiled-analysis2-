package o;

/* JADX INFO: loaded from: classes4.dex */
public class r8lambdaMuUi1RM08ko_9tUvxYcERI7MB2c<T> extends java.lang.ref.WeakReference<T> {
    public r8lambdaMuUi1RM08ko_9tUvxYcERI7MB2c(T t) {
        super(t);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r8lambdaMuUi1RM08ko_9tUvxYcERI7MB2c)) {
            return false;
        }
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) obj;
        if (get() == null || weakReference.get() == null) {
            return false;
        }
        return get().equals(weakReference.get());
    }

    public final int hashCode() {
        return get() == null ? super.hashCode() : get().hashCode();
    }
}
