package o;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class resetui implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.unit.Density serializer;

    public /* synthetic */ resetui(androidx.compose.ui.unit.Density density, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, int i) {
        this.IconCompatParcelizer = i;
        this.serializer = density;
        this.RemoteActionCompatParcelizer = populateViewStructure_androidKtpopulate7;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.IconCompatParcelizer;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = this.RemoteActionCompatParcelizer;
        androidx.compose.ui.unit.Density density = this.serializer;
        if (i != 0) {
            androidx.compose.ui.unit.DpSize dpSize = (androidx.compose.ui.unit.DpSize) obj;
            populateViewStructure_androidKtpopulate7.setValue(androidx.compose.ui.unit.IntSize.m3836boximpl(androidx.compose.ui.unit.IntSize.m3839constructorimpl((((long) density.mo42roundToPx0680j_4(androidx.compose.ui.unit.DpSize.m3771getWidthD9Ej5fM(dpSize.m3779unboximpl()))) << 32) | (((long) density.mo42roundToPx0680j_4(androidx.compose.ui.unit.DpSize.m3769getHeightD9Ej5fM(dpSize.m3779unboximpl()))) & 4294967295L))));
            return createFromParcel.INSTANCE;
        }
        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
        AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl androidTextContextMenuToolbarProviderTextActionModeCallbackImpl = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(1, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj);
        resetui resetuiVar = new resetui(density, populateViewStructure_androidKtpopulate7, 1);
        androidx.compose.ui.semantics.SemanticsPropertyKey semanticsPropertyKey = animateScrollToPage.read;
        PagerStateKt pagerStateKt = Build.VERSION.SDK_INT == 28 ? executeRequest.IconCompatParcelizer : androidx.compose.foundation.PlatformMagnifierFactoryApi29Impl.write;
        long jM3780getUnspecifiedMYxV2XQ = androidx.compose.ui.unit.DpSize.Companion.m3780getUnspecifiedMYxV2XQ();
        androidx.compose.ui.unit.Dp.Companion companion2 = androidx.compose.ui.unit.Dp.Companion;
        return companion.then(new PagerKt(androidTextContextMenuToolbarProviderTextActionModeCallbackImpl, resetuiVar, jM3780getUnspecifiedMYxV2XQ, companion2.m3693getUnspecifiedD9Ej5fM(), companion2.m3693getUnspecifiedD9Ej5fM(), pagerStateKt));
    }
}
