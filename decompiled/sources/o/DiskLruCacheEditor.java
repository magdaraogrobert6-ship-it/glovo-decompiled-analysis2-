package o;

import android.app.Application;
import android.provider.Settings;
import com.roadrunner.home.expandedbubblelayer.presentation.ExpandedBubbleUiModelImpl;
import kotlinx.coroutines.BuildersKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class DiskLruCacheEditor {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final getContentViewGroupParentLayout RemoteActionCompatParcelizer;
    public final StaticImageDecoder read;
    public final Application serializer;

    public DiskLruCacheEditor(Application application, getContentViewGroupParentLayout getcontentviewgroupparentlayout, StaticImageDecoder staticImageDecoder) {
        application.getClass();
        getcontentviewgroupparentlayout.getClass();
        staticImageDecoder.getClass();
        this.serializer = application;
        this.RemoteActionCompatParcelizer = getcontentviewgroupparentlayout;
        this.read = staticImageDecoder;
    }

    public final boolean read() {
        int i = 2 % 2;
        try {
            boolean zCanDrawOverlays = Settings.canDrawOverlays(this.serializer.getApplicationContext());
            BuildersKt.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, null, null, new ExpandedBubbleUiModelImpl.AnonymousClass1(this, zCanDrawOverlays, null, 3), 3);
            int i2 = IconCompatParcelizer + 25;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 30 / 0;
            }
            return zCanDrawOverlays;
        } catch (SecurityException e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Error while checking overlay permission", new Object[0]);
            return false;
        }
    }
}
