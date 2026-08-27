package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostNotifiesAboutVisibilityChange$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class flatMapAnnotations extends getPlaceholderRects {
    public static final HostMessage$HostNotifiesAboutVisibilityChange$Companion Companion = new HostMessage$HostNotifiesAboutVisibilityChange$Companion();
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final String id;
    public final String messageType;
    public final getAnnotationsui_text payload;

    static {
        int i = RemoteActionCompatParcelizer + 57;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.getPlaceholderRects
    public final String serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 67;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.messageType;
        int i5 = i2 + 109;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    public /* synthetic */ flatMapAnnotations(int i, String str, String str2, getAnnotationsui_text getannotationsui_text) {
        if (5 == (i & 5)) {
            this.id = str;
            if ((i & 2) == 0) {
                this.messageType = "HOST_NOTIFIES_ABOUT_WEBVIEW_VISIBILITY_CHANGE";
                int i2 = IconCompatParcelizer + 47;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
            } else {
                this.messageType = str2;
                int i4 = IconCompatParcelizer + 123;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
            }
            this.payload = getannotationsui_text;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 5, charAt.serializer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 47;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.payload.isWebViewVisible) + af$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.messageType);
        int i4 = IconCompatParcelizer + 117;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 73;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("HostNotifiesAboutVisibilityChange(id=", this.id, ", messageType=", this.messageType, ", payload=");
        sbM.append(this.payload);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = write + 19;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public flatMapAnnotations(String str, boolean z) {
        getAnnotationsui_text getannotationsui_text = new getAnnotationsui_text(z);
        this.id = str;
        this.messageType = "HOST_NOTIFIES_ABOUT_WEBVIEW_VISIBILITY_CHANGE";
        this.payload = getannotationsui_text;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 3;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 37;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof flatMapAnnotations)) {
            return false;
        }
        flatMapAnnotations flatmapannotations = (flatMapAnnotations) obj;
        Object[] objArr = {this.id, flatmapannotations.id};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr2 = {this.messageType, flatmapannotations.messageType};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr3 = {this.payload, flatmapannotations.payload};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i5 = write + 119;
        int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 39;
        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
