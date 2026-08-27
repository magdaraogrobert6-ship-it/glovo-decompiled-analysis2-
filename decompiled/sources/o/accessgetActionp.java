package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class accessgetActionp extends FwFClientExtensionKtgetVariations1 {
    public final Executor IconCompatParcelizer;

    public accessgetActionp(Executor executor) {
        this.IconCompatParcelizer = executor;
    }

    @Override // o.FwFClientExtensionKtgetVariations1
    public final useEvaluationsCache read(Type type, Annotation[] annotationArr, getHoldoutVariation getholdoutvariation) {
        if (getKind.write(type) != syncCustomerProfile.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new OkHttpCall$1(getKind.read(0, (ParameterizedType) type), getKind.read(annotationArr, getRules.class) ? null : this.IconCompatParcelizer);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        return null;
    }
}
