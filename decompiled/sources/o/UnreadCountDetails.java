package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class UnreadCountDetails extends getMessageID {
    public int ComponentActivity;
    public int IconCompatParcelizer;
    public IBraze MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public int MediaSessionCompatResultReceiverWrapper;
    public int MediaSessionCompatToken;
    public int ParcelableVolumeInfo;
    public int PlaybackStateCompat;
    public int PlaybackStateCompatCustomAction;
    public int RatingCompat;
    public boolean RemoteActionCompatParcelizer;
    public int ResultReceiver;
    public int r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public char r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final getChats read;
    public int serializer;
    public getChatType write;

    public static void read(int i, int i2, String str) throws IOException {
        if (i < 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(ff$$ExternalSyntheticOutline0.m("Corrupted input, ", str, " value negative"));
        } else {
            if (i < i2) {
                return;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(ff$$ExternalSyntheticOutline0.m("Corrupted input, ", str, " value too big"));
        }
    }

    public final void IconCompatParcelizer() throws IOException {
        getChatType getchattype;
        char[] cArr;
        int i;
        int[][] iArr;
        byte[] bArr;
        int i2;
        UnreadCountDetails unreadCountDetails;
        byte[] bArr2;
        int i3;
        int i4;
        char[] cArr2;
        char c;
        int i5;
        int[] iArr2;
        int i6;
        UnreadCountDetails unreadCountDetails2 = this;
        getChatType getchattype2 = unreadCountDetails2.write;
        char c2 = (char) read(getchattype2, 8);
        char c3 = (char) read(getchattype2, 8);
        char c4 = (char) read(getchattype2, 8);
        char c5 = (char) read(getchattype2, 8);
        char c6 = (char) read(getchattype2, 8);
        char c7 = (char) read(getchattype2, 8);
        char c8 = 0;
        if (c2 == 23 && c3 == 'r' && c4 == 'E' && c5 == '8' && c6 == 'P' && c7 == 144) {
            int i7 = read(unreadCountDetails2.write, 32);
            unreadCountDetails2.MediaSessionCompatResultReceiverWrapper = i7;
            unreadCountDetails2.MediaDescriptionCompat = 0;
            unreadCountDetails2.MediaBrowserCompatMediaItem = null;
            if (i7 == unreadCountDetails2.IconCompatParcelizer) {
                return;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("BZip2 CRC error");
            return;
        }
        if (c2 != '1' || c3 != 'A' || c4 != 'Y' || c5 != '&' || c6 != 'S' || c7 != 'Y') {
            unreadCountDetails2.MediaDescriptionCompat = 0;
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Bad block header");
            return;
        }
        unreadCountDetails2.MediaSessionCompatToken = read(getchattype2, 32);
        int i8 = 1;
        unreadCountDetails2.RemoteActionCompatParcelizer = read(getchattype2, 1) == 1;
        IBraze iBraze = unreadCountDetails2.MediaBrowserCompatMediaItem;
        if (iBraze == null) {
            int i9 = unreadCountDetails2.serializer;
            IBraze iBraze2 = new IBraze();
            iBraze2.read = new boolean[androidx.compose.ui.graphics.Fields.RotationX];
            iBraze2.RemoteActionCompatParcelizer = new byte[androidx.compose.ui.graphics.Fields.RotationX];
            iBraze2.MediaMetadataCompat = new byte[18002];
            iBraze2.RatingCompat = new byte[18002];
            iBraze2.ParcelableVolumeInfo = new int[androidx.compose.ui.graphics.Fields.RotationX];
            Class cls = Integer.TYPE;
            iBraze2.PlaybackStateCompat = (int[][]) Array.newInstance((Class<?>) cls, 6, 258);
            iBraze2.serializer = (int[][]) Array.newInstance((Class<?>) cls, 6, 258);
            iBraze2.IconCompatParcelizer = (int[][]) Array.newInstance((Class<?>) cls, 6, 258);
            iBraze2.MediaBrowserCompatMediaItem = new int[6];
            iBraze2.MediaDescriptionCompat = new int[257];
            iBraze2.MediaSessionCompatQueueItem = new char[androidx.compose.ui.graphics.Fields.RotationX];
            iBraze2.MediaSessionCompatResultReceiverWrapper = (char[][]) Array.newInstance((Class<?>) Character.TYPE, 6, 258);
            iBraze2.write = new byte[6];
            iBraze2.PlaybackStateCompatCustomAction = new byte[i9 * androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength];
            unreadCountDetails2.MediaBrowserCompatMediaItem = iBraze2;
        }
        getChatType getchattype3 = unreadCountDetails2.write;
        unreadCountDetails2.RatingCompat = read(getchattype3, 24);
        getChatType getchattype4 = unreadCountDetails2.write;
        IBraze iBraze3 = unreadCountDetails2.MediaBrowserCompatMediaItem;
        boolean[] zArr = (boolean[]) iBraze3.read;
        byte[] bArr3 = (byte[]) iBraze3.write;
        byte[] bArr4 = (byte[]) iBraze3.MediaMetadataCompat;
        byte[] bArr5 = (byte[]) iBraze3.RatingCompat;
        int i10 = 0;
        for (int i11 = 0; i11 < 16; i11++) {
            if (read(getchattype4, 1) != 0) {
                i10 |= 1 << i11;
            }
        }
        Arrays.fill(zArr, false);
        for (int i12 = 0; i12 < 16; i12++) {
            if ((i10 & (1 << i12)) != 0) {
                for (int i13 = 0; i13 < 16; i13++) {
                    if (read(getchattype4, 1) != 0) {
                        zArr[(i12 << 4) + i13] = true;
                    }
                }
            }
        }
        IBraze iBraze4 = unreadCountDetails2.MediaBrowserCompatMediaItem;
        boolean[] zArr2 = (boolean[]) iBraze4.read;
        byte[] bArr6 = (byte[]) iBraze4.RemoteActionCompatParcelizer;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = androidx.compose.ui.graphics.Fields.RotationX; i15 < i16; i16 = androidx.compose.ui.graphics.Fields.RotationX) {
            if (zArr2[i15]) {
                bArr6[i14] = (byte) i15;
                i14++;
            }
            i15++;
        }
        unreadCountDetails2.MediaSessionCompatQueueItem = i14;
        int i17 = i14 + 2;
        int i18 = read(getchattype4, 3);
        int i19 = read(getchattype4, 15);
        if (i19 < 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Corrupted input, nSelectors value negative");
            return;
        }
        read(i17, 259, "alphaSize");
        read(i18, 7, "nGroups");
        for (int i20 = 0; i20 < i19; i20++) {
            int i21 = 0;
            while (read(getchattype4, 1) != 0) {
                i21++;
            }
            if (i20 < 18002) {
                bArr5[i20] = (byte) i21;
            }
        }
        int iMin = Math.min(i19, 18002);
        int i22 = i18;
        while (true) {
            i22--;
            if (i22 < 0) {
                break;
            } else {
                bArr3[i22] = (byte) i22;
            }
        }
        for (int i23 = 0; i23 < iMin; i23++) {
            int i24 = bArr5[i23] & 255;
            read(i24, 6, "selectorMtf");
            byte b = bArr3[i24];
            while (i24 > 0) {
                bArr3[i24] = bArr3[i24 - 1];
                i24--;
            }
            bArr3[0] = b;
            bArr4[i23] = b;
        }
        char[][] cArr3 = (char[][]) iBraze3.MediaSessionCompatResultReceiverWrapper;
        for (int i25 = 0; i25 < i18; i25++) {
            int i26 = read(getchattype4, 5);
            char[] cArr4 = cArr3[i25];
            for (int i27 = 0; i27 < i17; i27++) {
                while (read(getchattype4, 1) != 0) {
                    i26 += read(getchattype4, 1) != 0 ? -1 : 1;
                }
                cArr4[i27] = (char) i26;
            }
        }
        IBraze iBraze5 = unreadCountDetails2.MediaBrowserCompatMediaItem;
        char[][] cArr5 = (char[][]) iBraze5.MediaSessionCompatResultReceiverWrapper;
        int[] iArr3 = (int[]) iBraze5.MediaBrowserCompatMediaItem;
        int[][] iArr4 = (int[][]) iBraze5.PlaybackStateCompat;
        int[][] iArr5 = (int[][]) iBraze5.serializer;
        int[][] iArr6 = (int[][]) iBraze5.IconCompatParcelizer;
        int i28 = 0;
        while (i28 < i18) {
            char[] cArr6 = cArr5[i28];
            char c9 = c8;
            int i29 = i17;
            char c10 = ' ';
            while (true) {
                i29 -= i8;
                if (i29 < 0) {
                    break;
                }
                char c11 = cArr6[i29];
                if (c11 > c9) {
                    c9 = c11;
                }
                if (c11 < c10) {
                    c10 = c11;
                }
                i8 = 1;
            }
            int[] iArr7 = iArr4[i28];
            int[] iArr8 = iArr5[i28];
            int[] iArr9 = iArr6[i28];
            char[] cArr7 = cArr5[i28];
            int i30 = c8;
            int i31 = c10;
            while (i31 <= c9) {
                int i32 = i18;
                int i33 = 0;
                while (i33 < i17) {
                    int[][] iArr10 = iArr6;
                    if (cArr7[i33] == i31) {
                        iArr9[i30] = i33;
                        i30++;
                    }
                    i33++;
                    iArr6 = iArr10;
                }
                i31++;
                i18 = i32;
            }
            int i34 = i18;
            int[][] iArr11 = iArr6;
            int i35 = 23;
            while (true) {
                i35--;
                if (i35 <= 0) {
                    break;
                }
                iArr8[i35] = 0;
                iArr7[i35] = 0;
            }
            for (int i36 = 0; i36 < i17; i36++) {
                char c12 = cArr7[i36];
                read(c12, 258, "length");
                int i37 = c12 + 1;
                iArr8[i37] = iArr8[i37] + 1;
            }
            int i38 = iArr8[0];
            for (int i39 = 1; i39 < 23; i39++) {
                i38 += iArr8[i39];
                iArr8[i39] = i38;
            }
            int i40 = iArr8[c10];
            int i41 = c10;
            int i42 = 0;
            while (i41 <= c9) {
                int i43 = i41 + 1;
                int i44 = iArr8[i43];
                int i45 = (i44 - i40) + i42;
                iArr7[i41] = i45 - 1;
                i42 = i45 << 1;
                i41 = i43;
                i40 = i44;
            }
            int i46 = 1;
            int i47 = c10 + 1;
            while (i47 <= c9) {
                iArr8[i47] = ((iArr7[i47 - 1] + i46) << i46) - iArr8[i47];
                i47++;
                i46 = 1;
            }
            iArr3[i28] = c10;
            i28++;
            i18 = i34;
            iArr6 = iArr11;
            i8 = 1;
            c8 = 0;
        }
        IBraze iBraze6 = unreadCountDetails2.MediaBrowserCompatMediaItem;
        byte[] bArr7 = (byte[]) iBraze6.PlaybackStateCompatCustomAction;
        int[] iArr12 = (int[]) iBraze6.ParcelableVolumeInfo;
        byte[] bArr8 = (byte[]) iBraze6.MediaMetadataCompat;
        byte[] bArr9 = (byte[]) iBraze6.RemoteActionCompatParcelizer;
        char[] cArr8 = (char[]) iBraze6.MediaSessionCompatQueueItem;
        int[] iArr13 = (int[]) iBraze6.MediaBrowserCompatMediaItem;
        int[][] iArr14 = (int[][]) iBraze6.PlaybackStateCompat;
        int[][] iArr15 = (int[][]) iBraze6.serializer;
        int[][] iArr16 = (int[][]) iBraze6.IconCompatParcelizer;
        int i48 = unreadCountDetails2.serializer * androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength;
        int i49 = androidx.compose.ui.graphics.Fields.RotationX;
        while (true) {
            i49--;
            if (i49 < 0) {
                break;
            }
            cArr8[i49] = (char) i49;
            iArr12[i49] = 0;
        }
        int i50 = unreadCountDetails2.MediaSessionCompatQueueItem + 1;
        IBraze iBraze7 = unreadCountDetails2.MediaBrowserCompatMediaItem;
        int i51 = ((byte[]) iBraze7.MediaMetadataCompat)[0] & 255;
        getChatType getchattype5 = getchattype3;
        read(i51, 6, "zt");
        byte[] bArr10 = bArr7;
        int i52 = ((int[]) iBraze7.MediaBrowserCompatMediaItem)[i51];
        read(i52, 258, "zn");
        int i53 = read(unreadCountDetails2.write, i52);
        char[] cArr9 = cArr8;
        for (int[] iArr17 = ((int[][]) iBraze7.PlaybackStateCompat)[i51]; i53 > iArr17[i52]; iArr17 = iArr17) {
            i52++;
            read(i52, 258, "zn");
            i53 = (i53 << 1) | read(unreadCountDetails2.write, 1);
        }
        int i54 = i53 - ((int[][]) iBraze7.serializer)[i51][i52];
        read(i54, 258, "zvec");
        int i55 = ((int[][]) iBraze7.IconCompatParcelizer)[i51][i54];
        int i56 = bArr8[0] & 255;
        read(i56, 6, "zt");
        int[] iArr18 = iArr15[i56];
        int[] iArr19 = iArr14[i56];
        int[] iArr20 = iArr16[i56];
        int i57 = 0;
        int i58 = 49;
        int[] iArr21 = iArr19;
        int[] iArr22 = iArr18;
        int i59 = iArr13[i56];
        int i60 = -1;
        while (i55 != i50) {
            int i61 = i59;
            int i62 = i50;
            int[] iArr23 = iArr22;
            int[] iArr24 = iArr21;
            if (i55 == 0 || i55 == 1) {
                getchattype = getchattype5;
                cArr = cArr9;
                int i63 = -1;
                int i64 = 1;
                while (true) {
                    if (i55 != 0) {
                        i = i48;
                        if (i55 != 1) {
                            break;
                        } else {
                            i63 += i64 << 1;
                        }
                    } else {
                        i63 += i64;
                        i = i48;
                    }
                    if (i58 == 0) {
                        int i65 = i57 + 1;
                        read(i65, 18002, "groupNo");
                        int i66 = bArr8[i65] & 255;
                        read(i66, 6, "zt");
                        int[] iArr25 = iArr15[i66];
                        int[] iArr26 = iArr14[i66];
                        int[] iArr27 = iArr16[i66];
                        i3 = iArr13[i66];
                        iArr23 = iArr25;
                        iArr24 = iArr26;
                        i4 = 258;
                        i57 = i65;
                        iArr20 = iArr27;
                        i58 = 49;
                    } else {
                        i58--;
                        i3 = i61;
                        i4 = 258;
                    }
                    read(i3, i4, "zn");
                    int[][] iArr28 = iArr16;
                    int i67 = read(getchattype, i3);
                    int i68 = i3;
                    while (i67 > iArr24[i68]) {
                        int i69 = i68 + 1;
                        read(i69, 258, "zn");
                        i67 = (i67 << 1) | read(getchattype, 1);
                        i68 = i69;
                        bArr8 = bArr8;
                    }
                    int i70 = i67 - iArr23[i68];
                    read(i70, 258, "zvec");
                    i55 = iArr20[i70];
                    i64 <<= 1;
                    i61 = i3;
                    i48 = i;
                    iArr16 = iArr28;
                }
                iArr = iArr16;
                bArr = bArr8;
                i2 = i55;
                unreadCountDetails = this;
                read(i63, ((byte[]) unreadCountDetails.MediaBrowserCompatMediaItem.PlaybackStateCompatCustomAction).length, com.braze.Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY);
                char c13 = cArr[0];
                read(c13, androidx.compose.ui.graphics.Fields.RotationX, "yy");
                byte b2 = bArr9[c13];
                int i71 = b2 & 255;
                iArr12[i71] = i63 + 1 + iArr12[i71];
                int i72 = i60 + 1;
                int i73 = i63 + i72;
                read(i73, ((byte[]) unreadCountDetails.MediaBrowserCompatMediaItem.PlaybackStateCompatCustomAction).length, "lastShadow");
                bArr2 = bArr10;
                Arrays.fill(bArr2, i72, i73 + 1, b2);
                i48 = i;
                if (i73 >= i48) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(af$$ExternalSyntheticOutline0.m(i73, "Block overrun while expanding RLE in MTF, ", i48, " exceeds "));
                    return;
                } else {
                    i60 = i73;
                    iArr22 = iArr23;
                }
            } else {
                i60++;
                if (i60 >= i48) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(af$$ExternalSyntheticOutline0.m(i60, "Block overrun in MTF, ", i48, " exceeds "));
                    return;
                }
                read(i55, 257, "nextSym");
                int i74 = i55 - 1;
                char c14 = cArr9[i74];
                read(c14, androidx.compose.ui.graphics.Fields.RotationX, "yy");
                byte b3 = bArr9[c14];
                int i75 = b3 & 255;
                iArr12[i75] = iArr12[i75] + 1;
                bArr10[i60] = b3;
                if (i55 <= 16) {
                    while (i74 > 0) {
                        int i76 = i74 - 1;
                        cArr9[i74] = cArr9[i76];
                        i74 = i76;
                    }
                    cArr2 = cArr9;
                    c = 0;
                } else {
                    cArr2 = cArr9;
                    c = 0;
                    System.arraycopy(cArr2, 0, cArr2, 1, i74);
                }
                cArr2[c] = c14;
                if (i58 == 0) {
                    int i77 = i57 + 1;
                    read(i77, 18002, "groupNo");
                    int i78 = bArr8[i77] & 255;
                    read(i78, 6, "zt");
                    iArr22 = iArr15[i78];
                    iArr2 = iArr14[i78];
                    iArr20 = iArr16[i78];
                    i5 = iArr13[i78];
                    i57 = i77;
                    i6 = 258;
                    i58 = 49;
                } else {
                    i58--;
                    i5 = i61;
                    iArr22 = iArr23;
                    iArr2 = iArr24;
                    i6 = 258;
                }
                read(i5, i6, "zn");
                getChatType getchattype6 = getchattype5;
                char[] cArr10 = cArr2;
                int i79 = read(getchattype6, i5);
                int i80 = i5;
                while (i79 > iArr2[i80]) {
                    int i81 = i80 + 1;
                    read(i81, 258, "zn");
                    i79 = (i79 << 1) | read(getchattype6, 1);
                    i80 = i81;
                    i5 = i5;
                }
                i61 = i5;
                int i82 = i79 - iArr22[i80];
                read(i82, 258, "zvec");
                unreadCountDetails = this;
                iArr = iArr16;
                bArr = bArr8;
                iArr24 = iArr2;
                cArr = cArr10;
                i2 = iArr20[i82];
                getchattype = getchattype6;
                bArr2 = bArr10;
            }
            getchattype5 = getchattype;
            unreadCountDetails2 = unreadCountDetails;
            i55 = i2;
            bArr10 = bArr2;
            cArr9 = cArr;
            i59 = i61;
            i50 = i62;
            iArr21 = iArr24;
            iArr16 = iArr;
            bArr8 = bArr;
        }
        UnreadCountDetails unreadCountDetails3 = unreadCountDetails2;
        unreadCountDetails3.MediaMetadataCompat = i60;
        unreadCountDetails3.read.read = -1;
        unreadCountDetails3.MediaDescriptionCompat = 1;
    }

    public final int MediaBrowserCompatMediaItem() throws IOException {
        if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY > this.MediaMetadataCompat) {
            RemoteActionCompatParcelizer();
            IconCompatParcelizer();
            return write();
        }
        this.ParcelableVolumeInfo = this.PlaybackStateCompatCustomAction;
        IBraze iBraze = this.MediaBrowserCompatMediaItem;
        byte[] bArr = (byte[]) iBraze.PlaybackStateCompatCustomAction;
        int i = this.ComponentActivity;
        byte b = bArr[i];
        read(i, ((int[]) iBraze.MediaSessionCompatToken).length, "su_tPos");
        this.ComponentActivity = ((int[]) this.MediaBrowserCompatMediaItem.MediaSessionCompatToken)[this.ComponentActivity];
        int i2 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (i2 == 0) {
            int i3 = this.ResultReceiver;
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = getPushDataType.write[i3] - 1;
            int i4 = i3 + 1;
            this.ResultReceiver = i4;
            if (i4 == 512) {
                this.ResultReceiver = 0;
            }
        } else {
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 - 1;
        }
        int i5 = (b & 255) ^ (this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == 1 ? 1 : 0);
        this.PlaybackStateCompatCustomAction = i5;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY++;
        this.MediaDescriptionCompat = 3;
        this.read.RemoteActionCompatParcelizer(i5);
        return i5;
    }

    public final int MediaDescriptionCompat() {
        if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys >= this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) {
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY++;
            this.PlaybackStateCompat = 0;
            return RatingCompat();
        }
        int i = this.PlaybackStateCompatCustomAction;
        this.read.RemoteActionCompatParcelizer(i);
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys++;
        this.MediaDescriptionCompat = 7;
        return i;
    }

    public final int MediaSessionCompatQueueItem() {
        if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys < this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) {
            this.read.RemoteActionCompatParcelizer(this.PlaybackStateCompatCustomAction);
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys++;
            return this.PlaybackStateCompatCustomAction;
        }
        this.MediaDescriptionCompat = 2;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY++;
        this.PlaybackStateCompat = 0;
        return MediaBrowserCompatMediaItem();
    }

    public final int RatingCompat() throws IOException {
        if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY > this.MediaMetadataCompat) {
            this.MediaDescriptionCompat = 5;
            RemoteActionCompatParcelizer();
            IconCompatParcelizer();
            return write();
        }
        this.ParcelableVolumeInfo = this.PlaybackStateCompatCustomAction;
        IBraze iBraze = this.MediaBrowserCompatMediaItem;
        byte[] bArr = (byte[]) iBraze.PlaybackStateCompatCustomAction;
        int i = this.ComponentActivity;
        int i2 = bArr[i] & 255;
        this.PlaybackStateCompatCustomAction = i2;
        read(i, ((int[]) iBraze.MediaSessionCompatToken).length, "su_tPos");
        this.ComponentActivity = ((int[]) this.MediaBrowserCompatMediaItem.MediaSessionCompatToken)[this.ComponentActivity];
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY++;
        this.MediaDescriptionCompat = 6;
        this.read.RemoteActionCompatParcelizer(i2);
        return i2;
    }

    public final void RemoteActionCompatParcelizer() throws IOException {
        int i = ~this.read.read;
        int i2 = this.MediaSessionCompatToken;
        if (i2 == i) {
            int i3 = this.IconCompatParcelizer;
            this.IconCompatParcelizer = i ^ ((i3 << 1) | (i3 >>> 31));
        } else {
            int i4 = this.MediaSessionCompatResultReceiverWrapper;
            this.IconCompatParcelizer = ((i4 << 1) | (i4 >>> 31)) ^ i2;
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("BZip2 CRC error");
        }
    }

    public final int write() throws IOException {
        IBraze iBraze;
        if (this.MediaDescriptionCompat == 0 || (iBraze = this.MediaBrowserCompatMediaItem) == null) {
            return -1;
        }
        int[] iArr = (int[]) iBraze.MediaDescriptionCompat;
        int i = this.MediaMetadataCompat + 1;
        int[] iArr2 = (int[]) iBraze.MediaSessionCompatToken;
        if (iArr2 == null || iArr2.length < i) {
            iArr2 = new int[i];
            iBraze.MediaSessionCompatToken = iArr2;
        }
        byte[] bArr = (byte[]) iBraze.PlaybackStateCompatCustomAction;
        iArr[0] = 0;
        System.arraycopy((int[]) iBraze.ParcelableVolumeInfo, 0, iArr, 1, androidx.compose.ui.graphics.Fields.RotationX);
        int i2 = iArr[0];
        for (int i3 = 1; i3 <= 256; i3++) {
            i2 += iArr[i3];
            iArr[i3] = i2;
        }
        int i4 = this.MediaMetadataCompat;
        for (int i5 = 0; i5 <= i4; i5++) {
            int i6 = bArr[i5] & 255;
            int i7 = iArr[i6];
            iArr[i6] = i7 + 1;
            read(i7, i, "tt index");
            iArr2[i7] = i5;
        }
        int i8 = this.RatingCompat;
        if (i8 < 0 || i8 >= iArr2.length) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Stream corrupted");
            return 0;
        }
        this.ComponentActivity = iArr2[i8];
        this.PlaybackStateCompat = 0;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 0;
        this.PlaybackStateCompatCustomAction = androidx.compose.ui.graphics.Fields.RotationX;
        if (!this.RemoteActionCompatParcelizer) {
            return RatingCompat();
        }
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 0;
        this.ResultReceiver = 0;
        return MediaBrowserCompatMediaItem();
    }

    public UnreadCountDetails(InputStream inputStream) throws IOException {
        getChats getchats = new getChats();
        getchats.read = -1;
        this.read = getchats;
        this.MediaDescriptionCompat = 1;
        getChatType getchattype = new getChatType(inputStream == System.in ? HttpAuthInterceptor.read(inputStream) : inputStream, ByteOrder.BIG_ENDIAN);
        this.write = getchattype;
        int iIconCompatParcelizer = (int) getchattype.IconCompatParcelizer(8);
        int iIconCompatParcelizer2 = (int) this.write.IconCompatParcelizer(8);
        int iIconCompatParcelizer3 = (int) this.write.IconCompatParcelizer(8);
        if (iIconCompatParcelizer != 66 || iIconCompatParcelizer2 != 90 || iIconCompatParcelizer3 != 104) {
            throw new IOException("Stream is not in the BZip2 format");
        }
        int iIconCompatParcelizer4 = (int) this.write.IconCompatParcelizer(8);
        if (iIconCompatParcelizer4 < 49 || iIconCompatParcelizer4 > 57) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("BZip2 block size is invalid");
        } else {
            this.serializer = iIconCompatParcelizer4 - 48;
            this.IconCompatParcelizer = 0;
        }
        IconCompatParcelizer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        getChatType getchattype = this.write;
        if (getchattype != null) {
            try {
                getchattype.close();
            } finally {
                this.MediaBrowserCompatMediaItem = null;
                this.write = null;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0) {
            DrawableTransformation.read(d$$ExternalSyntheticOutline0.m(i, "offs(", ") < 0."));
            return 0;
        }
        if (i2 >= 0) {
            int i3 = i + i2;
            if (i3 <= bArr.length) {
                if (this.write == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Stream closed");
                    return 0;
                }
                if (i2 == 0) {
                    return 0;
                }
                int i4 = i;
                while (i4 < i3) {
                    int iSerializer = serializer();
                    if (iSerializer < 0) {
                        break;
                    }
                    bArr[i4] = (byte) iSerializer;
                    i4++;
                }
                if (i4 == i) {
                    return -1;
                }
                return i4 - i;
            }
            DrawableTransformation.read(af$$ExternalSyntheticOutline0.m(bArr.length, ").", m1$$ExternalSyntheticOutline0.m(i, i2, "offs(", ") + len(", ") > dest.length(")));
            return 0;
        }
        DrawableTransformation.read(d$$ExternalSyntheticOutline0.m(i2, "len(", ") < 0."));
        return 0;
    }

    public final int serializer() throws IOException {
        switch (this.MediaDescriptionCompat) {
            case 0:
                return -1;
            case 1:
                return write();
            case 2:
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
                return 0;
            case 3:
                if (this.PlaybackStateCompatCustomAction != this.ParcelableVolumeInfo) {
                    this.MediaDescriptionCompat = 2;
                    this.PlaybackStateCompat = 1;
                    return MediaBrowserCompatMediaItem();
                }
                int i = this.PlaybackStateCompat + 1;
                this.PlaybackStateCompat = i;
                if (i < 4) {
                    this.MediaDescriptionCompat = 2;
                    return MediaBrowserCompatMediaItem();
                }
                IBraze iBraze = this.MediaBrowserCompatMediaItem;
                byte[] bArr = (byte[]) iBraze.PlaybackStateCompatCustomAction;
                int i2 = this.ComponentActivity;
                this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = (char) (bArr[i2] & 255);
                read(i2, ((int[]) iBraze.MediaSessionCompatToken).length, "su_tPos");
                this.ComponentActivity = ((int[]) this.MediaBrowserCompatMediaItem.MediaSessionCompatToken)[this.ComponentActivity];
                int i3 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                if (i3 == 0) {
                    int i4 = this.ResultReceiver;
                    this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = getPushDataType.write[i4] - 1;
                    int i5 = i4 + 1;
                    this.ResultReceiver = i5;
                    if (i5 == 512) {
                        this.ResultReceiver = 0;
                    }
                } else {
                    this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3 - 1;
                }
                this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 0;
                this.MediaDescriptionCompat = 4;
                if (this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == 1) {
                    this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = (char) (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss ^ 1);
                }
                return MediaSessionCompatQueueItem();
            case 4:
                return MediaSessionCompatQueueItem();
            case 5:
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
                return 0;
            case 6:
                if (this.PlaybackStateCompatCustomAction != this.ParcelableVolumeInfo) {
                    this.PlaybackStateCompat = 1;
                    return RatingCompat();
                }
                int i6 = this.PlaybackStateCompat + 1;
                this.PlaybackStateCompat = i6;
                if (i6 < 4) {
                    return RatingCompat();
                }
                read(this.ComponentActivity, ((byte[]) this.MediaBrowserCompatMediaItem.PlaybackStateCompatCustomAction).length, "su_tPos");
                IBraze iBraze2 = this.MediaBrowserCompatMediaItem;
                byte[] bArr2 = (byte[]) iBraze2.PlaybackStateCompatCustomAction;
                int i7 = this.ComponentActivity;
                this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = (char) (bArr2[i7] & 255);
                this.ComponentActivity = ((int[]) iBraze2.MediaSessionCompatToken)[i7];
                this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 0;
                return MediaDescriptionCompat();
            case 7:
                return MediaDescriptionCompat();
            default:
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
                return 0;
        }
    }

    public static int read(getChatType getchattype, int i) throws IOException {
        long jIconCompatParcelizer = getchattype.IconCompatParcelizer(i);
        if (jIconCompatParcelizer >= 0) {
            return (int) jIconCompatParcelizer;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Unexpected end of stream");
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.write != null) {
            return serializer();
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Stream closed");
        return 0;
    }
}
