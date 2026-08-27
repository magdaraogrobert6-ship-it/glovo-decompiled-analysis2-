package o;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public abstract class setPublicNotificationExtras {
    public static void serializer(Context context, long j, String str, long j2) {
        context.getClass();
        str.getClass();
        File file = new File(context.getNoBackupFilesDir(), "sentiance/sdk-init-timeout");
        file.mkdirs();
        try {
            readResourceValuelambda2 readresourcevaluelambda2 = new readResourceValuelambda2(getResourceIdentifier.serializer(new File(file, UUID.randomUUID().toString())));
            try {
                readresourcevaluelambda2.serializer(new setNotificationPriorityInt(j, str, j2).write());
                readresourcevaluelambda2.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    int i = sourceInformationContextOfdefault.read();
                    int i2 = sourceInformationContextOfdefault.read();
                    int i3 = sourceInformationContextOfdefault.read();
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i, i2, -871780639, sourceInformationContextOfdefault.read(), new Object[]{readresourcevaluelambda2, th}, i3);
                    throw th2;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:184:0x0290  */
    /* JADX WARN: Code duplicated, block: B:297:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:74:0x011b  */
    public static void RemoteActionCompatParcelizer(getUseIntrinsicSize getuseintrinsicsize, DrawWithContentElement drawWithContentElement, ArrayList arrayList, int i) {
        int i2;
        PainterNode[] painterNodeArr;
        int i3;
        int i4;
        int i5;
        PainterNode[] painterNodeArr2;
        boolean z;
        int i6;
        boolean z2;
        int i7;
        boolean z3;
        setAlignment setalignment;
        setAlignment setalignment2;
        int i8;
        setBlockui setblockui;
        setBlockui setblockui2;
        paintdefault paintdefaultVar;
        paintdefault paintdefaultVar2;
        setBlockui setblockui3;
        float f;
        int size;
        setAlignment setalignment3;
        PainterNode painterNode;
        boolean z4;
        getUseIntrinsicSize getuseintrinsicsize2;
        setAlignment setalignment4;
        int i9;
        int i10;
        boolean z5;
        int i11;
        int i12;
        setAlignment setalignment5;
        getUseIntrinsicSize getuseintrinsicsize3 = getuseintrinsicsize;
        if (i == 0) {
            i2 = getuseintrinsicsize3.MediaDescriptionCompat;
            painterNodeArr = getuseintrinsicsize3.IconCompatParcelizer;
            i3 = 0;
        } else {
            i2 = getuseintrinsicsize3.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            painterNodeArr = getuseintrinsicsize3.ResultReceiver;
            i3 = 2;
        }
        int i13 = 0;
        while (i13 < i2) {
            PainterNode painterNode2 = painterNodeArr[i13];
            boolean z6 = painterNode2.read;
            setAlignment setalignment6 = painterNode2.write;
            paintdefault[] paintdefaultVarArr = setalignment6.addOnMultiWindowModeChangedListener;
            int i14 = 8;
            int i15 = 1;
            if (z6) {
                i4 = i13;
                i5 = i2;
                painterNodeArr2 = painterNodeArr;
                z = true;
            } else {
                int i16 = painterNode2.ParcelableVolumeInfo;
                int i17 = i16 * 2;
                setAlignment setalignment7 = setalignment6;
                setAlignment setalignment8 = setalignment7;
                boolean z7 = false;
                while (!z7) {
                    painterNode2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus += i15;
                    setAlignment[] setalignmentArr = setalignment7.getSavedStateRegistry;
                    paintdefault[] paintdefaultVarArr2 = setalignment7.addOnMultiWindowModeChangedListener;
                    setalignmentArr[i16] = null;
                    setalignment7.addOnContextAvailableListener[i16] = null;
                    if (setalignment7.onMultiWindowModeChanged != i14) {
                        setalignment7.IconCompatParcelizer(i16);
                        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk = hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT;
                        paintdefaultVarArr2[i17].serializer();
                        int i18 = i17 + 1;
                        paintdefaultVarArr2[i18].serializer();
                        paintdefaultVarArr2[i17].serializer();
                        paintdefaultVarArr2[i18].serializer();
                        if (painterNode2.IconCompatParcelizer == null) {
                            painterNode2.IconCompatParcelizer = setalignment7;
                        }
                        painterNode2.MediaSessionCompatToken = setalignment7;
                        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk2 = setalignment7.addOnNewIntentListener[i16];
                        if (hasspecifiedandfiniteheightuvyycjk2 == hasspecifiedandfiniteheightuvyycjk) {
                            int i19 = setalignment7.initializeViewTreeOwners[i16];
                            i12 = i13;
                            if (i19 == 0 || i19 == 3 || i19 == 2) {
                                painterNode2.ResultReceiver++;
                                float f2 = setalignment7.onRequestPermissionsResult[i16];
                                if (f2 > 0.0f) {
                                    painterNode2.PlaybackStateCompat += f2;
                                }
                                if (setalignment7.onMultiWindowModeChanged != 8 && hasspecifiedandfiniteheightuvyycjk2 == hasspecifiedandfiniteheightuvyycjk && (i19 == 0 || i19 == 3)) {
                                    if (f2 < 0.0f) {
                                        painterNode2.MediaMetadataCompat = true;
                                    } else {
                                        painterNode2.MediaSessionCompatQueueItem = true;
                                    }
                                    if (painterNode2.PlaybackStateCompatCustomAction == null) {
                                        painterNode2.PlaybackStateCompatCustomAction = new ArrayList();
                                    }
                                    painterNode2.PlaybackStateCompatCustomAction.add(setalignment7);
                                }
                                if (painterNode2.RemoteActionCompatParcelizer == null) {
                                    painterNode2.RemoteActionCompatParcelizer = setalignment7;
                                }
                                setAlignment setalignment9 = painterNode2.MediaSessionCompatResultReceiverWrapper;
                                if (setalignment9 != null) {
                                    setalignment9.addOnContextAvailableListener[i16] = setalignment7;
                                }
                                painterNode2.MediaSessionCompatResultReceiverWrapper = setalignment7;
                            } else {
                                i2 = i2;
                            }
                            if (i16 == 0) {
                                if (setalignment7.addOnConfigurationChangedListener == 0 && setalignment7.addOnTrimMemoryListener == 0) {
                                    int i20 = setalignment7.addOnPictureInPictureUiStateChangedListener;
                                }
                            } else if (setalignment7.addMenuProvider == 0 && setalignment7.enterPictureInPictureMode == 0) {
                                int i21 = setalignment7.addOnPictureInPictureModeChangedListener;
                            }
                        } else {
                            i12 = i13;
                            i2 = i2;
                            painterNodeArr = painterNodeArr;
                        }
                    } else {
                        i12 = i13;
                        i2 = i2;
                        painterNodeArr = painterNodeArr;
                    }
                    setAlignment setalignment10 = setalignment8;
                    if (setalignment10 != setalignment7) {
                        setalignment10.getSavedStateRegistry[i16] = setalignment7;
                    }
                    paintdefault paintdefaultVar3 = paintdefaultVarArr2[i17 + 1].MediaSessionCompatQueueItem;
                    if (paintdefaultVar3 != null) {
                        setalignment5 = paintdefaultVar3.RatingCompat;
                        paintdefault paintdefaultVar4 = setalignment5.addOnMultiWindowModeChangedListener[i17].MediaSessionCompatQueueItem;
                        if (paintdefaultVar4 == null || paintdefaultVar4.RatingCompat != setalignment7) {
                            setalignment5 = null;
                        }
                    } else {
                        setalignment5 = null;
                    }
                    if (setalignment5 == null) {
                        setalignment5 = setalignment7;
                        z7 = true;
                    }
                    setalignment8 = setalignment7;
                    i13 = i12;
                    i2 = i2;
                    painterNodeArr = painterNodeArr;
                    i15 = 1;
                    i14 = 8;
                    setalignment7 = setalignment5;
                }
                i4 = i13;
                i5 = i2;
                painterNodeArr2 = painterNodeArr;
                setAlignment setalignment11 = painterNode2.IconCompatParcelizer;
                if (setalignment11 != null) {
                    setalignment11.addOnMultiWindowModeChangedListener[i17].serializer();
                }
                setAlignment setalignment12 = painterNode2.MediaSessionCompatToken;
                if (setalignment12 != null) {
                    setalignment12.addOnMultiWindowModeChangedListener[i17 + 1].serializer();
                }
                painterNode2.MediaDescriptionCompat = setalignment7;
                if (i16 == 0 && painterNode2.MediaBrowserCompatMediaItem) {
                    painterNode2.RatingCompat = setalignment7;
                } else {
                    painterNode2.RatingCompat = setalignment6;
                }
                painterNode2.serializer = painterNode2.MediaSessionCompatQueueItem && painterNode2.MediaMetadataCompat;
                z = true;
            }
            painterNode2.read = z;
            if (arrayList == 0 || arrayList.contains(setalignment6)) {
                setAlignment setalignment13 = painterNode2.MediaDescriptionCompat;
                setAlignment setalignment14 = painterNode2.IconCompatParcelizer;
                setAlignment setalignment15 = painterNode2.MediaSessionCompatToken;
                setAlignment setalignment16 = painterNode2.RatingCompat;
                float f3 = painterNode2.PlaybackStateCompat;
                hasSpecifiedAndFiniteHeightuvyYCjk[] hasspecifiedandfiniteheightuvyycjkArr = getuseintrinsicsize3.addOnNewIntentListener;
                paintdefault[] paintdefaultVarArr3 = getuseintrinsicsize3.addOnMultiWindowModeChangedListener;
                boolean z8 = hasspecifiedandfiniteheightuvyycjkArr[i] == hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT;
                if (i == 0) {
                    int i22 = setalignment16.menuHostHelperlambda0;
                    if (i22 == 0) {
                        i10 = 1;
                        z5 = true;
                    } else {
                        i10 = 1;
                        z5 = false;
                    }
                    if (i22 == i10) {
                        i7 = i10;
                        i11 = 2;
                    } else {
                        i11 = 2;
                        i7 = 0;
                    }
                    z3 = i22 == i11;
                    z2 = z5;
                } else {
                    int i23 = setalignment16.onCreate;
                    if (i23 == 0) {
                        i6 = 1;
                        z2 = true;
                    } else {
                        i6 = 1;
                        z2 = false;
                    }
                    i7 = i23 == i6 ? 1 : 0;
                    z3 = i23 == 2;
                }
                setAlignment setalignment17 = setalignment6;
                boolean z9 = false;
                while (!z9) {
                    paintdefault[] paintdefaultVarArr4 = setalignment17.addOnMultiWindowModeChangedListener;
                    hasSpecifiedAndFiniteHeightuvyYCjk[] hasspecifiedandfiniteheightuvyycjkArr2 = setalignment17.addOnNewIntentListener;
                    int i24 = i7;
                    paintdefault paintdefaultVar5 = paintdefaultVarArr4[i3];
                    int i25 = z3 ? 1 : 4;
                    int iSerializer = paintdefaultVar5.serializer();
                    setAlignment setalignment18 = setalignment16;
                    hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk3 = hasspecifiedandfiniteheightuvyycjkArr2[i];
                    paintdefault[] paintdefaultVarArr5 = paintdefaultVarArr;
                    hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk4 = hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT;
                    boolean z10 = hasspecifiedandfiniteheightuvyycjk3 == hasspecifiedandfiniteheightuvyycjk4 && setalignment17.initializeViewTreeOwners[i] == 0;
                    paintdefault paintdefaultVar6 = paintdefaultVar5.MediaSessionCompatQueueItem;
                    if (paintdefaultVar6 != null && setalignment17 != setalignment6) {
                        iSerializer = paintdefaultVar6.serializer() + iSerializer;
                    }
                    int i26 = iSerializer;
                    if (z3 && setalignment17 != setalignment6 && setalignment17 != setalignment14) {
                        i25 = 8;
                    }
                    paintdefault paintdefaultVar7 = paintdefaultVar5.MediaSessionCompatQueueItem;
                    if (paintdefaultVar7 != null) {
                        setBlockui setblockui4 = paintdefaultVar5.MediaMetadataCompat;
                        setBlockui setblockui5 = paintdefaultVar7.MediaMetadataCompat;
                        if (setalignment17 == setalignment14) {
                            drawWithContentElement.RemoteActionCompatParcelizer(setblockui4, setblockui5, i26, 6);
                        } else {
                            drawWithContentElement.RemoteActionCompatParcelizer(setblockui4, setblockui5, i26, 8);
                        }
                        if (z10 && !z3) {
                            i25 = 5;
                        }
                        drawWithContentElement.serializer(paintdefaultVar5.MediaMetadataCompat, paintdefaultVar5.MediaSessionCompatQueueItem.MediaMetadataCompat, i26, (setalignment17 == setalignment14 && z3 && setalignment17.addContentView[i]) ? 5 : i25);
                    } else {
                        setalignment13 = setalignment13;
                    }
                    if (z8) {
                        if (setalignment17.onMultiWindowModeChanged == 8 || hasspecifiedandfiniteheightuvyycjkArr2[i] != hasspecifiedandfiniteheightuvyycjk4) {
                            i9 = 0;
                        } else {
                            i9 = 0;
                            drawWithContentElement.RemoteActionCompatParcelizer(paintdefaultVarArr4[i3 + 1].MediaMetadataCompat, paintdefaultVarArr4[i3].MediaMetadataCompat, 0, 5);
                        }
                        drawWithContentElement.RemoteActionCompatParcelizer(paintdefaultVarArr4[i3].MediaMetadataCompat, paintdefaultVarArr3[i3].MediaMetadataCompat, i9, 8);
                    }
                    paintdefault paintdefaultVar8 = paintdefaultVarArr4[i3 + 1].MediaSessionCompatQueueItem;
                    if (paintdefaultVar8 != null) {
                        setalignment4 = paintdefaultVar8.RatingCompat;
                        paintdefault paintdefaultVar9 = setalignment4.addOnMultiWindowModeChangedListener[i3].MediaSessionCompatQueueItem;
                        if (paintdefaultVar9 == null || paintdefaultVar9.RatingCompat != setalignment17) {
                            setalignment4 = null;
                        }
                    } else {
                        setalignment4 = null;
                    }
                    if (setalignment4 != null) {
                        setalignment17 = setalignment4;
                    } else {
                        z9 = true;
                    }
                    i7 = i24;
                    setalignment6 = setalignment6;
                    setalignment16 = setalignment18;
                    paintdefaultVarArr = paintdefaultVarArr5;
                    painterNode2 = painterNode2;
                    setalignment13 = setalignment13;
                }
                PainterNode painterNode3 = painterNode2;
                setAlignment setalignment19 = setalignment16;
                paintdefault[] paintdefaultVarArr6 = paintdefaultVarArr;
                setAlignment setalignment20 = setalignment13;
                int i27 = i7;
                if (setalignment15 != null) {
                    setalignment = setalignment20;
                    int i28 = i3 + 1;
                    if (setalignment.addOnMultiWindowModeChangedListener[i28].MediaSessionCompatQueueItem != null) {
                        paintdefault paintdefaultVar10 = setalignment15.addOnMultiWindowModeChangedListener[i28];
                        if (setalignment15.addOnNewIntentListener[i] == hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT && setalignment15.initializeViewTreeOwners[i] == 0 && !z3) {
                            paintdefault paintdefaultVar11 = paintdefaultVar10.MediaSessionCompatQueueItem;
                            getuseintrinsicsize2 = getuseintrinsicsize;
                            if (paintdefaultVar11.RatingCompat == getuseintrinsicsize2) {
                                drawWithContentElement.serializer(paintdefaultVar10.MediaMetadataCompat, paintdefaultVar11.MediaMetadataCompat, -paintdefaultVar10.serializer(), 5);
                            }
                            drawWithContentElement.write(paintdefaultVar10.MediaMetadataCompat, setalignment.addOnMultiWindowModeChangedListener[i28].MediaSessionCompatQueueItem.MediaMetadataCompat, -paintdefaultVar10.serializer(), 6);
                        } else {
                            getuseintrinsicsize2 = getuseintrinsicsize;
                        }
                        if (z3) {
                            paintdefault paintdefaultVar12 = paintdefaultVar10.MediaSessionCompatQueueItem;
                            if (paintdefaultVar12.RatingCompat == getuseintrinsicsize2) {
                                drawWithContentElement.serializer(paintdefaultVar10.MediaMetadataCompat, paintdefaultVar12.MediaMetadataCompat, -paintdefaultVar10.serializer(), 4);
                            }
                        }
                        drawWithContentElement.write(paintdefaultVar10.MediaMetadataCompat, setalignment.addOnMultiWindowModeChangedListener[i28].MediaSessionCompatQueueItem.MediaMetadataCompat, -paintdefaultVar10.serializer(), 6);
                    }
                } else {
                    setalignment = setalignment20;
                }
                if (z8) {
                    int i29 = i3 + 1;
                    setBlockui setblockui6 = paintdefaultVarArr3[i29].MediaMetadataCompat;
                    paintdefault paintdefaultVar13 = setalignment.addOnMultiWindowModeChangedListener[i29];
                    drawWithContentElement.RemoteActionCompatParcelizer(setblockui6, paintdefaultVar13.MediaMetadataCompat, paintdefaultVar13.serializer(), 8);
                }
                PainterNode painterNode4 = painterNode3;
                ArrayList arrayList2 = painterNode4.PlaybackStateCompatCustomAction;
                if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                    float f4 = (!painterNode4.MediaMetadataCompat || painterNode4.serializer) ? f3 : painterNode4.ResultReceiver;
                    setAlignment setalignment21 = null;
                    int i30 = 0;
                    float f5 = 0.0f;
                    while (i30 < size) {
                        setAlignment setalignment22 = (setAlignment) arrayList2.get(i30);
                        float[] fArr = setalignment22.onRequestPermissionsResult;
                        paintdefault[] paintdefaultVarArr7 = setalignment22.addOnMultiWindowModeChangedListener;
                        float f6 = fArr[i];
                        ArrayList arrayList3 = arrayList2;
                        if (f6 < 0.0f) {
                            if (painterNode4.serializer) {
                                z4 = false;
                                drawWithContentElement.serializer(paintdefaultVarArr7[i3 + 1].MediaMetadataCompat, paintdefaultVarArr7[i3].MediaMetadataCompat, 0, 4);
                            } else {
                                f6 = 1.0f;
                            }
                            setalignment3 = setalignment;
                            painterNode = painterNode4;
                            size = size;
                            i30++;
                            arrayList2 = arrayList3;
                            setalignment = setalignment3;
                            size = size;
                            painterNode4 = painterNode;
                        }
                        if (f6 == 0.0f) {
                            z4 = false;
                            drawWithContentElement.serializer(paintdefaultVarArr7[i3 + 1].MediaMetadataCompat, paintdefaultVarArr7[i3].MediaMetadataCompat, 0, 8);
                            setalignment3 = setalignment;
                            painterNode = painterNode4;
                            size = size;
                        } else {
                            if (setalignment21 != null) {
                                paintdefault[] paintdefaultVarArr8 = setalignment21.addOnMultiWindowModeChangedListener;
                                setBlockui setblockui7 = paintdefaultVarArr8[i3].MediaMetadataCompat;
                                int i31 = i3 + 1;
                                setBlockui setblockui8 = paintdefaultVarArr8[i31].MediaMetadataCompat;
                                setBlockui setblockui9 = paintdefaultVarArr7[i3].MediaMetadataCompat;
                                setBlockui setblockui10 = paintdefaultVarArr7[i31].MediaMetadataCompat;
                                drawWithContent drawwithcontentSerializer = drawWithContentElement.serializer();
                                drawwithcontentSerializer.read = 0.0f;
                                if (f4 != 0.0f && f5 != f6) {
                                    DrawResult drawResult = drawwithcontentSerializer.RemoteActionCompatParcelizer;
                                    if (f5 == 0.0f) {
                                        painterNode = painterNode4;
                                        drawResult.IconCompatParcelizer(setblockui7, 1.0f);
                                        drawwithcontentSerializer.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockui8, -1.0f);
                                        setalignment3 = setalignment;
                                    } else {
                                        setalignment3 = setalignment;
                                        painterNode = painterNode4;
                                        if (f6 == 0.0f) {
                                            drawResult.IconCompatParcelizer(setblockui9, 1.0f);
                                            drawwithcontentSerializer.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockui10, -1.0f);
                                        } else {
                                            float f7 = (f5 / f4) / (f6 / f4);
                                            drawResult.IconCompatParcelizer(setblockui7, 1.0f);
                                            drawwithcontentSerializer.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockui8, -1.0f);
                                            drawwithcontentSerializer.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockui10, f7);
                                            drawwithcontentSerializer.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockui9, -f7);
                                        }
                                    }
                                } else {
                                    setalignment3 = setalignment;
                                    painterNode = painterNode4;
                                    drawwithcontentSerializer.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockui7, 1.0f);
                                    drawwithcontentSerializer.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockui8, -1.0f);
                                    drawwithcontentSerializer.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockui10, 1.0f);
                                    drawwithcontentSerializer.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockui9, -1.0f);
                                }
                                drawWithContentElement.write(drawwithcontentSerializer);
                            } else {
                                setalignment3 = setalignment;
                                painterNode = painterNode4;
                            }
                            f5 = f6;
                            setalignment21 = setalignment22;
                        }
                        i30++;
                        arrayList2 = arrayList3;
                        setalignment = setalignment3;
                        size = size;
                        painterNode4 = painterNode;
                    }
                }
                setAlignment setalignment23 = setalignment;
                PainterNode painterNode5 = painterNode4;
                if (setalignment14 == null || !(setalignment14 == setalignment15 || z3)) {
                    setalignment2 = setalignment23;
                    i8 = i4;
                    if (z2 && setalignment14 != null) {
                        int i32 = painterNode5.ResultReceiver;
                        boolean z11 = i32 > 0 && painterNode5.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == i32;
                        setAlignment setalignment24 = setalignment14;
                        setAlignment setalignment25 = setalignment24;
                        while (true) {
                            paintdefault[] paintdefaultVarArr9 = setalignment25.addOnMultiWindowModeChangedListener;
                            if (setalignment24 == null) {
                                break;
                            }
                            paintdefault[] paintdefaultVarArr10 = setalignment24.addOnMultiWindowModeChangedListener;
                            setAlignment setalignment26 = setalignment24.getSavedStateRegistry[i];
                            while (setalignment26 != null && setalignment26.onMultiWindowModeChanged == 8) {
                                setalignment26 = setalignment26.getSavedStateRegistry[i];
                            }
                            if (setalignment26 != null || setalignment24 == setalignment15) {
                                paintdefault paintdefaultVar14 = paintdefaultVarArr10[i3];
                                setBlockui setblockui11 = paintdefaultVar14.MediaMetadataCompat;
                                paintdefault paintdefaultVar15 = paintdefaultVar14.MediaSessionCompatQueueItem;
                                setBlockui setblockui12 = paintdefaultVar15 != null ? paintdefaultVar15.MediaMetadataCompat : null;
                                if (setalignment25 != setalignment24) {
                                    setblockui12 = paintdefaultVarArr9[i3 + 1].MediaMetadataCompat;
                                } else if (setalignment24 == setalignment14) {
                                    paintdefault paintdefaultVar16 = paintdefaultVarArr6[i3].MediaSessionCompatQueueItem;
                                    setblockui12 = paintdefaultVar16 != null ? paintdefaultVar16.MediaMetadataCompat : null;
                                }
                                int iSerializer2 = paintdefaultVar14.serializer();
                                int i33 = i3 + 1;
                                int iSerializer3 = paintdefaultVarArr10[i33].serializer();
                                if (setalignment26 != null) {
                                    paintdefaultVar2 = setalignment26.addOnMultiWindowModeChangedListener[i3];
                                    setblockui3 = paintdefaultVar2.MediaMetadataCompat;
                                } else {
                                    paintdefaultVar2 = setalignment2.addOnMultiWindowModeChangedListener[i33].MediaSessionCompatQueueItem;
                                    setblockui3 = paintdefaultVar2 != null ? paintdefaultVar2.MediaMetadataCompat : null;
                                }
                                setBlockui setblockui13 = paintdefaultVarArr10[i33].MediaMetadataCompat;
                                if (paintdefaultVar2 != null) {
                                    iSerializer3 += paintdefaultVar2.serializer();
                                }
                                int iSerializer4 = paintdefaultVarArr9[i33].serializer() + iSerializer2;
                                if (setblockui11 != null && setblockui12 != null && setblockui3 != null && setblockui13 != null) {
                                    if (setalignment24 == setalignment14) {
                                        iSerializer4 = setalignment14.addOnMultiWindowModeChangedListener[i3].serializer();
                                    }
                                    int i34 = iSerializer4;
                                    if (setalignment24 == setalignment15) {
                                        iSerializer3 = setalignment15.addOnMultiWindowModeChangedListener[i33].serializer();
                                    }
                                    drawWithContentElement.IconCompatParcelizer(setblockui11, setblockui12, i34, 0.5f, setblockui3, setblockui13, iSerializer3, z11 ? 8 : 5);
                                }
                            }
                            if (setalignment24.onMultiWindowModeChanged != 8) {
                                setalignment25 = setalignment24;
                            }
                            setalignment24 = setalignment26;
                            paintdefaultVarArr6 = paintdefaultVarArr6;
                        }
                    } else if (i27 != 0 && setalignment14 != null) {
                        int i35 = painterNode5.ResultReceiver;
                        boolean z12 = i35 > 0 && painterNode5.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == i35;
                        setAlignment setalignment27 = setalignment14;
                        setAlignment setalignment28 = setalignment27;
                        while (true) {
                            paintdefault[] paintdefaultVarArr11 = setalignment27.addOnMultiWindowModeChangedListener;
                            if (setalignment28 == null) {
                                break;
                            }
                            paintdefault[] paintdefaultVarArr12 = setalignment28.addOnMultiWindowModeChangedListener;
                            setAlignment setalignment29 = setalignment28.getSavedStateRegistry[i];
                            while (setalignment29 != null && setalignment29.onMultiWindowModeChanged == 8) {
                                setalignment29 = setalignment29.getSavedStateRegistry[i];
                            }
                            if (setalignment28 != setalignment14 && setalignment28 != setalignment15 && setalignment29 != null) {
                                setAlignment setalignment30 = setalignment29 == setalignment15 ? null : setalignment29;
                                paintdefault paintdefaultVar17 = paintdefaultVarArr12[i3];
                                setBlockui setblockui14 = paintdefaultVar17.MediaMetadataCompat;
                                int i36 = i3 + 1;
                                setBlockui setblockui15 = paintdefaultVarArr11[i36].MediaMetadataCompat;
                                int iSerializer5 = paintdefaultVar17.serializer();
                                int iSerializer6 = paintdefaultVarArr12[i36].serializer();
                                if (setalignment30 != null) {
                                    paintdefaultVar = setalignment30.addOnMultiWindowModeChangedListener[i3];
                                    setBlockui setblockui16 = paintdefaultVar.MediaMetadataCompat;
                                    paintdefault paintdefaultVar18 = paintdefaultVar.MediaSessionCompatQueueItem;
                                    setblockui2 = paintdefaultVar18 != null ? paintdefaultVar18.MediaMetadataCompat : null;
                                    setalignment30 = setalignment30;
                                    setblockui = setblockui16;
                                } else {
                                    paintdefault paintdefaultVar19 = setalignment15.addOnMultiWindowModeChangedListener[i3];
                                    setblockui = paintdefaultVar19 != null ? paintdefaultVar19.MediaMetadataCompat : null;
                                    setblockui2 = paintdefaultVarArr12[i36].MediaMetadataCompat;
                                    paintdefaultVar = paintdefaultVar19;
                                }
                                if (paintdefaultVar != null) {
                                    iSerializer6 += paintdefaultVar.serializer();
                                }
                                int i37 = iSerializer6;
                                int iSerializer7 = paintdefaultVarArr11[i36].serializer();
                                int i38 = z12 ? 8 : 4;
                                if (setblockui14 != null && setblockui15 != null && setblockui != null && setblockui2 != null) {
                                    drawWithContentElement.IconCompatParcelizer(setblockui14, setblockui15, iSerializer7 + iSerializer5, 0.5f, setblockui, setblockui2, i37, i38);
                                }
                                setalignment29 = setalignment30;
                            }
                            if (setalignment28.onMultiWindowModeChanged != 8) {
                                setalignment27 = setalignment28;
                            }
                            setalignment28 = setalignment29;
                        }
                        paintdefault paintdefaultVar20 = setalignment14.addOnMultiWindowModeChangedListener[i3];
                        paintdefault paintdefaultVar21 = paintdefaultVarArr6[i3].MediaSessionCompatQueueItem;
                        int i39 = i3 + 1;
                        paintdefault paintdefaultVar22 = setalignment15.addOnMultiWindowModeChangedListener[i39];
                        paintdefault paintdefaultVar23 = setalignment2.addOnMultiWindowModeChangedListener[i39].MediaSessionCompatQueueItem;
                        if (paintdefaultVar21 != null) {
                            if (setalignment14 != setalignment15) {
                                drawWithContentElement.serializer(paintdefaultVar20.MediaMetadataCompat, paintdefaultVar21.MediaMetadataCompat, paintdefaultVar20.serializer(), 5);
                            } else if (paintdefaultVar23 != null) {
                                drawWithContentElement.IconCompatParcelizer(paintdefaultVar20.MediaMetadataCompat, paintdefaultVar21.MediaMetadataCompat, paintdefaultVar20.serializer(), 0.5f, paintdefaultVar22.MediaMetadataCompat, paintdefaultVar23.MediaMetadataCompat, paintdefaultVar22.serializer(), 5);
                            }
                        }
                        if (paintdefaultVar23 != null && setalignment14 != setalignment15) {
                            drawWithContentElement.serializer(paintdefaultVar22.MediaMetadataCompat, paintdefaultVar23.MediaMetadataCompat, -paintdefaultVar22.serializer(), 5);
                        }
                    }
                } else {
                    paintdefault paintdefaultVar24 = paintdefaultVarArr6[i3];
                    setalignment2 = setalignment23;
                    int i40 = i3 + 1;
                    paintdefault paintdefaultVar25 = setalignment2.addOnMultiWindowModeChangedListener[i40];
                    paintdefault paintdefaultVar26 = paintdefaultVar24.MediaSessionCompatQueueItem;
                    setBlockui setblockui17 = paintdefaultVar26 != null ? paintdefaultVar26.MediaMetadataCompat : null;
                    paintdefault paintdefaultVar27 = paintdefaultVar25.MediaSessionCompatQueueItem;
                    setBlockui setblockui18 = paintdefaultVar27 != null ? paintdefaultVar27.MediaMetadataCompat : null;
                    paintdefault paintdefaultVar28 = setalignment14.addOnMultiWindowModeChangedListener[i3];
                    if (setalignment15 != null) {
                        paintdefaultVar25 = setalignment15.addOnMultiWindowModeChangedListener[i40];
                    }
                    if (setblockui17 == null || setblockui18 == null) {
                        i8 = i4;
                    } else {
                        if (i == 0) {
                            f = setalignment19.fullyDrawnReporter_delegatelambda0;
                        } else {
                            f = setalignment19.onBackPressed;
                        }
                        int iSerializer8 = paintdefaultVar28.serializer();
                        i8 = i4;
                        drawWithContentElement.IconCompatParcelizer(paintdefaultVar28.MediaMetadataCompat, setblockui17, iSerializer8, f, setblockui18, paintdefaultVar25.MediaMetadataCompat, paintdefaultVar25.serializer(), 7);
                    }
                }
                if ((z2 || i27 != 0) && setalignment14 != null && setalignment14 != setalignment15) {
                    paintdefault[] paintdefaultVarArr13 = setalignment14.addOnMultiWindowModeChangedListener;
                    paintdefault paintdefaultVar29 = paintdefaultVarArr13[i3];
                    if (setalignment15 == null) {
                        setalignment15 = setalignment14;
                    }
                    paintdefault[] paintdefaultVarArr14 = setalignment15.addOnMultiWindowModeChangedListener;
                    int i41 = i3 + 1;
                    paintdefault paintdefaultVar30 = paintdefaultVarArr14[i41];
                    paintdefault paintdefaultVar31 = paintdefaultVar29.MediaSessionCompatQueueItem;
                    setBlockui setblockui19 = paintdefaultVar31 != null ? paintdefaultVar31.MediaMetadataCompat : null;
                    paintdefault paintdefaultVar32 = paintdefaultVar30.MediaSessionCompatQueueItem;
                    setBlockui setblockui20 = paintdefaultVar32 != null ? paintdefaultVar32.MediaMetadataCompat : null;
                    if (setalignment2 != setalignment15) {
                        paintdefault paintdefaultVar33 = setalignment2.addOnMultiWindowModeChangedListener[i41].MediaSessionCompatQueueItem;
                        setblockui20 = paintdefaultVar33 != null ? paintdefaultVar33.MediaMetadataCompat : null;
                    }
                    if (setalignment14 == setalignment15) {
                        paintdefaultVar30 = paintdefaultVarArr13[i41];
                    }
                    if (setblockui19 != null && setblockui20 != null) {
                        drawWithContentElement.IconCompatParcelizer(paintdefaultVar29.MediaMetadataCompat, setblockui19, paintdefaultVar29.serializer(), 0.5f, setblockui20, paintdefaultVar30.MediaMetadataCompat, paintdefaultVarArr14[i41].serializer(), 5);
                    }
                }
            } else {
                i8 = i4;
            }
            i13 = i8 + 1;
            getuseintrinsicsize3 = getuseintrinsicsize;
            i2 = i5;
            painterNodeArr = painterNodeArr2;
        }
    }
}
