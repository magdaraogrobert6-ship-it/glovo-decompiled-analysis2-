package androidx.sqlite.db.framework;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper$Callback;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.Extras$Key;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.File;
import o.ColorMatrix;
import o.UncheckedColor;
import o.convertRgbToYuvimpl;
import o.isUnspecified8_81llA;
import o.setToRotateRedimpl;

/* JADX INFO: loaded from: classes.dex */
public final class FrameworkSQLiteOpenHelper$OpenHelper extends SQLiteOpenHelper {
    public static final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    public final Context IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public boolean MediaMetadataCompat;
    public final setToRotateRedimpl RatingCompat;
    public final Extras$Key read;
    public final SupportSQLiteOpenHelper$Callback serializer;
    public final boolean write;

    final class CallbackException extends RuntimeException {
        public final ColorMatrix RemoteActionCompatParcelizer;
        public final Throwable read;

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return this.read;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallbackException(ColorMatrix colorMatrix, Throwable th) {
            super(th);
            colorMatrix.getClass();
            this.RemoteActionCompatParcelizer = colorMatrix;
            this.read = th;
        }
    }

    public final isUnspecified8_81llA IconCompatParcelizer(SQLiteDatabase sQLiteDatabase) {
        Extras$Key extras$Key = this.read;
        extras$Key.getClass();
        isUnspecified8_81llA isunspecified8_81lla = (isUnspecified8_81llA) extras$Key.IconCompatParcelizer;
        if (isunspecified8_81lla != null && isunspecified8_81lla.RemoteActionCompatParcelizer.equals(sQLiteDatabase)) {
            return isunspecified8_81lla;
        }
        isUnspecified8_81llA isunspecified8_81lla2 = new isUnspecified8_81llA(sQLiteDatabase);
        extras$Key.IconCompatParcelizer = isunspecified8_81lla2;
        return isunspecified8_81lla2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        setToRotateRedimpl settorotateredimpl = this.RatingCompat;
        try {
            settorotateredimpl.IconCompatParcelizer(settorotateredimpl.serializer);
            super.close();
            this.read.IconCompatParcelizer = null;
            this.MediaBrowserCompatMediaItem = false;
        } finally {
            settorotateredimpl.IconCompatParcelizer();
        }
    }

    public final UncheckedColor serializer(boolean z) {
        setToRotateRedimpl settorotateredimpl = this.RatingCompat;
        try {
            settorotateredimpl.IconCompatParcelizer((this.MediaBrowserCompatMediaItem || getDatabaseName() == null) ? false : true);
            this.MediaMetadataCompat = false;
            SQLiteDatabase sQLiteDatabase = read(z);
            if (!this.MediaMetadataCompat) {
                return IconCompatParcelizer(sQLiteDatabase);
            }
            close();
            return serializer(z);
        } finally {
            settorotateredimpl.IconCompatParcelizer();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameworkSQLiteOpenHelper$OpenHelper(Context context, String str, final Extras$Key extras$Key, final SupportSQLiteOpenHelper$Callback supportSQLiteOpenHelper$Callback, boolean z) {
        super(context, str, null, supportSQLiteOpenHelper$Callback.MediaBrowserCompatMediaItem, new DatabaseErrorHandler() { // from class: o.convertYuvToRgbimpl
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = FrameworkSQLiteOpenHelper$OpenHelper.RemoteActionCompatParcelizer;
                sQLiteDatabase.getClass();
                Extras$Key extras$Key2 = extras$Key;
                isUnspecified8_81llA isunspecified8_81lla = (isUnspecified8_81llA) extras$Key2.IconCompatParcelizer;
                if (isunspecified8_81lla == null || !isunspecified8_81lla.RemoteActionCompatParcelizer.equals(sQLiteDatabase)) {
                    isunspecified8_81lla = new isUnspecified8_81llA(sQLiteDatabase);
                    extras$Key2.IconCompatParcelizer = isunspecified8_81lla;
                }
                supportSQLiteOpenHelper$Callback.onCorruption(isunspecified8_81lla);
            }
        });
        context.getClass();
        supportSQLiteOpenHelper$Callback.getClass();
        this.IconCompatParcelizer = context;
        this.read = extras$Key;
        this.serializer = supportSQLiteOpenHelper$Callback;
        this.write = z;
        this.RatingCompat = new setToRotateRedimpl(str == null ? d$$ExternalSyntheticOutline0.m() : str, context.getCacheDir(), false);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        boolean z = this.MediaMetadataCompat;
        SupportSQLiteOpenHelper$Callback supportSQLiteOpenHelper$Callback = this.serializer;
        if (!z && supportSQLiteOpenHelper$Callback.MediaBrowserCompatMediaItem != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            supportSQLiteOpenHelper$Callback.onConfigure(IconCompatParcelizer(sQLiteDatabase));
        } catch (Throwable th) {
            throw new CallbackException(ColorMatrix.ON_CONFIGURE, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            this.serializer.onCreate(IconCompatParcelizer(sQLiteDatabase));
        } catch (Throwable th) {
            throw new CallbackException(ColorMatrix.ON_CREATE, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.MediaMetadataCompat) {
            try {
                this.serializer.onOpen(IconCompatParcelizer(sQLiteDatabase));
            } catch (Throwable th) {
                throw new CallbackException(ColorMatrix.ON_OPEN, th);
            }
        }
        this.MediaBrowserCompatMediaItem = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.MediaMetadataCompat = true;
        try {
            this.serializer.onDowngrade(IconCompatParcelizer(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new CallbackException(ColorMatrix.ON_DOWNGRADE, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.MediaMetadataCompat = true;
        try {
            this.serializer.onUpgrade(IconCompatParcelizer(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new CallbackException(ColorMatrix.ON_UPGRADE, th);
        }
    }

    public final SQLiteDatabase read(boolean z) throws Throwable {
        SQLiteDatabase readableDatabase;
        SQLiteDatabase readableDatabase2;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.MediaBrowserCompatMediaItem;
        Context context = this.IconCompatParcelizer;
        if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                SentryLogcatAdapter.IconCompatParcelizer("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                writableDatabase.getClass();
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase3 = getReadableDatabase();
            readableDatabase3.getClass();
            return readableDatabase3;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z) {
                    readableDatabase2 = getWritableDatabase();
                    readableDatabase2.getClass();
                } else {
                    readableDatabase2 = getReadableDatabase();
                    readableDatabase2.getClass();
                }
                return readableDatabase2;
            } catch (Throwable th) {
                th = th;
                if (th instanceof CallbackException) {
                    CallbackException callbackException = (CallbackException) th;
                    int i = convertRgbToYuvimpl.read[callbackException.RemoteActionCompatParcelizer.ordinal()];
                    th = callbackException.read;
                    if (i == 1 || i == 2 || i == 3 || i == 4) {
                        throw th;
                    }
                    if (i != 5) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                if (!(th instanceof SQLiteException) || databaseName == null || !this.write) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    if (z) {
                        readableDatabase = getWritableDatabase();
                        readableDatabase.getClass();
                    } else {
                        readableDatabase = getReadableDatabase();
                        readableDatabase.getClass();
                    }
                    return readableDatabase;
                } catch (CallbackException e) {
                    throw e.read;
                }
            }
        }
    }
}
