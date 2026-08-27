package com.roadrunner.designsystem.mode.discovery;

import android.net.Uri;
import android.os.Bundle;
import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.re2j.Parser;
import com.huawei.wisesecurity.ucs_credential.n0;
import com.mapbox.navigation.core.MapboxNavigation$parsing$2;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.SwitcherUiModelImpl$1;
import com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.logger.QrPaymentEventLoggerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.navigation.QrScanTaskArgs;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.pin.PinScreenViewModel;
import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.TakePictureTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.InAppCameraWithTagsFragment;
import com.roadrunner.delivery.state.Trigger;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda0;
import com.roadrunner.face.verification.presentation.selfie.SelfieFlowViewModel;
import com.roadrunner.face.verification.presentation.selfie.SelfieFlowViewModel$submitSelfie$1;
import com.roadrunner.home.HomeViewModel;
import com.roadrunner.home.nest.NestFragment;
import com.roadrunner.home.nest.NestScreenKt$NestScreen$1$1;
import com.roadrunner.login.logging.OtpLogger;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C0195provider;
import o.ComposeAnimationState;
import o.DpOffset;
import o.ExperimentalUnitApi;
import o.FontScaling;
import o.FontScalingDefaultImpls;
import o.FontScalingLinearDefaultImpls;
import o.IntOffset;
import o.IntOffsetCompanion;
import o.PreviewContainer;
import o.PreviewWrapper;
import o.ShortNewsContentCardView;
import o.copya9UjIt4;
import o.copyiSbpLlY;
import o.createFromParcel;
import o.divGh9hcWk;
import o.getCameraProvider;
import o.getDisplayName;
import o.getHeightD9Ej5fM;
import o.getQueryContext;
import o.getRawTypeimpl;
import o.getReferencedIds;
import o.getSpUIouoOA;
import o.getStatusBarBackground;
import o.getTopD9Ej5fMannotations;
import o.getYD9Ej5fM;
import o.isAppSetIdReadingEnabled;
import o.lerp81ZRxRo;
import o.onDependentViewRemoved;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setIds;
import o.setNativeShader;
import o.setNavigationOnClickListener;
import o.timesadjELrA;
import o.unaryMinusXSAIIZE;
import o.valueOf;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 extends FunctionReferenceImpl implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int read = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.IconCompatParcelizer = i3;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        getDisplayName getdisplayname;
        ComposeAnimationState composeAnimationState;
        PreviewWrapper previewWrapper;
        List list;
        PreviewContainer previewContainer;
        List list2;
        Object obj;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = 19;
        int i4 = write + 19;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        int i6 = this.IconCompatParcelizer;
        FontScalingLinearDefaultImpls fontScalingLinearDefaultImpls = FontScalingLinearDefaultImpls.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i7 = 28;
        int i8 = 6;
        int i9 = 10;
        int i10 = 3;
        ShortNewsContentCardView shortNewsContentCardView = null;
        switch (i6) {
            case 0:
                DarkModeDiscoveryDialogFragment darkModeDiscoveryDialogFragment = (DarkModeDiscoveryDialogFragment) this.MediaMetadataCompat;
                darkModeDiscoveryDialogFragment.getParentFragmentManager().write((Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{new onViewAttachedToWindowlambda0[]{new onViewAttachedToWindowlambda0("go_to_settings", Boolean.FALSE)}}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320), "dark_mode_discovery_result");
                darkModeDiscoveryDialogFragment.read(false, false);
                return createfromparcel;
            case 1:
                getTopD9Ej5fMannotations gettopd9ej5fmannotations = (getTopD9Ej5fMannotations) this.MediaMetadataCompat;
                gettopd9ej5fmannotations.getClass();
                gettopd9ej5fmannotations.serializer(new copya9UjIt4(gettopd9ej5fmannotations, i));
                return createfromparcel;
            case 2:
                getTopD9Ej5fMannotations gettopd9ej5fmannotations2 = (getTopD9Ej5fMannotations) this.MediaMetadataCompat;
                gettopd9ej5fmannotations2.getClass();
                gettopd9ej5fmannotations2.serializer(new copya9UjIt4(gettopd9ej5fmannotations2, 4));
                return createfromparcel;
            case 3:
                getTopD9Ej5fMannotations gettopd9ej5fmannotations3 = (getTopD9Ej5fMannotations) this.MediaMetadataCompat;
                gettopd9ej5fmannotations3.getClass();
                gettopd9ej5fmannotations3.serializer(new GestureNodeKt$$ExternalSyntheticLambda0(new copya9UjIt4(gettopd9ej5fmannotations3, i10), i9));
                return createfromparcel;
            case 4:
                getTopD9Ej5fMannotations gettopd9ej5fmannotations4 = (getTopD9Ej5fMannotations) this.MediaMetadataCompat;
                gettopd9ej5fmannotations4.getClass();
                gettopd9ej5fmannotations4.serializer(new GestureNodeKt$$ExternalSyntheticLambda0(new copya9UjIt4(gettopd9ej5fmannotations4, i8), i9));
                return createfromparcel;
            case 5:
                getTopD9Ej5fMannotations gettopd9ej5fmannotations5 = (getTopD9Ej5fMannotations) this.MediaMetadataCompat;
                gettopd9ej5fmannotations5.getClass();
                gettopd9ej5fmannotations5.serializer(new GestureNodeKt$$ExternalSyntheticLambda0(new copya9UjIt4(gettopd9ej5fmannotations5, 5), i9));
                return createfromparcel;
            case 6:
                getHeightD9Ej5fM getheightd9ej5fm = (getHeightD9Ej5fM) this.MediaMetadataCompat;
                Object obj2 = getheightd9ej5fm.ParcelableVolumeInfo.read();
                getYD9Ej5fM getyd9ej5fm = obj2 instanceof getYD9Ej5fM ? (getYD9Ej5fM) obj2 : null;
                C0195provider c0195provider = getyd9ej5fm != null ? getyd9ej5fm.IconCompatParcelizer : null;
                if (c0195provider != null && (getdisplayname = c0195provider.qrCode) != null) {
                    int i11 = read + 3;
                    write = i11 % Fields.SpotShadowColor;
                    if (i11 % 2 != 0) {
                        PreviewWrapper previewWrapper2 = getdisplayname.qrPaymentScreen;
                        shortNewsContentCardView.hashCode();
                        throw null;
                    }
                    PreviewWrapper previewWrapper3 = getdisplayname.qrPaymentScreen;
                    if (previewWrapper3 != null && (composeAnimationState = previewWrapper3.closeButton) != null) {
                        int i12 = write + 79;
                        read = i12 % Fields.SpotShadowColor;
                        if (i12 % 2 == 0) {
                            List list3 = composeAnimationState.trackingEvents;
                            throw null;
                        }
                        List list4 = composeAnimationState.trackingEvents;
                        if (list4 != null) {
                            QrPaymentEventLoggerImpl qrPaymentEventLoggerImpl = getheightd9ej5fm.MediaSessionCompatQueueItem;
                            qrPaymentEventLoggerImpl.getClass();
                            qrPaymentEventLoggerImpl.read(list4, Trigger.BUTTON_CLICK);
                        }
                    }
                }
                getheightd9ej5fm.MediaMetadataCompat.serializer(DpOffset.serializer);
                return createfromparcel;
            case 7:
                getHeightD9Ej5fM getheightd9ej5fm2 = (getHeightD9Ej5fM) this.MediaMetadataCompat;
                Object obj3 = getheightd9ej5fm2.ParcelableVolumeInfo.read();
                getYD9Ej5fM getyd9ej5fm2 = obj3 instanceof getYD9Ej5fM ? (getYD9Ej5fM) obj3 : null;
                C0195provider c0195provider2 = getyd9ej5fm2 != null ? getyd9ej5fm2.IconCompatParcelizer : null;
                if (c0195provider2 != null) {
                    int i13 = read + 1;
                    write = i13 % Fields.SpotShadowColor;
                    if (i13 % 2 != 0) {
                        getDisplayName getdisplayname2 = c0195provider2.qrCode;
                        shortNewsContentCardView.hashCode();
                        throw null;
                    }
                    getDisplayName getdisplayname3 = c0195provider2.qrCode;
                    if (getdisplayname3 != null && (previewWrapper = getdisplayname3.qrPaymentScreen) != null && (list = previewWrapper.trackingEvents) != null) {
                        QrPaymentEventLoggerImpl qrPaymentEventLoggerImpl2 = getheightd9ej5fm2.MediaSessionCompatQueueItem;
                        qrPaymentEventLoggerImpl2.getClass();
                        qrPaymentEventLoggerImpl2.read(list, Trigger.DELIVERIES_TASK_READY);
                    }
                }
                return createfromparcel;
            case 8:
                IntOffsetCompanion intOffsetCompanion = (IntOffsetCompanion) this.MediaMetadataCompat;
                intOffsetCompanion.read.serializer(new FontScalingDefaultImpls(intOffsetCompanion.IconCompatParcelizer, intOffsetCompanion.MediaDescriptionCompat, intOffsetCompanion.MediaSessionCompatQueueItem));
                return createfromparcel;
            case 9:
                IntOffsetCompanion intOffsetCompanion2 = (IntOffsetCompanion) this.MediaMetadataCompat;
                BuildersKt.RemoteActionCompatParcelizer(intOffsetCompanion2.serializer, null, null, new HomeViewModel.AnonymousClass1(intOffsetCompanion2, shortNewsContentCardView, i8), 3);
                intOffsetCompanion2.read.serializer(FontScaling.write);
                return createfromparcel;
            case 10:
                IntOffsetCompanion intOffsetCompanion3 = (IntOffsetCompanion) this.MediaMetadataCompat;
                Object obj4 = intOffsetCompanion3.write.read();
                copyiSbpLlY copyisbplly = obj4 instanceof copyiSbpLlY ? (copyiSbpLlY) obj4 : null;
                if (copyisbplly != null && (previewContainer = copyisbplly.RemoteActionCompatParcelizer) != null) {
                    int i14 = read + 3;
                    write = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    ComposeAnimationState composeAnimationState2 = previewContainer.enterPinButton;
                    if (composeAnimationState2 != null && (list2 = composeAnimationState2.trackingEvents) != null) {
                        BuildersKt.RemoteActionCompatParcelizer(intOffsetCompanion3.serializer, null, null, new SwitcherUiModelImpl$1.AnonymousClass1(intOffsetCompanion3, list2, shortNewsContentCardView, i7), 3);
                    }
                }
                intOffsetCompanion3.read.serializer(new ExperimentalUnitApi(intOffsetCompanion3.IconCompatParcelizer, intOffsetCompanion3.MediaDescriptionCompat, intOffsetCompanion3.MediaSessionCompatQueueItem));
                return createfromparcel;
            case 11:
                ((PinScreenViewModel) this.MediaMetadataCompat).MediaBrowserCompatMediaItem.serializer(divGh9hcWk.IconCompatParcelizer);
                return createfromparcel;
            case 12:
                ((lerp81ZRxRo) this.MediaMetadataCompat).RatingCompat.serializer(fontScalingLinearDefaultImpls);
                return createfromparcel;
            case 13:
                lerp81ZRxRo lerp81zrxro = (lerp81ZRxRo) this.MediaMetadataCompat;
                getQueryContext getquerycontext = lerp81zrxro.RatingCompat;
                QrScanTaskArgs qrScanTaskArgs = (QrScanTaskArgs) lerp81zrxro.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
                if (qrScanTaskArgs == null) {
                    int i16 = read + 81;
                    write = i16 % Fields.SpotShadowColor;
                    if (i16 % 2 != 0) {
                        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("No arguments passed to QrScannerFragment", Timber.RemoteActionCompatParcelizer);
                        getquerycontext.serializer(fontScalingLinearDefaultImpls);
                        int i17 = 11 / 0;
                    } else {
                        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("No arguments passed to QrScannerFragment", Timber.RemoteActionCompatParcelizer);
                        getquerycontext.serializer(fontScalingLinearDefaultImpls);
                    }
                } else {
                    getquerycontext.serializer(new IntOffset(qrScanTaskArgs.write, qrScanTaskArgs.read, qrScanTaskArgs.serializer));
                }
                return createfromparcel;
            case 14:
                ((TakePictureTaskUiModelImpl) this.MediaMetadataCompat).RemoteActionCompatParcelizer();
                return createfromparcel;
            case 15:
                ((TakePictureTaskUiModelImpl) this.MediaMetadataCompat).write();
                return createfromparcel;
            case 16:
                ((InAppCameraWithTagsFragment) this.MediaMetadataCompat).serializer().MediaSessionCompatQueueItem.serializer(new getRawTypeimpl(null));
                return createfromparcel;
            case 17:
                unaryMinusXSAIIZE unaryminusxsaiizeSerializer = ((InAppCameraWithTagsFragment) this.MediaMetadataCompat).serializer();
                Uri uri = Uri.EMPTY;
                uri.getClass();
                unaryminusxsaiizeSerializer.write(uri);
                if (unaryminusxsaiizeSerializer.RemoteActionCompatParcelizer()) {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("InAppCameraWithTagsViewModel:  Camera Security Fix: ENABLED. Creating new ImageCapture instance for Retake.", new Object[0]);
                    unaryminusxsaiizeSerializer.RemoteActionCompatParcelizer.getClass();
                    unaryminusxsaiizeSerializer.MediaDescriptionCompat = new getCameraProvider(2).write();
                }
                return createfromparcel;
            case 18:
                unaryMinusXSAIIZE unaryminusxsaiizeSerializer2 = ((InAppCameraWithTagsFragment) this.MediaMetadataCompat).serializer();
                unaryminusxsaiizeSerializer2.MediaSessionCompatQueueItem.serializer(new getRawTypeimpl(unaryminusxsaiizeSerializer2.serializer().read.toString()));
                return createfromparcel;
            case 19:
                InAppCameraWithTagsFragment inAppCameraWithTagsFragment = (InAppCameraWithTagsFragment) this.MediaMetadataCompat;
                unaryMinusXSAIIZE unaryminusxsaiizeSerializer3 = inAppCameraWithTagsFragment.serializer();
                Executor mainExecutor = inAppCameraWithTagsFragment.requireContext().getMainExecutor();
                mainExecutor.getClass();
                String str = inAppCameraWithTagsFragment.serializer().serializer().serializer;
                RetryWithDelay$$ExternalSyntheticLambda0 retryWithDelay$$ExternalSyntheticLambda0 = new RetryWithDelay$$ExternalSyntheticLambda0(12, inAppCameraWithTagsFragment);
                NestFragment.AnonymousClass1 anonymousClass1 = new NestFragment.AnonymousClass1(1, inAppCameraWithTagsFragment, InAppCameraWithTagsFragment.class, "handlePictureError", "handlePictureError(Ljava/lang/Throwable;)V", 0, 2);
                n0 n0Var = unaryminusxsaiizeSerializer3.MediaSessionCompatToken;
                setNavigationOnClickListener setnavigationonclicklistenerWrite = unaryminusxsaiizeSerializer3.write();
                n0Var.getClass();
                setnavigationonclicklistenerWrite.getClass();
                setnavigationonclicklistenerWrite.serializer(new valueOf(new File(str), null), mainExecutor, new Parser.Pair(anonymousClass1, i3, retryWithDelay$$ExternalSyntheticLambda0));
                return createfromparcel;
            case 20:
                ((timesadjELrA) this.MediaMetadataCompat).IconCompatParcelizer.serializer(getSpUIouoOA.read);
                return createfromparcel;
            case 21:
                DarkModeDiscoveryDialogFragment darkModeDiscoveryDialogFragment2 = (DarkModeDiscoveryDialogFragment) this.MediaMetadataCompat;
                darkModeDiscoveryDialogFragment2.getParentFragmentManager().write((Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{new onViewAttachedToWindowlambda0[]{new onViewAttachedToWindowlambda0("go_to_settings", Boolean.TRUE)}}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320), "dark_mode_discovery_result");
                darkModeDiscoveryDialogFragment2.read(false, false);
                return createfromparcel;
            case 22:
                ((getReferencedIds) this.MediaMetadataCompat).MediaMetadataCompat.serializer(setIds.write);
                return createfromparcel;
            case 23:
                getReferencedIds getreferencedids = (getReferencedIds) this.MediaMetadataCompat;
                OtpLogger otpLogger = getreferencedids.MediaSessionCompatQueueItem;
                otpLogger.getClass();
                Map mapSingletonMap = Collections.singletonMap("NotificationTestScreenAction", "fix_device_token");
                mapSingletonMap.getClass();
                otpLogger.IconCompatParcelizer.logEvent("notif_test_fix_token_action", mapSingletonMap);
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Start fixing device token", new Object[0]);
                r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(getreferencedids, new MapboxNavigation$parsing$2(getreferencedids, shortNewsContentCardView, 8));
                return createfromparcel;
            case 24:
                MutableStateFlow mutableStateFlow = ((SelfieFlowViewModel) this.MediaMetadataCompat).write;
                do {
                    obj = mutableStateFlow.read();
                } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj, onDependentViewRemoved.write((onDependentViewRemoved) obj, false, false, false, 0, true, 95)));
                int i18 = read + 39;
                write = i18 % Fields.SpotShadowColor;
                if (i18 % 2 != 0) {
                    int i19 = 28 / 0;
                }
                return createfromparcel;
            case 25:
                NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$1 = (NestScreenKt$NestScreen$1$1) ((getStatusBarBackground) this.MediaMetadataCompat).serializer.serializer;
                if (nestScreenKt$NestScreen$1$1 != null) {
                    nestScreenKt$NestScreen$1$1.invoke();
                }
                return createfromparcel;
            case 26:
                SelfieFlowViewModel selfieFlowViewModel = (SelfieFlowViewModel) this.MediaMetadataCompat;
                selfieFlowViewModel.getClass();
                r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(selfieFlowViewModel, new MapboxNavigation$parsing$2(selfieFlowViewModel, shortNewsContentCardView, i9));
                return createfromparcel;
            case 27:
                SelfieFlowViewModel selfieFlowViewModel2 = (SelfieFlowViewModel) this.MediaMetadataCompat;
                selfieFlowViewModel2.getClass();
                r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(selfieFlowViewModel2, new SelfieFlowViewModel$submitSelfie$1(selfieFlowViewModel2, true, null));
                selfieFlowViewModel2.MediaBrowserCompatMediaItem.IconCompatParcelizer.logEvent("selfie_consent_automated", null);
                return createfromparcel;
            case 28:
                SelfieFlowViewModel selfieFlowViewModel3 = (SelfieFlowViewModel) this.MediaMetadataCompat;
                OtpLogger otpLogger2 = selfieFlowViewModel3.MediaBrowserCompatMediaItem;
                String str2 = selfieFlowViewModel3.serializer.RemoteActionCompatParcelizer;
                otpLogger2.getClass();
                str2.getClass();
                ff$$ExternalSyntheticOutline0.m("screenName", str2, otpLogger2.IconCompatParcelizer, "selfie_review_screen_canceled");
                int i20 = write + 117;
                read = i20 % Fields.SpotShadowColor;
                if (i20 % 2 == 0) {
                    int i21 = 26 / 0;
                }
                return createfromparcel;
            default:
                SelfieFlowViewModel selfieFlowViewModel4 = (SelfieFlowViewModel) this.MediaMetadataCompat;
                selfieFlowViewModel4.getClass();
                r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(selfieFlowViewModel4, new SelfieFlowViewModel$submitSelfie$1(selfieFlowViewModel4, false, null));
                selfieFlowViewModel4.MediaBrowserCompatMediaItem.IconCompatParcelizer.logEvent("selfie_consent_human", null);
                return createfromparcel;
        }
    }
}
