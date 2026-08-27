package io.sentry.android.fragment;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks;
import io.sentry.SentryOptions;
import java.io.Closeable;
import java.util.Set;
import kotlinx.coroutines.DelayKt;
import o.BannerViewcreateBannerWebViewClientListener1;
import o.ItemTouchHelperAdapter;
import o.LogCustomEventStep;
import o.accessgetDismissSubscriberp;
import o.div7Ah8Wj8;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class FragmentLifecycleIntegration implements Application.ActivityLifecycleCallbacks, LogCustomEventStep, Closeable {
    public final boolean IconCompatParcelizer;
    public final Application RemoteActionCompatParcelizer;
    public final Set read;
    public SentryOptions serializer;
    public accessgetDismissSubscriberp write;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
    }

    @Override // o.LogCustomEventStep
    public final void RemoteActionCompatParcelizer(SentryOptions sentryOptions) {
        this.write = accessgetDismissSubscriberp.IconCompatParcelizer;
        this.serializer = sentryOptions;
        this.RemoteActionCompatParcelizer.registerActivityLifecycleCallbacks(this);
        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "FragmentLifecycleIntegration installed.", new Object[0]);
        DelayKt.MediaSessionCompatToken("FragmentLifecycle");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.RemoteActionCompatParcelizer.unregisterActivityLifecycleCallbacks(this);
        SentryOptions sentryOptions = this.serializer;
        if (sentryOptions != null) {
            if (sentryOptions != null) {
                sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "FragmentLifecycleIntegration removed.", new Object[0]);
            } else {
                removeNodeAtDepth.serializer("options");
                throw null;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentLifecycleIntegration(Application application, boolean z, boolean z2) {
        application.getClass();
        RemoteActionCompatParcelizer.Companion.getClass();
        Set set = z ? RemoteActionCompatParcelizer.states : null;
        this(application, (Set<? extends RemoteActionCompatParcelizer>) (set == null ? ItemTouchHelperAdapter.serializer : set), z2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        div7Ah8Wj8 supportFragmentManager;
        activity.getClass();
        FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
        if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null) {
            return;
        }
        accessgetDismissSubscriberp accessgetdismisssubscriberp = this.write;
        if (accessgetdismisssubscriberp != null) {
            supportFragmentManager.RemoteActionCompatParcelizer((FragmentManager$FragmentLifecycleCallbacks) new SentryFragmentLifecycleCallbacks(accessgetdismisssubscriberp, this.read, this.IconCompatParcelizer), true);
        } else {
            removeNodeAtDepth.serializer("scopes");
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    static {
        BannerViewcreateBannerWebViewClientListener1.RemoteActionCompatParcelizer().IconCompatParcelizer("maven:io.sentry:sentry-android-fragment", "8.32.0");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentLifecycleIntegration(Application application) {
        this(application, (Set<? extends RemoteActionCompatParcelizer>) RemoteActionCompatParcelizer.states, false);
        application.getClass();
        RemoteActionCompatParcelizer.Companion.getClass();
    }

    public FragmentLifecycleIntegration(Application application, Set<? extends RemoteActionCompatParcelizer> set, boolean z) {
        application.getClass();
        set.getClass();
        this.RemoteActionCompatParcelizer = application;
        this.read = set;
        this.IconCompatParcelizer = z;
    }
}
