package androidx.compose.ui.platform;

import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
import o.PopulateViewStructure_androidKtpopulate7;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class LazyWindowInfo implements WindowInfo {
    public static final int $stable = 0;
    private PopulateViewStructure_androidKtpopulate7 _containerSize;
    private final PopulateViewStructure_androidKtpopulate7 isWindowFocused$delegate = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
    private r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 onInitializeContainerSize;

    @Override // androidx.compose.ui.platform.WindowInfo
    /* JADX INFO: renamed from: getKeyboardModifiers-k7X9c1A, reason: not valid java name */
    public int mo2754getKeyboardModifiersk7X9c1A() {
        return ((PointerKeyboardModifiers) WindowInfoImpl.Companion.getGlobalKeyboardModifiers$ui().getValue()).m2142unboximpl();
    }

    @Override // androidx.compose.ui.platform.WindowInfo
    public boolean isWindowFocused() {
        return ((Boolean) this.isWindowFocused$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: setKeyboardModifiers-5xRPYO0, reason: not valid java name */
    public void m2755setKeyboardModifiers5xRPYO0(int i) {
        WindowInfoImpl.Companion.getGlobalKeyboardModifiers$ui().setValue(PointerKeyboardModifiers.m2136boximpl(i));
    }

    @Override // androidx.compose.ui.platform.WindowInfo
    /* JADX INFO: renamed from: getContainerDpSize-MYxV2XQ, reason: not valid java name */
    public long mo2752getContainerDpSizeMYxV2XQ() {
        DerivedSize zero;
        if (this._containerSize == null) {
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.onInitializeContainerSize;
            if (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 == null || (zero = (DerivedSize) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke()) == null) {
                zero = DerivedSize.Companion.getZero();
            }
            this._containerSize = CompositionKt.RemoteActionCompatParcelizer(zero);
            this.onInitializeContainerSize = null;
        }
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = this._containerSize;
        populateViewStructure_androidKtpopulate7.getClass();
        return ((DerivedSize) populateViewStructure_androidKtpopulate7.getValue()).m2718getDpSizeMYxV2XQ();
    }

    @Override // androidx.compose.ui.platform.WindowInfo
    /* JADX INFO: renamed from: getContainerSize-YbymL2g, reason: not valid java name */
    public long mo2753getContainerSizeYbymL2g() {
        DerivedSize zero;
        if (this._containerSize == null) {
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.onInitializeContainerSize;
            if (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 == null || (zero = (DerivedSize) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke()) == null) {
                zero = DerivedSize.Companion.getZero();
            }
            this._containerSize = CompositionKt.RemoteActionCompatParcelizer(zero);
            this.onInitializeContainerSize = null;
        }
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = this._containerSize;
        populateViewStructure_androidKtpopulate7.getClass();
        return ((DerivedSize) populateViewStructure_androidKtpopulate7.getValue()).m2719getPxSizeYbymL2g();
    }

    public final void setOnInitializeContainerSize(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        if (this._containerSize == null) {
            this.onInitializeContainerSize = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        }
    }

    public void setWindowFocused(boolean z) {
        this.isWindowFocused$delegate.setValue(Boolean.valueOf(z));
    }

    public final void updateContainerSizeIfObserved(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = this._containerSize;
        if (populateViewStructure_androidKtpopulate7 != null) {
            populateViewStructure_androidKtpopulate7.setValue(r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke());
        }
    }
}
