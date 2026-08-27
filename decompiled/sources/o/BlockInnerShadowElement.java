package o;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class BlockInnerShadowElement {
    public AnchoredDraggableState IconCompatParcelizer;
    public final getSmsOtpCode MediaBrowserCompatMediaItem;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public final relocationOffsetfbGrOKE MediaSessionCompatQueueItem;
    public final onRemeasuredozmzZPI MediaSessionCompatToken;
    public final onCreateVirtualViewTranslationRequests ParcelableVolumeInfo;
    public final onRemeasuredozmzZPI PlaybackStateCompat;
    public final HashMap RatingCompat;
    public int RemoteActionCompatParcelizer = -1;
    public final onRemeasuredozmzZPI read;
    public Object serializer;
    public int write;

    public final void IconCompatParcelizer(Object obj, Object obj2) {
        onRemeasuredozmzZPI onremeasuredozmzzpi = this.MediaSessionCompatToken;
        setNativeShader.RemoteActionCompatParcelizer(onremeasuredozmzzpi, obj2, obj);
        if (!(obj2 instanceof getPersonLastName) || onremeasuredozmzzpi.read(obj2)) {
            return;
        }
        Object[] objArr = {this.read, obj2};
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        setNativeShader.read(1496388782, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), objArr, iSerializer, isAppSetIdReadingEnabled.serializer(), -1496388775);
        this.RatingCompat.remove(obj2);
    }

    public final void read(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        long j;
        int i3;
        long j2;
        onRemeasuredozmzZPI onremeasuredozmzzpi = this.PlaybackStateCompat;
        long[] jArr3 = onremeasuredozmzzpi.write;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j3 = jArr3[i4];
            long j4 = -9187201950435737472L;
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8;
                int i6 = 8 - ((~(i4 - length)) >>> 31);
                int i7 = 0;
                while (i7 < i6) {
                    if ((j3 & 255) < 128) {
                        int i8 = (i4 << 3) + i7;
                        Object obj = onremeasuredozmzzpi.IconCompatParcelizer[i8];
                        AnchoredDraggableState anchoredDraggableState = (AnchoredDraggableState) onremeasuredozmzzpi.MediaMetadataCompat[i8];
                        Boolean bool = (Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(obj);
                        if (bool.booleanValue()) {
                            Object[] objArr = anchoredDraggableState.IconCompatParcelizer;
                            int[] iArr = anchoredDraggableState.MediaMetadataCompat;
                            long[] jArr4 = anchoredDraggableState.write;
                            int length2 = jArr4.length - 2;
                            jArr2 = jArr3;
                            if (length2 >= 0) {
                                i3 = i6;
                                int i9 = 0;
                                while (true) {
                                    long j5 = jArr4[i9];
                                    i2 = i4;
                                    j = j3;
                                    j2 = -9187201950435737472L;
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                        for (int i11 = 0; i11 < i10; i11++) {
                                            if ((j5 & 255) < 128) {
                                                int i12 = (i9 << 3) + i11;
                                                Object obj2 = objArr[i12];
                                                int i13 = iArr[i12];
                                                IconCompatParcelizer(obj, obj2);
                                            }
                                            j5 >>= 8;
                                        }
                                        if (i10 != 8) {
                                            break;
                                        }
                                    }
                                    if (i9 == length2) {
                                        break;
                                    }
                                    i9++;
                                    i4 = i2;
                                    j3 = j;
                                }
                            } else {
                                i2 = i4;
                                j = j3;
                                i3 = i6;
                                j2 = -9187201950435737472L;
                            }
                        } else {
                            jArr2 = jArr3;
                            i2 = i4;
                            j = j3;
                            i3 = i6;
                            j2 = j4;
                        }
                        if (bool.booleanValue()) {
                            onremeasuredozmzzpi.write(i8);
                        }
                    } else {
                        jArr2 = jArr3;
                        i2 = i4;
                        j = j3;
                        i3 = i6;
                        j2 = j4;
                    }
                    i7++;
                    j3 = j >> 8;
                    i5 = 8;
                    j4 = j2;
                    jArr3 = jArr2;
                    i6 = i3;
                    i4 = i2;
                }
                jArr = jArr3;
                int i14 = i4;
                if (i6 != i5) {
                    return;
                } else {
                    i = i14;
                }
            } else {
                jArr = jArr3;
                i = i4;
            }
            if (i == length) {
                return;
            }
            i4 = i + 1;
            jArr3 = jArr;
        }
    }

    public BlockInnerShadowElement(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.MediaDescriptionCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        int iSerializer2 = isAppSetIdReadingEnabled.serializer();
        int iSerializer3 = isAppSetIdReadingEnabled.serializer();
        this.MediaSessionCompatToken = (onRemeasuredozmzZPI) setNativeShader.read(-795115599, isAppSetIdReadingEnabled.serializer(), iSerializer2, new Object[0], iSerializer, iSerializer3, 795115601);
        this.PlaybackStateCompat = new onRemeasuredozmzZPI();
        this.MediaSessionCompatQueueItem = new relocationOffsetfbGrOKE();
        this.ParcelableVolumeInfo = new onCreateVirtualViewTranslationRequests(new getPersonLastName[16]);
        this.MediaBrowserCompatMediaItem = new getSmsOtpCode(1, this);
        int iSerializer4 = isAppSetIdReadingEnabled.serializer();
        int iSerializer5 = isAppSetIdReadingEnabled.serializer();
        int iSerializer6 = isAppSetIdReadingEnabled.serializer();
        this.read = (onRemeasuredozmzZPI) setNativeShader.read(-795115599, isAppSetIdReadingEnabled.serializer(), iSerializer5, new Object[0], iSerializer4, iSerializer6, 795115601);
        this.RatingCompat = new HashMap();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 18751. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final boolean read(java.util.Set r44) {
        /*
            Method dump skipped, instruction units count: 1875
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BlockInnerShadowElement.read(java.util.Set):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x00a7 A[LOOP:0: B:15:0x0062->B:28:0x00a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x00aa A[EDGE_INSN: B:37:0x00aa->B:29:0x00aa BREAK  A[LOOP:0: B:15:0x0062->B:28:0x00a7], SYNTHETIC] */
    public final void IconCompatParcelizer(Object obj, int i, Object obj2, AnchoredDraggableState anchoredDraggableState) {
        int i2;
        if (this.write > 0) {
            return;
        }
        int iWrite = anchoredDraggableState.write(obj);
        if (iWrite < 0) {
            iWrite = ~iWrite;
            i2 = -1;
        } else {
            i2 = anchoredDraggableState.MediaMetadataCompat[iWrite];
        }
        anchoredDraggableState.IconCompatParcelizer[iWrite] = obj;
        anchoredDraggableState.MediaMetadataCompat[iWrite] = i;
        if ((obj instanceof getPersonLastName) && i2 != i) {
            getPersonNameSuffix getpersonnamesuffixSerializer = ((getPersonLastName) obj).serializer();
            this.RatingCompat.put(obj, getpersonnamesuffixSerializer.write);
            AnchoredDraggableState anchoredDraggableState2 = getpersonnamesuffixSerializer.IconCompatParcelizer;
            onRemeasuredozmzZPI onremeasuredozmzzpi = this.read;
            int iSerializer = isAppSetIdReadingEnabled.serializer();
            int iSerializer2 = isAppSetIdReadingEnabled.serializer();
            int iSerializer3 = isAppSetIdReadingEnabled.serializer();
            setNativeShader.read(1496388782, isAppSetIdReadingEnabled.serializer(), iSerializer2, new Object[]{onremeasuredozmzzpi, obj}, iSerializer, iSerializer3, -1496388775);
            Object[] objArr = anchoredDraggableState2.IconCompatParcelizer;
            long[] jArr = anchoredDraggableState2.write;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i3 != length) {
                            break;
                            break;
                        }
                        i3++;
                    } else {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((j & 255) < 128) {
                                blur1fqSgw blur1fqsgw = (blur1fqSgw) objArr[(i3 << 3) + i5];
                                if (blur1fqsgw instanceof BlockInnerShadowNodeobtainPainter1) {
                                    ((BlockInnerShadowNodeobtainPainter1) blur1fqsgw).RemoteActionCompatParcelizer(2);
                                }
                                setNativeShader.serializer(onremeasuredozmzzpi, blur1fqsgw, obj);
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        } else if (i3 != length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        if (i2 == -1) {
            if (obj instanceof BlockInnerShadowNodeobtainPainter1) {
                ((BlockInnerShadowNodeobtainPainter1) obj).RemoteActionCompatParcelizer(2);
            }
            setNativeShader.serializer(this.MediaSessionCompatToken, obj, obj2);
        }
    }
}
