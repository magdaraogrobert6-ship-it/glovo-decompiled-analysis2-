package o;

import com.roadrunner.sidemenu.floating.SideMenuFloatingLayerItemUiModelImpl$1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdap8kVRPOrasFuL_ov_PvwbyBK_nY implements getFragment {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    public final OkHttpCall$1 IconCompatParcelizer;
    public final r8lambdazJ_is40ErW_0zWXIHU0U2X8pyMM MediaBrowserCompatMediaItem;
    public final r8lambdaokZBgNnbR8K2i443J9b9JUwVwk MediaDescriptionCompat;
    public final accessgetSdkEnablementProvidercp MediaSessionCompatQueueItem;
    public final StateFlow RatingCompat;
    public final dispatchChildDetached RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final MutableStateFlow serializer;
    public final StateFlow write;

    @Override // o.getFragment
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat;
        int i3 = i2 + 71;
        MediaSessionCompatResultReceiverWrapper = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        StateFlow stateFlow = this.write;
        int i4 = i2 + 111;
        MediaSessionCompatResultReceiverWrapper = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return stateFlow;
        }
        throw null;
    }

    public r8lambdap8kVRPOrasFuL_ov_PvwbyBK_nY(ContextScope contextScope, r8lambdaokZBgNnbR8K2i443J9b9JUwVwk r8lambdaokzbgnnbr8k2i443j9b9juwvwk, r8lambdazJ_is40ErW_0zWXIHU0U2X8pyMM r8lambdazj_is40erw_0zwxihu0u2x8pymm, accessgetSdkEnablementProvidercp accessgetsdkenablementprovidercp, dispatchChildDetached dispatchchilddetached, OkHttpCall$1 okHttpCall$1) {
        r8lambdaokzbgnnbr8k2i443j9b9juwvwk.getClass();
        r8lambdazj_is40erw_0zwxihu0u2x8pymm.getClass();
        accessgetsdkenablementprovidercp.getClass();
        dispatchchilddetached.getClass();
        okHttpCall$1.getClass();
        this.MediaDescriptionCompat = r8lambdaokzbgnnbr8k2i443j9b9juwvwk;
        this.MediaBrowserCompatMediaItem = r8lambdazj_is40erw_0zwxihu0u2x8pymm;
        this.MediaSessionCompatQueueItem = accessgetsdkenablementprovidercp;
        this.RemoteActionCompatParcelizer = dispatchchilddetached;
        this.IconCompatParcelizer = okHttpCall$1;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.read = mutableStateFlow;
        this.write = mutableStateFlow;
        ShortNewsContentCardView shortNewsContentCardView = null;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(new r8lambdaomj_unyZPrJ1UpAaUuFSp7i4jfc(null));
        this.serializer = mutableStateFlow2;
        this.RatingCompat = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new SideMenuFloatingLayerItemUiModelImpl$1(this, shortNewsContentCardView, 0), 3);
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new SideMenuFloatingLayerItemUiModelImpl$1(this, shortNewsContentCardView, 1), 3);
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new SideMenuFloatingLayerItemUiModelImpl$1(this, shortNewsContentCardView, 2), 3);
    }
}
