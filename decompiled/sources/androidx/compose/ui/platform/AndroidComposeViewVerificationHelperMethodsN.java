package androidx.compose.ui.platform;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.input.pointer.AndroidPointerIcon;
import androidx.compose.ui.input.pointer.AndroidPointerIconType;
import androidx.compose.ui.input.pointer.PointerIcon;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
final class AndroidComposeViewVerificationHelperMethodsN {
    public static final AndroidComposeViewVerificationHelperMethodsN INSTANCE = new AndroidComposeViewVerificationHelperMethodsN();

    private AndroidComposeViewVerificationHelperMethodsN() {
    }

    public final void setPointerIcon(View view, PointerIcon pointerIcon) {
        android.view.PointerIcon androidPointerIcon = toAndroidPointerIcon(view.getContext(), pointerIcon);
        Object[] objArr = {view.getPointerIcon(), androidPointerIcon};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return;
        }
        view.setPointerIcon(androidPointerIcon);
    }

    public final android.view.PointerIcon toAndroidPointerIcon(Context context, PointerIcon pointerIcon) {
        if (pointerIcon instanceof AndroidPointerIcon) {
            return ((AndroidPointerIcon) pointerIcon).getPointerIcon();
        }
        return pointerIcon instanceof AndroidPointerIconType ? android.view.PointerIcon.getSystemIcon(context, ((AndroidPointerIconType) pointerIcon).getType()) : android.view.PointerIcon.getSystemIcon(context, 1000);
    }
}
