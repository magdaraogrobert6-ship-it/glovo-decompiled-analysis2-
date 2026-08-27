package o;

import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class calculateInSampleSize extends calculateInSampleSizelambda1 {
    public final /* synthetic */ Class read;
    public final /* synthetic */ Executable serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ calculateInSampleSize(Executable executable, Class cls, int i) {
        this.write = i;
        this.serializer = executable;
        this.read = cls;
    }

    public final String toString() {
        int i = this.write;
        Class cls = this.read;
        return i != 0 ? cls.getName() : cls.getName();
    }

    @Override // o.calculateInSampleSizelambda1
    public final Object serializer() {
        int i = this.write;
        Executable executable = this.serializer;
        return i != 0 ? ((Method) executable).invoke(null, this.read, Object.class) : ((Constructor) executable).newInstance(null);
    }
}
