package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.common.data.model.tasks.OverlayComponent$OverlayInstruction$Companion;
import com.roadrunner.delivery.state.pudo.TagIconTokenV1;
import kotlinx.serialization.Serializable;
import o.getGlobalAsyncTypefaceCache;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "overlay_instruction")
public final class getGlobalTypefaceRequestCache implements FontFamilyResolverKt {
    public static final OverlayComponent$OverlayInstruction$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.OverlayComponent$OverlayInstruction$Companion
        private static int IconCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 119;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getGlobalAsyncTypefaceCache getglobalasynctypefacecache = getGlobalAsyncTypefaceCache.IconCompatParcelizer;
            int i4 = serializer + 111;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return getglobalasynctypefacecache;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public final emptyCacheFontFamilyResolver config;
    public final TagIconTokenV1 icon;
    public final String text;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.OverlayComponent$OverlayInstruction$Companion] */
    static {
        int i = write + 13;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 113;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.text;
        int i5 = i3 + 35;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final emptyCacheFontFamilyResolver RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 97;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        emptyCacheFontFamilyResolver emptycachefontfamilyresolver = this.config;
        int i4 = i3 + 25;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return emptycachefontfamilyresolver;
    }

    public final TagIconTokenV1 write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 9;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        TagIconTokenV1 tagIconTokenV1 = this.icon;
        int i5 = i3 + 89;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return tagIconTokenV1;
        }
        throw null;
    }

    public /* synthetic */ getGlobalTypefaceRequestCache(int i, TagIconTokenV1 tagIconTokenV1, String str, emptyCacheFontFamilyResolver emptycachefontfamilyresolver) {
        Object obj = null;
        if (2 != (i & 2)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 2, getGlobalAsyncTypefaceCache.IconCompatParcelizer.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.icon = null;
        } else {
            this.icon = tagIconTokenV1;
        }
        int i2 = 2 % 2;
        this.text = str;
        if ((i & 4) != 0) {
            this.config = emptycachefontfamilyresolver;
            return;
        }
        int i3 = read;
        int i4 = i3 + 99;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            this.config = null;
            throw null;
        }
        this.config = null;
        int i5 = i3 + 117;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 35;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        TagIconTokenV1 tagIconTokenV1 = this.icon;
        int iM = af$$ExternalSyntheticOutline0.m((tagIconTokenV1 == null ? 0 : tagIconTokenV1.hashCode()) * 31, 31, this.text);
        emptyCacheFontFamilyResolver emptycachefontfamilyresolver = this.config;
        int iHashCode = iM + (emptycachefontfamilyresolver != null ? emptycachefontfamilyresolver.hashCode() : 0);
        int i4 = IconCompatParcelizer + 1;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof getGlobalTypefaceRequestCache) {
            getGlobalTypefaceRequestCache getglobaltypefacerequestcache = (getGlobalTypefaceRequestCache) obj;
            if (this.icon != getglobaltypefacerequestcache.icon) {
                return false;
            }
            Object[] objArr = {this.text, getglobaltypefacerequestcache.text};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                Object[] objArr2 = {this.config, getglobaltypefacerequestcache.config};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i2 = IconCompatParcelizer + 125;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = IconCompatParcelizer + 87;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = read + 73;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "OverlayInstruction(icon=" + this.icon + ", text=" + this.text + ", config=" + this.config + ")";
        int i2 = IconCompatParcelizer + 25;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
