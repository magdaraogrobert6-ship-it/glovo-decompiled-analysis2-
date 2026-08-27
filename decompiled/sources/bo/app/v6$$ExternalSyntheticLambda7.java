package bo.app;

import coil3.network.okhttp.internal.CallFactoryNetworkClient;
import com.braze.configuration.BrazeConfigurationProvider;
import java.util.Arrays;
import java.util.ServiceConfigurationError;
import kotlinx.coroutines.DelayKt;
import o.PathFillTypeCompanion;
import o.createOffsetEffectUv8p0NA;
import o.obtainTransformShader;
import o.or;
import o.r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.resetAfterInAppMessageCloselambda2;
import o.setCurrentSemanticsNodesui;
import o.toComposeIntRect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v6$$ExternalSyntheticLambda7 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ v6$$ExternalSyntheticLambda7(int i) {
        this.$r8$classId = i;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return v6.e();
            case 1:
                return vg.p();
            case 2:
                return vg.k();
            case 3:
                return vg.l();
            case 4:
                return w6.a();
            case 5:
                return w6.d();
            case 6:
                return w7.m();
            case 7:
                return w7.S();
            case 8:
                return w7.T();
            case 9:
                return w7.P();
            case 10:
                return w7.Q();
            case 11:
                return w7.g();
            case 12:
                return w7.h();
            case 13:
                return w7.i();
            case 14:
                return w7.j();
            case 15:
                return w7.k();
            case 16:
                return w7.l();
            case 17:
                return xg.a();
            case 18:
                return xg.c();
            case 19:
                return z7.b();
            case 20:
                return zc.b();
            case 21:
                return zg.b();
            case 22:
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = PathFillTypeCompanion.read;
                return or.RemoteActionCompatParcelizer;
            case 23:
                return toComposeIntRect.IconCompatParcelizer;
            case 24:
                return createOffsetEffectUv8p0NA.write;
            case 25:
                return CallFactoryNetworkClient.RemoteActionCompatParcelizer(new r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0());
            case 26:
                try {
                    return DelayKt.RemoteActionCompatParcelizer(resetAfterInAppMessageCloselambda2.read(resetAfterInAppMessageCloselambda2.serializer(Arrays.asList(new obtainTransformShader()).iterator())));
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(th.getMessage(), th);
                }
            case 27:
                return DelayKt.RemoteActionCompatParcelizer(resetAfterInAppMessageCloselambda2.read(resetAfterInAppMessageCloselambda2.serializer(af$$ExternalSyntheticOutline1.m())));
            case 28:
                return BrazeConfigurationProvider._get_brazeApiKey_$lambda$5();
            default:
                return BrazeConfigurationProvider._get_brazeApiKey_$lambda$6();
        }
    }
}
