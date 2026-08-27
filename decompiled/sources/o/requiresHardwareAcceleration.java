package o;

import java.io.FileInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class requiresHardwareAcceleration implements performRequestFocus {
    public final LayerSnapshotV28 RemoteActionCompatParcelizer;
    public final com.deliveryhero.customerchat.commons.encryption.CryptoManagerImpl read;

    @Override // o.performRequestFocus
    public final Object write() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.performRequestFocus
    public final Object RemoteActionCompatParcelizer(FileInputStream fileInputStream) {
        try {
            byte[] bArrIconCompatParcelizer = this.read.IconCompatParcelizer(fileInputStream);
            isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = LayerSnapshotV28.Companion.serializer();
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
            return (LayerSnapshotV28) isverticalswipeinalloweddirection.serializer(setCarryoverInAppMessage.RemoteActionCompatParcelizer(bArrIconCompatParcelizer), setgraphicmodalmaxwidthdpSerializer);
        } catch (Exception unused) {
            return this.RemoteActionCompatParcelizer;
        }
    }

    @Override // o.performRequestFocus
    public final Object writeTo(Object obj, RegistryNoModelLoaderAvailableException registryNoModelLoaderAvailableException, Focusability focusability) {
        LayerSnapshotV28 layerSnapshotV28 = (LayerSnapshotV28) obj;
        try {
            com.deliveryhero.customerchat.commons.encryption.CryptoManagerImpl cryptoManagerImpl = this.read;
            isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = LayerSnapshotV28.Companion.serializer();
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
            cryptoManagerImpl.IconCompatParcelizer(setCarryoverInAppMessage.RatingCompat(isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(setgraphicmodalmaxwidthdpSerializer, layerSnapshotV28)), registryNoModelLoaderAvailableException);
        } catch (Exception unused) {
        }
        return createFromParcel.INSTANCE;
    }

    public requiresHardwareAcceleration(com.deliveryhero.customerchat.commons.encryption.CryptoManagerImpl cryptoManagerImpl, LayerSnapshotV28 layerSnapshotV28) {
        this.read = cryptoManagerImpl;
        this.RemoteActionCompatParcelizer = layerSnapshotV28;
    }
}
