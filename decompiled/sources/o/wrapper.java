package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.SignatureTaskUiItem$Companion;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.LoremIpsum;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class wrapper implements uiMode {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public final String actionTitle;
    public final String actionTitleDelete;
    public final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk compression;
    public final String description;
    public final boolean isOptional;
    public final String requiredText;
    public final Wallpapers state;
    public final String taskId;
    public final String title;
    public final String uploadPath;
    public static final SignatureTaskUiItem$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.SignatureTaskUiItem$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 47;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            LoremIpsum loremIpsum = LoremIpsum.read;
            int i4 = RemoteActionCompatParcelizer + 125;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return loremIpsum;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new fontScale(17)), null, null, null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.SignatureTaskUiItem$Companion] */
    static {
        int i = read + 19;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.uiMode
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 59;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.taskId;
        int i5 = i2 + 1;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 11 / 0;
        }
        return str;
    }

    public final Wallpapers RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 93;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.state;
        }
        throw null;
    }

    @Override // o.uiMode
    public final boolean read() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 45;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        boolean z = this.isOptional;
        int i5 = i3 + 121;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ wrapper(int i, String str, String str2, String str3, String str4, String str5, String str6, Wallpapers wallpapers, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, String str7, boolean z) {
        if (1023 == (i & 1023)) {
            this.title = str;
            this.description = str2;
            this.actionTitle = str3;
            this.actionTitleDelete = str4;
            this.uploadPath = str5;
            this.requiredText = str6;
            this.state = wallpapers;
            this.compression = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
            this.taskId = str7;
            this.isOptional = z;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1023, LoremIpsum.read.getDescriptor());
        throw null;
    }

    @Override // o.uiMode
    public final boolean write() {
        int i = 2 % 2;
        Object obj = null;
        if (!this.isOptional) {
            int i2 = serializer + 43;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                boolean z = this.state instanceof generateLoremIpsum;
                obj.hashCode();
                throw null;
            }
            if (!(this.state instanceof generateLoremIpsum)) {
                return false;
            }
        }
        int i3 = RemoteActionCompatParcelizer + 73;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public wrapper(String str, String str2, String str3, String str4, String str5, String str6, Wallpapers wallpapers, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, String str7, boolean z) {
        m1$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        wallpapers.getClass();
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        str7.getClass();
        this.title = str;
        this.description = str2;
        this.actionTitle = str3;
        this.actionTitleDelete = str4;
        this.uploadPath = str5;
        this.requiredText = str6;
        this.state = wallpapers;
        this.compression = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        this.taskId = str7;
        this.isOptional = z;
    }

    public static wrapper IconCompatParcelizer(wrapper wrapperVar, Wallpapers wallpapers) {
        int i = 2 % 2;
        String str = wrapperVar.title;
        String str2 = wrapperVar.description;
        String str3 = wrapperVar.actionTitle;
        String str4 = wrapperVar.actionTitleDelete;
        String str5 = wrapperVar.uploadPath;
        String str6 = wrapperVar.requiredText;
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = wrapperVar.compression;
        String str7 = wrapperVar.taskId;
        boolean z = wrapperVar.isOptional;
        wrapperVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        wallpapers.getClass();
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        str7.getClass();
        wrapper wrapperVar2 = new wrapper(str, str2, str3, str4, str5, str6, wallpapers, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, str7, z);
        int i2 = RemoteActionCompatParcelizer + 51;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return wrapperVar2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 125;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.description), 31, this.actionTitle), 31, this.actionTitleDelete), 31, this.uploadPath);
        String str = this.requiredText;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = Boolean.hashCode(this.isOptional) + af$$ExternalSyntheticOutline0.m((this.compression.hashCode() + ((this.state.hashCode() + ((iM + iHashCode) * 31)) * 31)) * 31, 31, this.taskId);
        int i4 = serializer + 47;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode2;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 107;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("SignatureTaskUiItem(title=", this.title, ", description=", this.description, ", actionTitle=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.actionTitle, ", actionTitleDelete=", this.actionTitleDelete, ", uploadPath=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.uploadPath, ", requiredText=", this.requiredText, ", state=");
        sbM.append(this.state);
        sbM.append(", compression=");
        sbM.append(this.compression);
        sbM.append(", taskId=");
        sbM.append(this.taskId);
        sbM.append(", isOptional=");
        sbM.append(this.isOptional);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = RemoteActionCompatParcelizer + 33;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 69 / 0;
        }
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrapper)) {
            return false;
        }
        wrapper wrapperVar = (wrapper) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, wrapperVar.title}, getCieXyz.write())).booleanValue()) {
            int i2 = RemoteActionCompatParcelizer + 31;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, wrapperVar.description}, getCieXyz.write())).booleanValue()) {
            int i4 = RemoteActionCompatParcelizer + 45;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 == 0;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.actionTitle, wrapperVar.actionTitle}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.actionTitleDelete, wrapperVar.actionTitleDelete}, getCieXyz.write())).booleanValue()) {
                int i5 = serializer + 3;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.uploadPath, wrapperVar.uploadPath}, getCieXyz.write())).booleanValue()) {
                int i7 = RemoteActionCompatParcelizer + 91;
                serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return false;
            }
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.requiredText, wrapperVar.requiredText}, getCieXyz.write())).booleanValue())) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.state, wrapperVar.state}, getCieXyz.write())).booleanValue()) {
                    int i9 = serializer + 87;
                    RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.compression, wrapperVar.compression}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.taskId, wrapperVar.taskId}, getCieXyz.write())).booleanValue()) {
                    return this.isOptional == wrapperVar.isOptional;
                }
                int i11 = RemoteActionCompatParcelizer + 85;
                serializer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i11 % 2 != 0) {
                    return false;
                }
                throw null;
            }
        }
        return false;
    }
}
