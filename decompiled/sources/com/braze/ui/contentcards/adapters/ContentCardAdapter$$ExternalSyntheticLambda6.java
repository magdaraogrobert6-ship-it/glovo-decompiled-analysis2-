package com.braze.ui.contentcards.adapters;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ContentCardAdapter$$ExternalSyntheticLambda6 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;
    public final /* synthetic */ ContentCardAdapter f$1;

    public /* synthetic */ ContentCardAdapter$$ExternalSyntheticLambda6(int i, int i2, ContentCardAdapter contentCardAdapter) {
        this.$r8$classId = i2;
        this.f$0 = i;
        this.f$1 = contentCardAdapter;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        ContentCardAdapter contentCardAdapter = this.f$1;
        int i2 = this.f$0;
        return i != 0 ? ContentCardAdapter.getCardAtIndex$lambda$0(i2, contentCardAdapter) : ContentCardAdapter.onItemDismiss$lambda$0(i2, contentCardAdapter);
    }
}
