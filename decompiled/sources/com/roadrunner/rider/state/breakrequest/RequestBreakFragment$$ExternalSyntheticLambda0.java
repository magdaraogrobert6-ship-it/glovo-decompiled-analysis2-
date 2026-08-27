package com.roadrunner.rider.state.breakrequest;

import androidx.compose.ui.graphics.Fields;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RequestBreakFragment$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ RequestBreakFragment read;
    public final /* synthetic */ int write;

    public /* synthetic */ RequestBreakFragment$$ExternalSyntheticLambda0(RequestBreakFragment requestBreakFragment, int i) {
        this.write = i;
        this.read = requestBreakFragment;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = serializer + 91;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        RequestBreakFragment requestBreakFragment = this.read;
        if (i4 != 0) {
            requestBreakFragment.read(false, false);
            return createFromParcel.INSTANCE;
        }
        r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = requestBreakFragment.invalidateMenu;
        if (r8lambdaudhhxliolpu0hpccqh6voskpny == null) {
            removeNodeAtDepth.serializer("viewModelFactory");
            throw null;
        }
        int i5 = RemoteActionCompatParcelizer + 5;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambdaudhhxliolpu0hpccqh6voskpny;
        }
        throw null;
    }
}
