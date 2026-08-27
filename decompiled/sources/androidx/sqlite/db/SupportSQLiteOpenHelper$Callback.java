package androidx.sqlite.db;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Pair;
import bo.app.af$$ExternalSyntheticOutline0;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import o.UncheckedColor;
import o.isSpecified8_81llAannotations;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public abstract class SupportSQLiteOpenHelper$Callback {
    public static final isSpecified8_81llAannotations read = new isSpecified8_81llAannotations();
    public final int MediaBrowserCompatMediaItem;

    public void onConfigure(UncheckedColor uncheckedColor) {
        uncheckedColor.getClass();
    }

    public abstract void onCreate(UncheckedColor uncheckedColor);

    public void onOpen(UncheckedColor uncheckedColor) {
        uncheckedColor.getClass();
    }

    public abstract void onUpgrade(UncheckedColor uncheckedColor, int i, int i2);

    public static void deleteDatabaseFile(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = removeNodeAtDepth.serializer(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        SentryLogcatAdapter.IconCompatParcelizer("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            SentryLogcatAdapter.write("SupportSQLite", "delete failed: ", e);
        }
    }

    public SupportSQLiteOpenHelper$Callback(int i) {
        this.MediaBrowserCompatMediaItem = i;
    }

    public void onCorruption(UncheckedColor uncheckedColor) {
        uncheckedColor.getClass();
        SentryLogcatAdapter.serializer("SupportSQLite", "Corruption reported by sqlite on database: " + uncheckedColor + ".path");
        if (!uncheckedColor.RatingCompat()) {
            String strMediaSessionCompatQueueItem = uncheckedColor.MediaSessionCompatQueueItem();
            if (strMediaSessionCompatQueueItem != null) {
                deleteDatabaseFile(strMediaSessionCompatQueueItem);
                return;
            }
            return;
        }
        List listMediaBrowserCompatMediaItem = null;
        try {
            try {
                listMediaBrowserCompatMediaItem = uncheckedColor.MediaBrowserCompatMediaItem();
            } finally {
                if (listMediaBrowserCompatMediaItem != null) {
                    Iterator it = listMediaBrowserCompatMediaItem.iterator();
                    while (it.hasNext()) {
                        Object obj = ((Pair) it.next()).second;
                        obj.getClass();
                        deleteDatabaseFile((String) obj);
                    }
                } else {
                    String strMediaSessionCompatQueueItem2 = uncheckedColor.MediaSessionCompatQueueItem();
                    if (strMediaSessionCompatQueueItem2 != null) {
                        deleteDatabaseFile(strMediaSessionCompatQueueItem2);
                    }
                }
            }
        } catch (SQLiteException unused) {
        }
        try {
            uncheckedColor.close();
        } catch (IOException unused2) {
        }
        if (listMediaBrowserCompatMediaItem != null) {
            return;
        }
    }

    public void onDowngrade(UncheckedColor uncheckedColor, int i, int i2) {
        uncheckedColor.getClass();
        throw new SQLiteException(af$$ExternalSyntheticOutline0.m(i, "Can't downgrade database from version ", i2, " to "));
    }
}
