package o;

import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.web.performance.WebViewInitializer;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.rx2.RxConvertKt$asFlow$1;

/* JADX INFO: loaded from: classes3.dex */
public final class BrazeExternalSyntheticLambda29 implements androidx.lifecycle.DefaultLifecycleObserver {
    private static int serializer = 0;
    private static int write = 1;
    public final WebViewInitializer IconCompatParcelizer;
    public final transferSessionPackageI read;

    public BrazeExternalSyntheticLambda29(WebViewInitializer webViewInitializer, transferSessionPackageI transfersessionpackagei) {
        webViewInitializer.getClass();
        transfersessionpackagei.getClass();
        this.IconCompatParcelizer = webViewInitializer;
        this.read = transfersessionpackagei;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        int i = 2 % 2;
        int i2 = serializer + 59;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 % 2 == 0) {
            accessisrendernodecompatiblecp.getClass();
            super.onCreate(accessisrendernodecompatiblecp);
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.read;
            firebaseRemoteConfigImpl.getClass();
            firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_UI_THREAD_WEBVIEW_WARMUP_ENABLED);
            shortNewsContentCardView.hashCode();
            throw null;
        }
        accessisrendernodecompatiblecp.getClass();
        super.onCreate(accessisrendernodecompatiblecp);
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) this.read;
        firebaseRemoteConfigImpl2.getClass();
        if (firebaseRemoteConfigImpl2.IconCompatParcelizer(updateAdidI.IS_UI_THREAD_WEBVIEW_WARMUP_ENABLED)) {
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(accessisrendernodecompatiblecp.getLifecycle()), null, null, new RxConvertKt$asFlow$1(accessisrendernodecompatiblecp, this, shortNewsContentCardView, 24), 3);
            int i3 = write + 75;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
    }
}
