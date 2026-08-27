package o;

import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import java.nio.charset.Charset;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class getZenkakuHankaruEK5gGoQ implements dispatchPreScrollOzD1aCk {
    public static final onInterceptKeyBeforeSoftKeyboard read = new onInterceptKeyBeforeSoftKeyboard(3);
    public final Object write;

    public void read(int i, Object obj, getDispatcher getdispatcher) {
        getOnPreKeyEvent getonprekeyevent = (getOnPreKeyEvent) obj;
        KeyInputModifierKt keyInputModifierKt = (KeyInputModifierKt) this.write;
        keyInputModifierKt.serializer((i << 3) | 2);
        keyInputModifierKt.serializer(getonprekeyevent.IconCompatParcelizer(getdispatcher));
        getdispatcher.serializer(getonprekeyevent, keyInputModifierKt.RemoteActionCompatParcelizer);
    }

    public void write(int i, Object obj, getDispatcher getdispatcher) {
        KeyInputModifierKt keyInputModifierKt = (KeyInputModifierKt) this.write;
        keyInputModifierKt.read(i, 3);
        getdispatcher.serializer((getOnPreKeyEvent) obj, keyInputModifierKt.RemoteActionCompatParcelizer);
        keyInputModifierKt.read(i, 4);
    }

    public getZenkakuHankaruEK5gGoQ(int i) {
        if (i != 1) {
            this.write = new HashMap();
            return;
        }
        setCalculateNestedScrollScopeui setcalculatenestedscrollscopeui = setCalculateNestedScrollScopeui.serializer;
        getZenkakuHankaruEK5gGoQ getzenkakuhankaruek5ggoq = new getZenkakuHankaruEK5gGoQ(onInterceptKeyBeforeSoftKeyboard.RemoteActionCompatParcelizer, read);
        Charset charset = accessonPreScrollOzD1aCkjd.write;
        this.write = getzenkakuhankaruek5ggoq;
    }

    @Override // o.dispatchPreScrollOzD1aCk
    public NestedScrollDispatcherdispatchPostFling1 serializer(Class cls) {
        for (int i = 0; i < 2; i++) {
            dispatchPreScrollOzD1aCk dispatchprescrollozd1ack = ((dispatchPreScrollOzD1aCk[]) this.write)[i];
            if (dispatchprescrollozd1ack.IconCompatParcelizer(cls)) {
                return dispatchprescrollozd1ack.serializer(cls);
            }
        }
        IBraze$$ExternalSyntheticBUOutline0.m("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // o.dispatchPreScrollOzD1aCk
    public boolean IconCompatParcelizer(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((dispatchPreScrollOzD1aCk[]) this.write)[i].IconCompatParcelizer(cls)) {
                return true;
            }
        }
        return false;
    }

    public getZenkakuHankaruEK5gGoQ(dispatchPreScrollOzD1aCk... dispatchprescrollozd1ackArr) {
        this.write = dispatchprescrollozd1ackArr;
    }

    public getZenkakuHankaruEK5gGoQ(KeyInputModifierKt keyInputModifierKt) {
        Charset charset = accessonPreScrollOzD1aCkjd.write;
        this.write = keyInputModifierKt;
        keyInputModifierKt.RemoteActionCompatParcelizer = this;
    }
}
