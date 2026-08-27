package o;

import android.util.Log;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class r8lambdaY6_OCuxWIPAEsjS5255j_VVi2Ek {
    public ByteBuffer IconCompatParcelizer;
    public r8lambdaLOvDXKeBCWVMEVqkoYOT9dw91J4 read;
    public final byte[] serializer = new byte[androidx.compose.ui.graphics.Fields.RotationX];
    public int RemoteActionCompatParcelizer = 0;

    public final int[] RemoteActionCompatParcelizer(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.IconCompatParcelizer.get(bArr);
            iArr = new int[androidx.compose.ui.graphics.Fields.RotationX];
            int i2 = 0;
            int i3 = 0;
            while (i3 < i) {
                byte b = bArr[i2];
                byte b2 = bArr[i2 + 1];
                int i4 = i2 + 3;
                iArr[i3] = (bArr[i2 + 2] & 255) | ((b & 255) << 16) | (-16777216) | ((b2 & 255) << 8);
                i3++;
                i2 = i4;
            }
            return iArr;
        } catch (BufferUnderflowException unused) {
            Log.isLoggable("GifHeaderParser", 3);
            this.read.MediaSessionCompatQueueItem = 1;
            return iArr;
        }
    }

    public final int read() {
        try {
            return this.IconCompatParcelizer.get() & 255;
        } catch (Exception unused) {
            this.read.MediaSessionCompatQueueItem = 1;
            return 0;
        }
    }

    public final boolean write() {
        return this.read.MediaSessionCompatQueueItem != 0;
    }

    public final void IconCompatParcelizer() {
        int i;
        do {
            i = read();
            this.IconCompatParcelizer.position(Math.min(this.IconCompatParcelizer.position() + i, this.IconCompatParcelizer.limit()));
        } while (i > 0);
    }

    public final void serializer() {
        int i = read();
        this.RemoteActionCompatParcelizer = i;
        if (i <= 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            try {
                int i3 = this.RemoteActionCompatParcelizer;
                if (i2 >= i3) {
                    return;
                }
                int i4 = i3 - i2;
                this.IconCompatParcelizer.get(this.serializer, i2, i4);
                i2 += i4;
            } catch (Exception unused) {
                Log.isLoggable("GifHeaderParser", 3);
                this.read.MediaSessionCompatQueueItem = 1;
                return;
            }
        }
    }

    public final r8lambdaLOvDXKeBCWVMEVqkoYOT9dw91J4 RemoteActionCompatParcelizer() {
        byte[] bArr;
        if (this.IconCompatParcelizer == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("You must call setData() before parseHeader()");
            return null;
        }
        if (write()) {
            return this.read;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) read());
        }
        boolean zStartsWith = sb.toString().startsWith("GIF");
        r8lambdaLOvDXKeBCWVMEVqkoYOT9dw91J4 r8lambdalovdxkebcwvmevqkoyot9dw91j4 = this.read;
        if (zStartsWith) {
            r8lambdalovdxkebcwvmevqkoyot9dw91j4.ParcelableVolumeInfo = this.IconCompatParcelizer.getShort();
            this.read.RatingCompat = this.IconCompatParcelizer.getShort();
            int i2 = read();
            r8lambdaLOvDXKeBCWVMEVqkoYOT9dw91J4 r8lambdalovdxkebcwvmevqkoyot9dw91j5 = this.read;
            r8lambdalovdxkebcwvmevqkoyot9dw91j5.MediaDescriptionCompat = (i2 & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0;
            r8lambdalovdxkebcwvmevqkoyot9dw91j5.MediaBrowserCompatMediaItem = (int) Math.pow(2.0d, (i2 & 7) + 1);
            this.read.RemoteActionCompatParcelizer = read();
            r8lambdaLOvDXKeBCWVMEVqkoYOT9dw91J4 r8lambdalovdxkebcwvmevqkoyot9dw91j6 = this.read;
            read();
            r8lambdalovdxkebcwvmevqkoyot9dw91j6.getClass();
            if (this.read.MediaDescriptionCompat && !write()) {
                r8lambdaLOvDXKeBCWVMEVqkoYOT9dw91J4 r8lambdalovdxkebcwvmevqkoyot9dw91j7 = this.read;
                r8lambdalovdxkebcwvmevqkoyot9dw91j7.MediaMetadataCompat = RemoteActionCompatParcelizer(r8lambdalovdxkebcwvmevqkoyot9dw91j7.MediaBrowserCompatMediaItem);
                r8lambdaLOvDXKeBCWVMEVqkoYOT9dw91J4 r8lambdalovdxkebcwvmevqkoyot9dw91j8 = this.read;
                r8lambdalovdxkebcwvmevqkoyot9dw91j8.serializer = r8lambdalovdxkebcwvmevqkoyot9dw91j8.MediaMetadataCompat[r8lambdalovdxkebcwvmevqkoyot9dw91j8.RemoteActionCompatParcelizer];
            }
        } else {
            r8lambdalovdxkebcwvmevqkoyot9dw91j4.MediaSessionCompatQueueItem = 1;
        }
        if (!write()) {
            boolean z = false;
            while (!z && !write() && this.read.read <= Integer.MAX_VALUE) {
                int i3 = read();
                if (i3 == 33) {
                    int i4 = read();
                    if (i4 == 1) {
                        IconCompatParcelizer();
                    } else if (i4 == 249) {
                        this.read.write = new r8lambdaepWD6LFpMo_FfyizDMcoRKn0Itk();
                        read();
                        int i5 = read();
                        r8lambdaepWD6LFpMo_FfyizDMcoRKn0Itk r8lambdaepwd6lfpmo_ffyizdmcorkn0itk = this.read.write;
                        int i6 = (i5 & 28) >> 2;
                        r8lambdaepwd6lfpmo_ffyizdmcorkn0itk.RemoteActionCompatParcelizer = i6;
                        if (i6 == 0) {
                            r8lambdaepwd6lfpmo_ffyizdmcorkn0itk.RemoteActionCompatParcelizer = 1;
                        }
                        r8lambdaepwd6lfpmo_ffyizdmcorkn0itk.MediaSessionCompatToken = (i5 & 1) != 0;
                        short s = this.IconCompatParcelizer.getShort();
                        if (s < 2) {
                            s = 10;
                        }
                        r8lambdaepWD6LFpMo_FfyizDMcoRKn0Itk r8lambdaepwd6lfpmo_ffyizdmcorkn0itk2 = this.read.write;
                        r8lambdaepwd6lfpmo_ffyizdmcorkn0itk2.serializer = s * 10;
                        r8lambdaepwd6lfpmo_ffyizdmcorkn0itk2.MediaBrowserCompatMediaItem = read();
                        read();
                    } else if (i4 == 254) {
                        IconCompatParcelizer();
                    } else if (i4 != 255) {
                        IconCompatParcelizer();
                    } else {
                        serializer();
                        StringBuilder sb2 = new StringBuilder();
                        int i7 = 0;
                        while (true) {
                            bArr = this.serializer;
                            if (i7 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i7]);
                            i7++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                serializer();
                                if (bArr[0] == 1) {
                                    byte b = bArr[1];
                                    byte b2 = bArr[2];
                                    this.read.getClass();
                                }
                                if (this.RemoteActionCompatParcelizer <= 0) {
                                    break;
                                }
                            } while (!write());
                        } else {
                            IconCompatParcelizer();
                        }
                    }
                } else if (i3 == 44) {
                    r8lambdaLOvDXKeBCWVMEVqkoYOT9dw91J4 r8lambdalovdxkebcwvmevqkoyot9dw91j9 = this.read;
                    if (r8lambdalovdxkebcwvmevqkoyot9dw91j9.write == null) {
                        r8lambdalovdxkebcwvmevqkoyot9dw91j9.write = new r8lambdaepWD6LFpMo_FfyizDMcoRKn0Itk();
                    }
                    r8lambdalovdxkebcwvmevqkoyot9dw91j9.write.MediaDescriptionCompat = this.IconCompatParcelizer.getShort();
                    this.read.write.MediaSessionCompatQueueItem = this.IconCompatParcelizer.getShort();
                    this.read.write.RatingCompat = this.IconCompatParcelizer.getShort();
                    this.read.write.IconCompatParcelizer = this.IconCompatParcelizer.getShort();
                    int i8 = read();
                    boolean z2 = (i8 & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0;
                    int iPow = (int) Math.pow(2.0d, (i8 & 7) + 1);
                    r8lambdaepWD6LFpMo_FfyizDMcoRKn0Itk r8lambdaepwd6lfpmo_ffyizdmcorkn0itk3 = this.read.write;
                    r8lambdaepwd6lfpmo_ffyizdmcorkn0itk3.read = (i8 & 64) != 0;
                    if (z2) {
                        r8lambdaepwd6lfpmo_ffyizdmcorkn0itk3.MediaMetadataCompat = RemoteActionCompatParcelizer(iPow);
                    } else {
                        r8lambdaepwd6lfpmo_ffyizdmcorkn0itk3.MediaMetadataCompat = null;
                    }
                    this.read.write.write = this.IconCompatParcelizer.position();
                    read();
                    IconCompatParcelizer();
                    if (!write()) {
                        r8lambdaLOvDXKeBCWVMEVqkoYOT9dw91J4 r8lambdalovdxkebcwvmevqkoyot9dw91j10 = this.read;
                        r8lambdalovdxkebcwvmevqkoyot9dw91j10.read++;
                        r8lambdalovdxkebcwvmevqkoyot9dw91j10.IconCompatParcelizer.add(r8lambdalovdxkebcwvmevqkoyot9dw91j10.write);
                    }
                } else if (i3 != 59) {
                    this.read.MediaSessionCompatQueueItem = 1;
                } else {
                    z = true;
                }
            }
            r8lambdaLOvDXKeBCWVMEVqkoYOT9dw91J4 r8lambdalovdxkebcwvmevqkoyot9dw91j11 = this.read;
            if (r8lambdalovdxkebcwvmevqkoyot9dw91j11.read < 0) {
                r8lambdalovdxkebcwvmevqkoyot9dw91j11.MediaSessionCompatQueueItem = 1;
            }
        }
        return this.read;
    }
}
