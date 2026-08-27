package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.navigation.voice.api.VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.common.data.model.tasks.DatePicker$Companion;
import kotlinx.serialization.Serializable;
import o.FontFamilyResolverImpl;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "date_picker")
public final class r8lambda9Qm9DZbhOse2Hc4fMyNBL__D5ZI extends DeviceFontFamilyNameFontKt {
    public static final DatePicker$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.DatePicker$Companion
        private static int read = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 59;
            write = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 == 0) {
                FontFamilyResolverImpl fontFamilyResolverImpl = FontFamilyResolverImpl.read;
                obj.hashCode();
                throw null;
            }
            FontFamilyResolverImpl fontFamilyResolverImpl2 = FontFamilyResolverImpl.read;
            int i3 = write + 81;
            read = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return fontFamilyResolverImpl2;
            }
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    public final String datePickerTitle;
    public final FontFamilyKt dateValidation;
    public final String description;
    public final String editDateText;
    public final String errorMessage;
    public final String errorTitle;
    public final String id;
    public final Integer minimumAge;
    public final boolean required;
    public final String selectionPlaceHolder;
    public final String title;

    public static /* synthetic */ Object read(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i4);
        int i9 = ~(i5 | i4);
        int i10 = i7 | (~i4);
        int i11 = i9 | (~(i10 | i6));
        int i12 = (~i6) | i10;
        int i13 = i5 + i4 + i + (770105990 * i2) + ((-157043368) * i3);
        int i14 = i13 * i13;
        int i15 = ((315592168 * i5) - 1432092672) + ((-1000312294) * i4) + ((-1315904462) * i8) + ((-657952231) * i11) + (657952231 * i12) + ((-342360064) * i) + ((-2121269248) * i2) + (1950351360 * i3) + ((-66846720) * i14);
        int i16 = (i5 * 105828664) + 1394048361 + (i4 * 105827886) + (i8 * (-778)) + (i11 * (-389)) + (i12 * 389) + (i * 105828275) + (i2 * (-227623502)) + (i3 * 619312264) + (i14 * 1925971968);
        return i15 + ((i16 * i16) * 261881856) != 1 ? serializer(objArr) : IconCompatParcelizer(objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.DatePicker$Companion] */
    static {
        int i = read + 5;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        String str;
        r8lambda9Qm9DZbhOse2Hc4fMyNBL__D5ZI r8lambda9qm9dzbhose2hc4fmynbl__d5zi = (r8lambda9Qm9DZbhOse2Hc4fMyNBL__D5ZI) objArr[0];
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 47;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            str = r8lambda9qm9dzbhose2hc4fmynbl__d5zi.errorTitle;
            int i4 = 1 / 0;
        } else {
            str = r8lambda9qm9dzbhose2hc4fmynbl__d5zi.errorTitle;
        }
        int i5 = i2 + 79;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        r8lambda9Qm9DZbhOse2Hc4fMyNBL__D5ZI r8lambda9qm9dzbhose2hc4fmynbl__d5zi = (r8lambda9Qm9DZbhOse2Hc4fMyNBL__D5ZI) objArr[0];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 11;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        Integer num = r8lambda9qm9dzbhose2hc4fmynbl__d5zi.minimumAge;
        int i5 = i3 + 39;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 101;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.editDateText;
        int i5 = i2 + 115;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 85;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.id;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 77;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.selectionPlaceHolder;
        int i5 = i2 + 83;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String MediaSessionCompatResultReceiverWrapper() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 49;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.title;
        int i4 = i2 + 35;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final boolean RatingCompat() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 97;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.required;
        }
        int i3 = 42 / 0;
        return this.required;
    }

    public final FontFamilyKt RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 9;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.dateValidation;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 51;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.errorMessage;
        int i5 = i3 + 81;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 31;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.description;
        int i4 = i2 + 19;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
        return str;
    }

    public final String write() {
        String str;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 97;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            str = this.datePickerTitle;
            int i4 = 26 / 0;
        } else {
            str = this.datePickerTitle;
        }
        int i5 = i2 + 57;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public /* synthetic */ r8lambda9Qm9DZbhOse2Hc4fMyNBL__D5ZI(int i, String str, String str2, String str3, String str4, String str5, boolean z, Integer num, FontFamilyKt fontFamilyKt, String str6, String str7, String str8) {
        Object obj = null;
        if (1854 != (i & 1854)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1854, FontFamilyResolverImpl.read.getDescriptor());
            throw null;
        }
        this.id = (i & 1) == 0 ? "date_picker" : str;
        this.title = str2;
        this.description = str3;
        this.datePickerTitle = str4;
        this.selectionPlaceHolder = str5;
        this.required = z;
        if ((i & 64) == 0) {
            int i2 = RemoteActionCompatParcelizer;
            int i3 = i2 + 81;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            this.minimumAge = null;
            int i5 = i2 + 17;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 3 / 3;
            } else {
                int i7 = 2 % 2;
            }
        } else {
            this.minimumAge = num;
        }
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) == 0) {
            int i8 = RemoteActionCompatParcelizer + 49;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                this.dateValidation = null;
                throw null;
            }
            this.dateValidation = null;
        } else {
            this.dateValidation = fontFamilyKt;
            int i9 = RemoteActionCompatParcelizer + 109;
            IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
        }
        this.errorMessage = str6;
        this.errorTitle = str7;
        this.editDateText = str8;
        int i12 = IconCompatParcelizer + 29;
        RemoteActionCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i12 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 79;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("DatePicker(id=", this.id, ", title=", this.title, ", description=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.description, ", datePickerTitle=", this.datePickerTitle, ", selectionPlaceHolder=");
        SweepGradientShader9KIMszodefault.IconCompatParcelizer(this.selectionPlaceHolder, ", required=", ", minimumAge=", sbM, this.required);
        sbM.append(this.minimumAge);
        sbM.append(", dateValidation=");
        sbM.append(this.dateValidation);
        sbM.append(", errorMessage=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.errorMessage, ", errorTitle=", this.errorTitle, ", editDateText=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.editDateText, ")");
        int i4 = IconCompatParcelizer + 105;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 57;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.title), 31, this.description), 31, this.datePickerTitle), 31, this.selectionPlaceHolder), 31, this.required);
        Integer num = this.minimumAge;
        int iHashCode = num == null ? 0 : num.hashCode();
        FontFamilyKt fontFamilyKt = this.dateValidation;
        int iHashCode2 = this.editDateText.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((((iM + iHashCode) * 31) + (fontFamilyKt != null ? fontFamilyKt.hashCode() : 0)) * 31, 31, this.errorMessage), 31, this.errorTitle);
        int i4 = IconCompatParcelizer + 63;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode2;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 19;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambda9Qm9DZbhOse2Hc4fMyNBL__D5ZI)) {
            return false;
        }
        r8lambda9Qm9DZbhOse2Hc4fMyNBL__D5ZI r8lambda9qm9dzbhose2hc4fmynbl__d5zi = (r8lambda9Qm9DZbhOse2Hc4fMyNBL__D5ZI) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, r8lambda9qm9dzbhose2hc4fmynbl__d5zi.id}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, r8lambda9qm9dzbhose2hc4fmynbl__d5zi.title}, getCieXyz.write())).booleanValue()) {
            int i3 = RemoteActionCompatParcelizer + 53;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, r8lambda9qm9dzbhose2hc4fmynbl__d5zi.description}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.datePickerTitle, r8lambda9qm9dzbhose2hc4fmynbl__d5zi.datePickerTitle}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.selectionPlaceHolder, r8lambda9qm9dzbhose2hc4fmynbl__d5zi.selectionPlaceHolder}, getCieXyz.write())).booleanValue()) {
            int i5 = RemoteActionCompatParcelizer + 61;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        if (this.required != r8lambda9qm9dzbhose2hc4fmynbl__d5zi.required) {
            int i6 = IconCompatParcelizer + 113;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.minimumAge, r8lambda9qm9dzbhose2hc4fmynbl__d5zi.minimumAge}, getCieXyz.write())).booleanValue()) {
            int i8 = RemoteActionCompatParcelizer + 107;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.dateValidation, r8lambda9qm9dzbhose2hc4fmynbl__d5zi.dateValidation}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.errorMessage, r8lambda9qm9dzbhose2hc4fmynbl__d5zi.errorMessage}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.errorTitle, r8lambda9qm9dzbhose2hc4fmynbl__d5zi.errorTitle}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.editDateText, r8lambda9qm9dzbhose2hc4fmynbl__d5zi.editDateText}, getCieXyz.write())).booleanValue();
        }
        int i10 = IconCompatParcelizer + 11;
        RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i10 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public final Integer MediaBrowserCompatMediaItem() {
        return (Integer) read(new Object[]{this}, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), 970435277, -970435277, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer());
    }

    public final String MediaMetadataCompat() {
        return (String) read(new Object[]{this}, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), -844243067, 844243068, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer());
    }
}
