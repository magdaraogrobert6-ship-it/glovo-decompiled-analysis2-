package o;

/* JADX INFO: loaded from: classes4.dex */
public final class getCenterLeftannotations implements SourceInformationKt {
    public final /* synthetic */ SourceInformationKt IconCompatParcelizer;
    public final /* synthetic */ float read;
    public final /* synthetic */ SourceInformationKt serializer;

    @Override // o.SourceInformationKt
    public final float IconCompatParcelizer(long j, androidx.compose.ui.unit.Density density) {
        return androidx.compose.ui.util.MathHelpersKt.lerp(this.serializer.IconCompatParcelizer(j, density), this.IconCompatParcelizer.IconCompatParcelizer(j, density), this.read);
    }

    public getCenterLeftannotations(SourceInformationKt sourceInformationKt, SourceInformationKt sourceInformationKt2, float f) {
        this.serializer = sourceInformationKt;
        this.IconCompatParcelizer = sourceInformationKt2;
        this.read = f;
    }
}
