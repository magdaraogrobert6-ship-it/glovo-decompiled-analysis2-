package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class FwFClientExtensionKtgetVariationevalResult1 extends FwFClientExtensionKtgetVariations1 {
    @Override // o.FwFClientExtensionKtgetVariations1
    public final useEvaluationsCache read(Type type, Annotation[] annotationArr, getHoldoutVariation getholdoutvariation) {
        if (getKind.write(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
            return null;
        }
        int i = 0;
        Type type2 = getKind.read(0, (ParameterizedType) type);
        if (getKind.write(type2) != getHoldoutVariationName.class) {
            return new FwFClientExtensionKtgetVariation1(i, type2);
        }
        if (type2 instanceof ParameterizedType) {
            return new FwFClientExtensionKtgetVariation1(1, getKind.read(0, (ParameterizedType) type2));
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        return null;
    }
}
