package o;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class getMutablePendingIntentFlags implements View.OnClickListener {
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 read;

    public /* synthetic */ getMutablePendingIntentFlags(int i, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.IconCompatParcelizer = i;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.read;
        if (i2 == 0) {
            int i3 = getImmutablePendingIntentFlags.RemoteActionCompatParcelizer;
            if (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 != null) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                return;
            }
            return;
        }
        if (i2 == 1) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            return;
        }
        if (i2 == 2) {
            int i4 = invokeSuspendcomroadrunnermapcontainerenabledpresentationMapNavigationWrapperattachWithDeferredInit1.RemoteActionCompatParcelizer;
            if (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 != null) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                int i5 = write + 119;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return;
            }
            return;
        }
        if (i2 == 3) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            return;
        }
        if (i2 == 4) {
            int i7 = getImmutablePendingIntentFlags.RemoteActionCompatParcelizer;
            if (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 != null) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            }
            int i8 = serializer + 117;
            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return;
        }
        if (i2 == 5) {
            int i10 = getImmutablePendingIntentFlags.RemoteActionCompatParcelizer;
            if (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 != null) {
                int i11 = serializer + 77;
                write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i12 = i11 % 2;
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                return;
            }
            return;
        }
        int i13 = getImmutablePendingIntentFlags.RemoteActionCompatParcelizer;
        if (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 != null) {
            int i14 = write + 57;
            serializer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i14 % 2 != 0) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            } else {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                throw null;
            }
        }
    }
}
