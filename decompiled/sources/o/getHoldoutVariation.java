package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class getHoldoutVariation {
    public final List IconCompatParcelizer;
    public final ConcurrentHashMap MediaMetadataCompat = new ConcurrentHashMap();
    public final getMessageImageView RemoteActionCompatParcelizer;
    public final Executor read;
    public final List serializer;
    public final setInAppMessageImageViewAttributes write;

    public final useEvaluationsCache IconCompatParcelizer(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.IconCompatParcelizer;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            useEvaluationsCache useevaluationscache = ((FwFClientExtensionKtgetVariations1) list.get(i)).read(type, annotationArr, this);
            if (useevaluationscache != null) {
                return useevaluationscache;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((FwFClientExtensionKtgetVariations1) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final FwFClientKt RemoteActionCompatParcelizer(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.serializer;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            FwFClientKt fwFClientKt = ((accessgetInitialDelayp) list.get(i)).read(type, annotationArr, this);
            if (fwFClientKt != null) {
                return fwFClientKt;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((accessgetInitialDelayp) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final void read(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = this.serializer;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((accessgetInitialDelayp) list.get(i)).getClass();
        }
    }

    public final FwFClientKt serializer(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = this.serializer;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            FwFClientKt fwFClientKtRemoteActionCompatParcelizer = ((accessgetInitialDelayp) list.get(i)).RemoteActionCompatParcelizer(type, annotationArr, annotationArr2, this);
            if (fwFClientKtRemoteActionCompatParcelizer != null) {
                return fwFClientKtRemoteActionCompatParcelizer;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((accessgetInitialDelayp) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public getHoldoutVariation(getMessageImageView getmessageimageview, setInAppMessageImageViewAttributes setinappmessageimageviewattributes, List list, List list2, Executor executor) {
        this.RemoteActionCompatParcelizer = getmessageimageview;
        this.write = setinappmessageimageviewattributes;
        this.serializer = list;
        this.IconCompatParcelizer = list2;
        this.read = executor;
    }

    public final Object write(Class cls) {
        if (!cls.isInterface()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("API declarations must be interfaces.");
            return null;
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls2.getName());
                if (cls2 != cls) {
                    sb.append(" which is an interface of ");
                    sb.append(cls.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new getHoldoutKeys(this, cls));
    }
}
