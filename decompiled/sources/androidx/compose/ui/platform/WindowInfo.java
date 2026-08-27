package androidx.compose.ui.platform;

import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;

/* JADX INFO: loaded from: classes.dex */
public interface WindowInfo {
    boolean isWindowFocused();

    /* JADX INFO: renamed from: getContainerDpSize-MYxV2XQ */
    default long mo2752getContainerDpSizeMYxV2XQ() {
        return DpSize.Companion.m3780getUnspecifiedMYxV2XQ();
    }

    /* JADX INFO: renamed from: getKeyboardModifiers-k7X9c1A */
    default int mo2754getKeyboardModifiersk7X9c1A() {
        return ((PointerKeyboardModifiers) WindowInfoImpl.Companion.getGlobalKeyboardModifiers$ui().getValue()).m2142unboximpl();
    }

    /* JADX INFO: renamed from: getContainerSize-YbymL2g */
    default long mo2753getContainerSizeYbymL2g() {
        return IntSize.m3839constructorimpl(-9223372034707292160L);
    }
}
