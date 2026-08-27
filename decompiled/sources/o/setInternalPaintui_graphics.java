package o;

import bo.app.b8$$ExternalSyntheticLambda4;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class setInternalPaintui_graphics {
    public static final androidx.compose.runtime.ProvidableCompositionLocal write;

    static {
        Object isitemdismissable;
        try {
            ClassLoader classLoader = accessisRenderNodeCompatiblecp.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (!(annotations[i] instanceof onItemDismisslambda0)) {
                        i++;
                    }
                } else {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof androidx.compose.runtime.ProvidableCompositionLocal) {
                        isitemdismissable = (androidx.compose.runtime.ProvidableCompositionLocal) objInvoke;
                        break;
                    }
                }
                isitemdismissable = null;
                break;
            }
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        androidx.compose.runtime.ProvidableCompositionLocal setcurrentsemanticsnodesui = (androidx.compose.runtime.ProvidableCompositionLocal) (isitemdismissable instanceof isItemDismissable ? null : isitemdismissable);
        if (setcurrentsemanticsnodesui == null) {
            setcurrentsemanticsnodesui = new setCurrentSemanticsNodesui(new b8$$ExternalSyntheticLambda4(19));
        }
        write = setcurrentsemanticsnodesui;
    }
}
