package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class DisposableSaveableStateRegistry extends getClipMetadata {
    public static final int[] read = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    public final int MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public final int MediaSessionCompatQueueItem;
    public final getClipMetadata RatingCompat;
    public final getClipMetadata write;

    @Override // o.getClipMetadata
    public final int RatingCompat() {
        return this.MediaDescriptionCompat;
    }

    @Override // o.getClipMetadata
    public final int RemoteActionCompatParcelizer() {
        return this.MediaMetadataCompat;
    }

    @Override // o.getClipMetadata
    public final boolean IconCompatParcelizer() {
        return this.MediaDescriptionCompat >= IconCompatParcelizer(this.MediaMetadataCompat);
    }

    @Override // o.getClipMetadata
    public final CodedInputStream MediaSessionCompatQueueItem() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.MediaMetadataCompat);
        arrayDeque.push(this);
        getClipMetadata getclipmetadata = this.write;
        while (getclipmetadata instanceof DisposableSaveableStateRegistry) {
            DisposableSaveableStateRegistry disposableSaveableStateRegistry = (DisposableSaveableStateRegistry) getclipmetadata;
            arrayDeque.push(disposableSaveableStateRegistry);
            getclipmetadata = disposableSaveableStateRegistry.write;
        }
        ClipboardExtensions_androidKt clipboardExtensions_androidKt = (ClipboardExtensions_androidKt) getclipmetadata;
        while (clipboardExtensions_androidKt != null) {
            ClipboardExtensions_androidKt clipboardExtensions_androidKt2 = null;
            if (clipboardExtensions_androidKt == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.read();
                return null;
            }
            while (!arrayDeque.isEmpty()) {
                getClipMetadata getclipmetadata2 = ((DisposableSaveableStateRegistry) arrayDeque.pop()).RatingCompat;
                while (getclipmetadata2 instanceof DisposableSaveableStateRegistry) {
                    DisposableSaveableStateRegistry disposableSaveableStateRegistry2 = (DisposableSaveableStateRegistry) getclipmetadata2;
                    arrayDeque.push(disposableSaveableStateRegistry2);
                    getclipmetadata2 = disposableSaveableStateRegistry2.write;
                }
                ClipboardExtensions_androidKt clipboardExtensions_androidKt3 = (ClipboardExtensions_androidKt) getclipmetadata2;
                if (!clipboardExtensions_androidKt3.serializer()) {
                    clipboardExtensions_androidKt2 = clipboardExtensions_androidKt3;
                    break;
                }
            }
            arrayList.add(clipboardExtensions_androidKt.write());
            clipboardExtensions_androidKt = clipboardExtensions_androidKt2;
        }
        int i = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            iRemaining += byteBuffer.remaining();
            i = byteBuffer.hasArray() ? i | 1 : byteBuffer.isDirect() ? i | 2 : i | 4;
        }
        if (i == 2) {
            return new getShouldCreateCompositionOnAttachedToWindowannotations(iRemaining, arrayList);
        }
        decodeTextDecoration decodetextdecoration = new decodeTextDecoration();
        decodetextdecoration.RatingCompat = arrayList.iterator();
        decodetextdecoration.MediaDescriptionCompat = 0;
        for (ByteBuffer byteBuffer2 : arrayList) {
            decodetextdecoration.MediaDescriptionCompat++;
        }
        decodetextdecoration.MediaMetadataCompat = -1;
        if (!decodetextdecoration.write()) {
            decodetextdecoration.IconCompatParcelizer = CompositionLocalsKtLocalWindowInfo1.write;
            decodetextdecoration.MediaMetadataCompat = 0;
            decodetextdecoration.serializer = 0;
            decodetextdecoration.write = 0L;
        }
        return CodedInputStream.IconCompatParcelizer(decodetextdecoration);
    }

    @Override // o.getClipMetadata
    public final byte RemoteActionCompatParcelizer(int i) {
        getClipMetadata.RemoteActionCompatParcelizer(i, this.MediaDescriptionCompat);
        return serializer(i);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new copyqCc9W8c(this);
    }

    @Override // o.getClipMetadata
    public final int read(int i, int i2, int i3) {
        getClipMetadata getclipmetadata = this.write;
        int i4 = this.MediaSessionCompatQueueItem;
        if (i2 + i3 <= i4) {
            return getclipmetadata.read(i, i2, i3);
        }
        getClipMetadata getclipmetadata2 = this.RatingCompat;
        if (i2 >= i4) {
            return getclipmetadata2.read(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return getclipmetadata2.read(getclipmetadata.read(i, i2, i5), 0, i3 - i5);
    }

    @Override // o.getClipMetadata
    public final String read(Charset charset) {
        return new String(MediaDescriptionCompat(), charset);
    }

    @Override // o.getClipMetadata
    public final void read(ComposeView composeView) {
        this.write.read(composeView);
        this.RatingCompat.read(composeView);
    }

    @Override // o.getClipMetadata
    public final boolean read() {
        int i = this.write.read(0, 0, this.MediaSessionCompatQueueItem);
        getClipMetadata getclipmetadata = this.RatingCompat;
        return getclipmetadata.read(i, 0, getclipmetadata.RatingCompat()) == 0;
    }

    @Override // o.getClipMetadata
    public final void serializer(byte[] bArr, int i, int i2, int i3) {
        getClipMetadata getclipmetadata = this.write;
        int i4 = this.MediaSessionCompatQueueItem;
        if (i + i3 <= i4) {
            getclipmetadata.serializer(bArr, i, i2, i3);
            return;
        }
        getClipMetadata getclipmetadata2 = this.RatingCompat;
        if (i >= i4) {
            getclipmetadata2.serializer(bArr, i - i4, i2, i3);
            return;
        }
        int i5 = i4 - i;
        getclipmetadata.serializer(bArr, i, i2, i5);
        getclipmetadata2.serializer(bArr, 0, i2 + i5, i3 - i5);
    }

    @Override // o.getClipMetadata
    public final int write(int i, int i2, int i3) {
        getClipMetadata getclipmetadata = this.write;
        int i4 = this.MediaSessionCompatQueueItem;
        if (i2 + i3 <= i4) {
            return getclipmetadata.write(i, i2, i3);
        }
        getClipMetadata getclipmetadata2 = this.RatingCompat;
        if (i2 >= i4) {
            return getclipmetadata2.write(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return getclipmetadata2.write(getclipmetadata.write(i, i2, i5), 0, i3 - i5);
    }

    @Override // o.getClipMetadata
    public final getClipMetadata write(int i, int i2) {
        int i3 = this.MediaDescriptionCompat;
        int iSerializer = getClipMetadata.serializer(i, i2, i3);
        if (iSerializer == 0) {
            return getClipMetadata.serializer;
        }
        if (iSerializer == i3) {
            return this;
        }
        getClipMetadata getclipmetadata = this.write;
        int i4 = this.MediaSessionCompatQueueItem;
        if (i2 <= i4) {
            return getclipmetadata.write(i, i2);
        }
        getClipMetadata getclipmetadata2 = this.RatingCompat;
        return i >= i4 ? getclipmetadata2.write(i - i4, i2 - i4) : new DisposableSaveableStateRegistry(getclipmetadata.write(i, getclipmetadata.RatingCompat()), getclipmetadata2.write(0, i2 - i4));
    }

    public DisposableSaveableStateRegistry(getClipMetadata getclipmetadata, getClipMetadata getclipmetadata2) {
        this.write = getclipmetadata;
        this.RatingCompat = getclipmetadata2;
        int iRatingCompat = getclipmetadata.RatingCompat();
        this.MediaSessionCompatQueueItem = iRatingCompat;
        this.MediaDescriptionCompat = getclipmetadata2.RatingCompat() + iRatingCompat;
        this.MediaMetadataCompat = Math.max(getclipmetadata.RemoteActionCompatParcelizer(), getclipmetadata2.RemoteActionCompatParcelizer()) + 1;
    }

    @Override // o.getClipMetadata
    public final boolean equals(Object obj) {
        boolean zWrite;
        if (obj == this) {
            return true;
        }
        if (obj instanceof getClipMetadata) {
            getClipMetadata getclipmetadata = (getClipMetadata) obj;
            int iRatingCompat = getclipmetadata.RatingCompat();
            int i = this.MediaDescriptionCompat;
            if (i == iRatingCompat) {
                if (i == 0) {
                    return true;
                }
                int i2 = this.RemoteActionCompatParcelizer;
                int i3 = getclipmetadata.RemoteActionCompatParcelizer;
                if (i2 == 0 || i3 == 0 || i2 == i3) {
                    getHeadsetHookEK5gGoQ getheadsethookek5ggoq = new getHeadsetHookEK5gGoQ(this);
                    ClipboardExtensions_androidKt clipboardExtensions_androidKtWrite = getheadsethookek5ggoq.write();
                    getHeadsetHookEK5gGoQ getheadsethookek5ggoq2 = new getHeadsetHookEK5gGoQ(getclipmetadata);
                    ClipboardExtensions_androidKt clipboardExtensions_androidKtWrite2 = getheadsethookek5ggoq2.write();
                    int i4 = 0;
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        int iRatingCompat2 = clipboardExtensions_androidKtWrite.RatingCompat() - i4;
                        int iRatingCompat3 = clipboardExtensions_androidKtWrite2.RatingCompat() - i5;
                        int iMin = Math.min(iRatingCompat2, iRatingCompat3);
                        if (i4 == 0) {
                            zWrite = clipboardExtensions_androidKtWrite.write(clipboardExtensions_androidKtWrite2, i5, iMin);
                        } else {
                            zWrite = clipboardExtensions_androidKtWrite2.write(clipboardExtensions_androidKtWrite, i4, iMin);
                        }
                        if (!zWrite) {
                            break;
                        }
                        i6 += iMin;
                        if (i6 >= i) {
                            if (i6 == i) {
                                return true;
                            }
                            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
                            return false;
                        }
                        if (iMin == iRatingCompat2) {
                            clipboardExtensions_androidKtWrite = getheadsethookek5ggoq.write();
                            i4 = 0;
                        } else {
                            i4 += iMin;
                        }
                        if (iMin == iRatingCompat3) {
                            clipboardExtensions_androidKtWrite2 = getheadsethookek5ggoq2.write();
                            i5 = 0;
                        } else {
                            i5 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // o.getClipMetadata
    public final byte serializer(int i) {
        int i2 = this.MediaSessionCompatQueueItem;
        return i < i2 ? this.write.serializer(i) : this.RatingCompat.serializer(i - i2);
    }

    @Override // o.getClipMetadata
    public final ByteBuffer write() {
        return ByteBuffer.wrap(MediaDescriptionCompat()).asReadOnlyBuffer();
    }

    public static getClipMetadata read(getClipMetadata getclipmetadata, getClipMetadata getclipmetadata2) {
        if (getclipmetadata2.RatingCompat() == 0) {
            return getclipmetadata;
        }
        if (getclipmetadata.RatingCompat() == 0) {
            return getclipmetadata2;
        }
        int iRatingCompat = getclipmetadata2.RatingCompat() + getclipmetadata.RatingCompat();
        if (iRatingCompat < 128) {
            int iRatingCompat2 = getclipmetadata.RatingCompat();
            int iRatingCompat3 = getclipmetadata2.RatingCompat();
            int i = iRatingCompat2 + iRatingCompat3;
            byte[] bArr = new byte[i];
            getClipMetadata.serializer(0, iRatingCompat2, getclipmetadata.RatingCompat());
            getClipMetadata.serializer(0, iRatingCompat2, i);
            if (iRatingCompat2 > 0) {
                getclipmetadata.serializer(bArr, 0, 0, iRatingCompat2);
            }
            getClipMetadata.serializer(0, iRatingCompat3, getclipmetadata2.RatingCompat());
            getClipMetadata.serializer(iRatingCompat2, i, i);
            if (iRatingCompat3 > 0) {
                getclipmetadata2.serializer(bArr, 0, iRatingCompat2, iRatingCompat3);
            }
            return new ClipboardExtensions_androidKt(bArr);
        }
        if (getclipmetadata instanceof DisposableSaveableStateRegistry) {
            DisposableSaveableStateRegistry disposableSaveableStateRegistry = (DisposableSaveableStateRegistry) getclipmetadata;
            getClipMetadata getclipmetadata3 = disposableSaveableStateRegistry.write;
            getClipMetadata getclipmetadata4 = disposableSaveableStateRegistry.RatingCompat;
            if (getclipmetadata2.RatingCompat() + getclipmetadata4.RatingCompat() < 128) {
                int iRatingCompat4 = getclipmetadata4.RatingCompat();
                int iRatingCompat5 = getclipmetadata2.RatingCompat();
                int i2 = iRatingCompat4 + iRatingCompat5;
                byte[] bArr2 = new byte[i2];
                getClipMetadata.serializer(0, iRatingCompat4, getclipmetadata4.RatingCompat());
                getClipMetadata.serializer(0, iRatingCompat4, i2);
                if (iRatingCompat4 > 0) {
                    getclipmetadata4.serializer(bArr2, 0, 0, iRatingCompat4);
                }
                getClipMetadata.serializer(0, iRatingCompat5, getclipmetadata2.RatingCompat());
                getClipMetadata.serializer(iRatingCompat4, i2, i2);
                if (iRatingCompat5 > 0) {
                    getclipmetadata2.serializer(bArr2, 0, iRatingCompat4, iRatingCompat5);
                }
                return new DisposableSaveableStateRegistry(getclipmetadata3, new ClipboardExtensions_androidKt(bArr2));
            }
            if (getclipmetadata3.RemoteActionCompatParcelizer() > getclipmetadata4.RemoteActionCompatParcelizer() && disposableSaveableStateRegistry.MediaMetadataCompat > getclipmetadata2.RemoteActionCompatParcelizer()) {
                return new DisposableSaveableStateRegistry(getclipmetadata3, new DisposableSaveableStateRegistry(getclipmetadata4, getclipmetadata2));
            }
        }
        if (iRatingCompat >= IconCompatParcelizer(Math.max(getclipmetadata.RemoteActionCompatParcelizer(), getclipmetadata2.RemoteActionCompatParcelizer()) + 1)) {
            return new DisposableSaveableStateRegistry(getclipmetadata, getclipmetadata2);
        }
        component27NrFUSI component27nrfusi = new component27NrFUSI(0);
        component27nrfusi.RemoteActionCompatParcelizer(getclipmetadata);
        component27nrfusi.RemoteActionCompatParcelizer(getclipmetadata2);
        ArrayDeque arrayDeque = component27nrfusi.RemoteActionCompatParcelizer;
        getClipMetadata disposableSaveableStateRegistry2 = (getClipMetadata) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            disposableSaveableStateRegistry2 = new DisposableSaveableStateRegistry((getClipMetadata) arrayDeque.pop(), disposableSaveableStateRegistry2);
        }
        return disposableSaveableStateRegistry2;
    }

    public static int IconCompatParcelizer(int i) {
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return read[i];
    }
}
