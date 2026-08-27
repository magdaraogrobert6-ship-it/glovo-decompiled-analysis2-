package coil3.compose;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import coil3.ExtrasKt;
import coil3.RealImageLoader;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ImageShaderF49vj9s;
import o.PathFillType;
import o.RadialGradientShader8uybcMk;
import o.ShaderKt;
import o.accessrewindjd;
import o.dashPathEffect;
import o.getColor0d7_KjUannotations;
import o.stampedPathEffect7aD1DOk;

/* JADX INFO: loaded from: classes.dex */
public final class AsyncImagePreviewHandler$Companion$Default$1 implements PathFillType {
    public static final AsyncImagePreviewHandler$Companion$Default$1 IconCompatParcelizer = new AsyncImagePreviewHandler$Companion$Default$1();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object handle(RealImageLoader realImageLoader, ShaderKt shaderKt, ContinuationImpl continuationImpl) {
        stampedPathEffect7aD1DOk stampedpatheffect7ad1dok;
        if (continuationImpl instanceof stampedPathEffect7aD1DOk) {
            stampedpatheffect7ad1dok = (stampedPathEffect7aD1DOk) continuationImpl;
            int i = stampedpatheffect7ad1dok.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                stampedpatheffect7ad1dok.write = i - Integer.MIN_VALUE;
            } else {
                stampedpatheffect7ad1dok = new stampedPathEffect7aD1DOk(this, continuationImpl);
            }
        } else {
            stampedpatheffect7ad1dok = new stampedPathEffect7aD1DOk(this, continuationImpl);
        }
        Object objSerializer = stampedpatheffect7ad1dok.serializer;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stampedpatheffect7ad1dok.write;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objSerializer);
            stampedpatheffect7ad1dok.RemoteActionCompatParcelizer = shaderKt;
            stampedpatheffect7ad1dok.write = 1;
            objSerializer = realImageLoader.serializer(shaderKt, stampedpatheffect7ad1dok);
            if (objSerializer == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            shaderKt = stampedpatheffect7ad1dok.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(objSerializer);
        }
        RadialGradientShader8uybcMk radialGradientShader8uybcMk = (RadialGradientShader8uybcMk) objSerializer;
        if (radialGradientShader8uybcMk instanceof getColor0d7_KjUannotations) {
            getColor0d7_KjUannotations getcolor0d7_kjuannotations = (getColor0d7_KjUannotations) radialGradientShader8uybcMk;
            return new AsyncImagePainter$State$Success(dashPathEffect.RemoteActionCompatParcelizer(getcolor0d7_kjuannotations.read, shaderKt.read, DrawScope.Companion.m1307getDefaultFilterQualityfv9h1I()), getcolor0d7_kjuannotations);
        }
        if (!(radialGradientShader8uybcMk instanceof ImageShaderF49vj9s)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        ImageShaderF49vj9s imageShaderF49vj9s = (ImageShaderF49vj9s) radialGradientShader8uybcMk;
        accessrewindjd accessrewindjdVar = imageShaderF49vj9s.RemoteActionCompatParcelizer;
        return new AsyncImagePainter$State$Error(accessrewindjdVar != null ? dashPathEffect.RemoteActionCompatParcelizer(accessrewindjdVar, shaderKt.read, DrawScope.Companion.m1307getDefaultFilterQualityfv9h1I()) : null, imageShaderF49vj9s);
    }
}
