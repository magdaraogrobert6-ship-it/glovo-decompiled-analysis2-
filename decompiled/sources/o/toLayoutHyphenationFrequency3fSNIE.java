package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class toLayoutHyphenationFrequency3fSNIE implements getInAppMessageManager {
    public static final toLayoutHyphenationFrequency3fSNIE IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer;
    private static int write;

    static {
        toLayoutHyphenationFrequency3fSNIE tolayouthyphenationfrequency3fsnie = new toLayoutHyphenationFrequency3fSNIE();
        IconCompatParcelizer = tolayouthyphenationfrequency3fsnie;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.customerchat.selfservice.data.bridge.HostMessage.HostLoadingPerformanceMeasurement", tolayouthyphenationfrequency3fsnie, 3);
        oncloseactionlambda1.read("id", true);
        oncloseactionlambda1.read("messageType", true);
        oncloseactionlambda1.read("payload", false);
        descriptor = oncloseactionlambda1;
        int i = serializer + 43;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 47 / 0;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 73;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i3 + 83;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambda92m0p9sit5uf70mvjf4rwmruda;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = write + 1;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, beforeinappmessageviewclosed, createPlatformTextStyle.IconCompatParcelizer};
        int i4 = RemoteActionCompatParcelizer + 83;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return setgraphicmodalmaxwidthdpArr;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0048 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x006d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x001d A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = write + 75;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        AndroidTextStyle_androidKt androidTextStyle_androidKt = null;
        int i6 = 0;
        boolean z = true;
        while (z) {
            int i7 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i7 != -1) {
                int i8 = RemoteActionCompatParcelizer;
                int i9 = i8 + 35;
                write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                if (i7 != 0) {
                    int i11 = i8 + 35;
                    int i12 = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    write = i12;
                    if (i11 % 2 != 0) {
                        if (i7 != 1) {
                            i2 = i12 + 101;
                            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i2 % 2 == 0) {
                                if (i7 != 2) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i7);
                                    return null;
                                }
                                androidTextStyle_androidKt = (AndroidTextStyle_androidKt) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, createPlatformTextStyle.IconCompatParcelizer, androidTextStyle_androidKt);
                                i6 |= 4;
                            } else {
                                if (i7 != 2) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i7);
                                    return null;
                                }
                                androidTextStyle_androidKt = (AndroidTextStyle_androidKt) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, createPlatformTextStyle.IconCompatParcelizer, androidTextStyle_androidKt);
                                i6 |= 4;
                            }
                        } else {
                            strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                            i6 |= 2;
                            i = RemoteActionCompatParcelizer + 7;
                            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i % 2 != 0) {
                                int i13 = 4 / 5;
                            }
                        }
                    } else if (i7 != 1) {
                        i2 = i12 + 101;
                        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i2 % 2 == 0) {
                            if (i7 != 2) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i7);
                                return null;
                            }
                            androidTextStyle_androidKt = (AndroidTextStyle_androidKt) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, createPlatformTextStyle.IconCompatParcelizer, androidTextStyle_androidKt);
                            i6 |= 4;
                        } else {
                            if (i7 != 2) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i7);
                                return null;
                            }
                            androidTextStyle_androidKt = (AndroidTextStyle_androidKt) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, createPlatformTextStyle.IconCompatParcelizer, androidTextStyle_androidKt);
                            i6 |= 4;
                        }
                    } else {
                        strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i6 |= 2;
                        i = RemoteActionCompatParcelizer + 7;
                        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i % 2 != 0) {
                            int i14 = 4 / 5;
                        }
                    }
                } else {
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i6 |= 1;
                }
            } else {
                z = false;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new toLayoutLineBreakWordStylewPN0Rpw(i6, strMediaMetadataCompat, strMediaMetadataCompat2, androidTextStyle_androidKt);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x009b  */
    /* JADX WARN: Code duplicated, block: B:9:0x005c  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 89;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            toLayoutLineBreakWordStylewPN0Rpw tolayoutlinebreakwordstylewpn0rpw = (toLayoutLineBreakWordStylewPN0Rpw) obj;
            tolayoutlinebreakwordstylewpn0rpw.getClass();
            String str = tolayoutlinebreakwordstylewpn0rpw.messageType;
            String str2 = tolayoutlinebreakwordstylewpn0rpw.id;
            r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda).read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        toLayoutLineBreakWordStylewPN0Rpw tolayoutlinebreakwordstylewpn0rpw2 = (toLayoutLineBreakWordStylewPN0Rpw) obj;
        tolayoutlinebreakwordstylewpn0rpw2.getClass();
        String str3 = tolayoutlinebreakwordstylewpn0rpw2.messageType;
        String str4 = tolayoutlinebreakwordstylewpn0rpw2.id;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda2 = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2)) {
            defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 0, str4);
            int i3 = write + 125;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        } else {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str4, "HOST_LOADING_PERFORMANCE_MEASUREMENT_" + UUID.randomUUID()}, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 0, str4);
                int i5 = write + 125;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2)) {
            defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 1, str3);
        } else {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str3, "HOST_LOADING_PERFORMANCE_MEASUREMENT"}, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 1, str3);
            }
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 2, createPlatformTextStyle.IconCompatParcelizer, tolayoutlinebreakwordstylewpn0rpw2.payload);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda2);
    }
}
