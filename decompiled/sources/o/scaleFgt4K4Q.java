package o;

/* JADX INFO: loaded from: classes.dex */
public final class scaleFgt4K4Q implements rotateRadRg1IO4c, rotateRg1IO4c {
    public boolean IconCompatParcelizer;
    public drawIntoCanvas MediaMetadataCompat;
    public volatile rotateRg1IO4c MediaSessionCompatQueueItem;
    public final rotateRadRg1IO4c RemoteActionCompatParcelizer;
    public volatile com.bumptech.glide.request.SingleRequest read;
    public drawIntoCanvas serializer;
    public final Object write;

    @Override // o.rotateRadRg1IO4c
    public final rotateRadRg1IO4c IconCompatParcelizer() {
        rotateRadRg1IO4c rotateradrg1io4cIconCompatParcelizer;
        synchronized (this.write) {
            rotateRadRg1IO4c rotateradrg1io4c = this.RemoteActionCompatParcelizer;
            rotateradrg1io4cIconCompatParcelizer = rotateradrg1io4c != null ? rotateradrg1io4c.IconCompatParcelizer() : this;
        }
        return rotateradrg1io4cIconCompatParcelizer;
    }

    @Override // o.rotateRadRg1IO4c
    public final void MediaBrowserCompatMediaItem(rotateRg1IO4c rotaterg1io4c) {
        synchronized (this.write) {
            if (rotaterg1io4c.equals(this.MediaSessionCompatQueueItem)) {
                this.MediaMetadataCompat = drawIntoCanvas.SUCCESS;
                return;
            }
            this.serializer = drawIntoCanvas.SUCCESS;
            rotateRadRg1IO4c rotateradrg1io4c = this.RemoteActionCompatParcelizer;
            if (rotateradrg1io4c != null) {
                rotateradrg1io4c.MediaBrowserCompatMediaItem(this);
            }
            if (!this.MediaMetadataCompat.isComplete()) {
                this.MediaSessionCompatQueueItem.write();
            }
        }
    }

    @Override // o.rotateRg1IO4c
    public final boolean MediaBrowserCompatMediaItem() {
        boolean z;
        synchronized (this.write) {
            z = this.serializer == drawIntoCanvas.SUCCESS;
        }
        return z;
    }

    @Override // o.rotateRg1IO4c
    public final boolean MediaMetadataCompat() {
        boolean z;
        synchronized (this.write) {
            z = this.serializer == drawIntoCanvas.RUNNING;
        }
        return z;
    }

    @Override // o.rotateRg1IO4c
    public final void RatingCompat() {
        synchronized (this.write) {
            if (!this.MediaMetadataCompat.isComplete()) {
                this.MediaMetadataCompat = drawIntoCanvas.PAUSED;
                this.MediaSessionCompatQueueItem.RatingCompat();
            }
            if (!this.serializer.isComplete()) {
                this.serializer = drawIntoCanvas.PAUSED;
                this.read.RatingCompat();
            }
        }
    }

    @Override // o.rotateRg1IO4c
    public final void RemoteActionCompatParcelizer() {
        synchronized (this.write) {
            this.IconCompatParcelizer = true;
            try {
                if (this.serializer != drawIntoCanvas.SUCCESS) {
                    drawIntoCanvas drawintocanvas = this.MediaMetadataCompat;
                    drawIntoCanvas drawintocanvas2 = drawIntoCanvas.RUNNING;
                    if (drawintocanvas != drawintocanvas2) {
                        this.MediaMetadataCompat = drawintocanvas2;
                        this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer();
                    }
                }
                if (this.IconCompatParcelizer) {
                    drawIntoCanvas drawintocanvas3 = this.serializer;
                    drawIntoCanvas drawintocanvas4 = drawIntoCanvas.RUNNING;
                    if (drawintocanvas3 != drawintocanvas4) {
                        this.serializer = drawintocanvas4;
                        this.read.RemoteActionCompatParcelizer();
                    }
                }
                this.IconCompatParcelizer = false;
            } catch (Throwable th) {
                this.IconCompatParcelizer = false;
                throw th;
            }
        }
    }

