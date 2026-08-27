package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import o.AndroidColorSpace_androidKt;
import o.AndroidImageBitmap;
import o.GraphicsContext;
import o.getColorSpace;
import o.toRegionOp7u2Bmg;

/* JADX INFO: loaded from: classes4.dex */
public class ReportFragment extends Fragment {
    public static final AndroidImageBitmap IconCompatParcelizer = new AndroidImageBitmap();
    private GraphicsContext serializer;

    public static final class LifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
        public static final getColorSpace Companion = new getColorSpace();

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            activity.getClass();
        }

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            getColorSpace.serializer(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            activity.getClass();
            AndroidImageBitmap androidImageBitmap = ReportFragment.IconCompatParcelizer;
            AndroidColorSpace_androidKt androidColorSpace_androidKt = AndroidColorSpace_androidKt.ON_CREATE;
            androidImageBitmap.getClass();
            AndroidImageBitmap.write(activity, androidColorSpace_androidKt);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            AndroidImageBitmap androidImageBitmap = ReportFragment.IconCompatParcelizer;
            AndroidColorSpace_androidKt androidColorSpace_androidKt = AndroidColorSpace_androidKt.ON_RESUME;
            androidImageBitmap.getClass();
            AndroidImageBitmap.write(activity, androidColorSpace_androidKt);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            AndroidImageBitmap androidImageBitmap = ReportFragment.IconCompatParcelizer;
            AndroidColorSpace_androidKt androidColorSpace_androidKt = AndroidColorSpace_androidKt.ON_START;
            androidImageBitmap.getClass();
            AndroidImageBitmap.write(activity, androidColorSpace_androidKt);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            activity.getClass();
            AndroidImageBitmap androidImageBitmap = ReportFragment.IconCompatParcelizer;
            AndroidColorSpace_androidKt androidColorSpace_androidKt = AndroidColorSpace_androidKt.ON_DESTROY;
            androidImageBitmap.getClass();
            AndroidImageBitmap.write(activity, androidColorSpace_androidKt);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            activity.getClass();
            AndroidImageBitmap androidImageBitmap = ReportFragment.IconCompatParcelizer;
            AndroidColorSpace_androidKt androidColorSpace_androidKt = AndroidColorSpace_androidKt.ON_PAUSE;
            androidImageBitmap.getClass();
            AndroidImageBitmap.write(activity, androidColorSpace_androidKt);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            activity.getClass();
            AndroidImageBitmap androidImageBitmap = ReportFragment.IconCompatParcelizer;
            AndroidColorSpace_androidKt androidColorSpace_androidKt = AndroidColorSpace_androidKt.ON_STOP;
            androidImageBitmap.getClass();
            AndroidImageBitmap.write(activity, androidColorSpace_androidKt);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            activity.getClass();
            bundle.getClass();
        }
    }

    private final void RemoteActionCompatParcelizer(GraphicsContext graphicsContext) {
    }

    public final void read(GraphicsContext graphicsContext) {
        this.serializer = graphicsContext;
    }

    private final void IconCompatParcelizer(GraphicsContext graphicsContext) {
        if (graphicsContext != null) {
            ((ProcessLifecycleOwner) ((toRegionOp7u2Bmg) graphicsContext).write).serializer();
        }
    }

    private final void write(GraphicsContext graphicsContext) {
        if (graphicsContext != null) {
            ProcessLifecycleOwner processLifecycleOwner = (ProcessLifecycleOwner) ((toRegionOp7u2Bmg) graphicsContext).write;
            int i = processLifecycleOwner.MediaDescriptionCompat + 1;
            processLifecycleOwner.MediaDescriptionCompat = i;
            if (i == 1 && processLifecycleOwner.MediaSessionCompatQueueItem) {
                processLifecycleOwner.RatingCompat.serializer(AndroidColorSpace_androidKt.ON_START);
                processLifecycleOwner.MediaSessionCompatQueueItem = false;
            }
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        RemoteActionCompatParcelizer(this.serializer);
        read(AndroidColorSpace_androidKt.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        read(AndroidColorSpace_androidKt.ON_DESTROY);
        this.serializer = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        read(AndroidColorSpace_androidKt.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        IconCompatParcelizer(this.serializer);
        read(AndroidColorSpace_androidKt.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        write(this.serializer);
        read(AndroidColorSpace_androidKt.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        read(AndroidColorSpace_androidKt.ON_STOP);
    }

    private final void read(AndroidColorSpace_androidKt androidColorSpace_androidKt) {
        if (Build.VERSION.SDK_INT < 29) {
            AndroidImageBitmap androidImageBitmap = IconCompatParcelizer;
            Activity activity = getActivity();
            activity.getClass();
            androidImageBitmap.getClass();
            AndroidImageBitmap.write(activity, androidColorSpace_androidKt);
        }
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
