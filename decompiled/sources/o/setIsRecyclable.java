package o;

import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.common.data.api.MapApiError;
import com.roadrunner.customerchat.legacy.core.manager.CustomerChatManagerImpl;
import com.roadrunner.customerchat.legacy.core.manager.CustomerChatProviderImpl;
import com.roadrunner.customerchat.legacy.core.manager.CustomerChatRepository;
import com.roadrunner.customerchat.selfservice.domain.ChatUrlProviderImpl;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl;
import com.roadrunner.customerchat.selfservice.presentation.WebViewManager;
import com.roadrunner.instant.shifts.presentation.GetInstantShiftUiState;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.opportunities.data.OpportunitiesRepository;
import com.roadrunner.password_rules.PopulatePasswordRulesUseCaseImpl;
import com.roadrunner.rider.recruitment.accountcreation.analytics.AccountCreationLogger;
import com.roadrunner.rider.recruitment.accountcreation.password_creation.presentation.PasswordCreationViewModel;
import com.roadrunner.rider.recruitment.accountcreation.presentation.SnackBarErrorMapper;
import com.roadrunner.rider.state.domain.GetStatusUseCaseImpl;
import com.sentiance.core.model.events.C$b;
import com.sentiance.core.model.events.i$c;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class setIsRecyclable implements getColorIntegerOrNulllambda0 {
    private static int ParcelableVolumeInfo = 1;
    private static int PlaybackStateCompat;
    public final mergeJsonObjects IconCompatParcelizer;
    public final mergeJsonObjects MediaBrowserCompatMediaItem;
    public final mergeJsonObjects MediaDescriptionCompat;
    public final mergeJsonObjects MediaMetadataCompat;
    public final mergeJsonObjects MediaSessionCompatQueueItem;
    public final mergeJsonObjects PlaybackStateCompatCustomAction;
    public final mergeJsonObjects RatingCompat;
    public final mergeJsonObjects RemoteActionCompatParcelizer;
    public final mergeJsonObjects read;
    public final /* synthetic */ int serializer = 3;
    public final mergeJsonObjects write;

    public setIsRecyclable(r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw, supportPostponeEnterTransition supportpostponeentertransition, mergeJsonObjects mergejsonobjects, setStateDescription setstatedescription, fastMergej5T8yCg fastmergej5t8ycg, r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw2, mergeJsonObjects mergejsonobjects2, isMenuVisible ismenuvisible, SemanticsPropertiesLinkTestMarker1 semanticsPropertiesLinkTestMarker1, setPresentationView setpresentationview) {
        this.IconCompatParcelizer = r8lambda6uovp7lvejigbq5knkop8a0veiw;
        this.MediaMetadataCompat = supportpostponeentertransition;
        this.MediaSessionCompatQueueItem = mergejsonobjects;
        this.RatingCompat = setstatedescription;
        this.MediaDescriptionCompat = fastmergej5t8ycg;
        this.MediaBrowserCompatMediaItem = r8lambda6uovp7lvejigbq5knkop8a0veiw2;
        this.RemoteActionCompatParcelizer = mergejsonobjects2;
        this.read = ismenuvisible;
        this.write = semanticsPropertiesLinkTestMarker1;
        this.PlaybackStateCompatCustomAction = setpresentationview;
    }

    public setIsRecyclable(subscribeToFeatureFlagsUpdateslambda0 subscribetofeatureflagsupdateslambda0, getSharedElementTargetNames getsharedelementtargetnames, accessgetTextBottomcp accessgettextbottomcp, mergeJsonObjects mergejsonobjects, q0 q0Var, newTransaction newtransaction, newTransaction newtransaction2, mergeJsonObjects mergejsonobjects2, mergeJsonObjects mergejsonobjects3, BrazeExternalSyntheticLambda102 brazeExternalSyntheticLambda102) {
        this.IconCompatParcelizer = subscribetofeatureflagsupdateslambda0;
        this.read = getsharedelementtargetnames;
        this.write = accessgettextbottomcp;
        this.MediaMetadataCompat = mergejsonobjects;
        this.PlaybackStateCompatCustomAction = q0Var;
        this.MediaSessionCompatQueueItem = newtransaction;
        this.RatingCompat = newtransaction2;
        this.MediaDescriptionCompat = mergejsonobjects2;
        this.MediaBrowserCompatMediaItem = mergejsonobjects3;
        this.RemoteActionCompatParcelizer = brazeExternalSyntheticLambda102;
    }

    public setIsRecyclable(isMainThread ismainthread, mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, mergeJsonObjects mergejsonobjects3, mergeJsonObjects mergejsonobjects4, mergeJsonObjects mergejsonobjects5, mergeJsonObjects mergejsonobjects6, setStateDescription setstatedescription, mergeJsonObjects mergejsonobjects7, SharedPreferencesMigration sharedPreferencesMigration, invokeqtAw6s invokeqtaw6s) {
        this.IconCompatParcelizer = mergejsonobjects;
        this.MediaMetadataCompat = mergejsonobjects2;
        this.MediaSessionCompatQueueItem = mergejsonobjects3;
        this.RatingCompat = mergejsonobjects4;
        this.MediaDescriptionCompat = mergejsonobjects5;
        this.MediaBrowserCompatMediaItem = mergejsonobjects6;
        this.RemoteActionCompatParcelizer = setstatedescription;
        this.read = mergejsonobjects7;
        this.write = sharedPreferencesMigration;
        this.PlaybackStateCompatCustomAction = invokeqtaw6s;
    }

    public setIsRecyclable(r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy, com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory, mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, requestGeofencesInitializationlambda1 requestgeofencesinitializationlambda1, newTransaction newtransaction, indexForKey indexforkey, requestGeofencesInitializationlambda1 requestgeofencesinitializationlambda2, r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy2, requestSingleLocationUpdatelambda1 requestsinglelocationupdatelambda1) {
        this.IconCompatParcelizer = r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy;
        this.MediaMetadataCompat = dataModule_ProvideSchedulerFactory;
        this.MediaSessionCompatQueueItem = mergejsonobjects;
        this.RatingCompat = mergejsonobjects2;
        this.read = requestgeofencesinitializationlambda1;
        this.MediaDescriptionCompat = newtransaction;
        this.write = indexforkey;
        this.MediaBrowserCompatMediaItem = requestgeofencesinitializationlambda2;
        this.RemoteActionCompatParcelizer = r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy2;
        this.PlaybackStateCompatCustomAction = requestsinglelocationupdatelambda1;
    }

    public setIsRecyclable(AbsSavedState absSavedState, getAnimatedVisibilityStatecc2g1to getanimatedvisibilitystatecc2g1to, getAnimatedVisibilityStatecc2g1to getanimatedvisibilitystatecc2g1to2, internalPathIteratorRawSize internalpathiteratorrawsize, SingleProcessDataStore singleProcessDataStore, getBrushSizeVsRJwc0ui_text getbrushsizevsrjwc0ui_text, internalPathIteratorRawSize internalpathiteratorrawsize2, internalPathIteratorRawSize internalpathiteratorrawsize3, internalPathIteratorRawSize internalpathiteratorrawsize4, mergeJsonObjects mergejsonobjects) {
        this.IconCompatParcelizer = absSavedState;
        this.MediaMetadataCompat = getanimatedvisibilitystatecc2g1to;
        this.MediaSessionCompatQueueItem = getanimatedvisibilitystatecc2g1to2;
        this.MediaDescriptionCompat = internalpathiteratorrawsize;
        this.MediaBrowserCompatMediaItem = singleProcessDataStore;
        this.RemoteActionCompatParcelizer = getbrushsizevsrjwc0ui_text;
        this.read = internalpathiteratorrawsize2;
        this.write = internalpathiteratorrawsize3;
        this.PlaybackStateCompatCustomAction = internalpathiteratorrawsize4;
        this.RatingCompat = mergejsonobjects;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 103;
        PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        mergeJsonObjects mergejsonobjects = this.PlaybackStateCompatCustomAction;
        mergeJsonObjects mergejsonobjects2 = this.RemoteActionCompatParcelizer;
        mergeJsonObjects mergejsonobjects3 = this.MediaBrowserCompatMediaItem;
        mergeJsonObjects mergejsonobjects4 = this.write;
        mergeJsonObjects mergejsonobjects5 = this.MediaDescriptionCompat;
        mergeJsonObjects mergejsonobjects6 = this.read;
        mergeJsonObjects mergejsonobjects7 = this.RatingCompat;
        mergeJsonObjects mergejsonobjects8 = this.MediaSessionCompatQueueItem;
        mergeJsonObjects mergejsonobjects9 = this.MediaMetadataCompat;
        mergeJsonObjects mergejsonobjects10 = this.IconCompatParcelizer;
        if (i4 == 0) {
            return new GetInstantShiftUiState((GetStatusUseCaseImpl) mergejsonobjects10.write(), (RouterLogger) ((getSharedElementTargetNames) mergejsonobjects6).write(), (syncroom_runtime) ((accessgetTextBottomcp) mergejsonobjects4).write(), (setTransactionSuccessful) mergejsonobjects9.write(), (RouterLogger) ((q0) mergejsonobjects).write(), (v9) mergejsonobjects8.write(), (va) mergejsonobjects7.write(), (OpportunitiesRepository) mergejsonobjects5.write(), (vg) mergejsonobjects3.write(), (readFileContent) mergejsonobjects2.write());
        }
        if (i4 != 1) {
            if (i4 != 2) {
                return i4 != 3 ? new PasswordCreationViewModel((PopulatePasswordRulesUseCaseImpl) mergejsonobjects10.write(), (unpackY) mergejsonobjects9.write(), (transferSessionPackageI) mergejsonobjects8.write(), (setTransactionSuccessful) mergejsonobjects7.write(), new getSdkEnablementProviderandroid_sdk_base_release(4), (C$b) ((requestGeofencesInitializationlambda1) mergejsonobjects6).write(), (SnackBarErrorMapper) mergejsonobjects5.write(), (i$c) ((indexForKey) mergejsonobjects4).write(), (setPlayStoreKidsComplianceInDelay) mergejsonobjects3.write(), (AccountCreationLogger) mergejsonobjects2.write(), (OtpLogger) ((requestSingleLocationUpdatelambda1) mergejsonobjects).write(), new getQueryContext()) : new i2(new isMainThread(8), (hasBounds) mergejsonobjects10.write(), new AndroidUiFrameClock(), (getAnimatedProperties) mergejsonobjects9.write(), (getTransitions) mergejsonobjects8.write(), new ImageHeaderParserImageType(), (isMainThread) ((internalPathIteratorRawSize) mergejsonobjects5).write(), new Path$Companion(), (timesYEO4UFw) ((SingleProcessDataStore) mergejsonobjects3).write(), (RouterLogger) ((getBrushSizeVsRJwc0ui_text) mergejsonobjects2).write(), (RouterLogger) ((internalPathIteratorRawSize) mergejsonobjects6).write(), (ProtobufEncoder) ((internalPathIteratorRawSize) mergejsonobjects4).write(), (RouterLogger) ((internalPathIteratorRawSize) mergejsonobjects).write(), (createAnimation) mergejsonobjects7.write());
            }
            return new WebViewManager((accessisSetgyyYBs) mergejsonobjects10.write(), (ChatUrlProviderImpl) mergejsonobjects9.write(), (addBulletr9BaKPg) mergejsonobjects8.write(), (registerOnChangedCallback) mergejsonobjects7.write(), (ParagraphUl8oQg4) mergejsonobjects5.write(), (SelfServiceCustomerChatRepositoryImpl) mergejsonobjects3.write(), (getHasStaleResolvedFonts) mergejsonobjects2.write(), (ignorableWhitespace) ((isMenuVisible) mergejsonobjects6).write(), (toAnnotatedStringdefault) mergejsonobjects4.write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
        }
        getPivotOffsetF1C5BW0 getpivotoffsetf1c5bw0 = (getPivotOffsetF1C5BW0) mergejsonobjects10.write();
        CustomerChatManagerImpl customerChatManagerImpl = (CustomerChatManagerImpl) mergejsonobjects9.write();
        roundDownToMultipleOf8 rounddowntomultipleof8 = (roundDownToMultipleOf8) mergejsonobjects8.write();
        CustomerChatRepository customerChatRepository = (CustomerChatRepository) mergejsonobjects7.write();
        getScreenOffsetnOccac getscreenoffsetnoccac = (getScreenOffsetnOccac) mergejsonobjects5.write();
        setVerticalStyle setverticalstyle = (setVerticalStyle) mergejsonobjects3.write();
        MapApiError mapApiError = new MapApiError();
        setViewToWindowMatrixQ8lPUPs setviewtowindowmatrixq8lpups = (setViewToWindowMatrixQ8lPUPs) mergejsonobjects2.write();
        getTextIndent gettextindent = (getTextIndent) mergejsonobjects6.write();
        ParagraphInfo paragraphInfo = (ParagraphInfo) mergejsonobjects4.write();
        InitializeAppStartupItemsImpl initializeAppStartupItemsImpl = (InitializeAppStartupItemsImpl) ((invokeqtAw6s) mergejsonobjects).write();
        getpivotoffsetf1c5bw0.getClass();
        customerChatManagerImpl.getClass();
        rounddowntomultipleof8.getClass();
        customerChatRepository.getClass();
        getscreenoffsetnoccac.getClass();
        setverticalstyle.getClass();
        setviewtowindowmatrixq8lpups.getClass();
        gettextindent.getClass();
        paragraphInfo.getClass();
        CustomerChatProviderImpl customerChatProviderImpl = new CustomerChatProviderImpl(getpivotoffsetf1c5bw0, customerChatManagerImpl, rounddowntomultipleof8, customerChatRepository, getscreenoffsetnoccac, setverticalstyle, mapApiError, setviewtowindowmatrixq8lpups, paragraphInfo, initializeAppStartupItemsImpl, gettextindent);
        int i5 = PlaybackStateCompat + 53;
        ParcelableVolumeInfo = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return customerChatProviderImpl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
