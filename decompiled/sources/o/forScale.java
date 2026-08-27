package o;

import androidx.camera.video.Recorder$3;
import com.huawei.hmf.tasks.a.i$d;

/* JADX INFO: loaded from: classes3.dex */
public final class forScale implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 0;
    public static final forScale RemoteActionCompatParcelizer = new forScale();
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = serializer + 67;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        setDrawResultui setdrawresultui = (setDrawResultui) obj;
        setdrawresultui.getClass();
        i$d i_d = setdrawresultui.RatingCompat;
        ClipKt clipKt = setdrawresultui.MediaMetadataCompat;
        i$d.read(i_d, clipKt.read, 0.0f, 6);
        Recorder$3.RemoteActionCompatParcelizer(setdrawresultui.MediaSessionCompatQueueItem, clipKt.MediaDescriptionCompat, 0.0f, 6);
        Recorder$3.RemoteActionCompatParcelizer(setdrawresultui.RemoteActionCompatParcelizer, clipKt.write, 0.0f, 6);
        setdrawresultui.IconCompatParcelizer(new DrawModifierKt(null, "spread"));
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i2 = IconCompatParcelizer + 33;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return createfromparcel;
    }
}
