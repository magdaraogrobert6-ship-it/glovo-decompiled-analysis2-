package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class setSizeToIntrinsics extends setAlignment {
    public boolean MediaMetadataCompat;
    public float RemoteActionCompatParcelizer = -1.0f;
    public int write = -1;
    public int serializer = -1;
    public paintdefault IconCompatParcelizer = this.onActivityResult;
    public int read = 0;

    @Override // o.setAlignment
    public final boolean RemoteActionCompatParcelizer() {
        return this.MediaMetadataCompat;
    }

    @Override // o.setAlignment
    public final boolean j_() {
        return this.MediaMetadataCompat;
    }

    @Override // o.setAlignment
    public final boolean read() {
        return true;
    }

    @Override // o.setAlignment
    public final paintdefault RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu) {
        int i = setColorFilter.read[calculatescaledsizee7kxvpu.ordinal()];
        if (i == 1 || i == 2) {
            if (this.read == 1) {
                return this.IconCompatParcelizer;
            }
            return null;
        }
        if ((i == 3 || i == 4) && this.read == 0) {
            return this.IconCompatParcelizer;
        }
        return null;
    }

    public final void read(int i) {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(i);
        this.MediaMetadataCompat = true;
    }

    public setSizeToIntrinsics() {
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.clear();
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.add(this.IconCompatParcelizer);
        int length = this.addOnMultiWindowModeChangedListener.length;
        for (int i = 0; i < length; i++) {
            this.addOnMultiWindowModeChangedListener[i] = this.IconCompatParcelizer;
        }
    }

    @Override // o.setAlignment
    public final void IconCompatParcelizer(DrawWithContentElement drawWithContentElement, boolean z) {
        if (this.getViewModelStore == null) {
            return;
        }
        paintdefault paintdefaultVar = this.IconCompatParcelizer;
        drawWithContentElement.getClass();
        int iSerializer = DrawWithContentElement.serializer(paintdefaultVar);
        if (this.read == 1) {
            this.onPictureInPictureModeChanged = iSerializer;
            this.onRetainNonConfigurationInstance = 0;
            MediaMetadataCompat(this.getViewModelStore.MediaDescriptionCompat());
            MediaSessionCompatQueueItem(0);
            return;
        }
        this.onPictureInPictureModeChanged = 0;
        this.onRetainNonConfigurationInstance = iSerializer;
        MediaSessionCompatQueueItem(this.getViewModelStore.MediaSessionCompatQueueItem());
        MediaMetadataCompat(0);
    }

    public final void RemoteActionCompatParcelizer(int i) {
        if (this.read == i) {
            return;
        }
        this.read = i;
        ArrayList arrayList = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        arrayList.clear();
        if (this.read == 1) {
            this.IconCompatParcelizer = this.onBackPressedDispatcher_delegatelambda010;
        } else {
            this.IconCompatParcelizer = this.onActivityResult;
        }
        arrayList.add(this.IconCompatParcelizer);
        paintdefault[] paintdefaultVarArr = this.addOnMultiWindowModeChangedListener;
        int length = paintdefaultVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            paintdefaultVarArr[i2] = this.IconCompatParcelizer;
        }
    }

    @Override // o.setAlignment
    public final void write(DrawWithContentElement drawWithContentElement, boolean z) {
        getUseIntrinsicSize getuseintrinsicsize = this.getViewModelStore;
        if (getuseintrinsicsize == null) {
            return;
        }
        Object objRemoteActionCompatParcelizer = getuseintrinsicsize.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.LEFT);
        Object objRemoteActionCompatParcelizer2 = getuseintrinsicsize.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.RIGHT);
        getUseIntrinsicSize getuseintrinsicsize2 = this.getViewModelStore;
        boolean z2 = true;
        boolean z3 = getuseintrinsicsize2 != null && getuseintrinsicsize2.addOnNewIntentListener[0] == hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT;
        if (this.read == 0) {
            objRemoteActionCompatParcelizer = getuseintrinsicsize.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.TOP);
            objRemoteActionCompatParcelizer2 = getuseintrinsicsize.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.BOTTOM);
            getUseIntrinsicSize getuseintrinsicsize3 = this.getViewModelStore;
            if (getuseintrinsicsize3 == null || getuseintrinsicsize3.addOnNewIntentListener[1] != hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT) {
                z2 = false;
            }
        } else {
            z2 = z3;
        }
        if (this.MediaMetadataCompat) {
            paintdefault paintdefaultVar = this.IconCompatParcelizer;
            if (paintdefaultVar.read) {
                setBlockui setblockuiWrite = drawWithContentElement.write(paintdefaultVar);
                drawWithContentElement.read(setblockuiWrite, this.IconCompatParcelizer.RemoteActionCompatParcelizer());
                if (this.write != -1) {
                    if (z2) {
                        drawWithContentElement.RemoteActionCompatParcelizer(drawWithContentElement.write(objRemoteActionCompatParcelizer2), setblockuiWrite, 0, 5);
                    }
                } else if (this.serializer != -1 && z2) {
                    setBlockui setblockuiWrite2 = drawWithContentElement.write(objRemoteActionCompatParcelizer2);
                    drawWithContentElement.RemoteActionCompatParcelizer(setblockuiWrite, drawWithContentElement.write(objRemoteActionCompatParcelizer), 0, 5);
                    drawWithContentElement.RemoteActionCompatParcelizer(setblockuiWrite2, setblockuiWrite, 0, 5);
                }
                this.MediaMetadataCompat = false;
                return;
            }
        }
        if (this.write != -1) {
            setBlockui setblockuiWrite3 = drawWithContentElement.write(this.IconCompatParcelizer);
            drawWithContentElement.serializer(setblockuiWrite3, drawWithContentElement.write(objRemoteActionCompatParcelizer), this.write, 8);
            if (z2) {
                drawWithContentElement.RemoteActionCompatParcelizer(drawWithContentElement.write(objRemoteActionCompatParcelizer2), setblockuiWrite3, 0, 5);
                return;
            }
            return;
        }
        if (this.serializer != -1) {
            setBlockui setblockuiWrite4 = drawWithContentElement.write(this.IconCompatParcelizer);
            setBlockui setblockuiWrite5 = drawWithContentElement.write(objRemoteActionCompatParcelizer2);
            drawWithContentElement.serializer(setblockuiWrite4, setblockuiWrite5, -this.serializer, 8);
            if (z2) {
                drawWithContentElement.RemoteActionCompatParcelizer(setblockuiWrite4, drawWithContentElement.write(objRemoteActionCompatParcelizer), 0, 5);
                drawWithContentElement.RemoteActionCompatParcelizer(setblockuiWrite5, setblockuiWrite4, 0, 5);
                return;
            }
            return;
        }
        if (this.RemoteActionCompatParcelizer != -1.0f) {
            setBlockui setblockuiWrite6 = drawWithContentElement.write(this.IconCompatParcelizer);
            setBlockui setblockuiWrite7 = drawWithContentElement.write(objRemoteActionCompatParcelizer2);
            float f = this.RemoteActionCompatParcelizer;
            drawWithContent drawwithcontentSerializer = drawWithContentElement.serializer();
            drawwithcontentSerializer.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockuiWrite6, -1.0f);
            drawwithcontentSerializer.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockuiWrite7, f);
            drawWithContentElement.write(drawwithcontentSerializer);
        }
    }
}
