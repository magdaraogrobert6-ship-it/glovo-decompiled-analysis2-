package com.roadrunner.web.presentation.simpleWebView;

import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.graphics.Fields;
import coil3.ComponentRegistry$Builder;
import com.common_ui.databinding.LayoutTileBinding;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.web.presentation.WebViewFragment;
import kotlin.LazyKt__LazyJVMKt;
import o.FwFClientbootstrapIfNeeded1;
import o.displayInAppMessagelambda1;
import o.getImmutablePendingIntentFlags;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambda3qHeHeNIFAPgIpDR5PEtHuRNY;
import o.r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk;
import o.r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.removeNodeAtDepth;
import o.subscribeToChangeUserEvents;
import o.subscribeToSdkAuthenticationFailures;
import okhttp3.internal.ws.RealWebSocket$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class SimpleWebViewFragment extends WebViewFragment {
    private static int reportFullyDrawn = 0;
    private static int startActivityForResult = 1;
    public final ComponentRegistry$Builder removeOnMultiWindowModeChangedListener;
    public subscribeToSdkAuthenticationFailures removeOnPictureInPictureModeChangedListener;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY removeOnPictureInPictureUiStateChangedListener;

    @Override // com.roadrunner.web.presentation.WebViewFragment
    public final void MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = startActivityForResult + 111;
        reportFullyDrawn = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public SimpleWebViewFragment() {
        RealWebSocket$$ExternalSyntheticLambda0 realWebSocket$$ExternalSyntheticLambda0 = new RealWebSocket$$ExternalSyntheticLambda0(18, this);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new FwFClientbootstrapIfNeeded1(11, new FwFClientbootstrapIfNeeded1(10, this)));
        this.removeOnMultiWindowModeChangedListener = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(r8lambda3qHeHeNIFAPgIpDR5PEtHuRNY.class), new r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk(onviewdetachedfromwindowlambda1Serializer, 28), realWebSocket$$ExternalSyntheticLambda0, new r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk(onviewdetachedfromwindowlambda1Serializer, 29));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int i = 2 % 2;
        int i2 = startActivityForResult + 93;
        reportFullyDrawn = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        super.onResume();
        subscribeToSdkAuthenticationFailures subscribetosdkauthenticationfailures = this.removeOnPictureInPictureModeChangedListener;
        Object obj = null;
        if (subscribetosdkauthenticationfailures == null) {
            removeNodeAtDepth.serializer("setInterceptorMode");
            throw null;
        }
        int i4 = startActivityForResult + 79;
        reportFullyDrawn = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        subscribetosdkauthenticationfailures.serializer(subscribeToChangeUserEvents.SKIP);
        int i6 = reportFullyDrawn + 71;
        startActivityForResult = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.roadrunner.web.presentation.WebViewFragment
    public final r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs serializer() {
        String string;
        int i = 2 % 2;
        int i2 = startActivityForResult + 101;
        reportFullyDrawn = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("back_nav")) == null) {
            int i4 = reportFullyDrawn + 75;
            startActivityForResult = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            string = "CLOSE";
        }
        return r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs.valueOf(string);
    }

    @Override // com.roadrunner.web.presentation.WebViewFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        int i = 2 % 2;
        view.getClass();
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String str = null;
        if (arguments != null) {
            int i2 = reportFullyDrawn + 73;
            startActivityForResult = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                arguments.getString(PushNotificationParserObj.TITLE_KEY);
                str.hashCode();
                throw null;
            }
            string = arguments.getString(PushNotificationParserObj.TITLE_KEY);
        } else {
            string = null;
        }
        if (string == null) {
            string = "";
        }
        LayoutTileBinding layoutTileBinding = this.getOnBackPressedDispatcher;
        layoutTileBinding.getClass();
        ((getImmutablePendingIntentFlags) layoutTileBinding.serializer).setTitle(string);
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string2 = arguments2.getString("url")) != null) {
            serializer(string2);
            r8lambda3qHeHeNIFAPgIpDR5PEtHuRNY r8lambda3qhehenifapgipdr5pethurny = (r8lambda3qHeHeNIFAPgIpDR5PEtHuRNY) this.removeOnMultiWindowModeChangedListener.MediaSessionCompatResultReceiverWrapper();
            Bundle arguments3 = getArguments();
            r8lambda3qhehenifapgipdr5pethurny.read(arguments3 != null ? arguments3.getString("analytics_name") : null);
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("No url was provided");
        int i3 = reportFullyDrawn + 71;
        startActivityForResult = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
    }
}
