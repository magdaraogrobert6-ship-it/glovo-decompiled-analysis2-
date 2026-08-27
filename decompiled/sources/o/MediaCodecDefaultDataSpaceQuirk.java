package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class MediaCodecDefaultDataSpaceQuirk extends FilterOutputStream {
    public static final byte[] read = "Exif\u0000\u0000".getBytes(EncoderNotUsePersistentInputSurfaceQuirk.read);
    public int IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public final byte[] MediaMetadataCompat;
    public final ByteBuffer RemoteActionCompatParcelizer;
    public int serializer;
    public final CodecStuckOnFlushQuirk write;

    public MediaCodecDefaultDataSpaceQuirk(ByteArrayOutputStream byteArrayOutputStream, CodecStuckOnFlushQuirk codecStuckOnFlushQuirk) {
        super(new BufferedOutputStream(byteArrayOutputStream, 65536));
        this.MediaMetadataCompat = new byte[1];
        this.RemoteActionCompatParcelizer = ByteBuffer.allocate(4);
        this.MediaBrowserCompatMediaItem = 0;
        this.write = codecStuckOnFlushQuirk;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        CodecStuckOnFlushQuirk codecStuckOnFlushQuirk;
        int i3 = i;
        int i4 = i2;
        while (true) {
            int i5 = this.serializer;
            if ((i5 <= 0 && this.IconCompatParcelizer <= 0 && this.MediaBrowserCompatMediaItem == 2) || i4 <= 0) {
                break;
            }
            if (i5 > 0) {
                int iMin = Math.min(i4, i5);
                i4 -= iMin;
                this.serializer -= iMin;
                i3 += iMin;
            }
            int i6 = this.IconCompatParcelizer;
            if (i6 > 0) {
                int iMin2 = Math.min(i4, i6);
                ((FilterOutputStream) this).out.write(bArr, i3, iMin2);
                i4 -= iMin2;
                this.IconCompatParcelizer -= iMin2;
                i3 += iMin2;
            }
            if (i4 == 0) {
                return;
            }
            int i7 = this.MediaBrowserCompatMediaItem;
            ByteBuffer byteBuffer = this.RemoteActionCompatParcelizer;
            int i8 = 4;
            if (i7 == 0) {
                int iMin3 = Math.min(i4, 2 - byteBuffer.position());
                byteBuffer.put(bArr, i3, iMin3);
                i3 += iMin3;
                i4 -= iMin3;
                if (byteBuffer.position() < 2) {
                    return;
                }
                byteBuffer.rewind();
                if (byteBuffer.getShort() == -40) {
                    ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 2);
                    this.MediaBrowserCompatMediaItem = 1;
                    byteBuffer.rewind();
                    OutputStream outputStream = ((FilterOutputStream) this).out;
                    ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                    AudioSourceAccessException audioSourceAccessException = new AudioSourceAccessException(outputStream);
                    audioSourceAccessException.serializer((short) -31);
                    int[] iArr = new int[4];
                    int[] iArr2 = new int[4];
                    ExtraSupportedResolutionQuirk[] extraSupportedResolutionQuirkArr = CodecStuckOnFlushQuirk.read;
                    int i9 = 0;
                    while (true) {
                        codecStuckOnFlushQuirk = this.write;
                        if (i9 >= i8) {
                            break;
                        }
                        ExtraSupportedResolutionQuirk extraSupportedResolutionQuirk = extraSupportedResolutionQuirkArr[i9];
                        int i10 = 0;
                        while (true) {
                            ExtraSupportedResolutionQuirk[] extraSupportedResolutionQuirkArr2 = CodecStuckOnFlushQuirk.read;
                            if (i10 < i8) {
                                codecStuckOnFlushQuirk.RemoteActionCompatParcelizer(i10).remove(extraSupportedResolutionQuirk.RemoteActionCompatParcelizer);
                                i10++;
                                i8 = 4;
                            }
                        }
                        i9++;
                        i8 = 4;
                    }
                    Map mapRemoteActionCompatParcelizer = codecStuckOnFlushQuirk.RemoteActionCompatParcelizer(1);
                    ByteOrder byteOrder2 = codecStuckOnFlushQuirk.MediaBrowserCompatMediaItem;
                    if (!mapRemoteActionCompatParcelizer.isEmpty()) {
                        codecStuckOnFlushQuirk.RemoteActionCompatParcelizer(0).put(CodecStuckOnFlushQuirk.read[1].RemoteActionCompatParcelizer, EncoderNotUsePersistentInputSurfaceQuirk.serializer(0L, byteOrder2));
                    }
                    if (!codecStuckOnFlushQuirk.RemoteActionCompatParcelizer(2).isEmpty()) {
                        codecStuckOnFlushQuirk.RemoteActionCompatParcelizer(0).put(CodecStuckOnFlushQuirk.read[2].RemoteActionCompatParcelizer, EncoderNotUsePersistentInputSurfaceQuirk.serializer(0L, byteOrder2));
                    }
                    if (!codecStuckOnFlushQuirk.RemoteActionCompatParcelizer(3).isEmpty()) {
                        codecStuckOnFlushQuirk.RemoteActionCompatParcelizer(1).put(CodecStuckOnFlushQuirk.read[3].RemoteActionCompatParcelizer, EncoderNotUsePersistentInputSurfaceQuirk.serializer(0L, byteOrder2));
                    }
                    int i11 = 0;
                    while (true) {
                        ExtraSupportedResolutionQuirk[] extraSupportedResolutionQuirkArr3 = CodecStuckOnFlushQuirk.read;
                        if (i11 >= 4) {
                            break;
                        }
                        Iterator it = codecStuckOnFlushQuirk.RemoteActionCompatParcelizer(i11).entrySet().iterator();
                        int i12 = 0;
                        while (it.hasNext()) {
                            EncoderNotUsePersistentInputSurfaceQuirk encoderNotUsePersistentInputSurfaceQuirk = (EncoderNotUsePersistentInputSurfaceQuirk) ((Map.Entry) it.next()).getValue();
                            int i13 = EncoderNotUsePersistentInputSurfaceQuirk.write[encoderNotUsePersistentInputSurfaceQuirk.IconCompatParcelizer] * encoderNotUsePersistentInputSurfaceQuirk.MediaSessionCompatQueueItem;
                            if (i13 > 4) {
                                i12 += i13;
                            }
                        }
                        iArr2[i11] = iArr2[i11] + i12;
                        i11++;
                    }
                    int i14 = 0;
                    int size = 8;
                    while (true) {
                        ExtraSupportedResolutionQuirk[] extraSupportedResolutionQuirkArr4 = CodecStuckOnFlushQuirk.read;
                        if (i14 >= 4) {
                            break;
                        }
                        if (!codecStuckOnFlushQuirk.RemoteActionCompatParcelizer(i14).isEmpty()) {
                            iArr[i14] = size;
                            size += (codecStuckOnFlushQuirk.RemoteActionCompatParcelizer(i14).size() * 12) + 6 + iArr2[i14];
                        }
                        i14++;
                    }
                    if (!codecStuckOnFlushQuirk.RemoteActionCompatParcelizer(1).isEmpty()) {
                        codecStuckOnFlushQuirk.RemoteActionCompatParcelizer(0).put(CodecStuckOnFlushQuirk.read[1].RemoteActionCompatParcelizer, EncoderNotUsePersistentInputSurfaceQuirk.serializer(iArr[1], byteOrder2));
                    }
                    if (!codecStuckOnFlushQuirk.RemoteActionCompatParcelizer(2).isEmpty()) {
                        codecStuckOnFlushQuirk.RemoteActionCompatParcelizer(0).put(CodecStuckOnFlushQuirk.read[2].RemoteActionCompatParcelizer, EncoderNotUsePersistentInputSurfaceQuirk.serializer(iArr[2], byteOrder2));
                    }
                    if (!codecStuckOnFlushQuirk.RemoteActionCompatParcelizer(3).isEmpty()) {
                        codecStuckOnFlushQuirk.RemoteActionCompatParcelizer(1).put(CodecStuckOnFlushQuirk.read[3].RemoteActionCompatParcelizer, EncoderNotUsePersistentInputSurfaceQuirk.serializer(iArr[3], byteOrder2));
                    }
                    audioSourceAccessException.serializer((short) (size + 8));
                    audioSourceAccessException.write(read);
                    audioSourceAccessException.serializer(byteOrder2 == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
                    audioSourceAccessException.RemoteActionCompatParcelizer = byteOrder2;
                    audioSourceAccessException.serializer((short) 42);
                    audioSourceAccessException.IconCompatParcelizer(8);
                    int i15 = 0;
                    while (true) {
                        ExtraSupportedResolutionQuirk[] extraSupportedResolutionQuirkArr5 = CodecStuckOnFlushQuirk.read;
                        if (i15 >= 4) {
                            break;
                        }
                        if (!codecStuckOnFlushQuirk.RemoteActionCompatParcelizer(i15).isEmpty()) {
                            audioSourceAccessException.serializer((short) codecStuckOnFlushQuirk.RemoteActionCompatParcelizer(i15).size());
                            int size2 = (codecStuckOnFlushQuirk.RemoteActionCompatParcelizer(i15).size() * 12) + iArr[i15] + 2 + 4;
                            for (Map.Entry entry : codecStuckOnFlushQuirk.RemoteActionCompatParcelizer(i15).entrySet()) {
                                ExtraSupportedResolutionQuirk extraSupportedResolutionQuirk2 = (ExtraSupportedResolutionQuirk) ((HashMap) ExcludeStretchedVideoQualityQuirk.RemoteActionCompatParcelizer.get(i15)).get(entry.getKey());
                                coil3.util.UtilsKt.IconCompatParcelizer(extraSupportedResolutionQuirk2, "Tag not supported: " + ((String) entry.getKey()) + ". Tag needs to be ported from ExifInterface to ExifData.");
                                int i16 = extraSupportedResolutionQuirk2.IconCompatParcelizer;
                                EncoderNotUsePersistentInputSurfaceQuirk encoderNotUsePersistentInputSurfaceQuirk2 = (EncoderNotUsePersistentInputSurfaceQuirk) entry.getValue();
                                int[] iArr3 = EncoderNotUsePersistentInputSurfaceQuirk.write;
                                int i17 = encoderNotUsePersistentInputSurfaceQuirk2.IconCompatParcelizer;
                                int i18 = encoderNotUsePersistentInputSurfaceQuirk2.MediaSessionCompatQueueItem;
                                int i19 = iArr3[i17] * i18;
                                audioSourceAccessException.serializer((short) i16);
                                audioSourceAccessException.serializer((short) encoderNotUsePersistentInputSurfaceQuirk2.IconCompatParcelizer);
                                audioSourceAccessException.IconCompatParcelizer(i18);
                                if (i19 > 4) {
                                    audioSourceAccessException.IconCompatParcelizer(size2);
                                    size2 += i19;
                                } else {
                                    audioSourceAccessException.write(encoderNotUsePersistentInputSurfaceQuirk2.serializer);
                                    if (i19 < 4) {
                                        for (int i20 = 4; i19 < i20; i20 = 4) {
                                            audioSourceAccessException.IconCompatParcelizer.write(0);
                                            i19++;
                                        }
                                    }
                                }
                            }
                            audioSourceAccessException.IconCompatParcelizer(0);
                            Iterator it2 = codecStuckOnFlushQuirk.RemoteActionCompatParcelizer(i15).entrySet().iterator();
                            while (it2.hasNext()) {
                                byte[] bArr2 = ((EncoderNotUsePersistentInputSurfaceQuirk) ((Map.Entry) it2.next()).getValue()).serializer;
                                if (bArr2.length > 4) {
                                    audioSourceAccessException.write(bArr2, 0, bArr2.length);
                                }
                            }
                        }
                        i15++;
                    }
                    audioSourceAccessException.RemoteActionCompatParcelizer = ByteOrder.BIG_ENDIAN;
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Not a valid jpeg image, cannot write exif");
                    return;
                }
            } else if (i7 != 1) {
                continue;
            } else {
                int iMin4 = Math.min(i4, 4 - byteBuffer.position());
                byteBuffer.put(bArr, i3, iMin4);
                i3 += iMin4;
                i4 -= iMin4;
                if (byteBuffer.position() == 2 && byteBuffer.getShort() == -39) {
                    ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 2);
                    byteBuffer.rewind();
                }
                if (byteBuffer.position() < 4) {
                    return;
                }
                byteBuffer.rewind();
                short s = byteBuffer.getShort();
                if (s == -31) {
                    this.serializer = (byteBuffer.getShort() & 65535) - 2;
                    this.MediaBrowserCompatMediaItem = 2;
                } else if (s >= -64 && s <= -49 && s != -60 && s != -56 && s != -52) {
                    ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 4);
                    this.MediaBrowserCompatMediaItem = 2;
                } else {
                    ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 4);
                    this.IconCompatParcelizer = (byteBuffer.getShort() & 65535) - 2;
                }
                byteBuffer.rewind();
            }
        }
        if (i4 > 0) {
            ((FilterOutputStream) this).out.write(bArr, i3, i4);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.MediaMetadataCompat;
        bArr[0] = (byte) (i & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
