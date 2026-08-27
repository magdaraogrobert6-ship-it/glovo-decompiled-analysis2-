package o;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setMenu {
    public static final Method IconCompatParcelizer;
    public static final Method RemoteActionCompatParcelizer;
    public static final Method read;
    public static final boolean serializer;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            IconCompatParcelizer = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            RemoteActionCompatParcelizer = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            read = declaredMethod3;
            declaredMethod3.setAccessible(true);
            serializer = true;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
