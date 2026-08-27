package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.StateV3$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.StateV3$ExternalComponents$CustomerChat$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.AndroidPopup_androidKtPopup511;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "customer_chat")
@SuppressLint
public final class AndroidPopup_androidKtPopup21invokeinlinedonDispose1 implements AndroidPopup_androidKtPopup31 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int write = 1;
    public final boolean callMaskingEnabled;
    public final String country;
    public final List deliveries;
    public final String environment;
    public final String gccSessionToken;
    public final String globalEntityId;
    public final String userId;
    public static final StateV3$ExternalComponents$CustomerChat$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$ExternalComponents$CustomerChat$Companion
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 41;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            AndroidPopup_androidKtPopup511 androidPopup_androidKtPopup511 = AndroidPopup_androidKtPopup511.RemoteActionCompatParcelizer;
            int i4 = IconCompatParcelizer + 109;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 77 / 0;
            }
            return androidPopup_androidKtPopup511;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new StateV3$$ExternalSyntheticLambda0(21))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$ExternalComponents$CustomerChat$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 123;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0046  */
    public /* synthetic */ AndroidPopup_androidKtPopup21invokeinlinedonDispose1(int i, String str, String str2, String str3, String str4, boolean z, String str5, List list) {
        if (79 != (i & 79)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 79, AndroidPopup_androidKtPopup511.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
        this.gccSessionToken = str;
        this.userId = str2;
        this.country = str3;
        this.globalEntityId = str4;
        if ((i & 16) != 0) {
            this.callMaskingEnabled = z;
            int i2 = read + 63;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 2 / 5;
            }
            if ((i & 32) == 0) {
                int i4 = read;
                int i5 = i4 + 87;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                this.environment = "production";
                int i7 = i4 + 75;
                IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
            } else {
                this.environment = str5;
            }
            this.deliveries = list;
            int i10 = IconCompatParcelizer + 1;
            read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
        }
        this.callMaskingEnabled = false;
        int i12 = 2 % 2;
        if ((i & 32) == 0) {
            int i13 = read;
            int i14 = i13 + 87;
            IconCompatParcelizer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i15 = i14 % 2;
            this.environment = "production";
            int i16 = i13 + 75;
            IconCompatParcelizer = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i17 = i16 % 2;
            int i18 = 2 % 2;
        } else {
            this.environment = str5;
        }
        this.deliveries = list;
        int i19 = IconCompatParcelizer + 1;
        read = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i110 = i19 % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 15;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("CustomerChat(gccSessionToken=", this.gccSessionToken, ", userId=", this.userId, ", country=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.country, ", globalEntityId=", this.globalEntityId, ", callMaskingEnabled=");
        IconCompatParcelizer.RemoteActionCompatParcelizer(", environment=", this.environment, ", deliveries=", sbM, this.callMaskingEnabled);
        String str = MediaSessionCompatQueueItem.read(sbM, this.deliveries, ")");
        int i4 = read + 107;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 41;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.deliveries.hashCode() + af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.gccSessionToken.hashCode() * 31, 31, this.userId), 31, this.country), 31, this.globalEntityId), 31, this.callMaskingEnabled), 31, this.environment);
        int i4 = IconCompatParcelizer + 85;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidPopup_androidKtPopup21invokeinlinedonDispose1)) {
            int i2 = IconCompatParcelizer + 43;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        AndroidPopup_androidKtPopup21invokeinlinedonDispose1 androidPopup_androidKtPopup21invokeinlinedonDispose1 = (AndroidPopup_androidKtPopup21invokeinlinedonDispose1) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.gccSessionToken, androidPopup_androidKtPopup21invokeinlinedonDispose1.gccSessionToken}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.userId, androidPopup_androidKtPopup21invokeinlinedonDispose1.userId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.country, androidPopup_androidKtPopup21invokeinlinedonDispose1.country}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.globalEntityId, androidPopup_androidKtPopup21invokeinlinedonDispose1.globalEntityId}, getCieXyz.write())).booleanValue()) {
            int i4 = IconCompatParcelizer + 75;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (this.callMaskingEnabled != androidPopup_androidKtPopup21invokeinlinedonDispose1.callMaskingEnabled) {
            int i6 = read + 43;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.environment, androidPopup_androidKtPopup21invokeinlinedonDispose1.environment}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deliveries, androidPopup_androidKtPopup21invokeinlinedonDispose1.deliveries}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i8 = read + 69;
        IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            int i9 = 43 / 0;
        }
        return true;
    }
}
