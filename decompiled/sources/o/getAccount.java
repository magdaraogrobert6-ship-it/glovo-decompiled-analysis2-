package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class getAccount extends accessgetInitialDelayp {
    public final getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations write;

    public getAccount(getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations getruntime_memory_image_loader_usage_quotientannotations) {
        this.write = getruntime_memory_image_loader_usage_quotientannotations;
    }

    public static Set read(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(getDestinationHeightAndWidthPixelslambda0.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : Collections.EMPTY_SET;
    }

    @Override // o.accessgetInitialDelayp
    public final FwFClientKt RemoteActionCompatParcelizer(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, getHoldoutVariation getholdoutvariation) {
        return new ProtoFeatureOrErrorMsgserializer(this.write.read(type, read(annotationArr), null));
    }

    @Override // o.accessgetInitialDelayp
    public final FwFClientKt read(Type type, Annotation[] annotationArr, getHoldoutVariation getholdoutvariation) {
        return new ProtoFeaturesMsg(this.write.read(type, read(annotationArr), null));
    }
}
