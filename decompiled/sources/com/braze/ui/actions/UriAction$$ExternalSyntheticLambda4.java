package com.braze.ui.actions;

import android.net.Uri;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.support.BrazeImageUtils;
import com.braze.ui.BrazeWebViewClient;
import com.braze.ui.actions.brazeactions.BrazeActionParser;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class UriAction$$ExternalSyntheticLambda4 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Uri f$0;

    public /* synthetic */ UriAction$$ExternalSyntheticLambda4(int i, Uri uri) {
        this.$r8$classId = i;
        this.f$0 = uri;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        Uri uri = this.f$0;
        switch (i) {
            case 0:
                return UriAction.openUriWithActionViewFromPush$lambda$0(uri);
            case 1:
                return DefaultBrazeImageLoader.shouldSkipCaching$lambda$0(uri);
            case 2:
                return BrazeImageUtils.getLocalBitmap$lambda$1(uri);
            case 3:
                return BrazeImageUtils.getBitmap$lambda$0(uri);
            case 4:
                return BrazeImageUtils.getLocalBitmap$lambda$0(uri);
            case 5:
                return BrazeWebViewClient.handleQueryAction$lambda$0(uri);
            case 6:
                return BrazeWebViewClient.handleUrlOverride$lambda$1(uri);
            case 7:
                return BrazeActionParser.getBrazeActionVersionAndJson$lambda$0(uri);
            case 8:
                return BrazeActionParser.execute$lambda$3(uri);
            default:
                return BrazeActionParser.execute$lambda$4(uri);
        }
    }
}
