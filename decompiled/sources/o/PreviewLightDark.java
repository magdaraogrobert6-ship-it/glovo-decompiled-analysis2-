package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.mapbox.navigation.ui.maps.building.model.MapboxBuildingHighlightOptions;
import com.roadrunner.delivery.pickupdropoff.tasks.model.PinValidationTaskUiItem$Companion;
import java.util.Iterator;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.PreviewDynamicColors;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class PreviewLightDark implements uiMode {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final PinValidationTaskUiItem$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.PinValidationTaskUiItem$Companion
        private static int read = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 125;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return PreviewDynamicColors.serializer;
            }
            int i3 = 8 / 0;
            return PreviewDynamicColors.serializer;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public final String description;
    public final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk enteredPin;
    public final String errorMessage;
    public final Map errors;
    public final boolean isOptional;
    public final int numDigits;
    public final apiLevel offlineValidation;
    public final getWEAR_OS_LARGE_ROUNDannotations offlineValidationStatus;
    public final String pinFieldTitle;
    public final String taskId;
    public final String title;

    public static /* synthetic */ Object IconCompatParcelizer(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~((~i4) | i6);
        int i8 = (~((~i6) | (~i3))) | i7;
        int i9 = i6 | i3;
        int i10 = i6 + i3 + i + ((-39394691) * i5) + ((-2104995841) * i2);
        int i11 = i10 * i10;
        int i12 = (i6 * (-1880913482)) + 198443008 + ((-1880913482) * i3) + ((-1126725195) * i7) + (i8 * 1126725195) + (1126725195 * i9) + ((-754188288) * i) + ((-1529085952) * i5) + ((-319553536) * i2) + ((-289079296) * i11);
        int i13 = ((i6 * 1773844906) - 1404835566) + (i3 * 1773844906) + (i7 * (-613)) + (i8 * 613) + (i9 * 613) + (i * 1773845519) + (i5 * 1055723859) + (i2 * 1996616689) + (i11 * (-1450508288));
        return i12 + ((i13 * i13) * (-778371072)) != 1 ? RemoteActionCompatParcelizer(objArr) : IconCompatParcelizer(objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.PinValidationTaskUiItem$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new fontScale(5)), null, null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new fontScale(6))};
        int i = IconCompatParcelizer + 3;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        PreviewLightDark previewLightDark = (PreviewLightDark) objArr[0];
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 25;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = previewLightDark.enteredPin;
        int i5 = i2 + 11;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        PreviewLightDark previewLightDark = (PreviewLightDark) objArr[0];
        int i = 2 % 2;
        int i2 = serializer + 103;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return Boolean.valueOf(previewLightDark.isOptional);
        }
        boolean z = previewLightDark.isOptional;
        throw null;
    }

    @Override // o.uiMode
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 27;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.taskId;
        int i5 = i2 + 25;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final getWEAR_OS_LARGE_ROUNDannotations MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = read + 53;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        getWEAR_OS_LARGE_ROUNDannotations getwear_os_large_roundannotations = this.offlineValidationStatus;
        int i5 = i3 + 49;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return getwear_os_large_roundannotations;
    }

    public final apiLevel MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 33;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        apiLevel apilevel = this.offlineValidation;
        int i5 = i2 + 19;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return apilevel;
    }

    public final String serializer() {
        String str;
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 17;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            str = this.errorMessage;
            int i4 = 22 / 0;
        } else {
            str = this.errorMessage;
        }
        int i5 = i2 + 115;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public /* synthetic */ PreviewLightDark(int i, String str, String str2, String str3, int i2, String str4, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, Map map, String str5, boolean z, apiLevel apilevel, getWEAR_OS_LARGE_ROUNDannotations getwear_os_large_roundannotations) {
        Object obj = null;
        if (511 != (i & 511)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 511, PreviewDynamicColors.serializer.getDescriptor());
            throw null;
        }
        this.taskId = str;
        this.title = str2;
        this.description = str3;
        this.numDigits = i2;
        this.pinFieldTitle = str4;
        this.enteredPin = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        this.errors = map;
        this.errorMessage = str5;
        this.isOptional = z;
        if ((i & androidx.compose.ui.graphics.Fields.RotationY) == 0) {
            this.offlineValidation = null;
            int i3 = 2 % 2;
        } else {
            this.offlineValidation = apilevel;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationZ) != 0) {
            this.offlineValidationStatus = getwear_os_large_roundannotations;
            int i4 = read + 67;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i5 = serializer + 35;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        this.offlineValidationStatus = AndroidUiModes.INSTANCE;
        int i7 = serializer + 25;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0037  */
    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052 A[LOOP:0: B:23:0x0044->B:27:0x0052, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c A[SYNTHETIC] */
    @Override // o.uiMode
    public final boolean write() {
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        int i;
        Iterator<E> it;
        int i2 = 2 % 2;
        if (this.isOptional) {
            return true;
        }
        apiLevel apilevel = this.offlineValidation;
        if (apilevel != null) {
            int i3 = read + 51;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 48 / 0;
                if (apilevel.pinVerified) {
                    r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = this.enteredPin;
                    if (!r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.isEmpty()) {
                        i = read + 13;
                        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i % 2 == 0) {
                            throw null;
                        }
                        if (r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk == null && r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.isEmpty()) {
                            return true;
                        }
                        it = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.iterator();
                        while (it.hasNext()) {
                            if (((Character) it.next()) != null) {
                                int i5 = read + 33;
                                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i6 = i5 % 2;
                            }
                        }
                        return true;
                    }
                }
            } else if (apilevel.pinVerified) {
                r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = this.enteredPin;
                if (!r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.isEmpty()) {
                    i = read + 13;
                    serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        throw null;
                    }
                    if (r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk == null) {
                    }
                    it = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.iterator();
                    while (it.hasNext()) {
                        if (((Character) it.next()) != null) {
                            int i7 = read + 33;
                            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i8 = i7 % 2;
                        }
                    }
                    return true;
                }
            }
        } else {
            r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = this.enteredPin;
            if (!r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.isEmpty()) {
                i = read + 13;
                serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    throw null;
                }
                if (r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk == null) {
                }
                it = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.iterator();
                while (it.hasNext()) {
                    if (((Character) it.next()) != null) {
                        int i9 = read + 33;
                        serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public PreviewLightDark(String str, String str2, String str3, int i, String str4, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, Map map, String str5, boolean z, apiLevel apilevel, getWEAR_OS_LARGE_ROUNDannotations getwear_os_large_roundannotations) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        map.getClass();
        getwear_os_large_roundannotations.getClass();
        this.taskId = str;
        this.title = str2;
        this.description = str3;
        this.numDigits = i;
        this.pinFieldTitle = str4;
        this.enteredPin = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        this.errors = map;
        this.errorMessage = str5;
        this.isOptional = z;
        this.offlineValidation = apilevel;
        this.offlineValidationStatus = getwear_os_large_roundannotations;
    }

    public /* synthetic */ PreviewLightDark(String str, String str2, String str3, int i, String str4, r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq, Map map, boolean z, apiLevel apilevel) {
        this(str, str2, str3, i, str4, r8lambdaiidsddyirtymdul5lt6pmt2zysq, map, "", z, apilevel, AndroidUiModes.INSTANCE);
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.numDigits, af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.taskId.hashCode() * 31, 31, this.title), 31, this.description), 31), 31, this.pinFieldTitle);
        int iM2 = d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(IconCompatParcelizer.RemoteActionCompatParcelizer((this.enteredPin.hashCode() + iM) * 31, this.errors, 31), 31, this.errorMessage), 31, this.isOptional);
        apiLevel apilevel = this.offlineValidation;
        if (apilevel == null) {
            int i3 = read + 11;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode = apilevel.hashCode();
            int i5 = serializer + 55;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = iHashCode;
        }
        return this.offlineValidationStatus.hashCode() + ((iM2 + i) * 31);
    }

    public static PreviewLightDark read(PreviewLightDark previewLightDark, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, String str, apiLevel apilevel, getWEAR_OS_LARGE_ROUNDannotations getwear_os_large_roundannotations, int i) {
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2;
        String str2;
        int i2 = 2 % 2;
        String str3 = previewLightDark.taskId;
        String str4 = previewLightDark.title;
        String str5 = previewLightDark.description;
        int i3 = previewLightDark.numDigits;
        String str6 = previewLightDark.pinFieldTitle;
        if ((i & 32) != 0) {
            r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk3 = previewLightDark.enteredPin;
            int i4 = serializer + 73;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2 = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk3;
        } else {
            r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2 = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        }
        Map map = previewLightDark.errors;
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0) {
            int i6 = read + 33;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                String str7 = previewLightDark.errorMessage;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            str2 = previewLightDark.errorMessage;
        } else {
            str2 = str;
        }
        boolean z = previewLightDark.isOptional;
        apiLevel apilevel2 = (i & androidx.compose.ui.graphics.Fields.RotationY) != 0 ? previewLightDark.offlineValidation : apilevel;
        getWEAR_OS_LARGE_ROUNDannotations getwear_os_large_roundannotations2 = (i & androidx.compose.ui.graphics.Fields.RotationZ) != 0 ? previewLightDark.offlineValidationStatus : getwear_os_large_roundannotations;
        previewLightDark.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2.getClass();
        map.getClass();
        str2.getClass();
        getwear_os_large_roundannotations2.getClass();
        return new PreviewLightDark(str3, str4, str5, i3, str6, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2, map, str2, z, apilevel2, getwear_os_large_roundannotations2);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 61;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("PinValidationTaskUiItem(taskId=", this.taskId, ", title=", this.title, ", description=");
        sbM.append(this.description);
        sbM.append(", numDigits=");
        sbM.append(this.numDigits);
        sbM.append(", pinFieldTitle=");
        sbM.append(this.pinFieldTitle);
        sbM.append(", enteredPin=");
        sbM.append(this.enteredPin);
        sbM.append(", errors=");
        sbM.append(this.errors);
        sbM.append(", errorMessage=");
        sbM.append(this.errorMessage);
        sbM.append(", isOptional=");
        sbM.append(this.isOptional);
        sbM.append(", offlineValidation=");
        sbM.append(this.offlineValidation);
        sbM.append(", offlineValidationStatus=");
        sbM.append(this.offlineValidationStatus);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = read + 123;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewLightDark)) {
            return false;
        }
        PreviewLightDark previewLightDark = (PreviewLightDark) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.taskId, previewLightDark.taskId}, getCieXyz.write())).booleanValue()) {
            int i2 = read + 33;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        Object obj2 = null;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, previewLightDark.title}, getCieXyz.write())).booleanValue()) {
            int i3 = read + 55;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, previewLightDark.description}, getCieXyz.write())).booleanValue() || this.numDigits != previewLightDark.numDigits) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.pinFieldTitle, previewLightDark.pinFieldTitle}, getCieXyz.write())).booleanValue()) {
            int i4 = read + 61;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.enteredPin, previewLightDark.enteredPin}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.errors, previewLightDark.errors}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.errorMessage, previewLightDark.errorMessage}, getCieXyz.write())).booleanValue()) {
            int i6 = serializer + 101;
            int i7 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            read = i7;
            boolean z = i6 % 2 != 0;
            int i8 = i7 + 97;
            serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                return z;
            }
            throw null;
        }
        if (this.isOptional != previewLightDark.isOptional) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.offlineValidation, previewLightDark.offlineValidation}, getCieXyz.write())).booleanValue()) {
            int i9 = serializer + 19;
            read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.offlineValidationStatus, previewLightDark.offlineValidationStatus}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i11 = serializer + 5;
        read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i11 % 2 != 0;
    }

    @Override // o.uiMode
    public final boolean read() {
        int iIconCompatParcelizer = MapboxBuildingHighlightOptions.IconCompatParcelizer();
        return ((Boolean) IconCompatParcelizer(MapboxBuildingHighlightOptions.IconCompatParcelizer(), new Object[]{this}, MapboxBuildingHighlightOptions.IconCompatParcelizer(), -1108971844, iIconCompatParcelizer, MapboxBuildingHighlightOptions.IconCompatParcelizer(), 1108971844)).booleanValue();
    }

    public final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk RemoteActionCompatParcelizer() {
        int iIconCompatParcelizer = MapboxBuildingHighlightOptions.IconCompatParcelizer();
        return (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) IconCompatParcelizer(MapboxBuildingHighlightOptions.IconCompatParcelizer(), new Object[]{this}, MapboxBuildingHighlightOptions.IconCompatParcelizer(), 217749705, iIconCompatParcelizer, MapboxBuildingHighlightOptions.IconCompatParcelizer(), -217749704);
    }
}
