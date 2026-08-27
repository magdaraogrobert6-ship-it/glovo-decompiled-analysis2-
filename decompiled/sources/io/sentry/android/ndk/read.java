package io.sentry.android.ndk;

import com.sentiance.sdk.tile.j$$ExternalSyntheticLambda1;
import io.sentry.Scopes$$ExternalSyntheticLambda0;
import io.sentry.SentryOptions;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.ndk.NativeScope;
import io.sentry.protocol.addObserverForBackInvoker;
import o.BannerView;
import o.accessdismiss;
import o.getIntentArrayWithConfiguredBackStacklambda1;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public final class read extends accessdismiss {
    public final SentryOptions RemoteActionCompatParcelizer;
    public final NativeScope write;

    public read(SentryAndroidOptions sentryAndroidOptions) {
        NativeScope nativeScope = new NativeScope();
        setNativeShader.read(sentryAndroidOptions, "The SentryOptions object is required.");
        this.RemoteActionCompatParcelizer = sentryAndroidOptions;
        this.write = nativeScope;
    }

    @Override // o.r8lambdatOXQQytFfRJJ1udVx34HO5buEo
    public final void RemoteActionCompatParcelizer(getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1) {
        SentryOptions sentryOptions = this.RemoteActionCompatParcelizer;
        try {
            sentryOptions.getExecutorService().RemoteActionCompatParcelizer(new Scopes$$ExternalSyntheticLambda0(this, 20, getintentarraywithconfiguredbackstacklambda1));
        } catch (Throwable th) {
            sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th, "Scope sync addBreadcrumb has an error.", new Object[0]);
        }
    }

    @Override // o.r8lambdatOXQQytFfRJJ1udVx34HO5buEo
    public final void serializer(addObserverForBackInvoker addobserverforbackinvoker) {
        SentryOptions sentryOptions = this.RemoteActionCompatParcelizer;
        try {
            sentryOptions.getExecutorService().RemoteActionCompatParcelizer(new Scopes$$ExternalSyntheticLambda0(this, 22, addobserverforbackinvoker));
        } catch (Throwable th) {
            sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th, "Scope sync setUser has an error.", new Object[0]);
        }
    }

    @Override // o.accessdismiss, o.r8lambdatOXQQytFfRJJ1udVx34HO5buEo
    public final void serializer(String str) {
        SentryOptions sentryOptions = this.RemoteActionCompatParcelizer;
        try {
            sentryOptions.getExecutorService().RemoteActionCompatParcelizer(new Scopes$$ExternalSyntheticLambda0(this, 21, str));
        } catch (Throwable th) {
            sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th, "Scope sync removeTag(%s) has an error.", str);
        }
    }

    @Override // o.accessdismiss, o.r8lambdatOXQQytFfRJJ1udVx34HO5buEo
    public final void write(String str, String str2) {
        SentryOptions sentryOptions = this.RemoteActionCompatParcelizer;
        try {
            sentryOptions.getExecutorService().RemoteActionCompatParcelizer(new j$$ExternalSyntheticLambda1(this, str, str2, 13));
        } catch (Throwable th) {
            sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th, "Scope sync setTag(%s) has an error.", str);
        }
    }

    @Override // o.r8lambdatOXQQytFfRJJ1udVx34HO5buEo
    public final void read(r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 r8lambdasv8cpfy2ryceslm1ayxpdavyzp0, BannerView bannerView) {
        SentryOptions sentryOptions = this.RemoteActionCompatParcelizer;
        if (r8lambdasv8cpfy2ryceslm1ayxpdavyzp0 == null) {
            return;
        }
        try {
            sentryOptions.getExecutorService().RemoteActionCompatParcelizer(new Scopes$$ExternalSyntheticLambda0(this, 23, r8lambdasv8cpfy2ryceslm1ayxpdavyzp0));
        } catch (Throwable th) {
            sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th, "Scope sync setTrace failed.", new Object[0]);
        }
    }
}
