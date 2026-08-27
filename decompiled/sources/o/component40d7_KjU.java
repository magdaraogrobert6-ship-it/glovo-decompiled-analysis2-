package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class component40d7_KjU extends component50d7_KjU {
    public static final int[] write = new int[2];

    public final void read() {
        this.MediaMetadataCompat = false;
        releaseGraphicsLayer releasegraphicslayer = this.PlaybackStateCompatCustomAction;
        releasegraphicslayer.read();
        releasegraphicslayer.MediaBrowserCompatMediaItem = false;
        releaseGraphicsLayer releasegraphicslayer2 = this.RemoteActionCompatParcelizer;
        releasegraphicslayer2.read();
        releasegraphicslayer2.MediaBrowserCompatMediaItem = false;
        this.MediaDescriptionCompat.MediaBrowserCompatMediaItem = false;
    }

    @Override // o.component50d7_KjU
    public final void write() {
        this.MediaSessionCompatQueueItem = null;
        this.PlaybackStateCompatCustomAction.read();
        this.RemoteActionCompatParcelizer.read();
        this.MediaDescriptionCompat.read();
        this.MediaMetadataCompat = false;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0290  */
    /* JADX WARN: Code duplicated, block: B:121:0x02a3  */
    @Override // o.releaseGraphicsLayers
    public final void IconCompatParcelizer(releaseGraphicsLayers releasegraphicslayers) {
        float f;
        int i;
        int i2;
        int i3;
        float f2;
        float f3;
        float f4;
        int i4;
        if (copygNMxBKIdefault.IconCompatParcelizer[this.RatingCompat.ordinal()] == 3) {
            setAlignment setalignment = this.MediaSessionCompatResultReceiverWrapper;
            read(setalignment.onBackPressedDispatcher_delegatelambda010, setalignment.invalidateMenu, 0);
            return;
        }
        createGraphicsLayer creategraphicslayer = this.MediaDescriptionCompat;
        boolean z = creategraphicslayer.MediaBrowserCompatMediaItem;
        releaseGraphicsLayer releasegraphicslayer = this.PlaybackStateCompatCustomAction;
        releaseGraphicsLayer releasegraphicslayer2 = this.RemoteActionCompatParcelizer;
        if (!z && this.MediaBrowserCompatMediaItem == hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT) {
            setAlignment setalignment2 = this.MediaSessionCompatResultReceiverWrapper;
            int i5 = setalignment2.addOnConfigurationChangedListener;
            if (i5 == 2) {
                getUseIntrinsicSize getuseintrinsicsize = setalignment2.getViewModelStore;
                if (getuseintrinsicsize != null) {
                    createGraphicsLayer creategraphicslayer2 = getuseintrinsicsize.getOnBackPressedInput.MediaDescriptionCompat;
                    if (creategraphicslayer2.MediaBrowserCompatMediaItem) {
                        creategraphicslayer.IconCompatParcelizer((int) ((creategraphicslayer2.PlaybackStateCompat * setalignment2.getLastCustomNonConfigurationInstance) + 0.5f));
                    }
                }
            } else if (i5 == 3) {
                int i6 = setalignment2.addMenuProvider;
                if (i6 == 0 || i6 == 3) {
                    copygNMxBKI copygnmxbki = setalignment2.onCreatePanelMenu;
                    releaseGraphicsLayer releasegraphicslayer3 = copygnmxbki.PlaybackStateCompatCustomAction;
                    releaseGraphicsLayer releasegraphicslayer4 = copygnmxbki.RemoteActionCompatParcelizer;
                    boolean z2 = setalignment2.onBackPressedDispatcher_delegatelambda010.MediaSessionCompatQueueItem != null;
                    boolean z3 = setalignment2.onActivityResult.MediaSessionCompatQueueItem != null;
                    boolean z4 = setalignment2.invalidateMenu.MediaSessionCompatQueueItem != null;
                    boolean z5 = setalignment2.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.MediaSessionCompatQueueItem != null;
                    int i7 = setalignment2.defaultViewModelProviderFactory_delegatelambda0;
                    if (z2 && z3 && z4 && z5) {
                        float f5 = setalignment2.createFullyDrawnExecutor;
                        boolean z6 = releasegraphicslayer3.MediaBrowserCompatMediaItem;
                        ArrayList arrayList = releasegraphicslayer3.MediaMetadataCompat;
                        int[] iArr = write;
                        if (z6 && releasegraphicslayer4.MediaBrowserCompatMediaItem) {
                            if (releasegraphicslayer.MediaDescriptionCompat && releasegraphicslayer2.MediaDescriptionCompat) {
                                RemoteActionCompatParcelizer(iArr, ((releaseGraphicsLayer) releasegraphicslayer.MediaMetadataCompat.get(0)).PlaybackStateCompat + releasegraphicslayer.write, ((releaseGraphicsLayer) releasegraphicslayer2.MediaMetadataCompat.get(0)).PlaybackStateCompat - releasegraphicslayer2.write, releasegraphicslayer3.PlaybackStateCompat + releasegraphicslayer3.write, releasegraphicslayer4.PlaybackStateCompat - releasegraphicslayer4.write, f5, i7);
                                creategraphicslayer.IconCompatParcelizer(iArr[0]);
                                this.MediaSessionCompatResultReceiverWrapper.onCreatePanelMenu.MediaDescriptionCompat.IconCompatParcelizer(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (releasegraphicslayer.MediaBrowserCompatMediaItem && releasegraphicslayer2.MediaBrowserCompatMediaItem) {
                            if (!releasegraphicslayer3.MediaDescriptionCompat || !releasegraphicslayer4.MediaDescriptionCompat) {
                                return;
                            }
                            RemoteActionCompatParcelizer(iArr, releasegraphicslayer.PlaybackStateCompat + releasegraphicslayer.write, releasegraphicslayer2.PlaybackStateCompat - releasegraphicslayer2.write, ((releaseGraphicsLayer) arrayList.get(0)).PlaybackStateCompat + releasegraphicslayer3.write, ((releaseGraphicsLayer) releasegraphicslayer4.MediaMetadataCompat.get(0)).PlaybackStateCompat - releasegraphicslayer4.write, f5, i7);
                            creategraphicslayer.IconCompatParcelizer(iArr[0]);
                            this.MediaSessionCompatResultReceiverWrapper.onCreatePanelMenu.MediaDescriptionCompat.IconCompatParcelizer(iArr[1]);
                        }
                        if (!releasegraphicslayer.MediaDescriptionCompat || !releasegraphicslayer2.MediaDescriptionCompat || !releasegraphicslayer3.MediaDescriptionCompat || !releasegraphicslayer4.MediaDescriptionCompat) {
                            return;
                        }
                        RemoteActionCompatParcelizer(iArr, ((releaseGraphicsLayer) releasegraphicslayer.MediaMetadataCompat.get(0)).PlaybackStateCompat + releasegraphicslayer.write, ((releaseGraphicsLayer) releasegraphicslayer2.MediaMetadataCompat.get(0)).PlaybackStateCompat - releasegraphicslayer2.write, ((releaseGraphicsLayer) arrayList.get(0)).PlaybackStateCompat + releasegraphicslayer3.write, ((releaseGraphicsLayer) releasegraphicslayer4.MediaMetadataCompat.get(0)).PlaybackStateCompat - releasegraphicslayer4.write, f5, i7);
                        creategraphicslayer.IconCompatParcelizer(iArr[0]);
                        this.MediaSessionCompatResultReceiverWrapper.onCreatePanelMenu.MediaDescriptionCompat.IconCompatParcelizer(iArr[1]);
                    } else if (z2 && z4) {
                        if (!releasegraphicslayer.MediaDescriptionCompat || !releasegraphicslayer2.MediaDescriptionCompat) {
                            return;
                        }
                        float f6 = setalignment2.createFullyDrawnExecutor;
                        int i8 = ((releaseGraphicsLayer) releasegraphicslayer.MediaMetadataCompat.get(0)).PlaybackStateCompat + releasegraphicslayer.write;
                        int i9 = ((releaseGraphicsLayer) releasegraphicslayer2.MediaMetadataCompat.get(0)).PlaybackStateCompat - releasegraphicslayer2.write;
                        if (i7 == -1 || i7 == 0) {
                            int i10 = read(i9 - i8, 0);
                            int i11 = (int) ((i10 * f6) + 0.5f);
                            int i12 = read(i11, 1);
                            if (i11 != i12) {
                                i10 = (int) ((i12 / f6) + 0.5f);
                            }
                            creategraphicslayer.IconCompatParcelizer(i10);
                            this.MediaSessionCompatResultReceiverWrapper.onCreatePanelMenu.MediaDescriptionCompat.IconCompatParcelizer(i12);
                        } else if (i7 == 1) {
                            int i13 = read(i9 - i8, 0);
                            int i14 = (int) ((i13 / f6) + 0.5f);
                            int i15 = read(i14, 1);
                            if (i14 != i15) {
                                i13 = (int) ((i15 * f6) + 0.5f);
                            }
                            creategraphicslayer.IconCompatParcelizer(i13);
                            this.MediaSessionCompatResultReceiverWrapper.onCreatePanelMenu.MediaDescriptionCompat.IconCompatParcelizer(i15);
                        }
                    } else if (z3 && z5) {
                        if (!releasegraphicslayer3.MediaDescriptionCompat || !releasegraphicslayer4.MediaDescriptionCompat) {
                            return;
                        }
                        float f7 = setalignment2.createFullyDrawnExecutor;
                        int i16 = ((releaseGraphicsLayer) releasegraphicslayer3.MediaMetadataCompat.get(0)).PlaybackStateCompat + releasegraphicslayer3.write;
                        int i17 = ((releaseGraphicsLayer) releasegraphicslayer4.MediaMetadataCompat.get(0)).PlaybackStateCompat - releasegraphicslayer4.write;
                        if (i7 == -1) {
                            i = read(i17 - i16, 1);
                            i2 = (int) ((i / f7) + 0.5f);
                            i3 = read(i2, 0);
                            if (i2 != i3) {
                                i = (int) ((i3 * f7) + 0.5f);
                            }
                            creategraphicslayer.IconCompatParcelizer(i3);
                            this.MediaSessionCompatResultReceiverWrapper.onCreatePanelMenu.MediaDescriptionCompat.IconCompatParcelizer(i);
                        } else if (i7 == 0) {
                            int i18 = read(i17 - i16, 1);
                            int i19 = (int) ((i18 * f7) + 0.5f);
                            int i20 = read(i19, 0);
                            if (i19 != i20) {
                                i18 = (int) ((i20 / f7) + 0.5f);
                            }
                            creategraphicslayer.IconCompatParcelizer(i20);
                            this.MediaSessionCompatResultReceiverWrapper.onCreatePanelMenu.MediaDescriptionCompat.IconCompatParcelizer(i18);
                        } else if (i7 == 1) {
                            i = read(i17 - i16, 1);
                            i2 = (int) ((i / f7) + 0.5f);
                            i3 = read(i2, 0);
                            if (i2 != i3) {
                                i = (int) ((i3 * f7) + 0.5f);
                            }
                            creategraphicslayer.IconCompatParcelizer(i3);
                            this.MediaSessionCompatResultReceiverWrapper.onCreatePanelMenu.MediaDescriptionCompat.IconCompatParcelizer(i);
                        }
                    }
                } else {
                    int i21 = setalignment2.defaultViewModelProviderFactory_delegatelambda0;
                    if (i21 != -1) {
                        if (i21 == 0) {
                            f4 = setalignment2.onCreatePanelMenu.MediaDescriptionCompat.PlaybackStateCompat / setalignment2.createFullyDrawnExecutor;
                            i4 = (int) (f4 + 0.5f);
                        } else if (i21 != 1) {
                            i4 = 0;
                        } else {
                            f2 = setalignment2.onCreatePanelMenu.MediaDescriptionCompat.PlaybackStateCompat;
                            f3 = setalignment2.createFullyDrawnExecutor;
                        }
                        creategraphicslayer.IconCompatParcelizer(i4);
                    } else {
                        f2 = setalignment2.onCreatePanelMenu.MediaDescriptionCompat.PlaybackStateCompat;
                        f3 = setalignment2.createFullyDrawnExecutor;
                    }
                    f4 = f2 * f3;
                    i4 = (int) (f4 + 0.5f);
                    creategraphicslayer.IconCompatParcelizer(i4);
                }
            }
        }
        boolean z7 = releasegraphicslayer.MediaDescriptionCompat;
        ArrayList arrayList2 = releasegraphicslayer.MediaMetadataCompat;
        if (z7) {
            boolean z8 = releasegraphicslayer2.MediaDescriptionCompat;
            ArrayList arrayList3 = releasegraphicslayer2.MediaMetadataCompat;
            if (z8) {
                if (releasegraphicslayer.MediaBrowserCompatMediaItem && releasegraphicslayer2.MediaBrowserCompatMediaItem && creategraphicslayer.MediaBrowserCompatMediaItem) {
                    return;
                }
                if (!creategraphicslayer.MediaBrowserCompatMediaItem && this.MediaBrowserCompatMediaItem == hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT) {
                    setAlignment setalignment3 = this.MediaSessionCompatResultReceiverWrapper;
                    if (setalignment3.addOnConfigurationChangedListener == 0 && !setalignment3.ParcelableVolumeInfo()) {
                        releaseGraphicsLayer releasegraphicslayer5 = (releaseGraphicsLayer) arrayList2.get(0);
                        releaseGraphicsLayer releasegraphicslayer6 = (releaseGraphicsLayer) arrayList3.get(0);
                        int i22 = releasegraphicslayer5.PlaybackStateCompat + releasegraphicslayer.write;
                        int i23 = releasegraphicslayer6.PlaybackStateCompat + releasegraphicslayer2.write;
                        releasegraphicslayer.IconCompatParcelizer(i22);
                        releasegraphicslayer2.IconCompatParcelizer(i23);
                        creategraphicslayer.IconCompatParcelizer(i23 - i22);
                        return;
                    }
                }
                if (!creategraphicslayer.MediaBrowserCompatMediaItem && this.MediaBrowserCompatMediaItem == hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT && this.MediaSessionCompatToken == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((releaseGraphicsLayer) arrayList3.get(0)).PlaybackStateCompat + releasegraphicslayer2.write) - (((releaseGraphicsLayer) arrayList2.get(0)).PlaybackStateCompat + releasegraphicslayer.write), creategraphicslayer.MediaSessionCompatResultReceiverWrapper);
                    setAlignment setalignment4 = this.MediaSessionCompatResultReceiverWrapper;
                    int i24 = setalignment4.addOnPictureInPictureUiStateChangedListener;
                    int iMax = Math.max(setalignment4.addOnTrimMemoryListener, iMin);
                    if (i24 > 0) {
                        iMax = Math.min(i24, iMax);
                    }
                    creategraphicslayer.IconCompatParcelizer(iMax);
                }
                if (creategraphicslayer.MediaBrowserCompatMediaItem) {
                    releaseGraphicsLayer releasegraphicslayer7 = (releaseGraphicsLayer) arrayList2.get(0);
                    releaseGraphicsLayer releasegraphicslayer8 = (releaseGraphicsLayer) arrayList3.get(0);
                    int i25 = releasegraphicslayer7.PlaybackStateCompat;
                    int i26 = releasegraphicslayer.write;
                    int i27 = releasegraphicslayer8.PlaybackStateCompat;
                    int i28 = releasegraphicslayer2.write;
                    float f8 = this.MediaSessionCompatResultReceiverWrapper.fullyDrawnReporter_delegatelambda0;
                    if (releasegraphicslayer7 == releasegraphicslayer8) {
                        f = 0.5f;
                    } else {
                        i25 += i26;
                        i27 += i28;
                        f = f8;
                    }
                    releasegraphicslayer.IconCompatParcelizer((int) ((((i27 - i25) - creategraphicslayer.PlaybackStateCompat) * f) + i25 + 0.5f));
                    releasegraphicslayer2.IconCompatParcelizer(releasegraphicslayer.PlaybackStateCompat + creategraphicslayer.PlaybackStateCompat);
                }
            }
        }
    }

    @Override // o.component50d7_KjU
    public final boolean MediaDescriptionCompat() {
        return this.MediaBrowserCompatMediaItem != hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT || this.MediaSessionCompatResultReceiverWrapper.addOnConfigurationChangedListener == 0;
    }

    @Override // o.component50d7_KjU
    public final void RemoteActionCompatParcelizer() {
        setAlignment setalignment;
        getUseIntrinsicSize getuseintrinsicsize;
        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk;
        getUseIntrinsicSize getuseintrinsicsize2;
        getUseIntrinsicSize getuseintrinsicsize3;
        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk2;
        setAlignment setalignment2 = this.MediaSessionCompatResultReceiverWrapper;
        boolean z = setalignment2.onUserLeaveHint;
        createGraphicsLayer creategraphicslayer = this.MediaDescriptionCompat;
        if (z) {
            creategraphicslayer.IconCompatParcelizer(setalignment2.MediaSessionCompatQueueItem());
        }
        boolean z2 = creategraphicslayer.MediaBrowserCompatMediaItem;
        ArrayList arrayList = creategraphicslayer.RemoteActionCompatParcelizer;
        ArrayList arrayList2 = creategraphicslayer.MediaMetadataCompat;
        releaseGraphicsLayer releasegraphicslayer = this.RemoteActionCompatParcelizer;
        releaseGraphicsLayer releasegraphicslayer2 = this.PlaybackStateCompatCustomAction;
        if (z2) {
            hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk3 = this.MediaBrowserCompatMediaItem;
            hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk4 = hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_PARENT;
            if (hasspecifiedandfiniteheightuvyycjk3 == hasspecifiedandfiniteheightuvyycjk4 && (getuseintrinsicsize = (setalignment = this.MediaSessionCompatResultReceiverWrapper).getViewModelStore) != null && ((hasspecifiedandfiniteheightuvyycjk = getuseintrinsicsize.addOnNewIntentListener[0]) == hasSpecifiedAndFiniteHeightuvyYCjk.FIXED || hasspecifiedandfiniteheightuvyycjk == hasspecifiedandfiniteheightuvyycjk4)) {
                component50d7_KjU.serializer(releasegraphicslayer2, getuseintrinsicsize.getOnBackPressedInput.PlaybackStateCompatCustomAction, setalignment.onBackPressedDispatcher_delegatelambda010.serializer());
                component50d7_KjU.serializer(releasegraphicslayer, getuseintrinsicsize.getOnBackPressedInput.RemoteActionCompatParcelizer, -this.MediaSessionCompatResultReceiverWrapper.invalidateMenu.serializer());
                return;
            }
        } else {
            setAlignment setalignment3 = this.MediaSessionCompatResultReceiverWrapper;
            hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk5 = setalignment3.addOnNewIntentListener[0];
            this.MediaBrowserCompatMediaItem = hasspecifiedandfiniteheightuvyycjk5;
            if (hasspecifiedandfiniteheightuvyycjk5 != hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT) {
                hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk6 = hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_PARENT;
                if (hasspecifiedandfiniteheightuvyycjk5 == hasspecifiedandfiniteheightuvyycjk6 && (getuseintrinsicsize3 = setalignment3.getViewModelStore) != null && ((hasspecifiedandfiniteheightuvyycjk2 = getuseintrinsicsize3.addOnNewIntentListener[0]) == hasSpecifiedAndFiniteHeightuvyYCjk.FIXED || hasspecifiedandfiniteheightuvyycjk2 == hasspecifiedandfiniteheightuvyycjk6)) {
                    int iMediaSessionCompatQueueItem = getuseintrinsicsize3.MediaSessionCompatQueueItem();
                    int iSerializer = this.MediaSessionCompatResultReceiverWrapper.onBackPressedDispatcher_delegatelambda010.serializer();
                    int iSerializer2 = this.MediaSessionCompatResultReceiverWrapper.invalidateMenu.serializer();
                    component50d7_KjU.serializer(releasegraphicslayer2, getuseintrinsicsize3.getOnBackPressedInput.PlaybackStateCompatCustomAction, this.MediaSessionCompatResultReceiverWrapper.onBackPressedDispatcher_delegatelambda010.serializer());
                    component50d7_KjU.serializer(releasegraphicslayer, getuseintrinsicsize3.getOnBackPressedInput.RemoteActionCompatParcelizer, -this.MediaSessionCompatResultReceiverWrapper.invalidateMenu.serializer());
                    creategraphicslayer.IconCompatParcelizer((iMediaSessionCompatQueueItem - iSerializer) - iSerializer2);
                    return;
                }
                if (hasspecifiedandfiniteheightuvyycjk5 == hasSpecifiedAndFiniteHeightuvyYCjk.FIXED) {
                    creategraphicslayer.IconCompatParcelizer(setalignment3.MediaSessionCompatQueueItem());
                }
            }
        }
        if (creategraphicslayer.MediaBrowserCompatMediaItem) {
            setAlignment setalignment4 = this.MediaSessionCompatResultReceiverWrapper;
            if (setalignment4.onUserLeaveHint) {
                paintdefault[] paintdefaultVarArr = setalignment4.addOnMultiWindowModeChangedListener;
                paintdefault paintdefaultVar = paintdefaultVarArr[0];
                paintdefault paintdefaultVar2 = paintdefaultVar.MediaSessionCompatQueueItem;
                if (paintdefaultVar2 != null && paintdefaultVarArr[1].MediaSessionCompatQueueItem != null) {
                    boolean zParcelableVolumeInfo = setalignment4.ParcelableVolumeInfo();
                    setAlignment setalignment5 = this.MediaSessionCompatResultReceiverWrapper;
                    if (zParcelableVolumeInfo) {
                        releasegraphicslayer2.write = setalignment5.addOnMultiWindowModeChangedListener[0].serializer();
                        releasegraphicslayer.write = -this.MediaSessionCompatResultReceiverWrapper.addOnMultiWindowModeChangedListener[1].serializer();
                        return;
                    }
                    releaseGraphicsLayer releasegraphicslayerWrite = component50d7_KjU.write(setalignment5.addOnMultiWindowModeChangedListener[0]);
                    if (releasegraphicslayerWrite != null) {
                        component50d7_KjU.serializer(releasegraphicslayer2, releasegraphicslayerWrite, this.MediaSessionCompatResultReceiverWrapper.addOnMultiWindowModeChangedListener[0].serializer());
                    }
                    releaseGraphicsLayer releasegraphicslayerWrite2 = component50d7_KjU.write(this.MediaSessionCompatResultReceiverWrapper.addOnMultiWindowModeChangedListener[1]);
                    if (releasegraphicslayerWrite2 != null) {
                        component50d7_KjU.serializer(releasegraphicslayer, releasegraphicslayerWrite2, -this.MediaSessionCompatResultReceiverWrapper.addOnMultiWindowModeChangedListener[1].serializer());
                    }
                    releasegraphicslayer2.IconCompatParcelizer = true;
                    releasegraphicslayer.IconCompatParcelizer = true;
                    return;
                }
                if (paintdefaultVar2 != null) {
                    releaseGraphicsLayer releasegraphicslayerWrite3 = component50d7_KjU.write(paintdefaultVar);
                    if (releasegraphicslayerWrite3 != null) {
                        component50d7_KjU.serializer(releasegraphicslayer2, releasegraphicslayerWrite3, this.MediaSessionCompatResultReceiverWrapper.addOnMultiWindowModeChangedListener[0].serializer());
                        component50d7_KjU.serializer(releasegraphicslayer, releasegraphicslayer2, creategraphicslayer.PlaybackStateCompat);
                        return;
                    }
                    return;
                }
                paintdefault paintdefaultVar3 = paintdefaultVarArr[1];
                if (paintdefaultVar3.MediaSessionCompatQueueItem != null) {
                    releaseGraphicsLayer releasegraphicslayerWrite4 = component50d7_KjU.write(paintdefaultVar3);
                    if (releasegraphicslayerWrite4 != null) {
                        component50d7_KjU.serializer(releasegraphicslayer, releasegraphicslayerWrite4, -this.MediaSessionCompatResultReceiverWrapper.addOnMultiWindowModeChangedListener[1].serializer());
                        component50d7_KjU.serializer(releasegraphicslayer2, releasegraphicslayer, -creategraphicslayer.PlaybackStateCompat);
                        return;
                    }
                    return;
                }
                if ((setalignment4 instanceof setPainter) || setalignment4.getViewModelStore == null || setalignment4.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.CENTER).MediaSessionCompatQueueItem != null) {
                    return;
                }
                setAlignment setalignment6 = this.MediaSessionCompatResultReceiverWrapper;
                component50d7_KjU.serializer(releasegraphicslayer2, setalignment6.getViewModelStore.getOnBackPressedInput.PlaybackStateCompatCustomAction, setalignment6.RatingCompat());
                component50d7_KjU.serializer(releasegraphicslayer, releasegraphicslayer2, creategraphicslayer.PlaybackStateCompat);
                return;
            }
        }
        if (this.MediaBrowserCompatMediaItem == hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT) {
            setAlignment setalignment7 = this.MediaSessionCompatResultReceiverWrapper;
            int i = setalignment7.addOnConfigurationChangedListener;
            if (i == 2) {
                getUseIntrinsicSize getuseintrinsicsize4 = setalignment7.getViewModelStore;
                if (getuseintrinsicsize4 != null) {
                    createGraphicsLayer creategraphicslayer2 = getuseintrinsicsize4.onCreatePanelMenu.MediaDescriptionCompat;
                    arrayList2.add(creategraphicslayer2);
                    creategraphicslayer2.RemoteActionCompatParcelizer.add(creategraphicslayer);
                    creategraphicslayer.IconCompatParcelizer = true;
                    arrayList.add(releasegraphicslayer2);
                    arrayList.add(releasegraphicslayer);
                }
            } else if (i == 3) {
                if (setalignment7.addMenuProvider == 3) {
                    releasegraphicslayer2.MediaSessionCompatToken = this;
                    releasegraphicslayer.MediaSessionCompatToken = this;
                    copygNMxBKI copygnmxbki = setalignment7.onCreatePanelMenu;
                    copygnmxbki.PlaybackStateCompatCustomAction.MediaSessionCompatToken = this;
                    copygnmxbki.RemoteActionCompatParcelizer.MediaSessionCompatToken = this;
                    creategraphicslayer.MediaSessionCompatToken = this;
                    if (setalignment7.PlaybackStateCompatCustomAction()) {
                        arrayList2.add(this.MediaSessionCompatResultReceiverWrapper.onCreatePanelMenu.MediaDescriptionCompat);
                        this.MediaSessionCompatResultReceiverWrapper.onCreatePanelMenu.MediaDescriptionCompat.RemoteActionCompatParcelizer.add(creategraphicslayer);
                        copygNMxBKI copygnmxbki2 = this.MediaSessionCompatResultReceiverWrapper.onCreatePanelMenu;
                        copygnmxbki2.MediaDescriptionCompat.MediaSessionCompatToken = this;
                        arrayList2.add(copygnmxbki2.PlaybackStateCompatCustomAction);
                        arrayList2.add(this.MediaSessionCompatResultReceiverWrapper.onCreatePanelMenu.RemoteActionCompatParcelizer);
                        this.MediaSessionCompatResultReceiverWrapper.onCreatePanelMenu.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer.add(creategraphicslayer);
                        this.MediaSessionCompatResultReceiverWrapper.onCreatePanelMenu.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.add(creategraphicslayer);
                    } else {
                        boolean zParcelableVolumeInfo2 = this.MediaSessionCompatResultReceiverWrapper.ParcelableVolumeInfo();
                        setAlignment setalignment8 = this.MediaSessionCompatResultReceiverWrapper;
                        if (zParcelableVolumeInfo2) {
                            setalignment8.onCreatePanelMenu.MediaDescriptionCompat.MediaMetadataCompat.add(creategraphicslayer);
                            arrayList.add(this.MediaSessionCompatResultReceiverWrapper.onCreatePanelMenu.MediaDescriptionCompat);
                        } else {
                            setalignment8.onCreatePanelMenu.MediaDescriptionCompat.MediaMetadataCompat.add(creategraphicslayer);
                        }
                    }
                } else {
                    createGraphicsLayer creategraphicslayer3 = setalignment7.onCreatePanelMenu.MediaDescriptionCompat;
                    arrayList2.add(creategraphicslayer3);
                    creategraphicslayer3.RemoteActionCompatParcelizer.add(creategraphicslayer);
                    this.MediaSessionCompatResultReceiverWrapper.onCreatePanelMenu.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer.add(creategraphicslayer);
                    this.MediaSessionCompatResultReceiverWrapper.onCreatePanelMenu.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.add(creategraphicslayer);
                    creategraphicslayer.IconCompatParcelizer = true;
                    arrayList.add(releasegraphicslayer2);
                    arrayList.add(releasegraphicslayer);
                    releasegraphicslayer2.MediaMetadataCompat.add(creategraphicslayer);
                    releasegraphicslayer.MediaMetadataCompat.add(creategraphicslayer);
                }
            }
        }
        setAlignment setalignment9 = this.MediaSessionCompatResultReceiverWrapper;
        paintdefault[] paintdefaultVarArr2 = setalignment9.addOnMultiWindowModeChangedListener;
        paintdefault paintdefaultVar4 = paintdefaultVarArr2[0];
        paintdefault paintdefaultVar5 = paintdefaultVar4.MediaSessionCompatQueueItem;
        if (paintdefaultVar5 != null && paintdefaultVarArr2[1].MediaSessionCompatQueueItem != null) {
            boolean zParcelableVolumeInfo3 = setalignment9.ParcelableVolumeInfo();
            setAlignment setalignment10 = this.MediaSessionCompatResultReceiverWrapper;
            if (zParcelableVolumeInfo3) {
                releasegraphicslayer2.write = setalignment10.addOnMultiWindowModeChangedListener[0].serializer();
                releasegraphicslayer.write = -this.MediaSessionCompatResultReceiverWrapper.addOnMultiWindowModeChangedListener[1].serializer();
                return;
            }
            releaseGraphicsLayer releasegraphicslayerWrite5 = component50d7_KjU.write(setalignment10.addOnMultiWindowModeChangedListener[0]);
            releaseGraphicsLayer releasegraphicslayerWrite6 = component50d7_KjU.write(this.MediaSessionCompatResultReceiverWrapper.addOnMultiWindowModeChangedListener[1]);
            if (releasegraphicslayerWrite5 != null) {
                releasegraphicslayerWrite5.read(this);
            }
            if (releasegraphicslayerWrite6 != null) {
                releasegraphicslayerWrite6.read(this);
            }
            this.RatingCompat = ShadowGraphicsLayerElementcreateBlock1.CENTER;
            return;
        }
        if (paintdefaultVar5 != null) {
            releaseGraphicsLayer releasegraphicslayerWrite7 = component50d7_KjU.write(paintdefaultVar4);
            if (releasegraphicslayerWrite7 != null) {
                component50d7_KjU.serializer(releasegraphicslayer2, releasegraphicslayerWrite7, this.MediaSessionCompatResultReceiverWrapper.addOnMultiWindowModeChangedListener[0].serializer());
                IconCompatParcelizer(releasegraphicslayer, releasegraphicslayer2, 1, creategraphicslayer);
                return;
            }
            return;
        }
        paintdefault paintdefaultVar6 = paintdefaultVarArr2[1];
        if (paintdefaultVar6.MediaSessionCompatQueueItem != null) {
            releaseGraphicsLayer releasegraphicslayerWrite8 = component50d7_KjU.write(paintdefaultVar6);
            if (releasegraphicslayerWrite8 != null) {
                component50d7_KjU.serializer(releasegraphicslayer, releasegraphicslayerWrite8, -this.MediaSessionCompatResultReceiverWrapper.addOnMultiWindowModeChangedListener[1].serializer());
                IconCompatParcelizer(releasegraphicslayer2, releasegraphicslayer, -1, creategraphicslayer);
                return;
            }
            return;
        }
        if ((setalignment9 instanceof setPainter) || (getuseintrinsicsize2 = setalignment9.getViewModelStore) == null) {
            return;
        }
        component50d7_KjU.serializer(releasegraphicslayer2, getuseintrinsicsize2.getOnBackPressedInput.PlaybackStateCompatCustomAction, setalignment9.RatingCompat());
        IconCompatParcelizer(releasegraphicslayer, releasegraphicslayer2, 1, creategraphicslayer);
    }

    @Override // o.component50d7_KjU
    public final void serializer() {
        releaseGraphicsLayer releasegraphicslayer = this.PlaybackStateCompatCustomAction;
        if (releasegraphicslayer.MediaBrowserCompatMediaItem) {
            this.MediaSessionCompatResultReceiverWrapper.onPictureInPictureModeChanged = releasegraphicslayer.PlaybackStateCompat;
        }
    }

    public final String toString() {
        return "HorizontalRun " + this.MediaSessionCompatResultReceiverWrapper.accessensureViewModelStore;
    }

    public static void RemoteActionCompatParcelizer(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    public component40d7_KjU(setAlignment setalignment) {
        super(setalignment);
    }
}
