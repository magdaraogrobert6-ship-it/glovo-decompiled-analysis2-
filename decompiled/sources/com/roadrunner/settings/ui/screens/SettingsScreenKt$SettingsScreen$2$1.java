package com.roadrunner.settings.ui.screens;

import android.os.Bundle;
import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.repository.CachedDeliveryRepository;
import com.roadrunner.home.nest.divider.DividerUiModelImpl$1;
import com.roadrunner.nafath.NafathModalUiModelImpl$1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.state.ondemand.api.outsideactivearea.OnDemandOutsideActiveAreaUiModel;
import com.roadrunner.rider.state.ondemand.api.presentation.OnDemandUiModel;
import com.roadrunner.rider.state.ondemand.presentation.OnDemandUiModelImpl;
import com.roadrunner.rider.state.ondemand.resumepause.OnDemandResumePauseFloatingUiModelImpl$onPauseOrder$1;
import com.roadrunner.rider.state.refresh.presentation.StateRefreshFloatingItemUiModelImpl;
import com.roadrunner.rider.state.summary.nest.NestRiderStateSummaryUiModelImpl$1;
import com.roadrunner.rider.state.suspension.api.SuspensionUiModel;
import com.roadrunner.rider.state.suspension.presentation.SuspensionUiModelImpl;
import com.roadrunner.settings.SettingsViewModel;
import com.roadrunner.settings.subscreens.appearance.AppearanceFragment;
import com.roadrunner.settings.subscreens.appearance.AppearanceViewModel;
import com.roadrunner.startworking.equipment.EquipmentBottomSheet;
import com.roadrunner.startworking.oneclick.OneClickStartWorkingFragment;
import com.roadrunner.startworking.oneclick.OneClickStartWorkingViewModel;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda2;
import io.grpc.internal.SharedResourcePool;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o._get_cachedContentCardsUpdatedEvent_lambda0;
import o._get_deviceId_lambda0;
import o.addI;
import o.buildInstallReferrerSdkClickPackage;
import o.createFromParcel;
import o.defaultViewModelProviderFactory_delegatelambda0;
import o.generateSendingParametersI;
import o.getAdvertisingInfoObject;
import o.getContentViewGroupParentLayout;
import o.getOsName;
import o.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET;
import o.hideCurrentlyDisplayingInAppMessage;
import o.invokeMethod;
import o.isSensitiveData;
import o.logBannerClicklambda1;
import o.logFeatureFlagImpressionlambda1;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda7vklbvSxqffTXHr8OM5RDzMr2g;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambda9W7rM9h0rXoJVt7dma8S2cDdfX8;
import o.r8lambdaEJU_tl__ceNZdZ2EYEHdqtTMCZc;
import o.r8lambdaEQ0pS95J6zwbXPQOcYCtM1qJZk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaSl5Gsj0TJzfof28oj8MYkxu6Io;
import o.r8lambdaU6FEEC8tmUhSdq6Ym_Pl3g2FyLo;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94;
import o.r8lambdaXhAtNt2NGzcpinZ4H9j3MH3NX1A;
import o.r8lambdaXx663dmZF6jhFpjZqVMZK8YZwns;
import o.r8lambdafOIPryYKxSg19oxLSCcW3X8q4Qk;
import o.r8lambdag0m0JVUE1KB8aI8kjJMGJSHe1o8;
import o.readPackageQueueI;
import o.saveInteger;
import o.setOnAttributionReadListener;
import o.setOnSessionTrackingFailedListener;
import o.setOnSessionTrackingSucceededListener;
import o.toBitmapConfig1JJdX4A;
import o.updateAdidI;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class SettingsScreenKt$SettingsScreen$2$1 extends FunctionReferenceImpl implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SettingsScreenKt$SettingsScreen$2$1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.RemoteActionCompatParcelizer = i3;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x014f  */
    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        getAdvertisingInfoObject getadvertisinginfoobject;
        defaultViewModelProviderFactory_delegatelambda0 onBackPressedDispatcher;
        Object obj;
        boolean z;
        String str;
        String str2;
        String str3;
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        Object obj2;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.RemoteActionCompatParcelizer;
        r8lambdaXhAtNt2NGzcpinZ4H9j3MH3NX1A r8lambdaxhatnt2ngzcpinz4h9j3mh3nx1a = r8lambdaXhAtNt2NGzcpinZ4H9j3MH3NX1A.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = null;
        switch (i3) {
            case 0:
                ((SettingsViewModel) this.MediaMetadataCompat).ParcelableVolumeInfo.serializer(r8lambda9W7rM9h0rXoJVt7dma8S2cDdfX8.serializer);
                return createfromparcel;
            case 1:
                ((OnDemandOutsideActiveAreaUiModel) this.MediaMetadataCompat).getClass();
                return createfromparcel;
            case 2:
                OnDemandUiModelImpl onDemandUiModelImpl = (OnDemandUiModelImpl) ((OnDemandUiModel) this.MediaMetadataCompat);
                onDemandUiModelImpl.MediaSessionCompatQueueItem.read();
                onDemandUiModelImpl.write.serializer(new setOnAttributionReadListener());
                return createfromparcel;
            case 3:
                OnDemandUiModelImpl onDemandUiModelImpl2 = (OnDemandUiModelImpl) ((OnDemandUiModel) this.MediaMetadataCompat);
                BuildersKt.RemoteActionCompatParcelizer(onDemandUiModelImpl2.read, null, null, new NafathModalUiModelImpl$1(onDemandUiModelImpl2, null, 22), 3);
                return createfromparcel;
            case 4:
                getOsName getosname = (getOsName) this.MediaMetadataCompat;
                BuildersKt.RemoteActionCompatParcelizer(getosname.IconCompatParcelizer, null, null, new OnDemandResumePauseFloatingUiModelImpl$onPauseOrder$1(getosname, null, 0), 3);
                return createfromparcel;
            case 5:
                getOsName getosname2 = (getOsName) this.MediaMetadataCompat;
                BuildersKt.RemoteActionCompatParcelizer(getosname2.IconCompatParcelizer, null, null, new OnDemandResumePauseFloatingUiModelImpl$onPauseOrder$1(getosname2, null, 1), 3);
                return createfromparcel;
            case 6:
                ((buildInstallReferrerSdkClickPackage) this.MediaMetadataCompat).MediaMetadataCompat.serializer.logEvent("quest_progress_banner_shown", null);
                return createfromparcel;
            case 7:
                ((buildInstallReferrerSdkClickPackage) this.MediaMetadataCompat).MediaMetadataCompat.serializer.logEvent("quest_upcoming_banner_shown", null);
                return createfromparcel;
            case 8:
                StateRefreshFloatingItemUiModelImpl stateRefreshFloatingItemUiModelImpl = (StateRefreshFloatingItemUiModelImpl) ((generateSendingParametersI) this.MediaMetadataCompat);
                setOnSessionTrackingSucceededListener setonsessiontrackingsucceededlistener = stateRefreshFloatingItemUiModelImpl.RemoteActionCompatParcelizer;
                int i4 = readPackageQueueI.RemoteActionCompatParcelizer[setonsessiontrackingsucceededlistener.ordinal()];
                if (i4 == 1) {
                    stateRefreshFloatingItemUiModelImpl.MediaBrowserCompatMediaItem.serializer(setOnSessionTrackingFailedListener.PULL_TO_REFRESH);
                } else {
                    if (i4 != 2) {
                        int i5 = write;
                        int i6 = i5 + 107;
                        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                        if (i6 % 2 == 0 ? i4 == 3 : i4 == 4) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Refresh button is clicked when it is supposed to be hidden");
                        } else {
                            int i7 = i5 + 59;
                            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                            if (i7 % 2 != 0) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                int i8 = 97 / 0;
                            } else {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            }
                        }
                        return null;
                    }
                    stateRefreshFloatingItemUiModelImpl.IconCompatParcelizer.IconCompatParcelizer(Boolean.TRUE);
                    BuildersKt.RemoteActionCompatParcelizer(stateRefreshFloatingItemUiModelImpl.serializer, null, null, new NafathModalUiModelImpl$1(stateRefreshFloatingItemUiModelImpl, null, 28), 3);
                }
                addI addi = stateRefreshFloatingItemUiModelImpl.RatingCompat;
                boolean z2 = setonsessiontrackingsucceededlistener == setOnSessionTrackingSucceededListener.PLACEBO;
                getContentViewGroupParentLayout getcontentviewgroupparentlayout = addi.IconCompatParcelizer;
                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new DividerUiModelImpl$1.AnonymousClass1(addi, z2, shortNewsContentCardView, 9), 2);
                return createfromparcel;
            case 9:
                invokeMethod invokemethod = (invokeMethod) this.MediaMetadataCompat;
                Object obj3 = invokemethod.RatingCompat.read();
                if (obj3 instanceof getAdvertisingInfoObject) {
                    int i9 = write + 5;
                    IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    getadvertisinginfoobject = (getAdvertisingInfoObject) obj3;
                } else {
                    getadvertisinginfoobject = null;
                }
                if (getadvertisinginfoobject != null) {
                    BuildersKt.RemoteActionCompatParcelizer(invokemethod.IconCompatParcelizer, null, null, new RxConvertKt$asObservable$1$job$1(getadvertisinginfoobject, invokemethod, shortNewsContentCardView, i), 3);
                }
                return createfromparcel;
            case 10:
                saveInteger saveinteger = (saveInteger) this.MediaMetadataCompat;
                BuildersKt.RemoteActionCompatParcelizer(saveinteger.serializer, null, null, new NestRiderStateSummaryUiModelImpl$1(saveinteger, shortNewsContentCardView, i), 3);
                return createfromparcel;
            case 11:
                ((SuspensionUiModelImpl) ((SuspensionUiModel) this.MediaMetadataCompat)).MediaSessionCompatQueueItem.RemoteActionCompatParcelizer.logEvent("suspension_card_displayed", null);
                return createfromparcel;
            case 12:
                AppearanceFragment appearanceFragment = (AppearanceFragment) this.MediaMetadataCompat;
                if (((DialogFragment) appearanceFragment).read != null) {
                    appearanceFragment.read(false, false);
                } else {
                    FragmentActivity activity = appearanceFragment.getActivity();
                    if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
                        int i11 = IconCompatParcelizer + 107;
                        write = i11 % Fields.SpotShadowColor;
                        if (i11 % 2 == 0) {
                            onBackPressedDispatcher.IconCompatParcelizer();
                            throw null;
                        }
                        onBackPressedDispatcher.IconCompatParcelizer();
                    }
                }
                return createfromparcel;
            case 13:
                ((r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94) this.MediaMetadataCompat).ParcelableVolumeInfo.serializer(r8lambdaU6FEEC8tmUhSdq6Ym_Pl3g2FyLo.serializer);
                return createfromparcel;
            case 14:
                ((r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94) this.MediaMetadataCompat).read(true);
                return createfromparcel;
            case 15:
                ((r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94) this.MediaMetadataCompat).read(false);
                return createfromparcel;
            case 16:
                ((r8lambdaXx663dmZF6jhFpjZqVMZK8YZwns) this.MediaMetadataCompat).IconCompatParcelizer();
                return createfromparcel;
            case 17:
                ((r8lambdaXx663dmZF6jhFpjZqVMZK8YZwns) this.MediaMetadataCompat).write.IconCompatParcelizer(r8lambdaxhatnt2ngzcpinz4h9j3mh3nx1a);
                return createfromparcel;
            case 18:
                ((r8lambdaXx663dmZF6jhFpjZqVMZK8YZwns) this.MediaMetadataCompat).IconCompatParcelizer();
                return createfromparcel;
            case 19:
                ((r8lambdaXx663dmZF6jhFpjZqVMZK8YZwns) this.MediaMetadataCompat).write.IconCompatParcelizer(r8lambdaxhatnt2ngzcpinz4h9j3mh3nx1a);
                return createfromparcel;
            case 20:
                ((AppearanceViewModel) this.MediaMetadataCompat).serializer.serializer(r8lambdaSl5Gsj0TJzfof28oj8MYkxu6Io.write);
                return createfromparcel;
            case 21:
                SettingsViewModel settingsViewModel = (SettingsViewModel) this.MediaMetadataCompat;
                SharedResourcePool sharedResourcePool = settingsViewModel.ParcelableVolumeInfo;
                isSensitiveData issensitivedata = settingsViewModel.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) issensitivedata.IconCompatParcelizer;
                firebaseRemoteConfigImpl.getClass();
                boolean zIconCompatParcelizer = firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.SHOULD_BLOCK_LOGOUT_ON_ACTIVE_ORDER);
                boolean zIsEmpty = ((CachedDeliveryRepository) issensitivedata.read.serializer).IconCompatParcelizer().MediaBrowserCompatMediaItem.isEmpty();
                issensitivedata.serializer.write.logEvent("logout_attempted", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("hasActiveOrder", String.valueOf(!zIsEmpty)), new onViewAttachedToWindowlambda0("flagEnabled", String.valueOf(zIconCompatParcelizer))));
                if (zIconCompatParcelizer) {
                    int i12 = IconCompatParcelizer + 13;
                    write = i12 % Fields.SpotShadowColor;
                    if (i12 % 2 == 0) {
                        throw null;
                    }
                    if (zIsEmpty) {
                        sharedResourcePool.serializer(r8lambdaEQ0pS95J6zwbXPQOcYCtM1qJZk.read);
                    } else {
                        sharedResourcePool.serializer(r8lambdaEJU_tl__ceNZdZ2EYEHdqtTMCZc.IconCompatParcelizer);
                    }
                } else {
                    sharedResourcePool.serializer(r8lambdaEQ0pS95J6zwbXPQOcYCtM1qJZk.read);
                }
                return createfromparcel;
            case 22:
                SettingsViewModel settingsViewModel2 = (SettingsViewModel) this.MediaMetadataCompat;
                settingsViewModel2.ParcelableVolumeInfo.serializer(new r8lambda7vklbvSxqffTXHr8OM5RDzMr2g(((getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET) settingsViewModel2.IconCompatParcelizer).write));
                return createfromparcel;
            case 23:
                MutableStateFlow mutableStateFlow = ((r8lambdafOIPryYKxSg19oxLSCcW3X8q4Qk) this.MediaMetadataCompat).write;
                do {
                    obj = mutableStateFlow.read();
                    r8lambdag0m0JVUE1KB8aI8kjJMGJSHe1o8 r8lambdag0m0jvue1kb8ai8kjjmgjshe1o8 = (r8lambdag0m0JVUE1KB8aI8kjJMGJSHe1o8) obj;
                    z = r8lambdag0m0jvue1kb8ai8kjjmgjshe1o8.IconCompatParcelizer;
                    str = r8lambdag0m0jvue1kb8ai8kjjmgjshe1o8.RemoteActionCompatParcelizer;
                    str2 = r8lambdag0m0jvue1kb8ai8kjjmgjshe1o8.write;
                    str3 = r8lambdag0m0jvue1kb8ai8kjjmgjshe1o8.read;
                    r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = r8lambdag0m0jvue1kb8ai8kjjmgjshe1o8.serializer;
                    str.getClass();
                    str2.getClass();
                    r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
                } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj, new r8lambdag0m0JVUE1KB8aI8kjJMGJSHe1o8(str, str2, str3, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, !z)));
                return createfromparcel;
            case 24:
                ((_get_deviceId_lambda0) this.MediaMetadataCompat).read.serializer(_get_cachedContentCardsUpdatedEvent_lambda0.IconCompatParcelizer);
                return createfromparcel;
            case 25:
                ((EquipmentBottomSheet) this.MediaMetadataCompat).write();
                return createfromparcel;
            case 26:
                OneClickStartWorkingViewModel oneClickStartWorkingViewModel = (OneClickStartWorkingViewModel) this.MediaMetadataCompat;
                oneClickStartWorkingViewModel.getClass();
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(oneClickStartWorkingViewModel), null, null, new OneClickStartWorkingViewModel.AnonymousClass1(oneClickStartWorkingViewModel, null, 5), 3).IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new TncContentKt$$ExternalSyntheticLambda2(21, oneClickStartWorkingViewModel));
                return createfromparcel;
            case 27:
                OneClickStartWorkingViewModel oneClickStartWorkingViewModel2 = (OneClickStartWorkingViewModel) this.MediaMetadataCompat;
                FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) oneClickStartWorkingViewModel2.MediaSessionCompatQueueItem;
                firebaseRemoteConfigImpl2.getClass();
                if (firebaseRemoteConfigImpl2.IconCompatParcelizer(updateAdidI.WEB_VIEW_TNC_CONSENT_FLOW_ENABLED)) {
                    oneClickStartWorkingViewModel2.PlaybackStateCompat.serializer(logBannerClicklambda1.write);
                }
                MutableStateFlow mutableStateFlow2 = oneClickStartWorkingViewModel2.write;
                do {
                    obj2 = mutableStateFlow2.read();
                } while (!mutableStateFlow2.RemoteActionCompatParcelizer(obj2, logFeatureFlagImpressionlambda1.serializer((logFeatureFlagImpressionlambda1) obj2, null, false, 5)));
                return createfromparcel;
            case 28:
                ((OneClickStartWorkingFragment) this.MediaMetadataCompat).read(false, false);
                return createfromparcel;
            default:
                OneClickStartWorkingFragment oneClickStartWorkingFragment = (OneClickStartWorkingFragment) this.MediaMetadataCompat;
                String string = oneClickStartWorkingFragment.requireArguments().getString("one_click_start_working_request_key", "");
                string.getClass();
                if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) string)) {
                    oneClickStartWorkingFragment.getParentFragmentManager().write(new Bundle(0), string);
                }
                oneClickStartWorkingFragment.read(false, false);
                return createfromparcel;
        }
    }
}