    @Override // o.rotateRadRg1IO4c
    public final boolean RemoteActionCompatParcelizer(rotateRg1IO4c rotaterg1io4c) {
        boolean z;
        synchronized (this.write) {
            rotateRadRg1IO4c rotateradrg1io4c = this.RemoteActionCompatParcelizer;
            z = (rotateradrg1io4c == null || rotateradrg1io4c.RemoteActionCompatParcelizer(this)) && rotaterg1io4c.equals(this.read) && this.serializer != drawIntoCanvas.PAUSED;
        }
        return z;
    }

    @Override // o.rotateRadRg1IO4c
    public final void read(rotateRg1IO4c rotaterg1io4c) {
        synchronized (this.write) {
            if (!rotaterg1io4c.equals(this.read)) {
                this.MediaMetadataCompat = drawIntoCanvas.FAILED;
                return;
            }
            this.serializer = drawIntoCanvas.FAILED;
            rotateRadRg1IO4c rotateradrg1io4c = this.RemoteActionCompatParcelizer;
            if (rotateradrg1io4c != null) {
                rotateradrg1io4c.read(this);
            }
        }
    }

    @Override // o.rotateRadRg1IO4c, o.rotateRg1IO4c
    public final boolean read() {
        boolean z;
        synchronized (this.write) {
            z = this.MediaSessionCompatQueueItem.read() || this.read.read();
        }
        return z;
    }

    @Override // o.rotateRg1IO4c
    public final boolean serializer() {
        boolean z;
        synchronized (this.write) {
            z = this.serializer == drawIntoCanvas.CLEARED;
        }
        return z;
    }

    @Override // o.rotateRadRg1IO4c
    public final boolean serializer(rotateRg1IO4c rotaterg1io4c) {
        boolean z;
        synchronized (this.write) {
            rotateRadRg1IO4c rotateradrg1io4c = this.RemoteActionCompatParcelizer;
            z = (rotateradrg1io4c == null || rotateradrg1io4c.serializer(this)) && rotaterg1io4c.equals(this.read) && !read();
        }
        return z;
    }

    @Override // o.rotateRg1IO4c
    public final void write() {
        synchronized (this.write) {
            this.IconCompatParcelizer = false;
            drawIntoCanvas drawintocanvas = drawIntoCanvas.CLEARED;
            this.serializer = drawintocanvas;
            this.MediaMetadataCompat = drawintocanvas;
            this.MediaSessionCompatQueueItem.write();
            this.read.write();
        }
    }

    @Override // o.rotateRadRg1IO4c
    public final boolean write(rotateRg1IO4c rotaterg1io4c) {
        boolean z;
        synchronized (this.write) {
            rotateRadRg1IO4c rotateradrg1io4c = this.RemoteActionCompatParcelizer;
            z = (rotateradrg1io4c == null || rotateradrg1io4c.write(this)) && (rotaterg1io4c.equals(this.read) || this.serializer != drawIntoCanvas.SUCCESS);
        }
        return z;
    }

    public scaleFgt4K4Q(Object obj, rotateRadRg1IO4c rotateradrg1io4c) {
        drawIntoCanvas drawintocanvas = drawIntoCanvas.CLEARED;
        this.serializer = drawintocanvas;
        this.MediaMetadataCompat = drawintocanvas;
        this.write = obj;
        this.RemoteActionCompatParcelizer = rotateradrg1io4c;
    }

    @Override // o.rotateRg1IO4c
    public final boolean IconCompatParcelizer(rotateRg1IO4c rotaterg1io4c) {
        if (!(rotaterg1io4c instanceof scaleFgt4K4Q)) {
            return false;
        }
        scaleFgt4K4Q scalefgt4k4q = (scaleFgt4K4Q) rotaterg1io4c;
        if (this.read == null) {
            if (scalefgt4k4q.read != null) {
                return false;
            }
        } else if (!this.read.IconCompatParcelizer(scalefgt4k4q.read)) {
            return false;
        }
        if (this.MediaSessionCompatQueueItem == null) {
            return scalefgt4k4q.MediaSessionCompatQueueItem == null;
        }
        return this.MediaSessionCompatQueueItem.IconCompatParcelizer(scalefgt4k4q.MediaSessionCompatQueueItem);
    }
}
