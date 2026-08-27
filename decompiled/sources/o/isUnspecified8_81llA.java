package o;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import androidx.compose.ui.tooling.data.SlotTreeKt$$ExternalSyntheticLambda0;
import bo.app.b8$$ExternalSyntheticLambda4;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes.dex */
public final class isUnspecified8_81llA implements UncheckedColor {
    public static final onViewDetachedFromWindowlambda1 IconCompatParcelizer;
    public static final onViewDetachedFromWindowlambda1 serializer;
    public final SQLiteDatabase RemoteActionCompatParcelizer;
    public static final String[] write = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] read = new String[0];

    @Override // o.UncheckedColor
    public final void read() throws IllegalAccessException, InvocationTargetException {
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = serializer;
        if (((Method) onviewdetachedfromwindowlambda1.MediaSessionCompatResultReceiverWrapper()) != null) {
            onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda2 = IconCompatParcelizer;
            if (((Method) onviewdetachedfromwindowlambda2.MediaSessionCompatResultReceiverWrapper()) != null) {
                Method method = (Method) onviewdetachedfromwindowlambda1.MediaSessionCompatResultReceiverWrapper();
                method.getClass();
                Method method2 = (Method) onviewdetachedfromwindowlambda2.MediaSessionCompatResultReceiverWrapper();
                method2.getClass();
                Object objInvoke = method2.invoke(this.RemoteActionCompatParcelizer, null);
                if (objInvoke != null) {
                    method.invoke(objInvoke, 0, null, 0, null);
                    return;
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Required value was null.");
                    return;
                }
            }
        }
        serializer();
    }

    @Override // o.UncheckedColor
    public final void IconCompatParcelizer() {
        this.RemoteActionCompatParcelizer.disableWriteAheadLogging();
    }

    @Override // o.UncheckedColor
    public final List MediaBrowserCompatMediaItem() {
        return this.RemoteActionCompatParcelizer.getAttachedDbs();
    }

    @Override // o.UncheckedColor
    public final boolean MediaDescriptionCompat() {
        return this.RemoteActionCompatParcelizer.inTransaction();
    }

    @Override // o.UncheckedColor
    public final void MediaMetadataCompat() {
        this.RemoteActionCompatParcelizer.endTransaction();
    }

    @Override // o.UncheckedColor
    public final String MediaSessionCompatQueueItem() {
        return this.RemoteActionCompatParcelizer.getPath();
    }

    @Override // o.UncheckedColor
    public final void MediaSessionCompatResultReceiverWrapper() {
        this.RemoteActionCompatParcelizer.setTransactionSuccessful();
    }

    @Override // o.UncheckedColor
    public final boolean PlaybackStateCompatCustomAction() {
        return this.RemoteActionCompatParcelizer.isWriteAheadLoggingEnabled();
    }

    @Override // o.UncheckedColor
    public final boolean RatingCompat() {
        return this.RemoteActionCompatParcelizer.isOpen();
    }

    @Override // o.UncheckedColor
    public final void RemoteActionCompatParcelizer() {
        this.RemoteActionCompatParcelizer.beginTransactionNonExclusive();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.RemoteActionCompatParcelizer.close();
    }

    @Override // o.UncheckedColor
    public final void read(Object[] objArr) {
        this.RemoteActionCompatParcelizer.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    @Override // o.UncheckedColor
    public final void serializer() {
        this.RemoteActionCompatParcelizer.beginTransaction();
    }

    @Override // o.UncheckedColor
    public final boolean write() {
        return this.RemoteActionCompatParcelizer.enableWriteAheadLogging();
    }

    public isUnspecified8_81llA(SQLiteDatabase sQLiteDatabase) {
        this.RemoteActionCompatParcelizer = sQLiteDatabase;
    }

    @Override // o.UncheckedColor
    public final Cursor serializer(compositeOverOWjLjI compositeoverowjlji) {
        final SlotTreeKt$$ExternalSyntheticLambda0 slotTreeKt$$ExternalSyntheticLambda0 = new SlotTreeKt$$ExternalSyntheticLambda0(2, compositeoverowjlji);
        Cursor cursorRawQueryWithFactory = this.RemoteActionCompatParcelizer.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: o.lerpjxsXWHM
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) slotTreeKt$$ExternalSyntheticLambda0.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, compositeoverowjlji.getSql(), read, null);
        cursorRawQueryWithFactory.getClass();
        return cursorRawQueryWithFactory;
    }

    @Override // o.UncheckedColor
    public final luminance8_81llA write(String str) {
        str.getClass();
        SQLiteStatement sQLiteStatementCompileStatement = this.RemoteActionCompatParcelizer.compileStatement(str);
        sQLiteStatementCompileStatement.getClass();
        return new toArgb8_81llA(sQLiteStatementCompileStatement);
    }

    @Override // o.UncheckedColor
    public final int write(ContentValues contentValues, Object[] objArr) {
        int i = 0;
        if (contentValues.size() == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Empty values");
            return 0;
        }
        int size = contentValues.size();
        int length = objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(write[3]);
        sb.append("WorkSpec SET ");
        for (String str : contentValues.keySet()) {
            sb.append(i > 0 ? "," : "");
            sb.append(str);
            objArr2[i] = contentValues.get(str);
            sb.append("=?");
            i++;
        }
        for (int i2 = size; i2 < length; i2++) {
            objArr2[i2] = objArr[i2 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        luminance8_81llA luminance8_81llaWrite = write(sb.toString());
        ColorKt.write(luminance8_81llaWrite, objArr2);
        return ((toArgb8_81llA) luminance8_81llaWrite).IconCompatParcelizer.executeUpdateDelete();
    }

    @Override // o.UncheckedColor
    public final void RemoteActionCompatParcelizer(String str) {
        this.RemoteActionCompatParcelizer.execSQL(str);
    }

    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        IconCompatParcelizer = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new b8$$ExternalSyntheticLambda4(25));
        serializer = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new b8$$ExternalSyntheticLambda4(26));
    }

    @Override // o.UncheckedColor
    public final Cursor serializer(String str) {
        return serializer(new colorResource(str));
    }

    @Override // o.UncheckedColor
    public final Cursor RemoteActionCompatParcelizer(compositeOverOWjLjI compositeoverowjlji, CancellationSignal cancellationSignal) {
        Cursor cursorRawQueryWithFactory = this.RemoteActionCompatParcelizer.rawQueryWithFactory(new takeOrElseDxMtmZc(0, compositeoverowjlji), compositeoverowjlji.getSql(), read, null, cancellationSignal);
        cursorRawQueryWithFactory.getClass();
        return cursorRawQueryWithFactory;
    }
}
