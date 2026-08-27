package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import androidx.camera.core.impl.utils.futures.Futures$$ExternalSyntheticLambda3;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import io.sentry.SentryClient$$ExternalSyntheticLambda1;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import o.accessgetButton10cp;
import o.accessgetEightcp;
import o.accessgetHcp;
import o.accessgetLastChannelcp;
import o.accessgetMannerModecp;
import o.accessgetMcp;
import o.accessgetMediaEjectcp;
import o.accessgetMediaFastForwardcp;
import o.accessgetMediaPlayPausecp;
import o.accessgetMediaPlaycp;
import o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ;

/* JADX INFO: loaded from: classes2.dex */
public final class SQLiteEventStore implements Closeable {
    public static final accessgetButton10cp read = new accessgetButton10cp("proto");
    public final accessgetLastChannelcp IconCompatParcelizer;
    public final accessgetMediaPlaycp MediaMetadataCompat;
    public final accessgetMediaPlaycp RemoteActionCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ serializer;
    public final accessgetMcp write;

    public final SQLiteDatabase IconCompatParcelizer() {
        accessgetMcp accessgetmcp = this.write;
        Objects.requireNonNull(accessgetmcp);
        accessgetMediaPlaycp accessgetmediaplaycp = this.RemoteActionCompatParcelizer;
        long jIconCompatParcelizer = accessgetmediaplaycp.IconCompatParcelizer();
        while (true) {
            try {
                return accessgetmcp.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (accessgetmediaplaycp.IconCompatParcelizer() >= ((long) this.IconCompatParcelizer.write) + jIconCompatParcelizer) {
                    throw new SynchronizationException("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final ArrayList RemoteActionCompatParcelizer(SQLiteDatabase sQLiteDatabase, accessgetEightcp accessgeteightcp, int i) {
        ArrayList arrayList = new ArrayList();
        Long lIconCompatParcelizer = IconCompatParcelizer(sQLiteDatabase, accessgeteightcp);
        if (lIconCompatParcelizer == null) {
            return arrayList;
        }
        write(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lIconCompatParcelizer.toString()}, null, null, null, String.valueOf(i)), new SentryClient$$ExternalSyntheticLambda1(this, arrayList, accessgeteightcp, 3));
        return arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.write.close();
    }

    public SQLiteEventStore(accessgetMediaPlaycp accessgetmediaplaycp, accessgetMediaPlaycp accessgetmediaplaycp2, accessgetLastChannelcp accessgetlastchannelcp, accessgetMcp accessgetmcp, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.write = accessgetmcp;
        this.MediaMetadataCompat = accessgetmediaplaycp;
        this.RemoteActionCompatParcelizer = accessgetmediaplaycp2;
        this.IconCompatParcelizer = accessgetlastchannelcp;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public static Long IconCompatParcelizer(SQLiteDatabase sQLiteDatabase, accessgetEightcp accessgeteightcp) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(accessgeteightcp.serializer, String.valueOf(accessgetMediaPlayPausecp.serializer(accessgeteightcp.IconCompatParcelizer))));
        byte[] bArr = accessgeteightcp.read;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String RemoteActionCompatParcelizer(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((accessgetMannerModecp) it.next()).read);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object write(Cursor cursor, accessgetMediaEjectcp accessgetmediaejectcp) {
        try {
            return accessgetmediaejectcp.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final Object serializer(accessgetMediaFastForwardcp accessgetmediafastforwardcp) {
        SQLiteDatabase sQLiteDatabaseIconCompatParcelizer = IconCompatParcelizer();
        accessgetMediaPlaycp accessgetmediaplaycp = this.RemoteActionCompatParcelizer;
        long jIconCompatParcelizer = accessgetmediaplaycp.IconCompatParcelizer();
        while (true) {
            try {
                sQLiteDatabaseIconCompatParcelizer.beginTransaction();
                try {
                    Object obj = accessgetmediafastforwardcp.read();
                    sQLiteDatabaseIconCompatParcelizer.setTransactionSuccessful();
                    return obj;
                } finally {
                    sQLiteDatabaseIconCompatParcelizer.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (accessgetmediaplaycp.IconCompatParcelizer() >= ((long) this.IconCompatParcelizer.write) + jIconCompatParcelizer) {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final Object write(accessgetMediaEjectcp accessgetmediaejectcp) {
        SQLiteDatabase sQLiteDatabaseIconCompatParcelizer = IconCompatParcelizer();
        sQLiteDatabaseIconCompatParcelizer.beginTransaction();
        try {
            Object objApply = accessgetmediaejectcp.apply(sQLiteDatabaseIconCompatParcelizer);
            sQLiteDatabaseIconCompatParcelizer.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseIconCompatParcelizer.endTransaction();
        }
    }

    public final void read(long j, accessgetHcp accessgethcp, String str) {
        write(new Futures$$ExternalSyntheticLambda3(str, accessgethcp, j, 2));
    }
}
