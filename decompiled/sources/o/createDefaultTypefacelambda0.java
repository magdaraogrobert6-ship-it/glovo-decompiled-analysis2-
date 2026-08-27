package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.navigation.voice.api.VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.common.data.model.tasks.MultipleCodeScan$CodeScanScreen$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.getPlatformFontLoaderui_text;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class createDefaultTypefacelambda0 {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final MultipleCodeScan$CodeScanScreen$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.MultipleCodeScan$CodeScanScreen$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 7;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getPlatformFontLoaderui_text getplatformfontloaderui_text = getPlatformFontLoaderui_text.write;
            int i4 = RemoteActionCompatParcelizer + 53;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return getplatformfontloaderui_text;
        }
    };
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final preloadlambda1 alreadyScannedMessage;
    public final List codes;
    public final getDismissOnBackPress extraCodeCloseButton;
    public final String instructionMessage;
    public final preloadlambda1 moveCloserMessage;
    public final resolvelambda0 scannedItemsDialog;
    public final preloadlambda1 successMessage;
    public final String title;
    public final String totalBags;
    public final List trackingEvents;
    public final preloadlambda1 wrongShelfMessage;

    public static /* synthetic */ Object read(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i6 | i3);
        int i9 = (~((~i3) | i6)) | (~(i6 | i2));
        int i10 = i6 + i2 + i4 + (32217706 * i5) + (238734613 * i);
        int i11 = i10 * i10;
        int i12 = (((-3446596) * i6) - 528416768) + (677943110 * i2) + (i8 * 1806788795) + ((-1806788795) * i7) + (1806788795 * i9) + ((-1810235392) * i4) + ((-154927104) * i5) + ((-131989504) * i) + ((-1876361216) * i11);
        int i13 = ((i6 * 1127137324) - 440746823) + (i2 * 1127135646) + (i8 * 839) + (i7 * (-839)) + (i9 * 839) + (i4 * 1127136485) + (i5 * 976419026) + (i * 1106960329) + (i11 * 279773184);
        return i12 + ((i13 * i13) * (-1943076864)) != 1 ? IconCompatParcelizer(objArr) : write(objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.MultipleCodeScan$CodeScanScreen$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new DelegatingFontLoaderForDeprecatedUsage(23)), null, null, null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new DelegatingFontLoaderForDeprecatedUsage(24))};
        int i = read + 31;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        createDefaultTypefacelambda0 createdefaulttypefacelambda0 = (createDefaultTypefacelambda0) objArr[0];
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 1;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        List list = createdefaulttypefacelambda0.codes;
        int i5 = i2 + 107;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 13;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.instructionMessage;
        int i5 = i2 + 19;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = write + 121;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        List list = this.trackingEvents;
        int i5 = i3 + 53;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final String MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = write + 95;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.title;
        }
        int i3 = 43 / 0;
        return this.title;
    }

    public final preloadlambda1 MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = write + 19;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        preloadlambda1 preloadlambda1Var = this.successMessage;
        int i5 = i3 + 105;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return preloadlambda1Var;
        }
        throw null;
    }

    public final String MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = serializer + 103;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.totalBags;
        }
        throw null;
    }

    public final preloadlambda1 MediaSessionCompatToken() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 15;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        preloadlambda1 preloadlambda1Var = this.wrongShelfMessage;
        int i5 = i2 + 117;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return preloadlambda1Var;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final resolvelambda0 RatingCompat() {
        int i = 2 % 2;
        int i2 = write + 35;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        resolvelambda0 resolvelambda0Var = this.scannedItemsDialog;
        int i4 = i3 + 45;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return resolvelambda0Var;
    }

    public final preloadlambda1 RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 5;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        preloadlambda1 preloadlambda1Var = this.moveCloserMessage;
        int i5 = i3 + 17;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 26 / 0;
        }
        return preloadlambda1Var;
    }

    public final preloadlambda1 read() {
        int i = 2 % 2;
        int i2 = serializer + 79;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.alreadyScannedMessage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getDismissOnBackPress serializer() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 59;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        getDismissOnBackPress getdismissonbackpress = this.extraCodeCloseButton;
        int i4 = i2 + 109;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return getdismissonbackpress;
        }
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ createDefaultTypefacelambda0(int i, String str, String str2, List list, String str3, preloadlambda1 preloadlambda1Var, preloadlambda1 preloadlambda1Var2, preloadlambda1 preloadlambda1Var3, preloadlambda1 preloadlambda1Var4, resolvelambda0 resolvelambda0Var, getDismissOnBackPress getdismissonbackpress, List list2) {
        if (767 != (i & 767)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 767, getPlatformFontLoaderui_text.write.getDescriptor());
            throw null;
        }
        this.title = str;
        this.instructionMessage = str2;
        this.codes = list;
        this.totalBags = str3;
        this.alreadyScannedMessage = preloadlambda1Var;
        this.wrongShelfMessage = preloadlambda1Var2;
        this.moveCloserMessage = preloadlambda1Var3;
        this.successMessage = preloadlambda1Var4;
        if ((i & androidx.compose.ui.graphics.Fields.RotationX) == 0) {
            this.scannedItemsDialog = null;
            int i2 = write + 59;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            this.scannedItemsDialog = resolvelambda0Var;
        }
        int i4 = 2 % 2;
        this.extraCodeCloseButton = getdismissonbackpress;
        if ((i & androidx.compose.ui.graphics.Fields.RotationZ) != 0) {
            this.trackingEvents = list2;
            return;
        }
        int i5 = write + 107;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        this.trackingEvents = instance_delegatelambda0.write;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        int iHashCode = 0;
        createDefaultTypefacelambda0 createdefaulttypefacelambda0 = (createDefaultTypefacelambda0) objArr[0];
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m(createdefaulttypefacelambda0.codes, af$$ExternalSyntheticOutline0.m(createdefaulttypefacelambda0.title.hashCode() * 31, 31, createdefaulttypefacelambda0.instructionMessage), 31), 31, createdefaulttypefacelambda0.totalBags);
        int iHashCode2 = createdefaulttypefacelambda0.alreadyScannedMessage.hashCode();
        int iHashCode3 = createdefaulttypefacelambda0.wrongShelfMessage.hashCode();
        int iHashCode4 = createdefaulttypefacelambda0.moveCloserMessage.hashCode();
        int iHashCode5 = createdefaulttypefacelambda0.successMessage.hashCode();
        resolvelambda0 resolvelambda0Var = createdefaulttypefacelambda0.scannedItemsDialog;
        if (resolvelambda0Var == null) {
            int i2 = serializer + 9;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                iHashCode = 1;
            }
        } else {
            iHashCode = resolvelambda0Var.hashCode();
            int i3 = write + 73;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        return Integer.valueOf(createdefaulttypefacelambda0.trackingEvents.hashCode() + ((createdefaulttypefacelambda0.extraCodeCloseButton.hashCode() + ((((iHashCode5 + ((iHashCode4 + ((iHashCode3 + ((iHashCode2 + iM) * 31)) * 31)) * 31)) * 31) + iHashCode) * 31)) * 31));
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 9;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("CodeScanScreen(title=", this.title, ", instructionMessage=", this.instructionMessage, ", codes=");
        sbM.append(this.codes);
        sbM.append(", totalBags=");
        sbM.append(this.totalBags);
        sbM.append(", alreadyScannedMessage=");
        sbM.append(this.alreadyScannedMessage);
        sbM.append(", wrongShelfMessage=");
        sbM.append(this.wrongShelfMessage);
        sbM.append(", moveCloserMessage=");
        sbM.append(this.moveCloserMessage);
        sbM.append(", successMessage=");
        sbM.append(this.successMessage);
        sbM.append(", scannedItemsDialog=");
        sbM.append(this.scannedItemsDialog);
        sbM.append(", extraCodeCloseButton=");
        sbM.append(this.extraCodeCloseButton);
        sbM.append(", trackingEvents=");
        String str = MediaSessionCompatQueueItem.read(sbM, this.trackingEvents, ")");
        int i4 = serializer + 53;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if ((r22 instanceof o.createDefaultTypefacelambda0) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        r1 = (o.createDefaultTypefacelambda0) r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.title, r1.title}, o.getCieXyz.write())).booleanValue() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.instructionMessage, r1.instructionMessage}, o.getCieXyz.write())).booleanValue() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
    
        r1 = o.createDefaultTypefacelambda0.serializer;
        r3 = r1 + 45;
        o.createDefaultTypefacelambda0.write = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r3 = r3 % 2;
        r1 = r1 + 111;
        o.createDefaultTypefacelambda0.write = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ae, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.codes, r1.codes}, o.getCieXyz.write())).booleanValue() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b0, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d6, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.totalBags, r1.totalBags}, o.getCieXyz.write())).booleanValue() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d8, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00fe, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.alreadyScannedMessage, r1.alreadyScannedMessage}, o.getCieXyz.write())).booleanValue() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0100, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0126, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.wrongShelfMessage, r1.wrongShelfMessage}, o.getCieXyz.write())).booleanValue() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0128, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x014f, code lost:
    
        if ((!((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.moveCloserMessage, r1.moveCloserMessage}, o.getCieXyz.write())).booleanValue()) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0151, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0177, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.successMessage, r1.successMessage}, o.getCieXyz.write())).booleanValue() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0179, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x019f, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.scannedItemsDialog, r1.scannedItemsDialog}, o.getCieXyz.write())).booleanValue() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01a1, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01c7, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.extraCodeCloseButton, r1.extraCodeCloseButton}, o.getCieXyz.write())).booleanValue() != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01c9, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01ef, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.trackingEvents, r1.trackingEvents}, o.getCieXyz.write())).booleanValue() != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01f1, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01f2, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.createDefaultTypefacelambda0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return ((Integer) read(new Object[]{this}, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), 2028880115, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), -2028880114)).intValue();
    }

    public final List write() {
        return (List) read(new Object[]{this}, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), 98742322, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), -98742322);
    }
}
