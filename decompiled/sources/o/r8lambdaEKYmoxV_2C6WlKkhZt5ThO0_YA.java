package o;

import android.app.Activity;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaEKYmoxV_2C6WlKkhZt5ThO0_YA {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final r8lambda8ONSZngU81o_LRT9BkSkXpME2w serializer;

    public r8lambdaEKYmoxV_2C6WlKkhZt5ThO0_YA(r8lambda8ONSZngU81o_LRT9BkSkXpME2w r8lambda8onszngu81o_lrt9bkskxpme2w) {
        r8lambda8onszngu81o_lrt9bkskxpme2w.getClass();
        this.serializer = r8lambda8onszngu81o_lrt9bkskxpme2w;
    }

    public final boolean read(r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08 r8lambda60pwjrj_ieyypznb7gugmuamr08, Activity activity) {
        int i;
        int i2 = 2 % 2;
        int i3 = read + 77;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda60pwjrj_ieyypznb7gugmuamr08.getClass();
        activity.getClass();
        List listSerializer = this.serializer.write(r8lambda60pwjrj_ieyypznb7gugmuamr08).serializer();
        if (listSerializer.isEmpty()) {
            int i5 = IconCompatParcelizer + 49;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        List list = listSerializer;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (FocusListener.write(activity, (String) it.next()) == 0 && (i = i + 1) < 0) {
                    androidx.sqlite.SQLite.RemoteActionCompatParcelizer();
                    throw null;
                }
            }
        }
        return i == listSerializer.size();
    }
}
