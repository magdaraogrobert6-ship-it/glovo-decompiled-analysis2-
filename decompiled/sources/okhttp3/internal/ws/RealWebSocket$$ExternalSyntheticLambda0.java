package okhttp3.internal.ws;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.state.realtime.RealtimeStatusUpdateManagerImpl;
import com.roadrunner.settings.subscreens.appearance.AppearanceFragment;
import com.roadrunner.settings.subscreens.navigation.NavigationSettingsFragment;
import com.roadrunner.sidemenu.presentation.SideMenuFragment;
import com.roadrunner.startworking.api.navigation.StartWorkingNavAction;
import com.roadrunner.startworking.equipment.navigation.EquipmentBottomSheetParams;
import com.roadrunner.startworking.oneclick.OneClickStartWorkingViewModel;
import com.roadrunner.vendor.review.data.database.VendorReviewDatabase_Impl;
import com.roadrunner.web.presentation.authWebView.AuthWebFragment;
import com.roadrunner.web.presentation.hiring.RiderHiringWebViewFragment;
import com.roadrunner.web.presentation.simpleWebView.SimpleWebViewFragment;
import com.sentiance.core.model.events.C$b;
import io.reactivex.CompletableEmitter;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.math.MathKt;
import o.InAppMessageHtmlBaseViewCompanion;
import o.InAppMessageSlideupView;
import o.ViewUtilsExternalSyntheticLambda1;
import o.accessgetStrictcp;
import o.clipCanvasToPath;
import o.createFromParcel;
import o.createHorizontalAnimation;
import o.generatePOSTBodyString;
import o.getPageSize;
import o.isUnreadIndicatorEnabled;
import o.lambda318;
import o.logFeatureFlagImpressionlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaRdO_uN7XDjHQOVIqToN9xCXIqPA;
import o.r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.removeNodeAtDepth;
import o.requestContentCardsRefreshFromCache;
import o.setApiKeyPresentandroid_sdk_base_release;
import o.setPushDeliveryManagerandroid_sdk_base_release;
import o.setTransactionSuccessful;
import o.subscribeToNoMatchingTriggerForEvent;
import o.transferSessionPackageI;
import o.updateAdidI;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RealWebSocket$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object write;

    public /* synthetic */ RealWebSocket$$ExternalSyntheticLambda0(int i, Object obj) {
        this.RemoteActionCompatParcelizer = i;
        this.write = obj;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00e2  */
    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        boolean z;
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj = this.write;
        Object obj2 = null;
        switch (i2) {
            case 0:
                InAppMessageHtmlBaseViewCompanion.IconCompatParcelizer((isUnreadIndicatorEnabled) obj);
                return createfromparcel;
            case 1:
                ((CompletableEmitter) obj).IconCompatParcelizer();
                return createfromparcel;
            case 2:
                getPageSize getpagesize = (getPageSize) ((RealtimeStatusUpdateManagerImpl) obj).read.write();
                int i3 = IconCompatParcelizer + 3;
                serializer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return getpagesize;
            case 3:
                return Integer.valueOf(MathKt.write(((Number) ((Animatable) obj).write()).floatValue()));
            case 4:
                setTransactionSuccessful settransactionsuccessful = ((r8lambdaRdO_uN7XDjHQOVIqToN9xCXIqPA) obj).serializer;
                return new generatePOSTBodyString(settransactionsuccessful.IconCompatParcelizer(R.string.settings_promotions_dialog_turn_off_title), false, settransactionsuccessful.IconCompatParcelizer(R.string.settings_promotions_dialog_turn_off_description), settransactionsuccessful.IconCompatParcelizer(R.string.settings_promotions_dialog_turn_off_okay), null, settransactionsuccessful.IconCompatParcelizer(R.string.settings_promotions_dialog_turn_off_cancel), 40, null);
            case 5:
                r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = ((AppearanceFragment) obj).getOnBackPressedDispatcher;
                if (r8lambdaudhhxliolpu0hpccqh6voskpny != null) {
                    return r8lambdaudhhxliolpu0hpccqh6voskpny;
                }
                removeNodeAtDepth.serializer("viewModelFactory");
                throw null;
            case 6:
                r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny2 = ((NavigationSettingsFragment) obj).getSavedStateRegistry;
                if (r8lambdaudhhxliolpu0hpccqh6voskpny2 == null) {
                    removeNodeAtDepth.serializer("viewModelFactory");
                    throw null;
                }
                int i5 = serializer + 77;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return r8lambdaudhhxliolpu0hpccqh6voskpny2;
            case 7:
                ((r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94) obj).RemoteActionCompatParcelizer(accessgetStrictcp.IN_APP);
                return createfromparcel;
            case 8:
                r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny3 = ((SideMenuFragment) obj).read;
                if (r8lambdaudhhxliolpu0hpccqh6voskpny3 == null) {
                    removeNodeAtDepth.serializer("viewModelProviderFactory");
                    throw null;
                }
                int i7 = serializer + 47;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return r8lambdaudhhxliolpu0hpccqh6voskpny3;
            case 9:
                Object objWrite = ((lambda318) obj).MediaBrowserCompatMediaItem.write("equipment_bottom_sheet_params_key");
                if (objWrite != null) {
                    return (EquipmentBottomSheetParams) objWrite;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Equipment bottom sheet params can not be null");
                return null;
            case 10:
                Object objWrite2 = ((OneClickStartWorkingViewModel) obj).r8lambda54BeH8ZsBru0CXI2CCSP2syNys.write("one_click_start_working_nav_action");
                if (objWrite2 == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Nav action for start working can not be null");
                    return null;
                }
                int i9 = serializer + 35;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return (StartWorkingNavAction) objWrite2;
            case 11:
                logFeatureFlagImpressionlambda1 logfeatureflagimpressionlambda1 = (logFeatureFlagImpressionlambda1) obj;
                if (!logfeatureflagimpressionlambda1.read.RemoteActionCompatParcelizer.isEmpty()) {
                    int i11 = IconCompatParcelizer + 113;
                    serializer = i11 % Fields.SpotShadowColor;
                    if (i11 % 2 != 0) {
                        boolean z2 = logfeatureflagimpressionlambda1.RemoteActionCompatParcelizer;
                        throw null;
                    }
                    z = logfeatureflagimpressionlambda1.RemoteActionCompatParcelizer;
                }
                return Boolean.valueOf(z);
            case 12:
                return ((setPushDeliveryManagerandroid_sdk_base_release) ((setApiKeyPresentandroid_sdk_base_release) ((C$b) obj).serializer)).read(requestContentCardsRefreshFromCache.ID_VERIFICATION_IN_START_WORKING);
            case 13:
                return Boolean.valueOf(((FirebaseRemoteConfigImpl) ((transferSessionPackageI) obj)).IconCompatParcelizer(updateAdidI.IS_LAZY_SOUND_PLAYER_ENABLED));
            case 14:
                return VendorReviewDatabase_Impl.RemoteActionCompatParcelizer((VendorReviewDatabase_Impl) obj);
            case 15:
                return Boolean.valueOf(((FirebaseRemoteConfigImpl) ((subscribeToNoMatchingTriggerForEvent) obj).serializer).IconCompatParcelizer(updateAdidI.SHOULD_ALLOW_SEAMLESS_TOKEN_FIREBASE_LOGGING));
            case 16:
                r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny4 = ((AuthWebFragment) obj).removeOnPictureInPictureUiStateChangedListener;
                if (r8lambdaudhhxliolpu0hpccqh6voskpny4 != null) {
                    return r8lambdaudhhxliolpu0hpccqh6voskpny4;
                }
                removeNodeAtDepth.serializer("authWebViewModelProviderFactory");
                throw null;
            case 17:
                r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny5 = ((RiderHiringWebViewFragment) obj).removeOnMultiWindowModeChangedListener;
                if (r8lambdaudhhxliolpu0hpccqh6voskpny5 == null) {
                    removeNodeAtDepth.serializer("riderHiringViewModelProviderFactory");
                    throw null;
                }
                int i12 = serializer + 103;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                return r8lambdaudhhxliolpu0hpccqh6voskpny5;
            case 18:
                r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny6 = ((SimpleWebViewFragment) obj).removeOnPictureInPictureUiStateChangedListener;
                if (r8lambdaudhhxliolpu0hpccqh6voskpny6 != null) {
                    return r8lambdaudhhxliolpu0hpccqh6voskpny6;
                }
                removeNodeAtDepth.serializer("simpleWebViewViewModelProviderFactory");
                throw null;
            case 19:
                Disposable disposable = (Disposable) ((AtomicReference) obj).getAndSet(EmptyDisposable.INSTANCE);
                if (disposable != null) {
                    int i14 = IconCompatParcelizer + 3;
                    serializer = i14 % Fields.SpotShadowColor;
                    if (i14 % 2 != 0) {
                        disposable.dispose();
                        obj2.hashCode();
                        throw null;
                    }
                    disposable.dispose();
                }
                return createfromparcel;
            case 20:
                createHorizontalAnimation createhorizontalanimation = (createHorizontalAnimation) obj;
                createhorizontalanimation.getClass();
                try {
                    createhorizontalanimation.writer.read(2, 0, false);
                    int i15 = IconCompatParcelizer + 87;
                    serializer = i15 % Fields.SpotShadowColor;
                    if (i15 % 2 != 0) {
                        int i16 = 5 / 2;
                    }
                } catch (IOException e) {
                    InAppMessageSlideupView inAppMessageSlideupView = InAppMessageSlideupView.PROTOCOL_ERROR;
                    createhorizontalanimation.RemoteActionCompatParcelizer(inAppMessageSlideupView, inAppMessageSlideupView, e);
                }
                return createfromparcel;
            default:
                clipCanvasToPath clipcanvastopath = ((ViewUtilsExternalSyntheticLambda1) obj).IconCompatParcelizer;
                clipcanvastopath.getClass();
                clipcanvastopath.write();
                return createfromparcel;
        }
    }
}
