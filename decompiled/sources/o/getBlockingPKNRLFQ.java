package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.common.data.model.tasks.SoftPosPayment$Companion;
import kotlinx.serialization.Serializable;
import o.getAsyncPKNRLFQ;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getBlockingPKNRLFQ {
    public static final SoftPosPayment$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.SoftPosPayment$Companion
        private static int read = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 103;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getAsyncPKNRLFQ getasyncpknrlfq = getAsyncPKNRLFQ.serializer;
            int i4 = serializer + 29;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return getasyncpknrlfq;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final String collectActionTitle;
    public final String description;
    public final FontLoadingStrategyCompanion error;
    public final String processingLoadingMessage;
    public final String redirectLoadingMessage;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.SoftPosPayment$Companion] */
    static {
        int i = read + 93;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 17 / 0;
        }
    }

    public final String IconCompatParcelizer() {
        String str;
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 71;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            str = this.description;
            int i4 = 19 / 0;
        } else {
            str = this.description;
        }
        int i5 = i2 + 49;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 125;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.processingLoadingMessage;
        }
        int i3 = 79 / 0;
        return this.processingLoadingMessage;
    }

    public final FontLoadingStrategyCompanion read() {
        FontLoadingStrategyCompanion fontLoadingStrategyCompanion;
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 53;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            fontLoadingStrategyCompanion = this.error;
            int i4 = 27 / 0;
        } else {
            fontLoadingStrategyCompanion = this.error;
        }
        int i5 = i2 + 5;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return fontLoadingStrategyCompanion;
        }
        throw null;
    }

    public final String serializer() {
        String str;
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 69;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            str = this.title;
            int i4 = 70 / 0;
        } else {
            str = this.title;
        }
        int i5 = i2 + 37;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = serializer + 79;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.collectActionTitle;
        }
        throw null;
    }

    public /* synthetic */ getBlockingPKNRLFQ(int i, String str, String str2, String str3, String str4, String str5, FontLoadingStrategyCompanion fontLoadingStrategyCompanion) {
        if (63 == (i & 63)) {
            this.title = str;
            this.collectActionTitle = str2;
            this.redirectLoadingMessage = str3;
            this.description = str4;
            this.processingLoadingMessage = str5;
            this.error = fontLoadingStrategyCompanion;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 63, getAsyncPKNRLFQ.serializer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 113;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.error.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.collectActionTitle), 31, this.redirectLoadingMessage), 31, this.description), 31, this.processingLoadingMessage);
        int i4 = serializer + 67;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 113;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("SoftPosPayment(title=", this.title, ", collectActionTitle=", this.collectActionTitle, ", redirectLoadingMessage=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.redirectLoadingMessage, ", description=", this.description, ", processingLoadingMessage=");
        sbM.append(this.processingLoadingMessage);
        sbM.append(", error=");
        sbM.append(this.error);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = write + 61;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getBlockingPKNRLFQ)) {
            int i2 = write + 17;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        getBlockingPKNRLFQ getblockingpknrlfq = (getBlockingPKNRLFQ) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, getblockingpknrlfq.title}, getCieXyz.write())).booleanValue()) {
            int i3 = serializer + 61;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 59 / 0;
            }
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.collectActionTitle, getblockingpknrlfq.collectActionTitle}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.redirectLoadingMessage, getblockingpknrlfq.redirectLoadingMessage}, getCieXyz.write())).booleanValue()) {
            int i5 = write + 29;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, getblockingpknrlfq.description}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.processingLoadingMessage, getblockingpknrlfq.processingLoadingMessage}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.error, getblockingpknrlfq.error}, getCieXyz.write())).booleanValue();
    }
}
