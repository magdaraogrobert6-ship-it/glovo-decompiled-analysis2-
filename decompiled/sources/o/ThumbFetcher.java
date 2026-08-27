package o;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ThumbFetcher {
    public final /* synthetic */ int IconCompatParcelizer;
    public final Object MediaBrowserCompatMediaItem;
    public final Object MediaDescriptionCompat;
    public Object MediaSessionCompatQueueItem;
    public final Object RatingCompat;
    public final Serializable RemoteActionCompatParcelizer;
    public boolean read;
    public boolean serializer;
    public final Object write;

    public ThumbFetcher(getUseIntrinsicSize getuseintrinsicsize) {
        this.IconCompatParcelizer = 1;
        this.serializer = true;
        this.read = true;
        this.RemoteActionCompatParcelizer = new ArrayList();
        new ArrayList();
        this.MediaSessionCompatQueueItem = null;
        this.MediaDescriptionCompat = new RotateKt();
        this.write = new ArrayList();
        this.RatingCompat = getuseintrinsicsize;
        this.MediaBrowserCompatMediaItem = getuseintrinsicsize;
    }

    public void IconCompatParcelizer() {
        getUseIntrinsicSize getuseintrinsicsize = (getUseIntrinsicSize) this.RatingCompat;
        ArrayList arrayList = (ArrayList) this.write;
        ArrayList<component50d7_KjU> arrayList2 = (ArrayList) this.RemoteActionCompatParcelizer;
        arrayList2.clear();
        getUseIntrinsicSize getuseintrinsicsize2 = (getUseIntrinsicSize) this.MediaBrowserCompatMediaItem;
        getuseintrinsicsize2.getOnBackPressedInput.write();
        getuseintrinsicsize2.onCreatePanelMenu.write();
        arrayList2.add(getuseintrinsicsize2.getOnBackPressedInput);
        arrayList2.add(getuseintrinsicsize2.onCreatePanelMenu);
        HashSet hashSet = null;
        for (setAlignment setalignment : getuseintrinsicsize2.serializer) {
            if (setalignment instanceof setSizeToIntrinsics) {
                arrayList2.add(new ShadowGraphicsLayerElement((setSizeToIntrinsics) setalignment));
            } else {
                if (setalignment.ParcelableVolumeInfo()) {
                    if (setalignment.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 == null) {
                        setalignment.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new ScaleKt(setalignment, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(setalignment.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4);
                } else {
                    arrayList2.add(setalignment.getOnBackPressedInput);
                }
                if (setalignment.PlaybackStateCompatCustomAction()) {
                    if (setalignment.onTrimMemory == null) {
                        setalignment.onTrimMemory = new ScaleKt(setalignment, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(setalignment.onTrimMemory);
                } else {
                    arrayList2.add(setalignment.onCreatePanelMenu);
                }
                if (setalignment instanceof setPainter) {
                    arrayList2.add(new component1D9Ej5fM(setalignment));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((component50d7_KjU) it.next()).write();
        }
        for (component50d7_KjU component50d7_kju : arrayList2) {
            if (component50d7_kju.MediaSessionCompatResultReceiverWrapper != getuseintrinsicsize2) {
                component50d7_kju.RemoteActionCompatParcelizer();
            }
        }
        arrayList.clear();
        IconCompatParcelizer(getuseintrinsicsize.getOnBackPressedInput, 0, arrayList);
        IconCompatParcelizer(getuseintrinsicsize.onCreatePanelMenu, 1, arrayList);
        this.serializer = false;
    }

    public void IconCompatParcelizer(component50d7_KjU component50d7_kju, int i, ArrayList arrayList) {
        releaseGraphicsLayer releasegraphicslayer = component50d7_kju.PlaybackStateCompatCustomAction;
        releaseGraphicsLayer releasegraphicslayer2 = component50d7_kju.RemoteActionCompatParcelizer;
        for (releaseGraphicsLayers releasegraphicslayers : releasegraphicslayer.RemoteActionCompatParcelizer) {
            if (releasegraphicslayers instanceof releaseGraphicsLayer) {
                write((releaseGraphicsLayer) releasegraphicslayers, i, arrayList, null);
            } else if (releasegraphicslayers instanceof component50d7_KjU) {
                write(((component50d7_KjU) releasegraphicslayers).PlaybackStateCompatCustomAction, i, arrayList, null);
            }
        }
        for (releaseGraphicsLayers releasegraphicslayers2 : releasegraphicslayer2.RemoteActionCompatParcelizer) {
            if (releasegraphicslayers2 instanceof releaseGraphicsLayer) {
                write((releaseGraphicsLayer) releasegraphicslayers2, i, arrayList, null);
            } else if (releasegraphicslayers2 instanceof component50d7_KjU) {
                write(((component50d7_KjU) releasegraphicslayers2).RemoteActionCompatParcelizer, i, arrayList, null);
            }
        }
        if (i == 1) {
            for (releaseGraphicsLayers releasegraphicslayers3 : ((copygNMxBKI) component50d7_kju).IconCompatParcelizer.RemoteActionCompatParcelizer) {
                if (releasegraphicslayers3 instanceof releaseGraphicsLayer) {
                    write((releaseGraphicsLayer) releasegraphicslayers3, i, arrayList, null);
                }
            }
        }
    }

    public int RemoteActionCompatParcelizer(getUseIntrinsicSize getuseintrinsicsize, int i) {
        ArrayList arrayList = (ArrayList) this.write;
        int size = arrayList.size();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            jMax = Math.max(jMax, ((createBlock) arrayList.get(i2)).RemoteActionCompatParcelizer(getuseintrinsicsize, i));
        }
        return (int) jMax;
    }

    public void read() {
        ScopedGraphicsContext scopedGraphicsContext;
        for (setAlignment setalignment : ((getUseIntrinsicSize) this.RatingCompat).serializer) {
            if (!setalignment.onUserLeaveHint) {
                hasSpecifiedAndFiniteHeightuvyYCjk[] hasspecifiedandfiniteheightuvyycjkArr = setalignment.addOnNewIntentListener;
                boolean z = false;
                hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk = hasspecifiedandfiniteheightuvyycjkArr[0];
                hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk2 = hasspecifiedandfiniteheightuvyycjkArr[1];
                int i = setalignment.addOnConfigurationChangedListener;
                int i2 = setalignment.addMenuProvider;
                hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk3 = hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT;
                boolean z2 = hasspecifiedandfiniteheightuvyycjk == hasspecifiedandfiniteheightuvyycjk3 || (hasspecifiedandfiniteheightuvyycjk == hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT && i == 1);
                if (hasspecifiedandfiniteheightuvyycjk2 == hasspecifiedandfiniteheightuvyycjk3 || (hasspecifiedandfiniteheightuvyycjk2 == hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                createGraphicsLayer creategraphicslayer = setalignment.getOnBackPressedInput.MediaDescriptionCompat;
                boolean z3 = creategraphicslayer.MediaBrowserCompatMediaItem;
                createGraphicsLayer creategraphicslayer2 = setalignment.onCreatePanelMenu.MediaDescriptionCompat;
                boolean z4 = creategraphicslayer2.MediaBrowserCompatMediaItem;
                if (z3 && z4) {
                    hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk4 = hasSpecifiedAndFiniteHeightuvyYCjk.FIXED;
                    serializer(setalignment, hasspecifiedandfiniteheightuvyycjk4, creategraphicslayer.PlaybackStateCompat, hasspecifiedandfiniteheightuvyycjk4, creategraphicslayer2.PlaybackStateCompat);
                    setalignment.onUserLeaveHint = true;
                } else if (z3 && z) {
                    serializer(setalignment, hasSpecifiedAndFiniteHeightuvyYCjk.FIXED, creategraphicslayer.PlaybackStateCompat, hasspecifiedandfiniteheightuvyycjk3, creategraphicslayer2.PlaybackStateCompat);
                    hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk5 = hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT;
                    copygNMxBKI copygnmxbki = setalignment.onCreatePanelMenu;
                    if (hasspecifiedandfiniteheightuvyycjk2 == hasspecifiedandfiniteheightuvyycjk5) {
                        copygnmxbki.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper = setalignment.MediaDescriptionCompat();
                    } else {
                        copygnmxbki.MediaDescriptionCompat.IconCompatParcelizer(setalignment.MediaDescriptionCompat());
                        setalignment.onUserLeaveHint = true;
                    }
                } else if (z4 && z2) {
                    serializer(setalignment, hasspecifiedandfiniteheightuvyycjk3, creategraphicslayer.PlaybackStateCompat, hasSpecifiedAndFiniteHeightuvyYCjk.FIXED, creategraphicslayer2.PlaybackStateCompat);
                    hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk6 = hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT;
                    component40d7_KjU component40d7_kju = setalignment.getOnBackPressedInput;
                    if (hasspecifiedandfiniteheightuvyycjk == hasspecifiedandfiniteheightuvyycjk6) {
                        component40d7_kju.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper = setalignment.MediaSessionCompatQueueItem();
                    } else {
                        component40d7_kju.MediaDescriptionCompat.IconCompatParcelizer(setalignment.MediaSessionCompatQueueItem());
                        setalignment.onUserLeaveHint = true;
                    }
                }
                if (setalignment.onUserLeaveHint && (scopedGraphicsContext = setalignment.onCreatePanelMenu.serializer) != null) {
                    scopedGraphicsContext.IconCompatParcelizer(setalignment.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0274  */
    /* JADX WARN: Code duplicated, block: B:125:0x0277 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x027b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:137:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:97:0x01a2  */
    public void serializer(getUseIntrinsicSize getuseintrinsicsize) {
        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk;
        int iMediaDescriptionCompat;
        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk2;
        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk3;
        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk4;
        ArrayList arrayList = getuseintrinsicsize.serializer;
        hasSpecifiedAndFiniteHeightuvyYCjk[] hasspecifiedandfiniteheightuvyycjkArr = getuseintrinsicsize.addOnNewIntentListener;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            setAlignment setalignment = (setAlignment) it.next();
            hasSpecifiedAndFiniteHeightuvyYCjk[] hasspecifiedandfiniteheightuvyycjkArr2 = setalignment.addOnNewIntentListener;
            paintdefault[] paintdefaultVarArr = setalignment.addOnMultiWindowModeChangedListener;
            paintdefault paintdefaultVar = setalignment.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
            paintdefault paintdefaultVar2 = setalignment.onActivityResult;
            paintdefault paintdefaultVar3 = setalignment.invalidateMenu;
            paintdefault paintdefaultVar4 = setalignment.onBackPressedDispatcher_delegatelambda010;
            hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk5 = hasspecifiedandfiniteheightuvyycjkArr2[0];
            hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk6 = hasspecifiedandfiniteheightuvyycjkArr2[1];
            if (setalignment.onMultiWindowModeChanged == 8) {
                setalignment.onUserLeaveHint = true;
            } else {
                float f = setalignment.getLastCustomNonConfigurationInstance;
                if (f < 1.0f && hasspecifiedandfiniteheightuvyycjk5 == hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT) {
                    setalignment.addOnConfigurationChangedListener = 2;
                }
                float f2 = setalignment.addOnUserLeaveHintListener;
                if (f2 < 1.0f && hasspecifiedandfiniteheightuvyycjk6 == hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT) {
                    setalignment.addMenuProvider = 2;
                }
                if (setalignment.createFullyDrawnExecutor > 0.0f) {
                    hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk7 = hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT;
                    if (hasspecifiedandfiniteheightuvyycjk5 == hasspecifiedandfiniteheightuvyycjk7 && (hasspecifiedandfiniteheightuvyycjk6 == hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT || hasspecifiedandfiniteheightuvyycjk6 == hasSpecifiedAndFiniteHeightuvyYCjk.FIXED)) {
                        setalignment.addOnConfigurationChangedListener = 3;
                    } else if (hasspecifiedandfiniteheightuvyycjk6 == hasspecifiedandfiniteheightuvyycjk7 && (hasspecifiedandfiniteheightuvyycjk5 == hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT || hasspecifiedandfiniteheightuvyycjk5 == hasSpecifiedAndFiniteHeightuvyYCjk.FIXED)) {
                        setalignment.addMenuProvider = 3;
                    } else if (hasspecifiedandfiniteheightuvyycjk5 == hasspecifiedandfiniteheightuvyycjk7 && hasspecifiedandfiniteheightuvyycjk6 == hasspecifiedandfiniteheightuvyycjk7) {
                        if (setalignment.addOnConfigurationChangedListener == 0) {
                            setalignment.addOnConfigurationChangedListener = 3;
                        }
                        if (setalignment.addMenuProvider == 0) {
                            setalignment.addMenuProvider = 3;
                        }
                    }
                }
                hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk8 = hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT;
                hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk9 = (hasspecifiedandfiniteheightuvyycjk5 == hasspecifiedandfiniteheightuvyycjk8 && setalignment.addOnConfigurationChangedListener == 1 && (paintdefaultVar4.MediaSessionCompatQueueItem == null || paintdefaultVar3.MediaSessionCompatQueueItem == null)) ? hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT : hasspecifiedandfiniteheightuvyycjk5;
                if (hasspecifiedandfiniteheightuvyycjk6 == hasspecifiedandfiniteheightuvyycjk8 && setalignment.addMenuProvider == 1 && (paintdefaultVar2.MediaSessionCompatQueueItem == null || paintdefaultVar.MediaSessionCompatQueueItem == null)) {
                    hasspecifiedandfiniteheightuvyycjk6 = hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT;
                }
                hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk10 = hasspecifiedandfiniteheightuvyycjk6;
                component40d7_KjU component40d7_kju = setalignment.getOnBackPressedInput;
                component40d7_kju.MediaBrowserCompatMediaItem = hasspecifiedandfiniteheightuvyycjk9;
                int i = setalignment.addOnConfigurationChangedListener;
                component40d7_kju.MediaSessionCompatToken = i;
                copygNMxBKI copygnmxbki = setalignment.onCreatePanelMenu;
                copygnmxbki.MediaBrowserCompatMediaItem = hasspecifiedandfiniteheightuvyycjk10;
                int i2 = setalignment.addMenuProvider;
                copygnmxbki.MediaSessionCompatToken = i2;
                hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk11 = hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_PARENT;
                Iterator it2 = it;
                if ((hasspecifiedandfiniteheightuvyycjk9 == hasspecifiedandfiniteheightuvyycjk11 || hasspecifiedandfiniteheightuvyycjk9 == hasSpecifiedAndFiniteHeightuvyYCjk.FIXED || hasspecifiedandfiniteheightuvyycjk9 == hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT) && (hasspecifiedandfiniteheightuvyycjk10 == hasspecifiedandfiniteheightuvyycjk11 || hasspecifiedandfiniteheightuvyycjk10 == hasSpecifiedAndFiniteHeightuvyYCjk.FIXED || hasspecifiedandfiniteheightuvyycjk10 == hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT)) {
                    int iMediaSessionCompatQueueItem = setalignment.MediaSessionCompatQueueItem();
                    if (hasspecifiedandfiniteheightuvyycjk9 == hasspecifiedandfiniteheightuvyycjk11) {
                        iMediaSessionCompatQueueItem = (getuseintrinsicsize.MediaSessionCompatQueueItem() - paintdefaultVar4.IconCompatParcelizer) - paintdefaultVar3.IconCompatParcelizer;
                        hasspecifiedandfiniteheightuvyycjk = hasSpecifiedAndFiniteHeightuvyYCjk.FIXED;
                    } else {
                        hasspecifiedandfiniteheightuvyycjk = hasspecifiedandfiniteheightuvyycjk9;
                    }
                    int iMediaDescriptionCompat2 = setalignment.MediaDescriptionCompat();
                    if (hasspecifiedandfiniteheightuvyycjk10 == hasspecifiedandfiniteheightuvyycjk11) {
                        iMediaDescriptionCompat = (getuseintrinsicsize.MediaDescriptionCompat() - paintdefaultVar2.IconCompatParcelizer) - paintdefaultVar.IconCompatParcelizer;
                        hasspecifiedandfiniteheightuvyycjk2 = hasSpecifiedAndFiniteHeightuvyYCjk.FIXED;
                    } else {
                        iMediaDescriptionCompat = iMediaDescriptionCompat2;
                        hasspecifiedandfiniteheightuvyycjk2 = hasspecifiedandfiniteheightuvyycjk10;
                    }
                    serializer(setalignment, hasspecifiedandfiniteheightuvyycjk, iMediaSessionCompatQueueItem, hasspecifiedandfiniteheightuvyycjk2, iMediaDescriptionCompat);
                    setalignment.getOnBackPressedInput.MediaDescriptionCompat.IconCompatParcelizer(setalignment.MediaSessionCompatQueueItem());
                    setalignment.onCreatePanelMenu.MediaDescriptionCompat.IconCompatParcelizer(setalignment.MediaDescriptionCompat());
                    setalignment.onUserLeaveHint = true;
                } else if (hasspecifiedandfiniteheightuvyycjk9 == hasspecifiedandfiniteheightuvyycjk8 && (hasspecifiedandfiniteheightuvyycjk10 == (hasspecifiedandfiniteheightuvyycjk4 = hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT) || hasspecifiedandfiniteheightuvyycjk10 == hasSpecifiedAndFiniteHeightuvyYCjk.FIXED)) {
                    if (i == 3) {
                        if (hasspecifiedandfiniteheightuvyycjk10 == hasspecifiedandfiniteheightuvyycjk4) {
                            serializer(setalignment, hasspecifiedandfiniteheightuvyycjk4, 0, hasspecifiedandfiniteheightuvyycjk4, 0);
                        }
                        int iMediaDescriptionCompat3 = setalignment.MediaDescriptionCompat();
                        int i3 = (int) ((iMediaDescriptionCompat3 * setalignment.createFullyDrawnExecutor) + 0.5f);
                        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk12 = hasSpecifiedAndFiniteHeightuvyYCjk.FIXED;
                        serializer(setalignment, hasspecifiedandfiniteheightuvyycjk12, i3, hasspecifiedandfiniteheightuvyycjk12, iMediaDescriptionCompat3);
                        setalignment.getOnBackPressedInput.MediaDescriptionCompat.IconCompatParcelizer(setalignment.MediaSessionCompatQueueItem());
                        setalignment.onCreatePanelMenu.MediaDescriptionCompat.IconCompatParcelizer(setalignment.MediaDescriptionCompat());
                        setalignment.onUserLeaveHint = true;
                    } else if (i == 1) {
                        serializer(setalignment, hasspecifiedandfiniteheightuvyycjk4, 0, hasspecifiedandfiniteheightuvyycjk10, 0);
                        setalignment.getOnBackPressedInput.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper = setalignment.MediaSessionCompatQueueItem();
                    } else if (i == 2) {
                        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk13 = hasspecifiedandfiniteheightuvyycjkArr[0];
                        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk14 = hasSpecifiedAndFiniteHeightuvyYCjk.FIXED;
                        if (hasspecifiedandfiniteheightuvyycjk13 == hasspecifiedandfiniteheightuvyycjk14 || hasspecifiedandfiniteheightuvyycjk13 == hasspecifiedandfiniteheightuvyycjk11) {
                            serializer(setalignment, hasspecifiedandfiniteheightuvyycjk14, (int) ((f * getuseintrinsicsize.MediaSessionCompatQueueItem()) + 0.5f), hasspecifiedandfiniteheightuvyycjk10, setalignment.MediaDescriptionCompat());
                            setalignment.getOnBackPressedInput.MediaDescriptionCompat.IconCompatParcelizer(setalignment.MediaSessionCompatQueueItem());
                            setalignment.onCreatePanelMenu.MediaDescriptionCompat.IconCompatParcelizer(setalignment.MediaDescriptionCompat());
                            setalignment.onUserLeaveHint = true;
                        } else if (hasspecifiedandfiniteheightuvyycjk10 == hasspecifiedandfiniteheightuvyycjk8) {
                            if (hasspecifiedandfiniteheightuvyycjk9 == hasspecifiedandfiniteheightuvyycjk8) {
                                if (i != 1) {
                                    hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk15 = hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT;
                                    serializer(setalignment, hasspecifiedandfiniteheightuvyycjk15, 0, hasspecifiedandfiniteheightuvyycjk15, 0);
                                    setalignment.getOnBackPressedInput.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper = setalignment.MediaSessionCompatQueueItem();
                                    setalignment.onCreatePanelMenu.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper = setalignment.MediaDescriptionCompat();
                                } else {
                                    hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk16 = hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT;
                                    serializer(setalignment, hasspecifiedandfiniteheightuvyycjk16, 0, hasspecifiedandfiniteheightuvyycjk16, 0);
                                    setalignment.getOnBackPressedInput.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper = setalignment.MediaSessionCompatQueueItem();
                                    setalignment.onCreatePanelMenu.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper = setalignment.MediaDescriptionCompat();
                                }
                            }
                        } else if (hasspecifiedandfiniteheightuvyycjk9 == hasspecifiedandfiniteheightuvyycjk8) {
                            if (i != 1) {
                                hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk17 = hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT;
                                serializer(setalignment, hasspecifiedandfiniteheightuvyycjk17, 0, hasspecifiedandfiniteheightuvyycjk17, 0);
                                setalignment.getOnBackPressedInput.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper = setalignment.MediaSessionCompatQueueItem();
                                setalignment.onCreatePanelMenu.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper = setalignment.MediaDescriptionCompat();
                            } else {
                                hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk18 = hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT;
                                serializer(setalignment, hasspecifiedandfiniteheightuvyycjk18, 0, hasspecifiedandfiniteheightuvyycjk18, 0);
                                setalignment.getOnBackPressedInput.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper = setalignment.MediaSessionCompatQueueItem();
                                setalignment.onCreatePanelMenu.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper = setalignment.MediaDescriptionCompat();
                            }
                        }
                    } else if (paintdefaultVarArr[0].MediaSessionCompatQueueItem == null || paintdefaultVarArr[1].MediaSessionCompatQueueItem == null) {
                        serializer(setalignment, hasspecifiedandfiniteheightuvyycjk4, 0, hasspecifiedandfiniteheightuvyycjk10, 0);
                        setalignment.getOnBackPressedInput.MediaDescriptionCompat.IconCompatParcelizer(setalignment.MediaSessionCompatQueueItem());
                        setalignment.onCreatePanelMenu.MediaDescriptionCompat.IconCompatParcelizer(setalignment.MediaDescriptionCompat());
                        setalignment.onUserLeaveHint = true;
                    } else if (hasspecifiedandfiniteheightuvyycjk10 == hasspecifiedandfiniteheightuvyycjk8) {
                        if (hasspecifiedandfiniteheightuvyycjk9 == hasspecifiedandfiniteheightuvyycjk8) {
                            if (i != 1) {
                                hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk19 = hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT;
                                serializer(setalignment, hasspecifiedandfiniteheightuvyycjk19, 0, hasspecifiedandfiniteheightuvyycjk19, 0);
                                setalignment.getOnBackPressedInput.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper = setalignment.MediaSessionCompatQueueItem();
                                setalignment.onCreatePanelMenu.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper = setalignment.MediaDescriptionCompat();
                            } else {
                                hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk110 = hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT;
                                serializer(setalignment, hasspecifiedandfiniteheightuvyycjk110, 0, hasspecifiedandfiniteheightuvyycjk110, 0);
                                setalignment.getOnBackPressedInput.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper = setalignment.MediaSessionCompatQueueItem();
                                setalignment.onCreatePanelMenu.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper = setalignment.MediaDescriptionCompat();
                            }
                        }
                    } else if (hasspecifiedandfiniteheightuvyycjk9 == hasspecifiedandfiniteheightuvyycjk8) {
                        if (i != 1) {
                            hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk111 = hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT;
                            serializer(setalignment, hasspecifiedandfiniteheightuvyycjk111, 0, hasspecifiedandfiniteheightuvyycjk111, 0);
                            setalignment.getOnBackPressedInput.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper = setalignment.MediaSessionCompatQueueItem();
                            setalignment.onCreatePanelMenu.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper = setalignment.MediaDescriptionCompat();
                        } else {
                            hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk112 = hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT;
                            serializer(setalignment, hasspecifiedandfiniteheightuvyycjk112, 0, hasspecifiedandfiniteheightuvyycjk112, 0);
                            setalignment.getOnBackPressedInput.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper = setalignment.MediaSessionCompatQueueItem();
                            setalignment.onCreatePanelMenu.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper = setalignment.MediaDescriptionCompat();
                        }
                    }
                } else if (hasspecifiedandfiniteheightuvyycjk10 == hasspecifiedandfiniteheightuvyycjk8 || !(hasspecifiedandfiniteheightuvyycjk9 == (hasspecifiedandfiniteheightuvyycjk3 = hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT) || hasspecifiedandfiniteheightuvyycjk9 == hasSpecifiedAndFiniteHeightuvyYCjk.FIXED)) {
                    if (hasspecifiedandfiniteheightuvyycjk9 == hasspecifiedandfiniteheightuvyycjk8 && hasspecifiedandfiniteheightuvyycjk10 == hasspecifiedandfiniteheightuvyycjk8) {
                        if (i != 1 || i2 == 1) {
                            hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk113 = hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT;
                            serializer(setalignment, hasspecifiedandfiniteheightuvyycjk113, 0, hasspecifiedandfiniteheightuvyycjk113, 0);
                            setalignment.getOnBackPressedInput.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper = setalignment.MediaSessionCompatQueueItem();
                            setalignment.onCreatePanelMenu.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper = setalignment.MediaDescriptionCompat();
                        } else if (i2 == 2 && i == 2) {
                            hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk20 = hasspecifiedandfiniteheightuvyycjkArr[0];
                            hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk21 = hasSpecifiedAndFiniteHeightuvyYCjk.FIXED;
                            if (hasspecifiedandfiniteheightuvyycjk20 == hasspecifiedandfiniteheightuvyycjk21 && hasspecifiedandfiniteheightuvyycjkArr[1] == hasspecifiedandfiniteheightuvyycjk21) {
                                serializer(setalignment, hasspecifiedandfiniteheightuvyycjk21, (int) ((f * getuseintrinsicsize.MediaSessionCompatQueueItem()) + 0.5f), hasspecifiedandfiniteheightuvyycjk21, (int) ((f2 * getuseintrinsicsize.MediaDescriptionCompat()) + 0.5f));
                                setalignment.getOnBackPressedInput.MediaDescriptionCompat.IconCompatParcelizer(setalignment.MediaSessionCompatQueueItem());
                                setalignment.onCreatePanelMenu.MediaDescriptionCompat.IconCompatParcelizer(setalignment.MediaDescriptionCompat());
                                setalignment.onUserLeaveHint = true;
                            }
                        }
                    }
                } else if (i2 == 3) {
                    if (hasspecifiedandfiniteheightuvyycjk9 == hasspecifiedandfiniteheightuvyycjk3) {
                        serializer(setalignment, hasspecifiedandfiniteheightuvyycjk3, 0, hasspecifiedandfiniteheightuvyycjk3, 0);
                    }
                    int iMediaSessionCompatQueueItem2 = setalignment.MediaSessionCompatQueueItem();
                    float f3 = setalignment.createFullyDrawnExecutor;
                    if (setalignment.defaultViewModelProviderFactory_delegatelambda0 == -1) {
                        f3 = 1.0f / f3;
                    }
                    hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk22 = hasSpecifiedAndFiniteHeightuvyYCjk.FIXED;
                    serializer(setalignment, hasspecifiedandfiniteheightuvyycjk22, iMediaSessionCompatQueueItem2, hasspecifiedandfiniteheightuvyycjk22, (int) ((iMediaSessionCompatQueueItem2 * f3) + 0.5f));
                    setalignment.getOnBackPressedInput.MediaDescriptionCompat.IconCompatParcelizer(setalignment.MediaSessionCompatQueueItem());
                    setalignment.onCreatePanelMenu.MediaDescriptionCompat.IconCompatParcelizer(setalignment.MediaDescriptionCompat());
                    setalignment.onUserLeaveHint = true;
                } else if (i2 == 1) {
                    serializer(setalignment, hasspecifiedandfiniteheightuvyycjk9, 0, hasspecifiedandfiniteheightuvyycjk3, 0);
                    setalignment.onCreatePanelMenu.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper = setalignment.MediaDescriptionCompat();
                } else if (i2 == 2) {
                    hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk23 = hasspecifiedandfiniteheightuvyycjkArr[1];
                    hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk24 = hasSpecifiedAndFiniteHeightuvyYCjk.FIXED;
                    if (hasspecifiedandfiniteheightuvyycjk23 == hasspecifiedandfiniteheightuvyycjk24 || hasspecifiedandfiniteheightuvyycjk23 == hasspecifiedandfiniteheightuvyycjk11) {
                        serializer(setalignment, hasspecifiedandfiniteheightuvyycjk9, setalignment.MediaSessionCompatQueueItem(), hasspecifiedandfiniteheightuvyycjk24, (int) ((f2 * getuseintrinsicsize.MediaDescriptionCompat()) + 0.5f));
                        setalignment.getOnBackPressedInput.MediaDescriptionCompat.IconCompatParcelizer(setalignment.MediaSessionCompatQueueItem());
                        setalignment.onCreatePanelMenu.MediaDescriptionCompat.IconCompatParcelizer(setalignment.MediaDescriptionCompat());
                        setalignment.onUserLeaveHint = true;
                    } else if (hasspecifiedandfiniteheightuvyycjk9 == hasspecifiedandfiniteheightuvyycjk8) {
                        if (i != 1) {
                            hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk114 = hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT;
                            serializer(setalignment, hasspecifiedandfiniteheightuvyycjk114, 0, hasspecifiedandfiniteheightuvyycjk114, 0);
                            setalignment.getOnBackPressedInput.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper = setalignment.MediaSessionCompatQueueItem();
                            setalignment.onCreatePanelMenu.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper = setalignment.MediaDescriptionCompat();
                        } else {
                            hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk115 = hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT;
                            serializer(setalignment, hasspecifiedandfiniteheightuvyycjk115, 0, hasspecifiedandfiniteheightuvyycjk115, 0);
                            setalignment.getOnBackPressedInput.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper = setalignment.MediaSessionCompatQueueItem();
                            setalignment.onCreatePanelMenu.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper = setalignment.MediaDescriptionCompat();
                        }
                    }
                } else if (paintdefaultVarArr[2].MediaSessionCompatQueueItem == null || paintdefaultVarArr[3].MediaSessionCompatQueueItem == null) {
                    serializer(setalignment, hasspecifiedandfiniteheightuvyycjk3, 0, hasspecifiedandfiniteheightuvyycjk10, 0);
                    setalignment.getOnBackPressedInput.MediaDescriptionCompat.IconCompatParcelizer(setalignment.MediaSessionCompatQueueItem());
                    setalignment.onCreatePanelMenu.MediaDescriptionCompat.IconCompatParcelizer(setalignment.MediaDescriptionCompat());
                    setalignment.onUserLeaveHint = true;
                } else if (hasspecifiedandfiniteheightuvyycjk9 == hasspecifiedandfiniteheightuvyycjk8) {
                    if (i != 1) {
                        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk116 = hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT;
                        serializer(setalignment, hasspecifiedandfiniteheightuvyycjk116, 0, hasspecifiedandfiniteheightuvyycjk116, 0);
                        setalignment.getOnBackPressedInput.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper = setalignment.MediaSessionCompatQueueItem();
                        setalignment.onCreatePanelMenu.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper = setalignment.MediaDescriptionCompat();
                    } else {
                        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk117 = hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT;
                        serializer(setalignment, hasspecifiedandfiniteheightuvyycjk117, 0, hasspecifiedandfiniteheightuvyycjk117, 0);
                        setalignment.getOnBackPressedInput.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper = setalignment.MediaSessionCompatQueueItem();
                        setalignment.onCreatePanelMenu.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper = setalignment.MediaDescriptionCompat();
                    }
                }
                it = it2;
            }
        }
    }

    public void serializer(setAlignment setalignment, hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk, int i, hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk2, int i2) {
        RotateKt rotateKt = (RotateKt) this.MediaDescriptionCompat;
        rotateKt.read = hasspecifiedandfiniteheightuvyycjk;
        rotateKt.MediaBrowserCompatMediaItem = hasspecifiedandfiniteheightuvyycjk2;
        rotateKt.IconCompatParcelizer = i;
        rotateKt.MediaMetadataCompat = i2;
        ((rotate) this.MediaSessionCompatQueueItem).measure(setalignment, rotateKt);
        setalignment.MediaSessionCompatQueueItem(rotateKt.RatingCompat);
        setalignment.MediaMetadataCompat(rotateKt.MediaDescriptionCompat);
        setalignment.addObserverForBackInvokerlambda0 = rotateKt.write;
        setalignment.RatingCompat(rotateKt.serializer);
    }

    public void write(releaseGraphicsLayer releasegraphicslayer, int i, ArrayList arrayList, createBlock createblock) {
        component50d7_KjU component50d7_kju = releasegraphicslayer.MediaSessionCompatQueueItem;
        createBlock createblock2 = component50d7_kju.MediaSessionCompatQueueItem;
        releaseGraphicsLayer releasegraphicslayer2 = component50d7_kju.RemoteActionCompatParcelizer;
        releaseGraphicsLayer releasegraphicslayer3 = component50d7_kju.PlaybackStateCompatCustomAction;
        if (createblock2 == null) {
            getUseIntrinsicSize getuseintrinsicsize = (getUseIntrinsicSize) this.RatingCompat;
            if (component50d7_kju == getuseintrinsicsize.getOnBackPressedInput || component50d7_kju == getuseintrinsicsize.onCreatePanelMenu) {
                return;
            }
            if (createblock == null) {
                createblock = new createBlock(component50d7_kju);
                arrayList.add(createblock);
            }
            component50d7_kju.MediaSessionCompatQueueItem = createblock;
            createblock.write(component50d7_kju);
            for (releaseGraphicsLayers releasegraphicslayers : releasegraphicslayer3.RemoteActionCompatParcelizer) {
                if (releasegraphicslayers instanceof releaseGraphicsLayer) {
                    write((releaseGraphicsLayer) releasegraphicslayers, i, arrayList, createblock);
                }
            }
            for (releaseGraphicsLayers releasegraphicslayers2 : releasegraphicslayer2.RemoteActionCompatParcelizer) {
                if (releasegraphicslayers2 instanceof releaseGraphicsLayer) {
                    write((releaseGraphicsLayer) releasegraphicslayers2, i, arrayList, createblock);
                }
            }
            if (i == 1 && (component50d7_kju instanceof copygNMxBKI)) {
                for (releaseGraphicsLayers releasegraphicslayers3 : ((copygNMxBKI) component50d7_kju).IconCompatParcelizer.RemoteActionCompatParcelizer) {
                    if (releasegraphicslayers3 instanceof releaseGraphicsLayer) {
                        write((releaseGraphicsLayer) releasegraphicslayers3, i, arrayList, createblock);
                    }
                }
            }
            Iterator it = releasegraphicslayer3.MediaMetadataCompat.iterator();
            while (it.hasNext()) {
                write((releaseGraphicsLayer) it.next(), i, arrayList, createblock);
            }
            Iterator it2 = releasegraphicslayer2.MediaMetadataCompat.iterator();
            while (it2.hasNext()) {
                write((releaseGraphicsLayer) it2.next(), i, arrayList, createblock);
            }
            if (i == 1 && (component50d7_kju instanceof copygNMxBKI)) {
                Iterator it3 = ((copygNMxBKI) component50d7_kju).IconCompatParcelizer.MediaMetadataCompat.iterator();
                while (it3.hasNext()) {
                    write((releaseGraphicsLayer) it3.next(), i, arrayList, createblock);
                }
            }
        }
    }

    public String toString() {
        if (this.IconCompatParcelizer != 0) {
            return super.toString();
        }
        Map map = (Map) this.write;
        Long l = (Long) this.MediaDescriptionCompat;
        Long l2 = (Long) this.MediaSessionCompatQueueItem;
        Long l3 = (Long) this.RemoteActionCompatParcelizer;
        Long l4 = (Long) this.MediaBrowserCompatMediaItem;
        ArrayList arrayList = new ArrayList();
        if (this.serializer) {
            arrayList.add("isRegularFile");
        }
        if (this.read) {
            arrayList.add("isDirectory");
        }
        if (l4 != null) {
            arrayList.add("byteCount=" + l4.longValue());
        }
        if (l3 != null) {
            arrayList.add("createdAt=" + l3.longValue());
        }
        if (l2 != null) {
            arrayList.add("lastModifiedAt=" + l2.longValue());
        }
        if (l != null) {
            arrayList.add("lastAccessedAt=" + l.longValue());
        }
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return onContentCardDismissed.IconCompatParcelizer(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }

    public ThumbFetcher(boolean z, boolean z2, RecyclableBufferedInputStream recyclableBufferedInputStream, Long l, Long l2, Long l3, Long l4, Map map) {
        this.IconCompatParcelizer = 0;
        map.getClass();
        this.serializer = z;
        this.read = z2;
        this.RatingCompat = recyclableBufferedInputStream;
        this.MediaBrowserCompatMediaItem = l;
        this.RemoteActionCompatParcelizer = l2;
        this.MediaSessionCompatQueueItem = l3;
        this.MediaDescriptionCompat = l4;
        this.write = onMove.serializer(map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThumbFetcher(boolean z, boolean z2, RecyclableBufferedInputStream recyclableBufferedInputStream, Long l, Long l2, Long l3, Long l4) {
        this(z, z2, recyclableBufferedInputStream, l, l2, l3, l4, SimpleItemTouchHelperCallback.serializer);
        this.IconCompatParcelizer = 0;
    }
}
