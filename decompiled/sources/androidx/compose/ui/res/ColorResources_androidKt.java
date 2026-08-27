package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import o.getBirthDateFull;
import o.getNewPassword;
import o.getPostalCode;
import o.setLeft;

/* JADX INFO: loaded from: classes.dex */
public final class ColorResources_androidKt {
    public static final long colorResource(int i, getBirthDateFull getbirthdatefull, int i2) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        Context context = (Context) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext());
        Resources resources = (Resources) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalResources());
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = setLeft.read;
        return ColorKt.Color(resources.getColor(i, theme));
    }
}
