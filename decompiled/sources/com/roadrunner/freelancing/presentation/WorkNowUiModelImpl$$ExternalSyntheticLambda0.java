package com.roadrunner.freelancing.presentation;

import androidx.compose.ui.graphics.Fields;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setDisplayShape;
import o.setRootViewData;
import o.setTransactionSuccessful;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class WorkNowUiModelImpl$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ setRootViewData RemoteActionCompatParcelizer;

    public /* synthetic */ WorkNowUiModelImpl$$ExternalSyntheticLambda0(setRootViewData setrootviewdata, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = setrootviewdata;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = read + 53;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        setRootViewData setrootviewdata = this.RemoteActionCompatParcelizer;
        if (i4 != 0) {
            Object objWrite = setrootviewdata.serializer.RemoteActionCompatParcelizer.write();
            objWrite.getClass();
            return new setDisplayShape((setTransactionSuccessful) objWrite);
        }
        Object objWrite2 = setrootviewdata.serializer.RemoteActionCompatParcelizer.write();
        objWrite2.getClass();
        setDisplayShape setdisplayshape = new setDisplayShape((setTransactionSuccessful) objWrite2);
        int i5 = read + 11;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return setdisplayshape;
    }
}
