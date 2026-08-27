package o;

/* JADX INFO: loaded from: classes.dex */
public final class width3ABfNKs implements SizeNode {
    public final int IconCompatParcelizer;
    public float[][] MediaBrowserCompatMediaItem;
    public final AnchoredDraggableKt MediaDescriptionCompat;
    public TransformGestureDetectorKtdetectTransformGestures2 MediaMetadataCompat;
    public float[] MediaSessionCompatQueueItem;
    public TransformGestureDetectorKtdetectTransformGestures2 RatingCompat;
    public TransformGestureDetectorKtdetectTransformGestures2 RemoteActionCompatParcelizer;
    public TransformGestureDetectorKtdetectTransformGestures2 read;
    public final animateToWithDecay serializer;
    public androidx.transition.TransitionValuesMaps write;

    @Override // o.SizeNode
    public final int IconCompatParcelizer() {
        return 0;
    }

    @Override // o.SizeNode
    public final int serializer() {
        return this.IconCompatParcelizer;
    }

    public final void read(TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures3, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures4) {
        float[] fArr;
        TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures5 = this.RatingCompat;
        AnchoredDraggableKt anchoredDraggableKt = this.MediaDescriptionCompat;
        if (transformGestureDetectorKtdetectTransformGestures5 == null) {
            this.RatingCompat = transformGestureDetectorKtdetectTransformGestures2.RemoteActionCompatParcelizer();
            this.MediaMetadataCompat = transformGestureDetectorKtdetectTransformGestures4.RemoteActionCompatParcelizer();
            int i = anchoredDraggableKt.RemoteActionCompatParcelizer;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = anchoredDraggableKt.RemoteActionCompatParcelizer(i2) / 1000.0f;
            }
            this.MediaSessionCompatQueueItem = fArr2;
        }
        if (this.write != null) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, transformGestureDetectorKtdetectTransformGestures2}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, transformGestureDetectorKtdetectTransformGestures3}, getCieXyz.write())).booleanValue()) {
                    return;
                }
            }
        }
        boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, transformGestureDetectorKtdetectTransformGestures2}, getCieXyz.write())).booleanValue();
        boolean zBooleanValue2 = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, transformGestureDetectorKtdetectTransformGestures3}, getCieXyz.write())).booleanValue();
        this.RemoteActionCompatParcelizer = transformGestureDetectorKtdetectTransformGestures2;
        this.read = transformGestureDetectorKtdetectTransformGestures3;
        int iIconCompatParcelizer = transformGestureDetectorKtdetectTransformGestures2.IconCompatParcelizer();
        float[][] fArr3 = this.MediaBrowserCompatMediaItem;
        int i3 = this.IconCompatParcelizer;
        animateToWithDecay animatetowithdecay = this.serializer;
        if (fArr3 == null) {
            int i4 = anchoredDraggableKt.RemoteActionCompatParcelizer;
            fArr3 = new float[i4][];
            for (int i5 = 0; i5 < i4; i5++) {
                int iRemoteActionCompatParcelizer = anchoredDraggableKt.RemoteActionCompatParcelizer(i5);
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) animatetowithdecay.serializer(iRemoteActionCompatParcelizer);
                if (iRemoteActionCompatParcelizer == 0 && onviewattachedtowindowlambda0 == null) {
                    fArr = new float[iIconCompatParcelizer];
                    for (int i6 = 0; i6 < iIconCompatParcelizer; i6++) {
                        fArr[i6] = transformGestureDetectorKtdetectTransformGestures2.write(i6);
                    }
                } else if (iRemoteActionCompatParcelizer == i3 && onviewattachedtowindowlambda0 == null) {
                    fArr = new float[iIconCompatParcelizer];
                    for (int i7 = 0; i7 < iIconCompatParcelizer; i7++) {
                        fArr[i7] = transformGestureDetectorKtdetectTransformGestures3.write(i7);
                    }
                } else {
                    onviewattachedtowindowlambda0.getClass();
                    TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures6 = (TransformGestureDetectorKtdetectTransformGestures2) onviewattachedtowindowlambda0.serializer;
                    float[] fArr4 = new float[iIconCompatParcelizer];
                    for (int i8 = 0; i8 < iIconCompatParcelizer; i8++) {
                        fArr4[i8] = transformGestureDetectorKtdetectTransformGestures6.write(i8);
                    }
                    fArr = fArr4;
                }
                fArr3[i5] = fArr;
            }
            this.MediaBrowserCompatMediaItem = fArr3;
        } else {
            if (!zBooleanValue && !animatetowithdecay.RemoteActionCompatParcelizer(0)) {
                int iRemoteActionCompatParcelizer2 = ScrollingLayoutElement.RemoteActionCompatParcelizer(anchoredDraggableKt, 0);
                float[] fArr5 = new float[iIconCompatParcelizer];
                for (int i9 = 0; i9 < iIconCompatParcelizer; i9++) {
                    fArr5[i9] = transformGestureDetectorKtdetectTransformGestures2.write(i9);
                }
                fArr3[iRemoteActionCompatParcelizer2] = fArr5;
            }
            if (!zBooleanValue2 && !animatetowithdecay.RemoteActionCompatParcelizer(i3)) {
                int iRemoteActionCompatParcelizer3 = ScrollingLayoutElement.RemoteActionCompatParcelizer(anchoredDraggableKt, i3);
                float[] fArr6 = new float[iIconCompatParcelizer];
                for (int i10 = 0; i10 < iIconCompatParcelizer; i10++) {
                    fArr6[i10] = transformGestureDetectorKtdetectTransformGestures3.write(i10);
                }
                fArr3[iRemoteActionCompatParcelizer3] = fArr6;
            }
        }
        float[] fArr7 = this.MediaSessionCompatQueueItem;
        if (fArr7 == null) {
            removeNodeAtDepth.serializer("times");
            throw null;
        }
        this.write = new androidx.transition.TransitionValuesMaps(fArr7, fArr3);
    }

    public final float serializer(int i, int i2) {
        fling flingVar;
        float fTransform;
        AnchoredDraggableKt anchoredDraggableKt = this.MediaDescriptionCompat;
        if (i >= anchoredDraggableKt.RemoteActionCompatParcelizer - 1) {
            fTransform = i2;
        } else {
            int iRemoteActionCompatParcelizer = anchoredDraggableKt.RemoteActionCompatParcelizer(i);
            int iRemoteActionCompatParcelizer2 = anchoredDraggableKt.RemoteActionCompatParcelizer(i + 1);
            if (i2 == iRemoteActionCompatParcelizer) {
                fTransform = iRemoteActionCompatParcelizer;
            } else {
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) this.serializer.serializer(anchoredDraggableKt.RemoteActionCompatParcelizer(i));
                if (onviewattachedtowindowlambda0 == null || (flingVar = (fling) onviewattachedtowindowlambda0.write) == null) {
                    flingVar = performFling.read;
                }
                float f = iRemoteActionCompatParcelizer2 - iRemoteActionCompatParcelizer;
                fTransform = (flingVar.transform((i2 - iRemoteActionCompatParcelizer) / f) * f) + iRemoteActionCompatParcelizer;
            }
        }
        return fTransform / 1000.0f;
    }

    public width3ABfNKs(AnchoredDraggableKt anchoredDraggableKt, animateToWithDecay animatetowithdecay, int i) {
        this.MediaDescriptionCompat = anchoredDraggableKt;
        this.serializer = animatetowithdecay;
        this.IconCompatParcelizer = i;
    }

    @Override // o.size3ABfNKs
    public final TransformGestureDetectorKtdetectTransformGestures2 read(long j, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures3, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures4) {
        int i;
        int i2 = (int) sizeVpY3zN4.read(this, j / 1000000);
        read(transformGestureDetectorKtdetectTransformGestures2, transformGestureDetectorKtdetectTransformGestures3, transformGestureDetectorKtdetectTransformGestures4);
        int iRemoteActionCompatParcelizer = ScrollingLayoutElement.RemoteActionCompatParcelizer(this.MediaDescriptionCompat, i2);
        if (iRemoteActionCompatParcelizer < -1) {
            iRemoteActionCompatParcelizer = -(iRemoteActionCompatParcelizer + 2);
        }
        TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures5 = this.MediaMetadataCompat;
        transformGestureDetectorKtdetectTransformGestures5.getClass();
        androidx.transition.TransitionValuesMaps transitionValuesMaps = this.write;
        transitionValuesMaps.getClass();
        float fSerializer = serializer(iRemoteActionCompatParcelizer, i2);
        float[] fArr = (float[]) transitionValuesMaps.MediaBrowserCompatMediaItem;
        float[][] fArr2 = (float[][]) transitionValuesMaps.MediaDescriptionCompat;
        float[][] fArr3 = (float[][]) transitionValuesMaps.MediaMetadataCompat;
        int length = fArr.length;
        int i3 = 0;
        int length2 = fArr2[0].length;
        if (fSerializer <= fArr[0]) {
            i = 0;
        } else {
            i = length - 1;
            if (fSerializer < fArr[i]) {
                i = -1;
            }
        }
        if (i != -1) {
            float[] fArr4 = fArr3[i];
            if (fArr4.length >= length2) {
                while (i3 < length2) {
                    transformGestureDetectorKtdetectTransformGestures5.write(fArr4[i3], i3);
                    i3++;
                }
            }
        } else {
            while (iRemoteActionCompatParcelizer < length - 1) {
                int i4 = iRemoteActionCompatParcelizer + 1;
                float f = fArr[i4];
                if (fSerializer <= f) {
                    float f2 = fArr[iRemoteActionCompatParcelizer];
                    float f3 = f - f2;
                    float f4 = (fSerializer - f2) / f3;
                    while (i3 < length2) {
                        transformGestureDetectorKtdetectTransformGestures5.write(tryMaxHeightJN0ABg.serializer(f3, f4, fArr2[iRemoteActionCompatParcelizer][i3], fArr2[i4][i3], fArr3[iRemoteActionCompatParcelizer][i3], fArr3[i4][i3]) / f3, i3);
                        i3++;
                    }
                    break;
                }
                iRemoteActionCompatParcelizer = i4;
            }
        }
        return transformGestureDetectorKtdetectTransformGestures5;
    }

    @Override // o.size3ABfNKs
    public final TransformGestureDetectorKtdetectTransformGestures2 serializer(long j, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures3, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures4) {
        int i;
        int i2 = (int) sizeVpY3zN4.read(this, j / 1000000);
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) this.serializer.serializer(i2);
        if (onviewattachedtowindowlambda0 != null) {
            return (TransformGestureDetectorKtdetectTransformGestures2) onviewattachedtowindowlambda0.serializer;
        }
        if (i2 >= this.IconCompatParcelizer) {
            return transformGestureDetectorKtdetectTransformGestures3;
        }
        if (i2 <= 0) {
            return transformGestureDetectorKtdetectTransformGestures2;
        }
        read(transformGestureDetectorKtdetectTransformGestures2, transformGestureDetectorKtdetectTransformGestures3, transformGestureDetectorKtdetectTransformGestures4);
        int iRemoteActionCompatParcelizer = ScrollingLayoutElement.RemoteActionCompatParcelizer(this.MediaDescriptionCompat, i2);
        if (iRemoteActionCompatParcelizer < -1) {
            iRemoteActionCompatParcelizer = -(iRemoteActionCompatParcelizer + 2);
        }
        TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures5 = this.RatingCompat;
        transformGestureDetectorKtdetectTransformGestures5.getClass();
        androidx.transition.TransitionValuesMaps transitionValuesMaps = this.write;
        transitionValuesMaps.getClass();
        float fSerializer = serializer(iRemoteActionCompatParcelizer, i2);
        float[][] fArr = (float[][]) transitionValuesMaps.MediaMetadataCompat;
        float[] fArr2 = (float[]) transitionValuesMaps.RatingCompat;
        float[] fArr3 = (float[]) transitionValuesMaps.MediaBrowserCompatMediaItem;
        int length = fArr3.length;
        float[][] fArr4 = (float[][]) transitionValuesMaps.MediaDescriptionCompat;
        int i3 = 0;
        float[] fArr5 = fArr4[0];
        int length2 = fArr5.length;
        float f = fArr3[0];
        if (fSerializer <= f) {
            i = 0;
        } else {
            i = length - 1;
            if (fSerializer < fArr3[i]) {
                i = -1;
            }
        }
        if (i != -1) {
            float f2 = fArr3[i];
            int length3 = fArr5.length;
            int length4 = fArr3.length - 1;
            float f3 = fArr3[length4];
            if (f2 >= f) {
                f = f2;
            }
            if (f <= f3) {
                f3 = f;
            }
            if (fArr2.length >= length3) {
                int i4 = 0;
                while (i4 < length4) {
                    int i5 = i4 + 1;
                    float f4 = fArr3[i5];
                    if (f3 <= f4) {
                        float f5 = fArr3[i4];
                        float f6 = f4 - f5;
                        float f7 = (f3 - f5) / f6;
                        for (int i6 = 0; i6 < length3; i6++) {
                            fArr2[i6] = tryMaxHeightJN0ABg.serializer(f6, f7, fArr4[i4][i6], fArr4[i5][i6], fArr[i4][i6], fArr[i5][i6]) / f6;
                        }
                        break;
                    }
                    i4 = i5;
                }
            }
            while (i3 < length2) {
                transformGestureDetectorKtdetectTransformGestures5.write(((fSerializer - fArr3[i]) * fArr2[i3]) + fArr4[i][i3], i3);
                i3++;
            }
        } else {
            while (iRemoteActionCompatParcelizer < length - 1) {
                float f8 = fArr3[iRemoteActionCompatParcelizer];
                if (fSerializer == f8) {
                    while (i3 < length2) {
                        transformGestureDetectorKtdetectTransformGestures5.write(fArr4[iRemoteActionCompatParcelizer][i3], i3);
                        i3++;
                    }
                    break;
                }
                int i7 = iRemoteActionCompatParcelizer + 1;
                float f9 = fArr3[i7];
                if (fSerializer < f9) {
                    float f10 = f9 - f8;
                    float f11 = (fSerializer - f8) / f10;
                    while (i3 < length2) {
                        float f12 = fArr4[iRemoteActionCompatParcelizer][i3];
                        float f13 = f11 * f11;
                        float f14 = f13 * f11;
                        transformGestureDetectorKtdetectTransformGestures5.write(((((f14 - f13) * (fArr[i7][i3] * f10)) + (((f11 - (f13 * 2.0f)) + f14) * (fArr[iRemoteActionCompatParcelizer][i3] * f10))) + f12) - ((f12 - fArr4[i7][i3]) * ((f13 * 3.0f) - (f14 * 2.0f))), i3);
                        i3++;
                    }
                    break;
                }
                iRemoteActionCompatParcelizer = i7;
            }
        }
        return transformGestureDetectorKtdetectTransformGestures5;
    }
}
