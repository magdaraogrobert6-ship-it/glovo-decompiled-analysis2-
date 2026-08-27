package com.roadrunner.sidemenu.presentation;

import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.ViewModel;
import com.roadrunner.settings.SettingsViewModel$special$$inlined$map$1;
import com.roadrunner.sidemenu.data.SideMenuRepository;
import com.sentiance.core.model.thrift.O$b;
import io.socket.parser.IOParser$Decoder;
import java.util.concurrent.CancellationException;
import kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.ShortNewsContentCardView;
import o._get_deviceId_lambda0;
import o.accessgetCustomBrazeNotificationFactorycp;
import o.accessgetSdkEnablementProvidercp;
import o.accessgetShouldMockNetworkRequestsAndDropEventscp;
import o.getContentViewGroupParentLayout;
import o.getImages;
import o.getQueryContext;
import o.getRootInfoui;
import o.isAdapterPositionOnScreen;
import o.isOpenInternalroom_runtime;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaf_FvuSyJcHtV7a7XxEaY3w461U;
import o.r8lambdarhKt8LqXnUTuWnrd33rLhsW_3I;
import o.r8lambdauAwsGBloCOQii2by57Eo3_9jYD4;
import o.r8lambdawI45rd1s84hSyTy4WOY_JqhFAy8;
import o.r8lambdax3lltCpD3rATxa4vQpnFaaGbzP4;
import o.r8lambdazKMAJ4AIoYVNmFfjP9fATFnmODI;
import o.requestSingleLocationUpdatelambda1;

/* JADX INFO: loaded from: classes3.dex */
public final class SideMenuViewModel extends ViewModel {
    private static int ResultReceiver = 1;
    private static int r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final MutableStateFlow IconCompatParcelizer;
    public final _get_deviceId_lambda0 MediaBrowserCompatMediaItem;
    public final getQueryContext MediaDescriptionCompat;
    public final r8lambdawI45rd1s84hSyTy4WOY_JqhFAy8 MediaMetadataCompat;
    public final r8lambdax3lltCpD3rATxa4vQpnFaaGbzP4 MediaSessionCompatQueueItem;
    public final isAdapterPositionOnScreen MediaSessionCompatResultReceiverWrapper;
    public final StateFlow MediaSessionCompatToken;
    public final StateFlow ParcelableVolumeInfo;
    public final SideMenuRepository PlaybackStateCompat;
    public final accessgetSdkEnablementProvidercp PlaybackStateCompatCustomAction;
    public final O$b RatingCompat;
    public final r8lambdauAwsGBloCOQii2by57Eo3_9jYD4 RemoteActionCompatParcelizer;
    public final accessgetCustomBrazeNotificationFactorycp r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final r8lambdaf_FvuSyJcHtV7a7XxEaY3w461U read;
    public final MutableStateFlow serializer;
    public final r8lambdarhKt8LqXnUTuWnrd33rLhsW_3I write;

    public final getQueryContext write() {
        int i = 2 % 2;
        int i2 = ResultReceiver + 45;
        int i3 = i2 % Fields.SpotShadowColor;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getQueryContext getquerycontext = this.MediaDescriptionCompat;
        int i4 = i3 + 11;
        ResultReceiver = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return getquerycontext;
    }

