package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import androidx.cardview.widget.CardView$1;
import androidx.work.impl.WorkManagerImpl;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Arrays;
import java.util.HashMap;
import o.accessgetCompositingStrategyNrFUSIjd;
import o.accessgetRgb565cp;
import o.getClipannotations;
import o.getDefaultShadowColor;
import o.getOnExit;
import o.mapMKHz9U;
import o.rememberGraphicsLayer;
import o.setRotationX;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements rememberGraphicsLayer {
    public static final String read = setRotationX.IconCompatParcelizer("SystemJobService");
    public WorkManagerImpl IconCompatParcelizer;
    public CardView$1 serializer;
    public final HashMap RemoteActionCompatParcelizer = new HashMap();
    public final accessgetCompositingStrategyNrFUSIjd write = new accessgetCompositingStrategyNrFUSIjd(2);

    public static mapMKHz9U write(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new mapMKHz9U(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        RemoteActionCompatParcelizer("onStartJob");
        if (this.IconCompatParcelizer == null) {
            setRotationX.read().getClass();
            jobFinished(jobParameters, true);
            return false;
        }
        mapMKHz9U mapmkhz9uWrite = write(jobParameters);
        if (mapmkhz9uWrite == null) {
            setRotationX.read().serializer(read, "WorkSpec id not found!");
            return false;
        }
        HashMap map = this.RemoteActionCompatParcelizer;
        if (map.containsKey(mapmkhz9uWrite)) {
            setRotationX setrotationx = setRotationX.read();
            mapmkhz9uWrite.toString();
            setrotationx.getClass();
            return false;
        }
        setRotationX setrotationx2 = setRotationX.read();
        mapmkhz9uWrite.toString();
        setrotationx2.getClass();
        map.put(mapmkhz9uWrite, jobParameters);
        getClipannotations getclipannotations = new getClipannotations();
        if (jobParameters.getTriggeredContentUris() != null) {
            Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        jobParameters.getNetwork();
        this.serializer.RemoteActionCompatParcelizer(this.write.serializer(mapmkhz9uWrite), getclipannotations);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        RemoteActionCompatParcelizer("onStopJob");
        if (this.IconCompatParcelizer == null) {
            setRotationX.read().getClass();
            return true;
        }
        mapMKHz9U mapmkhz9uWrite = write(jobParameters);
        if (mapmkhz9uWrite == null) {
            setRotationX.read().serializer(read, "WorkSpec id not found!");
            return false;
        }
        setRotationX setrotationx = setRotationX.read();
        mapmkhz9uWrite.toString();
        setrotationx.getClass();
        this.RemoteActionCompatParcelizer.remove(mapmkhz9uWrite);
        accessgetRgb565cp accessgetrgb565cp = this.write.read(mapmkhz9uWrite);
        if (accessgetrgb565cp != null) {
            int i = Build.VERSION.SDK_INT >= 31 ? getOnExit.read(jobParameters) : -512;
            CardView$1 cardView$1 = this.serializer;
            cardView$1.getClass();
            cardView$1.write(accessgetrgb565cp, i);
        }
        getDefaultShadowColor getdefaultshadowcolor = this.IconCompatParcelizer.MediaMetadataCompat;
        String str = mapmkhz9uWrite.RemoteActionCompatParcelizer;
        synchronized (getdefaultshadowcolor.MediaMetadataCompat) {
            zContains = getdefaultshadowcolor.serializer.contains(str);
        }
        return !zContains;
    }

    @Override // o.rememberGraphicsLayer
    public final void write(mapMKHz9U mapmkhz9u, boolean z) {
        RemoteActionCompatParcelizer("onExecuted");
        setRotationX setrotationx = setRotationX.read();
        String str = mapmkhz9u.RemoteActionCompatParcelizer;
        setrotationx.getClass();
        JobParameters jobParameters = (JobParameters) this.RemoteActionCompatParcelizer.remove(mapmkhz9u);
        this.write.read(mapmkhz9u);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            WorkManagerImpl workManagerImplRemoteActionCompatParcelizer = WorkManagerImpl.RemoteActionCompatParcelizer(getApplicationContext());
            this.IconCompatParcelizer = workManagerImplRemoteActionCompatParcelizer;
            getDefaultShadowColor getdefaultshadowcolor = workManagerImplRemoteActionCompatParcelizer.MediaMetadataCompat;
            this.serializer = new CardView$1(getdefaultshadowcolor, workManagerImplRemoteActionCompatParcelizer.MediaSessionCompatToken);
            getdefaultshadowcolor.RemoteActionCompatParcelizer(this);
        } catch (IllegalStateException e) {
            if (Application.class.equals(getApplication().getClass())) {
                setRotationX.read().IconCompatParcelizer(read, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        WorkManagerImpl workManagerImpl = this.IconCompatParcelizer;
        if (workManagerImpl != null) {
            getDefaultShadowColor getdefaultshadowcolor = workManagerImpl.MediaMetadataCompat;
            synchronized (getdefaultshadowcolor.MediaMetadataCompat) {
                getdefaultshadowcolor.MediaDescriptionCompat.remove(this);
            }
        }
    }

    public static void RemoteActionCompatParcelizer(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(ff$$ExternalSyntheticOutline0.m("Cannot invoke ", str, " on a background thread"));
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
