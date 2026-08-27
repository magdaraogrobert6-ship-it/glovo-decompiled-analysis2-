package com.roadrunner.home.nest;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.camera.core.ImageCaptureException;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.DialogFragment;
import coil3.ComponentRegistry$Builder;
import coil3.util.UtilsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.huawei.wisesecurity.ucs_credential.n0;
import com.incognia.internal.ZM$$ExternalSyntheticLambda2;
import com.logistics.rider.glovo.R;
import com.roadrunner.auth.data.AuthRepository$logoutUser$2;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.TakePictureTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.InAppCameraWithTagsFragment;
import com.roadrunner.delivery.stacked.delivery.details.ui.StackedDeliveryDetailsFragment;
import com.roadrunner.diagnostics.presentation.fragment.SettingsNotificationsDiagnosticsFragment;
import com.roadrunner.face.verification.api.selfie.CameraImage;
import com.roadrunner.face.verification.presentation.selfie.SelfieFlowViewModel;
import com.roadrunner.freelancing.presentation.goandstartinfo.GoAndStartInformationUiModelImpl;
import com.roadrunner.inappnotifications.analytics.InAppNotificationsLogger$logInAppMessageButtonClicked$1;
import com.roadrunner.liveness.presentation.LivenessDetectionActivity;
import com.roadrunner.login.presentation.LoginActivity;
import com.roadrunner.login.presentation.LoginActivityViewModel;
import com.roadrunner.login.presentation.countryselection.CountrySelectionViewModel;
import com.roadrunner.login.presentation.router.RouterActivity;
import com.roadrunner.login.presentation.signin.SignInViewModel;
import com.roadrunner.opportunities.calendar.BonusCalendarViewModel;
import com.roadrunner.order.history.presentation.HistoryDialogFragment;
import com.roadrunner.push.PushEventPublisherImpl$emit$1;
import com.roadrunner.realtime.data.ReconnectScheduler$schedule$1;
import com.sentiance.core.model.events.N$b;
import com.ui.common.base.BaseInjectionDialogFragment;
import io.grpc.internal.SharedResourcePool;
import io.sentry.hints.MediaSessionCompatQueueItem;
import java.util.concurrent.CancellationException;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AndroidGraphicsContext2;
import o.BrazeLogger;
import o.DividerItemDecoration;
import o.DragAndDropTargetModifierNode;
import o.FragmentKt;
import o.FragmentNavigatorExternalSyntheticLambda0;
import o.NavHostFragment;
import o.NavHostFragmentExternalSyntheticLambda1;
import o.NavHostKtNavHost331;
import o.ShortNewsContentCardView;
import o.TextUnitTypeCompanion;
import o.accessgetLOREM_IPSUM_SOURCEp;
import o.accessisRenderNodeCompatiblecp;
import o.accessmarkTintForVNode;
import o.accesszoneBoundary;
import o.b1;
import o.cb;
import o.cc;
import o.createFromParcel;
import o.createInternalPathIterator;
import o.createViewHolder;
import o.d4ExternalSyntheticLambda2;
import o.displayInAppMessagelambda1;
import o.divkPz2Gy4;
import o.dlambda0;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getPowersOfTen;
import o.getRawTypeannotations;
import o.getRawTypeimpl;
import o.getRouternavigation_release;
import o.getSpUIouoOA;
import o.internalConicToQuadratics;
import o.internalPathIteratorHasNext;
import o.internalPathIteratorSize;
import o.isAppSetIdReadingEnabled;
import o.makeBigContentView;
import o.makeContentView;
import o.markCardAsClicked;
import o.metaMarkUpdatedAndHasCallbacks;
import o.obtainTint8_81llA;
import o.offsetChildrenVertical;
import o.offsetPositionsForAdd;
import o.onFailedToRecycleView;
import o.onShowTranslationui;
import o.onViewAttachedToWindowlambda0;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.onViewRecycled;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.releaseGlows;
import o.releaseHorizontalGlow;
import o.removeNodeAtDepth;
import o.setCountrylambda1;
import o.setEdgeEffectFactory;
import o.setIds;
import o.setNativeShader;
import o.setScrollingTouchSlop;
import o.setWebView;
import o.toBitmapConfig1JJdX4A;
import org.joda.time.LocalDate;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class NestFragment extends BaseInjectionDialogFragment implements obtainTint8_81llA {
    private static int onCreate = 0;
    private static int onCreatePanelMenu = 1;
    private static int onMenuItemSelected = 1;
    private static int onMultiWindowModeChanged;
    public boolean getNavigationEventDispatcher;
    public boolean getOnBackPressedDispatcher;
    public setCountrylambda1 getSavedStateRegistry;
    public final accessmarkTintForVNode initializeViewTreeOwners = accessmarkTintForVNode.read;
    public dlambda0 invalidateMenu;
    public final ComponentRegistry$Builder onActivityResult;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY onBackPressed;
    public boolean onConfigurationChanged;

    static {
        new n0();
        int i = onMultiWindowModeChanged + 41;
        onMenuItemSelected = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.obtainTint8_81llA
    public final getPowersOfTen read() {
        int i = 2 % 2;
        int i2 = onCreate + 15;
        onCreatePanelMenu = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.initializeViewTreeOwners;
        }
        throw null;
    }

    public NestFragment() {
        NestFragment$$ExternalSyntheticLambda2 nestFragment$$ExternalSyntheticLambda2 = new NestFragment$$ExternalSyntheticLambda2(this, 0);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new internalConicToQuadratics(11, new internalConicToQuadratics(0, this)));
        this.onActivityResult = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(getRouternavigation_release.class), new internalPathIteratorHasNext(onviewdetachedfromwindowlambda1Serializer, 0), nestFragment$$ExternalSyntheticLambda2, new internalPathIteratorHasNext(onviewdetachedfromwindowlambda1Serializer, 27));
        this.getNavigationEventDispatcher = true;
        this.getOnBackPressedDispatcher = true;
    }

    /* JADX INFO: renamed from: com.roadrunner.home.nest.NestFragment$onViewCreated$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        private static int read = 1;
        private static int serializer;
        public final /* synthetic */ int IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LoginActivityViewModel loginActivityViewModel, int i) {
            super(1, 0, LoginActivityViewModel.class, loginActivityViewModel, "updateLoading", "updateLoading(Z)V");
            this.IconCompatParcelizer = i;
            switch (i) {
                case 20:
                    super(1, 0, LoginActivityViewModel.class, loginActivityViewModel, "onSignInClicked", "onSignInClicked(Lcom/roadrunner/login/presentation/signin/SignInParams;)V");
                    break;
                case 21:
                    super(1, 0, LoginActivityViewModel.class, loginActivityViewModel, "onOtpSignInClicked", "onOtpSignInClicked(Lcom/roadrunner/login/presentation/signin/SignInParams;)V");
                    break;
                case 22:
                    super(1, 0, LoginActivityViewModel.class, loginActivityViewModel, "showError", "showError(Ljava/lang/Throwable;)V");
                    break;
                default:
                    break;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StackedDeliveryDetailsFragment stackedDeliveryDetailsFragment) {
            super(1, 0, StackedDeliveryDetailsFragment.class, stackedDeliveryDetailsFragment, "handlePendingAction", "handlePendingAction(Lcom/roadrunner/delivery/stacked/delivery/details/ui/StackedDeliveryDetailsAction;)V");
            this.IconCompatParcelizer = 5;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NestFragment nestFragment) {
            super(1, 0, NestFragment.class, nestFragment, "handlePendingAction", "handlePendingAction(Lcom/roadrunner/home/nest/NestAction;)V");
            this.IconCompatParcelizer = 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LivenessDetectionActivity livenessDetectionActivity, int i) {
            super(1, 0, LivenessDetectionActivity.class, livenessDetectionActivity, "showSnackBarError", "showSnackBarError(Lcom/roadrunner/rrds/compose/component/message/SnackbarType;)V");
            this.IconCompatParcelizer = i;
            if (i == 13) {
                super(1, 0, LivenessDetectionActivity.class, livenessDetectionActivity, "showLoadingProgress", "showLoadingProgress(Z)V");
            } else if (i != 14) {
            } else {
                super(1, 0, LivenessDetectionActivity.class, livenessDetectionActivity, "openPrivacyPolicy", "openPrivacyPolicy(Ljava/lang/String;)V");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LoginActivity loginActivity, int i) {
            super(1, 0, LoginActivity.class, loginActivity, "onFinishedCustomPasswordFlow", "onFinishedCustomPasswordFlow(Ljava/lang/String;)V");
            this.IconCompatParcelizer = i;
            switch (i) {
                case 17:
                    super(1, 0, LoginActivity.class, loginActivity, "navigateToBecomeRider", "navigateToBecomeRider(Ljava/lang/String;)V");
                    break;
                case 18:
                    super(1, 0, LoginActivity.class, loginActivity, "navigateToBecomeRider", "navigateToBecomeRider(Ljava/lang/String;)V");
                    break;
                case 19:
                    super(1, 0, LoginActivity.class, loginActivity, "openSupportUrl", "openSupportUrl(Ljava/lang/String;)V");
                    break;
                default:
                    break;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
            super(i, i2, cls, obj, str, str2);
            this.IconCompatParcelizer = i3;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RouterActivity routerActivity, int i) {
            super(1, 0, RouterActivity.class, routerActivity, "handleAuthAction", "handleAuthAction(Lcom/roadrunner/login/presentation/router/model/AuthenticationAction;)V");
            this.IconCompatParcelizer = i;
            if (i != 26) {
            } else {
                super(1, 0, RouterActivity.class, routerActivity, "handleRouterAction", "handleRouterAction(Lcom/roadrunner/login/presentation/router/model/RouterAction;)V");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HistoryDialogFragment historyDialogFragment) {
            super(1, 0, HistoryDialogFragment.class, historyDialogFragment, "handleActions", "handleActions(Lcom/roadrunner/order/history/presentation/HistoryDialogAction;)V");
            this.IconCompatParcelizer = 29;
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final Object invoke(Object obj) {
            Object obj2;
            makeBigContentView makecontentview;
            Object navHostKtNavHost331;
            Long lValueOf;
            int i = 2 % 2;
            int i2 = this.IconCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            int i3 = 0;
            ShortNewsContentCardView shortNewsContentCardView = null;
            switch (i2) {
                case 0:
                    createInternalPathIterator createinternalpathiterator = (createInternalPathIterator) obj;
                    createinternalpathiterator.getClass();
                    NestFragment nestFragment = (NestFragment) this.MediaMetadataCompat;
                    nestFragment.getClass();
                    if (createinternalpathiterator.equals(createInternalPathIterator.read)) {
                        nestFragment.read(false, false);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                case 1:
                    accessgetLOREM_IPSUM_SOURCEp accessgetlorem_ipsum_sourcep = (accessgetLOREM_IPSUM_SOURCEp) obj;
                    accessgetlorem_ipsum_sourcep.getClass();
                    TakePictureTaskUiModelImpl takePictureTaskUiModelImpl = (TakePictureTaskUiModelImpl) this.MediaMetadataCompat;
                    takePictureTaskUiModelImpl.getClass();
                    BuildersKt.RemoteActionCompatParcelizer(takePictureTaskUiModelImpl.write, null, null, new ReconnectScheduler$schedule$1(takePictureTaskUiModelImpl, accessgetlorem_ipsum_sourcep, shortNewsContentCardView, 8), 3);
                    return createfromparcel;
                case 2:
                    Throwable th = (Throwable) obj;
                    th.getClass();
                    InAppCameraWithTagsFragment inAppCameraWithTagsFragment = (InAppCameraWithTagsFragment) this.MediaMetadataCompat;
                    inAppCameraWithTagsFragment.getClass();
                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th, "InAppCameraWithTagsFragment: Unable to capture the picture.", new Object[0]);
                    inAppCameraWithTagsFragment.serializer().IconCompatParcelizer();
                    return createfromparcel;
                case 3:
                    divkPz2Gy4 divkpz2gy4 = (divkPz2Gy4) obj;
                    divkpz2gy4.getClass();
                    InAppCameraWithTagsFragment inAppCameraWithTagsFragment2 = (InAppCameraWithTagsFragment) this.MediaMetadataCompat;
                    inAppCameraWithTagsFragment2.getClass();
                    if (!divkpz2gy4.equals(getRawTypeannotations.serializer)) {
                        if (!(divkpz2gy4 instanceof getRawTypeimpl)) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                        }
                        onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr = {new onViewAttachedToWindowlambda0("InAppCameraWithTagsFragment_screen_data", ((getRawTypeimpl) divkpz2gy4).read)};
                        inAppCameraWithTagsFragment2.getParentFragmentManager().write((Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{onviewattachedtowindowlambda0Arr}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320), "InAppCameraWithTagsFragment");
                        inAppCameraWithTagsFragment2.read(false, false);
                        return createfromparcel;
                    }
                    int i4 = serializer + 77;
                    read = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        inAppCameraWithTagsFragment2.isAdded();
                        throw null;
                    }
                    if (!inAppCameraWithTagsFragment2.isAdded() || !inAppCameraWithTagsFragment2.isResumed() || inAppCameraWithTagsFragment2.isDetached() || inAppCameraWithTagsFragment2.getChildFragmentManager().findFragmentByTag("error_dialog_tag") != null) {
                        return createfromparcel;
                    }
                    MediaSessionCompatQueueItem.IconCompatParcelizer(inAppCameraWithTagsFragment2.getString(R.string.take_better_picture_failure_dialog_message_title), inAppCameraWithTagsFragment2.getString(R.string.take_better_picture_failure_dialog_message_description), inAppCameraWithTagsFragment2.getString(R.string.take_better_picture_failure_dialog_retry_button_text), null, null, false, false, true, 376).write(inAppCameraWithTagsFragment2.getChildFragmentManager(), "error_dialog_tag");
                    return createfromparcel;
                case 4:
                    Throwable th2 = (Throwable) obj;
                    th2.getClass();
                    InAppCameraWithTagsFragment inAppCameraWithTagsFragment3 = (InAppCameraWithTagsFragment) this.MediaMetadataCompat;
                    inAppCameraWithTagsFragment3.getClass();
                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th2, "InAppCameraWithTagsFragment: Unable to capture the picture.", new Object[0]);
                    inAppCameraWithTagsFragment3.serializer().IconCompatParcelizer();
                    return createfromparcel;
                case 5:
                    getSpUIouoOA getspuiouooa = (getSpUIouoOA) obj;
                    getspuiouooa.getClass();
                    StackedDeliveryDetailsFragment stackedDeliveryDetailsFragment = (StackedDeliveryDetailsFragment) this.MediaMetadataCompat;
                    stackedDeliveryDetailsFragment.getClass();
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getspuiouooa, getSpUIouoOA.read}, getCieXyz.write())).booleanValue()) {
                        stackedDeliveryDetailsFragment.write();
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                case 6:
                    setIds setids = (setIds) obj;
                    setids.getClass();
                    SettingsNotificationsDiagnosticsFragment settingsNotificationsDiagnosticsFragment = (SettingsNotificationsDiagnosticsFragment) this.MediaMetadataCompat;
                    settingsNotificationsDiagnosticsFragment.getClass();
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setids, setIds.write}, getCieXyz.write())).booleanValue()) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    Intent intent = new Intent();
                    intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.fromParts("package", settingsNotificationsDiagnosticsFragment.requireContext().getPackageName(), null));
                    settingsNotificationsDiagnosticsFragment.startActivity(intent);
                    return createfromparcel;
                case 7:
                    ImageCaptureException imageCaptureException = (ImageCaptureException) obj;
                    imageCaptureException.getClass();
                    SelfieFlowViewModel selfieFlowViewModel = (SelfieFlowViewModel) this.MediaMetadataCompat;
                    selfieFlowViewModel.getClass();
                    r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(selfieFlowViewModel, new AuthRepository$logoutUser$2(selfieFlowViewModel, imageCaptureException, shortNewsContentCardView, 15));
                    return createfromparcel;
                case 8:
                    CameraImage cameraImage = (CameraImage) obj;
                    cameraImage.getClass();
                    SelfieFlowViewModel selfieFlowViewModel2 = (SelfieFlowViewModel) this.MediaMetadataCompat;
                    selfieFlowViewModel2.getClass();
                    selfieFlowViewModel2.MediaBrowserCompatMediaItem.IconCompatParcelizer.logEvent("selfie_made", null);
                    selfieFlowViewModel2.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("camera_image", cameraImage);
                    r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(selfieFlowViewModel2, new AuthRepository$logoutUser$2(selfieFlowViewModel2, cameraImage, shortNewsContentCardView, 16));
                    return createfromparcel;
                case 9:
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    MutableStateFlow mutableStateFlow = ((GoAndStartInformationUiModelImpl) this.MediaMetadataCompat).IconCompatParcelizer;
                    do {
                        obj2 = mutableStateFlow.read();
                        makecontentview = (makeBigContentView) obj2;
                        if (makecontentview instanceof makeContentView) {
                            makeContentView makecontentview2 = (makeContentView) makecontentview;
                            makecontentview = new makeContentView(makecontentview2.serializer, makecontentview2.RemoteActionCompatParcelizer, zBooleanValue);
                        }
                    } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj2, makecontentview));
                    int i5 = serializer + 29;
                    read = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        return createfromparcel;
                    }
                    shortNewsContentCardView.hashCode();
                    throw null;
                case 10:
                    NavHostFragmentExternalSyntheticLambda1 navHostFragmentExternalSyntheticLambda1 = (NavHostFragmentExternalSyntheticLambda1) obj;
                    navHostFragmentExternalSyntheticLambda1.getClass();
                    DividerItemDecoration dividerItemDecoration = (DividerItemDecoration) this.MediaMetadataCompat;
                    internalPathIteratorSize internalpathiteratorsize = dividerItemDecoration.IconCompatParcelizer;
                    if (navHostFragmentExternalSyntheticLambda1.equals(NavHostFragment.read)) {
                        internalpathiteratorsize.RemoteActionCompatParcelizer.logEvent("bubble_section_closed", null);
                        navHostKtNavHost331 = FragmentKt.serializer;
                    } else {
                        if (!(navHostFragmentExternalSyntheticLambda1 instanceof FragmentNavigatorExternalSyntheticLambda0)) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                        }
                        internalpathiteratorsize.RemoteActionCompatParcelizer.logEvent("rider_profile_edit_click", null);
                        navHostKtNavHost331 = new NavHostKtNavHost331(((FragmentNavigatorExternalSyntheticLambda0) navHostFragmentExternalSyntheticLambda1).write);
                    }
                    dividerItemDecoration.MediaMetadataCompat.serializer(navHostKtNavHost331);
                    return createfromparcel;
                case 11:
                    createViewHolder createviewholder = (createViewHolder) obj;
                    createviewholder.getClass();
                    offsetChildrenVertical offsetchildrenvertical = (offsetChildrenVertical) this.MediaMetadataCompat;
                    N$b n$b = offsetchildrenvertical.MediaDescriptionCompat;
                    SharedResourcePool sharedResourcePool = offsetchildrenvertical.MediaMetadataCompat;
                    releaseHorizontalGlow releasehorizontalglow = createviewholder.RemoteActionCompatParcelizer;
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{releasehorizontalglow, releaseGlows.INSTANCE}, getCieXyz.write())).booleanValue()) {
                        sharedResourcePool.serializer(onFailedToRecycleView.write);
                        Long l = offsetchildrenvertical.MediaSessionCompatQueueItem;
                        if (l != null) {
                            int i6 = serializer + 39;
                            read = i6 % Fields.SpotShadowColor;
                            int i7 = i6 % 2;
                            lValueOf = Long.valueOf(offsetchildrenvertical.RemoteActionCompatParcelizer.millis() - l.longValue());
                        } else {
                            lValueOf = null;
                        }
                        BuildersKt.RemoteActionCompatParcelizer((getContentViewGroupParentLayout) n$b.serializer, null, null, new PushEventPublisherImpl$emit$1(n$b, lValueOf, shortNewsContentCardView, 7), 3);
                    } else if (releasehorizontalglow instanceof setEdgeEffectFactory) {
                        sharedResourcePool.serializer(new onViewRecycled(((setEdgeEffectFactory) releasehorizontalglow).url));
                    } else {
                        if (!(releasehorizontalglow instanceof setScrollingTouchSlop)) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                        }
                        int i8 = serializer + 63;
                        read = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        if (!(offsetchildrenvertical.MediaBrowserCompatMediaItem.read() instanceof offsetPositionsForAdd)) {
                            offsetchildrenvertical.write.IconCompatParcelizer(offsetPositionsForAdd.write);
                            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(offsetchildrenvertical), null, null, new PushEventPublisherImpl$emit$1(offsetchildrenvertical, shortNewsContentCardView, 9), 3);
                        }
                    }
                    String str = createviewholder.read;
                    n$b.getClass();
                    str.getClass();
                    BuildersKt.RemoteActionCompatParcelizer((getContentViewGroupParentLayout) n$b.serializer, null, null, new InAppNotificationsLogger$logInAppMessageButtonClicked$1(n$b, str, shortNewsContentCardView, i3), 3);
                    return createfromparcel;
                case 12:
                    setWebView setwebview = (setWebView) obj;
                    setwebview.getClass();
                    LivenessDetectionActivity.serializer((LivenessDetectionActivity) this.MediaMetadataCompat, setwebview);
                    return createfromparcel;
                case 13:
                    LivenessDetectionActivity.IconCompatParcelizer((LivenessDetectionActivity) this.MediaMetadataCompat, ((Boolean) obj).booleanValue());
                    return createfromparcel;
                case 14:
                    String str2 = (String) obj;
                    str2.getClass();
                    LivenessDetectionActivity.RemoteActionCompatParcelizer((LivenessDetectionActivity) this.MediaMetadataCompat, str2);
                    return createfromparcel;
                case 15:
                    String str3 = (String) obj;
                    str3.getClass();
                    LoginActivity.RemoteActionCompatParcelizer((LoginActivity) this.MediaMetadataCompat, str3);
                    return createfromparcel;
                case 16:
                    ((LoginActivityViewModel) this.MediaMetadataCompat).IconCompatParcelizer(((Boolean) obj).booleanValue());
                    return createfromparcel;
                case 17:
                    String str4 = (String) obj;
                    str4.getClass();
                    LoginActivity.IconCompatParcelizer((LoginActivity) this.MediaMetadataCompat, str4);
                    return createfromparcel;
                case 18:
                    String str5 = (String) obj;
                    str5.getClass();
                    LoginActivity.IconCompatParcelizer((LoginActivity) this.MediaMetadataCompat, str5);
                    return createfromparcel;
                case 19:
                    String str6 = (String) obj;
                    str6.getClass();
                    LoginActivity.RemoteActionCompatParcelizer(1262591535, TextUnitTypeCompanion.PlaybackStateCompat(), TextUnitTypeCompanion.PlaybackStateCompat(), TextUnitTypeCompanion.PlaybackStateCompat(), TextUnitTypeCompanion.PlaybackStateCompat(), -1262591529, new Object[]{(LoginActivity) this.MediaMetadataCompat, str6});
                    return createfromparcel;
                case 20:
                    markCardAsClicked markcardasclicked = (markCardAsClicked) obj;
                    markcardasclicked.getClass();
                    ((LoginActivityViewModel) this.MediaMetadataCompat).IconCompatParcelizer(markcardasclicked);
                    return createfromparcel;
                case 21:
                    markCardAsClicked markcardasclicked2 = (markCardAsClicked) obj;
                    markcardasclicked2.getClass();
                    ((LoginActivityViewModel) this.MediaMetadataCompat).write(markcardasclicked2);
                    return createfromparcel;
                case 22:
                    Throwable th3 = (Throwable) obj;
                    th3.getClass();
                    ((LoginActivityViewModel) this.MediaMetadataCompat).showError(th3);
                    return createfromparcel;
                case 23:
                    metaMarkUpdatedAndHasCallbacks metamarkupdatedandhascallbacks = (metaMarkUpdatedAndHasCallbacks) obj;
                    metamarkupdatedandhascallbacks.getClass();
                    ((CountrySelectionViewModel) this.MediaMetadataCompat).IconCompatParcelizer(metamarkupdatedandhascallbacks);
                    return createfromparcel;
                case 24:
                    String str7 = (String) obj;
                    str7.getClass();
                    CountrySelectionViewModel countrySelectionViewModel = (CountrySelectionViewModel) this.MediaMetadataCompat;
                    countrySelectionViewModel.getClass();
                    ((onShowTranslationui) countrySelectionViewModel.RemoteActionCompatParcelizer).setValue(str7);
                    r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = countrySelectionViewModel.MediaBrowserCompatMediaItem;
                    if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                        r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                    }
                    countrySelectionViewModel.MediaBrowserCompatMediaItem = BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(countrySelectionViewModel), null, null, new PushEventPublisherImpl$emit$1(countrySelectionViewModel, str7, shortNewsContentCardView, 14), 3);
                    return createfromparcel;
                case 25:
                    cb cbVar = (cb) obj;
                    cbVar.getClass();
                    RouterActivity.write((RouterActivity) this.MediaMetadataCompat, cbVar);
                    return createfromparcel;
                case 26:
                    cc ccVar = (cc) obj;
                    ccVar.getClass();
                    RouterActivity.write(BottomSheetBehavior.IconCompatParcelizer(), new Object[]{(RouterActivity) this.MediaMetadataCompat, ccVar}, BottomSheetBehavior.IconCompatParcelizer(), BottomSheetBehavior.IconCompatParcelizer(), -905510286, 905510286, BottomSheetBehavior.IconCompatParcelizer());
                    return createfromparcel;
                case 27:
                    boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                    BrazeLogger brazeLogger = ((SignInViewModel) this.MediaMetadataCompat).PlaybackStateCompatCustomAction;
                    brazeLogger.getClass();
                    AndroidGraphicsContext2 androidGraphicsContext2 = brazeLogger.IconCompatParcelizer;
                    d4ExternalSyntheticLambda2 d4externalsyntheticlambda2 = (d4ExternalSyntheticLambda2) brazeLogger.write();
                    b1 b1Var = d4externalsyntheticlambda2.RemoteActionCompatParcelizer;
                    androidGraphicsContext2.RemoteActionCompatParcelizer(d4ExternalSyntheticLambda2.RemoteActionCompatParcelizer(d4externalsyntheticlambda2, null, null, false, new b1(b1Var.RemoteActionCompatParcelizer, b1Var.RatingCompat, b1Var.write, zBooleanValue2, b1Var.IconCompatParcelizer, b1Var.read), 495));
                    return createfromparcel;
                case 28:
                    LocalDate localDate = (LocalDate) obj;
                    localDate.getClass();
                    BonusCalendarViewModel bonusCalendarViewModel = (BonusCalendarViewModel) this.MediaMetadataCompat;
                    bonusCalendarViewModel.getClass();
                    bonusCalendarViewModel.MediaSessionCompatQueueItem.write.logEvent("bonus_calendar_other_date_clicked", null);
                    boolean zEquals = localDate.equals(LocalDate.now());
                    MutableStateFlow mutableStateFlow2 = bonusCalendarViewModel.MediaBrowserCompatMediaItem;
                    if (zEquals) {
                        mutableStateFlow2.IconCompatParcelizer(null);
                    } else {
                        mutableStateFlow2.IconCompatParcelizer(localDate.toDateTimeAtStartOfDay().toString("yyyy-MM-dd"));
                    }
                    return createfromparcel;
                default:
                    accesszoneBoundary accesszoneboundary = (accesszoneBoundary) obj;
                    accesszoneboundary.getClass();
                    HistoryDialogFragment historyDialogFragment = (HistoryDialogFragment) this.MediaMetadataCompat;
                    historyDialogFragment.getClass();
                    if (accesszoneboundary.equals(accesszoneBoundary.write)) {
                        historyDialogFragment.read(false, false);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 2 % 2;
        view.getClass();
        super.onViewCreated(view, bundle);
        SharedResourcePool sharedResourcePoolRemoteActionCompatParcelizer = ((getRouternavigation_release) this.onActivityResult.MediaSessionCompatResultReceiverWrapper()).RemoteActionCompatParcelizer();
        accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        sharedResourcePoolRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(viewLifecycleOwner, new AnonymousClass1(this));
        int i2 = onCreate + 39;
        onCreatePanelMenu = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        composeView.setViewCompositionStrategy(new ViewCompositionStrategy.DisposeOnLifecycleDestroyed(viewLifecycleOwner));
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new NestFragment$$ExternalSyntheticLambda1(0, this), true, 1194511996)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = onCreatePanelMenu + 5;
        onCreate = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return composeView;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        int i = 2 % 2;
        int i2 = onCreate + 55;
        onCreatePanelMenu = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        this.getNavigationEventDispatcher = bundle == null;
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i4 = onCreatePanelMenu + 19;
            onCreate = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            z = arguments.getBoolean("use_slide_animation_arg", false);
        } else {
            z = false;
        }
        this.onConfigurationChanged = z;
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("onCreate() => isFirstCreation = " + this.getNavigationEventDispatcher + ", useSlideAnimation = " + z, new Object[0]);
        read(0, R.style.Theme_RoadRunner_Dialog_FullScreen_Expand);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        int i = 2 % 2;
        super.onStart();
        Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
        forest.IconCompatParcelizer("onStart()", new Object[0]);
        Dialog dialog = ((DialogFragment) this).read;
        Window window = dialog != null ? dialog.getWindow() : null;
        if (window != null) {
            int i2 = onCreatePanelMenu;
            int i3 = i2 + 9;
            onCreate = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                throw null;
            }
            boolean z = this.onConfigurationChanged;
            boolean z2 = this.getNavigationEventDispatcher;
            if (!z) {
                if (!z2 || !this.getOnBackPressedDispatcher) {
                    forest.IconCompatParcelizer("setting expand exit anim only", new Object[0]);
                    window.setWindowAnimations(R.style.Animation_RoadRunner_Dialog_Expand_NoEnterAnimation);
                    return;
                }
                int i4 = i2 + 67;
                onCreate = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    forest.IconCompatParcelizer("setting expand entry and exit anim", new Object[1]);
                } else {
                    forest.IconCompatParcelizer("setting expand entry and exit anim", new Object[0]);
                }
                this.getOnBackPressedDispatcher = false;
                window.setWindowAnimations(R.style.Animation_RoadRunner_Dialog_Expand);
                return;
            }
            if (z2 && this.getOnBackPressedDispatcher) {
                forest.IconCompatParcelizer("setting slide entry animation, then switching to expand exit", new Object[0]);
                this.getOnBackPressedDispatcher = false;
                window.setWindowAnimations(R.style.Animation_RoadRunner_Dialog_Slide);
                window.getDecorView().post(new ZM$$ExternalSyntheticLambda2(16, window));
                return;
            }
            forest.IconCompatParcelizer("setting expand exit anim only", new Object[0]);
            window.setWindowAnimations(R.style.Animation_RoadRunner_Dialog_Expand_NoEnterAnimation);
            int i5 = onCreate + 15;
            onCreatePanelMenu = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 81 / 0;
            }
        }
    }
}