    public SideMenuViewModel(O$b o$b, SideMenuRepository sideMenuRepository, accessgetCustomBrazeNotificationFactorycp accessgetcustombrazenotificationfactorycp, getQueryContext getquerycontext, r8lambdaf_FvuSyJcHtV7a7XxEaY3w461U r8lambdaf_fvusyjchtv7a7xxeay3w461u, r8lambdawI45rd1s84hSyTy4WOY_JqhFAy8 r8lambdawi45rd1s84hsyty4woy_jqhfay8, r8lambdauAwsGBloCOQii2by57Eo3_9jYD4 r8lambdauawsgblocoqii2by57eo3_9jyd4, r8lambdarhKt8LqXnUTuWnrd33rLhsW_3I r8lambdarhkt8lqxnutuwnrd33rlhsw_3i, r8lambdazKMAJ4AIoYVNmFfjP9fATFnmODI r8lambdazkmaj4aioyvnmffjp9fatfnmodi, accessgetSdkEnablementProvidercp accessgetsdkenablementprovidercp, r8lambdax3lltCpD3rATxa4vQpnFaaGbzP4 r8lambdax3lltcpd3ratxa4vqpnfaagbzp4, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        o$b.getClass();
        sideMenuRepository.getClass();
        accessgetcustombrazenotificationfactorycp.getClass();
        getquerycontext.getClass();
        r8lambdaf_fvusyjchtv7a7xxeay3w461u.getClass();
        r8lambdawi45rd1s84hsyty4woy_jqhfay8.getClass();
        r8lambdauawsgblocoqii2by57eo3_9jyd4.getClass();
        r8lambdarhkt8lqxnutuwnrd33rlhsw_3i.getClass();
        r8lambdazkmaj4aioyvnmffjp9fatfnmodi.getClass();
        accessgetsdkenablementprovidercp.getClass();
        r8lambdax3lltcpd3ratxa4vqpnfaagbzp4.getClass();
        isopeninternalroom_runtime.getClass();
        this.RatingCompat = o$b;
        this.PlaybackStateCompat = sideMenuRepository;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = accessgetcustombrazenotificationfactorycp;
        this.MediaDescriptionCompat = getquerycontext;
        this.read = r8lambdaf_fvusyjchtv7a7xxeay3w461u;
        this.MediaMetadataCompat = r8lambdawi45rd1s84hsyty4woy_jqhfay8;
        this.RemoteActionCompatParcelizer = r8lambdauawsgblocoqii2by57eo3_9jyd4;
        this.write = r8lambdarhkt8lqxnutuwnrd33rlhsw_3i;
        this.PlaybackStateCompatCustomAction = accessgetsdkenablementprovidercp;
        this.MediaSessionCompatQueueItem = r8lambdax3lltcpd3ratxa4vqpnfaagbzp4;
        int i = 1;
        this.MediaSessionCompatResultReceiverWrapper = new isAdapterPositionOnScreen(new getImages(isopeninternalroom_runtime, i));
        MutableStateFlow mutableStateFlow = StateFlowKt.read(accessgetShouldMockNetworkRequestsAndDropEventscp.RemoteActionCompatParcelizer);
        this.IconCompatParcelizer = mutableStateFlow;
        this.ParcelableVolumeInfo = mutableStateFlow;
        this.MediaSessionCompatToken = FlowKt.write(new SettingsViewModel$special$$inlined$map$1(mutableStateFlow, 16, this), read(), SharingStarted.Companion.read(2), SmallPersistentVector.RemoteActionCompatParcelizer);
        this.MediaBrowserCompatMediaItem = new _get_deviceId_lambda0(new getQueryContext(), read(), (IOParser$Decoder) ((requestSingleLocationUpdatelambda1) r8lambdazkmaj4aioyvnmffjp9fatfnmodi.read.IconCompatParcelizer).write());
        this.serializer = StateFlowKt.read(Boolean.FALSE);
        ShortNewsContentCardView shortNewsContentCardView = null;
        BuildersKt.RemoteActionCompatParcelizer(read(), null, null, new SideMenuViewModel$observeSideMenuCache$1(this, shortNewsContentCardView, 0), 3);
        BuildersKt.RemoteActionCompatParcelizer(read(), null, null, new SideMenuViewModel$observeSideMenuCache$1(this, shortNewsContentCardView, 3), 3);
        BuildersKt.RemoteActionCompatParcelizer(read(), null, null, new SideMenuViewModel$observeSideMenuCache$1(this, shortNewsContentCardView, 4), 3);
        BuildersKt.RemoteActionCompatParcelizer(read(), null, null, new SideMenuViewModel$observeSideMenuCache$1(this, shortNewsContentCardView, 2), 3);
        BuildersKt.RemoteActionCompatParcelizer(read(), null, null, new SideMenuViewModel$observeSideMenuCache$1(this, shortNewsContentCardView, i), 3);
    }

    public final getContentViewGroupParentLayout read() {
        int i = 2 % 2;
        int i2 = ResultReceiver + 35;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.MediaSessionCompatResultReceiverWrapper.MediaSessionCompatResultReceiverWrapper();
        int i3 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 21;
        ResultReceiver = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return getcontentviewgroupparentlayout;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        int i = 2 % 2;
        int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 111;
        ResultReceiver = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        accessgetSdkEnablementProvidercp accessgetsdkenablementprovidercp = this.PlaybackStateCompatCustomAction;
        ((getRootInfoui) accessgetsdkenablementprovidercp.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer("side_menu_time_to_interactive");
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = accessgetsdkenablementprovidercp.RatingCompat;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
            int i4 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 7;
            ResultReceiver = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        accessgetsdkenablementprovidercp.RatingCompat = null;
        YieldKt.write(read(), (CancellationException) null);
        int i6 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 67;
        ResultReceiver = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
    }
}
