package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.appmigration.model.PhaseVariant;
import com.roadrunner.appmigration.model.UrgencyVariant;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getBoundsInWindow implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    public static final getBoundsInWindow RemoteActionCompatParcelizer;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;

    static {
        getBoundsInWindow getboundsinwindow = new getBoundsInWindow();
        RemoteActionCompatParcelizer = getboundsinwindow;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.appmigration.model.Popup", getboundsinwindow, 16);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, false);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.BODY_KEY, false);
        oncloseactionlambda1.read("cta_button_text", false);
        oncloseactionlambda1.read("cta_button_text_alternative", false);
        oncloseactionlambda1.read("cta_button_url", false);
        oncloseactionlambda1.read("phase_variant", true);
        oncloseactionlambda1.read("image_url", true);
        oncloseactionlambda1.read("terms_and_condition_label", true);
        oncloseactionlambda1.read("terms_and_condition_link_text", true);
        oncloseactionlambda1.read("terms_and_condition_url", true);
        oncloseactionlambda1.read("dismiss_button_text", true);
        oncloseactionlambda1.read("dismissable", true);
        oncloseactionlambda1.read("header", true);
        oncloseactionlambda1.read("urgency_variant", true);
        oncloseactionlambda1.read("urgency_message", true);
        oncloseactionlambda1.read("analytics", false);
        descriptor = oncloseactionlambda1;
        int i = read + 119;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 7;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 99;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 66 / 0;
        }
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 5;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, unmergedChildrenuidefault.read, LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), getWasCloseMessageCalled.write, LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(getPositionInRootF1C5BW0.write), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), getBoundsInParentui.read};
        int i4 = write + 5;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0075  */
    /* JADX WARN: Code duplicated, block: B:22:0x0084  */
    /* JADX WARN: Code duplicated, block: B:27:0x0094  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:52:0x00eb  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        getBoundsInRoot getboundsinroot = (getBoundsInRoot) obj;
        getboundsinroot.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        String str = getboundsinroot.title;
        String str2 = getboundsinroot.urgencyMessage;
        UrgencyVariant urgencyVariant = getboundsinroot.urgencyVariant;
        String str3 = getboundsinroot.header;
        boolean z = getboundsinroot.dismissable;
        String str4 = getboundsinroot.dismissButtonText;
        String str5 = getboundsinroot.termsAndConditionUrl;
        String str6 = getboundsinroot.termsAndConditionLinkText;
        String str7 = getboundsinroot.termsAndConditionLabel;
        String str8 = getboundsinroot.imageUrl;
        PhaseVariant phaseVariant = getboundsinroot.phaseVariant;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, getboundsinroot.body);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, getboundsinroot.ctaButtonText);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, getboundsinroot.ctaButtonTextAlternative);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, getboundsinroot.ctaButtonUrl);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || phaseVariant != PhaseVariant.PHASE_1) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, unmergedChildrenuidefault.read, phaseVariant);
        }
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (str8 != null) {
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str7 != null) {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str7);
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str6 != null) {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str6);
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str5 != null) {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str5);
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str4 != null) {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str4);
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || z) {
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, z);
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str3 != null) {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 12, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str3);
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
                if (urgencyVariant != null) {
                }
                if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str2 != null) {
                    defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 14, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
                }
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 15, getBoundsInParentui.read, getboundsinroot.analytics);
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            }
            int i2 = IconCompatParcelizer + 33;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 13, getPositionInRootF1C5BW0.write, urgencyVariant);
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 14, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
            } else {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 14, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 15, getBoundsInParentui.read, getboundsinroot.analytics);
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        int i4 = IconCompatParcelizer + 45;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str8);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str7);
        } else {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str7);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str6);
        } else {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str6);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str5);
        } else {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str5);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str4);
        } else {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str4);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, z);
        } else {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, z);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 12, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str3);
        } else {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 12, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str3);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (urgencyVariant != null) {
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 14, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
            } else {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 14, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 15, getBoundsInParentui.read, getboundsinroot.analytics);
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        int i6 = IconCompatParcelizer + 33;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 13, getPositionInRootF1C5BW0.write, urgencyVariant);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 14, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
        } else {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 14, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 15, getBoundsInParentui.read, getboundsinroot.analytics);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        int i2 = write + 11;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        boolean z = true;
        String str6 = null;
        int i4 = 0;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        getMergingEnabled getmergingenabled = null;
        String str7 = null;
        UrgencyVariant urgencyVariant = null;
        PhaseVariant phaseVariant = null;
        String strMediaMetadataCompat3 = null;
        boolean zWrite = false;
        String strMediaMetadataCompat4 = null;
        String strMediaMetadataCompat5 = null;
        while (z) {
            int i5 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            switch (i5) {
                case -1:
                    strMediaMetadataCompat2 = strMediaMetadataCompat2;
                    int i6 = write + 63;
                    IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    z = false;
                    strMediaMetadataCompat2 = strMediaMetadataCompat2;
                    break;
                case 0:
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i4 |= 1;
                    z = z;
                    strMediaMetadataCompat2 = strMediaMetadataCompat2;
                    break;
                case 1:
                    z = z;
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i4 |= 2;
                    z = z;
                    break;
                case 2:
                    z = z;
                    strMediaMetadataCompat5 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                    i4 |= 4;
                    z = z;
                    break;
                case 3:
                    i4 |= 8;
                    strMediaMetadataCompat4 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                    z = z;
                    break;
                case 4:
                    i4 |= 16;
                    strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                    z = z;
                    break;
                case 5:
                    phaseVariant = (PhaseVariant) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, unmergedChildrenuidefault.read, phaseVariant);
                    i4 |= 32;
                    z = z;
                    strMediaMetadataCompat2 = strMediaMetadataCompat2;
                    break;
                case 6:
                    str6 = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str6);
                    i4 |= 64;
                    z = z;
                    strMediaMetadataCompat2 = strMediaMetadataCompat2;
                    break;
                case 7:
                    str5 = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str5);
                    i4 |= androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    z = z;
                    strMediaMetadataCompat2 = strMediaMetadataCompat2;
                    break;
                case 8:
                    str4 = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str4);
                    i4 |= androidx.compose.ui.graphics.Fields.RotationX;
                    z = z;
                    strMediaMetadataCompat2 = strMediaMetadataCompat2;
                    break;
                case 9:
                    str3 = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str3);
                    i4 |= androidx.compose.ui.graphics.Fields.RotationY;
                    int i8 = IconCompatParcelizer + 31;
                    write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    z = z;
                    strMediaMetadataCompat2 = strMediaMetadataCompat2;
                    break;
                case 10:
                    str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                    i4 |= androidx.compose.ui.graphics.Fields.RotationZ;
                    z = z;
                    strMediaMetadataCompat2 = strMediaMetadataCompat2;
                    break;
                case 11:
                    zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11);
                    i4 |= androidx.compose.ui.graphics.Fields.CameraDistance;
                    z = z;
                    break;
                case 12:
                    str2 = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 12, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
                    i4 |= androidx.compose.ui.graphics.Fields.TransformOrigin;
                    z = z;
                    strMediaMetadataCompat2 = strMediaMetadataCompat2;
                    break;
                case 13:
                    urgencyVariant = (UrgencyVariant) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 13, getPositionInRootF1C5BW0.write, urgencyVariant);
                    i4 |= 8192;
                    z = z;
                    strMediaMetadataCompat2 = strMediaMetadataCompat2;
                    break;
                case 14:
                    str7 = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 14, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str7);
                    i4 |= androidx.compose.ui.graphics.Fields.Clip;
                    z = z;
                    strMediaMetadataCompat2 = strMediaMetadataCompat2;
                    break;
                case 15:
                    getmergingenabled = (getMergingEnabled) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 15, getBoundsInParentui.read, getmergingenabled);
                    i4 |= androidx.compose.ui.graphics.Fields.CompositingStrategy;
                    z = z;
                    strMediaMetadataCompat2 = strMediaMetadataCompat2;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                    return null;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        getMergingEnabled getmergingenabled2 = getmergingenabled;
        String str8 = strMediaMetadataCompat5;
        String str9 = str7;
        UrgencyVariant urgencyVariant2 = urgencyVariant;
        return new getBoundsInRoot(i4, strMediaMetadataCompat, strMediaMetadataCompat2, str8, strMediaMetadataCompat4, strMediaMetadataCompat3, phaseVariant, str6, str5, str4, str3, str, zWrite, str2, urgencyVariant2, str9, getmergingenabled2);
    }
}
