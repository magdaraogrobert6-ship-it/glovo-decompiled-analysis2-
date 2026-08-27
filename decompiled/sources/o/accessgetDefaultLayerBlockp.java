package o;

import android.view.View;
import androidx.core.view.WindowInsetsAnimationCompat$Callback;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetDefaultLayerBlockp extends WindowInsetsAnimationCompat$Callback {
    public final View IconCompatParcelizer;
    public int read;
    public int serializer;
    public final int[] write;

    public accessgetDefaultLayerBlockp(View view) {
        super(0);
        this.write = new int[2];
        this.IconCompatParcelizer = view;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public final void onPrepare(component14 component14Var) {
        View view = this.IconCompatParcelizer;
        int[] iArr = this.write;
        view.getLocationOnScreen(iArr);
        this.read = iArr[1];
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public final component15 onStart(component14 component14Var, component15 component15Var) {
        View view = this.IconCompatParcelizer;
        int[] iArr = this.write;
        view.getLocationOnScreen(iArr);
        int i = this.read - iArr[1];
        this.serializer = i;
        view.setTranslationY(i);
        return component15Var;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public final void onEnd(component14 component14Var) {
        this.IconCompatParcelizer.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public final FocusRequesterModifierKt onProgress(FocusRequesterModifierKt focusRequesterModifierKt, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            component14 component14Var = (component14) it.next();
            if ((component14Var.IconCompatParcelizer.write() & 8) != 0) {
                this.IconCompatParcelizer.setTranslationY(handleMotionFrameOfReferencePlacement.write(this.serializer, 0, component14Var.IconCompatParcelizer.RemoteActionCompatParcelizer()));
                break;
            }
        }
        return focusRequesterModifierKt;
    }
}
