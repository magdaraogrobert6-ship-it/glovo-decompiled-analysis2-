package androidx.window.core;

import o.Float16Kt;
import o.getGraphicsLayer;
import o.onContentCardClicked;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class ValidSpecification {
    public final getGraphicsLayer IconCompatParcelizer;
    public final /* synthetic */ int read = 1;
    public final Object serializer;
    public final Object write;

    public ValidSpecification(Object obj, String str, Float16Kt float16Kt, getGraphicsLayer getgraphicslayer) {
        obj.getClass();
        getgraphicslayer.getClass();
        this.serializer = obj;
        this.IconCompatParcelizer = getgraphicslayer;
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(str + " value: " + obj);
        StackTraceElement[] stackTrace = windowStrictModeException.getStackTrace();
        stackTrace.getClass();
        windowStrictModeException.setStackTrace((StackTraceElement[]) onContentCardClicked.read(2, stackTrace).toArray(new StackTraceElement[0]));
        this.write = windowStrictModeException;
    }

    public final ValidSpecification write(String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (this.read != 0) {
            return this;
        }
        Object obj = this.serializer;
        return ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(obj)).booleanValue() ? this : new ValidSpecification(obj, str, (Float16Kt) this.write, this.IconCompatParcelizer);
    }

    public ValidSpecification(Object obj, getGraphicsLayer getgraphicslayer, Float16Kt float16Kt) {
        obj.getClass();
        getgraphicslayer.getClass();
        this.serializer = obj;
        this.IconCompatParcelizer = getgraphicslayer;
        this.write = float16Kt;
    }
}
