package o;

import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.countdowntimer.CountDownTimerUiModel;
import com.roadrunner.home.nest.data.NestComponentRepositoryImpl;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.login.presentation.forgotpassword.ForgotPasswordPersistedTimerManager;
import com.roadrunner.login.presentation.welcome.WelcomeViewModel;
import com.roadrunner.networking.errormapper.NetworkErrorMapperImpl;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;
import com.roadrunner.web.presentation.WebViewViewModel;
import com.sentiance.core.model.events.N$b;
import com.sentiance.core.model.thrift.k$c;
import io.grpc.internal.SharedResourcePool;

/* JADX INFO: loaded from: classes3.dex */
public final class getModels implements getColorIntegerOrNulllambda0 {
    private static int MediaDescriptionCompat = 0;
    private static int RatingCompat = 1;
    public final mergeJsonObjects IconCompatParcelizer;
    public final mergeJsonObjects MediaBrowserCompatMediaItem;
    public final mergeJsonObjects MediaMetadataCompat;
    public final mergeJsonObjects MediaSessionCompatQueueItem;
    public final mergeJsonObjects RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final mergeJsonObjects serializer;
    public final getColorIntegerOrNulllambda0 write;

    public getModels(PreferenceGroupAdapter preferenceGroupAdapter, mergeJsonObjects mergejsonobjects, setPresentationView setpresentationview, publishErrorlambda1 publisherrorlambda1, getSharedElementTargetNames getsharedelementtargetnames, backgroundTimerFiredI backgroundtimerfiredi, getSharedElementTargetNames getsharedelementtargetnames2) {
        this.read = 0;
        this.write = preferenceGroupAdapter;
        this.MediaSessionCompatQueueItem = mergejsonobjects;
        this.RemoteActionCompatParcelizer = setpresentationview;
        this.serializer = publisherrorlambda1;
        this.IconCompatParcelizer = getsharedelementtargetnames;
        this.MediaMetadataCompat = backgroundtimerfiredi;
        this.MediaBrowserCompatMediaItem = getsharedelementtargetnames2;
    }

    public /* synthetic */ getModels(int i, getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, getColorIntegerOrNulllambda0 getcolorintegerornulllambda1, mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, mergeJsonObjects mergejsonobjects3, mergeJsonObjects mergejsonobjects4, mergeJsonObjects mergejsonobjects5) {
        this.read = i;
        this.write = getcolorintegerornulllambda0;
        this.MediaSessionCompatQueueItem = mergejsonobjects;
        this.RemoteActionCompatParcelizer = mergejsonobjects2;
        this.serializer = mergejsonobjects3;
        this.MediaBrowserCompatMediaItem = getcolorintegerornulllambda1;
        this.IconCompatParcelizer = mergejsonobjects4;
        this.MediaMetadataCompat = mergejsonobjects5;
    }

    public getModels(getContentDataType getcontentdatatype, com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory, acquire acquireVar, readInstallReferrerHuaweiAppGallery readinstallreferrerhuaweiappgallery, SimpleExecutableQuery simpleExecutableQuery, performPushDeliveryFlushlambda0 performpushdeliveryflushlambda0, getDoubleOrNull getdoubleornull) {
        this.read = 2;
        this.MediaSessionCompatQueueItem = getcontentdatatype;
        this.RemoteActionCompatParcelizer = dataModule_ProvideSchedulerFactory;
        this.write = acquireVar;
        this.MediaBrowserCompatMediaItem = readinstallreferrerhuaweiappgallery;
        this.serializer = simpleExecutableQuery;
        this.IconCompatParcelizer = performpushdeliveryflushlambda0;
        this.MediaMetadataCompat = getdoubleornull;
    }

    public getModels(getDataStoreFileName getdatastorefilename, lambdaprocessAndResolveDeeplink15 lambdaprocessandresolvedeeplink15, lambdaprocessAndResolveDeeplink15 lambdaprocessandresolvedeeplink16, lambdaprocessAndResolveDeeplink15 lambdaprocessandresolvedeeplink17, lambdaprocessAndResolveDeeplink15 lambdaprocessandresolvedeeplink18, r8lambdapkx6kfYbgP4lEOWkebovjPb0ug r8lambdapkx6kfybgp4leowkebovjpb0ug, mergeJsonObjects mergejsonobjects) {
        this.read = 3;
        this.write = getdatastorefilename;
        this.RemoteActionCompatParcelizer = lambdaprocessandresolvedeeplink15;
        this.serializer = lambdaprocessandresolvedeeplink16;
        this.IconCompatParcelizer = lambdaprocessandresolvedeeplink17;
        this.MediaMetadataCompat = lambdaprocessandresolvedeeplink18;
        this.MediaBrowserCompatMediaItem = r8lambdapkx6kfybgp4leowkebovjpb0ug;
        this.MediaSessionCompatQueueItem = mergejsonobjects;
    }

