package o;

import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class PainterModifierKt extends setPainter {
    public int write = 0;
    public boolean RemoteActionCompatParcelizer = true;
    public int IconCompatParcelizer = 0;
    public boolean serializer = false;

    @Override // o.setAlignment
    public final boolean RemoteActionCompatParcelizer() {
        return this.serializer;
    }

    @Override // o.setAlignment
    public final boolean j_() {
        return this.serializer;
    }

    @Override // o.setAlignment
    public final boolean read() {
        return true;
    }

    public final int serializer() {
        int i = this.write;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    public final boolean IconCompatParcelizer() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.removeOnMultiWindowModeChangedListener;
            if (i4 >= i) {
                break;
            }
            setAlignment setalignment = this.removeOnContextAvailableListener[i4];
            if ((this.RemoteActionCompatParcelizer || setalignment.read()) && ((((i2 = this.write) == 0 || i2 == 1) && !setalignment.j_()) || (((i3 = this.write) == 2 || i3 == 3) && !setalignment.RemoteActionCompatParcelizer()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.removeOnMultiWindowModeChangedListener; i5++) {
            setAlignment setalignment2 = this.removeOnContextAvailableListener[i5];
            if (this.RemoteActionCompatParcelizer || setalignment2.read()) {
                if (!z2) {
                    int i6 = this.write;
                    if (i6 == 0) {
                        iMax = setalignment2.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.LEFT).RemoteActionCompatParcelizer();
                    } else if (i6 == 1) {
                        iMax = setalignment2.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.RIGHT).RemoteActionCompatParcelizer();
                    } else if (i6 == 2) {
                        iMax = setalignment2.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.TOP).RemoteActionCompatParcelizer();
                    } else if (i6 == 3) {
                        iMax = setalignment2.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.BOTTOM).RemoteActionCompatParcelizer();
                    }
                    z2 = true;
                }
                int i7 = this.write;
                if (i7 == 0) {
                    iMax = Math.min(iMax, setalignment2.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.LEFT).RemoteActionCompatParcelizer());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, setalignment2.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.RIGHT).RemoteActionCompatParcelizer());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, setalignment2.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.TOP).RemoteActionCompatParcelizer());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, setalignment2.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.BOTTOM).RemoteActionCompatParcelizer());
                }
            }
        }
        int i8 = iMax + this.IconCompatParcelizer;
        int i9 = this.write;
        if (i9 != 0 && i9 != 1) {
            write(i8, i8);
        } else {
            IconCompatParcelizer(i8, i8);
        }
        this.serializer = true;
        return true;
    }

    @Override // o.setAlignment
    public final String toString() {
        String strM = ff$$ExternalSyntheticOutline0.m(new StringBuilder("[Barrier] "), this.accessensureViewModelStore, " {");
        for (int i = 0; i < this.removeOnMultiWindowModeChangedListener; i++) {
            setAlignment setalignment = this.removeOnContextAvailableListener[i];
            if (i > 0) {
                strM = strM.concat(", ");
            }
            StringBuilder sbM = d$$ExternalSyntheticOutline0.m(strM);
            sbM.append(setalignment.accessensureViewModelStore);
            strM = sbM.toString();
        }
        return strM.concat("}");
    }

    @Override // o.setAlignment
    public final void write(DrawWithContentElement drawWithContentElement, boolean z) {
        boolean z2;
        int i;
        int i2;
        paintdefault[] paintdefaultVarArr = this.addOnMultiWindowModeChangedListener;
        paintdefault paintdefaultVar = this.onBackPressedDispatcher_delegatelambda010;
        paintdefaultVarArr[0] = paintdefaultVar;
        paintdefault paintdefaultVar2 = this.onActivityResult;
        int i3 = 2;
        paintdefaultVarArr[2] = paintdefaultVar2;
        paintdefault paintdefaultVar3 = this.invalidateMenu;
        paintdefaultVarArr[1] = paintdefaultVar3;
        paintdefault paintdefaultVar4 = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        paintdefaultVarArr[3] = paintdefaultVar4;
        for (paintdefault paintdefaultVar5 : paintdefaultVarArr) {
            paintdefaultVar5.MediaMetadataCompat = drawWithContentElement.write(paintdefaultVar5);
        }
        int i4 = this.write;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        paintdefault paintdefaultVar6 = paintdefaultVarArr[i4];
        if (!this.serializer) {
            IconCompatParcelizer();
        }
        if (this.serializer) {
            this.serializer = false;
            int i5 = this.write;
            if (i5 == 0 || i5 == 1) {
                drawWithContentElement.read(paintdefaultVar.MediaMetadataCompat, this.onPictureInPictureModeChanged);
                drawWithContentElement.read(paintdefaultVar3.MediaMetadataCompat, this.onPictureInPictureModeChanged);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    drawWithContentElement.read(paintdefaultVar2.MediaMetadataCompat, this.onRetainNonConfigurationInstance);
                    drawWithContentElement.read(paintdefaultVar4.MediaMetadataCompat, this.onRetainNonConfigurationInstance);
                    return;
                }
                return;
            }
        }
        int i6 = 0;
        while (true) {
            if (i6 >= this.removeOnMultiWindowModeChangedListener) {
                z2 = false;
                break;
            }
            setAlignment setalignment = this.removeOnContextAvailableListener[i6];
            if ((this.RemoteActionCompatParcelizer || setalignment.read()) && ((((i2 = this.write) == 0 || i2 == 1) && setalignment.addOnNewIntentListener[0] == hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT && setalignment.onBackPressedDispatcher_delegatelambda010.MediaSessionCompatQueueItem != null && setalignment.invalidateMenu.MediaSessionCompatQueueItem != null) || ((i2 == 2 || i2 == 3) && setalignment.addOnNewIntentListener[1] == hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT && setalignment.onActivityResult.MediaSessionCompatQueueItem != null && setalignment.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.MediaSessionCompatQueueItem != null))) {
                z2 = true;
                break;
            }
            i6++;
        }
        boolean z3 = paintdefaultVar.write() || paintdefaultVar3.write();
        boolean z4 = paintdefaultVar2.write() || paintdefaultVar4.write();
        int i7 = (z2 || !(((i = this.write) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.removeOnMultiWindowModeChangedListener) {
            setAlignment setalignment2 = this.removeOnContextAvailableListener[i8];
            if (this.RemoteActionCompatParcelizer || setalignment2.read()) {
                setBlockui setblockuiWrite = drawWithContentElement.write(setalignment2.addOnMultiWindowModeChangedListener[this.write]);
                paintdefault[] paintdefaultVarArr2 = setalignment2.addOnMultiWindowModeChangedListener;
                int i9 = this.write;
                paintdefault paintdefaultVar7 = paintdefaultVarArr2[i9];
                paintdefaultVar7.MediaMetadataCompat = setblockuiWrite;
                paintdefault paintdefaultVar8 = paintdefaultVar7.MediaSessionCompatQueueItem;
                int i10 = (paintdefaultVar8 == null || paintdefaultVar8.RatingCompat != this) ? 0 : paintdefaultVar7.IconCompatParcelizer;
                if (i9 != 0 && i9 != i3) {
                    setBlockui setblockui = paintdefaultVar6.MediaMetadataCompat;
                    int i11 = this.IconCompatParcelizer;
                    drawWithContent drawwithcontentSerializer = drawWithContentElement.serializer();
                    setBlockui setblockuiIconCompatParcelizer = drawWithContentElement.IconCompatParcelizer();
                    setblockuiIconCompatParcelizer.PlaybackStateCompatCustomAction = 0;
                    drawwithcontentSerializer.serializer(setblockui, setblockuiWrite, setblockuiIconCompatParcelizer, i11 + i10);
                    drawWithContentElement.write(drawwithcontentSerializer);
                } else {
                    setBlockui setblockui2 = paintdefaultVar6.MediaMetadataCompat;
                    int i12 = this.IconCompatParcelizer;
                    drawWithContent drawwithcontentSerializer2 = drawWithContentElement.serializer();
                    setBlockui setblockuiIconCompatParcelizer2 = drawWithContentElement.IconCompatParcelizer();
                    setblockuiIconCompatParcelizer2.PlaybackStateCompatCustomAction = 0;
                    drawwithcontentSerializer2.RemoteActionCompatParcelizer(setblockui2, setblockuiWrite, setblockuiIconCompatParcelizer2, i12 - i10);
                    drawWithContentElement.write(drawwithcontentSerializer2);
                }
                drawWithContentElement.serializer(paintdefaultVar6.MediaMetadataCompat, setblockuiWrite, this.IconCompatParcelizer + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.write;
        if (i13 == 0) {
            drawWithContentElement.serializer(paintdefaultVar3.MediaMetadataCompat, paintdefaultVar.MediaMetadataCompat, 0, 8);
            drawWithContentElement.serializer(paintdefaultVar.MediaMetadataCompat, this.getViewModelStore.invalidateMenu.MediaMetadataCompat, 0, 4);
            drawWithContentElement.serializer(paintdefaultVar.MediaMetadataCompat, this.getViewModelStore.onBackPressedDispatcher_delegatelambda010.MediaMetadataCompat, 0, 0);
            return;
        }
        if (i13 == 1) {
            drawWithContentElement.serializer(paintdefaultVar.MediaMetadataCompat, paintdefaultVar3.MediaMetadataCompat, 0, 8);
            drawWithContentElement.serializer(paintdefaultVar.MediaMetadataCompat, this.getViewModelStore.onBackPressedDispatcher_delegatelambda010.MediaMetadataCompat, 0, 4);
            drawWithContentElement.serializer(paintdefaultVar.MediaMetadataCompat, this.getViewModelStore.invalidateMenu.MediaMetadataCompat, 0, 0);
        } else if (i13 == 2) {
            drawWithContentElement.serializer(paintdefaultVar4.MediaMetadataCompat, paintdefaultVar2.MediaMetadataCompat, 0, 8);
            drawWithContentElement.serializer(paintdefaultVar2.MediaMetadataCompat, this.getViewModelStore.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.MediaMetadataCompat, 0, 4);
            drawWithContentElement.serializer(paintdefaultVar2.MediaMetadataCompat, this.getViewModelStore.onActivityResult.MediaMetadataCompat, 0, 0);
        } else if (i13 == 3) {
            drawWithContentElement.serializer(paintdefaultVar2.MediaMetadataCompat, paintdefaultVar4.MediaMetadataCompat, 0, 8);
            drawWithContentElement.serializer(paintdefaultVar2.MediaMetadataCompat, this.getViewModelStore.onActivityResult.MediaMetadataCompat, 0, 4);
            drawWithContentElement.serializer(paintdefaultVar2.MediaMetadataCompat, this.getViewModelStore.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.MediaMetadataCompat, 0, 0);
        }
    }
}
