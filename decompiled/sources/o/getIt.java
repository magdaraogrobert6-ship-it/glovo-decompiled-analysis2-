package o;

import java.io.FileInputStream;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class getIt implements performRequestFocus {
    public final com.deliveryhero.customerchat.commons.encryption.CryptoManagerImpl RemoteActionCompatParcelizer;
    public final accessgetChildrenp serializer;

    @Override // o.performRequestFocus
    public final Object write() {
        return this.serializer;
    }

    @Override // o.performRequestFocus
    public final Object RemoteActionCompatParcelizer(FileInputStream fileInputStream) {
        try {
            byte[] bArrIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(fileInputStream);
            isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = accessgetChildrenp.Companion.serializer();
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
            return (accessgetChildrenp) isverticalswipeinalloweddirection.serializer(setCarryoverInAppMessage.RemoteActionCompatParcelizer(bArrIconCompatParcelizer), setgraphicmodalmaxwidthdpSerializer);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return this.serializer;
        }
    }

    @Override // o.performRequestFocus
    public final Object writeTo(Object obj, RegistryNoModelLoaderAvailableException registryNoModelLoaderAvailableException, Focusability focusability) {
        accessgetChildrenp accessgetchildrenp = (accessgetChildrenp) obj;
        try {
            com.deliveryhero.customerchat.commons.encryption.CryptoManagerImpl cryptoManagerImpl = this.RemoteActionCompatParcelizer;
            isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = accessgetChildrenp.Companion.serializer();
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
            cryptoManagerImpl.IconCompatParcelizer(setCarryoverInAppMessage.RatingCompat(isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(setgraphicmodalmaxwidthdpSerializer, accessgetchildrenp)), registryNoModelLoaderAvailableException);
        } catch (com.deliveryhero.customerchat.commons.ChatCryptoException unused) {
        }
        return createFromParcel.INSTANCE;
    }

    public getIt(com.deliveryhero.customerchat.commons.encryption.CryptoManagerImpl cryptoManagerImpl) {
        accessgetChildrenp accessgetchildrenp = new accessgetChildrenp("", "", "", "", "", "", 0L, "");
        this.RemoteActionCompatParcelizer = cryptoManagerImpl;
        this.serializer = accessgetchildrenp;
    }
}
