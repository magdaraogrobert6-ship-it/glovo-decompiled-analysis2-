package androidx.compose.ui.platform;

import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.PopulateViewStructure_androidKtpopulate7;

/* JADX INFO: loaded from: classes.dex */
public final class WindowInfoImpl implements WindowInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final PopulateViewStructure_androidKtpopulate7 GlobalKeyboardModifiers = CompositionKt.RemoteActionCompatParcelizer(PointerKeyboardModifiers.m2136boximpl(PointerEvent_androidKt.EmptyPointerKeyboardModifiers()));
    private final PopulateViewStructure_androidKtpopulate7 _containerSize = CompositionKt.RemoteActionCompatParcelizer(IntSize.m3836boximpl(IntSize.Companion.m3849getZeroYbymL2g()));
    private final PopulateViewStructure_androidKtpopulate7 _containerDpSize = CompositionKt.RemoteActionCompatParcelizer(DpSize.m3759boximpl(DpSize.Companion.m3781getZeroMYxV2XQ()));
    private final PopulateViewStructure_androidKtpopulate7 isWindowFocused$delegate = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);

    @Override // androidx.compose.ui.platform.WindowInfo
    /* JADX INFO: renamed from: getContainerDpSize-MYxV2XQ */
    public long mo2752getContainerDpSizeMYxV2XQ() {
        return ((DpSize) this._containerDpSize.getValue()).m3779unboximpl();
    }

    @Override // androidx.compose.ui.platform.WindowInfo
    /* JADX INFO: renamed from: getContainerSize-YbymL2g */
    public long mo2753getContainerSizeYbymL2g() {
        return ((IntSize) this._containerSize.getValue()).m3848unboximpl();
    }

    @Override // androidx.compose.ui.platform.WindowInfo
    /* JADX INFO: renamed from: getKeyboardModifiers-k7X9c1A */
    public int mo2754getKeyboardModifiersk7X9c1A() {
        return ((PointerKeyboardModifiers) GlobalKeyboardModifiers.getValue()).m2142unboximpl();
    }

    @Override // androidx.compose.ui.platform.WindowInfo
    public boolean isWindowFocused() {
        return ((Boolean) this.isWindowFocused$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: setContainerDpSize-EaSLcWc, reason: not valid java name */
    public void m2795setContainerDpSizeEaSLcWc(long j) {
        this._containerDpSize.setValue(DpSize.m3759boximpl(j));
    }

    /* JADX INFO: renamed from: setContainerSize-ozmzZPI, reason: not valid java name */
    public void m2796setContainerSizeozmzZPI(long j) {
        this._containerSize.setValue(IntSize.m3836boximpl(j));
    }

    /* JADX INFO: renamed from: setKeyboardModifiers-5xRPYO0, reason: not valid java name */
    public void m2797setKeyboardModifiers5xRPYO0(int i) {
        GlobalKeyboardModifiers.setValue(PointerKeyboardModifiers.m2136boximpl(i));
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PopulateViewStructure_androidKtpopulate7 getGlobalKeyboardModifiers$ui() {
            return WindowInfoImpl.GlobalKeyboardModifiers;
        }

        private Companion() {
        }
    }

    public void setWindowFocused(boolean z) {
        this.isWindowFocused$delegate.setValue(Boolean.valueOf(z));
    }
}
