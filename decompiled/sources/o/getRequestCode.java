package o;

import android.view.View;
import android.view.Window;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.lang.reflect.Field;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getRequestCode {
    static {
        LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, JsonUtils.IconCompatParcelizer);
    }

    public static final Window write(View view) {
        Field field;
        view.getClass();
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = r8lambdaBpeNKPa9u190VfNoWTWc7zYsu4.write;
        View rootView = view.getRootView();
        rootView.getClass();
        Class cls = (Class) r8lambdaBpeNKPa9u190VfNoWTWc7zYsu4.write.MediaSessionCompatResultReceiverWrapper();
        if (cls == null || !cls.isInstance(rootView) || (field = (Field) r8lambdaBpeNKPa9u190VfNoWTWc7zYsu4.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper()) == null) {
            return null;
        }
        Object obj = field.get(rootView);
        if (obj != null) {
            return (Window) obj;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("null cannot be cast to non-null type android.view.Window");
        return null;
    }
}
