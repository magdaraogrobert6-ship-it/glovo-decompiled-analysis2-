package o;

import androidx.camera.video.Recorder$3;
import com.huawei.hmf.tasks.a.i$d;

/* JADX INFO: loaded from: classes3.dex */
public final class getPrimaryUpstream implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 1;
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;
    public static final getPrimaryUpstream RemoteActionCompatParcelizer = new getPrimaryUpstream(0);
    public static final getPrimaryUpstream read = new getPrimaryUpstream(1);
    private static int serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ getPrimaryUpstream(int i) {
        this.write = i;
    }

    static {
        int i = IconCompatParcelizer + 25;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 31;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i4 != 0) {
            setDrawResultui setdrawresultui = (setDrawResultui) obj;
            setdrawresultui.getClass();
            i$d i_d = setdrawresultui.IconCompatParcelizer;
            ClipKt clipKt = setdrawresultui.MediaMetadataCompat;
            i$d.read(i_d, clipKt.RemoteActionCompatParcelizer, 0.0f, 6);
            Recorder$3.RemoteActionCompatParcelizer(setdrawresultui.MediaSessionCompatQueueItem, clipKt.MediaDescriptionCompat, 0.0f, 6);
            setdrawresultui.serializer(new DrawModifierKt(null, "wrap"));
            return createfromparcel;
        }
        setDrawResultui setdrawresultui2 = (setDrawResultui) obj;
        setdrawresultui2.getClass();
        i$d i_d2 = setdrawresultui2.RatingCompat;
        ClipKt clipKt2 = setdrawresultui2.MediaMetadataCompat;
        i$d.read(i_d2, clipKt2.read, 0.0f, 6);
        Recorder$3.RemoteActionCompatParcelizer(setdrawresultui2.MediaSessionCompatQueueItem, clipKt2.MediaDescriptionCompat, 0.0f, 6);
        int i5 = MediaBrowserCompatMediaItem + 73;
        MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return createfromparcel;
        }
        throw null;
    }
}
