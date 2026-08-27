package com.roadrunner.home.nest;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import o.createFromParcel;
import o.handleUrlOverridelambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class NestFragment$$ExternalSyntheticLambda2 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ NestFragment read;

    public /* synthetic */ NestFragment$$ExternalSyntheticLambda2(NestFragment nestFragment, int i) {
        this.IconCompatParcelizer = i;
        this.read = nestFragment;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        NestFragment nestFragment = this.read;
        if (i2 != 0) {
            ExtrasKt.write(nestFragment, (Boolean) null);
            int iRemoteActionCompatParcelizer = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer2 = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer3 = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
            ExtrasKt.read(662558831, iRemoteActionCompatParcelizer2, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -662558827, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer, new Object[]{nestFragment, null});
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            int i3 = RemoteActionCompatParcelizer + 95;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return createfromparcel;
        }
        r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = nestFragment.onBackPressed;
        if (r8lambdaudhhxliolpu0hpccqh6voskpny == null) {
            removeNodeAtDepth.serializer("viewModelFactory");
            throw null;
        }
        int i5 = write + 41;
        int i6 = i5 % Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 33;
        write = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return r8lambdaudhhxliolpu0hpccqh6voskpny;
    }
}
