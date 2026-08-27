package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes4.dex */
public final class removeCustomerProfileAttributes extends accessgetInitialDelayp {
    public final /* synthetic */ int IconCompatParcelizer;

    public /* synthetic */ removeCustomerProfileAttributes(int i) {
        this.IconCompatParcelizer = i;
    }

    @Override // o.accessgetInitialDelayp
    public FwFClientKt RemoteActionCompatParcelizer(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, getHoldoutVariation getholdoutvariation) {
        if (this.IconCompatParcelizer != 0) {
            return super.RemoteActionCompatParcelizer(type, annotationArr, annotationArr2, getholdoutvariation);
        }
        if (RequestBody.class.isAssignableFrom(getKind.write(type))) {
            return sync.write;
        }
        return null;
    }

    @Override // o.accessgetInitialDelayp
    public final FwFClientKt read(Type type, Annotation[] annotationArr, getHoldoutVariation getholdoutvariation) {
        if (this.IconCompatParcelizer != 0) {
            if (getKind.write(type) != Optional.class) {
                return null;
            }
            return new setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(29, getholdoutvariation.RemoteActionCompatParcelizer(getKind.read(0, (ParameterizedType) type), annotationArr));
        }
        if (type == _get_messageWebView_lambda3.class) {
            return getKind.read(annotationArr, ProtoPrerequisiteMsg.class) ? sync.serializer : sync.RemoteActionCompatParcelizer;
        }
        if (type == Void.class) {
            return sync.IconCompatParcelizer;
        }
        if (getKind.RemoteActionCompatParcelizer && type == createFromParcel.class) {
            return getChangeVersionControl.RemoteActionCompatParcelizer;
        }
        return null;
    }
}
