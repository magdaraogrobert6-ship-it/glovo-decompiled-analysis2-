package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getCanFocus implements androidx.compose.ui.graphics.colorspace.DoubleFunction {
    public final /* synthetic */ int serializer;

    public /* synthetic */ getCanFocus(int i) {
        this.serializer = i;
    }

    public static /* synthetic */ void write(String str, float f, Object obj, float f2, Object obj2) {
        throw new IllegalArgumentException(str + f + obj + f2 + obj2);
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public double invoke(double d) {
        switch (this.serializer) {
            case 8:
                return androidx.compose.ui.graphics.colorspace.ColorSpaces.ExtendedSrgb$lambda$0(d);
            case 9:
                return androidx.compose.ui.graphics.colorspace.ColorSpaces.ExtendedSrgb$lambda$1(d);
            case 10:
                return androidx.compose.ui.graphics.colorspace.ColorSpaces.Bt2020Hlg$lambda$0(d);
            case 11:
                return androidx.compose.ui.graphics.colorspace.ColorSpaces.Bt2020Hlg$lambda$1(d);
            case 12:
                return androidx.compose.ui.graphics.colorspace.ColorSpaces.Bt2020Pq$lambda$0(d);
            case 13:
                return androidx.compose.ui.graphics.colorspace.ColorSpaces.Bt2020Pq$lambda$1(d);
            default:
                return androidx.compose.ui.graphics.colorspace.Rgb.DoubleIdentity$lambda$0(d);
        }
    }
}
