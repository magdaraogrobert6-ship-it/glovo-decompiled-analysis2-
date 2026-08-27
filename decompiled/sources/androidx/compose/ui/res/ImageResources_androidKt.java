package androidx.compose.ui.res;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import o.AndroidContentCaptureManager;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getNewPassword;
import o.getPostalCode;

/* JADX INFO: loaded from: classes.dex */
public final class ImageResources_androidKt {
    public static final ImageBitmap imageResource(ImageBitmap.Companion companion, int i, getBirthDateFull getbirthdatefull, int i2) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        Resources resources = (Resources) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalResources());
        Object objComponentActivity = getpostalcode.ComponentActivity();
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        if (objComponentActivity == androidContentCaptureManager) {
            objComponentActivity = new TypedValue();
            getpostalcode.write(objComponentActivity);
        }
        TypedValue typedValue = (TypedValue) objComponentActivity;
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        charSequence.getClass();
        boolean z = getpostalcode.read(charSequence.toString());
        Object objComponentActivity2 = getpostalcode.ComponentActivity();
        if (z || objComponentActivity2 == androidContentCaptureManager) {
            objComponentActivity2 = imageResource(companion, resources, i);
            getpostalcode.write(objComponentActivity2);
        }
        return (ImageBitmap) objComponentActivity2;
    }

    public static final ImageBitmap imageResource(ImageBitmap.Companion companion, Resources resources, int i) {
        Drawable drawable = resources.getDrawable(i, null);
        drawable.getClass();
        return AndroidImageBitmap_androidKt.asImageBitmap(((BitmapDrawable) drawable).getBitmap());
    }
}
