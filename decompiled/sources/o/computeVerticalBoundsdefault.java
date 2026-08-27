package o;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import android.window.BackEvent;
import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes.dex */
public abstract class computeVerticalBoundsdefault {
    public static boolean IconCompatParcelizer(Uri uri) {
        return uri != null && RemoteMessageConst.Notification.CONTENT.equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static final composeColorSpaceui_graphics cc_(BackEvent backEvent) {
        return new composeColorSpaceui_graphics(backEvent.getProgress(), backEvent.getTouchX(), backEvent.getTouchY(), backEvent.getSwipeEdge(), Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static AssetFileDescriptor write(Uri uri, ContentResolver contentResolver) {
        return MediaStore.openAssetFileDescriptor(contentResolver, uri, "r", null);
    }

    public static boolean write() {
        return Build.VERSION.SDK_INT >= 30 && SdkExtensions.getExtensionVersion(30) >= 17;
    }
}
