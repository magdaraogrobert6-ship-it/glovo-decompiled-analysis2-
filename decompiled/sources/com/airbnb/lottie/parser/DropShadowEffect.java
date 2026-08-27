package com.airbnb.lottie.parser;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda2;
import androidx.camera.core.ImageCapture$1;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda0;
import androidx.camera.video.Recorder$3;
import androidx.camera.view.PendingValue;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.BlockRunner;
import androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1;
import androidx.navigation.internal.NavContext;
import androidx.sqlite.SQLite;
import androidx.transition.Transition$1;
import coil3.ExtrasKt;
import coil3.util.UtilsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_vision_face.zzmg;
import com.google.android.gms.net.zza;
import com.google.firebase.Timestamp;
import com.google.re2j.Parser;
import com.huawei.agconnect.config.impl.m;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.hmf.tasks.a.j;
import com.huawei.location.Vw$Vw;
import com.huawei.wisesecurity.kfs.crypto.cipher.DefaultDecryptHandler;
import com.huawei.wisesecurity.kfs.exception.CryptoException;
import com.huawei.wisesecurity.ucs_credential.g0;
import com.huawei.wisesecurity.ucs_credential.x;
import com.incognia.internal.ZM$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.mapbox.common.CommonSdkLog;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda4;
import com.mapbox.navigation.core.MapboxNavigation$notification$1$1;
import com.mapbox.navigation.core.RoutesCacheClearer;
import com.mapbox.navigation.core.preview.RoutesPreview;
import com.mapbox.navigation.core.preview.RoutesPreviewController$previewRoutesInternal$1;
import com.mapbox.navigation.core.preview.RoutesPreviewUpdate;
import com.mapbox.navigation.core.trip.session.MapboxTripSession$$ExternalSyntheticLambda2;
import com.mapbox.navigation.core.trip.session.eh.EHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1;
import com.mapbox.navigation.navigator.internal.MapboxNativeNavigatorImpl;
import com.mapbox.navigation.utils.internal.JobControl;
import com.mapbox.navigation.utils.internal.ThreadController;
import com.mapbox.navigator.RouteAlternative;
import com.mapbox.navigator.RoutesData;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.mapbox.search.base.BaseResponseInfo;
import com.mapbox.search.base.result.SearchRequestContext;
import com.mapbox.search.base.result.SearchResultFactory;
import com.mapbox.search.base.task.AsyncOperationTaskImpl;
import com.mapbox.search.common.concurrent.AndroidMainThreadWorkerImpl$$ExternalSyntheticLambda0;
import com.mapbox.search.internal.bindgen.SearchCallback;
import com.mapbox.search.internal.bindgen.SearchResponse;
import com.roadrunner.biometrics.domain.encryption.LaunchBiometricsEncryptionUseCase$invoke$1;
import com.roadrunner.biometrics.presentation.BiometricsActivity;
import com.roadrunner.countdowntimer.CountDownTimerUiModel;
import com.roadrunner.logger.info.AppEventInfoChangeHandler;
import com.roadrunner.login.legacy.data.LoginStorageManager;
import com.roadrunner.nafath.data.NafathTimerDataStore$set$2;
import com.roadrunner.opportunities.calendar.data.BonusLevel;
import com.roadrunner.opportunities.calendar.domain.GetBonusCalendarUiState$invoke$1;
import com.roadrunner.push.PushEventPublisherImpl$emit$1;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer.GetRemainingOtpVerificationTimerIfRunning;
import com.roadrunner.rider.safety.permission.presentation.RiderSafetyPermissionFragment;
import com.sentiance.core.model.events.E$b;
import com.sentiance.core.model.events.H$b;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import javax.crypto.spec.OAEPParameterSpec;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.rx2.RxConvertKt$asFlow$1;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.AfterVersion;
import o.AndroidIndirectPointerEvent_androidKt;
import o.AuthPromptFailureException;
import o.Camera2CameraFactory;
import o.CaptureSessionShouldUseMrirQuirk;
import o.CircularProgressDrawable2;
import o.ConfigureSurfaceToSecondarySessionFailQuirk;
import o.DrawModifierNodeKt;
import o.DrawableTransformation;
import o.FeatureCombinationQueryImplExternalSyntheticLambda2;
import o.FlashTooSlowQuirk;
import o.FocusOwnerImplmodifier1;
import o.ImageCapture1;
import o.ImageUtilCodecFailedException;
import o.PreferenceGroupAdapter;
import o.PrematureEndOfStreamVideoQuirk;
import o.RectManager;
import o.RoomDatabaseperformClear1;
import o.ScrollCaptureExternalSyntheticApiModelOutline0;
import o.ScrollCapture_androidKt;
import o.ScrollCaptureonScrollCaptureSearch1;
import o.SemanticsPropertiesFillableData1;
import o.SemanticsSortKtspecialinlinedthenBy1;
import o.ShortNewsContentCardView;
import o.StillCaptureFlashStopRepeatingQuirk;
import o.StretchedVideoResolutionQuirk;
import o.SurfaceViewStretchedQuirk;
import o.TopBottomBoundsComparator;
import o.UseCase;
import o.VideoQualityQuirk;
import o.abandonFocus;
import o.accessgetInstancedelegatecp;
import o.accessprocessDragStart;
import o.accesssetDispatchTokenp;
import o.acquire;
import o.applyLayoutFeatures;
import o.createFromParcel;
import o.decode;
import o.disableCoppaComplianceInDelay;
import o.enablePlayStoreKidsComplianceInDelay;
import o.getBrightness;
import o.getCanScrollVertically;
import o.getCardBackgroundColor;
import o.getCardElevation;
import o.getCieXyz;
import o.getContentInsetEndWithActions;
import o.getContentViewGroupParentLayout;
import o.getController;
import o.getD50Xyzui_graphics;
import o.getDataStoreFileName;
import o.getDefaultImageFormat;
import o.getDoesClickOutsideModalViewDismissInAppMessageView;
import o.getDoubleOrNull;
import o.getFailureMessage;
import o.getFeatureGroupUseCaseType;
import o.getInAppMessageStackannotations;
import o.getLayoutResource;
import o.getPreviewStreamState;
import o.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION;
import o.getScrollCaptureInProgress;
import o.getTestTagsAsResourceIddelegate;
import o.inCompatibilityMode;
import o.instance_delegatelambda0;
import o.internalInitInvalidationTracker;
import o.isAdapterPositionOnScreen;
import o.isAdjustUninstallDetectionPayload;
import o.isAppSetIdReadingEnabled;
import o.isHiddenannotations;
import o.isInterested;
import o.isItemDismissable;
import o.isOpenInternalroom_runtime;
import o.isRoot;
import o.isValidSource;
import o.lambdaprocessAndResolveDeeplink15;
import o.mergeJsonObjects;
import o.metaMarkUpdatedAndHasCallbacks;
import o.onContentCardDismissed;
import o.onItemDismiss;
import o.performCustomExitMxy_nc0;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda4MdKbfiHpQQwW57A4NP6ZCybbFA;
import o.r8lambda4ctur6dHthQRF8ridJfgtUMxjY0;
import o.r8lambda6UOvp7lvejigbq5knKoP8A0vEiw;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34;
import o.r8lambdamcfkChlmwyb5a6y_ZoPzJd5UQ4;
import o.r8lambdapkx6kfYbgP4lEOWkebovjPb0ug;
import o.r8lambdatq6ACLpcPQ5kM_9Qo1nOx0ZDGDM;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release;
import o.removeNodeAtDepth;
import o.setAllowStacking;
import o.setBackgroundColor;
import o.setBrightness;
import o.setContentInsetEndWithActions;
import o.setEventDeduplicationIdsMaxSize;
import o.setInflatedId;
import o.setLastHorizontalStyle;
import o.setOnInflateListener;
import o.setPresentationView;
import o.setScreenFlashOverlayColor;
import o.setSensitiveData;
import o.setShowingTextSubstitution;
import o.setStateDescription;
import o.setTextSelectionRangeFDrldGo;
import o.setTextSubstitution;
import o.setTextSubstitutiondefault;
import o.setToggleableState;
import o.setTransactionSuccessful;
import o.setTraversalGroup;
import o.setTraversalIndex;
import o.tf;
import o.tg;
import o.toContentCaptureSession;
import o.toXyz;
import o.toZui_graphics;
import o.transferSessionPackageI;
import o.tryTrackThirdPartySharingI;
import o.u1;
import o.u5;
import o.u7;
import o.updateAttributionI;
import o.v6ExternalSyntheticLambda7;
import o.wa;
import o.xa;
import o.xyzaToColorJlNiLsgui_graphics;
import okhttp3.FormBody;
import timber.log.Timber;

/* JADX INFO: loaded from: classes.dex */
public final class DropShadowEffect implements r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34, ScrollCapture_androidKt, SearchCallback, setContentInsetEndWithActions {
    public static int IconCompatParcelizer = 0;
    private static int MediaMetadataCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public Object MediaDescriptionCompat;
    public Object RatingCompat;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public Object read;
    public Object serializer;
    public Object write;

