package o;

/* JADX INFO: loaded from: classes.dex */
public final class getPositions implements encodeColorList {
    public final ExtendedSrgblambda0 IconCompatParcelizer;
    public final getTransformui_graphics MediaBrowserCompatMediaItem;
    public final ExtendedSrgblambda0 MediaMetadataCompat;
    public final getTransformui_graphics MediaSessionCompatQueueItem;
    public final getTransformui_graphics RemoteActionCompatParcelizer;
    public final getTransformui_graphics read;
    public android.graphics.Matrix serializer;
    public final getTransformui_graphics write;

    @Override // o.encodeColorList
    public final void serializer() {
        this.MediaMetadataCompat.serializer();
    }

    public final getA write(android.graphics.Matrix matrix, int i) {
        float fWrite = this.read.write();
        float fFloatValue = ((Float) this.RemoteActionCompatParcelizer.IconCompatParcelizer()).floatValue();
        double d = fWrite * 0.017453292f;
        float fSin = (float) Math.sin(d);
        float fCos = (float) Math.cos(d + 3.141592653589793d);
        float fFloatValue2 = ((Float) this.MediaBrowserCompatMediaItem.IconCompatParcelizer()).floatValue();
        int iIntValue = ((Integer) this.write.IconCompatParcelizer()).intValue();
        int iArgb = android.graphics.Color.argb(Math.round((((Float) this.MediaSessionCompatQueueItem.IconCompatParcelizer()).floatValue() * i) / 255.0f), android.graphics.Color.red(iIntValue), android.graphics.Color.green(iIntValue), android.graphics.Color.blue(iIntValue));
        getA geta = new getA();
        geta.RemoteActionCompatParcelizer = fFloatValue2 * 0.33f;
        geta.serializer = fSin * fFloatValue;
        geta.read = fCos * fFloatValue;
        geta.IconCompatParcelizer = iArgb;
        geta.write = null;
        geta.write(matrix);
        if (this.serializer == null) {
            this.serializer = new android.graphics.Matrix();
        }
        this.IconCompatParcelizer.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.IconCompatParcelizer().invert(this.serializer);
        geta.write(this.serializer);
        return geta;
    }

    public getPositions(ExtendedSrgblambda0 extendedSrgblambda0, ExtendedSrgblambda0 extendedSrgblambda1, com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect) {
        this.MediaMetadataCompat = extendedSrgblambda0;
        this.IconCompatParcelizer = extendedSrgblambda1;
        getColors getcolorsWrite = ((xyzaToColorJlNiLsgui_graphics) dropShadowEffect.read).write();
        this.write = (getTransformui_graphics) getcolorsWrite;
        getcolorsWrite.write(this);
        extendedSrgblambda1.RemoteActionCompatParcelizer(getcolorsWrite);
        getTransformui_graphics gettransformui_graphicsWrite = ((toXyz) dropShadowEffect.RatingCompat).write();
        this.MediaSessionCompatQueueItem = gettransformui_graphicsWrite;
        gettransformui_graphicsWrite.write(this);
        extendedSrgblambda1.RemoteActionCompatParcelizer(gettransformui_graphicsWrite);
        getTransformui_graphics gettransformui_graphicsWrite2 = ((toXyz) dropShadowEffect.write).write();
        this.read = gettransformui_graphicsWrite2;
        gettransformui_graphicsWrite2.write(this);
        extendedSrgblambda1.RemoteActionCompatParcelizer(gettransformui_graphicsWrite2);
        getTransformui_graphics gettransformui_graphicsWrite3 = ((toXyz) dropShadowEffect.serializer).write();
        this.RemoteActionCompatParcelizer = gettransformui_graphicsWrite3;
        gettransformui_graphicsWrite3.write(this);
        extendedSrgblambda1.RemoteActionCompatParcelizer(gettransformui_graphicsWrite3);
        getTransformui_graphics gettransformui_graphicsWrite4 = ((toXyz) dropShadowEffect.MediaDescriptionCompat).write();
        this.MediaBrowserCompatMediaItem = gettransformui_graphicsWrite4;
        gettransformui_graphicsWrite4.write(this);
        extendedSrgblambda1.RemoteActionCompatParcelizer(gettransformui_graphicsWrite4);
    }
}
