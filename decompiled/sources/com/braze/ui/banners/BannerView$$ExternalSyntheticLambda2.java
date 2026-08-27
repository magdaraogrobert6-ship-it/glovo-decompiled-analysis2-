package com.braze.ui.banners;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BannerView$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BannerView f$0;

    public /* synthetic */ BannerView$$ExternalSyntheticLambda2(BannerView bannerView, int i) {
        this.$r8$classId = i;
        this.f$0 = bannerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        BannerView bannerView = this.f$0;
        if (i != 0) {
            BannerView.setWebviewToEmpty$lambda$0(bannerView);
        } else {
            BannerView.dismiss$lambda$0(bannerView);
        }
    }
}
