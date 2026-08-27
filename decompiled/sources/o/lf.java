package o;

import com.mapbox.api.directions.v5.models.Exclude;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lf {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;

    public static Exclude serializer(String str, boolean z, boolean z2) {
        List list;
        int i = 2 % 2;
        List list2 = instance_delegatelambda0.write;
        if (z) {
            int i2 = write + 123;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                str.equals("driving-traffic");
                throw null;
            }
            if (str.equals("driving-traffic")) {
                list = androidx.sqlite.SQLite.read("toll", "cash_only_tolls");
                int i3 = RemoteActionCompatParcelizer + 121;
                write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
            } else if (str.equals("driving")) {
                int i5 = write + 87;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                list = androidx.sqlite.SQLite.read("toll", "cash_only_tolls");
                int i7 = RemoteActionCompatParcelizer + 121;
                write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
            } else {
                int iSerializer = getQueryParameterslambda2.serializer();
                int iSerializer2 = getQueryParameterslambda2.serializer();
                list = (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, 516583654, new Object[]{"cash_only_tolls"}, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
            }
        } else {
            list = list2;
        }
        List list3 = list;
        if (z2 && (str.equals("driving-traffic") || str.equals("driving"))) {
            int iSerializer3 = getQueryParameterslambda2.serializer();
            int iSerializer4 = getQueryParameterslambda2.serializer();
            list2 = (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer4, 516583654, new Object[]{"motorway"}, getQueryParameterslambda2.serializer(), -516583649, iSerializer3);
        }
        ArrayList arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(list2, list3);
        if (arrayListIconCompatParcelizer.isEmpty()) {
            return null;
        }
        return Exclude.builder().criteria(arrayListIconCompatParcelizer).build();
    }
}
