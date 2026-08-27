package o;

import bo.app.b8$$ExternalSyntheticLambda4;

/* JADX INFO: loaded from: classes.dex */
public abstract class onReceive {
    public static final MediaQuery_androidKtobtainUiMediaScope41 IconCompatParcelizer;
    public static final getPhoneNumber serializer = new getPhoneNumber(new b8$$ExternalSyntheticLambda4(9));
    public static final MediaQuery_androidKtobtainUiMediaScope41 write;

    static {
        androidx.compose.ui.unit.Dp.Companion companion = androidx.compose.ui.unit.Dp.Companion;
        float fM3693getUnspecifiedD9Ej5fM = companion.m3693getUnspecifiedD9Ej5fM();
        androidx.compose.ui.graphics.Color.Companion companion2 = androidx.compose.ui.graphics.Color.Companion;
        IconCompatParcelizer = new MediaQuery_androidKtobtainUiMediaScope41(fM3693getUnspecifiedD9Ej5fM, companion2.m758getUnspecified0d7_KjU(), true);
        write = new MediaQuery_androidKtobtainUiMediaScope41(companion.m3693getUnspecifiedD9Ej5fM(), companion2.m758getUnspecified0d7_KjU(), false);
    }

    public static MediaQuery_androidKtobtainUiMediaScope41 serializer(float f, long j, int i) {
        boolean z = (i & 1) != 0;
        if ((i & 2) != 0) {
            f = androidx.compose.ui.unit.Dp.Companion.m3693getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            j = androidx.compose.ui.graphics.Color.Companion.m758getUnspecified0d7_KjU();
        }
        if (!androidx.compose.ui.unit.Dp.m3678equalsimpl0(f, androidx.compose.ui.unit.Dp.Companion.m3693getUnspecifiedD9Ej5fM()) || !androidx.compose.ui.graphics.Color.m723equalsimpl0(j, androidx.compose.ui.graphics.Color.Companion.m758getUnspecified0d7_KjU())) {
            return new MediaQuery_androidKtobtainUiMediaScope41(f, j, z);
        }
        if (z) {
            return IconCompatParcelizer;
        }
        return write;
    }
}
