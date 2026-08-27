package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getNormal_LCdwAannotations implements getInAppMessageManager {
    public static final getNormal_LCdwAannotations IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;

    static {
        getNormal_LCdwAannotations getnormal_lcdwaannotations = new getNormal_LCdwAannotations();
        IconCompatParcelizer = getnormal_lcdwaannotations;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("tap_to_pay", getnormal_lcdwaannotations, 7);
        oncloseactionlambda1.read("id", false);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, false);
        oncloseactionlambda1.read("default", false);
        oncloseactionlambda1.read("required", false);
        oncloseactionlambda1.read("amount", false);
        oncloseactionlambda1.read("cash", true);
        oncloseactionlambda1.read("card", true);
        descriptor = oncloseactionlambda1;
        int i = write + 61;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 97;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 9;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 101;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(isStyleOnimplui_text.RemoteActionCompatParcelizer);
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2 = LazyKt__LazyJVMKt.read(accessgetWeightcp.serializer);
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, getWasCloseMessageCalled.write, r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer, setgraphicmodalmaxwidthdp, setgraphicmodalmaxwidthdp2};
        int i4 = serializer + 19;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 125;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        accessgetItaliccp accessgetitaliccp = (accessgetItaliccp) obj;
        accessgetitaliccp.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        String str = accessgetitaliccp.id;
        FontSynthesis fontSynthesis = accessgetitaliccp.cardPayment;
        accessgetStylecp accessgetstylecp = accessgetitaliccp.cashPayment;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, accessgetitaliccp.title);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, accessgetitaliccp.defaultPayment);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, accessgetitaliccp.required);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, accessgetitaliccp.amount);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || accessgetstylecp != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, isStyleOnimplui_text.RemoteActionCompatParcelizer, accessgetstylecp);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || fontSynthesis != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, accessgetWeightcp.serializer, fontSynthesis);
            int i4 = serializer + 49;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0056  */
    /* JADX WARN: Code duplicated, block: B:15:0x0063  */
    /* JADX WARN: Code duplicated, block: B:16:0x0070  */
    /* JADX WARN: Code duplicated, block: B:17:0x0078  */
    /* JADX WARN: Code duplicated, block: B:19:0x0081  */
    /* JADX WARN: Code duplicated, block: B:20:0x0088  */
    /* JADX WARN: Code duplicated, block: B:21:0x0099  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b0  */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        int i7 = RemoteActionCompatParcelizer + 57;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        int i9 = 0;
        int i10 = 1;
        int i11 = 0;
        boolean zWrite = false;
        double dRemoteActionCompatParcelizer = 0.0d;
        accessgetStylecp accessgetstylecp = null;
        FontSynthesis fontSynthesis = null;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        String strMediaMetadataCompat3 = null;
        for (int i12 = 1; i10 == i12; i12 = 1) {
            int i13 = RemoteActionCompatParcelizer + 77;
            serializer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i13 % i5 != 0) {
                i = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                int i14 = 81 / 0;
                switch (i) {
                    case -1:
                        i9 = i9;
                        i10 = i9;
                        break;
                    case 0:
                        i2 = i9;
                        strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i2);
                        i11 |= 1;
                        i4 = serializer + 103;
                        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i4 % 2 == 0) {
                            int i15 = 3 % 3;
                        }
                        i9 = i2;
                        break;
                    case 1:
                        strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i3 = i11 | 2;
                        int i16 = serializer + 11;
                        RemoteActionCompatParcelizer = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i17 = i16 % i5;
                        i11 = i3;
                        i2 = 0;
                        i4 = serializer + 103;
                        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i4 % 2 == 0) {
                            int i18 = 3 % 3;
                        }
                        i9 = i2;
                        break;
                    case 2:
                        strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i5);
                        i3 = i11 | 4;
                        i11 = i3;
                        i2 = 0;
                        i4 = serializer + 103;
                        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i4 % 2 == 0) {
                            int i19 = 3 % 3;
                        }
                        i9 = i2;
                        break;
                    case 3:
                        zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                        i3 = i11 | 8;
                        i11 = i3;
                        i2 = 0;
                        i4 = serializer + 103;
                        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i4 % 2 == 0) {
                            int i110 = 3 % 3;
                        }
                        i9 = i2;
                        break;
                    case 4:
                        dRemoteActionCompatParcelizer = createinappmessageviewlambda1Serializer.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                        i3 = i11 | 16;
                        i11 = i3;
                        i2 = 0;
                        i4 = serializer + 103;
                        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i4 % 2 == 0) {
                            int i111 = 3 % 3;
                        }
                        i9 = i2;
                        break;
                    case 5:
                        accessgetstylecp = (accessgetStylecp) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, isStyleOnimplui_text.RemoteActionCompatParcelizer, accessgetstylecp);
                        i3 = i11 | 32;
                        i11 = i3;
                        i2 = 0;
                        i4 = serializer + 103;
                        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i4 % 2 == 0) {
                            int i112 = 3 % 3;
                        }
                        i9 = i2;
                        break;
                    case 6:
                        fontSynthesis = (FontSynthesis) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, accessgetWeightcp.serializer, fontSynthesis);
                        i3 = i11 | 64;
                        i11 = i3;
                        i2 = 0;
                        i4 = serializer + 103;
                        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i4 % 2 == 0) {
                            int i113 = 3 % 3;
                        }
                        i9 = i2;
                        break;
                    default:
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                        return null;
                }
            } else {
                i = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                switch (i) {
                    case -1:
                        i9 = i9;
                        i10 = i9;
                        break;
                    case 0:
                        i2 = i9;
                        strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i2);
                        i11 |= 1;
                        i4 = serializer + 103;
                        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i4 % 2 == 0) {
                            int i114 = 3 % 3;
                        }
                        i9 = i2;
                        break;
                    case 1:
                        strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i3 = i11 | 2;
                        int i115 = serializer + 11;
                        RemoteActionCompatParcelizer = i115 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i116 = i115 % i5;
                        i11 = i3;
                        i2 = 0;
                        i4 = serializer + 103;
                        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i4 % 2 == 0) {
                            int i117 = 3 % 3;
                        }
                        i9 = i2;
                        break;
                    case 2:
                        strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i5);
                        i3 = i11 | 4;
                        i11 = i3;
                        i2 = 0;
                        i4 = serializer + 103;
                        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i4 % 2 == 0) {
                            int i118 = 3 % 3;
                        }
                        i9 = i2;
                        break;
                    case 3:
                        zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                        i3 = i11 | 8;
                        i11 = i3;
                        i2 = 0;
                        i4 = serializer + 103;
                        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i4 % 2 == 0) {
                            int i119 = 3 % 3;
                        }
                        i9 = i2;
                        break;
                    case 4:
                        dRemoteActionCompatParcelizer = createinappmessageviewlambda1Serializer.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                        i3 = i11 | 16;
                        i11 = i3;
                        i2 = 0;
                        i4 = serializer + 103;
                        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i4 % 2 == 0) {
                            int i1110 = 3 % 3;
                        }
                        i9 = i2;
                        break;
                    case 5:
                        accessgetstylecp = (accessgetStylecp) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, isStyleOnimplui_text.RemoteActionCompatParcelizer, accessgetstylecp);
                        i3 = i11 | 32;
                        i11 = i3;
                        i2 = 0;
                        i4 = serializer + 103;
                        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i4 % 2 == 0) {
                            int i1111 = 3 % 3;
                        }
                        i9 = i2;
                        break;
                    case 6:
                        fontSynthesis = (FontSynthesis) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, accessgetWeightcp.serializer, fontSynthesis);
                        i3 = i11 | 64;
                        i11 = i3;
                        i2 = 0;
                        i4 = serializer + 103;
                        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i4 % 2 == 0) {
                            int i1112 = 3 % 3;
                        }
                        i9 = i2;
                        break;
                    default:
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                        return null;
                }
            }
            i5 = 2;
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new accessgetItaliccp(i11, strMediaMetadataCompat, strMediaMetadataCompat2, strMediaMetadataCompat3, zWrite, dRemoteActionCompatParcelizer, accessgetstylecp, fontSynthesis);
    }
}
