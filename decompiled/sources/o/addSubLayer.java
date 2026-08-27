package o;

import com.data.error.ApiErrorV3$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class addSubLayer extends Throwable {
    public final int httpErrorCode;
    public final List messages;
    public static final ApiErrorV3$Companion Companion = new ApiErrorV3$Companion();
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new onAddedToParentLayer(11))};

    public addSubLayer(List list, int i) {
        super(i + ": " + onContentCardDismissed.IconCompatParcelizer(list, null, null, null, null, 63));
        this.messages = list;
        this.httpErrorCode = i;
    }

    public static addSubLayer write(addSubLayer addsublayer, int i) {
        List list = addsublayer.messages;
        addsublayer.getClass();
        list.getClass();
        return new addSubLayer(list, i);
    }

    public final int hashCode() {
        return Integer.hashCode(this.httpErrorCode) + (this.messages.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof addSubLayer)) {
            return false;
        }
        addSubLayer addsublayer = (addSubLayer) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.messages, addsublayer.messages}, getCieXyz.write())).booleanValue() && this.httpErrorCode == addsublayer.httpErrorCode;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "ApiErrorV3(messages=" + this.messages + ", httpErrorCode=" + this.httpErrorCode + ")";
    }

    public /* synthetic */ addSubLayer(int i, List list) {
        if (1 != (i & 1)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, onRemovedFromParentLayer.read.getDescriptor());
            throw null;
        }
        this.messages = list;
        this.httpErrorCode = 0;
    }
}
