package com.roadrunner.rider.recruitment.accountcreation.password_creation.presentation;

import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.ViewModel;
import com.logistics.rider.glovo.R;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.password_rules.PopulatePasswordRulesUseCaseImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.recruitment.accountcreation.analytics.AccountCreationLogger;
import com.roadrunner.rider.recruitment.accountcreation.presentation.SnackBarErrorMapper;
import com.sentiance.core.model.events.C$b;
import com.sentiance.core.model.events.i$c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.ActivityHandler3;
import o.ActivityHandler39;
import o.AndroidSystemCallbacksActivityCallbacks;
import o.LifecycleRequestDelegate;
import o.NullRequestDataException;
import o.getQueryContext;
import o.getSdkEnablementProviderandroid_sdk_base_release;
import o.hideCurrentlyDisplayingInAppMessage;
import o.setPlayStoreKidsComplianceInDelay;
import o.setTransactionSuccessful;
import o.transferSessionPackageI;
import o.unpackY;
import o.updateAdidI;

/* JADX INFO: loaded from: classes3.dex */
public final class PasswordCreationViewModel extends ViewModel {
    private static int ComponentActivity = 0;
    private static int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 1;
    public String IconCompatParcelizer;
    public final StateFlow MediaBrowserCompatMediaItem;
    public final C$b MediaDescriptionCompat;
    public final MutableStateFlow MediaMetadataCompat;
    public final AccountCreationLogger MediaSessionCompatQueueItem;
    public final getQueryContext MediaSessionCompatResultReceiverWrapper;
    public final OtpLogger MediaSessionCompatToken;
    public final transferSessionPackageI ParcelableVolumeInfo;
    public final setTransactionSuccessful PlaybackStateCompat;
    public final i$c PlaybackStateCompatCustomAction;
    public final setPlayStoreKidsComplianceInDelay RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final getSdkEnablementProviderandroid_sdk_base_release ResultReceiver;
    public final StateFlow r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final SnackBarErrorMapper r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public String read;
    public boolean serializer;
    public String write;

