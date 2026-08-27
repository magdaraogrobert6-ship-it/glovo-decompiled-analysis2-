package com.deliveryhero.performance.core.aqs;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.DelayKt;
import o.ShadowRenderer;
import o.drawCachedImageFqjB98A;
import o.getSpreadD9Ej5fM;
import o.isInvalidIndex;
import o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class AppQualityScore$enableScreenMetrics$1$1 implements r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ {
    public final /* synthetic */ AppQualityScore read;

    public final void IconCompatParcelizer(DelayKt delayKt) {
        AppQualityScore appQualityScore = this.read;
        if (appQualityScore.write) {
            return;
        }
        appQualityScore.write = true;
        if (delayKt instanceof ShadowRenderer) {
            if (((ShadowRenderer) delayKt).RemoteActionCompatParcelizer) {
            }
            ((drawCachedImageFqjB98A) appQualityScore.MediaSessionCompatToken.MediaSessionCompatResultReceiverWrapper()).MediaMetadataCompat = null;
        } else if (!delayKt.equals(getSpreadD9Ej5fM.write)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return;
        }
        appQualityScore.ParcelableVolumeInfo.RemoteActionCompatParcelizer("app_start_to_interactive");
        ((drawCachedImageFqjB98A) appQualityScore.MediaSessionCompatToken.MediaSessionCompatResultReceiverWrapper()).MediaMetadataCompat = null;
    }

    public AppQualityScore$enableScreenMetrics$1$1(AppQualityScore appQualityScore) {
        this.read = appQualityScore;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AppQualityScore$enableScreenMetrics$1$1) {
            return getFunctionDelegate().equals(((r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ) obj).getFunctionDelegate());
        }
        return false;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ
    public final isInvalidIndex getFunctionDelegate() {
        return new FunctionReferenceImpl(1, 0, AppQualityScore.class, this.read, "onConfigurationStateChanged", "onConfigurationStateChanged(Lcom/deliveryhero/performance/core/screenmetric/ChangeType;)V");
    }
}
