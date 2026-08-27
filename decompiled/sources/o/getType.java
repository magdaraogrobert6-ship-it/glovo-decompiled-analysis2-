package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class getType {
    public AnchoredDraggableKt ComponentActivity;
    public int IconCompatParcelizer;
    public animateToWithDecay MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public final getDateMillisOrDefault MediaSessionCompatQueueItem;
    public int MediaSessionCompatResultReceiverWrapper;
    public int MediaSessionCompatToken;
    public final getDateMillisOrDefault ParcelableVolumeInfo;
    public int PlaybackStateCompat;
    public int[] PlaybackStateCompatCustomAction;
    public int RatingCompat;
    public animateToWithDecay RemoteActionCompatParcelizer;
    public int ResultReceiver;
    public Object[] r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final AndroidContentCaptureManagersendContentCaptureAppearEvents1 r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public int r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final getDateMillisOrDefault r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public HashMap r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public int read;
    public boolean serializer;
    public ArrayList write;

    public static int write(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public final void read(boolean z) {
        this.serializer = true;
        if (z && this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.RemoteActionCompatParcelizer == 0) {
            PlaybackStateCompatCustomAction(IconCompatParcelizer());
            RemoteActionCompatParcelizer(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.length - this.ResultReceiver, this.MediaSessionCompatToken);
            int i = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            Arrays.fill(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, i, this.ResultReceiver + i, (Object) null);
            RatingCompat();
        }
        int[] iArr = this.PlaybackStateCompatCustomAction;
        int i2 = this.MediaSessionCompatToken;
        Object[] objArr = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        int i3 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        ArrayList arrayList = this.write;
        HashMap map = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        animateToWithDecay animatetowithdecay = this.RemoteActionCompatParcelizer;
        AndroidContentCaptureManagersendContentCaptureAppearEvents1 androidContentCaptureManagersendContentCaptureAppearEvents1 = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        if (!androidContentCaptureManagersendContentCaptureAppearEvents1.PlaybackStateCompatCustomAction) {
            getContentCaptureSessionuiannotations.RemoteActionCompatParcelizer("Unexpected writer close()");
        }
        androidContentCaptureManagersendContentCaptureAppearEvents1.PlaybackStateCompatCustomAction = false;
        androidContentCaptureManagersendContentCaptureAppearEvents1.RemoteActionCompatParcelizer = iArr;
        androidContentCaptureManagersendContentCaptureAppearEvents1.IconCompatParcelizer = i2;
        androidContentCaptureManagersendContentCaptureAppearEvents1.MediaDescriptionCompat = objArr;
        androidContentCaptureManagersendContentCaptureAppearEvents1.MediaSessionCompatQueueItem = i3;
        androidContentCaptureManagersendContentCaptureAppearEvents1.read = arrayList;
        androidContentCaptureManagersendContentCaptureAppearEvents1.MediaBrowserCompatMediaItem = map;
        androidContentCaptureManagersendContentCaptureAppearEvents1.write = animatetowithdecay;
    }

    public static void read(getType gettype) {
        int i = gettype.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int iMediaBrowserCompatMediaItem = gettype.MediaBrowserCompatMediaItem(i);
        int[] iArr = gettype.PlaybackStateCompatCustomAction;
        int i2 = (iMediaBrowserCompatMediaItem * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        gettype.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(gettype.serializer(iArr, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void IconCompatParcelizer(AndroidContentCaptureManagersendContentCaptureAppearEvents1 androidContentCaptureManagersendContentCaptureAppearEvents1, int i) {
        if (this.MediaSessionCompatResultReceiverWrapper <= 0) {
            getCreditCardExpirationDay.read("Check failed");
        }
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (i == 0 && this.IconCompatParcelizer == 0 && this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.IconCompatParcelizer == 0) {
            int[] iArr = androidContentCaptureManagersendContentCaptureAppearEvents1.RemoteActionCompatParcelizer;
            int i2 = iArr[(i * 5) + 3];
            int i3 = androidContentCaptureManagersendContentCaptureAppearEvents1.IconCompatParcelizer;
            if (i2 == i3) {
                int[] iArr2 = this.PlaybackStateCompatCustomAction;
                Object[] objArr5 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                ArrayList arrayList = this.write;
                HashMap map = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                animateToWithDecay animatetowithdecay = this.RemoteActionCompatParcelizer;
                Object[] objArr6 = androidContentCaptureManagersendContentCaptureAppearEvents1.MediaDescriptionCompat;
                int i4 = androidContentCaptureManagersendContentCaptureAppearEvents1.MediaSessionCompatQueueItem;
                HashMap map2 = androidContentCaptureManagersendContentCaptureAppearEvents1.MediaBrowserCompatMediaItem;
                animateToWithDecay animatetowithdecay2 = androidContentCaptureManagersendContentCaptureAppearEvents1.write;
                this.PlaybackStateCompatCustomAction = iArr;
                this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = objArr6;
                this.write = androidContentCaptureManagersendContentCaptureAppearEvents1.read;
                this.MediaSessionCompatToken = i3;
                this.RatingCompat = (iArr.length / 5) - i3;
                this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i4;
                this.ResultReceiver = objArr6.length - i4;
                this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i3;
                this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = map2;
                this.RemoteActionCompatParcelizer = animatetowithdecay2;
                androidContentCaptureManagersendContentCaptureAppearEvents1.RemoteActionCompatParcelizer = iArr2;
                androidContentCaptureManagersendContentCaptureAppearEvents1.IconCompatParcelizer = objArr2 == true ? 1 : 0;
                androidContentCaptureManagersendContentCaptureAppearEvents1.MediaDescriptionCompat = objArr5;
                androidContentCaptureManagersendContentCaptureAppearEvents1.MediaSessionCompatQueueItem = objArr == true ? 1 : 0;
                androidContentCaptureManagersendContentCaptureAppearEvents1.read = arrayList;
                androidContentCaptureManagersendContentCaptureAppearEvents1.MediaBrowserCompatMediaItem = map;
                androidContentCaptureManagersendContentCaptureAppearEvents1.write = animatetowithdecay;
                return;
            }
        }
        getType gettypeRemoteActionCompatParcelizer = androidContentCaptureManagersendContentCaptureAppearEvents1.RemoteActionCompatParcelizer();
        try {
            Object[] objArr7 = new Object[6];
            objArr7[objArr4 == true ? 1 : 0] = gettypeRemoteActionCompatParcelizer;
            boolean z2 = true;
            objArr7[1 == true ? 1 : 0] = Integer.valueOf(i);
            objArr7[2] = this;
            objArr7[3] = Boolean.valueOf((boolean) (1 == true ? 1 : 0));
            objArr7[4] = Boolean.valueOf((boolean) (1 == true ? 1 : 0));
            objArr7[5] = Boolean.valueOf((boolean) (objArr3 == true ? 1 : 0));
            int iWrite = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
        } finally {
            gettypeRemoteActionCompatParcelizer.read(z);
        }
    }

    public final int MediaBrowserCompatMediaItem(int i) {
        return (this.RatingCompat * (i < this.MediaSessionCompatToken ? 0 : 1)) + i;
    }

    public final int MediaMetadataCompat() {
        int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(this.IconCompatParcelizer);
        int i = this.IconCompatParcelizer;
        int[] iArr = this.PlaybackStateCompatCustomAction;
        int i2 = iMediaBrowserCompatMediaItem * 5;
        int i3 = iArr[i2 + 3] + i;
        this.IconCompatParcelizer = i3;
        this.MediaDescriptionCompat = read(iArr, MediaBrowserCompatMediaItem(i3));
        int i4 = this.PlaybackStateCompatCustomAction[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    public final int MediaMetadataCompat(int i) {
        return this.PlaybackStateCompatCustomAction[(MediaBrowserCompatMediaItem(i) * 5) + 3];
    }

    public final int MediaSessionCompatQueueItem(int i) {
        return this.PlaybackStateCompatCustomAction[MediaBrowserCompatMediaItem(i) * 5];
    }

    public final void MediaSessionCompatQueueItem() {
        int i = this.read;
        this.IconCompatParcelizer = i;
        this.MediaDescriptionCompat = read(this.PlaybackStateCompatCustomAction, MediaBrowserCompatMediaItem(i));
    }

    public final boolean MediaSessionCompatResultReceiverWrapper(int i) {
        return (this.PlaybackStateCompatCustomAction[(MediaBrowserCompatMediaItem(i) * 5) + 1] & 1073741824) != 0;
    }

    public final void PlaybackStateCompat(int i) {
        if (i > 0) {
            int i2 = this.IconCompatParcelizer;
            PlaybackStateCompatCustomAction(i2);
            int i3 = this.MediaSessionCompatToken;
            int i4 = this.RatingCompat;
            int[] iArr = this.PlaybackStateCompatCustomAction;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[iMax * 5];
                int i6 = iMax - i5;
                onContentCardClicked.IconCompatParcelizer(iArr, 0, iArr2, 0, i3 * 5);
                onContentCardClicked.IconCompatParcelizer(iArr, (i3 + i6) * 5, iArr2, (i4 + i3) * 5, length * 5);
                this.PlaybackStateCompatCustomAction = iArr2;
                i4 = i6;
            }
            int i7 = this.read;
            if (i7 >= i3) {
                this.read = i7 + i;
            }
            int i8 = i3 + i;
            this.MediaSessionCompatToken = i8;
            this.RatingCompat = i4 - i;
            int iWrite = write(i5 > 0 ? read(i2 + i) : 0, this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY >= i3 ? this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 : 0, this.ResultReceiver, this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.length);
            for (int i9 = i3; i9 < i8; i9++) {
                this.PlaybackStateCompatCustomAction[(i9 * 5) + 4] = iWrite;
            }
            int i10 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            if (i10 >= i3) {
                this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i10 + i;
            }
        }
    }

    public final void PlaybackStateCompatCustomAction(int i) {
        AndroidContentCaptureManagercurrentSemanticsNodes1 androidContentCaptureManagercurrentSemanticsNodes1;
        int i2;
        AndroidContentCaptureManagercurrentSemanticsNodes1 androidContentCaptureManagercurrentSemanticsNodes2;
        int i3;
        int i4;
        int i5 = this.RatingCompat;
        int i6 = this.MediaSessionCompatToken;
        if (i6 != i) {
            if (!this.write.isEmpty()) {
                int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer() - this.RatingCompat;
                ArrayList arrayList = this.write;
                if (i6 < i) {
                    for (int iSerializer = AbstractC0170getTimestamp.serializer(arrayList, i6, iRemoteActionCompatParcelizer); iSerializer < this.write.size() && (i3 = (androidContentCaptureManagercurrentSemanticsNodes2 = (AndroidContentCaptureManagercurrentSemanticsNodes1) this.write.get(iSerializer)).IconCompatParcelizer) < 0 && (i4 = i3 + iRemoteActionCompatParcelizer) < i; iSerializer++) {
                        androidContentCaptureManagercurrentSemanticsNodes2.IconCompatParcelizer = i4;
                    }
                } else {
                    for (int iSerializer2 = AbstractC0170getTimestamp.serializer(arrayList, i, iRemoteActionCompatParcelizer); iSerializer2 < this.write.size() && (i2 = (androidContentCaptureManagercurrentSemanticsNodes1 = (AndroidContentCaptureManagercurrentSemanticsNodes1) this.write.get(iSerializer2)).IconCompatParcelizer) >= 0; iSerializer2++) {
                        androidContentCaptureManagercurrentSemanticsNodes1.IconCompatParcelizer = -(iRemoteActionCompatParcelizer - i2);
                    }
                }
            }
            if (i5 > 0) {
                int[] iArr = this.PlaybackStateCompatCustomAction;
                int i7 = i * 5;
                int i8 = i5 * 5;
                int i9 = i6 * 5;
                if (i < i6) {
                    onContentCardClicked.IconCompatParcelizer(iArr, i8 + i7, iArr, i7, i9);
                } else {
                    onContentCardClicked.IconCompatParcelizer(iArr, i9, iArr, i9 + i8, i7 + i8);
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer();
            if (i6 >= iRemoteActionCompatParcelizer2) {
                getCreditCardExpirationDay.read("Check failed");
            }
            while (i6 < iRemoteActionCompatParcelizer2) {
                int i10 = (i6 * 5) + 2;
                int i11 = this.PlaybackStateCompatCustomAction[i10];
                int iIconCompatParcelizer = i11 > -2 ? i11 : IconCompatParcelizer() + i11 + 2;
                if (iIconCompatParcelizer >= i) {
                    iIconCompatParcelizer = -((IconCompatParcelizer() - iIconCompatParcelizer) + 2);
                }
                if (iIconCompatParcelizer != i11) {
                    this.PlaybackStateCompatCustomAction[i10] = iIconCompatParcelizer;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.MediaSessionCompatToken = i;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.PlaybackStateCompatCustomAction.length / 5;
    }

    public final int RemoteActionCompatParcelizer(int i) {
        return (this.ResultReceiver * (i < this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 ? 0 : 1)) + i;
    }

    public final void RemoteActionCompatParcelizer(int i, int i2) {
        int i3 = this.ResultReceiver;
        int i4 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        int i5 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (i4 != i) {
            Object[] objArr = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int iMin = Math.min(i2 + 1, IconCompatParcelizer());
        if (i5 != iMin) {
            int length = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.length - i3;
            if (iMin < i5) {
                int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(iMin);
                int iMediaBrowserCompatMediaItem2 = MediaBrowserCompatMediaItem(i5);
                int i7 = this.MediaSessionCompatToken;
                while (iMediaBrowserCompatMediaItem < iMediaBrowserCompatMediaItem2) {
                    int i8 = (iMediaBrowserCompatMediaItem * 5) + 4;
                    int i9 = this.PlaybackStateCompatCustomAction[i8];
                    if (i9 < 0) {
                        getCreditCardExpirationDay.read("Unexpected anchor value, expected a positive anchor");
                    }
                    this.PlaybackStateCompatCustomAction[i8] = -((length - i9) + 1);
                    iMediaBrowserCompatMediaItem++;
                    if (iMediaBrowserCompatMediaItem == i7) {
                        iMediaBrowserCompatMediaItem += this.RatingCompat;
                    }
                }
            } else {
                int iMediaBrowserCompatMediaItem3 = MediaBrowserCompatMediaItem(i5);
                int iMediaBrowserCompatMediaItem4 = MediaBrowserCompatMediaItem(iMin);
                while (iMediaBrowserCompatMediaItem3 < iMediaBrowserCompatMediaItem4) {
                    int i10 = (iMediaBrowserCompatMediaItem3 * 5) + 4;
                    int i11 = this.PlaybackStateCompatCustomAction[i10];
                    if (i11 >= 0) {
                        getCreditCardExpirationDay.read("Unexpected anchor value, expected a negative anchor");
                    }
                    this.PlaybackStateCompatCustomAction[i10] = i11 + length + 1;
                    iMediaBrowserCompatMediaItem3++;
                    if (iMediaBrowserCompatMediaItem3 == this.MediaSessionCompatToken) {
                        iMediaBrowserCompatMediaItem3 += this.RatingCompat;
                    }
                }
            }
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = iMin;
        }
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i;
    }

    public final void r8lambda54BeH8ZsBru0CXI2CCSP2syNys(int i) {
        if (i >= 0) {
            AnchoredDraggableKt anchoredDraggableKt = this.ComponentActivity;
            if (anchoredDraggableKt == null) {
                anchoredDraggableKt = new AnchoredDraggableKt();
                this.ComponentActivity = anchoredDraggableKt;
            }
            r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.write(anchoredDraggableKt, i);
        }
    }

    public final void read(int i, int i2) {
        if (i > 0) {
            RemoteActionCompatParcelizer(this.MediaDescriptionCompat, i2);
            int i3 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            int i4 = this.ResultReceiver;
            if (i4 < i) {
                Object[] objArr = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                int length = objArr.length;
                int i5 = length - i4;
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = iMax - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = objArr2;
                i4 = i7;
            }
            int i9 = this.MediaMetadataCompat;
            if (i9 >= i3) {
                this.MediaMetadataCompat = i9 + i;
            }
            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i3 + i;
            this.ResultReceiver = i4 - i;
        }
    }

    public final void read(Object obj) {
        int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(this.IconCompatParcelizer);
        int i = (iMediaBrowserCompatMediaItem * 5) + 1;
        if ((this.PlaybackStateCompatCustomAction[i] & 268435456) == 0) {
            getCreditCardExpirationDay.read("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        int[] iArr = this.PlaybackStateCompatCustomAction;
        objArr[RemoteActionCompatParcelizer(Integer.bitCount(iArr[i] >> 29) + read(iArr, iMediaBrowserCompatMediaItem))] = obj;
    }

    public final AndroidContentCaptureManagercurrentSemanticsNodes1 serializer(int i) {
        ArrayList arrayList = this.write;
        int iWrite = AbstractC0170getTimestamp.write(arrayList, i, IconCompatParcelizer());
        if (iWrite >= 0) {
            return (AndroidContentCaptureManagercurrentSemanticsNodes1) arrayList.get(iWrite);
        }
        if (i > this.MediaSessionCompatToken) {
            i = -(IconCompatParcelizer() - i);
        }
        AndroidContentCaptureManagercurrentSemanticsNodes1 androidContentCaptureManagercurrentSemanticsNodes1 = new AndroidContentCaptureManagercurrentSemanticsNodes1(i);
        arrayList.add(-(iWrite + 1), androidContentCaptureManagercurrentSemanticsNodes1);
        return androidContentCaptureManagercurrentSemanticsNodes1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void serializer(Object obj, Object obj2, boolean z, int i) {
        int i2;
        int i3 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        Object[] objArr = this.MediaSessionCompatResultReceiverWrapper > 0;
        this.ParcelableVolumeInfo.IconCompatParcelizer(this.PlaybackStateCompat);
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        if (objArr == true) {
            int i4 = this.IconCompatParcelizer;
            int i5 = read(this.PlaybackStateCompatCustomAction, MediaBrowserCompatMediaItem(i4));
            PlaybackStateCompat(1);
            this.MediaDescriptionCompat = i5;
            this.MediaMetadataCompat = i5;
            int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(i4);
            int i6 = obj != androidContentCaptureManager ? 1 : 0;
            int i7 = (z || obj2 == androidContentCaptureManager) ? 0 : 1;
            int iWrite = write(i5, this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, this.ResultReceiver, this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.length);
            if (iWrite >= 0 && this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY < i4) {
                iWrite = -(((this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.length - this.ResultReceiver) - iWrite) + 1);
            }
            int[] iArr = this.PlaybackStateCompatCustomAction;
            int i8 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            int i9 = iMediaBrowserCompatMediaItem * 5;
            iArr[i9] = i;
            iArr[i9 + 1] = ((z ? 1 : 0) << 30) | (i6 << 29) | (i7 << 28);
            iArr[i9 + 2] = i8;
            iArr[i9 + 3] = 0;
            iArr[i9 + 4] = iWrite;
            int i10 = (z ? 1 : 0) + i6 + i7;
            if (i10 > 0) {
                read(i10, i4);
                Object[] objArr2 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                int i11 = this.MediaDescriptionCompat;
                if (z) {
                    objArr2[i11] = obj2;
                    i11++;
                }
                if (i6 != 0) {
                    objArr2[i11] = obj;
                    i11++;
                }
                if (i7 != 0) {
                    objArr2[i11] = obj2;
                    i11++;
                }
                this.MediaDescriptionCompat = i11;
            }
            this.PlaybackStateCompat = 0;
            i2 = i4 + 1;
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4;
            this.IconCompatParcelizer = i2;
            if (i3 >= 0) {
                MediaSessionCompatToken(i3);
            }
        } else {
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.IconCompatParcelizer(i3);
            this.MediaSessionCompatQueueItem.IconCompatParcelizer((RemoteActionCompatParcelizer() - this.RatingCompat) - this.read);
            int i12 = this.IconCompatParcelizer;
            int iMediaBrowserCompatMediaItem2 = MediaBrowserCompatMediaItem(i12);
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj2, androidContentCaptureManager}, getCieXyz.write())).booleanValue()) {
                if (z) {
                    write(this.IconCompatParcelizer, obj2);
                } else {
                    read(obj2);
                }
            }
            this.MediaDescriptionCompat = write(this.PlaybackStateCompatCustomAction, iMediaBrowserCompatMediaItem2);
            this.MediaMetadataCompat = read(this.PlaybackStateCompatCustomAction, MediaBrowserCompatMediaItem(this.IconCompatParcelizer + 1));
            int[] iArr2 = this.PlaybackStateCompatCustomAction;
            int i13 = iMediaBrowserCompatMediaItem2 * 5;
            this.PlaybackStateCompat = iArr2[i13 + 1] & 67108863;
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i12;
            this.IconCompatParcelizer = i12 + 1;
            i2 = i12 + iArr2[i13 + 3];
        }
        this.read = i2;
    }

    public final void write(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.ResultReceiver;
            int i5 = i + i2;
            RemoteActionCompatParcelizer(i5, i3);
            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i;
            this.ResultReceiver = i4 + i2;
            Arrays.fill(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, i, i5, (Object) null);
            int i6 = this.MediaMetadataCompat;
            if (i6 >= i) {
                this.MediaMetadataCompat = i6 - i2;
            }
        }
    }

    public getType(AndroidContentCaptureManagersendContentCaptureAppearEvents1 androidContentCaptureManagersendContentCaptureAppearEvents1) {
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = androidContentCaptureManagersendContentCaptureAppearEvents1;
        int[] iArr = androidContentCaptureManagersendContentCaptureAppearEvents1.RemoteActionCompatParcelizer;
        this.PlaybackStateCompatCustomAction = iArr;
        Object[] objArr = androidContentCaptureManagersendContentCaptureAppearEvents1.MediaDescriptionCompat;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = objArr;
        this.write = androidContentCaptureManagersendContentCaptureAppearEvents1.read;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = androidContentCaptureManagersendContentCaptureAppearEvents1.MediaBrowserCompatMediaItem;
        this.RemoteActionCompatParcelizer = androidContentCaptureManagersendContentCaptureAppearEvents1.write;
        int i = androidContentCaptureManagersendContentCaptureAppearEvents1.IconCompatParcelizer;
        this.MediaSessionCompatToken = i;
        this.RatingCompat = (iArr.length / 5) - i;
        int i2 = androidContentCaptureManagersendContentCaptureAppearEvents1.MediaSessionCompatQueueItem;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i2;
        this.ResultReceiver = objArr.length - i2;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new getDateMillisOrDefault(0);
        this.MediaSessionCompatQueueItem = new getDateMillisOrDefault(0);
        this.ParcelableVolumeInfo = new getDateMillisOrDefault(0);
        this.read = i;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = -1;
    }

    public final AndroidContentCaptureManagercurrentSemanticsNodes1 ResultReceiver(int i) {
        ArrayList arrayList;
        int iWrite;
        if (i < 0 || i >= IconCompatParcelizer() || (iWrite = AbstractC0170getTimestamp.write((arrayList = this.write), i, IconCompatParcelizer())) < 0) {
            return null;
        }
        return (AndroidContentCaptureManagercurrentSemanticsNodes1) arrayList.get(iWrite);
    }

    public final boolean write(int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            ArrayList arrayList = this.write;
            PlaybackStateCompatCustomAction(i);
            if (!arrayList.isEmpty()) {
                HashMap map = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                int i3 = i + i2;
                int iSerializer = AbstractC0170getTimestamp.serializer(this.write, i3, RemoteActionCompatParcelizer() - this.RatingCompat);
                if (iSerializer >= this.write.size()) {
                    iSerializer--;
                }
                int i4 = iSerializer + 1;
                int i5 = 0;
                while (iSerializer >= 0) {
                    AndroidContentCaptureManagercurrentSemanticsNodes1 androidContentCaptureManagercurrentSemanticsNodes1 = (AndroidContentCaptureManagercurrentSemanticsNodes1) this.write.get(iSerializer);
                    int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(androidContentCaptureManagercurrentSemanticsNodes1);
                    if (iRemoteActionCompatParcelizer < i) {
                        break;
                    }
                    if (iRemoteActionCompatParcelizer < i3) {
                        androidContentCaptureManagercurrentSemanticsNodes1.IconCompatParcelizer = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i5 == 0) {
                            i5 = iSerializer + 1;
                        }
                        i4 = iSerializer;
                    }
                    iSerializer--;
                }
                z = i4 < i5;
                if (z) {
                    this.write.subList(i4, i5).clear();
                }
            }
            this.MediaSessionCompatToken = i;
            this.RatingCompat += i2;
            int i6 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            if (i6 > i) {
                this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = Math.max(i, i6 - i2);
            }
            int i7 = this.read;
            if (i7 >= this.MediaSessionCompatToken) {
                this.read = i7 - i2;
            }
            int i8 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            if (i8 >= 0 && (this.PlaybackStateCompatCustomAction[(MediaBrowserCompatMediaItem(i8) * 5) + 1] & 67108864) != 0) {
                r8lambda54BeH8ZsBru0CXI2CCSP2syNys(i8);
            }
        }
        return z;
    }

    public final int IconCompatParcelizer() {
        return RemoteActionCompatParcelizer() - this.RatingCompat;
    }

    public final Object MediaDescriptionCompat(int i) {
        int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(i);
        int[] iArr = this.PlaybackStateCompatCustomAction;
        int i2 = (iMediaBrowserCompatMediaItem * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return getCreditCardExpirationMonth.write;
        }
        return this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys[Integer.bitCount(iArr[i2] >> 29) + read(iArr, iMediaBrowserCompatMediaItem)];
    }

    public final Object ParcelableVolumeInfo(int i) {
        int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(i);
        int[] iArr = this.PlaybackStateCompatCustomAction;
        if ((iArr[(iMediaBrowserCompatMediaItem * 5) + 1] & 1073741824) != 0) {
            return this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys[RemoteActionCompatParcelizer(read(iArr, iMediaBrowserCompatMediaItem))];
        }
        return null;
    }

    public final Object RatingCompat(int i) {
        int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(i);
        int[] iArr = this.PlaybackStateCompatCustomAction;
        if ((iArr[(iMediaBrowserCompatMediaItem * 5) + 1] & 536870912) != 0) {
            return this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys[AbstractC0170getTimestamp.write(iArr, iMediaBrowserCompatMediaItem)];
        }
        return null;
    }

    public final void RatingCompat() {
        int i;
        AnchoredDraggableKt anchoredDraggableKt = this.ComponentActivity;
        if (anchoredDraggableKt != null) {
            while (anchoredDraggableKt.RemoteActionCompatParcelizer != 0) {
                int iRemoteActionCompatParcelizer = r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.RemoteActionCompatParcelizer(anchoredDraggableKt);
                int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(iRemoteActionCompatParcelizer);
                int iMediaMetadataCompat = iRemoteActionCompatParcelizer + 1;
                int iMediaMetadataCompat2 = MediaMetadataCompat(iRemoteActionCompatParcelizer);
                while (true) {
                    if (iMediaMetadataCompat >= iMediaMetadataCompat2 + iRemoteActionCompatParcelizer) {
                        i = 0;
                        break;
                    } else {
                        if ((this.PlaybackStateCompatCustomAction[(MediaBrowserCompatMediaItem(iMediaMetadataCompat) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        iMediaMetadataCompat += MediaMetadataCompat(iMediaMetadataCompat);
                    }
                }
                int[] iArr = this.PlaybackStateCompatCustomAction;
                int i2 = (iMediaBrowserCompatMediaItem * 5) + 1;
                int i3 = iArr[i2];
                if (((67108864 & i3) != 0 ? 1 : 0) != i) {
                    iArr[i2] = (i << 26) | (i3 & (-67108865));
                    int iSerializer = serializer(iArr, iRemoteActionCompatParcelizer);
                    if (iSerializer >= 0) {
                        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.write(anchoredDraggableKt, iSerializer);
                    }
                }
            }
        }
    }

    public final int RemoteActionCompatParcelizer(AndroidContentCaptureManagercurrentSemanticsNodes1 androidContentCaptureManagercurrentSemanticsNodes1) {
        int i = androidContentCaptureManagercurrentSemanticsNodes1.IconCompatParcelizer;
        return i < 0 ? IconCompatParcelizer() + i : i;
    }

    public final Object RemoteActionCompatParcelizer(int i, int i2, Object obj) {
        int iWrite = write(this.PlaybackStateCompatCustomAction, MediaBrowserCompatMediaItem(i));
        int i3 = read(this.PlaybackStateCompatCustomAction, MediaBrowserCompatMediaItem(i + 1));
        int i4 = iWrite + i2;
        if (i4 < iWrite || i4 >= i3) {
            getCreditCardExpirationDay.read("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i4);
        Object[] objArr = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        Object obj2 = objArr[iRemoteActionCompatParcelizer];
        objArr[iRemoteActionCompatParcelizer] = obj;
        return obj2;
    }

    public final void read() {
        int i = this.MediaSessionCompatResultReceiverWrapper;
        this.MediaSessionCompatResultReceiverWrapper = i + 1;
        if (i == 0) {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            int i2 = this.RatingCompat;
            this.MediaSessionCompatQueueItem.IconCompatParcelizer((iRemoteActionCompatParcelizer - i2) - this.read);
        }
    }

    public final String toString() {
        return "SlotWriter(current = " + this.IconCompatParcelizer + " end=" + this.read + " size = " + IconCompatParcelizer() + " gap=" + this.MediaSessionCompatToken + '-' + (this.MediaSessionCompatToken + this.RatingCompat) + ')';
    }

    public final void write(int i, Object obj) {
        int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(i);
        int[] iArr = this.PlaybackStateCompatCustomAction;
        if (iMediaBrowserCompatMediaItem >= iArr.length || (iArr[(iMediaBrowserCompatMediaItem * 5) + 1] & 1073741824) == 0) {
            getCreditCardExpirationDay.read("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys[RemoteActionCompatParcelizer(read(this.PlaybackStateCompatCustomAction, iMediaBrowserCompatMediaItem))] = obj;
    }

    public final AndroidContentCaptureManagerViewTranslationHelperMethodsExternalSyntheticLambda1 MediaSessionCompatToken(int i) {
        AndroidContentCaptureManagercurrentSemanticsNodes1 androidContentCaptureManagercurrentSemanticsNodes1ResultReceiver;
        HashMap map = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        if (map == null || (androidContentCaptureManagercurrentSemanticsNodes1ResultReceiver = ResultReceiver(i)) == null) {
            return null;
        }
        return (AndroidContentCaptureManagerViewTranslationHelperMethodsExternalSyntheticLambda1) map.get(androidContentCaptureManagercurrentSemanticsNodes1ResultReceiver);
    }

    public final void read(int i, int i2, int i3) {
        if (i >= this.MediaSessionCompatToken) {
            i = -((IconCompatParcelizer() - i) + 2);
        }
        while (i3 < i2) {
            this.PlaybackStateCompatCustomAction[(MediaBrowserCompatMediaItem(i3) * 5) + 2] = i;
            int i4 = this.PlaybackStateCompatCustomAction[(MediaBrowserCompatMediaItem(i3) * 5) + 3] + i3;
            read(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    public final boolean serializer(int i, int i2) {
        int iRemoteActionCompatParcelizer;
        int iMediaMetadataCompat;
        if (i2 == this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
            iRemoteActionCompatParcelizer = this.read;
        } else {
            getDateMillisOrDefault getdatemillisordefault = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            if (i2 > getdatemillisordefault.read(0)) {
                iMediaMetadataCompat = MediaMetadataCompat(i2);
            } else {
                int[] iArr = getdatemillisordefault.read;
                int iMin = Math.min(iArr.length, getdatemillisordefault.RemoteActionCompatParcelizer);
                int i3 = 0;
                while (true) {
                    if (i3 >= iMin) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    iMediaMetadataCompat = MediaMetadataCompat(i2);
                } else {
                    iRemoteActionCompatParcelizer = (RemoteActionCompatParcelizer() - this.RatingCompat) - this.MediaSessionCompatQueueItem.read[i3];
                }
            }
            iRemoteActionCompatParcelizer = iMediaMetadataCompat + i2;
        }
        return i > i2 && i < iRemoteActionCompatParcelizer;
    }

    public final Object write(Object obj) {
        if (this.MediaSessionCompatResultReceiverWrapper > 0) {
            read(1, this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
        }
        Object[] objArr = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        int i = this.MediaDescriptionCompat;
        this.MediaDescriptionCompat = i + 1;
        Object obj2 = objArr[RemoteActionCompatParcelizer(i)];
        if (this.MediaDescriptionCompat > this.MediaMetadataCompat) {
            getCreditCardExpirationDay.read("Writing to an invalid slot");
        }
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys[RemoteActionCompatParcelizer(this.MediaDescriptionCompat - 1)] = obj;
        return obj2;
    }

    public final void write(int i) {
        if (i < 0) {
            getCreditCardExpirationDay.read("Cannot seek backwards");
        }
        if (this.MediaSessionCompatResultReceiverWrapper > 0) {
            getContentCaptureSessionuiannotations.write("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.IconCompatParcelizer + i;
        if (i2 < this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus || i2 > this.read) {
            getCreditCardExpirationDay.read("Cannot seek outside the current group (" + this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + '-' + this.read + ')');
        }
        this.IconCompatParcelizer = i2;
        int i3 = read(this.PlaybackStateCompatCustomAction, MediaBrowserCompatMediaItem(i2));
        this.MediaDescriptionCompat = i3;
        this.MediaMetadataCompat = i3;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0094  */
    public final void RemoteActionCompatParcelizer(int i, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        int i2;
        int i3;
        int iSerializer = serializer(this.PlaybackStateCompatCustomAction, i);
        int iIconCompatParcelizer = IconCompatParcelizer();
        int iMediaMetadataCompat = MediaMetadataCompat(i);
        int i4 = i;
        drag dragVar = null;
        AnchoredDraggableKt anchoredDraggableKt = null;
        while (i4 < iMediaMetadataCompat + i) {
            int i5 = read(i4);
            int i6 = i4 + 1;
            int i7 = read(i6);
            while (i5 < i7) {
                Object obj = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys[RemoteActionCompatParcelizer(i5)];
                if (obj instanceof createFromAutofillValue) {
                    createFromAutofillValue createfromautofillvalue = (createFromAutofillValue) obj;
                    if (!(createfromautofillvalue instanceof createFromAutofillValue)) {
                        createfromautofillvalue = null;
                    }
                    if (createfromautofillvalue != null) {
                        int i8 = createfromautofillvalue.write;
                        if (i8 >= 0) {
                            int iMediaMetadataCompat2 = MediaMetadataCompat(i4) + i4;
                            int i9 = i6;
                            int i10 = 0;
                            while (i9 < iMediaMetadataCompat2 && i10 < i8) {
                                int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(i9);
                                int i11 = iSerializer;
                                int[] iArr = this.PlaybackStateCompatCustomAction;
                                int i12 = iMediaBrowserCompatMediaItem * 5;
                                i9 = iArr[i12 + 3] + i9;
                                if (i9 < iMediaMetadataCompat2 && (iArr[i12 + 1] & 536870912) == 0) {
                                    i10++;
                                }
                                iSerializer = i11;
                            }
                            i3 = iSerializer;
                            if (dragVar == null) {
                                int[] iArr2 = Contentfoundation.read;
                                dragVar = new drag();
                            }
                            if (anchoredDraggableKt == null) {
                                anchoredDraggableKt = new AnchoredDraggableKt();
                            }
                            dragVar.RemoteActionCompatParcelizer(i9);
                            anchoredDraggableKt.IconCompatParcelizer(i9);
                            anchoredDraggableKt.IconCompatParcelizer(i5);
                        } else {
                            i3 = iSerializer;
                            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(Integer.valueOf(i5), obj);
                        }
                    } else {
                        getCreditCardExpirationDay.IconCompatParcelizer("Inconsistent composition");
                        DrawableTransformation.read();
                        return;
                    }
                } else {
                    i3 = iSerializer;
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(Integer.valueOf(i5), obj);
                }
                i5++;
                iSerializer = i3;
            }
            int i13 = iSerializer;
            iSerializer = i6 < iIconCompatParcelizer ? serializer(this.PlaybackStateCompatCustomAction, i6) : -1;
            if (iSerializer != i4) {
                int iSerializer2 = i13;
                while (true) {
                    if (anchoredDraggableKt == null || dragVar == null || !dragVar.IconCompatParcelizer(i4)) {
                        i2 = iIconCompatParcelizer;
                    } else {
                        int i14 = anchoredDraggableKt.RemoteActionCompatParcelizer;
                        int i15 = i14 / 2;
                        int i16 = 0;
                        int i17 = 0;
                        while (i16 < i15) {
                            int i18 = i16 * 2;
                            int i19 = iIconCompatParcelizer;
                            int iRemoteActionCompatParcelizer = anchoredDraggableKt.RemoteActionCompatParcelizer(i18);
                            if (iRemoteActionCompatParcelizer == i4) {
                                int iRemoteActionCompatParcelizer2 = anchoredDraggableKt.RemoteActionCompatParcelizer(i18 + 1);
                                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(Integer.valueOf(iRemoteActionCompatParcelizer2), this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys[RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer2)]);
                            } else if (i18 != i17) {
                                anchoredDraggableKt.write(i17, iRemoteActionCompatParcelizer);
                                anchoredDraggableKt.write(i17 + 1, anchoredDraggableKt.RemoteActionCompatParcelizer(i18 + 1));
                                i17 += 2;
                            } else {
                                i17 += 2;
                            }
                            i16++;
                            iIconCompatParcelizer = i19;
                        }
                        i2 = iIconCompatParcelizer;
                        if (i17 != i14) {
                            anchoredDraggableKt.RemoteActionCompatParcelizer(i17, i14);
                        }
                    }
                    if (i4 == i || iSerializer2 == iSerializer) {
                        break;
                    }
                    i4 = iSerializer2;
                    iSerializer2 = serializer(this.PlaybackStateCompatCustomAction, iSerializer2);
                    iIconCompatParcelizer = i2;
                }
            } else {
                i2 = iIconCompatParcelizer;
            }
            i4 = i6;
            iIconCompatParcelizer = i2;
        }
    }

    public final int read(int[] iArr, int i) {
        if (i >= RemoteActionCompatParcelizer()) {
            return this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.length - this.ResultReceiver;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.length - this.ResultReceiver) + i2 + 1 : i2;
    }

    public final int write(int[] iArr, int i) {
        if (i >= RemoteActionCompatParcelizer()) {
            return this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.length - this.ResultReceiver;
        }
        int i2 = AbstractC0170getTimestamp.read(iArr, i);
        return i2 < 0 ? (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.length - this.ResultReceiver) + i2 + 1 : i2;
    }

    public final boolean MediaDescriptionCompat() {
        if (this.MediaSessionCompatResultReceiverWrapper != 0) {
            getCreditCardExpirationDay.read("Cannot remove group while inserting");
        }
        int i = this.IconCompatParcelizer;
        int i2 = this.MediaDescriptionCompat;
        int i3 = read(this.PlaybackStateCompatCustomAction, MediaBrowserCompatMediaItem(i));
        int iMediaMetadataCompat = MediaMetadataCompat();
        MediaSessionCompatToken(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
        AnchoredDraggableKt anchoredDraggableKt = this.ComponentActivity;
        if (anchoredDraggableKt != null) {
            while (true) {
                int i4 = anchoredDraggableKt.RemoteActionCompatParcelizer;
                if (i4 == 0) {
                    break;
                }
                if (i4 == 0) {
                    ForEachGestureKt.RemoteActionCompatParcelizer("IntList is empty.");
                    throw null;
                }
                if (anchoredDraggableKt.read[0] < i) {
                    break;
                }
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.RemoteActionCompatParcelizer(anchoredDraggableKt);
            }
        }
        boolean zWrite = write(i, this.IconCompatParcelizer - i);
        write(i3, this.MediaDescriptionCompat - i3, i - 1);
        this.IconCompatParcelizer = i;
        this.MediaDescriptionCompat = i2;
        this.PlaybackStateCompat -= iMediaMetadataCompat;
        return zWrite;
    }

    public final void serializer() {
        if (this.MediaSessionCompatResultReceiverWrapper <= 0) {
            getContentCaptureSessionuiannotations.write("Unbalanced begin/end insert");
        }
        int i = this.MediaSessionCompatResultReceiverWrapper - 1;
        this.MediaSessionCompatResultReceiverWrapper = i;
        if (i == 0) {
            if (this.ParcelableVolumeInfo.RemoteActionCompatParcelizer != this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.RemoteActionCompatParcelizer) {
                getCreditCardExpirationDay.read("startGroup/endGroup mismatch while inserting");
            }
            this.read = (RemoteActionCompatParcelizer() - this.RatingCompat) - this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer();
        }
    }

    public final int serializer(int[] iArr, int i) {
        int i2 = iArr[(MediaBrowserCompatMediaItem(i) * 5) + 2];
        return i2 > -2 ? i2 : IconCompatParcelizer() + i2 + 2;
    }

    public final void write() {
        ContentInViewNode contentInViewNode;
        boolean z = this.MediaSessionCompatResultReceiverWrapper > 0;
        int i = this.IconCompatParcelizer;
        int i2 = this.read;
        int i3 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(i3);
        int i4 = this.PlaybackStateCompat;
        int i5 = i - i3;
        int i6 = iMediaBrowserCompatMediaItem * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.PlaybackStateCompatCustomAction[i7] & 1073741824) != 0;
        getDateMillisOrDefault getdatemillisordefault = this.ParcelableVolumeInfo;
        if (z) {
            animateToWithDecay animatetowithdecay = this.MediaBrowserCompatMediaItem;
            if (animatetowithdecay != null && (contentInViewNode = (ContentInViewNode) animatetowithdecay.serializer(i3)) != null) {
                Object[] objArr = contentInViewNode.read;
                int i8 = contentInViewNode.IconCompatParcelizer;
                for (int i9 = 0; i9 < i8; i9++) {
                    write(objArr[i9]);
                }
            }
            int[] iArr = this.PlaybackStateCompatCustomAction;
            iArr[i6 + 3] = i5;
            AbstractC0170getTimestamp.write(iArr, iMediaBrowserCompatMediaItem, i4);
            int iRemoteActionCompatParcelizer = getdatemillisordefault.RemoteActionCompatParcelizer();
            if (z2) {
                i4 = 1;
            }
            this.PlaybackStateCompat = iRemoteActionCompatParcelizer + i4;
            int iSerializer = serializer(this.PlaybackStateCompatCustomAction, i3);
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = iSerializer;
            int iIconCompatParcelizer = iSerializer < 0 ? IconCompatParcelizer() : MediaBrowserCompatMediaItem(iSerializer + 1);
            int i10 = iIconCompatParcelizer >= 0 ? read(this.PlaybackStateCompatCustomAction, iIconCompatParcelizer) : 0;
            this.MediaDescriptionCompat = i10;
            this.MediaMetadataCompat = i10;
            return;
        }
        if (i != i2) {
            getCreditCardExpirationDay.read("Expected to be at the end of a group");
        }
        int[] iArr2 = this.PlaybackStateCompatCustomAction;
        int i11 = i6 + 3;
        int i12 = iArr2[i11];
        int i13 = iArr2[i7] & 67108863;
        iArr2[i11] = i5;
        AbstractC0170getTimestamp.write(iArr2, iMediaBrowserCompatMediaItem, i4);
        int iRemoteActionCompatParcelizer2 = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.RemoteActionCompatParcelizer();
        this.read = (RemoteActionCompatParcelizer() - this.RatingCompat) - this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer();
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = iRemoteActionCompatParcelizer2;
        int iSerializer2 = serializer(this.PlaybackStateCompatCustomAction, i3);
        int iRemoteActionCompatParcelizer3 = getdatemillisordefault.RemoteActionCompatParcelizer();
        this.PlaybackStateCompat = iRemoteActionCompatParcelizer3;
        if (iSerializer2 == iRemoteActionCompatParcelizer2) {
            this.PlaybackStateCompat = iRemoteActionCompatParcelizer3 + (z2 ? 0 : i4 - i13);
            return;
        }
        int i14 = i5 - i12;
        int i15 = z2 ? 0 : i4 - i13;
        if (i14 != 0 || i15 != 0) {
            while (iSerializer2 != 0 && iSerializer2 != iRemoteActionCompatParcelizer2 && (i15 != 0 || i14 != 0)) {
                int iMediaBrowserCompatMediaItem2 = MediaBrowserCompatMediaItem(iSerializer2);
                if (i14 != 0) {
                    int[] iArr3 = this.PlaybackStateCompatCustomAction;
                    int i16 = (iMediaBrowserCompatMediaItem2 * 5) + 3;
                    iArr3[i16] = iArr3[i16] + i14;
                }
                if (i15 != 0) {
                    int[] iArr4 = this.PlaybackStateCompatCustomAction;
                    AbstractC0170getTimestamp.write(iArr4, iMediaBrowserCompatMediaItem2, (iArr4[(iMediaBrowserCompatMediaItem2 * 5) + 1] & 67108863) + i15);
                }
                int[] iArr5 = this.PlaybackStateCompatCustomAction;
                if ((iArr5[(iMediaBrowserCompatMediaItem2 * 5) + 1] & 1073741824) != 0) {
                    i15 = 0;
                }
                iSerializer2 = serializer(iArr5, iSerializer2);
            }
        }
        this.PlaybackStateCompat += i15;
    }

    public final void IconCompatParcelizer(int i) {
        if (this.MediaSessionCompatResultReceiverWrapper > 0) {
            getCreditCardExpirationDay.read("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (i2 != i) {
            if (i < i2 || i >= this.read) {
                getCreditCardExpirationDay.read("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.IconCompatParcelizer;
            int i4 = this.MediaDescriptionCompat;
            int i5 = this.MediaMetadataCompat;
            this.IconCompatParcelizer = i;
            MediaBrowserCompatMediaItem();
            this.IconCompatParcelizer = i3;
            this.MediaDescriptionCompat = i4;
            this.MediaMetadataCompat = i5;
        }
    }

    public final int read(int i) {
        return read(this.PlaybackStateCompatCustomAction, MediaBrowserCompatMediaItem(i));
    }

    public final void MediaBrowserCompatMediaItem() {
        if (this.MediaSessionCompatResultReceiverWrapper != 0) {
            getCreditCardExpirationDay.read("Key must be supplied when inserting");
        }
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        serializer(androidContentCaptureManager, androidContentCaptureManager, false, 0);
    }
}
