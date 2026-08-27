package o;

/* JADX INFO: loaded from: classes4.dex */
public final class accessgetOffscreencp extends getSrcBrush {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public ColorSpaceVerificationHelperExternalSyntheticLambda0 serializer;

    public /* synthetic */ accessgetOffscreencp(ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = colorSpaceVerificationHelperExternalSyntheticLambda0;
    }

    @Override // o.getSrcBrush, o.obtainAndroidColorSpace
    public void IconCompatParcelizer(ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0) {
        if (this.RemoteActionCompatParcelizer != 1) {
            return;
        }
        getOffscreenNrFUSI getoffscreennrfusi = (getOffscreenNrFUSI) this.serializer;
        if (getoffscreennrfusi.read) {
            return;
        }
        getoffscreennrfusi.PlaybackStateCompatCustomAction();
        getoffscreennrfusi.read = true;
    }

    @Override // o.getSrcBrush, o.obtainAndroidColorSpace
    public void serializer(ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0) {
        if (this.RemoteActionCompatParcelizer != 0) {
            return;
        }
        getOffscreenNrFUSI getoffscreennrfusi = (getOffscreenNrFUSI) this.serializer;
        getoffscreennrfusi.RemoteActionCompatParcelizer.remove(colorSpaceVerificationHelperExternalSyntheticLambda0);
        if (getoffscreennrfusi.MediaBrowserCompatMediaItem()) {
            return;
        }
        getoffscreennrfusi.RemoteActionCompatParcelizer(getoffscreennrfusi, getDstBrush.RemoteActionCompatParcelizer, false);
        getoffscreennrfusi.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = true;
        getoffscreennrfusi.RemoteActionCompatParcelizer(getoffscreennrfusi, getDstBrush.IconCompatParcelizer, false);
    }

    @Override // o.getSrcBrush, o.obtainAndroidColorSpace
    public void write(ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0) {
        int i = this.RemoteActionCompatParcelizer;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.serializer.MediaMetadataCompat();
            colorSpaceVerificationHelperExternalSyntheticLambda0.write(this);
            return;
        }
        getOffscreenNrFUSI getoffscreennrfusi = (getOffscreenNrFUSI) this.serializer;
        int i2 = getoffscreennrfusi.serializer - 1;
        getoffscreennrfusi.serializer = i2;
        if (i2 == 0) {
            getoffscreennrfusi.read = false;
            getoffscreennrfusi.MediaDescriptionCompat();
        }
        colorSpaceVerificationHelperExternalSyntheticLambda0.write(this);
    }

    public /* synthetic */ accessgetOffscreencp() {
        this.RemoteActionCompatParcelizer = 1;
    }
}
