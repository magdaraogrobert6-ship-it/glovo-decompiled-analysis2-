package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public final class ProtoFeatureMsgCompanion extends accessgetInitialDelayp {
    public final Gson serializer;

    public ProtoFeatureMsgCompanion(Gson gson) {
        this.serializer = gson;
    }

    public static ProtoFeatureMsgCompanion IconCompatParcelizer(Gson gson) {
        if (gson != null) {
            return new ProtoFeatureMsgCompanion(gson);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("gson == null");
        return null;
    }

    @Override // o.accessgetInitialDelayp
    public final FwFClientKt RemoteActionCompatParcelizer(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, getHoldoutVariation getholdoutvariation) {
        TypeToken<?> typeToken = TypeToken.get(type);
        Gson gson = this.serializer;
        return new ProtoFeatureMsgserializer(gson, gson.getAdapter(typeToken));
    }

    @Override // o.accessgetInitialDelayp
    public final FwFClientKt read(Type type, Annotation[] annotationArr, getHoldoutVariation getholdoutvariation) {
        TypeToken<?> typeToken = TypeToken.get(type);
        Gson gson = this.serializer;
        return new ProtoFeatureMsggetHoldouts1(gson, 0, gson.getAdapter(typeToken));
    }
}
