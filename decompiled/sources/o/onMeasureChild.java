package o;

import com.google.re2j.Parser;
import com.huawei.location.Vw$Vw;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.customerchat.usecases.CustomerChatCommunicatorImpl;
import com.roadrunner.delivery.ontheway.phonecall.PhoneNumberCallerImpl;
import com.roadrunner.delivery.ontheway.phonecall.UnifiedPhoneCallerImpl;
import com.roadrunner.delivery.ontheway.routepreview.naver.domain.FetchRoutePreviewRoutes;
import com.roadrunner.delivery.pickupdropoff.domain.ObservePuDoDeliveriesResponseImpl;
import com.roadrunner.delivery.stacked.delivery.list.domain.ObserveStackedDeliveryList;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.face.verification.data.SelfieFlowRepository;
import com.roadrunner.feedback.data.domain.GetFeedbackDataUseCase;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.heatmap.domain.ShouldShowHeatmap_Factory;
import com.roadrunner.heatmap.domain.ValidateAndSaveHeatmapResponseImpl;
import com.roadrunner.helpcenter.businessmetrics.repo.BusinessMetricsRepository;
import com.roadrunner.home.CreateHomeScope;
import com.roadrunner.home.nest.data.NestComponentRepositoryImpl;
import com.roadrunner.login.logging.RouterLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class onMeasureChild implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ RemoteActionCompatParcelizer;
    public final mergeJsonObjects read;
    public final /* synthetic */ int write;

    public onMeasureChild(setUseTempTrackingTableroom_runtime setusetemptrackingtableroom_runtime, SetTargetFragmentUsageViolation setTargetFragmentUsageViolation) {
        this.write = 27;
        setusetemptrackingtableroom_runtime.getClass();
        this.RemoteActionCompatParcelizer = setusetemptrackingtableroom_runtime;
        this.read = setTargetFragmentUsageViolation;
    }

    public /* synthetic */ onMeasureChild(mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, int i) {
        this.write = i;
        this.RemoteActionCompatParcelizer = mergejsonobjects;
        this.read = mergejsonobjects2;
    }

    public onMeasureChild(LocaleListHelperMethods localeListHelperMethods, r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw) {
        this.write = 7;
        r8lambda6uovp7lvejigbq5knkop8a0veiw.getClass();
        this.read = localeListHelperMethods;
        this.RemoteActionCompatParcelizer = r8lambda6uovp7lvejigbq5knkop8a0veiw;
    }

    public onMeasureChild(getScrollRange getscrollrange, r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw) {
        this.write = 22;
        r8lambda6uovp7lvejigbq5knkop8a0veiw.getClass();
        this.read = getscrollrange;
        this.RemoteActionCompatParcelizer = r8lambda6uovp7lvejigbq5knkop8a0veiw;
    }

    public onMeasureChild(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, accessgetRelayoutTimep accessgetrelayouttimep) {
        this.write = 8;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = accessgetrelayouttimep;
    }

    public onMeasureChild(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, ShouldShowHeatmap_Factory shouldShowHeatmap_Factory) {
        this.write = 23;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = shouldShowHeatmap_Factory;
    }

    public onMeasureChild(com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.write = 3;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.read = dataModule_ProvideSchedulerFactory;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public onMeasureChild(SemanticsPropertiesLinkTestMarker1 semanticsPropertiesLinkTestMarker1, LayoutCompat layoutCompat) {
        this.write = 12;
        semanticsPropertiesLinkTestMarker1.getClass();
        this.RemoteActionCompatParcelizer = semanticsPropertiesLinkTestMarker1;
        this.read = layoutCompat;
    }

    public onMeasureChild(SemanticsPropertiesLinkTestMarker1 semanticsPropertiesLinkTestMarker1, r8lambda31xVc6yTCUqSOPjA0Lc9HsR6ufI r8lambda31xvc6ytcuqsopja0lc9hsr6ufi) {
        this.write = 6;
        semanticsPropertiesLinkTestMarker1.getClass();
        this.RemoteActionCompatParcelizer = semanticsPropertiesLinkTestMarker1;
        this.read = r8lambda31xvc6ytcuqsopja0lc9hsr6ufi;
    }

    public onMeasureChild(setStateDescription setstatedescription, FontVariationSettingInt fontVariationSettingInt) {
        this.write = 4;
        setstatedescription.getClass();
        this.RemoteActionCompatParcelizer = setstatedescription;
        this.read = fontVariationSettingInt;
    }

    public onMeasureChild(insertBasedOnParentOffset insertbasedonparentoffset, getScrollRange getscrollrange) {
        this.write = 0;
        insertbasedonparentoffset.getClass();
        this.RemoteActionCompatParcelizer = insertbasedonparentoffset;
        this.read = getscrollrange;
    }

    public onMeasureChild(FontVariationSettingInt fontVariationSettingInt, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.write = 1;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = fontVariationSettingInt;
    }

    public onMeasureChild(LocaleListHelperMethods localeListHelperMethods, r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw, byte b) {
        this.write = 9;
        r8lambda6uovp7lvejigbq5knkop8a0veiw.getClass();
        this.read = localeListHelperMethods;
        this.RemoteActionCompatParcelizer = r8lambda6uovp7lvejigbq5knkop8a0veiw;
    }

    public onMeasureChild(LocaleListHelperMethods localeListHelperMethods, setPresentationView setpresentationview) {
        this.write = 11;
        setpresentationview.getClass();
        this.read = localeListHelperMethods;
        this.RemoteActionCompatParcelizer = setpresentationview;
    }

    public onMeasureChild(r8lambdazpHrebeZ5dkHsk62AZggxj52Jpo r8lambdazphrebez5dkhsk62azggxj52jpo, getScrollRange getscrollrange) {
        this.write = 17;
        r8lambdazphrebez5dkhsk62azggxj52jpo.getClass();
        this.RemoteActionCompatParcelizer = r8lambdazphrebez5dkhsk62azggxj52jpo;
        this.read = getscrollrange;
    }

    public onMeasureChild(r8lambdazpHrebeZ5dkHsk62AZggxj52Jpo r8lambdazphrebez5dkhsk62azggxj52jpo, publishErrorlambda1 publisherrorlambda1) {
        this.write = 20;
        publisherrorlambda1.getClass();
        this.read = r8lambdazphrebez5dkhsk62azggxj52jpo;
        this.RemoteActionCompatParcelizer = publisherrorlambda1;
    }

    public onMeasureChild(onMeasureChild onmeasurechild, accessgetTextBottomcp accessgettextbottomcp) {
        this.write = 10;
        accessgettextbottomcp.getClass();
        this.read = onmeasurechild;
        this.RemoteActionCompatParcelizer = accessgettextbottomcp;
    }

    public onMeasureChild(SingleProcessDataStore singleProcessDataStore, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.write = 24;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.read = singleProcessDataStore;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public onMeasureChild(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i) {
        this.write = 19;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i;
    }

    public onMeasureChild(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, backgroundTimerFiredI backgroundtimerfiredi) {
        this.write = 2;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = backgroundtimerfiredi;
    }

    public onMeasureChild(LocaleListHelperMethods localeListHelperMethods, r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i) {
        this.write = 18;
        localeListHelperMethods.getClass();
        this.RemoteActionCompatParcelizer = localeListHelperMethods;
        this.read = r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = 13;
        int i3 = IconCompatParcelizer + 13;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.write;
        mergeJsonObjects mergejsonobjects = this.read;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.RemoteActionCompatParcelizer;
        switch (i5) {
            case 0:
                Object objWrite = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite.getClass();
                return new RouterLogger((GetFeedbackDataUseCase) objWrite, 11, (shouldSkipDump) ((getScrollRange) mergejsonobjects).write());
            case 1:
                Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite2.getClass();
                return new InitializeAppStartupItemsImpl((transferSessionPackageI) objWrite2, 17, (opticalSizingR2X_6o) ((FontVariationSettingInt) mergejsonobjects).write());
            case 2:
                Object objWrite3 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite3.getClass();
                return new FontVariationSettingTextUnit((setTransactionSuccessful) objWrite3, (shouldSkipDump) ((backgroundTimerFiredI) mergejsonobjects).write());
            case 3:
                GraphicsLayerCompanion graphicsLayerCompanion = (GraphicsLayerCompanion) ((com.data.injection.DataModule_ProvideSchedulerFactory) mergejsonobjects).write();
                Object objWrite4 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite4.getClass();
                return new InitializeAppStartupItemsImpl(graphicsLayerCompanion, (transferSessionPackageI) objWrite4);
            case 4:
                Object objWrite5 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite5.getClass();
                return new ImeActionCompanion((CustomerChatCommunicatorImpl) objWrite5, (AndroidFontUtils_androidKt) ((FontVariationSettingInt) mergejsonobjects).write());
            case 5:
                return new com.huawei.agconnect.config.impl.m((n6) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (unpackInt2) ((LayoutCompat) mergejsonobjects).write());
            case 6:
                Object objWrite6 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite6.getClass();
                UnifiedPhoneCallerImpl unifiedPhoneCallerImpl = new UnifiedPhoneCallerImpl((PhoneNumberCallerImpl) objWrite6, (com.huawei.wisesecurity.ucs_credential.n0) ((r8lambda31xVc6yTCUqSOPjA0Lc9HsR6ufI) mergejsonobjects).write());
                int i6 = serializer + 119;
                IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    return unifiedPhoneCallerImpl;
                }
                throw null;
            case 7:
                getSpanUnitR2X_6oannotations getspanunitr2x_6oannotations = (getSpanUnitR2X_6oannotations) ((LocaleListHelperMethods) mergejsonobjects).write();
                Object objWrite7 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite7.getClass();
                Vw$Vw vw$Vw = new Vw$Vw(getspanunitr2x_6oannotations, 23, (ExecuteApiRequest) objWrite7);
                int i7 = serializer + 97;
                IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return vw$Vw;
            case 8:
                Object objWrite8 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite8.getClass();
                return new resolveLineHeightInPxo2QH7mI((accessgetParagraphcp) objWrite8, (androidx.work.impl.WorkerWrapper.Builder) ((accessgetRelayoutTimep) mergejsonobjects).write());
            case 9:
                setBackgroundRPmYEkk setbackgroundrpmyekk = (setBackgroundRPmYEkk) ((LocaleListHelperMethods) mergejsonobjects).write();
                Object objWrite9 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite9.getClass();
                return new InitializeAppStartupItemsImpl(setbackgroundrpmyekk, 24, (ExecuteApiRequest) objWrite9);
            case 10:
                InitializeAppStartupItemsImpl initializeAppStartupItemsImpl = (InitializeAppStartupItemsImpl) ((onMeasureChild) mergejsonobjects).write();
                Object objWrite10 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite10.getClass();
                accessdraw accessdrawVar = new accessdraw();
                accessdrawVar.serializer = true;
                return new FetchRoutePreviewRoutes(initializeAppStartupItemsImpl, (getRearDisplayMetrics) objWrite10, accessdrawVar);
            case 11:
                accessgetSubscriptcp accessgetsubscriptcp = (accessgetSubscriptcp) ((LocaleListHelperMethods) mergejsonobjects).write();
                com.huawei.wisesecurity.ucs_credential.g0 g0Var = (com.huawei.wisesecurity.ucs_credential.g0) accessgetSuperscriptcp.write.write();
                Object objWrite11 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite11.getClass();
                return new SendTestPushUseCase(accessgetsubscriptcp, g0Var, (isOpenInternalroom_runtime) objWrite11);
            case 12:
                Object objWrite12 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite12.getClass();
                return new accessgetProportionalcp((accessunpackByte3) objWrite12, (packBytes) ((LayoutCompat) mergejsonobjects).write());
            case 13:
                return new getClipgIe3tQ8annotations((accessgetEllipsiscp) ((LayoutCompat) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (accessrequireViewFactoryHolder) mergejsonobjects.write());
            case 14:
                return new ComposeViewAdapterFakeActivityResultRegistryOwner1activityResultRegistry1(new getActionViewIntentlambda0(), (i2) ((setIsRecyclable) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (defaultParamCount) ((accessgetTextBottomcp) mergejsonobjects).write());
            case 15:
                return new findData((setInitialStateToCurrentAnimationValue) ((internalPathIteratorRawSize) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (createClocklambda0) ((r8lambdazpHrebeZ5dkHsk62AZggxj52Jpo) mergejsonobjects).write());
            case 16:
                return new RouterLogger((ObservePuDoDeliveriesResponseImpl) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (CreateHomeScope) ((getIterationDuration) mergejsonobjects).write());
            case 17:
                Object objWrite13 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite13.getClass();
                return new RouterLogger((createClocklambda0) objWrite13, 6, (BrazeExternalSyntheticLambda206) ((getScrollRange) mergejsonobjects).write());
            case 18:
                Object objWrite14 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite14.getClass();
                return new RouterLogger((initlambda2) objWrite14, (hasNullSourcePosition) ((r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I) mergejsonobjects).write(), new AndroidUiFrameClock(), 9);
            case 19:
                Object objWrite15 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite15.getClass();
                return new RouterLogger((transferSessionPackageI) objWrite15, 10, (ObserveStackedDeliveryList) ((r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I) mergejsonobjects).write());
            case 20:
                ((r8lambdazpHrebeZ5dkHsk62AZggxj52Jpo) mergejsonobjects).write();
                Object objWrite16 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite16.getClass();
                return new ConstraintLayoutMeasurer();
            case 21:
                return new SelfieFlowRepository((ConstraintSet) ((SingleProcessDataStore) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (ExecuteApiRequest) mergejsonobjects.write());
            case 22:
                deleteUnlistedNotificationChannels deleteunlistednotificationchannels = (deleteUnlistedNotificationChannels) ((getScrollRange) mergejsonobjects).write();
                Object objWrite17 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite17.getClass();
                return new Parser.Pair(deleteunlistednotificationchannels, 20, (ExecuteApiRequest) objWrite17);
            case 23:
                Object objWrite18 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite18.getClass();
                return new RouterLogger((CorruptionException) objWrite18, i2, (invokeSuspendcomroadrunnercustomerchatusecaseChatAssetDownloadingObserverImplonCreate111) ((ShouldShowHeatmap_Factory) mergejsonobjects).write());
            case 24:
                SaveHeatmapUrlImpl saveHeatmapUrlImpl = (SaveHeatmapUrlImpl) ((SingleProcessDataStore) mergejsonobjects).write();
                Object objWrite19 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite19.getClass();
                return new ValidateAndSaveHeatmapResponseImpl(saveHeatmapUrlImpl, (resetTransientState) objWrite19);
            case 25:
                return new BusinessMetricsRepository((ExecuteApiRequest) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (SingleProcessDataStoredata11) ((SingleProcessDataStore) mergejsonobjects).write());
            case 26:
                RouterLogger routerLogger = new RouterLogger((DialogFragment2) ((SingleProcessDataStore) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (ExecuteApiRequest) mergejsonobjects.write());
                int i9 = IconCompatParcelizer + 77;
                serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return routerLogger;
            case 27:
                Object objWrite20 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite20.getClass();
                return new GetTargetFragmentRequestCodeUsageViolation((FragmentState1) objWrite20, (GetRetainInstanceUsageViolation) ((SetTargetFragmentUsageViolation) mergejsonobjects).write());
            case 28:
                return new NestComponentRepositoryImpl((SwitchPreference) ((getSharedElementTargetNames) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (ExecuteApiRequest) mergejsonobjects.write());
            default:
                return new processDisappeared((setSubsessionInterval) ((publishErrorlambda1) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (transferSessionPackageI) mergejsonobjects.write());
        }
    }
}
