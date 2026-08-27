package androidx.compose.ui.input.pointer;

import com.adjust.sdk.network.ErrorCodes;

/* JADX INFO: loaded from: classes.dex */
public final class PointerIcon_androidKt {
    private static final PointerIcon pointerIconDefault = new AndroidPointerIconType(1000);
    private static final PointerIcon pointerIconCrosshair = new AndroidPointerIconType(ErrorCodes.IO_EXCEPTION);
    private static final PointerIcon pointerIconText = new AndroidPointerIconType(1008);
    private static final PointerIcon pointerIconHand = new AndroidPointerIconType(1002);

    public static final PointerIcon getPointerIconCrosshair() {
        return pointerIconCrosshair;
    }

    public static final PointerIcon getPointerIconDefault() {
        return pointerIconDefault;
    }

    public static final PointerIcon getPointerIconHand() {
        return pointerIconHand;
    }

    public static final PointerIcon getPointerIconText() {
        return pointerIconText;
    }

    public static final PointerIcon PointerIcon(android.view.PointerIcon pointerIcon) {
        return new AndroidPointerIcon(pointerIcon);
    }

    public static final PointerIcon PointerIcon(int i) {
        return new AndroidPointerIconType(i);
    }
}
