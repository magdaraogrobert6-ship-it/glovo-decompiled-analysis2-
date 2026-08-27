package o;

import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class getTargetConstraintsOenEA2s implements SizeNode {
    public coil3.memory.MemoryCacheService IconCompatParcelizer;
    public TransformGestureDetectorKtdetectTransformGestures2 MediaBrowserCompatMediaItem;
    public float[] MediaDescriptionCompat;
    public int[] MediaMetadataCompat = sizeVpY3zN4.serializer;
    public float[] MediaSessionCompatQueueItem;
    public TransformGestureDetectorKtdetectTransformGestures2 MediaSessionCompatResultReceiverWrapper;
    public TransformGestureDetectorKtdetectTransformGestures2 MediaSessionCompatToken;
    public final AnchoredDraggableKt PlaybackStateCompat;
    public float[] RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final fling read;
    public final animateToWithDecay serializer;
    public TransformGestureDetectorKtdetectTransformGestures2 write;

    @Override // o.SizeNode
    public final int IconCompatParcelizer() {
        return 0;
    }

    @Override // o.SizeNode
    public final int serializer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final float serializer(int i, int i2, boolean z) {
        fling flingVar;
        float f;
        AnchoredDraggableKt anchoredDraggableKt = this.PlaybackStateCompat;
        if (i >= anchoredDraggableKt.RemoteActionCompatParcelizer - 1) {
            f = i2;
        } else {
            int iRemoteActionCompatParcelizer = anchoredDraggableKt.RemoteActionCompatParcelizer(i);
            int iRemoteActionCompatParcelizer2 = anchoredDraggableKt.RemoteActionCompatParcelizer(i + 1);
            if (i2 != iRemoteActionCompatParcelizer) {
                sizeInqDBjuR0 sizeinqdbjur0 = (sizeInqDBjuR0) this.serializer.serializer(iRemoteActionCompatParcelizer);
                if (sizeinqdbjur0 == null || (flingVar = sizeinqdbjur0.serializer) == null) {
                    flingVar = this.read;
                }
                float f2 = iRemoteActionCompatParcelizer2 - iRemoteActionCompatParcelizer;
                float fTransform = flingVar.transform((i2 - iRemoteActionCompatParcelizer) / f2);
                return z ? fTransform : ((f2 * fTransform) + iRemoteActionCompatParcelizer) / 1000.0f;
            }
            f = iRemoteActionCompatParcelizer;
        }
        return f / 1000.0f;
    }

    public final void serializer(TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures3, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures4) {
        float[] fArr;
        boolean z = this.IconCompatParcelizer != sizeVpY3zN4.IconCompatParcelizer;
        TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures5 = this.MediaSessionCompatResultReceiverWrapper;
        animateToWithDecay animatetowithdecay = this.serializer;
        AnchoredDraggableKt anchoredDraggableKt = this.PlaybackStateCompat;
        if (transformGestureDetectorKtdetectTransformGestures5 == null) {
            this.MediaSessionCompatResultReceiverWrapper = transformGestureDetectorKtdetectTransformGestures2.RemoteActionCompatParcelizer();
            this.MediaSessionCompatToken = transformGestureDetectorKtdetectTransformGestures4.RemoteActionCompatParcelizer();
            int i = anchoredDraggableKt.RemoteActionCompatParcelizer;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = anchoredDraggableKt.RemoteActionCompatParcelizer(i2) / 1000.0f;
            }
            this.RatingCompat = fArr2;
            int i3 = anchoredDraggableKt.RemoteActionCompatParcelizer;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = 0;
            }
            this.MediaMetadataCompat = iArr;
        }
        if (z) {
            if (this.IconCompatParcelizer != sizeVpY3zN4.IconCompatParcelizer) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, transformGestureDetectorKtdetectTransformGestures2}, getCieXyz.write())).booleanValue()) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem, transformGestureDetectorKtdetectTransformGestures3}, getCieXyz.write())).booleanValue()) {
                        return;
                    }
                }
            }
            this.write = transformGestureDetectorKtdetectTransformGestures2;
            this.MediaBrowserCompatMediaItem = transformGestureDetectorKtdetectTransformGestures3;
            int iIconCompatParcelizer = transformGestureDetectorKtdetectTransformGestures2.IconCompatParcelizer() + (transformGestureDetectorKtdetectTransformGestures2.IconCompatParcelizer() % 2);
            this.MediaSessionCompatQueueItem = new float[iIconCompatParcelizer];
            this.MediaDescriptionCompat = new float[iIconCompatParcelizer];
            int i5 = anchoredDraggableKt.RemoteActionCompatParcelizer;
            float[][] fArr3 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int iRemoteActionCompatParcelizer = anchoredDraggableKt.RemoteActionCompatParcelizer(i6);
                sizeInqDBjuR0 sizeinqdbjur0 = (sizeInqDBjuR0) animatetowithdecay.serializer(iRemoteActionCompatParcelizer);
                if (iRemoteActionCompatParcelizer == 0 && sizeinqdbjur0 == null) {
                    fArr = new float[iIconCompatParcelizer];
                    for (int i7 = 0; i7 < iIconCompatParcelizer; i7++) {
                        fArr[i7] = transformGestureDetectorKtdetectTransformGestures2.write(i7);
                    }
                } else if (iRemoteActionCompatParcelizer == this.RemoteActionCompatParcelizer && sizeinqdbjur0 == null) {
                    fArr = new float[iIconCompatParcelizer];
                    for (int i8 = 0; i8 < iIconCompatParcelizer; i8++) {
                        fArr[i8] = transformGestureDetectorKtdetectTransformGestures3.write(i8);
                    }
                } else {
                    sizeinqdbjur0.getClass();
                    TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures6 = sizeinqdbjur0.IconCompatParcelizer;
                    float[] fArr4 = new float[iIconCompatParcelizer];
                    for (int i9 = 0; i9 < iIconCompatParcelizer; i9++) {
                        fArr4[i9] = transformGestureDetectorKtdetectTransformGestures6.write(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.IconCompatParcelizer = new coil3.memory.MemoryCacheService(this.MediaMetadataCompat, this.RatingCompat, fArr3);
        }
    }

    public getTargetConstraintsOenEA2s(AnchoredDraggableKt anchoredDraggableKt, animateToWithDecay animatetowithdecay, int i, fling flingVar) {
        this.PlaybackStateCompat = anchoredDraggableKt;
        this.serializer = animatetowithdecay;
        this.RemoteActionCompatParcelizer = i;
        this.read = flingVar;
        float[] fArr = sizeVpY3zN4.RemoteActionCompatParcelizer;
        this.RatingCompat = fArr;
        this.MediaSessionCompatQueueItem = fArr;
        this.MediaDescriptionCompat = fArr;
        this.IconCompatParcelizer = sizeVpY3zN4.IconCompatParcelizer;
    }

    @Override // o.size3ABfNKs
    public final TransformGestureDetectorKtdetectTransformGestures2 read(long j, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures3, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures4) {
        long j2 = sizeVpY3zN4.read(this, j / 1000000);
        if (j2 < 0) {
            return transformGestureDetectorKtdetectTransformGestures4;
        }
        serializer(transformGestureDetectorKtdetectTransformGestures2, transformGestureDetectorKtdetectTransformGestures3, transformGestureDetectorKtdetectTransformGestures4);
        TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures5 = this.MediaSessionCompatToken;
        transformGestureDetectorKtdetectTransformGestures5.getClass();
        int i = 0;
        if (this.IconCompatParcelizer != sizeVpY3zN4.IconCompatParcelizer) {
            int i2 = (int) j2;
            int iRemoteActionCompatParcelizer = ScrollingLayoutElement.RemoteActionCompatParcelizer(this.PlaybackStateCompat, i2);
            if (iRemoteActionCompatParcelizer < -1) {
                iRemoteActionCompatParcelizer = -(iRemoteActionCompatParcelizer + 2);
            }
            float fSerializer = serializer(iRemoteActionCompatParcelizer, i2, false);
            float[] fArr = this.MediaDescriptionCompat;
            SnapFlingBehavior[][] snapFlingBehaviorArr = (SnapFlingBehavior[][]) this.IconCompatParcelizer.RemoteActionCompatParcelizer;
            float f = snapFlingBehaviorArr[0][0].MediaDescriptionCompat;
            float f2 = snapFlingBehaviorArr[snapFlingBehaviorArr.length - 1][0].ParcelableVolumeInfo;
            if (fSerializer < f) {
                fSerializer = f;
            }
            if (fSerializer <= f2) {
                f2 = fSerializer;
            }
            int length = fArr.length;
            boolean z = false;
            for (SnapFlingBehavior[] snapFlingBehaviorArr2 : snapFlingBehaviorArr) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < length - 1) {
                    SnapFlingBehavior snapFlingBehavior = snapFlingBehaviorArr2[i4];
                    if (f2 <= snapFlingBehavior.ParcelableVolumeInfo) {
                        if (snapFlingBehavior.MediaBrowserCompatMediaItem) {
                            fArr[i3] = snapFlingBehavior.RemoteActionCompatParcelizer;
                            fArr[i3 + 1] = snapFlingBehavior.RatingCompat;
                        } else {
                            snapFlingBehavior.IconCompatParcelizer(f2);
                            fArr[i3] = snapFlingBehavior.serializer();
                            fArr[i3 + 1] = snapFlingBehavior.RemoteActionCompatParcelizer();
                        }
                        z = true;
                    }
                    i3 += 2;
                    i4++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                transformGestureDetectorKtdetectTransformGestures5.write(fArr[i], i);
                i++;
            }
        } else {
            TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2Serializer = serializer((j2 - 1) * 1000000, transformGestureDetectorKtdetectTransformGestures2, transformGestureDetectorKtdetectTransformGestures3, transformGestureDetectorKtdetectTransformGestures4);
            TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2Serializer2 = serializer(j2 * 1000000, transformGestureDetectorKtdetectTransformGestures2, transformGestureDetectorKtdetectTransformGestures3, transformGestureDetectorKtdetectTransformGestures4);
            int iIconCompatParcelizer = transformGestureDetectorKtdetectTransformGestures2Serializer.IconCompatParcelizer();
            while (i < iIconCompatParcelizer) {
                transformGestureDetectorKtdetectTransformGestures5.write((transformGestureDetectorKtdetectTransformGestures2Serializer.write(i) - transformGestureDetectorKtdetectTransformGestures2Serializer2.write(i)) * 1000.0f, i);
                i++;
            }
        }
        return transformGestureDetectorKtdetectTransformGestures5;
    }

    @Override // o.size3ABfNKs
    public final TransformGestureDetectorKtdetectTransformGestures2 serializer(long j, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures3, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures4) {
        TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures5;
        TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures6;
        TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures7 = transformGestureDetectorKtdetectTransformGestures2;
        TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures8 = transformGestureDetectorKtdetectTransformGestures3;
        int i = (int) sizeVpY3zN4.read(this, j / 1000000);
        animateToWithDecay animatetowithdecay = this.serializer;
        sizeInqDBjuR0 sizeinqdbjur0 = (sizeInqDBjuR0) animatetowithdecay.serializer(i);
        if (sizeinqdbjur0 != null) {
            return sizeinqdbjur0.IconCompatParcelizer;
        }
        if (i >= this.RemoteActionCompatParcelizer) {
            return transformGestureDetectorKtdetectTransformGestures8;
        }
        if (i <= 0) {
            return transformGestureDetectorKtdetectTransformGestures7;
        }
        serializer(transformGestureDetectorKtdetectTransformGestures7, transformGestureDetectorKtdetectTransformGestures8, transformGestureDetectorKtdetectTransformGestures4);
        TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures9 = this.MediaSessionCompatResultReceiverWrapper;
        transformGestureDetectorKtdetectTransformGestures9.getClass();
        coil3.memory.MemoryCacheService memoryCacheService = this.IconCompatParcelizer;
        coil3.memory.MemoryCacheService memoryCacheService2 = sizeVpY3zN4.IconCompatParcelizer;
        AnchoredDraggableKt anchoredDraggableKt = this.PlaybackStateCompat;
        int i2 = 0;
        if (memoryCacheService != memoryCacheService2) {
            int iRemoteActionCompatParcelizer = ScrollingLayoutElement.RemoteActionCompatParcelizer(anchoredDraggableKt, i);
            if (iRemoteActionCompatParcelizer < -1) {
                iRemoteActionCompatParcelizer = -(iRemoteActionCompatParcelizer + 2);
            }
            float fSerializer = serializer(iRemoteActionCompatParcelizer, i, false);
            float[] fArr = this.MediaSessionCompatQueueItem;
            SnapFlingBehavior[][] snapFlingBehaviorArr = (SnapFlingBehavior[][]) this.IconCompatParcelizer.RemoteActionCompatParcelizer;
            int length = snapFlingBehaviorArr.length - 1;
            float f = snapFlingBehaviorArr[0][0].MediaDescriptionCompat;
            float f2 = snapFlingBehaviorArr[length][0].ParcelableVolumeInfo;
            int length2 = fArr.length;
            if (fSerializer < f || fSerializer > f2) {
                if (fSerializer > f2) {
                    f = f2;
                } else {
                    length = 0;
                }
                float f3 = fSerializer - f;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length2 - 1) {
                    SnapFlingBehavior snapFlingBehavior = snapFlingBehaviorArr[length][i4];
                    boolean z = snapFlingBehavior.MediaBrowserCompatMediaItem;
                    float f4 = snapFlingBehavior.RatingCompat;
                    float f5 = snapFlingBehavior.RemoteActionCompatParcelizer;
                    if (z) {
                        float f6 = snapFlingBehavior.MediaDescriptionCompat;
                        float f7 = snapFlingBehavior.MediaMetadataCompat;
                        float f8 = snapFlingBehavior.PlaybackStateCompatCustomAction;
                        float f9 = (f - f6) * f7;
                        fArr[i3] = (f5 * f3) + c8$$ExternalSyntheticOutline0.m(snapFlingBehavior.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, f8, f9, f8);
                        float f10 = snapFlingBehavior.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                        fArr[i3 + 1] = (f4 * f3) + c8$$ExternalSyntheticOutline0.m(snapFlingBehavior.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, f10, f9, f10);
                    } else {
                        snapFlingBehavior.IconCompatParcelizer(f);
                        fArr[i3] = (snapFlingBehavior.serializer() * f3) + (snapFlingBehavior.serializer * snapFlingBehavior.PlaybackStateCompat) + f5;
                        fArr[i3 + 1] = (snapFlingBehavior.RemoteActionCompatParcelizer() * f3) + (snapFlingBehavior.IconCompatParcelizer * snapFlingBehavior.MediaSessionCompatToken) + f4;
                    }
                    i3 += 2;
                    i4++;
                    snapFlingBehaviorArr = snapFlingBehaviorArr;
                }
            } else {
                int length3 = snapFlingBehaviorArr.length;
                int i5 = 0;
                boolean z2 = false;
                while (i5 < length3) {
                    int i6 = i2;
                    int i7 = i6;
                    while (i6 < length2 - 1) {
                        SnapFlingBehavior snapFlingBehavior2 = snapFlingBehaviorArr[i5][i7];
                        if (fSerializer <= snapFlingBehavior2.ParcelableVolumeInfo) {
                            if (snapFlingBehavior2.MediaBrowserCompatMediaItem) {
                                float f11 = snapFlingBehavior2.MediaDescriptionCompat;
                                float f12 = snapFlingBehavior2.MediaMetadataCompat;
                                float f13 = snapFlingBehavior2.PlaybackStateCompatCustomAction;
                                float f14 = (fSerializer - f11) * f12;
                                fArr[i6] = c8$$ExternalSyntheticOutline0.m(snapFlingBehavior2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, f13, f14, f13);
                                float f15 = snapFlingBehavior2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                                fArr[i6 + 1] = c8$$ExternalSyntheticOutline0.m(snapFlingBehavior2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, f15, f14, f15);
                            } else {
                                snapFlingBehavior2.IconCompatParcelizer(fSerializer);
                                fArr[i6] = (snapFlingBehavior2.serializer * snapFlingBehavior2.PlaybackStateCompat) + snapFlingBehavior2.RemoteActionCompatParcelizer;
                                fArr[i6 + 1] = (snapFlingBehavior2.IconCompatParcelizer * snapFlingBehavior2.MediaSessionCompatToken) + snapFlingBehavior2.RatingCompat;
                            }
                            z2 = true;
                        }
                        i6 += 2;
                        i7++;
                    }
                    if (z2) {
                        break;
                    }
                    i5++;
                    i2 = 0;
                }
            }
            int length4 = fArr.length;
            for (int i8 = 0; i8 < length4; i8++) {
                transformGestureDetectorKtdetectTransformGestures9.write(fArr[i8], i8);
            }
        } else {
            int iRemoteActionCompatParcelizer2 = ScrollingLayoutElement.RemoteActionCompatParcelizer(anchoredDraggableKt, i);
            if (iRemoteActionCompatParcelizer2 < -1) {
                iRemoteActionCompatParcelizer2 = -(iRemoteActionCompatParcelizer2 + 2);
            }
            float fSerializer2 = serializer(iRemoteActionCompatParcelizer2, i, true);
            sizeInqDBjuR0 sizeinqdbjur1 = (sizeInqDBjuR0) animatetowithdecay.serializer(anchoredDraggableKt.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer2));
            if (sizeinqdbjur1 != null && (transformGestureDetectorKtdetectTransformGestures6 = sizeinqdbjur1.IconCompatParcelizer) != null) {
                transformGestureDetectorKtdetectTransformGestures7 = transformGestureDetectorKtdetectTransformGestures6;
            }
            sizeInqDBjuR0 sizeinqdbjur2 = (sizeInqDBjuR0) animatetowithdecay.serializer(anchoredDraggableKt.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer2 + 1));
            if (sizeinqdbjur2 != null && (transformGestureDetectorKtdetectTransformGestures5 = sizeinqdbjur2.IconCompatParcelizer) != null) {
                transformGestureDetectorKtdetectTransformGestures8 = transformGestureDetectorKtdetectTransformGestures5;
            }
            int iIconCompatParcelizer = transformGestureDetectorKtdetectTransformGestures9.IconCompatParcelizer();
            for (int i9 = 0; i9 < iIconCompatParcelizer; i9++) {
                transformGestureDetectorKtdetectTransformGestures9.write((transformGestureDetectorKtdetectTransformGestures8.write(i9) * fSerializer2) + ((1.0f - fSerializer2) * transformGestureDetectorKtdetectTransformGestures7.write(i9)), i9);
            }
        }
        return transformGestureDetectorKtdetectTransformGestures9;
    }
}
