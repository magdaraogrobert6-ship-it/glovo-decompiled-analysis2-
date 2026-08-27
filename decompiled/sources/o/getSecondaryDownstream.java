package o;

import androidx.camera.video.Recorder$3;
import com.huawei.hmf.tasks.a.i$d;

/* JADX INFO: loaded from: classes3.dex */
public final class getSecondaryDownstream implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ float IconCompatParcelizer;
    public final /* synthetic */ ClipKt RemoteActionCompatParcelizer;
    public final /* synthetic */ ClipKt read;

    public getSecondaryDownstream(ClipKt clipKt, ClipKt clipKt2, float f) {
        this.read = clipKt;
        this.RemoteActionCompatParcelizer = clipKt2;
        this.IconCompatParcelizer = f;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        setDrawResultui setdrawresultui = (setDrawResultui) obj;
        setdrawresultui.getClass();
        i$d.read(setdrawresultui.RatingCompat, this.read.read, 0.0f, 6);
        Recorder$3.RemoteActionCompatParcelizer(setdrawresultui.MediaSessionCompatQueueItem, this.RemoteActionCompatParcelizer.write, 0.0f, 6);
        setdrawresultui.IconCompatParcelizer(new DrawModifierKt(androidx.compose.ui.unit.Dp.m3671boximpl(this.IconCompatParcelizer), null));
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i2 = serializer + 69;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return createfromparcel;
    }
}
