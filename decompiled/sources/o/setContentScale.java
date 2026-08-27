package o;

/* JADX INFO: loaded from: classes.dex */
public final class setContentScale {
    public int MediaBrowserCompatMediaItem;
    public paintdefault MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public int MediaSessionCompatResultReceiverWrapper;
    public int MediaSessionCompatToken;
    public int ParcelableVolumeInfo;
    public paintdefault PlaybackStateCompatCustomAction;
    public paintdefault ResultReceiver;
    public final /* synthetic */ hasSpecifiedAndFiniteWidthuvyYCjk r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public paintdefault read;
    public setAlignment IconCompatParcelizer = null;
    public int serializer = 0;
    public int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 0;
    public int write = 0;
    public int PlaybackStateCompat = 0;
    public int RemoteActionCompatParcelizer = 0;
    public int RatingCompat = 0;

    public final int IconCompatParcelizer() {
        int i = this.MediaSessionCompatQueueItem;
        int i2 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        return i == 0 ? i2 - this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.PlaybackStateCompat : i2;
    }

    public final void IconCompatParcelizer(int i, paintdefault paintdefaultVar, paintdefault paintdefaultVar2, paintdefault paintdefaultVar3, paintdefault paintdefaultVar4, int i2, int i3, int i4, int i5, int i6) {
        this.MediaSessionCompatQueueItem = i;
        this.MediaDescriptionCompat = paintdefaultVar;
        this.ResultReceiver = paintdefaultVar2;
        this.PlaybackStateCompatCustomAction = paintdefaultVar3;
        this.read = paintdefaultVar4;
        this.ParcelableVolumeInfo = i2;
        this.MediaSessionCompatToken = i3;
        this.MediaSessionCompatResultReceiverWrapper = i4;
        this.MediaBrowserCompatMediaItem = i5;
        this.MediaMetadataCompat = i6;
    }

    public final int serializer() {
        int i = this.MediaSessionCompatQueueItem;
        int i2 = this.write;
        return i == 1 ? i2 - this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.peekAvailableContext : i2;
    }

