package o;

import android.graphics.Bitmap;
import android.util.Log;
import com.huawei.hmf.tasks.a.i$d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class DoubleIdentitylambda0 {
    public final int ComponentActivity;
    public final int IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public Boolean MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public r8lambdaLOvDXKeBCWVMEVqkoYOT9dw91J4 MediaSessionCompatQueueItem;
    public short[] MediaSessionCompatResultReceiverWrapper;
    public final int[] MediaSessionCompatToken;
    public byte[] PlaybackStateCompat;
    public Bitmap PlaybackStateCompatCustomAction;
    public byte[] RatingCompat;
    public final i$d RemoteActionCompatParcelizer;
    public int ResultReceiver;
    public ByteBuffer r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final boolean r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public byte[] r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public byte[] read;
    public int[] write;
    public final int[] ParcelableVolumeInfo = new int[androidx.compose.ui.graphics.Fields.RotationX];
    public Bitmap.Config serializer = Bitmap.Config.ARGB_8888;

    public final Bitmap IconCompatParcelizer() {
        synchronized (this) {
            if (this.MediaSessionCompatQueueItem.read <= 0 || this.MediaBrowserCompatMediaItem < 0) {
                if (Log.isLoggable("StandardGifDecoder", 3)) {
                    int i = this.MediaSessionCompatQueueItem.read;
                }
                this.ResultReceiver = 1;
            }
            int i2 = this.ResultReceiver;
            if (i2 != 1 && i2 != 2) {
                this.ResultReceiver = 0;
                if (this.read == null) {
                    getF getf = (getF) this.RemoteActionCompatParcelizer.read;
                    this.read = getf == null ? new byte[255] : (byte[]) getf.IconCompatParcelizer(byte[].class, 255);
                }
                r8lambdaepWD6LFpMo_FfyizDMcoRKn0Itk r8lambdaepwd6lfpmo_ffyizdmcorkn0itk = (r8lambdaepWD6LFpMo_FfyizDMcoRKn0Itk) this.MediaSessionCompatQueueItem.IconCompatParcelizer.get(this.MediaBrowserCompatMediaItem);
                int i3 = this.MediaBrowserCompatMediaItem - 1;
                r8lambdaepWD6LFpMo_FfyizDMcoRKn0Itk r8lambdaepwd6lfpmo_ffyizdmcorkn0itk2 = i3 >= 0 ? (r8lambdaepWD6LFpMo_FfyizDMcoRKn0Itk) this.MediaSessionCompatQueueItem.IconCompatParcelizer.get(i3) : null;
                int[] iArr = r8lambdaepwd6lfpmo_ffyizdmcorkn0itk.MediaMetadataCompat;
                if (iArr == null) {
                    iArr = this.MediaSessionCompatQueueItem.MediaMetadataCompat;
                }
                this.write = iArr;
                if (iArr == null) {
                    Log.isLoggable("StandardGifDecoder", 3);
                    this.ResultReceiver = 1;
                    return null;
                }
                if (r8lambdaepwd6lfpmo_ffyizdmcorkn0itk.MediaSessionCompatToken) {
                    System.arraycopy(iArr, 0, this.ParcelableVolumeInfo, 0, iArr.length);
                    int[] iArr2 = this.ParcelableVolumeInfo;
                    this.write = iArr2;
                    iArr2[r8lambdaepwd6lfpmo_ffyizdmcorkn0itk.MediaBrowserCompatMediaItem] = 0;
                    if (r8lambdaepwd6lfpmo_ffyizdmcorkn0itk.RemoteActionCompatParcelizer == 2 && this.MediaBrowserCompatMediaItem == 0) {
                        this.MediaDescriptionCompat = Boolean.TRUE;
                    }
                }
                return read(r8lambdaepwd6lfpmo_ffyizdmcorkn0itk, r8lambdaepwd6lfpmo_ffyizdmcorkn0itk2);
            }
            Log.isLoggable("StandardGifDecoder", 3);
            return null;
        }
    }

    public final Bitmap RemoteActionCompatParcelizer() {
        Boolean bool = this.MediaDescriptionCompat;
        Bitmap bitmap = ((getD) this.RemoteActionCompatParcelizer.serializer).read(this.MediaMetadataCompat, this.IconCompatParcelizer, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.serializer);
        bitmap.setHasAlpha(true);
        return bitmap;
    }

    public DoubleIdentitylambda0(i$d i_d, r8lambdaLOvDXKeBCWVMEVqkoYOT9dw91J4 r8lambdalovdxkebcwvmevqkoyot9dw91j4, ByteBuffer byteBuffer, int i) {
        this.RemoteActionCompatParcelizer = i_d;
        this.MediaSessionCompatQueueItem = new r8lambdaLOvDXKeBCWVMEVqkoYOT9dw91J4();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int iHighestOneBit = Integer.highestOneBit(i);
                this.ResultReceiver = 0;
                this.MediaSessionCompatQueueItem = r8lambdalovdxkebcwvmevqkoyot9dw91j4;
                this.MediaBrowserCompatMediaItem = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.order(ByteOrder.LITTLE_ENDIAN);
                this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = false;
                Iterator it = r8lambdalovdxkebcwvmevqkoyot9dw91j4.IconCompatParcelizer.iterator();
                while (it.hasNext()) {
                    if (((r8lambdaepWD6LFpMo_FfyizDMcoRKn0Itk) it.next()).RemoteActionCompatParcelizer == 3) {
                        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = true;
                        break;
                    }
                }
                this.ComponentActivity = iHighestOneBit;
                int i2 = r8lambdalovdxkebcwvmevqkoyot9dw91j4.ParcelableVolumeInfo;
                int i3 = i2 / iHighestOneBit;
                this.MediaMetadataCompat = i3;
                int i4 = r8lambdalovdxkebcwvmevqkoyot9dw91j4.RatingCompat;
                int i5 = i4 / iHighestOneBit;
                this.IconCompatParcelizer = i5;
                int i6 = i2 * i4;
                getF getf = (getF) this.RemoteActionCompatParcelizer.read;
                this.RatingCompat = getf == null ? new byte[i6] : (byte[]) getf.IconCompatParcelizer(byte[].class, i6);
                int i7 = i3 * i5;
                getF getf2 = (getF) this.RemoteActionCompatParcelizer.read;
                this.MediaSessionCompatToken = getf2 == null ? new int[i7] : (int[]) getf2.IconCompatParcelizer(int[].class, i7);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:232:0x040c  */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v23, types: [short] */
    /* JADX WARN: Type inference failed for: r11v25 */
    public final Bitmap read(r8lambdaepWD6LFpMo_FfyizDMcoRKn0Itk r8lambdaepwd6lfpmo_ffyizdmcorkn0itk, r8lambdaepWD6LFpMo_FfyizDMcoRKn0Itk r8lambdaepwd6lfpmo_ffyizdmcorkn0itk2) {
        byte[] bArr;
        byte b;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        byte[] bArr2;
        int i6;
        int i7;
        short s;
        byte[] bArr3;
        int i8;
        Bitmap bitmap;
        int i9;
        i$d i_d = this.RemoteActionCompatParcelizer;
        int[] iArr = this.MediaSessionCompatToken;
        byte b2 = 0;
        if (r8lambdaepwd6lfpmo_ffyizdmcorkn0itk2 == null) {
            Bitmap bitmap2 = this.PlaybackStateCompatCustomAction;
            if (bitmap2 != null) {
                ((getD) i_d.serializer).read(bitmap2);
            }
            this.PlaybackStateCompatCustomAction = null;
            Arrays.fill(iArr, 0);
        }
        if (r8lambdaepwd6lfpmo_ffyizdmcorkn0itk2 != null && r8lambdaepwd6lfpmo_ffyizdmcorkn0itk2.RemoteActionCompatParcelizer == 3 && this.PlaybackStateCompatCustomAction == null) {
            Arrays.fill(iArr, 0);
        }
        int i10 = this.MediaMetadataCompat;
        int i11 = this.ComponentActivity;
        if (r8lambdaepwd6lfpmo_ffyizdmcorkn0itk2 != null && (i8 = r8lambdaepwd6lfpmo_ffyizdmcorkn0itk2.RemoteActionCompatParcelizer) > 0) {
            if (i8 == 2) {
                if (r8lambdaepwd6lfpmo_ffyizdmcorkn0itk.MediaSessionCompatToken) {
                    i9 = 0;
                } else {
                    r8lambdaLOvDXKeBCWVMEVqkoYOT9dw91J4 r8lambdalovdxkebcwvmevqkoyot9dw91j4 = this.MediaSessionCompatQueueItem;
                    i9 = r8lambdalovdxkebcwvmevqkoyot9dw91j4.serializer;
                    if (r8lambdaepwd6lfpmo_ffyizdmcorkn0itk.MediaMetadataCompat != null && r8lambdalovdxkebcwvmevqkoyot9dw91j4.RemoteActionCompatParcelizer == r8lambdaepwd6lfpmo_ffyizdmcorkn0itk.MediaBrowserCompatMediaItem) {
                        i9 = 0;
                    }
                }
                int i12 = r8lambdaepwd6lfpmo_ffyizdmcorkn0itk2.IconCompatParcelizer / i11;
                int i13 = r8lambdaepwd6lfpmo_ffyizdmcorkn0itk2.MediaSessionCompatQueueItem / i11;
                int i14 = r8lambdaepwd6lfpmo_ffyizdmcorkn0itk2.RatingCompat / i11;
                int i15 = (i13 * i10) + (r8lambdaepwd6lfpmo_ffyizdmcorkn0itk2.MediaDescriptionCompat / i11);
                for (int i16 = i15; i16 < (i12 * i10) + i15; i16 += i10) {
                    for (int i17 = i16; i17 < i16 + i14; i17++) {
                        iArr[i17] = i9;
                    }
                }
            } else if (i8 == 3 && (bitmap = this.PlaybackStateCompatCustomAction) != null) {
                int i18 = this.IconCompatParcelizer;
                int i19 = this.MediaMetadataCompat;
                bitmap.getPixels(iArr, 0, i19, 0, 0, i19, i18);
            }
        }
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.position(r8lambdaepwd6lfpmo_ffyizdmcorkn0itk.write);
        int i20 = r8lambdaepwd6lfpmo_ffyizdmcorkn0itk.RatingCompat * r8lambdaepwd6lfpmo_ffyizdmcorkn0itk.IconCompatParcelizer;
        byte[] bArr4 = this.RatingCompat;
        if (bArr4 == null || bArr4.length < i20) {
            getF getf = (getF) i_d.read;
            if (getf == null) {
                bArr = new byte[i20];
            } else {
                bArr = (byte[]) getf.IconCompatParcelizer(byte[].class, i20);
            }
            this.RatingCompat = bArr;
        }
        byte[] bArr5 = this.RatingCompat;
        if (this.MediaSessionCompatResultReceiverWrapper == null) {
            this.MediaSessionCompatResultReceiverWrapper = new short[androidx.compose.ui.graphics.Fields.TransformOrigin];
        }
        short[] sArr = this.MediaSessionCompatResultReceiverWrapper;
        if (this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == null) {
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new byte[androidx.compose.ui.graphics.Fields.TransformOrigin];
        }
        byte[] bArr6 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (this.PlaybackStateCompat == null) {
            this.PlaybackStateCompat = new byte[4097];
        }
        byte[] bArr7 = this.PlaybackStateCompat;
        int i21 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.get() & 255;
        int i22 = 1 << i21;
        int i23 = i22 + 2;
        int i24 = i21 + 1;
        int i25 = (1 << i24) - 1;
        for (int i26 = 0; i26 < i22; i26++) {
            sArr[i26] = 0;
            bArr6[i26] = (byte) i26;
        }
        byte[] bArr8 = this.read;
        int i27 = i24;
        int i28 = i23;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = i25;
        int i38 = -1;
        while (true) {
            if (i29 >= i20) {
                b = b2;
                break;
            }
            if (i30 == 0) {
                int i39 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.get() & 255;
                if (i39 > 0) {
                    ByteBuffer byteBuffer = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                    byteBuffer.get(this.read, 0, Math.min(i39, byteBuffer.remaining()));
                }
                if (i39 <= 0) {
                    this.ResultReceiver = 3;
                    b = 0;
                    break;
                }
                i30 = i39;
                i34 = 0;
            } else {
                i24 = i24;
                i29 = i29;
                i23 = i23;
            }
            i33 += (bArr8[i34] & 255) << i32;
            i34++;
            i30--;
            int i40 = i38;
            int i41 = i31;
            int i42 = i32 + 8;
            int i43 = i27;
            i29 = i29;
            byte[] bArr9 = bArr8;
            int i44 = i28;
            while (true) {
                if (i42 < i43) {
                    iArr = iArr;
                    i32 = i42;
                    break;
                }
                iArr = iArr;
                int i45 = i33 & i37;
                i33 >>= i43;
                i42 -= i43;
                if (i45 == i22) {
                    i37 = i25;
                    i43 = i24;
                    i44 = i23;
                    i40 = -1;
                } else {
                    i32 = i42;
                    if (i45 == i22 + 1) {
                        break;
                    }
                    if (i40 == -1) {
                        bArr5[i35] = bArr6[i45];
                        i35++;
                        i29++;
                        bArr3 = bArr7;
                        i41 = i45;
                    } else {
                        if (i45 >= i44) {
                            bArr7[i36] = (byte) i41;
                            i36++;
                            s = i40;
                        } else {
                            s = i45;
                        }
                        while (s >= i22) {
                            bArr7[i36] = bArr6[s];
                            i36++;
                            s = sArr[s];
                        }
                        i41 = bArr6[s] & 255;
                        byte b3 = (byte) i41;
                        bArr5[i35] = b3;
                        while (true) {
                            i35++;
                            i29++;
                            if (i36 <= 0) {
                                break;
                            }
                            i36--;
                            bArr5[i35] = bArr7[i36];
                        }
                        bArr3 = bArr7;
                        if (i44 < 4096) {
                            sArr[i44] = (short) i40;
                            bArr6[i44] = b3;
                            i44++;
                            if ((i44 & i37) == 0 && i44 < 4096) {
                                i43++;
                                i37 += i44;
                            }
                        }
                    }
                    i40 = i45;
                    i42 = i32;
                    bArr7 = bArr3;
                }
            }
            i28 = i44;
            bArr8 = bArr9;
            iArr = iArr;
            bArr7 = bArr7;
            b2 = 0;
            i38 = i40;
            i31 = i41;
            i27 = i43;
            i24 = i24;
            i23 = i23;
        }
        Arrays.fill(bArr5, i35, i20, b);
        boolean z = r8lambdaepwd6lfpmo_ffyizdmcorkn0itk.read;
        int[] iArr2 = this.MediaSessionCompatToken;
        if (!z) {
            i = i11;
            if (i == 1) {
                int i46 = r8lambdaepwd6lfpmo_ffyizdmcorkn0itk.IconCompatParcelizer;
                int i47 = r8lambdaepwd6lfpmo_ffyizdmcorkn0itk.MediaSessionCompatQueueItem;
                int i48 = r8lambdaepwd6lfpmo_ffyizdmcorkn0itk.RatingCompat;
                int i49 = r8lambdaepwd6lfpmo_ffyizdmcorkn0itk.MediaDescriptionCompat;
                byte b4 = this.MediaBrowserCompatMediaItem == 0 ? (byte) 1 : b;
                byte[] bArr10 = this.RatingCompat;
                int[] iArr3 = this.write;
                byte b5 = -1;
                for (int i50 = b; i50 < i46; i50++) {
                    int i51 = (i50 + i47) * i10;
                    int i52 = i51 + i49;
                    int i53 = i52 + i48;
                    int i54 = i51 + i10;
                    if (i54 < i53) {
                        i53 = i54;
                    }
                    int i55 = r8lambdaepwd6lfpmo_ffyizdmcorkn0itk.RatingCompat * i50;
                    while (i52 < i53) {
                        int i56 = i46;
                        byte b6 = bArr10[i55];
                        int i57 = i47;
                        int i58 = b6 & 255;
                        if (i58 != b5) {
                            int i59 = iArr3[i58];
                            if (i59 != 0) {
                                iArr2[i52] = i59;
                            } else {
                                b5 = b6;
                            }
                        }
                        i55++;
                        i52++;
                        i46 = i56;
                        i47 = i57;
                    }
                }
                Boolean bool = this.MediaDescriptionCompat;
                this.MediaDescriptionCompat = Boolean.valueOf((bool != null && bool.booleanValue()) || !(this.MediaDescriptionCompat != null || b4 == 0 || b5 == -1));
            }
            if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY && ((i7 = r8lambdaepwd6lfpmo_ffyizdmcorkn0itk.RemoteActionCompatParcelizer) == 0 || i7 == 1)) {
                if (this.PlaybackStateCompatCustomAction == null) {
                    this.PlaybackStateCompatCustomAction = RemoteActionCompatParcelizer();
                }
                Bitmap bitmap3 = this.PlaybackStateCompatCustomAction;
                int i60 = this.IconCompatParcelizer;
                int i61 = this.MediaMetadataCompat;
                bitmap3.setPixels(iArr, 0, i61, 0, 0, i61, i60);
            }
            Bitmap bitmapRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            int i62 = this.IconCompatParcelizer;
            int i63 = this.MediaMetadataCompat;
            bitmapRemoteActionCompatParcelizer.setPixels(iArr, 0, i63, 0, 0, i63, i62);
            return bitmapRemoteActionCompatParcelizer;
        }
        i = i11;
        int i64 = r8lambdaepwd6lfpmo_ffyizdmcorkn0itk.IconCompatParcelizer / i;
        int i65 = r8lambdaepwd6lfpmo_ffyizdmcorkn0itk.MediaSessionCompatQueueItem / i;
        int i66 = r8lambdaepwd6lfpmo_ffyizdmcorkn0itk.RatingCompat / i;
        int i67 = r8lambdaepwd6lfpmo_ffyizdmcorkn0itk.MediaDescriptionCompat / i;
        boolean z2 = this.MediaBrowserCompatMediaItem == 0;
        byte[] bArr11 = this.RatingCompat;
        int[] iArr4 = this.write;
        Boolean bool2 = this.MediaDescriptionCompat;
        int i68 = 8;
        int i69 = 0;
        int i70 = 0;
        int i71 = 1;
        while (i70 < i64) {
            int i72 = i68;
            if (r8lambdaepwd6lfpmo_ffyizdmcorkn0itk.read) {
                if (i69 >= i64) {
                    int i73 = i71 + 1;
                    i2 = i64;
                    if (i73 == 2) {
                        i69 = 4;
                        i71 = i73;
                    } else if (i73 == 3) {
                        i6 = 4;
                        i71 = i73;
                        i69 = 2;
                    } else if (i73 != 4) {
                        i6 = i72;
                        i71 = i73;
                    } else {
                        i71 = i73;
                        i6 = 2;
                        i69 = 1;
                    }
                    i68 = i6;
                    i3 = i69 + i6;
                } else {
                    i2 = i64;
                }
                i6 = i72;
                i68 = i6;
                i3 = i69 + i6;
            } else {
                i2 = i64;
                i68 = i72;
                i3 = i69;
                i69 = i70;
            }
            int i74 = i69 + i65;
            int i75 = i3;
            boolean z3 = i == 1;
            if (i74 < this.IconCompatParcelizer) {
                int i76 = i74 * i10;
                int i77 = i76 + i67;
                int i78 = i77 + i66;
                int i79 = i76 + i10;
                if (i79 < i78) {
                    i78 = i79;
                }
                int i80 = i70 * i * r8lambdaepwd6lfpmo_ffyizdmcorkn0itk.RatingCompat;
                if (z3) {
                    while (i77 < i78) {
                        int i81 = iArr4[bArr11[i80] & 255];
                        if (i81 != 0) {
                            iArr2[i77] = i81;
                        } else if (z2 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i80 += i;
                        i77++;
                    }
                } else {
                    int i82 = ((i78 - i77) * i) + i80;
                    while (i77 < i78) {
                        int i83 = r8lambdaepwd6lfpmo_ffyizdmcorkn0itk.RatingCompat;
                        int i84 = i66;
                        int i85 = i78;
                        int i86 = i80;
                        int i87 = 0;
                        int i88 = 0;
                        int i89 = 0;
                        int i90 = 0;
                        int i91 = 0;
                        while (true) {
                            i5 = i80 + i;
                            if (i86 >= i5) {
                                bArr2 = bArr11;
                                break;
                            }
                            byte[] bArr12 = this.RatingCompat;
                            bArr2 = bArr11;
                            if (i86 >= bArr12.length || i86 >= i82) {
                                break;
                            }
                            int i92 = this.write[bArr12[i86] & 255];
                            if (i92 != 0) {
                                i88 += (i92 >> 24) & 255;
                                i87 += (i92 >> 16) & 255;
                                i89 += (i92 >> 8) & 255;
                                i90 += i92 & 255;
                                i91++;
                            }
                            i86++;
                            bArr11 = bArr2;
                        }
                        int i93 = i80 + i83;
                        for (int i94 = i93; i94 < i93 + i; i94++) {
                            byte[] bArr13 = this.RatingCompat;
                            if (i94 >= bArr13.length || i94 >= i82) {
                                break;
                            }
                            int i95 = this.write[bArr13[i94] & 255];
                            if (i95 != 0) {
                                i88 += (i95 >> 24) & 255;
                                i87 += (i95 >> 16) & 255;
                                i89 += (i95 >> 8) & 255;
                                i90 += i95 & 255;
                                i91++;
                            }
                        }
                        int i96 = i91 == 0 ? 0 : ((i88 / i91) << 24) | ((i87 / i91) << 16) | ((i89 / i91) << 8) | (i90 / i91);
                        if (i96 != 0) {
                            iArr2[i77] = i96;
                        } else if (z2 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i77++;
                        i66 = i84;
                        i78 = i85;
                        i80 = i5;
                        bArr11 = bArr2;
                    }
                }
                i4 = i66;
            } else {
                i4 = i66;
            }
            i70++;
            i69 = i75;
            i64 = i2;
            i65 = i65;
            i67 = i67;
            i66 = i4;
            bArr11 = bArr11;
        }
        if (this.MediaDescriptionCompat == null) {
            this.MediaDescriptionCompat = Boolean.valueOf(bool2 == null ? false : bool2.booleanValue());
        }
        if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
            if (this.PlaybackStateCompatCustomAction == null) {
                this.PlaybackStateCompatCustomAction = RemoteActionCompatParcelizer();
            }
            Bitmap bitmap4 = this.PlaybackStateCompatCustomAction;
            int i610 = this.IconCompatParcelizer;
            int i611 = this.MediaMetadataCompat;
            bitmap4.setPixels(iArr, 0, i611, 0, 0, i611, i610);
        }
        Bitmap bitmapRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer();
        int i612 = this.IconCompatParcelizer;
        int i613 = this.MediaMetadataCompat;
        bitmapRemoteActionCompatParcelizer2.setPixels(iArr, 0, i613, 0, 0, i613, i612);
        return bitmapRemoteActionCompatParcelizer2;
    }
}
