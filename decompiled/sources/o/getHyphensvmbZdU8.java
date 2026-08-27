package o;

import android.content.Intent;
import android.net.Uri;
import com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getHyphensvmbZdU8 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    public static final void write(getHyphensEaSxIns gethyphenseasxins, double d, double d2, SelfServiceCustomerChatActivity selfServiceCustomerChatActivity) {
        int i = 2 % 2;
        gethyphenseasxins.getClass();
        Uri uri = Uri.parse("geo:0,0?q=" + d + "," + d2);
        uri.getClass();
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        if (intent.resolveActivity(selfServiceCustomerChatActivity.getPackageManager()) == null) {
            Timber.RemoteActionCompatParcelizer.getClass();
            int i2 = IconCompatParcelizer + 101;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i3 = RemoteActionCompatParcelizer + 93;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            selfServiceCustomerChatActivity.startActivity(intent);
        } else {
            selfServiceCustomerChatActivity.startActivity(intent);
            int i4 = 88 / 0;
        }
    }
}
