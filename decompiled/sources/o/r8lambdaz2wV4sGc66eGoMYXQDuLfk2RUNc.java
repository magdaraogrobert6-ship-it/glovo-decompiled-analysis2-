package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambdaz2wV4sGc66eGoMYXQDuLfk2RUNc {
    public static final int IconCompatParcelizer;

    static {
        Object isitemdismissable;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            isitemdismissable = property != null ? setCarryoverInAppMessage.MediaSessionCompatQueueItem(10, property) : null;
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        Integer num = (Integer) (isitemdismissable instanceof isItemDismissable ? null : isitemdismissable);
        IconCompatParcelizer = num != null ? num.intValue() : 2097152;
    }
}
