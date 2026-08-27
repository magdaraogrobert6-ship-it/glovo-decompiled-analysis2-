package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.appmigration.model.Banner$Companion;
import kotlinx.serialization.Serializable;
import o.findSemanticsModifierNodeToGetBounds;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class findOneLayerOfMergingSemanticsNodes {
    public static final Banner$Companion Companion = new Object() { // from class: com.roadrunner.appmigration.model.Banner$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 117;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            findSemanticsModifierNodeToGetBounds findsemanticsmodifiernodetogetbounds = findSemanticsModifierNodeToGetBounds.IconCompatParcelizer;
            int i4 = write + 27;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 69 / 0;
            }
            return findsemanticsmodifiernodetogetbounds;
        }
    };
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public final getChildrenuidefault analytics;
    public final String body;
    public final boolean collapsed;
    public final String ctaButtonText;
    public final String ctaButtonTextAlternative;
    public final String ctaButtonUrl;
    public final String icon;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.appmigration.model.Banner$Companion] */
    static {
        int i = read + 81;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ findOneLayerOfMergingSemanticsNodes(int i, String str, String str2, String str3, String str4, String str5, String str6, boolean z, getChildrenuidefault getchildrenuidefault) {
        if (143 != (i & 143)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 143, findSemanticsModifierNodeToGetBounds.IconCompatParcelizer.getDescriptor());
            throw null;
        }
        this.title = str;
        this.ctaButtonText = str2;
        this.ctaButtonTextAlternative = str3;
        this.ctaButtonUrl = str4;
        if ((i & 16) == 0) {
            this.body = null;
        } else {
            this.body = str5;
        }
        if ((i & 32) == 0) {
            int i2 = write + 95;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            this.icon = null;
        } else {
            this.icon = str6;
        }
        if ((i & 64) != 0) {
            this.collapsed = z;
            int i4 = serializer + 75;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
            }
            this.analytics = getchildrenuidefault;
            int i5 = serializer + 85;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        this.collapsed = true;
        int i7 = write + 47;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        int i9 = 2 % 2;
        this.analytics = getchildrenuidefault;
        int i10 = serializer + 85;
        write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 55;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Banner(title=", this.title, ", ctaButtonText=", this.ctaButtonText, ", ctaButtonTextAlternative=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.ctaButtonTextAlternative, ", ctaButtonUrl=", this.ctaButtonUrl, ", body=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.body, ", icon=", this.icon, ", collapsed=");
        sbM.append(this.collapsed);
        sbM.append(", analytics=");
        sbM.append(this.analytics);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = write + 15;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.ctaButtonText), 31, this.ctaButtonTextAlternative), 31, this.ctaButtonUrl);
        String str = this.body;
        if (str == null) {
            int i2 = write + 93;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i4 = write + 69;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        String str2 = this.icon;
        return this.analytics.hashCode() + d$$ExternalSyntheticOutline0.m((((iM + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.collapsed);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof findOneLayerOfMergingSemanticsNodes) {
                findOneLayerOfMergingSemanticsNodes findonelayerofmergingsemanticsnodes = (findOneLayerOfMergingSemanticsNodes) obj;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, findonelayerofmergingsemanticsnodes.title}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.ctaButtonText, findonelayerofmergingsemanticsnodes.ctaButtonText}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.ctaButtonTextAlternative, findonelayerofmergingsemanticsnodes.ctaButtonTextAlternative}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.ctaButtonUrl, findonelayerofmergingsemanticsnodes.ctaButtonUrl}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.body, findonelayerofmergingsemanticsnodes.body}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.icon, findonelayerofmergingsemanticsnodes.icon}, getCieXyz.write())).booleanValue()) {
                        int i2 = write + 123;
                        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        return i2 % 2 == 0;
                    }
                    if (this.collapsed != findonelayerofmergingsemanticsnodes.collapsed) {
                        return false;
                    }
                    return !(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.analytics, findonelayerofmergingsemanticsnodes.analytics}, getCieXyz.write())).booleanValue() ^ true);
                }
                int i3 = serializer + 91;
                write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i3 % 2 != 0;
            }
            int i4 = write + 29;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = serializer + 83;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }
}
