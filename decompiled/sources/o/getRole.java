package o;

import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class getRole implements setBlurFilter {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;

    @Override // o.setBlurFilter
    public final void IconCompatParcelizer(String str) throws Throwable {
        int i = 2 % 2;
        str.getClass();
        if (str.equals("app_start_to_interactive")) {
            int i2 = RemoteActionCompatParcelizer + 19;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.write(1, str);
            } else {
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.write(0, str);
            }
        }
        int i3 = serializer + 49;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 82 / 0;
        }
    }

    @Override // o.setBlurFilter
    public final void serializer(String str, HashMap map) throws Throwable {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 81;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        map.getClass();
        if (str.equals("app_start_to_interactive")) {
            int i4 = RemoteActionCompatParcelizer + 27;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.RemoteActionCompatParcelizer(0, str);
        }
    }
}
