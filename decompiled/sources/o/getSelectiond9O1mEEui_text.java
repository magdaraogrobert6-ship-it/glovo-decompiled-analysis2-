package o;

import androidx.camera.video.Recorder$3;
import com.huawei.hmf.tasks.a.i$d;

/* JADX INFO: loaded from: classes3.dex */
public final class getSelectiond9O1mEEui_text implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public static final getSelectiond9O1mEEui_text write = new getSelectiond9O1mEEui_text(1);
    public static final getSelectiond9O1mEEui_text read = new getSelectiond9O1mEEui_text(2);
    public static final getSelectiond9O1mEEui_text serializer = new getSelectiond9O1mEEui_text(3);
    public static final getSelectiond9O1mEEui_text RemoteActionCompatParcelizer = new getSelectiond9O1mEEui_text(0);

    public /* synthetic */ getSelectiond9O1mEEui_text(int i) {
        this.IconCompatParcelizer = i;
    }

    static {
        int i = RatingCompat + 91;
        MediaMetadataCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 89;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            obj2.hashCode();
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        if (i3 == 0) {
            setDrawResultui setdrawresultui = (setDrawResultui) obj;
            setdrawresultui.getClass();
            Recorder$3 recorder$3 = setdrawresultui.MediaSessionCompatQueueItem;
            ClipKt clipKt = setdrawresultui.MediaMetadataCompat;
            Recorder$3.RemoteActionCompatParcelizer(recorder$3, clipKt.MediaDescriptionCompat, 0.0f, 6);
            i$d.read(setdrawresultui.IconCompatParcelizer, clipKt.RemoteActionCompatParcelizer, 0.0f, 6);
            return createfromparcel2;
        }
        if (i3 == 1) {
            setDrawResultui setdrawresultui2 = (setDrawResultui) obj;
            setdrawresultui2.getClass();
            Recorder$3 recorder$4 = setdrawresultui2.MediaSessionCompatQueueItem;
            ClipKt clipKt2 = setdrawresultui2.MediaMetadataCompat;
            Recorder$3.RemoteActionCompatParcelizer(recorder$4, clipKt2.MediaDescriptionCompat, 0.0f, 6);
            i$d.read(setdrawresultui2.IconCompatParcelizer, clipKt2.RemoteActionCompatParcelizer, 0.0f, 6);
            return createfromparcel2;
        }
        if (i3 == 2) {
            setDrawResultui setdrawresultui3 = (setDrawResultui) obj;
            setdrawresultui3.getClass();
            i$d i_d = setdrawresultui3.RatingCompat;
            ClipKt clipKt3 = setdrawresultui3.MediaMetadataCompat;
            i$d.read(i_d, clipKt3.read, 0.0f, 6);
            setDrawResultui.write(setdrawresultui3, clipKt3);
            return createfromparcel2;
        }
        setDrawResultui setdrawresultui4 = (setDrawResultui) obj;
        setdrawresultui4.getClass();
        i$d i_d2 = setdrawresultui4.IconCompatParcelizer;
        ClipKt clipKt4 = setdrawresultui4.MediaMetadataCompat;
        i$d.read(i_d2, clipKt4.RemoteActionCompatParcelizer, 0.0f, 6);
        Recorder$3.RemoteActionCompatParcelizer(setdrawresultui4.MediaSessionCompatQueueItem, clipKt4.MediaDescriptionCompat, 0.0f, 6);
        Recorder$3.RemoteActionCompatParcelizer(setdrawresultui4.RemoteActionCompatParcelizer, clipKt4.write, 0.0f, 6);
        int i4 = MediaBrowserCompatMediaItem + 11;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return createfromparcel2;
        }
        obj2.hashCode();
        throw null;
    }
}
