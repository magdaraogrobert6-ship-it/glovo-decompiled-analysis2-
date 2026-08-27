package o;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class accessgetKcp implements Runnable {
    public final /* synthetic */ accessgetEightcp RemoteActionCompatParcelizer;
    public final /* synthetic */ Runnable read;
    public final /* synthetic */ access500 serializer;
    public final /* synthetic */ int write;

    @Override // java.lang.Runnable
    public final void run() {
        accessgetEightcp accessgeteightcp = this.RemoteActionCompatParcelizer;
        int i = this.write;
        Runnable runnable = this.read;
        access500 access500Var = this.serializer;
        SQLiteEventStore sQLiteEventStore = (SQLiteEventStore) access500Var.MediaSessionCompatQueueItem;
        try {
            SQLiteEventStore sQLiteEventStore2 = (SQLiteEventStore) access500Var.IconCompatParcelizer;
            Objects.requireNonNull(sQLiteEventStore2);
            sQLiteEventStore.serializer(new DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5(6, sQLiteEventStore2));
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) access500Var.RatingCompat).getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                sQLiteEventStore.serializer(new getMinWidthMajor(access500Var, i, accessgeteightcp));
            } else {
                access500Var.RemoteActionCompatParcelizer(accessgeteightcp, i);
            }
        } catch (SynchronizationException unused) {
            ((androidx.emoji2.text.EmojiProcessor) access500Var.MediaDescriptionCompat).IconCompatParcelizer(accessgeteightcp, i + 1, false);
        } finally {
            runnable.run();
        }
    }

    public /* synthetic */ accessgetKcp(access500 access500Var, accessgetEightcp accessgeteightcp, int i, Runnable runnable) {
        this.serializer = access500Var;
        this.RemoteActionCompatParcelizer = accessgeteightcp;
        this.write = i;
        this.read = runnable;
    }
}
