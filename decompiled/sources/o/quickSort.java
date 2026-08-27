package o;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class quickSort implements findBestHitDistancefn2tFes {
    public static final byte[] serializer = new byte[0];
    public final minLookaheadIntrinsicHeight read;
    public final isPlacedInLookahead write;

    @Override // o.findBestHitDistancefn2tFes
    public final byte[] IconCompatParcelizer(byte[] bArr, byte[] bArr2) {
        setInteropViewFactoryHolderui setinteropviewfactoryholderuiWrite;
        isPlacedInLookahead isplacedinlookahead = this.write;
        AtomicReference atomicReference = removeFirst.write;
        synchronized (removeFirst.class) {
            LayoutModifierNodemaxIntrinsicWidth1 layoutModifierNodemaxIntrinsicWidth1 = ((addLast) removeFirst.write.get()).serializer(isplacedinlookahead.IconCompatParcelizer()).IconCompatParcelizer;
            Class cls = layoutModifierNodemaxIntrinsicWidth1.read;
            if (!layoutModifierNodemaxIntrinsicWidth1.write.keySet().contains(cls) && !Void.class.equals(cls)) {
                throw new IllegalArgumentException("Given internalKeyMananger " + layoutModifierNodemaxIntrinsicWidth1.toString() + " does not support primitive class " + cls.getName());
            }
            if (!((Boolean) removeFirst.read.get(isplacedinlookahead.IconCompatParcelizer())).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + isplacedinlookahead.IconCompatParcelizer());
            }
            setOnAttachui setonattachuiMediaBrowserCompatMediaItem = isplacedinlookahead.MediaBrowserCompatMediaItem();
            try {
                LayoutModifierNodemaxIntrinsicHeight1 layoutModifierNodemaxIntrinsicHeight1IconCompatParcelizer = layoutModifierNodemaxIntrinsicWidth1.IconCompatParcelizer();
                setInteropViewFactoryHolderui setinteropviewfactoryholderui = layoutModifierNodemaxIntrinsicHeight1IconCompatParcelizer.read(setonattachuiMediaBrowserCompatMediaItem);
                layoutModifierNodemaxIntrinsicHeight1IconCompatParcelizer.RemoteActionCompatParcelizer(setinteropviewfactoryholderui);
                setinteropviewfactoryholderuiWrite = layoutModifierNodemaxIntrinsicHeight1IconCompatParcelizer.write(setinteropviewfactoryholderui);
            } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
                throw new GeneralSecurityException("Failures parsing proto of type ".concat(layoutModifierNodemaxIntrinsicWidth1.IconCompatParcelizer().IconCompatParcelizer.getName()), e);
            }
        }
        byte[] bArrParcelableVolumeInfo = setinteropviewfactoryholderuiWrite.ParcelableVolumeInfo();
        byte[] bArrIconCompatParcelizer = this.read.IconCompatParcelizer(bArrParcelableVolumeInfo, serializer);
        byte[] bArrIconCompatParcelizer2 = ((findBestHitDistancefn2tFes) removeFirst.RemoteActionCompatParcelizer(this.write.IconCompatParcelizer(), bArrParcelableVolumeInfo)).IconCompatParcelizer(bArr, bArr2);
        return ByteBuffer.allocate(bArrIconCompatParcelizer.length + 4 + bArrIconCompatParcelizer2.length).putInt(bArrIconCompatParcelizer.length).put(bArrIconCompatParcelizer).put(bArrIconCompatParcelizer2).array();
    }

    @Override // o.findBestHitDistancefn2tFes
    public final byte[] serializer(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i = byteBufferWrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            byteBufferWrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            return ((findBestHitDistancefn2tFes) removeFirst.RemoteActionCompatParcelizer(this.write.IconCompatParcelizer(), this.read.serializer(bArr3, serializer))).serializer(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    public quickSort(isPlacedInLookahead isplacedinlookahead, minLookaheadIntrinsicHeight minlookaheadintrinsicheight) {
        this.write = isplacedinlookahead;
        this.read = minlookaheadintrinsicheight;
    }
}
