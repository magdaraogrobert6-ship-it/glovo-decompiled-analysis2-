package coil3.intercept;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.RadialGradientShader8uybcMk;
import o.RadialGradientShader8uybcMkdefault;
import o.ShaderKt;
import o.accessgetLayerBlockp;
import o.accessquadraticTojd;
import o.getLinesr_lszbg;

/* JADX INFO: loaded from: classes.dex */
public final class RealInterceptorChain {
    public final boolean IconCompatParcelizer;
    public final ShaderKt MediaMetadataCompat;
    public final accessgetLayerBlockp MediaSessionCompatQueueItem;
    public final List RemoteActionCompatParcelizer;
    public final int read;
    public final accessquadraticTojd serializer;
    public final ShaderKt write;

    public RealInterceptorChain(ShaderKt shaderKt, List list, int i, ShaderKt shaderKt2, accessgetLayerBlockp accessgetlayerblockp, accessquadraticTojd accessquadratictojd, boolean z) {
        this.write = shaderKt;
        this.RemoteActionCompatParcelizer = list;
        this.read = i;
        this.MediaMetadataCompat = shaderKt2;
        this.MediaSessionCompatQueueItem = accessgetlayerblockp;
        this.serializer = accessquadratictojd;
        this.IconCompatParcelizer = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object proceed(ContinuationImpl continuationImpl) throws Throwable {
        getLinesr_lszbg getlinesr_lszbg;
        EngineInterceptor engineInterceptor;
        if (continuationImpl instanceof getLinesr_lszbg) {
            getlinesr_lszbg = (getLinesr_lszbg) continuationImpl;
            int i = getlinesr_lszbg.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                getlinesr_lszbg.write = i - Integer.MIN_VALUE;
            } else {
                getlinesr_lszbg = new getLinesr_lszbg(this, continuationImpl);
            }
        } else {
            getlinesr_lszbg = new getLinesr_lszbg(this, continuationImpl);
        }
        Object obj = getlinesr_lszbg.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getlinesr_lszbg.write;
        ShaderKt shaderKt = this.write;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            List list = this.RemoteActionCompatParcelizer;
            int i3 = this.read;
            EngineInterceptor engineInterceptor2 = (EngineInterceptor) list.get(i3);
            RealInterceptorChain realInterceptorChain = new RealInterceptorChain(shaderKt, this.RemoteActionCompatParcelizer, i3 + 1, this.MediaMetadataCompat, this.MediaSessionCompatQueueItem, this.serializer, this.IconCompatParcelizer);
            getlinesr_lszbg.read = engineInterceptor2;
            getlinesr_lszbg.write = 1;
            Object objIntercept = engineInterceptor2.intercept(realInterceptorChain, getlinesr_lszbg);
            if (objIntercept == coroutineSingletons) {
                return coroutineSingletons;
            }
            engineInterceptor = engineInterceptor2;
            obj = objIntercept;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            engineInterceptor = getlinesr_lszbg.read;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        RadialGradientShader8uybcMk radialGradientShader8uybcMk = (RadialGradientShader8uybcMk) obj;
        ShaderKt shaderKtWrite = radialGradientShader8uybcMk.write();
        if (shaderKtWrite.read != shaderKt.read) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read("Interceptor '", engineInterceptor, "' cannot modify the request's context.");
            return null;
        }
        if (shaderKtWrite.write == RadialGradientShader8uybcMkdefault.serializer) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read("Interceptor '", engineInterceptor, "' cannot set the request's data to null.");
            return null;
        }
        if (shaderKtWrite.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 != shaderKt.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read("Interceptor '", engineInterceptor, "' cannot modify the request's target.");
            return null;
        }
        if (shaderKtWrite.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 == shaderKt.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) {
            return radialGradientShader8uybcMk;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.read("Interceptor '", engineInterceptor, "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.");
        return null;
    }
}
