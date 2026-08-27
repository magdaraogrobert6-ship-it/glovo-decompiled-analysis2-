package o;

import coil3.compose.AsyncImagePainter$launchJob$1;
import com.roadrunner.auth.domain.token.IsUserSignedInImpl;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes2.dex */
public final class getPreviousUptimeMillis {
    private static int MediaDescriptionCompat = 1;
    private static int write;
    public final getContentViewGroupParentLayout IconCompatParcelizer;
    public final handleThirdPartySharingCallbackI RemoteActionCompatParcelizer;
    public final androidx.work.impl.WorkManagerImpl read;
    public final IsUserSignedInImpl serializer;

    public getPreviousUptimeMillis(androidx.work.impl.WorkManagerImpl workManagerImpl, handleThirdPartySharingCallbackI handlethirdpartysharingcallbacki, IsUserSignedInImpl isUserSignedInImpl, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        workManagerImpl.getClass();
        getcontentviewgroupparentlayout.getClass();
        this.read = workManagerImpl;
        this.RemoteActionCompatParcelizer = handlethirdpartysharingcallbacki;
        this.serializer = isUserSignedInImpl;
        this.IconCompatParcelizer = getcontentviewgroupparentlayout;
    }

    public final void write(String str, String str2) {
        int i = 2 % 2;
        str.getClass();
        BuildersKt.RemoteActionCompatParcelizer(this.IconCompatParcelizer, null, null, new AsyncImagePainter$launchJob$1(this, str2, str, null, 15), 3);
        int i2 = write + 113;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
    }
}
