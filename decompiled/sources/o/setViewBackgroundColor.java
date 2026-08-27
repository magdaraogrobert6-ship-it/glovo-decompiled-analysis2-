package o;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
import java.lang.reflect.Proxy;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.applyWindowInsets;

/* JADX INFO: loaded from: classes4.dex */
public final class setViewBackgroundColor extends setImage {
    @Override // o.setImage
    public final void apply(Application application) {
        application.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
            return;
        }
        try {
            Object systemService = application.getSystemService("input_method");
            if (systemService == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            }
            final android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) systemService;
            final Field declaredField = android.view.inputmethod.InputMethodManager.class.getDeclaredField("mCurRootView");
            declaredField.setAccessible(true);
            application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks(this) { // from class: leakcanary.AndroidLeakFixes$IMM_CUR_ROOT_VIEW$apply$1
                public final /* synthetic */ Application.ActivityLifecycleCallbacks IconCompatParcelizer;

                /* JADX WARN: Code duplicated, block: B:10:0x0026  */
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
                    boolean z;
                    Activity activity2;
                    Context context;
                    InputMethodManager inputMethodManager2 = inputMethodManager;
                    Field field = declaredField;
                    activity.getClass();
                    try {
                        View view = (View) field.get(inputMethodManager2);
                        boolean z2 = true;
                        if (view == null || activity.getWindow() == null) {
                            z = false;
                        } else {
                            Window window = activity.getWindow();
                            window.getClass();
                            if (window.getDecorView() == view) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (view != null && (context = view.getContext()) != null) {
                            Context baseContext = context;
                            while (true) {
                                if (!(baseContext instanceof Application)) {
                                    if (baseContext instanceof Activity) {
                                        activity2 = (Activity) baseContext;
                                        break;
                                    } else if ((baseContext instanceof ContextWrapper) && (baseContext = ((ContextWrapper) baseContext).getBaseContext()) != context) {
                                        baseContext.getClass();
                                    }
                                }
                                activity2 = null;
                                break;
                            }
                        }
                        activity2 = null;
                        break;
                        if (activity2 != activity) {
                            z2 = false;
                        }
                        if (z || z2) {
                            field.set(inputMethodManager2, null);
                        }
                    } catch (Throwable unused) {
                    }
                }

                {
                    Object objNewProxyInstance = Proxy.newProxyInstance(Application.ActivityLifecycleCallbacks.class.getClassLoader(), new Class[]{Application.ActivityLifecycleCallbacks.class}, applyWindowInsets.serializer);
                    if (objNewProxyInstance == null) {
                        throw new TypeCastException("null cannot be cast to non-null type android.app.Application.ActivityLifecycleCallbacks", 0);
                    }
                    this.IconCompatParcelizer = (Application.ActivityLifecycleCallbacks) objNewProxyInstance;
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    activity.getClass();
                    this.IconCompatParcelizer.onActivityCreated(activity, bundle);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
                    activity.getClass();
                    this.IconCompatParcelizer.onActivityPaused(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
                    activity.getClass();
                    this.IconCompatParcelizer.onActivityResumed(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    activity.getClass();
                    bundle.getClass();
                    this.IconCompatParcelizer.onActivitySaveInstanceState(activity, bundle);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStarted(Activity activity) {
                    activity.getClass();
                    this.IconCompatParcelizer.onActivityStarted(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
                    activity.getClass();
                    this.IconCompatParcelizer.onActivityStopped(activity);
                }
            });
            ((r8lambda82HoCC3VgqgcCAapS2rEcPeH8yE) r8lambdaAefA9MLvnBCqdyzSHKyzHz6CMWE.serializer.MediaSessionCompatResultReceiverWrapper()).write.add(new r8lambdajxBYtYFcXNmqloNf4Sxql0Qypg(declaredField, inputMethodManager));
        } catch (Throwable unused) {
        }
    }

    public setViewBackgroundColor(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        super(str, i, defaultConstructorMarker);
    }
}
