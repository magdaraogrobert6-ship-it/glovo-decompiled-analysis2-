package com.roadrunner.rider.state.worksettings.presentation;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.pickupdropoff.fullscreendetails.models.FullscreenDetailUi;
import com.roadrunner.delivery.pickupdropoff.fullscreendetails.presentation.compose.FullScreenDetailsContentKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.ClipKt;
import o.ComposeViewAdapterExternalSyntheticLambda2;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DrawBehindElement;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PagerWrapperFlingBehavior;
import o.PopulateViewStructure_androidKtpopulate7;
import o.StoreInfoUtil;
import o.buildMapping;
import o.clip;
import o.createFromParcel;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getInitiatingPackageName;
import o.getNewPassword;
import o.getNonZeroRgk1Os;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getPushAlert;
import o.getRootCause;
import o.getSelectiond9O1mEEui_text;
import o.getStrokeCapKaPHkGw;
import o.handleUrlOverridelambda1;
import o.isValidParameter;
import o.onBuildCache;
import o.onContentCardDismissed;
import o.onViewAttachedToWindow;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaFy5cFs23n4jmTZ3pAoKFIBBQQ;
import o.r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.readConnectionResponse;
import o.recordmLhObY;
import o.removeNodeAtDepth;
import o.setCurrentSemanticsNodesui;
import o.setInstallTracked;
import o.v2;
import okio.Okio;

