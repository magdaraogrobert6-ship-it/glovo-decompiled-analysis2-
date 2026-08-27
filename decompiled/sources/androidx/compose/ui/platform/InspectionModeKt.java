package androidx.compose.ui.platform;

import androidx.compose.runtime.ProvidableCompositionLocal;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes.dex */
public final class InspectionModeKt {
    private static final ProvidableCompositionLocal LocalInspectionMode = new setCurrentSemanticsNodesui(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.InspectionModeKt$LocalInspectionMode$1
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    });

    public static final ProvidableCompositionLocal getLocalInspectionMode() {
        return LocalInspectionMode;
    }
}
