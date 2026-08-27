package o;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class handleLogClicklambda2 extends r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs<InAppMessageBase> {
    private static handleLogClicklambda2 read;

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
        return "common";
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final Class<InAppMessageBase> RemoteActionCompatParcelizer() {
        return InAppMessageBase.class;
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0 RemoteActionCompatParcelizer(Cursor cursor) throws IllegalArgumentException {
        Long lValueOf;
        String str = r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs.read("");
        long jIconCompatParcelizer = IconCompatParcelizer.IconCompatParcelizer(str, "id", cursor);
        try {
            int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str.concat("sdk_event_ingestion_time"));
            lValueOf = r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs.write(cursor, columnIndexOrThrow) ? Long.valueOf(cursor.getLong(columnIndexOrThrow)) : null;
        } catch (IllegalArgumentException unused) {
        }
        return new InAppMessageBase(jIconCompatParcelizer, lValueOf);
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final List<String> IconCompatParcelizer() {
        return Arrays.asList("id integer primary key", "sdk_event_ingestion_time integer");
    }

    public static handleLogClicklambda2 read() {
        if (read == null) {
            read = new handleLogClicklambda2();
        }
        return read;
    }
}
