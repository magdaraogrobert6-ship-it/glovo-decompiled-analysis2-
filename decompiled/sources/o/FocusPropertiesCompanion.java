package o;

import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class FocusPropertiesCompanion {
    public final Runnable serializer;
    public final CopyOnWriteArrayList write = new CopyOnWriteArrayList();
    public final HashMap read = new HashMap();

    public final void read(getUnsetFocusRect getunsetfocusrect) {
        this.write.remove(getunsetfocusrect);
        FocusPropertiesonEnter1 focusPropertiesonEnter1 = (FocusPropertiesonEnter1) this.read.remove(getunsetfocusrect);
        if (focusPropertiesonEnter1 != null) {
            focusPropertiesonEnter1.serializer();
        }
        this.serializer.run();
    }

    public final boolean write(MenuItem menuItem) {
        Iterator it = this.write.iterator();
        while (it.hasNext()) {
            if (((getMinDimensionannotations) ((getUnsetFocusRect) it.next())).write.read(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public FocusPropertiesCompanion(Runnable runnable) {
        this.serializer = runnable;
    }
}
