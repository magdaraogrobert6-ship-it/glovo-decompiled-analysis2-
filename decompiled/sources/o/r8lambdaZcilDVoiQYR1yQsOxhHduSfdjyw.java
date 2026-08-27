package o;

import android.app.Application;
import android.content.SharedPreferences;
import com.google.android.play.core.appupdate.zzz;
import com.roadrunner.auth.domain.SaveAuthDataUseCase;
import com.roadrunner.auth.domain.SaveAuthSignInDataUseCase;
import com.roadrunner.auth.domain.SaveSignInDataUseCaseImpl;
import com.roadrunner.auth.domain.logout.LogoutLifecycleCallbacksImpl;
import com.roadrunner.auth.statemachine.AuthStateMachine;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.customerchat.selfservice.data.cache.ChatIdCacheHelper;
import com.roadrunner.customerchat.selfservice.data.cache.WebChatNativeCacheDataStore;
import com.roadrunner.customerchat.selfservice.data.remote.service.ExecuteHelpCenterApiRequest;
import com.roadrunner.customerchat.selfservice.data.repository.WebChatNativeAssetRepositoryImpl;
import com.roadrunner.customerchat.selfservice.presentation.WebViewManager;
import com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.RetryCountTrackerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.UploadPictureUseCaseImpl;
import com.roadrunner.delivery.repository.CachedDeliveryRepository;
import com.roadrunner.inappnotifications.data.InAppNotificationsRepository;
import com.roadrunner.incognia.implementation.IncogniaManagerImpl;
import com.roadrunner.logger.info.AppEventInfoChangeHandler;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaZcilDVoiQYR1yQsOxhHduSfdjyw implements getColorIntegerOrNulllambda0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat;
    public final mergeJsonObjects IconCompatParcelizer;
    public final mergeJsonObjects RatingCompat;
    public final mergeJsonObjects RemoteActionCompatParcelizer;
    public final mergeJsonObjects read;
    public final mergeJsonObjects serializer;
    public final /* synthetic */ int write;

    public r8lambdaZcilDVoiQYR1yQsOxhHduSfdjyw(isMainThread ismainthread, hasNestedScrollingParent hasnestedscrollingparent, mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, mergeJsonObjects mergejsonobjects3, mergeJsonObjects mergejsonobjects4) {
        this.write = 4;
        this.serializer = hasnestedscrollingparent;
        this.read = mergejsonobjects;
        this.RemoteActionCompatParcelizer = mergejsonobjects2;
        this.IconCompatParcelizer = mergejsonobjects3;
        this.RatingCompat = mergejsonobjects4;
    }

    public /* synthetic */ r8lambdaZcilDVoiQYR1yQsOxhHduSfdjyw(mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, mergeJsonObjects mergejsonobjects3, mergeJsonObjects mergejsonobjects4, mergeJsonObjects mergejsonobjects5, int i) {
        this.write = i;
        this.serializer = mergejsonobjects;
        this.read = mergejsonobjects2;
        this.RemoteActionCompatParcelizer = mergejsonobjects3;
        this.IconCompatParcelizer = mergejsonobjects4;
        this.RatingCompat = mergejsonobjects5;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 115;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i3 = this.write;
        mergeJsonObjects mergejsonobjects = this.RatingCompat;
        mergeJsonObjects mergejsonobjects2 = this.IconCompatParcelizer;
        mergeJsonObjects mergejsonobjects3 = this.RemoteActionCompatParcelizer;
        mergeJsonObjects mergejsonobjects4 = this.read;
        mergeJsonObjects mergejsonobjects5 = this.serializer;
        switch (i3) {
            case 0:
                return new zzz(mergejsonobjects5, mergejsonobjects4, mergejsonobjects3, mergejsonobjects2, mergejsonobjects);
            case 1:
                return new SaveAuthSignInDataUseCase((SaveAuthDataUseCase) mergejsonobjects5.write(), (isOnline) mergejsonobjects4.write(), (boundingRectInRoot) mergejsonobjects3.write(), (isOffline) mergejsonobjects2.write(), (SaveSignInDataUseCaseImpl) mergejsonobjects.write());
            case 2:
                LogoutLifecycleCallbacksImpl logoutLifecycleCallbacksImpl = new LogoutLifecycleCallbacksImpl((SemanticsPropertiesTestTag1) mergejsonobjects5.write(), (getContentViewGroupParentLayout) mergejsonobjects4.write(), (AndroidUiDispatcherCompanioncurrentThread1) AbstractC0194popup.RemoteActionCompatParcelizer.write(), (SemanticsPropertiesContentDescription1) mergejsonobjects3.write(), (transferSessionPackageI) mergejsonobjects2.write(), (AuthStateMachine) mergejsonobjects.write());
                int i4 = MediaDescriptionCompat + 13;
                MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return logoutLifecycleCallbacksImpl;
            case 3:
                return new getHasNonTranslationComponentsannotations((SemanticsOwner) mergejsonobjects5.write(), (SuspendingTransactionWrapper) mergejsonobjects4.write(), (AppEventInfoChangeHandler) mergejsonobjects3.write(), (Application) mergejsonobjects2.write(), (transferSessionPackageI) mergejsonobjects.write());
            case 4:
                Application application = (Application) mergejsonobjects5.write();
                publishError publisherror = (publishError) mergejsonobjects4.write();
                transferSessionPackageI transfersessionpackagei = (transferSessionPackageI) mergejsonobjects3.write();
                SharedPreferences sharedPreferences = (SharedPreferences) mergejsonobjects2.write();
                setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) mergejsonobjects.write();
                application.getClass();
                publisherror.getClass();
                transfersessionpackagei.getClass();
                sharedPreferences.getClass();
                settransactionsuccessful.getClass();
                return new roundDownToMultipleOf8(publisherror, application.getString(com.logistics.rider.glovo.R.string.preference_chat_language), sharedPreferences, settransactionsuccessful, transfersessionpackagei);
            case 5:
                return new setMinDebounceDeadline((WebViewManager) mergejsonobjects5.write(), (addUrlAnnotation) mergejsonobjects4.write(), (accessisSetgyyYBs) mergejsonobjects3.write(), (ChatIdCacheHelper) mergejsonobjects2.write(), (getContentViewGroupParentLayout) mergejsonobjects.write());
            case 6:
                return new WebChatNativeAssetRepositoryImpl((handleUlStart) mergejsonobjects5.write(), (WebChatNativeCacheDataStore) mergejsonobjects4.write(), (ExecuteHelpCenterApiRequest) mergejsonobjects3.write(), (AnnotatedStringExhaustiveAnnotation) mergejsonobjects2.write(), (addStringAnnotation) mergejsonobjects.write(), new Path$Companion());
            case 7:
                return new EmojiCompatStatusDelegate((accessgetParagraphcp) mergejsonobjects5.write(), (r8lambdalVQGMqHtfjmEwPaE6dqnfDBlU) mergejsonobjects4.write(), (accessrequireViewFactoryHolder) mergejsonobjects3.write(), (getHeadingrAG3T2k) mergejsonobjects2.write(), (transferSessionPackageI) mergejsonobjects.write());
            case 8:
                return new UploadPictureUseCaseImpl((logWarningui_tooling) mergejsonobjects5.write(), (setStateParametersdefault) mergejsonobjects4.write(), (ConfirmationRepository) mergejsonobjects3.write(), (setDefaultNotificationChannelNameandroid_sdk_base_release) getBrazeLogTag.read.write(), (com.huawei.wisesecurity.ucs_credential.n0) InfiniteTransitionClock.IconCompatParcelizer.write(), (RetryCountTrackerImpl) mergejsonobjects2.write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
            case 9:
                return new InAppNotificationsRepository((setItemAnimator) mergejsonobjects5.write(), (startNestedScroll) mergejsonobjects4.write(), (ExecuteApiRequest) mergejsonobjects3.write(), (androidx.work.impl.WorkManagerImpl) mergejsonobjects2.write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
            default:
                return new clearTmpDetachFlag((IncogniaManagerImpl) mergejsonobjects5.write(), (getContentViewGroupParentLayout) mergejsonobjects4.write(), (removeRearDisplayPresentationStatusListener) mergejsonobjects3.write(), (transferSessionPackageI) mergejsonobjects2.write(), (CachedDeliveryRepository) mergejsonobjects.write());
        }
    }
}
