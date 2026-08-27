package com.google.firebase.inappmessaging.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import io.reactivex.subjects.BehaviorSubject;
import io.sentry.Sentry$$ExternalSyntheticLambda5;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;

/* JADX INFO: loaded from: classes2.dex */
public final class ForegroundNotifier implements Application.ActivityLifecycleCallbacks {
    public Sentry$$ExternalSyntheticLambda5 serializer;
    public final Handler read = new Handler();
    public boolean IconCompatParcelizer = false;
    public boolean write = true;
    public final BehaviorSubject RemoteActionCompatParcelizer = new BehaviorSubject();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.write = true;
        Sentry$$ExternalSyntheticLambda5 sentry$$ExternalSyntheticLambda5 = this.serializer;
        Handler handler = this.read;
        if (sentry$$ExternalSyntheticLambda5 != null) {
            handler.removeCallbacks(sentry$$ExternalSyntheticLambda5);
        }
        Sentry$$ExternalSyntheticLambda5 sentry$$ExternalSyntheticLambda6 = new Sentry$$ExternalSyntheticLambda5(9, this);
        this.serializer = sentry$$ExternalSyntheticLambda6;
        handler.postDelayed(sentry$$ExternalSyntheticLambda6, 1000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.write = false;
        boolean z = this.IconCompatParcelizer;
        this.IconCompatParcelizer = true;
        Sentry$$ExternalSyntheticLambda5 sentry$$ExternalSyntheticLambda5 = this.serializer;
        if (sentry$$ExternalSyntheticLambda5 != null) {
            this.read.removeCallbacks(sentry$$ExternalSyntheticLambda5);
        }
        if (z) {
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.serializer();
        this.RemoteActionCompatParcelizer.onNext("ON_FOREGROUND");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
