package com.sentiance.sdk.usercontext.api;

import android.annotation.SuppressLint;
import android.content.Context;
import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.pendingoperation.PendingOperation;
import com.sentiance.sdk.usercontext.UserContextProvider;
import com.sentiance.sdk.usercontext.api.UserContextApi;
import com.sentiance.sdk.util.N;
import java.util.List;
import o.BrazeNotificationUtilsExternalSyntheticLambda14;
import o.ICardStorageProvider;
import o.getDataStoremigrateRegisteredGeofencesListToJson;
import o.onContentCardClicked;
import o.r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk;
import o.setPushUniqueId;

/* JADX INFO: loaded from: classes5.dex */
@DontObfuscate
public class UserContextApi extends N implements IUserContextApi {

    @SuppressLint
    private static UserContextApi sInstance;

    private UserContextApi(Context context) {
    }

    @Override // com.sentiance.sdk.usercontext.api.IUserContextApi
    public PendingOperation<UserContext, RequestUserContextError> requestUserContext() {
        return requestUserContextInternal(false);
    }

    @Override // com.sentiance.sdk.usercontext.api.IUserContextApi
    public PendingOperation<UserContext, RequestUserContextError> requestUserContextIncludingProvisionalEvents() {
        return requestUserContextInternal(true);
    }

    public static UserContextApi getInstance(Context context) {
        UserContextApi userContextApi;
        synchronized (UserContextApi.class) {
            if (sInstance == null) {
                sInstance = new UserContextApi(context.getApplicationContext());
            }
            userContextApi = sInstance;
        }
        return userContextApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$addProvisionalAwareUserContextUpdateListener$2(UserContextUpdateListener userContextUpdateListener) {
        UserContextProvider userContextProvider = (UserContextProvider) setPushUniqueId.read(UserContextProvider.class);
        userContextProvider.getClass();
        userContextUpdateListener.getClass();
        userContextProvider.IconCompatParcelizer(true, onContentCardClicked.RatingCompat(UserContextUpdateCriteria.values()), userContextUpdateListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addProvisionalAwareUserContextUpdateListenerWithCriteria$4(List list, UserContextUpdateListener userContextUpdateListener) {
        ((UserContextProvider) setPushUniqueId.read(UserContextProvider.class)).IconCompatParcelizer(true, list, userContextUpdateListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$addUserContextUpdateListener$1(UserContextUpdateListener userContextUpdateListener) {
        UserContextProvider userContextProvider = (UserContextProvider) setPushUniqueId.read(UserContextProvider.class);
        userContextProvider.getClass();
        userContextUpdateListener.getClass();
        userContextProvider.IconCompatParcelizer(false, onContentCardClicked.RatingCompat(UserContextUpdateCriteria.values()), userContextUpdateListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addUserContextUpdateListener$3(List list, UserContextUpdateListener userContextUpdateListener) {
        ((UserContextProvider) setPushUniqueId.read(UserContextProvider.class)).IconCompatParcelizer(false, list, userContextUpdateListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$removeUserContextUpdateListener$5(UserContextUpdateListener userContextUpdateListener) {
        ((UserContextProvider) setPushUniqueId.read(UserContextProvider.class)).read(userContextUpdateListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$requestUserContextInternal$0(BrazeNotificationUtilsExternalSyntheticLambda14 brazeNotificationUtilsExternalSyntheticLambda14, boolean z) {
        ((UserContextProvider) setPushUniqueId.read(UserContextProvider.class)).write(brazeNotificationUtilsExternalSyntheticLambda14, z);
        return Boolean.TRUE;
    }

    private PendingOperation<UserContext, RequestUserContextError> requestUserContextInternal(final boolean z) {
        final BrazeNotificationUtilsExternalSyntheticLambda14 brazeNotificationUtilsExternalSyntheticLambda14 = new BrazeNotificationUtilsExternalSyntheticLambda14();
        if (!((Boolean) ifSdkIsInitializedWithUser(Boolean.FALSE, (r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk<Boolean>) new r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk() { // from class: o.getDataStoremigrateIndividualReeligibilityMapToJson
            @Override // o.r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk
            public final Object IconCompatParcelizer() {
                return UserContextApi.lambda$requestUserContextInternal$0(brazeNotificationUtilsExternalSyntheticLambda14, z);
            }
        })).booleanValue()) {
            brazeNotificationUtilsExternalSyntheticLambda14.serializer(new RequestUserContextError(RequestUserContextFailureReason.NO_USER));
            return brazeNotificationUtilsExternalSyntheticLambda14;
        }
        if (((ConfigurationManager) setPushUniqueId.read(ConfigurationManager.class)).r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw()) {
            brazeNotificationUtilsExternalSyntheticLambda14.serializer(new RequestUserContextError(RequestUserContextFailureReason.USER_DISABLED_REMOTELY));
        }
        return brazeNotificationUtilsExternalSyntheticLambda14;
    }

    @Override // com.sentiance.sdk.usercontext.api.IUserContextApi
    public void addProvisionalAwareUserContextUpdateListener(UserContextUpdateListener userContextUpdateListener) {
        ifSdkIsInitialized(getSentianceHandler(), new getDataStoremigrateRegisteredGeofencesListToJson(userContextUpdateListener, 1));
    }

    @Override // com.sentiance.sdk.usercontext.api.IUserContextApi
    public void addProvisionalAwareUserContextUpdateListenerWithCriteria(List<UserContextUpdateCriteria> list, UserContextUpdateListener userContextUpdateListener) {
        ifSdkIsInitialized(getSentianceHandler(), new ICardStorageProvider(list, userContextUpdateListener, 0));
    }

    @Override // com.sentiance.sdk.usercontext.api.IUserContextApi
    public void addUserContextUpdateListener(UserContextUpdateListener userContextUpdateListener) {
        ifSdkIsInitialized(getSentianceHandler(), new getDataStoremigrateRegisteredGeofencesListToJson(userContextUpdateListener, 2));
    }

    @Override // com.sentiance.sdk.usercontext.api.IUserContextApi
    public void removeUserContextUpdateListener(UserContextUpdateListener userContextUpdateListener) {
        ifSdkIsInitialized(getSentianceHandler(), new getDataStoremigrateRegisteredGeofencesListToJson(userContextUpdateListener, 0));
    }

    @Override // com.sentiance.sdk.usercontext.api.IUserContextApi
    public void addUserContextUpdateListener(List<UserContextUpdateCriteria> list, UserContextUpdateListener userContextUpdateListener) {
        ifSdkIsInitialized(getSentianceHandler(), new ICardStorageProvider(list, userContextUpdateListener, 1));
    }
}
