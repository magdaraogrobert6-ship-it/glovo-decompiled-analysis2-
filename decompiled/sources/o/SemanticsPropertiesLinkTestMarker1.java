package o;

import android.app.Application;
import android.content.SharedPreferences;
import coil3.ImageLoader$Builder;
import com.google.android.play.core.appupdate.zzz;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.auth.data.LocalAuthDataSource;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.customerchat.legacy.core.usecases.PhoneNumberUseCase;
import com.roadrunner.customerchat.selfservice.data.cache.WebChatNativeCacheDataStore;
import com.roadrunner.customerchat.selfservice.data.cache.server.ChatAssetCacheLocalWebServer;
import com.roadrunner.customerchat.selfservice.data.remote.HelpCenterRemoteDataSourceImpl;
import com.roadrunner.delivery.accept.acknowledgment.implementation.data.StoreAcknowledgmentTimestampImpl;
import com.roadrunner.delivery.ontheway.destination.domain.GetDestinationAddressImpl;
import com.roadrunner.delivery.ontheway.entrancepicture.data.EntrancePictureRepository;
import com.roadrunner.delivery.ontheway.navigation.domain.GetNavigationButtonAction;
import com.roadrunner.delivery.ontheway.phonecall.PhoneNumberCallerImpl;
import com.roadrunner.delivery.ontheway.turnbyturn.analytics.loggers.TurnByTurnNavigationLogger;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.heatmap.domain.ShouldShowHeatmap_Factory;
import com.roadrunner.home.nest.data.NestComponentRepositoryImpl;
import java.time.Clock;

