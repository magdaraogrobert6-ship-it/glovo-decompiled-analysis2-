package com.roadrunner.delivery.pickupdropoff.blockingui.presentation.dialog;

import androidx.compose.ui.graphics.Fields;
import o.TextIndentCompanion;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class TimeChangedBlockingDialogFragment$$ExternalSyntheticLambda1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ TimeChangedBlockingDialogFragment IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ TimeChangedBlockingDialogFragment$$ExternalSyntheticLambda1(TimeChangedBlockingDialogFragment timeChangedBlockingDialogFragment, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = timeChangedBlockingDialogFragment;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = read + 113;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        TimeChangedBlockingDialogFragment timeChangedBlockingDialogFragment = this.IconCompatParcelizer;
        if (i4 != 0) {
            if (i4 != 1) {
                timeChangedBlockingDialogFragment.serializer().IconCompatParcelizer();
                return createfromparcel;
            }
            timeChangedBlockingDialogFragment.serializer().RemoteActionCompatParcelizer.serializer(TextIndentCompanion.read);
            return createfromparcel;
        }
        r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = timeChangedBlockingDialogFragment.getOnBackPressedDispatcher;
        if (r8lambdaudhhxliolpu0hpccqh6voskpny == null) {
            removeNodeAtDepth.serializer("viewModelFactory");
            throw null;
        }
        int i5 = write + 91;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambdaudhhxliolpu0hpccqh6voskpny;
        }
        throw null;
    }
}
