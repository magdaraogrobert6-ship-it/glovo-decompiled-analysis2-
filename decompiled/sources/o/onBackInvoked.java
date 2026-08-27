package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.model.Acknowledgement$Companion;
import kotlinx.serialization.Serializable;
import o.getLambda1131826196ui;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class onBackInvoked {
    public static final Acknowledgement$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.model.Acknowledgement$Companion
        private static int IconCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 65;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getLambda1131826196ui getlambda1131826196ui = getLambda1131826196ui.serializer;
            int i4 = write + 9;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return getlambda1131826196ui;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final String confirmationNumber;
    public final long deliveryId;
    public final String trigger;
    public final String url;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.model.Acknowledgement$Companion] */
    static {
        int i = read + 63;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 11;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.trigger;
        int i5 = i2 + 99;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 23;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.url;
        int i5 = i2 + 21;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 81;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        long j = this.deliveryId;
        int i5 = i3 + 9;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return j;
    }

    public final String write() {
        String str;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 121;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            str = this.confirmationNumber;
            int i4 = 49 / 0;
        } else {
            str = this.confirmationNumber;
        }
        int i5 = i2 + 45;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 82 / 0;
        }
        return str;
    }

    public /* synthetic */ onBackInvoked(int i, String str, long j, String str2, String str3) {
        if (15 == (i & 15)) {
            this.url = str;
            this.deliveryId = j;
            this.confirmationNumber = str2;
            this.trigger = str3;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, getLambda1131826196ui.serializer.getDescriptor());
        throw null;
    }

    public static final /* synthetic */ void RemoteActionCompatParcelizer(onBackInvoked onbackinvoked, DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        int i = 2 % 2;
        int i2 = serializer + 23;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, onbackinvoked.url);
        defaultInAppMessageSlideupViewFactory.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, onbackinvoked.deliveryId);
        defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, onbackinvoked.confirmationNumber);
        defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, onbackinvoked.trigger);
        int i4 = serializer + 45;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 75;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.trigger.hashCode() + af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(this.url.hashCode() * 31, 31, this.deliveryId), 31, this.confirmationNumber);
        int i4 = IconCompatParcelizer + 71;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 73;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("Acknowledgement(url=", this.url, this.deliveryId, ", deliveryId=");
        c8$$ExternalSyntheticOutline0.m(sbM, ", confirmationNumber=", this.confirmationNumber, ", trigger=", this.trigger);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = serializer + 61;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onBackInvoked)) {
            return false;
        }
        onBackInvoked onbackinvoked = (onBackInvoked) obj;
        Object[] objArr = {this.url, onbackinvoked.url};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i2 = IconCompatParcelizer + 85;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        if (this.deliveryId != onbackinvoked.deliveryId) {
            return false;
        }
        Object[] objArr2 = {this.confirmationNumber, onbackinvoked.confirmationNumber};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            int i4 = IconCompatParcelizer + 117;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        Object[] objArr3 = {this.trigger, onbackinvoked.trigger};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i6 = IconCompatParcelizer + 111;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
