package o;

import android.app.Application;
import android.content.ClipData;
import android.os.Build;
import android.widget.Toast;

/* JADX INFO: loaded from: classes3.dex */
public final class Nonelambda0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final Application read;
    public final setTransactionSuccessful serializer;

    public Nonelambda0(Application application, setTransactionSuccessful settransactionsuccessful) {
        application.getClass();
        settransactionsuccessful.getClass();
        this.read = application;
        this.serializer = settransactionsuccessful;
    }

    public final void RemoteActionCompatParcelizer(String str, String str2) {
        String str3;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 9;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        str2.getClass();
        ClipData clipDataNewPlainText = ClipData.newPlainText(str, str2);
        Application application = this.read;
        Object systemService = application.getSystemService("clipboard");
        systemService.getClass();
        ((android.content.ClipboardManager) systemService).setPrimaryClip(clipDataNewPlainText);
        if (Build.VERSION.SDK_INT <= 32) {
            int i4 = IconCompatParcelizer + 65;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                str3 = this.serializer.read(com.logistics.rider.glovo.R.string.all_clipboard, str);
            } else {
                str3 = this.serializer.read(com.logistics.rider.glovo.R.string.all_clipboard, str);
            }
            Toast.makeText(application, str3, 1).show();
        }
    }
}
