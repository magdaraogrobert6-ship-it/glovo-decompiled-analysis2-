package o;

import com.foodora.courier.app.application.CourierApplication;
import com.foodora.courier.push.messages.domain.HandlePushMessageUseCase;
import com.google.android.play.core.appupdate.zzz;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.auth.domain.GetUserDataUseCaseImpl;
import com.roadrunner.auth.domain.VerifyTwoFaUseCaseImpl;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.customerchat.selfservice.data.cache.ChatIdCacheHelper;
import com.roadrunner.customerchat.selfservice.data.remote.HelpCenterRemoteDataSourceImpl;
import com.roadrunner.customerchat.selfservice.domain.usecase.GetChatAssetDownloadConfig;
import com.roadrunner.customerchat.usecase.TriggerChatAssetsDownloading;
import com.roadrunner.delivery.apis.ChatDeliveryRepositoryImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository;
import com.roadrunner.freelancing.domain.GetWorkNowOpportunity;
import com.roadrunner.location.toggle.domain.CanRequestLocationUpdatesImpl;
import com.roadrunner.opportunities.data.OpportunitiesRepository;
import com.roadrunner.opportunities.domain.IsRiderInsideActiveAreaBoundaryImpl;
import com.roadrunner.rider.state.domain.GetRiderStateImpl;
import com.roadrunner.twofa.data.repo.TwoFaRepository;
import com.roadrunner.twofa.presentation.TwoFaViewModel;
import com.sentiance.okhttp3.internal.http2.e$h;
import io.grpc.CallOptions$Builder;

/* JADX INFO: loaded from: classes3.dex */
public final class setSyncPolicyOfflineStatuslambda1 implements getColorIntegerOrNulllambda0 {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ IconCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ MediaBrowserCompatMediaItem;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ MediaMetadataCompat;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ MediaSessionCompatQueueItem;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ RatingCompat;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ serializer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ write;

    public setSyncPolicyOfflineStatuslambda1(transactionWithResultsuspendImpl transactionwithresultsuspendimpl, newTransaction newtransaction, SharedPreferencesMigration sharedPreferencesMigration, publishErrorlambda1 publisherrorlambda1, AbsSavedState absSavedState, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0) {
        this.read = 9;
        transactionwithresultsuspendimpl.getClass();
        newtransaction.getClass();
        sharedPreferencesMigration.getClass();
        publisherrorlambda1.getClass();
        absSavedState.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        convertstringjsonarraytolistlambda0.getClass();
        this.write = transactionwithresultsuspendimpl;
        this.serializer = newtransaction;
        this.RatingCompat = sharedPreferencesMigration;
        this.MediaSessionCompatQueueItem = publisherrorlambda1;
        this.MediaMetadataCompat = absSavedState;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.MediaBrowserCompatMediaItem = convertstringjsonarraytolistlambda0;
    }

    public setSyncPolicyOfflineStatuslambda1(r8lambdawMZ4b3qLWvwGdmRM_auBcG267s r8lambdawmz4b3qlwvwgdmrm_aubcg267s, getDoubleOrNull getdoubleornull, getDoubleOrNull getdoubleornull2, lineEndToVisibleEnd lineendtovisibleend, getDoubleOrNull getdoubleornull3, r8lambdawMZ4b3qLWvwGdmRM_auBcG267s r8lambdawmz4b3qlwvwgdmrm_aubcg267s2, getDoubleOrNull getdoubleornull4, r8lambdawMZ4b3qLWvwGdmRM_auBcG267s r8lambdawmz4b3qlwvwgdmrm_aubcg267s3) {
        this.read = 4;
        r8lambdawmz4b3qlwvwgdmrm_aubcg267s.getClass();
        getdoubleornull.getClass();
        getdoubleornull2.getClass();
        lineendtovisibleend.getClass();
        getdoubleornull3.getClass();
        r8lambdawmz4b3qlwvwgdmrm_aubcg267s2.getClass();
        getdoubleornull4.getClass();
        this.write = r8lambdawmz4b3qlwvwgdmrm_aubcg267s;
        this.serializer = getdoubleornull;
        this.RatingCompat = getdoubleornull2;
        this.MediaSessionCompatQueueItem = lineendtovisibleend;
        this.MediaMetadataCompat = getdoubleornull3;
        this.IconCompatParcelizer = r8lambdawmz4b3qlwvwgdmrm_aubcg267s2;
        this.RemoteActionCompatParcelizer = getdoubleornull4;
        this.MediaBrowserCompatMediaItem = r8lambdawmz4b3qlwvwgdmrm_aubcg267s3;
    }

