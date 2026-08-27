package o;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.internal.http2.Huffman$Node;

/* JADX INFO: loaded from: classes4.dex */
public final class setCustomAttributelambda1 {
    public final GifDrawableTransformation MediaMetadataCompat;
    public final ArrayList write = new ArrayList();
    public incrementCustomUserAttributelambda1[] IconCompatParcelizer = new incrementCustomUserAttributelambda1[8];
    public int MediaDescriptionCompat = 7;
    public int read = 0;
    public int RemoteActionCompatParcelizer = 0;
    public int serializer = androidx.compose.ui.graphics.Fields.TransformOrigin;
    public int MediaSessionCompatQueueItem = androidx.compose.ui.graphics.Fields.TransformOrigin;

    public final RequestBuilder IconCompatParcelizer(int i) throws IOException {
        if (i >= 0) {
            incrementCustomUserAttributelambda1[] incrementcustomuserattributelambda1Arr = setCustomLocationAttributelambda1.IconCompatParcelizer;
            if (i <= incrementcustomuserattributelambda1Arr.length - 1) {
                return incrementcustomuserattributelambda1Arr[i].MediaSessionCompatQueueItem;
            }
        }
        int length = this.MediaDescriptionCompat + 1 + (i - setCustomLocationAttributelambda1.IconCompatParcelizer.length);
        if (length >= 0) {
            incrementCustomUserAttributelambda1[] incrementcustomuserattributelambda1Arr2 = this.IconCompatParcelizer;
            if (length < incrementcustomuserattributelambda1Arr2.length) {
                return incrementcustomuserattributelambda1Arr2[length].MediaSessionCompatQueueItem;
            }
        }
        DrawableTransformation.RemoteActionCompatParcelizer(i + 1, "Header index too large ");
        return null;
    }

    public final RequestBuilder RemoteActionCompatParcelizer() throws EOFException {
        GifDrawableTransformation gifDrawableTransformation = this.MediaMetadataCompat;
        byte bMediaBrowserCompatMediaItem = gifDrawableTransformation.MediaBrowserCompatMediaItem();
        int i = 0;
        boolean z = (bMediaBrowserCompatMediaItem & 128) == 128;
        int iSerializer = serializer(bMediaBrowserCompatMediaItem & 255, 127);
        if (!z) {
            return gifDrawableTransformation.RemoteActionCompatParcelizer(iSerializer);
        }
        setCustomUserAttributeArraylambda1 setcustomuserattributearraylambda1 = setCustomUserAttributeArraylambda1.serializer;
        long j = iSerializer;
        gifDrawableTransformation.MediaMetadataCompat(j);
        byte[] bArr = gifDrawableTransformation.bufferField.read(j);
        setcustomuserattributearraylambda1.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Huffman$Node huffman$Node = setcustomuserattributearraylambda1.write;
        Huffman$Node huffman$Node2 = huffman$Node;
        int i2 = 0;
        for (byte b : bArr) {
            i2 = (i2 << 8) | (b & 255);
            i += 8;
            while (i >= 8) {
                huffman$Node2 = ((Huffman$Node[]) huffman$Node2.write)[(i2 >>> (i - 8)) & 255];
                if (((Huffman$Node[]) huffman$Node2.write) == null) {
                    byteArrayOutputStream.write(huffman$Node2.serializer);
                    i -= huffman$Node2.read;
                    huffman$Node2 = huffman$Node;
                } else {
                    i -= 8;
                }
            }
        }
        while (i > 0) {
            Huffman$Node huffman$Node3 = ((Huffman$Node[]) huffman$Node2.write)[(i2 << (8 - i)) & 255];
            Huffman$Node[] huffman$NodeArr = (Huffman$Node[]) huffman$Node3.write;
            int i3 = huffman$Node3.read;
            if (huffman$NodeArr != null || i3 > i) {
                break;
            }
            byteArrayOutputStream.write(huffman$Node3.serializer);
            i -= i3;
            huffman$Node2 = huffman$Node;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        RequestBuilder requestBuilder = RequestBuilder.EMPTY;
        return ImageHeaderParserImageType.IconCompatParcelizer(byteArray);
    }

    public final void serializer(incrementCustomUserAttributelambda1 incrementcustomuserattributelambda1) {
        this.write.add(incrementcustomuserattributelambda1);
        int i = incrementcustomuserattributelambda1.MediaDescriptionCompat;
        int i2 = this.MediaSessionCompatQueueItem;
        if (i > i2) {
            Arrays.fill(this.IconCompatParcelizer, (Object) null);
            this.MediaDescriptionCompat = this.IconCompatParcelizer.length - 1;
            this.read = 0;
            this.RemoteActionCompatParcelizer = 0;
            return;
        }
        RemoteActionCompatParcelizer((this.RemoteActionCompatParcelizer + i) - i2);
        int i3 = this.read;
        incrementCustomUserAttributelambda1[] incrementcustomuserattributelambda1Arr = this.IconCompatParcelizer;
        if (i3 + 1 > incrementcustomuserattributelambda1Arr.length) {
            incrementCustomUserAttributelambda1[] incrementcustomuserattributelambda1Arr2 = new incrementCustomUserAttributelambda1[incrementcustomuserattributelambda1Arr.length * 2];
            System.arraycopy(incrementcustomuserattributelambda1Arr, 0, incrementcustomuserattributelambda1Arr2, incrementcustomuserattributelambda1Arr.length, incrementcustomuserattributelambda1Arr.length);
            this.MediaDescriptionCompat = this.IconCompatParcelizer.length - 1;
            this.IconCompatParcelizer = incrementcustomuserattributelambda1Arr2;
        }
        int i4 = this.MediaDescriptionCompat;
        this.MediaDescriptionCompat = i4 - 1;
        this.IconCompatParcelizer[i4] = incrementcustomuserattributelambda1;
        this.read++;
        this.RemoteActionCompatParcelizer += i;
    }

    public final int RemoteActionCompatParcelizer(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.IconCompatParcelizer.length;
            while (true) {
                length--;
                i2 = this.MediaDescriptionCompat;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.IconCompatParcelizer[length].MediaDescriptionCompat;
                i -= i4;
                this.RemoteActionCompatParcelizer -= i4;
                this.read--;
                i3++;
            }
            incrementCustomUserAttributelambda1[] incrementcustomuserattributelambda1Arr = this.IconCompatParcelizer;
            int i5 = i2 + 1;
            System.arraycopy(incrementcustomuserattributelambda1Arr, i5, incrementcustomuserattributelambda1Arr, i5 + i3, this.read);
            this.MediaDescriptionCompat += i3;
        }
        return i3;
    }

    public setCustomAttributelambda1(setCustomUserAttributeJSONlambda0 setcustomuserattributejsonlambda0) {
        this.MediaMetadataCompat = new GifDrawableTransformation(setcustomuserattributejsonlambda0);
    }

    public final int serializer(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte bMediaBrowserCompatMediaItem = this.MediaMetadataCompat.MediaBrowserCompatMediaItem();
            if ((bMediaBrowserCompatMediaItem & 128) == 0) {
                return i2 + ((bMediaBrowserCompatMediaItem & 255) << i4);
            }
            i2 += (bMediaBrowserCompatMediaItem & 127) << i4;
            i4 += 7;
        }
    }
}
