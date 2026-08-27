package o;

/* JADX INFO: loaded from: classes.dex */
public final class getHandleruiannotations {
    public getCreditCardSecurityCode IconCompatParcelizer;
    public AnchoredDraggableState MediaBrowserCompatMediaItem;
    public onRemeasuredozmzZPI MediaMetadataCompat;
    public int RemoteActionCompatParcelizer;
    public AndroidContentCaptureManagercurrentSemanticsNodes1 read;
    public r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 serializer;
    public int write;

    public getHandleruiannotations(getCreditCardSecurityCode getcreditcardsecuritycode) {
        this.IconCompatParcelizer = getcreditcardsecuritycode;
    }

    public final toAutofillValue RemoteActionCompatParcelizer(Object obj) {
        toAutofillValue toautofillvalueIconCompatParcelizer;
        getCreditCardSecurityCode getcreditcardsecuritycode = this.IconCompatParcelizer;
        return (getcreditcardsecuritycode == null || (toautofillvalueIconCompatParcelizer = getcreditcardsecuritycode.IconCompatParcelizer(this, obj)) == null) ? toAutofillValue.IGNORED : toautofillvalueIconCompatParcelizer;
    }

    public final boolean IconCompatParcelizer() {
        AndroidContentCaptureManagercurrentSemanticsNodes1 androidContentCaptureManagercurrentSemanticsNodes1;
        return (this.IconCompatParcelizer == null || (androidContentCaptureManagercurrentSemanticsNodes1 = this.read) == null || !androidContentCaptureManagercurrentSemanticsNodes1.serializer()) ? false : true;
    }

    public final void RemoteActionCompatParcelizer() {
        getCreditCardSecurityCode getcreditcardsecuritycode = this.IconCompatParcelizer;
        if (getcreditcardsecuritycode != null) {
            getcreditcardsecuritycode.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = true;
            getcreditcardsecuritycode.PlaybackStateCompat.IconCompatParcelizer();
        }
        this.IconCompatParcelizer = null;
        this.MediaBrowserCompatMediaItem = null;
        this.MediaMetadataCompat = null;
        this.serializer = null;
    }

    public final void serializer(boolean z) {
        int i = this.write;
        this.write = z ? i | 32 : i & (-33);
    }
}
