package o;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes.dex */
public final class getRoundRect implements Runnable {
    public final androidx.work.impl.WorkManagerImpl MediaMetadataCompat;
    public final coil3.memory.MemoryCacheService read;
    public int serializer = 0;
    public final Context write;
    public static final String RemoteActionCompatParcelizer = setRotationX.IconCompatParcelizer("ForceStopRunnable");
    public static final long IconCompatParcelizer = 315360000000L;

    public static void RemoteActionCompatParcelizer(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = IconCompatParcelizer;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis + j, broadcast);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = RemoteActionCompatParcelizer;
        androidx.work.impl.WorkManagerImpl workManagerImpl = this.MediaMetadataCompat;
        try {
            graphicsLayerpANQ8Wgdefault graphicslayerpanq8wgdefault = workManagerImpl.write;
            graphicslayerpanq8wgdefault.getClass();
            boolean zIsEmpty = TextUtils.isEmpty(null);
            Context context = this.write;
            if (zIsEmpty) {
                setRotationX.read().getClass();
            } else {
                boolean zRemoteActionCompatParcelizer = drawOutlinehn5TExgdefault.RemoteActionCompatParcelizer(context, graphicslayerpanq8wgdefault);
                setRotationX.read().getClass();
                if (!zRemoteActionCompatParcelizer) {
                    workManagerImpl.read();
                    return;
                }
            }
            while (true) {
                try {
                    TextStreamsKt.read(context);
                    setRotationX.read().getClass();
                    try {
                        IconCompatParcelizer();
                        workManagerImpl.read();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e) {
                        int i = this.serializer + 1;
                        this.serializer = i;
                        if (i >= 3) {
                            String str2 = androidx.room.Room.write(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            setRotationX.read().IconCompatParcelizer(str, str2, e);
                            IllegalStateException illegalStateException = new IllegalStateException(str2, e);
                            workManagerImpl.write.getClass();
                            throw illegalStateException;
                        }
                        setRotationX.read().getClass();
                        try {
                            Thread.sleep(((long) this.serializer) * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e2) {
                    setRotationX.read().serializer(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e2);
                    workManagerImpl.write.getClass();
                    throw illegalStateException2;
                }
            }
        } catch (Throwable th) {
            workManagerImpl.read();
            throw th;
        }
    }

    public getRoundRect(Context context, androidx.work.impl.WorkManagerImpl workManagerImpl) {
        this.write = context.getApplicationContext();
        this.MediaMetadataCompat = workManagerImpl;
        this.read = workManagerImpl.MediaBrowserCompatMediaItem;
    }

    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x01f5  */
    public final void IconCompatParcelizer() {
        boolean z;
        coil3.memory.MemoryCacheService memoryCacheService = this.read;
        androidx.work.impl.WorkManagerImpl workManagerImpl = this.MediaMetadataCompat;
        androidx.work.impl.WorkDatabase workDatabase = workManagerImpl.PlaybackStateCompat;
        graphicsLayerpANQ8Wgdefault graphicslayerpanq8wgdefault = workManagerImpl.write;
        coil3.memory.MemoryCacheService memoryCacheService2 = workManagerImpl.MediaBrowserCompatMediaItem;
        androidx.work.impl.WorkDatabase workDatabase2 = workManagerImpl.PlaybackStateCompat;
        String str = updateNodeData.RemoteActionCompatParcelizer;
        Context context = this.write;
        JobScheduler jobScheduler = contains.read(context);
        ArrayList<JobInfo> arrayList = updateNodeData.read(context, jobScheduler);
        List list = (List) TuplesKt.write(((getTileMode3opZhB0ui_graphics) workDatabase.write()).serializer, true, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new accessgetIntersectcp(7));
        HashSet hashSet = new HashSet(arrayList != null ? arrayList.size() : 0);
        if (arrayList != null && !arrayList.isEmpty()) {
            for (JobInfo jobInfo : arrayList) {
                mapMKHz9U mapmkhz9uWrite = updateNodeData.write(jobInfo);
                if (mapmkhz9uWrite != null) {
                    hashSet.add(mapmkhz9uWrite.RemoteActionCompatParcelizer);
                } else {
                    updateNodeData.serializer(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains((String) it.next())) {
                    setRotationX.read().getClass();
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            workDatabase.beginTransaction();
            try {
                scaleimpl scaleimplVarMediaMetadataCompat = workDatabase.MediaMetadataCompat();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((translateimpldefault) scaleimplVarMediaMetadataCompat).write(-1L, (String) it2.next());
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
            } catch (Throwable th) {
                workDatabase.endTransaction();
                throw th;
            }
        }
        scaleimpl scaleimplVarMediaMetadataCompat2 = workDatabase2.MediaMetadataCompat();
        resetToPivotedTransformimpl resettopivotedtransformimplRemoteActionCompatParcelizer = workDatabase2.RemoteActionCompatParcelizer();
        workDatabase2.beginTransaction();
        try {
            translateimpldefault translateimpldefaultVar = (translateimpldefault) scaleimplVarMediaMetadataCompat2;
            List<setFrom58bKbWc> list2 = (List) TuplesKt.write(translateimpldefaultVar.IconCompatParcelizer, true, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new accessgetIntersectcp(13));
            boolean z2 = (list2 == null || list2.isEmpty()) ? false : true;
            if (z2) {
                for (setFrom58bKbWc setfrom58bkbwc : list2) {
                    setTranslationX settranslationx = setTranslationX.ENQUEUED;
                    String str2 = setfrom58bkbwc.RatingCompat;
                    translateimpldefaultVar.RemoteActionCompatParcelizer(settranslationx, str2);
                    translateimpldefaultVar.read(-512, str2);
                    translateimpldefaultVar.write(-1L, str2);
                }
            }
            TuplesKt.write(((rotateXimpl) resettopivotedtransformimplRemoteActionCompatParcelizer).RemoteActionCompatParcelizer, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new accessgetIntersectcp(8));
            workDatabase2.setTransactionSuccessful();
            workDatabase2.endTransaction();
            boolean z3 = z2 || z;
            Long l = ((getStartF1C5BW0ui_graphics) ((androidx.work.impl.WorkDatabase) memoryCacheService2.RemoteActionCompatParcelizer).serializer()).read("reschedule_needed");
            int i = 14;
            if (l != null && l.longValue() == 1) {
                setRotationX.read().getClass();
                workManagerImpl.serializer();
                memoryCacheService2.getClass();
                getMultiply0d7_KjU getmultiply0d7_kju = new getMultiply0d7_KjU("reschedule_needed", 0L);
                getStartF1C5BW0ui_graphics getstartf1c5bw0ui_graphics = (getStartF1C5BW0ui_graphics) ((androidx.work.impl.WorkDatabase) memoryCacheService2.RemoteActionCompatParcelizer).serializer();
                TuplesKt.write(getstartf1c5bw0ui_graphics.IconCompatParcelizer, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new Recomposer$$ExternalSyntheticLambda4(getstartf1c5bw0ui_graphics, i, getmultiply0d7_kju));
                return;
            }
            try {
                int i2 = Build.VERSION.SDK_INT;
                int i3 = i2 >= 31 ? 570425344 : 536870912;
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i3);
                if (i2 < 30) {
                    if (broadcast == null) {
                        RemoteActionCompatParcelizer(context);
                        setRotationX.read().getClass();
                        workManagerImpl.serializer();
                        graphicslayerpanq8wgdefault.IconCompatParcelizer.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        memoryCacheService.getClass();
                        getMultiply0d7_KjU getmultiply0d7_kju2 = new getMultiply0d7_KjU("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis));
                        getStartF1C5BW0ui_graphics getstartf1c5bw0ui_graphics2 = (getStartF1C5BW0ui_graphics) ((androidx.work.impl.WorkDatabase) memoryCacheService.RemoteActionCompatParcelizer).serializer();
                        TuplesKt.write(getstartf1c5bw0ui_graphics2.IconCompatParcelizer, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new Recomposer$$ExternalSyntheticLambda4(getstartf1c5bw0ui_graphics2, i, getmultiply0d7_kju2));
                        return;
                    }
                    if (z3) {
                        setRotationX.read().getClass();
                        ImageBitmapDefaultImpls.RemoteActionCompatParcelizer(graphicslayerpanq8wgdefault, workDatabase2, workManagerImpl.MediaDescriptionCompat);
                    }
                }
                if (broadcast != null) {
                    broadcast.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    Long l2 = ((getStartF1C5BW0ui_graphics) ((androidx.work.impl.WorkDatabase) memoryCacheService.RemoteActionCompatParcelizer).serializer()).read("last_force_stop_ms");
                    long jLongValue = l2 != null ? l2.longValue() : 0L;
                    for (int i4 = 0; i4 < historicalProcessExitReasons.size(); i4++) {
                        ApplicationExitInfo applicationExitInfoCd_ = ScreenStartObserver$$ExternalSyntheticLambda0.cd_(historicalProcessExitReasons.get(i4));
                        if (applicationExitInfoCd_.getReason() == 10 && applicationExitInfoCd_.getTimestamp() >= jLongValue) {
                            setRotationX.read().getClass();
                            workManagerImpl.serializer();
                            graphicslayerpanq8wgdefault.IconCompatParcelizer.getClass();
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            memoryCacheService.getClass();
                            getMultiply0d7_KjU getmultiply0d7_kju3 = new getMultiply0d7_KjU("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis2));
                            getStartF1C5BW0ui_graphics getstartf1c5bw0ui_graphics3 = (getStartF1C5BW0ui_graphics) ((androidx.work.impl.WorkDatabase) memoryCacheService.RemoteActionCompatParcelizer).serializer();
                            TuplesKt.write(getstartf1c5bw0ui_graphics3.IconCompatParcelizer, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new Recomposer$$ExternalSyntheticLambda4(getstartf1c5bw0ui_graphics3, i, getmultiply0d7_kju3));
                            return;
                        }
                    }
                }
                if (z3) {
                    setRotationX.read().getClass();
                    ImageBitmapDefaultImpls.RemoteActionCompatParcelizer(graphicslayerpanq8wgdefault, workDatabase2, workManagerImpl.MediaDescriptionCompat);
                }
            } catch (IllegalArgumentException | SecurityException e) {
                if (setRotationX.read().read <= 5) {
                    SentryLogcatAdapter.write(RemoteActionCompatParcelizer, "Ignoring exception", e);
                }
            }
        } catch (Throwable th2) {
            workDatabase2.endTransaction();
            throw th2;
        }
    }
}
