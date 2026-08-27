package kotlin.jvm.internal;

import o.displayInAppMessagelambda1;
import o.pauseWebviewIfNecessarylambda11;
import o.pauseWebviewIfNecessarylambda12;
import o.pauseWebviewIfNecessarylambda13;
import o.r8lambdazxPNsZGruxCOAUiDSW5M6U3Nq4Y;
import o.registerInAppMessageManagerlambda1;
import o.registerInAppMessageManagerlambda7;
import o.requestDisplayInAppMessagelambda1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MutablePropertyReference0 extends r8lambdazxPNsZGruxCOAUiDSW5M6U3Nq4Y implements registerInAppMessageManagerlambda7 {
    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public Object invoke() {
        return get();
    }

    @Override // kotlin.jvm.internal.CallableReference
    public pauseWebviewIfNecessarylambda11 computeReflected() {
        displayInAppMessagelambda1.IconCompatParcelizer.getClass();
        return this;
    }

    @Override // o.registerInAppMessageManagerlambda7
    public Object getDelegate() {
        return ((MutablePropertyReference0) getReflected()).getDelegate();
    }

    @Override // o.registerInAppMessageManagerlambda7
    /* JADX INFO: renamed from: getGetter, reason: collision with other method in class */
    public requestDisplayInAppMessagelambda1 mo5143getGetter() {
        ((MutablePropertyReference0) getReflected()).mo5143getGetter();
        return null;
    }

    public pauseWebviewIfNecessarylambda13 getSetter() {
        ((MutablePropertyReference0) getReflected()).getSetter();
        return null;
    }

    public /* bridge */ /* synthetic */ pauseWebviewIfNecessarylambda12 getGetter() {
        mo5143getGetter();
        return null;
    }

    /* JADX INFO: renamed from: getSetter, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ registerInAppMessageManagerlambda1 m5144getSetter() {
        getSetter();
        return null;
    }
}
