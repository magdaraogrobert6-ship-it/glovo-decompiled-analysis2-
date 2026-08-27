package o;

/* JADX INFO: loaded from: classes3.dex */
public final class Util2 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ long IconCompatParcelizer;
    public final /* synthetic */ long RemoteActionCompatParcelizer;
    public final /* synthetic */ onViewAttachedToWindow read;

    public Util2(long j, long j2, onViewAttachedToWindow onviewattachedtowindow) {
        this.IconCompatParcelizer = j;
        this.RemoteActionCompatParcelizer = j2;
        this.read = onviewattachedtowindow;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = serializer + 15;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        androidx.compose.ui.graphics.Color colorM712boximpl = androidx.compose.ui.graphics.Color.m712boximpl(androidx.compose.ui.graphics.ColorKt.m773lerpjxsXWHM(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, ((Number) this.read.getValue()).floatValue()));
        int i4 = write + 31;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return colorM712boximpl;
    }
}
