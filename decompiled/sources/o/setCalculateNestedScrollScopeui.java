package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class setCalculateNestedScrollScopeui {
    public static final setCalculateNestedScrollScopeui serializer = new setCalculateNestedScrollScopeui();
    public final ConcurrentHashMap read = new ConcurrentHashMap();
    public final getZenkakuHankaruEK5gGoQ IconCompatParcelizer = new getZenkakuHankaruEK5gGoQ(1);

    public final getDispatcher IconCompatParcelizer(Class cls) {
        getDispatcher getdispatcherWrite;
        Charset charset = accessonPreScrollOzD1aCkjd.write;
        if (cls == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.read;
        getDispatcher getdispatcher = (getDispatcher) concurrentHashMap.get(cls);
        if (getdispatcher != null) {
            return getdispatcher;
        }
        getZenkakuHankaruEK5gGoQ getzenkakuhankaruek5ggoq = this.IconCompatParcelizer;
        getzenkakuhankaruek5ggoq.getClass();
        onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard = getConnection.write;
        SoftwareKeyboardInterceptionModifierKt.class.isAssignableFrom(cls);
        NestedScrollDispatcherdispatchPostFling1 nestedScrollDispatcherdispatchPostFling1Serializer = ((getZenkakuHankaruEK5gGoQ) getzenkakuhankaruek5ggoq.write).serializer(cls);
        if ((nestedScrollDispatcherdispatchPostFling1Serializer.read & 2) == 2) {
            onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard2 = getConnection.write;
            onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard3 = SoftKeyboardInterceptionElement.write;
            getdispatcherWrite = new setLastKnownParentNodeui(oninterceptkeybeforesoftkeyboard2, nestedScrollDispatcherdispatchPostFling1Serializer.serializer);
        } else {
            int i = NestedScrollDispatchercalculateNestedScrollScope1.serializer;
            int i2 = dispatchPostFlingRZ2iAVY.serializer;
            onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard4 = getConnection.write;
            onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard5 = nestedScrollDispatcherdispatchPostFling1Serializer.serializer() - 1 != 1 ? SoftKeyboardInterceptionElement.write : null;
            int i3 = getLastKnownParentNodeui.serializer;
            getdispatcherWrite = getNestedScrollNodeui.write(nestedScrollDispatcherdispatchPostFling1Serializer, oninterceptkeybeforesoftkeyboard4, oninterceptkeybeforesoftkeyboard5);
        }
        getDispatcher getdispatcher2 = (getDispatcher) concurrentHashMap.putIfAbsent(cls, getdispatcherWrite);
        return getdispatcher2 != null ? getdispatcher2 : getdispatcherWrite;
    }
}
