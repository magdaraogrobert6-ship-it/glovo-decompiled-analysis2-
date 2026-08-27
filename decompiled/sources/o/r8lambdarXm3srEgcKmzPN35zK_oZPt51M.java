package o;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdarXm3srEgcKmzPN35zK_oZPt51M extends isPushPrimer<r8lambdaGFX2d0S8xnD6NnQUZmUE4F_pLug> {
    private static r8lambdarXm3srEgcKmzPN35zK_oZPt51M read;

    @Override // o.isPushPrimer
    public final List<String> MediaBrowserCompatMediaItem() {
        return Collections.EMPTY_LIST;
    }

    @Override // o.isPushPrimer
    public final List<String> RatingCompat() {
        return Collections.EMPTY_LIST;
    }

    @Override // o.isPushPrimer
    public final void serializer(SQLiteDatabase sQLiteDatabase, int i) {
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final String MediaDescriptionCompat() {
        return "screen";
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final Class<r8lambdaGFX2d0S8xnD6NnQUZmUE4F_pLug> RemoteActionCompatParcelizer() {
        return r8lambdaGFX2d0S8xnD6NnQUZmUE4F_pLug.class;
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0 RemoteActionCompatParcelizer(Cursor cursor) throws IllegalArgumentException {
        String str = r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs.read("");
        return new r8lambdaGFX2d0S8xnD6NnQUZmUE4F_pLug(IconCompatParcelizer.IconCompatParcelizer(str, "id", cursor), MediaSessionCompatQueueItem.read(str, "unique_id", cursor), cursor.getInt(cursor.getColumnIndexOrThrow(str.concat("state"))), IconCompatParcelizer.IconCompatParcelizer(str, "event_time", cursor), IconCompatParcelizer.IconCompatParcelizer(str, "time_horizon", cursor), isPushPrimer.RemoteActionCompatParcelizer(cursor, str), isPushPrimer.read(cursor, str));
    }

    @Override // o.isPushPrimer
    public final List<String> MediaMetadataCompat() {
        return Collections.singletonList("state integer not null");
    }

    @Override // o.isPushPrimer
    public final Byte MediaSessionCompatQueueItem() {
        return (byte) 3;
    }

    public static r8lambdarXm3srEgcKmzPN35zK_oZPt51M read() {
        if (read == null) {
            read = new r8lambdarXm3srEgcKmzPN35zK_oZPt51M();
        }
        return read;
    }
}
