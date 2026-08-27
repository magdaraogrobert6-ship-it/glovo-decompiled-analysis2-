package o;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class SpannableExtensions_androidKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final Application read;
    public final setTransactionSuccessful serializer;

    public SpannableExtensions_androidKt(Application application, AndroidUiDispatcherCompanioncurrentThread1 androidUiDispatcherCompanioncurrentThread1, setTransactionSuccessful settransactionsuccessful) {
        this.read = application;
        this.serializer = settransactionsuccessful;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0063  */
    public final Object read(String str) {
        int i;
        int i2 = 2 % 2;
        Object isitemdismissable = createFromParcel.INSTANCE;
        Application application = this.read;
        Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + str));
        intent.setFlags(268435456);
        try {
            application.startActivity(intent);
            int i3 = write + 29;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 62 / 0;
            }
            return isitemdismissable;
        } catch (ActivityNotFoundException unused) {
            isitemdismissable = new isItemDismissable(new Throwable(this.serializer.IconCompatParcelizer(com.logistics.rider.glovo.R.string.toast_error_dial_intent)));
            i = RemoteActionCompatParcelizer + 23;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i5 = 51 / 0;
            }
            return isitemdismissable;
        } catch (SecurityException unused2) {
            Intent intentCreateChooser = Intent.createChooser(intent, null);
            intentCreateChooser.setFlags(268435456);
            application.startActivity(intentCreateChooser);
            i = RemoteActionCompatParcelizer + 23;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i6 = 51 / 0;
            }
            return isitemdismissable;
        }
    }
}
