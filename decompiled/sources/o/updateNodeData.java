package o;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.work.impl.background.systemjob.SystemJobService;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.hg$$ExternalSyntheticLambda5;
import coil3.Extras$Key;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.reactivex.internal.operators.maybe.MaybeObserveOn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.TuplesKt;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes.dex */
public final class updateNodeData implements ImageBitmapCompanion {
    public static final String RemoteActionCompatParcelizer = setRotationX.IconCompatParcelizer("SystemJobScheduler");
    public final findFirstOverlapdefault IconCompatParcelizer;
    public final androidx.work.impl.WorkDatabase MediaDescriptionCompat;
    public final JobScheduler read;
    public final graphicsLayerpANQ8Wgdefault serializer;
    public final Context write;

    @Override // o.ImageBitmapCompanion
    public final boolean write() {
        return true;
    }

    public static ArrayList read(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        String str = contains.RemoteActionCompatParcelizer;
        jobScheduler.getClass();
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
            allPendingJobs.getClass();
        } catch (Throwable th) {
            setRotationX.read().IconCompatParcelizer(contains.RemoteActionCompatParcelizer, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static mapMKHz9U write(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new mapMKHz9U(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // o.ImageBitmapCompanion
    public final void RemoteActionCompatParcelizer(String str) {
        ArrayList arrayList;
        Context context = this.write;
        JobScheduler jobScheduler = this.read;
        ArrayList<JobInfo> arrayList2 = read(context, jobScheduler);
        if (arrayList2 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList3 = new ArrayList(2);
            for (JobInfo jobInfo : arrayList2) {
                mapMKHz9U mapmkhz9uWrite = write(jobInfo);
                if (mapmkhz9uWrite != null && str.equals(mapmkhz9uWrite.RemoteActionCompatParcelizer)) {
                    arrayList3.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList3;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            serializer(jobScheduler, ((Integer) it.next()).intValue());
        }
        getTileMode3opZhB0ui_graphics gettilemode3opzhb0ui_graphics = (getTileMode3opZhB0ui_graphics) this.MediaDescriptionCompat.write();
        gettilemode3opzhb0ui_graphics.getClass();
        str.getClass();
        TuplesKt.write(gettilemode3opzhb0ui_graphics.serializer, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new PagereLwUrMk(str, 5));
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0135  */
    public final void serializer(setFrom58bKbWc setfrom58bkbwc, int i) {
        String strIconCompatParcelizer;
        List<JobInfo> allPendingJobs;
        String str;
        String str2 = RemoteActionCompatParcelizer;
        JobInfo jobInfoWrite = this.IconCompatParcelizer.write(setfrom58bkbwc, i);
        String str3 = setfrom58bkbwc.RatingCompat;
        setRotationX.read().getClass();
        try {
            if (this.read.schedule(jobInfoWrite) == 0) {
                setRotationX.read().IconCompatParcelizer(str2, "Unable to schedule work ID " + str3);
                if (setfrom58bkbwc.MediaBrowserCompatMediaItem && setfrom58bkbwc.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == setRotationZ.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    setfrom58bkbwc.MediaBrowserCompatMediaItem = false;
                    setRotationX.read().getClass();
                    serializer(setfrom58bkbwc, i);
                }
            }
        } catch (IllegalStateException e) {
            String str4 = contains.RemoteActionCompatParcelizer;
            Context context = this.write;
            context.getClass();
            androidx.work.impl.WorkDatabase workDatabase = this.MediaDescriptionCompat;
            workDatabase.getClass();
            graphicsLayerpANQ8Wgdefault graphicslayerpanq8wgdefault = this.serializer;
            graphicslayerpanq8wgdefault.getClass();
            int i2 = Build.VERSION.SDK_INT;
            int i3 = i2 >= 31 ? 150 : 100;
            int size = ((List) TuplesKt.write(((translateimpldefault) workDatabase.MediaMetadataCompat()).IconCompatParcelizer, true, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new hg$$ExternalSyntheticLambda5(2))).size();
            if (i2 >= 34) {
                JobScheduler jobScheduler = contains.read(context);
                String str5 = null;
                try {
                    allPendingJobs = jobScheduler.getAllPendingJobs();
                    allPendingJobs.getClass();
                } catch (Throwable th) {
                    setRotationX.read().IconCompatParcelizer(contains.RemoteActionCompatParcelizer, "getAllPendingJobs() is not reliable on this device.", th);
                    allPendingJobs = null;
                }
                if (allPendingJobs != null) {
                    ArrayList arrayList = read(context, jobScheduler);
                    int size2 = arrayList != null ? allPendingJobs.size() - arrayList.size() : 0;
                    if (size2 == 0) {
                        str = null;
                    } else {
                        str = size2 + " of which are not owned by WorkManager";
                    }
                    Object systemService = context.getSystemService("jobscheduler");
                    systemService.getClass();
                    ArrayList arrayList2 = read(context, (JobScheduler) systemService);
                    int size3 = arrayList2 != null ? arrayList2.size() : 0;
                    if (size3 != 0) {
                        str5 = size3 + " from WorkManager in the default namespace";
                    }
                    strIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(onContentCardClicked.RemoteActionCompatParcelizer((Object[]) new String[]{allPendingJobs.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str, str5}), ",\n", null, null, null, 62);
                } else {
                    strIconCompatParcelizer = "<faulty JobScheduler failed to getPendingJobs>";
                }
            } else {
                ArrayList arrayList3 = read(context, contains.read(context));
                if (arrayList3 == null) {
                    strIconCompatParcelizer = "<faulty JobScheduler failed to getPendingJobs>";
                } else {
                    strIconCompatParcelizer = arrayList3.size() + " jobs from WorkManager";
                }
            }
            StringBuilder sbM = d$$ExternalSyntheticOutline0.m("JobScheduler ", i3, " job limit exceeded.\nIn JobScheduler there are ", strIconCompatParcelizer, ".\nThere are ");
            sbM.append(size);
            sbM.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
            String strM = af$$ExternalSyntheticOutline0.m(sbM, graphicslayerpanq8wgdefault.MediaSessionCompatQueueItem, '.');
            setRotationX.read().serializer(str2, strM);
            ScreenStartObserver$$ExternalSyntheticLambda0.write(strM, e);
        } catch (Throwable th2) {
            setRotationX.read().IconCompatParcelizer(str2, "Unable to schedule " + setfrom58bkbwc, th2);
        }
    }

    @Override // o.ImageBitmapCompanion
    public final void serializer(setFrom58bKbWc... setfrom58bkbwcArr) {
        int iIntValue;
        graphicsLayerpANQ8Wgdefault graphicslayerpanq8wgdefault = this.serializer;
        androidx.work.impl.WorkDatabase workDatabase = this.MediaDescriptionCompat;
        final Extras$Key extras$Key = new Extras$Key(workDatabase);
        for (setFrom58bKbWc setfrom58bkbwc : setfrom58bkbwcArr) {
            workDatabase.beginTransaction();
            try {
                scaleimpl scaleimplVarMediaMetadataCompat = workDatabase.MediaMetadataCompat();
                String str = setfrom58bkbwc.RatingCompat;
                setFrom58bKbWc setfrom58bkbwcWrite = ((translateimpldefault) scaleimplVarMediaMetadataCompat).write(str);
                String str2 = RemoteActionCompatParcelizer;
                if (setfrom58bkbwcWrite == null) {
                    setRotationX.read().IconCompatParcelizer(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.setTransactionSuccessful();
                } else if (setfrom58bkbwcWrite.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 != setTranslationX.ENQUEUED) {
                    setRotationX.read().IconCompatParcelizer(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.setTransactionSuccessful();
                } else {
                    mapMKHz9U mapmkhz9u = (mapMKHz9U) ModuleDSLKt.serializer(MaybeObserveOn.write(), -1836924254, MaybeObserveOn.write(), 1836924255, MaybeObserveOn.write(), new Object[]{setfrom58bkbwc}, MaybeObserveOn.write());
                    Matrix matrixWrite = workDatabase.write().write(mapmkhz9u);
                    if (matrixWrite != null) {
                        iIntValue = matrixWrite.RemoteActionCompatParcelizer;
                    } else {
                        graphicslayerpanq8wgdefault.getClass();
                        final int i = graphicslayerpanq8wgdefault.RatingCompat;
                        Object objRunInTransaction = ((androidx.work.impl.WorkDatabase) extras$Key.IconCompatParcelizer).runInTransaction((Callable<Object>) new Callable() { // from class: o.getRect
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                androidx.work.impl.WorkDatabase workDatabase2 = (androidx.work.impl.WorkDatabase) extras$Key.IconCompatParcelizer;
                                Long l = ((getStartF1C5BW0ui_graphics) workDatabase2.serializer()).read("next_job_scheduler_id");
                                int i2 = 0;
                                int iLongValue = l != null ? (int) l.longValue() : 0;
                                int i3 = iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1;
                                getStartF1C5BW0ui_graphics getstartf1c5bw0ui_graphics = (getStartF1C5BW0ui_graphics) workDatabase2.serializer();
                                TuplesKt.write(getstartf1c5bw0ui_graphics.IconCompatParcelizer, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new Recomposer$$ExternalSyntheticLambda4(getstartf1c5bw0ui_graphics, 14, new getMultiply0d7_KjU("next_job_scheduler_id", Long.valueOf(i3))));
                                if (iLongValue < 0 || iLongValue > i) {
                                    getStartF1C5BW0ui_graphics getstartf1c5bw0ui_graphics2 = (getStartF1C5BW0ui_graphics) workDatabase2.serializer();
                                    TuplesKt.write(getstartf1c5bw0ui_graphics2.IconCompatParcelizer, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new Recomposer$$ExternalSyntheticLambda4(getstartf1c5bw0ui_graphics2, 14, new getMultiply0d7_KjU("next_job_scheduler_id", 1L)));
                                } else {
                                    i2 = iLongValue;
                                }
                                return Integer.valueOf(i2);
                            }
                        });
                        objRunInTransaction.getClass();
                        iIntValue = ((Number) objRunInTransaction).intValue();
                    }
                    if (matrixWrite == null) {
                        Matrix matrix = new Matrix(mapmkhz9u.RemoteActionCompatParcelizer, mapmkhz9u.serializer, iIntValue);
                        getTileMode3opZhB0ui_graphics gettilemode3opzhb0ui_graphics = (getTileMode3opZhB0ui_graphics) workDatabase.write();
                        gettilemode3opzhb0ui_graphics.getClass();
                        TuplesKt.write(gettilemode3opzhb0ui_graphics.serializer, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new Recomposer$$ExternalSyntheticLambda4(gettilemode3opzhb0ui_graphics, 15, matrix));
                    }
                    serializer(setfrom58bkbwc, iIntValue);
                    workDatabase.setTransactionSuccessful();
                }
                workDatabase.endTransaction();
            } catch (Throwable th) {
                workDatabase.endTransaction();
                throw th;
            }
        }
    }

    public static void serializer(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            setRotationX.read().IconCompatParcelizer(RemoteActionCompatParcelizer, String.format(java.util.Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public updateNodeData(Context context, androidx.work.impl.WorkDatabase workDatabase, graphicsLayerpANQ8Wgdefault graphicslayerpanq8wgdefault) {
        JobScheduler jobScheduler = contains.read(context);
        findFirstOverlapdefault findfirstoverlapdefault = new findFirstOverlapdefault(context, graphicslayerpanq8wgdefault.IconCompatParcelizer, graphicslayerpanq8wgdefault.write);
        this.write = context;
        this.read = jobScheduler;
        this.IconCompatParcelizer = findfirstoverlapdefault;
        this.MediaDescriptionCompat = workDatabase;
        this.serializer = graphicslayerpanq8wgdefault;
    }
}
