package o;

import android.app.Application;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.lang.reflect.InvocationTargetException;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
public final class asImageBitmap extends setFromtUYjHk {
    public static final speculativeHit IconCompatParcelizer = new speculativeHit(4);
    public static asImageBitmap serializer;
    public final Application read;

    public asImageBitmap(Application application) {
        this.read = application;
    }

    public final androidx.lifecycle.ViewModel serializer(Class cls, Application application) {
        if (!saveLayer.class.isAssignableFrom(cls)) {
            return (androidx.lifecycle.ViewModel) MathKt.RemoteActionCompatParcelizer(new Object[]{cls}, extractAuthorizationHeader.write(), -430013990, 430013990, extractAuthorizationHeader.write(), extractAuthorizationHeader.write(), extractAuthorizationHeader.write());
        }
        try {
            androidx.lifecycle.ViewModel viewModel = (androidx.lifecycle.ViewModel) cls.getConstructor(Application.class).newInstance(application);
            viewModel.getClass();
            return viewModel;
        } catch (IllegalAccessException e) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(c8$$ExternalSyntheticOutline0.m(cls, "Cannot create an instance of "), e);
            return null;
        } catch (InstantiationException e2) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(c8$$ExternalSyntheticOutline0.m(cls, "Cannot create an instance of "), e2);
            return null;
        } catch (NoSuchMethodException e3) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(c8$$ExternalSyntheticOutline0.m(cls, "Cannot create an instance of "), e3);
            return null;
        } catch (InvocationTargetException e4) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(c8$$ExternalSyntheticOutline0.m(cls, "Cannot create an instance of "), e4);
            return null;
        }
    }

    @Override // o.setFromtUYjHk, o.createImageBitmap
    public final androidx.lifecycle.ViewModel serializer(Class cls) {
        Application application = this.read;
        if (application != null) {
            return serializer(cls, application);
        }
        IBraze$$ExternalSyntheticBUOutline0.m("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override // o.setFromtUYjHk, o.createImageBitmap
    public final androidx.lifecycle.ViewModel serializer(Class cls, setStrokeMiterLimit setstrokemiterlimit) {
        if (this.read != null) {
            return serializer(cls);
        }
        Application application = (Application) setstrokemiterlimit.read.get(IconCompatParcelizer);
        if (application != null) {
            return serializer(cls, application);
        }
        if (!saveLayer.class.isAssignableFrom(cls)) {
            return (androidx.lifecycle.ViewModel) MathKt.RemoteActionCompatParcelizer(new Object[]{cls}, extractAuthorizationHeader.write(), -430013990, 430013990, extractAuthorizationHeader.write(), extractAuthorizationHeader.write(), extractAuthorizationHeader.write());
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }
}
