package o;

import android.util.Log;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.incognia.internal.ND$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class setPositiongyyYBs {
    public final androidx.work.impl.WorkerWrapper.Builder write;

    public final void RemoteActionCompatParcelizer(accessaddNotificationForSysPropsChange accessaddnotificationforsyspropschange) {
        androidx.work.impl.WorkerWrapper.Builder builder = this.write;
        HashSet<getIsShowingLayoutBounds> hashSet = accessaddnotificationforsyspropschange.RemoteActionCompatParcelizer;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(hashSet, 10));
        for (getIsShowingLayoutBounds getisshowinglayoutbounds : hashSet) {
            arrayList.add(onNodePlacedui.write(getisshowinglayoutbounds.read(), getisshowinglayoutbounds.IconCompatParcelizer(), getisshowinglayoutbounds.serializer(), getisshowinglayoutbounds.write(), getisshowinglayoutbounds.RemoteActionCompatParcelizer()));
        }
        synchronized (((setupDirectionalNavigationlambda2) builder.IconCompatParcelizer)) {
            if (((setupDirectionalNavigationlambda2) builder.IconCompatParcelizer).write(arrayList)) {
                ((CrashlyticsWorkers) builder.MediaSessionCompatQueueItem).write.serializer(new ND$$ExternalSyntheticLambda0(builder, 17, ((setupDirectionalNavigationlambda2) builder.IconCompatParcelizer).read()));
            }
        }
        Log.isLoggable("FirebaseCrashlytics", 3);
    }

    public setPositiongyyYBs(androidx.work.impl.WorkerWrapper.Builder builder) {
        this.write = builder;
    }
}