    public setSyncPolicyOfflineStatuslambda1(getIterationDuration getiterationduration, setPresentationView setpresentationview, r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw2, convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0, getIterationDuration getiterationduration2, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2) {
        this.read = 6;
        getiterationduration.getClass();
        setpresentationview.getClass();
        r8lambda6uovp7lvejigbq5knkop8a0veiw.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambda6uovp7lvejigbq5knkop8a0veiw2.getClass();
        convertstringjsonarraytolistlambda0.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.write = getiterationduration;
        this.serializer = setpresentationview;
        this.RatingCompat = r8lambda6uovp7lvejigbq5knkop8a0veiw;
        this.MediaSessionCompatQueueItem = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.MediaMetadataCompat = r8lambda6uovp7lvejigbq5knkop8a0veiw2;
        this.IconCompatParcelizer = convertstringjsonarraytolistlambda0;
        this.RemoteActionCompatParcelizer = getiterationduration2;
        this.MediaBrowserCompatMediaItem = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
    }

    public setSyncPolicyOfflineStatuslambda1(getScrollRange getscrollrange, publishErrorlambda1 publisherrorlambda1, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, AbsSavedState absSavedState, setVerticalBias setverticalbias, newTransaction newtransaction, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3) {
        this.read = 8;
        publisherrorlambda1.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        absSavedState.getClass();
        setverticalbias.getClass();
        newtransaction.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
        this.write = getscrollrange;
        this.serializer = publisherrorlambda1;
        this.RatingCompat = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.MediaSessionCompatQueueItem = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.MediaMetadataCompat = absSavedState;
        this.IconCompatParcelizer = setverticalbias;
        this.RemoteActionCompatParcelizer = newtransaction;
        this.MediaBrowserCompatMediaItem = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
    }

    public /* synthetic */ setSyncPolicyOfflineStatuslambda1(getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, getColorIntegerOrNulllambda0 getcolorintegerornulllambda1, getColorIntegerOrNulllambda0 getcolorintegerornulllambda2, getColorIntegerOrNulllambda0 getcolorintegerornulllambda3, mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, getColorIntegerOrNulllambda0 getcolorintegerornulllambda4, getColorIntegerOrNulllambda0 getcolorintegerornulllambda5, int i) {
        this.read = i;
        this.write = getcolorintegerornulllambda0;
        this.serializer = getcolorintegerornulllambda1;
        this.RatingCompat = getcolorintegerornulllambda2;
        this.MediaSessionCompatQueueItem = getcolorintegerornulllambda3;
        this.MediaMetadataCompat = mergejsonobjects;
        this.IconCompatParcelizer = mergejsonobjects2;
        this.MediaBrowserCompatMediaItem = getcolorintegerornulllambda4;
        this.RemoteActionCompatParcelizer = getcolorintegerornulllambda5;
    }

    public setSyncPolicyOfflineStatuslambda1(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, newTransaction newtransaction, newTransaction newtransaction2, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3, AbsSavedState absSavedState, newTransaction newtransaction3, convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0) {
        this.read = 7;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        newtransaction.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
        absSavedState.getClass();
        newtransaction3.getClass();
        convertstringjsonarraytolistlambda0.getClass();
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.RatingCompat = newtransaction;
        this.MediaSessionCompatQueueItem = newtransaction2;
        this.MediaMetadataCompat = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
        this.IconCompatParcelizer = absSavedState;
        this.RemoteActionCompatParcelizer = newtransaction3;
        this.MediaBrowserCompatMediaItem = convertstringjsonarraytolistlambda0;
    }

    public setSyncPolicyOfflineStatuslambda1(r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw, setPresentationView setpresentationview, mergeJsonObjects mergejsonobjects, r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw2, invokeqtAw6s invokeqtaw6s, fastMergej5T8yCg fastmergej5t8ycg, mergeJsonObjects mergejsonobjects2, invokeqtAw6s invokeqtaw6s2) {
        this.read = 3;
        this.RemoteActionCompatParcelizer = r8lambda6uovp7lvejigbq5knkop8a0veiw;
        this.write = setpresentationview;
        this.serializer = mergejsonobjects;
        this.RatingCompat = r8lambda6uovp7lvejigbq5knkop8a0veiw2;
        this.MediaSessionCompatQueueItem = invokeqtaw6s;
        this.MediaMetadataCompat = fastmergej5t8ycg;
        this.IconCompatParcelizer = mergejsonobjects2;
        this.MediaBrowserCompatMediaItem = invokeqtaw6s2;
    }

