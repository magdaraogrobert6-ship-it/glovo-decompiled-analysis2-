package o;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ImageBitmapKt implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ androidx.work.impl.WorkManagerImpl read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ ImageBitmapKt(androidx.work.impl.WorkManagerImpl workManagerImpl, int i) {
        this.serializer = i;
        this.read = workManagerImpl;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        androidx.work.impl.WorkManagerImpl workManagerImpl = this.read;
        if (i != 0) {
            androidx.work.impl.WorkDatabase workDatabase = workManagerImpl.PlaybackStateCompat;
            workDatabase.getClass();
            workDatabase.runInTransaction(new accessgetAlpha8cp(workDatabase, "rider_state_polling_work", workManagerImpl, 4));
            ImageBitmapDefaultImpls.RemoteActionCompatParcelizer(workManagerImpl.write, workDatabase, workManagerImpl.MediaDescriptionCompat);
            return createfromparcel;
        }
        androidx.work.impl.WorkDatabase workDatabase2 = workManagerImpl.PlaybackStateCompat;
        Context context = workManagerImpl.IconCompatParcelizer;
        String str = updateNodeData.RemoteActionCompatParcelizer;
        if (Build.VERSION.SDK_INT >= 34) {
            contains.read(context).cancelAll();
        }
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList arrayList = updateNodeData.read(context, jobScheduler);
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                updateNodeData.serializer(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        ((Number) TuplesKt.write(((translateimpldefault) workDatabase2.MediaMetadataCompat()).IconCompatParcelizer, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new accessgetIntersectcp(9))).intValue();
        ImageBitmapDefaultImpls.RemoteActionCompatParcelizer(workManagerImpl.write, workDatabase2, workManagerImpl.MediaDescriptionCompat);
        return createfromparcel;
    }
}
