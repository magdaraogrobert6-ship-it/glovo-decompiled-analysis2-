package o;

/* JADX INFO: loaded from: classes.dex */
public final class rotateRg1IO4cdefault implements rotateRadRg1IO4c, rotateRg1IO4c {
    public volatile rotateRg1IO4c IconCompatParcelizer;
    public final Object RatingCompat;
    public volatile rotateRg1IO4c RemoteActionCompatParcelizer;
    public final rotateRadRg1IO4c read;
    public drawIntoCanvas serializer;
    public drawIntoCanvas write;

    @Override // o.rotateRadRg1IO4c
    public final rotateRadRg1IO4c IconCompatParcelizer() {
        rotateRadRg1IO4c rotateradrg1io4cIconCompatParcelizer;
        synchronized (this.RatingCompat) {
            rotateRadRg1IO4c rotateradrg1io4c = this.read;
            rotateradrg1io4cIconCompatParcelizer = rotateradrg1io4c != null ? rotateradrg1io4c.IconCompatParcelizer() : this;
        }
        return rotateradrg1io4cIconCompatParcelizer;
    }

    @Override // o.rotateRadRg1IO4c
    public final void MediaBrowserCompatMediaItem(rotateRg1IO4c rotaterg1io4c) {
        synchronized (this.RatingCompat) {
            if (rotaterg1io4c.equals(this.IconCompatParcelizer)) {
                this.serializer = drawIntoCanvas.SUCCESS;
            } else if (rotaterg1io4c.equals(this.RemoteActionCompatParcelizer)) {
                this.write = drawIntoCanvas.SUCCESS;
            }
            rotateRadRg1IO4c rotateradrg1io4c = this.read;
            if (rotateradrg1io4c != null) {
                rotateradrg1io4c.MediaBrowserCompatMediaItem(this);
            }
        }
    }

    @Override // o.rotateRg1IO4c
    public final boolean MediaBrowserCompatMediaItem() {
        boolean z;
        synchronized (this.RatingCompat) {
            drawIntoCanvas drawintocanvas = this.serializer;
            drawIntoCanvas drawintocanvas2 = drawIntoCanvas.SUCCESS;
            z = drawintocanvas == drawintocanvas2 || this.write == drawintocanvas2;
        }
        return z;
    }

    @Override // o.rotateRg1IO4c
    public final boolean MediaMetadataCompat() {
        boolean z;
        synchronized (this.RatingCompat) {
            drawIntoCanvas drawintocanvas = this.serializer;
            drawIntoCanvas drawintocanvas2 = drawIntoCanvas.RUNNING;
            z = drawintocanvas == drawintocanvas2 || this.write == drawintocanvas2;
        }
        return z;
    }

    @Override // o.rotateRg1IO4c
    public final void RatingCompat() {
        synchronized (this.RatingCompat) {
            drawIntoCanvas drawintocanvas = this.serializer;
            drawIntoCanvas drawintocanvas2 = drawIntoCanvas.RUNNING;
            if (drawintocanvas == drawintocanvas2) {
                this.serializer = drawIntoCanvas.PAUSED;
                this.IconCompatParcelizer.RatingCompat();
            }
            if (this.write == drawintocanvas2) {
                this.write = drawIntoCanvas.PAUSED;
                this.RemoteActionCompatParcelizer.RatingCompat();
            }
        }
    }

    @Override // o.rotateRg1IO4c
    public final void RemoteActionCompatParcelizer() {
        synchronized (this.RatingCompat) {
            drawIntoCanvas drawintocanvas = this.serializer;
            drawIntoCanvas drawintocanvas2 = drawIntoCanvas.RUNNING;
            if (drawintocanvas != drawintocanvas2) {
                this.serializer = drawintocanvas2;
                this.IconCompatParcelizer.RemoteActionCompatParcelizer();
            }
        }
    }

    @Override // o.rotateRadRg1IO4c
    public final boolean RemoteActionCompatParcelizer(rotateRg1IO4c rotaterg1io4c) {
        boolean z;
        synchronized (this.RatingCompat) {
            rotateRadRg1IO4c rotateradrg1io4c = this.read;
            z = (rotateradrg1io4c == null || rotateradrg1io4c.RemoteActionCompatParcelizer(this)) && rotaterg1io4c.equals(this.IconCompatParcelizer);
        }
        return z;
    }

