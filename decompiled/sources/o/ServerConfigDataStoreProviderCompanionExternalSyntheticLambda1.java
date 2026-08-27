package o;

import android.database.sqlite.SQLiteFullException;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.task.e$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "SQLiteFullExceptionNotifier")
public final class ServerConfigDataStoreProviderCompanionExternalSyntheticLambda1 {
    private final ArrayList read;
    private final readandroid_sdk_base_release serializer;

    public final void serializer(SQLiteFullException sQLiteFullException) {
        synchronized (this.read) {
            Iterator it = this.read.iterator();
            while (it.hasNext()) {
                this.serializer.RemoteActionCompatParcelizer(new e$$ExternalSyntheticLambda0((migrateBlocklistedLists) it.next(), 9, sQLiteFullException));
            }
        }
    }

    public ServerConfigDataStoreProviderCompanionExternalSyntheticLambda1(readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        readandroid_sdk_base_releaseVar.getClass();
        this.serializer = readandroid_sdk_base_releaseVar;
        this.read = new ArrayList();
    }

    public final void read(accesshandlePush accesshandlepush) {
        synchronized (this.read) {
            this.read.add(accesshandlepush);
        }
    }
}
