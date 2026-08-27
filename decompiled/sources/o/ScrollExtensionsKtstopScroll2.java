package o;

import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollExtensionsKtstopScroll2 extends Lambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ int MediaBrowserCompatMediaItem = 0;
    public final /* synthetic */ Object MediaDescriptionCompat;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollExtensionsKtstopScroll2(androidx.compose.animation.core.Transition transition, androidx.compose.ui.Modifier modifier, Arrangement arrangement, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, int i) {
        super(2);
        this.MediaDescriptionCompat = transition;
        this.serializer = modifier;
        this.RemoteActionCompatParcelizer = arrangement;
        this.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.read = dragAndDropTargetModifierNode;
        this.IconCompatParcelizer = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollExtensionsKtstopScroll2(PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, DrawBehindElement drawBehindElement, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, String str, int i, androidx.compose.ui.graphics.ColorFilter colorFilter) {
        super(2);
        this.MediaDescriptionCompat = populateViewStructure_androidKtpopulate7;
        this.serializer = drawBehindElement;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.write = str;
        this.IconCompatParcelizer = i;
        this.read = colorFilter;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0096  */
    /* JADX WARN: Code duplicated, block: B:20:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:23:0x011c  */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i;
        getPostalCode getpostalcode;
        ClipKt clipKtRemoteActionCompatParcelizer;
        boolean z;
        Object objComponentActivity;
        AndroidContentCaptureManager androidContentCaptureManager;
        int i2;
        Object objComponentActivity2;
        int i3 = 2 % 2;
        int i4 = this.MediaBrowserCompatMediaItem;
        Object obj3 = this.RemoteActionCompatParcelizer;
        Object obj4 = this.read;
        int i5 = this.IconCompatParcelizer;
        Object obj5 = this.write;
        Object obj6 = this.MediaDescriptionCompat;
        Object obj7 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i4 == 0) {
            ((Number) obj2).intValue();
            androidx.compose.animation.CrossfadeKt.Crossfade((androidx.compose.animation.core.Transition) obj6, (androidx.compose.ui.Modifier) obj7, (Arrangement) obj3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (DragAndDropTargetModifierNode) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
            int i6 = MediaSessionCompatQueueItem + 125;
            MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return createfromparcel;
        }
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        DrawBehindElement drawBehindElement = (DrawBehindElement) obj7;
        if ((((Number) obj2).intValue() & 3) == 2) {
            int i8 = MediaSessionCompatQueueItem + 31;
            MediaMetadataCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                ((getPostalCode) getbirthdatefull).MediaSessionCompatToken();
                Object obj8 = null;
                obj8.hashCode();
                throw null;
            }
            getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
            if (getpostalcode2.MediaSessionCompatToken()) {
                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            } else {
                ((PopulateViewStructure_androidKtpopulate7) obj6).setValue(createfromparcel);
                i = drawBehindElement.MediaSessionCompatQueueItem;
                drawBehindElement.read();
                getpostalcode = (getPostalCode) getbirthdatefull;
                getpostalcode.serializer(-1965117729);
                DrawBehindElement drawBehindElement2 = (DrawBehindElement) drawBehindElement.serializer().serializer;
                ClipKt clipKtRemoteActionCompatParcelizer2 = drawBehindElement2.RemoteActionCompatParcelizer();
                clipKtRemoteActionCompatParcelizer = drawBehindElement2.RemoteActionCompatParcelizer();
                androidx.compose.ui.text.TextStyle textStyle = (androidx.compose.ui.text.TextStyle) performLayout.MediaSessionCompatQueueItem.MediaSessionCompatResultReceiverWrapper();
                int iM3516getStarte0LSkKk = androidx.compose.ui.text.style.TextAlign.Companion.m3516getStarte0LSkKk();
                int iM3569getEllipsisgIe3tQ8 = androidx.compose.ui.text.style.TextOverflow.Companion.m3569getEllipsisgIe3tQ8();
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
                z = getpostalcode.read(clipKtRemoteActionCompatParcelizer);
                objComponentActivity = getpostalcode.ComponentActivity();
                androidContentCaptureManager = getCreditCardExpirationMonth.write;
                i2 = 0;
                if (z || objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new readConnectionResponse(clipKtRemoteActionCompatParcelizer, i2);
                    getpostalcode.write(objComponentActivity);
                }
                androidx.compose.material3.TextKt.m131TextNvy7gAk((String) obj5, DrawBehindElement.read(companion, clipKtRemoteActionCompatParcelizer2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity), 0L, 0L, null, null, 0L, androidx.compose.ui.text.style.TextAlign.m3504boximpl(iM3516getStarte0LSkKk), 0L, iM3569getEllipsisgIe3tQ8, false, 1, 0, null, textStyle, getpostalcode, 0, 24960, 109564);
                androidx.compose.ui.Modifier modifierM84sizeVpY3zN4 = androidx.compose.foundation.layout.SizeKt.m84sizeVpY3zN4(companion, Dimensions.reportFullyDrawn, Dimensions.removeOnTrimMemoryListener);
                objComponentActivity2 = getpostalcode.ComponentActivity();
                if (objComponentActivity2 == androidContentCaptureManager) {
                    int i9 = MediaMetadataCompat + 113;
                    MediaSessionCompatQueueItem = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    ErrorCodes errorCodes = ErrorCodes.serializer;
                    getpostalcode.write(errorCodes);
                    int i11 = MediaSessionCompatQueueItem + 93;
                    MediaMetadataCompat = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    objComponentActivity2 = errorCodes;
                }
                androidx.compose.foundation.ImageKt.Image(androidx.compose.ui.res.PainterResources_androidKt.painterResource(i5, getpostalcode, 0), null, DrawBehindElement.read(modifierM84sizeVpY3zN4, clipKtRemoteActionCompatParcelizer, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2), null, null, 0.0f, (androidx.compose.ui.graphics.ColorFilter) obj4, getpostalcode, androidx.compose.ui.graphics.painter.Painter.$stable | 48, 56);
                getpostalcode.IconCompatParcelizer(false);
                if (drawBehindElement.MediaSessionCompatQueueItem != i) {
                    int i13 = MediaSessionCompatQueueItem + 75;
                    MediaMetadataCompat = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    getPhoneNumberNational.write((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, getpostalcode);
                }
            }
        } else {
            ((PopulateViewStructure_androidKtpopulate7) obj6).setValue(createfromparcel);
            i = drawBehindElement.MediaSessionCompatQueueItem;
            drawBehindElement.read();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.serializer(-1965117729);
            DrawBehindElement drawBehindElement3 = (DrawBehindElement) drawBehindElement.serializer().serializer;
            ClipKt clipKtRemoteActionCompatParcelizer3 = drawBehindElement3.RemoteActionCompatParcelizer();
            clipKtRemoteActionCompatParcelizer = drawBehindElement3.RemoteActionCompatParcelizer();
            androidx.compose.ui.text.TextStyle textStyle2 = (androidx.compose.ui.text.TextStyle) performLayout.MediaSessionCompatQueueItem.MediaSessionCompatResultReceiverWrapper();
            int iM3516getStarte0LSkKk2 = androidx.compose.ui.text.style.TextAlign.Companion.m3516getStarte0LSkKk();
            int iM3569getEllipsisgIe3tQ9 = androidx.compose.ui.text.style.TextOverflow.Companion.m3569getEllipsisgIe3tQ8();
            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.Companion;
            z = getpostalcode.read(clipKtRemoteActionCompatParcelizer);
            objComponentActivity = getpostalcode.ComponentActivity();
            androidContentCaptureManager = getCreditCardExpirationMonth.write;
            i2 = 0;
            if (z) {
                objComponentActivity = new readConnectionResponse(clipKtRemoteActionCompatParcelizer, i2);
                getpostalcode.write(objComponentActivity);
            } else {
                objComponentActivity = new readConnectionResponse(clipKtRemoteActionCompatParcelizer, i2);
                getpostalcode.write(objComponentActivity);
            }
            androidx.compose.material3.TextKt.m131TextNvy7gAk((String) obj5, DrawBehindElement.read(companion2, clipKtRemoteActionCompatParcelizer3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity), 0L, 0L, null, null, 0L, androidx.compose.ui.text.style.TextAlign.m3504boximpl(iM3516getStarte0LSkKk2), 0L, iM3569getEllipsisgIe3tQ9, false, 1, 0, null, textStyle2, getpostalcode, 0, 24960, 109564);
            androidx.compose.ui.Modifier modifierM84sizeVpY3zN5 = androidx.compose.foundation.layout.SizeKt.m84sizeVpY3zN4(companion2, Dimensions.reportFullyDrawn, Dimensions.removeOnTrimMemoryListener);
            objComponentActivity2 = getpostalcode.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                int i15 = MediaMetadataCompat + 113;
                MediaSessionCompatQueueItem = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i16 = i15 % 2;
                ErrorCodes errorCodes2 = ErrorCodes.serializer;
                getpostalcode.write(errorCodes2);
                int i17 = MediaSessionCompatQueueItem + 93;
                MediaMetadataCompat = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i18 = i17 % 2;
                objComponentActivity2 = errorCodes2;
            }
            androidx.compose.foundation.ImageKt.Image(androidx.compose.ui.res.PainterResources_androidKt.painterResource(i5, getpostalcode, 0), null, DrawBehindElement.read(modifierM84sizeVpY3zN5, clipKtRemoteActionCompatParcelizer, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2), null, null, 0.0f, (androidx.compose.ui.graphics.ColorFilter) obj4, getpostalcode, androidx.compose.ui.graphics.painter.Painter.$stable | 48, 56);
            getpostalcode.IconCompatParcelizer(false);
            if (drawBehindElement.MediaSessionCompatQueueItem != i) {
                int i19 = MediaSessionCompatQueueItem + 75;
                MediaMetadataCompat = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i110 = i19 % 2;
                getPhoneNumberNational.write((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, getpostalcode);
            }
        }
        return createfromparcel;
    }
}