    /* JADX WARN: Code duplicated, block: B:194:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:95:0x010e A[PHI: r7 r12
  0x010e: PHI (r7v29 int) = (r7v28 int), (r7v31 int) binds: [B:94:0x010c, B:87:0x00fe] A[DONT_GENERATE, DONT_INLINE]
  0x010e: PHI (r12v18 float) = (r12v17 float), (r12v22 float) binds: [B:94:0x010c, B:87:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    public final void write(int i, boolean z, boolean z2) {
        hasSpecifiedAndFiniteWidthuvyYCjk hasspecifiedandfinitewidthuvyycjk;
        int i2;
        float f;
        setAlignment setalignment;
        paintdefault paintdefaultVar;
        paintdefault paintdefaultVar2;
        char c;
        int i3;
        float f2;
        int i4;
        int i5 = this.RemoteActionCompatParcelizer;
        int i6 = 0;
        while (true) {
            hasspecifiedandfinitewidthuvyycjk = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            if (i6 >= i5 || (i4 = this.PlaybackStateCompat + i6) >= hasspecifiedandfinitewidthuvyycjk.MediaSessionCompatQueueItem) {
                break;
            }
            setAlignment setalignment2 = hasspecifiedandfinitewidthuvyycjk.write[i4];
            if (setalignment2 != null) {
                setalignment2.ResultReceiver();
            }
            i6++;
        }
        if (i5 == 0 || this.IconCompatParcelizer == null) {
            return;
        }
        boolean z3 = z2 && i == 0;
        int i7 = -1;
        int i8 = -1;
        for (int i9 = 0; i9 < i5; i9++) {
            int i10 = this.PlaybackStateCompat + (z ? (i5 - 1) - i9 : i9);
            if (i10 >= hasspecifiedandfinitewidthuvyycjk.MediaSessionCompatQueueItem) {
                break;
            }
            setAlignment setalignment3 = hasspecifiedandfinitewidthuvyycjk.write[i10];
            if (setalignment3 != null && setalignment3.onMultiWindowModeChanged == 0) {
                if (i7 == -1) {
                    i7 = i9;
                }
                i8 = i9;
            }
        }
        int i11 = this.MediaSessionCompatQueueItem;
        setAlignment setalignment4 = this.IconCompatParcelizer;
        if (i11 != 0) {
            setalignment4.menuHostHelperlambda0 = hasspecifiedandfinitewidthuvyycjk.ParcelableVolumeInfo;
            paintdefault paintdefaultVar3 = setalignment4.onBackPressedDispatcher_delegatelambda010;
            paintdefault paintdefaultVar4 = setalignment4.invalidateMenu;
            int i12 = this.ParcelableVolumeInfo;
            if (i > 0) {
                i12 += hasspecifiedandfinitewidthuvyycjk.PlaybackStateCompat;
            }
            if (z) {
                paintdefaultVar4.write(this.PlaybackStateCompatCustomAction, i12);
                if (z2) {
                    paintdefaultVar3.write(this.MediaDescriptionCompat, this.MediaSessionCompatResultReceiverWrapper);
                }
                if (i > 0) {
                    this.PlaybackStateCompatCustomAction.RatingCompat.onBackPressedDispatcher_delegatelambda010.write(paintdefaultVar4, 0);
                }
            } else {
                paintdefaultVar3.write(this.MediaDescriptionCompat, i12);
                if (z2) {
                    paintdefaultVar4.write(this.PlaybackStateCompatCustomAction, this.MediaSessionCompatResultReceiverWrapper);
                }
                if (i > 0) {
                    this.MediaDescriptionCompat.RatingCompat.invalidateMenu.write(paintdefaultVar3, 0);
                }
            }
            int i13 = i5;
            int i14 = 0;
            setAlignment setalignment5 = null;
            while (i14 < i13) {
                int i15 = this.PlaybackStateCompat + i14;
                if (i15 >= hasspecifiedandfinitewidthuvyycjk.MediaSessionCompatQueueItem) {
                    return;
                }
                setAlignment setalignment6 = hasspecifiedandfinitewidthuvyycjk.write[i15];
                if (setalignment6 == null) {
                    i13 = i13;
                    z3 = z3;
                    setalignment6 = setalignment5;
                } else {
                    paintdefault paintdefaultVar5 = setalignment6.onBackPressedDispatcher_delegatelambda010;
                    paintdefault paintdefaultVar6 = setalignment6.onActivityResult;
                    paintdefault paintdefaultVar7 = setalignment6.invalidateMenu;
                    if (i14 == 0) {
                        setalignment6.IconCompatParcelizer(paintdefaultVar6, this.ResultReceiver, this.MediaSessionCompatToken);
                        int i16 = hasspecifiedandfinitewidthuvyycjk.registerForActivityResult;
                        float f3 = hasspecifiedandfinitewidthuvyycjk.removeOnConfigurationChangedListener;
                        if (this.PlaybackStateCompat == 0 && (i2 = hasspecifiedandfinitewidthuvyycjk.MediaDescriptionCompat) != -1) {
                            f = hasspecifiedandfinitewidthuvyycjk.RatingCompat;
                        } else if (!z2 || (i2 = hasspecifiedandfinitewidthuvyycjk.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) == -1) {
                            i2 = i16;
                            f = f3;
                        } else {
                            f = hasspecifiedandfinitewidthuvyycjk.ResultReceiver;
                        }
                        setalignment6.onCreate = i2;
                        setalignment6.onBackPressed = f;
                    }
                    if (i14 == i13 - 1) {
                        setalignment6.IconCompatParcelizer(setalignment6.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs, this.read, this.MediaBrowserCompatMediaItem);
                    }
                    if (setalignment5 != null) {
                        paintdefault paintdefaultVar8 = setalignment5.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
                        paintdefaultVar6.write(paintdefaultVar8, hasspecifiedandfinitewidthuvyycjk.peekAvailableContext);
                        if (i14 == i7) {
                            int i17 = this.MediaSessionCompatToken;
                            if (paintdefaultVar6.IconCompatParcelizer()) {
                                paintdefaultVar6.RemoteActionCompatParcelizer = i17;
                            }
                        }
                        paintdefaultVar8.write(paintdefaultVar6, 0);
                        if (i14 == i8 + 1) {
                            int i18 = this.MediaBrowserCompatMediaItem;
                            if (paintdefaultVar8.IconCompatParcelizer()) {
                                paintdefaultVar8.RemoteActionCompatParcelizer = i18;
                            }
                        }
                    }
                    if (setalignment6 != setalignment4) {
                        int i19 = hasspecifiedandfinitewidthuvyycjk.MediaSessionCompatResultReceiverWrapper;
                        if (z) {
                            if (i19 == 0) {
                                paintdefaultVar7.write(paintdefaultVar4, 0);
                            } else if (i19 == 1) {
                                paintdefaultVar5.write(paintdefaultVar3, 0);
                            } else if (i19 == 2) {
                                paintdefaultVar5.write(paintdefaultVar3, 0);
                                paintdefaultVar7.write(paintdefaultVar4, 0);
                            }
                        } else if (i19 == 0) {
                            paintdefaultVar5.write(paintdefaultVar3, 0);
                        } else if (i19 == 1) {
                            paintdefaultVar7.write(paintdefaultVar4, 0);
                        } else if (i19 == 2) {
                            if (z3 != 0) {
                                paintdefaultVar5.write(this.MediaDescriptionCompat, this.ParcelableVolumeInfo);
                                paintdefaultVar7.write(this.PlaybackStateCompatCustomAction, this.MediaSessionCompatResultReceiverWrapper);
                            } else {
                                paintdefaultVar5.write(paintdefaultVar3, 0);
                                paintdefaultVar7.write(paintdefaultVar4, 0);
                            }
                        }
                    }
                    i14++;
                    setalignment5 = setalignment6;
                    z3 = z3;
                    i13 = i13;
                }
                i14++;
                setalignment5 = setalignment6;
                z3 = z3;
                i13 = i13;
            }
            return;
        }
        setalignment4.onCreate = hasspecifiedandfinitewidthuvyycjk.registerForActivityResult;
        paintdefault paintdefaultVar9 = setalignment4.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        paintdefault paintdefaultVar10 = setalignment4.onActivityResult;
        int i20 = this.MediaSessionCompatToken;
        if (i > 0) {
            i20 += hasspecifiedandfinitewidthuvyycjk.peekAvailableContext;
        }
        paintdefaultVar10.write(this.ResultReceiver, i20);
        if (z2) {
            paintdefaultVar9.write(this.read, this.MediaBrowserCompatMediaItem);
        }
        if (i > 0) {
            this.ResultReceiver.RatingCompat.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.write(paintdefaultVar10, 0);
        }
        if (hasspecifiedandfinitewidthuvyycjk.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 != 3 || setalignment4.addObserverForBackInvokerlambda0) {
            setalignment = setalignment4;
            break;
        }
        int i21 = 0;
        while (true) {
            if (i21 < i5) {
                int i22 = this.PlaybackStateCompat + (z ? (i5 - 1) - i21 : i21);
                if (i22 < hasspecifiedandfinitewidthuvyycjk.MediaSessionCompatQueueItem) {
                    setalignment = hasspecifiedandfinitewidthuvyycjk.write[i22];
                    if (setalignment.addObserverForBackInvokerlambda0) {
                        break;
                    } else {
                        i21++;
                    }
                }
            }
            setalignment = setalignment4;
            break;
        }
        int i23 = 0;
        setAlignment setalignment7 = null;
        while (i23 < i5) {
            int i24 = z ? (i5 - 1) - i23 : i23;
            int i25 = this.PlaybackStateCompat + i24;
            if (i25 >= hasspecifiedandfinitewidthuvyycjk.MediaSessionCompatQueueItem) {
                return;
            }
            setAlignment setalignment8 = hasspecifiedandfinitewidthuvyycjk.write[i25];
            if (setalignment8 == null) {
                i5 = i5;
                paintdefaultVar2 = paintdefaultVar10;
                c = 3;
                paintdefaultVar = paintdefaultVar9;
            } else {
                paintdefault paintdefaultVar11 = setalignment8.onActivityResult;
                paintdefault paintdefaultVar12 = setalignment8.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
                paintdefault paintdefaultVar13 = setalignment8.onBackPressedDispatcher_delegatelambda010;
                paintdefault paintdefaultVar14 = paintdefaultVar9;
                if (i23 == 0) {
                    setalignment8.IconCompatParcelizer(paintdefaultVar13, this.MediaDescriptionCompat, this.ParcelableVolumeInfo);
                }
                if (i24 == 0) {
                    int i26 = hasspecifiedandfinitewidthuvyycjk.ParcelableVolumeInfo;
                    float f4 = hasspecifiedandfinitewidthuvyycjk.PlaybackStateCompatCustomAction;
                    if (z) {
                        f4 = 1.0f - f4;
                    }
                    if (this.PlaybackStateCompat == 0 && (i3 = hasspecifiedandfinitewidthuvyycjk.MediaMetadataCompat) != -1) {
                        f2 = hasspecifiedandfinitewidthuvyycjk.MediaBrowserCompatMediaItem;
                        if (z) {
                            f2 = 1.0f - f2;
                        }
                    } else if (!z2 || (i3 = hasspecifiedandfinitewidthuvyycjk.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) == -1) {
                        i3 = i26;
                        f2 = f4;
                    } else {
                        f2 = hasspecifiedandfinitewidthuvyycjk.MediaSessionCompatToken;
                        if (z) {
                            f2 = 1.0f - f2;
                        }
                    }
                    setalignment8.menuHostHelperlambda0 = i3;
                    setalignment8.fullyDrawnReporter_delegatelambda0 = f2;
                }
                if (i23 == i5 - 1) {
                    setalignment8.IconCompatParcelizer(setalignment8.invalidateMenu, this.PlaybackStateCompatCustomAction, this.MediaSessionCompatResultReceiverWrapper);
                }
                if (setalignment7 != null) {
                    paintdefault paintdefaultVar15 = setalignment7.invalidateMenu;
                    paintdefaultVar13.write(paintdefaultVar15, hasspecifiedandfinitewidthuvyycjk.PlaybackStateCompat);
                    if (i23 == i7) {
                        int i27 = this.ParcelableVolumeInfo;
                        if (paintdefaultVar13.IconCompatParcelizer()) {
                            paintdefaultVar13.RemoteActionCompatParcelizer = i27;
                        }
                    }
                    paintdefaultVar15.write(paintdefaultVar13, 0);
                    if (i23 == i8 + 1) {
                        int i28 = this.MediaSessionCompatResultReceiverWrapper;
                        if (paintdefaultVar15.IconCompatParcelizer()) {
                            paintdefaultVar15.RemoteActionCompatParcelizer = i28;
                        }
                    }
                }
                if (setalignment8 != setalignment4) {
                    int i29 = hasspecifiedandfinitewidthuvyycjk.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                    c = 3;
                    if (i29 == 3 && setalignment.addObserverForBackInvokerlambda0 && setalignment8 != setalignment && setalignment8.addObserverForBackInvokerlambda0) {
                        setalignment8.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.write(setalignment.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw, 0);
                    } else if (i29 == 0) {
                        paintdefaultVar = paintdefaultVar14;
                        paintdefaultVar2 = paintdefaultVar10;
                        paintdefaultVar11.write(paintdefaultVar2, 0);
                    } else if (i29 == 1) {
                        paintdefaultVar = paintdefaultVar14;
                        paintdefaultVar2 = paintdefaultVar10;
                        paintdefaultVar12.write(paintdefaultVar, 0);
                    } else if (z3) {
                        paintdefaultVar11.write(this.ResultReceiver, this.MediaSessionCompatToken);
                        paintdefaultVar12.write(this.read, this.MediaBrowserCompatMediaItem);
                    } else {
                        paintdefaultVar2 = paintdefaultVar10;
                        paintdefaultVar11.write(paintdefaultVar2, 0);
                        paintdefaultVar = paintdefaultVar14;
                        paintdefaultVar12.write(paintdefaultVar, 0);
                    }
                    paintdefaultVar = paintdefaultVar14;
                    paintdefaultVar2 = paintdefaultVar10;
                } else {
                    paintdefaultVar = paintdefaultVar14;
                    paintdefaultVar2 = paintdefaultVar10;
                    c = 3;
                }
                setalignment7 = setalignment8;
            }
            i23++;
            paintdefaultVar9 = paintdefaultVar;
            paintdefaultVar10 = paintdefaultVar2;
            i5 = i5;
        }
    }

    public final void write(setAlignment setalignment) {
        int i = this.MediaSessionCompatQueueItem;
        int i2 = this.MediaMetadataCompat;
        hasSpecifiedAndFiniteWidthuvyYCjk hasspecifiedandfinitewidthuvyycjk = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (i == 0) {
            int iRemoteActionCompatParcelizer = hasspecifiedandfinitewidthuvyycjk.RemoteActionCompatParcelizer(setalignment, i2);
            if (setalignment.addOnNewIntentListener[0] == hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT) {
                this.RatingCompat++;
                iRemoteActionCompatParcelizer = 0;
            }
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = iRemoteActionCompatParcelizer + (setalignment.onMultiWindowModeChanged != 8 ? hasspecifiedandfinitewidthuvyycjk.PlaybackStateCompat : 0) + this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            int iIconCompatParcelizer = hasspecifiedandfinitewidthuvyycjk.IconCompatParcelizer(setalignment, this.MediaMetadataCompat);
            if (this.IconCompatParcelizer == null || this.serializer < iIconCompatParcelizer) {
                this.IconCompatParcelizer = setalignment;
                this.serializer = iIconCompatParcelizer;
                this.write = iIconCompatParcelizer;
            }
        } else {
            int iRemoteActionCompatParcelizer2 = hasspecifiedandfinitewidthuvyycjk.RemoteActionCompatParcelizer(setalignment, i2);
            int iIconCompatParcelizer2 = hasspecifiedandfinitewidthuvyycjk.IconCompatParcelizer(setalignment, this.MediaMetadataCompat);
            if (setalignment.addOnNewIntentListener[1] == hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT) {
                this.RatingCompat++;
                iIconCompatParcelizer2 = 0;
            }
            this.write = iIconCompatParcelizer2 + (setalignment.onMultiWindowModeChanged != 8 ? hasspecifiedandfinitewidthuvyycjk.peekAvailableContext : 0) + this.write;
            if (this.IconCompatParcelizer == null || this.serializer < iRemoteActionCompatParcelizer2) {
                this.IconCompatParcelizer = setalignment;
                this.serializer = iRemoteActionCompatParcelizer2;
                this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = iRemoteActionCompatParcelizer2;
            }
        }
        this.RemoteActionCompatParcelizer++;
    }

    public setContentScale(hasSpecifiedAndFiniteWidthuvyYCjk hasspecifiedandfinitewidthuvyycjk, int i, paintdefault paintdefaultVar, paintdefault paintdefaultVar2, paintdefault paintdefaultVar3, paintdefault paintdefaultVar4, int i2) {
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = hasspecifiedandfinitewidthuvyycjk;
        this.MediaSessionCompatQueueItem = i;
        this.MediaDescriptionCompat = paintdefaultVar;
        this.ResultReceiver = paintdefaultVar2;
        this.PlaybackStateCompatCustomAction = paintdefaultVar3;
        this.read = paintdefaultVar4;
        this.ParcelableVolumeInfo = hasspecifiedandfinitewidthuvyycjk.getLifecycleRegistry1;
        this.MediaSessionCompatToken = hasspecifiedandfinitewidthuvyycjk.setContentView;
        this.MediaSessionCompatResultReceiverWrapper = hasspecifiedandfinitewidthuvyycjk.startIntentSenderForResult;
        this.MediaBrowserCompatMediaItem = hasspecifiedandfinitewidthuvyycjk.reportFullyDrawn;
        this.MediaMetadataCompat = i2;
    }

    public final void read(int i) {
        hasSpecifiedAndFiniteWidthuvyYCjk hasspecifiedandfinitewidthuvyycjk;
        int i2;
        int i3 = this.RatingCompat;
        if (i3 == 0) {
            return;
        }
        int i4 = this.RemoteActionCompatParcelizer;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            hasspecifiedandfinitewidthuvyycjk = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            if (i6 >= i4 || (i2 = this.PlaybackStateCompat + i6) >= hasspecifiedandfinitewidthuvyycjk.MediaSessionCompatQueueItem) {
                break;
            }
            setAlignment setalignment = hasspecifiedandfinitewidthuvyycjk.write[i2];
            if (this.MediaSessionCompatQueueItem == 0) {
                if (setalignment != null) {
                    hasSpecifiedAndFiniteHeightuvyYCjk[] hasspecifiedandfiniteheightuvyycjkArr = setalignment.addOnNewIntentListener;
                    if (hasspecifiedandfiniteheightuvyycjkArr[0] == hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT && setalignment.addOnConfigurationChangedListener == 0) {
                        hasspecifiedandfinitewidthuvyycjk.write(setalignment, hasSpecifiedAndFiniteHeightuvyYCjk.FIXED, i5, hasspecifiedandfiniteheightuvyycjkArr[1], setalignment.MediaDescriptionCompat());
                    }
                }
            } else if (setalignment != null) {
                hasSpecifiedAndFiniteHeightuvyYCjk[] hasspecifiedandfiniteheightuvyycjkArr2 = setalignment.addOnNewIntentListener;
                if (hasspecifiedandfiniteheightuvyycjkArr2[1] == hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT && setalignment.addMenuProvider == 0) {
                    hasspecifiedandfinitewidthuvyycjk.write(setalignment, hasspecifiedandfiniteheightuvyycjkArr2[0], setalignment.MediaSessionCompatQueueItem(), hasSpecifiedAndFiniteHeightuvyYCjk.FIXED, i5);
                }
            }
            i6++;
        }
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 0;
        this.write = 0;
        this.IconCompatParcelizer = null;
        this.serializer = 0;
        int i7 = this.RemoteActionCompatParcelizer;
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = this.PlaybackStateCompat + i8;
            if (i9 >= hasspecifiedandfinitewidthuvyycjk.MediaSessionCompatQueueItem) {
                return;
            }
            setAlignment setalignment2 = hasspecifiedandfinitewidthuvyycjk.write[i9];
            if (this.MediaSessionCompatQueueItem == 0) {
                int iMediaSessionCompatQueueItem = setalignment2.MediaSessionCompatQueueItem();
                int i10 = hasspecifiedandfinitewidthuvyycjk.PlaybackStateCompat;
                if (setalignment2.onMultiWindowModeChanged == 8) {
                    i10 = 0;
                }
                this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = iMediaSessionCompatQueueItem + i10 + this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                int iIconCompatParcelizer = hasspecifiedandfinitewidthuvyycjk.IconCompatParcelizer(setalignment2, this.MediaMetadataCompat);
                if (this.IconCompatParcelizer == null || this.serializer < iIconCompatParcelizer) {
                    this.IconCompatParcelizer = setalignment2;
                    this.serializer = iIconCompatParcelizer;
                    this.write = iIconCompatParcelizer;
                }
            } else {
                int iRemoteActionCompatParcelizer = hasspecifiedandfinitewidthuvyycjk.RemoteActionCompatParcelizer(setalignment2, this.MediaMetadataCompat);
                int iIconCompatParcelizer2 = hasspecifiedandfinitewidthuvyycjk.IconCompatParcelizer(setalignment2, this.MediaMetadataCompat);
                int i11 = hasspecifiedandfinitewidthuvyycjk.peekAvailableContext;
                if (setalignment2.onMultiWindowModeChanged == 8) {
                    i11 = 0;
                }
                this.write = iIconCompatParcelizer2 + i11 + this.write;
                if (this.IconCompatParcelizer == null || this.serializer < iRemoteActionCompatParcelizer) {
                    this.IconCompatParcelizer = setalignment2;
                    this.serializer = iRemoteActionCompatParcelizer;
                    this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = iRemoteActionCompatParcelizer;
                }
            }
        }
    }
}
