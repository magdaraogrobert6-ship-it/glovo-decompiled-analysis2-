package o;

import com.roadrunner.nafath.logger.NafathLogger$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class m3 {
    private static int read = 0;
    private static int write = 1;

    public static String RemoteActionCompatParcelizer(List list) {
        int i = 2 % 2;
        list.getClass();
        if (!list.isEmpty()) {
            String strIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(list, ",", null, null, new NafathLogger$$ExternalSyntheticLambda0(5), 30);
            int i2 = write + 101;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return strIconCompatParcelizer;
        }
        int i4 = write + 103;
        int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i5;
        if (i4 % 2 != 0) {
            int i6 = 28 / 0;
        }
        int i7 = i5 + 29;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            int i8 = 52 / 0;
        }
        return "";
    }
}
