package com.roadrunner.settings;

import androidx.compose.ui.graphics.Fields;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class SettingsFragment$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ SettingsFragment RemoteActionCompatParcelizer;

    public /* synthetic */ SettingsFragment$$ExternalSyntheticLambda0(SettingsFragment settingsFragment, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = settingsFragment;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        SettingsFragment settingsFragment = this.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = settingsFragment.RemoteActionCompatParcelizer;
            if (r8lambdaudhhxliolpu0hpccqh6voskpny != null) {
                return r8lambdaudhhxliolpu0hpccqh6voskpny;
            }
            removeNodeAtDepth.serializer("messageViewModelFactory");
            throw null;
        }
        if (i2 != 1) {
            settingsFragment.requireActivity().finish();
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            int i3 = serializer + 11;
            read = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 1 / 0;
            }
            return createfromparcel;
        }
        r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny2 = settingsFragment.RatingCompat;
        if (r8lambdaudhhxliolpu0hpccqh6voskpny2 == null) {
            removeNodeAtDepth.serializer("viewModelFactory");
            throw null;
        }
        int i5 = read + 63;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambdaudhhxliolpu0hpccqh6voskpny2;
        }
        throw null;
    }
}
