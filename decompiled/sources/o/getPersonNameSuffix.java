package o;

/* JADX INFO: loaded from: classes.dex */
public final class getPersonNameSuffix extends BlurKt {
    public static final Object serializer = new Object();
    public AnchoredDraggableState IconCompatParcelizer;
    public int RatingCompat;
    public int RemoteActionCompatParcelizer;
    public long read;
    public Object write;

    /* JADX WARN: Code duplicated, block: B:42:0x00e7 A[Catch: all -> 0x0173, LOOP:3: B:29:0x0099->B:42:0x00e7, LOOP_END, TryCatch #0 {all -> 0x0173, blocks: (B:12:0x0024, B:15:0x0031, B:17:0x0040, B:19:0x004c, B:21:0x0056, B:24:0x0072, B:26:0x0076, B:29:0x0099, B:31:0x00b0, B:33:0x00bc, B:35:0x00c2, B:36:0x00d2, B:46:0x0112, B:42:0x00e7, B:45:0x00ff), top: B:74:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0168 A[LOOP:5: B:60:0x0166->B:61:0x0168, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:85:0x00ee A[EDGE_INSN: B:85:0x00ee->B:43:0x00ee BREAK  A[LOOP:3: B:29:0x0099->B:42:0x00e7], SYNTHETIC] */
    public final int serializer(getPersonLastName getpersonlastname, getBrush getbrush) {
        AnchoredDraggableState anchoredDraggableState;
        int i;
        int iIdentityHashCode;
        Object[] objArr;
        int i2;
        int i3;
        long[] jArr;
        Object[] objArr2;
        int[] iArr;
        int[] iArr2;
        long j;
        BlurKt blurKtSerializer;
        synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
            anchoredDraggableState = this.IconCompatParcelizer;
        }
        char c = 7;
        if (anchoredDraggableState.serializer == 0) {
            return 7;
        }
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequestsIconCompatParcelizer = androidx.compose.runtime.CompositionKt.IconCompatParcelizer();
        Object[] objArr3 = oncreatevirtualviewtranslationrequestsIconCompatParcelizer.write;
        int i4 = oncreatevirtualviewtranslationrequestsIconCompatParcelizer.read;
        for (int i5 = 0; i5 < i4; i5++) {
            ((getSmsOtpCode) objArr3[i5]).RemoteActionCompatParcelizer();
        }
        try {
            Object[] objArr4 = anchoredDraggableState.IconCompatParcelizer;
            int[] iArr3 = anchoredDraggableState.MediaMetadataCompat;
            long[] jArr2 = anchoredDraggableState.write;
            int length = jArr2.length - 2;
            if (length >= 0) {
                iIdentityHashCode = 7;
                int i6 = 0;
                while (true) {
                    long j2 = jArr2[i6];
                    long j3 = -9187201950435737472L;
                    if ((((~j2) << c) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j2 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                blur1fqSgw blur1fqsgw = (blur1fqSgw) objArr4[i9];
                                if (iArr3[i9] != 1) {
                                    jArr2 = jArr2;
                                    objArr4 = objArr4;
                                    iArr2 = iArr3;
                                    j = -9187201950435737472L;
                                } else {
                                    if (blur1fqsgw instanceof getPersonLastName) {
                                        getPersonLastName getpersonlastname2 = (getPersonLastName) blur1fqsgw;
                                        getPersonNameSuffix getpersonnamesuffixIconCompatParcelizer = getpersonlastname2.IconCompatParcelizer((getPersonNameSuffix) getOffsetF1C5BW0.serializer(getpersonlastname2.serializer, getbrush), getbrush, false, getpersonlastname2.IconCompatParcelizer);
                                        AnchoredDraggableState anchoredDraggableState2 = getpersonnamesuffixIconCompatParcelizer.IconCompatParcelizer;
                                        Object[] objArr5 = anchoredDraggableState2.IconCompatParcelizer;
                                        long[] jArr3 = anchoredDraggableState2.write;
                                        int length2 = jArr3.length - 2;
                                        if (length2 >= 0) {
                                            int i10 = 0;
                                            while (true) {
                                                long j4 = jArr3[i10];
                                                iArr2 = iArr3;
                                                long[] jArr4 = jArr3;
                                                j = -9187201950435737472L;
                                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                    if (i10 != length2) {
                                                        break;
                                                        break;
                                                    }
                                                    i10++;
                                                    iArr3 = iArr2;
                                                    jArr3 = jArr4;
                                                } else {
                                                    int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                    int i12 = 0;
                                                    while (i12 < i11) {
                                                        if ((j4 & 255) < 128) {
                                                            iIdentityHashCode = (iIdentityHashCode * 31) + System.identityHashCode((blur1fqSgw) objArr5[(i10 << 3) + i12]);
                                                        }
                                                        j4 >>= 8;
                                                        i12++;
                                                        iIdentityHashCode = iIdentityHashCode;
                                                    }
                                                    int i13 = iIdentityHashCode;
                                                    if (i11 != 8) {
                                                        iIdentityHashCode = i13;
                                                        break;
                                                    }
                                                    iIdentityHashCode = i13;
                                                    if (i10 != length2) {
                                                        break;
                                                    }
                                                    i10++;
                                                    iArr3 = iArr2;
                                                    jArr3 = jArr4;
                                                }
                                            }
                                            blurKtSerializer = getpersonnamesuffixIconCompatParcelizer;
                                        } else {
                                            iArr2 = iArr3;
                                            j = -9187201950435737472L;
                                            blurKtSerializer = getpersonnamesuffixIconCompatParcelizer;
                                        }
                                    } else {
                                        iArr2 = iArr3;
                                        j = -9187201950435737472L;
                                        blurKtSerializer = getOffsetF1C5BW0.serializer(blur1fqsgw.IconCompatParcelizer(), getbrush);
                                    }
                                    iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(blurKtSerializer)) * 31) + Long.hashCode(blurKtSerializer.MediaBrowserCompatMediaItem);
                                }
                            } else {
                                jArr2 = jArr2;
                                objArr4 = objArr4;
                                iArr2 = iArr3;
                                j = j3;
                            }
                            j2 >>= 8;
                            i8++;
                            jArr2 = jArr2;
                            j3 = j;
                            objArr4 = objArr4;
                            iArr3 = iArr2;
                        }
                        jArr = jArr2;
                        objArr2 = objArr4;
                        iArr = iArr3;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr2;
                        objArr2 = objArr4;
                        iArr = iArr3;
                    }
                    if (i6 != length) {
                        i6++;
                        jArr2 = jArr;
                        objArr4 = objArr2;
                        iArr3 = iArr;
                        c = 7;
                    } else {
                        i = iIdentityHashCode;
                    }
                }
                objArr = oncreatevirtualviewtranslationrequestsIconCompatParcelizer.write;
                i2 = oncreatevirtualviewtranslationrequestsIconCompatParcelizer.read;
                for (i3 = 0; i3 < i2; i3++) {
                    ((getSmsOtpCode) objArr[i3]).read();
                }
                return iIdentityHashCode;
            }
            i = 7;
            iIdentityHashCode = i;
            objArr = oncreatevirtualviewtranslationrequestsIconCompatParcelizer.write;
            i2 = oncreatevirtualviewtranslationrequestsIconCompatParcelizer.read;
            while (i3 < i2) {
                ((getSmsOtpCode) objArr[i3]).read();
            }
            return iIdentityHashCode;
        } catch (Throwable th) {
            Object[] objArr6 = oncreatevirtualviewtranslationrequestsIconCompatParcelizer.write;
            int i14 = oncreatevirtualviewtranslationrequestsIconCompatParcelizer.read;
            for (int i15 = 0; i15 < i14; i15++) {
                ((getSmsOtpCode) objArr6[i15]).read();
            }
            throw th;
        }
    }

    @Override // o.BlurKt
    public final BlurKt write(long j) {
        return new getPersonNameSuffix(j);
    }

    public final boolean write(getPersonLastName getpersonlastname, getBrush getbrush) {
        boolean z;
        boolean z2;
        Object obj = getOffsetF1C5BW0.MediaDescriptionCompat;
        synchronized (obj) {
            z = false;
            z2 = (this.read == getbrush.r8lambda54BeH8ZsBru0CXI2CCSP2syNys() && this.RatingCompat == getbrush.PlaybackStateCompatCustomAction()) ? false : true;
        }
        if (this.write != serializer && (!z2 || this.RemoteActionCompatParcelizer == serializer(getpersonlastname, getbrush))) {
            z = true;
        }
        if (!z || !z2) {
            return z;
        }
        synchronized (obj) {
            this.read = getbrush.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            this.RatingCompat = getbrush.PlaybackStateCompatCustomAction();
        }
        return z;
    }

    public getPersonNameSuffix(long j) {
        super(j);
        AnchoredDraggableState anchoredDraggableState = ContentInViewNodeKt.read;
        anchoredDraggableState.getClass();
        this.IconCompatParcelizer = anchoredDraggableState;
        this.write = serializer;
    }

    @Override // o.BlurKt
    public final void RemoteActionCompatParcelizer(BlurKt blurKt) {
        blurKt.getClass();
        getPersonNameSuffix getpersonnamesuffix = (getPersonNameSuffix) blurKt;
        this.IconCompatParcelizer = getpersonnamesuffix.IconCompatParcelizer;
        this.write = getpersonnamesuffix.write;
        this.RemoteActionCompatParcelizer = getpersonnamesuffix.RemoteActionCompatParcelizer;
    }
}
