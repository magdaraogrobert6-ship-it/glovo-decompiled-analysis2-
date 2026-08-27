package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.contentcapture.ContentCaptureSessionWrapper;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class AndroidComposeView$contentCaptureManager$1 extends FunctionReferenceImpl implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final ContentCaptureSessionWrapper invoke() {
        return AndroidComposeView_androidKt.getContentCaptureSessionCompat((View) this.MediaMetadataCompat);
    }

    public AndroidComposeView$contentCaptureManager$1(Object obj) {
        super(0, 1, AndroidComposeView_androidKt.class, obj, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;");
    }
}
