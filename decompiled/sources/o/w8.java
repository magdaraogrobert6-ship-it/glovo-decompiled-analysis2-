package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w8 implements getInAppMessageManager {
    public static final w8 IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;

    static {
        w8 w8Var = new w8();
        IconCompatParcelizer = w8Var;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.opportunities.data.StartNowResponse", w8Var, 4);
        oncloseactionlambda1.read("id", false);
        oncloseactionlambda1.read("type", false);
        oncloseactionlambda1.read("description", true);
        oncloseactionlambda1.read("start_time", true);
        descriptor = oncloseactionlambda1;
        int i = write + 21;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda;
        int i = 2 % 2;
        int i2 = read + 37;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            int i4 = 29 / 0;
        } else {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        }
        int i5 = i3 + 105;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambda92m0p9sit5uf70mvjf4rwmruda;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 79;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed);
            setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[2];
            setgraphicmodalmaxwidthdpArr[0] = beforeinappmessageviewclosed;
            setgraphicmodalmaxwidthdpArr[0] = beforeinappmessageviewclosed;
            setgraphicmodalmaxwidthdpArr[4] = beforeinappmessageviewclosed;
            setgraphicmodalmaxwidthdpArr[4] = setgraphicmodalmaxwidthdp;
        } else {
            beforeInAppMessageViewClosed beforeinappmessageviewclosed2 = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
            setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[]{beforeinappmessageviewclosed2, beforeinappmessageviewclosed2, beforeinappmessageviewclosed2, LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed2)};
        }
        int i3 = RemoteActionCompatParcelizer + 121;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 67 / 0;
        }
        return setgraphicmodalmaxwidthdpArr;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0056  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 109;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        w8ExternalSyntheticLambda1 w8externalsyntheticlambda1 = (w8ExternalSyntheticLambda1) obj;
        w8externalsyntheticlambda1.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        String str = w8externalsyntheticlambda1.id;
        String str2 = w8externalsyntheticlambda1.startTime;
        String str3 = w8externalsyntheticlambda1.description;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, w8externalsyntheticlambda1.type);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, str3);
        } else {
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str3, ""}, iWrite3)).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, str3);
            }
        }
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (str2 != null) {
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        } else {
            int i4 = RemoteActionCompatParcelizer + 9;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0040 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0050  */
    /* JADX WARN: Code duplicated, block: B:33:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x005c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0042 A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        String strMediaMetadataCompat3 = null;
        String str = null;
        int i5 = 0;
        boolean z = true;
        while (z) {
            int i6 = RemoteActionCompatParcelizer + 45;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                i = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                int i7 = 25 / 0;
                if (i != -1) {
                    i2 = read;
                    i3 = i2 + 55;
                    RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i3 % 2 == 0) {
                        throw null;
                    }
                    if (i != 0) {
                        strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                        i5 |= 1;
                    } else if (i != 1) {
                        strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i5 |= 2;
                    } else if (i != 2) {
                        int i8 = i2 + 99;
                        RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        if (i == 3) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                            int i10 = RemoteActionCompatParcelizer + 93;
                            read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i11 = i10 % 2;
                            return null;
                        }
                        str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                        i5 |= 8;
                    } else {
                        strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                        i5 |= 4;
                        int i12 = read + 23;
                        RemoteActionCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i13 = i12 % 2;
                    }
                } else {
                    z = false;
                }
            } else {
                i = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                if (i != -1) {
                    i2 = read;
                    i3 = i2 + 55;
                    RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i3 % 2 == 0) {
                        throw null;
                    }
                    if (i != 0) {
                        strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                        i5 |= 1;
                    } else if (i != 1) {
                        strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i5 |= 2;
                    } else if (i != 2) {
                        int i14 = i2 + 99;
                        RemoteActionCompatParcelizer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i15 = i14 % 2;
                        if (i == 3) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                            int i16 = RemoteActionCompatParcelizer + 93;
                            read = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i17 = i16 % 2;
                            return null;
                        }
                        str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                        i5 |= 8;
                    } else {
                        strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                        i5 |= 4;
                        int i18 = read + 23;
                        RemoteActionCompatParcelizer = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i19 = i18 % 2;
                    }
                } else {
                    z = false;
                }
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new w8ExternalSyntheticLambda1(strMediaMetadataCompat, i5, strMediaMetadataCompat2, strMediaMetadataCompat3, str);
    }
}
