package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class copygNMxBKI extends component50d7_KjU {
    public releaseGraphicsLayer IconCompatParcelizer;
    public ScopedGraphicsContext serializer;

    public final void IconCompatParcelizer() {
        this.MediaMetadataCompat = false;
        releaseGraphicsLayer releasegraphicslayer = this.PlaybackStateCompatCustomAction;
        releasegraphicslayer.read();
        releasegraphicslayer.MediaBrowserCompatMediaItem = false;
        releaseGraphicsLayer releasegraphicslayer2 = this.RemoteActionCompatParcelizer;
        releasegraphicslayer2.read();
        releasegraphicslayer2.MediaBrowserCompatMediaItem = false;
        releaseGraphicsLayer releasegraphicslayer3 = this.IconCompatParcelizer;
        releasegraphicslayer3.read();
        releasegraphicslayer3.MediaBrowserCompatMediaItem = false;
        this.MediaDescriptionCompat.MediaBrowserCompatMediaItem = false;
    }

    @Override // o.component50d7_KjU
    public final void write() {
        this.MediaSessionCompatQueueItem = null;
        this.PlaybackStateCompatCustomAction.read();
        this.RemoteActionCompatParcelizer.read();
        this.IconCompatParcelizer.read();
        this.MediaDescriptionCompat.read();
        this.MediaMetadataCompat = false;
    }

    @Override // o.releaseGraphicsLayers
    public final void IconCompatParcelizer(releaseGraphicsLayers releasegraphicslayers) {
        float f;
        float f2;
        float f3;
        int i;
        if (getElevationD9Ej5fM.read[this.RatingCompat.ordinal()] == 3) {
            setAlignment setalignment = this.MediaSessionCompatResultReceiverWrapper;
            read(setalignment.onActivityResult, setalignment.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs, 1);
            return;
        }
        createGraphicsLayer creategraphicslayer = this.MediaDescriptionCompat;
        if (creategraphicslayer.MediaDescriptionCompat && !creategraphicslayer.MediaBrowserCompatMediaItem && this.MediaBrowserCompatMediaItem == hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT) {
            setAlignment setalignment2 = this.MediaSessionCompatResultReceiverWrapper;
            int i2 = setalignment2.addMenuProvider;
            if (i2 == 2) {
                getUseIntrinsicSize getuseintrinsicsize = setalignment2.getViewModelStore;
                if (getuseintrinsicsize != null) {
                    createGraphicsLayer creategraphicslayer2 = getuseintrinsicsize.onCreatePanelMenu.MediaDescriptionCompat;
                    if (creategraphicslayer2.MediaBrowserCompatMediaItem) {
                        creategraphicslayer.IconCompatParcelizer((int) ((creategraphicslayer2.PlaybackStateCompat * setalignment2.addOnUserLeaveHintListener) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                createGraphicsLayer creategraphicslayer3 = setalignment2.getOnBackPressedInput.MediaDescriptionCompat;
                if (creategraphicslayer3.MediaBrowserCompatMediaItem) {
                    int i3 = setalignment2.defaultViewModelProviderFactory_delegatelambda0;
                    if (i3 != -1) {
                        if (i3 == 0) {
                            f3 = creategraphicslayer3.PlaybackStateCompat * setalignment2.createFullyDrawnExecutor;
                            i = (int) (f3 + 0.5f);
                        } else if (i3 != 1) {
                            i = 0;
                        } else {
                            f = creategraphicslayer3.PlaybackStateCompat;
                            f2 = setalignment2.createFullyDrawnExecutor;
                        }
                        creategraphicslayer.IconCompatParcelizer(i);
                    } else {
                        f = creategraphicslayer3.PlaybackStateCompat;
                        f2 = setalignment2.createFullyDrawnExecutor;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    creategraphicslayer.IconCompatParcelizer(i);
                }
            }
        }
        releaseGraphicsLayer releasegraphicslayer = this.PlaybackStateCompatCustomAction;
        boolean z = releasegraphicslayer.MediaDescriptionCompat;
        ArrayList arrayList = releasegraphicslayer.MediaMetadataCompat;
        if (z) {
            releaseGraphicsLayer releasegraphicslayer2 = this.RemoteActionCompatParcelizer;
            boolean z2 = releasegraphicslayer2.MediaDescriptionCompat;
            ArrayList arrayList2 = releasegraphicslayer2.MediaMetadataCompat;
            if (z2) {
                if (releasegraphicslayer.MediaBrowserCompatMediaItem && releasegraphicslayer2.MediaBrowserCompatMediaItem && creategraphicslayer.MediaBrowserCompatMediaItem) {
                    return;
                }
                if (!creategraphicslayer.MediaBrowserCompatMediaItem && this.MediaBrowserCompatMediaItem == hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT) {
                    setAlignment setalignment3 = this.MediaSessionCompatResultReceiverWrapper;
                    if (setalignment3.addOnConfigurationChangedListener == 0 && !setalignment3.PlaybackStateCompatCustomAction()) {
                        releaseGraphicsLayer releasegraphicslayer3 = (releaseGraphicsLayer) arrayList.get(0);
                        releaseGraphicsLayer releasegraphicslayer4 = (releaseGraphicsLayer) arrayList2.get(0);
                        int i4 = releasegraphicslayer3.PlaybackStateCompat + releasegraphicslayer.write;
                        int i5 = releasegraphicslayer4.PlaybackStateCompat + releasegraphicslayer2.write;
                        releasegraphicslayer.IconCompatParcelizer(i4);
                        releasegraphicslayer2.IconCompatParcelizer(i5);
                        creategraphicslayer.IconCompatParcelizer(i5 - i4);
                        return;
                    }
                }
                if (!creategraphicslayer.MediaBrowserCompatMediaItem && this.MediaBrowserCompatMediaItem == hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT && this.MediaSessionCompatToken == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    int i6 = (((releaseGraphicsLayer) arrayList2.get(0)).PlaybackStateCompat + releasegraphicslayer2.write) - (((releaseGraphicsLayer) arrayList.get(0)).PlaybackStateCompat + releasegraphicslayer.write);
                    int i7 = creategraphicslayer.MediaSessionCompatResultReceiverWrapper;
                    if (i6 < i7) {
                        creategraphicslayer.IconCompatParcelizer(i6);
                    } else {
                        creategraphicslayer.IconCompatParcelizer(i7);
                    }
                }
                if (creategraphicslayer.MediaBrowserCompatMediaItem && arrayList.size() > 0 && arrayList2.size() > 0) {
                    releaseGraphicsLayer releasegraphicslayer5 = (releaseGraphicsLayer) arrayList.get(0);
                    releaseGraphicsLayer releasegraphicslayer6 = (releaseGraphicsLayer) arrayList2.get(0);
                    int i8 = releasegraphicslayer5.PlaybackStateCompat;
                    int i9 = releasegraphicslayer.write;
                    int i10 = releasegraphicslayer6.PlaybackStateCompat;
                    int i11 = releasegraphicslayer2.write;
                    float f4 = this.MediaSessionCompatResultReceiverWrapper.onBackPressed;
                    if (releasegraphicslayer5 == releasegraphicslayer6) {
                        f4 = 0.5f;
                    } else {
                        i8 += i9;
                        i10 += i11;
                    }
                    releasegraphicslayer.IconCompatParcelizer((int) ((((i10 - i8) - creategraphicslayer.PlaybackStateCompat) * f4) + i8 + 0.5f));
                    releasegraphicslayer2.IconCompatParcelizer(releasegraphicslayer.PlaybackStateCompat + creategraphicslayer.PlaybackStateCompat);
                }
            }
        }
    }

    @Override // o.component50d7_KjU
    public final boolean MediaDescriptionCompat() {
        return this.MediaBrowserCompatMediaItem != hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT || this.MediaSessionCompatResultReceiverWrapper.addMenuProvider == 0;
    }

    @Override // o.component50d7_KjU
    public final void RemoteActionCompatParcelizer() {
        setAlignment setalignment;
        getUseIntrinsicSize getuseintrinsicsize;
        getUseIntrinsicSize getuseintrinsicsize2;
        getUseIntrinsicSize getuseintrinsicsize3;
        releaseGraphicsLayer releasegraphicslayer = this.IconCompatParcelizer;
        setAlignment setalignment2 = this.MediaSessionCompatResultReceiverWrapper;
        boolean z = setalignment2.onUserLeaveHint;
        createGraphicsLayer creategraphicslayer = this.MediaDescriptionCompat;
        if (z) {
            creategraphicslayer.IconCompatParcelizer(setalignment2.MediaDescriptionCompat());
        }
        boolean z2 = creategraphicslayer.MediaBrowserCompatMediaItem;
        ArrayList arrayList = creategraphicslayer.RemoteActionCompatParcelizer;
        ArrayList arrayList2 = creategraphicslayer.MediaMetadataCompat;
        releaseGraphicsLayer releasegraphicslayer2 = this.RemoteActionCompatParcelizer;
        releaseGraphicsLayer releasegraphicslayer3 = this.PlaybackStateCompatCustomAction;
        if (!z2) {
            setAlignment setalignment3 = this.MediaSessionCompatResultReceiverWrapper;
            this.MediaBrowserCompatMediaItem = setalignment3.addOnNewIntentListener[1];
            if (setalignment3.addObserverForBackInvokerlambda0) {
                this.serializer = new ScopedGraphicsContext(this);
            }
            hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk = this.MediaBrowserCompatMediaItem;
            if (hasspecifiedandfiniteheightuvyycjk != hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT) {
                if (hasspecifiedandfiniteheightuvyycjk == hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_PARENT && (getuseintrinsicsize3 = this.MediaSessionCompatResultReceiverWrapper.getViewModelStore) != null && getuseintrinsicsize3.addOnNewIntentListener[1] == hasSpecifiedAndFiniteHeightuvyYCjk.FIXED) {
                    int iMediaDescriptionCompat = getuseintrinsicsize3.MediaDescriptionCompat();
                    int iSerializer = this.MediaSessionCompatResultReceiverWrapper.onActivityResult.serializer();
                    int iSerializer2 = this.MediaSessionCompatResultReceiverWrapper.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.serializer();
                    component50d7_KjU.serializer(releasegraphicslayer3, getuseintrinsicsize3.onCreatePanelMenu.PlaybackStateCompatCustomAction, this.MediaSessionCompatResultReceiverWrapper.onActivityResult.serializer());
                    component50d7_KjU.serializer(releasegraphicslayer2, getuseintrinsicsize3.onCreatePanelMenu.RemoteActionCompatParcelizer, -this.MediaSessionCompatResultReceiverWrapper.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.serializer());
                    creategraphicslayer.IconCompatParcelizer((iMediaDescriptionCompat - iSerializer) - iSerializer2);
                    return;
                }
                if (hasspecifiedandfiniteheightuvyycjk == hasSpecifiedAndFiniteHeightuvyYCjk.FIXED) {
                    creategraphicslayer.IconCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper.MediaDescriptionCompat());
                }
            }
        } else if (this.MediaBrowserCompatMediaItem == hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_PARENT && (getuseintrinsicsize = (setalignment = this.MediaSessionCompatResultReceiverWrapper).getViewModelStore) != null && getuseintrinsicsize.addOnNewIntentListener[1] == hasSpecifiedAndFiniteHeightuvyYCjk.FIXED) {
            component50d7_KjU.serializer(releasegraphicslayer3, getuseintrinsicsize.onCreatePanelMenu.PlaybackStateCompatCustomAction, setalignment.onActivityResult.serializer());
            component50d7_KjU.serializer(releasegraphicslayer2, getuseintrinsicsize.onCreatePanelMenu.RemoteActionCompatParcelizer, -this.MediaSessionCompatResultReceiverWrapper.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.serializer());
            return;
        }
        boolean z3 = creategraphicslayer.MediaBrowserCompatMediaItem;
        if (z3) {
            setAlignment setalignment4 = this.MediaSessionCompatResultReceiverWrapper;
            if (setalignment4.onUserLeaveHint) {
                paintdefault[] paintdefaultVarArr = setalignment4.addOnMultiWindowModeChangedListener;
                paintdefault paintdefaultVar = paintdefaultVarArr[2];
                paintdefault paintdefaultVar2 = paintdefaultVar.MediaSessionCompatQueueItem;
                if (paintdefaultVar2 != null && paintdefaultVarArr[3].MediaSessionCompatQueueItem != null) {
                    boolean zPlaybackStateCompatCustomAction = setalignment4.PlaybackStateCompatCustomAction();
                    setAlignment setalignment5 = this.MediaSessionCompatResultReceiverWrapper;
                    if (zPlaybackStateCompatCustomAction) {
                        releasegraphicslayer3.write = setalignment5.addOnMultiWindowModeChangedListener[2].serializer();
                        releasegraphicslayer2.write = -this.MediaSessionCompatResultReceiverWrapper.addOnMultiWindowModeChangedListener[3].serializer();
                    } else {
                        releaseGraphicsLayer releasegraphicslayerWrite = component50d7_KjU.write(setalignment5.addOnMultiWindowModeChangedListener[2]);
                        if (releasegraphicslayerWrite != null) {
                            component50d7_KjU.serializer(releasegraphicslayer3, releasegraphicslayerWrite, this.MediaSessionCompatResultReceiverWrapper.addOnMultiWindowModeChangedListener[2].serializer());
                        }
                        releaseGraphicsLayer releasegraphicslayerWrite2 = component50d7_KjU.write(this.MediaSessionCompatResultReceiverWrapper.addOnMultiWindowModeChangedListener[3]);
                        if (releasegraphicslayerWrite2 != null) {
                            component50d7_KjU.serializer(releasegraphicslayer2, releasegraphicslayerWrite2, -this.MediaSessionCompatResultReceiverWrapper.addOnMultiWindowModeChangedListener[3].serializer());
                        }
                        releasegraphicslayer3.IconCompatParcelizer = true;
                        releasegraphicslayer2.IconCompatParcelizer = true;
                    }
                    setAlignment setalignment6 = this.MediaSessionCompatResultReceiverWrapper;
                    if (setalignment6.addObserverForBackInvokerlambda0) {
                        component50d7_KjU.serializer(releasegraphicslayer, releasegraphicslayer3, setalignment6.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ);
                        return;
                    }
                    return;
                }
                if (paintdefaultVar2 != null) {
                    releaseGraphicsLayer releasegraphicslayerWrite3 = component50d7_KjU.write(paintdefaultVar);
                    if (releasegraphicslayerWrite3 != null) {
                        component50d7_KjU.serializer(releasegraphicslayer3, releasegraphicslayerWrite3, this.MediaSessionCompatResultReceiverWrapper.addOnMultiWindowModeChangedListener[2].serializer());
                        component50d7_KjU.serializer(releasegraphicslayer2, releasegraphicslayer3, creategraphicslayer.PlaybackStateCompat);
                        setAlignment setalignment7 = this.MediaSessionCompatResultReceiverWrapper;
                        if (setalignment7.addObserverForBackInvokerlambda0) {
                            component50d7_KjU.serializer(releasegraphicslayer, releasegraphicslayer3, setalignment7.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ);
                            return;
                        }
                        return;
                    }
                    return;
                }
                paintdefault paintdefaultVar3 = paintdefaultVarArr[3];
                if (paintdefaultVar3.MediaSessionCompatQueueItem != null) {
                    releaseGraphicsLayer releasegraphicslayerWrite4 = component50d7_KjU.write(paintdefaultVar3);
                    if (releasegraphicslayerWrite4 != null) {
                        component50d7_KjU.serializer(releasegraphicslayer2, releasegraphicslayerWrite4, -this.MediaSessionCompatResultReceiverWrapper.addOnMultiWindowModeChangedListener[3].serializer());
                        component50d7_KjU.serializer(releasegraphicslayer3, releasegraphicslayer2, -creategraphicslayer.PlaybackStateCompat);
                    }
                    setAlignment setalignment8 = this.MediaSessionCompatResultReceiverWrapper;
                    if (setalignment8.addObserverForBackInvokerlambda0) {
                        component50d7_KjU.serializer(releasegraphicslayer, releasegraphicslayer3, setalignment8.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ);
                        return;
                    }
                    return;
                }
                paintdefault paintdefaultVar4 = paintdefaultVarArr[4];
                if (paintdefaultVar4.MediaSessionCompatQueueItem != null) {
                    releaseGraphicsLayer releasegraphicslayerWrite5 = component50d7_KjU.write(paintdefaultVar4);
                    if (releasegraphicslayerWrite5 != null) {
                        component50d7_KjU.serializer(releasegraphicslayer, releasegraphicslayerWrite5, 0);
                        component50d7_KjU.serializer(releasegraphicslayer3, releasegraphicslayer, -this.MediaSessionCompatResultReceiverWrapper.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ);
                        component50d7_KjU.serializer(releasegraphicslayer2, releasegraphicslayer3, creategraphicslayer.PlaybackStateCompat);
                        return;
                    }
                    return;
                }
                if ((setalignment4 instanceof setPainter) || setalignment4.getViewModelStore == null || setalignment4.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.CENTER).MediaSessionCompatQueueItem != null) {
                    return;
                }
                setAlignment setalignment9 = this.MediaSessionCompatResultReceiverWrapper;
                component50d7_KjU.serializer(releasegraphicslayer3, setalignment9.getViewModelStore.onCreatePanelMenu.PlaybackStateCompatCustomAction, setalignment9.MediaSessionCompatToken());
                component50d7_KjU.serializer(releasegraphicslayer2, releasegraphicslayer3, creategraphicslayer.PlaybackStateCompat);
                setAlignment setalignment10 = this.MediaSessionCompatResultReceiverWrapper;
                if (setalignment10.addObserverForBackInvokerlambda0) {
                    component50d7_KjU.serializer(releasegraphicslayer, releasegraphicslayer3, setalignment10.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ);
                    return;
                }
                return;
            }
        }
        if (z3 || this.MediaBrowserCompatMediaItem != hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT) {
            creategraphicslayer.read(this);
        } else {
            setAlignment setalignment11 = this.MediaSessionCompatResultReceiverWrapper;
            int i = setalignment11.addMenuProvider;
            if (i == 2) {
                getUseIntrinsicSize getuseintrinsicsize4 = setalignment11.getViewModelStore;
                if (getuseintrinsicsize4 != null) {
                    createGraphicsLayer creategraphicslayer2 = getuseintrinsicsize4.onCreatePanelMenu.MediaDescriptionCompat;
                    arrayList2.add(creategraphicslayer2);
                    creategraphicslayer2.RemoteActionCompatParcelizer.add(creategraphicslayer);
                    creategraphicslayer.IconCompatParcelizer = true;
                    arrayList.add(releasegraphicslayer3);
                    arrayList.add(releasegraphicslayer2);
                }
            } else if (i == 3 && !setalignment11.PlaybackStateCompatCustomAction()) {
                setAlignment setalignment12 = this.MediaSessionCompatResultReceiverWrapper;
                if (setalignment12.addOnConfigurationChangedListener != 3) {
                    createGraphicsLayer creategraphicslayer3 = setalignment12.getOnBackPressedInput.MediaDescriptionCompat;
                    arrayList2.add(creategraphicslayer3);
                    creategraphicslayer3.RemoteActionCompatParcelizer.add(creategraphicslayer);
                    creategraphicslayer.IconCompatParcelizer = true;
                    arrayList.add(releasegraphicslayer3);
                    arrayList.add(releasegraphicslayer2);
                }
            }
        }
        setAlignment setalignment13 = this.MediaSessionCompatResultReceiverWrapper;
        paintdefault[] paintdefaultVarArr2 = setalignment13.addOnMultiWindowModeChangedListener;
        paintdefault paintdefaultVar5 = paintdefaultVarArr2[2];
        paintdefault paintdefaultVar6 = paintdefaultVar5.MediaSessionCompatQueueItem;
        if (paintdefaultVar6 != null && paintdefaultVarArr2[3].MediaSessionCompatQueueItem != null) {
            boolean zPlaybackStateCompatCustomAction2 = setalignment13.PlaybackStateCompatCustomAction();
            setAlignment setalignment14 = this.MediaSessionCompatResultReceiverWrapper;
            if (zPlaybackStateCompatCustomAction2) {
                releasegraphicslayer3.write = setalignment14.addOnMultiWindowModeChangedListener[2].serializer();
                releasegraphicslayer2.write = -this.MediaSessionCompatResultReceiverWrapper.addOnMultiWindowModeChangedListener[3].serializer();
            } else {
                releaseGraphicsLayer releasegraphicslayerWrite6 = component50d7_KjU.write(setalignment14.addOnMultiWindowModeChangedListener[2]);
                releaseGraphicsLayer releasegraphicslayerWrite7 = component50d7_KjU.write(this.MediaSessionCompatResultReceiverWrapper.addOnMultiWindowModeChangedListener[3]);
                if (releasegraphicslayerWrite6 != null) {
                    releasegraphicslayerWrite6.read(this);
                }
                if (releasegraphicslayerWrite7 != null) {
                    releasegraphicslayerWrite7.read(this);
                }
                this.RatingCompat = ShadowGraphicsLayerElementcreateBlock1.CENTER;
            }
            if (this.MediaSessionCompatResultReceiverWrapper.addObserverForBackInvokerlambda0) {
                IconCompatParcelizer(releasegraphicslayer, releasegraphicslayer3, 1, this.serializer);
            }
        } else if (paintdefaultVar6 != null) {
            releaseGraphicsLayer releasegraphicslayerWrite8 = component50d7_KjU.write(paintdefaultVar5);
            if (releasegraphicslayerWrite8 != null) {
                component50d7_KjU.serializer(releasegraphicslayer3, releasegraphicslayerWrite8, this.MediaSessionCompatResultReceiverWrapper.addOnMultiWindowModeChangedListener[2].serializer());
                IconCompatParcelizer(releasegraphicslayer2, releasegraphicslayer3, 1, creategraphicslayer);
                if (this.MediaSessionCompatResultReceiverWrapper.addObserverForBackInvokerlambda0) {
                    IconCompatParcelizer(releasegraphicslayer, releasegraphicslayer3, 1, this.serializer);
                }
                hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk2 = this.MediaBrowserCompatMediaItem;
                hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk3 = hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT;
                if (hasspecifiedandfiniteheightuvyycjk2 == hasspecifiedandfiniteheightuvyycjk3) {
                    setAlignment setalignment15 = this.MediaSessionCompatResultReceiverWrapper;
                    if (setalignment15.createFullyDrawnExecutor > 0.0f) {
                        component40d7_KjU component40d7_kju = setalignment15.getOnBackPressedInput;
                        if (component40d7_kju.MediaBrowserCompatMediaItem == hasspecifiedandfiniteheightuvyycjk3) {
                            component40d7_kju.MediaDescriptionCompat.RemoteActionCompatParcelizer.add(creategraphicslayer);
                            arrayList2.add(this.MediaSessionCompatResultReceiverWrapper.getOnBackPressedInput.MediaDescriptionCompat);
                            creategraphicslayer.MediaSessionCompatToken = this;
                        }
                    }
                }
            }
        } else {
            paintdefault paintdefaultVar7 = paintdefaultVarArr2[3];
            if (paintdefaultVar7.MediaSessionCompatQueueItem != null) {
                releaseGraphicsLayer releasegraphicslayerWrite9 = component50d7_KjU.write(paintdefaultVar7);
                if (releasegraphicslayerWrite9 != null) {
                    component50d7_KjU.serializer(releasegraphicslayer2, releasegraphicslayerWrite9, -this.MediaSessionCompatResultReceiverWrapper.addOnMultiWindowModeChangedListener[3].serializer());
                    IconCompatParcelizer(releasegraphicslayer3, releasegraphicslayer2, -1, creategraphicslayer);
                    if (this.MediaSessionCompatResultReceiverWrapper.addObserverForBackInvokerlambda0) {
                        IconCompatParcelizer(releasegraphicslayer, releasegraphicslayer3, 1, this.serializer);
                    }
                }
            } else {
                paintdefault paintdefaultVar8 = paintdefaultVarArr2[4];
                if (paintdefaultVar8.MediaSessionCompatQueueItem != null) {
                    releaseGraphicsLayer releasegraphicslayerWrite10 = component50d7_KjU.write(paintdefaultVar8);
                    if (releasegraphicslayerWrite10 != null) {
                        component50d7_KjU.serializer(releasegraphicslayer, releasegraphicslayerWrite10, 0);
                        IconCompatParcelizer(releasegraphicslayer3, releasegraphicslayer, -1, this.serializer);
                        IconCompatParcelizer(releasegraphicslayer2, releasegraphicslayer3, 1, creategraphicslayer);
                    }
                } else if (!(setalignment13 instanceof setPainter) && (getuseintrinsicsize2 = setalignment13.getViewModelStore) != null) {
                    component50d7_KjU.serializer(releasegraphicslayer3, getuseintrinsicsize2.onCreatePanelMenu.PlaybackStateCompatCustomAction, setalignment13.MediaSessionCompatToken());
                    IconCompatParcelizer(releasegraphicslayer2, releasegraphicslayer3, 1, creategraphicslayer);
                    if (this.MediaSessionCompatResultReceiverWrapper.addObserverForBackInvokerlambda0) {
                        IconCompatParcelizer(releasegraphicslayer, releasegraphicslayer3, 1, this.serializer);
                    }
                    hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk4 = this.MediaBrowserCompatMediaItem;
                    hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk5 = hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT;
                    if (hasspecifiedandfiniteheightuvyycjk4 == hasspecifiedandfiniteheightuvyycjk5) {
                        setAlignment setalignment16 = this.MediaSessionCompatResultReceiverWrapper;
                        if (setalignment16.createFullyDrawnExecutor > 0.0f) {
                            component40d7_KjU component40d7_kju2 = setalignment16.getOnBackPressedInput;
                            if (component40d7_kju2.MediaBrowserCompatMediaItem == hasspecifiedandfiniteheightuvyycjk5) {
                                component40d7_kju2.MediaDescriptionCompat.RemoteActionCompatParcelizer.add(creategraphicslayer);
                                arrayList2.add(this.MediaSessionCompatResultReceiverWrapper.getOnBackPressedInput.MediaDescriptionCompat);
                                creategraphicslayer.MediaSessionCompatToken = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            creategraphicslayer.MediaDescriptionCompat = true;
        }
    }

    @Override // o.component50d7_KjU
    public final void serializer() {
        releaseGraphicsLayer releasegraphicslayer = this.PlaybackStateCompatCustomAction;
        if (releasegraphicslayer.MediaBrowserCompatMediaItem) {
            this.MediaSessionCompatResultReceiverWrapper.onRetainNonConfigurationInstance = releasegraphicslayer.PlaybackStateCompat;
        }
    }

    public final String toString() {
        return "VerticalRun " + this.MediaSessionCompatResultReceiverWrapper.accessensureViewModelStore;
    }

    public copygNMxBKI(setAlignment setalignment) {
        super(setalignment);
    }
}
