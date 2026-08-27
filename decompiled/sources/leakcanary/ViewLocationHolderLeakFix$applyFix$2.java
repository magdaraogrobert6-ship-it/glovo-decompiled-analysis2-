package leakcanary;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks;
import com.huawei.agconnect.config.impl.m;
import java.lang.reflect.Proxy;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.TypeCastException;
import o.FwFClientbootstrapIfNeeded1;
import o.applyWindowInsets;
import o.div7Ah8Wj8;
import o.setInAppMessageImageCropType;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewLocationHolderLeakFix$applyFix$2 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public ViewLocationHolderLeakFix$applyFix$2(Application application) {
        this.write = application;
        Object objNewProxyInstance = Proxy.newProxyInstance(Application.ActivityLifecycleCallbacks.class.getClassLoader(), new Class[]{Application.ActivityLifecycleCallbacks.class}, applyWindowInsets.serializer);
        if (objNewProxyInstance == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Application.ActivityLifecycleCallbacks", 0);
        }
        this.serializer = (Application.ActivityLifecycleCallbacks) objNewProxyInstance;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.serializer;
        if (i == 0) {
            activity.getClass();
            ((Application.ActivityLifecycleCallbacks) obj).onActivityResumed(activity);
        } else if (((AtomicBoolean) obj).compareAndSet(true, false)) {
            ((m) this.write).IconCompatParcelizer();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.serializer;
        if (i == 0) {
            activity.getClass();
            ((Application.ActivityLifecycleCallbacks) obj).onActivityStarted(activity);
        } else if (((AtomicBoolean) obj).compareAndSet(true, false)) {
            ((m) this.write).IconCompatParcelizer();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (this.RemoteActionCompatParcelizer != 0) {
            if (((AtomicBoolean) this.serializer).compareAndSet(true, false)) {
                ((m) this.write).IconCompatParcelizer();
            }
        } else {
            activity.getClass();
            final FwFClientbootstrapIfNeeded1 fwFClientbootstrapIfNeeded1 = new FwFClientbootstrapIfNeeded1(16, this);
            if (((Boolean) setInAppMessageImageCropType.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).booleanValue() && (activity instanceof FragmentActivity)) {
                ((FragmentActivity) activity).getSupportFragmentManager().RemoteActionCompatParcelizer(new FragmentManager$FragmentLifecycleCallbacks() { // from class: leakcanary.internal.FragmentExtensionsKt$onAndroidXFragmentViewDestroyed$1
                    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
                    public final void MediaSessionCompatQueueItem(div7Ah8Wj8 div7ah8wj8, Fragment fragment) {
                        fragment.getClass();
                        fwFClientbootstrapIfNeeded1.invoke();
                    }
                }, true);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.RemoteActionCompatParcelizer != 0) {
            return;
        }
        activity.getClass();
        ((Application.ActivityLifecycleCallbacks) this.serializer).onActivityDestroyed(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.RemoteActionCompatParcelizer != 0) {
            return;
        }
        activity.getClass();
        ((Application.ActivityLifecycleCallbacks) this.serializer).onActivityPaused(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (this.RemoteActionCompatParcelizer != 0) {
            return;
        }
        activity.getClass();
        bundle.getClass();
        ((Application.ActivityLifecycleCallbacks) this.serializer).onActivitySaveInstanceState(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (this.RemoteActionCompatParcelizer != 0) {
            return;
        }
        activity.getClass();
        ((Application.ActivityLifecycleCallbacks) this.serializer).onActivityStopped(activity);
    }

    public ViewLocationHolderLeakFix$applyFix$2(m mVar, AtomicBoolean atomicBoolean) {
        this.write = mVar;
        this.serializer = atomicBoolean;
    }
}
