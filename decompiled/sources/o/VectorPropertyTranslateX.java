package o;

import com.deliveryhero.selfServiceChat.ui.WebChatFragment;
import com.deliveryhero.selfServiceChat.ui.WebViewManager;
import java.util.ArrayList;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class VectorPropertyTranslateX extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int serializer;
    public final /* synthetic */ WebChatFragment write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VectorPropertyTranslateX(WebChatFragment webChatFragment, int i) {
        super(0);
        this.serializer = i;
        this.write = webChatFragment;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.serializer;
        WebChatFragment webChatFragment = this.write;
        switch (i) {
            case 0:
                return new getTrackingServicefwf_client_release(2, new ArrayList(new r8lambdaY3Sk3_bCKw7cHfi7g4HzfmtF88Q(new Object[]{webChatFragment.requireActivity().getActivityResultRegistry()}, false)));
            case 1:
                return evaluateFeaturefwf_client_release.read(webChatFragment).RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(onImageAvailable.class), null);
            case 2:
                return evaluateFeaturefwf_client_release.read(webChatFragment).RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(setOutlineAmbientShadowColor.class), null);
            case 3:
                return evaluateFeaturefwf_client_release.read(webChatFragment).RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(accessgetPlaceholderCanvascp.class), null);
            case 4:
                return evaluateFeaturefwf_client_release.read(webChatFragment).RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(WebViewManager.class), null);
            case 5:
                return evaluateFeaturefwf_client_release.read(webChatFragment).RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(LayerSnapshotImpl.class), null);
            case 6:
                return evaluateFeaturefwf_client_release.read(webChatFragment).RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(obtainDropShadowRenderereZhPAX0.class), null);
            case 7:
                return evaluateFeaturefwf_client_release.read(webChatFragment).RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(obtainSizePxVpY3zN4.class), null);
            default:
                return webChatFragment;
        }
    }
}
