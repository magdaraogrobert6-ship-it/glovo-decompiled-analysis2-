package o;

import com.google.re2j.Parser;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.heatmap.domain.ShouldShowHeatmap_Factory;
import com.roadrunner.home.CreateHomeScope;
import com.roadrunner.home.nest.data.NestComponentRepositoryImpl;
import com.roadrunner.liveness.recording.domain.detectMovement.DetectSmile;
import com.roadrunner.logger.logger.firebase.FirebaseCrashlyticsUserAttributesChangedListener;
import com.roadrunner.logger.logger.sentry.SentryCriticalIssueLogger;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.map.integration.search.naver.NaverReverseGeocoder;
import com.roadrunner.nafath.data.NafathTimerDataStore;
import com.roadrunner.opportunities.domain.ProcessStartNowOpportunities;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.remoteconfig.fwf.genii.SentryFwfHttpRequestClient;
import com.roadrunner.rider.recruitment.accountcreation.data.ExecuteAccountCreationApiRequest;
import com.roadrunner.rider.recruitment.accountcreation.email_and_phone.data.PhoneValidationRepository;
import com.roadrunner.rider.state.breakrequest.domain.SendBreakRequestUseCaseImpl;
import com.roadrunner.rider.state.provider.domain.GetWorkOpportunitiesImpl;
import com.roadrunner.rider.state.provider.domain.SaveWorkOpportunities;
import com.roadrunner.rider.state.provider.domain.ValidateAndSaveStatusResponseImpl;
import com.roadrunner.rider.state.searchshifts.data.QuickSessionsRepository;
import com.sentiance.core.model.events.H$b;
import com.sentiance.core.model.events.N$b;
import dagger.Lazy;
import io.grpc.CallOptions$Builder;
import io.grpc.internal.SharedResourcePool;
import io.sentry.CombinedScopeView;
import io.sentry.util.network.NetworkBody;
import java.time.Clock;
import okhttp3.FormBody;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 implements getColorIntegerOrNulllambda0 {
    private static int serializer = 0;
    private static int write = 1;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ IconCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public q0(indexForKey indexforkey, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.read = 28;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.RemoteActionCompatParcelizer = indexforkey;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public /* synthetic */ q0(getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, mergeJsonObjects mergejsonobjects, int i) {
        this.read = i;
        this.RemoteActionCompatParcelizer = getcolorintegerornulllambda0;
        this.IconCompatParcelizer = mergejsonobjects;
    }

    public q0(ShouldShowHeatmap_Factory shouldShowHeatmap_Factory, ShouldShowHeatmap_Factory shouldShowHeatmap_Factory2) {
        this.read = 15;
        shouldShowHeatmap_Factory2.getClass();
        this.RemoteActionCompatParcelizer = shouldShowHeatmap_Factory;
        this.IconCompatParcelizer = shouldShowHeatmap_Factory2;
    }

    public q0(backgroundTimerFiredI backgroundtimerfiredi, r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw) {
        this.read = 10;
        r8lambda6uovp7lvejigbq5knkop8a0veiw.getClass();
        this.RemoteActionCompatParcelizer = backgroundtimerfiredi;
        this.IconCompatParcelizer = r8lambda6uovp7lvejigbq5knkop8a0veiw;
    }

    public q0(backgroundTimerFiredI backgroundtimerfiredi, r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw, byte b) {
        this.read = 14;
        r8lambda6uovp7lvejigbq5knkop8a0veiw.getClass();
        this.RemoteActionCompatParcelizer = backgroundtimerfiredi;
        this.IconCompatParcelizer = r8lambda6uovp7lvejigbq5knkop8a0veiw;
    }

    public q0(lambdaverifyPlayStorePurchase45 lambdaverifyplaystorepurchase45, r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw) {
        this.read = 25;
        r8lambda6uovp7lvejigbq5knkop8a0veiw.getClass();
        this.RemoteActionCompatParcelizer = lambdaverifyplaystorepurchase45;
        this.IconCompatParcelizer = r8lambda6uovp7lvejigbq5knkop8a0veiw;
    }

    public q0(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, onCapabilitiesChanged oncapabilitieschanged) {
        this.read = 21;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.IconCompatParcelizer = oncapabilitieschanged;
    }

    public q0(SemanticsPropertiesLinkTestMarker1 semanticsPropertiesLinkTestMarker1, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.read = 9;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.RemoteActionCompatParcelizer = semanticsPropertiesLinkTestMarker1;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public q0(AbsSavedState absSavedState, transactionWithResultsuspendImpl transactionwithresultsuspendimpl) {
        this.read = 27;
        absSavedState.getClass();
        this.RemoteActionCompatParcelizer = absSavedState;
        this.IconCompatParcelizer = transactionwithresultsuspendimpl;
    }

    public q0(AbsSavedState absSavedState, performPushDeliveryFlushlambda0 performpushdeliveryflushlambda0) {
        this.read = 26;
        absSavedState.getClass();
        this.RemoteActionCompatParcelizer = absSavedState;
        this.IconCompatParcelizer = performpushdeliveryflushlambda0;
    }

    public q0(postAnimationRunner postanimationrunner, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.read = 6;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.RemoteActionCompatParcelizer = postanimationrunner;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public q0(r8lambdagJlqvKShRNmP25JfHDBcPsgUwKQ r8lambdagjlqvkshrnmp25jfhdbcpsguwkq, subscribeToBannersUpdates subscribetobannersupdates) {
        this.read = 24;
        subscribetobannersupdates.getClass();
        this.RemoteActionCompatParcelizer = r8lambdagjlqvkshrnmp25jfhdbcpsguwkq;
        this.IconCompatParcelizer = subscribetobannersupdates;
    }

    public q0(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, postAnimationRunner postanimationrunner) {
        this.read = 8;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.IconCompatParcelizer = postanimationrunner;
    }

    public q0(r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw, requestBannersRefreshlambda1 requestbannersrefreshlambda1) {
        this.read = 29;
        r8lambda6uovp7lvejigbq5knkop8a0veiw.getClass();
        this.RemoteActionCompatParcelizer = requestbannersrefreshlambda1;
        this.IconCompatParcelizer = r8lambda6uovp7lvejigbq5knkop8a0veiw;
    }

    public q0(getEditableText geteditabletext, com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory) {
        this.read = 11;
        dataModule_ProvideSchedulerFactory.getClass();
        this.RemoteActionCompatParcelizer = geteditabletext;
        this.IconCompatParcelizer = dataModule_ProvideSchedulerFactory;
    }

    public q0(postAnimationRunner postanimationrunner, setPresentationView setpresentationview) {
        this.read = 16;
        setpresentationview.getClass();
        this.RemoteActionCompatParcelizer = postanimationrunner;
        this.IconCompatParcelizer = setpresentationview;
    }

    public q0(SimpleExecutableQuery simpleExecutableQuery, postAnimationRunner postanimationrunner) {
        this.read = 7;
        simpleExecutableQuery.getClass();
        this.RemoteActionCompatParcelizer = simpleExecutableQuery;
        this.IconCompatParcelizer = postanimationrunner;
    }

    public q0(requestGeofencesInitializationlambda1 requestgeofencesinitializationlambda1, subscribeToBannersUpdates subscribetobannersupdates) {
        this.read = 23;
        subscribetobannersupdates.getClass();
        this.RemoteActionCompatParcelizer = requestgeofencesinitializationlambda1;
        this.IconCompatParcelizer = subscribetobannersupdates;
    }

    public q0(requestSingleLocationUpdatelambda1 requestsinglelocationupdatelambda1, requestSingleLocationUpdatelambda1 requestsinglelocationupdatelambda2) {
        this.read = 22;
        requestsinglelocationupdatelambda2.getClass();
        this.RemoteActionCompatParcelizer = requestsinglelocationupdatelambda1;
        this.IconCompatParcelizer = requestsinglelocationupdatelambda2;
    }

    public q0(setPresentationView setpresentationview, accessgetTextBottomcp accessgettextbottomcp) {
        this.read = 4;
        this.IconCompatParcelizer = setpresentationview;
        this.RemoteActionCompatParcelizer = accessgettextbottomcp;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.read;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.IconCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2 = this.RemoteActionCompatParcelizer;
        int i4 = 29;
        switch (i3) {
            case 0:
                return new H$b((NafathTimerDataStore) ((newTransaction) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (Clock) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 1:
                return new CombinedScopeView((io.sentry.util.MediaBrowserCompatMediaItem) onAttachedToRecyclerView.read.write(), (CreateHomeScope) ((getSharedElementTargetNames) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (SaveHeatmapUrlImpl) ((getSharedElementTargetNames) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 2:
                setFlags setflags = new setFlags((insertAndReturnIdsList) ((getSharedElementTargetNames) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (r8lambda93S_WWydVO4tgS0mQqqSoxDXifE) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (accessisMainThread) InvalidationTracker.serializer.write());
                int i5 = write + 113;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return setflags;
            case 3:
                return new RouterLogger((isBound) ((accessgetTextBottomcp) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (subscribeToBannersUpdateslambda2) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 4:
                return new onAnimationStart((isOpenInternalroom_runtime) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (com.airbnb.lottie.parser.DropShadowEffect) ((accessgetTextBottomcp) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write());
            case 5:
                CircularProgressDrawable2 circularProgressDrawable2 = new CircularProgressDrawable2((DetectSmile) ((getProgressViewStartOffset) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (DetectSmile) ((getProgressViewStartOffset) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
                int i7 = serializer + 29;
                write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return circularProgressDrawable2;
            case 6:
                ViewPager2SavedState1 viewPager2SavedState1 = (ViewPager2SavedState1) ((postAnimationRunner) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                Object objWrite = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite.getClass();
                return new PrefetchNetworkException(viewPager2SavedState1, (setTransactionSuccessful) objWrite);
            case 7:
                Lazy lazySerializer = getColorIntegerOrNull.serializer((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) transactiondefault.IconCompatParcelizer);
                lazySerializer.getClass();
                Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite2.getClass();
                return new FirebaseCrashlyticsUserAttributesChangedListener(lazySerializer, (transactionsuspendImpl) objWrite2, (isMainThread) ((postAnimationRunner) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 8:
                SuspendingTransactionWrapper suspendingTransactionWrapper = new SuspendingTransactionWrapper();
                Object objWrite3 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite3.getClass();
                return new SentryCriticalIssueLogger(suspendingTransactionWrapper, (transferSessionPackageI) objWrite3, (RouterLogger) ((postAnimationRunner) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 9:
                resolveBulletTextUnitToPxo2QH7mI resolvebullettextunittopxo2qh7mi = (resolveBulletTextUnitToPxo2QH7mI) ((SemanticsPropertiesLinkTestMarker1) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                Object objWrite4 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite4.getClass();
                return new md(resolvebullettextunittopxo2qh7mi, (setLastHorizontalStyle) objWrite4);
            case 10:
                o6ExternalSyntheticLambda20 o6externalsyntheticlambda20 = (o6ExternalSyntheticLambda20) ((backgroundTimerFiredI) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                Object objWrite5 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite5.getClass();
                return new NaverReverseGeocoder(o6externalsyntheticlambda20, (ExecuteApiRequest) objWrite5);
            case 11:
                accessgetVcp accessgetvcp = new accessgetVcp(9);
                getActionViewIntentlambda0 getactionviewintentlambda0 = new getActionViewIntentlambda0();
                getToggleableState gettoggleablestate = (getToggleableState) ((getEditableText) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                Object objWrite6 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite6.getClass();
                return new q3(accessgetvcp, getactionviewintentlambda0, gettoggleablestate, (getAllSemanticsNodesToMap) objWrite6);
            case 12:
                return new ProcessStartNowOpportunities((SaveHeatmapUrlImpl) ((publishErrorlambda1) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (resetTransientState) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 13:
                return new r8lambdaGDT82k101pFrQcAu5KuS7n_2ZU((r8lambda_xjKNsnSVqrQpdhsT42da52uGY) ((r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (getContentViewGroupParentLayout) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 14:
                r8lambdax7886zsaIYvPM4CylL7YklZd7ig r8lambdax7886zsaiyvpm4cyll7yklzd7ig = (r8lambdax7886zsaIYvPM4CylL7YklZd7ig) ((backgroundTimerFiredI) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                Object objWrite7 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite7.getClass();
                return new FormBody.Builder(r8lambdax7886zsaiyvpm4cyll7yklzd7ig, (ExecuteApiRequest) objWrite7);
            case 15:
                r8lambdaxXjW7P_AvkpTNfi9yKZ8umnanKU r8lambdaxxjw7p_avkptnfi9ykz8umnanku = (r8lambdaxXjW7P_AvkpTNfi9yKZ8umnanKU) ((ShouldShowHeatmap_Factory) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                Object objWrite8 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite8.getClass();
                return new NetworkBody(r8lambdaxxjw7p_avkptnfi9ykz8umnanku, i, (access1200) objWrite8);
            case 16:
                rollback rollbackVar = (rollback) ((postAnimationRunner) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                Object objWrite9 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite9.getClass();
                return new SentryFwfHttpRequestClient(rollbackVar, (isOpenInternalroom_runtime) objWrite9);
            case 17:
                return new PhoneValidationRepository((ExecuteAccountCreationApiRequest) ((r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (onResumeI) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), 0);
            case 18:
                return new FormBody.Builder((H$b) ((r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (onResumeI) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 19:
                ActivityHandler2 activityHandler2 = new ActivityHandler2((GetAppStateImpl) ((publishErrorlambda1) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (OtpLogger) ((requestSingleLocationUpdatelambda1) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), new getQueryContext());
                int i9 = write + 3;
                serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    return activityHandler2;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            case 20:
                return new SendBreakRequestUseCaseImpl((SaveHeatmapUrlImpl) ((requestSingleLocationUpdatelambda1) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (ExecuteApiRequest) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 21:
                Object objWrite10 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite10.getClass();
                return new Parser.Pair((NestComponentRepositoryImpl) objWrite10, i4, (N$b) ((onCapabilitiesChanged) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 22:
                Object objWrite11 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite11.getClass();
                return new setPackageHandlerBackoffStrategy((requestSingleLocationUpdatelambda1) r8lambdaktwlyipskq3tfa9ey3gatonixfq2, (r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8) objWrite11);
            case 23:
                CombinedScopeView combinedScopeView = (CombinedScopeView) ((requestGeofencesInitializationlambda1) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                Object objWrite12 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite12.getClass();
                return new AdjustInstance9(combinedScopeView, (logPushStoryPageClickedlambda11) objWrite12, new xb(), new u6(), new isMainThread(19));
            case 24:
                getStoreIdFromSystem getstoreidfromsystem = (getStoreIdFromSystem) ((r8lambdagJlqvKShRNmP25JfHDBcPsgUwKQ) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                Object objWrite13 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite13.getClass();
                return new getAppVersion(getstoreidfromsystem, (logPushStoryPageClickedlambda11) objWrite13);
            case 25:
                getScreenFormat getscreenformat = (getScreenFormat) ((lambdaverifyPlayStorePurchase45) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                Object objWrite14 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite14.getClass();
                return new OkHttpCall$1(getscreenformat, (ExecuteApiRequest) objWrite14);
            case 26:
                Object objWrite15 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite15.getClass();
                return new GetWorkOpportunitiesImpl((IActivityHandler) objWrite15, (OkHttpCall$1) ((performPushDeliveryFlushlambda0) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 27:
                Object objWrite16 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite16.getClass();
                return new SaveWorkOpportunities((IActivityHandler) objWrite16, (SharedResourcePool) ((transactionWithResultsuspendImpl) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 28:
                CallOptions$Builder callOptions$Builder = (CallOptions$Builder) ((indexForKey) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                Object objWrite17 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite17.getClass();
                return new ValidateAndSaveStatusResponseImpl(callOptions$Builder, (resetTransientState) objWrite17);
            default:
                Lazy lazySerializer2 = getColorIntegerOrNull.serializer(r8lambdaktwlyipskq3tfa9ey3gatonixfq2);
                lazySerializer2.getClass();
                Object objWrite18 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite18.getClass();
                return new QuickSessionsRepository(lazySerializer2, (ExecuteApiRequest) objWrite18);
        }
    }
}
