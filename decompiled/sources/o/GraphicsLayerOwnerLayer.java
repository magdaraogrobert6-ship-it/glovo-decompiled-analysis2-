package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.google.protobuf.CodedInputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class GraphicsLayerOwnerLayer {
    public static final GraphicsLayerOwnerLayer serializer = new GraphicsLayerOwnerLayer(0, new int[0], new Object[0], false);
    public Object[] IconCompatParcelizer;
    public int[] RatingCompat;
    public int RemoteActionCompatParcelizer;
    public int read;
    public boolean write;

    public static GraphicsLayerOwnerLayer serializer(GraphicsLayerOwnerLayer graphicsLayerOwnerLayer, GraphicsLayerOwnerLayer graphicsLayerOwnerLayer2) {
        int i = graphicsLayerOwnerLayer.RemoteActionCompatParcelizer + graphicsLayerOwnerLayer2.RemoteActionCompatParcelizer;
        int[] iArrCopyOf = Arrays.copyOf(graphicsLayerOwnerLayer.RatingCompat, i);
        System.arraycopy(graphicsLayerOwnerLayer2.RatingCompat, 0, iArrCopyOf, graphicsLayerOwnerLayer.RemoteActionCompatParcelizer, graphicsLayerOwnerLayer2.RemoteActionCompatParcelizer);
        Object[] objArrCopyOf = Arrays.copyOf(graphicsLayerOwnerLayer.IconCompatParcelizer, i);
        System.arraycopy(graphicsLayerOwnerLayer2.IconCompatParcelizer, 0, objArrCopyOf, graphicsLayerOwnerLayer.RemoteActionCompatParcelizer, graphicsLayerOwnerLayer2.RemoteActionCompatParcelizer);
        return new GraphicsLayerOwnerLayer(i, iArrCopyOf, objArrCopyOf, true);
    }

    public final void IconCompatParcelizer(int i) {
        int[] iArr = this.RatingCompat;
        if (i > iArr.length) {
            int i2 = this.RemoteActionCompatParcelizer;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.RatingCompat = Arrays.copyOf(iArr, i);
            this.IconCompatParcelizer = Arrays.copyOf(this.IconCompatParcelizer, i);
        }
    }

    public final void serializer(int i, Object obj) {
        serializer();
        IconCompatParcelizer(this.RemoteActionCompatParcelizer + 1);
        int[] iArr = this.RatingCompat;
        int i2 = this.RemoteActionCompatParcelizer;
        iArr[i2] = i;
        this.IconCompatParcelizer[i2] = obj;
        this.RemoteActionCompatParcelizer = i2 + 1;
    }

    public GraphicsLayerOwnerLayer(int i, int[] iArr, Object[] objArr, boolean z) {
        this.read = -1;
        this.RemoteActionCompatParcelizer = i;
        this.RatingCompat = iArr;
        this.IconCompatParcelizer = objArr;
        this.write = z;
    }

    public final void serializer() {
        if (this.write) {
            return;
        }
        getAlignmentLinesMap.write();
    }

    public final void serializer(DefaultHapticFeedback defaultHapticFeedback) {
        if (this.RemoteActionCompatParcelizer == 0) {
            return;
        }
        defaultHapticFeedback.getClass();
        onLongPress onlongpress = onLongPress.ASCENDING;
        for (int i = 0; i < this.RemoteActionCompatParcelizer; i++) {
            int i2 = this.RatingCompat[i];
            Object obj = this.IconCompatParcelizer[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                defaultHapticFeedback.IconCompatParcelizer(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                defaultHapticFeedback.serializer(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                defaultHapticFeedback.IconCompatParcelizer(i3, (getClipMetadata) obj);
            } else if (i4 == 3) {
                ComposeView composeView = (ComposeView) defaultHapticFeedback.write;
                onLongPress onlongpress2 = onLongPress.ASCENDING;
                composeView.RemoteActionCompatParcelizer(i3, 3);
                ((GraphicsLayerOwnerLayer) obj).serializer(defaultHapticFeedback);
                composeView.RemoteActionCompatParcelizer(i3, 4);
            } else {
                if (i4 != 5) {
                    DrawableTransformation.read((Throwable) com.google.protobuf.InvalidProtocolBufferException.serializer());
                    return;
                }
                defaultHapticFeedback.read(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final int hashCode() {
        int i = this.RemoteActionCompatParcelizer;
        int[] iArr = this.RatingCompat;
        int iHashCode = 17;
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        Object[] objArr = this.IconCompatParcelizer;
        int i4 = this.RemoteActionCompatParcelizer;
        for (int i5 = 0; i5 < i4; i5++) {
            iHashCode = (iHashCode * 31) + objArr[i5].hashCode();
        }
        return ((((i + 527) * 31) + i2) * 31) + iHashCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GraphicsLayerOwnerLayer)) {
            return false;
        }
        GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = (GraphicsLayerOwnerLayer) obj;
        int i = this.RemoteActionCompatParcelizer;
        if (i == graphicsLayerOwnerLayer.RemoteActionCompatParcelizer) {
            int[] iArr = this.RatingCompat;
            int[] iArr2 = graphicsLayerOwnerLayer.RatingCompat;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.IconCompatParcelizer;
            Object[] objArr2 = graphicsLayerOwnerLayer.IconCompatParcelizer;
            int i3 = this.RemoteActionCompatParcelizer;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int write() {
        int iSerializer;
        int iSerializer2;
        int iSerializer3;
        int i = this.read;
        if (i != -1) {
            return i;
        }
        int iM$1 = 0;
        for (int i2 = 0; i2 < this.RemoteActionCompatParcelizer; i2++) {
            int i3 = this.RatingCompat[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        getClipMetadata getclipmetadata = (getClipMetadata) this.IconCompatParcelizer[i2];
                        int iSerializer4 = ComposeView.serializer(i4);
                        int iRatingCompat = getclipmetadata.RatingCompat();
                        iM$1 = af$$ExternalSyntheticOutline0.m$1(iRatingCompat, iRatingCompat, iSerializer4, iM$1);
                    } else if (i5 == 3) {
                        iSerializer = ComposeView.serializer(i4) * 2;
                        iSerializer2 = ((GraphicsLayerOwnerLayer) this.IconCompatParcelizer[i2]).write();
                    } else {
                        if (i5 != 5) {
                            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(com.google.protobuf.InvalidProtocolBufferException.serializer());
                            return 0;
                        }
                        ((Integer) this.IconCompatParcelizer[i2]).getClass();
                        iSerializer3 = ComposeView.serializer(i4) + 4;
                    }
                } else {
                    ((Long) this.IconCompatParcelizer[i2]).getClass();
                    iSerializer3 = ComposeView.serializer(i4) + 8;
                }
                iM$1 = iSerializer3 + iM$1;
            } else {
                long jLongValue = ((Long) this.IconCompatParcelizer[i2]).longValue();
                iSerializer = ComposeView.serializer(i4);
                iSerializer2 = ComposeView.serializer(jLongValue);
            }
            iM$1 = iSerializer2 + iSerializer + iM$1;
        }
        this.read = iM$1;
        return iM$1;
    }

    public GraphicsLayerOwnerLayer() {
        this(0, new int[8], new Object[8], true);
    }

    public final boolean read(int i, CodedInputStream codedInputStream) throws com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException {
        int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        serializer();
        int i2 = i & 7;
        if (i2 == 0) {
            serializer(i, Long.valueOf(codedInputStream.PlaybackStateCompatCustomAction()));
            return true;
        }
        if (i2 == 1) {
            serializer(i, Long.valueOf(codedInputStream.MediaDescriptionCompat()));
            return true;
        }
        if (i2 == 2) {
            serializer(i, codedInputStream.MediaBrowserCompatMediaItem());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw com.google.protobuf.InvalidProtocolBufferException.serializer();
            }
            serializer(i, Integer.valueOf(codedInputStream.RatingCompat()));
            return true;
        }
        GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = new GraphicsLayerOwnerLayer();
        do {
            iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = codedInputStream.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == 0) {
                break;
            }
        } while (graphicsLayerOwnerLayer.read(iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg, codedInputStream));
        codedInputStream.RemoteActionCompatParcelizer(4 | ((i >>> 3) << 3));
        serializer(i, graphicsLayerOwnerLayer);
        return true;
    }
}
