package o;

/* JADX INFO: loaded from: classes3.dex */
public final class errorMessage implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ float IconCompatParcelizer;
    public final /* synthetic */ long RemoteActionCompatParcelizer;
    public final /* synthetic */ long write;

    public errorMessage(long j, long j2, float f) {
        this.write = j;
        this.RemoteActionCompatParcelizer = j2;
        this.IconCompatParcelizer = f;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = serializer + 19;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        androidx.compose.ui.graphics.Color colorM712boximpl = androidx.compose.ui.graphics.Color.m712boximpl(androidx.compose.ui.graphics.ColorKt.m773lerpjxsXWHM(this.write, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer));
        int i4 = serializer + 41;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return colorM712boximpl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
