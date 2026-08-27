package o;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.roadrunner.home.CreateHomeScope;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class LookaheadCapablePlaceableResettableRulerScope implements accessgetMediaFastForwardcp, accesssetMeasurementConstraintsBRTryo0 {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ long read;
    public final /* synthetic */ Object serializer;

    @Override // o.accesssetMeasurementConstraintsBRTryo0
    public ScheduledFuture IconCompatParcelizer(CreateHomeScope createHomeScope) {
        setCoordinatesAccessed setcoordinatesaccessed = (setCoordinatesAccessed) this.IconCompatParcelizer;
        Runnable runnable = (Runnable) this.RemoteActionCompatParcelizer;
        return setcoordinatesaccessed.RemoteActionCompatParcelizer.schedule(new getCoordinatesAccessed(setcoordinatesaccessed, runnable, createHomeScope, 1), this.read, (TimeUnit) this.serializer);
    }

    @Override // o.accessgetMediaFastForwardcp
    public Object read() {
        access500 access500Var = (access500) this.IconCompatParcelizer;
        Iterable iterable = (Iterable) this.RemoteActionCompatParcelizer;
        accessgetEightcp accessgeteightcp = (accessgetEightcp) this.serializer;
        SQLiteEventStore sQLiteEventStore = (SQLiteEventStore) access500Var.IconCompatParcelizer;
        sQLiteEventStore.getClass();
        if (iterable.iterator().hasNext()) {
            String strConcat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(SQLiteEventStore.RemoteActionCompatParcelizer(iterable));
            SQLiteDatabase sQLiteDatabaseIconCompatParcelizer = sQLiteEventStore.IconCompatParcelizer();
            sQLiteDatabaseIconCompatParcelizer.beginTransaction();
            try {
                sQLiteDatabaseIconCompatParcelizer.compileStatement(strConcat).execute();
                Cursor cursorRawQuery = sQLiteDatabaseIconCompatParcelizer.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        sQLiteEventStore.read(cursorRawQuery.getInt(0), accessgetHcp.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseIconCompatParcelizer.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseIconCompatParcelizer.setTransactionSuccessful();
                sQLiteDatabaseIconCompatParcelizer.endTransaction();
            } catch (Throwable th2) {
                sQLiteDatabaseIconCompatParcelizer.endTransaction();
                throw th2;
            }
        }
        sQLiteEventStore.write(new accessgetMediaClosecp(((accessgetMediaPlaycp) access500Var.read).IconCompatParcelizer() + this.read, accessgeteightcp));
        return null;
    }

    public /* synthetic */ LookaheadCapablePlaceableResettableRulerScope(setCoordinatesAccessed setcoordinatesaccessed, Runnable runnable, long j, TimeUnit timeUnit) {
        this.IconCompatParcelizer = setcoordinatesaccessed;
        this.RemoteActionCompatParcelizer = runnable;
        this.read = j;
        this.serializer = timeUnit;
    }

    public /* synthetic */ LookaheadCapablePlaceableResettableRulerScope(access500 access500Var, Iterable iterable, accessgetEightcp accessgeteightcp, long j) {
        this.IconCompatParcelizer = access500Var;
        this.RemoteActionCompatParcelizer = iterable;
        this.serializer = accessgeteightcp;
        this.read = j;
    }
}
