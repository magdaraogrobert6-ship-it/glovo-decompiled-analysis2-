package o;

import android.app.Application;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class getLayoutPosition implements clearReturnedFromScrapFlag {
    private static int read = 0;
    private static int write = 1;
    public final Application serializer;

    public getLayoutPosition(Application application) {
        this.serializer = application;
    }

    @Override // o.clearReturnedFromScrapFlag
    public final flagRemovedAndOffsetPosition serializer(String str) {
        int i = 2 % 2;
        int i2 = write + 45;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            str.getClass();
            Pattern patternCompile = Pattern.compile("^(\\+)?\\d{8,18}$");
            patternCompile.getClass();
            patternCompile.matcher(str).matches();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        str.getClass();
        Pattern patternCompile2 = Pattern.compile("^(\\+)?\\d{8,18}$");
        patternCompile2.getClass();
        if (!patternCompile2.matcher(str).matches()) {
            String string = this.serializer.getResources().getString(com.logistics.rider.glovo.R.string.login_invalid_phone_message);
            string.getClass();
            return new flagRemovedAndOffsetPosition(false, string);
        }
        flagRemovedAndOffsetPosition flagremovedandoffsetposition = new flagRemovedAndOffsetPosition(true, "");
        int i3 = write + 19;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return flagremovedandoffsetposition;
    }
}
