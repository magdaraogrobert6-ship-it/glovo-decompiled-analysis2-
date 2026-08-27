package o;

import bo.app.d$$ExternalSyntheticOutline0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class DrawResult {
    public final drawWithContent MediaSessionCompatQueueItem;
    public final androidx.emoji2.text.EmojiProcessor RemoteActionCompatParcelizer;
    public int write = 0;
    public int MediaDescriptionCompat = 8;
    public int[] serializer = new int[8];
    public int[] IconCompatParcelizer = new int[8];
    public float[] read = new float[8];
    public int MediaMetadataCompat = -1;
    public int MediaBrowserCompatMediaItem = -1;
    public boolean RatingCompat = false;

    public final int RemoteActionCompatParcelizer() {
        return this.write;
    }

    public DrawResult(drawWithContent drawwithcontent, androidx.emoji2.text.EmojiProcessor emojiProcessor) {
        this.MediaSessionCompatQueueItem = drawwithcontent;
        this.RemoteActionCompatParcelizer = emojiProcessor;
    }

    public final String toString() {
        int i = this.MediaMetadataCompat;
        String string = "";
        for (int i2 = 0; i != -1 && i2 < this.write; i2++) {
            StringBuilder sbM = d$$ExternalSyntheticOutline0.m(string.concat(" -> "));
            sbM.append(this.read[i]);
            sbM.append(" : ");
            StringBuilder sbM2 = d$$ExternalSyntheticOutline0.m(sbM.toString());
            sbM2.append(((setBlockui[]) this.RemoteActionCompatParcelizer.IconCompatParcelizer)[this.serializer[i]]);
            string = sbM2.toString();
            i = this.IconCompatParcelizer[i];
        }
        return string;
    }

    public final void IconCompatParcelizer(setBlockui setblockui, float f) {
        if (f == 0.0f) {
            read(setblockui, true);
            return;
        }
        int i = this.MediaMetadataCompat;
        drawWithContent drawwithcontent = this.MediaSessionCompatQueueItem;
        if (i == -1) {
            this.MediaMetadataCompat = 0;
            this.read[0] = f;
            this.serializer[0] = setblockui.serializer;
            this.IconCompatParcelizer[0] = -1;
            setblockui.ParcelableVolumeInfo++;
            setblockui.serializer(drawwithcontent);
            this.write++;
            if (this.RatingCompat) {
                return;
            }
            int i2 = this.MediaBrowserCompatMediaItem + 1;
            this.MediaBrowserCompatMediaItem = i2;
            int[] iArr = this.serializer;
            if (i2 >= iArr.length) {
                this.RatingCompat = true;
                this.MediaBrowserCompatMediaItem = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.write; i4++) {
            int i5 = this.serializer[i];
            int i6 = setblockui.serializer;
            if (i5 == i6) {
                this.read[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.IconCompatParcelizer[i];
        }
        int length = this.MediaBrowserCompatMediaItem;
        if (this.RatingCompat) {
            int[] iArr2 = this.serializer;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length++;
        }
        int[] iArr3 = this.serializer;
        if (length >= iArr3.length && this.write < iArr3.length) {
            int i7 = 0;
            while (true) {
                int[] iArr4 = this.serializer;
                if (i7 >= iArr4.length) {
                    break;
                }
                if (iArr4[i7] == -1) {
                    length = i7;
                    break;
                }
                i7++;
            }
        }
        int[] iArr5 = this.serializer;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i8 = this.MediaDescriptionCompat * 2;
            this.MediaDescriptionCompat = i8;
            this.RatingCompat = false;
            this.MediaBrowserCompatMediaItem = length - 1;
            this.read = Arrays.copyOf(this.read, i8);
            this.serializer = Arrays.copyOf(this.serializer, this.MediaDescriptionCompat);
            this.IconCompatParcelizer = Arrays.copyOf(this.IconCompatParcelizer, this.MediaDescriptionCompat);
        }
        this.serializer[length] = setblockui.serializer;
        this.read[length] = f;
        int[] iArr6 = this.IconCompatParcelizer;
        if (i3 != -1) {
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            iArr6[length] = this.MediaMetadataCompat;
            this.MediaMetadataCompat = length;
        }
        setblockui.ParcelableVolumeInfo++;
        setblockui.serializer(drawwithcontent);
        int i9 = this.write + 1;
        this.write = i9;
        if (!this.RatingCompat) {
            this.MediaBrowserCompatMediaItem++;
        }
        int[] iArr7 = this.serializer;
        if (i9 >= iArr7.length) {
            this.RatingCompat = true;
        }
        if (this.MediaBrowserCompatMediaItem >= iArr7.length) {
            this.RatingCompat = true;
            this.MediaBrowserCompatMediaItem = iArr7.length - 1;
        }
    }

    public final float RemoteActionCompatParcelizer(int i) {
        int i2 = this.MediaMetadataCompat;
        for (int i3 = 0; i2 != -1 && i3 < this.write; i3++) {
            if (i3 == i) {
                return this.read[i2];
            }
            i2 = this.IconCompatParcelizer[i2];
        }
        return 0.0f;
    }

    public final setBlockui serializer(int i) {
        int i2 = this.MediaMetadataCompat;
        for (int i3 = 0; i2 != -1 && i3 < this.write; i3++) {
            if (i3 == i) {
                return ((setBlockui[]) this.RemoteActionCompatParcelizer.IconCompatParcelizer)[this.serializer[i2]];
            }
            i2 = this.IconCompatParcelizer[i2];
        }
        return null;
    }

    public final float write(setBlockui setblockui) {
        int i = this.MediaMetadataCompat;
        for (int i2 = 0; i != -1 && i2 < this.write; i2++) {
            if (this.serializer[i] == setblockui.serializer) {
                return this.read[i];
            }
            i = this.IconCompatParcelizer[i];
        }
        return 0.0f;
    }

    public final void IconCompatParcelizer() {
        int i = this.MediaMetadataCompat;
        for (int i2 = 0; i != -1 && i2 < this.write; i2++) {
            setBlockui setblockui = ((setBlockui[]) this.RemoteActionCompatParcelizer.IconCompatParcelizer)[this.serializer[i]];
            if (setblockui != null) {
                setblockui.RemoteActionCompatParcelizer(this.MediaSessionCompatQueueItem);
            }
            i = this.IconCompatParcelizer[i];
        }
        this.MediaMetadataCompat = -1;
        this.MediaBrowserCompatMediaItem = -1;
        this.RatingCompat = false;
        this.write = 0;
    }

    public final float read(setBlockui setblockui, boolean z) {
        int i = this.MediaMetadataCompat;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.write) {
            if (this.serializer[i] == setblockui.serializer) {
                int i4 = this.MediaMetadataCompat;
                int[] iArr = this.IconCompatParcelizer;
                if (i == i4) {
                    this.MediaMetadataCompat = iArr[i];
                } else {
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    setblockui.RemoteActionCompatParcelizer(this.MediaSessionCompatQueueItem);
                }
                setblockui.ParcelableVolumeInfo--;
                this.write--;
                this.serializer[i] = -1;
                if (this.RatingCompat) {
                    this.MediaBrowserCompatMediaItem = i;
                }
                return this.read[i];
            }
            i2++;
            i3 = i;
            i = this.IconCompatParcelizer[i];
        }
        return 0.0f;
    }

    public final void write(setBlockui setblockui, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.MediaMetadataCompat;
            drawWithContent drawwithcontent = this.MediaSessionCompatQueueItem;
            if (i == -1) {
                this.MediaMetadataCompat = 0;
                this.read[0] = f;
                this.serializer[0] = setblockui.serializer;
                this.IconCompatParcelizer[0] = -1;
                setblockui.ParcelableVolumeInfo++;
                setblockui.serializer(drawwithcontent);
                this.write++;
                if (this.RatingCompat) {
                    return;
                }
                int i2 = this.MediaBrowserCompatMediaItem + 1;
                this.MediaBrowserCompatMediaItem = i2;
                int[] iArr = this.serializer;
                if (i2 >= iArr.length) {
                    this.RatingCompat = true;
                    this.MediaBrowserCompatMediaItem = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.write; i4++) {
                int i5 = this.serializer[i];
                int i6 = setblockui.serializer;
                if (i5 == i6) {
                    float[] fArr = this.read;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        int i7 = this.MediaMetadataCompat;
                        int[] iArr2 = this.IconCompatParcelizer;
                        if (i == i7) {
                            this.MediaMetadataCompat = iArr2[i];
                        } else {
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            setblockui.RemoteActionCompatParcelizer(drawwithcontent);
                        }
                        if (this.RatingCompat) {
                            this.MediaBrowserCompatMediaItem = i;
                        }
                        setblockui.ParcelableVolumeInfo--;
                        this.write--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.IconCompatParcelizer[i];
            }
            int length = this.MediaBrowserCompatMediaItem;
            if (this.RatingCompat) {
                int[] iArr3 = this.serializer;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length++;
            }
            int[] iArr4 = this.serializer;
            if (length >= iArr4.length && this.write < iArr4.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr5 = this.serializer;
                    if (i8 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i8] == -1) {
                        length = i8;
                        break;
                    }
                    i8++;
                }
            }
            int[] iArr6 = this.serializer;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i9 = this.MediaDescriptionCompat * 2;
                this.MediaDescriptionCompat = i9;
                this.RatingCompat = false;
                this.MediaBrowserCompatMediaItem = length - 1;
                this.read = Arrays.copyOf(this.read, i9);
                this.serializer = Arrays.copyOf(this.serializer, this.MediaDescriptionCompat);
                this.IconCompatParcelizer = Arrays.copyOf(this.IconCompatParcelizer, this.MediaDescriptionCompat);
            }
            this.serializer[length] = setblockui.serializer;
            this.read[length] = f;
            int[] iArr7 = this.IconCompatParcelizer;
            if (i3 != -1) {
                iArr7[length] = iArr7[i3];
                iArr7[i3] = length;
            } else {
                iArr7[length] = this.MediaMetadataCompat;
                this.MediaMetadataCompat = length;
            }
            setblockui.ParcelableVolumeInfo++;
            setblockui.serializer(drawwithcontent);
            this.write++;
            if (!this.RatingCompat) {
                this.MediaBrowserCompatMediaItem++;
            }
            int i10 = this.MediaBrowserCompatMediaItem;
            int[] iArr8 = this.serializer;
            if (i10 >= iArr8.length) {
                this.RatingCompat = true;
                this.MediaBrowserCompatMediaItem = iArr8.length - 1;
            }
        }
    }
}
