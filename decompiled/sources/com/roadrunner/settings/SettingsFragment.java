package com.roadrunner.settings;

import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.FragmentActivity;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ComponentRegistry$Builder;
import coil3.util.UtilsKt;
import com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.oss.licenses.OssLicensesMenuActivity;
import com.huawei.hms.support.api.location.common.LocationConstant;
import com.logistics.rider.glovo.R;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import com.roadrunner.nafath.NafathModalUiModelImpl$1;
import com.roadrunner.nafath.logger.NafathLogger$$ExternalSyntheticLambda0;
import com.roadrunner.order.history.presentation.main.HistoryFragment;
import com.roadrunner.overlay.bubble.permission.presentation.OverlayPermissionDialogFragment;
import com.roadrunner.push.presentation.MessageDialogFragment;
import com.roadrunner.recentdeliveries.presentation.RecentDeliveriesFragment;
import com.roadrunner.rider.recruitment.accountcreation.analytics.AccountCreationLogger;
import com.roadrunner.rider.recruitment.accountcreation.otp_verification.OtpVerificationViewModel;
import com.roadrunner.rider.recruitment.accountcreation.password_creation.presentation.PasswordCreationViewModel;
import com.roadrunner.rider.safety.permission.presentation.RiderSafetyPermissionFragment;
import com.roadrunner.rider.safety.report.presentation.RiderSafetyReportFragment;
import com.roadrunner.rider.state.cashblock.api.presentation.CashBlockUiModel;
import com.roadrunner.rider.state.cashblock.presentation.CashBlockUiModelImpl;
import com.roadrunner.rider.state.futureshift.api.presentation.FutureShiftUiModel;
import com.roadrunner.rider.state.futureshift.presentation.FutureShiftUiModelImpl;
import com.roadrunner.rider.state.ondemand.api.bonus.OnDemandWithBonusUiModel;
import com.roadrunner.rider.state.ondemand.bonus.OnDemandWithBonusUiModelImpl;
import com.roadrunner.rider.state.onpause.api.presentation.OnPauseUiModel;
import com.roadrunner.rider.state.onpause.presentation.OnPauseUiModelImpl;
import com.roadrunner.rider.state.quests.api.list.QuestListUiModel;
import com.roadrunner.rider.state.quests.presentation.list.QuestListUiModelImpl;
import com.roadrunner.rider.state.searchshifts.api.presentation.SearchShiftsWithBonusUiModel;
import com.roadrunner.rider.state.searchshifts.presentation.SearchShiftsWithBonusUiModelImpl;
import com.roadrunner.rider.state.summary.nest.NestRiderStateSummaryUiModelImpl$1;
import com.roadrunner.rider.state.summary.nest.NestRiderStateSummaryUiModelImpl$onStopWorkingClick$1;
import com.roadrunner.rider.state.suspension.api.SuspensionUiModel;
import com.roadrunner.rider.state.suspension.presentation.SuspensionUiModelImpl;
import com.roadrunner.settings.subscreens.appearance.AppearanceFragment;
import com.roadrunner.settings.subscreens.chatLanguageSelector.ChatLanguageSelectorFragment;
import com.roadrunner.settings.subscreens.navigation.NavigationSettingsFragment;
import com.roadrunner.sidemenu.photoId.PhotoIdUiModelImpl$1$1;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda1;
import com.ui.common.base.BaseInjectionFragment;
import io.grpc.internal.SharedResourcePool;
import io.sentry.hints.MediaSessionCompatQueueItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.StringsKt__StringsKt$$ExternalSyntheticLambda1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import o.ActivityHandler26;
import o.ActivityHandler261;
import o.ActivityHandler27;
import o.ActivityHandler3;
import o.ActivityHandler33;
import o.ActivityHandler39;
import o.ActivityState;
import o.AdjustSigner;
import o.AndroidSystemCallbacksActivityCallbacks;
import o.BrazeExternalSyntheticLambda26;
import o.BrazeExternalSyntheticLambda45;
import o.DragAndDropTargetModifierNode;
import o.EngineInterceptorintercept2;
import o.LifecycleRequestDelegate;
import o.NetworkFetcher;
import o.ResponseData;
import o.SdkClickHandler;
import o.SdkClickHandler3;
import o.WindowInsetsCompatImpl28;
import o.a9;
import o.accessgetInstancedelegatecp;
import o.accessisRenderNodeCompatiblecp;
import o.awaitStarted;
import o.buildResponseData;
import o.createFromParcel;
import o.ddefault;
import o.decode;
import o.deepCopy;
import o.displayInAppMessagelambda1;
import o.div7Ah8Wj8;
import o.dlambda0;
import o.enablePlayStoreKidsCompliance;
import o.extractApplicationContext;
import o.generatePOSTBodyString;
import o.getCieXyz;
import o.getDeeplinkUrl;
import o.getDefaultInstance;
import o.getFbAppId;
import o.getGdprForgetMe;
import o.getGoogleAdId;
import o.getGooglePlayInstallReferrer;
import o.getIndexForKey;
import o.getOutputTransform;
import o.getPayload;
import o.getPayloadFromSystemPropertyFilePathReflection;
import o.getPayloadsFromContentProviderNoPermission;
import o.getPreinstallPayloadReadStatus;
import o.getPreinstallReferrer;
import o.getProcessName;
import o.getQueryContext;
import o.getRawReferrer;
import o.getSdkEnablementProviderandroid_sdk_base_release;
import o.getSdkPrefix;
import o.getTimeFromEpochInSeconds;
import o.hideCurrentlyDisplayingInAppMessage;
import o.internalInitInvalidationTracker;
import o.isContainerdelegate;
import o.isPlayTrackingEnabled;
import o.isPresent;
import o.isValidTimeZone;
import o.lambdaonActivityLifecycle0;
import o.logErrorMessageI;
import o.nowInMillisecondslambda0;
import o.onMove;
import o.onPrimaryNavigationFragmentChanged;
import o.onViewAttachedToWindowlambda0;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.proceed;
import o.r8lambda5weVaLnJrZw3JZ5gurH6kjpdo;
import o.r8lambda6juoqTAVmeOwP9B2d0JUPPbC0hI;
import o.r8lambda6sk4DzA3gskBkuQlANQmRL8Dlpk;
import o.r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U;
import o.r8lambda7vklbvSxqffTXHr8OM5RDzMr2g;
import o.r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c;
import o.r8lambda8idGBQ6O_cBQkyJ8rQoTH4QXpQ;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambda9TRUgiGfCDXBt9yOTfPj9x8uK2U;
import o.r8lambda9W7rM9h0rXoJVt7dma8S2cDdfX8;
import o.r8lambda9qNBVLI9W1w9u6acRFXNMoTC8s;
import o.r8lambda9vKHKtnZQ48a6W2MGZCuRpRQGEM;
import o.r8lambdaA6OoEGXD1K3feyxCkHtt4AhzdF0;
import o.r8lambdaAPdVUOgzpxu3R_AiyI3q29AyoU;
import o.r8lambdaAl1EwI53IP1m7WOEQjR8yUoMoo;
import o.r8lambdaC4x3_FR1RkvLSmBNZ_wkqomQW5Y;
import o.r8lambdaCjup2UudZWzaEOXJ0bW8nzZDb4c;
import o.r8lambdaDJ2RgYFdhTGcJ5lUVFy_5qY8;
import o.r8lambdaEJU_tl__ceNZdZ2EYEHdqtTMCZc;
import o.r8lambdaEQ0pS95J6zwbXPQOcYCtM1qJZk;
import o.r8lambdaF39FVXzcHG_DLAHx0YomtvrCnlQ;
import o.r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk;
import o.r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA;
import o.r8lambdaFEnLU5alJx2ClfZRg4tE2QEPKfs;
import o.r8lambdaRTIvhvu27JBv_zhnPEAt2ZGU;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo;
import o.readField;
import o.reloadOtherDeviceInfoParams;
import o.removeGlobalCallbackParametersI;
import o.removeGlobalPartnerParameter;
import o.removeGlobalPartnerParameterI;
import o.removeNodeAtDepth;
import o.retrySendingI;
import o.saveInteger;
import o.sendNextSdkClickI;
import o.setApplicationContext;
import o.setTransactionSuccessful;
import o.setType;
import o.shouldProcessEventI;
import o.stopForegroundTimerI;
import o.subscribeToBannersDismissedEventandroid_sdk_base_release;
import o.subscribeToChangeUserEventslambda1;
import o.teardownActivityStateS;
import o.teardownAllGlobalParametersS;
import o.teardownAttributionS;
import o.toBitmapConfig1JJdX4A;
import o.toSendI;
import o.trackAdRevenueI;
import o.trackEventI;
import o.trackMeasurementConsentI;
import o.useSideChannelForNotification;
import okhttp3.FormBody;
import org.joda.time.LocalDate;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class SettingsFragment extends BaseInjectionFragment {
    private static int ParcelableVolumeInfo = 1;
    private static int PlaybackStateCompatCustomAction;
    public setType IconCompatParcelizer;
    public r8lambdaRTIvhvu27JBv_zhnPEAt2ZGU MediaBrowserCompatMediaItem;
    public final ComponentRegistry$Builder MediaDescriptionCompat;
    public dlambda0 MediaMetadataCompat;
    public subscribeToChangeUserEventslambda1 MediaSessionCompatQueueItem;
    public BrazeExternalSyntheticLambda45 MediaSessionCompatToken;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY RatingCompat;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY RemoteActionCompatParcelizer;
    public getSdkEnablementProviderandroid_sdk_base_release read;
    public ActivityState serializer;
    public final ComponentRegistry$Builder write;

    /* JADX INFO: renamed from: com.roadrunner.settings.SettingsFragment$onViewCreated$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        private static int serializer = 0;
        private static int write = 1;
        public final /* synthetic */ int RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SearchShiftsWithBonusUiModel searchShiftsWithBonusUiModel) {
            super(1, 0, SearchShiftsWithBonusUiModel.class, searchShiftsWithBonusUiModel, "onSearchShiftsClicked", "onSearchShiftsClicked(Ljava/lang/String;)V");
            this.RemoteActionCompatParcelizer = 26;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HistoryFragment historyFragment) {
            super(1, 0, HistoryFragment.class, historyFragment, "onDateSelected", "onDateSelected(Lorg/joda/time/LocalDate;)V");
            this.RemoteActionCompatParcelizer = 1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MessageDialogFragment messageDialogFragment) {
            super(1, 0, MessageDialogFragment.class, messageDialogFragment, "handleActions", "handleActions(Lcom/roadrunner/push/presentation/MessageDialogAction;)V");
            this.RemoteActionCompatParcelizer = 3;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
            super(i, i2, cls, obj, str, str2);
            this.RemoteActionCompatParcelizer = i3;
        }

        /* JADX WARN: Code duplicated, block: B:193:0x066c  */
        /* JADX WARN: Code duplicated, block: B:194:0x067c  */
        /* JADX WARN: Code duplicated, block: B:197:0x06ab A[LOOP:3: B:195:0x06a5->B:197:0x06ab, LOOP_END] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final Object invoke(Object obj) {
            Object obj2;
            Object obj3;
            Object obj4;
            removeGlobalPartnerParameterI removeglobalpartnerparameteri;
            ArrayList arrayList;
            MutableStateFlow mutableStateFlow;
            Object obj5;
            String str;
            String strIconCompatParcelizer;
            Object obj6;
            ActivityHandler39 activityHandler39;
            Object obj7;
            ActivityHandler39 activityHandler310;
            int i = 2 % 2;
            int i2 = this.RemoteActionCompatParcelizer;
            ActivityHandler3 activityHandler3 = ActivityHandler3.serializer;
            getOutputTransform awaitstarted = LifecycleRequestDelegate.write;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            int i3 = 3;
            Object obj8 = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            Object obj9 = null;
            switch (i2) {
                case 0:
                    r8lambda6sk4DzA3gskBkuQlANQmRL8Dlpk r8lambda6sk4dza3gskbkuqlanqmrl8dlpk = (r8lambda6sk4DzA3gskBkuQlANQmRL8Dlpk) obj;
                    r8lambda6sk4dza3gskbkuqlanqmrl8dlpk.getClass();
                    SettingsFragment settingsFragment = (SettingsFragment) this.MediaMetadataCompat;
                    settingsFragment.getClass();
                    if (r8lambda6sk4dza3gskbkuqlanqmrl8dlpk.equals(r8lambdaC4x3_FR1RkvLSmBNZ_wkqomQW5Y.IconCompatParcelizer)) {
                        ActivityState activityState = settingsFragment.serializer;
                        if (activityState == null) {
                            removeNodeAtDepth.serializer("riderSafetyNavigator");
                            throw null;
                        }
                        FragmentActivity fragmentActivityRequireActivity = settingsFragment.requireActivity();
                        fragmentActivityRequireActivity.getClass();
                        activityState.RemoteActionCompatParcelizer(fragmentActivityRequireActivity);
                        return createfromparcel;
                    }
                    if (r8lambda6sk4dza3gskbkuqlanqmrl8dlpk.equals(r8lambdaAl1EwI53IP1m7WOEQjR8yUoMoo.serializer)) {
                        Context context = settingsFragment.getContext();
                        if (context == null) {
                            return createfromparcel;
                        }
                        context.startActivity(new Intent(settingsFragment.getContext(), (Class<?>) OssLicensesMenuActivity.class));
                        return createfromparcel;
                    }
                    if (r8lambda6sk4dza3gskbkuqlanqmrl8dlpk.equals(r8lambdaEQ0pS95J6zwbXPQOcYCtM1qJZk.read)) {
                        MediaSessionCompatQueueItem.IconCompatParcelizer(null, settingsFragment.getResources().getString(R.string.settings_sign_out_confirmation_title), settingsFragment.getResources().getString(R.string.settings_sign_out_title), null, settingsFragment.getResources().getString(R.string.all_cancel), true, false, false, 73).RemoteActionCompatParcelizer(settingsFragment.getChildFragmentManager(), "signout_dialog");
                        return createfromparcel;
                    }
                    if (r8lambda6sk4dza3gskbkuqlanqmrl8dlpk instanceof r8lambdaA6OoEGXD1K3feyxCkHtt4AhzdF0) {
                        int i4 = serializer + 55;
                        write = i4 % Fields.SpotShadowColor;
                        int i5 = i4 % 2;
                        if (settingsFragment.read == null) {
                            removeNodeAtDepth.serializer("settingsNavigator");
                            throw null;
                        }
                        FragmentActivity fragmentActivityRequireActivity2 = settingsFragment.requireActivity();
                        fragmentActivityRequireActivity2.getClass();
                        new NavigationSettingsFragment().RemoteActionCompatParcelizer(fragmentActivityRequireActivity2.getSupportFragmentManager(), "com.roadrunner.settings.subscreens.navigation.NavigationSettingsFragment");
                        return createfromparcel;
                    }
                    if (r8lambda6sk4dza3gskbkuqlanqmrl8dlpk instanceof r8lambdaDJ2RgYFdhTGcJ5lUVFy_5qY8) {
                        BrazeExternalSyntheticLambda45 brazeExternalSyntheticLambda45 = settingsFragment.MediaSessionCompatToken;
                        if (brazeExternalSyntheticLambda45 == null) {
                            removeNodeAtDepth.serializer("webNavigator");
                            throw null;
                        }
                        Uri uri = Uri.parse(((r8lambdaDJ2RgYFdhTGcJ5lUVFy_5qY8) r8lambda6sk4dza3gskbkuqlanqmrl8dlpk).serializer);
                        FragmentActivity fragmentActivityRequireActivity3 = settingsFragment.requireActivity();
                        fragmentActivityRequireActivity3.getClass();
                        brazeExternalSyntheticLambda45.RemoteActionCompatParcelizer(uri, fragmentActivityRequireActivity3);
                        return createfromparcel;
                    }
                    if (r8lambda6sk4dza3gskbkuqlanqmrl8dlpk.equals(r8lambda9vKHKtnZQ48a6W2MGZCuRpRQGEM.read)) {
                        if (settingsFragment.read == null) {
                            removeNodeAtDepth.serializer("settingsNavigator");
                            throw null;
                        }
                        FragmentActivity fragmentActivityRequireActivity4 = settingsFragment.requireActivity();
                        fragmentActivityRequireActivity4.getClass();
                        new ChatLanguageSelectorFragment().RemoteActionCompatParcelizer(fragmentActivityRequireActivity4.getSupportFragmentManager(), "ChatLanguageSelectorFragment");
                        return createfromparcel;
                    }
                    if (r8lambda6sk4dza3gskbkuqlanqmrl8dlpk.equals(r8lambda9W7rM9h0rXoJVt7dma8S2cDdfX8.serializer)) {
                        setType settype = settingsFragment.IconCompatParcelizer;
                        if (settype == null) {
                            removeNodeAtDepth.serializer("diagnosticsNavigator");
                            throw null;
                        }
                        int i6 = write + 111;
                        serializer = i6 % Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        settype.serializer();
                        return createfromparcel;
                    }
                    if (r8lambda6sk4dza3gskbkuqlanqmrl8dlpk instanceof r8lambda7vklbvSxqffTXHr8OM5RDzMr2g) {
                        Uri uri2 = Uri.parse("https://play.google.com/store/apps/details?id=" + ((r8lambda7vklbvSxqffTXHr8OM5RDzMr2g) r8lambda6sk4dza3gskbkuqlanqmrl8dlpk).serializer);
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(uri2);
                        intent.setPackage("com.android.vending");
                        try {
                            settingsFragment.startActivity(intent);
                            return createfromparcel;
                        } catch (ActivityNotFoundException unused) {
                            settingsFragment.startActivity(new Intent("android.intent.action.VIEW", uri2));
                            return createfromparcel;
                        }
                    }
                    if (r8lambda6sk4dza3gskbkuqlanqmrl8dlpk.equals(r8lambda8idGBQ6O_cBQkyJ8rQoTH4QXpQ.IconCompatParcelizer)) {
                        settingsFragment.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", settingsFragment.requireActivity().getPackageName(), null)));
                        return createfromparcel;
                    }
                    if (r8lambda6sk4dza3gskbkuqlanqmrl8dlpk.equals(r8lambda9TRUgiGfCDXBt9yOTfPj9x8uK2U.write)) {
                        if (settingsFragment.read == null) {
                            removeNodeAtDepth.serializer("settingsNavigator");
                            throw null;
                        }
                        FragmentActivity fragmentActivityRequireActivity5 = settingsFragment.requireActivity();
                        fragmentActivityRequireActivity5.getClass();
                        new AppearanceFragment().RemoteActionCompatParcelizer(fragmentActivityRequireActivity5.getSupportFragmentManager(), "AppearanceFragment");
                        return createfromparcel;
                    }
                    if (r8lambda6sk4dza3gskbkuqlanqmrl8dlpk.equals(r8lambda9qNBVLI9W1w9u6acRFXNMoTC8s.IconCompatParcelizer)) {
                        settingsFragment.requireContext().getClass();
                        return createfromparcel;
                    }
                    if (r8lambda6sk4dza3gskbkuqlanqmrl8dlpk.equals(r8lambdaCjup2UudZWzaEOXJ0bW8nzZDb4c.write)) {
                        if (settingsFragment.MediaSessionCompatQueueItem != null) {
                            settingsFragment.requireContext().getClass();
                            return createfromparcel;
                        }
                        removeNodeAtDepth.serializer("usercentricsBannerDialog");
                        throw null;
                    }
                    if (r8lambda6sk4dza3gskbkuqlanqmrl8dlpk.equals(r8lambdaEJU_tl__ceNZdZ2EYEHdqtTMCZc.IconCompatParcelizer)) {
                        int i8 = write + 61;
                        serializer = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        MediaSessionCompatQueueItem.IconCompatParcelizer(settingsFragment.getResources().getString(R.string.logout_active_order_dialog_title), settingsFragment.getResources().getString(R.string.logout_active_order_dialog_description), settingsFragment.getResources().getString(R.string.logout_active_order_dialog_button), null, null, false, false, true, 376).RemoteActionCompatParcelizer(settingsFragment.getChildFragmentManager(), "active_order_dialog");
                        return createfromparcel;
                    }
                    if (!(r8lambda6sk4dza3gskbkuqlanqmrl8dlpk instanceof r8lambdaAPdVUOgzpxu3R_AiyI3q29AyoU)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    dlambda0 dlambda0Var = settingsFragment.MediaMetadataCompat;
                    if (dlambda0Var == null) {
                        removeNodeAtDepth.serializer("snackbarManager");
                        throw null;
                    }
                    View viewRequireView = settingsFragment.requireView();
                    viewRequireView.getClass();
                    r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo.IconCompatParcelizer(dlambda0Var, viewRequireView, ((r8lambdaAPdVUOgzpxu3R_AiyI3q29AyoU) r8lambda6sk4dza3gskbkuqlanqmrl8dlpk).read, ddefault.IconCompatParcelizer, 0, null, null, 48);
                    return createfromparcel;
                case 1:
                    LocalDate localDate = (LocalDate) obj;
                    localDate.getClass();
                    ((HistoryFragment) this.MediaMetadataCompat).write().IconCompatParcelizer(localDate);
                    return createfromparcel;
                case 2:
                    EngineInterceptorintercept2 engineInterceptorintercept2 = (EngineInterceptorintercept2) obj;
                    engineInterceptorintercept2.getClass();
                    OverlayPermissionDialogFragment overlayPermissionDialogFragment = (OverlayPermissionDialogFragment) this.MediaMetadataCompat;
                    if (engineInterceptorintercept2 instanceof NetworkFetcher) {
                        overlayPermissionDialogFragment.startActivity(((NetworkFetcher) engineInterceptorintercept2).IconCompatParcelizer);
                        return createfromparcel;
                    }
                    if (engineInterceptorintercept2 instanceof proceed) {
                        overlayPermissionDialogFragment.read(false, false);
                        return createfromparcel;
                    }
                    overlayPermissionDialogFragment.getClass();
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                case 3:
                    lambdaonActivityLifecycle0 lambdaonactivitylifecycle0 = (lambdaonActivityLifecycle0) obj;
                    lambdaonactivitylifecycle0.getClass();
                    MessageDialogFragment messageDialogFragment = (MessageDialogFragment) this.MediaMetadataCompat;
                    messageDialogFragment.getClass();
                    if (!(!lambdaonactivitylifecycle0.equals(lambdaonActivityLifecycle0.RemoteActionCompatParcelizer))) {
                        messageDialogFragment.read(false, false);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                case 4:
                    teardownAttributionS teardownattributions = (teardownAttributionS) obj;
                    teardownattributions.getClass();
                    RecentDeliveriesFragment recentDeliveriesFragment = (RecentDeliveriesFragment) this.MediaMetadataCompat;
                    recentDeliveriesFragment.getClass();
                    if (!(!teardownattributions.equals(stopForegroundTimerI.RemoteActionCompatParcelizer))) {
                        recentDeliveriesFragment.read(false, false);
                        return createfromparcel;
                    }
                    if (teardownattributions instanceof trackMeasurementConsentI) {
                        int i10 = write + 29;
                        serializer = i10 % Fields.SpotShadowColor;
                        if (i10 % 2 != 0) {
                            BrazeExternalSyntheticLambda45 brazeExternalSyntheticLambda46 = recentDeliveriesFragment.onBackPressed;
                            obj8.hashCode();
                            throw null;
                        }
                        BrazeExternalSyntheticLambda45 brazeExternalSyntheticLambda47 = recentDeliveriesFragment.onBackPressed;
                        if (brazeExternalSyntheticLambda47 == null) {
                            removeNodeAtDepth.serializer("webNavigator");
                            throw null;
                        }
                        Uri uri3 = Uri.parse(((trackMeasurementConsentI) teardownattributions).RemoteActionCompatParcelizer);
                        FragmentActivity fragmentActivityRequireActivity6 = recentDeliveriesFragment.requireActivity();
                        fragmentActivityRequireActivity6.getClass();
                        brazeExternalSyntheticLambda47.RemoteActionCompatParcelizer(uri3, fragmentActivityRequireActivity6);
                        return createfromparcel;
                    }
                    if (teardownattributions instanceof trackEventI) {
                        BrazeExternalSyntheticLambda26 brazeExternalSyntheticLambda26 = recentDeliveriesFragment.getNavigationEventDispatcher;
                        if (brazeExternalSyntheticLambda26 == null) {
                            removeNodeAtDepth.serializer("navigateToWebIntegration");
                            throw null;
                        }
                        int i11 = write + 103;
                        serializer = i11 % Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                        FragmentActivity fragmentActivityRequireActivity7 = recentDeliveriesFragment.requireActivity();
                        fragmentActivityRequireActivity7.getClass();
                        div7Ah8Wj8 parentFragmentManager = recentDeliveriesFragment.getParentFragmentManager();
                        parentFragmentManager.getClass();
                        teardownActivityStateS teardownactivitystates = ((trackEventI) teardownattributions).serializer;
                        brazeExternalSyntheticLambda26.write(fragmentActivityRequireActivity7, parentFragmentManager, Uri.parse(teardownactivitystates.RemoteActionCompatParcelizer), teardownactivitystates.write, "Earnings");
                        return createfromparcel;
                    }
                    if (teardownattributions instanceof trackAdRevenueI) {
                        ddefault ddefaultVar = ddefault.IconCompatParcelizer;
                        String str2 = ((trackAdRevenueI) teardownattributions).serializer;
                        dlambda0 dlambda0Var2 = recentDeliveriesFragment.getSavedStateRegistry;
                        if (dlambda0Var2 == null) {
                            removeNodeAtDepth.serializer("snackBarManager");
                            throw null;
                        }
                        View viewRequireView2 = recentDeliveriesFragment.requireView();
                        viewRequireView2.getClass();
                        r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo.IconCompatParcelizer(dlambda0Var2, viewRequireView2, str2, ddefaultVar, 0, null, null, 56);
                        return createfromparcel;
                    }
                    if (!(teardownattributions instanceof toSendI)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    ddefault ddefaultVar2 = ddefault.RemoteActionCompatParcelizer;
                    String str3 = ((toSendI) teardownattributions).serializer;
                    dlambda0 dlambda0Var3 = recentDeliveriesFragment.getSavedStateRegistry;
                    if (dlambda0Var3 == null) {
                        removeNodeAtDepth.serializer("snackBarManager");
                        throw null;
                    }
                    View viewRequireView3 = recentDeliveriesFragment.requireView();
                    viewRequireView3.getClass();
                    r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo.IconCompatParcelizer(dlambda0Var3, viewRequireView3, str3, ddefaultVar2, 0, null, null, 56);
                    return createfromparcel;
                case 5:
                    String str4 = (String) obj;
                    str4.getClass();
                    shouldProcessEventI shouldprocesseventi = (shouldProcessEventI) this.MediaMetadataCompat;
                    shouldprocesseventi.getClass();
                    a9 a9Var = shouldprocesseventi.serializer;
                    a9Var.getClass();
                    ClipData clipDataNewPlainText = ClipData.newPlainText(str4, str4);
                    Object systemService = a9Var.read.getSystemService("clipboard");
                    systemService.getClass();
                    ((ClipboardManager) systemService).setPrimaryClip(clipDataNewPlainText);
                    shouldprocesseventi.MediaDescriptionCompat.serializer(new toSendI(shouldprocesseventi.MediaMetadataCompat.read(R.string.all_clipboard, str4)));
                    return createfromparcel;
                case 6:
                    teardownAllGlobalParametersS teardownallglobalparameterss = (teardownAllGlobalParametersS) obj;
                    teardownallglobalparameterss.getClass();
                    shouldProcessEventI shouldprocesseventi2 = (shouldProcessEventI) this.MediaMetadataCompat;
                    shouldprocesseventi2.getClass();
                    MutableStateFlow mutableStateFlow2 = shouldprocesseventi2.IconCompatParcelizer;
                    do {
                        obj2 = mutableStateFlow2.read();
                    } while (!mutableStateFlow2.RemoteActionCompatParcelizer(obj2, shouldprocesseventi2.read(teardownallglobalparameterss.read, new TncContentKt$$ExternalSyntheticLambda1(shouldprocesseventi2, i3, teardownallglobalparameterss))));
                    return createfromparcel;
                case 7:
                    teardownAllGlobalParametersS teardownallglobalparameterss2 = (teardownAllGlobalParametersS) obj;
                    teardownallglobalparameterss2.getClass();
                    shouldProcessEventI shouldprocesseventi3 = (shouldProcessEventI) this.MediaMetadataCompat;
                    shouldprocesseventi3.getClass();
                    MutableStateFlow mutableStateFlow3 = shouldprocesseventi3.IconCompatParcelizer;
                    do {
                        obj3 = mutableStateFlow3.read();
                    } while (!mutableStateFlow3.RemoteActionCompatParcelizer(obj3, shouldprocesseventi3.read(teardownallglobalparameterss2.read, new NafathLogger$$ExternalSyntheticLambda0(18))));
                    return createfromparcel;
                case 8:
                    teardownActivityStateS teardownactivitystates2 = (teardownActivityStateS) obj;
                    teardownactivitystates2.getClass();
                    shouldProcessEventI shouldprocesseventi4 = (shouldProcessEventI) this.MediaMetadataCompat;
                    shouldprocesseventi4.getClass();
                    shouldprocesseventi4.MediaDescriptionCompat.serializer(new trackEventI(teardownactivitystates2));
                    ff$$ExternalSyntheticOutline0.m("screenName", "Recent Deliveries", (decode) shouldprocesseventi4.MediaSessionCompatQueueItem.serializer, "deliveries_earnings_link_clicked");
                    return createfromparcel;
                case 9:
                    String str5 = (String) obj;
                    str5.getClass();
                    removeGlobalPartnerParameter removeglobalpartnerparameter = (removeGlobalPartnerParameter) this.MediaMetadataCompat;
                    removeglobalpartnerparameter.getClass();
                    MutableStateFlow mutableStateFlow4 = removeglobalpartnerparameter.RemoteActionCompatParcelizer;
                    do {
                        obj4 = mutableStateFlow4.read();
                    } while (!mutableStateFlow4.RemoteActionCompatParcelizer(obj4, removeGlobalCallbackParametersI.IconCompatParcelizer((removeGlobalCallbackParametersI) obj4, false, null, false, null, str5, 122879)));
                    removeglobalpartnerparameter.IconCompatParcelizer.IconCompatParcelizer(str5);
                    return createfromparcel;
                case 10:
                    String str6 = (String) obj;
                    str6.getClass();
                    removeGlobalPartnerParameter removeglobalpartnerparameter2 = (removeGlobalPartnerParameter) this.MediaMetadataCompat;
                    removeglobalpartnerparameter2.getClass();
                    for (Object obj10 : removeglobalpartnerparameter2.serializer) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((removeGlobalPartnerParameterI) obj10).IconCompatParcelizer, str6}, getCieXyz.write())).booleanValue()) {
                            obj9 = obj10;
                            removeglobalpartnerparameteri = (removeGlobalPartnerParameterI) obj9;
                            if (removeglobalpartnerparameteri == null) {
                                Timber.RemoteActionCompatParcelizer.read("Country not found for ISO code: ".concat(str6), new Object[0]);
                            } else {
                                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Country selected: ", removeglobalpartnerparameteri.serializer, " (", removeglobalpartnerparameteri.RemoteActionCompatParcelizer, ")"), new Object[0]);
                                List<removeGlobalPartnerParameterI> list = removeglobalpartnerparameter2.serializer;
                                arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
                                for (removeGlobalPartnerParameterI removeglobalpartnerparameteri2 : list) {
                                    boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{removeglobalpartnerparameteri2.IconCompatParcelizer, str6}, getCieXyz.write())).booleanValue();
                                    String str7 = removeglobalpartnerparameteri2.write;
                                    String str8 = removeglobalpartnerparameteri2.serializer;
                                    String str9 = removeglobalpartnerparameteri2.RemoteActionCompatParcelizer;
                                    String str10 = removeglobalpartnerparameteri2.IconCompatParcelizer;
                                    str8.getClass();
                                    str9.getClass();
                                    str10.getClass();
                                    arrayList.add(new removeGlobalPartnerParameterI(str7, str8, str9, str10, zBooleanValue));
                                }
                                removeglobalpartnerparameter2.serializer = arrayList;
                                removeglobalpartnerparameter2.IconCompatParcelizer.IconCompatParcelizer("");
                                mutableStateFlow = removeglobalpartnerparameter2.RemoteActionCompatParcelizer;
                                do {
                                    obj5 = mutableStateFlow.read();
                                } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj5, removeGlobalCallbackParametersI.IconCompatParcelizer((removeGlobalCallbackParametersI) obj5, false, removeglobalpartnerparameteri.RemoteActionCompatParcelizer, false, removeglobalpartnerparameter2.serializer, "", 116223)));
                            }
                            return createfromparcel;
                        }
                    }
                    removeglobalpartnerparameteri = (removeGlobalPartnerParameterI) obj9;
                    if (removeglobalpartnerparameteri == null) {
                        Timber.RemoteActionCompatParcelizer.read("Country not found for ISO code: ".concat(str6), new Object[0]);
                    } else {
                        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Country selected: ", removeglobalpartnerparameteri.serializer, " (", removeglobalpartnerparameteri.RemoteActionCompatParcelizer, ")"), new Object[0]);
                        List<removeGlobalPartnerParameterI> list2 = removeglobalpartnerparameter2.serializer;
                        arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
                        while (r3.hasNext()) {
                            boolean zBooleanValue2 = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{removeglobalpartnerparameteri2.IconCompatParcelizer, str6}, getCieXyz.write())).booleanValue();
                            String str11 = removeglobalpartnerparameteri2.write;
                            String str12 = removeglobalpartnerparameteri2.serializer;
                            String str13 = removeglobalpartnerparameteri2.RemoteActionCompatParcelizer;
                            String str14 = removeglobalpartnerparameteri2.IconCompatParcelizer;
                            str12.getClass();
                            str13.getClass();
                            str14.getClass();
                            arrayList.add(new removeGlobalPartnerParameterI(str11, str12, str13, str14, zBooleanValue2));
                        }
                        removeglobalpartnerparameter2.serializer = arrayList;
                        removeglobalpartnerparameter2.IconCompatParcelizer.IconCompatParcelizer("");
                        mutableStateFlow = removeglobalpartnerparameter2.RemoteActionCompatParcelizer;
                        do {
                            obj5 = mutableStateFlow.read();
                        } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj5, removeGlobalCallbackParametersI.IconCompatParcelizer((removeGlobalCallbackParametersI) obj5, false, removeglobalpartnerparameteri.RemoteActionCompatParcelizer, false, removeglobalpartnerparameter2.serializer, "", 116223)));
                    }
                    return createfromparcel;
                case 11:
                    r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) obj;
                    r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
                    ((OtpVerificationViewModel) this.MediaMetadataCompat).RemoteActionCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
                    return createfromparcel;
                case 12:
                    ActivityHandler27 activityHandler27 = (ActivityHandler27) obj;
                    activityHandler27.getClass();
                    PasswordCreationViewModel passwordCreationViewModel = (PasswordCreationViewModel) this.MediaMetadataCompat;
                    setTransactionSuccessful settransactionsuccessful = passwordCreationViewModel.PlaybackStateCompat;
                    Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                    activityHandler27.toString();
                    forest.getClass();
                    AccountCreationLogger accountCreationLogger = passwordCreationViewModel.MediaSessionCompatQueueItem;
                    accountCreationLogger.getClass();
                    boolean z = activityHandler27 instanceof ActivityHandler26;
                    ActivityHandler261 activityHandler261 = ActivityHandler261.write;
                    if (!z) {
                        if (activityHandler27.equals(activityHandler261)) {
                            str = "timeout";
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        }
                        return null;
                    }
                    str = ((ActivityHandler26) activityHandler27).RemoteActionCompatParcelizer;
                    ff$$ExternalSyntheticOutline0.m("errorMsg", str, accountCreationLogger.RemoteActionCompatParcelizer, "captcha_fail");
                    if (z) {
                        strIconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(R.string.captcha_error);
                    } else {
                        if (!activityHandler27.equals(activityHandler261)) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                        }
                        strIconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(R.string.captcha_timeout);
                    }
                    passwordCreationViewModel.RemoteActionCompatParcelizer.IconCompatParcelizer(activityHandler3);
                    passwordCreationViewModel.RemoteActionCompatParcelizer();
                    passwordCreationViewModel.MediaSessionCompatResultReceiverWrapper.serializer(new ActivityHandler33(new setApplicationContext(strIconCompatParcelizer, null, null, 6)));
                    return createfromparcel;
                case 13:
                    String str15 = (String) obj;
                    str15.getClass();
                    PasswordCreationViewModel passwordCreationViewModel2 = (PasswordCreationViewModel) this.MediaMetadataCompat;
                    passwordCreationViewModel2.getClass();
                    Timber.RemoteActionCompatParcelizer.getClass();
                    passwordCreationViewModel2.RemoteActionCompatParcelizer.IconCompatParcelizer(activityHandler3);
                    passwordCreationViewModel2.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer.logEvent("captcha_success", null);
                    BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(passwordCreationViewModel2), null, null, new RememberLottieCompositionKt$rememberLottieComposition$3(passwordCreationViewModel2, str15, null), 3);
                    return createfromparcel;
                case 14:
                    String str16 = (String) obj;
                    str16.getClass();
                    PasswordCreationViewModel passwordCreationViewModel3 = (PasswordCreationViewModel) this.MediaMetadataCompat;
                    passwordCreationViewModel3.getClass();
                    MutableStateFlow mutableStateFlow5 = passwordCreationViewModel3.MediaMetadataCompat;
                    String str17 = ((ActivityHandler39) mutableStateFlow5.read()).MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
                    getSdkEnablementProviderandroid_sdk_base_release getsdkenablementproviderandroid_sdk_base_release = passwordCreationViewModel3.ResultReceiver;
                    List list3 = ((ActivityHandler39) mutableStateFlow5.read()).RatingCompat;
                    getsdkenablementproviderandroid_sdk_base_release.getClass();
                    ArrayList arrayList2 = getSdkEnablementProviderandroid_sdk_base_release.read(str16, list3);
                    if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str16) && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str17)) {
                        if (str16.equals(str17)) {
                            int i13 = serializer + 91;
                            write = i13 % Fields.SpotShadowColor;
                            if (i13 % 2 == 0) {
                                throw null;
                            }
                        } else {
                            awaitstarted = new awaitStarted(passwordCreationViewModel3.PlaybackStateCompat.IconCompatParcelizer(R.string.account_creation_password_mismatch_error_text));
                        }
                    }
                    do {
                        obj6 = mutableStateFlow5.read();
                        activityHandler39 = (ActivityHandler39) obj6;
                    } while (!mutableStateFlow5.RemoteActionCompatParcelizer(obj6, ActivityHandler39.write(activityHandler39, AndroidSystemCallbacksActivityCallbacks.write(activityHandler39.MediaMetadataCompat, str16, null, 6), AndroidSystemCallbacksActivityCallbacks.write(activityHandler39.MediaBrowserCompatMediaItem, null, awaitstarted, 3), passwordCreationViewModel3.serializer(str16, str17), arrayList2, false, 131056)));
                    return createfromparcel;
                case 15:
                    String str18 = (String) obj;
                    str18.getClass();
                    PasswordCreationViewModel passwordCreationViewModel4 = (PasswordCreationViewModel) this.MediaMetadataCompat;
                    passwordCreationViewModel4.getClass();
                    MutableStateFlow mutableStateFlow6 = passwordCreationViewModel4.MediaMetadataCompat;
                    String str19 = ((ActivityHandler39) mutableStateFlow6.read()).MediaMetadataCompat.RemoteActionCompatParcelizer;
                    if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str19) && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str18) && !str19.equals(str18)) {
                        awaitstarted = new awaitStarted(passwordCreationViewModel4.PlaybackStateCompat.IconCompatParcelizer(R.string.account_creation_password_mismatch_error_text));
                    }
                    do {
                        obj7 = mutableStateFlow6.read();
                        activityHandler310 = (ActivityHandler39) obj7;
                    } while (!mutableStateFlow6.RemoteActionCompatParcelizer(obj7, ActivityHandler39.write(activityHandler310, null, AndroidSystemCallbacksActivityCallbacks.write(activityHandler310.MediaBrowserCompatMediaItem, str18, awaitstarted, 2), passwordCreationViewModel4.serializer(str19, str18), null, false, 131065)));
                    return createfromparcel;
                case 16:
                    getDefaultInstance getdefaultinstance = (getDefaultInstance) obj;
                    getdefaultinstance.getClass();
                    RiderSafetyPermissionFragment riderSafetyPermissionFragment = (RiderSafetyPermissionFragment) this.MediaMetadataCompat;
                    if (getdefaultinstance instanceof getGooglePlayInstallReferrer) {
                        if (!((getGooglePlayInstallReferrer) getdefaultinstance).RemoteActionCompatParcelizer || riderSafetyPermissionFragment.requireActivity().shouldShowRequestPermissionRationale(LocationConstant.BACKGROUND_PERMISSION)) {
                            riderSafetyPermissionFragment.getNavigationEventDispatcher.write(LocationConstant.BACKGROUND_PERMISSION);
                            return createfromparcel;
                        }
                        Context context2 = riderSafetyPermissionFragment.getContext();
                        riderSafetyPermissionFragment.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", context2 != null ? context2.getPackageName() : null, null)));
                        return createfromparcel;
                    }
                    if (!(getdefaultinstance instanceof extractApplicationContext)) {
                        riderSafetyPermissionFragment.getClass();
                        if (getdefaultinstance.equals(getGoogleAdId.write)) {
                            return createfromparcel;
                        }
                        int i14 = serializer + 23;
                        write = i14 % Fields.SpotShadowColor;
                        int i15 = i14 % 2;
                        if (getdefaultinstance.equals(getGoogleAdId.read)) {
                            riderSafetyPermissionFragment.read(false, false);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    if (((extractApplicationContext) getdefaultinstance).RemoteActionCompatParcelizer && !riderSafetyPermissionFragment.requireActivity().shouldShowRequestPermissionRationale("android.permission.ACTIVITY_RECOGNITION")) {
                        Context context3 = riderSafetyPermissionFragment.getContext();
                        riderSafetyPermissionFragment.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", context3 != null ? context3.getPackageName() : null, null)));
                        return createfromparcel;
                    }
                    internalInitInvalidationTracker internalinitinvalidationtracker = riderSafetyPermissionFragment.getOnBackPressedDispatcher;
                    if (internalinitinvalidationtracker == null) {
                        removeNodeAtDepth.serializer("activityRecognitionPermissionHandler");
                        throw null;
                    }
                    internalinitinvalidationtracker.write();
                    int i16 = write + 33;
                    serializer = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    return createfromparcel;
                case 17:
                    enablePlayStoreKidsCompliance enableplaystorekidscompliance = (enablePlayStoreKidsCompliance) obj;
                    enableplaystorekidscompliance.getClass();
                    getProcessName getprocessname = (getProcessName) this.MediaMetadataCompat;
                    SharedResourcePool sharedResourcePool = getprocessname.RatingCompat;
                    int i18 = getSdkPrefix.RemoteActionCompatParcelizer[enableplaystorekidscompliance.ordinal()];
                    if (i18 == 1) {
                        sharedResourcePool.serializer(getFbAppId.RemoteActionCompatParcelizer);
                        return createfromparcel;
                    }
                    if (i18 == 2) {
                        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(getprocessname), null, null, new TextFieldSelectionManager$copy$1(true, getprocessname, null), 3);
                        return createfromparcel;
                    }
                    if (i18 != 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    getprocessname.MediaDescriptionCompat.IconCompatParcelizer.logEvent("rider_safety_grant_permission_clicked", null);
                    sharedResourcePool.serializer(getFbAppId.serializer);
                    return createfromparcel;
                case 18:
                    getFbAppId getfbappid = (getFbAppId) obj;
                    getfbappid.getClass();
                    RiderSafetyReportFragment riderSafetyReportFragment = (RiderSafetyReportFragment) this.MediaMetadataCompat;
                    riderSafetyReportFragment.getClass();
                    if (getfbappid.equals(getFbAppId.RemoteActionCompatParcelizer)) {
                        riderSafetyReportFragment.read(false, false);
                        return createfromparcel;
                    }
                    if (!getfbappid.equals(getFbAppId.serializer)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    ActivityState activityState2 = riderSafetyReportFragment.getNavigationEventDispatcher;
                    if (activityState2 == null) {
                        removeNodeAtDepth.serializer("riderSafetyNavigator");
                        throw null;
                    }
                    FragmentActivity fragmentActivityRequireActivity8 = riderSafetyReportFragment.requireActivity();
                    fragmentActivityRequireActivity8.getClass();
                    activityState2.RemoteActionCompatParcelizer(fragmentActivityRequireActivity8);
                    return createfromparcel;
                case 19:
                    String str20 = (String) obj;
                    str20.getClass();
                    CashBlockUiModelImpl cashBlockUiModelImpl = (CashBlockUiModelImpl) ((CashBlockUiModel) this.MediaMetadataCompat);
                    cashBlockUiModelImpl.getClass();
                    cashBlockUiModelImpl.IconCompatParcelizer.IconCompatParcelizer.logEvent("cashblock_wallet_clicked", null);
                    cashBlockUiModelImpl.RemoteActionCompatParcelizer.read(Uri.parse(str20));
                    return createfromparcel;
                case 20:
                    int iIntValue = ((Number) obj).intValue();
                    FutureShiftUiModelImpl futureShiftUiModelImpl = (FutureShiftUiModelImpl) ((FutureShiftUiModel) this.MediaMetadataCompat);
                    futureShiftUiModelImpl.MediaBrowserCompatMediaItem.IconCompatParcelizer(onPrimaryNavigationFragmentChanged.COLLAPSED);
                    futureShiftUiModelImpl.MediaDescriptionCompat.serializer.MediaDescriptionCompat.IconCompatParcelizer(Integer.valueOf(iIntValue));
                    return createfromparcel;
                case 21:
                    int iIntValue2 = ((Number) obj).intValue();
                    OnDemandWithBonusUiModelImpl onDemandWithBonusUiModelImpl = (OnDemandWithBonusUiModelImpl) ((OnDemandWithBonusUiModel) this.MediaMetadataCompat);
                    getPayload getpayload = onDemandWithBonusUiModelImpl.MediaBrowserCompatMediaItem;
                    if (onDemandWithBonusUiModelImpl.MediaDescriptionCompat.RemoteActionCompatParcelizer()) {
                        getpayload.RemoteActionCompatParcelizer(String.valueOf(iIntValue2), "true");
                    }
                    getpayload.read();
                    onDemandWithBonusUiModelImpl.RemoteActionCompatParcelizer.serializer(new isPresent());
                    return createfromparcel;
                case 22:
                    int iIntValue3 = ((Number) obj).intValue();
                    OnDemandWithBonusUiModelImpl onDemandWithBonusUiModelImpl2 = (OnDemandWithBonusUiModelImpl) ((OnDemandWithBonusUiModel) this.MediaMetadataCompat);
                    if (onDemandWithBonusUiModelImpl2.MediaDescriptionCompat.RemoteActionCompatParcelizer()) {
                        onDemandWithBonusUiModelImpl2.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(String.valueOf(iIntValue3), "false");
                    }
                    onDemandWithBonusUiModelImpl2.RemoteActionCompatParcelizer.serializer(new AdjustSigner("To go online, please move into the zone."));
                    return createfromparcel;
                case 23:
                    deepCopy deepcopy = (deepCopy) obj;
                    deepcopy.getClass();
                    OnPauseUiModelImpl onPauseUiModelImpl = (OnPauseUiModelImpl) ((OnPauseUiModel) this.MediaMetadataCompat);
                    onPauseUiModelImpl.getClass();
                    switch (reloadOtherDeviceInfoParams.serializer[deepcopy.IconCompatParcelizer.ordinal()]) {
                        case 1:
                            onPauseUiModelImpl.MediaMetadataCompat.read.logEvent("end_pause_clicked", null);
                            BuildersKt.RemoteActionCompatParcelizer(onPauseUiModelImpl.write, null, null, new NafathModalUiModelImpl$1(onPauseUiModelImpl, objArr == true ? 1 : 0, 23), 3);
                            return createfromparcel;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            return createfromparcel;
                        default:
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                    }
                case 24:
                    String str21 = (String) obj;
                    str21.getClass();
                    QuestListUiModelImpl questListUiModelImpl = (QuestListUiModelImpl) ((QuestListUiModel) this.MediaMetadataCompat);
                    questListUiModelImpl.getClass();
                    questListUiModelImpl.RatingCompat.serializer.logEvent("see_all_quests_header_clicked", null);
                    questListUiModelImpl.serializer.read(Uri.parse(str21));
                    return createfromparcel;
                case 25:
                    String str22 = (String) obj;
                    str22.getClass();
                    QuestListUiModelImpl questListUiModelImpl2 = (QuestListUiModelImpl) ((QuestListUiModel) this.MediaMetadataCompat);
                    questListUiModelImpl2.getClass();
                    questListUiModelImpl2.RatingCompat.serializer.logEvent("see_all_quests_footer_clicked", null);
                    questListUiModelImpl2.serializer.read(Uri.parse(str22));
                    return createfromparcel;
                case 26:
                    String str23 = (String) obj;
                    SearchShiftsWithBonusUiModelImpl searchShiftsWithBonusUiModelImpl = (SearchShiftsWithBonusUiModelImpl) ((SearchShiftsWithBonusUiModel) this.MediaMetadataCompat);
                    searchShiftsWithBonusUiModelImpl.MediaSessionCompatResultReceiverWrapper.read.logEvent("see_all_sessions_action_click", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("starting_point_selected", "true"), new onViewAttachedToWindowlambda0("bonus_applied", String.valueOf(searchShiftsWithBonusUiModelImpl.RemoteActionCompatParcelizer()))));
                    getQueryContext getquerycontext = searchShiftsWithBonusUiModelImpl.write;
                    if (str23 == null) {
                        getquerycontext.serializer(getPayloadFromSystemPropertyFilePathReflection.write);
                    } else {
                        getquerycontext.serializer(new getPayloadsFromContentProviderNoPermission(str23));
                    }
                    return createfromparcel;
                case 27:
                    buildResponseData buildresponsedata = (buildResponseData) obj;
                    buildresponsedata.getClass();
                    saveInteger saveinteger = (saveInteger) this.MediaMetadataCompat;
                    getQueryContext getquerycontext2 = saveinteger.MediaSessionCompatToken;
                    ContextScope contextScope = saveinteger.serializer;
                    FormBody.Builder builder = saveinteger.MediaSessionCompatQueueItem;
                    decode decodeVar = (decode) builder.serializer;
                    if (buildresponsedata instanceof isPlayTrackingEnabled) {
                        decodeVar.logEvent("cancel_pause_clicked", null);
                        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new NestRiderStateSummaryUiModelImpl$1(saveinteger, objArr5 == true ? 1 : 0, 1), 3);
                        return createfromparcel;
                    }
                    if (buildresponsedata instanceof readField) {
                        int i19 = write + 77;
                        serializer = i19 % Fields.SpotShadowColor;
                        int i20 = i19 % 2;
                        boolean z2 = ((readField) buildresponsedata).read;
                        decodeVar.logEvent("end_pause_clicked", null);
                        if (z2) {
                            Map mapSingletonMap = Collections.singletonMap("screen_name", "nest");
                            mapSingletonMap.getClass();
                            builder.RemoteActionCompatParcelizer("resume_shift_clicked", mapSingletonMap);
                        }
                        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new NestRiderStateSummaryUiModelImpl$1(saveinteger, objArr4 == true ? 1 : 0, 1), 3);
                        return createfromparcel;
                    }
                    if (buildresponsedata instanceof ResponseData) {
                        Uri uri4 = ((ResponseData) buildresponsedata).serializer;
                        String string = uri4.toString();
                        string.getClass();
                        Map mapSingletonMap2 = Collections.singletonMap("summary_url_action_destination", string);
                        mapSingletonMap2.getClass();
                        builder.RemoteActionCompatParcelizer("summary_url_action_click", mapSingletonMap2);
                        saveinteger.read.RemoteActionCompatParcelizer.write(uri4);
                        return createfromparcel;
                    }
                    if (buildresponsedata instanceof SdkClickHandler) {
                        Uri uri5 = ((SdkClickHandler) buildresponsedata).RemoteActionCompatParcelizer;
                        String string2 = uri5.toString();
                        string2.getClass();
                        Map mapSingletonMap3 = Collections.singletonMap("summary_url_action_destination", string2);
                        mapSingletonMap3.getClass();
                        builder.RemoteActionCompatParcelizer("summary_url_action_click", mapSingletonMap3);
                        getquerycontext2.serializer(new sendNextSdkClickI(uri5));
                        return createfromparcel;
                    }
                    if (buildresponsedata instanceof retrySendingI) {
                        boolean z3 = ((retrySendingI) buildresponsedata).read;
                        if (z3) {
                            BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new NestRiderStateSummaryUiModelImpl$onStopWorkingClick$1(saveinteger, z3, objArr3 == true ? 1 : 0, 1), 3);
                            return createfromparcel;
                        }
                        getquerycontext2.serializer(SdkClickHandler3.write);
                        return createfromparcel;
                    }
                    if (!(buildresponsedata instanceof logErrorMessageI)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    int i21 = write + 71;
                    serializer = i21 % Fields.SpotShadowColor;
                    if (i21 % 2 != 0) {
                        logErrorMessageI logerrormessagei = (logErrorMessageI) buildresponsedata;
                        boolean z4 = logerrormessagei.IconCompatParcelizer;
                        boolean z5 = logerrormessagei.write;
                        throw null;
                    }
                    logErrorMessageI logerrormessagei2 = (logErrorMessageI) buildresponsedata;
                    boolean z6 = logerrormessagei2.IconCompatParcelizer;
                    boolean z7 = logerrormessagei2.write;
                    if (!z6) {
                        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new NestRiderStateSummaryUiModelImpl$onStopWorkingClick$1(saveinteger, z7, objArr2 == true ? 1 : 0, 0), 3);
                        return createfromparcel;
                    }
                    WindowInsetsCompatImpl28 windowInsetsCompatImpl28 = saveinteger.RemoteActionCompatParcelizer;
                    windowInsetsCompatImpl28.RemoteActionCompatParcelizer.serializer.logEvent("stop_working_clicked", null);
                    MutableStateFlow mutableStateFlow7 = windowInsetsCompatImpl28.IconCompatParcelizer;
                    setTransactionSuccessful settransactionsuccessful2 = windowInsetsCompatImpl28.write;
                    mutableStateFlow7.IconCompatParcelizer(new useSideChannelForNotification(new generatePOSTBodyString(settransactionsuccessful2.IconCompatParcelizer(R.string.stop_working_dialog_title), false, settransactionsuccessful2.IconCompatParcelizer(R.string.stop_working_dialog_description), null, null, settransactionsuccessful2.IconCompatParcelizer(R.string.stop_working_dialog_tertiary_action), 76, settransactionsuccessful2.IconCompatParcelizer(R.string.stop_working_dialog_warning_action))));
                    return createfromparcel;
                case 28:
                    getRawReferrer getrawreferrer = (getRawReferrer) obj;
                    getrawreferrer.getClass();
                    SuspensionUiModelImpl suspensionUiModelImpl = (SuspensionUiModelImpl) ((SuspensionUiModel) this.MediaMetadataCompat);
                    suspensionUiModelImpl.getClass();
                    if (getrawreferrer instanceof getPreinstallReferrer) {
                        BuildersKt.RemoteActionCompatParcelizer(suspensionUiModelImpl.serializer, null, null, new PhotoIdUiModelImpl$1$1(suspensionUiModelImpl, ((getPreinstallReferrer) getrawreferrer).RemoteActionCompatParcelizer, objArr6 == true ? 1 : 0, 19), 3);
                        return createfromparcel;
                    }
                    if (!(getrawreferrer instanceof getPreinstallPayloadReadStatus)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    Uri uri6 = ((getPreinstallPayloadReadStatus) getrawreferrer).serializer;
                    getDeeplinkUrl getdeeplinkurl = suspensionUiModelImpl.MediaSessionCompatQueueItem;
                    String string3 = uri6.toString();
                    string3.getClass();
                    ff$$ExternalSyntheticOutline0.m("summary_url_action_destination", string3, getdeeplinkurl.RemoteActionCompatParcelizer, "summary_url_action_click");
                    suspensionUiModelImpl.write.serializer(new getGdprForgetMe(uri6));
                    return createfromparcel;
                default:
                    nowInMillisecondslambda0 nowinmillisecondslambda0 = (nowInMillisecondslambda0) obj;
                    nowinmillisecondslambda0.getClass();
                    SettingsFragment settingsFragment2 = (SettingsFragment) this.MediaMetadataCompat;
                    settingsFragment2.getClass();
                    if (nowinmillisecondslambda0 instanceof isValidTimeZone) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((isValidTimeZone) nowinmillisecondslambda0).IconCompatParcelizer, "signout_dialog"}, getCieXyz.write())).booleanValue()) {
                            ((isContainerdelegate) ((getIndexForKey) ((SettingsViewModel) settingsFragment2.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper()).PlaybackStateCompatCustomAction.serializer)).write("Manual logout from Settings");
                        }
                        ((getTimeFromEpochInSeconds) settingsFragment2.write.MediaSessionCompatResultReceiverWrapper()).RemoteActionCompatParcelizer();
                    }
                    return createfromparcel;
            }
        }
    }

    public SettingsFragment() {
        super(0);
        SettingsFragment$$ExternalSyntheticLambda0 settingsFragment$$ExternalSyntheticLambda0 = new SettingsFragment$$ExternalSyntheticLambda0(this, 0);
        r8lambdaF39FVXzcHG_DLAHx0YomtvrCnlQ r8lambdaf39fvxzchg_dlahx0yomtvrcnlq = new r8lambdaF39FVXzcHG_DLAHx0YomtvrCnlQ(this, 0);
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.NONE;
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA(0, r8lambdaf39fvxzchg_dlahx0yomtvrcnlq));
        this.write = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(getTimeFromEpochInSeconds.class), new r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk(onviewdetachedfromwindowlambda1Serializer, 0), settingsFragment$$ExternalSyntheticLambda0, new r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk(onviewdetachedfromwindowlambda1Serializer, 3));
        SettingsFragment$$ExternalSyntheticLambda0 settingsFragment$$ExternalSyntheticLambda1 = new SettingsFragment$$ExternalSyntheticLambda0(this, 1);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer2 = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA(16, new r8lambdaF39FVXzcHG_DLAHx0YomtvrCnlQ(this, 1)));
        this.MediaDescriptionCompat = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(SettingsViewModel.class), new r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk(onviewdetachedfromwindowlambda1Serializer2, 4), settingsFragment$$ExternalSyntheticLambda1, new r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk(onviewdetachedfromwindowlambda1Serializer2, 5));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new StringsKt__StringsKt$$ExternalSyntheticLambda1(18, this), true, -744061090)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = ParcelableVolumeInfo + 113;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Object next;
        Object next2;
        Object next3;
        Boolean boolValueOf;
        int i = 2 % 2;
        view.getClass();
        super.onViewCreated(view, bundle);
        ComponentRegistry$Builder componentRegistry$Builder = this.MediaDescriptionCompat;
        SettingsViewModel settingsViewModel = (SettingsViewModel) componentRegistry$Builder.MediaSessionCompatResultReceiverWrapper();
        StateFlow stateFlow = settingsViewModel.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        List list = ((r8lambdaFEnLU5alJx2ClfZRg4tE2QEPKfs) stateFlow.read()).MediaDescriptionCompat;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            str = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c) next).RemoteActionCompatParcelizer != r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U.BIOMETRIC_AUTHENTICATION);
        r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c = (r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c) next;
        List list2 = ((r8lambdaFEnLU5alJx2ClfZRg4tE2QEPKfs) stateFlow.read()).MediaDescriptionCompat;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            int i2 = ParcelableVolumeInfo + 5;
            PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                boolean z = it2.next() instanceof r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c;
                str.hashCode();
                throw null;
            }
            Object next4 = it2.next();
            if (next4 instanceof r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c) {
                arrayList2.add(next4);
            }
        }
        Iterator it3 = arrayList2.iterator();
        int i3 = ParcelableVolumeInfo + 23;
        PlaybackStateCompatCustomAction = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        do {
            if (!it3.hasNext()) {
                int i5 = PlaybackStateCompatCustomAction + 23;
                ParcelableVolumeInfo = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    int i6 = 3 % 4;
                }
                next2 = null;
                break;
            }
            next2 = it3.next();
        } while (((r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c) next2).RemoteActionCompatParcelizer != r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U.SAFETY);
        r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c2 = (r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c) next2;
        List list3 = ((r8lambdaFEnLU5alJx2ClfZRg4tE2QEPKfs) stateFlow.read()).MediaDescriptionCompat;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list3) {
            if (obj2 instanceof r8lambda6juoqTAVmeOwP9B2d0JUPPbC0hI) {
                arrayList3.add(obj2);
            }
        }
        Iterator it4 = arrayList3.iterator();
        do {
            if (!it4.hasNext()) {
                next3 = null;
                break;
            }
            int i7 = ParcelableVolumeInfo + 111;
            PlaybackStateCompatCustomAction = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                r8lambda5weVaLnJrZw3JZ5gurH6kjpdo r8lambda5wevalnjrzw3jz5gurh6kjpdo = ((r8lambda6juoqTAVmeOwP9B2d0JUPPbC0hI) it4.next()).serializer;
                r8lambda5weVaLnJrZw3JZ5gurH6kjpdo r8lambda5wevalnjrzw3jz5gurh6kjpdo2 = r8lambda5weVaLnJrZw3JZ5gurH6kjpdo.CHAT_LANGUAGE;
                str.hashCode();
                throw null;
            }
            next3 = it4.next();
        } while (((r8lambda6juoqTAVmeOwP9B2d0JUPPbC0hI) next3).serializer != r8lambda5weVaLnJrZw3JZ5gurH6kjpdo.CHAT_LANGUAGE);
        r8lambda6juoqTAVmeOwP9B2d0JUPPbC0hI r8lambda6juoqtavmeowp9b2d0juppbc0hi = (r8lambda6juoqTAVmeOwP9B2d0JUPPbC0hI) next3;
        subscribeToBannersDismissedEventandroid_sdk_base_release subscribetobannersdismissedeventandroid_sdk_base_release = settingsViewModel.ComponentActivity;
        Boolean boolValueOf2 = r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c != null ? Boolean.valueOf(r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c.read) : null;
        if (r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c2 != null) {
            int i8 = ParcelableVolumeInfo + 121;
            PlaybackStateCompatCustomAction = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                Boolean.valueOf(r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c2.read);
                str.hashCode();
                throw null;
            }
            boolValueOf = Boolean.valueOf(r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c2.read);
            int i9 = PlaybackStateCompatCustomAction + 101;
            ParcelableVolumeInfo = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
        } else {
            boolValueOf = null;
        }
        str = r8lambda6juoqtavmeowp9b2d0juppbc0hi != null ? r8lambda6juoqtavmeowp9b2d0juppbc0hi.write : null;
        decode decodeVar = subscribetobannersdismissedeventandroid_sdk_base_release.read;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("screenName", "SettingsScreen");
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = new onViewAttachedToWindowlambda0("biometric_current_selection", String.valueOf(boolValueOf2));
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda2 = new onViewAttachedToWindowlambda0("safety_tracking_current_selection", String.valueOf(boolValueOf));
        if (str == null) {
            str = "null";
        }
        int i11 = 0;
        decodeVar.logEvent("screen_opened", onMove.RemoteActionCompatParcelizer(onviewattachedtowindowlambda0, onviewattachedtowindowlambda1, onviewattachedtowindowlambda2, new onViewAttachedToWindowlambda0("chat_language_current_selection", str)));
        subscribetobannersdismissedeventandroid_sdk_base_release.IconCompatParcelizer.getClass();
        SharedResourcePool sharedResourcePool = ((SettingsViewModel) componentRegistry$Builder.MediaSessionCompatResultReceiverWrapper()).ParcelableVolumeInfo;
        accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        int i12 = 1;
        sharedResourcePool.RemoteActionCompatParcelizer(viewLifecycleOwner, new AnonymousClass1(i12, this, SettingsFragment.class, "handlePendingAction", "handlePendingAction(Lcom/roadrunner/settings/SettingsAction;)V", i11, 0));
        SharedResourcePool sharedResourcePool2 = ((getTimeFromEpochInSeconds) this.write.MediaSessionCompatResultReceiverWrapper()).IconCompatParcelizer;
        accessisRenderNodeCompatiblecp viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        sharedResourcePool2.RemoteActionCompatParcelizer(viewLifecycleOwner2, new AnonymousClass1(i12, this, SettingsFragment.class, "handleMessageDialogAction", "handleMessageDialogAction(Lcom/ui/common/widget/message_dialog/MessageDialogViewModel$ResultAction;)V", i11, 29));
    }
}
