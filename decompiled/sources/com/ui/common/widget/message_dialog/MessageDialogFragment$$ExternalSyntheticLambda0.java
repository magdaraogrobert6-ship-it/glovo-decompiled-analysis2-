package com.ui.common.widget.message_dialog;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class MessageDialogFragment$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ MessageDialogFragment read;

    public /* synthetic */ MessageDialogFragment$$ExternalSyntheticLambda0(MessageDialogFragment messageDialogFragment, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.read = messageDialogFragment;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.RemoteActionCompatParcelizer;
        MessageDialogFragment messageDialogFragment = this.read;
        if (i != 0) {
            r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = messageDialogFragment.onCreatePanelMenu;
            if (r8lambdaudhhxliolpu0hpccqh6voskpny != null) {
                return r8lambdaudhhxliolpu0hpccqh6voskpny;
            }
            removeNodeAtDepth.serializer("viewModelFactory");
            throw null;
        }
        Fragment parentFragment = messageDialogFragment.getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        FragmentActivity activity = messageDialogFragment.getActivity();
        activity.getClass();
        return activity;
    }
}
