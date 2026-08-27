package androidx.compose.ui.scrollcapture;

import android.os.CancellationSignal;
import kotlinx.coroutines.BuildersKt;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.setShouldUpdateFrameRates;

/* JADX INFO: loaded from: classes4.dex */
public final class ComposeScrollCaptureCallback_androidKt {
    private static final boolean DEBUG = false;
    private static final String TAG = "ScrollCapture";

    /* JADX INFO: Access modifiers changed from: private */
    public static final setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 launchWithCancellationSignal(getContentViewGroupParentLayout getcontentviewgroupparentlayout, final CancellationSignal cancellationSignal, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 3);
        r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer.IconCompatParcelizer(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback_androidKt.launchWithCancellationSignal.1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return createFromParcel.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(Throwable th) {
                if (th != null) {
                    cancellationSignal.cancel();
                }
            }
        });
        cancellationSignal.setOnCancelListener(new setShouldUpdateFrameRates(1, r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer));
        return r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer;
    }
}
