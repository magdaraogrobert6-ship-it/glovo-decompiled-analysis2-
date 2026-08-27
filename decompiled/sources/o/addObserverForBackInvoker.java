package o;

/* JADX INFO: loaded from: classes.dex */
public final class addObserverForBackInvoker extends createBitmapx__hDUui_graphics {
    public boolean read;
    public final androidx.activity.OnBackPressedCallback serializer;

    @Override // o.createBitmapx__hDUui_graphics
    public final void read() {
        this.serializer.handleOnBackPressed();
    }

    @Override // o.createBitmapx__hDUui_graphics
    public final void read(composeColorSpaceui_graphics composecolorspaceui_graphics) {
        this.serializer.handleOnBackProgressed(new r8lambda54BeH8ZsBru0CXI2CCSP2syNys(composecolorspaceui_graphics));
    }

    @Override // o.createBitmapx__hDUui_graphics
    public final void write() {
        this.serializer.handleOnBackCancelled();
    }

    public addObserverForBackInvoker(androidx.activity.OnBackPressedCallback onBackPressedCallback, computeHorizontalBoundsdefault computehorizontalboundsdefault) {
        boolean zIsEnabled = onBackPressedCallback.isEnabled();
        this.IconCompatParcelizer = computehorizontalboundsdefault;
        this.MediaMetadataCompat = zIsEnabled;
        this.serializer = onBackPressedCallback;
        this.read = true;
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.read = z;
        read(z && this.serializer.isEnabled());
    }

    @Override // o.createBitmapx__hDUui_graphics
    public final void serializer(composeColorSpaceui_graphics composecolorspaceui_graphics) {
        composecolorspaceui_graphics.getClass();
        this.serializer.handleOnBackStarted(new r8lambda54BeH8ZsBru0CXI2CCSP2syNys(composecolorspaceui_graphics));
    }
}
