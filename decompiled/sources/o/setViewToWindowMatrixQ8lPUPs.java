package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class setViewToWindowMatrixQ8lPUPs {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final EnumColumnAdapter RemoteActionCompatParcelizer;

    public setViewToWindowMatrixQ8lPUPs(EnumColumnAdapter enumColumnAdapter) {
        enumColumnAdapter.getClass();
        this.RemoteActionCompatParcelizer = enumColumnAdapter;
    }

    public final void read(String str, String str2) {
        int i = 2 % 2;
        int i2 = serializer + 125;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        EnumColumnAdapter.serializer(this.RemoteActionCompatParcelizer, str, executeAsList.OTW, str2);
        int i4 = serializer + 97;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
    }

    public final void write(String str, String str2, Throwable th) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 13;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            str2.getClass();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        str2.getClass();
        if (th == null || !(th instanceof IOException)) {
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Event:", str, "\nMessage:", str2, "\nException:");
            sbM.append(th);
            String string = sbM.toString();
            int iHashCode = str.hashCode();
            if (iHashCode != -1947078002) {
                if (iHashCode != -1513157346) {
                    if (iHashCode == 1849015535 && str.equals("GCC_DISCONNECTION_EVENT")) {
                        read("chat_closing_failed_retrieve_user", string);
                        return;
                    }
                    return;
                }
                if (!str.equals("GCC_CHAT_NOT_INITIALIZED_NO_CLIENT_CONFIG")) {
                    int i3 = serializer + 75;
                    IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i3 % 2 != 0) {
                        int i4 = 2 / 5;
                        return;
                    }
                    return;
                }
            } else if (!str.equals("FETCH_HC_REGION_EVENT")) {
                return;
            }
            read("chat_configuration_failed", string);
        }
    }
}
