package o;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import o.r8lambdaSl6HfpkWhWo6LDjCw2JoZqjyIyY;

/* JADX INFO: loaded from: classes3.dex */
public abstract class setInAppMessageDarkThemeWrapper<T extends r8lambdaSl6HfpkWhWo6LDjCw2JoZqjyIyY> extends r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs<T> {
    public abstract void IconCompatParcelizer(SQLiteDatabase sQLiteDatabase, int i);

    public abstract List<String> MediaSessionCompatQueueItem();

    public abstract List<String> RatingCompat();

    public abstract List<String> read();

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final List<String> serializer() {
        return RatingCompat();
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final List<String> write() {
        return MediaSessionCompatQueueItem();
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final void write(SQLiteDatabase sQLiteDatabase, int i) {
        IconCompatParcelizer(sQLiteDatabase, i);
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final List<String> IconCompatParcelizer() {
        ArrayList arrayList = new ArrayList(read());
        arrayList.add("unique_id text not null");
        return arrayList;
    }
}
