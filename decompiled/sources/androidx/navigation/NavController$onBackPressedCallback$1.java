package androidx.navigation;

import android.webkit.WebView;
import androidx.activity.OnBackPressedCallback;
import androidx.compose.ui.graphics.Fields;
import com.common_ui.databinding.LayoutTileBinding;
import com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity;
import com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel;
import com.roadrunner.web.presentation.WebViewFragment;
import o.displayInAppMessagelambda10;
import o.findParagraphByIndex;
import o.getCieXyz;
import o.relativeMoveTo;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class NavController$onBackPressedCallback$1 extends OnBackPressedCallback {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NavController$onBackPressedCallback$1(int i, Object obj) {
        super(true);
        this.IconCompatParcelizer = i;
        this.serializer = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavController$onBackPressedCallback$1(relativeMoveTo relativemoveto) {
        super(false);
        this.IconCompatParcelizer = 0;
        this.serializer = relativemoveto;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackPressed() {
        int i = 2 % 2;
        int i2 = write + 3;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        Object obj = this.serializer;
        if (i4 == 0) {
            ((relativeMoveTo) obj).write();
            return;
        }
        if (i4 == 1) {
            SelfServiceCustomerChatActivity selfServiceCustomerChatActivity = (SelfServiceCustomerChatActivity) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((findParagraphByIndex) ((WebChatViewModel) SelfServiceCustomerChatActivity.write(-197462709, new Object[]{selfServiceCustomerChatActivity}, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read(), 197462724, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read())).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.read()).write, Boolean.TRUE}, getCieXyz.write())).booleanValue()) {
                selfServiceCustomerChatActivity.finish();
                return;
            }
            ((WebChatViewModel) SelfServiceCustomerChatActivity.write(-197462709, new Object[]{selfServiceCustomerChatActivity}, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read(), 197462724, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read())).write();
            return;
        }
        WebViewFragment webViewFragment = (WebViewFragment) obj;
        if (webViewFragment.onCreatePanelMenu) {
            LayoutTileBinding layoutTileBinding = webViewFragment.getOnBackPressedDispatcher;
            layoutTileBinding.getClass();
            if (!(!((WebView) layoutTileBinding.write).canGoBack())) {
                int i5 = write + 113;
                read = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    setEnabled(false);
                } else {
                    setEnabled(true);
                }
                LayoutTileBinding layoutTileBinding2 = webViewFragment.getOnBackPressedDispatcher;
                layoutTileBinding2.getClass();
                ((WebView) layoutTileBinding2.write).goBack();
                return;
            }
        }
        setEnabled(false);
        webViewFragment.read(false, false);
    }
}
