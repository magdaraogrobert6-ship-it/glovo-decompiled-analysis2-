package o;

import io.sentry.util.UrlUtils;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getImages implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ isOpenInternalroom_runtime RemoteActionCompatParcelizer;

    public /* synthetic */ getImages(isOpenInternalroom_runtime isopeninternalroom_runtime, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = isopeninternalroom_runtime;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = write + 11;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        isOpenInternalroom_runtime isopeninternalroom_runtime = this.RemoteActionCompatParcelizer;
        if (i3 != 0) {
            onBackInvokedlambda0 onbackinvokedlambda0Serializer = UrlUtils.serializer();
            ((inCompatibilityMode) isopeninternalroom_runtime).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            ContextScope contextScopeRemoteActionCompatParcelizer = YieldKt.RemoteActionCompatParcelizer(DefaultIoScheduler.RemoteActionCompatParcelizer.plus(onbackinvokedlambda0Serializer));
            int i4 = serializer + 119;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return contextScopeRemoteActionCompatParcelizer;
        }
        onBackInvokedlambda0 onbackinvokedlambda0Serializer2 = UrlUtils.serializer();
        ((inCompatibilityMode) isopeninternalroom_runtime).getClass();
        DefaultScheduler defaultScheduler2 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        ContextScope contextScopeRemoteActionCompatParcelizer2 = YieldKt.RemoteActionCompatParcelizer(DefaultIoScheduler.RemoteActionCompatParcelizer.plus(onbackinvokedlambda0Serializer2));
        int i6 = serializer + 21;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return contextScopeRemoteActionCompatParcelizer2;
    }
}
