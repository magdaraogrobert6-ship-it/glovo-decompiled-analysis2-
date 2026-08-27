package o;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class getJsonObject extends r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs<setAssetsZipRemoteUrl> {
    private static getJsonObject serializer;

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final void write(SQLiteDatabase sQLiteDatabase, int i) {
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final String MediaDescriptionCompat() {
        return "active_venue_tag";
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final Class<setAssetsZipRemoteUrl> RemoteActionCompatParcelizer() {
        return setAssetsZipRemoteUrl.class;
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0 RemoteActionCompatParcelizer(Cursor cursor) throws IllegalArgumentException {
        String str = r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs.read("");
        return new setAssetsZipRemoteUrl(IconCompatParcelizer.IconCompatParcelizer(str, "id", cursor), IconCompatParcelizer.IconCompatParcelizer(str, "venue_id", cursor), IconCompatParcelizer.IconCompatParcelizer(str, "tag_id", cursor));
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final List<String> serializer() {
        return Collections.singletonList("CREATE UNIQUE INDEX active_venue_id_tag_id_index ON active_venue_tag(venue_id,tag_id)");
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final List<String> write() {
        return Arrays.asList("FOREIGN KEY(venue_id) REFERENCES active_venue(venue_id) ON DELETE CASCADE", "FOREIGN KEY(tag_id) REFERENCES active_tag(id) ON DELETE CASCADE");
    }

    public static getJsonObject read() {
        if (serializer == null) {
            serializer = new getJsonObject();
        }
        return serializer;
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final List<String> IconCompatParcelizer() {
        return Arrays.asList("id integer primary key", "venue_id integer not null", "tag_id integer not null");
    }
}
