package o;

/* JADX INFO: loaded from: classes.dex */
public final class getBitmap implements setTitleMarginBottom {
    public final Object IconCompatParcelizer = new Object();
    public final setTitleMarginBottom read;
    public boolean serializer;
    public getDefaultDisplay write;

    @Override // o.setTitleMarginBottom
    public final void read() {
        write();
    }

    public final void IconCompatParcelizer() {
        synchronized (this.IconCompatParcelizer) {
            getDefaultDisplay getdefaultdisplay = this.write;
            if (getdefaultdisplay != null) {
                getdefaultdisplay.read();
            }
            this.write = null;
        }
    }

    public final void write() {
        synchronized (this.IconCompatParcelizer) {
            if (this.serializer) {
                setTitleMarginBottom settitlemarginbottom = this.read;
                if (settitlemarginbottom != null) {
                    settitlemarginbottom.read();
                } else {
                    setInflatedId.serializer("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                }
            } else {
                setInflatedId.read("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
            }
            this.serializer = false;
        }
    }

    public getBitmap(setTitleMarginBottom settitlemarginbottom) {
        this.read = settitlemarginbottom;
    }

    @Override // o.setTitleMarginBottom
    public final void IconCompatParcelizer(long j, getDefaultDisplay getdefaultdisplay) {
        getdefaultdisplay.getClass();
        synchronized (this.IconCompatParcelizer) {
            this.serializer = true;
            this.write = getdefaultdisplay;
        }
        setTitleMarginBottom settitlemarginbottom = this.read;
        if (settitlemarginbottom != null) {
            settitlemarginbottom.IconCompatParcelizer(j, new getDefaultDisplay(0, this));
        } else {
            setInflatedId.serializer("ScreenFlashWrapper", "apply: screenFlash is null!");
            IconCompatParcelizer();
        }
    }
}
