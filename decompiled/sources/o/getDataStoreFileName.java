package o;

import androidx.lifecycle.BlockRunner$cancel$1;
import com.google.firebase.Timestamp;
import com.google.re2j.Parser;
import com.huawei.location.Vw$Vw;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.auth.domain.CompleteIdentityVerificationUseCaseImpl;
import com.roadrunner.auth.domain.GetUserDataUseCaseImpl;
import com.roadrunner.auth.domain.token.DoesAccessTokenExistUseCaseImpl;
import com.roadrunner.delivery.ontheway.phonecall.UnifiedPhoneCallerImpl;
import com.roadrunner.heatmap.domain.ShouldShowHeatmap_Factory;
import com.roadrunner.liveness.domain.CreateMultipartForLivenessUploadImpl;
import com.roadrunner.liveness.review.presentation.ReviewViewModel;
import com.roadrunner.login.domain.auth.GetRiderNameUseCaseImpl;
import com.roadrunner.login.logging.AuthenticationLogger;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.login.presentation.mapper.ErrorSnackbarMessageMapper;
import com.roadrunner.networking.errormapper.NetworkErrorMapperImpl;
import com.roadrunner.order.history.data.HistoryRepository;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.safety.authentication.domain.GetSentianceAuthCodeUseCase;
import com.roadrunner.rider.safety.authentication.domain.IsSafetyTrackingAllowedUseCase;
import com.roadrunner.rider.safety.sentiance.SentianceGuard;
import com.sentiance.core.model.events.C$b;
import com.sentiance.core.model.events.E$b;
import com.sentiance.core.model.events.H$b;
import com.sentiance.core.model.thrift.O$b;
import com.sentiance.core.model.thrift.k$c;
import io.grpc.internal.SharedResourcePool;
import io.sentry.util.UrlUtils;
import io.sentry.util.network.NetworkBody;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.ContextScope;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class getDataStoreFileName implements getColorIntegerOrNulllambda0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat;
    public final mergeJsonObjects IconCompatParcelizer;
    public final mergeJsonObjects MediaMetadataCompat;
    public final mergeJsonObjects MediaSessionCompatQueueItem;
    public final mergeJsonObjects RemoteActionCompatParcelizer;
    public final mergeJsonObjects read;
    public final mergeJsonObjects serializer;
    public final /* synthetic */ int write;

    public getDataStoreFileName(mergeJsonObjects mergejsonobjects, r8lambda4ctur6dHthQRF8ridJfgtUMxjY0 r8lambda4ctur6dhthqrf8ridjfgtumxjy0, r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8 r8lambdahmuf48geqgedwlhl7mczo1q1bv8, setSdkAuthenticationSignature setsdkauthenticationsignature, isHiddenannotations ishiddenannotations, onMeasureChild onmeasurechild) {
        this.write = 12;
        this.IconCompatParcelizer = mergejsonobjects;
        this.RemoteActionCompatParcelizer = r8lambda4ctur6dhthqrf8ridjfgtumxjy0;
        this.MediaSessionCompatQueueItem = r8lambdahmuf48geqgedwlhl7mczo1q1bv8;
        this.serializer = setsdkauthenticationsignature;
        this.read = ishiddenannotations;
        this.MediaMetadataCompat = onmeasurechild;
    }

    public static getDataStoreFileName write(lambdaprocessAndResolveDeeplink15 lambdaprocessandresolvedeeplink15, acquire acquireVar, r8lambdapkx6kfYbgP4lEOWkebovjPb0ug r8lambdapkx6kfybgp4leowkebovjpb0ug, getFailureMessage getfailuremessage, mergeJsonObjects mergejsonobjects, r8lambdapkx6kfYbgP4lEOWkebovjPb0ug r8lambdapkx6kfybgp4leowkebovjpb0ug2) {
        int i = 2 % 2;
        getDataStoreFileName getdatastorefilename = new getDataStoreFileName(11, r8lambdapkx6kfybgp4leowkebovjpb0ug2, lambdaprocessandresolvedeeplink15, acquireVar, r8lambdapkx6kfybgp4leowkebovjpb0ug, getfailuremessage, mergejsonobjects);
        int i2 = RatingCompat + 107;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 48 / 0;
        }
        return getdatastorefilename;
    }

    public getDataStoreFileName(setStateDescription setstatedescription, setStateDescription setstatedescription2, r8lambdapkx6kfYbgP4lEOWkebovjPb0ug r8lambdapkx6kfybgp4leowkebovjpb0ug, applyLayoutFeatures applylayoutfeatures, acquire acquireVar, setStateDescription setstatedescription3) {
        this.write = 2;
        this.MediaSessionCompatQueueItem = setstatedescription;
        this.MediaMetadataCompat = setstatedescription2;
        this.RemoteActionCompatParcelizer = r8lambdapkx6kfybgp4leowkebovjpb0ug;
        this.serializer = applylayoutfeatures;
        this.read = acquireVar;
        this.IconCompatParcelizer = setstatedescription3;
    }

    public getDataStoreFileName(executeQuery executequery, r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i, acquire acquireVar, getContentDataType getcontentdatatype, r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw, executeQuery executequery2) {
        this.write = 4;
        this.RemoteActionCompatParcelizer = executequery;
        this.IconCompatParcelizer = r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i;
        this.serializer = acquireVar;
        this.MediaSessionCompatQueueItem = getcontentdatatype;
        this.MediaMetadataCompat = r8lambda6uovp7lvejigbq5knkop8a0veiw;
        this.read = executequery2;
    }

    public getDataStoreFileName(newTransaction newtransaction, mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, executeQuery executequery, setPresentationView setpresentationview, onCapabilitiesChanged oncapabilitieschanged) {
        this.write = 0;
        this.IconCompatParcelizer = newtransaction;
        this.MediaSessionCompatQueueItem = mergejsonobjects;
        this.MediaMetadataCompat = mergejsonobjects2;
        this.read = executequery;
        this.RemoteActionCompatParcelizer = setpresentationview;
        this.serializer = oncapabilitieschanged;
    }

    public getDataStoreFileName(mergeJsonObjects mergejsonobjects, ShouldShowHeatmap_Factory shouldShowHeatmap_Factory, executeQuery executequery, lambdaprocessAndResolveDeeplink15 lambdaprocessandresolvedeeplink15, applyLayoutFeatures applylayoutfeatures, backgroundTimerFiredI backgroundtimerfiredi) {
        this.write = 6;
        this.IconCompatParcelizer = mergejsonobjects;
        this.MediaMetadataCompat = shouldShowHeatmap_Factory;
        this.RemoteActionCompatParcelizer = executequery;
        this.serializer = lambdaprocessandresolvedeeplink15;
        this.read = applylayoutfeatures;
        this.MediaSessionCompatQueueItem = backgroundtimerfiredi;
    }

    public getDataStoreFileName(mergeJsonObjects mergejsonobjects, requestSingleLocationUpdatelambda1 requestsinglelocationupdatelambda1, lambdaprocessAndResolveDeeplink15 lambdaprocessandresolvedeeplink15, lambdaprocessAndResolveDeeplink15 lambdaprocessandresolvedeeplink16, lambdaprocessAndResolveDeeplink15 lambdaprocessandresolvedeeplink17, setPresentationView setpresentationview) {
        this.write = 7;
        this.IconCompatParcelizer = mergejsonobjects;
        this.MediaSessionCompatQueueItem = requestsinglelocationupdatelambda1;
        this.RemoteActionCompatParcelizer = lambdaprocessandresolvedeeplink15;
        this.serializer = lambdaprocessandresolvedeeplink16;
        this.read = lambdaprocessandresolvedeeplink17;
        this.MediaMetadataCompat = setpresentationview;
    }

    public /* synthetic */ getDataStoreFileName(int i, getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, mergeJsonObjects mergejsonobjects3, mergeJsonObjects mergejsonobjects4, mergeJsonObjects mergejsonobjects5) {
        this.write = i;
        this.IconCompatParcelizer = mergejsonobjects;
        this.MediaSessionCompatQueueItem = mergejsonobjects2;
        this.MediaMetadataCompat = mergejsonobjects3;
        this.RemoteActionCompatParcelizer = mergejsonobjects4;
        this.serializer = mergejsonobjects5;
        this.read = getcolorintegerornulllambda0;
    }

    public getDataStoreFileName(executeQuery executequery, getDataStoreFileName getdatastorefilename, executeQuery executequery2, backgroundTimerFiredI backgroundtimerfiredi, getVerticalScrollAxisRangedelegate getverticalscrollaxisrangedelegate, executeQuery executequery3) {
        this.write = 5;
        this.MediaMetadataCompat = executequery;
        this.RemoteActionCompatParcelizer = getdatastorefilename;
        this.serializer = executequery2;
        this.IconCompatParcelizer = backgroundtimerfiredi;
        this.MediaSessionCompatQueueItem = getverticalscrollaxisrangedelegate;
        this.read = executequery3;
    }

    public getDataStoreFileName(Timestamp.Companion companion, mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, mergeJsonObjects mergejsonobjects3, mergeJsonObjects mergejsonobjects4, r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy, setPresentationView setpresentationview) {
        this.write = 1;
        this.IconCompatParcelizer = mergejsonobjects;
        this.MediaSessionCompatQueueItem = mergejsonobjects2;
        this.MediaMetadataCompat = mergejsonobjects3;
        this.RemoteActionCompatParcelizer = mergejsonobjects4;
        this.serializer = r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy;
        this.read = setpresentationview;
    }

    public getDataStoreFileName(SimpleExecutableQuery simpleExecutableQuery, lambdaprocessAndResolveDeeplink15 lambdaprocessandresolvedeeplink15, lambda31 lambda31Var, acquire acquireVar, mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2) {
        this.write = 10;
        this.IconCompatParcelizer = simpleExecutableQuery;
        this.serializer = lambdaprocessandresolvedeeplink15;
        this.read = lambda31Var;
        this.MediaSessionCompatQueueItem = acquireVar;
        this.MediaMetadataCompat = mergejsonobjects;
        this.RemoteActionCompatParcelizer = mergejsonobjects2;
    }

    public getDataStoreFileName(r8lambdapkx6kfYbgP4lEOWkebovjPb0ug r8lambdapkx6kfybgp4leowkebovjpb0ug, backgroundTimerFiredI backgroundtimerfiredi, lambdaprocessAndResolveDeeplink15 lambdaprocessandresolvedeeplink15, mergeJsonObjects mergejsonobjects, lambdaprocessAndResolveDeeplink15 lambdaprocessandresolvedeeplink16, onMeasureChild onmeasurechild) {
        this.write = 9;
        this.RemoteActionCompatParcelizer = r8lambdapkx6kfybgp4leowkebovjpb0ug;
        this.IconCompatParcelizer = backgroundtimerfiredi;
        this.serializer = lambdaprocessandresolvedeeplink15;
        this.MediaSessionCompatQueueItem = mergejsonobjects;
        this.read = lambdaprocessandresolvedeeplink16;
        this.MediaMetadataCompat = onmeasurechild;
    }

    public getDataStoreFileName(acquire acquireVar, getDataStoreFileName getdatastorefilename, backgroundTimerFiredI backgroundtimerfiredi, acquire acquireVar2, lambdaprocessAndResolveDeeplink15 lambdaprocessandresolvedeeplink15, acquire acquireVar3) {
        this.write = 8;
        this.MediaSessionCompatQueueItem = acquireVar;
        this.MediaMetadataCompat = getdatastorefilename;
        this.IconCompatParcelizer = backgroundtimerfiredi;
        this.RemoteActionCompatParcelizer = acquireVar2;
        this.serializer = lambdaprocessandresolvedeeplink15;
        this.read = acquireVar3;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = this.write;
        mergeJsonObjects mergejsonobjects = this.MediaMetadataCompat;
        mergeJsonObjects mergejsonobjects2 = this.read;
        mergeJsonObjects mergejsonobjects3 = this.serializer;
        mergeJsonObjects mergejsonobjects4 = this.MediaSessionCompatQueueItem;
        mergeJsonObjects mergejsonobjects5 = this.RemoteActionCompatParcelizer;
        mergeJsonObjects mergejsonobjects6 = this.IconCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        switch (i2) {
            case 0:
                QueryResultCompanion queryResultCompanion = (QueryResultCompanion) mergejsonobjects6.write();
                setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) mergejsonobjects4.write();
                transferSessionPackageI transfersessionpackagei = (transferSessionPackageI) mergejsonobjects.write();
                BrazeExternalSyntheticLambda28 brazeExternalSyntheticLambda28 = (BrazeExternalSyntheticLambda28) ((executeQuery) mergejsonobjects2).write();
                isOpenInternalroom_runtime isopeninternalroom_runtime = (isOpenInternalroom_runtime) mergejsonobjects5.write();
                getBindingAdapter getbindingadapter = (getBindingAdapter) mergejsonobjects3.write();
                queryResultCompanion.getClass();
                settransactionsuccessful.getClass();
                transfersessionpackagei.getClass();
                brazeExternalSyntheticLambda28.getClass();
                isopeninternalroom_runtime.getClass();
                getbindingadapter.getClass();
                androidx.lifecycle.BlockRunner blockRunner = new androidx.lifecycle.BlockRunner();
                blockRunner.read = queryResultCompanion;
                blockRunner.serializer = settransactionsuccessful;
                blockRunner.RatingCompat = transfersessionpackagei;
                blockRunner.write = brazeExternalSyntheticLambda28;
                blockRunner.RemoteActionCompatParcelizer = isopeninternalroom_runtime;
                blockRunner.IconCompatParcelizer = getbindingadapter;
                return blockRunner;
            case 1:
                transferSessionPackageI transfersessionpackagei2 = (transferSessionPackageI) mergejsonobjects6.write();
                getContextClick5zf0vsI getcontextclick5zf0vsi = (getContextClick5zf0vsI) mergejsonobjects4.write();
                getTouchaOaMEAU gettouchaoameau = (getTouchaOaMEAU) mergejsonobjects.write();
                getPivotOffsetF1C5BW0 getpivotoffsetf1c5bw0 = (getPivotOffsetF1C5BW0) mergejsonobjects5.write();
                r8lambdaJfSwS2PRWMpHRIytRV9qwrOw8s r8lambdajfsws2prwmphriytrv9qwrow8s = (r8lambdaJfSwS2PRWMpHRIytRV9qwrOw8s) mergejsonobjects3.write();
                isOpenInternalroom_runtime isopeninternalroom_runtime2 = (isOpenInternalroom_runtime) mergejsonobjects2.write();
                transfersessionpackagei2.getClass();
                getcontextclick5zf0vsi.getClass();
                gettouchaoameau.getClass();
                getpivotoffsetf1c5bw0.getClass();
                r8lambdajfsws2prwmphriytrv9qwrow8s.getClass();
                isopeninternalroom_runtime2.getClass();
                k$c k_c = new k$c();
                k_c.RemoteActionCompatParcelizer = transfersessionpackagei2;
                k_c.write = getcontextclick5zf0vsi;
                k_c.IconCompatParcelizer = gettouchaoameau;
                k_c.read = r8lambdajfsws2prwmphriytrv9qwrow8s;
                ContextScope contextScopeRemoteActionCompatParcelizer = YieldKt.RemoteActionCompatParcelizer(androidx.room.Room.read(UrlUtils.serializer(), prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer));
                k_c.MediaDescriptionCompat = contextScopeRemoteActionCompatParcelizer;
                k_c.serializer = k_c.startTimer();
                if (((FirebaseRemoteConfigImpl) transfersessionpackagei2).IconCompatParcelizer(updateAdidI.IS_GPS_STATE_LISTENER_FOR_LOCATION_UPDATES_ENABLED)) {
                    k_c.MediaSessionCompatQueueItem = BuildersKt.RemoteActionCompatParcelizer(contextScopeRemoteActionCompatParcelizer, null, null, new BlockRunner$cancel$1(k_c, shortNewsContentCardView, 25), 3);
                }
                return k_c;
            case 2:
                setShowingTextSubstitution setshowingtextsubstitution = (setShowingTextSubstitution) ((setStateDescription) mergejsonobjects4).write();
                setTextSubstitutiondefault settextsubstitutiondefault = (setTextSubstitutiondefault) ((setStateDescription) mergejsonobjects).write();
                AnalyticsServiceImpl analyticsServiceImpl = (AnalyticsServiceImpl) ((r8lambdapkx6kfYbgP4lEOWkebovjPb0ug) mergejsonobjects5).write();
                SignInDataStore signInDataStore = (SignInDataStore) ((applyLayoutFeatures) mergejsonobjects3).write();
                H$b h$b = (H$b) ((acquire) mergejsonobjects2).write();
                setSensitiveData setsensitivedata = (setSensitiveData) mergejsonobjects6.write();
                setshowingtextsubstitution.getClass();
                settextsubstitutiondefault.getClass();
                analyticsServiceImpl.getClass();
                signInDataStore.getClass();
                h$b.getClass();
                setsensitivedata.getClass();
                androidx.lifecycle.BlockRunner blockRunner2 = new androidx.lifecycle.BlockRunner();
                blockRunner2.read = setshowingtextsubstitution;
                blockRunner2.serializer = settextsubstitutiondefault;
                blockRunner2.RatingCompat = analyticsServiceImpl;
                blockRunner2.write = signInDataStore;
                blockRunner2.RemoteActionCompatParcelizer = h$b;
                blockRunner2.IconCompatParcelizer = setsensitivedata;
                return blockRunner2;
            case 3:
                return new E$b((Vw$Vw) ((readInstallReferrerHuaweiAppGallery) mergejsonobjects6).write(), (SignInDataStore) ((readInstallReferrerHuaweiAppGallery) mergejsonobjects4).write(), new com.huawei.wisesecurity.ucs_credential.n0(0), (H$b) ((readInstallReferrerHuaweiAppGallery) mergejsonobjects).write(), (com.huawei.agconnect.config.impl.m) ((readInstallReferrerHuaweiAppGallery) mergejsonobjects5).write(), (androidx.lifecycle.BlockRunner) ((r8lambdamcfkChlmwyb5a6y_ZoPzJd5UQ4) mergejsonobjects3).write(), (Parser.Pair) ((readInstallReferrerHuaweiAppGallery) mergejsonobjects2).write());
            case 4:
                setDistanceToTriggerSync setdistancetotriggersync = (setDistanceToTriggerSync) ((executeQuery) mergejsonobjects5).write();
                CreateMultipartForLivenessUploadImpl createMultipartForLivenessUploadImpl = (CreateMultipartForLivenessUploadImpl) mergejsonobjects6.write();
                com.huawei.agconnect.config.impl.m mVar = (com.huawei.agconnect.config.impl.m) ((acquire) mergejsonobjects3).write();
                DoesAccessTokenExistUseCaseImpl doesAccessTokenExistUseCaseImpl = (DoesAccessTokenExistUseCaseImpl) mergejsonobjects4.write();
                GetUserDataUseCaseImpl getUserDataUseCaseImpl = (GetUserDataUseCaseImpl) mergejsonobjects.write();
                accessstartTrackingTable accessstarttrackingtable = (accessstartTrackingTable) ((executeQuery) mergejsonobjects2).write();
                setdistancetotriggersync.getClass();
                createMultipartForLivenessUploadImpl.getClass();
                mVar.getClass();
                doesAccessTokenExistUseCaseImpl.getClass();
                getUserDataUseCaseImpl.getClass();
                accessstarttrackingtable.getClass();
                androidx.lifecycle.BlockRunner blockRunner3 = new androidx.lifecycle.BlockRunner();
                blockRunner3.read = setdistancetotriggersync;
                blockRunner3.serializer = createMultipartForLivenessUploadImpl;
                blockRunner3.RatingCompat = mVar;
                blockRunner3.write = doesAccessTokenExistUseCaseImpl;
                blockRunner3.RemoteActionCompatParcelizer = getUserDataUseCaseImpl;
                blockRunner3.IconCompatParcelizer = accessstarttrackingtable;
                int i3 = MediaBrowserCompatMediaItem + 61;
                RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    return blockRunner3;
                }
                throw null;
            case 5:
                return new ReviewViewModel((BrazeExternalSyntheticLambda28) ((executeQuery) mergejsonobjects).write(), (androidx.lifecycle.BlockRunner) ((getDataStoreFileName) mergejsonobjects5).write(), (OtpLogger) ((executeQuery) mergejsonobjects3).write(), (NetworkErrorMapperImpl) mergejsonobjects6.write(), (CompleteIdentityVerificationUseCaseImpl) mergejsonobjects4.write(), (setDistanceToTriggerSync) ((executeQuery) mergejsonobjects2).write(), new getQueryContext());
            case 6:
                ErrorSnackbarMessageMapper errorSnackbarMessageMapper = new ErrorSnackbarMessageMapper((setTransactionSuccessful) mergejsonobjects6.write(), (SemanticsInfoKt) ((ShouldShowHeatmap_Factory) mergejsonobjects).write(), (a9) ((executeQuery) mergejsonobjects5).write(), (bg) ((lambdaprocessAndResolveDeeplink15) mergejsonobjects3).write(), (AuthenticationLogger) ((applyLayoutFeatures) mergejsonobjects2).write(), (NetworkErrorMapperImpl) mergejsonobjects4.write());
                int i4 = MediaBrowserCompatMediaItem + 67;
                RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return errorSnackbarMessageMapper;
                }
                shortNewsContentCardView.hashCode();
                throw null;
            case 7:
                HistoryRepository historyRepository = (HistoryRepository) mergejsonobjects6.write();
                r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8 r8lambda4txk7kovp_j84hgvzl3zo6mzli8 = (r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8) mergejsonobjects4.write();
                unpackInt2 unpackint2 = (unpackInt2) ((lambdaprocessAndResolveDeeplink15) mergejsonobjects5).write();
                accesshandleMapNotFound accesshandlemapnotfound = (accesshandleMapNotFound) ((lambdaprocessAndResolveDeeplink15) mergejsonobjects3).write();
                unpackInt2 unpackint3 = (unpackInt2) ((lambdaprocessAndResolveDeeplink15) mergejsonobjects2).write();
                isOpenInternalroom_runtime isopeninternalroom_runtime3 = (isOpenInternalroom_runtime) mergejsonobjects.write();
                historyRepository.getClass();
                r8lambda4txk7kovp_j84hgvzl3zo6mzli8.getClass();
                unpackint2.getClass();
                accesshandlemapnotfound.getClass();
                unpackint3.getClass();
                isopeninternalroom_runtime3.getClass();
                androidx.lifecycle.BlockRunner blockRunner4 = new androidx.lifecycle.BlockRunner();
                blockRunner4.read = historyRepository;
                blockRunner4.serializer = r8lambda4txk7kovp_j84hgvzl3zo6mzli8;
                blockRunner4.RatingCompat = unpackint2;
                blockRunner4.write = accesshandlemapnotfound;
                blockRunner4.RemoteActionCompatParcelizer = unpackint3;
                blockRunner4.IconCompatParcelizer = isopeninternalroom_runtime3;
                return blockRunner4;
            case 8:
                return new ExtrasKt((subscribeToBannersDismissedEventandroid_sdk_base_release) ((acquire) mergejsonobjects4).write(), (androidx.lifecycle.BlockRunner) ((getDataStoreFileName) mergejsonobjects).write(), (NetworkErrorMapperImpl) mergejsonobjects6.write(), (Parser.Pair) ((acquire) mergejsonobjects5).write(), (BrazeExternalSyntheticLambda28) ((lambdaprocessAndResolveDeeplink15) mergejsonobjects3).write(), (FormBody.Builder) ((acquire) mergejsonobjects2).write(), new SharedResourcePool(24), new SharedResourcePool(24), new SharedResourcePool(24));
            case 9:
                return new shouldProcessEventI((GetAppStateImpl) ((r8lambdapkx6kfYbgP4lEOWkebovjPb0ug) mergejsonobjects5).write(), (NetworkErrorMapperImpl) mergejsonobjects6.write(), (a9) ((lambdaprocessAndResolveDeeplink15) mergejsonobjects3).write(), new stopInstancelambda11(5), (setTransactionSuccessful) mergejsonobjects4.write(), new getQueryContext(), (FormBody.Builder) ((lambdaprocessAndResolveDeeplink15) mergejsonobjects2).write(), (UnifiedPhoneCallerImpl) mergejsonobjects.write());
            case 10:
                GetRiderNameUseCaseImpl getRiderNameUseCaseImpl = (GetRiderNameUseCaseImpl) mergejsonobjects6.write();
                AdjustConfig adjustConfig = (AdjustConfig) ((lambdaprocessAndResolveDeeplink15) mergejsonobjects3).write();
                C$b c$b = (C$b) ((lambda31) mergejsonobjects2).write();
                BrazeExternalSyntheticLambda5 brazeExternalSyntheticLambda5 = (BrazeExternalSyntheticLambda5) getAppToken.write.write();
                GetAppStateImpl getAppStateImpl = (GetAppStateImpl) checkContext.write.write();
                IsSafetyTrackingAllowedUseCase isSafetyTrackingAllowedUseCase = (IsSafetyTrackingAllowedUseCase) mergejsonobjects4.write();
                transferSessionPackageI transfersessionpackagei3 = (transferSessionPackageI) mergejsonobjects.write();
                switchToOfflineMode switchtoofflinemode = (switchToOfflineMode) mergejsonobjects5.write();
                getRiderNameUseCaseImpl.getClass();
                adjustConfig.getClass();
                c$b.getClass();
                brazeExternalSyntheticLambda5.getClass();
                getAppStateImpl.getClass();
                isSafetyTrackingAllowedUseCase.getClass();
                transfersessionpackagei3.getClass();
                switchtoofflinemode.getClass();
                k$c k_c2 = new k$c();
                k_c2.RemoteActionCompatParcelizer = getRiderNameUseCaseImpl;
                k_c2.write = adjustConfig;
                k_c2.IconCompatParcelizer = c$b;
                k_c2.read = brazeExternalSyntheticLambda5;
                k_c2.serializer = getAppStateImpl;
                k_c2.MediaBrowserCompatMediaItem = isSafetyTrackingAllowedUseCase;
                k_c2.MediaSessionCompatQueueItem = transfersessionpackagei3;
                k_c2.MediaDescriptionCompat = switchtoofflinemode;
                return k_c2;
            case 11:
                return new SentianceGuard((setOnEventTrackingFailedListener) mergejsonobjects6.write(), (isPreinstallTrackingEnabled) mergejsonobjects4.write(), (GetSentianceAuthCodeUseCase) mergejsonobjects.write(), (getFirstErrorCode) mergejsonobjects5.write(), (transferSessionPackageI) mergejsonobjects3.write(), (NetworkBody) ((r8lambdapkx6kfYbgP4lEOWkebovjPb0ug) mergejsonobjects2).write());
            default:
                r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94 r8lambdawf0f8_ok6qhelc2navzsyrule94 = new r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94((setTransactionSuccessful) mergejsonobjects6.write(), (O$b) ((r8lambda4ctur6dHthQRF8ridJfgtUMxjY0) mergejsonobjects5).write(), (r8lambdaH04qYyeOzRXd4CFrSTNkPB99_Ds) mergejsonobjects4.write(), (NetworkBody) ((setSdkAuthenticationSignature) mergejsonobjects3).write(), (r8lambdaXx663dmZF6jhFpjZqVMZK8YZwns) ((isHiddenannotations) mergejsonobjects2).write(), new getQueryContext(), (accessgetProportionalcp) mergejsonobjects.write());
                int i5 = RatingCompat + 1;
                MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return r8lambdawf0f8_ok6qhelc2navzsyrule94;
        }
    }
}
