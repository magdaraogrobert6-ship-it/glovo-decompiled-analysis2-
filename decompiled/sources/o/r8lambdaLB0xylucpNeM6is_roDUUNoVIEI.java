package o;

import com.roadrunner.permission.location.gps.presentation.GPSActivity;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r8lambdaLB0xylucpNeM6is_roDUUNoVIEI implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int read = 1;
    private static int write;
    public final /* synthetic */ GPSActivity IconCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ r8lambdaLB0xylucpNeM6is_roDUUNoVIEI(GPSActivity gPSActivity, int i) {
        this.serializer = i;
        this.IconCompatParcelizer = gPSActivity;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = read + 123;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i3 = this.serializer;
        GPSActivity gPSActivity = this.IconCompatParcelizer;
        if (i3 == 0) {
            return GPSActivity.IconCompatParcelizer(gPSActivity, (r8lambdaSNLjO_HuHH0BcjkmeJ_eXZT7iMA) obj);
        }
        createFromParcel createfromparcel = GPSActivity.read(gPSActivity, (nowInMillisecondslambda0) obj);
        int i4 = read + 11;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }
}
