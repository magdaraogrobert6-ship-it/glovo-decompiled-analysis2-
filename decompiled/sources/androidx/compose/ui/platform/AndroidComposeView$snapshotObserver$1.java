package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.node.RootForTest;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidComposeView$snapshotObserver$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    final /* synthetic */ AndroidComposeView this$0;

    public final void invoke(final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        final RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler$ui = this.this$0.getUncaughtExceptionHandler$ui();
        if (uncaughtExceptionHandler$ui != null) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.AndroidComposeView$snapshotObserver$1$command$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m2681invoke() {
                    try {
                        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                    } catch (Exception e) {
                        uncaughtExceptionHandler$ui.onUncaughtException(e);
                    }
                }

                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m2681invoke();
                    return createFromParcel.INSTANCE;
                }
            };
        }
        Handler handler = this.this$0.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            return;
        }
        Handler handler2 = this.this$0.getHandler();
        if (handler2 != null) {
            handler2.post(new AndroidComposeView$$ExternalSyntheticLambda3(1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$snapshotObserver$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj);
        return createFromParcel.INSTANCE;
    }
}
