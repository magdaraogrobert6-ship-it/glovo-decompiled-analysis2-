package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostAppProvidesChatConfig$Payload$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.painthn5TExg;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class paintLG529CI {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int write;
    public final AndroidParagraph_androidKt delivery;
    public final String phoneCallingType;
    public final List quickReplies;
    public final accessnumberOfLinesThatFitMaxHeight translation;
    public static final HostMessage$HostAppProvidesChatConfig$Payload$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostAppProvidesChatConfig$Payload$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 103;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 == 0) {
                painthn5TExg painthn5texg = painthn5TExg.write;
                obj.hashCode();
                throw null;
            }
            painthn5TExg painthn5texg2 = painthn5TExg.write;
            int i3 = read + 19;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return painthn5texg2;
            }
            obj.hashCode();
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ActionPropertyKey(19)), null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostAppProvidesChatConfig$Payload$Companion] */
    static {
        int i = IconCompatParcelizer + 99;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ paintLG529CI(int i, AndroidParagraph_androidKt androidParagraph_androidKt, String str, List list, accessnumberOfLinesThatFitMaxHeight accessnumberoflinesthatfitmaxheight) {
        if (15 == (i & 15)) {
            this.delivery = androidParagraph_androidKt;
            this.phoneCallingType = str;
            this.quickReplies = list;
            this.translation = accessnumberoflinesthatfitmaxheight;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, painthn5TExg.write.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 11;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.translation.hashCode() + c8$$ExternalSyntheticOutline0.m(this.quickReplies, af$$ExternalSyntheticOutline0.m(this.delivery.hashCode() * 31, 31, this.phoneCallingType), 31);
        int i4 = write + 3;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 65 / 0;
        }
        return iHashCode;
    }

    public paintLG529CI(AndroidParagraph_androidKt androidParagraph_androidKt, String str, List list, accessnumberOfLinesThatFitMaxHeight accessnumberoflinesthatfitmaxheight) {
        this.delivery = androidParagraph_androidKt;
        this.phoneCallingType = str;
        this.quickReplies = list;
        this.translation = accessnumberoflinesthatfitmaxheight;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Payload(delivery=" + this.delivery + ", phoneCallingType=" + this.phoneCallingType + ", quickReplies=" + this.quickReplies + ", translation=" + this.translation + ")";
        int i2 = read + 117;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 80 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 41;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof paintLG529CI) {
            paintLG529CI paintlg529ci = (paintLG529CI) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.delivery, paintlg529ci.delivery}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.phoneCallingType, paintlg529ci.phoneCallingType}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.quickReplies, paintlg529ci.quickReplies}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.translation, paintlg529ci.translation}, getCieXyz.write())).booleanValue();
        }
        int i5 = i3 + 75;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i5 % 2 == 0;
    }
}
