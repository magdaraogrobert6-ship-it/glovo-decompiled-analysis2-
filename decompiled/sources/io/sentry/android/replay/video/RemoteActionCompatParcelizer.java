package io.sentry.android.replay.video;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import kotlin.jvm.internal.Lambda;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes4.dex */
public final class RemoteActionCompatParcelizer extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public static final RemoteActionCompatParcelizer read = new RemoteActionCompatParcelizer(0);

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        boolean z = false;
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        codecInfos.getClass();
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            String name = mediaCodecInfo.getName();
            name.getClass();
            if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) name, (CharSequence) "c2.exynos", false)) {
                z = true;
                break;
            }
        }
        return Boolean.valueOf(z);
    }

    public RemoteActionCompatParcelizer(int i) {
        super(i);
    }
}
