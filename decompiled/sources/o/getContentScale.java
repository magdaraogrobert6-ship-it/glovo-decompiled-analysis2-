package o;

/* JADX INFO: loaded from: classes.dex */
public final class getContentScale implements InnerShadowScope, toPx0680j_4 {
    public setSizeToIntrinsics IconCompatParcelizer;
    public final drawBehind RatingCompat;
    public String RemoteActionCompatParcelizer;
    public int serializer;
    public int MediaDescriptionCompat = -1;
    public int read = -1;
    public float write = 0.0f;

    @Override // o.toPx0680j_4
    public final Object MediaBrowserCompatMediaItem() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.toPx0680j_4
    public final InnerShadowScope MediaSessionCompatQueueItem() {
        return null;
    }

    @Override // o.InnerShadowScope
    public final void read() {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(this.serializer);
        int i = this.MediaDescriptionCompat;
        if (i != -1) {
            setSizeToIntrinsics setsizetointrinsics = this.IconCompatParcelizer;
            if (i <= -1) {
                setsizetointrinsics.getClass();
                return;
            }
            setsizetointrinsics.RemoteActionCompatParcelizer = -1.0f;
            setsizetointrinsics.write = i;
            setsizetointrinsics.serializer = -1;
            return;
        }
        int i2 = this.read;
        setSizeToIntrinsics setsizetointrinsics2 = this.IconCompatParcelizer;
        if (i2 != -1) {
            if (i2 <= -1) {
                setsizetointrinsics2.getClass();
                return;
            }
            setsizetointrinsics2.RemoteActionCompatParcelizer = -1.0f;
            setsizetointrinsics2.write = -1;
            setsizetointrinsics2.serializer = i2;
            return;
        }
        float f = this.write;
        if (f <= -1.0f) {
            setsizetointrinsics2.getClass();
            return;
        }
        setsizetointrinsics2.RemoteActionCompatParcelizer = f;
        setsizetointrinsics2.write = -1;
        setsizetointrinsics2.serializer = -1;
    }

    public getContentScale(drawBehind drawbehind) {
        this.RatingCompat = drawbehind;
    }

    @Override // o.toPx0680j_4
    public final void read(setAlignment setalignment) {
        if (setalignment instanceof setSizeToIntrinsics) {
            this.IconCompatParcelizer = (setSizeToIntrinsics) setalignment;
        } else {
            this.IconCompatParcelizer = null;
        }
    }

    @Override // o.toPx0680j_4
    public final setAlignment write() {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new setSizeToIntrinsics();
        }
        return this.IconCompatParcelizer;
    }
}
