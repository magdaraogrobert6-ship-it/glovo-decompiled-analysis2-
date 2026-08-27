package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class X implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    public static final X serializer;
    private static int write = 1;

    static {
        X x = new X();
        serializer = x;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.opportunities.data.SectionResponse", x, 3);
        oncloseactionlambda1.read("icons", true);
        oncloseactionlambda1.read("text", true);
        oncloseactionlambda1.read("type", true);
        descriptor = oncloseactionlambda1;
        int i = read + 31;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 28 / 0;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = write + 57;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i3 + 19;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = write + 27;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {w7.$childSerializers[0].MediaSessionCompatResultReceiverWrapper(), beforeinappmessageviewclosed, beforeinappmessageviewclosed};
        int i4 = write + 101;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = w7.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        List list = null;
        int i2 = 0;
        boolean z = true;
        while (z) {
            int i3 = IconCompatParcelizer + 77;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                throw null;
            }
            int i4 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i4 == -1) {
                z = false;
            } else if (i4 != 0) {
                int i5 = IconCompatParcelizer + 59;
                int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                write = i6;
                int i7 = i5 % 2;
                if (i4 != 1) {
                    int i8 = i6 + 17;
                    IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i8 % 2 != 0) {
                        if (i4 != 2) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i4);
                            int i9 = IconCompatParcelizer + 1;
                            write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i10 = i9 % 2;
                            return null;
                        }
                        int i11 = i6 + 75;
                        IconCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                        strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                        i2 |= 4;
                    } else {
                        if (i4 != 2) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i4);
                            int i13 = IconCompatParcelizer + 1;
                            write = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i14 = i13 % 2;
                            return null;
                        }
                        int i15 = i6 + 75;
                        IconCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i16 = i15 % 2;
                        strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                        i2 |= 4;
                    }
                } else {
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i2 |= 2;
                }
            } else {
                list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[0].MediaSessionCompatResultReceiverWrapper(), list);
                i2 |= 1;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new w7(i2, strMediaMetadataCompat, strMediaMetadataCompat2, list);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0064  */
    /* JADX WARN: Code duplicated, block: B:13:0x008a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0093  */
    /* JADX WARN: Code duplicated, block: B:17:0x009c  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int iWrite;
        int iWrite2;
        int iWrite3;
        int iWrite4;
        int iWrite5;
        int iWrite6;
        int i = 2 % 2;
        w7 w7Var = (w7) obj;
        w7Var.getClass();
        String str = w7Var.type;
        String str2 = w7Var.text;
        List list = w7Var.icons;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = w7.$childSerializers;
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            Object[] objArr = {list, instance_delegatelambda0.write};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
                defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, str2);
            } else {
                iWrite4 = getCieXyz.write();
                iWrite5 = getCieXyz.write();
                iWrite6 = getCieXyz.write();
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite4, 1803334089, -1803334089, getCieXyz.write(), iWrite5, new Object[]{str2, ""}, iWrite6)).booleanValue()) {
                    defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, str2);
                }
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
                iWrite = getCieXyz.write();
                iWrite2 = getCieXyz.write();
                iWrite3 = getCieXyz.write();
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str, ""}, iWrite3)).booleanValue()) {
                }
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            }
            int i2 = write + 1;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, str);
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        int i4 = IconCompatParcelizer + 101;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[0].MediaSessionCompatResultReceiverWrapper(), list);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, str2);
        } else {
            iWrite4 = getCieXyz.write();
            iWrite5 = getCieXyz.write();
            iWrite6 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite4, 1803334089, -1803334089, getCieXyz.write(), iWrite5, new Object[]{str2, ""}, iWrite6)).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, str2);
            }
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            iWrite = getCieXyz.write();
            iWrite2 = getCieXyz.write();
            iWrite3 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str, ""}, iWrite3)).booleanValue()) {
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        int i6 = write + 1;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, str);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }
}
