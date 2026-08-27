package com.roadrunner.sidemenu.photoId.preview;

import androidx.compose.ui.graphics.Fields;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class PhotoIdPreviewFragment$$ExternalSyntheticLambda1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ PhotoIdPreviewFragment read;

    public /* synthetic */ PhotoIdPreviewFragment$$ExternalSyntheticLambda1(PhotoIdPreviewFragment photoIdPreviewFragment, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.read = photoIdPreviewFragment;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = write + 69;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        PhotoIdPreviewFragment photoIdPreviewFragment = this.read;
        if (i3 != 0) {
            photoIdPreviewFragment.read(false, false);
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            int i4 = write + 57;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return createfromparcel;
            }
            obj.hashCode();
            throw null;
        }
        r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = photoIdPreviewFragment.getSavedStateRegistry;
        if (r8lambdaudhhxliolpu0hpccqh6voskpny == null) {
            removeNodeAtDepth.serializer("viewModelFactory");
            throw null;
        }
        int i5 = write + 15;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdaudhhxliolpu0hpccqh6voskpny;
    }
}
