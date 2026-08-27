package com.google.firebase.components;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.local.IidStore;
import io.sentry.android.core.SentryLogcatAdapter;
import java.lang.reflect.InvocationTargetException;
import o.AbstractComposeViewExternalSyntheticLambda0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ComponentDiscovery$$ExternalSyntheticLambda0 implements AbstractComposeViewExternalSyntheticLambda0 {
    public final /* synthetic */ Object read;
    public final /* synthetic */ int write;

    public /* synthetic */ ComponentDiscovery$$ExternalSyntheticLambda0(int i, Object obj) {
        this.write = i;
        this.read = obj;
    }

    @Override // o.AbstractComposeViewExternalSyntheticLambda0
    public final Object write() {
        int i = this.write;
        Object obj = this.read;
        if (i != 0) {
            return i != 1 ? new IidStore((FirebaseApp) obj) : (ComponentRegistrar) obj;
        }
        String str = (String) obj;
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
            }
            throw new InvalidRegistrarException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
        } catch (ClassNotFoundException unused) {
            SentryLogcatAdapter.IconCompatParcelizer("ComponentDiscovery", "Class " + str + " is not an found.");
            return null;
        } catch (IllegalAccessException e) {
            throw new InvalidRegistrarException(ff$$ExternalSyntheticOutline0.m("Could not instantiate ", str, "."), e);
        } catch (InstantiationException e2) {
            throw new InvalidRegistrarException(ff$$ExternalSyntheticOutline0.m("Could not instantiate ", str, "."), e2);
        } catch (NoSuchMethodException e3) {
            throw new InvalidRegistrarException(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Could not instantiate ", str), e3);
        } catch (InvocationTargetException e4) {
            throw new InvalidRegistrarException(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Could not instantiate ", str), e4);
        }
    }
}
