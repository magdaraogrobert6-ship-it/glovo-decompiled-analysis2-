package o;

import android.app.Application;
import coil3.ImageLoader$Builder;
import com.google.android.play.core.appupdate.zzz;
import com.google.re2j.Parser;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.bubble.presentation.GetBubbleUiState;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.customerchat.selfservice.data.cache.ChatAssetCacheManager;
import com.roadrunner.customerchat.selfservice.data.cache.WebChatNativeCacheDataStore;
import com.roadrunner.customerchat.selfservice.data.remote.HelpCenterRemoteDataSourceImpl;
import com.roadrunner.customerchat.selfservice.domain.analytics.NativeCacheEventsTrackerImpl;
import com.roadrunner.customerchat.selfservice.domain.analytics.WebChatEventsTrackerImpl;
import com.roadrunner.delivery.accept.laststop.data.RecentLastStopsDatastoreImpl;
import com.roadrunner.delivery.accept.laststop.domain.GetLastStopScreenUseCaseImpl;
import com.roadrunner.delivery.accept.laststop.domain.LastStopSelectionCoordinator;
import com.roadrunner.delivery.accept.repository.DeliveryAcceptDataRepository;
import com.roadrunner.delivery.common.analytics.DeliveryAcceptanceLogger;
import com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository;
import com.roadrunner.delivery.pickupdropoff.tasks.data.GetConfirmationStateImpl;
import com.roadrunner.experience_tools.braze.BrazeManagerImpl;
import com.roadrunner.feedback.data.domain.GetFeedbackDataUseCase;
import com.roadrunner.freelancing.presentation.tab.GetWorkOpportunityTypeSelectorUiState;
import com.roadrunner.freelancing.presentation.tab.ShouldShowTabs;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.incognia.implementation.IncogniaInitializerImpl;
import com.roadrunner.localPushNotifications.smartPolling.domain.AutoAcceptLocalPushHandlerImpl;
import com.roadrunner.localPushNotifications.smartPolling.domain.DeliveryAcceptanceLocalPushNotificationFactoryImpl;
import com.roadrunner.location.core.domain.ObserveDistanceToLocationUseCaseImpl;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.push.DialogMessageRequestProxy;
import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;
import com.roadrunner.rider.state.shift.GetCourierShiftInfoImpl;
import com.sentiance.core.model.events.H$b;
import com.sentiance.core.model.events.N$b;
import dagger.Lazy;
import io.grpc.internal.CallTracer;
import io.grpc.internal.SharedResourcePool;
import io.sentry.CombinedScopeView;
import java.time.Clock;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class insertBasedOnParentOffset implements getColorIntegerOrNulllambda0 {
    private static int MediaMetadataCompat = 0;
    private static int RatingCompat = 1;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ read;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ serializer;
    public final mergeJsonObjects write;

    public insertBasedOnParentOffset(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, setVerticalBias setverticalbias, AbsSavedState absSavedState, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2) {
        this.RemoteActionCompatParcelizer = 17;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        absSavedState.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.write = setverticalbias;
        this.read = absSavedState;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
    }

    public /* synthetic */ insertBasedOnParentOffset(mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, mergeJsonObjects mergejsonobjects3, mergeJsonObjects mergejsonobjects4, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = mergejsonobjects;
        this.read = mergejsonobjects2;
        this.IconCompatParcelizer = mergejsonobjects3;
        this.write = mergejsonobjects4;
    }

    public insertBasedOnParentOffset(FontVariationSettingInt fontVariationSettingInt, FontVariationSettingInt fontVariationSettingInt2, FontVariationSettingInt fontVariationSettingInt3, LayoutCompat layoutCompat) {
        this.RemoteActionCompatParcelizer = 14;
        fontVariationSettingInt.getClass();
        fontVariationSettingInt2.getClass();
        layoutCompat.getClass();
        this.serializer = fontVariationSettingInt;
        this.read = fontVariationSettingInt2;
        this.write = fontVariationSettingInt3;
        this.IconCompatParcelizer = layoutCompat;
    }

    public insertBasedOnParentOffset(FontVariationSettingInt fontVariationSettingInt, r8lambdazpHrebeZ5dkHsk62AZggxj52Jpo r8lambdazphrebez5dkhsk62azggxj52jpo, AbsSavedState absSavedState, getDoubleOrNull getdoubleornull) {
        this.RemoteActionCompatParcelizer = 12;
        fontVariationSettingInt.getClass();
        r8lambdazphrebez5dkhsk62azggxj52jpo.getClass();
        absSavedState.getClass();
        this.serializer = fontVariationSettingInt;
        this.read = r8lambdazphrebez5dkhsk62azggxj52jpo;
        this.IconCompatParcelizer = absSavedState;
        this.write = getdoubleornull;
    }

    public insertBasedOnParentOffset(LocaleListHelperMethods localeListHelperMethods, r8lambdazpHrebeZ5dkHsk62AZggxj52Jpo r8lambdazphrebez5dkhsk62azggxj52jpo, transformCanvas transformcanvas, LayoutCompat layoutCompat) {
        this.RemoteActionCompatParcelizer = 15;
        localeListHelperMethods.getClass();
        r8lambdazphrebez5dkhsk62azggxj52jpo.getClass();
        layoutCompat.getClass();
        this.serializer = localeListHelperMethods;
        this.read = r8lambdazphrebez5dkhsk62azggxj52jpo;
        this.write = transformcanvas;
        this.IconCompatParcelizer = layoutCompat;
    }

    public insertBasedOnParentOffset(insertBasedOnParentOffset insertbasedonparentoffset, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, SemanticsPropertiesLinkTestMarker1 semanticsPropertiesLinkTestMarker1, com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory) {
        this.RemoteActionCompatParcelizer = 8;
        insertbasedonparentoffset.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        semanticsPropertiesLinkTestMarker1.getClass();
        this.serializer = insertbasedonparentoffset;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.IconCompatParcelizer = semanticsPropertiesLinkTestMarker1;
        this.write = dataModule_ProvideSchedulerFactory;
    }

    public insertBasedOnParentOffset(hasNestedScrollingParent hasnestedscrollingparent, AbsSavedState absSavedState, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, setPresentationView setpresentationview) {
        this.RemoteActionCompatParcelizer = 22;
        hasnestedscrollingparent.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        setpresentationview.getClass();
        this.serializer = hasnestedscrollingparent;
        this.write = absSavedState;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.IconCompatParcelizer = setpresentationview;
    }

    public insertBasedOnParentOffset(publishErrorlambda1 publisherrorlambda1, com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory2) {
        this.RemoteActionCompatParcelizer = 0;
        publisherrorlambda1.getClass();
        dataModule_ProvideSchedulerFactory.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.serializer = publisherrorlambda1;
        this.read = dataModule_ProvideSchedulerFactory;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.write = dataModule_ProvideSchedulerFactory2;
    }

    public insertBasedOnParentOffset(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, getContentDataType getcontentdatatype, getScrollRange getscrollrange, r8lambdagJlqvKShRNmP25JfHDBcPsgUwKQ r8lambdagjlqvkshrnmp25jfhdbcpsguwkq) {
        this.RemoteActionCompatParcelizer = 23;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        getcontentdatatype.getClass();
        r8lambdagjlqvkshrnmp25jfhdbcpsguwkq.getClass();
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = getcontentdatatype;
        this.write = getscrollrange;
        this.IconCompatParcelizer = r8lambdagjlqvkshrnmp25jfhdbcpsguwkq;
    }

    public insertBasedOnParentOffset(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, insertBasedOnParentOffset insertbasedonparentoffset, lineEndToVisibleEnd lineendtovisibleend, fillBoundingBoxes fillboundingboxes) {
        this.RemoteActionCompatParcelizer = 11;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        insertbasedonparentoffset.getClass();
        fillboundingboxes.getClass();
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = insertbasedonparentoffset;
        this.write = lineendtovisibleend;
        this.IconCompatParcelizer = fillboundingboxes;
    }

    public insertBasedOnParentOffset(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, setVerticalBias setverticalbias, SingleProcessDataStore singleProcessDataStore) {
        this.RemoteActionCompatParcelizer = 24;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        singleProcessDataStore.getClass();
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.write = setverticalbias;
        this.IconCompatParcelizer = singleProcessDataStore;
    }

    public insertBasedOnParentOffset(transformCanvas transformcanvas, setPresentationView setpresentationview, fillBoundingBoxes fillboundingboxes, setPresentationView setpresentationview2) {
        this.RemoteActionCompatParcelizer = 9;
        transformcanvas.getClass();
        setpresentationview.getClass();
        setpresentationview2.getClass();
        this.serializer = transformcanvas;
        this.read = setpresentationview;
        this.write = fillboundingboxes;
        this.IconCompatParcelizer = setpresentationview2;
    }

    public insertBasedOnParentOffset(getScrollRange getscrollrange, getScrollRange getscrollrange2, r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i, getScrollRange getscrollrange3) {
        this.RemoteActionCompatParcelizer = 21;
        getscrollrange.getClass();
        getscrollrange2.getClass();
        r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i.getClass();
        this.serializer = getscrollrange;
        this.read = getscrollrange2;
        this.IconCompatParcelizer = r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i;
        this.write = getscrollrange3;
    }

    public insertBasedOnParentOffset(q0 q0Var, postAnimationRunner postanimationrunner, buildEventPackage buildeventpackage, setSyncPolicyOfflineStatuslambda1 setsyncpolicyofflinestatuslambda1) {
        this.RemoteActionCompatParcelizer = 28;
        q0Var.getClass();
        postanimationrunner.getClass();
        setsyncpolicyofflinestatuslambda1.getClass();
        this.serializer = q0Var;
        this.read = postanimationrunner;
        this.write = buildeventpackage;
        this.IconCompatParcelizer = setsyncpolicyofflinestatuslambda1;
    }

    public insertBasedOnParentOffset(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3, onMeasureChild onmeasurechild) {
        this.RemoteActionCompatParcelizer = 25;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
        this.write = onmeasurechild;
    }

    public insertBasedOnParentOffset(transformCanvas transformcanvas, getShapedelegate getshapedelegate, convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0, accessgetTextBottomcp accessgettextbottomcp) {
        this.RemoteActionCompatParcelizer = 10;
        transformcanvas.getClass();
        getshapedelegate.getClass();
        convertstringjsonarraytolistlambda0.getClass();
        this.serializer = transformcanvas;
        this.read = getshapedelegate;
        this.IconCompatParcelizer = convertstringjsonarraytolistlambda0;
        this.write = accessgettextbottomcp;
    }

    public insertBasedOnParentOffset(r8lambda31xVc6yTCUqSOPjA0Lc9HsR6ufI r8lambda31xvc6ytcuqsopja0lc9hsr6ufi, r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw, getEditableText geteditabletext, LayoutCompat layoutCompat) {
        this.RemoteActionCompatParcelizer = 13;
        r8lambda31xvc6ytcuqsopja0lc9hsr6ufi.getClass();
        r8lambda6uovp7lvejigbq5knkop8a0veiw.getClass();
        geteditabletext.getClass();
        this.serializer = r8lambda31xvc6ytcuqsopja0lc9hsr6ufi;
        this.read = r8lambda6uovp7lvejigbq5knkop8a0veiw;
        this.IconCompatParcelizer = geteditabletext;
        this.write = layoutCompat;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        mergeJsonObjects mergejsonobjects = this.write;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.IconCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2 = this.read;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3 = this.serializer;
        switch (i2) {
            case 0:
                Object objWrite = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite.getClass();
                Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite2.getClass();
                Object objWrite3 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite3.getClass();
                GetBubbleUiState getBubbleUiState = new GetBubbleUiState((GetRiderStatusImpl) objWrite, (moveBasedOnParentOffset) objWrite2, (setTransactionSuccessful) objWrite3, (zzz) ((com.data.injection.DataModule_ProvideSchedulerFactory) mergejsonobjects).write());
                int i3 = MediaMetadataCompat + 73;
                RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return getBubbleUiState;
            case 1:
                DialogMessageRequestProxy dialogMessageRequestProxy = (DialogMessageRequestProxy) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                getPress4ZHQPSE getpress4zhqpse = (getPress4ZHQPSE) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                getMove4ZHQPSE getmove4zhqpse = (getMove4ZHQPSE) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write();
                SharedResourcePool sharedResourcePool = (SharedResourcePool) ((setUseTempTrackingTableroom_runtime) mergejsonobjects).write();
                dialogMessageRequestProxy.getClass();
                getpress4zhqpse.getClass();
                getmove4zhqpse.getClass();
                return new accessgetReleasecp(dialogMessageRequestProxy, getpress4zhqpse, getmove4zhqpse, sharedResourcePool);
            case 2:
                return new SemanticsProperties_androidKt((setShowingTextSubstitution) ((setStateDescription) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (setTextCompositionRangepsREZIo) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (setTextSubstitutiondefault) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (transferSessionPackageI) mergejsonobjects.write());
            case 3:
                return new N$b((transferSessionPackageI) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (showTextSubstitution) ((getEditableText) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (setTextCompositionRangepsREZIo) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (Parser.Pair) ((invokeqtAw6s) mergejsonobjects).write());
            case 4:
                return new r8lambda0dL3NwAAnESqa66IBFAXKvH5HU((endPrefixMapping) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (HelpCenterRemoteDataSourceImpl) ((setSyncPolicyOfflineStatuslambda1) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (isOpenInternalroom_runtime) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (AnnotatedStringExhaustiveAnnotation) mergejsonobjects.write());
            case 5:
                return new NativeCacheEventsTrackerImpl((com.roadrunner.customerchat.selfservice.domain.analytics.AnalyticsImpl) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (com.huawei.agconnect.config.impl.m) ((fastMergej5T8yCg) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (isOpenInternalroom_runtime) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (registerOnChangedCallback) mergejsonobjects.write());
            case 6:
                return new WebChatEventsTrackerImpl((com.roadrunner.customerchat.selfservice.domain.analytics.AnalyticsImpl) ((r8lambda6UOvp7lvejigbq5knKoP8A0vEiw) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (InitializeAppStartupItemsImpl) ((fastMergej5T8yCg) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (isOpenInternalroom_runtime) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (registerOnChangedCallback) mergejsonobjects.write());
            case 7:
                startDocument startdocument = (startDocument) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                WebChatNativeCacheDataStore webChatNativeCacheDataStore = (WebChatNativeCacheDataStore) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                zzz zzzVar = (zzz) ((getEditableText) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write();
                ChatAssetCacheManager chatAssetCacheManager = (ChatAssetCacheManager) mergejsonobjects.write();
                startdocument.getClass();
                webChatNativeCacheDataStore.getClass();
                zzzVar.getClass();
                chatAssetCacheManager.getClass();
                ImageLoader$Builder imageLoader$Builder = new ImageLoader$Builder();
                imageLoader$Builder.RemoteActionCompatParcelizer = startdocument;
                imageLoader$Builder.IconCompatParcelizer = webChatNativeCacheDataStore;
                imageLoader$Builder.read = zzzVar;
                imageLoader$Builder.serializer = chatAssetCacheManager;
                return imageLoader$Builder;
            case 8:
                Object objWrite4 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite4.getClass();
                Object objWrite5 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite5.getClass();
                Object objWrite6 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite6.getClass();
                return new getAnnotatedStringSaver((ClickableSaverlambda1) objWrite4, (getPivotOffsetF1C5BW0) objWrite5, (TextUnitTypeSaverlambda0) objWrite6, (VerbatimTtsAnnotationSaverlambda1) ((com.data.injection.DataModule_ProvideSchedulerFactory) mergejsonobjects).write());
            case 9:
                Object objWrite7 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite7.getClass();
                Object objWrite8 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite8.getClass();
                getLineForVerticalUnbounded getlineforverticalunbounded = (getLineForVerticalUnbounded) ((fillBoundingBoxes) mergejsonobjects).write();
                Object objWrite9 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite9.getClass();
                return new getLayoutannotations((RecentLastStopsDatastoreImpl) objWrite7, (isOpenInternalroom_runtime) objWrite8, getlineforverticalunbounded, (Clock) objWrite9);
            case 10:
                Object objWrite10 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite10.getClass();
                Lazy lazySerializer = getColorIntegerOrNull.serializer(r8lambdaktwlyipskq3tfa9ey3gatonixfq2);
                lazySerializer.getClass();
                Object objWrite11 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite11.getClass();
                return new LastStopSelectionCoordinator((GetLastStopScreenUseCaseImpl) objWrite10, lazySerializer, (DeliveryAcceptanceLogger) objWrite11, (getRearDisplayMetrics) ((accessgetTextBottomcp) mergejsonobjects).write());
            case 11:
                Object objWrite12 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite12.getClass();
                Object objWrite13 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite13.getClass();
                getFallbackLineSpacing getfallbacklinespacing = (getFallbackLineSpacing) ((lineEndToVisibleEnd) mergejsonobjects).write();
                Object objWrite14 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite14.getClass();
                return new getLineForVertical((LastStopSelectionCoordinator) objWrite12, (getLayoutannotations) objWrite13, getfallbacklinespacing, (getLineForVerticalUnbounded) objWrite14);
            case 12:
                Object objWrite15 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite15.getClass();
                Object objWrite16 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite16.getClass();
                Object objWrite17 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite17.getClass();
                Object obj = ((getDoubleOrNull) mergejsonobjects).write;
                obj.getClass();
                return new isPunctuationui_text((WordSegmentFinder) objWrite15, (getMultiplier) objWrite16, (copyO0kMr_c) objWrite17, (StaticLayoutFactory35) obj);
            case 13:
                Object objWrite18 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite18.getClass();
                getIdentifiersValidationsEnabled getidentifiersvalidationsenabled = (getIdentifiersValidationsEnabled) objWrite18;
                Path$Companion path$Companion = new Path$Companion();
                Object objWrite19 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite19.getClass();
                ExecuteApiRequest executeApiRequest = (ExecuteApiRequest) objWrite19;
                Object objWrite20 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite20.getClass();
                copyGSF8kmg copygsf8kmg = (copyGSF8kmg) objWrite20;
                unpackInt1 unpackint1 = (unpackInt1) ((LayoutCompat) mergejsonobjects).write();
                getidentifiersvalidationsenabled.write("http://localhost/");
                Object objWrite21 = getidentifiersvalidationsenabled.write().write(isStrikethroughText.class);
                objWrite21.getClass();
                return new DeliveryAcceptDataRepository((isStrikethroughText) objWrite21, path$Companion, executeApiRequest, copygsf8kmg, unpackint1);
            case 14:
                Object objWrite22 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite22.getClass();
                Object objWrite23 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite23.getClass();
                unpackInt2 unpackint2 = (unpackInt2) ((FontVariationSettingInt) mergejsonobjects).write();
                Object objWrite24 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite24.getClass();
                return new gapLength((delete) objWrite22, (toCharArray) objWrite23, unpackint2, (getNoneeUduSuo) objWrite24);
            case 15:
                Object objWrite25 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite25.getClass();
                Object objWrite26 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite26.getClass();
                H$b h$b = (H$b) ((transformCanvas) mergejsonobjects).write();
                Object objWrite27 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite27.getClass();
                return new getComposePaint((getBrushui_textannotations) objWrite25, (clearShader) objWrite26, h$b, (getNoneeUduSuo) objWrite27);
            case 16:
                accessgetFalseyp accessgetfalseyp = new accessgetFalseyp((accessrequireViewFactoryHolder) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (r8lambdalVQGMqHtfjmEwPaE6dqnfDBlU) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (getActionViewIntentlambda0) getShaderStateui_text.RemoteActionCompatParcelizer.write(), (ObserveDistanceToLocationUseCaseImpl) ((newTransaction) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (transferSessionPackageI) mergejsonobjects.write());
                int i5 = MediaMetadataCompat + 49;
                RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    int i6 = 84 / 0;
                }
                return accessgetfalseyp;
            case 17:
                Object objWrite28 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite28.getClass();
                InitializeAppStartupItemsImpl initializeAppStartupItemsImpl = (InitializeAppStartupItemsImpl) ((setVerticalBias) mergejsonobjects).write();
                Object objWrite29 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite29.getClass();
                Object objWrite30 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite30.getClass();
                return new LineBreakStrategyCompanion((getHeadingrAG3T2k) objWrite28, initializeAppStartupItemsImpl, (copy8_81llAdefault) objWrite29, (accessgetParagraphcp) objWrite30);
            case 18:
                return new getAnimationClocksui_tooling((RouterLogger) ((onMeasureChild) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (setTransactionSuccessful) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (decode) mergejsonobjects.write());
            case 19:
                return new GetConfirmationStateImpl((isOpenInternalroom_runtime) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (ConfirmationRepository) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (SaveHeatmapUrlImpl) ((r8lambdazpHrebeZ5dkHsk62AZggxj52Jpo) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (withRect) mergejsonobjects.write());
            case 20:
                return new getUnspecifiedRKDOV3M((setInitialStateToCurrentAnimationValue) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (r8lambdaGtlc562Nvrrf3JdxYhx1fNZ8ac) ((accessgetTextBottomcp) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), new AndroidUiFrameClock(), (createClocklambda0) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (openSessionlambda1) mergejsonobjects.write());
            case 21:
                Object objWrite31 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite31.getClass();
                setHorizontalStyle sethorizontalstyle = (setHorizontalStyle) objWrite31;
                Object objWrite32 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite32.getClass();
                setLastVerticalBias setlastverticalbias = (setLastVerticalBias) objWrite32;
                Object objWrite33 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite33.getClass();
                return new setHorizontalGap(sethorizontalstyle, setlastverticalbias, (setFirstVerticalBias) objWrite33, new setRoundRectOutlineTNW_H78default(8), (removeSingleSubscriptionlambda101) ((getScrollRange) mergejsonobjects).write());
            case 22:
                Object objWrite34 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite34.getClass();
                setMinWidth setminwidth = (setMinWidth) ((AbsSavedState) mergejsonobjects).write();
                Object objWrite35 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite35.getClass();
                Object objWrite36 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite36.getClass();
                return new BrazeManagerImpl((Application) objWrite34, setminwidth, (transferSessionPackageI) objWrite35, (isOpenInternalroom_runtime) objWrite36);
            case 23:
                Object objWrite37 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite37.getClass();
                Object objWrite38 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite38.getClass();
                SaveHeatmapUrlImpl saveHeatmapUrlImpl = (SaveHeatmapUrlImpl) ((getScrollRange) mergejsonobjects).write();
                Object objWrite39 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite39.getClass();
                return new GetFeedbackDataUseCase((transferSessionPackageI) objWrite37, (accessgetOldDependencyp) objWrite38, saveHeatmapUrlImpl, (GetCourierShiftInfoImpl) objWrite39);
            case 24:
                Object objWrite40 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite40.getClass();
                Object objWrite41 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite41.getClass();
                ShouldShowTabs shouldShowTabs = (ShouldShowTabs) ((setVerticalBias) mergejsonobjects).write();
                Object objWrite42 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite42.getClass();
                return new GetWorkOpportunityTypeSelectorUiState((setTransactionSuccessful) objWrite40, (vg) objWrite41, shouldShowTabs, (IconCompat) objWrite42);
            case 25:
                Object objWrite43 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite43.getClass();
                Object objWrite44 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite44.getClass();
                Object objWrite45 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite45.getClass();
                return new performOptionsMenuClosed((performViewCreated) objWrite43, (requestPermissions) objWrite44, (getHeadingrAG3T2k) objWrite45, (RouterLogger) ((onMeasureChild) mergejsonobjects).write());
            case 26:
                Application application = (Application) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                CallTracer callTracer = (CallTracer) ((insertBasedOnParentOffset) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                getAllSemanticsNodesToMap getallsemanticsnodestomap = (getAllSemanticsNodesToMap) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write();
                decode decodeVar = (decode) mergejsonobjects.write();
                application.getClass();
                getallsemanticsnodestomap.getClass();
                decodeVar.getClass();
                return new IncogniaInitializerImpl(application, callTracer, getallsemanticsnodestomap, decodeVar);
            case 27:
                return new CallTracer((setTransacterruntime) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (addChangePayload) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (zzz) ((getEditableText) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (transferSessionPackageI) mergejsonobjects.write());
            case 28:
                Object objWrite46 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite46.getClass();
                Object objWrite47 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite47.getClass();
                AutoAcceptLocalPushHandlerImpl autoAcceptLocalPushHandlerImpl = (AutoAcceptLocalPushHandlerImpl) ((buildEventPackage) mergejsonobjects).write();
                Object objWrite48 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite48.getClass();
                return new DeliveryAcceptanceLocalPushNotificationFactoryImpl((PrefetchNetworkException) objWrite46, (setPageTransformer) objWrite47, autoAcceptLocalPushHandlerImpl, (getIdJ3iCeTQ) objWrite48);
            default:
                return new ColumnAdapter((GetRiderStatusImpl) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (getTouchaOaMEAU) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (getContentViewGroupParentLayout) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (CombinedScopeView) ((newTransaction) mergejsonobjects).write());
        }
    }
}
