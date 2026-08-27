package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.AcknowledgmentTaskUiItem$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.SearchInfo;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class InfiniteTransitionSearchInfo implements uiMode {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int write = 1;
    public final List checks;
    public final String confirmationText;
    public final String description;
    public final boolean isChecked;
    public final boolean isOptional;
    public final String taskId;
    public final String title;
    public static final AcknowledgmentTaskUiItem$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.AcknowledgmentTaskUiItem$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 83;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            SearchInfo searchInfo = SearchInfo.read;
            int i4 = RemoteActionCompatParcelizer + 1;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return searchInfo;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new AnimatedVisibilityState(13)), null, null, null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.AcknowledgmentTaskUiItem$Companion] */
    static {
        int i = write + 13;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.uiMode
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 63;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.taskId;
        int i5 = i3 + 123;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.uiMode
    public final boolean read() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 81;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        boolean z = this.isOptional;
        int i5 = i2 + 111;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean serializer() {
        boolean z;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 81;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 != 0) {
            z = this.isChecked;
            int i4 = 60 / 0;
        } else {
            z = this.isChecked;
        }
        int i5 = i3 + 79;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return z;
    }

    public /* synthetic */ InfiniteTransitionSearchInfo(int i, String str, String str2, String str3, List list, String str4, boolean z, boolean z2) {
        if (127 == (i & 127)) {
            this.taskId = str;
            this.title = str2;
            this.description = str3;
            this.checks = list;
            this.confirmationText = str4;
            this.isChecked = z;
            this.isOptional = z2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 127, SearchInfo.read.getDescriptor());
        throw null;
    }

    @Override // o.uiMode
    public final boolean write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 3;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        if (this.isOptional || this.isChecked) {
            return true;
        }
        int i5 = i3 + 93;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }

    public InfiniteTransitionSearchInfo(String str, String str2, String str3, List list, String str4, boolean z, boolean z2) {
        d$$ExternalSyntheticOutline0.m(str, str2, str3, str4);
        this.taskId = str;
        this.title = str2;
        this.description = str3;
        this.checks = list;
        this.confirmationText = str4;
        this.isChecked = z;
        this.isOptional = z2;
    }

    public static InfiniteTransitionSearchInfo serializer(InfiniteTransitionSearchInfo infiniteTransitionSearchInfo, boolean z) {
        int i = 2 % 2;
        String str = infiniteTransitionSearchInfo.taskId;
        String str2 = infiniteTransitionSearchInfo.title;
        String str3 = infiniteTransitionSearchInfo.description;
        List list = infiniteTransitionSearchInfo.checks;
        String str4 = infiniteTransitionSearchInfo.confirmationText;
        boolean z2 = infiniteTransitionSearchInfo.isOptional;
        infiniteTransitionSearchInfo.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        str4.getClass();
        InfiniteTransitionSearchInfo infiniteTransitionSearchInfo2 = new InfiniteTransitionSearchInfo(str, str2, str3, list, str4, z, z2);
        int i2 = IconCompatParcelizer + 119;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return infiniteTransitionSearchInfo2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 103;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("AcknowledgmentTaskUiItem(taskId=", this.taskId, ", title=", this.title, ", description=");
        MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sbM, this.description, ", checks=", this.checks, ", confirmationText=");
        SweepGradientShader9KIMszodefault.IconCompatParcelizer(this.confirmationText, ", isChecked=", ", isOptional=", sbM, this.isChecked);
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.isOptional, ")");
        int i4 = IconCompatParcelizer + 67;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 1;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.isOptional) + d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m(this.checks, af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.taskId.hashCode() * 31, 31, this.title), 31, this.description), 31), 31, this.confirmationText), 31, this.isChecked);
        int i4 = read + 113;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof InfiniteTransitionSearchInfo)) {
                return false;
            }
            InfiniteTransitionSearchInfo infiniteTransitionSearchInfo = (InfiniteTransitionSearchInfo) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.taskId, infiniteTransitionSearchInfo.taskId}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, infiniteTransitionSearchInfo.title}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, infiniteTransitionSearchInfo.description}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.checks, infiniteTransitionSearchInfo.checks}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.confirmationText, infiniteTransitionSearchInfo.confirmationText}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (this.isChecked == infiniteTransitionSearchInfo.isChecked) {
                        return this.isOptional == infiniteTransitionSearchInfo.isOptional;
                    }
                    int i2 = IconCompatParcelizer + 33;
                    read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i2 % 2 != 0;
                }
                int i3 = IconCompatParcelizer + 65;
                int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                read = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 121;
                IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return false;
            }
            int i8 = IconCompatParcelizer + 39;
            read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        int i10 = IconCompatParcelizer + 27;
        read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i10 % 2 == 0;
    }
}
