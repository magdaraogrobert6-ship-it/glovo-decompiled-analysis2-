package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class onInterceptKeyBeforeSoftKeyboard implements dispatchPreScrollOzD1aCk {
    public static final onInterceptKeyBeforeSoftKeyboard RemoteActionCompatParcelizer = new onInterceptKeyBeforeSoftKeyboard(0);
    public final /* synthetic */ int read;

    public /* synthetic */ onInterceptKeyBeforeSoftKeyboard(int i) {
        this.read = i;
    }

    public static final getScopeui write(Object obj, Object obj2) {
        getScopeui getscopeuiSerializer = (getScopeui) obj;
        getScopeui getscopeui = (getScopeui) obj2;
        if (!getscopeui.isEmpty()) {
            if (!getscopeuiSerializer.serializer) {
                getscopeuiSerializer = getscopeuiSerializer.serializer();
            }
            getscopeuiSerializer.RemoteActionCompatParcelizer();
            if (!getscopeui.isEmpty()) {
                getscopeuiSerializer.putAll(getscopeui);
            }
        }
        return getscopeuiSerializer;
    }

    @Override // o.dispatchPreScrollOzD1aCk
    public boolean IconCompatParcelizer(Class cls) {
        if (this.read != 0) {
            return false;
        }
        return SoftwareKeyboardInterceptionModifierKt.class.isAssignableFrom(cls);
    }

    @Override // o.dispatchPreScrollOzD1aCk
    public NestedScrollDispatcherdispatchPostFling1 serializer(Class cls) {
        if (this.read != 0) {
            throw new IllegalStateException("This should never be called.");
        }
        if (SoftwareKeyboardInterceptionModifierKt.class.isAssignableFrom(cls)) {
            try {
                return (NestedScrollDispatcherdispatchPostFling1) SoftwareKeyboardInterceptionModifierKt.RemoteActionCompatParcelizer(cls.asSubclass(SoftwareKeyboardInterceptionModifierKt.class)).RemoteActionCompatParcelizer(3);
            } catch (Exception e) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Unable to get message info for ".concat(cls.getName()), e);
            }
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unsupported message type: ".concat(cls.getName()));
        }
        return null;
    }
}
