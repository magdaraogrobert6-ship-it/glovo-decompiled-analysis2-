package o;

import com.google.re2j.Parser;
import com.roadrunner.common.data.api.MapApiError;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import retrofit2.adapter.rxjava2.RxJava2CallAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class r1 extends FwFClientExtensionKtgetVariations1 {
    private static int read = 1;
    private static int write;
    public final ProtoFeatureOrErrorMsg RemoteActionCompatParcelizer = new ProtoFeatureOrErrorMsg();
    public final MapApiError serializer;

    public r1(MapApiError mapApiError) {
        this.serializer = mapApiError;
    }

    @Override // o.FwFClientExtensionKtgetVariations1
    public final useEvaluationsCache read(Type type, Annotation[] annotationArr, getHoldoutVariation getholdoutvariation) {
        int i = 2 % 2;
        int i2 = read + 67;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        type.getClass();
        annotationArr.getClass();
        String string = type.toString();
        if (!hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) string, (CharSequence) String.valueOf(displayInAppMessagelambda1.serializer(Completable.class).RemoteActionCompatParcelizer()), false) && !hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) string, (CharSequence) String.valueOf(displayInAppMessagelambda1.serializer(Observable.class).RemoteActionCompatParcelizer()), false)) {
            int i4 = write + 59;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0 ? !hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) string, (CharSequence) String.valueOf(displayInAppMessagelambda1.serializer(Flowable.class).RemoteActionCompatParcelizer()), false) : !hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) string, (CharSequence) String.valueOf(displayInAppMessagelambda1.serializer(Flowable.class).RemoteActionCompatParcelizer()), true)) {
                if (!hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) string, (CharSequence) String.valueOf(displayInAppMessagelambda1.serializer(Maybe.class).RemoteActionCompatParcelizer()), false)) {
                    if (!hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) string, (CharSequence) String.valueOf(displayInAppMessagelambda1.serializer(Single.class).RemoteActionCompatParcelizer()), false)) {
                        return null;
                    }
                    int i5 = read + 51;
                    write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        int i6 = 5 % 5;
                    }
                }
            }
        }
        return new Parser.Pair((RxJava2CallAdapter) this.RemoteActionCompatParcelizer.read(type, annotationArr, getholdoutvariation), 25, this.serializer);
    }
}
