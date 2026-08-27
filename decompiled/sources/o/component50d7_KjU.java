package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class component50d7_KjU implements releaseGraphicsLayers {
    public hasSpecifiedAndFiniteHeightuvyYCjk MediaBrowserCompatMediaItem;
    public createBlock MediaSessionCompatQueueItem;
    public setAlignment MediaSessionCompatResultReceiverWrapper;
    public int MediaSessionCompatToken;
    public final createGraphicsLayer MediaDescriptionCompat = new createGraphicsLayer(this);
    public int ParcelableVolumeInfo = 0;
    public boolean MediaMetadataCompat = false;
    public final releaseGraphicsLayer PlaybackStateCompatCustomAction = new releaseGraphicsLayer(this);
    public final releaseGraphicsLayer RemoteActionCompatParcelizer = new releaseGraphicsLayer(this);
    public ShadowGraphicsLayerElementcreateBlock1 RatingCompat = ShadowGraphicsLayerElementcreateBlock1.NONE;

    public abstract boolean MediaDescriptionCompat();

    public abstract void RemoteActionCompatParcelizer();

    public abstract void serializer();

    public abstract void write();

    public final void IconCompatParcelizer(releaseGraphicsLayer releasegraphicslayer, releaseGraphicsLayer releasegraphicslayer2, int i, createGraphicsLayer creategraphicslayer) {
        releasegraphicslayer.MediaMetadataCompat.add(releasegraphicslayer2);
        releasegraphicslayer.MediaMetadataCompat.add(this.MediaDescriptionCompat);
        releasegraphicslayer.serializer = i;
        releasegraphicslayer.read = creategraphicslayer;
        releasegraphicslayer2.RemoteActionCompatParcelizer.add(releasegraphicslayer);
        creategraphicslayer.RemoteActionCompatParcelizer.add(releasegraphicslayer);
    }

    public long MediaBrowserCompatMediaItem() {
        createGraphicsLayer creategraphicslayer = this.MediaDescriptionCompat;
        if (creategraphicslayer.MediaBrowserCompatMediaItem) {
            return creategraphicslayer.PlaybackStateCompat;
        }
        return 0L;
    }

    public final int read(int i, int i2) {
        setAlignment setalignment = this.MediaSessionCompatResultReceiverWrapper;
        if (i2 == 0) {
            int i3 = setalignment.addOnPictureInPictureUiStateChangedListener;
            int iMax = Math.max(setalignment.addOnTrimMemoryListener, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            int i4 = setalignment.addOnPictureInPictureModeChangedListener;
            int iMax2 = Math.max(setalignment.enterPictureInPictureMode, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    public final void read(paintdefault paintdefaultVar, paintdefault paintdefaultVar2, int i) {
        createGraphicsLayer creategraphicslayer;
        float f;
        int i2;
        int i3;
        releaseGraphicsLayer releasegraphicslayerWrite = write(paintdefaultVar);
        releaseGraphicsLayer releasegraphicslayerWrite2 = write(paintdefaultVar2);
        if (releasegraphicslayerWrite.MediaBrowserCompatMediaItem && releasegraphicslayerWrite2.MediaBrowserCompatMediaItem) {
            int iSerializer = paintdefaultVar.serializer() + releasegraphicslayerWrite.PlaybackStateCompat;
            int iSerializer2 = releasegraphicslayerWrite2.PlaybackStateCompat - paintdefaultVar2.serializer();
            int i4 = iSerializer2 - iSerializer;
            createGraphicsLayer creategraphicslayer2 = this.MediaDescriptionCompat;
            if (!creategraphicslayer2.MediaBrowserCompatMediaItem) {
                hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk = this.MediaBrowserCompatMediaItem;
                hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk2 = hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT;
                if (hasspecifiedandfiniteheightuvyycjk == hasspecifiedandfiniteheightuvyycjk2) {
                    int i5 = this.MediaSessionCompatToken;
                    if (i5 == 0) {
                        creategraphicslayer2.IconCompatParcelizer(read(i4, i));
                    } else if (i5 == 1) {
                        creategraphicslayer2.IconCompatParcelizer(Math.min(read(creategraphicslayer2.MediaSessionCompatResultReceiverWrapper, i), i4));
                    } else if (i5 == 2) {
                        setAlignment setalignment = this.MediaSessionCompatResultReceiverWrapper;
                        getUseIntrinsicSize getuseintrinsicsize = setalignment.getViewModelStore;
                        if (getuseintrinsicsize != null) {
                            createGraphicsLayer creategraphicslayer3 = (i == 0 ? getuseintrinsicsize.getOnBackPressedInput : getuseintrinsicsize.onCreatePanelMenu).MediaDescriptionCompat;
                            if (creategraphicslayer3.MediaBrowserCompatMediaItem) {
                                creategraphicslayer2.IconCompatParcelizer(read((int) ((creategraphicslayer3.PlaybackStateCompat * (i == 0 ? setalignment.getLastCustomNonConfigurationInstance : setalignment.addOnUserLeaveHintListener)) + 0.5f), i));
                            }
                        }
                    } else if (i5 == 3) {
                        setAlignment setalignment2 = this.MediaSessionCompatResultReceiverWrapper;
                        component50d7_KjU component50d7_kju = setalignment2.getOnBackPressedInput;
                        if (component50d7_kju.MediaBrowserCompatMediaItem == hasspecifiedandfiniteheightuvyycjk2 && component50d7_kju.MediaSessionCompatToken == 3) {
                            copygNMxBKI copygnmxbki = setalignment2.onCreatePanelMenu;
                            if (copygnmxbki.MediaBrowserCompatMediaItem != hasspecifiedandfiniteheightuvyycjk2 || copygnmxbki.MediaSessionCompatToken != 3) {
                                if (i == 0) {
                                    component50d7_kju = setalignment2.onCreatePanelMenu;
                                }
                                creategraphicslayer = component50d7_kju.MediaDescriptionCompat;
                                if (creategraphicslayer.MediaBrowserCompatMediaItem) {
                                    f = setalignment2.createFullyDrawnExecutor;
                                    i2 = creategraphicslayer.PlaybackStateCompat;
                                    if (i == 1) {
                                        i3 = (int) ((i2 / f) + 0.5f);
                                    } else {
                                        i3 = (int) ((f * i2) + 0.5f);
                                    }
                                    creategraphicslayer2.IconCompatParcelizer(i3);
                                }
                            }
                        } else {
                            if (i == 0) {
                                component50d7_kju = setalignment2.onCreatePanelMenu;
                            }
                            creategraphicslayer = component50d7_kju.MediaDescriptionCompat;
                            if (creategraphicslayer.MediaBrowserCompatMediaItem) {
                                f = setalignment2.createFullyDrawnExecutor;
                                i2 = creategraphicslayer.PlaybackStateCompat;
                                if (i == 1) {
                                    i3 = (int) ((i2 / f) + 0.5f);
                                } else {
                                    i3 = (int) ((f * i2) + 0.5f);
                                }
                                creategraphicslayer2.IconCompatParcelizer(i3);
                            }
                        }
                    }
                }
            }
            if (creategraphicslayer2.MediaBrowserCompatMediaItem) {
                int i6 = creategraphicslayer2.PlaybackStateCompat;
                releaseGraphicsLayer releasegraphicslayer = this.RemoteActionCompatParcelizer;
                releaseGraphicsLayer releasegraphicslayer2 = this.PlaybackStateCompatCustomAction;
                if (i6 == i4) {
                    releasegraphicslayer2.IconCompatParcelizer(iSerializer);
                    releasegraphicslayer.IconCompatParcelizer(iSerializer2);
                    return;
                }
                setAlignment setalignment3 = this.MediaSessionCompatResultReceiverWrapper;
                float f2 = i == 0 ? setalignment3.fullyDrawnReporter_delegatelambda0 : setalignment3.onBackPressed;
                if (releasegraphicslayerWrite == releasegraphicslayerWrite2) {
                    iSerializer = releasegraphicslayerWrite.PlaybackStateCompat;
                    iSerializer2 = releasegraphicslayerWrite2.PlaybackStateCompat;
                    f2 = 0.5f;
                }
                releasegraphicslayer2.IconCompatParcelizer((int) ((((iSerializer2 - iSerializer) - i6) * f2) + iSerializer + 0.5f));
                releasegraphicslayer.IconCompatParcelizer(releasegraphicslayer2.PlaybackStateCompat + creategraphicslayer2.PlaybackStateCompat);
            }
        }
    }

    public component50d7_KjU(setAlignment setalignment) {
        this.MediaSessionCompatResultReceiverWrapper = setalignment;
    }

    public static releaseGraphicsLayer write(paintdefault paintdefaultVar) {
        paintdefault paintdefaultVar2 = paintdefaultVar.MediaSessionCompatQueueItem;
        if (paintdefaultVar2 == null) {
            return null;
        }
        setAlignment setalignment = paintdefaultVar2.RatingCompat;
        int i = getAmbientColor0d7_KjU.IconCompatParcelizer[paintdefaultVar2.MediaBrowserCompatMediaItem.ordinal()];
        if (i == 1) {
            return setalignment.getOnBackPressedInput.PlaybackStateCompatCustomAction;
        }
        if (i == 2) {
            return setalignment.getOnBackPressedInput.RemoteActionCompatParcelizer;
        }
        if (i == 3) {
            return setalignment.onCreatePanelMenu.PlaybackStateCompatCustomAction;
        }
        if (i == 4) {
            return setalignment.onCreatePanelMenu.IconCompatParcelizer;
        }
        if (i != 5) {
            return null;
        }
        return setalignment.onCreatePanelMenu.RemoteActionCompatParcelizer;
    }

    public static void serializer(releaseGraphicsLayer releasegraphicslayer, releaseGraphicsLayer releasegraphicslayer2, int i) {
        releasegraphicslayer.MediaMetadataCompat.add(releasegraphicslayer2);
        releasegraphicslayer.write = i;
        releasegraphicslayer2.RemoteActionCompatParcelizer.add(releasegraphicslayer);
    }

    public static releaseGraphicsLayer IconCompatParcelizer(paintdefault paintdefaultVar, int i) {
        paintdefault paintdefaultVar2 = paintdefaultVar.MediaSessionCompatQueueItem;
        if (paintdefaultVar2 == null) {
            return null;
        }
        setAlignment setalignment = paintdefaultVar2.RatingCompat;
        component50d7_KjU component50d7_kju = i == 0 ? setalignment.getOnBackPressedInput : setalignment.onCreatePanelMenu;
        int i2 = getAmbientColor0d7_KjU.IconCompatParcelizer[paintdefaultVar2.MediaBrowserCompatMediaItem.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return component50d7_kju.RemoteActionCompatParcelizer;
        }
        return component50d7_kju.PlaybackStateCompatCustomAction;
    }
}
