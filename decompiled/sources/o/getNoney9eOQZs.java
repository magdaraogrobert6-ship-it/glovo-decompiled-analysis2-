package o;

import androidx.camera.video.Recorder$3;
import com.huawei.hmf.tasks.a.i$d;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;

/* JADX INFO: loaded from: classes3.dex */
public final class getNoney9eOQZs implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    public static final getNoney9eOQZs serializer = new getNoney9eOQZs();
    private static int write = 1;

    static {
        int i = IconCompatParcelizer + 117;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 79;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setDrawResultui setdrawresultui = (setDrawResultui) obj;
        setdrawresultui.getClass();
        Recorder$3 recorder$3 = setdrawresultui.MediaSessionCompatQueueItem;
        ClipKt clipKt = setdrawresultui.MediaMetadataCompat;
        Recorder$3.RemoteActionCompatParcelizer(recorder$3, clipKt.MediaDescriptionCompat, Dimensions.setMenu, 4);
        i$d.read(setdrawresultui.IconCompatParcelizer, clipKt.RemoteActionCompatParcelizer, 0.0f, 6);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = read + 39;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }
}
