package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class charAt implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    public static final charAt serializer;
    private static int write;

    static {
        charAt charat = new charAt();
        serializer = charat;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.customerchat.selfservice.data.bridge.HostMessage.HostNotifiesAboutVisibilityChange", charat, 3);
        oncloseactionlambda1.read("id", false);
        oncloseactionlambda1.read("messageType", true);
        oncloseactionlambda1.read("payload", false);
        descriptor = oncloseactionlambda1;
        int i = read + 9;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 51;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 53;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, beforeinappmessageviewclosed, getParagraphStyles.read};
        int i4 = IconCompatParcelizer + 71;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x004e  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 27;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        flatMapAnnotations flatmapannotations = (flatMapAnnotations) obj;
        flatmapannotations.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        String str = flatmapannotations.id;
        String str2 = flatmapannotations.messageType;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, str2);
        } else {
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str2, "HOST_NOTIFIES_ABOUT_WEBVIEW_VISIBILITY_CHANGE"}, iWrite3)).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, str2);
            }
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, getParagraphStyles.read, flatmapannotations.payload);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = IconCompatParcelizer + 101;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0054 A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer;
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 125;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        } else {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        createinappmessageviewlambda1Serializer.getClass();
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        getAnnotationsui_text getannotationsui_text = null;
        int i4 = 0;
        boolean z = true;
        while (z) {
            int i5 = RemoteActionCompatParcelizer + 51;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i7 != -1) {
                int i8 = IconCompatParcelizer + 83;
                int i9 = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                RemoteActionCompatParcelizer = i9;
                if (i8 % 2 == 0) {
                    int i10 = 4 / 0;
                    if (i7 != 0) {
                        int i11 = i9 + 5;
                        IconCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                        if (i7 != 1) {
                            i = i9 + 57;
                            IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i % 2 != 0) {
                                if (i7 != 5) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i7);
                                    return null;
                                }
                                int i13 = i9 + 115;
                                IconCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i14 = i13 % 2;
                                getannotationsui_text = (getAnnotationsui_text) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, getParagraphStyles.read, getannotationsui_text);
                                i4 |= 4;
                            } else {
                                if (i7 != 2) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i7);
                                    return null;
                                }
                                int i15 = i9 + 115;
                                IconCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i16 = i15 % 2;
                                getannotationsui_text = (getAnnotationsui_text) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, getParagraphStyles.read, getannotationsui_text);
                                i4 |= 4;
                            }
                        } else {
                            strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                            i4 |= 2;
                        }
                    } else {
                        strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                        i4 |= 1;
                        int i17 = IconCompatParcelizer + 117;
                        RemoteActionCompatParcelizer = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i18 = i17 % 2;
                    }
                } else if (i7 != 0) {
                    int i19 = i9 + 5;
                    IconCompatParcelizer = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i110 = i19 % 2;
                    if (i7 != 1) {
                        i = i9 + 57;
                        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i % 2 != 0) {
                            if (i7 != 5) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i7);
                                return null;
                            }
                            int i111 = i9 + 115;
                            IconCompatParcelizer = i111 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i112 = i111 % 2;
                            getannotationsui_text = (getAnnotationsui_text) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, getParagraphStyles.read, getannotationsui_text);
                            i4 |= 4;
                        } else {
                            if (i7 != 2) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i7);
                                return null;
                            }
                            int i113 = i9 + 115;
                            IconCompatParcelizer = i113 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i114 = i113 % 2;
                            getannotationsui_text = (getAnnotationsui_text) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, getParagraphStyles.read, getannotationsui_text);
                            i4 |= 4;
                        }
                    } else {
                        strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i4 |= 2;
                    }
                } else {
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i4 |= 1;
                    int i115 = IconCompatParcelizer + 117;
                    RemoteActionCompatParcelizer = i115 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i116 = i115 % 2;
                }
            } else {
                int i20 = RemoteActionCompatParcelizer + 111;
                IconCompatParcelizer = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i21 = i20 % 2;
                z = false;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new flatMapAnnotations(i4, strMediaMetadataCompat, strMediaMetadataCompat2, getannotationsui_text);
    }
}
