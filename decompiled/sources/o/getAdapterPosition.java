package o;

import android.app.Application;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class getAdapterPosition implements clearReturnedFromScrapFlag {
    private static int read = 0;
    private static int serializer = 1;
    public final Application IconCompatParcelizer;

    public getAdapterPosition(Application application) {
        this.IconCompatParcelizer = application;
    }

    @Override // o.clearReturnedFromScrapFlag
    public final flagRemovedAndOffsetPosition serializer(String str) {
        String string;
        int i = 2 % 2;
        int i2 = read + 85;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            str.getClass();
            Pattern patternCompile = Pattern.compile("[a-zA-Z0-9+._%\\-]{1,256}@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");
            patternCompile.getClass();
            patternCompile.matcher(str).matches();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        str.getClass();
        Pattern patternCompile2 = Pattern.compile("[a-zA-Z0-9+._%\\-]{1,256}@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");
        patternCompile2.getClass();
        if (patternCompile2.matcher(str).matches()) {
            return new flagRemovedAndOffsetPosition(true, "");
        }
        boolean zIconCompatParcelizer = hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str, (CharSequence) "@", false);
        boolean zIconCompatParcelizer2 = hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str, (CharSequence) ".", false);
        Application application = this.IconCompatParcelizer;
        if (zIconCompatParcelizer2 ^ zIconCompatParcelizer) {
            string = application.getResources().getString(com.logistics.rider.glovo.R.string.login_invalid_email_missing_character);
            int i3 = read + 35;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        } else {
            string = application.getResources().getString(com.logistics.rider.glovo.R.string.login_invalid_email_not_complete);
        }
        string.getClass();
        return new flagRemovedAndOffsetPosition(false, string);
    }
}
