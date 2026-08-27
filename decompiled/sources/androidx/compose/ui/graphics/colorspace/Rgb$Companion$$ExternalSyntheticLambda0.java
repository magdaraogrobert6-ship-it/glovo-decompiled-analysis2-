package androidx.compose.ui.graphics.colorspace;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Rgb$Companion$$ExternalSyntheticLambda0 implements DoubleFunction {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TransferParameters f$0;

    public /* synthetic */ Rgb$Companion$$ExternalSyntheticLambda0(TransferParameters transferParameters, int i) {
        this.$r8$classId = i;
        this.f$0 = transferParameters;
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        int i = this.$r8$classId;
        TransferParameters transferParameters = this.f$0;
        switch (i) {
            case 0:
                return Rgb.Companion.generateEotf$lambda$0(transferParameters, d);
            case 1:
                return Rgb.Companion.generateEotf$lambda$1(transferParameters, d);
            case 2:
                return Rgb.Companion.generateEotf$lambda$2(transferParameters, d);
            case 3:
                return Rgb.Companion.generateEotf$lambda$3(transferParameters, d);
            case 4:
                return Rgb.Companion.generateOetf$lambda$0(transferParameters, d);
            case 5:
                return Rgb.Companion.generateOetf$lambda$1(transferParameters, d);
            case 6:
                return Rgb.Companion.generateOetf$lambda$2(transferParameters, d);
            default:
                return Rgb.Companion.generateOetf$lambda$3(transferParameters, d);
        }
    }
}
