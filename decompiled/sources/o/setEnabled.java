package o;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class setEnabled implements MenuItem.OnMenuItemClickListener {
    public static final Class[] RemoteActionCompatParcelizer = {MenuItem.class};
    public Object read;
    public Method serializer;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.read;
        Method method = this.serializer;
        try {
            if (method.getReturnType() == Boolean.TYPE) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e) {
            DrawableTransformation.read((Throwable) e);
            return false;
        }
    }
}
