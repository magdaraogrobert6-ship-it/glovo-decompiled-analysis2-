package kotlinx.serialization.protobuf.internal;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2;
import o.DrawableTransformation;
import o.onContentCardClicked;
import o.r8lambda7N4O3RHsB4rVxQ9mafR_mUh23JE;
import o.r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4;
import o.setCarryoverInAppMessage;
import okhttp3.internal.http2.Huffman$Node;

/* JADX INFO: loaded from: classes4.dex */
public final class ProtobufReader {
    public int IconCompatParcelizer;
    public boolean RemoteActionCompatParcelizer;
    public final Huffman$Node write;
    public int serializer = -1;
    public r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4 read = r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4.INVALID;

    public final long IconCompatParcelizer(BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2 backgroundInAppMessagePreparerdisplayPreparedInAppMessage2) {
        int i = r8lambda7N4O3RHsB4rVxQ9mafR_mUh23JE.RemoteActionCompatParcelizer[backgroundInAppMessagePreparerdisplayPreparedInAppMessage2.ordinal()];
        Huffman$Node huffman$Node = this.write;
        if (i == 1) {
            return huffman$Node.serializer(false);
        }
        if (i == 2) {
            long jSerializer = huffman$Node.serializer(false);
            return ((jSerializer ^ ((jSerializer << 63) >> 63)) >> 1) ^ (Long.MIN_VALUE & jSerializer);
        }
        if (i == 3) {
            return RemoteActionCompatParcelizer();
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return 0L;
    }

    public final byte[] IconCompatParcelizer() {
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2.DEFAULT);
        RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer);
        Huffman$Node huffman$Node = this.write;
        huffman$Node.serializer(iRemoteActionCompatParcelizer);
        byte[] bArr = new byte[iRemoteActionCompatParcelizer];
        int i = huffman$Node.serializer;
        int i2 = huffman$Node.read;
        int i3 = i - i2;
        if (i3 < iRemoteActionCompatParcelizer) {
            iRemoteActionCompatParcelizer = i3;
        }
        onContentCardClicked.write((byte[]) huffman$Node.write, 0, bArr, i2, i2 + iRemoteActionCompatParcelizer);
        huffman$Node.read += iRemoteActionCompatParcelizer;
        return bArr;
    }

    public final void MediaDescriptionCompat() {
        int i = r8lambda7N4O3RHsB4rVxQ9mafR_mUh23JE.IconCompatParcelizer[this.read.ordinal()];
        if (i == 1) {
            write(BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2.DEFAULT);
            return;
        }
        if (i == 2) {
            read(BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2.FIXED);
            return;
        }
        if (i != 3) {
            if (i == 4) {
                write(BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2.FIXED);
                return;
            }
            throw new ProtobufDecodingException("Unsupported start group or end group wire type: " + this.read, null);
        }
        r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4 r8lambdara3i0udadsld9ycgatzf3t4ge4 = r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4.SIZE_DELIMITED;
        if (this.read != r8lambdara3i0udadsld9ycgatzf3t4ge4) {
            StringBuilder sb = new StringBuilder("Expected wire type ");
            sb.append(r8lambdara3i0udadsld9ycgatzf3t4ge4);
            DrawableTransformation.write(sb, this.read);
        } else {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2.DEFAULT);
            RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer);
            Huffman$Node huffman$Node = this.write;
            huffman$Node.serializer(iRemoteActionCompatParcelizer);
            huffman$Node.read += iRemoteActionCompatParcelizer;
        }
    }

    public final String MediaSessionCompatQueueItem() {
        r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4 r8lambdara3i0udadsld9ycgatzf3t4ge4 = r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4.SIZE_DELIMITED;
        if (this.read != r8lambdara3i0udadsld9ycgatzf3t4ge4) {
            StringBuilder sb = new StringBuilder("Expected wire type ");
            sb.append(r8lambdara3i0udadsld9ycgatzf3t4ge4);
            DrawableTransformation.write(sb, this.read);
            return null;
        }
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2.DEFAULT);
        RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer);
        Huffman$Node huffman$Node = this.write;
        byte[] bArr = (byte[]) huffman$Node.write;
        int i = huffman$Node.read;
        String strSerializer = setCarryoverInAppMessage.serializer(bArr, i, i + iRemoteActionCompatParcelizer, 4);
        huffman$Node.read += iRemoteActionCompatParcelizer;
        return strSerializer;
    }

    public final int RemoteActionCompatParcelizer(BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2 backgroundInAppMessagePreparerdisplayPreparedInAppMessage2) {
        int i;
        int i2 = r8lambda7N4O3RHsB4rVxQ9mafR_mUh23JE.RemoteActionCompatParcelizer[backgroundInAppMessagePreparerdisplayPreparedInAppMessage2.ordinal()];
        Huffman$Node huffman$Node = this.write;
        if (i2 == 1) {
            return (int) huffman$Node.serializer(false);
        }
        if (i2 != 2) {
            if (i2 == 3) {
                return serializer();
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return 0;
        }
        int i3 = huffman$Node.read;
        int i4 = huffman$Node.serializer;
        if (i3 == i4) {
            DrawableTransformation.serializer("Unexpected EOF");
            return 0;
        }
        byte[] bArr = (byte[]) huffman$Node.write;
        int i5 = i3 + 1;
        int i6 = bArr[i3];
        if (i6 >= 0) {
            huffman$Node.read = i5;
        } else {
            if (i4 - i3 <= 1 || (i = (bArr[i5] << 7) ^ i6) >= 0) {
                int i7 = 0;
                for (int i8 = 0; i8 < 32; i8 += 7) {
                    int iIconCompatParcelizer = huffman$Node.IconCompatParcelizer();
                    i7 |= (iIconCompatParcelizer & 127) << i8;
                    if ((iIconCompatParcelizer & Fields.SpotShadowColor) == 0) {
                        i6 = i7;
                    }
                }
                DrawableTransformation.serializer("Input stream is malformed: Varint too long (exceeded 32 bits)");
                return 0;
            }
            huffman$Node.read = i3 + 2;
            i6 = (i == true ? 1 : 0) ^ (-128);
        }
        return (((((i6 << 31) >> 31) ^ i6) == true ? 1 : 0) >> 1) ^ (Integer.MIN_VALUE & i6);
    }

    public final Huffman$Node read() {
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2.DEFAULT);
        RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer);
        Huffman$Node huffman$Node = this.write;
        huffman$Node.serializer(iRemoteActionCompatParcelizer);
        Huffman$Node huffman$Node2 = new Huffman$Node((byte[]) huffman$Node.write, huffman$Node.read + iRemoteActionCompatParcelizer);
        huffman$Node2.read = huffman$Node.read;
        huffman$Node.read += iRemoteActionCompatParcelizer;
        return huffman$Node2;
    }

    public final Huffman$Node write() {
        r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4 r8lambdara3i0udadsld9ycgatzf3t4ge4 = r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4.SIZE_DELIMITED;
        if (this.read == r8lambdara3i0udadsld9ycgatzf3t4ge4) {
            return read();
        }
        StringBuilder sb = new StringBuilder("Expected wire type ");
        sb.append(r8lambdara3i0udadsld9ycgatzf3t4ge4);
        DrawableTransformation.write(sb, this.read);
        return null;
    }

    public ProtobufReader(Huffman$Node huffman$Node) {
        this.write = huffman$Node;
    }

    public final int IconCompatParcelizer(int i) {
        if (i == -1) {
            this.serializer = -1;
            this.read = r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4.INVALID;
            return -1;
        }
        this.serializer = i >>> 3;
        r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4.Companion.getClass();
        this.read = r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4.entryArray[i & 7];
        return this.serializer;
    }

    public final long read(BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2 backgroundInAppMessagePreparerdisplayPreparedInAppMessage2) {
        backgroundInAppMessagePreparerdisplayPreparedInAppMessage2.getClass();
        r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4 r8lambdara3i0udadsld9ycgatzf3t4ge4 = backgroundInAppMessagePreparerdisplayPreparedInAppMessage2 == BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2.FIXED ? r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4.i64 : r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4.VARINT;
        if (this.read == r8lambdara3i0udadsld9ycgatzf3t4ge4) {
            return IconCompatParcelizer(backgroundInAppMessagePreparerdisplayPreparedInAppMessage2);
        }
        StringBuilder sb = new StringBuilder("Expected wire type ");
        sb.append(r8lambdara3i0udadsld9ycgatzf3t4ge4);
        DrawableTransformation.write(sb, this.read);
        return 0L;
    }

    public final int write(BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2 backgroundInAppMessagePreparerdisplayPreparedInAppMessage2) {
        backgroundInAppMessagePreparerdisplayPreparedInAppMessage2.getClass();
        r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4 r8lambdara3i0udadsld9ycgatzf3t4ge4 = backgroundInAppMessagePreparerdisplayPreparedInAppMessage2 == BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2.FIXED ? r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4.i32 : r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4.VARINT;
        if (this.read == r8lambdara3i0udadsld9ycgatzf3t4ge4) {
            return RemoteActionCompatParcelizer(backgroundInAppMessagePreparerdisplayPreparedInAppMessage2);
        }
        StringBuilder sb = new StringBuilder("Expected wire type ");
        sb.append(r8lambdara3i0udadsld9ycgatzf3t4ge4);
        DrawableTransformation.write(sb, this.read);
        return 0;
    }

    public final int RatingCompat() {
        if (!this.RemoteActionCompatParcelizer) {
            this.IconCompatParcelizer = (this.serializer << 3) | this.read.getTypeId();
            return IconCompatParcelizer((int) this.write.serializer(true));
        }
        this.RemoteActionCompatParcelizer = false;
        int i = this.serializer;
        int typeId = this.read.getTypeId();
        int iIconCompatParcelizer = IconCompatParcelizer(this.IconCompatParcelizer);
        this.IconCompatParcelizer = (i << 3) | typeId;
        return iIconCompatParcelizer;
    }

    public final int serializer() {
        int iIconCompatParcelizer = 0;
        for (int i = 0; i < 4; i++) {
            iIconCompatParcelizer |= (this.write.IconCompatParcelizer() & 255) << (i * 8);
        }
        return iIconCompatParcelizer;
    }

    public static void RemoteActionCompatParcelizer(int i) {
        if (i < 0) {
            throw new ProtobufDecodingException(c8$$ExternalSyntheticOutline0.m(i, "Unexpected negative length: "), null);
        }
    }

    public final long RemoteActionCompatParcelizer() {
        long jIconCompatParcelizer = 0;
        for (int i = 0; i < 8; i++) {
            jIconCompatParcelizer |= ((long) (this.write.IconCompatParcelizer() & 255)) << (i * 8);
        }
        return jIconCompatParcelizer;
    }
}
