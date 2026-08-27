package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.sidemenu.presentation.SideMenuViewModel;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes3.dex */
public final class _set_registeredPushToken_lambda12 implements FlowCollector {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ SideMenuViewModel serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ _set_registeredPushToken_lambda12(SideMenuViewModel sideMenuViewModel, int i) {
        this.write = i;
        this.serializer = sideMenuViewModel;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) throws Throwable {
        int i = 2 % 2;
        int i2 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        SideMenuViewModel sideMenuViewModel = this.serializer;
        if (i2 == 0) {
            sideMenuViewModel.IconCompatParcelizer.IconCompatParcelizer((r8lambdaf8vLMalRCdAeJsAFGsSdyaUSxa4) obj);
            return createfromparcel;
        }
        if (i2 == 1) {
            if (!(!((r8lambdaf8vLMalRCdAeJsAFGsSdyaUSxa4) sideMenuViewModel.IconCompatParcelizer.read()).write)) {
                accessgetSdkEnablementProvidercp accessgetsdkenablementprovidercp = sideMenuViewModel.PlaybackStateCompatCustomAction;
                MutableStateFlow mutableStateFlow = accessgetsdkenablementprovidercp.serializer;
                if (accessgetsdkenablementprovidercp.RatingCompat == null) {
                    int i3 = RemoteActionCompatParcelizer + 25;
                    read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                } else if (mutableStateFlow.read() == accessisInstanceStoppedp.Loading) {
                    r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = accessgetsdkenablementprovidercp.RatingCompat;
                    if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                        int i5 = read + 51;
                        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i6 = i5 % 2;
                        r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                    }
                    accessgetsdkenablementprovidercp.RatingCompat = null;
                    mutableStateFlow.IconCompatParcelizer(accessisInstanceStoppedp.Unavailable);
                }
            }
            return createfromparcel;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                if (accessgetBrazeUserp.read[((accessgetDeviceDataProvidercp) obj).ordinal()] != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                int i7 = RemoteActionCompatParcelizer + 79;
                read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                sideMenuViewModel.MediaDescriptionCompat.serializer(accessgetStaticExternalIEventMessengercp.IconCompatParcelizer);
                return createfromparcel;
            }
            if (((Boolean) obj).booleanValue()) {
                accessgetSdkEnablementProvidercp accessgetsdkenablementprovidercp2 = sideMenuViewModel.PlaybackStateCompatCustomAction;
                ((getRootInfoui) accessgetsdkenablementprovidercp2.RemoteActionCompatParcelizer).write("side_menu_time_to_interactive");
                MutableStateFlow mutableStateFlow2 = accessgetsdkenablementprovidercp2.serializer;
                if (mutableStateFlow2.read() == accessisInstanceStoppedp.Loading) {
                    r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 = accessgetsdkenablementprovidercp2.RatingCompat;
                    if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 != null) {
                        r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2.write((CancellationException) null);
                    }
                    accessgetsdkenablementprovidercp2.RatingCompat = null;
                    mutableStateFlow2.IconCompatParcelizer(accessisInstanceStoppedp.Available);
                }
            }
            return createfromparcel;
        }
        getQueryContext getquerycontext = sideMenuViewModel.MediaDescriptionCompat;
        int i9 = _set_registeredPushToken_lambda11.read[((accessisInstanceStoppedp) obj).ordinal()];
        if (i9 == 1) {
            getquerycontext.serializer(new accessgetShouldRequestFrameworkListenToNetworkUpdatescp(true));
            return createfromparcel;
        }
        if (i9 == 2) {
            getquerycontext.serializer(new accessgetShouldRequestFrameworkListenToNetworkUpdatescp(false));
            int i10 = RemoteActionCompatParcelizer + 5;
            read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return createfromparcel;
        }
        int i12 = RemoteActionCompatParcelizer + 23;
        read = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i12 % 2 == 0) {
            if (i9 == 4) {
                return createfromparcel;
            }
        } else if (i9 == 3) {
            return createfromparcel;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return null;
    }
}
