package o;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.widget.PopupWindow;
import androidx.camera.core.ImageCapture$1;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class getSupportBackgroundTintList extends setExpandedActionViewsExclusive implements onLayout {
    public static final Method IconCompatParcelizer;
    public ImageCapture$1 write;

    @Override // o.setExpandedActionViewsExclusive
    public final setHasNonEmbeddedTabs write(Context context, boolean z) {
        getCustomSelectionActionModeCallback getcustomselectionactionmodecallback = new getCustomSelectionActionModeCallback(context, z);
        getcustomselectionactionmodecallback.setHoverListener(this);
        return getcustomselectionactionmodecallback;
    }

    @Override // o.onLayout
    public final void IconCompatParcelizer(AlertControllerButtonHandler alertControllerButtonHandler, MenuItem menuItem) {
        ImageCapture$1 imageCapture$1 = this.write;
        if (imageCapture$1 != null) {
            imageCapture$1.IconCompatParcelizer(alertControllerButtonHandler, menuItem);
        }
    }

    @Override // o.onLayout
    public final void RemoteActionCompatParcelizer(AlertControllerButtonHandler alertControllerButtonHandler, Keep keep) {
        ImageCapture$1 imageCapture$1 = this.write;
        if (imageCapture$1 != null) {
            imageCapture$1.RemoteActionCompatParcelizer(alertControllerButtonHandler, keep);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                IconCompatParcelizer = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public getSupportBackgroundTintList(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
