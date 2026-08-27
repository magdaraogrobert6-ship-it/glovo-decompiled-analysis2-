package o;

import com.roadrunner.auth.data.AuthRepository;
import com.roadrunner.auth.domain.SaveAuthDataUseCase;
import com.roadrunner.auth.domain.magiclink.VerifyMagicLinkUseCaseImpl;
import com.roadrunner.customerchat.legacy.core.manager.CustomerChatManagerImpl;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl;
import com.roadrunner.customerchat.selfservice.presentation.WebViewManager;
import com.roadrunner.incognia.implementation.IncogniaManagerImpl;
import com.roadrunner.logger.info.AppEventInfoChangeHandler;
import com.roadrunner.remoteconfig.firebase.FetchRemoteConfigUseCaseImpl;
import com.roadrunner.rider.state.provider.data.model.FetchRiderStatusImpl;
import dagger.Lazy;

/* JADX INFO: loaded from: classes3.dex */
public final class isShowingTextSubstitutiondelegate implements getColorIntegerOrNulllambda0 {
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    private static int PlaybackStateCompat;
    public final mergeJsonObjects IconCompatParcelizer;
    public final mergeJsonObjects MediaBrowserCompatMediaItem;
    public final mergeJsonObjects MediaDescriptionCompat;
    public final mergeJsonObjects MediaMetadataCompat;
    public final mergeJsonObjects MediaSessionCompatQueueItem;
    public final mergeJsonObjects MediaSessionCompatToken;
    public final mergeJsonObjects RatingCompat;
    public final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    public final mergeJsonObjects read;
    public final mergeJsonObjects serializer;
    public final mergeJsonObjects write;

    public isShowingTextSubstitutiondelegate(com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory, convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0, getContentDataType getcontentdatatype, getContentDataType getcontentdatatype2, lambdaverifyPlayStorePurchase45 lambdaverifyplaystorepurchase45, getContentDataType getcontentdatatype3, convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda1, setPaddingBottom setpaddingbottom, mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2) {
        this.RatingCompat = dataModule_ProvideSchedulerFactory;
        this.write = convertstringjsonarraytolistlambda0;
        this.MediaSessionCompatToken = getcontentdatatype;
        this.MediaMetadataCompat = getcontentdatatype2;
        this.serializer = lambdaverifyplaystorepurchase45;
        this.MediaDescriptionCompat = getcontentdatatype3;
        this.IconCompatParcelizer = convertstringjsonarraytolistlambda1;
        this.read = setpaddingbottom;
        this.MediaSessionCompatQueueItem = mergejsonobjects;
        this.MediaBrowserCompatMediaItem = mergejsonobjects2;
    }

    public isShowingTextSubstitutiondelegate(isMainThread ismainthread, mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory, r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw, SimpleExecutableQuery simpleExecutableQuery, mergeJsonObjects mergejsonobjects3, r8lambdaZcilDVoiQYR1yQsOxhHduSfdjyw r8lambdazcildvoiqyr1yqsoxhhdusfdjyw, mergeJsonObjects mergejsonobjects4, r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw2, mergeJsonObjects mergejsonobjects5) {
        this.RatingCompat = mergejsonobjects;
        this.write = mergejsonobjects2;
        this.MediaSessionCompatToken = dataModule_ProvideSchedulerFactory;
        this.MediaMetadataCompat = r8lambda6uovp7lvejigbq5knkop8a0veiw;
        this.serializer = simpleExecutableQuery;
        this.MediaDescriptionCompat = mergejsonobjects3;
        this.IconCompatParcelizer = r8lambdazcildvoiqyr1yqsoxhhdusfdjyw;
        this.read = mergejsonobjects4;
        this.MediaSessionCompatQueueItem = r8lambda6uovp7lvejigbq5knkop8a0veiw2;
        this.MediaBrowserCompatMediaItem = mergejsonobjects5;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 83;
        PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        mergeJsonObjects mergejsonobjects = this.MediaBrowserCompatMediaItem;
        mergeJsonObjects mergejsonobjects2 = this.MediaSessionCompatQueueItem;
        mergeJsonObjects mergejsonobjects3 = this.read;
        mergeJsonObjects mergejsonobjects4 = this.IconCompatParcelizer;
        mergeJsonObjects mergejsonobjects5 = this.MediaDescriptionCompat;
        mergeJsonObjects mergejsonobjects6 = this.serializer;
        mergeJsonObjects mergejsonobjects7 = this.MediaMetadataCompat;
        mergeJsonObjects mergejsonobjects8 = this.MediaSessionCompatToken;
        mergeJsonObjects mergejsonobjects9 = this.write;
        mergeJsonObjects mergejsonobjects10 = this.RatingCompat;
        if (i4 == 0) {
            return new VerifyMagicLinkUseCaseImpl((boundingRectInRoot) mergejsonobjects10.write(), (com.huawei.wisesecurity.ucs_credential.p0) isTraversalGroup.read.write(), (AuthRepository) mergejsonobjects9.write(), (SaveAuthDataUseCase) mergejsonobjects8.write(), (getCustomActionsdelegate) mergejsonobjects7.write(), (FetchRiderStatusImpl) mergejsonobjects6.write(), (getDisabled) mergejsonobjects5.write(), (AppEventInfoChangeHandler) mergejsonobjects4.write(), (FetchRemoteConfigUseCaseImpl) mergejsonobjects3.write(), (IncogniaManagerImpl) mergejsonobjects2.write(), (transferSessionPackageI) mergejsonobjects.write());
        }
        Lazy lazySerializer = getColorIntegerOrNull.serializer(mergejsonobjects10);
        transferSessionPackageI transfersessionpackagei = (transferSessionPackageI) mergejsonobjects9.write();
        registerOnGlobalLayoutCallback registerongloballayoutcallback = (registerOnGlobalLayoutCallback) mergejsonobjects8.write();
        accessisSetgyyYBs accessissetgyyybs = (accessisSetgyyYBs) mergejsonobjects7.write();
        transactionsuspendImpl transactionsuspendimpl = (transactionsuspendImpl) mergejsonobjects6.write();
        WebViewManager webViewManager = (WebViewManager) mergejsonobjects5.write();
        setMinDebounceDeadline setmindebouncedeadline = (setMinDebounceDeadline) mergejsonobjects4.write();
        getAnnotatedString getannotatedstring = (getAnnotatedString) mergejsonobjects3.write();
        SelfServiceCustomerChatRepositoryImpl selfServiceCustomerChatRepositoryImpl = (SelfServiceCustomerChatRepositoryImpl) mergejsonobjects2.write();
        getTextIndent gettextindent = (getTextIndent) mergejsonobjects.write();
        lazySerializer.getClass();
        transfersessionpackagei.getClass();
        registerongloballayoutcallback.getClass();
        accessissetgyyybs.getClass();
        transactionsuspendimpl.getClass();
        webViewManager.getClass();
        setmindebouncedeadline.getClass();
        getannotatedstring.getClass();
        selfServiceCustomerChatRepositoryImpl.getClass();
        gettextindent.getClass();
        CustomerChatManagerImpl customerChatManagerImpl = new CustomerChatManagerImpl(lazySerializer, transfersessionpackagei, registerongloballayoutcallback, accessissetgyyybs, transactionsuspendimpl, webViewManager, setmindebouncedeadline, getannotatedstring, selfServiceCustomerChatRepositoryImpl, gettextindent);
        int i5 = MediaSessionCompatResultReceiverWrapper + 3;
        PlaybackStateCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 63 / 0;
        }
        return customerChatManagerImpl;
    }
}