    public getModels(mergeJsonObjects mergejsonobjects, lambdaprocessAndResolveDeeplink15 lambdaprocessandresolvedeeplink15, setOrderId setorderid, setOrderId setorderid2, mergeJsonObjects mergejsonobjects2, backgroundTimerFiredI backgroundtimerfiredi, lambdaprocessAndResolveDeeplink15 lambdaprocessandresolvedeeplink16) {
        this.read = 4;
        this.MediaSessionCompatQueueItem = mergejsonobjects;
        this.write = lambdaprocessandresolvedeeplink15;
        this.IconCompatParcelizer = setorderid;
        this.MediaMetadataCompat = setorderid2;
        this.RemoteActionCompatParcelizer = mergejsonobjects2;
        this.serializer = backgroundtimerfiredi;
        this.MediaBrowserCompatMediaItem = lambdaprocessandresolvedeeplink16;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 125;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        mergeJsonObjects mergejsonobjects = this.MediaMetadataCompat;
        mergeJsonObjects mergejsonobjects2 = this.IconCompatParcelizer;
        mergeJsonObjects mergejsonobjects3 = this.MediaBrowserCompatMediaItem;
        mergeJsonObjects mergejsonobjects4 = this.serializer;
        mergeJsonObjects mergejsonobjects5 = this.RemoteActionCompatParcelizer;
        mergeJsonObjects mergejsonobjects6 = this.MediaSessionCompatQueueItem;
        getColorIntegerOrNulllambda0 getcolorintegerornulllambda0 = this.write;
        if (i4 == 0) {
            getRouternavigation_release getrouternavigation_release = new getRouternavigation_release((SignInDataStore) ((PreferenceGroupAdapter) getcolorintegerornulllambda0).write(), (NestComponentRepositoryImpl) mergejsonobjects6.write(), new SharedResourcePool(24), (isOpenInternalroom_runtime) mergejsonobjects5.write(), (GetRiderStatusImpl) mergejsonobjects4.write(), (internalPathIteratorSize) mergejsonobjects2.write(), (NetworkErrorMapperImpl) mergejsonobjects.write(), (attachToRecyclerView) mergejsonobjects3.write());
            int i5 = RatingCompat + 35;
            MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 74 / 0;
            }
            return getrouternavigation_release;
        }
        if (i4 == 1) {
            return new TurbineTimeoutCancellationException((OtpLogger) ((executeQuery) getcolorintegerornulllambda0).write(), (setTransactionSuccessful) mergejsonobjects6.write(), (CountDownTimerUiModel) mergejsonobjects5.write(), (transferSessionPackageI) mergejsonobjects4.write(), (N$b) ((lambda31) mergejsonobjects3).write(), (ForgotPasswordPersistedTimerManager) mergejsonobjects2.write(), (NetworkErrorMapperImpl) mergejsonobjects.write(), new getQueryContext());
        }
        if (i4 == 2) {
            return new WelcomeViewModel((accessgetOldDependencyp) mergejsonobjects6.write(), (boundingRectInRoot) mergejsonobjects5.write(), (QueryResultValue) ((acquire) getcolorintegerornulllambda0).write(), (markCardAsVisuallyRead) ((readInstallReferrerHuaweiAppGallery) mergejsonobjects3).write(), (getBytes) mergejsonobjects4.write(), new getQueryContext(), (SystemLifecycleSystemLifecycleCallback) mergejsonobjects2.write(), (setOfflineMode) mergejsonobjects.write());
        }
        if (i4 != 3) {
            return i4 != 4 ? new WebViewViewModel(new SharedResourcePool(24), (setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release) ((r8lambdans7BYwA6Reyjg6IiZz7pAk0ee8) getcolorintegerornulllambda0).write(), (isOpenInternalroom_runtime) mergejsonobjects6.write(), (transferSessionPackageI) mergejsonobjects5.write(), (setTransactionSuccessful) mergejsonobjects4.write(), (setUdmandroid_sdk_base_release) ((r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8) mergejsonobjects3).write(), (setRegisteredPushToken) mergejsonobjects2.write(), (qdExternalSyntheticLambda8) mergejsonobjects.write()) : new C0169getOrderId((getPivotOffsetF1C5BW0) mergejsonobjects6.write(), (BrazeExternalSyntheticLambda28) ((lambdaprocessAndResolveDeeplink15) getcolorintegerornulllambda0).write(), (ConstraintHelper) ((setOrderId) mergejsonobjects2).write(), (AdjustEventFailure) ((setOrderId) mergejsonobjects).write(), (setTransactionSuccessful) mergejsonobjects5.write(), (NetworkErrorMapperImpl) mergejsonobjects4.write(), (OtpLogger) ((lambdaprocessAndResolveDeeplink15) mergejsonobjects3).write(), new SharedResourcePool(24));
        }
        return new getProcessName((k$c) ((getDataStoreFileName) getcolorintegerornulllambda0).write(), (AdjustConfig) ((lambdaprocessAndResolveDeeplink15) mergejsonobjects5).write(), (GetAppStateImpl) ((lambdaprocessAndResolveDeeplink15) mergejsonobjects4).write(), (AdjustConfig) ((lambdaprocessAndResolveDeeplink15) mergejsonobjects2).write(), (OtpLogger) ((lambdaprocessAndResolveDeeplink15) mergejsonobjects).write(), (GetAppStateImpl) ((r8lambdapkx6kfYbgP4lEOWkebovjPb0ug) mergejsonobjects3).write(), (switchToOfflineMode) mergejsonobjects6.write(), new SharedResourcePool(24));
    }
}