    public void distanceRemainingFormatter(AnalyticsServiceImpl analyticsServiceImpl) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem;
        int i3 = i2 + 85;
        MediaMetadataCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        this.write = analyticsServiceImpl;
        int i5 = i2 + 107;
        MediaMetadataCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 50 / 0;
        }
    }

    public void percentRouteTraveledFormatter(g0 g0Var) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 9;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        int i4 = i2 % 2;
        this.MediaDescriptionCompat = g0Var;
        int i5 = i3 + 85;
        MediaMetadataCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 13 / 0;
        }
    }

    public void timeRemainingFormatter(NavContext navContext) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 7;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.serializer = navContext;
        } else {
            this.serializer = navContext;
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:40:0x0134  */
    public DropShadowEffect(UseCase useCase, Size size, CameraCharacteristics cameraCharacteristics, boolean z) {
        int iIntValue;
        boolean z2;
        boolean z3;
        int i;
        FocusOwnerImplmodifier1 focusOwnerImplmodifier1;
        getLayoutResource getlayoutresource;
        getDefaultImageFormat getdefaultimageformat;
        boolean z4;
        final int i2;
        getLayoutResource getlayoutresource2;
        int i3 = 1;
        this.RemoteActionCompatParcelizer = 1;
        PrematureEndOfStreamVideoQuirk.write();
        this.read = useCase;
        StillCaptureFlashStopRepeatingQuirk stillCaptureFlashStopRepeatingQuirkSerializer = null;
        setAllowStacking setallowstacking = (setAllowStacking) useCase.read(ImageUtilCodecFailedException.ComponentActivity, null);
        if (setallowstacking == null) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write((String) useCase.read(getPreviewStreamState.PlaybackStateCompat, useCase.toString()), "Implementation is missing option unpacker for ");
            throw null;
        }
        abandonFocus abandonfocus = new abandonFocus();
        setallowstacking.IconCompatParcelizer(useCase, abandonfocus);
        this.RatingCompat = abandonfocus.IconCompatParcelizer();
        final BlockRunner blockRunner = new BlockRunner();
        blockRunner.read = null;
        blockRunner.IconCompatParcelizer = null;
        this.write = blockRunner;
        Executor executor = (Executor) useCase.read(getController.m_, removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.RemoteActionCompatParcelizer());
        Objects.requireNonNull(executor);
        final FlashTooSlowQuirk flashTooSlowQuirk = new FlashTooSlowQuirk(executor, cameraCharacteristics);
        this.serializer = flashTooSlowQuirk;
        ArrayList arrayList = new ArrayList();
        final int i4 = 2;
        if (((Integer) useCase.read(getFeatureGroupUseCaseType.ParcelableVolumeInfo, 0)).intValue() != 0) {
            arrayList.add(32);
            arrayList.add(Integer.valueOf(Fields.RotationX));
        } else {
            Integer num = (Integer) useCase.read(UseCase.read, null);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                Integer num2 = (Integer) useCase.read(getFeatureGroupUseCaseType.b_, null);
                if (num2 != null) {
                    int i5 = MediaMetadataCompat + 25;
                    MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0 ? num2.intValue() == 4101 : num2.intValue() == 10220) {
                        iIntValue = 4101;
                    } else if (num2 == null && num2.intValue() == 32) {
                        int i6 = MediaSessionCompatQueueItem + 89;
                        MediaMetadataCompat = i6 % Fields.SpotShadowColor;
                        iIntValue = i6 % 2 == 0 ? 23 : 32;
                    } else {
                        iIntValue = 256;
                    }
                } else if (num2 == null) {
                    iIntValue = 256;
                } else {
                    iIntValue = 256;
                }
            }
            arrayList.add(Integer.valueOf(iIntValue));
            int i7 = MediaSessionCompatQueueItem + 125;
            MediaMetadataCompat = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
        }
        int iRemoteActionCompatParcelizer = useCase.RemoteActionCompatParcelizer();
        if (useCase.read(UseCase.MediaSessionCompatQueueItem, null) != null) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
            throw null;
        }
        setScreenFlashOverlayColor setscreenflashoverlaycolor = new setScreenFlashOverlayColor();
        setScreenFlashOverlayColor setscreenflashoverlaycolor2 = new setScreenFlashOverlayColor();
        ConfigureSurfaceToSecondarySessionFailQuirk configureSurfaceToSecondarySessionFailQuirk = new ConfigureSurfaceToSecondarySessionFailQuirk(size, iRemoteActionCompatParcelizer, arrayList, z, setscreenflashoverlaycolor, setscreenflashoverlaycolor2);
        this.MediaDescriptionCompat = configureSurfaceToSecondarySessionFailQuirk;
        if (((ConfigureSurfaceToSecondarySessionFailQuirk) blockRunner.RemoteActionCompatParcelizer) == null) {
            int i10 = MediaMetadataCompat + 27;
            MediaSessionCompatQueueItem = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                throw null;
            }
            if (((AuthPromptFailureException) blockRunner.serializer) == null) {
                int i11 = MediaMetadataCompat + 63;
                MediaSessionCompatQueueItem = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                int i13 = 2 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        UtilsKt.RemoteActionCompatParcelizer("CaptureNode does not support recreation yet.", z2);
        blockRunner.RemoteActionCompatParcelizer = configureSurfaceToSecondarySessionFailQuirk;
        StillCaptureFlashStopRepeatingQuirk setoninflatelistener = new setOnInflateListener(i3, blockRunner);
        if (arrayList.size() > 1) {
            int i14 = MediaMetadataCompat + 119;
            MediaSessionCompatQueueItem = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            z3 = true;
        } else {
            z3 = false;
        }
        int i16 = 4;
        if (z) {
            i = iRemoteActionCompatParcelizer;
            Recorder$3 recorder$3 = new Recorder$3(r8lambda4MdKbfiHpQQwW57A4NP6ZCybbFA.IconCompatParcelizer(size.getWidth(), size.getHeight(), i, 4));
            blockRunner.IconCompatParcelizer = recorder$3;
            final int i17 = 1;
            focusOwnerImplmodifier1 = new FocusOwnerImplmodifier1() { // from class: o.ExtraCroppingQuirk
                @Override // o.FocusOwnerImplmodifier1
                public final void accept(Object obj) {
                    int i18 = i17;
                    androidx.lifecycle.BlockRunner blockRunner2 = blockRunner;
                    if (i18 == 0) {
                        blockRunner2.IconCompatParcelizer((ImageCaptureFailedWhenVideoCaptureIsBoundQuirk) obj);
                        return;
                    }
                    boolean z5 = true;
                    if (i18 == 1) {
                        ImageCaptureFailedWhenVideoCaptureIsBoundQuirk imageCaptureFailedWhenVideoCaptureIsBoundQuirk = (ImageCaptureFailedWhenVideoCaptureIsBoundQuirk) obj;
                        blockRunner2.IconCompatParcelizer(imageCaptureFailedWhenVideoCaptureIsBoundQuirk);
                        Recorder$3 recorder$4 = (Recorder$3) blockRunner2.IconCompatParcelizer;
                        coil3.util.UtilsKt.RemoteActionCompatParcelizer("Pending request should be null", ((ImageCaptureFailedWhenVideoCaptureIsBoundQuirk) recorder$4.RemoteActionCompatParcelizer) == null);
                        recorder$4.RemoteActionCompatParcelizer = imageCaptureFailedWhenVideoCaptureIsBoundQuirk;
                        return;
                    }
                    CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk captureSessionStuckWhenCreatingBeforeClosingCameraQuirk = (CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk) obj;
                    PrematureEndOfStreamVideoQuirk.write();
                    ImageCaptureFailedWhenVideoCaptureIsBoundQuirk imageCaptureFailedWhenVideoCaptureIsBoundQuirk2 = (ImageCaptureFailedWhenVideoCaptureIsBoundQuirk) blockRunner2.read;
                    if (imageCaptureFailedWhenVideoCaptureIsBoundQuirk2 == null || imageCaptureFailedWhenVideoCaptureIsBoundQuirk2.MediaDescriptionCompat != captureSessionStuckWhenCreatingBeforeClosingCameraQuirk.read) {
                        return;
                    }
                    androidx.camera.core.ImageCaptureException imageCaptureException = captureSessionStuckWhenCreatingBeforeClosingCameraQuirk.serializer;
                    ImageCaptureFailWithAutoFlashQuirk imageCaptureFailWithAutoFlashQuirk = imageCaptureFailedWhenVideoCaptureIsBoundQuirk2.write;
                    ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk = imageCaptureFailWithAutoFlashQuirk.MediaDescriptionCompat;
                    PrematureEndOfStreamVideoQuirk.write();
                    if (imageCaptureFailWithAutoFlashQuirk.MediaMetadataCompat) {
                        return;
                    }
                    PrematureEndOfStreamVideoQuirk.write();
                    int i19 = extraSupportedOutputSizeQuirk.RatingCompat;
                    if (i19 > 0) {
                        extraSupportedOutputSizeQuirk.RatingCompat = i19 - 1;
                    } else {
                        z5 = false;
                    }
                    if (!z5) {
                        PrematureEndOfStreamVideoQuirk.write();
                        extraSupportedOutputSizeQuirk.IconCompatParcelizer.execute(new CameraX$$ExternalSyntheticLambda2(extraSupportedOutputSizeQuirk, 21, imageCaptureException));
                    }
                    imageCaptureFailWithAutoFlashQuirk.RemoteActionCompatParcelizer();
                    imageCaptureFailWithAutoFlashQuirk.RemoteActionCompatParcelizer.serializer(imageCaptureException);
                    if (z5) {
                        imageCaptureFailWithAutoFlashQuirk.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(extraSupportedOutputSizeQuirk);
                    }
                }
            };
            int i18 = 2 % 2;
            getlayoutresource = null;
            getdefaultimageformat = recorder$3;
        } else {
            if (z3) {
                getLayoutResource getlayoutresource3 = new getLayoutResource(size.getWidth(), size.getHeight(), Fields.RotationX, 4);
                StillCaptureFlashStopRepeatingQuirk stillCaptureFlashStopRepeatingQuirkSerializer2 = r8lambdatq6ACLpcPQ5kM_9Qo1nOx0ZDGDM.serializer(setoninflatelistener, getlayoutresource3.RemoteActionCompatParcelizer);
                getlayoutresource = new getLayoutResource(size.getWidth(), size.getHeight(), 32, 4);
                stillCaptureFlashStopRepeatingQuirkSerializer = r8lambdatq6ACLpcPQ5kM_9Qo1nOx0ZDGDM.serializer(setoninflatelistener, getlayoutresource.RemoteActionCompatParcelizer);
                int i19 = 2 % 2;
                setoninflatelistener = stillCaptureFlashStopRepeatingQuirkSerializer2;
                i = iRemoteActionCompatParcelizer;
                i2 = 0;
                getlayoutresource2 = getlayoutresource3;
            } else {
                i = iRemoteActionCompatParcelizer;
                getLayoutResource getlayoutresource4 = new getLayoutResource(size.getWidth(), size.getHeight(), i, 4);
                i2 = 0;
                setoninflatelistener = r8lambdatq6ACLpcPQ5kM_9Qo1nOx0ZDGDM.serializer(setoninflatelistener, getlayoutresource4.RemoteActionCompatParcelizer);
                getlayoutresource = null;
                getlayoutresource2 = getlayoutresource4;
            }
            focusOwnerImplmodifier1 = new FocusOwnerImplmodifier1() { // from class: o.ExtraCroppingQuirk
                @Override // o.FocusOwnerImplmodifier1
                public final void accept(Object obj) {
                    int i110 = i2;
                    androidx.lifecycle.BlockRunner blockRunner2 = blockRunner;
                    if (i110 == 0) {
                        blockRunner2.IconCompatParcelizer((ImageCaptureFailedWhenVideoCaptureIsBoundQuirk) obj);
                        return;
                    }
                    boolean z5 = true;
                    if (i110 == 1) {
                        ImageCaptureFailedWhenVideoCaptureIsBoundQuirk imageCaptureFailedWhenVideoCaptureIsBoundQuirk = (ImageCaptureFailedWhenVideoCaptureIsBoundQuirk) obj;
                        blockRunner2.IconCompatParcelizer(imageCaptureFailedWhenVideoCaptureIsBoundQuirk);
                        Recorder$3 recorder$4 = (Recorder$3) blockRunner2.IconCompatParcelizer;
                        coil3.util.UtilsKt.RemoteActionCompatParcelizer("Pending request should be null", ((ImageCaptureFailedWhenVideoCaptureIsBoundQuirk) recorder$4.RemoteActionCompatParcelizer) == null);
                        recorder$4.RemoteActionCompatParcelizer = imageCaptureFailedWhenVideoCaptureIsBoundQuirk;
                        return;
                    }
                    CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk captureSessionStuckWhenCreatingBeforeClosingCameraQuirk = (CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk) obj;
                    PrematureEndOfStreamVideoQuirk.write();
                    ImageCaptureFailedWhenVideoCaptureIsBoundQuirk imageCaptureFailedWhenVideoCaptureIsBoundQuirk2 = (ImageCaptureFailedWhenVideoCaptureIsBoundQuirk) blockRunner2.read;
                    if (imageCaptureFailedWhenVideoCaptureIsBoundQuirk2 == null || imageCaptureFailedWhenVideoCaptureIsBoundQuirk2.MediaDescriptionCompat != captureSessionStuckWhenCreatingBeforeClosingCameraQuirk.read) {
                        return;
                    }
                    androidx.camera.core.ImageCaptureException imageCaptureException = captureSessionStuckWhenCreatingBeforeClosingCameraQuirk.serializer;
                    ImageCaptureFailWithAutoFlashQuirk imageCaptureFailWithAutoFlashQuirk = imageCaptureFailedWhenVideoCaptureIsBoundQuirk2.write;
                    ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk = imageCaptureFailWithAutoFlashQuirk.MediaDescriptionCompat;
                    PrematureEndOfStreamVideoQuirk.write();
                    if (imageCaptureFailWithAutoFlashQuirk.MediaMetadataCompat) {
                        return;
                    }
                    PrematureEndOfStreamVideoQuirk.write();
                    int i111 = extraSupportedOutputSizeQuirk.RatingCompat;
                    if (i111 > 0) {
                        extraSupportedOutputSizeQuirk.RatingCompat = i111 - 1;
                    } else {
                        z5 = false;
                    }
                    if (!z5) {
                        PrematureEndOfStreamVideoQuirk.write();
                        extraSupportedOutputSizeQuirk.IconCompatParcelizer.execute(new CameraX$$ExternalSyntheticLambda2(extraSupportedOutputSizeQuirk, 21, imageCaptureException));
                    }
                    imageCaptureFailWithAutoFlashQuirk.RemoteActionCompatParcelizer();
                    imageCaptureFailWithAutoFlashQuirk.RemoteActionCompatParcelizer.serializer(imageCaptureException);
                    if (z5) {
                        imageCaptureFailWithAutoFlashQuirk.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(extraSupportedOutputSizeQuirk);
                    }
                }
            };
            getdefaultimageformat = getlayoutresource2;
        }
        configureSurfaceToSecondarySessionFailQuirk.IconCompatParcelizer = setoninflatelistener;
        if (z3 && stillCaptureFlashStopRepeatingQuirkSerializer != null) {
            configureSurfaceToSecondarySessionFailQuirk.RemoteActionCompatParcelizer = stillCaptureFlashStopRepeatingQuirkSerializer;
        }
        Surface surfaceRatingCompat = getdefaultimageformat.RatingCompat();
        Objects.requireNonNull(surfaceRatingCompat);
        UtilsKt.RemoteActionCompatParcelizer("The surface is already set.", configureSurfaceToSecondarySessionFailQuirk.MediaDescriptionCompat == null);
        configureSurfaceToSecondarySessionFailQuirk.MediaDescriptionCompat = new Camera2CameraFactory(surfaceRatingCompat, size, i);
        blockRunner.serializer = new AuthPromptFailureException(getdefaultimageformat);
        int i20 = 8;
        getdefaultimageformat.RemoteActionCompatParcelizer(new StreamSharing$$ExternalSyntheticLambda0(i20, blockRunner), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer());
        if (z3 && getlayoutresource != null) {
            Surface surfaceRatingCompat2 = getlayoutresource.RatingCompat();
            if (configureSurfaceToSecondarySessionFailQuirk.RatingCompat == null) {
                int i21 = MediaMetadataCompat + 65;
                MediaSessionCompatQueueItem = i21 % Fields.SpotShadowColor;
                int i22 = i21 % 2;
                z4 = true;
            } else {
                z4 = false;
            }
            UtilsKt.RemoteActionCompatParcelizer("The secondary surface is already set.", z4);
            configureSurfaceToSecondarySessionFailQuirk.RatingCompat = new Camera2CameraFactory(surfaceRatingCompat2, size, i);
            blockRunner.RatingCompat = new AuthPromptFailureException(getlayoutresource);
            getlayoutresource.RemoteActionCompatParcelizer(new StreamSharing$$ExternalSyntheticLambda0(i20, blockRunner), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer());
            int i23 = 2 % 2;
        }
        setscreenflashoverlaycolor.write = focusOwnerImplmodifier1;
        setscreenflashoverlaycolor2.write = new FocusOwnerImplmodifier1() { // from class: o.ExtraCroppingQuirk
            @Override // o.FocusOwnerImplmodifier1
            public final void accept(Object obj) {
                int i110 = i4;
                androidx.lifecycle.BlockRunner blockRunner2 = blockRunner;
                if (i110 == 0) {
                    blockRunner2.IconCompatParcelizer((ImageCaptureFailedWhenVideoCaptureIsBoundQuirk) obj);
                    return;
                }
                boolean z5 = true;
                if (i110 == 1) {
                    ImageCaptureFailedWhenVideoCaptureIsBoundQuirk imageCaptureFailedWhenVideoCaptureIsBoundQuirk = (ImageCaptureFailedWhenVideoCaptureIsBoundQuirk) obj;
                    blockRunner2.IconCompatParcelizer(imageCaptureFailedWhenVideoCaptureIsBoundQuirk);
                    Recorder$3 recorder$4 = (Recorder$3) blockRunner2.IconCompatParcelizer;
                    coil3.util.UtilsKt.RemoteActionCompatParcelizer("Pending request should be null", ((ImageCaptureFailedWhenVideoCaptureIsBoundQuirk) recorder$4.RemoteActionCompatParcelizer) == null);
                    recorder$4.RemoteActionCompatParcelizer = imageCaptureFailedWhenVideoCaptureIsBoundQuirk;
                    return;
                }
                CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk captureSessionStuckWhenCreatingBeforeClosingCameraQuirk = (CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk) obj;
                PrematureEndOfStreamVideoQuirk.write();
                ImageCaptureFailedWhenVideoCaptureIsBoundQuirk imageCaptureFailedWhenVideoCaptureIsBoundQuirk2 = (ImageCaptureFailedWhenVideoCaptureIsBoundQuirk) blockRunner2.read;
                if (imageCaptureFailedWhenVideoCaptureIsBoundQuirk2 == null || imageCaptureFailedWhenVideoCaptureIsBoundQuirk2.MediaDescriptionCompat != captureSessionStuckWhenCreatingBeforeClosingCameraQuirk.read) {
                    return;
                }
                androidx.camera.core.ImageCaptureException imageCaptureException = captureSessionStuckWhenCreatingBeforeClosingCameraQuirk.serializer;
                ImageCaptureFailWithAutoFlashQuirk imageCaptureFailWithAutoFlashQuirk = imageCaptureFailedWhenVideoCaptureIsBoundQuirk2.write;
                ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk = imageCaptureFailWithAutoFlashQuirk.MediaDescriptionCompat;
                PrematureEndOfStreamVideoQuirk.write();
                if (imageCaptureFailWithAutoFlashQuirk.MediaMetadataCompat) {
                    return;
                }
                PrematureEndOfStreamVideoQuirk.write();
                int i111 = extraSupportedOutputSizeQuirk.RatingCompat;
                if (i111 > 0) {
                    extraSupportedOutputSizeQuirk.RatingCompat = i111 - 1;
                } else {
                    z5 = false;
                }
                if (!z5) {
                    PrematureEndOfStreamVideoQuirk.write();
                    extraSupportedOutputSizeQuirk.IconCompatParcelizer.execute(new CameraX$$ExternalSyntheticLambda2(extraSupportedOutputSizeQuirk, 21, imageCaptureException));
                }
                imageCaptureFailWithAutoFlashQuirk.RemoteActionCompatParcelizer();
                imageCaptureFailWithAutoFlashQuirk.RemoteActionCompatParcelizer.serializer(imageCaptureException);
                if (z5) {
                    imageCaptureFailWithAutoFlashQuirk.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(extraSupportedOutputSizeQuirk);
                }
            }
        };
        setScreenFlashOverlayColor setscreenflashoverlaycolor3 = new setScreenFlashOverlayColor();
        setScreenFlashOverlayColor setscreenflashoverlaycolor4 = new setScreenFlashOverlayColor();
        CaptureSessionShouldUseMrirQuirk captureSessionShouldUseMrirQuirk = new CaptureSessionShouldUseMrirQuirk(setscreenflashoverlaycolor3, setscreenflashoverlaycolor4, i, arrayList);
        blockRunner.write = captureSessionShouldUseMrirQuirk;
        flashTooSlowQuirk.RatingCompat = captureSessionShouldUseMrirQuirk;
        final int i24 = 0;
        setscreenflashoverlaycolor3.write = new FocusOwnerImplmodifier1() { // from class: o.ImageCaptureFlashNotFireQuirk
            @Override // o.FocusOwnerImplmodifier1
            public final void accept(Object obj) throws Exception {
                int i25 = i24;
                final FlashTooSlowQuirk flashTooSlowQuirk2 = flashTooSlowQuirk;
                final CaptureSessionStuckQuirk captureSessionStuckQuirk = (CaptureSessionStuckQuirk) obj;
                if (i25 == 0) {
                    if (captureSessionStuckQuirk.write.write.MediaMetadataCompat) {
                        captureSessionStuckQuirk.read.close();
                        return;
                    } else {
                        final int i26 = 1;
                        flashTooSlowQuirk2.RemoteActionCompatParcelizer.execute(new Runnable() { // from class: o.ImageCaptureFailedForVideoSnapshotQuirk
                            @Override // java.lang.Runnable
                            public final void run() throws Exception {
                                int i27 = i26;
                                CaptureSessionStuckQuirk captureSessionStuckQuirk2 = captureSessionStuckQuirk;
                                FlashTooSlowQuirk flashTooSlowQuirk3 = flashTooSlowQuirk2;
                                boolean z5 = true;
                                if (i27 == 0) {
                                    ImageCaptureFailedWhenVideoCaptureIsBoundQuirk imageCaptureFailedWhenVideoCaptureIsBoundQuirk = captureSessionStuckQuirk2.write;
                                    try {
                                        getViewPort getviewport = (getViewPort) flashTooSlowQuirk3.MediaSessionCompatQueueItem.read(captureSessionStuckQuirk2);
                                        int i28 = getviewport.serializer;
                                        coil3.util.UtilsKt.IconCompatParcelizer("Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: " + i28, i28 == 35 || i28 == 256 || i28 == 4101);
                                        removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().execute(new CameraX$$ExternalSyntheticLambda2(imageCaptureFailedWhenVideoCaptureIsBoundQuirk, 18, (Bitmap) flashTooSlowQuirk3.MediaMetadataCompat.RemoteActionCompatParcelizer(getviewport)));
                                        return;
                                    } catch (Exception e) {
                                        captureSessionStuckQuirk2.read.close();
                                        setInflatedId.read("ProcessingNode", "process postview input packet failed.", e);
                                        return;
                                    }
                                }
                                ImageCaptureFailedWhenVideoCaptureIsBoundQuirk imageCaptureFailedWhenVideoCaptureIsBoundQuirk2 = captureSessionStuckQuirk2.write;
                                try {
                                    if (flashTooSlowQuirk3.RatingCompat.read.size() <= 1) {
                                        z5 = false;
                                    }
                                    if (captureSessionStuckQuirk2.write.MediaMetadataCompat == null) {
                                        removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().execute(new CameraX$$ExternalSyntheticLambda2(imageCaptureFailedWhenVideoCaptureIsBoundQuirk2, 16, flashTooSlowQuirk3.serializer(captureSessionStuckQuirk2)));
                                    } else {
                                        ImageCapture$1 imageCapture$1IconCompatParcelizer = flashTooSlowQuirk3.IconCompatParcelizer(captureSessionStuckQuirk2);
                                        if (!z5 || imageCaptureFailedWhenVideoCaptureIsBoundQuirk2.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer()) {
                                            removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().execute(new CameraX$$ExternalSyntheticLambda2(imageCaptureFailedWhenVideoCaptureIsBoundQuirk2, 17, imageCapture$1IconCompatParcelizer));
                                        }
                                    }
                                } catch (androidx.camera.core.ImageCaptureException e2) {
                                    removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().execute(new CameraX$$ExternalSyntheticLambda2(imageCaptureFailedWhenVideoCaptureIsBoundQuirk2, 19, e2));
                                } catch (OutOfMemoryError e3) {
                                    removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().execute(new CameraX$$ExternalSyntheticLambda2(imageCaptureFailedWhenVideoCaptureIsBoundQuirk2, 19, new androidx.camera.core.ImageCaptureException(0, "Processing failed due to low memory.", e3)));
                                } catch (RuntimeException e4) {
                                    removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().execute(new CameraX$$ExternalSyntheticLambda2(imageCaptureFailedWhenVideoCaptureIsBoundQuirk2, 19, new androidx.camera.core.ImageCaptureException(0, "Processing failed.", e4)));
                                }
                            }
                        });
                        return;
                    }
                }
                if (captureSessionStuckQuirk.write.write.MediaMetadataCompat) {
                    setInflatedId.read("ProcessingNode", "The postview image is closed due to request aborted");
                    captureSessionStuckQuirk.read.close();
                } else {
                    final int i27 = 0;
                    flashTooSlowQuirk2.RemoteActionCompatParcelizer.execute(new Runnable() { // from class: o.ImageCaptureFailedForVideoSnapshotQuirk
                        @Override // java.lang.Runnable
                        public final void run() throws Exception {
                            int i28 = i27;
                            CaptureSessionStuckQuirk captureSessionStuckQuirk2 = captureSessionStuckQuirk;
                            FlashTooSlowQuirk flashTooSlowQuirk3 = flashTooSlowQuirk2;
                            boolean z5 = true;
                            if (i28 == 0) {
                                ImageCaptureFailedWhenVideoCaptureIsBoundQuirk imageCaptureFailedWhenVideoCaptureIsBoundQuirk = captureSessionStuckQuirk2.write;
                                try {
                                    getViewPort getviewport = (getViewPort) flashTooSlowQuirk3.MediaSessionCompatQueueItem.read(captureSessionStuckQuirk2);
                                    int i29 = getviewport.serializer;
                                    coil3.util.UtilsKt.IconCompatParcelizer("Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: " + i29, i29 == 35 || i29 == 256 || i29 == 4101);
                                    removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().execute(new CameraX$$ExternalSyntheticLambda2(imageCaptureFailedWhenVideoCaptureIsBoundQuirk, 18, (Bitmap) flashTooSlowQuirk3.MediaMetadataCompat.RemoteActionCompatParcelizer(getviewport)));
                                    return;
                                } catch (Exception e) {
                                    captureSessionStuckQuirk2.read.close();
                                    setInflatedId.read("ProcessingNode", "process postview input packet failed.", e);
                                    return;
                                }
                            }
                            ImageCaptureFailedWhenVideoCaptureIsBoundQuirk imageCaptureFailedWhenVideoCaptureIsBoundQuirk2 = captureSessionStuckQuirk2.write;
                            try {
                                if (flashTooSlowQuirk3.RatingCompat.read.size() <= 1) {
                                    z5 = false;
                                }
                                if (captureSessionStuckQuirk2.write.MediaMetadataCompat == null) {
                                    removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().execute(new CameraX$$ExternalSyntheticLambda2(imageCaptureFailedWhenVideoCaptureIsBoundQuirk2, 16, flashTooSlowQuirk3.serializer(captureSessionStuckQuirk2)));
                                } else {
                                    ImageCapture$1 imageCapture$1IconCompatParcelizer = flashTooSlowQuirk3.IconCompatParcelizer(captureSessionStuckQuirk2);
                                    if (!z5 || imageCaptureFailedWhenVideoCaptureIsBoundQuirk2.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer()) {
                                        removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().execute(new CameraX$$ExternalSyntheticLambda2(imageCaptureFailedWhenVideoCaptureIsBoundQuirk2, 17, imageCapture$1IconCompatParcelizer));
                                    }
                                }
                            } catch (androidx.camera.core.ImageCaptureException e2) {
                                removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().execute(new CameraX$$ExternalSyntheticLambda2(imageCaptureFailedWhenVideoCaptureIsBoundQuirk2, 19, e2));
                            } catch (OutOfMemoryError e3) {
                                removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().execute(new CameraX$$ExternalSyntheticLambda2(imageCaptureFailedWhenVideoCaptureIsBoundQuirk2, 19, new androidx.camera.core.ImageCaptureException(0, "Processing failed due to low memory.", e3)));
                            } catch (RuntimeException e4) {
                                removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().execute(new CameraX$$ExternalSyntheticLambda2(imageCaptureFailedWhenVideoCaptureIsBoundQuirk2, 19, new androidx.camera.core.ImageCaptureException(0, "Processing failed.", e4)));
                            }
                        }
                    });
                }
            }
        };
        final int i25 = 1;
        setscreenflashoverlaycolor4.write = new FocusOwnerImplmodifier1() { // from class: o.ImageCaptureFlashNotFireQuirk
            @Override // o.FocusOwnerImplmodifier1
            public final void accept(Object obj) throws Exception {
                int i26 = i25;
                final FlashTooSlowQuirk flashTooSlowQuirk2 = flashTooSlowQuirk;
                final CaptureSessionStuckQuirk captureSessionStuckQuirk = (CaptureSessionStuckQuirk) obj;
                if (i26 == 0) {
                    if (captureSessionStuckQuirk.write.write.MediaMetadataCompat) {
                        captureSessionStuckQuirk.read.close();
                        return;
                    } else {
                        final int i27 = 1;
                        flashTooSlowQuirk2.RemoteActionCompatParcelizer.execute(new Runnable() { // from class: o.ImageCaptureFailedForVideoSnapshotQuirk
                            @Override // java.lang.Runnable
                            public final void run() throws Exception {
                                int i28 = i27;
                                CaptureSessionStuckQuirk captureSessionStuckQuirk2 = captureSessionStuckQuirk;
                                FlashTooSlowQuirk flashTooSlowQuirk3 = flashTooSlowQuirk2;
                                boolean z5 = true;
                                if (i28 == 0) {
                                    ImageCaptureFailedWhenVideoCaptureIsBoundQuirk imageCaptureFailedWhenVideoCaptureIsBoundQuirk = captureSessionStuckQuirk2.write;
                                    try {
                                        getViewPort getviewport = (getViewPort) flashTooSlowQuirk3.MediaSessionCompatQueueItem.read(captureSessionStuckQuirk2);
                                        int i29 = getviewport.serializer;
                                        coil3.util.UtilsKt.IconCompatParcelizer("Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: " + i29, i29 == 35 || i29 == 256 || i29 == 4101);
                                        removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().execute(new CameraX$$ExternalSyntheticLambda2(imageCaptureFailedWhenVideoCaptureIsBoundQuirk, 18, (Bitmap) flashTooSlowQuirk3.MediaMetadataCompat.RemoteActionCompatParcelizer(getviewport)));
                                        return;
                                    } catch (Exception e) {
                                        captureSessionStuckQuirk2.read.close();
                                        setInflatedId.read("ProcessingNode", "process postview input packet failed.", e);
                                        return;
                                    }
                                }
                                ImageCaptureFailedWhenVideoCaptureIsBoundQuirk imageCaptureFailedWhenVideoCaptureIsBoundQuirk2 = captureSessionStuckQuirk2.write;
                                try {
                                    if (flashTooSlowQuirk3.RatingCompat.read.size() <= 1) {
                                        z5 = false;
                                    }
                                    if (captureSessionStuckQuirk2.write.MediaMetadataCompat == null) {
                                        removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().execute(new CameraX$$ExternalSyntheticLambda2(imageCaptureFailedWhenVideoCaptureIsBoundQuirk2, 16, flashTooSlowQuirk3.serializer(captureSessionStuckQuirk2)));
                                    } else {
                                        ImageCapture$1 imageCapture$1IconCompatParcelizer = flashTooSlowQuirk3.IconCompatParcelizer(captureSessionStuckQuirk2);
                                        if (!z5 || imageCaptureFailedWhenVideoCaptureIsBoundQuirk2.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer()) {
                                            removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().execute(new CameraX$$ExternalSyntheticLambda2(imageCaptureFailedWhenVideoCaptureIsBoundQuirk2, 17, imageCapture$1IconCompatParcelizer));
                                        }
                                    }
                                } catch (androidx.camera.core.ImageCaptureException e2) {
                                    removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().execute(new CameraX$$ExternalSyntheticLambda2(imageCaptureFailedWhenVideoCaptureIsBoundQuirk2, 19, e2));
                                } catch (OutOfMemoryError e3) {
                                    removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().execute(new CameraX$$ExternalSyntheticLambda2(imageCaptureFailedWhenVideoCaptureIsBoundQuirk2, 19, new androidx.camera.core.ImageCaptureException(0, "Processing failed due to low memory.", e3)));
                                } catch (RuntimeException e4) {
                                    removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().execute(new CameraX$$ExternalSyntheticLambda2(imageCaptureFailedWhenVideoCaptureIsBoundQuirk2, 19, new androidx.camera.core.ImageCaptureException(0, "Processing failed.", e4)));
                                }
                            }
                        });
                        return;
                    }
                }
                if (captureSessionStuckQuirk.write.write.MediaMetadataCompat) {
                    setInflatedId.read("ProcessingNode", "The postview image is closed due to request aborted");
                    captureSessionStuckQuirk.read.close();
                } else {
                    final int i28 = 0;
                    flashTooSlowQuirk2.RemoteActionCompatParcelizer.execute(new Runnable() { // from class: o.ImageCaptureFailedForVideoSnapshotQuirk
                        @Override // java.lang.Runnable
                        public final void run() throws Exception {
                            int i29 = i28;
                            CaptureSessionStuckQuirk captureSessionStuckQuirk2 = captureSessionStuckQuirk;
                            FlashTooSlowQuirk flashTooSlowQuirk3 = flashTooSlowQuirk2;
                            boolean z5 = true;
                            if (i29 == 0) {
                                ImageCaptureFailedWhenVideoCaptureIsBoundQuirk imageCaptureFailedWhenVideoCaptureIsBoundQuirk = captureSessionStuckQuirk2.write;
                                try {
                                    getViewPort getviewport = (getViewPort) flashTooSlowQuirk3.MediaSessionCompatQueueItem.read(captureSessionStuckQuirk2);
                                    int i210 = getviewport.serializer;
                                    coil3.util.UtilsKt.IconCompatParcelizer("Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: " + i210, i210 == 35 || i210 == 256 || i210 == 4101);
                                    removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().execute(new CameraX$$ExternalSyntheticLambda2(imageCaptureFailedWhenVideoCaptureIsBoundQuirk, 18, (Bitmap) flashTooSlowQuirk3.MediaMetadataCompat.RemoteActionCompatParcelizer(getviewport)));
                                    return;
                                } catch (Exception e) {
                                    captureSessionStuckQuirk2.read.close();
                                    setInflatedId.read("ProcessingNode", "process postview input packet failed.", e);
                                    return;
                                }
                            }
                            ImageCaptureFailedWhenVideoCaptureIsBoundQuirk imageCaptureFailedWhenVideoCaptureIsBoundQuirk2 = captureSessionStuckQuirk2.write;
                            try {
                                if (flashTooSlowQuirk3.RatingCompat.read.size() <= 1) {
                                    z5 = false;
                                }
                                if (captureSessionStuckQuirk2.write.MediaMetadataCompat == null) {
                                    removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().execute(new CameraX$$ExternalSyntheticLambda2(imageCaptureFailedWhenVideoCaptureIsBoundQuirk2, 16, flashTooSlowQuirk3.serializer(captureSessionStuckQuirk2)));
                                } else {
                                    ImageCapture$1 imageCapture$1IconCompatParcelizer = flashTooSlowQuirk3.IconCompatParcelizer(captureSessionStuckQuirk2);
                                    if (!z5 || imageCaptureFailedWhenVideoCaptureIsBoundQuirk2.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer()) {
                                        removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().execute(new CameraX$$ExternalSyntheticLambda2(imageCaptureFailedWhenVideoCaptureIsBoundQuirk2, 17, imageCapture$1IconCompatParcelizer));
                                    }
                                }
                            } catch (androidx.camera.core.ImageCaptureException e2) {
                                removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().execute(new CameraX$$ExternalSyntheticLambda2(imageCaptureFailedWhenVideoCaptureIsBoundQuirk2, 19, e2));
                            } catch (OutOfMemoryError e3) {
                                removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().execute(new CameraX$$ExternalSyntheticLambda2(imageCaptureFailedWhenVideoCaptureIsBoundQuirk2, 19, new androidx.camera.core.ImageCaptureException(0, "Processing failed due to low memory.", e3)));
                            } catch (RuntimeException e4) {
                                removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().execute(new CameraX$$ExternalSyntheticLambda2(imageCaptureFailedWhenVideoCaptureIsBoundQuirk2, 19, new androidx.camera.core.ImageCaptureException(0, "Processing failed.", e4)));
                            }
                        }
                    });
                }
            }
        };
        int i26 = 5;
        flashTooSlowQuirk.MediaSessionCompatQueueItem = new toContentCaptureSession(i26);
        flashTooSlowQuirk.MediaBrowserCompatMediaItem = new PendingValue(flashTooSlowQuirk.ParcelableVolumeInfo, 2);
        flashTooSlowQuirk.MediaDescriptionCompat = new toContentCaptureSession(i16);
        flashTooSlowQuirk.IconCompatParcelizer = new Timestamp.Companion(0);
        flashTooSlowQuirk.MediaSessionCompatResultReceiverWrapper = new j(i16);
        flashTooSlowQuirk.PlaybackStateCompat = new Transition$1(i26);
        flashTooSlowQuirk.MediaMetadataCompat = new Transition$1(i16);
        if (i == 35 || flashTooSlowQuirk.read) {
            flashTooSlowQuirk.MediaSessionCompatToken = new Timestamp.Companion(0);
        }
    }

    public void estimatedTimeToArrivalFormatter(AnalyticsServiceImpl analyticsServiceImpl) {
        int i = 2 % 2;
        this.RatingCompat = new MapboxNavigation$$ExternalSyntheticLambda4(14, analyticsServiceImpl);
        int i2 = MediaSessionCompatQueueItem + 101;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.setContentInsetEndWithActions
    public void serializer(FeatureCombinationQueryImplExternalSyntheticLambda2 featureCombinationQueryImplExternalSyntheticLambda2) {
        int i = 2 % 2;
        BuildersKt.write(new PushEventPublisherImpl$emit$1(this, featureCombinationQueryImplExternalSyntheticLambda2, null, 10));
        int i2 = MediaSessionCompatQueueItem + 43;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public static DropShadowEffect IconCompatParcelizer(AndroidIndirectPointerEvent_androidKt androidIndirectPointerEvent_androidKt, r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw, acquire acquireVar, AndroidIndirectPointerEvent_androidKt androidIndirectPointerEvent_androidKt2, r8lambdapkx6kfYbgP4lEOWkebovjPb0ug r8lambdapkx6kfybgp4leowkebovjpb0ug) {
        int i = 2 % 2;
        DropShadowEffect dropShadowEffect = new DropShadowEffect(androidIndirectPointerEvent_androidKt, r8lambda6uovp7lvejigbq5knkop8a0veiw, acquireVar, androidIndirectPointerEvent_androidKt2, r8lambdapkx6kfybgp4leowkebovjpb0ug, 22);
        int i2 = MediaMetadataCompat + 121;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return dropShadowEffect;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.mapbox.search.internal.bindgen.SearchCallback
    public void run(SearchResponse searchResponse) {
        int i = 2 % 2;
        searchResponse.getClass();
        ((Executor) this.write).execute(new ZM$$ExternalSyntheticLambda0(this, 13, searchResponse));
        int i2 = MediaSessionCompatQueueItem + 117;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public static final void access$notifyAllObservers(DropShadowEffect dropShadowEffect, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        int i = 2 % 2;
        BuildersKt.RemoteActionCompatParcelizer(((JobControl) dropShadowEffect.RatingCompat).scope, null, null, new FlowLiveDataConversions$asFlow$1$1(dropShadowEffect, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, (ShortNewsContentCardView) null, 22), 3);
        int i2 = MediaMetadataCompat + 35;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public Object logRiderSafetyPermissionDenied(String str, RxConvertKt$asFlow$1 rxConvertKt$asFlow$1) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 109;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Map mapSingletonMap = Collections.singletonMap("name", str);
        mapSingletonMap.getClass();
        Object objLogEvent = logEvent("rider_safety_permission_denied", mapSingletonMap, rxConvertKt$asFlow$1);
        if (objLogEvent != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return createFromParcel.INSTANCE;
        }
        int i4 = MediaSessionCompatQueueItem + 13;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objLogEvent;
        }
        throw null;
    }

    public Object logRiderSafetyPermissionGranted(String str, RxConvertKt$asFlow$1 rxConvertKt$asFlow$1) throws Throwable {
        int i = 2 % 2;
        Map mapSingletonMap = Collections.singletonMap("name", str);
        mapSingletonMap.getClass();
        Object objLogEvent = logEvent("rider_safety_permission_granted", mapSingletonMap, rxConvertKt$asFlow$1);
        if (objLogEvent != CoroutineSingletons.COROUTINE_SUSPENDED) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            int i2 = MediaMetadataCompat + 3;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return createfromparcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i3 = MediaSessionCompatQueueItem + 43;
        MediaMetadataCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 32 / 0;
        }
        return objLogEvent;
    }

    public Object logEvent(String str, Map map, SuspendLambda suspendLambda) throws Throwable {
        int i = 2 % 2;
        ((inCompatibilityMode) ((isOpenInternalroom_runtime) this.RatingCompat)).getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new NafathTimerDataStore$set$2(this, str, map, null, 13), suspendLambda);
        if (objWithContext == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i2 = MediaMetadataCompat + 3;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 38 / 0;
            }
            return objWithContext;
        }
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = MediaMetadataCompat + 21;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return createfromparcel;
        }
        throw null;
    }

    public void setLastUpdate(RoutesPreviewUpdate routesPreviewUpdate) {
        Iterator it;
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 79;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (routesPreviewUpdate.equals((RoutesPreviewUpdate) this.serializer)) {
            return;
        }
        int i4 = MediaMetadataCompat + 45;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            this.serializer = routesPreviewUpdate;
            it = ((CopyOnWriteArrayList) this.MediaDescriptionCompat).iterator();
            int i5 = 87 / 0;
        } else {
            this.serializer = routesPreviewUpdate;
            it = ((CopyOnWriteArrayList) this.MediaDescriptionCompat).iterator();
        }
        while (!(!it.hasNext())) {
            int i6 = MediaMetadataCompat + 73;
            MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                ((RoutesCacheClearer) it.next()).routesPreviewUpdated(routesPreviewUpdate);
                throw null;
            }
            ((RoutesCacheClearer) it.next()).routesPreviewUpdated(routesPreviewUpdate);
        }
    }

    @Override // o.ScrollCapture_androidKt
    public ScrollCaptureExternalSyntheticApiModelOutline0 getDecryptHandler() throws CryptoException {
        int i = 2 % 2;
        x xVar = new x(11);
        xVar.IconCompatParcelizer = (getScrollCaptureInProgress) this.read;
        PrivateKey privateKey = (PrivateKey) this.write;
        if (privateKey != null) {
            DefaultDecryptHandler defaultDecryptHandler = new DefaultDecryptHandler((getCanScrollVertically) this.RatingCompat, privateKey, xVar, (AlgorithmParameterSpec) this.MediaDescriptionCompat, 0);
            int i2 = MediaMetadataCompat + 31;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 40 / 0;
            }
            return defaultDecryptHandler;
        }
        throw new CryptoException("privateKey is invalid.");
    }

    @Override // o.ScrollCapture_androidKt
    public ScrollCaptureonScrollCaptureSearch1 getEncryptHandler() throws CryptoException {
        int i = 2 % 2;
        x xVar = new x(11);
        xVar.IconCompatParcelizer = (getScrollCaptureInProgress) this.read;
        PublicKey publicKey = (PublicKey) this.serializer;
        if (publicKey != null) {
            DefaultDecryptHandler defaultDecryptHandler = new DefaultDecryptHandler((getCanScrollVertically) this.RatingCompat, publicKey, xVar, (AlgorithmParameterSpec) this.MediaDescriptionCompat, 1);
            int i2 = MediaSessionCompatQueueItem + 9;
            MediaMetadataCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return defaultDecryptHandler;
        }
        throw new CryptoException("publicKey is invalid.");
    }

    @Override // o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34
    public void inject(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 7;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.RemoteActionCompatParcelizer != 5) {
            RiderSafetyPermissionFragment riderSafetyPermissionFragment = (RiderSafetyPermissionFragment) obj;
            riderSafetyPermissionFragment.removeOnUserLeaveHintListener = ((getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.read).PlaybackStateCompatCustomAction();
            riderSafetyPermissionFragment.getSavedStateRegistry = (isValidSource) ((getDoubleOrNull) this.MediaDescriptionCompat).write;
            riderSafetyPermissionFragment.getOnBackPressedDispatcher = new internalInitInvalidationTracker(1);
            int i3 = MediaMetadataCompat + 119;
            MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 70 / 0;
                return;
            }
            return;
        }
        BiometricsActivity biometricsActivity = (BiometricsActivity) obj;
        biometricsActivity._init_lambda1 = ((getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.read).PlaybackStateCompatCustomAction();
        biometricsActivity.MediaBrowserCompatMediaItem = (SemanticsSortKtspecialinlinedthenBy1) ((getDoubleOrNull) this.serializer).write;
        biometricsActivity.MediaSessionCompatQueueItem = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((isHiddenannotations) this.MediaDescriptionCompat);
        int i5 = MediaMetadataCompat + 109;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 54 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public Object hasTimeRemaining(String str, ContinuationImpl continuationImpl) {
        updateAttributionI updateattributioni;
        int i = 2 % 2;
        if (continuationImpl instanceof updateAttributionI) {
            updateattributioni = (updateAttributionI) continuationImpl;
            int i2 = updateattributioni.read;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateattributioni.read = i2 - Integer.MIN_VALUE;
            } else {
                updateattributioni = new updateAttributionI(this, continuationImpl);
            }
        } else {
            updateattributioni = new updateAttributionI(this, continuationImpl);
        }
        Object objInvoke = updateattributioni.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = updateattributioni.read;
        if (i3 != 0) {
            int i4 = MediaSessionCompatQueueItem + 59;
            int i5 = i4 % Fields.SpotShadowColor;
            MediaMetadataCompat = i5;
            int i6 = i4 % 2;
            Object obj = null;
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i7 = MediaMetadataCompat + 5;
                MediaSessionCompatQueueItem = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    int i8 = 44 / 0;
                }
                return null;
            }
            int i9 = i5 + 43;
            MediaSessionCompatQueueItem = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                obj.hashCode();
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            GetRemainingOtpVerificationTimerIfRunning getRemainingOtpVerificationTimerIfRunning = (GetRemainingOtpVerificationTimerIfRunning) this.RatingCompat;
            updateattributioni.read = 1;
            objInvoke = getRemainingOtpVerificationTimerIfRunning.invoke(str, updateattributioni);
            if (objInvoke == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return Boolean.valueOf(((Number) objInvoke).longValue() > 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if ((r2 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0076, code lost:
    
        return "RemoteEvent{snapshotVersion=" + ((com.google.firebase.firestore.model.SnapshotVersion) r4.read) + ", targetChanges=" + ((java.util.Map) r4.RatingCompat) + ", targetMismatches=" + ((java.util.Map) r4.write) + ", documentUpdates=" + ((java.util.Map) r4.serializer) + ", resolvedLimboDocuments=" + ((java.util.Set) r4.MediaDescriptionCompat) + '}';
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r4.RemoteActionCompatParcelizer != 15) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r4.RemoteActionCompatParcelizer != 15) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r1 = super.toString();
        r2 = com.airbnb.lottie.parser.DropShadowEffect.MediaMetadataCompat + 23;
        com.airbnb.lottie.parser.DropShadowEffect.MediaSessionCompatQueueItem = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.airbnb.lottie.parser.DropShadowEffect.MediaSessionCompatQueueItem
            int r1 = r1 + 11
            int r2 = r1 % 128
            com.airbnb.lottie.parser.DropShadowEffect.MediaMetadataCompat = r2
            int r1 = r1 % r0
            r2 = 15
            if (r1 != 0) goto L19
            int r1 = r4.RemoteActionCompatParcelizer
            r3 = 94
            int r3 = r3 / 0
            if (r1 == r2) goto L2f
            goto L1d
        L19:
            int r1 = r4.RemoteActionCompatParcelizer
            if (r1 == r2) goto L2f
        L1d:
            java.lang.String r1 = super.toString()
            int r2 = com.airbnb.lottie.parser.DropShadowEffect.MediaMetadataCompat
            int r2 = r2 + 23
            int r3 = r2 % 128
            com.airbnb.lottie.parser.DropShadowEffect.MediaSessionCompatQueueItem = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L2d
            return r1
        L2d:
            r0 = 0
            throw r0
        L2f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RemoteEvent{snapshotVersion="
            r0.<init>(r1)
            java.lang.Object r1 = r4.read
            com.google.firebase.firestore.model.SnapshotVersion r1 = (com.google.firebase.firestore.model.SnapshotVersion) r1
            r0.append(r1)
            java.lang.String r1 = ", targetChanges="
            r0.append(r1)
            java.lang.Object r1 = r4.RatingCompat
            java.util.Map r1 = (java.util.Map) r1
            r0.append(r1)
            java.lang.String r1 = ", targetMismatches="
            r0.append(r1)
            java.lang.Object r1 = r4.write
            java.util.Map r1 = (java.util.Map) r1
            r0.append(r1)
            java.lang.String r1 = ", documentUpdates="
            r0.append(r1)
            java.lang.Object r1 = r4.serializer
            java.util.Map r1 = (java.util.Map) r1
            r0.append(r1)
            java.lang.String r1 = ", resolvedLimboDocuments="
            r0.append(r1)
            java.lang.Object r1 = r4.MediaDescriptionCompat
            java.util.Set r1 = (java.util.Set) r1
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.DropShadowEffect.toString():java.lang.String");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public Object startOrResume(String str, ContinuationImpl continuationImpl) {
        tryTrackThirdPartySharingI trytrackthirdpartysharingi;
        int i = 2 % 2;
        if (continuationImpl instanceof tryTrackThirdPartySharingI) {
            int i2 = MediaSessionCompatQueueItem + 53;
            MediaMetadataCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            trytrackthirdpartysharingi = (tryTrackThirdPartySharingI) continuationImpl;
            int i4 = trytrackthirdpartysharingi.write;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                trytrackthirdpartysharingi.write = i4 - Integer.MIN_VALUE;
            } else {
                trytrackthirdpartysharingi = new tryTrackThirdPartySharingI(this, continuationImpl);
            }
        } else {
            trytrackthirdpartysharingi = new tryTrackThirdPartySharingI(this, continuationImpl);
        }
        Object objInvoke = trytrackthirdpartysharingi.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = trytrackthirdpartysharingi.write;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            GetRemainingOtpVerificationTimerIfRunning getRemainingOtpVerificationTimerIfRunning = (GetRemainingOtpVerificationTimerIfRunning) this.RatingCompat;
            trytrackthirdpartysharingi.write = 1;
            objInvoke = getRemainingOtpVerificationTimerIfRunning.invoke(str, trytrackthirdpartysharingi);
            if (objInvoke == coroutineSingletons) {
                int i6 = MediaSessionCompatQueueItem + 111;
                MediaMetadataCompat = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    int i7 = 82 / 0;
                }
                return coroutineSingletons;
            }
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i8 = MediaSessionCompatQueueItem + 63;
            MediaMetadataCompat = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                int i9 = 1 / 0;
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            }
        }
        long jLongValue = ((Number) objInvoke).longValue();
        if (jLongValue > 0) {
            int i10 = MediaMetadataCompat + 75;
            MediaSessionCompatQueueItem = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            ((CountDownTimerUiModel) this.read).write(jLongValue);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:15:0x003e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    /* JADX WARN: Code duplicated, block: B:21:0x007d  */
    /* JADX WARN: Code duplicated, block: B:23:0x009b  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public Object clearDataIfNeeded(metaMarkUpdatedAndHasCallbacks metamarkupdatedandhascallbacks, metaMarkUpdatedAndHasCallbacks metamarkupdatedandhascallbacks2, ContinuationImpl continuationImpl) {
        AfterVersion afterVersion;
        int i;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i2;
        createFromParcel createfromparcel;
        Object objStoreUserName;
        int i3 = 2 % 2;
        int i4 = MediaSessionCompatQueueItem + 85;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            if (continuationImpl instanceof AfterVersion) {
                afterVersion = (AfterVersion) continuationImpl;
                i = afterVersion.write;
                if ((i & Integer.MIN_VALUE) != 0) {
                    afterVersion.write = i - Integer.MIN_VALUE;
                }
            }
            obj = afterVersion.read;
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i2 = afterVersion.write;
            createfromparcel = createFromParcel.INSTANCE;
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{metamarkupdatedandhascallbacks, metamarkupdatedandhascallbacks2}, getCieXyz.write())).booleanValue()) {
                    GetAppStateImpl getAppStateImpl = (GetAppStateImpl) this.read;
                    afterVersion.write = 1;
                    getAppStateImpl.getClass();
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("ClearUserNameUseCase is invoked", new Object[0]);
                    objStoreUserName = ((LoginStorageManager) getAppStateImpl.serializer).storeUserName("", afterVersion);
                    if (objStoreUserName == coroutineSingletons) {
                        int i5 = MediaMetadataCompat + 9;
                        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
                        int i6 = i5 % 2;
                    } else {
                        objStoreUserName = createfromparcel;
                    }
                    if (objStoreUserName == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return createfromparcel;
            }
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i7 = MediaSessionCompatQueueItem + 53;
            MediaMetadataCompat = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ((setTraversalGroup) ((setSensitiveData) this.serializer)).IconCompatParcelizer();
            return createfromparcel;
        }
        int i9 = 94 / 0;
        if (continuationImpl instanceof AfterVersion) {
            afterVersion = (AfterVersion) continuationImpl;
            i = afterVersion.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                afterVersion.write = i - Integer.MIN_VALUE;
            }
        }
        obj = afterVersion.read;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = afterVersion.write;
        createfromparcel = createFromParcel.INSTANCE;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{metamarkupdatedandhascallbacks, metamarkupdatedandhascallbacks2}, getCieXyz.write())).booleanValue()) {
                GetAppStateImpl getAppStateImpl2 = (GetAppStateImpl) this.read;
                afterVersion.write = 1;
                getAppStateImpl2.getClass();
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("ClearUserNameUseCase is invoked", new Object[0]);
                objStoreUserName = ((LoginStorageManager) getAppStateImpl2.serializer).storeUserName("", afterVersion);
                if (objStoreUserName == coroutineSingletons) {
                    int i10 = MediaMetadataCompat + 9;
                    MediaSessionCompatQueueItem = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                } else {
                    objStoreUserName = createfromparcel;
                }
                if (objStoreUserName == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return createfromparcel;
        }
        if (i2 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i12 = MediaSessionCompatQueueItem + 53;
        MediaMetadataCompat = i12 % Fields.SpotShadowColor;
        int i13 = i12 % 2;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        ((setTraversalGroup) ((setSensitiveData) this.serializer)).IconCompatParcelizer();
        return createfromparcel;
        afterVersion = new AfterVersion(this, continuationImpl);
        obj = afterVersion.read;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = afterVersion.write;
        createfromparcel = createFromParcel.INSTANCE;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{metamarkupdatedandhascallbacks, metamarkupdatedandhascallbacks2}, getCieXyz.write())).booleanValue()) {
                GetAppStateImpl getAppStateImpl3 = (GetAppStateImpl) this.read;
                afterVersion.write = 1;
                getAppStateImpl3.getClass();
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("ClearUserNameUseCase is invoked", new Object[0]);
                objStoreUserName = ((LoginStorageManager) getAppStateImpl3.serializer).storeUserName("", afterVersion);
                if (objStoreUserName == coroutineSingletons) {
                    int i14 = MediaMetadataCompat + 9;
                    MediaSessionCompatQueueItem = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                } else {
                    objStoreUserName = createfromparcel;
                }
                if (objStoreUserName == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return createfromparcel;
        }
        if (i2 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i16 = MediaSessionCompatQueueItem + 53;
        MediaMetadataCompat = i16 % Fields.SpotShadowColor;
        int i17 = i16 % 2;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        ((setTraversalGroup) ((setSensitiveData) this.serializer)).IconCompatParcelizer();
        return createfromparcel;
    }

    public static final void run$lambda$4$notifyCallbackIfNeeded(accessprocessDragStart accessprocessdragstart, final List list, DropShadowEffect dropShadowEffect, BaseResponseInfo baseResponseInfo) {
        final Throwable thSerializer;
        int i = 2 % 2;
        if (accessprocessdragstart.write() == list.size()) {
            ArrayList arrayList = new ArrayList();
            getInAppMessageStackannotations it = SQLite.write((Collection) list).iterator();
            while (it.RemoteActionCompatParcelizer) {
                final int iRemoteActionCompatParcelizer = it.RemoteActionCompatParcelizer();
                onItemDismiss onitemdismiss = (onItemDismiss) isInterested.RemoteActionCompatParcelizer(accessprocessdragstart, iRemoteActionCompatParcelizer);
                if (onitemdismiss != null) {
                    Object obj = onitemdismiss.IconCompatParcelizer;
                    if (!(obj instanceof isItemDismissable)) {
                        int i2 = MediaSessionCompatQueueItem + 109;
                        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
                        if (i2 % 2 == 0) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            arrayList.add(obj);
                            throw null;
                        }
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        arrayList.add(obj);
                    }
                }
                if (onitemdismiss != null) {
                    int i3 = MediaSessionCompatQueueItem + 1;
                    MediaMetadataCompat = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 == 0) {
                        onItemDismiss.serializer(onitemdismiss.IconCompatParcelizer);
                        throw null;
                    }
                    thSerializer = onItemDismiss.serializer(onitemdismiss.IconCompatParcelizer);
                    int i4 = MediaSessionCompatQueueItem + 105;
                    MediaMetadataCompat = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                } else {
                    thSerializer = null;
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.search.base.engine.OneStepRequestCallbackWrapper$run$1$notifyCallbackIfNeeded$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final Object invoke() {
                        StringBuilder sb = new StringBuilder("Can't parse data from backend: ");
                        sb.append(list.get(iRemoteActionCompatParcelizer));
                        sb.append(": ");
                        Throwable th = thSerializer;
                        sb.append(th != null ? th.getMessage() : null);
                        return sb.toString();
                    }
                };
                new IllegalStateException(r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke().toString(), thSerializer);
                String string = r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke().toString();
                string.getClass();
                CommonSdkLog.INSTANCE.loge(null, string);
            }
            ((AsyncOperationTaskImpl) dropShadowEffect.serializer).markExecutedAndRunOnCallback((AndroidMainThreadWorkerImpl$$ExternalSyntheticLambda0) dropShadowEffect.RatingCompat, new MapboxNavigation$notification$1$1(arrayList, 10, baseResponseInfo));
            int i6 = MediaMetadataCompat + 29;
            MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (r5 == 2) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.mapbox.navigation.tripdata.progress.model.TripProgressUpdateFormatter build() {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.Object r1 = r9.read
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r2 = r9.RatingCompat
            com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda4 r2 = (com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda4) r2
            if (r2 != 0) goto L1c
            android.content.Context r2 = r1.getApplicationContext()
            r2.getClass()
            androidx.navigation.internal.NavContext r3 = new androidx.navigation.internal.NavContext
            r4 = 12
            r3.<init>(r2, r4)
            r2 = r3
        L1c:
            java.lang.Object r3 = r9.write
            com.mapbox.search.analytics.AnalyticsServiceImpl r3 = (com.mapbox.search.analytics.AnalyticsServiceImpl) r3
            if (r3 != 0) goto L77
            com.google.re2j.Machine$Queue r3 = new com.google.re2j.Machine$Queue
            r3.<init>(r1)
            com.mapbox.navigation.base.formatter.DistanceFormatterOptions r3 = r3.build()
            com.mapbox.navigation.base.formatter.UnitType r4 = r3.unitType
            int[] r5 = com.mapbox.navigation.tripdata.progress.model.TripProgressUpdateFormatter$Builder$WhenMappings.$EnumSwitchMapping$0
            int r6 = r4.ordinal()
            r5 = r5[r6]
            r6 = 1
            r7 = 5
            if (r5 == r6) goto L5a
            int r6 = com.airbnb.lottie.parser.DropShadowEffect.MediaMetadataCompat
            int r6 = r6 + 115
            int r8 = r6 % 128
            com.airbnb.lottie.parser.DropShadowEffect.MediaSessionCompatQueueItem = r8
            int r6 = r6 % r0
            if (r6 == 0) goto L48
            if (r5 != r7) goto L4c
            r0 = 3
            goto L4a
        L48:
            if (r5 != r0) goto L4c
        L4a:
            r7 = r0
            goto L5a
        L4c:
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer()
            int r1 = com.airbnb.lottie.parser.DropShadowEffect.MediaMetadataCompat
            int r1 = r1 + 39
            int r2 = r1 % 128
            com.airbnb.lottie.parser.DropShadowEffect.MediaSessionCompatQueueItem = r2
            int r1 = r1 % r0
            r0 = 0
            return r0
        L5a:
            android.content.Context r0 = r3.applicationContext
            com.google.re2j.Machine$Queue r5 = new com.google.re2j.Machine$Queue
            r5.<init>(r0)
            java.util.Locale r0 = r3.locale
            r0.getClass()
            r5.serializer = r0
            r5.write = r4
            r5.read = r7
            com.mapbox.navigation.base.formatter.DistanceFormatterOptions r0 = r5.build()
            com.mapbox.search.analytics.AnalyticsServiceImpl r3 = new com.mapbox.search.analytics.AnalyticsServiceImpl
            r4 = 15
            r3.<init>(r0, r4)
        L77:
            java.lang.Object r0 = r9.serializer
            androidx.navigation.internal.NavContext r0 = (androidx.navigation.internal.NavContext) r0
            if (r0 != 0) goto L8c
            android.content.Context r0 = r1.getApplicationContext()
            r0.getClass()
            androidx.navigation.internal.NavContext r1 = new androidx.navigation.internal.NavContext
            r4 = 13
            r1.<init>(r0, r4)
            r0 = r1
        L8c:
            java.lang.Object r1 = r9.MediaDescriptionCompat
            com.huawei.wisesecurity.ucs_credential.g0 r1 = (com.huawei.wisesecurity.ucs_credential.g0) r1
            if (r1 != 0) goto L98
            com.huawei.wisesecurity.ucs_credential.g0 r1 = new com.huawei.wisesecurity.ucs_credential.g0
            r4 = 0
            r1.<init>(r4)
        L98:
            com.mapbox.navigation.tripdata.progress.model.TripProgressUpdateFormatter r4 = new com.mapbox.navigation.tripdata.progress.model.TripProgressUpdateFormatter
            r4.<init>(r2, r3, r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.DropShadowEffect.build():com.mapbox.navigation.tripdata.progress.model.TripProgressUpdateFormatter");
    }

    public void IconCompatParcelizer() {
        Camera2CameraFactory camera2CameraFactory;
        final int i = 2;
        int i2 = 2 % 2;
        PrematureEndOfStreamVideoQuirk.write();
        BlockRunner blockRunner = (BlockRunner) this.write;
        blockRunner.getClass();
        PrematureEndOfStreamVideoQuirk.write();
        ConfigureSurfaceToSecondarySessionFailQuirk configureSurfaceToSecondarySessionFailQuirk = (ConfigureSurfaceToSecondarySessionFailQuirk) blockRunner.RemoteActionCompatParcelizer;
        Objects.requireNonNull(configureSurfaceToSecondarySessionFailQuirk);
        final AuthPromptFailureException authPromptFailureException = (AuthPromptFailureException) blockRunner.serializer;
        Objects.requireNonNull(authPromptFailureException);
        final AuthPromptFailureException authPromptFailureException2 = (AuthPromptFailureException) blockRunner.RatingCompat;
        Camera2CameraFactory camera2CameraFactory2 = configureSurfaceToSecondarySessionFailQuirk.MediaDescriptionCompat;
        Objects.requireNonNull(camera2CameraFactory2);
        camera2CameraFactory2.write();
        Camera2CameraFactory camera2CameraFactory3 = configureSurfaceToSecondarySessionFailQuirk.MediaDescriptionCompat;
        Objects.requireNonNull(camera2CameraFactory3);
        final int i3 = 0;
        VideoQualityQuirk.write((DrawModifierNodeKt) camera2CameraFactory3.ParcelableVolumeInfo).RemoteActionCompatParcelizer(new Runnable() { // from class: o.ExcludedSupportedSizesQuirk
            @Override // java.lang.Runnable
            public final void run() {
                int i4 = i3;
                AuthPromptFailureException authPromptFailureException3 = authPromptFailureException;
                if (i4 == 0) {
                    authPromptFailureException3.MediaSessionCompatQueueItem();
                    return;
                }
                if (i4 != 1) {
                    if (authPromptFailureException3 != null) {
                        authPromptFailureException3.MediaSessionCompatQueueItem();
                    }
                } else if (authPromptFailureException3 != null) {
                    authPromptFailureException3.MediaSessionCompatQueueItem();
                }
            }
        }, removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer());
        Camera2CameraFactory camera2CameraFactory4 = configureSurfaceToSecondarySessionFailQuirk.write;
        final int i4 = 1;
        if (camera2CameraFactory4 != null) {
            camera2CameraFactory4.write();
            final AuthPromptFailureException authPromptFailureException3 = null;
            VideoQualityQuirk.write((DrawModifierNodeKt) configureSurfaceToSecondarySessionFailQuirk.write.ParcelableVolumeInfo).RemoteActionCompatParcelizer(new Runnable() { // from class: o.ExcludedSupportedSizesQuirk
                @Override // java.lang.Runnable
                public final void run() {
                    int i5 = i4;
                    AuthPromptFailureException authPromptFailureException4 = authPromptFailureException3;
                    if (i5 == 0) {
                        authPromptFailureException4.MediaSessionCompatQueueItem();
                        return;
                    }
                    if (i5 != 1) {
                        if (authPromptFailureException4 != null) {
                            authPromptFailureException4.MediaSessionCompatQueueItem();
                        }
                    } else if (authPromptFailureException4 != null) {
                        authPromptFailureException4.MediaSessionCompatQueueItem();
                    }
                }
            }, removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer());
            int i5 = MediaMetadataCompat + 71;
            MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        if (configureSurfaceToSecondarySessionFailQuirk.MediaBrowserCompatMediaItem.size() > 1 && (camera2CameraFactory = configureSurfaceToSecondarySessionFailQuirk.RatingCompat) != null) {
            camera2CameraFactory.write();
            VideoQualityQuirk.write((DrawModifierNodeKt) configureSurfaceToSecondarySessionFailQuirk.RatingCompat.ParcelableVolumeInfo).RemoteActionCompatParcelizer(new Runnable() { // from class: o.ExcludedSupportedSizesQuirk
                @Override // java.lang.Runnable
                public final void run() {
                    int i7 = i;
                    AuthPromptFailureException authPromptFailureException4 = authPromptFailureException2;
                    if (i7 == 0) {
                        authPromptFailureException4.MediaSessionCompatQueueItem();
                        return;
                    }
                    if (i7 != 1) {
                        if (authPromptFailureException4 != null) {
                            authPromptFailureException4.MediaSessionCompatQueueItem();
                        }
                    } else if (authPromptFailureException4 != null) {
                        authPromptFailureException4.MediaSessionCompatQueueItem();
                    }
                }
            }, removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer());
            int i7 = MediaSessionCompatQueueItem + 53;
            MediaMetadataCompat = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 2 % 4;
            }
        }
        ((FlashTooSlowQuirk) this.serializer).getClass();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a1 A[PHI: r9
  0x00a1: PHI (r9v6 java.lang.Object) = (r9v5 java.lang.Object), (r9v7 java.lang.Object) binds: [B:25:0x009e, B:22:0x0087] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    /* JADX INFO: renamed from: invoke-0E7RQCE, reason: not valid java name */
    public Object m4007invoke0E7RQCE(String str, BiometricsActivity biometricsActivity, ContinuationImpl continuationImpl) {
        LaunchBiometricsEncryptionUseCase$invoke$1 launchBiometricsEncryptionUseCase$invoke$1;
        Object objM4006encryptAndStoreTokenyxL6bBk;
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 79;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof LaunchBiometricsEncryptionUseCase$invoke$1) {
            launchBiometricsEncryptionUseCase$invoke$1 = (LaunchBiometricsEncryptionUseCase$invoke$1) continuationImpl;
            int i4 = launchBiometricsEncryptionUseCase$invoke$1.read;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = MediaSessionCompatQueueItem + 73;
                MediaMetadataCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                launchBiometricsEncryptionUseCase$invoke$1.read = i4 - Integer.MIN_VALUE;
            } else {
                launchBiometricsEncryptionUseCase$invoke$1 = new LaunchBiometricsEncryptionUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            launchBiometricsEncryptionUseCase$invoke$1 = new LaunchBiometricsEncryptionUseCase$invoke$1(this, continuationImpl);
        }
        LaunchBiometricsEncryptionUseCase$invoke$1 launchBiometricsEncryptionUseCase$invoke$2 = launchBiometricsEncryptionUseCase$invoke$1;
        Object obj = launchBiometricsEncryptionUseCase$invoke$2.serializer;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = launchBiometricsEncryptionUseCase$invoke$2.read;
        if (i7 != 0) {
            if (i7 != 1 && i7 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Object obj3 = ((onItemDismiss) obj).IconCompatParcelizer;
            int i8 = MediaMetadataCompat + 77;
            MediaSessionCompatQueueItem = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return obj3;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        setTextSubstitution settextsubstitutionWrite = ((setTextSubstitutiondefault) this.RatingCompat).write();
        setTraversalIndex settraversalindex = settextsubstitutionWrite.serializer;
        setTextSelectionRangeFDrldGo settextselectionrangefdrldgo = settraversalindex.IconCompatParcelizer;
        setTextSelectionRangeFDrldGo settextselectionrangefdrldgo2 = setTextSelectionRangeFDrldGo.AVAILABLE;
        if (settextselectionrangefdrldgo == settextselectionrangefdrldgo2) {
            int i10 = MediaMetadataCompat + 63;
            MediaSessionCompatQueueItem = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                setToggleableState settoggleablestate = (setToggleableState) onContentCardDismissed.read(settraversalindex.read);
                launchBiometricsEncryptionUseCase$invoke$2.read = 0;
                objM4006encryptAndStoreTokenyxL6bBk = m4006encryptAndStoreTokenyxL6bBk(settoggleablestate, 62, biometricsActivity, str, launchBiometricsEncryptionUseCase$invoke$2);
                if (objM4006encryptAndStoreTokenyxL6bBk != obj2) {
                    return objM4006encryptAndStoreTokenyxL6bBk;
                }
            } else {
                setToggleableState settoggleablestate2 = (setToggleableState) onContentCardDismissed.read(settraversalindex.read);
                launchBiometricsEncryptionUseCase$invoke$2.read = 1;
                objM4006encryptAndStoreTokenyxL6bBk = m4006encryptAndStoreTokenyxL6bBk(settoggleablestate2, 15, biometricsActivity, str, launchBiometricsEncryptionUseCase$invoke$2);
                if (objM4006encryptAndStoreTokenyxL6bBk != obj2) {
                    return objM4006encryptAndStoreTokenyxL6bBk;
                }
            }
        } else {
            setTraversalIndex settraversalindex2 = settextsubstitutionWrite.RemoteActionCompatParcelizer;
            if (settraversalindex2.IconCompatParcelizer != settextselectionrangefdrldgo2) {
                ((setShowingTextSubstitution) this.read).serializer("None", "ENCRYPTION", "Biometrics not available");
                return new isItemDismissable(new getTestTagsAsResourceIddelegate(null));
            }
            setToggleableState settoggleablestate3 = (setToggleableState) onContentCardDismissed.read(settraversalindex2.read);
            launchBiometricsEncryptionUseCase$invoke$2.read = 2;
            Object objM4006encryptAndStoreTokenyxL6bBk2 = m4006encryptAndStoreTokenyxL6bBk(settoggleablestate3, 255, biometricsActivity, str, launchBiometricsEncryptionUseCase$invoke$2);
            if (objM4006encryptAndStoreTokenyxL6bBk2 != obj2) {
                return objM4006encryptAndStoreTokenyxL6bBk2;
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX WARN: Code duplicated, block: B:18:0x0050  */
    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    /* JADX WARN: Code duplicated, block: B:32:0x008a A[Catch: all -> 0x00ab, TryCatch #0 {all -> 0x00ab, blocks: (B:19:0x0052, B:35:0x0099, B:24:0x0062, B:30:0x0080, B:32:0x008a, B:37:0x00a3, B:38:0x00aa, B:27:0x0069), top: B:52:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a3 A[Catch: all -> 0x00ab, TryCatch #0 {all -> 0x00ab, blocks: (B:19:0x0052, B:35:0x0099, B:24:0x0062, B:30:0x0080, B:32:0x008a, B:37:0x00a3, B:38:0x00aa, B:27:0x0069), top: B:52:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x0023 A[PHI: r1
  0x0023: PHI (r1v6 o.setShowingTextSubstitution) = (r1v5 o.setShowingTextSubstitution), (r1v10 o.setShowingTextSubstitution) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
    
        if (r11.invoke(r12, r13, r2) == r3) goto L34;
     */
    /* JADX INFO: renamed from: encryptAndStoreToken-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m4006encryptAndStoreTokenyxL6bBk(o.setToggleableState r9, int r10, androidx.fragment.app.FragmentActivity r11, java.lang.String r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.DropShadowEffect.m4006encryptAndStoreTokenyxL6bBk(o.setToggleableState, int, androidx.fragment.app.FragmentActivity, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public void read(ImageCapture1 imageCapture1, ImageCapture1 imageCapture2, setBrightness setbrightness, setBrightness setbrightness2, Map.Entry entry) {
        ImageCapture1 imageCapture3;
        int i = 2 % 2;
        setBrightness setbrightness3 = (setBrightness) entry.getValue();
        Objects.toString(setbrightness3);
        setInflatedId.IconCompatParcelizer(3, "DualSurfaceProcessorNode");
        getContentInsetEndWithActions getcontentinsetendwithactions = new getContentInsetEndWithActions(setbrightness.MediaSessionCompatResultReceiverWrapper.MediaMetadataCompat, ((getCardBackgroundColor) entry.getKey()).read.RemoteActionCompatParcelizer, setbrightness.serializer ? imageCapture1 : null, ((getCardBackgroundColor) entry.getKey()).read.read, ((getCardBackgroundColor) entry.getKey()).read.MediaMetadataCompat);
        Size size = setbrightness2.MediaSessionCompatResultReceiverWrapper.MediaMetadataCompat;
        Rect rect = ((getCardBackgroundColor) entry.getKey()).serializer.RemoteActionCompatParcelizer;
        if (setbrightness2.serializer) {
            int i2 = MediaMetadataCompat + 33;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            imageCapture3 = imageCapture2;
        } else {
            imageCapture3 = null;
        }
        getContentInsetEndWithActions getcontentinsetendwithactions2 = new getContentInsetEndWithActions(size, rect, imageCapture3, ((getCardBackgroundColor) entry.getKey()).serializer.read, ((getCardBackgroundColor) entry.getKey()).serializer.MediaMetadataCompat);
        int i4 = ((getCardBackgroundColor) entry.getKey()).read.IconCompatParcelizer;
        setbrightness3.getClass();
        PrematureEndOfStreamVideoQuirk.write();
        setbrightness3.write();
        UtilsKt.RemoteActionCompatParcelizer("Consumer can only be linked once.", !setbrightness3.IconCompatParcelizer);
        setbrightness3.IconCompatParcelizer = true;
        SurfaceViewStretchedQuirk surfaceViewStretchedQuirk = setbrightness3.MediaSessionCompatToken;
        StretchedVideoResolutionQuirk stretchedVideoResolutionQuirkSerializer = VideoQualityQuirk.serializer(surfaceViewStretchedQuirk.IconCompatParcelizer(), new getBrightness(setbrightness3, surfaceViewStretchedQuirk, i4, getcontentinsetendwithactions, getcontentinsetendwithactions2), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer());
        stretchedVideoResolutionQuirkSerializer.RemoteActionCompatParcelizer(new zza(stretchedVideoResolutionQuirkSerializer, 1, new i$d(this, 6, setbrightness3)), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer());
        int i5 = MediaMetadataCompat + 113;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 53 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002e  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00fb, code lost:
    
        if (r1.refreshUserInfo(r4) == r6) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(o.metaMarkUpdatedAndHasCallbacks r23, kotlin.coroutines.jvm.internal.ContinuationImpl r24) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.DropShadowEffect.invoke(o.metaMarkUpdatedAndHasCallbacks, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002a  */
    public static final Object access$previewRoutesInternal(DropShadowEffect dropShadowEffect, List list, int i, ContinuationImpl continuationImpl) {
        RoutesPreviewController$previewRoutesInternal$1 routesPreviewController$previewRoutesInternal$1;
        List list2;
        DropShadowEffect dropShadowEffect2;
        List list3;
        NavigationRoute navigationRoute;
        DropShadowEffect dropShadowEffect3 = dropShadowEffect;
        List list4 = list;
        int i2 = 2 % 2;
        dropShadowEffect.getClass();
        if (continuationImpl instanceof RoutesPreviewController$previewRoutesInternal$1) {
            routesPreviewController$previewRoutesInternal$1 = (RoutesPreviewController$previewRoutesInternal$1) continuationImpl;
            int i3 = routesPreviewController$previewRoutesInternal$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                routesPreviewController$previewRoutesInternal$1.label = i3 - Integer.MIN_VALUE;
                int i4 = MediaMetadataCompat + 35;
                MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            } else {
                routesPreviewController$previewRoutesInternal$1 = new RoutesPreviewController$previewRoutesInternal$1(dropShadowEffect3, continuationImpl);
            }
        } else {
            routesPreviewController$previewRoutesInternal$1 = new RoutesPreviewController$previewRoutesInternal$1(dropShadowEffect3, continuationImpl);
        }
        Object obj = routesPreviewController$previewRoutesInternal$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = routesPreviewController$previewRoutesInternal$1.label;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (list.isEmpty()) {
                dropShadowEffect3.setLastUpdate(new RoutesPreviewUpdate("PREVIEW_CLEAN_UP", null));
                return createfromparcel;
            }
            if (i == 0) {
                int i7 = MediaSessionCompatQueueItem + 21;
                MediaMetadataCompat = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    throw null;
                }
                list2 = list4;
            } else {
                ArrayList arrayList = new ArrayList(list4);
                arrayList.add(0, (NavigationRoute) arrayList.remove(i));
                list2 = arrayList;
            }
            g0 g0Var = (g0) dropShadowEffect3.read;
            routesPreviewController$previewRoutesInternal$1.L$0 = dropShadowEffect3;
            routesPreviewController$previewRoutesInternal$1.L$1 = list4;
            routesPreviewController$previewRoutesInternal$1.L$2 = dropShadowEffect3;
            routesPreviewController$previewRoutesInternal$1.L$3 = list2;
            routesPreviewController$previewRoutesInternal$1.label = 1;
            obj = g0Var.parse(list2, routesPreviewController$previewRoutesInternal$1);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            dropShadowEffect2 = dropShadowEffect3;
            list3 = list2;
        } else {
            if (i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list5 = routesPreviewController$previewRoutesInternal$1.L$3;
            DropShadowEffect dropShadowEffect4 = routesPreviewController$previewRoutesInternal$1.L$2;
            List list6 = routesPreviewController$previewRoutesInternal$1.L$1;
            dropShadowEffect2 = routesPreviewController$previewRoutesInternal$1.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            list3 = list5;
            dropShadowEffect3 = dropShadowEffect4;
            list4 = list6;
        }
        dropShadowEffect3.getClass();
        List<RouteAlternative> listAlternativeRoutes = ((RoutesData) obj).alternativeRoutes();
        listAlternativeRoutes.getClass();
        List<RouteAlternative> list7 = listAlternativeRoutes;
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list7, 10));
        Iterator<T> it = list7.iterator();
        while (!(!it.hasNext())) {
            RouteAlternative routeAlternative = (RouteAlternative) it.next();
            Iterator it2 = list4.iterator();
            do {
                if (!it2.hasNext()) {
                    DrawableTransformation.write("Collection contains no element matching the predicate.");
                    int i8 = MediaMetadataCompat + 51;
                    MediaSessionCompatQueueItem = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    return null;
                }
                navigationRoute = (NavigationRoute) it2.next();
            } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{navigationRoute.id, routeAlternative.getRoute().getRouteId()}, getCieXyz.write())).booleanValue());
            int i10 = MediaSessionCompatQueueItem + 3;
            MediaMetadataCompat = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            arrayList2.add(zzmg.mapToMetadata(routeAlternative, navigationRoute));
        }
        RoutesPreview routesPreview = new RoutesPreview(list3, arrayList2, list4, list4.indexOf(onContentCardDismissed.read(list3)));
        dropShadowEffect2.getClass();
        dropShadowEffect2.setLastUpdate(new RoutesPreviewUpdate("PREVIEW_NEW", routesPreview));
        return createfromparcel;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00dc A[PHI: r13
  0x00dc: PHI (r13v3 o.u1) = (r13v2 o.u1), (r13v7 o.u1) binds: [B:37:0x00da, B:34:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00de A[PHI: r13
  0x00de: PHI (r13v6 o.u1) = (r13v2 o.u1), (r13v7 o.u1) binds: [B:37:0x00da, B:34:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0031  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.time.ZonedDateTime] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.time.ZonedDateTime] */
    /* JADX INFO: renamed from: invoke-BWLJW6A, reason: not valid java name */
    public Object m4008invokeBWLJW6A(String str, int i, String str2, ContinuationImpl continuationImpl) throws Throwable {
        GetBonusCalendarUiState$invoke$1 getBonusCalendarUiState$invoke$1;
        Object objM4503fetchBonusMultipliers0E7RQCE;
        String str3;
        u1 u1Var;
        int i2;
        long jM721copywmQWz5c$default;
        String str4;
        int i3 = 2;
        int i4 = 2 % 2;
        if (continuationImpl instanceof GetBonusCalendarUiState$invoke$1) {
            int i5 = MediaSessionCompatQueueItem + 69;
            MediaMetadataCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            getBonusCalendarUiState$invoke$1 = (GetBonusCalendarUiState$invoke$1) continuationImpl;
            int i7 = getBonusCalendarUiState$invoke$1.write;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                getBonusCalendarUiState$invoke$1.write = i7 - Integer.MIN_VALUE;
                int i8 = MediaSessionCompatQueueItem + 31;
                MediaMetadataCompat = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    int i9 = 4 % 5;
                }
            } else {
                getBonusCalendarUiState$invoke$1 = new GetBonusCalendarUiState$invoke$1(this, continuationImpl);
            }
        } else {
            getBonusCalendarUiState$invoke$1 = new GetBonusCalendarUiState$invoke$1(this, continuationImpl);
        }
        Object obj = getBonusCalendarUiState$invoke$1.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = getBonusCalendarUiState$invoke$1.write;
        Throwable th = null;
        int i11 = 1;
        if (i10 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            m mVar = (m) this.read;
            getBonusCalendarUiState$invoke$1.RemoteActionCompatParcelizer = str;
            getBonusCalendarUiState$invoke$1.write = 1;
            objM4503fetchBonusMultipliers0E7RQCE = mVar.m4503fetchBonusMultipliers0E7RQCE(i, str2, getBonusCalendarUiState$invoke$1);
            if (objM4503fetchBonusMultipliers0E7RQCE == coroutineSingletons) {
                return coroutineSingletons;
            }
            str3 = str;
        } else {
            if (i10 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str5 = getBonusCalendarUiState$invoke$1.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4503fetchBonusMultipliers0E7RQCE = ((onItemDismiss) obj).IconCompatParcelizer;
            str3 = str5;
        }
        if (!(!(objM4503fetchBonusMultipliers0E7RQCE instanceof isItemDismissable))) {
            return objM4503fetchBonusMultipliers0E7RQCE;
        }
        List list = ((u7) objM4503fetchBonusMultipliers0E7RQCE).multipliers;
        boolean zIsEmpty = list.isEmpty();
        setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) this.RatingCompat;
        if (zIsEmpty) {
            return new tf(str3, settransactionsuccessful.IconCompatParcelizer(R.string.rush_bonus_calendar_title), settransactionsuccessful.IconCompatParcelizer(R.string.rush_bonus_calendar_no_available_title), settransactionsuccessful.IconCompatParcelizer(R.string.rush_bonus_calendar_no_available_subtitle), false);
        }
        String strIconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(R.string.rush_bonus_calendar_title);
        List list2 = list;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
        int i12 = 0;
        for (Object obj2 : list2) {
            if (i12 < 0) {
                Throwable th2 = th;
                SQLite.serializer();
                throw th2;
            }
            int i13 = MediaSessionCompatQueueItem + 99;
            MediaMetadataCompat = i13 % Fields.SpotShadowColor;
            if (i13 % i3 == 0) {
                u1Var = (u1) obj2;
                if (i12 == list.size()) {
                    i2 = i11;
                } else {
                    int i14 = MediaSessionCompatQueueItem + 75;
                    MediaMetadataCompat = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % i3;
                    i2 = 0;
                }
            } else {
                u1Var = (u1) obj2;
                if (i12 == list.size() - i11) {
                    i2 = i11;
                } else {
                    int i16 = MediaSessionCompatQueueItem + 75;
                    MediaMetadataCompat = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % i3;
                    i2 = 0;
                }
            }
            ZonedDateTime zonedDateTime = ZonedDateTime.parse(u1Var.startTime);
            zonedDateTime.getClass();
            String str6 = u1Var.endTime;
            ZonedDateTime zonedDateTime2 = ZonedDateTime.parse(str6);
            zonedDateTime2.getClass();
            ZonedDateTime zonedDateTimeNow = ZonedDateTime.now((Clock) this.write);
            boolean z = (zonedDateTimeNow.isBefore(zonedDateTime2) && ((zonedDateTimeNow.isAfter(zonedDateTime) ? 1 : 0) ^ i11) == 0) ? i11 : 0;
            String str7 = u1Var.multiplier;
            BonusLevel bonusLevel = u1Var.bonusLevel;
            setLastHorizontalStyle setlasthorizontalstyle = (setLastHorizontalStyle) this.MediaDescriptionCompat;
            switch (u5.read[bonusLevel.ordinal()]) {
                case 1:
                    jM721copywmQWz5c$default = Color.m721copywmQWz5c$default(setlasthorizontalstyle.IconCompatParcelizer().setEmojiCompatEnabled(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    break;
                case 2:
                    jM721copywmQWz5c$default = Color.m721copywmQWz5c$default(setlasthorizontalstyle.IconCompatParcelizer().setEmojiCompatEnabled(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                    break;
                case 3:
                    jM721copywmQWz5c$default = Color.m721copywmQWz5c$default(setlasthorizontalstyle.IconCompatParcelizer().setEmojiCompatEnabled(), 0.25f, 0.0f, 0.0f, 0.0f, 14, null);
                    break;
                case 4:
                    jM721copywmQWz5c$default = Color.m721copywmQWz5c$default(setlasthorizontalstyle.IconCompatParcelizer().setEmojiCompatEnabled(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                    break;
                case 5:
                    jM721copywmQWz5c$default = Color.m721copywmQWz5c$default(setlasthorizontalstyle.IconCompatParcelizer().setEmojiCompatEnabled(), 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                    break;
                case 6:
                    jM721copywmQWz5c$default = setlasthorizontalstyle.IconCompatParcelizer().setEmojiCompatEnabled();
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
            }
            long j = jM721copywmQWz5c$default;
            int i18 = MediaMetadataCompat + 13;
            MediaSessionCompatQueueItem = i18 % Fields.SpotShadowColor;
            int i19 = i18 % i3;
            Iterable iterable = u1Var.bonusTypes;
            if (iterable == null) {
                iterable = instance_delegatelambda0.write;
                int i20 = MediaMetadataCompat + i11;
                MediaSessionCompatQueueItem = i20 % Fields.SpotShadowColor;
                int i21 = i20 % i3;
            }
            Iterable iterable2 = iterable;
            xa xaVar = (xa) this.serializer;
            ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(iterable2, 10));
            Iterator it = iterable2.iterator();
            while (it.hasNext()) {
                arrayList2.add(xaVar.serializer((String) it.next()));
            }
            r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer = removeNodeAtDepth.RemoteActionCompatParcelizer(arrayList2);
            String strIconCompatParcelizer2 = z != 0 ? settransactionsuccessful.IconCompatParcelizer(R.string.rush_bonus_calendar_highlight_text) : null;
            String str8 = u1Var.startTime;
            str8.getClass();
            String str9 = ZonedDateTime.parse(str8).withZoneSameInstant(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("HH:mm").withLocale(Locale.getDefault()));
            str9.getClass();
            if (i2 != 0) {
                str6.getClass();
                String str10 = ZonedDateTime.parse(str6).withZoneSameInstant(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("HH:mm").withLocale(Locale.getDefault()));
                str10.getClass();
                str4 = str10;
            } else {
                str4 = null;
            }
            arrayList.add(new v6ExternalSyntheticLambda7(str7, j, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer, z, strIconCompatParcelizer2, str9, str4));
            i12++;
            i3 = 2;
            th = null;
            i11 = 1;
        }
        return new tg(str3, strIconCompatParcelizer, false, removeNodeAtDepth.RemoteActionCompatParcelizer(arrayList));
    }

    public DropShadowEffect(getCanScrollVertically getcanscrollvertically, getScrollCaptureInProgress getscrollcaptureinprogress, PrivateKey privateKey, PublicKey publicKey, OAEPParameterSpec oAEPParameterSpec) {
        this.RemoteActionCompatParcelizer = 16;
        this.RatingCompat = getcanscrollvertically;
        this.read = getscrollcaptureinprogress;
        this.write = privateKey;
        this.serializer = publicKey;
        this.MediaDescriptionCompat = oAEPParameterSpec;
    }

    public /* synthetic */ DropShadowEffect(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.read = obj;
        this.RatingCompat = obj2;
        this.write = obj3;
        this.serializer = obj4;
        this.MediaDescriptionCompat = obj5;
    }

    public DropShadowEffect(GetAppStateImpl getAppStateImpl, RectManager rectManager, accesssetDispatchTokenp accesssetdispatchtokenp, setSensitiveData setsensitivedata, AppEventInfoChangeHandler appEventInfoChangeHandler) {
        this.RemoteActionCompatParcelizer = 25;
        getAppStateImpl.getClass();
        rectManager.getClass();
        accesssetdispatchtokenp.getClass();
        setsensitivedata.getClass();
        appEventInfoChangeHandler.getClass();
        this.read = getAppStateImpl;
        this.RatingCompat = rectManager;
        this.write = accesssetdispatchtokenp;
        this.serializer = setsensitivedata;
        this.MediaDescriptionCompat = appEventInfoChangeHandler;
    }

    public DropShadowEffect(g0 g0Var, ContextScope contextScope) {
        this.RemoteActionCompatParcelizer = 17;
        this.read = g0Var;
        this.RatingCompat = contextScope;
        this.write = getDoesClickOutsideModalViewDismissInAppMessageView.IconCompatParcelizer();
        this.MediaDescriptionCompat = new CopyOnWriteArrayList();
    }

    public DropShadowEffect(setShowingTextSubstitution setshowingtextsubstitution, setTextSubstitutiondefault settextsubstitutiondefault, AnalyticsServiceImpl analyticsServiceImpl, Vw$Vw vw$Vw, Parser.Pair pair) {
        this.RemoteActionCompatParcelizer = 21;
        setshowingtextsubstitution.getClass();
        settextsubstitutiondefault.getClass();
        analyticsServiceImpl.getClass();
        vw$Vw.getClass();
        pair.getClass();
        this.read = setshowingtextsubstitution;
        this.RatingCompat = settextsubstitutiondefault;
        this.write = analyticsServiceImpl;
        this.serializer = vw$Vw;
        this.MediaDescriptionCompat = pair;
    }

    public DropShadowEffect(MapboxNativeNavigatorImpl mapboxNativeNavigatorImpl, ThreadController threadController) {
        this.RemoteActionCompatParcelizer = 18;
        threadController.getClass();
        this.read = mapboxNativeNavigatorImpl;
        this.RatingCompat = threadController.getMainScopeAndRootJob();
        this.write = new CopyOnWriteArraySet();
        this.serializer = new EHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1(this);
        this.MediaDescriptionCompat = new EHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1(this);
        mapboxNativeNavigatorImpl.addNativeNavigatorRecreationObserver(new MapboxTripSession$$ExternalSyntheticLambda2(2, this));
    }

    public DropShadowEffect(xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphics, xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphics2, toXyz toxyz, toXyz toxyz2, xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphics3) {
        this.RemoteActionCompatParcelizer = 4;
        this.read = xyzatocolorjlnilsgui_graphics;
        this.serializer = xyzatocolorjlnilsgui_graphics2;
        this.RatingCompat = toxyz;
        this.write = toxyz2;
        this.MediaDescriptionCompat = xyzatocolorjlnilsgui_graphics3;
    }

    public DropShadowEffect(CountDownTimerUiModel countDownTimerUiModel, GetRemainingOtpVerificationTimerIfRunning getRemainingOtpVerificationTimerIfRunning, GetRemainingOtpVerificationTimerIfRunning getRemainingOtpVerificationTimerIfRunning2, transferSessionPackageI transfersessionpackagei, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        this.RemoteActionCompatParcelizer = 27;
        countDownTimerUiModel.getClass();
        getRemainingOtpVerificationTimerIfRunning.getClass();
        getRemainingOtpVerificationTimerIfRunning2.getClass();
        transfersessionpackagei.getClass();
        getcontentviewgroupparentlayout.getClass();
        this.read = countDownTimerUiModel;
        this.RatingCompat = getRemainingOtpVerificationTimerIfRunning;
        this.write = getRemainingOtpVerificationTimerIfRunning2;
        this.serializer = transfersessionpackagei;
        this.MediaDescriptionCompat = getcontentviewgroupparentlayout;
    }

    public DropShadowEffect(performCustomExitMxy_nc0 performcustomexitmxy_nc0, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        this.RemoteActionCompatParcelizer = 28;
        performcustomexitmxy_nc0.getClass();
        isopeninternalroom_runtime.getClass();
        this.read = performcustomexitmxy_nc0;
        this.RatingCompat = isopeninternalroom_runtime;
        this.write = new isAdapterPositionOnScreen(new wa(29));
        this.serializer = new isRoot("preference_otp_verification_timer");
        this.MediaDescriptionCompat = new isRoot("preference_otp_verification_request_id");
    }

    public DropShadowEffect(FormBody.Builder builder, CircularProgressDrawable2 circularProgressDrawable2, setBackgroundColor setbackgroundcolor) {
        this.RemoteActionCompatParcelizer = 24;
        builder.getClass();
        circularProgressDrawable2.getClass();
        setbackgroundcolor.getClass();
        this.read = builder;
        this.RatingCompat = circularProgressDrawable2;
        this.write = setbackgroundcolor;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(RoomDatabaseperformClear1.serializer);
        this.serializer = mutableStateFlow;
        this.MediaDescriptionCompat = mutableStateFlow;
    }

    public DropShadowEffect(m mVar, setTransactionSuccessful settransactionsuccessful, Clock clock, xa xaVar, setLastHorizontalStyle setlasthorizontalstyle) {
        this.RemoteActionCompatParcelizer = 26;
        mVar.getClass();
        settransactionsuccessful.getClass();
        clock.getClass();
        xaVar.getClass();
        setlasthorizontalstyle.getClass();
        this.read = mVar;
        this.RatingCompat = settransactionsuccessful;
        this.write = clock;
        this.serializer = xaVar;
        this.MediaDescriptionCompat = setlasthorizontalstyle;
    }

    public DropShadowEffect(SearchResultFactory searchResultFactory, AndroidMainThreadWorkerImpl$$ExternalSyntheticLambda0 androidMainThreadWorkerImpl$$ExternalSyntheticLambda0, Executor executor, AsyncOperationTaskImpl asyncOperationTaskImpl, SearchRequestContext searchRequestContext) {
        this.RemoteActionCompatParcelizer = 20;
        searchResultFactory.getClass();
        asyncOperationTaskImpl.getClass();
        this.read = searchResultFactory;
        this.RatingCompat = androidMainThreadWorkerImpl$$ExternalSyntheticLambda0;
        this.write = executor;
        this.serializer = asyncOperationTaskImpl;
        this.MediaDescriptionCompat = searchRequestContext;
    }

    public DropShadowEffect(decode decodeVar, isOpenInternalroom_runtime isopeninternalroom_runtime, disableCoppaComplianceInDelay disablecoppacomplianceindelay, setEventDeduplicationIdsMaxSize seteventdeduplicationidsmaxsize, enablePlayStoreKidsComplianceInDelay enableplaystorekidscomplianceindelay) {
        this.RemoteActionCompatParcelizer = 29;
        decodeVar.getClass();
        isopeninternalroom_runtime.getClass();
        disablecoppacomplianceindelay.getClass();
        seteventdeduplicationidsmaxsize.getClass();
        enableplaystorekidscomplianceindelay.getClass();
        this.read = decodeVar;
        this.RatingCompat = isopeninternalroom_runtime;
        this.write = disablecoppacomplianceindelay;
        this.serializer = seteventdeduplicationidsmaxsize;
        this.MediaDescriptionCompat = enableplaystorekidscomplianceindelay;
    }

    public DropShadowEffect(Drawable.Callback callback) {
        this.RemoteActionCompatParcelizer = 3;
        this.read = new toZui_graphics();
        this.RatingCompat = new HashMap();
        this.write = new HashMap();
        this.MediaDescriptionCompat = ".ttf";
        if (!(callback instanceof View)) {
            getD50Xyzui_graphics.IconCompatParcelizer("LottieDrawable must be inside of a view for images to work.");
            this.serializer = null;
        } else {
            this.serializer = ((View) callback).getContext().getAssets();
            int i = MediaSessionCompatQueueItem + 47;
            MediaMetadataCompat = i % Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 4 % 4;
            } else {
                int i3 = 2 % 2;
            }
        }
        int i4 = MediaMetadataCompat + 59;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public DropShadowEffect(ImageCapture1 imageCapture1, ImageCapture1 imageCapture2, getCardElevation getcardelevation) {
        this.RemoteActionCompatParcelizer = 2;
        this.RatingCompat = imageCapture1;
        this.write = imageCapture2;
        this.read = getcardelevation;
    }

    public /* synthetic */ DropShadowEffect(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    public DropShadowEffect(Context context) {
        this.RemoteActionCompatParcelizer = 19;
        this.read = context;
    }

    public DropShadowEffect(getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation, int i) {
        this.RemoteActionCompatParcelizer = i;
        int i2 = 6;
        if (i != 6) {
            this.read = getstyleable_vector_drawable_group_rotation;
            setStateDescription setstatedescription = new setStateDescription(getstyleable_vector_drawable_group_rotation.setItemInvoker, i2);
            this.RatingCompat = setstatedescription;
            mergeJsonObjects mergejsonobjects = getstyleable_vector_drawable_group_rotation.ScrollExtensionsKtanimateScrollBy2;
            setStateDescription setstatedescription2 = new setStateDescription(mergejsonobjects, 8);
            this.write = setstatedescription2;
            int i3 = 2;
            r8lambdapkx6kfYbgP4lEOWkebovjPb0ug r8lambdapkx6kfybgp4leowkebovjpb0ug = new r8lambdapkx6kfYbgP4lEOWkebovjPb0ug(new PreferenceGroupAdapter(getstyleable_vector_drawable_group_rotation.toClipEntry, new AndroidIndirectPointerEvent_androidKt(mergejsonobjects, 1), i3), i3);
            mergeJsonObjects mergejsonobjects2 = getstyleable_vector_drawable_group_rotation.onCreatePanelMenu;
            setPresentationView setpresentationview = getstyleable_vector_drawable_group_rotation.createnHHXs2Y;
            acquire acquireVar = new acquire(mergejsonobjects2, setpresentationview, i3);
            SemanticsPropertiesFillableData1 semanticsPropertiesFillableData1 = getstyleable_vector_drawable_group_rotation.accesssemanticsScrollByd4ec7I;
            mergeJsonObjects mergejsonobjects3 = getstyleable_vector_drawable_group_rotation.doFlingAnimationQWom1Mo;
            this.serializer = getDoubleOrNull.write(new TopBottomBoundsComparator(new H$b(new r8lambdamcfkChlmwyb5a6y_ZoPzJd5UQ4(1, acquireVar, setstatedescription, setstatedescription2, r8lambdapkx6kfybgp4leowkebovjpb0ug, new acquire(semanticsPropertiesFillableData1, mergejsonobjects3, 3)), 9, new getDataStoreFileName(setstatedescription, setstatedescription2, r8lambdapkx6kfybgp4leowkebovjpb0ug, new applyLayoutFeatures(semanticsPropertiesFillableData1, mergejsonobjects3, mergejsonobjects2, i3), new acquire(mergejsonobjects2, setpresentationview, 1), getstyleable_vector_drawable_group_rotation.PredictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1))));
            this.MediaDescriptionCompat = new isHiddenannotations(getstyleable_vector_drawable_group_rotation.toClipEntry, new r8lambdapkx6kfYbgP4lEOWkebovjPb0ug((setStateDescription) this.write, 1), getstyleable_vector_drawable_group_rotation.onCreatePanelMenu, (setStateDescription) this.RatingCompat, 1);
            return;
        }
        this.read = getstyleable_vector_drawable_group_rotation;
        r8lambdapkx6kfYbgP4lEOWkebovjPb0ug r8lambdapkx6kfybgp4leowkebovjpb0ug2 = getstyleable_vector_drawable_group_rotation.toString;
        lambdaprocessAndResolveDeeplink15 lambdaprocessandresolvedeeplink15 = getstyleable_vector_drawable_group_rotation.UseCaseGroup;
        PreferenceGroupAdapter preferenceGroupAdapter = getstyleable_vector_drawable_group_rotation.getMinSizeToFitDisappearingItemsYbymL2g;
        this.RatingCompat = new applyLayoutFeatures(r8lambdapkx6kfybgp4leowkebovjpb0ug2, lambdaprocessandresolvedeeplink15, preferenceGroupAdapter, 15);
        this.write = new getFailureMessage(r8lambdapkx6kfybgp4leowkebovjpb0ug2, lambdaprocessandresolvedeeplink15, preferenceGroupAdapter, getstyleable_vector_drawable_group_rotation.getHasInitialValueAnimations, 7);
        int i4 = 2;
        this.serializer = new r8lambda4ctur6dHthQRF8ridJfgtUMxjY0(i4, getstyleable_vector_drawable_group_rotation.createnHHXs2Y, getstyleable_vector_drawable_group_rotation.setItemInvoker, r8lambdapkx6kfybgp4leowkebovjpb0ug2, lambdaprocessandresolvedeeplink15, preferenceGroupAdapter);
        this.MediaDescriptionCompat = getDoubleOrNull.write(new isValidSource(new E$b((applyLayoutFeatures) this.RatingCompat, (getFailureMessage) this.write, getstyleable_vector_drawable_group_rotation.ArrangementHorizontal, getstyleable_vector_drawable_group_rotation.getHasInitialValueAnimations, (r8lambda4ctur6dHthQRF8ridJfgtUMxjY0) this.serializer, getDoubleOrNull.write(new isAdjustUninstallDetectionPayload()), getstyleable_vector_drawable_group_rotation.ScrollExtensionsKtstopScroll2, 11)));
    }
}
