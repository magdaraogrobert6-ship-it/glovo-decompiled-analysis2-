package o;

/* JADX INFO: loaded from: classes.dex */
public final class ImageCaptureFailWithAutoFlashQuirk {
    public final onDrawBehind IconCompatParcelizer;
    public final ExtraSupportedOutputSizeQuirk MediaDescriptionCompat;
    public final IncorrectCaptureStateQuirk MediaSessionCompatQueueItem;
    public final onDrawWithContent RemoteActionCompatParcelizer;
    public StretchedVideoResolutionQuirk read;
    public final onDrawBehind serializer;
    public final onDrawWithContent write;
    public boolean MediaMetadataCompat = false;
    public boolean RatingCompat = false;

    public final void RemoteActionCompatParcelizer() {
        ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk = this.MediaDescriptionCompat;
        boolean z = extraSupportedOutputSizeQuirk.MediaSessionCompatToken;
        if (!z || extraSupportedOutputSizeQuirk.RemoteActionCompatParcelizer()) {
            if (!z) {
                coil3.util.UtilsKt.RemoteActionCompatParcelizer("The callback can only complete once.", !this.serializer.serializer.isDone());
            }
            this.write.RemoteActionCompatParcelizer(null);
        }
    }

    public ImageCaptureFailWithAutoFlashQuirk(ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk, IncorrectCaptureStateQuirk incorrectCaptureStateQuirk) {
        this.MediaDescriptionCompat = extraSupportedOutputSizeQuirk;
        this.MediaSessionCompatQueueItem = incorrectCaptureStateQuirk;
        onDrawWithContent ondrawwithcontent = new onDrawWithContent();
        ondrawwithcontent.IconCompatParcelizer = new setContentDrawScopeui();
        onDrawBehind ondrawbehind = new onDrawBehind(ondrawwithcontent);
        ondrawwithcontent.read = ondrawbehind;
        try {
            this.RemoteActionCompatParcelizer = ondrawwithcontent;
            ondrawwithcontent.RemoteActionCompatParcelizer = "CaptureCompleteFuture";
        } catch (Exception e) {
            ondrawbehind.write(e);
        }
        this.IconCompatParcelizer = ondrawbehind;
        onDrawWithContent ondrawwithcontent2 = new onDrawWithContent();
        ondrawwithcontent2.IconCompatParcelizer = new setContentDrawScopeui();
        onDrawBehind ondrawbehind2 = new onDrawBehind(ondrawwithcontent2);
        ondrawwithcontent2.read = ondrawbehind2;
        try {
            this.write = ondrawwithcontent2;
            ondrawwithcontent2.RemoteActionCompatParcelizer = "RequestCompleteFuture";
        } catch (Exception e2) {
            ondrawbehind2.write(e2);
        }
        this.serializer = ondrawbehind2;
    }
}