/* JADX INFO: loaded from: classes3.dex */
public final class SettingsInfoContentKt$SettingsInfoContent$$inlined$ConstraintLayout$5 extends Lambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 IconCompatParcelizer;
    public final /* synthetic */ Object MediaSessionCompatQueueItem;
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 RemoteActionCompatParcelizer;
    public final /* synthetic */ DrawBehindElement read;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 serializer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsInfoContentKt$SettingsInfoContent$$inlined$ConstraintLayout$5(PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, DrawBehindElement drawBehindElement, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq) {
        super(2);
        this.write = 3;
        this.RemoteActionCompatParcelizer = populateViewStructure_androidKtpopulate7;
        this.read = drawBehindElement;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.MediaSessionCompatQueueItem = r8lambdaiidsddyirtymdul5lt6pmt2zysq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SettingsInfoContentKt$SettingsInfoContent$$inlined$ConstraintLayout$5(PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, DrawBehindElement drawBehindElement, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Object obj, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, int i) {
        super(2);
        this.write = i;
        this.RemoteActionCompatParcelizer = populateViewStructure_androidKtpopulate7;
        this.read = drawBehindElement;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaSessionCompatQueueItem = obj;
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:115:0x0601  */
    /* JADX WARN: Code duplicated, block: B:118:0x0652  */
    /* JADX WARN: Code duplicated, block: B:120:0x065a  */
    /* JADX WARN: Code duplicated, block: B:121:0x065e  */
    /* JADX WARN: Code duplicated, block: B:125:0x06ec A[LOOP:0: B:123:0x06e6->B:125:0x06ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:128:0x0781  */
    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    /* JADX WARN: Code duplicated, block: B:131:0x079b  */
    /* JADX WARN: Code duplicated, block: B:134:0x07af  */
    /* JADX WARN: Code duplicated, block: B:136:0x0827  */
    /* JADX WARN: Code duplicated, block: B:139:0x0839  */
    /* JADX WARN: Code duplicated, block: B:142:0x086a  */
    /* JADX WARN: Code duplicated, block: B:143:0x086e  */
    /* JADX WARN: Code duplicated, block: B:146:0x089b  */
    /* JADX WARN: Code duplicated, block: B:148:0x08a7  */
    /* JADX WARN: Code duplicated, block: B:14:0x0082  */
    /* JADX WARN: Code duplicated, block: B:151:0x08dc  */
    /* JADX WARN: Code duplicated, block: B:153:0x08e8  */
    /* JADX WARN: Code duplicated, block: B:154:0x08f2  */
    /* JADX WARN: Code duplicated, block: B:156:0x08f8  */
    /* JADX WARN: Code duplicated, block: B:16:0x008e  */
    /* JADX WARN: Code duplicated, block: B:17:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:22:0x010a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0160  */
    /* JADX WARN: Code duplicated, block: B:27:0x016c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x016f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0171  */
    /* JADX WARN: Code duplicated, block: B:34:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:36:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:38:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:39:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:42:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:44:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:47:0x0208  */
    /* JADX WARN: Code duplicated, block: B:49:0x020c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0213  */
    /* JADX WARN: Code duplicated, block: B:59:0x0237  */
    /* JADX WARN: Code duplicated, block: B:61:0x0271  */
    /* JADX WARN: Code duplicated, block: B:65:0x02de  */
    /* JADX WARN: Code duplicated, block: B:68:0x0334  */
    /* JADX WARN: Code duplicated, block: B:70:0x0340  */
    /* JADX WARN: Code duplicated, block: B:73:0x039f  */
    /* JADX WARN: Code duplicated, block: B:76:0x03d2  */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws CLParsingException {
        int i;
        getPostalCode getpostalcode;
        getAddressCountry getaddresscountry;
        ClipKt clipKtRemoteActionCompatParcelizer;
        ClipKt clipKtRemoteActionCompatParcelizer2;
        ScrollState scrollState;
        Modifier.Companion companion;
        boolean z;
        Object objComponentActivity;
        float f;
        ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer;
        int iHashCode;
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer;
        Modifier modifierMaterializeModifier;
        ComposeUiNode.Companion companion2;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor;
        Object objComponentActivity2;
        Object objComponentActivity3;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        boolean z2;
        Object objComponentActivity4;
        int i2;
        boolean z3;
        Object objComponentActivity5;
        int i3;
        getPostalCode getpostalcode2;
        ClipKt clipKtRemoteActionCompatParcelizer3;
        ClipKt clipKtRemoteActionCompatParcelizer4;
        ClipKt clipKtRemoteActionCompatParcelizer5;
        Object objComponentActivity6;
        boolean z4;
        Object objComponentActivity7;
        boolean z5;
        boolean z6;
        Object objComponentActivity8;
        Object objComponentActivity9;
        int i4;
        getPostalCode getpostalcode3;
        ClipKt clipKtRemoteActionCompatParcelizer6;
        ClipKt clipKtRemoteActionCompatParcelizer7;
        Object objComponentActivity10;
        boolean z7;
        Object objComponentActivity11;
        boolean z8;
        Object objComponentActivity12;
        ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2;
        int iHashCode2;
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2;
        Modifier modifierMaterializeModifier2;
        ComposeUiNode.Companion companion3;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3;
        int i5;
        boolean z9;
        int i6;
        int i7;
        int i8 = 2 % 2;
        int i9 = this.write;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = this.serializer;
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = this.RemoteActionCompatParcelizer;
        DrawBehindElement drawBehindElement = this.read;
        Object obj3 = this.MediaSessionCompatQueueItem;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i9 == 0) {
            createFromParcel createfromparcel2 = createfromparcel;
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
            StoreInfoUtil storeInfoUtil = (StoreInfoUtil) obj3;
            if ((((Number) obj2).intValue() & 3) == 2) {
                getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull;
                if (getpostalcode4.MediaSessionCompatToken()) {
                    getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    int i10 = MediaMetadataCompat + 27;
                    MediaDescriptionCompat = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    populateViewStructure_androidKtpopulate7.setValue(createfromparcel2);
                    i = drawBehindElement.MediaSessionCompatQueueItem;
                    drawBehindElement.read();
                    getpostalcode = (getPostalCode) getbirthdatefull;
                    getpostalcode.serializer(1555814369);
                    getaddresscountry = getpostalcode.read;
                    DrawBehindElement drawBehindElement2 = (DrawBehindElement) drawBehindElement.serializer().serializer;
                    ClipKt clipKtRemoteActionCompatParcelizer8 = drawBehindElement2.RemoteActionCompatParcelizer();
                    clipKtRemoteActionCompatParcelizer = drawBehindElement2.RemoteActionCompatParcelizer();
                    clipKtRemoteActionCompatParcelizer2 = drawBehindElement2.RemoteActionCompatParcelizer();
                    scrollState = PagerWrapperFlingBehavior.read(0, getpostalcode, 1);
                    companion = Modifier.Companion;
                    z = getpostalcode.read(clipKtRemoteActionCompatParcelizer);
                    objComponentActivity = getpostalcode.ComponentActivity();
                    if (z || objComponentActivity == androidContentCaptureManager) {
                        objComponentActivity = new readConnectionResponse(clipKtRemoteActionCompatParcelizer, 9);
                        getpostalcode.write(objComponentActivity);
                    }
                    Modifier modifierWrite = SizeKt.write(DrawBehindElement.read(companion, clipKtRemoteActionCompatParcelizer8, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity), 1.0f);
                    f = Dimensions.setLogo;
                    createfromparcel2 = createfromparcel2;
                    Modifier modifierIconCompatParcelizer = PagerWrapperFlingBehavior.IconCompatParcelizer(PaddingKt.m73paddingVpY3zN4$default(modifierWrite, f, 0.0f, 2), scrollState, false, 14);
                    modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
                    iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                    dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierIconCompatParcelizer);
                    companion2 = ComposeUiNode.Companion;
                    constructor = companion2.getConstructor();
                    if (getaddresscountry != null) {
                        SentryUUID.write();
                        throw null;
                    }
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (!getpostalcode.ComponentActivity) {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    } else {
                        getpostalcode.serializer(constructor);
                    }
                    c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion, f)});
                    TextKt.m131TextNvy7gAk(storeInfoUtil.RemoteActionCompatParcelizer, SizeKt.write(companion, 1.0f), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setHideOnContentScrollEnabled(), 0L, null, null, 0L, TextAlign.m3504boximpl(TextAlign.Companion.m3516getStarte0LSkKk()), 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatResultReceiverWrapper(), getpostalcode, 48, 0, 130040);
                    getpostalcode.serializer(-1097432905);
                    for (setInstallTracked setinstalltracked : storeInfoUtil.read) {
                        String str = setinstalltracked.IconCompatParcelizer;
                        Modifier.Companion companion4 = Modifier.Companion;
                        Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion4, 1.0f), 0.0f, Dimensions.setLogo, 0.0f, 0.0f, 13);
                        TextAlign.Companion companion5 = TextAlign.Companion;
                        int iM3516getStarte0LSkKk = companion5.m3516getStarte0LSkKk();
                        TextStyle textStyleMediaSessionCompatToken = performLayout.MediaSessionCompatToken();
                        setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                        TextKt.m131TextNvy7gAk(str, modifierM74paddingqDBjuR0$default, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setMenu(), 0L, null, null, 0L, TextAlign.m3504boximpl(iM3516getStarte0LSkKk), 0L, 0, false, 0, 0, null, textStyleMediaSessionCompatToken, getpostalcode, 0, 0, 130040);
                        TextKt.m131TextNvy7gAk(setinstalltracked.read, PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion4, 1.0f), 0.0f, Dimensions.getActionBarHideOffset, 0.0f, 0.0f, 13), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getActionBarHideOffset(), 0L, null, null, 0L, TextAlign.m3504boximpl(companion5.m3516getStarte0LSkKk()), 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 0, 0, 130040);
                    }
                    getpostalcode.IconCompatParcelizer(false);
                    getpostalcode.IconCompatParcelizer(true);
                    objComponentActivity2 = getpostalcode.ComponentActivity();
                    if (objComponentActivity2 == androidContentCaptureManager) {
                        objComponentActivity2 = CompositionKt.serializer(new r8lambdaFy5cFs23n4jmTZ3pAoKFIBBQQ(10, scrollState));
                        getpostalcode.write(objComponentActivity2);
                    }
                    if (((Boolean) ((onViewAttachedToWindow) objComponentActivity2).getValue()).booleanValue()) {
                        getpostalcode.serializer(1557589118);
                        Modifier.Companion companion6 = Modifier.Companion;
                        z3 = getpostalcode.read(clipKtRemoteActionCompatParcelizer);
                        objComponentActivity5 = getpostalcode.ComponentActivity();
                        if (z3 || objComponentActivity5 == androidContentCaptureManager) {
                            objComponentActivity5 = new readConnectionResponse(clipKtRemoteActionCompatParcelizer, 10);
                            getpostalcode.write(objComponentActivity5);
                        }
                        ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, BackgroundKt.background$default(SizeKt.m75height3ABfNKs(SizeKt.write(DrawBehindElement.read(companion6, clipKtRemoteActionCompatParcelizer2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity5), 1.0f), Dimensions.setLogo), Brush.Companion.m677verticalGradient8A3gB4$default(Brush.Companion, SQLite.read(Color.m712boximpl(Color.Companion.m757getTransparent0d7_KjU()), Color.m712boximpl(((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme())), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6)});
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(1558157069);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    Modifier.Companion companion7 = Modifier.Companion;
                    objComponentActivity3 = getpostalcode.ComponentActivity();
                    if (objComponentActivity3 == androidContentCaptureManager) {
                        objComponentActivity3 = getInitiatingPackageName.RemoteActionCompatParcelizer;
                        getpostalcode.write(objComponentActivity3);
                    }
                    Modifier modifier = DrawBehindElement.read(companion7, clipKtRemoteActionCompatParcelizer, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3);
                    MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
                    int iHashCode3 = Long.hashCode(getpostalcode.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode.serializer();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
                    ComposeUiNode.Companion companion8 = ComposeUiNode.Companion;
                    constructor2 = companion8.getConstructor();
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor2);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    af$$ExternalSyntheticOutline0.m(companion8, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion8, getpostalcode, Integer.valueOf(iHashCode3), getpostalcode));
                    Modifier modifierWrite2 = PaddingKt.write(SizeKt.write(companion7, 1.0f), Dimensions.setLogo);
                    String str2 = storeInfoUtil.IconCompatParcelizer;
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.IconCompatParcelizer;
                    z2 = getpostalcode.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    objComponentActivity4 = getpostalcode.ComponentActivity();
                    if (z2) {
                        objComponentActivity4 = new r8lambdaFy5cFs23n4jmTZ3pAoKFIBBQQ(9, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                        getpostalcode.write(objComponentActivity4);
                    } else {
                        int i12 = MediaMetadataCompat + 25;
                        MediaDescriptionCompat = i12 % Fields.SpotShadowColor;
                        int i13 = i12 % 2;
                        if (objComponentActivity4 == androidContentCaptureManager) {
                            objComponentActivity4 = new r8lambdaFy5cFs23n4jmTZ3pAoKFIBBQQ(9, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                            getpostalcode.write(objComponentActivity4);
                        }
                    }
                    isValidParameter.RemoteActionCompatParcelizer(str2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity4, modifierWrite2, false, false, null, null, null, null, getpostalcode, 0, 1016);
                    getpostalcode.IconCompatParcelizer(true);
                    getpostalcode.IconCompatParcelizer(false);
                    if (drawBehindElement.MediaSessionCompatQueueItem != i) {
                        i2 = MediaDescriptionCompat + 81;
                        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
                        if (i2 % 2 != 0) {
                            getPhoneNumberNational.write(r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getpostalcode);
                            int i14 = 52 / 0;
                        } else {
                            getPhoneNumberNational.write(r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getpostalcode);
                        }
                    }
                }
            } else {
                int i15 = MediaMetadataCompat + 27;
                MediaDescriptionCompat = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                populateViewStructure_androidKtpopulate7.setValue(createfromparcel2);
                i = drawBehindElement.MediaSessionCompatQueueItem;
                drawBehindElement.read();
                getpostalcode = (getPostalCode) getbirthdatefull;
                getpostalcode.serializer(1555814369);
                getaddresscountry = getpostalcode.read;
                DrawBehindElement drawBehindElement3 = (DrawBehindElement) drawBehindElement.serializer().serializer;
                ClipKt clipKtRemoteActionCompatParcelizer9 = drawBehindElement3.RemoteActionCompatParcelizer();
                clipKtRemoteActionCompatParcelizer = drawBehindElement3.RemoteActionCompatParcelizer();
                clipKtRemoteActionCompatParcelizer2 = drawBehindElement3.RemoteActionCompatParcelizer();
                scrollState = PagerWrapperFlingBehavior.read(0, getpostalcode, 1);
                companion = Modifier.Companion;
                z = getpostalcode.read(clipKtRemoteActionCompatParcelizer);
                objComponentActivity = getpostalcode.ComponentActivity();
                if (z) {
                    objComponentActivity = new readConnectionResponse(clipKtRemoteActionCompatParcelizer, 9);
                    getpostalcode.write(objComponentActivity);
                } else {
                    objComponentActivity = new readConnectionResponse(clipKtRemoteActionCompatParcelizer, 9);
                    getpostalcode.write(objComponentActivity);
                }
                Modifier modifierWrite3 = SizeKt.write(DrawBehindElement.read(companion, clipKtRemoteActionCompatParcelizer9, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity), 1.0f);
                f = Dimensions.setLogo;
                createfromparcel2 = createfromparcel2;
                Modifier modifierIconCompatParcelizer2 = PagerWrapperFlingBehavior.IconCompatParcelizer(PaddingKt.m73paddingVpY3zN4$default(modifierWrite3, f, 0.0f, 2), scrollState, false, 14);
                modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
                iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierIconCompatParcelizer2);
                companion2 = ComposeUiNode.Companion;
                constructor = companion2.getConstructor();
                if (getaddresscountry != null) {
                    SentryUUID.write();
                    throw null;
                }
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!getpostalcode.ComponentActivity) {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                } else {
                    getpostalcode.serializer(constructor);
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion, f)});
                TextKt.m131TextNvy7gAk(storeInfoUtil.RemoteActionCompatParcelizer, SizeKt.write(companion, 1.0f), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setHideOnContentScrollEnabled(), 0L, null, null, 0L, TextAlign.m3504boximpl(TextAlign.Companion.m3516getStarte0LSkKk()), 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatResultReceiverWrapper(), getpostalcode, 48, 0, 130040);
                getpostalcode.serializer(-1097432905);
                while (r3.hasNext()) {
                    String str3 = setinstalltracked.IconCompatParcelizer;
                    Modifier.Companion companion9 = Modifier.Companion;
                    Modifier modifierM74paddingqDBjuR0$default2 = PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion9, 1.0f), 0.0f, Dimensions.setLogo, 0.0f, 0.0f, 13);
                    TextAlign.Companion companion10 = TextAlign.Companion;
                    int iM3516getStarte0LSkKk2 = companion10.m3516getStarte0LSkKk();
                    TextStyle textStyleMediaSessionCompatToken2 = performLayout.MediaSessionCompatToken();
                    setCurrentSemanticsNodesui setcurrentsemanticsnodesui2 = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                    TextKt.m131TextNvy7gAk(str3, modifierM74paddingqDBjuR0$default2, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui2)).setMenu(), 0L, null, null, 0L, TextAlign.m3504boximpl(iM3516getStarte0LSkKk2), 0L, 0, false, 0, 0, null, textStyleMediaSessionCompatToken2, getpostalcode, 0, 0, 130040);
                    TextKt.m131TextNvy7gAk(setinstalltracked.read, PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion9, 1.0f), 0.0f, Dimensions.getActionBarHideOffset, 0.0f, 0.0f, 13), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui2)).getActionBarHideOffset(), 0L, null, null, 0L, TextAlign.m3504boximpl(companion10.m3516getStarte0LSkKk()), 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 0, 0, 130040);
                }
                getpostalcode.IconCompatParcelizer(false);
                getpostalcode.IconCompatParcelizer(true);
                objComponentActivity2 = getpostalcode.ComponentActivity();
                if (objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = CompositionKt.serializer(new r8lambdaFy5cFs23n4jmTZ3pAoKFIBBQQ(10, scrollState));
                    getpostalcode.write(objComponentActivity2);
                }
                if (((Boolean) ((onViewAttachedToWindow) objComponentActivity2).getValue()).booleanValue()) {
                    getpostalcode.serializer(1557589118);
                    Modifier.Companion companion11 = Modifier.Companion;
                    z3 = getpostalcode.read(clipKtRemoteActionCompatParcelizer);
                    objComponentActivity5 = getpostalcode.ComponentActivity();
                    if (z3) {
                        objComponentActivity5 = new readConnectionResponse(clipKtRemoteActionCompatParcelizer, 10);
                        getpostalcode.write(objComponentActivity5);
                    } else {
                        objComponentActivity5 = new readConnectionResponse(clipKtRemoteActionCompatParcelizer, 10);
                        getpostalcode.write(objComponentActivity5);
                    }
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, BackgroundKt.background$default(SizeKt.m75height3ABfNKs(SizeKt.write(DrawBehindElement.read(companion11, clipKtRemoteActionCompatParcelizer2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity5), 1.0f), Dimensions.setLogo), Brush.Companion.m677verticalGradient8A3gB4$default(Brush.Companion, SQLite.read(Color.m712boximpl(Color.Companion.m757getTransparent0d7_KjU()), Color.m712boximpl(((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme())), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6)});
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(1558157069);
                    getpostalcode.IconCompatParcelizer(false);
                }
                Modifier.Companion companion12 = Modifier.Companion;
                objComponentActivity3 = getpostalcode.ComponentActivity();
                if (objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = getInitiatingPackageName.RemoteActionCompatParcelizer;
                    getpostalcode.write(objComponentActivity3);
                }
                Modifier modifier2 = DrawBehindElement.read(companion12, clipKtRemoteActionCompatParcelizer, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3);
                MeasurePolicy measurePolicy2 = BoxKt.read(Alignment.Companion.getTopStart(), false);
                int iHashCode4 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer4 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(getpostalcode, modifier2);
                ComposeUiNode.Companion companion13 = ComposeUiNode.Companion;
                constructor2 = companion13.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor2);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion13, getpostalcode, measurePolicy2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer4);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier4, m1$$ExternalSyntheticOutline0.m(companion13, getpostalcode, Integer.valueOf(iHashCode4), getpostalcode));
                Modifier modifierWrite4 = PaddingKt.write(SizeKt.write(companion12, 1.0f), Dimensions.setLogo);
                String str4 = storeInfoUtil.IconCompatParcelizer;
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.IconCompatParcelizer;
                z2 = getpostalcode.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                objComponentActivity4 = getpostalcode.ComponentActivity();
                if (z2) {
                    int i17 = MediaMetadataCompat + 25;
                    MediaDescriptionCompat = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    if (objComponentActivity4 == androidContentCaptureManager) {
                        objComponentActivity4 = new r8lambdaFy5cFs23n4jmTZ3pAoKFIBBQQ(9, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                        getpostalcode.write(objComponentActivity4);
                    }
                } else {
                    objComponentActivity4 = new r8lambdaFy5cFs23n4jmTZ3pAoKFIBBQQ(9, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    getpostalcode.write(objComponentActivity4);
                }
                isValidParameter.RemoteActionCompatParcelizer(str4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity4, modifierWrite4, false, false, null, null, null, null, getpostalcode, 0, 1016);
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(false);
                if (drawBehindElement.MediaSessionCompatQueueItem != i) {
                    i2 = MediaDescriptionCompat + 81;
                    MediaMetadataCompat = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        getPhoneNumberNational.write(r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getpostalcode);
                        int i19 = 52 / 0;
                    } else {
                        getPhoneNumberNational.write(r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getpostalcode);
                    }
                }
            }
            return createfromparcel2;
        }
        if (i9 == 1) {
            getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
            recordmLhObY recordmlhoby = (recordmLhObY) obj3;
            if ((((Number) obj2).intValue() & 3) == 2) {
                getPostalCode getpostalcode5 = (getPostalCode) getbirthdatefull2;
                if (getpostalcode5.MediaSessionCompatToken()) {
                    getpostalcode5.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    return createfromparcel;
                }
            }
            populateViewStructure_androidKtpopulate7.setValue(createfromparcel);
            int i20 = drawBehindElement.MediaSessionCompatQueueItem;
            drawBehindElement.read();
            getPostalCode getpostalcode6 = (getPostalCode) getbirthdatefull2;
            getpostalcode6.serializer(-582999483);
            DrawBehindElement drawBehindElement4 = (DrawBehindElement) drawBehindElement.serializer().serializer;
            ClipKt clipKtRemoteActionCompatParcelizer10 = drawBehindElement4.RemoteActionCompatParcelizer();
            ClipKt clipKtRemoteActionCompatParcelizer11 = drawBehindElement4.RemoteActionCompatParcelizer();
            ClipKt clipKtRemoteActionCompatParcelizer12 = drawBehindElement4.RemoteActionCompatParcelizer();
            ClipKt clipKtRemoteActionCompatParcelizer13 = drawBehindElement4.RemoteActionCompatParcelizer();
            clip clipVar = DrawBehindElement.read(drawBehindElement, new onBuildCache[]{clipKtRemoteActionCompatParcelizer13, clipKtRemoteActionCompatParcelizer12});
            String str5 = recordmlhoby.MediaBrowserCompatMediaItem;
            TextStyle textStyleIconCompatParcelizer = performLayout.IconCompatParcelizer();
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui3 = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            long presenter = ((buildMapping) getpostalcode6.write((getNewPassword) setcurrentsemanticsnodesui3)).setPresenter();
            int iM3569getEllipsisgIe3tQ8 = TextOverflow.Companion.m3569getEllipsisgIe3tQ8();
            Modifier.Companion companion14 = Modifier.Companion;
            boolean z10 = getpostalcode6.read(clipKtRemoteActionCompatParcelizer12);
            boolean z11 = getpostalcode6.read(clipKtRemoteActionCompatParcelizer11);
            Object objComponentActivity13 = getpostalcode6.ComponentActivity();
            if ((z10 | z11) || objComponentActivity13 == androidContentCaptureManager) {
                objComponentActivity13 = new v2(clipKtRemoteActionCompatParcelizer12, clipKtRemoteActionCompatParcelizer11, 3);
                getpostalcode6.write(objComponentActivity13);
            }
            TextKt.m131TextNvy7gAk(str5, DrawBehindElement.read(companion14, clipKtRemoteActionCompatParcelizer10, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity13), presenter, 0L, null, null, 0L, null, 0L, iM3569getEllipsisgIe3tQ8, false, 1, 0, null, textStyleIconCompatParcelizer, getpostalcode6, 0, 24960, 110584);
            String str6 = recordmlhoby.RemoteActionCompatParcelizer;
            TextStyle textStyleIconCompatParcelizer2 = performLayout.IconCompatParcelizer();
            long presenter2 = ((buildMapping) getpostalcode6.write((getNewPassword) setcurrentsemanticsnodesui3)).setPresenter();
            boolean z12 = getpostalcode6.read(clipKtRemoteActionCompatParcelizer12);
            boolean z13 = getpostalcode6.read(clipKtRemoteActionCompatParcelizer10);
            boolean z14 = getpostalcode6.read(clipVar);
            Object objComponentActivity14 = getpostalcode6.ComponentActivity();
            if ((z12 | z13 | z14) || objComponentActivity14 == androidContentCaptureManager) {
                objComponentActivity14 = new getStrokeCapKaPHkGw(clipKtRemoteActionCompatParcelizer12, clipKtRemoteActionCompatParcelizer10, clipVar, 3);
                getpostalcode6.write(objComponentActivity14);
            }
            TextKt.m131TextNvy7gAk(str6, DrawBehindElement.read(companion14, clipKtRemoteActionCompatParcelizer11, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity14), presenter2, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, textStyleIconCompatParcelizer2, getpostalcode6, 0, 24576, 114680);
            boolean z15 = getpostalcode6.read(clipKtRemoteActionCompatParcelizer11);
            boolean z16 = getpostalcode6.read(clipKtRemoteActionCompatParcelizer12);
            Object objComponentActivity15 = getpostalcode6.ComponentActivity();
            if (!(!(z15 | z16)) || objComponentActivity15 == androidContentCaptureManager) {
                objComponentActivity15 = new v2(clipKtRemoteActionCompatParcelizer11, clipKtRemoteActionCompatParcelizer12, 4);
                getpostalcode6.write(objComponentActivity15);
            }
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode6, DrawBehindElement.read(companion14, clipKtRemoteActionCompatParcelizer13, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity15)});
            getPushAlert getpushalert = new getPushAlert(((buildMapping) getpostalcode6.write((getNewPassword) setcurrentsemanticsnodesui3)).ComposePredictiveBackHandlerlaunchNewGesture11(), ((buildMapping) getpostalcode6.write((getNewPassword) setcurrentsemanticsnodesui3)).BackHandlerKtExternalSyntheticLambda1(), ((buildMapping) getpostalcode6.write((getNewPassword) setcurrentsemanticsnodesui3)).PredictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1());
            Object objComponentActivity16 = getpostalcode6.ComponentActivity();
            if (objComponentActivity16 == androidContentCaptureManager) {
                objComponentActivity16 = getSelectiond9O1mEEui_text.write;
                getpostalcode6.write(objComponentActivity16);
                int i21 = MediaDescriptionCompat + 55;
                MediaMetadataCompat = i21 % Fields.SpotShadowColor;
                int i22 = i21 % 2;
            }
            getRootCause.write(R.drawable.ic_bold_large_cancel_thin, this.IconCompatParcelizer, DrawBehindElement.read(companion14, clipKtRemoteActionCompatParcelizer12, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity16), getpushalert, false, null, null, getpostalcode6, 0, 240);
            getpostalcode6.IconCompatParcelizer(false);
            if (drawBehindElement.MediaSessionCompatQueueItem == i20) {
                return createfromparcel;
            }
            getPhoneNumberNational.write(r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getpostalcode6);
            return createfromparcel;
        }
        if (i9 == 2) {
            getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj;
            if ((((Number) obj2).intValue() & 3) == 2) {
                getPostalCode getpostalcode7 = (getPostalCode) getbirthdatefull3;
                if (getpostalcode7.MediaSessionCompatToken()) {
                    getpostalcode7.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    int i23 = MediaMetadataCompat + 33;
                    MediaDescriptionCompat = i23 % Fields.SpotShadowColor;
                    int i24 = i23 % 2;
                    populateViewStructure_androidKtpopulate7.setValue(createfromparcel);
                    i3 = drawBehindElement.MediaSessionCompatQueueItem;
                    drawBehindElement.read();
                    getpostalcode2 = (getPostalCode) getbirthdatefull3;
                    getpostalcode2.serializer(-1759292897);
                    DrawBehindElement drawBehindElement5 = (DrawBehindElement) drawBehindElement.serializer().serializer;
                    clipKtRemoteActionCompatParcelizer3 = drawBehindElement5.RemoteActionCompatParcelizer();
                    clipKtRemoteActionCompatParcelizer4 = drawBehindElement5.RemoteActionCompatParcelizer();
                    ClipKt clipKtRemoteActionCompatParcelizer14 = drawBehindElement5.RemoteActionCompatParcelizer();
                    clipKtRemoteActionCompatParcelizer5 = drawBehindElement5.RemoteActionCompatParcelizer();
                    Modifier.Companion companion15 = Modifier.Companion;
                    objComponentActivity6 = getpostalcode2.ComponentActivity();
                    if (objComponentActivity6 == androidContentCaptureManager) {
                        objComponentActivity6 = getSelectiond9O1mEEui_text.read;
                        getpostalcode2.write(objComponentActivity6);
                    }
                    Modifier modifierM74paddingqDBjuR0$default3 = PaddingKt.m74paddingqDBjuR0$default(DrawBehindElement.read(companion15, clipKtRemoteActionCompatParcelizer4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity6), 0.0f, 0.0f, Dimensions.getActionBarHideOffset, 0.0f, 11);
                    Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_bold_medium_help_customer_support, getpostalcode2, 0);
                    setCurrentSemanticsNodesui setcurrentsemanticsnodesui4 = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                    IconKt.m116Iconww6aTOc(painterPainterResource, (String) null, modifierM74paddingqDBjuR0$default3, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui4)).setPresenter(), getpostalcode2, Painter.$stable | 48, 0);
                    String strStringResource = StringResources_androidKt.stringResource(R.string.dispatcher_chat_notifications_title, getpostalcode2, 0);
                    TextStyle textStyleIconCompatParcelizer3 = performLayout.IconCompatParcelizer();
                    long presenter3 = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui4)).setPresenter();
                    z4 = getpostalcode2.read(clipKtRemoteActionCompatParcelizer4);
                    objComponentActivity7 = getpostalcode2.ComponentActivity();
                    if (z4 || objComponentActivity7 == androidContentCaptureManager) {
                        objComponentActivity7 = new readConnectionResponse(clipKtRemoteActionCompatParcelizer4, 3);
                        getpostalcode2.write(objComponentActivity7);
                    }
                    TextKt.m131TextNvy7gAk(strStringResource, DrawBehindElement.read(companion15, clipKtRemoteActionCompatParcelizer3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity7), presenter3, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, textStyleIconCompatParcelizer3, getpostalcode2, 0, 24576, 114680);
                    TextStyle textStyleIconCompatParcelizer4 = performLayout.IconCompatParcelizer();
                    long presenter4 = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui4)).setPresenter();
                    int iM3569getEllipsisgIe3tQ9 = TextOverflow.Companion.m3569getEllipsisgIe3tQ8();
                    z5 = getpostalcode2.read(clipKtRemoteActionCompatParcelizer3);
                    z6 = getpostalcode2.read(clipKtRemoteActionCompatParcelizer5);
                    objComponentActivity8 = getpostalcode2.ComponentActivity();
                    if (z5 || z6) {
                        objComponentActivity8 = new v2(clipKtRemoteActionCompatParcelizer3, clipKtRemoteActionCompatParcelizer5, 5);
                        getpostalcode2.write(objComponentActivity8);
                    } else {
                        int i25 = MediaMetadataCompat + 19;
                        MediaDescriptionCompat = i25 % Fields.SpotShadowColor;
                        int i26 = i25 % 2;
                        if (objComponentActivity8 == androidContentCaptureManager) {
                            objComponentActivity8 = new v2(clipKtRemoteActionCompatParcelizer3, clipKtRemoteActionCompatParcelizer5, 5);
                            getpostalcode2.write(objComponentActivity8);
                        }
                    }
                    TextKt.m131TextNvy7gAk((String) obj3, DrawBehindElement.read(companion15, clipKtRemoteActionCompatParcelizer14, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity8), presenter4, 0L, null, null, 0L, null, 0L, iM3569getEllipsisgIe3tQ9, false, 1, 0, null, textStyleIconCompatParcelizer4, getpostalcode2, 0, 24960, 110584);
                    getPushAlert getpushalert2 = new getPushAlert(((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui4)).ComposePredictiveBackHandlerlaunchNewGesture11(), ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui4)).BackHandlerKtExternalSyntheticLambda1(), ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui4)).PredictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1());
                    objComponentActivity9 = getpostalcode2.ComponentActivity();
                    if (objComponentActivity9 == androidContentCaptureManager) {
                        objComponentActivity9 = getSelectiond9O1mEEui_text.serializer;
                        getpostalcode2.write(objComponentActivity9);
                    }
                    getRootCause.write(R.drawable.ic_bold_large_cancel_thin, this.IconCompatParcelizer, PaddingKt.m74paddingqDBjuR0$default(DrawBehindElement.read(companion15, clipKtRemoteActionCompatParcelizer5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity9), 0.0f, 0.0f, Dimensions.getNestedScrollAxes, 0.0f, 11), getpushalert2, false, null, null, getpostalcode2, 0, 240);
                    getpostalcode2.IconCompatParcelizer(false);
                    if (drawBehindElement.MediaSessionCompatQueueItem != i3) {
                        getPhoneNumberNational.write(r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getpostalcode2);
                    }
                }
            } else {
                int i27 = MediaMetadataCompat + 33;
                MediaDescriptionCompat = i27 % Fields.SpotShadowColor;
                int i28 = i27 % 2;
                populateViewStructure_androidKtpopulate7.setValue(createfromparcel);
                i3 = drawBehindElement.MediaSessionCompatQueueItem;
                drawBehindElement.read();
                getpostalcode2 = (getPostalCode) getbirthdatefull3;
                getpostalcode2.serializer(-1759292897);
                DrawBehindElement drawBehindElement6 = (DrawBehindElement) drawBehindElement.serializer().serializer;
                clipKtRemoteActionCompatParcelizer3 = drawBehindElement6.RemoteActionCompatParcelizer();
                clipKtRemoteActionCompatParcelizer4 = drawBehindElement6.RemoteActionCompatParcelizer();
                ClipKt clipKtRemoteActionCompatParcelizer15 = drawBehindElement6.RemoteActionCompatParcelizer();
                clipKtRemoteActionCompatParcelizer5 = drawBehindElement6.RemoteActionCompatParcelizer();
                Modifier.Companion companion16 = Modifier.Companion;
                objComponentActivity6 = getpostalcode2.ComponentActivity();
                if (objComponentActivity6 == androidContentCaptureManager) {
                    objComponentActivity6 = getSelectiond9O1mEEui_text.read;
                    getpostalcode2.write(objComponentActivity6);
                }
                Modifier modifierM74paddingqDBjuR0$default4 = PaddingKt.m74paddingqDBjuR0$default(DrawBehindElement.read(companion16, clipKtRemoteActionCompatParcelizer4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity6), 0.0f, 0.0f, Dimensions.getActionBarHideOffset, 0.0f, 11);
                Painter painterPainterResource2 = PainterResources_androidKt.painterResource(R.drawable.ic_bold_medium_help_customer_support, getpostalcode2, 0);
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui5 = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                IconKt.m116Iconww6aTOc(painterPainterResource2, (String) null, modifierM74paddingqDBjuR0$default4, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui5)).setPresenter(), getpostalcode2, Painter.$stable | 48, 0);
                String strStringResource2 = StringResources_androidKt.stringResource(R.string.dispatcher_chat_notifications_title, getpostalcode2, 0);
                TextStyle textStyleIconCompatParcelizer5 = performLayout.IconCompatParcelizer();
                long presenter5 = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui5)).setPresenter();
                z4 = getpostalcode2.read(clipKtRemoteActionCompatParcelizer4);
                objComponentActivity7 = getpostalcode2.ComponentActivity();
                if (z4) {
                    objComponentActivity7 = new readConnectionResponse(clipKtRemoteActionCompatParcelizer4, 3);
                    getpostalcode2.write(objComponentActivity7);
                } else {
                    objComponentActivity7 = new readConnectionResponse(clipKtRemoteActionCompatParcelizer4, 3);
                    getpostalcode2.write(objComponentActivity7);
                }
                TextKt.m131TextNvy7gAk(strStringResource2, DrawBehindElement.read(companion16, clipKtRemoteActionCompatParcelizer3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity7), presenter5, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, textStyleIconCompatParcelizer5, getpostalcode2, 0, 24576, 114680);
                TextStyle textStyleIconCompatParcelizer6 = performLayout.IconCompatParcelizer();
                long presenter6 = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui5)).setPresenter();
                int iM3569getEllipsisgIe3tQ10 = TextOverflow.Companion.m3569getEllipsisgIe3tQ8();
                z5 = getpostalcode2.read(clipKtRemoteActionCompatParcelizer3);
                z6 = getpostalcode2.read(clipKtRemoteActionCompatParcelizer5);
                objComponentActivity8 = getpostalcode2.ComponentActivity();
                if (z5 || z6) {
                    objComponentActivity8 = new v2(clipKtRemoteActionCompatParcelizer3, clipKtRemoteActionCompatParcelizer5, 5);
                    getpostalcode2.write(objComponentActivity8);
                } else {
                    int i29 = MediaMetadataCompat + 19;
                    MediaDescriptionCompat = i29 % Fields.SpotShadowColor;
                    int i210 = i29 % 2;
                    if (objComponentActivity8 == androidContentCaptureManager) {
                        objComponentActivity8 = new v2(clipKtRemoteActionCompatParcelizer3, clipKtRemoteActionCompatParcelizer5, 5);
                        getpostalcode2.write(objComponentActivity8);
                    }
                }
                TextKt.m131TextNvy7gAk((String) obj3, DrawBehindElement.read(companion16, clipKtRemoteActionCompatParcelizer15, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity8), presenter6, 0L, null, null, 0L, null, 0L, iM3569getEllipsisgIe3tQ10, false, 1, 0, null, textStyleIconCompatParcelizer6, getpostalcode2, 0, 24960, 110584);
                getPushAlert getpushalert3 = new getPushAlert(((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui5)).ComposePredictiveBackHandlerlaunchNewGesture11(), ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui5)).BackHandlerKtExternalSyntheticLambda1(), ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui5)).PredictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1());
                objComponentActivity9 = getpostalcode2.ComponentActivity();
                if (objComponentActivity9 == androidContentCaptureManager) {
                    objComponentActivity9 = getSelectiond9O1mEEui_text.serializer;
                    getpostalcode2.write(objComponentActivity9);
                }
                getRootCause.write(R.drawable.ic_bold_large_cancel_thin, this.IconCompatParcelizer, PaddingKt.m74paddingqDBjuR0$default(DrawBehindElement.read(companion16, clipKtRemoteActionCompatParcelizer5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity9), 0.0f, 0.0f, Dimensions.getNestedScrollAxes, 0.0f, 11), getpushalert3, false, null, null, getpostalcode2, 0, 240);
                getpostalcode2.IconCompatParcelizer(false);
                if (drawBehindElement.MediaSessionCompatQueueItem != i3) {
                    getPhoneNumberNational.write(r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getpostalcode2);
                }
            }
            return createfromparcel;
        }
        getBirthDateFull getbirthdatefull4 = (getBirthDateFull) obj;
        r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq = (r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ) obj3;
        if ((((Number) obj2).intValue() & 3) == 2) {
            getPostalCode getpostalcode8 = (getPostalCode) getbirthdatefull4;
            if (getpostalcode8.MediaSessionCompatToken()) {
                getpostalcode8.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            } else {
                populateViewStructure_androidKtpopulate7.setValue(createfromparcel);
                i4 = drawBehindElement.MediaSessionCompatQueueItem;
                drawBehindElement.read();
                getpostalcode3 = (getPostalCode) getbirthdatefull4;
                getpostalcode3.serializer(187208027);
                DrawBehindElement drawBehindElement7 = (DrawBehindElement) drawBehindElement.serializer().serializer;
                clipKtRemoteActionCompatParcelizer6 = drawBehindElement7.RemoteActionCompatParcelizer();
                clipKtRemoteActionCompatParcelizer7 = drawBehindElement7.RemoteActionCompatParcelizer();
                ClipKt clipKtRemoteActionCompatParcelizer16 = drawBehindElement7.RemoteActionCompatParcelizer();
                Modifier.Companion companion17 = Modifier.Companion;
                float f2 = Dimensions.removeOnPictureInPictureModeChangedListener;
                Modifier modifierM84sizeVpY3zN4 = SizeKt.m84sizeVpY3zN4(companion17, f2, f2);
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui6 = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifierM84sizeVpY3zN4, ((buildMapping) getpostalcode3.write((getNewPassword) setcurrentsemanticsnodesui6)).getPopupTheme(), RoundedCornerShapeKt.IconCompatParcelizer);
                objComponentActivity10 = getpostalcode3.ComponentActivity();
                if (objComponentActivity10 == androidContentCaptureManager) {
                    i7 = MediaDescriptionCompat + 97;
                    MediaMetadataCompat = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 == 0) {
                        getpostalcode3.write(ComposeViewAdapterExternalSyntheticLambda2.RemoteActionCompatParcelizer);
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                    ComposeViewAdapterExternalSyntheticLambda2 composeViewAdapterExternalSyntheticLambda2 = ComposeViewAdapterExternalSyntheticLambda2.RemoteActionCompatParcelizer;
                    getpostalcode3.write(composeViewAdapterExternalSyntheticLambda2);
                    int i30 = MediaMetadataCompat + 125;
                    MediaDescriptionCompat = i30 % Fields.SpotShadowColor;
                    int i31 = i30 % 2;
                    objComponentActivity10 = composeViewAdapterExternalSyntheticLambda2;
                }
                getRootCause.write(R.drawable.ic_bold_medium_cancel_thin, this.IconCompatParcelizer, DrawBehindElement.read(modifierM20backgroundbw27NRU, clipKtRemoteActionCompatParcelizer6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity10), new getPushAlert(((buildMapping) getpostalcode3.write((getNewPassword) setcurrentsemanticsnodesui6)).setEmojiCompatEnabled(), ((buildMapping) getpostalcode3.write((getNewPassword) setcurrentsemanticsnodesui6)).setEmojiCompatEnabled(), ((buildMapping) getpostalcode3.write((getNewPassword) setcurrentsemanticsnodesui6)).invokeSuspend()), false, null, null, getpostalcode3, 0, 240);
                float f3 = Dimensions.setTabContainer;
                Modifier modifierM74paddingqDBjuR0$default5 = PaddingKt.m74paddingqDBjuR0$default(companion17, 0.0f, f3, 0.0f, 0.0f, 13);
                z7 = getpostalcode3.read(clipKtRemoteActionCompatParcelizer6);
                objComponentActivity11 = getpostalcode3.ComponentActivity();
                if (z7 || objComponentActivity11 == androidContentCaptureManager) {
                    objComponentActivity11 = new readConnectionResponse(clipKtRemoteActionCompatParcelizer6, 4);
                    getpostalcode3.write(objComponentActivity11);
                }
                getNonZeroRgk1Os.write(Integer.valueOf(R.drawable.img_large_brand_logo_white), null, DrawBehindElement.read(modifierM74paddingqDBjuR0$default5, clipKtRemoteActionCompatParcelizer7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity11), Okio.RemoteActionCompatParcelizer(R.drawable.img_large_brand_logo_white, getpostalcode3, 0), null, null, null, null, null, null, getpostalcode3, (Painter.$stable << 9) | 48, 0, 32752);
                Modifier modifierM74paddingqDBjuR0$default6 = PaddingKt.m74paddingqDBjuR0$default(companion17, f3, Dimensions.getTitle, f3, 0.0f, 8);
                z8 = getpostalcode3.read(clipKtRemoteActionCompatParcelizer7);
                objComponentActivity12 = getpostalcode3.ComponentActivity();
                if (z8) {
                    objComponentActivity12 = new readConnectionResponse(clipKtRemoteActionCompatParcelizer7, 5);
                    getpostalcode3.write(objComponentActivity12);
                } else {
                    i6 = MediaDescriptionCompat + 125;
                    MediaMetadataCompat = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 == 0) {
                        throw null;
                    }
                    if (objComponentActivity12 == androidContentCaptureManager) {
                        objComponentActivity12 = new readConnectionResponse(clipKtRemoteActionCompatParcelizer7, 5);
                        getpostalcode3.write(objComponentActivity12);
                    }
                }
                Modifier modifier3 = DrawBehindElement.read(modifierM74paddingqDBjuR0$default6, clipKtRemoteActionCompatParcelizer16, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity12);
                modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getCenterHorizontally(), getpostalcode3, 48);
                iHashCode2 = Long.hashCode(getpostalcode3.RatingCompat);
                dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode3.serializer();
                modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode3, modifier3);
                companion3 = ComposeUiNode.Companion;
                constructor3 = companion3.getConstructor();
                if (getpostalcode3.read != null) {
                    SentryUUID.write();
                    throw null;
                }
                i5 = MediaMetadataCompat + 85;
                MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    boolean z17 = getpostalcode3.ComponentActivity;
                    throw null;
                }
                getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode3.ComponentActivity) {
                    getpostalcode3.serializer(constructor3);
                } else {
                    getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode3, modalBottomSheetYbuCTN8Serializer2, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode3, Integer.valueOf(iHashCode2), getpostalcode3));
                if (r8lambdaiidsddyirtymdul5lt6pmt2zysq.size() == 1) {
                    getpostalcode3.serializer(-1736128362);
                    z9 = false;
                    FullScreenDetailsContentKt.RemoteActionCompatParcelizer((FullscreenDetailUi) onContentCardDismissed.read((List) r8lambdaiidsddyirtymdul5lt6pmt2zysq), getpostalcode3, 0);
                    getpostalcode3.IconCompatParcelizer(false);
                } else {
                    z9 = false;
                    getpostalcode3.serializer(-1736007958);
                    FullScreenDetailsContentKt.write(removeNodeAtDepth.read(r8lambdaiidsddyirtymdul5lt6pmt2zysq), getpostalcode3, 0);
                    getpostalcode3.IconCompatParcelizer(false);
                }
                getpostalcode3.IconCompatParcelizer(true);
                getpostalcode3.IconCompatParcelizer(z9);
                if (drawBehindElement.MediaSessionCompatQueueItem != i4) {
                    getPhoneNumberNational.write(r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getpostalcode3);
                }
            }
        } else {
            populateViewStructure_androidKtpopulate7.setValue(createfromparcel);
            i4 = drawBehindElement.MediaSessionCompatQueueItem;
            drawBehindElement.read();
            getpostalcode3 = (getPostalCode) getbirthdatefull4;
            getpostalcode3.serializer(187208027);
            DrawBehindElement drawBehindElement8 = (DrawBehindElement) drawBehindElement.serializer().serializer;
            clipKtRemoteActionCompatParcelizer6 = drawBehindElement8.RemoteActionCompatParcelizer();
            clipKtRemoteActionCompatParcelizer7 = drawBehindElement8.RemoteActionCompatParcelizer();
            ClipKt clipKtRemoteActionCompatParcelizer17 = drawBehindElement8.RemoteActionCompatParcelizer();
            Modifier.Companion companion18 = Modifier.Companion;
            float f4 = Dimensions.removeOnPictureInPictureModeChangedListener;
            Modifier modifierM84sizeVpY3zN5 = SizeKt.m84sizeVpY3zN4(companion18, f4, f4);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui7 = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierM20backgroundbw27NRU2 = BackgroundKt.m20backgroundbw27NRU(modifierM84sizeVpY3zN5, ((buildMapping) getpostalcode3.write((getNewPassword) setcurrentsemanticsnodesui7)).getPopupTheme(), RoundedCornerShapeKt.IconCompatParcelizer);
            objComponentActivity10 = getpostalcode3.ComponentActivity();
            if (objComponentActivity10 == androidContentCaptureManager) {
                i7 = MediaDescriptionCompat + 97;
                MediaMetadataCompat = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    getpostalcode3.write(ComposeViewAdapterExternalSyntheticLambda2.RemoteActionCompatParcelizer);
                    Object obj5 = null;
                    obj5.hashCode();
                    throw null;
                }
                ComposeViewAdapterExternalSyntheticLambda2 composeViewAdapterExternalSyntheticLambda3 = ComposeViewAdapterExternalSyntheticLambda2.RemoteActionCompatParcelizer;
                getpostalcode3.write(composeViewAdapterExternalSyntheticLambda3);
                int i32 = MediaMetadataCompat + 125;
                MediaDescriptionCompat = i32 % Fields.SpotShadowColor;
                int i33 = i32 % 2;
                objComponentActivity10 = composeViewAdapterExternalSyntheticLambda3;
            }
            getRootCause.write(R.drawable.ic_bold_medium_cancel_thin, this.IconCompatParcelizer, DrawBehindElement.read(modifierM20backgroundbw27NRU2, clipKtRemoteActionCompatParcelizer6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity10), new getPushAlert(((buildMapping) getpostalcode3.write((getNewPassword) setcurrentsemanticsnodesui7)).setEmojiCompatEnabled(), ((buildMapping) getpostalcode3.write((getNewPassword) setcurrentsemanticsnodesui7)).setEmojiCompatEnabled(), ((buildMapping) getpostalcode3.write((getNewPassword) setcurrentsemanticsnodesui7)).invokeSuspend()), false, null, null, getpostalcode3, 0, 240);
            float f5 = Dimensions.setTabContainer;
            Modifier modifierM74paddingqDBjuR0$default7 = PaddingKt.m74paddingqDBjuR0$default(companion18, 0.0f, f5, 0.0f, 0.0f, 13);
            z7 = getpostalcode3.read(clipKtRemoteActionCompatParcelizer6);
            objComponentActivity11 = getpostalcode3.ComponentActivity();
            if (z7) {
                objComponentActivity11 = new readConnectionResponse(clipKtRemoteActionCompatParcelizer6, 4);
                getpostalcode3.write(objComponentActivity11);
            } else {
                objComponentActivity11 = new readConnectionResponse(clipKtRemoteActionCompatParcelizer6, 4);
                getpostalcode3.write(objComponentActivity11);
            }
            getNonZeroRgk1Os.write(Integer.valueOf(R.drawable.img_large_brand_logo_white), null, DrawBehindElement.read(modifierM74paddingqDBjuR0$default7, clipKtRemoteActionCompatParcelizer7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity11), Okio.RemoteActionCompatParcelizer(R.drawable.img_large_brand_logo_white, getpostalcode3, 0), null, null, null, null, null, null, getpostalcode3, (Painter.$stable << 9) | 48, 0, 32752);
            Modifier modifierM74paddingqDBjuR0$default8 = PaddingKt.m74paddingqDBjuR0$default(companion18, f5, Dimensions.getTitle, f5, 0.0f, 8);
            z8 = getpostalcode3.read(clipKtRemoteActionCompatParcelizer7);
            objComponentActivity12 = getpostalcode3.ComponentActivity();
            if (z8) {
                i6 = MediaDescriptionCompat + 125;
                MediaMetadataCompat = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    throw null;
                }
                if (objComponentActivity12 == androidContentCaptureManager) {
                    objComponentActivity12 = new readConnectionResponse(clipKtRemoteActionCompatParcelizer7, 5);
                    getpostalcode3.write(objComponentActivity12);
                }
            } else {
                objComponentActivity12 = new readConnectionResponse(clipKtRemoteActionCompatParcelizer7, 5);
                getpostalcode3.write(objComponentActivity12);
            }
            Modifier modifier4 = DrawBehindElement.read(modifierM74paddingqDBjuR0$default8, clipKtRemoteActionCompatParcelizer17, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity12);
            modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getCenterHorizontally(), getpostalcode3, 48);
            iHashCode2 = Long.hashCode(getpostalcode3.RatingCompat);
            dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode3.serializer();
            modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode3, modifier4);
            companion3 = ComposeUiNode.Companion;
            constructor3 = companion3.getConstructor();
            if (getpostalcode3.read != null) {
                SentryUUID.write();
                throw null;
            }
            i5 = MediaMetadataCompat + 85;
            MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z18 = getpostalcode3.ComponentActivity;
                throw null;
            }
            getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode3.ComponentActivity) {
                getpostalcode3.serializer(constructor3);
            } else {
                getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode3, modalBottomSheetYbuCTN8Serializer2, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode3, Integer.valueOf(iHashCode2), getpostalcode3));
            if (r8lambdaiidsddyirtymdul5lt6pmt2zysq.size() == 1) {
                getpostalcode3.serializer(-1736128362);
                z9 = false;
                FullScreenDetailsContentKt.RemoteActionCompatParcelizer((FullscreenDetailUi) onContentCardDismissed.read((List) r8lambdaiidsddyirtymdul5lt6pmt2zysq), getpostalcode3, 0);
                getpostalcode3.IconCompatParcelizer(false);
            } else {
                z9 = false;
                getpostalcode3.serializer(-1736007958);
                FullScreenDetailsContentKt.write(removeNodeAtDepth.read(r8lambdaiidsddyirtymdul5lt6pmt2zysq), getpostalcode3, 0);
                getpostalcode3.IconCompatParcelizer(false);
            }
            getpostalcode3.IconCompatParcelizer(true);
            getpostalcode3.IconCompatParcelizer(z9);
            if (drawBehindElement.MediaSessionCompatQueueItem != i4) {
                getPhoneNumberNational.write(r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getpostalcode3);
            }
        }
        return createfromparcel;
    }
}
