package bo.app;

import android.os.Process;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public static int IconCompatParcelizer;
    public static int write;
    public final /* synthetic */ int $r8$classId;

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return w.a();
            case 1:
                return vg.e();
            case 2:
                return vg.i();
            case 3:
                return vg.g();
            case 4:
                return w5.a();
            case 5:
                return w5.d();
            case 6:
                return w5.b();
            case 7:
                return w5.c();
            case 8:
                return w7.d();
            case 9:
                return w7.e();
            case 10:
                return w7.f();
            case 11:
                return w7.Y();
            case 12:
                return w7.Z();
            case 13:
                return w7.b();
            case 14:
                return w7.o();
            case 15:
                return w7.b0();
            case 16:
                return w7.c0();
            case 17:
                return w7.c();
            case 18:
                return w7.n();
            case 19:
                return w7.M();
            case 20:
                return w7.N();
            case 21:
                return w7.g0();
            case 22:
                return w7.V();
            case 23:
                return w7.W();
            case 24:
                return w7.w();
            case 25:
                return w7.a();
            case 26:
                return w7.e0();
            case 27:
                return w8.a();
            case 28:
                return w8.b();
            default:
                return w8.c();
        }
    }

    public static int write() {
        int i = write;
        int i2 = i % 8867647;
        write = i + 1;
        if (i2 != 0) {
            return IconCompatParcelizer;
        }
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        IconCompatParcelizer = elapsedCpuTime;
        return elapsedCpuTime;
    }
}
