package com.roadrunner.freelancing.data;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.compose.ui.graphics.Fields;
import bo.app.n$$ExternalSyntheticLambda3;
import com.data.util.exception.FoodoraNullException;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.foodora.courier.legacy.ui.preferences.SettingsActivity;
import com.google.mlkit.vision.face.internal.zzh;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.ontheway.crowdsourcing.sharing.presentation.PhotoSharedSuccessDialogFragment;
import com.roadrunner.delivery.ontheway.entrancepicture.details.presentation.EntrancePictureFragment;
import com.roadrunner.delivery.ontheway.tripplanner.actions.api.navigator.ActionsParams;
import com.roadrunner.delivery.pickupdropoff.confirmbutton.ConfirmButtonV1UiModel;
import com.roadrunner.delivery.pickupdropoff.confirmbutton.presentation.ConfirmButtonV1UiModelImpl;
import com.roadrunner.delivery.pickupdropoff.confirmbutton.presentation.DoubleConfirmationFragment;
import com.roadrunner.delivery.pickupdropoff.details.contactrider.presentation.ContactRiderActionsFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.reason.AmountChangingReasonDialogFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel$initState$1;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.navigation.CodeScanTaskArgs;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.CodeScanViewModel;
import com.roadrunner.delivery.pickupdropoff.tasks.presentation.signature.CustomerSignatureFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.navigation.PinScreenArgs;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.navigation.QrScanTaskArgs;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.pin.PinScreenViewModel;
import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.InAppCameraWithTagsFragment;
import com.roadrunner.delivery.stacked.delivery.details.ui.StackedDeliveryDetailsFragment;
import com.roadrunner.designsystem.mode.discovery.DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1;
import com.roadrunner.diagnostics.presentation.view.DiagnosticsUiStateMapper;
import com.roadrunner.face.verification.presentation.identitypopup.IdentityPopupViewModel;
import com.roadrunner.home.expandedbubblelayer.presentation.ExpandedBubbleUiModelImpl;
import com.roadrunner.instant.shifts.presentation.confirmation.BookShiftConfirmationContainerFragment;
import com.roadrunner.liveness.review.presentation.ReviewViewModel;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.realtime.data.ReconnectScheduler$schedule$1;
import java.util.concurrent.CancellationException;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.coroutines.BuildersKt;
import o.AndroidUriHandler;
import o.BrazeLogger;
import o.CalculateMatrixToWindow;
import o.CustomBulletSpan;
import o.ShortNewsContentCardView;
import o.VersionedParcelParcelException;
import o.calculateMatrixToWindowEL8BTi8;
import o.cancelAll;
import o.createFromParcel;
import o.createOpenHelper;
import o.getMaxHeight;
import o.getQueryContext;
import o.getReferencedIds;
import o.getSharedValues;
import o.lerp81ZRxRo;
import o.onDependencyAdded;
import o.onOpen;
import o.onPostMigrate;
import o.preConcattUYjHk;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.removeNodeAtDepth;
import o.setDelegateForTestingui_text;
import o.setFitsSystemWindows;
import o.setNextTransition;
import o.setStatusBarBackgroundResource;
import o.setTransactionSuccessful;
import o.toBitmapConfig1JJdX4A;
import okhttp3.FormBody;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class GoAndStartDataStoreFactory$$ExternalSyntheticLambda1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ GoAndStartDataStoreFactory$$ExternalSyntheticLambda1(setDelegateForTestingui_text setdelegatefortestingui_text, Activity activity) {
        this.read = 3;
        this.serializer = activity;
    }

    public /* synthetic */ GoAndStartDataStoreFactory$$ExternalSyntheticLambda1(int i, Object obj) {
        this.read = i;
        this.serializer = obj;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() throws FoodoraNullException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 57;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj = this.serializer;
        int i5 = 1;
        ShortNewsContentCardView shortNewsContentCardView = null;
        switch (i4) {
            case 0:
                return LazyKt__LazyJVMKt.read(((cancelAll) obj).serializer, "go_and_start_preferences");
            case 1:
                ((PhotoSharedSuccessDialogFragment) obj).RemoteActionCompatParcelizer();
                return createfromparcel;
            case 2:
                r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = ((EntrancePictureFragment) obj).getNavigationEventDispatcher;
                if (r8lambdaudhhxliolpu0hpccqh6voskpny != null) {
                    return r8lambdaudhhxliolpu0hpccqh6voskpny;
                }
                removeNodeAtDepth.serializer("viewModelFactory");
                throw null;
            case 3:
                Activity activity = (Activity) obj;
                Intent intent = new Intent(activity, (Class<?>) SettingsActivity.class);
                intent.putExtra("OPEN_SUB_SETTINGS", "NAVIGATION_SETTINGS");
                activity.startActivity(intent);
                return createfromparcel;
            case 4:
                Object objWrite = ((CustomBulletSpan) obj).MediaSessionCompatQueueItem.write("ACTIONS_PARAMS");
                if (objWrite == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Actions can't be opened without params");
                    return null;
                }
                int i6 = RemoteActionCompatParcelizer + 57;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return (ActionsParams) objWrite;
            case 5:
                return ((setTransactionSuccessful) obj).IconCompatParcelizer(R.string.turn_by_turn_recenter_button_title);
            case 6:
                ((ConfirmButtonV1UiModelImpl) ((ConfirmButtonV1UiModel) obj)).RemoteActionCompatParcelizer();
                return createfromparcel;
            case 7:
                r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny2 = ((DoubleConfirmationFragment) obj).getSavedStateRegistry;
                if (r8lambdaudhhxliolpu0hpccqh6voskpny2 != null) {
                    return r8lambdaudhhxliolpu0hpccqh6voskpny2;
                }
                removeNodeAtDepth.serializer("viewModelFactory");
                throw null;
            case 8:
                r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny3 = ((ContactRiderActionsFragment) obj).onActivityResult;
                if (r8lambdaudhhxliolpu0hpccqh6voskpny3 != null) {
                    return r8lambdaudhhxliolpu0hpccqh6voskpny3;
                }
                removeNodeAtDepth.serializer("viewModelFactory");
                throw null;
            case 9:
                return Integer.valueOf(((r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ) obj).size());
            case 10:
                r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny4 = ((AmountChangingReasonDialogFragment) obj).getOnBackPressedDispatcher;
                if (r8lambdaudhhxliolpu0hpccqh6voskpny4 == null) {
                    removeNodeAtDepth.serializer("viewModelFactory");
                    throw null;
                }
                int i8 = RemoteActionCompatParcelizer + 47;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return r8lambdaudhhxliolpu0hpccqh6voskpny4;
            case 11:
                CustomerUnavailableViewModel customerUnavailableViewModelSerializer = ((CustomerUnavailableFragment) obj).serializer();
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(customerUnavailableViewModelSerializer), null, null, new CustomerUnavailableViewModel$initState$1(customerUnavailableViewModelSerializer, shortNewsContentCardView, i5), 3);
                return createfromparcel;
            case 12:
                return (CodeScanTaskArgs) ((CodeScanViewModel) obj).MediaSessionCompatQueueItem.write("args_code_scanner");
            case 13:
                ((CustomerSignatureFragment) obj).read(false, false);
                return createfromparcel;
            case 14:
                return (PinScreenArgs) ((PinScreenViewModel) obj).RatingCompat.write("args_pin_screen");
            case 15:
                return (QrScanTaskArgs) ((lerp81ZRxRo) obj).MediaBrowserCompatMediaItem.write("args_qr_scanner");
            case 16:
                r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny5 = ((InAppCameraWithTagsFragment) obj).getOnBackPressedDispatcher;
                if (r8lambdaudhhxliolpu0hpccqh6voskpny5 != null) {
                    return r8lambdaudhhxliolpu0hpccqh6voskpny5;
                }
                removeNodeAtDepth.serializer("viewModelFactory");
                throw null;
            case 17:
                r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny6 = ((StackedDeliveryDetailsFragment) obj).onConfigurationChanged;
                if (r8lambdaudhhxliolpu0hpccqh6voskpny6 == null) {
                    removeNodeAtDepth.serializer("viewModelFactory");
                    throw null;
                }
                int i10 = RemoteActionCompatParcelizer + 37;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                return r8lambdaudhhxliolpu0hpccqh6voskpny6;
            case 18:
                getReferencedIds getreferencedids = (getReferencedIds) obj;
                OtpLogger otpLogger = getreferencedids.MediaSessionCompatQueueItem;
                otpLogger.IconCompatParcelizer.logEvent("test_notif_success", null);
                otpLogger.read(true);
                Timber.RemoteActionCompatParcelizer.write(new Throwable("Test push received"));
                getreferencedids.ParcelableVolumeInfo().read();
                getreferencedids.RemoteActionCompatParcelizer();
                BrazeLogger brazeLogger = getreferencedids.IconCompatParcelizer;
                getMaxHeight getmaxheight = (getMaxHeight) brazeLogger.write();
                DiagnosticsUiStateMapper diagnosticsUiStateMapper = getreferencedids.MediaDescriptionCompat;
                diagnosticsUiStateMapper.getClass();
                brazeLogger.IconCompatParcelizer.RemoteActionCompatParcelizer(diagnosticsUiStateMapper.serializer(getMaxHeight.read(getmaxheight, null, null, null, null, new getSharedValues(diagnosticsUiStateMapper.IconCompatParcelizer.IconCompatParcelizer(R.string.notifications_diagnostics_test_notification_item)), 15)));
                return createfromparcel;
            case 19:
                ((n$$ExternalSyntheticLambda3) obj).invoke();
                return createfromparcel;
            case 20:
                IdentityPopupViewModel identityPopupViewModel = (IdentityPopupViewModel) obj;
                identityPopupViewModel.IconCompatParcelizer.IconCompatParcelizer.IconCompatParcelizer("Selfie Creation New", null);
                identityPopupViewModel.write.serializer(setFitsSystemWindows.write);
                return createfromparcel;
            case 21:
                String str = ((setStatusBarBackgroundResource) obj).IconCompatParcelizer;
                return Boolean.valueOf(!(str == null || str.length() == 0));
            case 22:
                ((DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1) obj).invoke();
                return createfromparcel;
            case 23:
                ((DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1) obj).invoke();
                return createfromparcel;
            case 24:
                setNextTransition setnexttransition = ((ExpandedBubbleUiModelImpl) obj).write;
                r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = setnexttransition.RemoteActionCompatParcelizer;
                if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                }
                setnexttransition.write.serializer.IconCompatParcelizer.write(null);
                return createfromparcel;
            case 25:
                r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny7 = ((BookShiftConfirmationContainerFragment) obj).getSavedStateRegistry;
                if (r8lambdaudhhxliolpu0hpccqh6voskpny7 != null) {
                    return r8lambdaudhhxliolpu0hpccqh6voskpny7;
                }
                removeNodeAtDepth.serializer("viewModelFactory");
                throw null;
            case 26:
                SharedPreferences sharedPreferences = ((createOpenHelper) obj).RemoteActionCompatParcelizer;
                String string = sharedPreferences.getString("CONFIG_SHARED_PREFS_LAST_LOGIN_EMAIL", null);
                if (string == null) {
                    throw new FoodoraNullException();
                }
                int i12 = IconCompatParcelizer + 89;
                RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                try {
                    Object objFromJson = onDependencyAdded.IconCompatParcelizer().fromJson(string, (Class<Object>) String.class);
                    objFromJson.getClass();
                    return objFromJson;
                } catch (Exception e) {
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.remove("CONFIG_SHARED_PREFS_LAST_LOGIN_EMAIL");
                    editorEdit.apply();
                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Failed to read string from storage: key: CONFIG_SHARED_PREFS_LAST_LOGIN_EMAIL", new Object[0]);
                    throw new FoodoraNullException();
                }
            case 27:
                return new onPostMigrate(new getQueryContext(), (setTransactionSuccessful) ((onOpen) obj).IconCompatParcelizer.IconCompatParcelizer.write());
            case 28:
                CalculateMatrixToWindow calculateMatrixToWindow = (CalculateMatrixToWindow) ((FormBody.Builder) obj).serializer;
                preConcattUYjHk preconcattuyjhk = (preConcattUYjHk) AndroidUriHandler.serializer().IconCompatParcelizer(preConcattUYjHk.class);
                preconcattuyjhk.getClass();
                return new calculateMatrixToWindowEL8BTi8((zzh) preconcattuyjhk.IconCompatParcelizer.serializer(calculateMatrixToWindow), preconcattuyjhk.read, calculateMatrixToWindow);
            default:
                ReviewViewModel reviewViewModel = (ReviewViewModel) obj;
                reviewViewModel.RemoteActionCompatParcelizer.serializer(new VersionedParcelParcelException());
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(reviewViewModel), null, null, new ReconnectScheduler$schedule$1(reviewViewModel, shortNewsContentCardView, 12), 3);
                return createfromparcel;
        }
    }
}
