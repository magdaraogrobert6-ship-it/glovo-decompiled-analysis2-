package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ScaleKt extends component50d7_KjU {
    public final ArrayList IconCompatParcelizer;
    public int read;

    public final setAlignment read() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.IconCompatParcelizer;
            if (i >= arrayList.size()) {
                return null;
            }
            setAlignment setalignment = ((component50d7_KjU) arrayList.get(i)).MediaSessionCompatResultReceiverWrapper;
            if (setalignment.onMultiWindowModeChanged != 8) {
                return setalignment;
            }
            i++;
        }
    }

    @Override // o.component50d7_KjU
    public final void serializer() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.IconCompatParcelizer;
            if (i >= arrayList.size()) {
                return;
            }
            ((component50d7_KjU) arrayList.get(i)).serializer();
            i++;
        }
    }

    @Override // o.component50d7_KjU
    public final void write() {
        this.MediaSessionCompatQueueItem = null;
        Iterator it = this.IconCompatParcelizer.iterator();
        while (it.hasNext()) {
            ((component50d7_KjU) it.next()).write();
        }
    }

    public final setAlignment IconCompatParcelizer() {
        setAlignment setalignment;
        ArrayList arrayList = this.IconCompatParcelizer;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            setalignment = ((component50d7_KjU) arrayList.get(size)).MediaSessionCompatResultReceiverWrapper;
        } while (setalignment.onMultiWindowModeChanged == 8);
        return setalignment;
    }

    /* JADX WARN: Code duplicated, block: B:294:0x00e4 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00dc A[ADDED_TO_REGION] */
    @Override // o.releaseGraphicsLayers
    public final void IconCompatParcelizer(releaseGraphicsLayers releasegraphicslayers) {
        int i;
        int i2;
        ArrayList arrayList;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        boolean z;
        ArrayList arrayList2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f2;
        releaseGraphicsLayer releasegraphicslayer = this.PlaybackStateCompatCustomAction;
        if (releasegraphicslayer.MediaBrowserCompatMediaItem) {
            releaseGraphicsLayer releasegraphicslayer2 = this.RemoteActionCompatParcelizer;
            if (releasegraphicslayer2.MediaBrowserCompatMediaItem) {
                getUseIntrinsicSize getuseintrinsicsize = this.MediaSessionCompatResultReceiverWrapper.getViewModelStore;
                boolean z2 = getuseintrinsicsize != null ? getuseintrinsicsize.RatingCompat : false;
                int i16 = releasegraphicslayer2.PlaybackStateCompat - releasegraphicslayer.PlaybackStateCompat;
                ArrayList arrayList3 = this.IconCompatParcelizer;
                int size = arrayList3.size();
                int i17 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i17 >= size) {
                        i17 = -1;
                        break;
                    } else if (((component50d7_KjU) arrayList3.get(i17)).MediaSessionCompatResultReceiverWrapper.onMultiWindowModeChanged != 8) {
                        break;
                    } else {
                        i17++;
                    }
                }
                int i18 = size - 1;
                for (int i19 = i18; i19 >= 0; i19--) {
                    if (((component50d7_KjU) arrayList3.get(i19)).MediaSessionCompatResultReceiverWrapper.onMultiWindowModeChanged != 8) {
                        i = i19;
                        break;
                    }
                }
                int i20 = 0;
                while (true) {
                    if (i20 >= 2) {
                        arrayList = arrayList3;
                        i3 = i17;
                        i4 = 0;
                        i5 = 0;
                        i6 = 0;
                        f = 0.0f;
                        break;
                    }
                    int i21 = 0;
                    i6 = 0;
                    int i22 = 0;
                    int i23 = 0;
                    f = 0.0f;
                    while (i21 < size) {
                        component50d7_KjU component50d7_kju = (component50d7_KjU) arrayList3.get(i21);
                        setAlignment setalignment = component50d7_kju.MediaSessionCompatResultReceiverWrapper;
                        ArrayList arrayList4 = arrayList3;
                        if (setalignment.onMultiWindowModeChanged == i2) {
                            i14 = i17;
                        } else {
                            i23++;
                            if (i21 > 0 && i21 >= i17) {
                                i6 += component50d7_kju.PlaybackStateCompatCustomAction.write;
                            }
                            createGraphicsLayer creategraphicslayer = component50d7_kju.MediaDescriptionCompat;
                            int i24 = creategraphicslayer.PlaybackStateCompat;
                            i14 = i17;
                            boolean z3 = component50d7_kju.MediaBrowserCompatMediaItem != hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT;
                            if (z3) {
                                int i25 = this.ParcelableVolumeInfo;
                                if (i25 == 0 && !setalignment.getOnBackPressedInput.MediaDescriptionCompat.MediaBrowserCompatMediaItem) {
                                    return;
                                }
                                if (i25 == 1 && !setalignment.onCreatePanelMenu.MediaDescriptionCompat.MediaBrowserCompatMediaItem) {
                                    return;
                                }
                            } else {
                                if (component50d7_kju.MediaSessionCompatToken == 1 && i20 == 0) {
                                    i15 = creategraphicslayer.MediaSessionCompatResultReceiverWrapper;
                                    i22++;
                                } else {
                                    if (creategraphicslayer.MediaBrowserCompatMediaItem) {
                                        i15 = i24;
                                    }
                                    if (z3) {
                                        i6 += i15;
                                    } else {
                                        i22++;
                                        f2 = setalignment.onRequestPermissionsResult[this.ParcelableVolumeInfo];
                                        if (f2 >= 0.0f) {
                                            f += f2;
                                        }
                                    }
                                    if (i21 >= i18 && i21 < i) {
                                        i6 += -component50d7_kju.RemoteActionCompatParcelizer.write;
                                    }
                                }
                                z3 = true;
                                if (z3) {
                                    i22++;
                                    f2 = setalignment.onRequestPermissionsResult[this.ParcelableVolumeInfo];
                                    if (f2 >= 0.0f) {
                                        f += f2;
                                    }
                                } else {
                                    i6 += i15;
                                }
                                if (i21 >= i18) {
                                }
                            }
                            i15 = i24;
                            if (z3) {
                                i22++;
                                f2 = setalignment.onRequestPermissionsResult[this.ParcelableVolumeInfo];
                                if (f2 >= 0.0f) {
                                    f += f2;
                                }
                            } else {
                                i6 += i15;
                            }
                            if (i21 >= i18) {
                            }
                        }
                        i21++;
                        arrayList3 = arrayList4;
                        i17 = i14;
                        i2 = 8;
                    }
                    arrayList = arrayList3;
                    i3 = i17;
                    if (i6 < i16 || i22 == 0) {
                        i4 = i22;
                        i5 = i23;
                        break;
                    } else {
                        i20++;
                        arrayList3 = arrayList;
                        i17 = i3;
                        i2 = 8;
                    }
                }
                int i26 = releasegraphicslayer.PlaybackStateCompat;
                if (z2) {
                    i26 = releasegraphicslayer2.PlaybackStateCompat;
                }
                if (i6 > i16) {
                    i26 = z2 ? i26 + ((int) (((i6 - i16) / 2.0f) + 0.5f)) : i26 - ((int) (((i6 - i16) / 2.0f) + 0.5f));
                }
                if (i4 > 0) {
                    float f3 = i16 - i6;
                    int i27 = (int) ((f3 / i4) + 0.5f);
                    int i28 = 0;
                    int i29 = 0;
                    while (i28 < size) {
                        ArrayList arrayList5 = arrayList;
                        component50d7_KjU component50d7_kju2 = (component50d7_KjU) arrayList5.get(i28);
                        int i30 = i27;
                        setAlignment setalignment2 = component50d7_kju2.MediaSessionCompatResultReceiverWrapper;
                        int i31 = i6;
                        createGraphicsLayer creategraphicslayer2 = component50d7_kju2.MediaDescriptionCompat;
                        int i32 = i26;
                        boolean z4 = z2;
                        if (setalignment2.onMultiWindowModeChanged != 8 && component50d7_kju2.MediaBrowserCompatMediaItem == hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT && !creategraphicslayer2.MediaBrowserCompatMediaItem) {
                            int i33 = f > 0.0f ? (int) (((setalignment2.onRequestPermissionsResult[this.ParcelableVolumeInfo] * f3) / f) + 0.5f) : i30;
                            if (this.ParcelableVolumeInfo == 0) {
                                i12 = setalignment2.addOnPictureInPictureUiStateChangedListener;
                                i13 = setalignment2.addOnTrimMemoryListener;
                            } else {
                                i12 = setalignment2.addOnPictureInPictureModeChangedListener;
                                i13 = setalignment2.enterPictureInPictureMode;
                            }
                            int iMax = Math.max(i13, component50d7_kju2.MediaSessionCompatToken == 1 ? Math.min(i33, creategraphicslayer2.MediaSessionCompatResultReceiverWrapper) : i33);
                            if (i12 > 0) {
                                iMax = Math.min(i12, iMax);
                            }
                            if (iMax != i33) {
                                i29++;
                                i33 = iMax;
                            }
                            creategraphicslayer2.IconCompatParcelizer(i33);
                        }
                        i28++;
                        i27 = i30;
                        i6 = i31;
                        i26 = i32;
                        z2 = z4;
                        f3 = f3;
                        arrayList = arrayList5;
                    }
                    i7 = i26;
                    z = z2;
                    arrayList2 = arrayList;
                    int i34 = i6;
                    if (i29 > 0) {
                        i4 -= i29;
                        int i35 = 0;
                        int i36 = 0;
                        while (i36 < size) {
                            component50d7_KjU component50d7_kju3 = (component50d7_KjU) arrayList2.get(i36);
                            if (component50d7_kju3.MediaSessionCompatResultReceiverWrapper.onMultiWindowModeChanged == 8) {
                                i11 = i3;
                            } else {
                                i11 = i3;
                                if (i36 > 0 && i36 >= i11) {
                                    i35 += component50d7_kju3.PlaybackStateCompatCustomAction.write;
                                }
                                i35 += component50d7_kju3.MediaDescriptionCompat.PlaybackStateCompat;
                                if (i36 < i18 && i36 < i) {
                                    i35 += -component50d7_kju3.RemoteActionCompatParcelizer.write;
                                }
                            }
                            i36++;
                            i3 = i11;
                        }
                        i8 = i3;
                        i6 = i35;
                    } else {
                        i8 = i3;
                        i6 = i34;
                    }
                    i10 = 2;
                    if (this.read == 2 && i29 == 0) {
                        i9 = 0;
                        this.read = 0;
                    } else {
                        i9 = 0;
                    }
                } else {
                    i7 = i26;
                    z = z2;
                    arrayList2 = arrayList;
                    i8 = i3;
                    i9 = 0;
                    i10 = 2;
                }
                if (i6 > i16) {
                    this.read = i10;
                }
                if (i5 > 0 && i4 == 0 && i8 == i) {
                    this.read = i10;
                }
                int i37 = this.read;
                if (i37 == 1) {
                    int i38 = i5 > 1 ? (i16 - i6) / (i5 - 1) : i5 == 1 ? (i16 - i6) / 2 : i9;
                    if (i4 > 0) {
                        i38 = i9;
                    }
                    int i39 = i7;
                    for (int i40 = i9; i40 < size; i40++) {
                        component50d7_KjU component50d7_kju4 = (component50d7_KjU) arrayList2.get(z ? size - (i40 + 1) : i40);
                        setAlignment setalignment3 = component50d7_kju4.MediaSessionCompatResultReceiverWrapper;
                        releaseGraphicsLayer releasegraphicslayer3 = component50d7_kju4.RemoteActionCompatParcelizer;
                        releaseGraphicsLayer releasegraphicslayer4 = component50d7_kju4.PlaybackStateCompatCustomAction;
                        if (setalignment3.onMultiWindowModeChanged == 8) {
                            releasegraphicslayer4.IconCompatParcelizer(i39);
                            releasegraphicslayer3.IconCompatParcelizer(i39);
                        } else {
                            if (i40 > 0) {
                                i39 = z ? i39 - i38 : i39 + i38;
                            }
                            if (i40 > 0 && i40 >= i8) {
                                i39 = z ? i39 - releasegraphicslayer4.write : i39 + releasegraphicslayer4.write;
                            }
                            if (z) {
                                releasegraphicslayer3.IconCompatParcelizer(i39);
                            } else {
                                releasegraphicslayer4.IconCompatParcelizer(i39);
                            }
                            createGraphicsLayer creategraphicslayer3 = component50d7_kju4.MediaDescriptionCompat;
                            int i41 = creategraphicslayer3.PlaybackStateCompat;
                            if (component50d7_kju4.MediaBrowserCompatMediaItem == hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT && component50d7_kju4.MediaSessionCompatToken == 1) {
                                i41 = creategraphicslayer3.MediaSessionCompatResultReceiverWrapper;
                            }
                            i39 = z ? i39 - i41 : i39 + i41;
                            if (z) {
                                releasegraphicslayer4.IconCompatParcelizer(i39);
                            } else {
                                releasegraphicslayer3.IconCompatParcelizer(i39);
                            }
                            component50d7_kju4.MediaMetadataCompat = true;
                            if (i40 < i18 && i40 < i) {
                                i39 = z ? i39 - (-releasegraphicslayer3.write) : i39 + (-releasegraphicslayer3.write);
                            }
                        }
                    }
                    return;
                }
                if (i37 == 0) {
                    int i42 = (i16 - i6) / (i5 + 1);
                    if (i4 > 0) {
                        i42 = i9;
                    }
                    int i43 = i7;
                    for (int i44 = i9; i44 < size; i44++) {
                        component50d7_KjU component50d7_kju5 = (component50d7_KjU) arrayList2.get(z ? size - (i44 + 1) : i44);
                        setAlignment setalignment4 = component50d7_kju5.MediaSessionCompatResultReceiverWrapper;
                        releaseGraphicsLayer releasegraphicslayer5 = component50d7_kju5.RemoteActionCompatParcelizer;
                        releaseGraphicsLayer releasegraphicslayer6 = component50d7_kju5.PlaybackStateCompatCustomAction;
                        if (setalignment4.onMultiWindowModeChanged == 8) {
                            releasegraphicslayer6.IconCompatParcelizer(i43);
                            releasegraphicslayer5.IconCompatParcelizer(i43);
                        } else {
                            int i45 = z ? i43 - i42 : i43 + i42;
                            if (i44 > 0 && i44 >= i8) {
                                i45 = z ? i45 - releasegraphicslayer6.write : i45 + releasegraphicslayer6.write;
                            }
                            if (z) {
                                releasegraphicslayer5.IconCompatParcelizer(i45);
                            } else {
                                releasegraphicslayer6.IconCompatParcelizer(i45);
                            }
                            createGraphicsLayer creategraphicslayer4 = component50d7_kju5.MediaDescriptionCompat;
                            int iMin = creategraphicslayer4.PlaybackStateCompat;
                            if (component50d7_kju5.MediaBrowserCompatMediaItem == hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT && component50d7_kju5.MediaSessionCompatToken == 1) {
                                iMin = Math.min(iMin, creategraphicslayer4.MediaSessionCompatResultReceiverWrapper);
                            }
                            i43 = z ? i45 - iMin : i45 + iMin;
                            if (z) {
                                releasegraphicslayer6.IconCompatParcelizer(i43);
                            } else {
                                releasegraphicslayer5.IconCompatParcelizer(i43);
                            }
                            if (i44 < i18 && i44 < i) {
                                i43 = z ? i43 - (-releasegraphicslayer5.write) : i43 + (-releasegraphicslayer5.write);
                            }
                        }
                    }
                    return;
                }
                if (i37 == 2) {
                    int i46 = this.ParcelableVolumeInfo;
                    setAlignment setalignment5 = this.MediaSessionCompatResultReceiverWrapper;
                    float f4 = i46 == 0 ? setalignment5.fullyDrawnReporter_delegatelambda0 : setalignment5.onBackPressed;
                    if (z) {
                        f4 = 1.0f - f4;
                    }
                    int i47 = (int) (((i16 - i6) * f4) + 0.5f);
                    if (i47 < 0 || i4 > 0) {
                        i47 = i9;
                    }
                    int i48 = z ? i7 - i47 : i7 + i47;
                    for (int i49 = i9; i49 < size; i49++) {
                        component50d7_KjU component50d7_kju6 = (component50d7_KjU) arrayList2.get(z ? size - (i49 + 1) : i49);
                        setAlignment setalignment6 = component50d7_kju6.MediaSessionCompatResultReceiverWrapper;
                        releaseGraphicsLayer releasegraphicslayer7 = component50d7_kju6.RemoteActionCompatParcelizer;
                        releaseGraphicsLayer releasegraphicslayer8 = component50d7_kju6.PlaybackStateCompatCustomAction;
                        if (setalignment6.onMultiWindowModeChanged == 8) {
                            releasegraphicslayer8.IconCompatParcelizer(i48);
                            releasegraphicslayer7.IconCompatParcelizer(i48);
                        } else {
                            if (i49 > 0 && i49 >= i8) {
                                i48 = z ? i48 - releasegraphicslayer8.write : i48 + releasegraphicslayer8.write;
                            }
                            if (z) {
                                releasegraphicslayer7.IconCompatParcelizer(i48);
                            } else {
                                releasegraphicslayer8.IconCompatParcelizer(i48);
                            }
                            createGraphicsLayer creategraphicslayer5 = component50d7_kju6.MediaDescriptionCompat;
                            int i50 = creategraphicslayer5.PlaybackStateCompat;
                            if (component50d7_kju6.MediaBrowserCompatMediaItem == hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT && component50d7_kju6.MediaSessionCompatToken == 1) {
                                i50 = creategraphicslayer5.MediaSessionCompatResultReceiverWrapper;
                            }
                            i48 = z ? i48 - i50 : i48 + i50;
                            if (z) {
                                releasegraphicslayer8.IconCompatParcelizer(i48);
                            } else {
                                releasegraphicslayer7.IconCompatParcelizer(i48);
                            }
                            if (i49 < i18 && i49 < i) {
                                i48 = z ? i48 - (-releasegraphicslayer7.write) : i48 + (-releasegraphicslayer7.write);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // o.component50d7_KjU
    public final long MediaBrowserCompatMediaItem() {
        ArrayList arrayList = this.IconCompatParcelizer;
        int size = arrayList.size();
        long jMediaBrowserCompatMediaItem = 0;
        for (int i = 0; i < size; i++) {
            component50d7_KjU component50d7_kju = (component50d7_KjU) arrayList.get(i);
            jMediaBrowserCompatMediaItem = ((long) component50d7_kju.RemoteActionCompatParcelizer.write) + component50d7_kju.MediaBrowserCompatMediaItem() + jMediaBrowserCompatMediaItem + component50d7_kju.PlaybackStateCompatCustomAction.write;
        }
        return jMediaBrowserCompatMediaItem;
    }

    @Override // o.component50d7_KjU
    public final boolean MediaDescriptionCompat() {
        ArrayList arrayList = this.IconCompatParcelizer;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((component50d7_KjU) arrayList.get(i)).MediaDescriptionCompat()) {
                return false;
            }
        }
        return true;
    }

    @Override // o.component50d7_KjU
    public final void RemoteActionCompatParcelizer() {
        ArrayList arrayList = this.IconCompatParcelizer;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((component50d7_KjU) it.next()).RemoteActionCompatParcelizer();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        setAlignment setalignment = ((component50d7_KjU) arrayList.get(0)).MediaSessionCompatResultReceiverWrapper;
        setAlignment setalignment2 = ((component50d7_KjU) arrayList.get(size - 1)).MediaSessionCompatResultReceiverWrapper;
        int i = this.ParcelableVolumeInfo;
        releaseGraphicsLayer releasegraphicslayer = this.RemoteActionCompatParcelizer;
        releaseGraphicsLayer releasegraphicslayer2 = this.PlaybackStateCompatCustomAction;
        if (i == 0) {
            paintdefault paintdefaultVar = setalignment.onBackPressedDispatcher_delegatelambda010;
            paintdefault paintdefaultVar2 = setalignment2.invalidateMenu;
            releaseGraphicsLayer releasegraphicslayerIconCompatParcelizer = component50d7_KjU.IconCompatParcelizer(paintdefaultVar, 0);
            int iSerializer = paintdefaultVar.serializer();
            setAlignment setalignment3 = read();
            if (setalignment3 != null) {
                iSerializer = setalignment3.onBackPressedDispatcher_delegatelambda010.serializer();
            }
            if (releasegraphicslayerIconCompatParcelizer != null) {
                component50d7_KjU.serializer(releasegraphicslayer2, releasegraphicslayerIconCompatParcelizer, iSerializer);
            }
            releaseGraphicsLayer releasegraphicslayerIconCompatParcelizer2 = component50d7_KjU.IconCompatParcelizer(paintdefaultVar2, 0);
            int iSerializer2 = paintdefaultVar2.serializer();
            setAlignment setalignmentIconCompatParcelizer = IconCompatParcelizer();
            if (setalignmentIconCompatParcelizer != null) {
                iSerializer2 = setalignmentIconCompatParcelizer.invalidateMenu.serializer();
            }
            if (releasegraphicslayerIconCompatParcelizer2 != null) {
                component50d7_KjU.serializer(releasegraphicslayer, releasegraphicslayerIconCompatParcelizer2, -iSerializer2);
            }
        } else {
            paintdefault paintdefaultVar3 = setalignment.onActivityResult;
            paintdefault paintdefaultVar4 = setalignment2.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
            releaseGraphicsLayer releasegraphicslayerIconCompatParcelizer3 = component50d7_KjU.IconCompatParcelizer(paintdefaultVar3, 1);
            int iSerializer3 = paintdefaultVar3.serializer();
            setAlignment setalignment4 = read();
            if (setalignment4 != null) {
                iSerializer3 = setalignment4.onActivityResult.serializer();
            }
            if (releasegraphicslayerIconCompatParcelizer3 != null) {
                component50d7_KjU.serializer(releasegraphicslayer2, releasegraphicslayerIconCompatParcelizer3, iSerializer3);
            }
            releaseGraphicsLayer releasegraphicslayerIconCompatParcelizer4 = component50d7_KjU.IconCompatParcelizer(paintdefaultVar4, 1);
            int iSerializer4 = paintdefaultVar4.serializer();
            setAlignment setalignmentIconCompatParcelizer2 = IconCompatParcelizer();
            if (setalignmentIconCompatParcelizer2 != null) {
                iSerializer4 = setalignmentIconCompatParcelizer2.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.serializer();
            }
            if (releasegraphicslayerIconCompatParcelizer4 != null) {
                component50d7_KjU.serializer(releasegraphicslayer, releasegraphicslayerIconCompatParcelizer4, -iSerializer4);
            }
        }
        releasegraphicslayer2.MediaSessionCompatToken = this;
        releasegraphicslayer.MediaSessionCompatToken = this;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ChainRun ");
        if (this.ParcelableVolumeInfo == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb.append(str);
        for (component50d7_KjU component50d7_kju : this.IconCompatParcelizer) {
            sb.append("<");
            sb.append(component50d7_kju);
            sb.append("> ");
        }
        return sb.toString();
    }

    public ScaleKt(setAlignment setalignment, int i) {
        setAlignment setalignment2;
        super(setalignment);
        ArrayList<component50d7_KjU> arrayList = new ArrayList();
        this.IconCompatParcelizer = arrayList;
        this.ParcelableVolumeInfo = i;
        setAlignment setalignment3 = this.MediaSessionCompatResultReceiverWrapper;
        setAlignment setalignmentSerializer = setalignment3.serializer(i);
        while (true) {
            setalignment2 = setalignment3;
            setalignment3 = setalignmentSerializer;
            if (setalignment3 == null) {
                break;
            } else {
                setalignmentSerializer = setalignment3.serializer(this.ParcelableVolumeInfo);
            }
        }
        this.MediaSessionCompatResultReceiverWrapper = setalignment2;
        int i2 = this.ParcelableVolumeInfo;
        arrayList.add(i2 == 0 ? setalignment2.getOnBackPressedInput : i2 == 1 ? setalignment2.onCreatePanelMenu : null);
        setAlignment setalignmentWrite = setalignment2.write(this.ParcelableVolumeInfo);
        while (setalignmentWrite != null) {
            int i3 = this.ParcelableVolumeInfo;
            arrayList.add(i3 == 0 ? setalignmentWrite.getOnBackPressedInput : i3 == 1 ? setalignmentWrite.onCreatePanelMenu : null);
            setalignmentWrite = setalignmentWrite.write(this.ParcelableVolumeInfo);
        }
        for (component50d7_KjU component50d7_kju : arrayList) {
            int i4 = this.ParcelableVolumeInfo;
            if (i4 == 0) {
                component50d7_kju.MediaSessionCompatResultReceiverWrapper.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = this;
            } else if (i4 == 1) {
                component50d7_kju.MediaSessionCompatResultReceiverWrapper.onTrimMemory = this;
            }
        }
        if (this.ParcelableVolumeInfo == 0 && this.MediaSessionCompatResultReceiverWrapper.getViewModelStore.RatingCompat && arrayList.size() > 1) {
            this.MediaSessionCompatResultReceiverWrapper = ((component50d7_KjU) af$$ExternalSyntheticOutline0.m(1, arrayList)).MediaSessionCompatResultReceiverWrapper;
        }
        int i5 = this.ParcelableVolumeInfo;
        setAlignment setalignment4 = this.MediaSessionCompatResultReceiverWrapper;
        this.read = i5 == 0 ? setalignment4.menuHostHelperlambda0 : setalignment4.onCreate;
    }
}
