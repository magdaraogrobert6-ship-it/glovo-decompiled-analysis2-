package o;

import com.roadrunner.home.state.data.HomeRepositoryImpl;
import com.roadrunner.home.state.data.HomeRepositoryImpl$fetchHomeResponse$1;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes3.dex */
public final class setOnRemoteTriggerListener {
    private static int read = 1;
    private static int write;
    public final loadCachedui_text IconCompatParcelizer;
    public final HomeRepositoryImpl serializer;

    public setOnRemoteTriggerListener(HomeRepositoryImpl homeRepositoryImpl, loadCachedui_text loadcachedui_text) {
        this.serializer = homeRepositoryImpl;
        this.IconCompatParcelizer = loadcachedui_text;
    }

    public final void read(String str, setOnSessionTrackingFailedListener setonsessiontrackingfailedlistener, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int i = 2 % 2;
        int i2 = write + 115;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setonsessiontrackingfailedlistener.getClass();
        loadCachedui_text loadcachedui_text = this.IconCompatParcelizer;
        loadcachedui_text.read = setonsessiontrackingfailedlistener;
        loadcachedui_text.write = str;
        String value = setonsessiontrackingfailedlistener.getValue();
        HomeRepositoryImpl homeRepositoryImpl = this.serializer;
        value.getClass();
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = homeRepositoryImpl.MediaMetadataCompat;
        Object obj = null;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            int i4 = read + 71;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                obj.hashCode();
                throw null;
            }
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        homeRepositoryImpl.MediaMetadataCompat = BuildersKt.RemoteActionCompatParcelizer(homeRepositoryImpl.PlaybackStateCompatCustomAction, null, null, new HomeRepositoryImpl$fetchHomeResponse$1(homeRepositoryImpl, value, z, str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null), 3);
    }
}