    public PasswordCreationViewModel(PopulatePasswordRulesUseCaseImpl populatePasswordRulesUseCaseImpl, unpackY unpacky, transferSessionPackageI transfersessionpackagei, setTransactionSuccessful settransactionsuccessful, getSdkEnablementProviderandroid_sdk_base_release getsdkenablementproviderandroid_sdk_base_release, C$b c$b, SnackBarErrorMapper snackBarErrorMapper, i$c i_c, setPlayStoreKidsComplianceInDelay setplaystorekidscomplianceindelay, AccountCreationLogger accountCreationLogger, OtpLogger otpLogger, getQueryContext getquerycontext) {
        populatePasswordRulesUseCaseImpl.getClass();
        unpacky.getClass();
        transfersessionpackagei.getClass();
        settransactionsuccessful.getClass();
        getsdkenablementproviderandroid_sdk_base_release.getClass();
        c$b.getClass();
        snackBarErrorMapper.getClass();
        i_c.getClass();
        setplaystorekidscomplianceindelay.getClass();
        accountCreationLogger.getClass();
        otpLogger.getClass();
        getquerycontext.getClass();
        this.ParcelableVolumeInfo = transfersessionpackagei;
        this.PlaybackStateCompat = settransactionsuccessful;
        this.ResultReceiver = getsdkenablementproviderandroid_sdk_base_release;
        this.MediaDescriptionCompat = c$b;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = snackBarErrorMapper;
        this.PlaybackStateCompatCustomAction = i_c;
        this.RatingCompat = setplaystorekidscomplianceindelay;
        this.MediaSessionCompatQueueItem = accountCreationLogger;
        this.MediaSessionCompatToken = otpLogger;
        this.MediaSessionCompatResultReceiverWrapper = getquerycontext;
        this.read = "";
        MutableStateFlow mutableStateFlow = StateFlowKt.read(ActivityHandler3.serializer);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.MediaBrowserCompatMediaItem = mutableStateFlow;
        String strIconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(R.string.account_creation_password_hint_text);
        LifecycleRequestDelegate lifecycleRequestDelegate = LifecycleRequestDelegate.write;
        AndroidSystemCallbacksActivityCallbacks androidSystemCallbacksActivityCallbacks = new AndroidSystemCallbacksActivityCallbacks("", strIconCompatParcelizer, lifecycleRequestDelegate);
        AndroidSystemCallbacksActivityCallbacks androidSystemCallbacksActivityCallbacks2 = new AndroidSystemCallbacksActivityCallbacks("", settransactionsuccessful.IconCompatParcelizer(R.string.account_creation_password_confirm_hint_text), lifecycleRequestDelegate);
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) transfersessionpackagei;
        List listRemoteActionCompatParcelizer = populatePasswordRulesUseCaseImpl.RemoteActionCompatParcelizer(firebaseRemoteConfigImpl.IconCompatParcelizer.read("account_creation_password_rules"));
        String str = unpacky.read.write().privacyPolicyUrl;
        String strIconCompatParcelizer2 = settransactionsuccessful.IconCompatParcelizer(R.string.account_creation_password_loading_text);
        String strIconCompatParcelizer3 = settransactionsuccessful.IconCompatParcelizer(R.string.account_creation_password_title_text);
        String strIconCompatParcelizer4 = settransactionsuccessful.IconCompatParcelizer(R.string.account_creation_password_subtitle_text);
        String strIconCompatParcelizer5 = settransactionsuccessful.IconCompatParcelizer(R.string.account_creation_password_button_text);
        String strIconCompatParcelizer6 = settransactionsuccessful.IconCompatParcelizer(R.string.account_creation_password_privacy_policy_text);
        String lowerCase = settransactionsuccessful.IconCompatParcelizer(R.string.privacy_policy).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(new ActivityHandler39(androidSystemCallbacksActivityCallbacks, androidSystemCallbacksActivityCallbacks2, false, listRemoteActionCompatParcelizer, false, str, strIconCompatParcelizer2, strIconCompatParcelizer3, strIconCompatParcelizer4, strIconCompatParcelizer5, strIconCompatParcelizer6, lowerCase, firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_RACC_ACCOUNT_CREATION_WITH_OTP_ENABLED), settransactionsuccessful.IconCompatParcelizer(R.string.om_racc_account_creation_your_account_is_not_ready), settransactionsuccessful.IconCompatParcelizer(R.string.om_racc_account_creation_if_you_go_back), settransactionsuccessful.IconCompatParcelizer(R.string.om_racc_account_creation_go_back_anyway), settransactionsuccessful.IconCompatParcelizer(R.string.om_racc_account_creation_cancel)));
        this.MediaMetadataCompat = mutableStateFlow2;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = mutableStateFlow2;
        accountCreationLogger.RemoteActionCompatParcelizer.IconCompatParcelizer("Password Creation Screen", null);
    }

    public final void RemoteActionCompatParcelizer() {
        MutableStateFlow mutableStateFlow;
        Object obj;
        int i = 2 % 2;
        do {
            mutableStateFlow = this.MediaMetadataCompat;
            obj = mutableStateFlow.read();
        } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj, ActivityHandler39.write((ActivityHandler39) obj, null, null, false, null, false, 131055)));
        int i2 = ComponentActivity + 47;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public final boolean serializer(String str, String str2) {
        int i = 2 % 2;
        if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            int i2 = ComponentActivity + 29;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2)) {
                if (str.equals(str2)) {
                    List list = ((ActivityHandler39) this.MediaMetadataCompat.read()).RatingCompat;
                    this.ResultReceiver.getClass();
                    ArrayList arrayList = getSdkEnablementProviderandroid_sdk_base_release.read(str, list);
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            int i4 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 23;
                            ComponentActivity = i4 % Fields.SpotShadowColor;
                            int i5 = i4 % 2;
                            if (!((NullRequestDataException) it.next()).read) {
                            }
                        }
                    }
                    return true;
                }
                return false;
            }
        }
        int i6 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 49;
        ComponentActivity = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
