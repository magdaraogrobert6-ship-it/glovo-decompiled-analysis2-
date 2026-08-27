package o;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class getAutoNrFUSI {
    public static final degrees IconCompatParcelizer;
    public static final Fields serializer;

    public static void write(int i, View view) {
        IconCompatParcelizer.read(i, view);
    }

    public static void RemoteActionCompatParcelizer(View view, int i, int i2, int i3, int i4) {
        IconCompatParcelizer.IconCompatParcelizer(view, i, i2, i3, i4);
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            IconCompatParcelizer = new FilterQuality();
        } else {
            IconCompatParcelizer = new degrees();
        }
        serializer = new Fields(Float.class, "translationAlpha", 0);
        new Fields(android.graphics.Rect.class, "clipBounds", 7);
    }
}
