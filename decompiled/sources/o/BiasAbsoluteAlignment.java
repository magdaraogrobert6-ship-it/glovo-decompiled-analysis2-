package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class BiasAbsoluteAlignment implements getAdjustedCoordinatesk4lQ0M {
    public final getPersonLastName IconCompatParcelizer;
    public final getPersonLastName RemoteActionCompatParcelizer;
    public final /* synthetic */ getAdjustedCoordinatesk4lQ0M serializer;

    @Override // o.getAdjustedCoordinatesk4lQ0M
    public final boolean IconCompatParcelizer() {
        return this.serializer.IconCompatParcelizer();
    }

    @Override // o.getAdjustedCoordinatesk4lQ0M
    public final boolean RemoteActionCompatParcelizer() {
        return ((Boolean) this.RemoteActionCompatParcelizer.getValue()).booleanValue();
    }

    @Override // o.getAdjustedCoordinatesk4lQ0M
    public final Object scroll(applyMeasureResultfoundation applymeasureresultfoundation, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ContinuationImpl continuationImpl) {
        return this.serializer.scroll(applymeasureresultfoundation, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, continuationImpl);
    }

    @Override // o.getAdjustedCoordinatesk4lQ0M
    public final float write(float f) {
        return this.serializer.write(f);
    }

    @Override // o.getAdjustedCoordinatesk4lQ0M
    public final boolean write() {
        return ((Boolean) this.IconCompatParcelizer.getValue()).booleanValue();
    }

    public BiasAbsoluteAlignment(getAdjustedCoordinatesk4lQ0M getadjustedcoordinatesk4lq0m, final equals equalsVar) {
        this.serializer = getadjustedcoordinatesk4lq0m;
        final int i = 0;
        this.IconCompatParcelizer = androidx.compose.runtime.CompositionKt.serializer(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.component1
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i2 = i;
                equals equalsVar2 = equalsVar;
                if (i2 != 0) {
                    return Boolean.valueOf(equalsVar2.serializer() > 0.0f);
                }
                return Boolean.valueOf(equalsVar2.serializer() < ((getContentCaptureSessionui) equalsVar2.write).serializer());
            }
        });
        final int i2 = 1;
        this.RemoteActionCompatParcelizer = androidx.compose.runtime.CompositionKt.serializer(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.component1
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i3 = i2;
                equals equalsVar2 = equalsVar;
                if (i3 != 0) {
                    return Boolean.valueOf(equalsVar2.serializer() > 0.0f);
                }
                return Boolean.valueOf(equalsVar2.serializer() < ((getContentCaptureSessionui) equalsVar2.write).serializer());
            }
        });
    }
}