    public setSyncPolicyOfflineStatuslambda1(mergeJsonObjects mergejsonobjects, setStateDescription setstatedescription, r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw, setStateDescription setstatedescription2, setStateDescription setstatedescription3, pasteText pastetext, mergeJsonObjects mergejsonobjects2, setPresentationView setpresentationview) {
        this.read = 5;
        this.write = mergejsonobjects;
        this.serializer = setstatedescription;
        this.RatingCompat = r8lambda6uovp7lvejigbq5knkop8a0veiw;
        this.RemoteActionCompatParcelizer = setstatedescription2;
        this.MediaBrowserCompatMediaItem = setstatedescription3;
        this.MediaSessionCompatQueueItem = pastetext;
        this.MediaMetadataCompat = mergejsonobjects2;
        this.IconCompatParcelizer = setpresentationview;
    }

    public setSyncPolicyOfflineStatuslambda1(mergeJsonObjects mergejsonobjects, requestGeofencesInitializationlambda1 requestgeofencesinitializationlambda1, getVerticalScrollAxisRangedelegate getverticalscrollaxisrangedelegate, requestSingleLocationUpdatelambda1 requestsinglelocationupdatelambda1, convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0, mergeJsonObjects mergejsonobjects2, mergeJsonObjects mergejsonobjects3, setSdkAuthenticationSignaturelambda1 setsdkauthenticationsignaturelambda1) {
        this.read = 0;
        this.write = mergejsonobjects;
        this.serializer = requestgeofencesinitializationlambda1;
        this.RatingCompat = getverticalscrollaxisrangedelegate;
        this.MediaSessionCompatQueueItem = requestsinglelocationupdatelambda1;
        this.MediaMetadataCompat = convertstringjsonarraytolistlambda0;
        this.IconCompatParcelizer = mergejsonobjects2;
        this.RemoteActionCompatParcelizer = mergejsonobjects3;
        this.MediaBrowserCompatMediaItem = setsdkauthenticationsignaturelambda1;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 119;
        MediaSessionCompatResultReceiverWrapper = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.IconCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2 = this.MediaBrowserCompatMediaItem;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3 = this.RemoteActionCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq4 = this.MediaMetadataCompat;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq5 = this.MediaSessionCompatQueueItem;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq6 = this.RatingCompat;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq7 = this.serializer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq8 = this.write;
        switch (i4) {
            case 0:
                return new TwoFaViewModel(new getQueryContext(), (transferSessionPackageI) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq8).write(), (TwoFaRepository) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq7).write(), (VerifyTwoFaUseCaseImpl) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq6).write(), (requestSingleLocationUpdatelambda0) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq5).write(), (setCustomBrazeNotificationFactory) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq4).write(), (setTransactionSuccessful) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (retryInAppMessagelambda1) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), new getSdkEnablementProviderandroid_sdk_base_release(10), (e$h) ((setSdkAuthenticationSignaturelambda1) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write());
            case 1:
                return new getIdJ3iCeTQ((IndirectPointerEventTypeCompanion) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq8).write(), (IndirectPointerInputModifierNode) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq7).write(), (CourierApplication) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq6).write(), (getPreviousPressed) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq5).write(), (HandlePushMessageUseCase) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq4).write(), (q4ExternalSyntheticLambda9) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (getExponentimpl) ((getContentDataType) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (getAllSemanticsNodesToMap) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write());
            case 2:
                HelpCenterRemoteDataSourceImpl helpCenterRemoteDataSourceImpl = new HelpCenterRemoteDataSourceImpl((isOpenInternalroom_runtime) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq8).write(), (endDocument) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq7).write(), (endElement) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq6).write(), (AnnotatedStringExhaustiveAnnotation) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq5).write(), (addUrlAnnotation) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq4).write(), (ChatIdCacheHelper) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (requireIndexInRange) ((r8lambda6UOvp7lvejigbq5knKoP8A0vEiw) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (accessisSetgyyYBs) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write());
                int i5 = MediaDescriptionCompat + 31;
                MediaSessionCompatResultReceiverWrapper = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    return helpCenterRemoteDataSourceImpl;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            case 3:
                getTextAlignbuA522U gettextalignbua522u = new getTextAlignbuA522U((InitializeAppStartupItemsImpl) ((r8lambda6UOvp7lvejigbq5knKoP8A0vEiw) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (isOpenInternalroom_runtime) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq8).write(), (getTextIndent) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq7).write(), (accessisSetgyyYBs) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq6).write(), (GetChatAssetDownloadConfig) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq5).write(), (TriggerChatAssetsDownloading) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq4).write(), (setMaxElementsWrap) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (InitializeAppStartupItemsImpl) ((invokeqtAw6s) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write());
                int i6 = MediaSessionCompatResultReceiverWrapper + 83;
                MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return gettextalignbua522u;
            case 4:
                Object objWrite = r8lambdaktwlyipskq3tfa9ey3gatonixfq8.write();
                objWrite.getClass();
                accessstripNonMetricAffectingCharacterStyleSpans accessstripnonmetricaffectingcharacterstylespans = (accessstripNonMetricAffectingCharacterStyleSpans) objWrite;
                Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq7.write();
                objWrite2.getClass();
                drawTextd8rzKo drawtextd8rzko = (drawTextd8rzKo) objWrite2;
                Object objWrite3 = r8lambdaktwlyipskq3tfa9ey3gatonixfq6.write();
                objWrite3.getClass();
                drawTextJFhB2K4 drawtextjfhb2k4 = (drawTextJFhB2K4) objWrite3;
                Object objWrite4 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
                objWrite4.getClass();
                drawTextLVfH_YUdefault drawtextlvfh_yudefault = (drawTextLVfH_YUdefault) objWrite4;
                Object objWrite5 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite5.getClass();
                TextPainter textPainter = (TextPainter) objWrite5;
                Object objWrite6 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite6.getClass();
                TextPainterKt textPainterKt = (TextPainterKt) objWrite6;
                Object objWrite7 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite7.getClass();
                return new accessisEllipsisMW5ApA(accessstripnonmetricaffectingcharacterstylespans, drawtextd8rzko, drawtextjfhb2k4, drawtextlvfh_yudefault, textPainter, textPainterKt, (drawTextTPWCCtM) objWrite7, (com.huawei.wisesecurity.ucs_credential.p0) ((r8lambdawMZ4b3qLWvwGdmRM_auBcG267s) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write());
            case 5:
                return new ChatDeliveryRepositoryImpl((accessrequireViewFactoryHolder) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq8).write(), new AndroidUiFrameClock(), (RectManager) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq7).write(), (GetUserDataUseCaseImpl) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq6).write(), (SemanticsPropertiesContentDescription1) ((setStateDescription) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (zzz) ((setStateDescription) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (pageDowndefault) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq5).write(), (getContentViewGroupParentLayout) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq4).write(), (isOpenInternalroom_runtime) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 6:
                Object objWrite8 = r8lambdaktwlyipskq3tfa9ey3gatonixfq8.write();
                objWrite8.getClass();
                r8lambdaO8CxgYAEJdvf6QoO3mkJZSui8c r8lambdao8cxgyaejdvf6qoo3mkjzsui8c = (r8lambdaO8CxgYAEJdvf6QoO3mkJZSui8c) objWrite8;
                Object objWrite9 = r8lambdaktwlyipskq3tfa9ey3gatonixfq7.write();
                objWrite9.getClass();
                isOpenInternalroom_runtime isopeninternalroom_runtime = (isOpenInternalroom_runtime) objWrite9;
                Object objWrite10 = r8lambdaktwlyipskq3tfa9ey3gatonixfq6.write();
                objWrite10.getClass();
                ExecuteApiRequest executeApiRequest = (ExecuteApiRequest) objWrite10;
                Object objWrite11 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
                objWrite11.getClass();
                transferSessionPackageI transfersessionpackagei = (transferSessionPackageI) objWrite11;
                Object objWrite12 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite12.getClass();
                withRect withrect = (withRect) objWrite12;
                AnimatedVisibilityClockgetTransitionslambda0inlinedsortedBy1 animatedVisibilityClockgetTransitionslambda0inlinedsortedBy1 = (AnimatedVisibilityClockgetTransitionslambda0inlinedsortedBy1) ((getIterationDuration) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                Object objWrite13 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite13.getClass();
                resetTransientState resettransientstate = (resetTransientState) objWrite13;
                r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq9 = this.IconCompatParcelizer;
                r8lambdaktwlyipskq3tfa9ey3gatonixfq9.getClass();
                return new ConfirmationRepository(r8lambdao8cxgyaejdvf6qoo3mkjzsui8c, isopeninternalroom_runtime, executeApiRequest, transfersessionpackagei, withrect, r8lambdaktwlyipskq3tfa9ey3gatonixfq9, animatedVisibilityClockgetTransitionslambda0inlinedsortedBy1, resettransientstate);
            case 7:
                Object objWrite14 = r8lambdaktwlyipskq3tfa9ey3gatonixfq8.write();
                objWrite14.getClass();
                GetWorkNowOpportunity getWorkNowOpportunity = (GetWorkNowOpportunity) objWrite14;
                Object objWrite15 = r8lambdaktwlyipskq3tfa9ey3gatonixfq7.write();
                objWrite15.getClass();
                setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) objWrite15;
                Object objWrite16 = r8lambdaktwlyipskq3tfa9ey3gatonixfq6.write();
                objWrite16.getClass();
                v9 v9Var = (v9) objWrite16;
                va vaVar = (va) ((newTransaction) r8lambdaktwlyipskq3tfa9ey3gatonixfq5).write();
                Object objWrite17 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite17.getClass();
                vg vgVar = (vg) objWrite17;
                Object objWrite18 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite18.getClass();
                CanRequestLocationUpdatesImpl canRequestLocationUpdatesImpl = (CanRequestLocationUpdatesImpl) objWrite18;
                Object objWrite19 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite19.getClass();
                v4 v4Var = (v4) objWrite19;
                Object objWrite20 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite20.getClass();
                return new computeHorizontalScrollOffset(getWorkNowOpportunity, settransactionsuccessful, v9Var, vaVar, vgVar, canRequestLocationUpdatesImpl, v4Var, (subscribeToBannersUpdateslambda2) objWrite20);
            case 8:
                shouldSkipDump shouldskipdump = (shouldSkipDump) ((getScrollRange) r8lambdaktwlyipskq3tfa9ey3gatonixfq8).write();
                Object objWrite21 = r8lambdaktwlyipskq3tfa9ey3gatonixfq7.write();
                objWrite21.getClass();
                GetRiderStateImpl getRiderStateImpl = (GetRiderStateImpl) objWrite21;
                Object objWrite22 = r8lambdaktwlyipskq3tfa9ey3gatonixfq6.write();
                objWrite22.getClass();
                vg vgVar2 = (vg) objWrite22;
                Object objWrite23 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
                objWrite23.getClass();
                GetWorkNowOpportunity getWorkNowOpportunity2 = (GetWorkNowOpportunity) objWrite23;
                Object objWrite24 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite24.getClass();
                CanRequestLocationUpdatesImpl canRequestLocationUpdatesImpl2 = (CanRequestLocationUpdatesImpl) objWrite24;
                Object objWrite25 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite25.getClass();
                getActionList getactionlist = (getActionList) objWrite25;
                Object objWrite26 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite26.getClass();
                v4 v4Var2 = (v4) objWrite26;
                Object objWrite27 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite27.getClass();
                return new CallOptions$Builder(shouldskipdump, getRiderStateImpl, vgVar2, getWorkNowOpportunity2, canRequestLocationUpdatesImpl2, getactionlist, v4Var2, (dispatchChildDetached) objWrite27);
            default:
                Object objWrite28 = r8lambdaktwlyipskq3tfa9ey3gatonixfq8.write();
                objWrite28.getClass();
                checkSdkClickResponse checksdkclickresponse = (checkSdkClickResponse) objWrite28;
                Object objWrite29 = r8lambdaktwlyipskq3tfa9ey3gatonixfq7.write();
                objWrite29.getClass();
                vd vdVar = (vd) objWrite29;
                Object objWrite30 = r8lambdaktwlyipskq3tfa9ey3gatonixfq6.write();
                objWrite30.getClass();
                IsRiderInsideActiveAreaBoundaryImpl isRiderInsideActiveAreaBoundaryImpl = (IsRiderInsideActiveAreaBoundaryImpl) objWrite30;
                Object objWrite31 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
                objWrite31.getClass();
                GetRiderStateImpl getRiderStateImpl2 = (GetRiderStateImpl) objWrite31;
                Object objWrite32 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite32.getClass();
                CanRequestLocationUpdatesImpl canRequestLocationUpdatesImpl3 = (CanRequestLocationUpdatesImpl) objWrite32;
                Object objWrite33 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite33.getClass();
                setTransactionSuccessful settransactionsuccessful2 = (setTransactionSuccessful) objWrite33;
                Object objWrite34 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite34.getClass();
                OpportunitiesRepository opportunitiesRepository = (OpportunitiesRepository) objWrite34;
                Object objWrite35 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite35.getClass();
                return new CallOptions$Builder(checksdkclickresponse, vdVar, isRiderInsideActiveAreaBoundaryImpl, getRiderStateImpl2, canRequestLocationUpdatesImpl3, settransactionsuccessful2, opportunitiesRepository, (subscribeToBannersUpdateslambda2) objWrite35);
        }
    }
}
