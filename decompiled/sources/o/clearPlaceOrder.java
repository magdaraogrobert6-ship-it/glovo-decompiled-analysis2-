package o;

import android.util.Log;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes2.dex */
public final class clearPlaceOrder implements Callable {
    public final /* synthetic */ access500 IconCompatParcelizer;
    public final /* synthetic */ checkChildrenPlaceOrderForUpdates RemoteActionCompatParcelizer;
    public final /* synthetic */ long read;
    public final /* synthetic */ Thread serializer;
    public final /* synthetic */ Throwable write;

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        long j = this.read;
        long j2 = j / 1000;
        checkChildrenPlaceOrderForUpdates checkchildrenplaceorderforupdates = this.RemoteActionCompatParcelizer;
        String strSerializer = checkchildrenplaceorderforupdates.serializer();
        if (strSerializer == null) {
            SentryLogcatAdapter.read("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);
        }
        checkchildrenplaceorderforupdates.RatingCompat.RemoteActionCompatParcelizer();
        androidx.work.impl.WorkerWrapper.Builder builder = checkchildrenplaceorderforupdates.ParcelableVolumeInfo;
        builder.getClass();
        Log.isLoggable("FirebaseCrashlytics", 2);
        builder.RemoteActionCompatParcelizer(this.write, this.serializer, CrashHianalyticsData.EVENT_ID_CRASH, new getChildDelegatesui(strSerializer, j2, SimpleItemTouchHelperCallback.serializer), true);
        try {
            androidx.work.impl.WorkerWrapper.Builder builder2 = checkchildrenplaceorderforupdates.MediaSessionCompatQueueItem;
            String str = ".ae" + j;
            builder2.getClass();
            if (!new File((File) builder2.read, str).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e) {
            SentryLogcatAdapter.write("FirebaseCrashlytics", "Could not create app exception marker file.", e);
        }
        access500 access500Var = this.IconCompatParcelizer;
        checkchildrenplaceorderforupdates.read(false, access500Var, false);
        checkchildrenplaceorderforupdates.IconCompatParcelizer(Boolean.FALSE, new accessgetLayoutNodeLayoutDelegatep().RemoteActionCompatParcelizer);
        return !checkchildrenplaceorderforupdates.MediaMetadataCompat.read() ? LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null) : ((ParentDataModifierDefaultImpls) ((AtomicReference) access500Var.RemoteActionCompatParcelizer).get()).RemoteActionCompatParcelizer.onSuccessTask(checkchildrenplaceorderforupdates.MediaDescriptionCompat.read, new PinnableContainerKtLocalPinnableContainer1(this, strSerializer));
    }

    public clearPlaceOrder(checkChildrenPlaceOrderForUpdates checkchildrenplaceorderforupdates, long j, Throwable th, Thread thread, access500 access500Var) {
        this.RemoteActionCompatParcelizer = checkchildrenplaceorderforupdates;
        this.read = j;
        this.write = th;
        this.serializer = thread;
        this.IconCompatParcelizer = access500Var;
    }
}
