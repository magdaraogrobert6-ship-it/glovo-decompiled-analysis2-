package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostAppProvidesChatConfig$Payload$Translation$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.paintRPmYEkk;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class accessnumberOfLinesThatFitMaxHeight {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int serializer;
    public final List supportedLanguages;
    public final String userPreferredLanguage;
    public static final HostMessage$HostAppProvidesChatConfig$Payload$Translation$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostAppProvidesChatConfig$Payload$Translation$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 1;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return paintRPmYEkk.read;
            }
            paintRPmYEkk paintrpmyekk = paintRPmYEkk.read;
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ActionPropertyKey(20)), null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostAppProvidesChatConfig$Payload$Translation$Companion] */
    static {
        int i = serializer + 59;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ accessnumberOfLinesThatFitMaxHeight(List list, int i, String str) {
        Object obj = null;
        if (1 == (i & 1)) {
            this.supportedLanguages = list;
            if ((i & 2) == 0) {
                this.userPreferredLanguage = null;
                int i2 = read + 15;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            this.userPreferredLanguage = str;
            int i3 = RemoteActionCompatParcelizer + 39;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, paintRPmYEkk.read.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 73;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.supportedLanguages.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.supportedLanguages.hashCode();
        String str = this.userPreferredLanguage;
        int iHashCode2 = (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        int i3 = RemoteActionCompatParcelizer + 21;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 20 / 0;
        }
        return iHashCode2;
    }

    public accessnumberOfLinesThatFitMaxHeight(List list, String str) {
        this.supportedLanguages = list;
        this.userPreferredLanguage = str;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Translation(supportedLanguages=" + this.supportedLanguages + ", userPreferredLanguage=" + this.userPreferredLanguage + ")";
        int i2 = read + 61;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof accessnumberOfLinesThatFitMaxHeight) {
            accessnumberOfLinesThatFitMaxHeight accessnumberoflinesthatfitmaxheight = (accessnumberOfLinesThatFitMaxHeight) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.supportedLanguages, accessnumberoflinesthatfitmaxheight.supportedLanguages}, getCieXyz.write())).booleanValue()) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.userPreferredLanguage, accessnumberoflinesthatfitmaxheight.userPreferredLanguage}, getCieXyz.write())).booleanValue();
            }
            int i2 = read + 27;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = read + 45;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return false;
        }
        throw null;
    }
}
