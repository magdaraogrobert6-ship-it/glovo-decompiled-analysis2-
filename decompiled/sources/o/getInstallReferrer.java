package o;

import com.roadrunner.rider.state.provider.data.model.StatusResponse$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getInstallReferrer {
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final warn legacyState;
    public final SwipeDismissTouchListenerVerticalDismissDirection questInfo;
    public final createProxyInstallReferrerStateListener status;
    public final List workOpportunities;
    public static final StatusResponse$Companion Companion = new StatusResponse$Companion();
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new waExternalSyntheticLambda3(26)), null};

    static {
        int i = write + 107;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ getInstallReferrer(int i, createProxyInstallReferrerStateListener createproxyinstallreferrerstatelistener, warn warnVar, List list, SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection) {
        if (1 == (i & 1)) {
            this.status = createproxyinstallreferrerstatelistener;
            if ((i & 2) == 0) {
                this.legacyState = null;
            } else {
                this.legacyState = warnVar;
            }
            int i2 = 2 % 2;
            if ((i & 4) == 0) {
                int i3 = read + 65;
                serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    this.workOpportunities = null;
                } else {
                    this.workOpportunities = null;
                    throw null;
                }
            } else {
                this.workOpportunities = list;
                int i4 = serializer + 5;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            }
            if ((i & 8) == 0) {
                this.questInfo = null;
                return;
            } else {
                this.questInfo = swipeDismissTouchListenerVerticalDismissDirection;
                return;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, getReferrerClickTimestampSeconds.write.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = serializer + 31;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode3 = this.status.hashCode();
        warn warnVar = this.legacyState;
        if (warnVar == null) {
            int i4 = serializer + 21;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = warnVar.courier.hashCode();
        }
        List list = this.workOpportunities;
        if (list == null) {
            int i6 = read + 77;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = list.hashCode();
        }
        SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection = this.questInfo;
        return (((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2) * 31) + (swipeDismissTouchListenerVerticalDismissDirection != null ? swipeDismissTouchListenerVerticalDismissDirection.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "StatusResponse(status=" + this.status + ", legacyState=" + this.legacyState + ", workOpportunities=" + this.workOpportunities + ", questInfo=" + this.questInfo + ")";
        int i2 = read + 11;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 105;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this != obj) {
            if (!(obj instanceof getInstallReferrer)) {
                int i5 = i2 + 125;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
            getInstallReferrer getinstallreferrer = (getInstallReferrer) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.status, getinstallreferrer.status}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.legacyState, getinstallreferrer.legacyState}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.workOpportunities, getinstallreferrer.workOpportunities}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.questInfo, getinstallreferrer.questInfo}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i7 = read + 31;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = i2 + 1;
        serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i9 % 2 != 0;
    }
}
