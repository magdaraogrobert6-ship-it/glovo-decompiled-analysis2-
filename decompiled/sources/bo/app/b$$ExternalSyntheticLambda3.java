package bo.app;

import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi1;
import o.GraphicsContextshadowContext1;
import o.afterClosed;
import o.component150d7_KjU;
import o.copycp5nf6Adefault;
import o.getCompositingStrategyNrFUSI;
import o.getRenderEffect;
import o.getScaleY;
import o.getShadowElevation;
import o.maxAoSsdG0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setWasCloseMessageCalled;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b$$ExternalSyntheticLambda3 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        WindowLayoutComponent windowLayoutComponentWrite;
        Object extensionWindowBackendApi1;
        switch (this.$r8$classId) {
            case 0:
                return b.b();
            case 1:
                return new setWasCloseMessageCalled(afterClosed.IconCompatParcelizer, 0);
            case 2:
                try {
                    ClassLoader classLoader = component150d7_KjU.class.getClassLoader();
                    copycp5nf6Adefault copycp5nf6adefault = classLoader != null ? new copycp5nf6Adefault(classLoader, new maxAoSsdG0(classLoader, 0)) : null;
                    if (copycp5nf6adefault == null || (windowLayoutComponentWrite = copycp5nf6adefault.write()) == null) {
                        return null;
                    }
                    maxAoSsdG0 maxaossdg0 = new maxAoSsdG0(classLoader, 0);
                    int iIconCompatParcelizer = GraphicsContextshadowContext1.IconCompatParcelizer();
                    if (iIconCompatParcelizer >= 9) {
                        extensionWindowBackendApi1 = new getScaleY(windowLayoutComponentWrite, maxaossdg0);
                    } else if (iIconCompatParcelizer >= 6) {
                        extensionWindowBackendApi1 = new getShadowElevation(windowLayoutComponentWrite, maxaossdg0);
                    } else if (iIconCompatParcelizer >= 2) {
                        extensionWindowBackendApi1 = new getRenderEffect(windowLayoutComponentWrite, maxaossdg0);
                    } else {
                        extensionWindowBackendApi1 = iIconCompatParcelizer == 1 ? new ExtensionWindowBackendApi1(windowLayoutComponentWrite, maxaossdg0) : new getCompositingStrategyNrFUSI();
                    }
                    return extensionWindowBackendApi1;
                } catch (Throwable unused) {
                    return null;
                }
            case 3:
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
            case 4:
                return a5.a();
            case 5:
                return a5.b();
            case 6:
                return a7.b();
            case 7:
                return a7.c();
            case 8:
                return a7.a();
            case 9:
                return a9.l();
            case 10:
                return af.f();
            case 11:
                return af.c();
            case 12:
                return af.g();
            case 13:
                return af.h();
            case 14:
                return af.a();
            case 15:
                return af.i();
            case 16:
                return af.b();
            case 17:
                return af.e();
            case 18:
                return af.d();
            case 19:
                return b2.b();
            case 20:
                return b2.c();
            case 21:
                return b8.d();
            case 22:
                return b9.l();
            case 23:
                return bd.m();
            case 24:
                return bd.l();
            case 25:
                return be.a();
            case 26:
                return be.b();
            case 27:
                return bg.b();
            case 28:
                return c6.l();
            default:
                return d0.a();
        }
    }

    public /* synthetic */ b$$ExternalSyntheticLambda3(int i) {
        this.$r8$classId = i;
    }
}
