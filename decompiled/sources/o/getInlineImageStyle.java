package o;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class getInlineImageStyle extends getBigPictureNotificationStyle {
    private final r8lambda43c3j9_07_y35Qq6GrmdmAdkBhI IconCompatParcelizer;

    @Override // o.getBigPictureNotificationStyle
    public final Long serializer() {
        return (Long) this.IconCompatParcelizer.RemoteActionCompatParcelizer(new r8lambdanXvk8hfSNmJvZNCNqAfYGXsOyk() { // from class: o.r8lambda7KAcfWD1MUphypMYrHFg21R1uE
            @Override // o.r8lambdanXvk8hfSNmJvZNCNqAfYGXsOyk
            public final Object write(SQLiteDatabase sQLiteDatabase) throws IOException {
                int i = r8lambda43c3j9_07_y35Qq6GrmdmAdkBhI.RemoteActionCompatParcelizer;
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT MIN(creation_time) FROM data_sync_payloads WHERE is_requested=1", null);
                try {
                    Long lValueOf = cursorRawQuery.moveToFirst() ? Long.valueOf(cursorRawQuery.getLong(0)) : null;
                    cursorRawQuery.close();
                    return lValueOf;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{cursorRawQuery, th}, sourceInformationContextOfdefault.read());
                        throw th2;
                    }
                }
            }
        });
    }

    public getInlineImageStyle(r8lambda43c3j9_07_y35Qq6GrmdmAdkBhI r8lambda43c3j9_07_y35qq6grmdmadkbhi) {
        this.IconCompatParcelizer = r8lambda43c3j9_07_y35qq6grmdmadkbhi;
    }

    @Override // o.getBigPictureNotificationStyle
    public final int read() {
        Object objSerializer = this.IconCompatParcelizer.serializer(0, new routeUserWithNotificationOpenedIntentandroid_sdk_ui_release(1));
        objSerializer.getClass();
        return ((Number) objSerializer).intValue();
    }
}
