package o;

import android.os.Handler;
import android.os.Looper;
import bo.app.hg$$ExternalSyntheticLambda5;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$6;
import java.util.Calendar;
import kotlinx.coroutines.DelayKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class setRectOutlinetz77jQwdefault implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ int serializer;

    public /* synthetic */ setRectOutlinetz77jQwdefault(int i) {
        this.serializer = i;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = read + 77;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        switch (i4) {
            case 0:
                r8lambdajLZjISTEcJDErHfjnoa2Tfm8wI r8lambdajlzjistecjderhfjnoa2tfm8wi = new r8lambdajLZjISTEcJDErHfjnoa2Tfm8wI(displayInAppMessagelambda1.serializer(Calendar.class), new setGraphicModalMaxWidthDp[0]);
                int i5 = IconCompatParcelizer + 65;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    int i6 = 22 / 0;
                }
                return r8lambdajlzjistecjderhfjnoa2tfm8wi;
            case 1:
                return com.braze.ui.inappmessage.views.InAppMessageFullView.applyDisplayCutoutMarginsToContentArea$lambda$0();
            case 2:
                return com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView._get_messageWebView_$lambda$0();
            case 3:
                return com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView._get_messageWebView_$lambda$1();
            case 4:
                return com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView._get_messageWebView_$lambda$3();
            case 5:
                return com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView._get_messageWebView_$lambda$4();
            case 6:
                return com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView.setWebViewContent$lambda$0();
            case 7:
                return com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView.finishWebViewDisplay$lambda$0();
            case 8:
                return InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$1();
            case 9:
                return InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$2();
            case 10:
                return com.braze.ui.inappmessage.views.InAppMessageImageView.clipCanvasToPath$lambda$0();
            case 11:
                return com.braze.ui.inappmessage.views.InAppMessageImageView.clipCanvasToPath$lambda$1();
            case 12:
                return com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView.setupDirectionalNavigation$lambda$0();
            case 13:
                return com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView.setLargerCloseButtonClickArea$lambda$0();
            case 14:
                return com.braze.ui.inappmessage.views.InAppMessageModalView.resetMessageMargins$lambda$0$0();
            case 15:
                return com.braze.ui.inappmessage.views.InAppMessageSlideupView.applyWindowInsets$lambda$0();
            case 16:
                return com.braze.ui.support.ViewUtils.setFocusableInTouchModeAndRequestFocus$lambda$0();
            case 17:
                return com.braze.ui.support.ViewUtils.isCurrentOrientationValid$lambda$0();
            case 18:
                return com.braze.ui.support.ViewUtils.isCurrentOrientationValid$lambda$1();
            case 19:
                return com.braze.ui.support.ViewUtils.removeViewFromParent$lambda$0();
            case 20:
                return com.braze.ui.support.ViewUtils.removeViewFromParent$lambda$2();
            case 21:
                return com.braze.ui.support.WebViewUtilsKt.setWebViewSettings$lambda$0();
            case 22:
                return new r8lambdajLZjISTEcJDErHfjnoa2Tfm8wI(displayInAppMessagelambda1.serializer(Calendar.class), new setGraphicModalMaxWidthDp[0]);
            case 23:
                break;
            case 24:
                Timber.RemoteActionCompatParcelizer.getClass();
                break;
            case 25:
                r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r8lambda3kmch7yklpui_5smgazrgczhglcSerializer = DelayKt.serializer(new hg$$ExternalSyntheticLambda5(8));
                int i7 = IconCompatParcelizer + 35;
                read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return r8lambda3kmch7yklpui_5smgazrgczhglcSerializer;
            case 26:
                return new Handler(Looper.getMainLooper());
            case 27:
                throw new IllegalStateException("AppPerformanceTrackingManager has not been provided");
            case 28:
                throw new IllegalStateException("AppStartToInteractiveCoordinator has not been provided");
            default:
                return DelayKt.serializer(new hg$$ExternalSyntheticLambda5(23));
        }
        int i9 = IconCompatParcelizer + 91;
        read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            return createfromparcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
