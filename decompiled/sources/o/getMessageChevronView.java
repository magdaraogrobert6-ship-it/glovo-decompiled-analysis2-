package o;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class getMessageChevronView {
    public int dynamicTableByteCount;
    public boolean emitDynamicTableSizeUpdate;
    public int headerCount;
    public final RegistryMissingComponentException out;
    public int smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
    public int maxDynamicTableByteCount = androidx.compose.ui.graphics.Fields.TransformOrigin;
    public AnimationUtils[] dynamicTable = new AnimationUtils[8];
    public int nextHeaderIndex = 7;

    public final void IconCompatParcelizer(AnimationUtils animationUtils) {
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
        RemoteActionCompatParcelizer((this.dynamicTableByteCount + i) - i2);
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

    public final void RemoteActionCompatParcelizer(int i) {
        int i2;
        if (i > 0) {
            int length = this.dynamicTable.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.nextHeaderIndex;
                if (length < i2 || i <= 0) {
                    break;
                }
                AnimationUtils animationUtils = this.dynamicTable[length];
                animationUtils.getClass();
                i -= animationUtils.hpackSize;
                int i4 = this.dynamicTableByteCount;
                AnimationUtils animationUtils2 = this.dynamicTable[length];
                animationUtils2.getClass();
                this.dynamicTableByteCount = i4 - animationUtils2.hpackSize;
                this.headerCount--;
                i3++;
                length--;
            }
            AnimationUtils[] animationUtilsArr = this.dynamicTable;
            int i5 = i2 + 1;
            System.arraycopy(animationUtilsArr, i5, animationUtilsArr, i5 + i3, this.headerCount);
            AnimationUtils[] animationUtilsArr2 = this.dynamicTable;
            int i6 = this.nextHeaderIndex + 1;
            Arrays.fill(animationUtilsArr2, i6, i6 + i3, (Object) null);
            this.nextHeaderIndex += i3;
        }
    }

    public getMessageChevronView(RegistryMissingComponentException registryMissingComponentException) {
        this.out = registryMissingComponentException;
    }

    public final void read(RequestBuilder requestBuilder) throws EOFException {
        requestBuilder.getClass();
        int[] iArr = r8lambdaMsL33Aykmm3JDcgS56yhAnMD7RA.write;
        int iSerializer = requestBuilder.serializer();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < iSerializer; i++) {
            byte bWrite = requestBuilder.write(i);
            byte[] bArr = InAppMessageHtmlBaseViewCompanion.read;
            j2 += (long) r8lambdaMsL33Aykmm3JDcgS56yhAnMD7RA.RemoteActionCompatParcelizer[bWrite & 255];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int iSerializer2 = requestBuilder.serializer();
        RegistryMissingComponentException registryMissingComponentException = this.out;
        if (i2 >= iSerializer2) {
            serializer(requestBuilder.serializer(), 127, 0);
            registryMissingComponentException.serializer(requestBuilder);
            return;
        }
        RegistryMissingComponentException registryMissingComponentException2 = new RegistryMissingComponentException();
        int[] iArr2 = r8lambdaMsL33Aykmm3JDcgS56yhAnMD7RA.write;
        int iSerializer3 = requestBuilder.serializer();
        int i3 = 0;
        for (int i4 = 0; i4 < iSerializer3; i4++) {
            byte bWrite2 = requestBuilder.write(i4);
            byte[] bArr2 = InAppMessageHtmlBaseViewCompanion.read;
            int i5 = bWrite2 & 255;
            int i6 = r8lambdaMsL33Aykmm3JDcgS56yhAnMD7RA.write[i5];
            byte b = r8lambdaMsL33Aykmm3JDcgS56yhAnMD7RA.RemoteActionCompatParcelizer[i5];
            j = (j << b) | ((long) i6);
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                registryMissingComponentException2.read((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            registryMissingComponentException2.read((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        RequestBuilder requestBuilderRemoteActionCompatParcelizer = registryMissingComponentException2.RemoteActionCompatParcelizer(registryMissingComponentException2.size);
        serializer(requestBuilderRemoteActionCompatParcelizer.serializer(), 127, androidx.compose.ui.graphics.Fields.SpotShadowColor);
        registryMissingComponentException.serializer(requestBuilderRemoteActionCompatParcelizer);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:45:0x0189  */
    public final void IconCompatParcelizer(ArrayList arrayList) throws EOFException {
        int length;
        int length2;
        if (this.emitDynamicTableSizeUpdate) {
            int i = this.smallestHeaderTableSizeSetting;
            if (i < this.maxDynamicTableByteCount) {
                serializer(i, 31, 32);
            }
            this.emitDynamicTableSizeUpdate = false;
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            serializer(this.maxDynamicTableByteCount, 31, 32);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnimationUtils animationUtils = (AnimationUtils) arrayList.get(i2);
            RequestBuilder requestBuilderWrite = animationUtils.name.write();
            RequestBuilder requestBuilder = animationUtils.value;
            Integer num = (Integer) applyWindowInsetslambda0.serializer.get(requestBuilderWrite);
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (2 > length2 || length2 >= 8) {
                    length = -1;
                } else {
                    AnimationUtils[] animationUtilsArr = applyWindowInsetslambda0.IconCompatParcelizer;
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{animationUtilsArr[iIntValue].value, requestBuilder}, getCieXyz.write())).booleanValue()) {
                        length = length2;
                    } else {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{animationUtilsArr[length2].value, requestBuilder}, getCieXyz.write())).booleanValue()) {
                            length = iIntValue + 2;
                        } else {
                            length = -1;
                        }
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            if (length == -1) {
                int length3 = this.dynamicTable.length;
                for (int i3 = this.nextHeaderIndex + 1; i3 < length3; i3++) {
                    AnimationUtils animationUtils2 = this.dynamicTable[i3];
                    animationUtils2.getClass();
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{animationUtils2.name, requestBuilderWrite}, getCieXyz.write())).booleanValue()) {
                        AnimationUtils animationUtils3 = this.dynamicTable[i3];
                        animationUtils3.getClass();
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{animationUtils3.value, requestBuilder}, getCieXyz.write())).booleanValue()) {
                            length = applyWindowInsetslambda0.IconCompatParcelizer.length + (i3 - this.nextHeaderIndex);
                            break;
                        } else if (length2 == -1) {
                            length2 = (i3 - this.nextHeaderIndex) + applyWindowInsetslambda0.IconCompatParcelizer.length;
                        }
                    }
                }
            }
            if (length != -1) {
                serializer(length, 127, androidx.compose.ui.graphics.Fields.SpotShadowColor);
            } else if (length2 == -1) {
                this.out.read(64);
                read(requestBuilderWrite);
                read(requestBuilder);
                IconCompatParcelizer(animationUtils);
            } else {
                RequestBuilder requestBuilder2 = AnimationUtils.PSEUDO_PREFIX;
                requestBuilderWrite.getClass();
                requestBuilder2.getClass();
                if (requestBuilderWrite.write(0, requestBuilder2, requestBuilder2.serializer())) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{AnimationUtils.TARGET_AUTHORITY, requestBuilderWrite}, getCieXyz.write())).booleanValue()) {
                        serializer(length2, 63, 64);
                        read(requestBuilder);
                        IconCompatParcelizer(animationUtils);
                    } else {
                        serializer(length2, 15, 0);
                        read(requestBuilder);
                    }
                } else {
                    serializer(length2, 63, 64);
                    read(requestBuilder);
                    IconCompatParcelizer(animationUtils);
                }
            }
        }
    }

    public final void serializer(int i, int i2, int i3) {
        RegistryMissingComponentException registryMissingComponentException = this.out;
        if (i < i2) {
            registryMissingComponentException.read(i | i3);
            return;
        }
        registryMissingComponentException.read(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            registryMissingComponentException.read(128 | (i4 & 127));
            i4 >>>= 7;
        }
        registryMissingComponentException.read(i4);
    }
}
