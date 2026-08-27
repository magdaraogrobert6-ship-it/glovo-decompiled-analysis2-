package o;

import com.sentiance.okhttp3.internal.http2.e$h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RecomposerrunRecomposeAndApplyChanges2 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.foundation.pager.PagerState serializer;

    public /* synthetic */ RecomposerrunRecomposeAndApplyChanges2(androidx.compose.foundation.pager.PagerState pagerState, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = pagerState;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int iSerializer;
        int iRemoteActionCompatParcelizer;
        int i = this.RemoteActionCompatParcelizer;
        androidx.compose.foundation.pager.PagerState pagerState = this.serializer;
        if (i == 0) {
            return Integer.valueOf(pagerState._init_lambda2.IconCompatParcelizer() ? ((onHideTranslationui) pagerState._init_lambda3).serializer() : pagerState.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.RemoteActionCompatParcelizer());
        }
        if (i == 1 || i == 2 || i != 3) {
            iSerializer = pagerState.read();
        } else {
            getPlatformAndroidManager getplatformandroidmanager = pagerState.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
            boolean zIconCompatParcelizer = pagerState._init_lambda2.IconCompatParcelizer();
            e$h e_h = pagerState.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
            if (zIconCompatParcelizer) {
                onHideTranslationui onhidetranslationui = (onHideTranslationui) getplatformandroidmanager;
                if (onhidetranslationui.serializer() != -1) {
                    iRemoteActionCompatParcelizer = onhidetranslationui.serializer();
                } else if (Math.abs(e_h.IconCompatParcelizer()) >= Math.abs(Math.min(pagerState.MediaMetadataCompat.mo48toPx0680j_4(androidx.compose.foundation.pager.PagerStateKt.serializer), pagerState.MediaMetadataCompat() / 2.0f) / pagerState.MediaMetadataCompat())) {
                    boolean zSerializer = pagerState.serializer();
                    int i2 = pagerState.PlaybackStateCompatCustomAction;
                    iRemoteActionCompatParcelizer = zSerializer ? i2 + 1 : i2;
                } else {
                    iRemoteActionCompatParcelizer = e_h.RemoteActionCompatParcelizer();
                }
            } else {
                iRemoteActionCompatParcelizer = e_h.RemoteActionCompatParcelizer();
            }
            iSerializer = pagerState.serializer(iRemoteActionCompatParcelizer);
        }
        return Integer.valueOf(iSerializer);
    }
}
