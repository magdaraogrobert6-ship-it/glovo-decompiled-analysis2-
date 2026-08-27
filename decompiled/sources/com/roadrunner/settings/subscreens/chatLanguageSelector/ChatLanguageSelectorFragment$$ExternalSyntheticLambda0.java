package com.roadrunner.settings.subscreens.chatLanguageSelector;

import androidx.compose.ui.graphics.Fields;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ChatLanguageSelectorFragment$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ ChatLanguageSelectorFragment read;

    public /* synthetic */ ChatLanguageSelectorFragment$$ExternalSyntheticLambda0(ChatLanguageSelectorFragment chatLanguageSelectorFragment, int i) {
        this.IconCompatParcelizer = i;
        this.read = chatLanguageSelectorFragment;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 95;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        ChatLanguageSelectorFragment chatLanguageSelectorFragment = this.read;
        if (i3 != 0) {
            chatLanguageSelectorFragment.read(false, false);
            return createFromParcel.INSTANCE;
        }
        r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = chatLanguageSelectorFragment.getSavedStateRegistry;
        if (r8lambdaudhhxliolpu0hpccqh6voskpny == null) {
            removeNodeAtDepth.serializer("viewModelFactory");
            throw null;
        }
        int i4 = write + 13;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambdaudhhxliolpu0hpccqh6voskpny;
    }
}
