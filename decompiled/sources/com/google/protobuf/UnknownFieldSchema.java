package com.google.protobuf;

import o.GraphicsLayerOwnerLayer;
import o.consumeRestored;

/* JADX INFO: loaded from: classes2.dex */
public abstract class UnknownFieldSchema {
    public abstract GraphicsLayerOwnerLayer IconCompatParcelizer(Object obj);

    public abstract void RemoteActionCompatParcelizer(Object obj, Object obj2);

    public final boolean write(Object obj, consumeRestored consumerestored, int i) throws InvalidProtocolBufferException {
        CodedInputStreamReader codedInputStreamReader = (CodedInputStreamReader) consumerestored;
        int i2 = codedInputStreamReader.IconCompatParcelizer;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            codedInputStreamReader.IconCompatParcelizer(0);
            ((GraphicsLayerOwnerLayer) obj).serializer(i3 << 3, Long.valueOf(codedInputStreamReader.serializer.PlaybackStateCompatCustomAction()));
            return true;
        }
        if (i4 == 1) {
            codedInputStreamReader.IconCompatParcelizer(1);
            ((GraphicsLayerOwnerLayer) obj).serializer((i3 << 3) | 1, Long.valueOf(codedInputStreamReader.serializer.MediaDescriptionCompat()));
            return true;
        }
        if (i4 == 2) {
            ((GraphicsLayerOwnerLayer) obj).serializer((i3 << 3) | 2, codedInputStreamReader.write());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw InvalidProtocolBufferException.serializer();
            }
            codedInputStreamReader.IconCompatParcelizer(5);
            ((GraphicsLayerOwnerLayer) obj).serializer(5 | (i3 << 3), Integer.valueOf(codedInputStreamReader.serializer.RatingCompat()));
            return true;
        }
        GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = new GraphicsLayerOwnerLayer();
        int i5 = i3 << 3;
        int i6 = i + 1;
        if (i6 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (codedInputStreamReader.serializer() != Integer.MAX_VALUE && write(graphicsLayerOwnerLayer, codedInputStreamReader, i6)) {
        }
        if ((i5 | 4) != codedInputStreamReader.IconCompatParcelizer) {
            throw InvalidProtocolBufferException.write();
        }
        if (graphicsLayerOwnerLayer.write) {
            graphicsLayerOwnerLayer.write = false;
        }
        ((GraphicsLayerOwnerLayer) obj).serializer(i5 | 3, graphicsLayerOwnerLayer);
        return true;
    }
}
