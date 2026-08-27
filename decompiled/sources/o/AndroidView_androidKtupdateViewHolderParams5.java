package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.MapComponent$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.StateV3$AcceptData$AcceptWithCountdownButton$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.BringIntoViewElement;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "accept_with_countdown")
public final class AndroidView_androidKtupdateViewHolderParams5 extends accessgetCurrentlyFocusedRect {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final StateV3$AcceptData$AcceptWithCountdownButton$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AcceptData$AcceptWithCountdownButton$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 61;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return BringIntoViewElement.RemoteActionCompatParcelizer;
            }
            BringIntoViewElement bringIntoViewElement = BringIntoViewElement.RemoteActionCompatParcelizer;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer;
    public final List acceptDetails;
    public final getOnRequesterReady countDownDetails;
    public final List events;
    public final String style;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AcceptData$AcceptWithCountdownButton$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new MapComponent$$ExternalSyntheticLambda0(22)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new MapComponent$$ExternalSyntheticLambda0(23)), null};
        int i = RemoteActionCompatParcelizer + 51;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ AndroidView_androidKtupdateViewHolderParams5(int i, String str, String str2, List list, List list2, getOnRequesterReady getonrequesterready) {
        Object obj = null;
        if (5 != (i & 5)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 5, BringIntoViewElement.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
        this.title = str;
        if ((i & 2) == 0) {
            this.style = null;
        } else {
            this.style = str2;
        }
        this.acceptDetails = list;
        if ((i & 8) == 0) {
            int i2 = IconCompatParcelizer + 101;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                this.events = instance_delegatelambda0.write;
                obj.hashCode();
                throw null;
            }
            this.events = instance_delegatelambda0.write;
        } else {
            this.events = list2;
            int i3 = 2 % 2;
        }
        if ((i & 16) == 0) {
            this.countDownDetails = null;
            return;
        }
        this.countDownDetails = getonrequesterready;
        int i4 = IconCompatParcelizer + 25;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.title.hashCode();
        String str = this.style;
        int iHashCode3 = 0;
        if (str == null) {
            int i2 = serializer + 51;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iM = c8$$ExternalSyntheticOutline0.m(this.events, c8$$ExternalSyntheticOutline0.m(this.acceptDetails, ((iHashCode2 * 31) + iHashCode) * 31, 31), 31);
        getOnRequesterReady getonrequesterready = this.countDownDetails;
        if (getonrequesterready == null) {
            int i4 = serializer + 13;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            iHashCode3 = getonrequesterready.hashCode();
        }
        return iM + iHashCode3;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 23;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("AcceptWithCountdownButton(title=", this.title, ", style=", this.style, ", acceptDetails=");
        sbM.append(this.acceptDetails);
        sbM.append(", events=");
        sbM.append(this.events);
        sbM.append(", countDownDetails=");
        sbM.append(this.countDownDetails);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = serializer + 9;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidView_androidKtupdateViewHolderParams5)) {
            return false;
        }
        AndroidView_androidKtupdateViewHolderParams5 androidView_androidKtupdateViewHolderParams5 = (AndroidView_androidKtupdateViewHolderParams5) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, androidView_androidKtupdateViewHolderParams5.title}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.style, androidView_androidKtupdateViewHolderParams5.style}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.acceptDetails, androidView_androidKtupdateViewHolderParams5.acceptDetails}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.events, androidView_androidKtupdateViewHolderParams5.events}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.countDownDetails, androidView_androidKtupdateViewHolderParams5.countDownDetails}, getCieXyz.write())).booleanValue())) {
                return true;
            }
            int i2 = serializer + 53;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = serializer + 25;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
