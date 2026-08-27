package com.roadrunner.instant.shifts.presentation.confirmation;

import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.Fragment;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class BookShiftConfirmationDialogFragment$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ BookShiftConfirmationDialogFragment IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ BookShiftConfirmationDialogFragment$$ExternalSyntheticLambda0(BookShiftConfirmationDialogFragment bookShiftConfirmationDialogFragment, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = bookShiftConfirmationDialogFragment;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = read + 25;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        BookShiftConfirmationDialogFragment bookShiftConfirmationDialogFragment = this.IconCompatParcelizer;
        if (i4 == 0) {
            Fragment fragmentRequireParentFragment = bookShiftConfirmationDialogFragment.requireParentFragment();
            fragmentRequireParentFragment.getClass();
            return fragmentRequireParentFragment;
        }
        r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = bookShiftConfirmationDialogFragment.onConfigurationChanged;
        if (r8lambdaudhhxliolpu0hpccqh6voskpny == null) {
            removeNodeAtDepth.serializer("viewModelFactory");
            throw null;
        }
        int i5 = write + 87;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 89 / 0;
        }
        return r8lambdaudhhxliolpu0hpccqh6voskpny;
    }
}
