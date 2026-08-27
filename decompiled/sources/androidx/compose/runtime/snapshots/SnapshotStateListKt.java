package androidx.compose.runtime.snapshots;

import o.BlockInnerShadowNode;
import o.accessgetThisDragAndDropTargetp;
import o.accesssetThisDragAndDropTargetp;
import o.getBrush;
import o.getCieXyz;
import o.getOffsetF1C5BW0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public abstract class SnapshotStateListKt {
    public static final Object write = new Object();

    public static final BlockInnerShadowNode IconCompatParcelizer(SnapshotStateList snapshotStateList) {
        BlockInnerShadowNode blockInnerShadowNode = snapshotStateList.write;
        blockInnerShadowNode.getClass();
        return (BlockInnerShadowNode) getOffsetF1C5BW0.IconCompatParcelizer(blockInnerShadowNode, snapshotStateList);
    }

    public static final boolean IconCompatParcelizer(SnapshotStateList snapshotStateList, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int i;
        accesssetThisDragAndDropTargetp accesssetthisdraganddroptargetp;
        Object objInvoke;
        getBrush getbrushWrite;
        boolean zSerializer;
        do {
            synchronized (write) {
                BlockInnerShadowNode blockInnerShadowNode = snapshotStateList.write;
                blockInnerShadowNode.getClass();
                BlockInnerShadowNode blockInnerShadowNode2 = (BlockInnerShadowNode) getOffsetF1C5BW0.IconCompatParcelizer(blockInnerShadowNode);
                i = blockInnerShadowNode2.RemoteActionCompatParcelizer;
                accesssetthisdraganddroptargetp = blockInnerShadowNode2.read;
            }
            accesssetthisdraganddroptargetp.getClass();
            accessgetThisDragAndDropTargetp accessgetthisdraganddroptargetpSerializer = accesssetthisdraganddroptargetp.serializer();
            objInvoke = r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(accessgetthisdraganddroptargetpSerializer);
            accesssetThisDragAndDropTargetp accesssetthisdraganddroptargetpWrite = accessgetthisdraganddroptargetpSerializer.write();
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{accesssetthisdraganddroptargetpWrite, accesssetthisdraganddroptargetp}, iWrite3)).booleanValue()) {
                break;
            }
            BlockInnerShadowNode blockInnerShadowNode3 = snapshotStateList.write;
            blockInnerShadowNode3.getClass();
            synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
                getbrushWrite = getOffsetF1C5BW0.write();
                zSerializer = serializer((BlockInnerShadowNode) getOffsetF1C5BW0.RemoteActionCompatParcelizer(blockInnerShadowNode3, snapshotStateList, getbrushWrite), i, accesssetthisdraganddroptargetpWrite, true);
            }
            getOffsetF1C5BW0.write(getbrushWrite, snapshotStateList);
        } while (!zSerializer);
        return ((Boolean) objInvoke).booleanValue();
    }

    public static final int serializer(SnapshotStateList snapshotStateList) {
        BlockInnerShadowNode blockInnerShadowNode = snapshotStateList.write;
        blockInnerShadowNode.getClass();
        return ((BlockInnerShadowNode) getOffsetF1C5BW0.IconCompatParcelizer(blockInnerShadowNode)).write;
    }

    public static final boolean serializer(BlockInnerShadowNode blockInnerShadowNode, int i, accesssetThisDragAndDropTargetp accesssetthisdraganddroptargetp, boolean z) {
        boolean z2;
        synchronized (write) {
            int i2 = blockInnerShadowNode.RemoteActionCompatParcelizer;
            if (i2 == i) {
                blockInnerShadowNode.read = accesssetthisdraganddroptargetp;
                z2 = true;
                if (z) {
                    blockInnerShadowNode.write++;
                }
                blockInnerShadowNode.RemoteActionCompatParcelizer = i2 + 1;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    public static final void write(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
    }
}
