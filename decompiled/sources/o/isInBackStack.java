package o;

import com.roadrunner.auth.domain.GetUserAuthenticationStateUseCaseImpl;
import com.roadrunner.auth.domain.GetUserDataUseCaseImpl;
import com.roadrunner.auth.domain.token.IsUserAuthenticatedWrapper;
import com.roadrunner.auth.statemachine.AuthStateMachine;
import com.roadrunner.heatmap.domain.ShouldShowHeatmap_Factory;
import com.roadrunner.home.CreateHomeScope;
import com.roadrunner.home.HomeViewModel;
import com.roadrunner.incognia.implementation.IncogniaManagerImpl;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.login.presentation.router.GetAuthStateViewModel;
import com.roadrunner.login.presentation.router.LoadAbTestConfigUseCase;
import com.roadrunner.login.presentation.router.RemoteConfigStartupTask;
import com.roadrunner.login.presentation.router.RouterViewModel;
import com.roadrunner.map.container.enabled.usecases.recenter.RecenterMapTriggerImpl;
import com.roadrunner.map.container.safearea.SafeAreaPublisherImpl;
import com.roadrunner.networking.errormapper.NetworkErrorMapperImpl;
import com.roadrunner.remoteconfig.firebase.FetchRemoteConfigUseCaseImpl;
import com.roadrunner.rider.recruitment.applicant.domain.GetBecomeRiderUriImpl;
import com.roadrunner.rider.recruitment.applicant.domain.ShouldNavigateToRecruitmentScreenImpl;
import com.roadrunner.user.properties.domain.SaveUserPropertiesUseCaseImpl;
import io.grpc.internal.CallTracer;
import io.grpc.internal.SharedResourcePool;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class isInBackStack implements getColorIntegerOrNulllambda0 {
    private static int ResultReceiver = 0;
    private static int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 1;
    public final mergeJsonObjects ComponentActivity;
    public final /* synthetic */ int IconCompatParcelizer = 2;
    public final mergeJsonObjects MediaBrowserCompatMediaItem;
    public final mergeJsonObjects MediaDescriptionCompat;
    public final mergeJsonObjects MediaMetadataCompat;
    public final getColorIntegerOrNulllambda0 MediaSessionCompatQueueItem;
    public final mergeJsonObjects MediaSessionCompatResultReceiverWrapper;
    public final mergeJsonObjects MediaSessionCompatToken;
    public final mergeJsonObjects ParcelableVolumeInfo;
    public final mergeJsonObjects PlaybackStateCompat;
    public final mergeJsonObjects PlaybackStateCompatCustomAction;
    public final mergeJsonObjects RatingCompat;
    public final getColorIntegerOrNulllambda0 RemoteActionCompatParcelizer;
    public final mergeJsonObjects r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final mergeJsonObjects read;
    public final mergeJsonObjects serializer;
    public final mergeJsonObjects write;

    public isInBackStack(r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw, getVerticalScrollAxisRangedelegate getverticalscrollaxisrangedelegate, getVerticalScrollAxisRangedelegate getverticalscrollaxisrangedelegate2, r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw2, invokeqtAw6s invokeqtaw6s, mergeJsonObjects mergejsonobjects, ShouldShowHeatmap_Factory shouldShowHeatmap_Factory, mergeJsonObjects mergejsonobjects2, newTransaction newtransaction, setPaddingBottom setpaddingbottom, com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory, getDoubleOrNull getdoubleornull, mergeJsonObjects mergejsonobjects3, BrazeExternalSyntheticLambda102 brazeExternalSyntheticLambda102, requestBannersRefreshlambda1 requestbannersrefreshlambda1, SimpleExecutableQuery simpleExecutableQuery) {
        this.MediaBrowserCompatMediaItem = r8lambda6uovp7lvejigbq5knkop8a0veiw;
        this.RatingCompat = getverticalscrollaxisrangedelegate;
        this.MediaSessionCompatResultReceiverWrapper = getverticalscrollaxisrangedelegate2;
        this.MediaDescriptionCompat = r8lambda6uovp7lvejigbq5knkop8a0veiw2;
        this.read = invokeqtaw6s;
        this.MediaMetadataCompat = mergejsonobjects;
        this.MediaSessionCompatToken = shouldShowHeatmap_Factory;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = mergejsonobjects2;
        this.MediaSessionCompatQueueItem = newtransaction;
        this.write = setpaddingbottom;
        this.ComponentActivity = dataModule_ProvideSchedulerFactory;
        this.ParcelableVolumeInfo = getdoubleornull;
        this.PlaybackStateCompat = mergejsonobjects3;
        this.PlaybackStateCompatCustomAction = brazeExternalSyntheticLambda102;
        this.serializer = requestbannersrefreshlambda1;
        this.RemoteActionCompatParcelizer = simpleExecutableQuery;
    }

    public isInBackStack(getDoubleOrNull getdoubleornull, getDoubleOrNull getdoubleornull2, getDoubleOrNull getdoubleornull3, getDoubleOrNull getdoubleornull4, getDoubleOrNull getdoubleornull5, getDoubleOrNull getdoubleornull6, mergeJsonObjects mergejsonobjects, isMenuVisible ismenuvisible, backgroundTimerFiredI backgroundtimerfiredi, mergeJsonObjects mergejsonobjects2, mergeJsonObjects mergejsonobjects3, mergeJsonObjects mergejsonobjects4, mergeJsonObjects mergejsonobjects5, mergeJsonObjects mergejsonobjects6, mergeJsonObjects mergejsonobjects7, getSharedElementTargetNames getsharedelementtargetnames) {
        this.MediaBrowserCompatMediaItem = getdoubleornull;
        this.RatingCompat = getdoubleornull2;
        this.MediaSessionCompatResultReceiverWrapper = getdoubleornull3;
        this.MediaDescriptionCompat = getdoubleornull4;
        this.read = getdoubleornull5;
        this.MediaMetadataCompat = getdoubleornull6;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = mergejsonobjects;
        this.MediaSessionCompatQueueItem = ismenuvisible;
        this.write = backgroundtimerfiredi;
        this.ComponentActivity = mergejsonobjects2;
        this.ParcelableVolumeInfo = mergejsonobjects3;
        this.PlaybackStateCompat = mergejsonobjects4;
        this.PlaybackStateCompatCustomAction = mergejsonobjects5;
        this.serializer = mergejsonobjects6;
        this.MediaSessionCompatToken = mergejsonobjects7;
        this.RemoteActionCompatParcelizer = getsharedelementtargetnames;
    }

    public isInBackStack(getContentDataType getcontentdatatype, newTransaction newtransaction, SharedPreferencesMigration sharedPreferencesMigration, SimpleExecutableQuery simpleExecutableQuery, onCapabilitiesChanged oncapabilitieschanged, ShouldShowHeatmap_Factory shouldShowHeatmap_Factory, performPushDeliveryFlushlambda0 performpushdeliveryflushlambda0, mergeJsonObjects mergejsonobjects, SharedPreferencesMigration sharedPreferencesMigration2, mergeJsonObjects mergejsonobjects2, mergeJsonObjects mergejsonobjects3, mergeJsonObjects mergejsonobjects4, setPaddingBottom setpaddingbottom, mergeJsonObjects mergejsonobjects5, setStateDescription setstatedescription, com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory) {
        this.MediaBrowserCompatMediaItem = getcontentdatatype;
        this.MediaSessionCompatQueueItem = newtransaction;
        this.RatingCompat = sharedPreferencesMigration;
        this.RemoteActionCompatParcelizer = simpleExecutableQuery;
        this.MediaSessionCompatResultReceiverWrapper = oncapabilitieschanged;
        this.MediaDescriptionCompat = shouldShowHeatmap_Factory;
        this.read = performpushdeliveryflushlambda0;
        this.MediaMetadataCompat = mergejsonobjects;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = sharedPreferencesMigration2;
        this.write = mergejsonobjects2;
        this.ComponentActivity = mergejsonobjects3;
        this.ParcelableVolumeInfo = mergejsonobjects4;
        this.PlaybackStateCompat = setpaddingbottom;
        this.PlaybackStateCompatCustomAction = mergejsonobjects5;
        this.serializer = setstatedescription;
        this.MediaSessionCompatToken = dataModule_ProvideSchedulerFactory;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = ResultReceiver + 47;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        mergeJsonObjects mergejsonobjects = this.MediaSessionCompatToken;
        mergeJsonObjects mergejsonobjects2 = this.serializer;
        mergeJsonObjects mergejsonobjects3 = this.PlaybackStateCompatCustomAction;
        mergeJsonObjects mergejsonobjects4 = this.PlaybackStateCompat;
        mergeJsonObjects mergejsonobjects5 = this.ParcelableVolumeInfo;
        mergeJsonObjects mergejsonobjects6 = this.ComponentActivity;
        mergeJsonObjects mergejsonobjects7 = this.write;
        mergeJsonObjects mergejsonobjects8 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        mergeJsonObjects mergejsonobjects9 = this.MediaMetadataCompat;
        mergeJsonObjects mergejsonobjects10 = this.read;
        mergeJsonObjects mergejsonobjects11 = this.MediaDescriptionCompat;
        mergeJsonObjects mergejsonobjects12 = this.MediaSessionCompatResultReceiverWrapper;
        getColorIntegerOrNulllambda0 getcolorintegerornulllambda0 = this.RemoteActionCompatParcelizer;
        mergeJsonObjects mergejsonobjects13 = this.RatingCompat;
        getColorIntegerOrNulllambda0 getcolorintegerornulllambda1 = this.MediaSessionCompatQueueItem;
        mergeJsonObjects mergejsonobjects14 = this.MediaBrowserCompatMediaItem;
        if (i4 == 0) {
            return new HomeViewModel((getSupportLoaderManager) mergejsonobjects14.write(), (onAttachFragment) mergejsonobjects13.write(), (onEnterLayoutOrScroll) mergejsonobjects12.write(), (setDebugAssertionsEnabled) mergejsonobjects11.write(), (startActivity) mergejsonobjects10.write(), (fastZipWithNext) mergejsonobjects9.write(), (restoreChildFragmentState) mergejsonobjects8.write(), (CallTracer) ((isMenuVisible) getcolorintegerornulllambda1).write(), (NetworkErrorMapperImpl) mergejsonobjects7.write(), new SharedResourcePool(24), (SafeAreaPublisherImpl) mergejsonobjects6.write(), (RecenterMapTriggerImpl) mergejsonobjects5.write(), new WrongFragmentContainerViolation(), (consumeFlingInStretch) mergejsonobjects4.write(), (getConnectivityType) mergejsonobjects3.write(), (transferSessionPackageI) mergejsonobjects2.write(), (getContentViewGroupParentLayout) mergejsonobjects.write(), (CreateHomeScope) ((getSharedElementTargetNames) getcolorintegerornulllambda0).write());
        }
        if (i4 == 1) {
            return new GetAuthStateViewModel((GetUserDataUseCaseImpl) mergejsonobjects14.write(), (GetUserAuthenticationStateUseCaseImpl) mergejsonobjects13.write(), (getInputText) mergejsonobjects12.write(), (IsUserAuthenticatedWrapper) mergejsonobjects11.write(), new getQueryContext(), (getIndexForKey) mergejsonobjects10.write(), (AuthStateMachine) mergejsonobjects9.write(), (RouterLogger) ((ShouldShowHeatmap_Factory) mergejsonobjects).write(), (transferSessionPackageI) mergejsonobjects8.write(), (LoadAbTestConfigUseCase) ((newTransaction) getcolorintegerornulllambda1).write(), (updateActivityStateI) mergejsonobjects7.write(), (getAllSemanticsNodesToMap) mergejsonobjects6.write(), (setApiKeyPresentandroid_sdk_base_release) mergejsonobjects5.write(), (c6) mergejsonobjects4.write(), (subscribeToChangeUserEventslambda2) mergejsonobjects3.write(), (SaveUserPropertiesUseCaseImpl) mergejsonobjects2.write(), (SharedResourcePool) ((SimpleExecutableQuery) getcolorintegerornulllambda0).write());
        }
        RouterViewModel routerViewModel = new RouterViewModel((accessgetOldDependencyp) mergejsonobjects14.write(), (RouterLogger) ((newTransaction) getcolorintegerornulllambda1).write(), (getVersion) mergejsonobjects13.write(), (use) ((SimpleExecutableQuery) getcolorintegerornulllambda0).write(), new logParameters(), new getQueryContext(), new Path$Companion(), (ShouldNavigateToRecruitmentScreenImpl) mergejsonobjects12.write(), (GetBecomeRiderUriImpl) mergejsonobjects11.write(), (SystemLifecycleSystemLifecycleCallback) mergejsonobjects10.write(), (c6) mergejsonobjects9.write(), (access1000) mergejsonobjects8.write(), (SemanticsOwnerKt) mergejsonobjects7.write(), (RemoteConfigStartupTask) mergejsonobjects6.write(), (transferSessionPackageI) mergejsonobjects5.write(), (FetchRemoteConfigUseCaseImpl) mergejsonobjects4.write(), (IncogniaManagerImpl) mergejsonobjects3.write(), (unpackMetaValue) mergejsonobjects2.write(), (getAllSemanticsNodesToMap) mergejsonobjects.write(), new subscribeToChangeUserEventslambda3());
        int i5 = ResultReceiver + 41;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 49 / 0;
        }
        return routerViewModel;
    }
}
