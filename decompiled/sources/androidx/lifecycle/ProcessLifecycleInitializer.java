package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import o.AndroidColorSpace_androidKt;
import o.AndroidColor_androidKt;
import o.AndroidImageBitmap;
import o.copyColorMatrixgBh15pIdefault;
import o.instance_delegatelambda0;
import o.isRenderNodeCompatible;
import o.setToSaturationimpl;

/* JADX INFO: loaded from: classes4.dex */
public final class ProcessLifecycleInitializer implements copyColorMatrixgBh15pIdefault {
    @Override // o.copyColorMatrixgBh15pIdefault
    public final List dependencies() {
        return instance_delegatelambda0.write;
    }

    @Override // o.copyColorMatrixgBh15pIdefault
    public final Object create(Context context) {
        context.getClass();
        setToSaturationimpl settosaturationimplIconCompatParcelizer = setToSaturationimpl.IconCompatParcelizer(context);
        settosaturationimplIconCompatParcelizer.getClass();
        if (!settosaturationimplIconCompatParcelizer.write.contains(ProcessLifecycleInitializer.class)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!AndroidColor_androidKt.write.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.LifecycleDispatcher$DispatcherActivityCallback
                @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    activity.getClass();
                    ReportFragment.IconCompatParcelizer.getClass();
                    AndroidImageBitmap.read(activity);
                }
            });
        }
        final ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.IconCompatParcelizer;
        processLifecycleOwner.getClass();
        processLifecycleOwner.read = new Handler();
        processLifecycleOwner.RatingCompat.serializer(AndroidColorSpace_androidKt.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner$attach$1
            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                activity.getClass();
                if (Build.VERSION.SDK_INT < 29) {
                    ReportFragment.IconCompatParcelizer.getClass();
                    Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
                    fragmentFindFragmentByTag.getClass();
                    ((ReportFragment) fragmentFindFragmentByTag).read(processLifecycleOwner.RemoteActionCompatParcelizer);
                }
            }

            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                activity.getClass();
                ProcessLifecycleOwner processLifecycleOwner2 = processLifecycleOwner;
                int i = processLifecycleOwner2.MediaMetadataCompat - 1;
                processLifecycleOwner2.MediaMetadataCompat = i;
                if (i == 0) {
                    Handler handler = processLifecycleOwner2.read;
                    handler.getClass();
                    handler.postDelayed(processLifecycleOwner2.serializer, 700L);
                }
            }

            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                activity.getClass();
                ProcessLifecycleOwner processLifecycleOwner2 = processLifecycleOwner;
                int i = processLifecycleOwner2.MediaDescriptionCompat - 1;
                processLifecycleOwner2.MediaDescriptionCompat = i;
                if (i == 0 && processLifecycleOwner2.write) {
                    processLifecycleOwner2.RatingCompat.serializer(AndroidColorSpace_androidKt.ON_STOP);
                    processLifecycleOwner2.MediaSessionCompatQueueItem = true;
                }
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.ProcessLifecycleOwner$attach$1$onActivityPreCreated$1] */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPreCreated(Activity activity, Bundle bundle) {
                activity.getClass();
                final ProcessLifecycleOwner processLifecycleOwner2 = processLifecycleOwner;
                isRenderNodeCompatible.RemoteActionCompatParcelizer(activity, new EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner$attach$1$onActivityPreCreated$1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPostResumed(Activity activity2) {
                        activity2.getClass();
                        processLifecycleOwner2.serializer();
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPostStarted(Activity activity2) {
                        activity2.getClass();
                        ProcessLifecycleOwner processLifecycleOwner3 = processLifecycleOwner2;
                        int i = processLifecycleOwner3.MediaDescriptionCompat + 1;
                        processLifecycleOwner3.MediaDescriptionCompat = i;
                        if (i == 1 && processLifecycleOwner3.MediaSessionCompatQueueItem) {
                            processLifecycleOwner3.RatingCompat.serializer(AndroidColorSpace_androidKt.ON_START);
                            processLifecycleOwner3.MediaSessionCompatQueueItem = false;
                        }
                    }
                });
            }
        });
        return processLifecycleOwner;
    }
}
