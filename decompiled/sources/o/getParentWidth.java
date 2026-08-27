package o;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;
import com.google.android.gms.measurement.internal.zzr;

/* JADX INFO: loaded from: classes2.dex */
public final class getParentWidth extends LayoutNodeSubcompositionsStatedeactivateOutOfFrame1 {
    public static final String[] write = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};
    public boolean read;
    public final LookaheadCapablePlacementScope serializer;

    @Override // o.LayoutNodeSubcompositionsStatedeactivateOutOfFrame1
    public final boolean MediaMetadataCompat() {
        return false;
    }

    public final void MediaSessionCompatQueueItem() {
        int iDelete;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        MediaSessionCompatToken();
        try {
            SQLiteDatabase sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == null || (iDelete = sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.delete("messages", null, null)) <= 0) {
                return;
            }
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.PlaybackStateCompat.serializer(Integer.valueOf(iDelete), "Reset local analytics data. records");
        } catch (SQLiteException e) {
            getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
            getlookaheaddelegate2.serializer.serializer(e, "Error resetting local analytics data. error");
        }
    }

    public final boolean MediaSessionCompatResultReceiverWrapper() {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        MediaSessionCompatToken();
        if (!this.read && lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i = 5;
            for (int i2 = 0; i2 < 5; i2++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                        if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                            sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.beginTransaction();
                            sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                            sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.setTransactionSuccessful();
                            sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.endTransaction();
                            sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                            return true;
                        }
                        this.read = true;
                    } catch (SQLiteException e) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        }
                        getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                        getlookaheaddelegate.serializer.serializer(e, "Error deleting app launch break from local database");
                        this.read = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i);
                    i += 20;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteFullException e2) {
                    getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                    getlookaheaddelegate2.serializer.serializer(e2, "Error deleting app launch break from local database");
                    this.read = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
            getlookaheaddelegate3.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0082  */
    /* JADX WARN: Code duplicated, block: B:75:0x0130 A[PHI: r8 r10
  0x0130: PHI (r8v5 int) = (r8v3 int), (r8v3 int), (r8v6 int) binds: [B:59:0x0106, B:74:0x012e, B:67:0x0116] A[DONT_GENERATE, DONT_INLINE]
  0x0130: PHI (r10v9 android.database.sqlite.SQLiteDatabase) = 
  (r10v7 android.database.sqlite.SQLiteDatabase)
  (r10v8 android.database.sqlite.SQLiteDatabase)
  (r10v10 android.database.sqlite.SQLiteDatabase)
 binds: [B:59:0x0106, B:74:0x012e, B:67:0x0116] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x013f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0144  */
    public final boolean RemoteActionCompatParcelizer(int i, byte[] bArr) {
        SQLiteDatabase sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        Cursor cursorRawQuery;
        long j;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        MediaSessionCompatToken();
        boolean z = false;
        z = false;
        if (!this.read) {
            setComposedWithReusableContentHost setcomposedwithreusablecontenthost = lookaheadScopeKtLookaheadScope221.PlaybackStateCompat;
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1 layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1 = premeasure0kLqBqw.onPanelClosed;
            Cursor cursor = null;
            cursor = null;
            zzr zzrVarSerializer = setcomposedwithreusablecontenthost.write(null, layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1) ? lookaheadScopeKtLookaheadScope221.MediaMetadataCompat().serializer((String) null) : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i));
            contentValues.put("entry", bArr);
            if (lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.write(null, layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1) && zzrVarSerializer != null) {
                contentValues.put("app_version", zzrVarSerializer.MediaSessionCompatQueueItem);
                contentValues.put("app_version_int", Long.valueOf(zzrVarSerializer.MediaSessionCompatResultReceiverWrapper));
            }
            int i2 = 5;
            int i3 = 5;
            int i4 = 0;
            while (i4 < i2) {
                try {
                    sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                    if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == null) {
                        this.read = true;
                    } else {
                        try {
                            sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.beginTransaction();
                            cursorRawQuery = sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.rawQuery("select count(1) from messages", null);
                            if (cursorRawQuery != null) {
                                try {
                                    if (cursorRawQuery.moveToFirst()) {
                                        j = cursorRawQuery.getLong(z ? 1 : 0);
                                    } else {
                                        j = 0;
                                    }
                                } catch (SQLiteDatabaseLockedException unused) {
                                    SystemClock.sleep(i3);
                                    i3 += 20;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                        sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                                    }
                                    i4++;
                                    i2 = 5;
                                    z = false;
                                } catch (SQLiteFullException e) {
                                    e = e;
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                    getlookaheaddelegate.serializer.serializer(e, "Error writing entry; local database full");
                                    this.read = true;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                        sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                                    }
                                    i4++;
                                    i2 = 5;
                                    z = false;
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                        try {
                                            if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.inTransaction()) {
                                                sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.endTransaction();
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                                            cursor = cursorRawQuery;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                                sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                    getlookaheaddelegate.serializer.serializer(e, "Error writing entry to local database");
                                    this.read = true;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                        sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                                    }
                                    i4++;
                                    i2 = 5;
                                    z = false;
                                }
                            } else {
                                j = 0;
                            }
                            if (j >= 100000) {
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("Data loss, local db full");
                                long j2 = 100001 - j;
                                long jDelete = sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j2)});
                                if (jDelete != j2) {
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                    getlookaheaddelegate.serializer.IconCompatParcelizer("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(jDelete), Long.valueOf(j2 - jDelete));
                                }
                            }
                            sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.insertOrThrow("messages", null, contentValues);
                            sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.setTransactionSuccessful();
                            sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.endTransaction();
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                            return true;
                        } catch (SQLiteDatabaseLockedException unused2) {
                            cursorRawQuery = null;
                        } catch (SQLiteFullException e3) {
                            e = e3;
                            cursorRawQuery = null;
                        } catch (SQLiteException e4) {
                            e = e4;
                            cursorRawQuery = null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                                sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.close();
                            }
                            throw th;
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused3) {
                    sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
                    cursorRawQuery = null;
                } catch (SQLiteFullException e5) {
                    e = e5;
                    sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
                    cursorRawQuery = null;
                } catch (SQLiteException e6) {
                    e = e6;
                    sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
                    cursorRawQuery = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteDatabaseR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
                }
            }
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.PlaybackStateCompat.RemoteActionCompatParcelizer("Failed to write entry to local database");
            return false;
        }
        return z;
    }

    public getParentWidth(LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221) {
        super(lookaheadScopeKtLookaheadScope221);
        this.serializer = new LookaheadCapablePlacementScope(this, ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaDescriptionCompat);
    }

    public final SQLiteDatabase r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        if (this.read) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.serializer.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.read = true;
        return null;
    }
}
