package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.util.List;
import java.util.Map;
import o.displayInAppMessagelambda1;
import o.pauseWebviewIfNecessarylambda1;
import o.pauseWebviewIfNecessarylambda11;
import o.r8lambdaqDiuGVSxbcZkuk6c72GH5hp4QfU;
import o.r8lambdatZCIhOZ7wAy4U965kw0Q8vORJT8;
import o.r8lambdayayv2YkI5Itr3KGAQ7gqfarKs;
import o.registerInAppMessageManagerlambda50;
import o.requestDisplayInAppMessagelambda5;

/* JADX INFO: loaded from: classes4.dex */
public abstract class CallableReference implements pauseWebviewIfNecessarylambda11, Serializable {
    public static final Object MediaSessionCompatQueueItem = r8lambdaqDiuGVSxbcZkuk6c72GH5hp4QfU.IconCompatParcelizer;
    private final Class IconCompatParcelizer;
    public final Object MediaMetadataCompat;
    private final String RemoteActionCompatParcelizer;
    private transient pauseWebviewIfNecessarylambda11 read;
    private final boolean serializer;
    private final String write;

    public abstract pauseWebviewIfNecessarylambda11 computeReflected();

    public Object getBoundReceiver() {
        return this.MediaMetadataCompat;
    }

    @Override // o.pauseWebviewIfNecessarylambda11
    public String getName() {
        return this.RemoteActionCompatParcelizer;
    }

    public abstract pauseWebviewIfNecessarylambda11 getReflected();

    public String getSignature() {
        return this.write;
    }

    public CallableReference(Object obj, Class cls, String str, String str2, boolean z) {
        this.MediaMetadataCompat = obj;
        this.IconCompatParcelizer = cls;
        this.RemoteActionCompatParcelizer = str;
        this.write = str2;
        this.serializer = z;
    }

    @Override // o.pauseWebviewIfNecessarylambda11
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // o.pauseWebviewIfNecessarylambda11
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public pauseWebviewIfNecessarylambda11 compute() {
        pauseWebviewIfNecessarylambda11 pausewebviewifnecessarylambda11 = this.read;
        if (pausewebviewifnecessarylambda11 != null) {
            return pausewebviewifnecessarylambda11;
        }
        pauseWebviewIfNecessarylambda11 pausewebviewifnecessarylambda11ComputeReflected = computeReflected();
        this.read = pausewebviewifnecessarylambda11ComputeReflected;
        return pausewebviewifnecessarylambda11ComputeReflected;
    }

    public GenericDeclaration findJavaDeclaration() {
        return r8lambdatZCIhOZ7wAy4U965kw0Q8vORJT8.RemoteActionCompatParcelizer(getOwner(), getSignature());
    }

    @Override // o.pauseWebviewIfNecessarylambda0
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    @Override // o.pauseWebviewIfNecessarylambda11
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    @Override // o.pauseWebviewIfNecessarylambda11
    public registerInAppMessageManagerlambda50 getReturnType() {
        return getReflected().getReturnType();
    }

    @Override // o.pauseWebviewIfNecessarylambda11
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // o.pauseWebviewIfNecessarylambda11
    public requestDisplayInAppMessagelambda5 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // o.pauseWebviewIfNecessarylambda11
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // o.pauseWebviewIfNecessarylambda11
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // o.pauseWebviewIfNecessarylambda11
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // o.pauseWebviewIfNecessarylambda11
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public pauseWebviewIfNecessarylambda1 getOwner() {
        Class cls = this.IconCompatParcelizer;
        if (cls == null) {
            return null;
        }
        if (!this.serializer) {
            return displayInAppMessagelambda1.serializer(cls);
        }
        displayInAppMessagelambda1.IconCompatParcelizer.getClass();
        return new r8lambdayayv2YkI5Itr3KGAQ7gqfarKs(cls);
    }
}
