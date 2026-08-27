package o;

import com.google.android.gms.measurement.internal.zzhv;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetDefaultPlacementApproachInProgressp extends FutureTask implements Comparable {
    public final /* synthetic */ LookaheadScopeKtLookaheadScope4 IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final long read;
    public final boolean serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetDefaultPlacementApproachInProgressp(LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4, Callable callable, boolean z) {
        super(callable);
        this.IconCompatParcelizer = lookaheadScopeKtLookaheadScope4;
        long andIncrement = LookaheadScopeKtLookaheadScope4.read.getAndIncrement();
        this.read = andIncrement;
        this.RemoteActionCompatParcelizer = "Task exception on worker thread";
        this.serializer = z;
        if (andIncrement == Long.MAX_VALUE) {
            getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) lookaheadScopeKtLookaheadScope4.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        accessgetDefaultPlacementApproachInProgressp accessgetdefaultplacementapproachinprogressp = (accessgetDefaultPlacementApproachInProgressp) obj;
        boolean z = accessgetdefaultplacementapproachinprogressp.serializer;
        boolean z2 = this.serializer;
        if (z2 != z) {
            return !z2 ? 1 : -1;
        }
        long j = accessgetdefaultplacementapproachinprogressp.read;
        long j2 = this.read;
        if (j2 < j) {
            return -1;
        }
        if (j2 > j) {
            return 1;
        }
        getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.IconCompatParcelizer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        getlookaheaddelegate.write.serializer(Long.valueOf(j2), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.IconCompatParcelizer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        getlookaheaddelegate.serializer.serializer(th, this.RemoteActionCompatParcelizer);
        if ((th instanceof zzhv) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetDefaultPlacementApproachInProgressp(LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.IconCompatParcelizer = lookaheadScopeKtLookaheadScope4;
        long andIncrement = LookaheadScopeKtLookaheadScope4.read.getAndIncrement();
        this.read = andIncrement;
        this.RemoteActionCompatParcelizer = str;
        this.serializer = z;
        if (andIncrement == Long.MAX_VALUE) {
            getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) lookaheadScopeKtLookaheadScope4.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("Tasks index overflow");
        }
    }
}
