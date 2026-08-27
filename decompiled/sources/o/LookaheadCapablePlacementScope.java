package o;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class LookaheadCapablePlacementScope extends getPlusEK5gGoQ {
    public final /* synthetic */ getParentWidth IconCompatParcelizer;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.IconCompatParcelizer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        RangesKt.serializer(getlookaheaddelegate, sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.IconCompatParcelizer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        RangesKt.RemoteActionCompatParcelizer(getlookaheaddelegate, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", getParentWidth.write);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LookaheadCapablePlacementScope(getParentWidth getparentwidth, Context context) {
        super(context, "google_app_measurement_local.db");
        this.IconCompatParcelizer = getparentwidth;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            getParentWidth getparentwidth = this.IconCompatParcelizer;
            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) getparentwidth.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("Opening the local database failed, dropping and recreating it");
            if (!lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat.getDatabasePath("google_app_measurement_local.db").delete()) {
                getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                getlookaheaddelegate2.serializer.serializer("google_app_measurement_local.db", "Failed to delete corrupted local db file");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                getLookaheadDelegate getlookaheaddelegate3 = ((LookaheadScopeKtLookaheadScope221) getparentwidth.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                getlookaheaddelegate3.serializer.serializer(e2, "Failed to open local database. Events will bypass local storage");
                return null;
            }
        }
    }
}
