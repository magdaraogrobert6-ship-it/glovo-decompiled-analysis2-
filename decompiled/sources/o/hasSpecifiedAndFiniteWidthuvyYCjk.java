package o;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class hasSpecifiedAndFiniteWidthuvyYCjk extends scale {
    public setAlignment[] write;
    public int ParcelableVolumeInfo = -1;
    public int registerForActivityResult = -1;
    public int MediaMetadataCompat = -1;
    public int MediaDescriptionCompat = -1;
    public int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = -1;
    public int r8lambda54BeH8ZsBru0CXI2CCSP2syNys = -1;
    public float PlaybackStateCompatCustomAction = 0.5f;
    public float removeOnConfigurationChangedListener = 0.5f;
    public float MediaBrowserCompatMediaItem = 0.5f;
    public float RatingCompat = 0.5f;
    public float MediaSessionCompatToken = 0.5f;
    public float ResultReceiver = 0.5f;
    public int PlaybackStateCompat = 0;
    public int peekAvailableContext = 0;
    public int MediaSessionCompatResultReceiverWrapper = 2;
    public int r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = 2;
    public int removeMenuProvider = 0;
    public int ComponentActivity = -1;
    public int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 0;
    public final ArrayList read = new ArrayList();
    public setAlignment[] serializer = null;
    public setAlignment[] RemoteActionCompatParcelizer = null;
    public int[] IconCompatParcelizer = null;
    public int MediaSessionCompatQueueItem = 0;

    @Override // o.setAlignment
    public final void write(DrawWithContentElement drawWithContentElement, boolean z) {
        setAlignment setalignment;
        float f;
        int i;
        super.write(drawWithContentElement, z);
        getUseIntrinsicSize getuseintrinsicsize = this.getViewModelStore;
        boolean z2 = getuseintrinsicsize != null && getuseintrinsicsize.RatingCompat;
        int i2 = this.removeMenuProvider;
        ArrayList arrayList = this.read;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((setContentScale) arrayList.get(i3)).write(i3, z2, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((setContentScale) arrayList.get(i4)).write(i4, z2, i4 == size2 + (-1));
                        i4++;
                    }
                }
            } else if (this.IconCompatParcelizer != null && this.RemoteActionCompatParcelizer != null && this.serializer != null) {
                for (int i5 = 0; i5 < this.MediaSessionCompatQueueItem; i5++) {
                    this.write[i5].ResultReceiver();
                }
                int[] iArr = this.IconCompatParcelizer;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f2 = this.PlaybackStateCompatCustomAction;
                setAlignment setalignment2 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z2) {
                        i = (i6 - i8) - 1;
                        f = 1.0f - this.PlaybackStateCompatCustomAction;
                    } else {
                        f = f2;
                        i = i8;
                    }
                    setAlignment setalignment3 = this.RemoteActionCompatParcelizer[i];
                    if (setalignment3 != null) {
                        paintdefault paintdefaultVar = setalignment3.onBackPressedDispatcher_delegatelambda010;
                        if (setalignment3.onMultiWindowModeChanged != 8) {
                            if (i8 == 0) {
                                setalignment3.IconCompatParcelizer(paintdefaultVar, this.onBackPressedDispatcher_delegatelambda010, this.getLifecycleRegistry1);
                                setalignment3.menuHostHelperlambda0 = this.ParcelableVolumeInfo;
                                setalignment3.fullyDrawnReporter_delegatelambda0 = f;
                            }
                            if (i8 == i6 - 1) {
                                setalignment3.IconCompatParcelizer(setalignment3.invalidateMenu, this.invalidateMenu, this.startIntentSenderForResult);
                            }
                            if (i8 > 0 && setalignment2 != null) {
                                paintdefault paintdefaultVar2 = setalignment2.invalidateMenu;
                                setalignment3.IconCompatParcelizer(paintdefaultVar, paintdefaultVar2, this.PlaybackStateCompat);
                                setalignment2.IconCompatParcelizer(paintdefaultVar2, paintdefaultVar, 0);
                            }
                            setalignment2 = setalignment3;
                        }
                    }
                    i8++;
                    f2 = f;
                }
                for (int i9 = 0; i9 < i7; i9++) {
                    setAlignment setalignment4 = this.serializer[i9];
                    if (setalignment4 != null) {
                        paintdefault paintdefaultVar3 = setalignment4.onActivityResult;
                        if (setalignment4.onMultiWindowModeChanged != 8) {
                            if (i9 == 0) {
                                setalignment4.IconCompatParcelizer(paintdefaultVar3, this.onActivityResult, this.setContentView);
                                setalignment4.onCreate = this.registerForActivityResult;
                                setalignment4.onBackPressed = this.removeOnConfigurationChangedListener;
                            }
                            if (i9 == i7 - 1) {
                                setalignment4.IconCompatParcelizer(setalignment4.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs, this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs, this.reportFullyDrawn);
                            }
                            if (i9 > 0 && setalignment2 != null) {
                                paintdefault paintdefaultVar4 = setalignment2.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
                                setalignment4.IconCompatParcelizer(paintdefaultVar3, paintdefaultVar4, this.peekAvailableContext);
                                setalignment2.IconCompatParcelizer(paintdefaultVar4, paintdefaultVar3, 0);
                            }
                            setalignment2 = setalignment4;
                        }
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (int i11 = 0; i11 < i7; i11++) {
                        int i12 = (i11 * i6) + i10;
                        if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY == 1) {
                            i12 = (i10 * i7) + i11;
                        }
                        setAlignment[] setalignmentArr = this.write;
                        if (i12 < setalignmentArr.length && (setalignment = setalignmentArr[i12]) != null && setalignment.onMultiWindowModeChanged != 8) {
                            setAlignment setalignment5 = this.RemoteActionCompatParcelizer[i10];
                            setAlignment setalignment6 = this.serializer[i11];
                            if (setalignment != setalignment5) {
                                setalignment.IconCompatParcelizer(setalignment.onBackPressedDispatcher_delegatelambda010, setalignment5.onBackPressedDispatcher_delegatelambda010, 0);
                                setalignment.IconCompatParcelizer(setalignment.invalidateMenu, setalignment5.invalidateMenu, 0);
                            }
                            if (setalignment != setalignment6) {
                                setalignment.IconCompatParcelizer(setalignment.onActivityResult, setalignment6.onActivityResult, 0);
                                setalignment.IconCompatParcelizer(setalignment.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs, setalignment6.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((setContentScale) arrayList.get(0)).write(0, z2, true);
        }
        this.removeOnUserLeaveHintListener = false;
    }

    public final int IconCompatParcelizer(setAlignment setalignment, int i) {
        if (setalignment == null) {
            return 0;
        }
        hasSpecifiedAndFiniteHeightuvyYCjk[] hasspecifiedandfiniteheightuvyycjkArr = setalignment.addOnNewIntentListener;
        if (hasspecifiedandfiniteheightuvyycjkArr[1] == hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT) {
            int i2 = setalignment.addMenuProvider;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (setalignment.addOnUserLeaveHintListener * i);
                if (i3 != setalignment.MediaDescriptionCompat()) {
                    setalignment.getDefaultViewModelProviderFactory = true;
                    write(setalignment, hasspecifiedandfiniteheightuvyycjkArr[0], setalignment.MediaSessionCompatQueueItem(), hasSpecifiedAndFiniteHeightuvyYCjk.FIXED, i3);
                }
                return i3;
            }
            if (i2 == 1) {
                return setalignment.MediaDescriptionCompat();
            }
            if (i2 == 3) {
                return (int) ((setalignment.MediaSessionCompatQueueItem() * setalignment.createFullyDrawnExecutor) + 0.5f);
            }
        }
        return setalignment.MediaDescriptionCompat();
    }

    public final int RemoteActionCompatParcelizer(setAlignment setalignment, int i) {
        if (setalignment == null) {
            return 0;
        }
        hasSpecifiedAndFiniteHeightuvyYCjk[] hasspecifiedandfiniteheightuvyycjkArr = setalignment.addOnNewIntentListener;
        if (hasspecifiedandfiniteheightuvyycjkArr[0] == hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT) {
            int i2 = setalignment.addOnConfigurationChangedListener;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (setalignment.getLastCustomNonConfigurationInstance * i);
                if (i3 != setalignment.MediaSessionCompatQueueItem()) {
                    setalignment.getDefaultViewModelProviderFactory = true;
                    write(setalignment, hasSpecifiedAndFiniteHeightuvyYCjk.FIXED, i3, hasspecifiedandfiniteheightuvyycjkArr[1], setalignment.MediaDescriptionCompat());
                }
                return i3;
            }
            if (i2 == 1) {
                return setalignment.MediaSessionCompatQueueItem();
            }
            if (i2 == 3) {
                return (int) ((setalignment.MediaDescriptionCompat() * setalignment.createFullyDrawnExecutor) + 0.5f);
            }
        }
        return setalignment.MediaSessionCompatQueueItem();
    }

    /* JADX WARN: Code duplicated, block: B:398:0x0771  */
    /* JADX WARN: Code duplicated, block: B:399:0x0774 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:400:0x0776  */
    /* JADX WARN: Code duplicated, block: B:401:0x077d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:403:0x0780  */
    /* JADX WARN: Code duplicated, block: B:406:0x078f  */
    /* JADX WARN: Code duplicated, block: B:407:0x0791  */
    /* JADX WARN: Code duplicated, block: B:77:0x010e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.scale
    public final void RemoteActionCompatParcelizer(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        setAlignment[] setalignmentArr;
        int[] iArr;
        int i8;
        int i9;
        int i10;
        int i11;
        setContentScale setcontentscale;
        int i12;
        char c;
        boolean z;
        int i13;
        int i14;
        int i15;
        int i16;
        setAlignment setalignment;
        int i17;
        int iCeil;
        Object obj;
        setAlignment setalignment2;
        int i18;
        setAlignment setalignment3;
        int i19;
        int i20;
        setAlignment setalignment4;
        setContentScale setcontentscale2;
        int i21;
        int i22;
        if (this.removeOnMultiWindowModeChangedListener > 0) {
            getUseIntrinsicSize getuseintrinsicsize = this.getViewModelStore;
            rotate rotateVar = getuseintrinsicsize != null ? getuseintrinsicsize.MediaSessionCompatResultReceiverWrapper : null;
            if (rotateVar == null) {
                this.removeOnPictureInPictureModeChangedListener = 0;
                this.removeOnPictureInPictureUiStateChangedListener = 0;
                this.removeOnUserLeaveHintListener = false;
                return;
            }
            for (int i23 = 0; i23 < this.removeOnMultiWindowModeChangedListener; i23++) {
                setAlignment setalignment5 = this.removeOnContextAvailableListener[i23];
                if (setalignment5 != null && !(setalignment5 instanceof setSizeToIntrinsics)) {
                    hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjkIconCompatParcelizer = setalignment5.IconCompatParcelizer(0);
                    hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjkIconCompatParcelizer2 = setalignment5.IconCompatParcelizer(1);
                    hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk = hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT;
                    if (hasspecifiedandfiniteheightuvyycjkIconCompatParcelizer != hasspecifiedandfiniteheightuvyycjk || setalignment5.addOnConfigurationChangedListener == 1 || hasspecifiedandfiniteheightuvyycjkIconCompatParcelizer2 != hasspecifiedandfiniteheightuvyycjk || setalignment5.addMenuProvider == 1) {
                        if (hasspecifiedandfiniteheightuvyycjkIconCompatParcelizer == hasspecifiedandfiniteheightuvyycjk) {
                            hasspecifiedandfiniteheightuvyycjkIconCompatParcelizer = hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT;
                        }
                        if (hasspecifiedandfiniteheightuvyycjkIconCompatParcelizer2 == hasspecifiedandfiniteheightuvyycjk) {
                            hasspecifiedandfiniteheightuvyycjkIconCompatParcelizer2 = hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT;
                        }
                        RotateKt rotateKt = this.removeOnTrimMemoryListener;
                        rotateKt.read = hasspecifiedandfiniteheightuvyycjkIconCompatParcelizer;
                        rotateKt.MediaBrowserCompatMediaItem = hasspecifiedandfiniteheightuvyycjkIconCompatParcelizer2;
                        rotateKt.IconCompatParcelizer = setalignment5.MediaSessionCompatQueueItem();
                        rotateKt.MediaMetadataCompat = setalignment5.MediaDescriptionCompat();
                        rotateVar.measure(setalignment5, rotateKt);
                        setalignment5.MediaSessionCompatQueueItem(rotateKt.RatingCompat);
                        setalignment5.MediaMetadataCompat(rotateKt.MediaDescriptionCompat);
                        setalignment5.RatingCompat(rotateKt.serializer);
                    }
                }
            }
        }
        int i24 = this.getLifecycleRegistry1;
        int i25 = this.startIntentSenderForResult;
        int i26 = this.setContentView;
        int i27 = this.reportFullyDrawn;
        int[] iArr2 = new int[2];
        int i28 = (i2 - i24) - i25;
        int i29 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (i29 == 1) {
            i28 = (i4 - i26) - i27;
        }
        int i30 = this.ParcelableVolumeInfo;
        if (i29 == 0) {
            if (i30 == -1) {
                this.ParcelableVolumeInfo = 0;
            }
            if (this.registerForActivityResult == -1) {
                this.registerForActivityResult = 0;
            }
        } else {
            if (i30 == -1) {
                this.ParcelableVolumeInfo = 0;
            }
            if (this.registerForActivityResult == -1) {
                this.registerForActivityResult = 0;
            }
        }
        setAlignment[] setalignmentArr2 = this.removeOnContextAvailableListener;
        int i31 = 0;
        int i32 = 0;
        while (true) {
            i5 = this.removeOnMultiWindowModeChangedListener;
            if (i31 >= i5) {
                break;
            }
            if (this.removeOnContextAvailableListener[i31].onMultiWindowModeChanged == 8) {
                i32++;
            }
            i31++;
        }
        if (i32 > 0) {
            setAlignment[] setalignmentArr3 = new setAlignment[i5 - i32];
            int i33 = 0;
            int i34 = 0;
            while (i33 < this.removeOnMultiWindowModeChangedListener) {
                setAlignment setalignment6 = this.removeOnContextAvailableListener[i33];
                int i35 = i28;
                if (setalignment6.onMultiWindowModeChanged != 8) {
                    setalignmentArr3[i34] = setalignment6;
                    i34++;
                }
                i33++;
                i28 = i35;
            }
            i6 = i28;
            setalignmentArr = setalignmentArr3;
            i7 = i34;
        } else {
            i6 = i28;
            i7 = i5;
            setalignmentArr = setalignmentArr2;
        }
        this.write = setalignmentArr;
        this.MediaSessionCompatQueueItem = i7;
        int i36 = this.removeMenuProvider;
        ArrayList arrayList = this.read;
        if (i36 != 0) {
            hasSpecifiedAndFiniteHeightuvyYCjk[] hasspecifiedandfiniteheightuvyycjkArr = this.addOnNewIntentListener;
            paintdefault paintdefaultVar = this.onActivityResult;
            paintdefault paintdefaultVar2 = this.onBackPressedDispatcher_delegatelambda010;
            paintdefault paintdefaultVar3 = this.invalidateMenu;
            paintdefault paintdefaultVar4 = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
            if (i36 == 1) {
                ArrayList arrayList2 = arrayList;
                iArr = iArr2;
                i8 = i27;
                i9 = i26;
                i10 = i25;
                i11 = i24;
                int i37 = i6;
                int i38 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                if (i7 != 0) {
                    arrayList2.clear();
                    setContentScale setcontentscale3 = new setContentScale(this, i38, this.onBackPressedDispatcher_delegatelambda010, this.onActivityResult, this.invalidateMenu, this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs, i37);
                    arrayList2.add(setcontentscale3);
                    if (i38 == 0) {
                        i14 = 0;
                        int i39 = 0;
                        int i40 = 0;
                        while (i40 < i7) {
                            setAlignment setalignment7 = setalignmentArr[i40];
                            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(setalignment7, i37);
                            if (setalignment7.addOnNewIntentListener[0] == hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT) {
                                i14++;
                            }
                            int i41 = i14;
                            boolean z2 = (i39 == i37 || (this.PlaybackStateCompat + i39) + iRemoteActionCompatParcelizer > i37) && setcontentscale3.IconCompatParcelizer != null;
                            if ((!z2 && i40 > 0 && (i17 = this.ComponentActivity) > 0 && i40 % i17 == 0) || z2) {
                                int i42 = i38;
                                i16 = i38;
                                setalignment = setalignment7;
                                setcontentscale3 = new setContentScale(this, i42, this.onBackPressedDispatcher_delegatelambda010, this.onActivityResult, this.invalidateMenu, this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs, i37);
                                setcontentscale3.PlaybackStateCompat = i40;
                                arrayList2.add(setcontentscale3);
                            } else {
                                i16 = i38;
                                setalignment = setalignment7;
                                if (i40 > 0) {
                                    i39 = this.PlaybackStateCompat + iRemoteActionCompatParcelizer + i39;
                                }
                                setcontentscale3.write(setalignment);
                                i40++;
                                i14 = i41;
                                i38 = i16;
                            }
                            i39 = iRemoteActionCompatParcelizer;
                            setcontentscale3.write(setalignment);
                            i40++;
                            i14 = i41;
                            i38 = i16;
                        }
                        i13 = i38;
                    } else {
                        i13 = i38;
                        i14 = 0;
                        int i43 = 0;
                        int i44 = 0;
                        while (i44 < i7) {
                            setAlignment setalignment8 = setalignmentArr[i44];
                            int iIconCompatParcelizer = IconCompatParcelizer(setalignment8, i37);
                            if (setalignment8.addOnNewIntentListener[1] == hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT) {
                                i14++;
                            }
                            int i45 = i14;
                            boolean z3 = (i43 == i37 || (this.peekAvailableContext + i43) + iIconCompatParcelizer > i37) && setcontentscale3.IconCompatParcelizer != null;
                            if ((!z3 && i44 > 0 && (i15 = this.ComponentActivity) > 0 && i44 % i15 == 0) || z3) {
                                setcontentscale3 = new setContentScale(this, i13, this.onBackPressedDispatcher_delegatelambda010, this.onActivityResult, this.invalidateMenu, this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs, i37);
                                setcontentscale3.PlaybackStateCompat = i44;
                                arrayList2.add(setcontentscale3);
                            } else {
                                if (i44 > 0) {
                                    i43 = this.peekAvailableContext + iIconCompatParcelizer + i43;
                                }
                                setcontentscale3.write(setalignment8);
                                i44++;
                                i14 = i45;
                            }
                            i43 = iIconCompatParcelizer;
                            setcontentscale3.write(setalignment8);
                            i44++;
                            i14 = i45;
                        }
                    }
                    int size = arrayList2.size();
                    int i46 = this.getLifecycleRegistry1;
                    int i47 = this.setContentView;
                    int i48 = this.startIntentSenderForResult;
                    int i49 = this.reportFullyDrawn;
                    hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk2 = hasspecifiedandfiniteheightuvyycjkArr[0];
                    hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk3 = hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT;
                    boolean z4 = hasspecifiedandfiniteheightuvyycjk2 == hasspecifiedandfiniteheightuvyycjk3 || hasspecifiedandfiniteheightuvyycjkArr[1] == hasspecifiedandfiniteheightuvyycjk3;
                    if (i14 > 0 && z4) {
                        for (int i50 = 0; i50 < size; i50++) {
                            setContentScale setcontentscale4 = (setContentScale) arrayList2.get(i50);
                            if (i13 == 0) {
                                setcontentscale4.read(i37 - setcontentscale4.IconCompatParcelizer());
                            } else {
                                setcontentscale4.read(i37 - setcontentscale4.serializer());
                            }
                        }
                    }
                    int i51 = i47;
                    paintdefault paintdefaultVar5 = paintdefaultVar2;
                    paintdefault paintdefaultVar6 = paintdefaultVar3;
                    paintdefault paintdefaultVar7 = paintdefaultVar4;
                    int i52 = 0;
                    int i53 = 0;
                    int i54 = 0;
                    int i55 = i46;
                    paintdefault paintdefaultVar8 = paintdefaultVar;
                    while (i52 < size) {
                        setContentScale setcontentscale5 = (setContentScale) arrayList2.get(i52);
                        if (i13 == 0) {
                            if (i52 < size - 1) {
                                paintdefaultVar7 = ((setContentScale) arrayList2.get(i52 + 1)).IconCompatParcelizer.onActivityResult;
                                i49 = 0;
                            } else {
                                i49 = this.reportFullyDrawn;
                                paintdefaultVar7 = paintdefaultVar4;
                            }
                            paintdefault paintdefaultVar9 = setcontentscale5.IconCompatParcelizer.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
                            setcontentscale5.IconCompatParcelizer(i13, paintdefaultVar5, paintdefaultVar8, paintdefaultVar6, paintdefaultVar7, i55, i51, i48, i49, i37);
                            int iMax = Math.max(i53, setcontentscale5.IconCompatParcelizer());
                            int iSerializer = setcontentscale5.serializer() + i54;
                            if (i52 > 0) {
                                iSerializer += this.peekAvailableContext;
                            }
                            i53 = iMax;
                            i54 = iSerializer;
                            paintdefaultVar8 = paintdefaultVar9;
                            arrayList2 = arrayList2;
                            i51 = 0;
                            size = size;
                        } else {
                            ArrayList arrayList3 = arrayList2;
                            if (i52 < size - 1) {
                                arrayList2 = arrayList3;
                                paintdefaultVar6 = ((setContentScale) arrayList2.get(i52 + 1)).IconCompatParcelizer.onBackPressedDispatcher_delegatelambda010;
                                i48 = 0;
                            } else {
                                arrayList2 = arrayList3;
                                i48 = this.startIntentSenderForResult;
                                paintdefaultVar6 = paintdefaultVar3;
                            }
                            paintdefault paintdefaultVar10 = setcontentscale5.IconCompatParcelizer.invalidateMenu;
                            setcontentscale5.IconCompatParcelizer(i13, paintdefaultVar5, paintdefaultVar8, paintdefaultVar6, paintdefaultVar7, i55, i51, i48, i49, i37);
                            int iIconCompatParcelizer2 = setcontentscale5.IconCompatParcelizer() + i53;
                            int iMax2 = Math.max(i54, setcontentscale5.serializer());
                            if (i52 > 0) {
                                iIconCompatParcelizer2 += this.PlaybackStateCompat;
                            }
                            i53 = iIconCompatParcelizer2;
                            paintdefaultVar5 = paintdefaultVar10;
                            i54 = iMax2;
                            i55 = 0;
                        }
                        i52++;
                        size = size;
                    }
                    iArr[0] = i53;
                    iArr[1] = i54;
                }
            } else if (i36 == 2) {
                iArr = iArr2;
                i8 = i27;
                i9 = i26;
                i10 = i25;
                i11 = i24;
                int i56 = i6;
                int i57 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                int iCeil2 = this.ComponentActivity;
                if (i57 == 0) {
                    if (iCeil2 <= 0) {
                        iCeil2 = 0;
                        int i58 = 0;
                        for (int i59 = 0; i59 < i7; i59++) {
                            if (i59 > 0) {
                                i58 += this.PlaybackStateCompat;
                            }
                            setAlignment setalignment9 = setalignmentArr[i59];
                            if (setalignment9 != null) {
                                int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(setalignment9, i56) + i58;
                                if (iRemoteActionCompatParcelizer2 > i56) {
                                    break;
                                }
                                iCeil2++;
                                i58 = iRemoteActionCompatParcelizer2;
                            }
                        }
                    }
                    iCeil = iCeil2;
                    iCeil2 = 0;
                } else {
                    if (iCeil2 <= 0) {
                        int i60 = 0;
                        int i61 = 0;
                        for (int i62 = 0; i62 < i7; i62++) {
                            if (i62 > 0) {
                                i60 += this.peekAvailableContext;
                            }
                            setAlignment setalignment10 = setalignmentArr[i62];
                            if (setalignment10 != null) {
                                int iIconCompatParcelizer3 = IconCompatParcelizer(setalignment10, i56) + i60;
                                if (iIconCompatParcelizer3 > i56) {
                                    break;
                                }
                                i61++;
                                i60 = iIconCompatParcelizer3;
                            }
                        }
                        iCeil2 = i61;
                    }
                    iCeil = 0;
                }
                if (this.IconCompatParcelizer == null) {
                    this.IconCompatParcelizer = new int[2];
                }
                boolean z5 = (iCeil2 == 0 && i57 == 1) || (iCeil == 0 && i57 == 0);
                while (!z5) {
                    if (i57 == 0) {
                        iCeil2 = (int) Math.ceil(i7 / iCeil);
                    } else {
                        iCeil = (int) Math.ceil(i7 / iCeil2);
                    }
                    setAlignment[] setalignmentArr4 = this.RemoteActionCompatParcelizer;
                    if (setalignmentArr4 != null && setalignmentArr4.length >= iCeil) {
                        obj = null;
                        Arrays.fill(setalignmentArr4, (Object) null);
                    } else {
                        obj = null;
                        this.RemoteActionCompatParcelizer = new setAlignment[iCeil];
                    }
                    setAlignment[] setalignmentArr5 = this.serializer;
                    if (setalignmentArr5 != null && setalignmentArr5.length >= iCeil2) {
                        Arrays.fill(setalignmentArr5, obj);
                    } else {
                        this.serializer = new setAlignment[iCeil2];
                    }
                    for (int i63 = 0; i63 < iCeil; i63++) {
                        for (int i64 = 0; i64 < iCeil2; i64++) {
                            int i65 = (i64 * iCeil) + i63;
                            if (i57 == 1) {
                                i65 = (i63 * iCeil2) + i64;
                            }
                            if (i65 < setalignmentArr.length && (setalignment2 = setalignmentArr[i65]) != null) {
                                int iRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(setalignment2, i56);
                                setAlignment setalignment11 = this.RemoteActionCompatParcelizer[i63];
                                if (setalignment11 == null || setalignment11.MediaSessionCompatQueueItem() < iRemoteActionCompatParcelizer3) {
                                    this.RemoteActionCompatParcelizer[i63] = setalignment2;
                                }
                                int iIconCompatParcelizer4 = IconCompatParcelizer(setalignment2, i56);
                                setAlignment setalignment12 = this.serializer[i64];
                                if (setalignment12 == null || setalignment12.MediaDescriptionCompat() < iIconCompatParcelizer4) {
                                    this.serializer[i64] = setalignment2;
                                }
                            }
                        }
                    }
                    int iRemoteActionCompatParcelizer4 = 0;
                    for (int i66 = 0; i66 < iCeil; i66++) {
                        setAlignment setalignment13 = this.RemoteActionCompatParcelizer[i66];
                        if (setalignment13 != null) {
                            if (i66 > 0) {
                                iRemoteActionCompatParcelizer4 += this.PlaybackStateCompat;
                            }
                            iRemoteActionCompatParcelizer4 = RemoteActionCompatParcelizer(setalignment13, i56) + iRemoteActionCompatParcelizer4;
                        }
                    }
                    int iIconCompatParcelizer5 = 0;
                    for (int i67 = 0; i67 < iCeil2; i67++) {
                        setAlignment setalignment14 = this.serializer[i67];
                        if (setalignment14 != null) {
                            if (i67 > 0) {
                                iIconCompatParcelizer5 += this.peekAvailableContext;
                            }
                            iIconCompatParcelizer5 = IconCompatParcelizer(setalignment14, i56) + iIconCompatParcelizer5;
                        }
                    }
                    iArr[0] = iRemoteActionCompatParcelizer4;
                    iArr[1] = iIconCompatParcelizer5;
                    if (i57 == 0) {
                        if (iRemoteActionCompatParcelizer4 <= i56 || iCeil <= 1) {
                            z5 = true;
                        } else {
                            iCeil--;
                        }
                    } else if (iIconCompatParcelizer5 <= i56 || iCeil2 <= 1) {
                        z5 = true;
                    } else {
                        iCeil2--;
                    }
                }
                int[] iArr3 = this.IconCompatParcelizer;
                iArr3[0] = iCeil;
                iArr3[1] = iCeil2;
                c = 1;
                i12 = 0;
            } else if (i36 != 3) {
                iArr = iArr2;
                i8 = i27;
                i9 = i26;
                i10 = i25;
                i11 = i24;
            } else {
                int i68 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                if (i7 == 0) {
                    iArr = iArr2;
                    i8 = i27;
                    i9 = i26;
                    i10 = i25;
                    i11 = i24;
                } else {
                    arrayList.clear();
                    int i69 = i6;
                    ArrayList arrayList4 = arrayList;
                    iArr = iArr2;
                    i8 = i27;
                    i9 = i26;
                    i10 = i25;
                    setContentScale setcontentscale6 = new setContentScale(this, i68, this.onBackPressedDispatcher_delegatelambda010, this.onActivityResult, this.invalidateMenu, this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs, i69);
                    arrayList4.add(setcontentscale6);
                    if (i68 == 0) {
                        i18 = 0;
                        int i70 = 0;
                        int i71 = 0;
                        int i72 = 0;
                        while (i72 < i7) {
                            i70++;
                            setAlignment setalignment15 = setalignmentArr[i72];
                            int i73 = i69;
                            int iRemoteActionCompatParcelizer5 = RemoteActionCompatParcelizer(setalignment15, i73);
                            if (setalignment15.addOnNewIntentListener[0] == hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT) {
                                i18++;
                            }
                            int i74 = i18;
                            boolean z6 = (i71 == i73 || (this.PlaybackStateCompat + i71) + iRemoteActionCompatParcelizer5 > i73) && setcontentscale6.IconCompatParcelizer != null;
                            if ((!z6 && i72 > 0 && (i22 = this.ComponentActivity) > 0 && i70 > i22) || z6) {
                                i69 = i73;
                                i21 = i72;
                                setContentScale setcontentscale7 = new setContentScale(this, i68, this.onBackPressedDispatcher_delegatelambda010, this.onActivityResult, this.invalidateMenu, this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs, i69);
                                setcontentscale7.PlaybackStateCompat = i21;
                                arrayList4.add(setcontentscale7);
                                setcontentscale2 = setcontentscale7;
                                i71 = iRemoteActionCompatParcelizer5;
                                setalignment4 = setalignment15;
                                i70 = 1;
                            } else {
                                i69 = i73;
                                setalignment4 = setalignment15;
                                setcontentscale2 = setcontentscale6;
                                i21 = i72;
                                i71 = i21 > 0 ? this.PlaybackStateCompat + iRemoteActionCompatParcelizer5 + i71 : iRemoteActionCompatParcelizer5;
                            }
                            setcontentscale2.write(setalignment4);
                            i72 = i21 + 1;
                            setcontentscale6 = setcontentscale2;
                            i18 = i74;
                        }
                    } else {
                        i18 = 0;
                        int i75 = 0;
                        int i76 = 0;
                        int i77 = 0;
                        while (i77 < i7) {
                            i75++;
                            setAlignment setalignment16 = setalignmentArr[i77];
                            int i78 = i69;
                            int iIconCompatParcelizer6 = IconCompatParcelizer(setalignment16, i78);
                            if (setalignment16.addOnNewIntentListener[1] == hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT) {
                                i18++;
                            }
                            int i79 = i18;
                            boolean z7 = (i76 == i78 || (this.peekAvailableContext + i76) + iIconCompatParcelizer6 > i78) && setcontentscale6.IconCompatParcelizer != null;
                            if ((!z7 && i77 > 0 && (i19 = this.ComponentActivity) > 0 && i75 > i19) || z7) {
                                i69 = i78;
                                setContentScale setcontentscale8 = new setContentScale(this, i68, this.onBackPressedDispatcher_delegatelambda010, this.onActivityResult, this.invalidateMenu, this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs, i69);
                                setcontentscale8.PlaybackStateCompat = i77;
                                arrayList4.add(setcontentscale8);
                                setalignment3 = setalignment16;
                                i76 = iIconCompatParcelizer6;
                                i75 = 1;
                                setcontentscale6 = setcontentscale8;
                            } else {
                                i69 = i78;
                                setalignment3 = setalignment16;
                                i76 = i77 > 0 ? this.peekAvailableContext + iIconCompatParcelizer6 + i76 : iIconCompatParcelizer6;
                            }
                            setcontentscale6.write(setalignment3);
                            i77++;
                            i18 = i79;
                        }
                    }
                    int size2 = arrayList4.size();
                    int i80 = this.getLifecycleRegistry1;
                    int i81 = this.setContentView;
                    int i82 = this.startIntentSenderForResult;
                    int i83 = this.reportFullyDrawn;
                    hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk4 = hasspecifiedandfiniteheightuvyycjkArr[0];
                    hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk5 = hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT;
                    boolean z8 = hasspecifiedandfiniteheightuvyycjk4 == hasspecifiedandfiniteheightuvyycjk5 || hasspecifiedandfiniteheightuvyycjkArr[1] == hasspecifiedandfiniteheightuvyycjk5;
                    if (i18 > 0 && z8) {
                        int i84 = 0;
                        while (i84 < size2) {
                            setContentScale setcontentscale9 = (setContentScale) arrayList4.get(i84);
                            if (i68 == 0) {
                                i20 = i69;
                                setcontentscale9.read(i20 - setcontentscale9.IconCompatParcelizer());
                            } else {
                                i20 = i69;
                                setcontentscale9.read(i20 - setcontentscale9.serializer());
                            }
                            i84++;
                            i69 = i20;
                        }
                    }
                    int i85 = i69;
                    int i86 = i81;
                    paintdefault paintdefaultVar11 = paintdefaultVar2;
                    paintdefault paintdefaultVar12 = paintdefaultVar3;
                    paintdefault paintdefaultVar13 = paintdefaultVar4;
                    int i87 = 0;
                    int i88 = 0;
                    int i89 = 0;
                    int i90 = i80;
                    paintdefault paintdefaultVar14 = paintdefaultVar;
                    while (i87 < size2) {
                        int i91 = i24;
                        setContentScale setcontentscale10 = (setContentScale) arrayList4.get(i87);
                        if (i68 == 0) {
                            if (i87 < size2 - 1) {
                                paintdefaultVar13 = ((setContentScale) arrayList4.get(i87 + 1)).IconCompatParcelizer.onActivityResult;
                                i83 = 0;
                            } else {
                                i83 = this.reportFullyDrawn;
                                paintdefaultVar13 = paintdefaultVar4;
                            }
                            paintdefault paintdefaultVar15 = setcontentscale10.IconCompatParcelizer.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
                            setcontentscale10.IconCompatParcelizer(i68, paintdefaultVar11, paintdefaultVar14, paintdefaultVar12, paintdefaultVar13, i90, i86, i82, i83, i85);
                            int iMax3 = Math.max(i88, setcontentscale10.IconCompatParcelizer());
                            int iSerializer2 = setcontentscale10.serializer() + i89;
                            if (i87 > 0) {
                                iSerializer2 += this.peekAvailableContext;
                            }
                            i88 = iMax3;
                            i89 = iSerializer2;
                            paintdefaultVar14 = paintdefaultVar15;
                            arrayList4 = arrayList4;
                            i86 = 0;
                            size2 = size2;
                        } else {
                            ArrayList arrayList5 = arrayList4;
                            if (i87 < size2 - 1) {
                                arrayList4 = arrayList5;
                                paintdefaultVar12 = ((setContentScale) arrayList4.get(i87 + 1)).IconCompatParcelizer.onBackPressedDispatcher_delegatelambda010;
                                i82 = 0;
                            } else {
                                arrayList4 = arrayList5;
                                i82 = this.startIntentSenderForResult;
                                paintdefaultVar12 = paintdefaultVar3;
                            }
                            paintdefault paintdefaultVar16 = setcontentscale10.IconCompatParcelizer.invalidateMenu;
                            setcontentscale10.IconCompatParcelizer(i68, paintdefaultVar11, paintdefaultVar14, paintdefaultVar12, paintdefaultVar13, i90, i86, i82, i83, i85);
                            int iIconCompatParcelizer7 = setcontentscale10.IconCompatParcelizer() + i88;
                            int iMax4 = Math.max(i89, setcontentscale10.serializer());
                            if (i87 > 0) {
                                iIconCompatParcelizer7 += this.PlaybackStateCompat;
                            }
                            i88 = iIconCompatParcelizer7;
                            paintdefaultVar11 = paintdefaultVar16;
                            i89 = iMax4;
                            i90 = 0;
                        }
                        i87++;
                        i24 = i91;
                        size2 = size2;
                    }
                    i11 = i24;
                    iArr[0] = i88;
                    iArr[1] = i89;
                }
            }
            i12 = 0;
            c = 1;
        } else {
            iArr = iArr2;
            i8 = i27;
            i9 = i26;
            i10 = i25;
            i11 = i24;
            int i92 = i6;
            int i93 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            if (i7 == 0) {
                i12 = 0;
                c = 1;
            } else {
                if (arrayList.size() == 0) {
                    setcontentscale = new setContentScale(this, i93, this.onBackPressedDispatcher_delegatelambda010, this.onActivityResult, this.invalidateMenu, this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs, i92);
                    arrayList.add(setcontentscale);
                } else {
                    setcontentscale = (setContentScale) arrayList.get(0);
                    setcontentscale.serializer = 0;
                    setcontentscale.IconCompatParcelizer = null;
                    setcontentscale.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 0;
                    setcontentscale.write = 0;
                    setcontentscale.PlaybackStateCompat = 0;
                    setcontentscale.RemoteActionCompatParcelizer = 0;
                    setcontentscale.RatingCompat = 0;
                    setcontentscale.IconCompatParcelizer(i93, this.onBackPressedDispatcher_delegatelambda010, this.onActivityResult, this.invalidateMenu, this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs, this.getLifecycleRegistry1, this.setContentView, this.startIntentSenderForResult, this.reportFullyDrawn, i92);
                }
                for (int i94 = 0; i94 < i7; i94++) {
                    setcontentscale.write(setalignmentArr[i94]);
                }
                i12 = 0;
                iArr[0] = setcontentscale.IconCompatParcelizer();
                c = 1;
                iArr[1] = setcontentscale.serializer();
            }
        }
        int iMin = iArr[i12] + i11 + i10;
        int iMin2 = iArr[c] + i9 + i8;
        if (i == 1073741824) {
            iMin = i2;
        } else if (i == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, i2);
        } else {
            if (i != 0) {
                iMin = i12;
            }
            if (i3 == 1073741824) {
                iMin2 = i4;
            } else if (i3 == -2147483648) {
                iMin2 = Math.min(iMin2, i4);
            } else if (i3 != 0) {
                iMin2 = i12;
            }
            this.removeOnPictureInPictureModeChangedListener = iMin;
            this.removeOnPictureInPictureUiStateChangedListener = iMin2;
            MediaSessionCompatQueueItem(iMin);
            MediaMetadataCompat(iMin2);
            if (this.removeOnMultiWindowModeChangedListener > 0) {
                z = c;
            } else {
                z = i12;
            }
            this.removeOnUserLeaveHintListener = z;
        }
        if (i3 == 1073741824) {
            iMin2 = i4;
        } else if (i3 == -2147483648) {
            iMin2 = Math.min(iMin2, i4);
        } else if (i3 != 0) {
            iMin2 = i12;
        }
        this.removeOnPictureInPictureModeChangedListener = iMin;
        this.removeOnPictureInPictureUiStateChangedListener = iMin2;
        MediaSessionCompatQueueItem(iMin);
        MediaMetadataCompat(iMin2);
        if (this.removeOnMultiWindowModeChangedListener > 0) {
            z = c;
        } else {
            z = i12;
        }
        this.removeOnUserLeaveHintListener = z;
    }
}
