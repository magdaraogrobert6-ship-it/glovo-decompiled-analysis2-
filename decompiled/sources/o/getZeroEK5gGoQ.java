package o;

import android.net.Uri;
import com.sentiance.core.model.events.E$b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getZeroEK5gGoQ {
    public static final E$b write;

    static {
        E$b e$b;
        Uri uri = accessgetKeyDowncp.write;
        synchronized (getMenu.class) {
            if (getMenu.IconCompatParcelizer == null) {
                E$b e$b2 = new E$b();
                synchronized (getMenu.class) {
                    if (getMenu.IconCompatParcelizer != null) {
                        throw new IllegalStateException("init() already called");
                    }
                    getMenu.IconCompatParcelizer = e$b2;
                }
            }
            e$b = getMenu.IconCompatParcelizer;
        }
        write = e$b;
    }
}
