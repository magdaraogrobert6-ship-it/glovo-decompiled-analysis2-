package o;

import android.database.Cursor;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.android.SystemUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class getLightGray0d7_KjUannotations {
    private static int read = 0;
    private static int write = 1;

    public static requestGeofenceRefreshlambda2 RemoteActionCompatParcelizer(getIdentifiersValidationsEnabled getidentifiersvalidationsenabled) {
        int i = 2 % 2;
        int i2 = write + 115;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        requestGeofenceRefreshlambda2 requestgeofencerefreshlambda2 = (requestGeofenceRefreshlambda2) m1$$ExternalSyntheticOutline0.m(getidentifiersvalidationsenabled, "http://localhost/", requestGeofenceRefreshlambda2.class);
        int i4 = read + 113;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return requestgeofencerefreshlambda2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:12:0x003f  */
    /* JADX WARN: Code duplicated, block: B:13:0x0049  */
    /* JADX WARN: Instruction removed from duplicated block: B:10:0x0026, please report this as an issue */
    public static final int serializer(Cursor cursor, String str) {
        int columnIndex;
        String strSerializer;
        int i = 2 % 2;
        int i2 = read + 13;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            cursor.getClass();
            columnIndex = cursor.getColumnIndex(str);
            int i3 = 55 / 0;
            if (columnIndex < 0) {
                columnIndex = cursor.getColumnIndex("`" + str + '`');
                if (columnIndex >= 0) {
                    int i4 = write + 81;
                    read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                } else {
                    columnIndex = -1;
                }
            }
        } else {
            cursor.getClass();
            columnIndex = cursor.getColumnIndex(str);
            if (columnIndex < 0) {
                columnIndex = cursor.getColumnIndex("`" + str + '`');
                if (columnIndex >= 0) {
                    int i6 = write + 81;
                    read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                } else {
                    columnIndex = -1;
                }
            }
        }
        if (columnIndex >= 0) {
            int i8 = read + 13;
            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return columnIndex;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            columnNames.getClass();
            strSerializer = onContentCardClicked.serializer(columnNames, null, null, null, 63);
        } catch (Exception unused) {
            strSerializer = SystemUtils.UNKNOWN;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m("column '", str, "' does not exist. Available columns: ", strSerializer));
        return 0;
    }
}
