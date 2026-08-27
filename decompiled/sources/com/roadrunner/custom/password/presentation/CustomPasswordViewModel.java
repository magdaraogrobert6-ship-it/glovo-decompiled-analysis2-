package com.roadrunner.custom.password.presentation;

import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.BlockRunner;
import androidx.lifecycle.ViewModel;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.custom.password.api.CustomPasswordLaunchData;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.password_rules.PopulatePasswordRulesUseCaseImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.util.Collections;
import java.util.Map;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AndroidSystemCallbacksActivityCallbacks;
import o.LifecycleRequestDelegate;
import o.a9;
import o.decode;
import o.getBitmapui_graphics;
import o.getQueryContext;
import o.getSdkEnablementProviderandroid_sdk_base_release;
import o.insertOrUpdateTransformedNodeSubhierarchy;
import o.invalidateCallbacksFor;
import o.setTransactionSuccessful;
import o.transferSessionPackageI;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomPasswordViewModel extends ViewModel {
    private static int MediaSessionCompatToken = 1;
    private static int RatingCompat;
    public final MutableStateFlow IconCompatParcelizer;
    public final getSdkEnablementProviderandroid_sdk_base_release MediaBrowserCompatMediaItem;
    public final getQueryContext MediaDescriptionCompat;
    public final setTransactionSuccessful MediaMetadataCompat;
    public final StateFlow MediaSessionCompatQueueItem;
    public final OtpLogger RemoteActionCompatParcelizer;
    public final a9 read;
    public final BlockRunner serializer;
    public final CustomPasswordLaunchData write;

    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 49;
        int i3 = i2 % Fields.SpotShadowColor;
        RatingCompat = i3;
        int i4 = i2 % 2;
        StateFlow stateFlow = this.MediaSessionCompatQueueItem;
        int i5 = i3 + 125;
        MediaSessionCompatToken = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public final getQueryContext serializer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 83;
        RatingCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        getQueryContext getquerycontext = this.MediaDescriptionCompat;
        int i5 = i2 + 69;
        RatingCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return getquerycontext;
        }
        throw null;
    }

    public CustomPasswordViewModel(getQueryContext getquerycontext, PopulatePasswordRulesUseCaseImpl populatePasswordRulesUseCaseImpl, getSdkEnablementProviderandroid_sdk_base_release getsdkenablementproviderandroid_sdk_base_release, BlockRunner blockRunner, a9 a9Var, getBitmapui_graphics getbitmapui_graphics, setTransactionSuccessful settransactionsuccessful, transferSessionPackageI transfersessionpackagei, OtpLogger otpLogger) {
        getquerycontext.getClass();
        populatePasswordRulesUseCaseImpl.getClass();
        getsdkenablementproviderandroid_sdk_base_release.getClass();
        blockRunner.getClass();
        a9Var.getClass();
        settransactionsuccessful.getClass();
        transfersessionpackagei.getClass();
        otpLogger.getClass();
        this.MediaDescriptionCompat = getquerycontext;
        this.MediaBrowserCompatMediaItem = getsdkenablementproviderandroid_sdk_base_release;
        this.serializer = blockRunner;
        this.read = a9Var;
        this.MediaMetadataCompat = settransactionsuccessful;
        this.RemoteActionCompatParcelizer = otpLogger;
        Object objWrite = getbitmapui_graphics.write("launch_data");
        if (objWrite == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Lunch data must not be null");
            throw null;
        }
        CustomPasswordLaunchData customPasswordLaunchData = (CustomPasswordLaunchData) objWrite;
        this.write = customPasswordLaunchData;
        insertOrUpdateTransformedNodeSubhierarchy insertorupdatetransformednodesubhierarchy = customPasswordLaunchData.RemoteActionCompatParcelizer;
        insertorupdatetransformednodesubhierarchy.getClass();
        decode decodeVar = otpLogger.IconCompatParcelizer;
        Map mapSingletonMap = Collections.singletonMap("resetPasswordType", insertorupdatetransformednodesubhierarchy.getLoggingName());
        mapSingletonMap.getClass();
        decodeVar.IconCompatParcelizer("Custom Password Screen", mapSingletonMap);
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new invalidateCallbacksFor(new AndroidSystemCallbacksActivityCallbacks("", settransactionsuccessful.IconCompatParcelizer(R.string.custom_password_input_place_holder), LifecycleRequestDelegate.write), false, populatePasswordRulesUseCaseImpl.RemoteActionCompatParcelizer(((FirebaseRemoteConfigImpl) transfersessionpackagei).IconCompatParcelizer.read("custom_password_rules")), false));
        this.IconCompatParcelizer = mutableStateFlow;
        this.MediaSessionCompatQueueItem = mutableStateFlow;
        int i = RatingCompat + 83;
        MediaSessionCompatToken = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 41 / 0;
        }
    }
}
