package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.common.data.model.tasks.QrCodePaymentTask$QrPaymentScreen$Companion;
import com.roadrunner.delivery.common.data.model.tasks.Reason$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.pudo.TagIconTokenV1;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.getFontMatcher;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class FontListFontFamilyTypefaceAdapterpreload321 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    private static int write;
    public final TagIconTokenV1 brandIcon;
    public final getDismissOnBackPress closeButton;
    public final String successMessage;
    public final String title;
    public final List trackingEvents;
    public static final QrCodePaymentTask$QrPaymentScreen$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.QrCodePaymentTask$QrPaymentScreen$Companion
        private static int IconCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 85;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return getFontMatcher.serializer;
            }
            getFontMatcher getfontmatcher = getFontMatcher.serializer;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new Reason$$ExternalSyntheticLambda0(7)), null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.QrCodePaymentTask$QrPaymentScreen$Companion] */
    static {
        int i = write + 41;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 91;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.successMessage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getDismissOnBackPress RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 117;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.closeButton;
        }
        throw null;
    }

    public final List read() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 55;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.trackingEvents;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TagIconTokenV1 serializer() {
        int i = 2 % 2;
        int i2 = serializer + 89;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.brandIcon;
        }
        int i3 = 5 / 0;
        return this.brandIcon;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 67;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 103;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public /* synthetic */ FontListFontFamilyTypefaceAdapterpreload321(int i, String str, TagIconTokenV1 tagIconTokenV1, getDismissOnBackPress getdismissonbackpress, List list, String str2) {
        if (19 != (i & 19)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 19, getFontMatcher.serializer.getDescriptor());
            throw null;
        }
        this.title = str;
        this.brandIcon = tagIconTokenV1;
        if ((i & 4) == 0) {
            this.closeButton = null;
            int i2 = serializer + 65;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        } else {
            this.closeButton = getdismissonbackpress;
        }
        if ((i & 8) == 0) {
            int i4 = serializer + 79;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            this.trackingEvents = instance_delegatelambda0.write;
        } else {
            this.trackingEvents = list;
            int i6 = 2 % 2;
        }
        this.successMessage = str2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 73;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode2 = this.title.hashCode();
        int iHashCode3 = this.brandIcon.hashCode();
        getDismissOnBackPress getdismissonbackpress = this.closeButton;
        if (getdismissonbackpress == null) {
            int i4 = serializer + 49;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = getdismissonbackpress.hashCode();
        }
        return this.successMessage.hashCode() + c8$$ExternalSyntheticOutline0.m(this.trackingEvents, (((iHashCode3 + (iHashCode2 * 31)) * 31) + iHashCode) * 31, 31);
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("QrPaymentScreen(title=");
        sb.append(this.title);
        sb.append(", brandIcon=");
        sb.append(this.brandIcon);
        sb.append(", closeButton=");
        sb.append(this.closeButton);
        sb.append(", trackingEvents=");
        sb.append(this.trackingEvents);
        sb.append(", successMessage=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.successMessage, ")");
        int i2 = RemoteActionCompatParcelizer + 77;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 123;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 41;
            int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            serializer = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 7;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof FontListFontFamilyTypefaceAdapterpreload321)) {
            return false;
        }
        FontListFontFamilyTypefaceAdapterpreload321 fontListFontFamilyTypefaceAdapterpreload321 = (FontListFontFamilyTypefaceAdapterpreload321) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, fontListFontFamilyTypefaceAdapterpreload321.title}, getCieXyz.write())).booleanValue()) {
            int i8 = RemoteActionCompatParcelizer + 23;
            serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        if (this.brandIcon != fontListFontFamilyTypefaceAdapterpreload321.brandIcon) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.closeButton, fontListFontFamilyTypefaceAdapterpreload321.closeButton}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingEvents, fontListFontFamilyTypefaceAdapterpreload321.trackingEvents}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.successMessage, fontListFontFamilyTypefaceAdapterpreload321.successMessage}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i10 = serializer + 81;
        RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return false;
    }
}
