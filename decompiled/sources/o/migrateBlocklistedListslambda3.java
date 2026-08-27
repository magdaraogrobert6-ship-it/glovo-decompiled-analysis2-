package o;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteOpenHelper;
import com.sentiance.sdk.util.Optional;

/* JADX INFO: loaded from: classes4.dex */
public abstract class migrateBlocklistedListslambda3 extends SQLiteOpenHelper {
    private final ServerConfigDataStoreProviderCompanionExternalSyntheticLambda1 RemoteActionCompatParcelizer;
    private final parseLonglambda0 read;

    public migrateBlocklistedListslambda3(Context context, String str, int i, parseLonglambda0 parselonglambda0, ServerConfigDataStoreProviderCompanionExternalSyntheticLambda1 serverConfigDataStoreProviderCompanionExternalSyntheticLambda1) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.read = parselonglambda0;
        this.RemoteActionCompatParcelizer = serverConfigDataStoreProviderCompanionExternalSyntheticLambda1;
    }

    public abstract migrateBlocklistedListlambda1 serializer();

    private Optional<SQLiteDatabase> read() {
        try {
            return Optional.write(super.getWritableDatabase());
        } catch (SQLiteException e) {
            this.read.IconCompatParcelizer(false, e, "Error trying to open a readable database (%s)", getDatabaseName());
            return Optional.MediaSessionCompatQueueItem();
        }
    }

    private <T> T serializer(migrateBlocklistedListslambda2 migrateblocklistedlistslambda2, Optional<SQLiteDatabase> optional, T t) {
        try {
            if (optional.IconCompatParcelizer()) {
                if (migrateblocklistedlistslambda2 instanceof migrateBlocklistedListslambda1) {
                    ((migrateBlocklistedListslambda1) migrateblocklistedlistslambda2).serializer(optional.write());
                    return t;
                }
                if (migrateblocklistedlistslambda2 instanceof r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk) {
                    return (T) ((r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk) migrateblocklistedlistslambda2).serializer(optional.write());
                }
                if (migrateblocklistedlistslambda2 instanceof r8lambdanXvk8hfSNmJvZNCNqAfYGXsOyk) {
                    return (T) ((r8lambdanXvk8hfSNmJvZNCNqAfYGXsOyk) migrateblocklistedlistslambda2).write(optional.write());
                }
            }
            return t;
        } catch (SQLiteFullException e) {
            this.read.IconCompatParcelizer(false, e, "SQLiteFullException, publishing via SQLiteFullExceptionNotifier", new Object[0]);
            this.RemoteActionCompatParcelizer.serializer(e);
            getCooldownEnterSeconds getcooldownenterseconds = (getCooldownEnterSeconds) serializer();
            getcooldownenterseconds.getClass();
            getcooldownenterseconds.serializer(e, (Long) null, new ContentValues());
            return t;
        }
    }

    public final <T> T RemoteActionCompatParcelizer(r8lambdanXvk8hfSNmJvZNCNqAfYGXsOyk<T> r8lambdanxvk8hfsnmjvzncnqafygxsoyk) {
        return (T) serializer(r8lambdanxvk8hfsnmjvzncnqafygxsoyk, read(), null);
    }

    public final void serializer(migrateBlocklistedListslambda1 migrateblocklistedlistslambda1) {
        serializer(migrateblocklistedlistslambda1, read(), null);
    }

    public final <T> T serializer(T t, r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk<T> r8lambdauimhpfnosq1ucjcbcd7bcdetblk) {
        return (T) serializer(r8lambdauimhpfnosq1ucjcbcd7bcdetblk, read(), t);
    }
}