    @Override // o.rotateRadRg1IO4c
    public final void read(rotateRg1IO4c rotaterg1io4c) {
        synchronized (this.RatingCompat) {
            if (rotaterg1io4c.equals(this.RemoteActionCompatParcelizer)) {
                this.write = drawIntoCanvas.FAILED;
                rotateRadRg1IO4c rotateradrg1io4c = this.read;
                if (rotateradrg1io4c != null) {
                    rotateradrg1io4c.read(this);
                }
                return;
            }
            this.serializer = drawIntoCanvas.FAILED;
            drawIntoCanvas drawintocanvas = this.write;
            drawIntoCanvas drawintocanvas2 = drawIntoCanvas.RUNNING;
            if (drawintocanvas != drawintocanvas2) {
                this.write = drawintocanvas2;
                this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            }
        }
    }

    @Override // o.rotateRadRg1IO4c, o.rotateRg1IO4c
    public final boolean read() {
        boolean z;
        synchronized (this.RatingCompat) {
            z = this.IconCompatParcelizer.read() || this.RemoteActionCompatParcelizer.read();
        }
        return z;
    }

    @Override // o.rotateRg1IO4c
    public final boolean serializer() {
        boolean z;
        synchronized (this.RatingCompat) {
            drawIntoCanvas drawintocanvas = this.serializer;
            drawIntoCanvas drawintocanvas2 = drawIntoCanvas.CLEARED;
            z = drawintocanvas == drawintocanvas2 && this.write == drawintocanvas2;
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002e  */
    @Override // o.rotateRadRg1IO4c
    public final boolean serializer(rotateRg1IO4c rotaterg1io4c) {
        drawIntoCanvas drawintocanvas;
        boolean z;
        synchronized (this.RatingCompat) {
            rotateRadRg1IO4c rotateradrg1io4c = this.read;
            if (rotateradrg1io4c == null || rotateradrg1io4c.serializer(this)) {
                drawIntoCanvas drawintocanvas2 = this.serializer;
                drawIntoCanvas drawintocanvas3 = drawIntoCanvas.FAILED;
                if (drawintocanvas2 != drawintocanvas3) {
                    if (rotaterg1io4c.equals(this.IconCompatParcelizer)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (rotaterg1io4c.equals(this.RemoteActionCompatParcelizer) && ((drawintocanvas = this.write) == drawIntoCanvas.SUCCESS || drawintocanvas == drawintocanvas3)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // o.rotateRg1IO4c
    public final void write() {
        synchronized (this.RatingCompat) {
            drawIntoCanvas drawintocanvas = drawIntoCanvas.CLEARED;
            this.serializer = drawintocanvas;
            this.IconCompatParcelizer.write();
            if (this.write != drawintocanvas) {
                this.write = drawintocanvas;
                this.RemoteActionCompatParcelizer.write();
            }
        }
    }

    @Override // o.rotateRadRg1IO4c
    public final boolean write(rotateRg1IO4c rotaterg1io4c) {
        boolean z;
        synchronized (this.RatingCompat) {
            rotateRadRg1IO4c rotateradrg1io4c = this.read;
            z = rotateradrg1io4c == null || rotateradrg1io4c.write(this);
        }
        return z;
    }

    public rotateRg1IO4cdefault(Object obj, rotateRadRg1IO4c rotateradrg1io4c) {
        drawIntoCanvas drawintocanvas = drawIntoCanvas.CLEARED;
        this.serializer = drawintocanvas;
        this.write = drawintocanvas;
        this.RatingCompat = obj;
        this.read = rotateradrg1io4c;
    }

    @Override // o.rotateRg1IO4c
    public final boolean IconCompatParcelizer(rotateRg1IO4c rotaterg1io4c) {
        if (!(rotaterg1io4c instanceof rotateRg1IO4cdefault)) {
            return false;
        }
        rotateRg1IO4cdefault rotaterg1io4cdefault = (rotateRg1IO4cdefault) rotaterg1io4c;
        return this.IconCompatParcelizer.IconCompatParcelizer(rotaterg1io4cdefault.IconCompatParcelizer) && this.RemoteActionCompatParcelizer.IconCompatParcelizer(rotaterg1io4cdefault.RemoteActionCompatParcelizer);
    }
}
