package io.sentry.android.fragment;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks;
import com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0;
import io.sentry.android.replay.ReplayIntegration$$ExternalSyntheticLambda1;
import java.util.Set;
import java.util.WeakHashMap;
import o.AddToCustomAttributeArrayStep;
import o.accessgetDismissSubscriberp;
import o.createInAppMessageEventSubscriber;
import o.defaultCardHandlinglambda0;
import o.div7Ah8Wj8;
import o.executelambda4;
import o.getIntentArrayWithConfiguredBackStacklambda1;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryFragmentLifecycleCallbacks extends FragmentManager$FragmentLifecycleCallbacks {
    public final boolean RemoteActionCompatParcelizer;
    public final WeakHashMap read;
    public final Set serializer;
    public final AddToCustomAttributeArrayStep write;

    public final void IconCompatParcelizer(Fragment fragment) {
        r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0;
        if (this.write.RemoteActionCompatParcelizer().isTracingEnabled() && this.RemoteActionCompatParcelizer) {
            WeakHashMap weakHashMap = this.read;
            if (weakHashMap.containsKey(fragment) && (r8lambdareqvhj3p9oule_afn8an0r0tlg0 = (r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) weakHashMap.get(fragment)) != null) {
                defaultCardHandlinglambda0 defaultcardhandlinglambda0MediaSessionCompatQueueItem = r8lambdareqvhj3p9oule_afn8an0r0tlg0.MediaSessionCompatQueueItem();
                if (defaultcardhandlinglambda0MediaSessionCompatQueueItem == null) {
                    defaultcardhandlinglambda0MediaSessionCompatQueueItem = defaultCardHandlinglambda0.OK;
                }
                r8lambdareqvhj3p9oule_afn8an0r0tlg0.write(defaultcardhandlinglambda0MediaSessionCompatQueueItem);
            }
        }
    }

    public final void read(Fragment fragment, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        if (this.serializer.contains(remoteActionCompatParcelizer)) {
            getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1 = new getIntentArrayWithConfiguredBackStacklambda1();
            getintentarraywithconfiguredbackstacklambda1.MediaSessionCompatQueueItem = "navigation";
            getintentarraywithconfiguredbackstacklambda1.read(remoteActionCompatParcelizer.getBreadcrumbName$sentry_android_fragment_release(), "state");
            String canonicalName = fragment.getClass().getCanonicalName();
            if (canonicalName == null) {
                canonicalName = fragment.getClass().getSimpleName();
            }
            getintentarraywithconfiguredbackstacklambda1.read(canonicalName, "screen");
            getintentarraywithconfiguredbackstacklambda1.write = "ui.fragment.lifecycle";
            getintentarraywithconfiguredbackstacklambda1.read = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO;
            executelambda4 executelambda4Var = new executelambda4();
            executelambda4Var.RemoteActionCompatParcelizer("android:fragment", fragment);
            this.write.IconCompatParcelizer(getintentarraywithconfiguredbackstacklambda1, executelambda4Var);
        }
    }

    public SentryFragmentLifecycleCallbacks(accessgetDismissSubscriberp accessgetdismisssubscriberp, Set set, boolean z) {
        accessgetdismisssubscriberp.getClass();
        set.getClass();
        this.write = accessgetdismisssubscriberp;
        this.serializer = set;
        this.RemoteActionCompatParcelizer = z;
        this.read = new WeakHashMap();
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void IconCompatParcelizer(div7Ah8Wj8 div7ah8wj8, Fragment fragment) {
        fragment.getClass();
        read(fragment, RemoteActionCompatParcelizer.PAUSED);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void MediaMetadataCompat(div7Ah8Wj8 div7ah8wj8, Fragment fragment) {
        fragment.getClass();
        read(fragment, RemoteActionCompatParcelizer.STOPPED);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void MediaSessionCompatQueueItem(div7Ah8Wj8 div7ah8wj8, Fragment fragment) {
        fragment.getClass();
        read(fragment, RemoteActionCompatParcelizer.VIEW_DESTROYED);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void RemoteActionCompatParcelizer(div7Ah8Wj8 div7ah8wj8, Fragment fragment) {
        fragment.getClass();
        read(fragment, RemoteActionCompatParcelizer.DESTROYED);
        IconCompatParcelizer(fragment);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void RemoteActionCompatParcelizer(div7Ah8Wj8 div7ah8wj8, Fragment fragment, FragmentActivity fragmentActivity) {
        fragment.getClass();
        fragmentActivity.getClass();
        read(fragment, RemoteActionCompatParcelizer.ATTACHED);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void onFragmentResumed(div7Ah8Wj8 div7ah8wj8, Fragment fragment) {
        fragment.getClass();
        read(fragment, RemoteActionCompatParcelizer.RESUMED);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void onFragmentStarted(div7Ah8Wj8 div7ah8wj8, Fragment fragment) {
        fragment.getClass();
        read(fragment, RemoteActionCompatParcelizer.STARTED);
        IconCompatParcelizer(fragment);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void serializer(div7Ah8Wj8 div7ah8wj8, Fragment fragment) {
        fragment.getClass();
        read(fragment, RemoteActionCompatParcelizer.CREATED);
        if (fragment.isAdded()) {
            AddToCustomAttributeArrayStep addToCustomAttributeArrayStep = this.write;
            if (addToCustomAttributeArrayStep.RemoteActionCompatParcelizer().isEnableScreenTracking()) {
                addToCustomAttributeArrayStep.RemoteActionCompatParcelizer(new d0$$ExternalSyntheticLambda0(this, fragment));
            }
            if (addToCustomAttributeArrayStep.RemoteActionCompatParcelizer().isTracingEnabled() && this.RemoteActionCompatParcelizer) {
                WeakHashMap weakHashMap = this.read;
                if (weakHashMap.containsKey(fragment)) {
                    return;
                }
                createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
                addToCustomAttributeArrayStep.RemoteActionCompatParcelizer(new ReplayIntegration$$ExternalSyntheticLambda1(createinappmessageeventsubscriber, 1));
                String canonicalName = fragment.getClass().getCanonicalName();
                if (canonicalName == null) {
                    canonicalName = fragment.getClass().getSimpleName();
                }
                r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0 = (r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) createinappmessageeventsubscriber.IconCompatParcelizer;
                r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer = r8lambdareqvhj3p9oule_afn8an0r0tlg0 != null ? r8lambdareqvhj3p9oule_afn8an0r0tlg0.IconCompatParcelizer("ui.load", canonicalName) : null;
                if (r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer != null) {
                    weakHashMap.put(fragment, r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer);
                    r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer.RemoteActionCompatParcelizer().RatingCompat = "auto.ui.fragment";
                }
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void serializer(div7Ah8Wj8 div7ah8wj8, Fragment fragment, Bundle bundle) {
        fragment.getClass();
        read(fragment, RemoteActionCompatParcelizer.SAVE_INSTANCE_STATE);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void write(div7Ah8Wj8 div7ah8wj8, Fragment fragment) {
        fragment.getClass();
        read(fragment, RemoteActionCompatParcelizer.DETACHED);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void write(div7Ah8Wj8 div7ah8wj8, Fragment fragment, View view) {
        fragment.getClass();
        view.getClass();
        read(fragment, RemoteActionCompatParcelizer.VIEW_CREATED);
    }
}
