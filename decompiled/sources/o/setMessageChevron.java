package o;

import java.io.IOException;
import java.util.ArrayList;
import okhttp3.internal.http2.Huffman$Node;

/* JADX INFO: loaded from: classes4.dex */
public final class setMessageChevron {
    public int dynamicTableByteCount;
    public int headerCount;
    public final GifDrawableTransformation source;
    public int maxDynamicTableByteCount = androidx.compose.ui.graphics.Fields.TransformOrigin;
    public final ArrayList headerList = new ArrayList();
    public AnimationUtils[] dynamicTable = new AnimationUtils[8];
    public int nextHeaderIndex = 7;

    public final RequestBuilder write() {
        GifDrawableTransformation gifDrawableTransformation = this.source;
        byte bMediaBrowserCompatMediaItem = gifDrawableTransformation.MediaBrowserCompatMediaItem();
        byte[] bArr = InAppMessageHtmlBaseViewCompanion.read;
        int i = 0;
        boolean z = (bMediaBrowserCompatMediaItem & 128) == 128;
        long jWrite = write(bMediaBrowserCompatMediaItem & 255, 127);
        if (!z) {
            return gifDrawableTransformation.RemoteActionCompatParcelizer(jWrite);
        }
        RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
        int[] iArr = r8lambdaMsL33Aykmm3JDcgS56yhAnMD7RA.write;
        gifDrawableTransformation.getClass();
        Huffman$Node huffman$Node = r8lambdaMsL33Aykmm3JDcgS56yhAnMD7RA.IconCompatParcelizer;
        Huffman$Node huffman$Node2 = huffman$Node;
        int i2 = 0;
        for (long j = 0; j < jWrite; j++) {
            byte bMediaBrowserCompatMediaItem2 = gifDrawableTransformation.MediaBrowserCompatMediaItem();
            byte[] bArr2 = InAppMessageHtmlBaseViewCompanion.read;
            i2 = (i2 << 8) | (bMediaBrowserCompatMediaItem2 & 255);
            i += 8;
            while (i >= 8) {
                Huffman$Node[] huffman$NodeArr = (Huffman$Node[]) huffman$Node2.write;
                huffman$NodeArr.getClass();
                huffman$Node2 = huffman$NodeArr[(i2 >>> (i - 8)) & 255];
                huffman$Node2.getClass();
                if (((Huffman$Node[]) huffman$Node2.write) == null) {
                    registryMissingComponentException.read(huffman$Node2.serializer);
                    i -= huffman$Node2.read;
                    huffman$Node2 = huffman$Node;
                } else {
                    i -= 8;
                }
            }
        }
        while (i > 0) {
            Huffman$Node[] huffman$NodeArr2 = (Huffman$Node[]) huffman$Node2.write;
            huffman$NodeArr2.getClass();
            Huffman$Node huffman$Node3 = huffman$NodeArr2[(i2 << (8 - i)) & 255];
            huffman$Node3.getClass();
            int i3 = huffman$Node3.read;
            if (((Huffman$Node[]) huffman$Node3.write) != null || i3 > i) {
                break;
            }
            registryMissingComponentException.read(huffman$Node3.serializer);
            i -= i3;
            huffman$Node2 = huffman$Node;
        }
        return registryMissingComponentException.RemoteActionCompatParcelizer(registryMissingComponentException.size);
    }

    public final RequestBuilder write(int i) throws IOException {
        if (i >= 0) {
            AnimationUtils[] animationUtilsArr = applyWindowInsetslambda0.IconCompatParcelizer;
            if (i <= animationUtilsArr.length - 1) {
                return animationUtilsArr[i].name;
            }
        }
        int length = this.nextHeaderIndex + 1 + (i - applyWindowInsetslambda0.IconCompatParcelizer.length);
        if (length >= 0) {
            AnimationUtils[] animationUtilsArr2 = this.dynamicTable;
            if (length < animationUtilsArr2.length) {
                AnimationUtils animationUtils = animationUtilsArr2[length];
                animationUtils.getClass();
                return animationUtils.name;
            }
        }
        DrawableTransformation.RemoteActionCompatParcelizer(i + 1, "Header index too large ");
        return null;
    }

    public final void write(AnimationUtils animationUtils) {
        this.headerList.add(animationUtils);
        int i = animationUtils.hpackSize;
        int i2 = this.maxDynamicTableByteCount;
        if (i > i2) {
            AnimationUtils[] animationUtilsArr = this.dynamicTable;
            onContentCardClicked.write(0, animationUtilsArr.length, null, animationUtilsArr);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
            return;
        }
        read((this.dynamicTableByteCount + i) - i2);
        int i3 = this.headerCount;
        AnimationUtils[] animationUtilsArr2 = this.dynamicTable;
        if (i3 + 1 > animationUtilsArr2.length) {
            AnimationUtils[] animationUtilsArr3 = new AnimationUtils[animationUtilsArr2.length * 2];
            System.arraycopy(animationUtilsArr2, 0, animationUtilsArr3, animationUtilsArr2.length, animationUtilsArr2.length);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.dynamicTable = animationUtilsArr3;
        }
        int i4 = this.nextHeaderIndex;
        this.nextHeaderIndex = i4 - 1;
        this.dynamicTable[i4] = animationUtils;
        this.headerCount++;
        this.dynamicTableByteCount += i;
    }

    public final int read(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.dynamicTable.length;
            while (true) {
                length--;
                i2 = this.nextHeaderIndex;
                if (length < i2 || i <= 0) {
                    break;
                }
                AnimationUtils animationUtils = this.dynamicTable[length];
                animationUtils.getClass();
                int i4 = animationUtils.hpackSize;
                i -= i4;
                this.dynamicTableByteCount -= i4;
                this.headerCount--;
                i3++;
            }
            AnimationUtils[] animationUtilsArr = this.dynamicTable;
            int i5 = i2 + 1;
            System.arraycopy(animationUtilsArr, i5, animationUtilsArr, i5 + i3, this.headerCount);
            this.nextHeaderIndex += i3;
        }
        return i3;
    }

    public setMessageChevron(isActivityRegisteredInManifest isactivityregisteredinmanifest) {
        this.source = new GifDrawableTransformation(isactivityregisteredinmanifest);
    }

    public final int write(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte bMediaBrowserCompatMediaItem = this.source.MediaBrowserCompatMediaItem();
            byte[] bArr = InAppMessageHtmlBaseViewCompanion.read;
            if ((bMediaBrowserCompatMediaItem & 128) == 0) {
                return i2 + ((bMediaBrowserCompatMediaItem & 255) << i4);
            }
            i2 += (bMediaBrowserCompatMediaItem & 127) << i4;
            i4 += 7;
        }
    }
}
