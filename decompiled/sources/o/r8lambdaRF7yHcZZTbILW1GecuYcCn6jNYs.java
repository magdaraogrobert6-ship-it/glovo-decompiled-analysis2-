package o;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.ArrayList;
import java.util.List;
import o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs<T extends r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0> {
    public abstract List<String> IconCompatParcelizer();

    public abstract String MediaDescriptionCompat();

    public abstract Class<T> RemoteActionCompatParcelizer();

    public abstract r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0 RemoteActionCompatParcelizer(Cursor cursor) throws IllegalArgumentException;

    public abstract List<String> serializer();

    public abstract List<String> write();

    public abstract void write(SQLiteDatabase sQLiteDatabase, int i) throws SQLException;

    public final ArrayList IconCompatParcelizer(Cursor cursor, parseLonglambda0 parselonglambda0) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            try {
                arrayList.add(RemoteActionCompatParcelizer(cursor));
            } catch (Exception e) {
                parselonglambda0.IconCompatParcelizer(false, e, "Failed to build %s from cursor", RemoteActionCompatParcelizer().getName());
            }
        }
        cursor.close();
        return arrayList;
    }

    public static Float IconCompatParcelizer(Cursor cursor, String str) {
        try {
            int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
            if (write(cursor, columnIndexOrThrow)) {
                return Float.valueOf(cursor.getFloat(columnIndexOrThrow));
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final getTriggerId ParcelableVolumeInfo() {
        getTriggerId.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new getTriggerId.RemoteActionCompatParcelizer();
        remoteActionCompatParcelizer.serializer(MediaDescriptionCompat());
        remoteActionCompatParcelizer.serializer(IconCompatParcelizer());
        remoteActionCompatParcelizer.write(write());
        remoteActionCompatParcelizer.IconCompatParcelizer(serializer());
        return remoteActionCompatParcelizer.read();
    }

    public static String read(String str) {
        return str.isEmpty() ? "" : str.concat(BundleUtil.UNDERLINE_TAG);
    }

    public static String read(String str, String str2) {
        return str2 + "." + str + " as " + read(str2) + str;
    }

    public static boolean write(Cursor cursor, int i) {
        return (i == -1 || cursor.isNull(i)) ? false : true;
    }
}
