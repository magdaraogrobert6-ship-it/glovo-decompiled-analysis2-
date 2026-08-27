package androidx.compose.ui.input.pointer;

import androidx.compose.ui.graphics.Fields;

/* JADX INFO: loaded from: classes.dex */
public final class PointerEvent_androidKt {
    public static final int EmptyPointerKeyboardModifiers() {
        return PointerKeyboardModifiers.m2137constructorimpl(0);
    }

    /* JADX INFO: renamed from: getAreAnyPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m2028getAreAnyPressedaHzCxE(int i) {
        return i != 0;
    }

    /* JADX INFO: renamed from: indexOfFirstPressed-aHzCx-E, reason: not valid java name */
    public static final int m2029indexOfFirstPressedaHzCxE(int i) {
        if (i == 0) {
            return -1;
        }
        int i2 = 0;
        for (int i3 = ((i & 96) >>> 5) | (i & (-97)); (i3 & 1) == 0; i3 >>>= 1) {
            i2++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: indexOfLastPressed-aHzCx-E, reason: not valid java name */
    public static final int m2030indexOfLastPressedaHzCxE(int i) {
        int i2 = -1;
        for (int i3 = ((i & 96) >>> 5) | (i & (-97)); i3 != 0; i3 >>>= 1) {
            i2++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: isAltGraphPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m2031isAltGraphPressed5xRPYO0(int i) {
        return false;
    }

    /* JADX INFO: renamed from: isAltPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m2032isAltPressed5xRPYO0(int i) {
        return (i & 2) != 0;
    }

    /* JADX INFO: renamed from: isBackPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m2033isBackPressedaHzCxE(int i) {
        return (i & 8) != 0;
    }

    /* JADX INFO: renamed from: isCapsLockOn-5xRPYO0, reason: not valid java name */
    public static final boolean m2034isCapsLockOn5xRPYO0(int i) {
        return (i & 1048576) != 0;
    }

    /* JADX INFO: renamed from: isCtrlPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m2035isCtrlPressed5xRPYO0(int i) {
        return (i & Fields.TransformOrigin) != 0;
    }

    /* JADX INFO: renamed from: isForwardPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m2036isForwardPressedaHzCxE(int i) {
        return (i & 16) != 0;
    }

    /* JADX INFO: renamed from: isFunctionPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m2037isFunctionPressed5xRPYO0(int i) {
        return (i & 8) != 0;
    }

    /* JADX INFO: renamed from: isMetaPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m2038isMetaPressed5xRPYO0(int i) {
        return (i & 65536) != 0;
    }

    /* JADX INFO: renamed from: isNumLockOn-5xRPYO0, reason: not valid java name */
    public static final boolean m2039isNumLockOn5xRPYO0(int i) {
        return (i & 2097152) != 0;
    }

    /* JADX INFO: renamed from: isPrimaryPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m2041isPrimaryPressedaHzCxE(int i) {
        return (i & 33) != 0;
    }

    /* JADX INFO: renamed from: isScrollLockOn-5xRPYO0, reason: not valid java name */
    public static final boolean m2042isScrollLockOn5xRPYO0(int i) {
        return (i & 4194304) != 0;
    }

    /* JADX INFO: renamed from: isSecondaryPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m2043isSecondaryPressedaHzCxE(int i) {
        return (i & 66) != 0;
    }

    /* JADX INFO: renamed from: isShiftPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m2044isShiftPressed5xRPYO0(int i) {
        return (i & 1) != 0;
    }

    /* JADX INFO: renamed from: isSymPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m2045isSymPressed5xRPYO0(int i) {
        return (i & 4) != 0;
    }

    /* JADX INFO: renamed from: isTertiaryPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m2046isTertiaryPressedaHzCxE(int i) {
        return (i & 4) != 0;
    }

    /* JADX INFO: renamed from: isPressed-bNIWhpI, reason: not valid java name */
    public static final boolean m2040isPressedbNIWhpI(int i, int i2) {
        if (i2 == 0) {
            return m2041isPrimaryPressedaHzCxE(i);
        }
        if (i2 == 1) {
            return m2043isSecondaryPressedaHzCxE(i);
        }
        if (i2 == 2 || i2 == 3 || i2 == 4) {
            return (i & (1 << i2)) != 0;
        }
        return (i & (1 << (i2 + 2))) != 0;
    }
}
