package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.common.data.model.tasks.PinValidation$Companion;
import com.roadrunner.delivery.common.data.model.tasks.Reason$$ExternalSyntheticLambda0;
import com.roadrunner.rrds.compose.component.forms.TextInputBigV2Kt$MainText$1$1$1;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.FontF3nL8kkdefault;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "pin_validation")
public final class FontRetOiIg extends DeviceFontFamilyNameFontKt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final String description;
    public final Map errors;
    public final String id;
    public final int numDigits;
    public final preloadlambda11 offlineValidation;
    public final String pinFieldTitle;
    public final boolean required;
    public final String title;
    public static final PinValidation$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.PinValidation$Companion
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 89;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            FontF3nL8kkdefault fontF3nL8kkdefault = FontF3nL8kkdefault.serializer;
            int i4 = RemoteActionCompatParcelizer + 19;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return fontF3nL8kkdefault;
            }
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new Reason$$ExternalSyntheticLambda0(2)), null};

    public static /* synthetic */ Object IconCompatParcelizer(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i5;
        int i8 = ~((~i6) | i7);
        int i9 = ~i4;
        int i10 = ~(i9 | i5);
        int i11 = ~(i7 | i4);
        int i12 = i8 | i10 | i11;
        int i13 = ~(i9 | i7 | i6);
        int i14 = (~(i6 | i7)) | i10 | i11;
        int i15 = i4 + i5 + i3 + (2052055731 * i) + (1687666023 * i2);
        int i16 = i15 * i15;
        int i17 = (i4 * (-1966771951)) + 1000013824 + ((-1966771951) * i5) + ((-617538080) * i12) + ((-926307120) * i13) + (308769040 * i14) + (2019426304 * i3) + (632946688 * i) + ((-741212160) * i2) + (2121465856 * i16);
        int i18 = (i4 * 1533266457) + 1248777597 + (i5 * 1533266457) + (i12 * (-800)) + (i13 * (-1200)) + (i14 * 400) + (i3 * 1533266057) + (i * 706030027) + (i2 * 1023530015) + (i16 * (-2088042496));
        return i17 + ((i18 * i18) * 1434255360) != 1 ? read(objArr) : RemoteActionCompatParcelizer(objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.PinValidation$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 3;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        FontRetOiIg fontRetOiIg = (FontRetOiIg) objArr[0];
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 33;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = fontRetOiIg.id;
        int i5 = i2 + 5;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        FontRetOiIg fontRetOiIg = (FontRetOiIg) objArr[0];
        int i = 2 % 2;
        int i2 = serializer + 97;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return fontRetOiIg.errors;
        }
        int i3 = 73 / 0;
        return fontRetOiIg.errors;
    }

    public final int IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 21;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.numDigits;
        int i5 = i2 + 11;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 8 / 0;
        }
        return i4;
    }

    public final String MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = serializer + 51;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.pinFieldTitle;
        }
        throw null;
    }

    public final String MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 83;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 31;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean RatingCompat() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 41;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        boolean z = this.required;
        int i5 = i2 + 13;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return z;
    }

    public final preloadlambda11 read() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 87;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.offlineValidation;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = serializer + 3;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.description;
        int i5 = i3 + 89;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public /* synthetic */ FontRetOiIg(int i, String str, String str2, String str3, int i2, String str4, boolean z, Map map, preloadlambda11 preloadlambda11Var) {
        if (63 == (i & 63)) {
            this.id = str;
            this.title = str2;
            this.description = str3;
            this.numDigits = i2;
            this.pinFieldTitle = str4;
            this.required = z;
            if ((i & 64) == 0) {
                this.errors = SimpleItemTouchHelperCallback.serializer;
            } else {
                this.errors = map;
                int i3 = serializer + 51;
                IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    int i4 = 2 % 2;
                }
            }
            if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) == 0) {
                int i5 = serializer + 19;
                int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                IconCompatParcelizer = i6;
                int i7 = i5 % 2;
                this.offlineValidation = null;
                int i8 = i6 + 9;
                serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    int i9 = 65 / 0;
                    return;
                }
                return;
            }
            this.offlineValidation = preloadlambda11Var;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 63, FontF3nL8kkdefault.serializer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = serializer + 23;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int iRemoteActionCompatParcelizer = IconCompatParcelizer.RemoteActionCompatParcelizer(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.numDigits, af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.title), 31, this.description), 31), 31, this.pinFieldTitle), 31, this.required), this.errors, 31);
        preloadlambda11 preloadlambda11Var = this.offlineValidation;
        if (preloadlambda11Var == null) {
            i = 0;
        } else {
            int iHashCode = preloadlambda11Var.hashCode();
            int i5 = IconCompatParcelizer + 109;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 5 / 2;
            }
            i = iHashCode;
        }
        return iRemoteActionCompatParcelizer + i;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 51;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("PinValidation(id=", this.id, ", title=", this.title, ", description=");
        sbM.append(this.description);
        sbM.append(", numDigits=");
        sbM.append(this.numDigits);
        sbM.append(", pinFieldTitle=");
        SweepGradientShader9KIMszodefault.IconCompatParcelizer(this.pinFieldTitle, ", required=", ", errors=", sbM, this.required);
        sbM.append(this.errors);
        sbM.append(", offlineValidation=");
        sbM.append(this.offlineValidation);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = serializer + 35;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FontRetOiIg)) {
            int i2 = IconCompatParcelizer + 47;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        FontRetOiIg fontRetOiIg = (FontRetOiIg) obj;
        Object[] objArr = {this.id, fontRetOiIg.id};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr2 = {this.title, fontRetOiIg.title};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr3 = {this.description, fontRetOiIg.description};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.numDigits != fontRetOiIg.numDigits) {
            int i4 = IconCompatParcelizer + 81;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        Object[] objArr4 = {this.pinFieldTitle, fontRetOiIg.pinFieldTitle};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
            int i6 = IconCompatParcelizer + 31;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (this.required != fontRetOiIg.required) {
            return false;
        }
        Object[] objArr5 = {this.errors, fontRetOiIg.errors};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr6 = {this.offlineValidation, fontRetOiIg.offlineValidation};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr6, getCieXyz.write())).booleanValue()) {
            int i8 = IconCompatParcelizer + 105;
            serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        int i10 = IconCompatParcelizer + 23;
        serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i10 % 2 != 0) {
            int i11 = 10 / 0;
        }
        return true;
    }

    public final String RemoteActionCompatParcelizer() {
        int iSerializer = TextInputBigV2Kt$MainText$1$1$1.serializer();
        int iSerializer2 = TextInputBigV2Kt$MainText$1$1$1.serializer();
        return (String) IconCompatParcelizer(TextInputBigV2Kt$MainText$1$1$1.serializer(), TextInputBigV2Kt$MainText$1$1$1.serializer(), iSerializer2, 1877140462, -1877140461, iSerializer, new Object[]{this});
    }

    public final Map write() {
        int iSerializer = TextInputBigV2Kt$MainText$1$1$1.serializer();
        int iSerializer2 = TextInputBigV2Kt$MainText$1$1$1.serializer();
        return (Map) IconCompatParcelizer(TextInputBigV2Kt$MainText$1$1$1.serializer(), TextInputBigV2Kt$MainText$1$1$1.serializer(), iSerializer2, 1034577493, -1034577493, iSerializer, new Object[]{this});
    }
}
