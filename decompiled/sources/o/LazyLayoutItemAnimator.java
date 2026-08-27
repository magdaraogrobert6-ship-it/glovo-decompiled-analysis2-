package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class LazyLayoutItemAnimator {
    public static final double RemoteActionCompatParcelizer;
    public static final double read;
    public static final float serializer = android.view.ViewConfiguration.getScrollFriction();

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        RemoteActionCompatParcelizer = dLog;
        read = dLog - 1.0d;
    }
}
