package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ApproachMeasureScope {
    public static int read(Object obj) {
        return (int) (((long) Integer.rotateLeft((int) (((long) (obj == null ? 0 : obj.hashCode())) * (-862048943)), 15)) * 461845907);
    }
}
