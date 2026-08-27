package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setCompositionui_text implements setShader {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ EditingBufferCompanion IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ setCompositionui_text(getStrokeWidth getstrokewidth, EditingBufferCompanion editingBufferCompanion, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = editingBufferCompanion;
    }

    @Override // o.setShader
    public final void read() {
        int i = 2 % 2;
        int i2 = serializer + 55;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = SimpleItemTouchHelperCallback.serializer;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        SimpleItemTouchHelperCallback simpleItemTouchHelperCallback2 = SimpleItemTouchHelperCallback.serializer;
        EditingBufferCompanion editingBufferCompanion = this.IconCompatParcelizer;
        if (i3 != 0) {
            if (((Boolean) editingBufferCompanion.MediaBrowserCompatMediaItem.read()).booleanValue()) {
                if (editingBufferCompanion.MediaMetadataCompat.write()) {
                    editingBufferCompanion.write();
                    return;
                } else {
                    editingBufferCompanion.ParcelableVolumeInfo = false;
                    editingBufferCompanion.write.IconCompatParcelizer.read.IconCompatParcelizer(simpleItemTouchHelperCallback2);
                    return;
                }
            }
            return;
        }
        if (((Boolean) editingBufferCompanion.MediaBrowserCompatMediaItem.read()).booleanValue()) {
            if (editingBufferCompanion.MediaMetadataCompat.write()) {
                editingBufferCompanion.write();
            } else {
                editingBufferCompanion.ParcelableVolumeInfo = false;
                editingBufferCompanion.write.IconCompatParcelizer.read.IconCompatParcelizer(simpleItemTouchHelperCallback2);
            }
        }
        int i4 = read + 61;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}
