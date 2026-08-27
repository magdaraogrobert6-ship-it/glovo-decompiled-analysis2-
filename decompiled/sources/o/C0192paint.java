package o;

import bo.app.wg$$ExternalSyntheticLambda0;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: o.paint, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0192paint extends scale {
    public HashSet ComponentActivity;
    public String IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public getUseIntrinsicSize MediaMetadataCompat;
    public float MediaSessionCompatQueueItem;
    public String MediaSessionCompatResultReceiverWrapper;
    public int MediaSessionCompatToken;
    public boolean[][] ParcelableVolumeInfo;
    public int PlaybackStateCompat;
    public int PlaybackStateCompatCustomAction;
    public boolean RatingCompat;
    public int RemoteActionCompatParcelizer;
    public String ResultReceiver;
    public String r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public int[][] r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public float r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public setAlignment[] read;
    public int[][] serializer;
    public int write;

    public static float[] serializer(int i, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < strArrSplit.length) {
                try {
                    fArr[i2] = Float.parseFloat(strArrSplit[i2]);
                } catch (Exception e) {
                    System.err.println("Error parsing `" + strArrSplit[i2] + "`: " + e.getMessage());
                    fArr[i2] = 1.0f;
                }
            } else {
                fArr[i2] = 1.0f;
            }
        }
        return fArr;
    }

    @Override // o.scale
    public final void RemoteActionCompatParcelizer(int i, int i2, int i3, int i4) {
        int[][] iArrWrite;
        this.MediaMetadataCompat = this.getViewModelStore;
        if (this.PlaybackStateCompatCustomAction >= 1 && this.RemoteActionCompatParcelizer >= 1) {
            this.MediaBrowserCompatMediaItem = 0;
            String str = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            if (str != null && !str.trim().isEmpty() && (iArrWrite = write(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, false)) != null) {
                write(iArrWrite);
            }
            String str2 = this.ResultReceiver;
            if (str2 != null && !str2.trim().isEmpty()) {
                this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = write(this.ResultReceiver, true);
            }
            int iMax = Math.max(this.PlaybackStateCompatCustomAction, this.RemoteActionCompatParcelizer);
            setAlignment[] setalignmentArr = this.read;
            if (setalignmentArr == null) {
                this.read = new setAlignment[iMax];
                int i5 = 0;
                while (true) {
                    setAlignment[] setalignmentArr2 = this.read;
                    if (i5 >= setalignmentArr2.length) {
                        break;
                    }
                    setAlignment setalignment = new setAlignment();
                    hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk = hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT;
                    hasSpecifiedAndFiniteHeightuvyYCjk[] hasspecifiedandfiniteheightuvyycjkArr = setalignment.addOnNewIntentListener;
                    hasspecifiedandfiniteheightuvyycjkArr[0] = hasspecifiedandfiniteheightuvyycjk;
                    hasspecifiedandfiniteheightuvyycjkArr[1] = hasspecifiedandfiniteheightuvyycjk;
                    setalignment.onSaveInstanceState = String.valueOf(setalignment.hashCode());
                    setalignmentArr2[i5] = setalignment;
                    i5++;
                }
            } else if (iMax != setalignmentArr.length) {
                setAlignment[] setalignmentArr3 = new setAlignment[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    setAlignment[] setalignmentArr4 = this.read;
                    if (i6 < setalignmentArr4.length) {
                        setalignmentArr3[i6] = setalignmentArr4[i6];
                    } else {
                        setAlignment setalignment2 = new setAlignment();
                        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk2 = hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT;
                        hasSpecifiedAndFiniteHeightuvyYCjk[] hasspecifiedandfiniteheightuvyycjkArr2 = setalignment2.addOnNewIntentListener;
                        hasspecifiedandfiniteheightuvyycjkArr2[0] = hasspecifiedandfiniteheightuvyycjk2;
                        hasspecifiedandfiniteheightuvyycjkArr2[1] = hasspecifiedandfiniteheightuvyycjk2;
                        setalignment2.onSaveInstanceState = String.valueOf(setalignment2.hashCode());
                        setalignmentArr3[i6] = setalignment2;
                    }
                }
                while (true) {
                    setAlignment[] setalignmentArr5 = this.read;
                    if (iMax >= setalignmentArr5.length) {
                        break;
                    }
                    setAlignment setalignment3 = setalignmentArr5[iMax];
                    this.MediaMetadataCompat.serializer.remove(setalignment3);
                    setalignment3.MediaSessionCompatResultReceiverWrapper();
                    iMax++;
                }
                this.read = setalignmentArr3;
            }
            int[][] iArr = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            if (iArr != null) {
                IconCompatParcelizer(iArr);
            }
        }
        getUseIntrinsicSize getuseintrinsicsize = this.MediaMetadataCompat;
        setAlignment[] setalignmentArr6 = this.read;
        getuseintrinsicsize.getClass();
        for (setAlignment setalignment4 : setalignmentArr6) {
            getuseintrinsicsize.serializer(setalignment4);
        }
    }

    public final void RemoteActionCompatParcelizer(setAlignment setalignment, int i, int i2, int i3, int i4) {
        setalignment.onBackPressedDispatcher_delegatelambda010.write(this.read[i2].onBackPressedDispatcher_delegatelambda010, 0);
        setalignment.onActivityResult.write(this.read[i].onActivityResult, 0);
        setalignment.invalidateMenu.write(this.read[(i2 + i4) - 1].invalidateMenu, 0);
        setalignment.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.write(this.read[(i + i3) - 1].r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs, 0);
    }

    public final void write() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.PlaybackStateCompatCustomAction, this.RemoteActionCompatParcelizer);
        this.ParcelableVolumeInfo = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i = this.removeOnMultiWindowModeChangedListener;
        if (i > 0) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i, 4);
            this.serializer = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
        }
    }

    public final int[][] write(String str, boolean z) {
        int i;
        int i2;
        try {
            String[] strArrSplit = str.split(",");
            Arrays.sort(strArrSplit, new wg$$ExternalSyntheticLambda0(5));
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
            if (this.PlaybackStateCompatCustomAction != 1 && this.RemoteActionCompatParcelizer != 1) {
                for (int i3 = 0; i3 < strArrSplit.length; i3++) {
                    String[] strArrSplit2 = strArrSplit[i3].trim().split(":");
                    String[] strArrSplit3 = strArrSplit2[1].split("x");
                    iArr[i3][0] = Integer.parseInt(strArrSplit2[0]);
                    if ((this.MediaDescriptionCompat & 1) > 0) {
                        iArr[i3][1] = Integer.parseInt(strArrSplit3[1]);
                        iArr[i3][2] = Integer.parseInt(strArrSplit3[0]);
                    } else {
                        iArr[i3][1] = Integer.parseInt(strArrSplit3[0]);
                        iArr[i3][2] = Integer.parseInt(strArrSplit3[1]);
                    }
                }
                return iArr;
            }
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < strArrSplit.length; i6++) {
                String[] strArrSplit4 = strArrSplit[i6].trim().split(":");
                iArr[i6][0] = Integer.parseInt(strArrSplit4[0]);
                int[] iArr2 = iArr[i6];
                iArr2[1] = 1;
                iArr2[2] = 1;
                if (this.RemoteActionCompatParcelizer == 1) {
                    iArr2[1] = Integer.parseInt(strArrSplit4[1]);
                    i4 += iArr[i6][1];
                    if (z) {
                        i4--;
                    }
                }
                if (this.PlaybackStateCompatCustomAction == 1) {
                    iArr[i6][2] = Integer.parseInt(strArrSplit4[1]);
                    i5 += iArr[i6][2];
                    if (z) {
                        i5--;
                    }
                }
            }
            if (i4 != 0 && !this.RatingCompat && (i2 = this.PlaybackStateCompatCustomAction + i4) <= 50 && this.PlaybackStateCompat != i2) {
                this.PlaybackStateCompat = i2;
                IconCompatParcelizer();
                write();
            }
            if (i5 != 0 && !this.RatingCompat && (i = this.RemoteActionCompatParcelizer + i5) <= 50 && this.write != i) {
                this.write = i;
                IconCompatParcelizer();
                write();
            }
            this.RatingCompat = true;
            return iArr;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x01b3  */
    @Override // o.setAlignment
    public final void write(DrawWithContentElement drawWithContentElement, boolean z) {
        int i;
        int i2;
        int[][] iArr;
        int i3;
        super.write(drawWithContentElement, z);
        int iMax = Math.max(this.PlaybackStateCompatCustomAction, this.RemoteActionCompatParcelizer);
        setAlignment setalignment = this.read[0];
        float[] fArrSerializer = serializer(this.PlaybackStateCompatCustomAction, this.MediaSessionCompatResultReceiverWrapper);
        int i4 = this.PlaybackStateCompatCustomAction;
        paintdefault paintdefaultVar = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        paintdefault paintdefaultVar2 = this.onActivityResult;
        if (i4 == 1) {
            read(setalignment);
            setalignment.onActivityResult.write(paintdefaultVar2, 0);
            setalignment.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.write(paintdefaultVar, 0);
        } else {
            int i5 = 0;
            while (true) {
                i = this.PlaybackStateCompatCustomAction;
                if (i5 >= i) {
                    break;
                }
                setAlignment setalignment2 = this.read[i5];
                read(setalignment2);
                paintdefault paintdefaultVar3 = setalignment2.onActivityResult;
                if (fArrSerializer != null) {
                    setalignment2.onRequestPermissionsResult[1] = fArrSerializer[i5];
                }
                if (i5 > 0) {
                    paintdefaultVar3.write(this.read[i5 - 1].r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs, 0);
                } else {
                    paintdefaultVar3.write(paintdefaultVar2, 0);
                }
                int i6 = this.PlaybackStateCompatCustomAction;
                paintdefault paintdefaultVar4 = setalignment2.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
                if (i5 < i6 - 1) {
                    paintdefaultVar4.write(this.read[i5 + 1].onActivityResult, 0);
                } else {
                    paintdefaultVar4.write(paintdefaultVar, 0);
                }
                if (i5 > 0) {
                    paintdefaultVar3.IconCompatParcelizer = (int) this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                }
                i5++;
            }
            while (i < iMax) {
                setAlignment setalignment3 = this.read[i];
                read(setalignment3);
                setalignment3.onActivityResult.write(paintdefaultVar2, 0);
                setalignment3.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.write(paintdefaultVar, 0);
                i++;
            }
        }
        int iMax2 = Math.max(this.PlaybackStateCompatCustomAction, this.RemoteActionCompatParcelizer);
        setAlignment setalignment4 = this.read[0];
        float[] fArrSerializer2 = serializer(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer);
        int i7 = this.RemoteActionCompatParcelizer;
        paintdefault paintdefaultVar5 = this.invalidateMenu;
        paintdefault paintdefaultVar6 = this.onBackPressedDispatcher_delegatelambda010;
        if (i7 == 1) {
            float[] fArr = setalignment4.onRequestPermissionsResult;
            paintdefault paintdefaultVar7 = setalignment4.invalidateMenu;
            paintdefault paintdefaultVar8 = setalignment4.onBackPressedDispatcher_delegatelambda010;
            fArr[0] = -1.0f;
            paintdefaultVar8.RatingCompat();
            paintdefaultVar7.RatingCompat();
            paintdefaultVar8.write(paintdefaultVar6, 0);
            paintdefaultVar7.write(paintdefaultVar5, 0);
        } else {
            int i8 = 0;
            while (true) {
                i2 = this.RemoteActionCompatParcelizer;
                if (i8 >= i2) {
                    break;
                }
                setAlignment setalignment5 = this.read[i8];
                float[] fArr2 = setalignment5.onRequestPermissionsResult;
                paintdefault paintdefaultVar9 = setalignment5.invalidateMenu;
                paintdefault paintdefaultVar10 = setalignment5.onBackPressedDispatcher_delegatelambda010;
                fArr2[0] = -1.0f;
                paintdefaultVar10.RatingCompat();
                paintdefaultVar9.RatingCompat();
                if (fArrSerializer2 != null) {
                    setalignment5.onRequestPermissionsResult[0] = fArrSerializer2[i8];
                }
                if (i8 > 0) {
                    paintdefaultVar10.write(this.read[i8 - 1].invalidateMenu, 0);
                } else {
                    paintdefaultVar10.write(paintdefaultVar6, 0);
                }
                if (i8 < this.RemoteActionCompatParcelizer - 1) {
                    paintdefaultVar9.write(this.read[i8 + 1].onBackPressedDispatcher_delegatelambda010, 0);
                } else {
                    paintdefaultVar9.write(paintdefaultVar5, 0);
                }
                if (i8 > 0) {
                    paintdefaultVar10.IconCompatParcelizer = (int) this.MediaSessionCompatQueueItem;
                }
                i8++;
            }
            while (i2 < iMax2) {
                setAlignment setalignment6 = this.read[i2];
                float[] fArr3 = setalignment6.onRequestPermissionsResult;
                paintdefault paintdefaultVar11 = setalignment6.invalidateMenu;
                paintdefault paintdefaultVar12 = setalignment6.onBackPressedDispatcher_delegatelambda010;
                fArr3[0] = -1.0f;
                paintdefaultVar12.RatingCompat();
                paintdefaultVar11.RatingCompat();
                paintdefaultVar12.write(paintdefaultVar6, 0);
                paintdefaultVar11.write(paintdefaultVar5, 0);
                i2++;
            }
        }
        for (int i9 = 0; i9 < this.removeOnMultiWindowModeChangedListener; i9++) {
            if (!this.ComponentActivity.contains(this.removeOnContextAvailableListener[i9].onSaveInstanceState)) {
                boolean z2 = false;
                int i10 = 0;
                while (!z2) {
                    i10 = this.MediaBrowserCompatMediaItem;
                    if (i10 >= this.PlaybackStateCompatCustomAction * this.RemoteActionCompatParcelizer) {
                        i10 = -1;
                        break;
                    }
                    int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i10);
                    int i11 = read(this.MediaBrowserCompatMediaItem);
                    boolean[] zArr = this.ParcelableVolumeInfo[iRemoteActionCompatParcelizer];
                    if (zArr[i11]) {
                        zArr[i11] = false;
                        z2 = true;
                    }
                    this.MediaBrowserCompatMediaItem++;
                }
                int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(i10);
                int i12 = read(i10);
                if (i10 == -1) {
                    return;
                }
                if ((this.MediaDescriptionCompat & 2) <= 0 || (iArr = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) == null || (i3 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) >= iArr.length) {
                    RemoteActionCompatParcelizer(this.removeOnContextAvailableListener[i9], iRemoteActionCompatParcelizer2, i12, 1, 1);
                } else {
                    int[] iArr2 = iArr[i3];
                    if (iArr2[0] == i10) {
                        this.ParcelableVolumeInfo[iRemoteActionCompatParcelizer2][i12] = true;
                        if (read(iRemoteActionCompatParcelizer2, i12, iArr2[1], iArr2[2])) {
                            setAlignment setalignment7 = this.removeOnContextAvailableListener[i9];
                            int[] iArr3 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus[this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY];
                            RemoteActionCompatParcelizer(setalignment7, iRemoteActionCompatParcelizer2, i12, iArr3[1], iArr3[2]);
                            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY++;
                        }
                    } else {
                        RemoteActionCompatParcelizer(this.removeOnContextAvailableListener[i9], iRemoteActionCompatParcelizer2, i12, 1, 1);
                    }
                }
            }
        }
    }

    public final void IconCompatParcelizer() {
        int i;
        int i2 = this.PlaybackStateCompat;
        if (i2 != 0 && (i = this.write) != 0) {
            this.PlaybackStateCompatCustomAction = i2;
            this.RemoteActionCompatParcelizer = i;
            return;
        }
        int i3 = this.write;
        if (i3 > 0) {
            this.RemoteActionCompatParcelizer = i3;
            this.PlaybackStateCompatCustomAction = ((this.removeOnMultiWindowModeChangedListener + i3) - 1) / i3;
        } else if (i2 > 0) {
            this.PlaybackStateCompatCustomAction = i2;
            this.RemoteActionCompatParcelizer = ((this.removeOnMultiWindowModeChangedListener + i2) - 1) / i2;
        } else {
            int iSqrt = (int) (Math.sqrt(this.removeOnMultiWindowModeChangedListener) + 1.5d);
            this.PlaybackStateCompatCustomAction = iSqrt;
            this.RemoteActionCompatParcelizer = ((this.removeOnMultiWindowModeChangedListener + iSqrt) - 1) / iSqrt;
        }
    }

    public static void read(setAlignment setalignment) {
        setalignment.onRequestPermissionsResult[1] = -1.0f;
        setalignment.onActivityResult.RatingCompat();
        setalignment.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.RatingCompat();
        setalignment.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.RatingCompat();
    }

    public final int RemoteActionCompatParcelizer(int i) {
        return this.MediaSessionCompatToken == 1 ? i % this.PlaybackStateCompatCustomAction : i / this.RemoteActionCompatParcelizer;
    }

    public final int read(int i) {
        return this.MediaSessionCompatToken == 1 ? i / this.PlaybackStateCompatCustomAction : i % this.RemoteActionCompatParcelizer;
    }

    public final void write(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            if (!read(RemoteActionCompatParcelizer(iArr2[0]), read(iArr2[0]), iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    public final void IconCompatParcelizer(int[][] iArr) {
        if ((this.MediaDescriptionCompat & 2) > 0) {
            return;
        }
        for (int i = 0; i < iArr.length; i++) {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(iArr[i][0]);
            int i2 = read(iArr[i][0]);
            int[] iArr2 = iArr[i];
            if (!read(iRemoteActionCompatParcelizer, i2, iArr2[1], iArr2[2])) {
                return;
            }
            setAlignment setalignment = this.removeOnContextAvailableListener[i];
            int[] iArr3 = iArr[i];
            RemoteActionCompatParcelizer(setalignment, iRemoteActionCompatParcelizer, i2, iArr3[1], iArr3[2]);
            this.ComponentActivity.add(this.removeOnContextAvailableListener[i].onSaveInstanceState);
        }
    }

    public final boolean read(int i, int i2, int i3, int i4) {
        for (int i5 = i; i5 < i + i3; i5++) {
            for (int i6 = i2; i6 < i2 + i4; i6++) {
                boolean[][] zArr = this.ParcelableVolumeInfo;
                if (i5 < zArr.length && i6 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i5];
                    if (zArr2[i6]) {
                        zArr2[i6] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }
}
