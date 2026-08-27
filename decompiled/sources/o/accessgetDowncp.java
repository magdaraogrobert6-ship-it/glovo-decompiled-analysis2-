package o;

import android.app.Activity;
import android.content.pm.PackageManager;
import com.roadrunner.instant.shifts.presentation.confirmation.BookShiftConfirmationDialogFragment;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public abstract class accessgetDowncp {
    private static int read = 0;
    private static int write = 1;

    public static BookShiftConfirmationDialogFragment IconCompatParcelizer() {
        int i = 2 % 2;
        BookShiftConfirmationDialogFragment bookShiftConfirmationDialogFragment = new BookShiftConfirmationDialogFragment();
        int i2 = write + 65;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return bookShiftConfirmationDialogFragment;
        }
        throw null;
    }

    public static boolean RemoteActionCompatParcelizer(Activity activity, String str) {
        int i = 2 % 2;
        int i2 = read + 109;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        try {
            boolean zBooleanValue = ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            int i4 = read + 11;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 7 / 0;
            }
            return zBooleanValue;
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }
}
