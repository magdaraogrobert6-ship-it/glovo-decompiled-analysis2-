package o;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class calculateInSampleSizelambda2 extends calculateInSampleSizelambda1 {
    public final /* synthetic */ Object read;
    public final /* synthetic */ Class serializer;
    public final /* synthetic */ Method write;

    @Override // o.calculateInSampleSizelambda1
    public final Object serializer() {
        return this.write.invoke(this.read, this.serializer);
    }

    public final String toString() {
        return this.serializer.getName();
    }

    public calculateInSampleSizelambda2(Method method, Object obj, Class cls) {
        this.write = method;
        this.read = obj;
        this.serializer = cls;
    }
}
