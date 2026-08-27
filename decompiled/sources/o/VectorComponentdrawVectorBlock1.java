package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.selfServiceChat.data.bridge.HostMessage$HostAppProvidesChatConfig$Payload$Companion;
import java.util.List;
import kotlinx.serialization.Serializable;
import o.VectorComposeKt;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class VectorComponentdrawVectorBlock1 {
    public final VectorComposable delivery;
    public final String phoneCallingType;
    public final List quickReplies;
    public final Path9cdaXJ4 translation;
    public static final HostMessage$HostAppProvidesChatConfig$Payload$Companion Companion = new Object() { // from class: com.deliveryhero.selfServiceChat.data.bridge.HostMessage$HostAppProvidesChatConfig$Payload$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return VectorComposeKt.write;
        }
    };
    public static final setGraphicModalMaxWidthDp[] $childSerializers = {null, null, new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0), null};

    public final int hashCode() {
        return this.translation.hashCode() + c8$$ExternalSyntheticOutline0.m(this.quickReplies, af$$ExternalSyntheticOutline0.m(this.delivery.hashCode() * 31, 31, this.phoneCallingType), 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VectorComponentdrawVectorBlock1)) {
            return false;
        }
        VectorComponentdrawVectorBlock1 vectorComponentdrawVectorBlock1 = (VectorComponentdrawVectorBlock1) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.delivery, vectorComponentdrawVectorBlock1.delivery}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.phoneCallingType, vectorComponentdrawVectorBlock1.phoneCallingType}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.quickReplies, vectorComponentdrawVectorBlock1.quickReplies}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.translation, vectorComponentdrawVectorBlock1.translation}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "Payload(delivery=" + this.delivery + ", phoneCallingType=" + this.phoneCallingType + ", quickReplies=" + this.quickReplies + ", translation=" + this.translation + ')';
    }

    public /* synthetic */ VectorComponentdrawVectorBlock1(int i, VectorComposable vectorComposable, String str, List list, Path9cdaXJ4 path9cdaXJ4) {
        if (15 == (i & 15)) {
            this.delivery = vectorComposable;
            this.phoneCallingType = str;
            this.quickReplies = list;
            this.translation = path9cdaXJ4;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, VectorComposeKt.write.getDescriptor());
        throw null;
    }

    public VectorComponentdrawVectorBlock1(VectorComposable vectorComposable, String str, List list, Path9cdaXJ4 path9cdaXJ4) {
        this.delivery = vectorComposable;
        this.phoneCallingType = str;
        this.quickReplies = list;
        this.translation = path9cdaXJ4;
    }
}
