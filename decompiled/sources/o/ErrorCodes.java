package o;

import androidx.camera.video.Recorder$3;
import com.huawei.hmf.tasks.a.i$d;

/* JADX INFO: loaded from: classes3.dex */
public final class ErrorCodes implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    public static final ErrorCodes serializer = new ErrorCodes();
    private static int write = 1;

    static {
        int i = write + 107;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 117;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setDrawResultui setdrawresultui = (setDrawResultui) obj;
        setdrawresultui.getClass();
        Recorder$3 recorder$3 = setdrawresultui.MediaSessionCompatQueueItem;
        ClipKt clipKt = setdrawresultui.MediaMetadataCompat;
        Recorder$3.RemoteActionCompatParcelizer(recorder$3, clipKt.MediaDescriptionCompat, 0.0f, 6);
        Recorder$3.RemoteActionCompatParcelizer(setdrawresultui.RemoteActionCompatParcelizer, clipKt.write, 0.0f, 6);
        i$d.read(setdrawresultui.IconCompatParcelizer, clipKt.RemoteActionCompatParcelizer, 0.0f, 6);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = RemoteActionCompatParcelizer + 123;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return createfromparcel;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
