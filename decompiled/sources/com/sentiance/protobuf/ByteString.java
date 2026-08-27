package com.sentiance.protobuf;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.google.protobuf.FieldType$$ExternalSyntheticBUOutline0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import o.BrazeNetworkFailureEvent;
import o.ContentCardsUpdatedEvent;
import o.DrawableTransformation;
import o.getErrorReason;
import o.isFromOfflineStorage;
import o.onError;
import o.r8lambdaIZz_yhFbmsc9dFp_Le0QsEa0ZM;
import o.setRuntimeAppConfigurationProvider;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {
    public static final ByteString RemoteActionCompatParcelizer = new LiteralByteString(isFromOfflineStorage.serializer);
    public static final BrazeNetworkFailureEvent read;
    private static final long serialVersionUID = 1;
    private int hash = 0;

    public static final class BoundedByteString extends LiteralByteString {
        private static final long serialVersionUID = 1;
        private final int bytesLength;
        private final int bytesOffset;

        @Override // com.sentiance.protobuf.ByteString.LiteralByteString
        public final int MediaDescriptionCompat() {
            return this.bytesOffset;
        }

        @Override // com.sentiance.protobuf.ByteString.LiteralByteString, com.sentiance.protobuf.ByteString
        public final int serializer() {
            return this.bytesLength;
        }

        @Override // com.sentiance.protobuf.ByteString.LiteralByteString, com.sentiance.protobuf.ByteString
        public final byte IconCompatParcelizer(int i) {
            return this.bytes[this.bytesOffset + i];
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        public BoundedByteString(byte[] bArr, int i, int i2) {
            super(bArr);
            ByteString.write(i, i + i2, bArr.length);
            this.bytesOffset = i;
            this.bytesLength = i2;
        }

        public Object writeReplace() {
            byte[] bArr;
            int iSerializer = serializer();
            if (iSerializer == 0) {
                bArr = isFromOfflineStorage.serializer;
            } else {
                byte[] bArr2 = new byte[iSerializer];
                System.arraycopy(this.bytes, this.bytesOffset, bArr2, 0, iSerializer);
                bArr = bArr2;
            }
            return new LiteralByteString(bArr);
        }

        @Override // com.sentiance.protobuf.ByteString.LiteralByteString, com.sentiance.protobuf.ByteString
        public final byte serializer(int i) {
            int i2 = this.bytesLength;
            if (((i2 - (i + 1)) | i) >= 0) {
                return this.bytes[this.bytesOffset + i];
            }
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(c8$$ExternalSyntheticOutline0.m(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(af$$ExternalSyntheticOutline0.m(i, "Index > length: ", i2, ", "));
        }
    }

    public static abstract class LeafByteString extends ByteString {
        private static final long serialVersionUID = 1;

        @Override // java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new r8lambdaIZz_yhFbmsc9dFp_Le0QsEa0ZM(this);
        }
    }

    public static class LiteralByteString extends LeafByteString {
        private static final long serialVersionUID = 1;
        protected final byte[] bytes;

        public int MediaDescriptionCompat() {
            return 0;
        }

        @Override // com.sentiance.protobuf.ByteString
        public final ByteString RemoteActionCompatParcelizer(int i) {
            int iWrite = ByteString.write(0, i, serializer());
            return iWrite == 0 ? ByteString.RemoteActionCompatParcelizer : new BoundedByteString(this.bytes, MediaDescriptionCompat(), iWrite);
        }

        @Override // com.sentiance.protobuf.ByteString
        public final u RemoteActionCompatParcelizer() {
            return u.IconCompatParcelizer(this.bytes, MediaDescriptionCompat(), serializer(), true);
        }

        @Override // com.sentiance.protobuf.ByteString
        public final int read(int i, int i2) {
            byte[] bArr = this.bytes;
            int iMediaDescriptionCompat = MediaDescriptionCompat();
            Charset charset = isFromOfflineStorage.read;
            for (int i3 = iMediaDescriptionCompat; i3 < iMediaDescriptionCompat + i2; i3++) {
                i = (i * 31) + bArr[i3];
            }
            return i;
        }

        @Override // com.sentiance.protobuf.ByteString
        public byte serializer(int i) {
            return this.bytes[i];
        }

        @Override // com.sentiance.protobuf.ByteString
        public int serializer() {
            return this.bytes.length;
        }

        @Override // com.sentiance.protobuf.ByteString
        public final void serializer(setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider) {
            setruntimeappconfigurationprovider.RemoteActionCompatParcelizer(this.bytes, MediaDescriptionCompat(), serializer());
        }

        public LiteralByteString(byte[] bArr) {
            bArr.getClass();
            this.bytes = bArr;
        }

        @Override // com.sentiance.protobuf.ByteString
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof ByteString) && serializer() == ((ByteString) obj).serializer()) {
                if (serializer() == 0) {
                    return true;
                }
                if (obj instanceof LiteralByteString) {
                    LiteralByteString literalByteString = (LiteralByteString) obj;
                    int i = read();
                    int i2 = literalByteString.read();
                    if (i == 0 || i2 == 0 || i == i2) {
                        int iSerializer = serializer();
                        if (iSerializer <= literalByteString.serializer()) {
                            if (iSerializer <= literalByteString.serializer()) {
                                byte[] bArr = this.bytes;
                                byte[] bArr2 = literalByteString.bytes;
                                int iMediaDescriptionCompat = MediaDescriptionCompat();
                                int iMediaDescriptionCompat2 = MediaDescriptionCompat();
                                int iMediaDescriptionCompat3 = literalByteString.MediaDescriptionCompat();
                                while (iMediaDescriptionCompat2 < iMediaDescriptionCompat + iSerializer) {
                                    if (bArr[iMediaDescriptionCompat2] == bArr2[iMediaDescriptionCompat3]) {
                                        iMediaDescriptionCompat2++;
                                        iMediaDescriptionCompat3++;
                                    }
                                }
                                return true;
                            }
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(literalByteString.serializer(), ff$$ExternalSyntheticOutline0.m(iSerializer, "Ran off end of other: 0, ", ", "));
                            return false;
                        }
                        FieldType$$ExternalSyntheticBUOutline0.RemoteActionCompatParcelizer(iSerializer, serializer());
                        return false;
                    }
                } else {
                    return obj.equals(this);
                }
            }
            return false;
        }

        @Override // com.sentiance.protobuf.ByteString
        public final boolean IconCompatParcelizer() {
            int iMediaDescriptionCompat = MediaDescriptionCompat();
            return getErrorReason.read.serializer(this.bytes, iMediaDescriptionCompat, serializer() + iMediaDescriptionCompat);
        }

        @Override // com.sentiance.protobuf.ByteString
        public byte IconCompatParcelizer(int i) {
            return this.bytes[i];
        }

        @Override // com.sentiance.protobuf.ByteString
        public final String IconCompatParcelizer(Charset charset) {
            return new String(this.bytes, MediaDescriptionCompat(), serializer(), charset);
        }
    }

    public abstract byte IconCompatParcelizer(int i);

    public abstract String IconCompatParcelizer(Charset charset);

    public abstract boolean IconCompatParcelizer();

    public abstract ByteString RemoteActionCompatParcelizer(int i);

    public abstract u RemoteActionCompatParcelizer();

    public abstract boolean equals(Object obj);

    public final int read() {
        return this.hash;
    }

    public abstract int read(int i, int i2);

    public abstract byte serializer(int i);

    public abstract int serializer();

    public abstract void serializer(setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider);

    static {
        read = onError.IconCompatParcelizer() ? new BrazeNetworkFailureEvent(2) : new BrazeNetworkFailureEvent(1);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return ff$$ExternalSyntheticOutline0.m(m1$$ExternalSyntheticOutline0.m("<ByteString@", serializer(), hexString, " size=", " contents=\""), serializer() <= 50 ? ContentCardsUpdatedEvent.RemoteActionCompatParcelizer(this) : ContentCardsUpdatedEvent.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(47)).concat("..."), "\">");
    }

    public final String write() {
        return serializer() == 0 ? "" : IconCompatParcelizer(isFromOfflineStorage.read);
    }

    public final int hashCode() {
        int i = this.hash;
        if (i == 0) {
            int iSerializer = serializer();
            i = read(iSerializer, iSerializer);
            if (i == 0) {
                i = 1;
            }
            this.hash = i;
        }
        return i;
    }

    public static int write(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            DrawableTransformation.read(d$$ExternalSyntheticOutline0.m(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            DrawableTransformation.read(af$$ExternalSyntheticOutline0.m(i, "Beginning index larger than ending index: ", i2, ", "));
            return 0;
        }
        DrawableTransformation.read(af$$ExternalSyntheticOutline0.m(i2, "End index: ", i3, " >= "));
        return 0;
    }

    public static ByteString write(byte[] bArr, int i, int i2) {
        byte[] bArrCopyOfRange;
        int i3 = i + i2;
        write(i, i3, bArr.length);
        if (read.write != 1) {
            bArrCopyOfRange = new byte[i2];
            System.arraycopy(bArr, i, bArrCopyOfRange, 0, i2);
        } else {
            bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i3);
        }
        return new LiteralByteString(bArrCopyOfRange);
    }

    public static ByteString read(String str) {
        return new LiteralByteString(str.getBytes(isFromOfflineStorage.read));
    }
}
