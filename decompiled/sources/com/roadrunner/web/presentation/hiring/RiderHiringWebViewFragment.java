package com.roadrunner.web.presentation.hiring;

import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import androidx.activity.result.ActivityResultRegistry;
import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.FragmentActivity;
import coil3.ComponentRegistry$Builder;
import com.adjust.sdk.webbridge.AdjustBridge;
import com.common_ui.databinding.LayoutTileBinding;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.permission.api.model.PermissionModel;
import com.roadrunner.rider.recruitment.applicant.domain.GetApplicantAccessTokenUseCaseImpl;
import com.roadrunner.web.presentation.WebViewFragment;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.rx2.RxConvertKt$asSingle$1;
import o.FwFClientbootstrapIfNeeded1;
import o.displayInAppMessagelambda1;
import o.getImmutablePendingIntentFlags;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambda3qHeHeNIFAPgIpDR5PEtHuRNY;
import o.r8lambda5YIXqjQinFDsIS50wZsDjw0Xjv4;
import o.r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08;
import o.r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk;
import o.r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.removeNodeAtDepth;
import o.subscribeToChangeUserEvents;
import o.subscribeToSdkAuthenticationFailures;
import o.supportsColorMatrixQuery;
import o.toBitmapConfig1JJdX4A;
import okhttp3.internal.ws.RealWebSocket$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class RiderHiringWebViewFragment extends WebViewFragment {
    private static int reportFullyDrawn = 0;
    private static int startActivityForResult = 1;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY removeOnMultiWindowModeChangedListener;
    public GetApplicantAccessTokenUseCaseImpl removeOnPictureInPictureModeChangedListener;
    public r8lambda5YIXqjQinFDsIS50wZsDjw0Xjv4 removeOnPictureInPictureUiStateChangedListener;
    public subscribeToSdkAuthenticationFailures setContentView;
    public final ComponentRegistry$Builder setPictureInPictureParams;

    @Override // com.roadrunner.web.presentation.WebViewFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = reportFullyDrawn + 1;
        startActivityForResult = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        AdjustBridge.unregister();
        super.onDestroy();
        int i4 = startActivityForResult + 109;
        reportFullyDrawn = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public RiderHiringWebViewFragment() {
        RealWebSocket$$ExternalSyntheticLambda0 realWebSocket$$ExternalSyntheticLambda0 = new RealWebSocket$$ExternalSyntheticLambda0(17, this);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new FwFClientbootstrapIfNeeded1(9, new FwFClientbootstrapIfNeeded1(8, this)));
        this.setPictureInPictureParams = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(r8lambda3qHeHeNIFAPgIpDR5PEtHuRNY.class), new r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk(onviewdetachedfromwindowlambda1Serializer, 26), realWebSocket$$ExternalSyntheticLambda0, new r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk(onviewdetachedfromwindowlambda1Serializer, 27));
    }

    @Override // com.roadrunner.web.presentation.WebViewFragment
    public final void MediaDescriptionCompat() {
        int i = 2 % 2;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(getLifecycle()), null, null, new RxConvertKt$asSingle$1(this, null, 15), 3);
        int i2 = reportFullyDrawn + 7;
        startActivityForResult = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int i = 2 % 2;
        int i2 = startActivityForResult + 21;
        reportFullyDrawn = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        super.onResume();
        subscribeToSdkAuthenticationFailures subscribetosdkauthenticationfailures = this.setContentView;
        if (subscribetosdkauthenticationfailures == null) {
            removeNodeAtDepth.serializer("setInterceptorMode");
            throw null;
        }
        int i4 = reportFullyDrawn + 93;
        startActivityForResult = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            subscribetosdkauthenticationfailures.serializer(subscribeToChangeUserEvents.APPLICANT);
        } else {
            subscribetosdkauthenticationfailures.serializer(subscribeToChangeUserEvents.APPLICANT);
            throw null;
        }
    }

    @Override // com.roadrunner.web.presentation.WebViewFragment
    public final r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs serializer() {
        String string;
        int i = 2 % 2;
        int i2 = reportFullyDrawn + 9;
        startActivityForResult = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            getArguments();
            throw null;
        }
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("back_nav")) == null) {
            int i3 = startActivityForResult + 9;
            reportFullyDrawn = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
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
        Application application = requireActivity().getApplication();
        LayoutTileBinding layoutTileBinding = this.getOnBackPressedDispatcher;
        layoutTileBinding.getClass();
        AdjustBridge.registerAndGetInstance(application, (WebView) layoutTileBinding.write);
        Bundle arguments = getArguments();
        Object obj = null;
        if (arguments != null) {
            int i2 = reportFullyDrawn + 9;
            startActivityForResult = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                arguments.getString(PushNotificationParserObj.TITLE_KEY);
                throw null;
            }
            string = arguments.getString(PushNotificationParserObj.TITLE_KEY);
        } else {
            string = null;
        }
        if (string == null) {
            int i3 = reportFullyDrawn + 79;
            startActivityForResult = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                throw null;
            }
            string = "";
        }
        LayoutTileBinding layoutTileBinding2 = this.getOnBackPressedDispatcher;
        layoutTileBinding2.getClass();
        ((getImmutablePendingIntentFlags) layoutTileBinding2.serializer).setTitle(string);
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            int i4 = reportFullyDrawn + 35;
            startActivityForResult = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                arguments2.getString("url");
                obj.hashCode();
                throw null;
            }
            String string3 = arguments2.getString("url");
            if (string3 != null) {
                serializer(string3);
                r8lambda3qHeHeNIFAPgIpDR5PEtHuRNY r8lambda3qhehenifapgipdr5pethurny = (r8lambda3qHeHeNIFAPgIpDR5PEtHuRNY) this.setPictureInPictureParams.MediaSessionCompatResultReceiverWrapper();
                Bundle arguments3 = getArguments();
                if (arguments3 != null) {
                    int i5 = reportFullyDrawn + 113;
                    startActivityForResult = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        string2 = arguments3.getString("analytics_name");
                        int i6 = 60 / 0;
                    } else {
                        string2 = arguments3.getString("analytics_name");
                    }
                } else {
                    int i7 = reportFullyDrawn + 15;
                    startActivityForResult = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    string2 = null;
                }
                r8lambda3qhehenifapgipdr5pethurny.read(string2);
                supportsColorMatrixQuery lifecycle = getLifecycle();
                PermissionModel permissionModel = new PermissionModel(r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08.NOTIFICATION, true);
                r8lambda5YIXqjQinFDsIS50wZsDjw0Xjv4 r8lambda5yixqjqinfdsis50wzsdjw0xjv4 = this.removeOnPictureInPictureUiStateChangedListener;
                if (r8lambda5yixqjqinfdsis50wzsdjw0xjv4 == null) {
                    removeNodeAtDepth.serializer("notificationPermissionFactory");
                    throw null;
                }
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                fragmentActivityRequireActivity.getClass();
                ActivityResultRegistry activityResultRegistry = requireActivity().getActivityResultRegistry();
                activityResultRegistry.getClass();
                lifecycle.IconCompatParcelizer(r8lambda5yixqjqinfdsis50wzsdjw0xjv4.serializer(fragmentActivityRequireActivity, activityResultRegistry, permissionModel));
                return;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("No url was provided");
    }
}
