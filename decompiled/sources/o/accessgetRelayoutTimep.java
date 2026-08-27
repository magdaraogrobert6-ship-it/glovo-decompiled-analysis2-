package o;

import android.app.Application;
import android.view.WindowManager;
import com.google.firebase.FirebaseApp;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import com.qualtrics.digital.Qualtrics;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.auth.domain.IsRiderOnboardingEligibleImpl;
import com.roadrunner.auth.domain.ProcessSuccessfulSignInUseCase;
import com.roadrunner.auth.domain.RefreshAccessTokenUseCaseImpl;
import com.roadrunner.auth.domain.SaveAuthSignInDataUseCase;
import com.roadrunner.experience_tools.qualtrics.QualtricsManagerImpl;
import com.roadrunner.freelancing.domain.GetWorkNowOpportunity;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.heatmap.domain.ShouldShowHeatmap_Factory;
import com.roadrunner.helpcenter.dispatcher_chat.WebDispatcherChat;
import com.roadrunner.helpcenter.domain.GetUnreadMessageCountUseCase;
import com.roadrunner.location.toggle.domain.CanRequestLocationUpdatesImpl;
import com.roadrunner.logger.info.AppEventInfoChangeHandler;
import com.roadrunner.login.domain.auth.GetRiderNameUseCaseImpl;
import com.roadrunner.opportunities.data.OpportunitiesRepository;
import com.roadrunner.remoteconfig.firebase.FetchRemoteConfigUseCaseImpl;
import com.roadrunner.rider.recruitment.accountcreation.otp_verification.OtpVerificationViewModel;
import com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer.GetOtpVerificationRequestId;
import com.roadrunner.rider.state.domain.GetStatusUseCaseImpl;
import com.roadrunner.rider.state.futureshift.presentation.GetFutureShiftUiState;
import com.roadrunner.rider.state.provider.data.model.FetchRiderStatusImpl;
import dagger.Lazy;
import io.sentry.CombinedScopeView;
import io.sentry.metrics.MetricsBatchProcessor;
import io.sentry.util.network.NetworkBody;
import okhttp3.FormBody;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetRelayoutTimep implements getColorIntegerOrNulllambda0 {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ IconCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ MediaBrowserCompatMediaItem;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ MediaMetadataCompat;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ RatingCompat;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ RemoteActionCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ read;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ serializer;
    public final /* synthetic */ int write;

    public accessgetRelayoutTimep(subscribeToFeatureFlagsUpdateslambda0 subscribetofeatureflagsupdateslambda0, accessgetRelayoutTimep accessgetrelayouttimep, lambdaverifyPlayStorePurchase45 lambdaverifyplaystorepurchase45, transactionWithResultsuspendImpl transactionwithresultsuspendimpl, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, AbsSavedState absSavedState) {
        this.write = 14;
        subscribetofeatureflagsupdateslambda0.getClass();
        accessgetrelayouttimep.getClass();
        lambdaverifyplaystorepurchase45.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        absSavedState.getClass();
        this.IconCompatParcelizer = subscribetofeatureflagsupdateslambda0;
        this.serializer = accessgetrelayouttimep;
        this.read = lambdaverifyplaystorepurchase45;
        this.MediaBrowserCompatMediaItem = transactionwithresultsuspendimpl;
        this.MediaMetadataCompat = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.RatingCompat = absSavedState;
    }

    public accessgetRelayoutTimep(LocaleListHelperMethods localeListHelperMethods, onCapabilitiesChanged oncapabilitieschanged, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, setPaddingBottom setpaddingbottom, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3, LocaleListHelperMethods localeListHelperMethods2) {
        this.write = 4;
        localeListHelperMethods.getClass();
        oncapabilitieschanged.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        setpaddingbottom.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
        this.IconCompatParcelizer = localeListHelperMethods;
        this.serializer = oncapabilitieschanged;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.MediaBrowserCompatMediaItem = setpaddingbottom;
        this.MediaMetadataCompat = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
        this.RatingCompat = localeListHelperMethods2;
    }

    public /* synthetic */ accessgetRelayoutTimep(mergeJsonObjects mergejsonobjects, getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, getColorIntegerOrNulllambda0 getcolorintegerornulllambda1, mergeJsonObjects mergejsonobjects2, getColorIntegerOrNulllambda0 getcolorintegerornulllambda2, mergeJsonObjects mergejsonobjects3, mergeJsonObjects mergejsonobjects4, int i) {
        this.write = i;
        this.IconCompatParcelizer = mergejsonobjects;
        this.serializer = getcolorintegerornulllambda0;
        this.read = getcolorintegerornulllambda1;
        this.MediaBrowserCompatMediaItem = mergejsonobjects2;
        this.MediaMetadataCompat = getcolorintegerornulllambda2;
        this.RemoteActionCompatParcelizer = mergejsonobjects3;
        this.RatingCompat = mergejsonobjects4;
    }

    public accessgetRelayoutTimep(r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy, setSyncPolicyOfflineStatuslambda1 setsyncpolicyofflinestatuslambda1, insertBasedOnParentOffset insertbasedonparentoffset, FontVariationSettingInt fontVariationSettingInt, FontVariationSettingInt fontVariationSettingInt2, FontVariationSettingInt fontVariationSettingInt3, r8lambdazpHrebeZ5dkHsk62AZggxj52Jpo r8lambdazphrebez5dkhsk62azggxj52jpo) {
        this.write = 3;
        r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy.getClass();
        setsyncpolicyofflinestatuslambda1.getClass();
        insertbasedonparentoffset.getClass();
        fontVariationSettingInt.getClass();
        fontVariationSettingInt2.getClass();
        fontVariationSettingInt3.getClass();
        this.IconCompatParcelizer = r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy;
        this.serializer = setsyncpolicyofflinestatuslambda1;
        this.read = insertbasedonparentoffset;
        this.MediaBrowserCompatMediaItem = fontVariationSettingInt;
        this.MediaMetadataCompat = fontVariationSettingInt2;
        this.RemoteActionCompatParcelizer = fontVariationSettingInt3;
        this.RatingCompat = r8lambdazphrebez5dkhsk62azggxj52jpo;
    }

    public accessgetRelayoutTimep(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, SemanticsPropertiesLinkTestMarker1 semanticsPropertiesLinkTestMarker1, AbsSavedState absSavedState, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, LocaleListHelperMethods localeListHelperMethods, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3, ShouldShowHeatmap_Factory shouldShowHeatmap_Factory) {
        this.write = 5;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        semanticsPropertiesLinkTestMarker1.getClass();
        absSavedState.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
        shouldShowHeatmap_Factory.getClass();
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.serializer = semanticsPropertiesLinkTestMarker1;
        this.read = absSavedState;
        this.MediaBrowserCompatMediaItem = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.MediaMetadataCompat = localeListHelperMethods;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
        this.RatingCompat = shouldShowHeatmap_Factory;
    }

    public accessgetRelayoutTimep(hasNestedScrollingParent hasnestedscrollingparent, com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, setPresentationView setpresentationview, postAnimationRunner postanimationrunner, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3) {
        this.write = 12;
        hasnestedscrollingparent.getClass();
        dataModule_ProvideSchedulerFactory.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        setpresentationview.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
        this.IconCompatParcelizer = hasnestedscrollingparent;
        this.serializer = dataModule_ProvideSchedulerFactory;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.MediaBrowserCompatMediaItem = setpresentationview;
        this.MediaMetadataCompat = postanimationrunner;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.RatingCompat = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
    }

    public accessgetRelayoutTimep(lambdaverifyPlayStorePurchase45 lambdaverifyplaystorepurchase45, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, newTransaction newtransaction, newTransaction newtransaction2, newTransaction newtransaction3, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, requestSingleLocationUpdatelambda1 requestsinglelocationupdatelambda1) {
        this.write = 15;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        newtransaction.getClass();
        newtransaction2.getClass();
        newtransaction3.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.IconCompatParcelizer = lambdaverifyplaystorepurchase45;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = newtransaction;
        this.MediaBrowserCompatMediaItem = newtransaction2;
        this.MediaMetadataCompat = newtransaction3;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.RatingCompat = requestsinglelocationupdatelambda1;
    }

    public accessgetRelayoutTimep(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, SimpleExecutableQuery simpleExecutableQuery, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, getContentDataType getcontentdatatype, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3, setVerticalBias setverticalbias, setVerticalBias setverticalbias2) {
        this.write = 10;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        simpleExecutableQuery.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        getcontentdatatype.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
        setverticalbias.getClass();
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.serializer = simpleExecutableQuery;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.MediaBrowserCompatMediaItem = getcontentdatatype;
        this.MediaMetadataCompat = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
        this.RemoteActionCompatParcelizer = setverticalbias;
        this.RatingCompat = setverticalbias2;
    }

    public accessgetRelayoutTimep(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, SimpleExecutableQuery simpleExecutableQuery, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3, newTransaction newtransaction, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq4, getScrollRange getscrollrange) {
        this.write = 8;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        simpleExecutableQuery.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
        newtransaction.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq4.getClass();
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.read = simpleExecutableQuery;
        this.MediaBrowserCompatMediaItem = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
        this.MediaMetadataCompat = newtransaction;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq4;
        this.RatingCompat = getscrollrange;
    }

    public accessgetRelayoutTimep(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3, newTransaction newtransaction, AbsSavedState absSavedState, mergeJsonObjects mergejsonobjects, setVerticalBias setverticalbias) {
        this.write = 7;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
        newtransaction.getClass();
        absSavedState.getClass();
        setverticalbias.getClass();
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
        this.MediaBrowserCompatMediaItem = newtransaction;
        this.MediaMetadataCompat = absSavedState;
        this.RemoteActionCompatParcelizer = mergejsonobjects;
        this.RatingCompat = setverticalbias;
    }

    public accessgetRelayoutTimep(hasNestedScrollingParent hasnestedscrollingparent, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, requestSingleLocationUpdatelambda1 requestsinglelocationupdatelambda1, mergeJsonObjects mergejsonobjects, getContentDataType getcontentdatatype, r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2) {
        this.write = 6;
        hasnestedscrollingparent.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        requestsinglelocationupdatelambda1.getClass();
        r8lambda6uovp7lvejigbq5knkop8a0veiw.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.IconCompatParcelizer = hasnestedscrollingparent;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = requestsinglelocationupdatelambda1;
        this.MediaBrowserCompatMediaItem = mergejsonobjects;
        this.MediaMetadataCompat = getcontentdatatype;
        this.RemoteActionCompatParcelizer = r8lambda6uovp7lvejigbq5knkop8a0veiw;
        this.RatingCompat = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = this.write;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.RatingCompat;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2 = this.RemoteActionCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3 = this.MediaMetadataCompat;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq4 = this.MediaBrowserCompatMediaItem;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq5 = this.read;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq6 = this.serializer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq7 = this.IconCompatParcelizer;
        switch (i2) {
            case 0:
                return new FirebasePerformance((FirebaseApp) ((getRootannotations) r8lambdaktwlyipskq3tfa9ey3gatonixfq7).write(), (AbstractComposeViewExternalSyntheticLambda0) ((getRootannotations) r8lambdaktwlyipskq3tfa9ey3gatonixfq6).write(), (accesssetInstancecp) ((getRootannotations) r8lambdaktwlyipskq3tfa9ey3gatonixfq5).write(), (AbstractComposeViewExternalSyntheticLambda0) ((getRootannotations) r8lambdaktwlyipskq3tfa9ey3gatonixfq4).write(), (RemoteConfigManager) ((SemanticsPropertiesFillableData1) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (accesssetAddChangeCallbackMethodcp) ((SemanticsPropertiesFillableData1) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (SessionManager) ((SemanticsPropertiesFillableData1) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 1:
                return new ProcessSuccessfulSignInUseCase((SaveAuthSignInDataUseCase) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq7).write(), (FetchRemoteConfigUseCaseImpl) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq6).write(), (com.huawei.wisesecurity.ucs_credential.p0) isTraversalGroup.read.write(), (onAutofillTextdefault) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq5).write(), (FetchRiderStatusImpl) ((lambdaverifyPlayStorePurchase45) r8lambdaktwlyipskq3tfa9ey3gatonixfq4).write(), (getAllSemanticsNodesToMap) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (AppEventInfoChangeHandler) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (getContentDescription) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 2:
                return new onFillDatadefault((getToggleableState) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq7).write(), (getInputText) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq6).write(), (RefreshAccessTokenUseCaseImpl) ((indexForKey) r8lambdaktwlyipskq3tfa9ey3gatonixfq5).write(), (pageLeft) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq4).write(), (setTextdefault) ((setStateDescription) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (transferSessionPackageI) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (getIndexForKey) ((invokeqtAw6s) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 3:
                Object objWrite = r8lambdaktwlyipskq3tfa9ey3gatonixfq7.write();
                objWrite.getClass();
                WindowManager windowManager = (WindowManager) objWrite;
                Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq6.write();
                objWrite2.getClass();
                accessisEllipsisMW5ApA accessisellipsismw5apa = (accessisEllipsisMW5ApA) objWrite2;
                Object objWrite3 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
                objWrite3.getClass();
                isPunctuationui_text ispunctuationui_text = (isPunctuationui_text) objWrite3;
                Object objWrite4 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite4.getClass();
                updateMeasureState updatemeasurestate = (updateMeasureState) objWrite4;
                Object objWrite5 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite5.getClass();
                getEllipsizedLeftPaddingdefault getellipsizedleftpaddingdefault = (getEllipsizedLeftPaddingdefault) objWrite5;
                Object objWrite6 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite6.getClass();
                LetterSpacingSpanEm letterSpacingSpanEm = new LetterSpacingSpanEm(windowManager, accessisellipsismw5apa, ispunctuationui_text, updatemeasurestate, getellipsizedleftpaddingdefault, (getEllipsizedLeftPadding) objWrite6, (SignInDataStore) ((r8lambdazpHrebeZ5dkHsk62AZggxj52Jpo) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
                int i3 = MediaDescriptionCompat + 87;
                MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return letterSpacingSpanEm;
            case 4:
                Object objWrite7 = r8lambdaktwlyipskq3tfa9ey3gatonixfq7.write();
                objWrite7.getClass();
                accessgetEmptycp accessgetemptycp = (accessgetEmptycp) objWrite7;
                Object objWrite8 = r8lambdaktwlyipskq3tfa9ey3gatonixfq6.write();
                objWrite8.getClass();
                accessparseLanguageTag accessparselanguagetag = (accessparseLanguageTag) objWrite8;
                Object objWrite9 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
                objWrite9.getClass();
                getHeadingrAG3T2k getheadingrag3t2k = (getHeadingrAG3T2k) objWrite9;
                Object objWrite10 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite10.getClass();
                setSpan setspan = (setSpan) objWrite10;
                Object objWrite11 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite11.getClass();
                mg mgVar = (mg) objWrite11;
                Object objWrite12 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite12.getClass();
                return new androidx.work.impl.WorkerWrapper.Builder(accessgetemptycp, accessparselanguagetag, getheadingrag3t2k, setspan, mgVar, (mb) objWrite12, (BrazeExternalSyntheticLambda206) ((LocaleListHelperMethods) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), 8);
            case 5:
                Object objWrite13 = r8lambdaktwlyipskq3tfa9ey3gatonixfq7.write();
                objWrite13.getClass();
                accessrequireViewFactoryHolder accessrequireviewfactoryholder = (accessrequireViewFactoryHolder) objWrite13;
                Object objWrite14 = r8lambdaktwlyipskq3tfa9ey3gatonixfq6.write();
                objWrite14.getClass();
                resolveBulletTextUnitToPxo2QH7mI resolvebullettextunittopxo2qh7mi = (resolveBulletTextUnitToPxo2QH7mI) objWrite14;
                Object objWrite15 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
                objWrite15.getClass();
                copy8_81llAdefault copy8_81lladefault = (copy8_81llAdefault) objWrite15;
                Object objWrite16 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite16.getClass();
                getHeadingrAG3T2k getheadingrag3t2k2 = (getHeadingrAG3T2k) objWrite16;
                SaveHeatmapUrlImpl saveHeatmapUrlImpl = (SaveHeatmapUrlImpl) ((LocaleListHelperMethods) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                Object objWrite17 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite17.getClass();
                accessgetParagraphcp accessgetparagraphcp = (accessgetParagraphcp) objWrite17;
                Object objWrite18 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite18.getClass();
                return new androidx.work.impl.WorkerWrapper.Builder(accessrequireviewfactoryholder, resolvebullettextunittopxo2qh7mi, copy8_81lladefault, getheadingrag3t2k2, saveHeatmapUrlImpl, accessgetparagraphcp, (LineBreak_androidKt) objWrite18, 9);
            case 6:
                Object objWrite19 = r8lambdaktwlyipskq3tfa9ey3gatonixfq7.write();
                objWrite19.getClass();
                Application application = (Application) objWrite19;
                Object objWrite20 = r8lambdaktwlyipskq3tfa9ey3gatonixfq6.write();
                objWrite20.getClass();
                getPivotOffsetF1C5BW0 getpivotoffsetf1c5bw0 = (getPivotOffsetF1C5BW0) objWrite20;
                Object objWrite21 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
                objWrite21.getClass();
                r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8 r8lambda4txk7kovp_j84hgvzl3zo6mzli8 = (r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8) objWrite21;
                Object objWrite22 = ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq4).write();
                objWrite22.getClass();
                ConstraintLayoutMeasurer constraintLayoutMeasurer = (ConstraintLayoutMeasurer) objWrite22;
                ((getContentDataType) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                Lazy lazySerializer = getColorIntegerOrNull.serializer(r8lambdaktwlyipskq3tfa9ey3gatonixfq2);
                lazySerializer.getClass();
                Object objWrite23 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite23.getClass();
                getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objWrite23;
                Qualtrics.instance().getClass();
                return new QualtricsManagerImpl(application, getpivotoffsetf1c5bw0, r8lambda4txk7kovp_j84hgvzl3zo6mzli8, constraintLayoutMeasurer, new isMainThread(11), lazySerializer, getcontentviewgroupparentlayout);
            case 7:
                Object objWrite24 = r8lambdaktwlyipskq3tfa9ey3gatonixfq7.write();
                objWrite24.getClass();
                GetWorkNowOpportunity getWorkNowOpportunity = (GetWorkNowOpportunity) objWrite24;
                Object objWrite25 = r8lambdaktwlyipskq3tfa9ey3gatonixfq6.write();
                objWrite25.getClass();
                setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) objWrite25;
                Object objWrite26 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
                objWrite26.getClass();
                vg vgVar = (vg) objWrite26;
                Object objWrite27 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite27.getClass();
                v4 v4Var = (v4) objWrite27;
                Object objWrite28 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite28.getClass();
                CanRequestLocationUpdatesImpl canRequestLocationUpdatesImpl = (CanRequestLocationUpdatesImpl) objWrite28;
                Object objWrite29 = ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                objWrite29.getClass();
                getCurrentInterruptionFilter getcurrentinterruptionfilter = (getCurrentInterruptionFilter) objWrite29;
                Object objWrite30 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite30.getClass();
                return new setRootWindowInsets(getWorkNowOpportunity, settransactionsuccessful, vgVar, v4Var, canRequestLocationUpdatesImpl, getcurrentinterruptionfilter, (getActionList) objWrite30);
            case 8:
                Object objWrite31 = r8lambdaktwlyipskq3tfa9ey3gatonixfq7.write();
                objWrite31.getClass();
                OpportunitiesRepository opportunitiesRepository = (OpportunitiesRepository) objWrite31;
                Object objWrite32 = r8lambdaktwlyipskq3tfa9ey3gatonixfq6.write();
                objWrite32.getClass();
                setLastHorizontalStyle setlasthorizontalstyle = (setLastHorizontalStyle) objWrite32;
                Object objWrite33 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
                objWrite33.getClass();
                o7 o7Var = (o7) objWrite33;
                Object objWrite34 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite34.getClass();
                getNotificationChannelGroupCompat getnotificationchannelgroupcompat = (getNotificationChannelGroupCompat) objWrite34;
                Object objWrite35 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite35.getClass();
                v4 v4Var2 = (v4) objWrite35;
                Object objWrite36 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite36.getClass();
                return new androidx.work.impl.WorkerWrapper.Builder(opportunitiesRepository, setlasthorizontalstyle, o7Var, getnotificationchannelgroupcompat, v4Var2, (getCurrentInterruptionFilter) objWrite36, (buildGdprPackage) ((getScrollRange) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), 11);
            case 9:
                int i5 = 12;
                return new WebDispatcherChat((getPivotOffsetF1C5BW0) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq7).write(), (GetUnreadMessageCountUseCase) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq6).write(), (boundingRectInRoot) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq5).write(), (getContentViewGroupParentLayout) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq4).write(), (isOpenInternalroom_runtime) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), new AndroidUiDispatcherCompanioncurrentThread1(i5), (transferSessionPackageI) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (CombinedScopeView) ((SharedPreferencesMigration) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), new isMainThread(i5));
            case 10:
                Object objWrite37 = r8lambdaktwlyipskq3tfa9ey3gatonixfq7.write();
                objWrite37.getClass();
                setNextTransition setnexttransition = (setNextTransition) objWrite37;
                Object objWrite38 = r8lambdaktwlyipskq3tfa9ey3gatonixfq6.write();
                objWrite38.getClass();
                GetRiderNameUseCaseImpl getRiderNameUseCaseImpl = (GetRiderNameUseCaseImpl) objWrite38;
                Object objWrite39 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
                objWrite39.getClass();
                transferSessionPackageI transfersessionpackagei = (transferSessionPackageI) objWrite39;
                Object objWrite40 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite40.getClass();
                IsRiderOnboardingEligibleImpl isRiderOnboardingEligibleImpl = (IsRiderOnboardingEligibleImpl) objWrite40;
                Object objWrite41 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite41.getClass();
                setTransactionSuccessful settransactionsuccessful2 = (setTransactionSuccessful) objWrite41;
                Object objWrite42 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite42.getClass();
                androidx.work.impl.WorkerWrapper.Builder builder = new androidx.work.impl.WorkerWrapper.Builder(setnexttransition, getRiderNameUseCaseImpl, transfersessionpackagei, isRiderOnboardingEligibleImpl, settransactionsuccessful2, (setMenuVisibility) objWrite42, (isApiKeyPresentandroid_sdk_base_releaseannotations) ((setVerticalBias) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), 13);
                int i6 = MediaSessionCompatQueueItem + 113;
                MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return builder;
            case 11:
                return new androidx.work.impl.WorkerWrapper.Builder((Application) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq7).write(), (h9) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq6).write(), (getAllSemanticsNodesToMap) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq5).write(), (igExternalSyntheticLambda2) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq4).write(), (isOpenInternalroom_runtime) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (createQuery) ((postAnimationRunner) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (getContentViewGroupParentLayout) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 12:
                Object objWrite43 = r8lambdaktwlyipskq3tfa9ey3gatonixfq7.write();
                objWrite43.getClass();
                Application application2 = (Application) objWrite43;
                Object objWrite44 = r8lambdaktwlyipskq3tfa9ey3gatonixfq6.write();
                objWrite44.getClass();
                getAllSemanticsNodesToMap getallsemanticsnodestomap = (getAllSemanticsNodesToMap) objWrite44;
                Object objWrite45 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
                objWrite45.getClass();
                igExternalSyntheticLambda2 igexternalsyntheticlambda2 = (igExternalSyntheticLambda2) objWrite45;
                Object objWrite46 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite46.getClass();
                isOpenInternalroom_runtime isopeninternalroom_runtime = (isOpenInternalroom_runtime) objWrite46;
                createQuery createquery = (createQuery) ((postAnimationRunner) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                Object objWrite47 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite47.getClass();
                transferSessionPackageI transfersessionpackagei2 = (transferSessionPackageI) objWrite47;
                Object objWrite48 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite48.getClass();
                return new MetricsBatchProcessor(application2, getallsemanticsnodestomap, igexternalsyntheticlambda2, isopeninternalroom_runtime, createquery, transfersessionpackagei2, (getContentViewGroupParentLayout) objWrite48);
            case 13:
                OtpVerificationViewModel otpVerificationViewModel = new OtpVerificationViewModel(new getQueryContext(), (com.airbnb.lottie.parser.DropShadowEffect) ((setPaddingBottom) r8lambdaktwlyipskq3tfa9ey3gatonixfq7).write(), (FormBody.Builder) ((q0) r8lambdaktwlyipskq3tfa9ey3gatonixfq6).write(), (BrazeExternalSyntheticLambda28) ((r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY) r8lambdaktwlyipskq3tfa9ey3gatonixfq5).write(), (setTransactionSuccessful) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq4).write(), (GetOtpVerificationRequestId) ((ActivityHandlerExternalSyntheticLambda4) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (GetOtpVerificationRequestId) ((ActivityHandlerExternalSyntheticLambda4) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (NetworkBody) ((r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
                int i8 = MediaDescriptionCompat + 59;
                MediaSessionCompatQueueItem = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return otpVerificationViewModel;
            case 14:
                Object objWrite49 = r8lambdaktwlyipskq3tfa9ey3gatonixfq7.write();
                objWrite49.getClass();
                GetStatusUseCaseImpl getStatusUseCaseImpl = (GetStatusUseCaseImpl) objWrite49;
                Object objWrite50 = r8lambdaktwlyipskq3tfa9ey3gatonixfq6.write();
                objWrite50.getClass();
                AdjustInstancePreLaunchActions adjustInstancePreLaunchActions = (AdjustInstancePreLaunchActions) objWrite50;
                Object objWrite51 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
                objWrite51.getClass();
                AdjustInstance91 adjustInstance91 = (AdjustInstance91) objWrite51;
                OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) ((transactionWithResultsuspendImpl) r8lambdaktwlyipskq3tfa9ey3gatonixfq4).write();
                Object objWrite52 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite52.getClass();
                OpportunitiesRepository opportunitiesRepository2 = (OpportunitiesRepository) objWrite52;
                Object objWrite53 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite53.getClass();
                vg vgVar2 = (vg) objWrite53;
                Object objWrite54 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite54.getClass();
                return new GetFutureShiftUiState(getStatusUseCaseImpl, adjustInstancePreLaunchActions, adjustInstance91, okHttpCall$1, opportunitiesRepository2, vgVar2, (CanRequestLocationUpdatesImpl) objWrite54);
            default:
                AdjustLinkResolution adjustLinkResolution = (AdjustLinkResolution) ((lambdaverifyPlayStorePurchase45) r8lambdaktwlyipskq3tfa9ey3gatonixfq7).write();
                Object objWrite55 = r8lambdaktwlyipskq3tfa9ey3gatonixfq6.write();
                objWrite55.getClass();
                setTransactionSuccessful settransactionsuccessful3 = (setTransactionSuccessful) objWrite55;
                Object objWrite56 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
                objWrite56.getClass();
                va vaVar = (va) objWrite56;
                Object objWrite57 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite57.getClass();
                v9 v9Var = (v9) objWrite57;
                Object objWrite58 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite58.getClass();
                xa xaVar = (xa) objWrite58;
                Object objWrite59 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite59.getClass();
                AdjustInstancePreLaunchActions adjustInstancePreLaunchActions2 = new AdjustInstancePreLaunchActions(adjustLinkResolution, settransactionsuccessful3, vaVar, v9Var, xaVar, (setLastHorizontalStyle) objWrite59, (createQuery) ((requestSingleLocationUpdatelambda1) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
                int i10 = MediaDescriptionCompat + 49;
                MediaSessionCompatQueueItem = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
                return adjustInstancePreLaunchActions2;
        }
    }
}
