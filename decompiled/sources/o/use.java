package o;

/* JADX INFO: loaded from: classes3.dex */
public final class use {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final accessgetReleasecp read;

    public use(accessgetReleasecp accessgetreleasecp) {
        accessgetreleasecp.getClass();
        this.read = accessgetreleasecp;
    }

    public final void serializer(CloseableKt closeableKt) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 103;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strMediaDescriptionCompat = closeableKt.MediaDescriptionCompat();
        String strWrite = closeableKt.write();
        String strIconCompatParcelizer = closeableKt.IconCompatParcelizer();
        boolean zMediaBrowserCompatMediaItem = closeableKt.MediaBrowserCompatMediaItem();
        int i4 = UserPropertiesSerializer.read();
        int i5 = UserPropertiesSerializer.read();
        this.read.handleMessage(strMediaDescriptionCompat, strWrite, strIconCompatParcelizer, zMediaBrowserCompatMediaItem, null, (String) CloseableKt.read(-1209325344, UserPropertiesSerializer.read(), i5, i4, UserPropertiesSerializer.read(), new Object[]{closeableKt}, 1209325344), closeableKt.read(), closeableKt.serializer(), closeableKt.MediaMetadataCompat());
        int i6 = write + 17;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
