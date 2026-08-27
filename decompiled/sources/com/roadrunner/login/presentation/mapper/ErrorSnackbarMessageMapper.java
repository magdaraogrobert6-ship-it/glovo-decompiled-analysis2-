package com.roadrunner.login.presentation.mapper;

import android.R;
import android.content.ActivityNotFoundException;
import androidx.compose.ui.graphics.Fields;
import com.data.error.ApiException;
import com.data.util.exception.FoodoraMigrationException;
import com.roadrunner.login.logging.AuthenticationLogger;
import com.roadrunner.login.presentation.otp.OtpNavigationKt$$ExternalSyntheticLambda4;
import com.roadrunner.login.presentation.riderhiring.SupportUrlParsingException;
import com.roadrunner.networking.errormapper.NetworkErrorMapperImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.io.IOException;
import o.SemanticsInfoKt;
import o.a9;
import o.ahExternalSyntheticLambda0;
import o.b3;
import o.bd;
import o.bg;
import o.execSessionSuccessCallbackCommand;
import o.getAutofillManager;
import o.isVerticalSwipeInAllowedDirection;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.registerFacebookSDKJSInterface;
import o.resetTransientState;
import o.setGraphicModalMaxWidthDp;
import o.setTransactionSuccessful;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class ErrorSnackbarMessageMapper {
    private static int MediaMetadataCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final AuthenticationLogger IconCompatParcelizer;
    public final a9 MediaDescriptionCompat;
    public final bg RemoteActionCompatParcelizer;
    public final setTransactionSuccessful read;
    public final SemanticsInfoKt serializer;
    public final NetworkErrorMapperImpl write;

    public ErrorSnackbarMessageMapper(setTransactionSuccessful settransactionsuccessful, SemanticsInfoKt semanticsInfoKt, a9 a9Var, bg bgVar, AuthenticationLogger authenticationLogger, NetworkErrorMapperImpl networkErrorMapperImpl) {
        settransactionsuccessful.getClass();
        semanticsInfoKt.getClass();
        a9Var.getClass();
        bgVar.getClass();
        authenticationLogger.getClass();
        networkErrorMapperImpl.getClass();
        this.read = settransactionsuccessful;
        this.serializer = semanticsInfoKt;
        this.MediaDescriptionCompat = a9Var;
        this.RemoteActionCompatParcelizer = bgVar;
        this.IconCompatParcelizer = authenticationLogger;
        this.write = networkErrorMapperImpl;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e3  */
    public final ahExternalSyntheticLambda0 write(Throwable th, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        ahExternalSyntheticLambda0 ahexternalsyntheticlambda0;
        String str;
        int i = 2 % 2;
        boolean z = th instanceof ActivityNotFoundException;
        setTransactionSuccessful settransactionsuccessful = this.read;
        if (z) {
            String strIconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(R.string.copyUrl);
            return new ahExternalSyntheticLambda0(new registerFacebookSDKJSInterface(settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.force_update_browser_not_found), getAutofillManager.Indefinite, new execSessionSuccessCallbackCommand(strIconCompatParcelizer, new OtpNavigationKt$$ExternalSyntheticLambda4(this, 4, strIconCompatParcelizer))));
        }
        Object obj = null;
        if (th instanceof FoodoraMigrationException) {
            return new ahExternalSyntheticLambda0(new registerFacebookSDKJSInterface(settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.foodora_migration_error_message), getAutofillManager.Long, null));
        }
        if (th instanceof IOException) {
            ahExternalSyntheticLambda0 ahexternalsyntheticlambda1 = new ahExternalSyntheticLambda0(new registerFacebookSDKJSInterface(settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.network_connection_error_message), getAutofillManager.Long, null));
            int i2 = MediaMetadataCompat + 59;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return ahexternalsyntheticlambda1;
        }
        if (!(th instanceof ApiException.SessionExpired.Unauthorized)) {
            ahexternalsyntheticlambda0 = null;
        } else {
            ApiException.SessionExpired.Unauthorized unauthorized = (ApiException.SessionExpired.Unauthorized) th;
            bg bgVar = this.RemoteActionCompatParcelizer;
            bgVar.getClass();
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) bgVar.RemoteActionCompatParcelizer;
            if (firebaseRemoteConfigImpl.IconCompatParcelizer.read("get_support_button_on_login_for_terminated_rider").length() > 0) {
                int i4 = MediaSessionCompatQueueItem + 53;
                MediaMetadataCompat = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    String str2 = unauthorized.read().originalMessage;
                    obj.hashCode();
                    throw null;
                }
                String str3 = unauthorized.read().originalMessage;
                if (str3 == null) {
                    str3 = "";
                }
                if (str3.equals("User disabled")) {
                    String str4 = firebaseRemoteConfigImpl.IconCompatParcelizer.read("get_support_button_on_login_for_terminated_rider");
                    try {
                        isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                        isverticalswipeinalloweddirection.getClass();
                        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = bd.Companion.serializer();
                        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
                        str = ((bd) isverticalswipeinalloweddirection.serializer(str4, setgraphicmodalmaxwidthdpSerializer)).supportUrl;
                    } catch (Throwable unused) {
                        Timber.RemoteActionCompatParcelizer.write(new SupportUrlParsingException("Failed to parse support url for disabled user: jsonString ".concat(str4), null));
                        str = null;
                    }
                } else {
                    str = null;
                }
            } else {
                str = null;
            }
            if (str == null) {
                ahexternalsyntheticlambda0 = null;
            } else {
                ahexternalsyntheticlambda0 = new ahExternalSyntheticLambda0(new registerFacebookSDKJSInterface(unauthorized.getMessage(), getAutofillManager.Long, new execSessionSuccessCallbackCommand(settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.rider_hiring_get_support), new b3(this, r8lambdaunavo3sxub_pc9xroryotnrlvsm, str, 3))));
            }
        }
        return ahexternalsyntheticlambda0 == null ? new ahExternalSyntheticLambda0(new registerFacebookSDKJSInterface(this.write.read(th), getAutofillManager.Long, null)) : ahexternalsyntheticlambda0;
    }
}
