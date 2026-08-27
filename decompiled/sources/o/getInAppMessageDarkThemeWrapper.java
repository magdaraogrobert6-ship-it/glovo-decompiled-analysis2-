package o;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class getInAppMessageDarkThemeWrapper extends r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs<setRemoteImageUrl> {
    private static getInAppMessageDarkThemeWrapper RemoteActionCompatParcelizer;

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final List<String> serializer() {
        return Collections.EMPTY_LIST;
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final List<String> write() {
        return Collections.EMPTY_LIST;
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final void write(SQLiteDatabase sQLiteDatabase, int i) {
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final String MediaDescriptionCompat() {
        return "active_venue";
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final /* synthetic */ r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0 RemoteActionCompatParcelizer(Cursor cursor) throws IllegalArgumentException {
        return read(cursor, "");
    }

    public static getInAppMessageDarkThemeWrapper read() {
        if (RemoteActionCompatParcelizer == null) {
            RemoteActionCompatParcelizer = new getInAppMessageDarkThemeWrapper();
        }
        return RemoteActionCompatParcelizer;
    }

    public static setRemoteImageUrl read(Cursor cursor, String str) throws IllegalArgumentException {
        String str2 = r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs.read(str);
        return new setRemoteImageUrl(IconCompatParcelizer.IconCompatParcelizer(str2, "id", cursor), IconCompatParcelizer.IconCompatParcelizer(str2, "venue_id", cursor), cursor.getDouble(cursor.getColumnIndexOrThrow(str2.concat("latitude"))), cursor.getDouble(cursor.getColumnIndexOrThrow(str2.concat("longitude"))));
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final List<String> IconCompatParcelizer() {
        return Arrays.asList("id integer primary key autoincrement not null", "venue_id integer not null unique", "latitude real not null", "longitude real not null");
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final Class<setRemoteImageUrl> RemoteActionCompatParcelizer() {
        return setRemoteImageUrl.class;
    }
}
