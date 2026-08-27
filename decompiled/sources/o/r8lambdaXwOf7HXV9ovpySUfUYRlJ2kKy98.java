package o;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdaXwOf7HXV9ovpySUfUYRlJ2kKy98 extends r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs<_set_durationInMilliseconds_lambda1> {
    private static r8lambdaXwOf7HXV9ovpySUfUYRlJ2kKy98 serializer;

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final List<String> serializer() {
        return Collections.EMPTY_LIST;
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final void write(SQLiteDatabase sQLiteDatabase, int i) {
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final /* bridge */ /* synthetic */ r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0 RemoteActionCompatParcelizer(Cursor cursor) throws IllegalArgumentException {
        return RemoteActionCompatParcelizer(cursor, "");
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final String MediaDescriptionCompat() {
        return "stationary_venue";
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final List<String> write() {
        return Arrays.asList("FOREIGN KEY(stationary_id) REFERENCES transport_change(unique_id) ON DELETE CASCADE ON UPDATE CASCADE", "FOREIGN KEY(active_venue_row_id) REFERENCES active_venue(id) ON DELETE RESTRICT ON UPDATE RESTRICT");
    }

    public static r8lambdaXwOf7HXV9ovpySUfUYRlJ2kKy98 read() {
        if (serializer == null) {
            serializer = new r8lambdaXwOf7HXV9ovpySUfUYRlJ2kKy98();
        }
        return serializer;
    }

    public static _set_durationInMilliseconds_lambda1 RemoteActionCompatParcelizer(Cursor cursor, String str) throws IllegalArgumentException {
        String str2 = r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs.read(str);
        return new _set_durationInMilliseconds_lambda1(IconCompatParcelizer.IconCompatParcelizer(str2, "id", cursor), MediaSessionCompatQueueItem.read(str2, "stationary_id", cursor), IconCompatParcelizer.IconCompatParcelizer(str2, "active_venue_row_id", cursor), cursor.getFloat(cursor.getColumnIndexOrThrow(str2.concat("likelihood"))));
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final List<String> IconCompatParcelizer() {
        return Arrays.asList("id integer primary key", "stationary_id text not null", "active_venue_row_id integer not null", "likelihood real not null");
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final Class<_set_durationInMilliseconds_lambda1> RemoteActionCompatParcelizer() {
        return _set_durationInMilliseconds_lambda1.class;
    }
}
