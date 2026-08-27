package o;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class handleLogClicklambda1 extends r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs<getAssetsZipRemoteUrl> {
    private static handleLogClicklambda1 serializer;

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final List<String> write() {
        return Collections.EMPTY_LIST;
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final void write(SQLiteDatabase sQLiteDatabase, int i) {
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final String MediaDescriptionCompat() {
        return "active_tag";
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final /* synthetic */ r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0 RemoteActionCompatParcelizer(Cursor cursor) throws IllegalArgumentException {
        return write(cursor, "");
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final List<String> serializer() {
        return Collections.singletonList("CREATE UNIQUE INDEX active_tag_key_value_index ON active_tag(tag_key,tag_value)");
    }

    public static handleLogClicklambda1 read() {
        if (serializer == null) {
            serializer = new handleLogClicklambda1();
        }
        return serializer;
    }

    public static getAssetsZipRemoteUrl write(Cursor cursor, String str) throws IllegalArgumentException {
        String str2 = r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs.read(str);
        return new getAssetsZipRemoteUrl(IconCompatParcelizer.IconCompatParcelizer(str2, "id", cursor), MediaSessionCompatQueueItem.read(str2, "tag_key", cursor), MediaSessionCompatQueueItem.read(str2, "tag_value", cursor));
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final List<String> IconCompatParcelizer() {
        return Arrays.asList("id integer primary key", "tag_key text not null", "tag_value text not null");
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final Class<getAssetsZipRemoteUrl> RemoteActionCompatParcelizer() {
        return getAssetsZipRemoteUrl.class;
    }
}