/* JADX INFO: loaded from: classes3.dex */
public final class SemanticsPropertiesLinkTestMarker1 implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 0;
    private static int MediaMetadataCompat = 1;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ RemoteActionCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ read;
    public final /* synthetic */ int serializer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ write;

    public SemanticsPropertiesLinkTestMarker1(FontVariationSettingInt fontVariationSettingInt, transformCanvas transformcanvas, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.serializer = 19;
        fontVariationSettingInt.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.read = fontVariationSettingInt;
        this.write = transformcanvas;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public /* synthetic */ SemanticsPropertiesLinkTestMarker1(mergeJsonObjects mergejsonobjects, getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, mergeJsonObjects mergejsonobjects2, int i) {
        this.serializer = i;
        this.read = mergejsonobjects;
        this.RemoteActionCompatParcelizer = getcolorintegerornulllambda0;
        this.write = mergejsonobjects2;
    }

    public /* synthetic */ SemanticsPropertiesLinkTestMarker1(mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, int i) {
        this.serializer = i;
        this.read = mergejsonobjects;
        this.write = mergejsonobjects2;
        this.RemoteActionCompatParcelizer = getcolorintegerornulllambda0;
    }

    public /* synthetic */ SemanticsPropertiesLinkTestMarker1(getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, getColorIntegerOrNulllambda0 getcolorintegerornulllambda1, mergeJsonObjects mergejsonobjects, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = getcolorintegerornulllambda0;
        this.read = mergejsonobjects;
        this.write = getcolorintegerornulllambda1;
    }

    public SemanticsPropertiesLinkTestMarker1(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, LayoutCompat layoutCompat) {
        this.serializer = 18;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.RemoteActionCompatParcelizer = layoutCompat;
    }

    public SemanticsPropertiesLinkTestMarker1(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, setVerticalBias setverticalbias) {
        this.serializer = 27;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.RemoteActionCompatParcelizer = setverticalbias;
    }

    public SemanticsPropertiesLinkTestMarker1(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, onMeasureChild onmeasurechild) {
        this.serializer = 17;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.RemoteActionCompatParcelizer = onmeasurechild;
    }

    public SemanticsPropertiesLinkTestMarker1(com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, setPresentationView setpresentationview) {
        this.serializer = 14;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        setpresentationview.getClass();
        this.read = dataModule_ProvideSchedulerFactory;
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.RemoteActionCompatParcelizer = setpresentationview;
    }

    public SemanticsPropertiesLinkTestMarker1(isContainerannotations iscontainerannotations, AbsSavedState absSavedState, ShouldShowHeatmap_Factory shouldShowHeatmap_Factory) {
        this.serializer = 23;
        iscontainerannotations.getClass();
        absSavedState.getClass();
        this.read = iscontainerannotations;
        this.write = absSavedState;
        this.RemoteActionCompatParcelizer = shouldShowHeatmap_Factory;
    }

    public SemanticsPropertiesLinkTestMarker1(setStateDescription setstatedescription, com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory, getContentDataType getcontentdatatype) {
        this.serializer = 7;
        setstatedescription.getClass();
        this.read = setstatedescription;
        this.write = dataModule_ProvideSchedulerFactory;
        this.RemoteActionCompatParcelizer = getcontentdatatype;
    }

    public SemanticsPropertiesLinkTestMarker1(LayoutHelperBidiRun layoutHelperBidiRun, LayoutHelperBidiRun layoutHelperBidiRun2, setPresentationView setpresentationview) {
        this.serializer = 16;
        layoutHelperBidiRun.getClass();
        setpresentationview.getClass();
        this.read = layoutHelperBidiRun;
        this.write = layoutHelperBidiRun2;
        this.RemoteActionCompatParcelizer = setpresentationview;
    }

    public SemanticsPropertiesLinkTestMarker1(FontVariationSettingInt fontVariationSettingInt, r8lambdazpHrebeZ5dkHsk62AZggxj52Jpo r8lambdazphrebez5dkhsk62azggxj52jpo, LocaleListHelperMethods localeListHelperMethods) {
        this.serializer = 20;
        fontVariationSettingInt.getClass();
        r8lambdazphrebez5dkhsk62azggxj52jpo.getClass();
        this.read = fontVariationSettingInt;
        this.write = r8lambdazphrebez5dkhsk62azggxj52jpo;
        this.RemoteActionCompatParcelizer = localeListHelperMethods;
    }

    public SemanticsPropertiesLinkTestMarker1(LocaleListHelperMethods localeListHelperMethods, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2) {
        this.serializer = 25;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.read = localeListHelperMethods;
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
    }

    public SemanticsPropertiesLinkTestMarker1(LocaleListHelperMethods localeListHelperMethods, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, byte b) {
        this.serializer = 26;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.read = localeListHelperMethods;
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
    }

    public SemanticsPropertiesLinkTestMarker1(r8lambdazpHrebeZ5dkHsk62AZggxj52Jpo r8lambdazphrebez5dkhsk62azggxj52jpo, setVerticalBias setverticalbias, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.serializer = 24;
        setverticalbias.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.read = r8lambdazphrebez5dkhsk62azggxj52jpo;
        this.write = setverticalbias;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public SemanticsPropertiesLinkTestMarker1(ShouldShowHeatmap_Factory shouldShowHeatmap_Factory, setPaddingBottom setpaddingbottom, setVerticalBias setverticalbias) {
        this.serializer = 28;
        shouldShowHeatmap_Factory.getClass();
        setpaddingbottom.getClass();
        this.read = shouldShowHeatmap_Factory;
        this.write = setpaddingbottom;
        this.RemoteActionCompatParcelizer = setverticalbias;
    }

    public SemanticsPropertiesLinkTestMarker1(getDoubleOrNull getdoubleornull, getDoubleOrNull getdoubleornull2, getDoubleOrNull getdoubleornull3) {
        this.serializer = 21;
        getdoubleornull.getClass();
        getdoubleornull2.getClass();
        this.read = getdoubleornull;
        this.write = getdoubleornull2;
        this.RemoteActionCompatParcelizer = getdoubleornull3;
    }

    public SemanticsPropertiesLinkTestMarker1(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, LocaleListHelperMethods localeListHelperMethods) {
        this.serializer = 29;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.RemoteActionCompatParcelizer = localeListHelperMethods;
    }

    public SemanticsPropertiesLinkTestMarker1(speculativeHit speculativehit, mergeJsonObjects mergejsonobjects, getEditableText geteditabletext, SharedPreferencesMigration sharedPreferencesMigration) {
        this.serializer = 2;
        this.read = mergejsonobjects;
        this.write = geteditabletext;
        this.RemoteActionCompatParcelizer = sharedPreferencesMigration;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 87;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.RemoteActionCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2 = this.write;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3 = this.read;
        switch (i4) {
            case 0:
                return new LocalAuthDataSource(getColorIntegerOrNull.serializer((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3), (SemanticsPropertiesIsPopup1) ((SemanticsPropertiesFillableData1) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (isOpenInternalroom_runtime) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write());
            case 1:
                return new IndirectPointerInputModifierNode((makeNativePaint) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (deleteGlobalPartnerParameters) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (accessgetPresscp) ((getEditableText) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 2:
                deleteGlobalPartnerParameters deleteglobalpartnerparameters = (deleteGlobalPartnerParameters) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                accessgetPresscp accessgetpresscp = (accessgetPresscp) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                access1000 access1000Var = (access1000) ((SharedPreferencesMigration) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write();
                deleteglobalpartnerparameters.getClass();
                accessgetpresscp.getClass();
                return new getPositionF1C5BW0(deleteglobalpartnerparameters, accessgetpresscp, access1000Var);
            case 3:
                return new isFakeui((SemanticsNodedefault) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (ImageLoader$Builder) ((SharedPreferencesMigration) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (mergedSemanticsConfiguration) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write());
            case 4:
                return new isSensitiveData((transferSessionPackageI) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (SendTestPushUseCase) ((getScrollRange) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (getDisabled) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write());
            case 5:
                return new onImeAction9UiTYpYdefault((getInputText) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (pageLeft) ((getContentDataType) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (setTransactionSuccessful) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write());
            case 6:
                return new SignInDataStore((transferSessionPackageI) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (showTextSubstitution) ((getEditableText) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (setTextCompositionRangepsREZIo) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write());
            case 7:
                Object objWrite = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite.getClass();
                return new getTombStone((metaMarkUpdated) objWrite, (getAllSemanticsNodesToMap) ((com.data.injection.DataModule_ProvideSchedulerFactory) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (accessgetOldDependencyp) ((getContentDataType) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 8:
                forEachNewCallbackNeverInvoked foreachnewcallbackneverinvoked = (forEachNewCallbackNeverInvoked) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                registerOnGlobalChange registeronglobalchange = (registerOnGlobalChange) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                SpannableExtensions_androidKt spannableExtensions_androidKt = (SpannableExtensions_androidKt) ((setVerticalBias) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write();
                foreachnewcallbackneverinvoked.getClass();
                registeronglobalchange.getClass();
                spannableExtensions_androidKt.getClass();
                ProtobufEncoder protobufEncoder = new ProtobufEncoder();
                protobufEncoder.write = foreachnewcallbackneverinvoked;
                protobufEncoder.serializer = registeronglobalchange;
                protobufEncoder.RemoteActionCompatParcelizer = spannableExtensions_androidKt;
                return protobufEncoder;
            case 9:
                return new PhoneNumberUseCase((linkedForEach) ((setStateDescription) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (getPivotOffsetF1C5BW0) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (withRect) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write());
            case 10:
                return new ChatAssetCacheLocalWebServer((isOpenInternalroom_runtime) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (WebChatNativeCacheDataStore) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (InitializeAppStartupItemsImpl) ((getEditableText) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 11:
                return new SignInDataStore((Application) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (isOpenInternalroom_runtime) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (String) ((fastMergej5T8yCg) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 12:
                AnnotatedStringKtnormalizedParagraphStylesinlinedsortedBy1 annotatedStringKtnormalizedParagraphStylesinlinedsortedBy1 = (AnnotatedStringKtnormalizedParagraphStylesinlinedsortedBy1) ((fastMergej5T8yCg) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write();
                AnnotatedStringExhaustiveAnnotation annotatedStringExhaustiveAnnotation = (AnnotatedStringExhaustiveAnnotation) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                HelpCenterRemoteDataSourceImpl helpCenterRemoteDataSourceImpl = (HelpCenterRemoteDataSourceImpl) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                annotatedStringKtnormalizedParagraphStylesinlinedsortedBy1.getClass();
                annotatedStringExhaustiveAnnotation.getClass();
                helpCenterRemoteDataSourceImpl.getClass();
                ProtobufEncoder protobufEncoder2 = new ProtobufEncoder();
                protobufEncoder2.write = annotatedStringKtnormalizedParagraphStylesinlinedsortedBy1;
                protobufEncoder2.serializer = annotatedStringExhaustiveAnnotation;
                protobufEncoder2.RemoteActionCompatParcelizer = helpCenterRemoteDataSourceImpl;
                return protobufEncoder2;
            case 13:
                return new addSpans((decode) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (registerOnChangedCallback) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (setViewToWindowMatrixQ8lPUPs) ((setStateDescription) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 14:
                TextUnitTypeSaverlambda1 textUnitTypeSaverlambda1 = (TextUnitTypeSaverlambda1) ((com.data.injection.DataModule_ProvideSchedulerFactory) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite2.getClass();
                Object objWrite3 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite3.getClass();
                return new StoreAcknowledgmentTimestampImpl(textUnitTypeSaverlambda1, (androidx.work.impl.WorkManagerImpl) objWrite2, (Clock) objWrite3);
            case 15:
                return new SignInDataStore((NestComponentRepositoryImpl) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (AnalyticsServiceImpl) ((fastMergej5T8yCg) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (unpackInt1) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write());
            case 16:
                Object objWrite4 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite4.getClass();
                zzz zzzVar = (zzz) ((LayoutHelperBidiRun) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                Object objWrite5 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite5.getClass();
                return new isIncluded((analyzeBidi) objWrite4, zzzVar, (isOpenInternalroom_runtime) objWrite5);
            case 17:
                Object objWrite6 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite6.getClass();
                setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) objWrite6;
                Object objWrite7 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite7.getClass();
                InitializeAppStartupItemsImpl initializeAppStartupItemsImpl = (InitializeAppStartupItemsImpl) ((onMeasureChild) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write();
                ProtobufEncoder protobufEncoder3 = new ProtobufEncoder();
                protobufEncoder3.write = (transferSessionPackageI) objWrite7;
                protobufEncoder3.serializer = initializeAppStartupItemsImpl;
                protobufEncoder3.RemoteActionCompatParcelizer = new f6(fc.BOTTOM, settransactionsuccessful.write(com.logistics.rider.glovo.R.integer.map_pin_offset_horizontal), settransactionsuccessful.write(com.logistics.rider.glovo.R.integer.map_pin_offset_vertical));
                return protobufEncoder3;
            case 18:
                Object objWrite8 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite8.getClass();
                Object objWrite9 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite9.getClass();
                return new FontVariationSetting((transferSessionPackageI) objWrite8, (com.data.util.sharedPreferences.SharedPreferencesManagerImpl) objWrite9, (zzz) ((LayoutCompat) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 19:
                Object objWrite10 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite10.getClass();
                InitializeAppStartupItemsImpl initializeAppStartupItemsImpl2 = (InitializeAppStartupItemsImpl) ((transformCanvas) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                Object objWrite11 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite11.getClass();
                return new ProtobufEncoder((DeleteSurroundingTextInCodePointsCommand) objWrite10, initializeAppStartupItemsImpl2, (requestGeofences) objWrite11);
            case 20:
                Object objWrite12 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite12.getClass();
                Object objWrite13 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite13.getClass();
                return new LocaleList((makeSureAvailableSpace) objWrite12, (ensureOpenSession) objWrite13, (SaveHeatmapUrlImpl) ((LocaleListHelperMethods) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 21:
                Object objWrite14 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite14.getClass();
                Object objWrite15 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite15.getClass();
                Object obj = ((getDoubleOrNull) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write;
                obj.getClass();
                SignInDataStore signInDataStore = new SignInDataStore((getOffsetMapping) objWrite14, (accessgetSendcp) objWrite15, (VisualTransformation) obj);
                int i5 = MediaMetadataCompat + 43;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 44 / 0;
                }
                return signInDataStore;
            case 22:
                return new SignInDataStore((EntrancePictureRepository) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (n6) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (unpackInt2) ((LayoutCompat) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 23:
                Object objWrite16 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite16.getClass();
                Object objWrite17 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite17.getClass();
                GetNavigationButtonAction getNavigationButtonAction = new GetNavigationButtonAction((GetDestinationAddressImpl) objWrite16, (copy8_81llAdefault) objWrite17, (LineBreak_androidKt) ((ShouldShowHeatmap_Factory) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
                int i7 = IconCompatParcelizer + 121;
                MediaMetadataCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    return getNavigationButtonAction;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            case 24:
                SendTestPushUseCase sendTestPushUseCase = (SendTestPushUseCase) ((r8lambdazpHrebeZ5dkHsk62AZggxj52Jpo) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                Object objWrite18 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite18.getClass();
                Object objWrite19 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite19.getClass();
                return new PhoneNumberCallerImpl(sendTestPushUseCase, (SpannableExtensions_androidKt) objWrite18, (localeSpan) objWrite19);
            case 25:
                GraphicsLayerCompanion graphicsLayerCompanion = (GraphicsLayerCompanion) ((LocaleListHelperMethods) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                Object objWrite20 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite20.getClass();
                Object objWrite21 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite21.getClass();
                return new resolveBulletTextUnitToPxo2QH7mI(graphicsLayerCompanion, (performViewCreated) objWrite20, (transferSessionPackageI) objWrite21);
            case 26:
                applySpanStyle applyspanstyle = (applySpanStyle) ((LocaleListHelperMethods) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                Object objWrite22 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite22.getClass();
                Object objWrite23 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite23.getClass();
                return new TextPaintExtensions_androidKt(applyspanstyle, (SharedPreferences) objWrite22, (setTransactionSuccessful) objWrite23);
            case 27:
                Object objWrite24 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite24.getClass();
                Object objWrite25 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite25.getClass();
                return new ProtobufEncoder((transferSessionPackageI) objWrite24, (i3) objWrite25, (InitializeAppStartupItemsImpl) ((setVerticalBias) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 28:
                Object objWrite26 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite26.getClass();
                Object objWrite27 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite27.getClass();
                return new getLooseusljTpc((getUnspecifiedusljTpc) objWrite26, (TurnByTurnNavigationLogger) objWrite27, (setBaselineShift0ocSgnM) ((setVerticalBias) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            default:
                Object objWrite28 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite28.getClass();
                Object objWrite29 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite29.getClass();
                return new accessunpackByte3((GraphicsLayerCompanion) ((LocaleListHelperMethods) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (performViewCreated) objWrite28, (transferSessionPackageI) objWrite29);
        }
    }
}
