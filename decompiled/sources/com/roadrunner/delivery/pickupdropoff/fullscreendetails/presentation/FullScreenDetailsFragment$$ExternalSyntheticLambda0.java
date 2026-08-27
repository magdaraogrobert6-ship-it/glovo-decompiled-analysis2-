package com.roadrunner.delivery.pickupdropoff.fullscreendetails.presentation;

import androidx.compose.ui.graphics.Fields;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class FullScreenDetailsFragment$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ FullScreenDetailsFragment read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ FullScreenDetailsFragment$$ExternalSyntheticLambda0(FullScreenDetailsFragment fullScreenDetailsFragment, int i) {
        this.serializer = i;
        this.read = fullScreenDetailsFragment;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 43;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        FullScreenDetailsFragment fullScreenDetailsFragment = this.read;
        Object obj = null;
        if (i4 != 0) {
            fullScreenDetailsFragment.read(false, false);
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            int i5 = RemoteActionCompatParcelizer + 11;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return createfromparcel;
            }
            obj.hashCode();
            throw null;
        }
        r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = fullScreenDetailsFragment.getOnBackPressedDispatcher;
        if (r8lambdaudhhxliolpu0hpccqh6voskpny == null) {
            removeNodeAtDepth.serializer("viewModelFactory");
            throw null;
        }
        int i6 = write + 37;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return r8lambdaudhhxliolpu0hpccqh6voskpny;
    }
}
