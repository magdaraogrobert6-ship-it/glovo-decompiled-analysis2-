package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import retrofit2.adapter.rxjava2.RxJava2CallAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class ProtoFeatureOrErrorMsg extends FwFClientExtensionKtgetVariations1 {
    @Override // o.FwFClientExtensionKtgetVariations1
    public final useEvaluationsCache read(Type type, Annotation[] annotationArr, getHoldoutVariation getholdoutvariation) {
        Type type2;
        boolean z;
        boolean z2;
        String str;
        Class clsWrite = getKind.write(type);
        if (clsWrite == Completable.class) {
            return new RxJava2CallAdapter(Void.class, false, true, false, false, false, true);
        }
        boolean z3 = clsWrite == Flowable.class;
        boolean z4 = clsWrite == Single.class;
        boolean z5 = clsWrite == Maybe.class;
        if (clsWrite != Observable.class && !z3 && !z4 && !z5) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            if (z3) {
                str = "Flowable";
            } else if (z4) {
                str = "Single";
            } else {
                str = z5 ? "Maybe" : "Observable";
            }
            throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
        }
        Type type3 = getKind.read(0, (ParameterizedType) type);
        Class clsWrite2 = getKind.write(type3);
        if (clsWrite2 == getHoldoutVariationName.class) {
            if (!(type3 instanceof ParameterizedType)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
                return null;
            }
            type2 = getKind.read(0, (ParameterizedType) type3);
            z2 = false;
            z = false;
        } else if (clsWrite2 != com.huawei.hmf.tasks.a.j.class) {
            type2 = type3;
            z = true;
            z2 = false;
        } else {
            if (!(type3 instanceof ParameterizedType)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
                return null;
            }
            type2 = getKind.read(0, (ParameterizedType) type3);
            z2 = true;
            z = false;
        }
        return new RxJava2CallAdapter(type2, z2, z, z3, z4, z5, false);
    }
}
