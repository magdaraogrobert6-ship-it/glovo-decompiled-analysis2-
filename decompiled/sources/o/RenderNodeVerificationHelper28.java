package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.contract.model.Translations$ENABLED$Companion;
import java.util.List;
import kotlinx.serialization.Serializable;
import o.destroyDisplayListData;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class RenderNodeVerificationHelper28 extends getAmbientShadowColor {
    public static final setGraphicModalMaxWidthDp[] $childSerializers;
    public static final Translations$ENABLED$Companion Companion = new Object() { // from class: com.deliveryhero.contract.model.Translations$ENABLED$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return destroyDisplayListData.RemoteActionCompatParcelizer;
        }
    };
    public final String preferredLanguage;
    public final boolean showOriginalWithTranslated;
    public final List supportedTranslations;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.deliveryhero.contract.model.Translations$ENABLED$Companion] */
    static {
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        $childSerializers = new setGraphicModalMaxWidthDp[]{new setWasCloseMessageCalled(beforeinappmessageviewclosed, 0), null, new setWasCloseMessageCalled(beforeinappmessageviewclosed, 0), null, null};
    }

    public final int hashCode() {
        return Boolean.hashCode(this.showOriginalWithTranslated) + af$$ExternalSyntheticOutline0.m(this.supportedTranslations.hashCode() * 31, 31, this.preferredLanguage);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RenderNodeVerificationHelper28)) {
            return false;
        }
        RenderNodeVerificationHelper28 renderNodeVerificationHelper28 = (RenderNodeVerificationHelper28) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.supportedTranslations, renderNodeVerificationHelper28.supportedTranslations}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.preferredLanguage, renderNodeVerificationHelper28.preferredLanguage}, getCieXyz.write())).booleanValue() && this.showOriginalWithTranslated == renderNodeVerificationHelper28.showOriginalWithTranslated;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ENABLED(supportedTranslations=");
        sb.append(this.supportedTranslations);
        sb.append(", preferredLanguage=");
        sb.append(this.preferredLanguage);
        sb.append(", showOriginalWithTranslated=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.showOriginalWithTranslated, ')');
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RenderNodeVerificationHelper28(int i, List list, boolean z, List list2, String str, boolean z2) {
        super(list, z);
        if (15 == (i & 15)) {
            this.supportedTranslations = list2;
            this.preferredLanguage = str;
            if ((i & 16) == 0) {
                this.showOriginalWithTranslated = false;
                return;
            } else {
                this.showOriginalWithTranslated = z2;
                return;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, destroyDisplayListData.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public RenderNodeVerificationHelper28(List list, String str) {
        super(list);
        this.supportedTranslations = list;
        this.preferredLanguage = str;
        this.showOriginalWithTranslated = false;
    }
}
