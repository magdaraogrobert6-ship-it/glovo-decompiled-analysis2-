package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.common.data.model.tasks.QrCodeScanTask$FallbackScreen$Companion;
import com.roadrunner.delivery.common.data.model.tasks.Reason$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.FontListFontFamilyTypefaceAdapterresolve1;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class FontListFontFamilyTypefaceAdapterspecialinlinedCoroutineExceptionHandler1 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 1;
    private static int write;
    public final String headline;
    public final String instructionMessage;
    public final String pin;
    public final String pinErrorMessage;
    public final String pinSuccessMessage;
    public final List trackingEvents;
    public static final QrCodeScanTask$FallbackScreen$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.QrCodeScanTask$FallbackScreen$Companion
        private static int IconCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 27;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            FontListFontFamilyTypefaceAdapterresolve1 fontListFontFamilyTypefaceAdapterresolve1 = FontListFontFamilyTypefaceAdapterresolve1.IconCompatParcelizer;
            int i4 = IconCompatParcelizer + 69;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return fontListFontFamilyTypefaceAdapterresolve1;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new Reason$$ExternalSyntheticLambda0(8))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.QrCodeScanTask$FallbackScreen$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 35;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 45;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.headline;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 81;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.trackingEvents;
        }
        int i3 = 58 / 0;
        return this.trackingEvents;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 9;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.instructionMessage;
        }
        int i3 = 26 / 0;
        return this.instructionMessage;
    }

    public final String read() {
        String str;
        int i = 2 % 2;
        int i2 = serializer + 113;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            str = this.pinSuccessMessage;
            int i4 = 89 / 0;
        } else {
            str = this.pinSuccessMessage;
        }
        int i5 = i3 + 125;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String serializer() {
        String str;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 121;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            str = this.pinErrorMessage;
            int i4 = 81 / 0;
        } else {
            str = this.pinErrorMessage;
        }
        int i5 = i2 + 17;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 65;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.pin;
        int i5 = i2 + 37;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public /* synthetic */ FontListFontFamilyTypefaceAdapterspecialinlinedCoroutineExceptionHandler1(int i, String str, String str2, String str3, String str4, String str5, List list) {
        if (31 == (i & 31)) {
            this.instructionMessage = str;
            this.headline = str2;
            this.pin = str3;
            this.pinSuccessMessage = str4;
            this.pinErrorMessage = str5;
            if ((i & 32) == 0) {
                this.trackingEvents = null;
                int i2 = IconCompatParcelizer + 67;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return;
            }
            this.trackingEvents = list;
            int i4 = IconCompatParcelizer + 111;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 65 / 0;
                return;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 31, FontListFontFamilyTypefaceAdapterresolve1.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 79;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("FallbackScreen(instructionMessage=", this.instructionMessage, ", headline=", this.headline, ", pin=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.pin, ", pinSuccessMessage=", this.pinSuccessMessage, ", pinErrorMessage=");
        String str = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(sbM, this.pinErrorMessage, ", trackingEvents=", this.trackingEvents, ")");
        int i4 = serializer + 101;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
        return str;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 23;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.instructionMessage.hashCode() * 31, 31, this.headline), 31, this.pin), 31, this.pinSuccessMessage), 31, this.pinErrorMessage);
        List list = this.trackingEvents;
        if (list == null) {
            int i4 = serializer;
            int i5 = i4 + 107;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = i4 + 27;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        return iM + iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof FontListFontFamilyTypefaceAdapterspecialinlinedCoroutineExceptionHandler1) {
                FontListFontFamilyTypefaceAdapterspecialinlinedCoroutineExceptionHandler1 fontListFontFamilyTypefaceAdapterspecialinlinedCoroutineExceptionHandler1 = (FontListFontFamilyTypefaceAdapterspecialinlinedCoroutineExceptionHandler1) obj;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.instructionMessage, fontListFontFamilyTypefaceAdapterspecialinlinedCoroutineExceptionHandler1.instructionMessage}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.headline, fontListFontFamilyTypefaceAdapterspecialinlinedCoroutineExceptionHandler1.headline}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.pin, fontListFontFamilyTypefaceAdapterspecialinlinedCoroutineExceptionHandler1.pin}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.pinSuccessMessage, fontListFontFamilyTypefaceAdapterspecialinlinedCoroutineExceptionHandler1.pinSuccessMessage}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.pinErrorMessage, fontListFontFamilyTypefaceAdapterspecialinlinedCoroutineExceptionHandler1.pinErrorMessage}, getCieXyz.write())).booleanValue())) {
                    return !(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingEvents, fontListFontFamilyTypefaceAdapterspecialinlinedCoroutineExceptionHandler1.trackingEvents}, getCieXyz.write())).booleanValue() ^ true);
                }
                int i2 = IconCompatParcelizer + 1;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i2 % 2 == 0;
            }
            int i3 = serializer + 89;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = IconCompatParcelizer + 79;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }
}
