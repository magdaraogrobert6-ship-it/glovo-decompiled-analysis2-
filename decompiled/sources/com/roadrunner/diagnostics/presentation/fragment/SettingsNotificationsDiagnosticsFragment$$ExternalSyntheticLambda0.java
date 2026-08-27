package com.roadrunner.diagnostics.presentation.fragment;

import androidx.compose.ui.graphics.Fields;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class SettingsNotificationsDiagnosticsFragment$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ SettingsNotificationsDiagnosticsFragment IconCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ SettingsNotificationsDiagnosticsFragment$$ExternalSyntheticLambda0(SettingsNotificationsDiagnosticsFragment settingsNotificationsDiagnosticsFragment, int i) {
        this.write = i;
        this.IconCompatParcelizer = settingsNotificationsDiagnosticsFragment;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = this.write;
        SettingsNotificationsDiagnosticsFragment settingsNotificationsDiagnosticsFragment = this.IconCompatParcelizer;
        if (i2 != 0) {
            settingsNotificationsDiagnosticsFragment.requireActivity().finish();
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            int i3 = read + 25;
            serializer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 84 / 0;
            }
            return createfromparcel;
        }
        r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = settingsNotificationsDiagnosticsFragment.RemoteActionCompatParcelizer;
        Object obj = null;
        if (r8lambdaudhhxliolpu0hpccqh6voskpny == null) {
            removeNodeAtDepth.serializer("viewModelFactory");
            throw null;
        }
        int i5 = read + 19;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambdaudhhxliolpu0hpccqh6voskpny;
        }
        obj.hashCode();
        throw null;
    }
}
