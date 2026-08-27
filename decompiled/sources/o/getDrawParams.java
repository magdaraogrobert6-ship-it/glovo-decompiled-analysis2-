package o;

import android.graphics.ImageDecoder;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class getDrawParams implements ImageDecoder.OnHeaderDecodedListener {
    public final int IconCompatParcelizer;
    public final int MediaBrowserCompatMediaItem;
    public final accessasDrawTransform MediaDescriptionCompat;
    public final accessdrawImageAZ2fEMsjd RemoteActionCompatParcelizer = accessdrawImageAZ2fEMsjd.serializer();
    public final _init_lambda0 read;
    public final boolean serializer;
    public final getEotfOrigui_graphics write;

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        accessdrawImageAZ2fEMsjd accessdrawimageaz2femsjd = this.RemoteActionCompatParcelizer;
        int width = this.MediaBrowserCompatMediaItem;
        int height = this.IconCompatParcelizer;
        if (accessdrawimageaz2femsjd.RemoteActionCompatParcelizer(width, height, this.serializer, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.read == _init_lambda0.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new setCanvas());
        android.util.Size size = imageInfo.getSize();
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float f = this.MediaDescriptionCompat.read(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * f);
        int iRound2 = Math.round(f * size.getHeight());
        if (Log.isLoggable("ImageDecoder", 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        getEotfOrigui_graphics geteotforigui_graphics = this.write;
        if (geteotforigui_graphics != null) {
            imageDecoder.setTargetColorSpace(android.graphics.ColorSpace.get((geteotforigui_graphics == getEotfOrigui_graphics.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? android.graphics.ColorSpace.Named.DISPLAY_P3 : android.graphics.ColorSpace.Named.SRGB));
        }
    }

    public getDrawParams(int i, int i2, getEotfFuncui_graphics geteotffuncui_graphics) {
        this.MediaBrowserCompatMediaItem = i;
        this.IconCompatParcelizer = i2;
        this.read = (_init_lambda0) geteotffuncui_graphics.serializer(CanvasDrawScopeKtasDrawTransform1.read);
        this.MediaDescriptionCompat = (accessasDrawTransform) geteotffuncui_graphics.serializer(accessasDrawTransform.read);
        accessgetMinp accessgetminp = CanvasDrawScopeKtasDrawTransform1.RemoteActionCompatParcelizer;
        this.serializer = geteotffuncui_graphics.serializer(accessgetminp) != null && ((Boolean) geteotffuncui_graphics.serializer(accessgetminp)).booleanValue();
        this.write = (getEotfOrigui_graphics) geteotffuncui_graphics.serializer(CanvasDrawScopeKtasDrawTransform1.MediaMetadataCompat);
    }
}
