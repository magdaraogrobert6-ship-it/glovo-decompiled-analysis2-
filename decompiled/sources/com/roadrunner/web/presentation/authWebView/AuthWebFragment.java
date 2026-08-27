package com.roadrunner.web.presentation.authWebView;

import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.graphics.Fields;
import coil3.ComponentRegistry$Builder;
import com.common_ui.databinding.LayoutTileBinding;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import kotlin.LazyKt__LazyJVMKt;
import o.FwFClientbootstrapIfNeeded1;
import o.displayInAppMessagelambda1;
import o.getImmutablePendingIntentFlags;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk;
import o.r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.removeNodeAtDepth;
import o.subscribeToChangeUserEvents;
import o.subscribeToSdkAuthenticationFailures;
import okhttp3.internal.ws.RealWebSocket$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthWebFragment extends AuthBaseWebFragment<AuthWebViewModel> {
    private static int reportFullyDrawn = 1;
    private static int setContentView;
    public subscribeToSdkAuthenticationFailures removeOnMultiWindowModeChangedListener;
    public final ComponentRegistry$Builder removeOnPictureInPictureModeChangedListener;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY removeOnPictureInPictureUiStateChangedListener;

    public AuthWebFragment() {
        RealWebSocket$$ExternalSyntheticLambda0 realWebSocket$$ExternalSyntheticLambda0 = new RealWebSocket$$ExternalSyntheticLambda0(16, this);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new FwFClientbootstrapIfNeeded1(7, new FwFClientbootstrapIfNeeded1(6, this)));
        this.removeOnPictureInPictureModeChangedListener = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(AuthWebViewModel.class), new r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk(onviewdetachedfromwindowlambda1Serializer, 24), realWebSocket$$ExternalSyntheticLambda0, new r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk(onviewdetachedfromwindowlambda1Serializer, 25));
    }

    @Override // com.roadrunner.web.presentation.authWebView.AuthBaseWebFragment
    public final AuthWebViewModel PlaybackStateCompatCustomAction() {
        int i = 2 % 2;
        int i2 = setContentView + 77;
        reportFullyDrawn = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        AuthWebViewModel authWebViewModel = (AuthWebViewModel) this.removeOnPictureInPictureModeChangedListener.MediaSessionCompatResultReceiverWrapper();
        int i4 = setContentView + 87;
        reportFullyDrawn = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return authWebViewModel;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003c A[PHI: r1
  0x003c: PHI (r1v13 com.roadrunner.web.presentation.authWebView.AuthWebViewModel) = 
  (r1v6 com.roadrunner.web.presentation.authWebView.AuthWebViewModel)
  (r1v16 com.roadrunner.web.presentation.authWebView.AuthWebViewModel)
 binds: [B:8:0x0033, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0035 A[PHI: r1 r3
  0x0035: PHI (r1v7 com.roadrunner.web.presentation.authWebView.AuthWebViewModel) = 
  (r1v6 com.roadrunner.web.presentation.authWebView.AuthWebViewModel)
  (r1v16 com.roadrunner.web.presentation.authWebView.AuthWebViewModel)
 binds: [B:8:0x0033, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r3v1 android.os.Bundle) = (r3v0 android.os.Bundle), (r3v10 android.os.Bundle) binds: [B:8:0x0033, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        AuthWebViewModel authWebViewModel;
        Bundle arguments;
        String string;
        int i = 2 % 2;
        int i2 = setContentView + 105;
        reportFullyDrawn = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            super.onResume();
            authWebViewModel = (AuthWebViewModel) this.removeOnPictureInPictureModeChangedListener.MediaSessionCompatResultReceiverWrapper();
            arguments = getArguments();
            int i3 = 2 / 0;
            if (arguments != null) {
                string = arguments.getString("analytics_name");
            } else {
                int i4 = setContentView + 91;
                reportFullyDrawn = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                string = null;
            }
        } else {
            super.onResume();
            authWebViewModel = (AuthWebViewModel) this.removeOnPictureInPictureModeChangedListener.MediaSessionCompatResultReceiverWrapper();
            arguments = getArguments();
            if (arguments != null) {
                string = arguments.getString("analytics_name");
            } else {
                int i6 = setContentView + 91;
                reportFullyDrawn = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                string = null;
            }
        }
        if (string == null) {
            string = "";
        }
        authWebViewModel.read(string);
        subscribeToSdkAuthenticationFailures subscribetosdkauthenticationfailures = this.removeOnMultiWindowModeChangedListener;
        if (subscribetosdkauthenticationfailures == null) {
            removeNodeAtDepth.serializer("setInterceptorMode");
            throw null;
        }
        subscribetosdkauthenticationfailures.serializer(subscribeToChangeUserEvents.RIDER);
        int i8 = setContentView + 71;
        reportFullyDrawn = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            int i9 = 85 / 0;
        }
    }

    @Override // com.roadrunner.web.presentation.WebViewFragment
    public final r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs serializer() {
        String string;
        int i = 2 % 2;
        Bundle arguments = getArguments();
        String string2 = arguments != null ? arguments.getString("url") : null;
        if (string2 == null) {
            int i2 = reportFullyDrawn + 5;
            setContentView = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            string2 = "";
        }
        if (((AuthWebViewModel) this.removeOnPictureInPictureModeChangedListener.MediaSessionCompatResultReceiverWrapper()).write(string2)) {
            return r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs.NONE;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("back_nav")) == null) {
            string = "BACK";
            int i4 = setContentView + 101;
            reportFullyDrawn = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        return r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs.valueOf(string);
    }

    @Override // com.roadrunner.web.presentation.authWebView.AuthBaseWebFragment, com.roadrunner.web.presentation.WebViewFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        int i = 2 % 2;
        int i2 = setContentView + 59;
        reportFullyDrawn = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            view.getClass();
            getArguments();
            throw null;
        }
        view.getClass();
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i3 = setContentView + 115;
            reportFullyDrawn = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            string = arguments.getString(PushNotificationParserObj.TITLE_KEY);
        } else {
            string = null;
        }
        String str = "";
        if (string == null) {
            int i5 = setContentView + 63;
            reportFullyDrawn = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            string = "";
        }
        LayoutTileBinding layoutTileBinding = this.getOnBackPressedDispatcher;
        layoutTileBinding.getClass();
        ((getImmutablePendingIntentFlags) layoutTileBinding.serializer).setTitle(string);
        AuthWebViewModel authWebViewModel = (AuthWebViewModel) this.removeOnPictureInPictureModeChangedListener.MediaSessionCompatResultReceiverWrapper();
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("url") : null;
        if (string2 == null) {
            int i7 = reportFullyDrawn + 85;
            setContentView = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                throw null;
            }
        } else {
            str = string2;
        }
        authWebViewModel.serializer(str);
        super.onViewCreated(view, bundle);
    }
}
