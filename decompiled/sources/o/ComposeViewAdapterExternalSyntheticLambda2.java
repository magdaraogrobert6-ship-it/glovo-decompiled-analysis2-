package o;

import androidx.camera.video.Recorder$3;
import com.huawei.hmf.tasks.a.i$d;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;

/* JADX INFO: loaded from: classes3.dex */
public final class ComposeViewAdapterExternalSyntheticLambda2 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 1;
    public static final ComposeViewAdapterExternalSyntheticLambda2 RemoteActionCompatParcelizer = new ComposeViewAdapterExternalSyntheticLambda2();
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = write + 9;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 65;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setDrawResultui setdrawresultui = (setDrawResultui) obj;
        setdrawresultui.getClass();
        Recorder$3 recorder$3 = setdrawresultui.MediaSessionCompatQueueItem;
        ClipKt clipKt = setdrawresultui.MediaMetadataCompat;
        CacheDrawScopeonDrawBehind1 cacheDrawScopeonDrawBehind1 = clipKt.MediaDescriptionCompat;
        float f = Dimensions.getContentHeight;
        Recorder$3.RemoteActionCompatParcelizer(recorder$3, cacheDrawScopeonDrawBehind1, f, 4);
        i$d.read(setdrawresultui.IconCompatParcelizer, clipKt.RemoteActionCompatParcelizer, f, 4);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = IconCompatParcelizer + 7;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return createfromparcel;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
