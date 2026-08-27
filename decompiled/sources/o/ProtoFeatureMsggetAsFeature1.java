package o;

import io.reactivex.subjects.BehaviorSubject;
import io.sentry.JsonObjectSerializer;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public final class ProtoFeatureMsggetAsFeature1 extends accessgetInitialDelayp {
    public final InAppMessageHtmlBaseView RemoteActionCompatParcelizer;
    public final JsonObjectSerializer read;

    public ProtoFeatureMsggetAsFeature1(InAppMessageHtmlBaseView inAppMessageHtmlBaseView, JsonObjectSerializer jsonObjectSerializer) {
        this.RemoteActionCompatParcelizer = inAppMessageHtmlBaseView;
        this.read = jsonObjectSerializer;
    }

    @Override // o.accessgetInitialDelayp
    public final FwFClientKt RemoteActionCompatParcelizer(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, getHoldoutVariation getholdoutvariation) {
        type.getClass();
        annotationArr2.getClass();
        JsonObjectSerializer jsonObjectSerializer = this.read;
        return new r8lambdadeOzq815xUUwmlLYYvm_QV79QY(this.RemoteActionCompatParcelizer, (setGraphicModalMaxWidthDp) pauseWebviewIfNecessarylambda10.read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{((r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc) jsonObjectSerializer.jsonReflectionObjectSerializer).RemoteActionCompatParcelizer, type}, BehaviorSubject.BehaviorDisposable.write(), BehaviorSubject.BehaviorDisposable.write(), 1430528806, -1430528805, BehaviorSubject.BehaviorDisposable.write()), jsonObjectSerializer, 17);
    }

    @Override // o.accessgetInitialDelayp
    public final FwFClientKt read(Type type, Annotation[] annotationArr, getHoldoutVariation getholdoutvariation) {
        annotationArr.getClass();
        JsonObjectSerializer jsonObjectSerializer = this.read;
        return new ProtoFeatureMsggetHoldouts1((setGraphicModalMaxWidthDp) pauseWebviewIfNecessarylambda10.read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{((r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc) jsonObjectSerializer.jsonReflectionObjectSerializer).RemoteActionCompatParcelizer, type}, BehaviorSubject.BehaviorDisposable.write(), BehaviorSubject.BehaviorDisposable.write(), 1430528806, -1430528805, BehaviorSubject.BehaviorDisposable.write()), 1, jsonObjectSerializer);
    }
}
