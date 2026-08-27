package o;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class getBitmaplambda0 extends calculateInSampleSizelambda1 {
    public final /* synthetic */ Method IconCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Class serializer;

    public final String toString() {
        return this.serializer.getName();
    }

    public getBitmaplambda0(Method method, Class cls, int i) {
        this.IconCompatParcelizer = method;
        this.serializer = cls;
        this.read = i;
    }

    @Override // o.calculateInSampleSizelambda1
    public final Object serializer() {
        return this.IconCompatParcelizer.invoke(null, this.serializer, Integer.valueOf(this.read));
    }
}
