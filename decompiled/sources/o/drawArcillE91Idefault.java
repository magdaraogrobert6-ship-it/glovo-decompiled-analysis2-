package o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class drawArcillE91Idefault implements getInverseTransform {
    public final /* synthetic */ int read;

    public /* synthetic */ drawArcillE91Idefault(int i) {
        this.read = i;
    }

    @Override // o.getInverseTransform
    public final /* bridge */ /* synthetic */ boolean RemoteActionCompatParcelizer(Object obj, getEotfFuncui_graphics geteotffuncui_graphics) {
        int i = this.read;
        if (i == 0) {
        } else if (i != 1) {
        }
        return true;
    }

    @Override // o.getInverseTransform
    public final generateOetf IconCompatParcelizer(Object obj, int i, int i2, getEotfFuncui_graphics geteotffuncui_graphics) {
        int i3 = this.read;
        if (i3 == 0) {
            return new drawArcyD3GUKodefault((File) obj);
        }
        if (i3 == 1) {
            return new drawArcyD3GUKodefault(1, (Bitmap) obj);
        }
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            return new drawImagegbVJVH8default(drawable, 1);
        }
        return null;
    }
}
