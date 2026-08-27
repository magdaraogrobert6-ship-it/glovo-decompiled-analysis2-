package o;

import android.app.Application;
import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.delivery.pickupdropoff.confirmbutton.domain.ConfirmDeliveryUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.data.GetConfirmationStateImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.data.TasksRepository;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.ConfirmDeliveryStepUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.UploadPictureUseCaseImpl;
import com.roadrunner.delivery.repository.StateV3DeliveryProvider;
import com.roadrunner.delivery.stacked.delivery.list.domain.ObserveStackedDeliveryList;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.home.CreateHomeScope;
import com.roadrunner.instant.shifts.data.InstantShiftRepository;
import com.roadrunner.location.core.domain.GetLocationUpdatesUseCaseImpl;
import com.roadrunner.logger.logger.firebase.FirebaseAnalyticsUserAttributesChangedListener;
import com.roadrunner.login.domain.auth.GetRiderNameUseCaseImpl;
import com.roadrunner.map.container.enabled.usecases.recenter.RecenterMapTriggerImpl;
import com.roadrunner.map.integration.mapbox.route.FetchMapboxRouteUseCase;
import com.roadrunner.networking.core.NetworkingCoreModule$$ExternalSyntheticLambda2;
import com.roadrunner.notifications.PendingIntentBuilderImpl;
import com.roadrunner.order.history.data.network.HistoryApiRequest;
import com.roadrunner.phonenumber.domain.GetCustomerPhoneNumberUseCaseImpl;
import com.roadrunner.push.core.data.PushServiceRepository;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.rider.safety.report.domain.MapSafetyReportResponse;
import com.sentiance.core.model.events.C$b;
import com.sentiance.core.model.events.N$b;
import dagger.Lazy;
import io.sentry.CombinedScopeView;
import io.sentry.metrics.MetricsBatchProcessor;
import java.time.Clock;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I implements getColorIntegerOrNulllambda0 {
    private static int RatingCompat = 1;
    private static int read;
    public final Object IconCompatParcelizer;
    public final mergeJsonObjects RemoteActionCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ serializer;
    public final /* synthetic */ int write;

    public r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I(accessgetTextBottomcp accessgettextbottomcp, mc mcVar, com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory) {
        this.write = 20;
        accessgettextbottomcp.getClass();
        dataModule_ProvideSchedulerFactory.getClass();
        this.IconCompatParcelizer = accessgettextbottomcp;
        this.RemoteActionCompatParcelizer = mcVar;
        this.serializer = dataModule_ProvideSchedulerFactory;
    }

    public r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I(backgroundTimerFiredI backgroundtimerfiredi, publishErrorlambda1 publisherrorlambda1, r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw) {
        this.write = 0;
        backgroundtimerfiredi.getClass();
        r8lambda6uovp7lvejigbq5knkop8a0veiw.getClass();
        this.IconCompatParcelizer = backgroundtimerfiredi;
        this.RemoteActionCompatParcelizer = publisherrorlambda1;
        this.serializer = r8lambda6uovp7lvejigbq5knkop8a0veiw;
    }

    public /* synthetic */ r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I(Object obj, mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, int i) {
        this.write = i;
        this.IconCompatParcelizer = obj;
        this.serializer = mergejsonobjects;
        this.RemoteActionCompatParcelizer = mergejsonobjects2;
    }

    public static StaticImageDecoder read(AndroidUiFrameClock androidUiFrameClock, Application application, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        int i = 2 % 2;
        application.getClass();
        isopeninternalroom_runtime.getClass();
        StaticImageDecoder staticImageDecoder = new StaticImageDecoder((performCustomExitMxy_nc0) EngineInterceptor.IconCompatParcelizer.getValue(application, EngineInterceptor.RemoteActionCompatParcelizer[0]), isopeninternalroom_runtime);
        int i2 = RatingCompat + 5;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return staticImageDecoder;
    }

    public r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I(r8lambdazpHrebeZ5dkHsk62AZggxj52Jpo r8lambdazphrebez5dkhsk62azggxj52jpo, getScrollRange getscrollrange, setPresentationView setpresentationview) {
        this.write = 9;
        r8lambdazphrebez5dkhsk62azggxj52jpo.getClass();
        setpresentationview.getClass();
        this.IconCompatParcelizer = r8lambdazphrebez5dkhsk62azggxj52jpo;
        this.RemoteActionCompatParcelizer = getscrollrange;
        this.serializer = setpresentationview;
    }

    public r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I(LocaleListHelperMethods localeListHelperMethods, r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i, LocaleListHelperMethods localeListHelperMethods2) {
        this.write = 4;
        localeListHelperMethods.getClass();
        r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i.getClass();
        this.IconCompatParcelizer = localeListHelperMethods;
        this.serializer = r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i;
        this.RemoteActionCompatParcelizer = localeListHelperMethods2;
    }

    public r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I(setUseTempTrackingTableroom_runtime setusetemptrackingtableroom_runtime, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, setPresentationView setpresentationview) {
        this.write = 28;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        setpresentationview.getClass();
        this.RemoteActionCompatParcelizer = setusetemptrackingtableroom_runtime;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.serializer = setpresentationview;
    }

    public r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I(setPresentationView setpresentationview, LocaleListHelperMethods localeListHelperMethods, LocaleListHelperMethods localeListHelperMethods2) {
        this.write = 5;
        setpresentationview.getClass();
        localeListHelperMethods.getClass();
        this.IconCompatParcelizer = setpresentationview;
        this.serializer = localeListHelperMethods;
        this.RemoteActionCompatParcelizer = localeListHelperMethods2;
    }

    public r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I(setPresentationView setpresentationview, getIterationDuration getiterationduration, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.write = 6;
        setpresentationview.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.IconCompatParcelizer = setpresentationview;
        this.RemoteActionCompatParcelizer = getiterationduration;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I(publishErrorlambda1 publisherrorlambda1, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2) {
        this.write = 11;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.RemoteActionCompatParcelizer = publisherrorlambda1;
    }

    public r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, generateAndroidFontKtForApiCompatibility generateandroidfontktforapicompatibility, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2) {
        this.write = 8;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.RemoteActionCompatParcelizer = generateandroidfontktforapicompatibility;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
    }

    public r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, SimpleExecutableQuery simpleExecutableQuery, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2) {
        this.write = 12;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.RemoteActionCompatParcelizer = simpleExecutableQuery;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
    }

    public r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, q0 q0Var, backgroundTimerFiredI backgroundtimerfiredi) {
        this.write = 29;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        q0Var.getClass();
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.serializer = q0Var;
        this.RemoteActionCompatParcelizer = backgroundtimerfiredi;
    }

    public r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I(q0 q0Var, getEditableText geteditabletext, hasNestedScrollingParent hasnestedscrollingparent) {
        this.write = 23;
        hasnestedscrollingparent.getClass();
        this.serializer = q0Var;
        this.RemoteActionCompatParcelizer = geteditabletext;
        this.IconCompatParcelizer = hasnestedscrollingparent;
    }

    public r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, getScrollRange getscrollrange) {
        this.write = 10;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.RemoteActionCompatParcelizer = getscrollrange;
    }

    public r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I(getContentDataType getcontentdatatype, backgroundTimerFiredI backgroundtimerfiredi, com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory) {
        this.write = 22;
        getcontentdatatype.getClass();
        dataModule_ProvideSchedulerFactory.getClass();
        this.IconCompatParcelizer = getcontentdatatype;
        this.RemoteActionCompatParcelizer = backgroundtimerfiredi;
        this.serializer = dataModule_ProvideSchedulerFactory;
    }

    public r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I(backgroundTimerFiredI backgroundtimerfiredi, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, postAnimationRunner postanimationrunner) {
        this.write = 17;
        backgroundtimerfiredi.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.IconCompatParcelizer = backgroundtimerfiredi;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.RemoteActionCompatParcelizer = postanimationrunner;
    }

    public r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I(ImageHeaderParserImageType imageHeaderParserImageType, postAnimationRunner postanimationrunner, postAnimationRunner postanimationrunner2, hasNestedScrollingParent hasnestedscrollingparent) {
        this.write = 13;
        postanimationrunner.getClass();
        hasnestedscrollingparent.getClass();
        this.IconCompatParcelizer = postanimationrunner;
        this.RemoteActionCompatParcelizer = postanimationrunner2;
        this.serializer = hasnestedscrollingparent;
    }

    public r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, setPresentationView setpresentationview) {
        this.write = 21;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.RemoteActionCompatParcelizer = setpresentationview;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = this.write;
        mergeJsonObjects mergejsonobjects = this.RemoteActionCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.serializer;
        Object obj = this.IconCompatParcelizer;
        Object obj2 = null;
        switch (i2) {
            case 0:
                Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) obj).write();
                objWrite.getClass();
                r8lambdaxxf_OxJQyqvagkBotvkQpFWGJ2k r8lambdaxxf_oxjqyqvagkbotvkqpfwgj2k = (r8lambdaxxf_OxJQyqvagkBotvkQpFWGJ2k) ((publishErrorlambda1) mergejsonobjects).write();
                Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite2.getClass();
                return new PushServiceRepository((r8lambdaxxf_OxJQyqvagkBotvkQpFWGJ2k) objWrite, r8lambdaxxf_oxjqyqvagkbotvkqpfwgj2k, (ExecuteApiRequest) objWrite2);
            case 1:
                return new N$b((mergelambda1) ((SingleProcessDataStore) obj).write(), (ExecuteApiRequest) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (unpackInt2) ((LayoutCompat) mergejsonobjects).write(), new Path$Companion());
            case 2:
                return new getClipgIe3tQ8((accessgetEllipsiscp) ((LayoutCompat) obj).write(), (accessgetMiddleEllipsiscp) ((LayoutCompat) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (CreateHomeScope) ((SimpleExecutableQuery) mergejsonobjects).write());
            case 3:
                return new ConfirmDeliveryUseCaseImpl((UploadPictureUseCaseImpl) ((mergeJsonObjects) obj).write(), (ConfirmDeliveryStepUseCaseImpl) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (MapSafetyReportResponse) ((getScrollRange) mergejsonobjects).write());
            case 4:
                Object objWrite3 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) obj).write();
                objWrite3.getClass();
                Object objWrite4 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite4.getClass();
                return new initlambda1((initlambda2) objWrite3, (hasNullSourcePosition) objWrite4, (unpackInt2) ((LocaleListHelperMethods) mergejsonobjects).write(), new AndroidUiFrameClock());
            case 5:
                Object objWrite5 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) obj).write();
                objWrite5.getClass();
                Object objWrite6 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite6.getClass();
                return new hasNullSourcePosition((Clock) objWrite5, (init) objWrite6, (initlambda2020) ((LocaleListHelperMethods) mergejsonobjects).write());
            case 6:
                Object objWrite7 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) obj).write();
                objWrite7.getClass();
                SendTestPushUseCase sendTestPushUseCase = (SendTestPushUseCase) ((getIterationDuration) mergejsonobjects).write();
                Object objWrite8 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite8.getClass();
                return new parseui_tooling((isOpenInternalroom_runtime) objWrite7, sendTestPushUseCase, (decode) objWrite8);
            case 7:
                return new TasksRepository((GetConfirmationStateImpl) ((mergeJsonObjects) obj).write(), (TransitionClock) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (NoopClock) ((getIterationDuration) mergejsonobjects).write());
            case 8:
                Object objWrite9 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) obj).write();
                objWrite9.getClass();
                MetricsBatchProcessor metricsBatchProcessor = (MetricsBatchProcessor) ((generateAndroidFontKtForApiCompatibility) mergejsonobjects).write();
                Object objWrite10 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite10.getClass();
                return new StateV3DeliveryProvider((accessrequireViewFactoryHolder) objWrite9, metricsBatchProcessor, (getContentViewGroupParentLayout) objWrite10);
            case 9:
                Object objWrite11 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) obj).write();
                objWrite11.getClass();
                accessgetMiddleEllipsiscp accessgetmiddleellipsiscp = (accessgetMiddleEllipsiscp) ((getScrollRange) mergejsonobjects).write();
                Object objWrite12 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite12.getClass();
                return new ObserveStackedDeliveryList((getMToDpValuesannotations) objWrite11, accessgetmiddleellipsiscp, (isOpenInternalroom_runtime) objWrite12);
            case 10:
                Lazy lazySerializer = getColorIntegerOrNull.serializer((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) obj);
                lazySerializer.getClass();
                Object objWrite13 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite13.getClass();
                return new ConstraintReferenceIncorrectConstraintException(lazySerializer, (setTransactionSuccessful) objWrite13, (setHorizontalStyle) ((getScrollRange) mergejsonobjects).write());
            case 11:
                Object objWrite14 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) obj).write();
                objWrite14.getClass();
                Object objWrite15 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite15.getClass();
                return new DataMigrationInitializerCompanionrunMigrations2((CorruptionException) objWrite14, (setTransactionSuccessful) objWrite15, (GetAppStateImpl) ((publishErrorlambda1) mergejsonobjects).write());
            case 12:
                Object objWrite16 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) obj).write();
                objWrite16.getClass();
                GetRiderNameUseCaseImpl getRiderNameUseCaseImpl = (GetRiderNameUseCaseImpl) ((SimpleExecutableQuery) mergejsonobjects).write();
                Object objWrite17 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite17.getClass();
                return new CombinedScopeView((setNextTransition) objWrite16, getRiderNameUseCaseImpl, (setTransactionSuccessful) objWrite17, 5);
            case 13:
                Object objWrite18 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) obj).write();
                objWrite18.getClass();
                getLayoutPosition getlayoutposition = (getLayoutPosition) ((postAnimationRunner) mergejsonobjects).write();
                Object objWrite19 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite19.getClass();
                return new getOldPosition((getAdapterPosition) objWrite18, getlayoutposition, (Application) objWrite19);
            case 14:
                return new InstantShiftRepository((isAdapterPositionUnknown) ((getSharedElementTargetNames) obj).write(), (ExecuteApiRequest) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (resetTransientState) mergejsonobjects.write());
            case 15:
                return compare.IconCompatParcelizer((onExitLayoutOrScroll) ((mergeJsonObjects) obj).write(), (setDistanceToTriggerSync) ((SimpleExecutableQuery) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
            case 16:
                return new GetLocationUpdatesUseCaseImpl((getPresentationContext) ((mergeJsonObjects) obj).write(), (isOpenInternalroom_runtime) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (r8lambdaJfSwS2PRWMpHRIytRV9qwrOw8s) ((r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY) mergejsonobjects).write());
            case 17:
                Object objWrite20 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) obj).write();
                objWrite20.getClass();
                Object objWrite21 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite21.getClass();
                Lazy lazySerializer2 = getColorIntegerOrNull.serializer(mergejsonobjects);
                lazySerializer2.getClass();
                Lazy lazySerializer3 = getColorIntegerOrNull.serializer((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) transactiondefault.read);
                lazySerializer3.getClass();
                return new FirebaseAnalyticsUserAttributesChangedListener((oc) objWrite20, (s2) objWrite21, lazySerializer2, lazySerializer3);
            case 18:
                return new T((SaveHeatmapUrlImpl) ((setPresentationView) obj).write(), new io.sentry.util.MediaBrowserCompatMediaItem(17), (RecenterMapTriggerImpl) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
            case 19:
                return new S((RecenterMapTriggerImpl) ((mergeJsonObjects) obj).write(), (E) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (dg) ((newTransaction) mergejsonobjects).write());
            case 20:
                Object objWrite22 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) obj).write();
                objWrite22.getClass();
                ma maVar = (ma) ((mc) mergejsonobjects).write();
                Object objWrite23 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite23.getClass();
                return new FetchMapboxRouteUseCase((getRearDisplayMetrics) objWrite22, maVar, (getAllSemanticsNodesToMap) objWrite23, (m3) mc.write.write());
            case 21:
                Lazy lazySerializer4 = getColorIntegerOrNull.serializer((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) obj);
                lazySerializer4.getClass();
                Object objWrite24 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite24.getClass();
                r1 r1Var = (r1) ((setPresentationView) mergejsonobjects).write();
                getIdentifiersValidationsEnabled getidentifiersvalidationsenabled = new getIdentifiersValidationsEnabled();
                getidentifiersvalidationsenabled.read = new qb(lazySerializer4);
                getidentifiersvalidationsenabled.write(r1Var);
                getidentifiersvalidationsenabled.write((qdExternalSyntheticLambda0) objWrite24);
                return getidentifiersvalidationsenabled;
            case 22:
                Object objWrite25 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) obj).write();
                objWrite25.getClass();
                ra raVar = (ra) ((backgroundTimerFiredI) mergejsonobjects).write();
                Object objWrite26 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite26.getClass();
                r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0 = (r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0) ((TraceTimeMeasurementWithPerformanceKit) ((getAllSemanticsNodesToMap) objWrite26)).read("provideCustomerChatOkHttpClient", new NetworkingCoreModule$$ExternalSyntheticLambda2((accessgetOldDependencyp) objWrite25, raVar));
                setNativeShader.RemoteActionCompatParcelizer(r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0, "Cannot return null from a non-@Nullable @Provides method");
                int i3 = RatingCompat + 49;
                read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    return r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0;
                }
                obj2.hashCode();
                throw null;
            case 23:
                q4ExternalSyntheticLambda9 q4externalsyntheticlambda9 = (q4ExternalSyntheticLambda9) ((q0) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write();
                r8lambda8MKYOLZlH_k8e1G4bUHcvyCf8WQ r8lambda8mkyolzlh_k8e1g4buhcvycf8wq = (r8lambda8MKYOLZlH_k8e1G4bUHcvyCf8WQ) ((getEditableText) mergejsonobjects).write();
                getActionViewIntentlambda0 getactionviewintentlambda0 = new getActionViewIntentlambda0();
                Object objWrite27 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) obj).write();
                objWrite27.getClass();
                return new PendingIntentBuilderImpl(q4externalsyntheticlambda9, r8lambda8mkyolzlh_k8e1g4buhcvycf8wq, getactionviewintentlambda0, (Application) objWrite27, new BrazeExternalSyntheticLambda5(3));
            case 24:
                return new HistoryApiRequest((z7) ((mergeJsonObjects) obj).write(), (z6) ((r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (ExecuteApiRequest) mergejsonobjects.write());
            case 25:
                return new SubcomposeContentPainterNode((getPunctuationEnd) ((mergeJsonObjects) obj).write(), (SubcomposeAsyncImagegl8XCv8) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (subscribeToPushNotificationEventslambda1) ((r8lambda31xVc6yTCUqSOPjA0Lc9HsR6ufI) mergejsonobjects).write());
            case 26:
                return new C$b((intercept) ((mergeJsonObjects) obj).write(), (unpackInt2) ((backgroundTimerFiredI) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (requestPermissions) mergejsonobjects.write());
            case 27:
                return read((AndroidUiFrameClock) obj, (Application) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
            case 28:
                GetAppStateImpl getAppStateImpl = (GetAppStateImpl) ((setUseTempTrackingTableroom_runtime) mergejsonobjects).write();
                Object objWrite28 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) obj).write();
                objWrite28.getClass();
                Object objWrite29 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite29.getClass();
                GetCustomerPhoneNumberUseCaseImpl getCustomerPhoneNumberUseCaseImpl = new GetCustomerPhoneNumberUseCaseImpl(getAppStateImpl, (transferSessionPackageI) objWrite28, (isOpenInternalroom_runtime) objWrite29);
                int i4 = read + 33;
                RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return getCustomerPhoneNumberUseCaseImpl;
                }
                throw null;
            default:
                Object objWrite30 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) obj).write();
                objWrite30.getClass();
                Object objWrite31 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite31.getClass();
                return new lambdaremoveGlobalCallbackParameter24((decode) objWrite30, (EnumColumnAdapter) objWrite31, (lambdasendReftagReferrer17) ((backgroundTimerFiredI) mergejsonobjects).write());
        }
    }
}
