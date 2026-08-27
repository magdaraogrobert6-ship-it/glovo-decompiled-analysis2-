package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.recentdeliveries.data.model.RecentDeliveriesResponse$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.queueGetThirdPartySharingSettingsWithTimeout;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class processSessionI {
    private static int IconCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final List deliveries;
    public final pauseSendingI earnings;
    public final processCoppaComplianceI helpdesk;
    public final readInstallReferrerVivo vendorReviewConfig;
    public static final RecentDeliveriesResponse$Companion Companion = new Object() { // from class: com.roadrunner.recentdeliveries.data.model.RecentDeliveriesResponse$Companion
        private static int IconCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            queueGetThirdPartySharingSettingsWithTimeout queuegetthirdpartysharingsettingswithtimeout;
            int i = 2 % 2;
            int i2 = read + 49;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                queuegetthirdpartysharingsettingswithtimeout = queueGetThirdPartySharingSettingsWithTimeout.read;
                int i3 = 61 / 0;
            } else {
                queuegetthirdpartysharingsettingswithtimeout = queueGetThirdPartySharingSettingsWithTimeout.read;
            }
            int i4 = read + 61;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return queuegetthirdpartysharingsettingswithtimeout;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new wa(23)), null, null, null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.recentdeliveries.data.model.RecentDeliveriesResponse$Companion] */
    static {
        int i = write + 121;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ processSessionI(int i, List list, pauseSendingI pausesendingi, processCoppaComplianceI processcoppacompliancei, readInstallReferrerVivo readinstallreferrervivo) {
        Object obj = null;
        if (9 == (i & 9)) {
            this.deliveries = list;
            if ((i & 2) == 0) {
                this.earnings = null;
            } else {
                this.earnings = pausesendingi;
            }
            if ((i & 4) != 0) {
                this.helpdesk = processcoppacompliancei;
                int i2 = IconCompatParcelizer + 57;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } else {
                int i5 = IconCompatParcelizer + 45;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    this.helpdesk = null;
                } else {
                    this.helpdesk = null;
                    obj.hashCode();
                    throw null;
                }
            }
            this.vendorReviewConfig = readinstallreferrervivo;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 9, queueGetThirdPartySharingSettingsWithTimeout.read.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 17;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.deliveries.hashCode();
        pauseSendingI pausesendingi = this.earnings;
        int iHashCode2 = 0;
        int iHashCode3 = pausesendingi == null ? 0 : pausesendingi.hashCode();
        processCoppaComplianceI processcoppacompliancei = this.helpdesk;
        if (processcoppacompliancei == null) {
            int i4 = IconCompatParcelizer + 55;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            iHashCode2 = processcoppacompliancei.hashCode();
        }
        return this.vendorReviewConfig.hashCode() + (((((iHashCode * 31) + iHashCode3) * 31) + iHashCode2) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "RecentDeliveriesResponse(deliveries=" + this.deliveries + ", earnings=" + this.earnings + ", helpdesk=" + this.helpdesk + ", vendorReviewConfig=" + this.vendorReviewConfig + ")";
        int i2 = serializer + 67;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof processSessionI) {
            processSessionI processsessioni = (processSessionI) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deliveries, processsessioni.deliveries}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.earnings, processsessioni.earnings}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.helpdesk, processsessioni.helpdesk}, getCieXyz.write())).booleanValue()) {
                    if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.vendorReviewConfig, processsessioni.vendorReviewConfig}, getCieXyz.write())).booleanValue())) {
                        return true;
                    }
                } else {
                    int i2 = IconCompatParcelizer + 79;
                    int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    serializer = i3;
                    int i4 = i2 % 2;
                    int i5 = i3 + 69;
                    IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        return false;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }
        }
        return false;
    }
}
