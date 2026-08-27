package o;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class InAppMessageActivityTransitionCoordinator {
    public static final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    private static volatile Choreographer choreographer;

    static {
        Object isitemdismissable;
        try {
            isitemdismissable = new IInAppMessageViewFactory(IconCompatParcelizer(Looper.getMainLooper()));
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        if (isitemdismissable instanceof isItemDismissable) {
            isitemdismissable = null;
        }
    }

    public static final Handler IconCompatParcelizer(Looper looper) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        objInvoke.getClass();
        return (Handler) objInvoke;
    }
}
