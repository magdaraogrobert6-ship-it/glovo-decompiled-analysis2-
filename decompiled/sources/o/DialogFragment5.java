package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class DialogFragment5 implements getInAppMessageManager {
    public static final DialogFragment5 IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;

    static {
        DialogFragment5 dialogFragment5 = new DialogFragment5();
        IconCompatParcelizer = dialogFragment5;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.helpcenter.data.unread_message_count.dto.Chat", dialogFragment5, 2);
        oncloseactionlambda1.read("unread_message_count", false);
        oncloseactionlambda1.read("active", false);
        descriptor = oncloseactionlambda1;
        int i = RemoteActionCompatParcelizer + 39;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = write + 15;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i3 + 71;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = write + 77;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {afterClosed.IconCompatParcelizer, getWasCloseMessageCalled.write};
        int i4 = write + 19;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = read + 57;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        instantiate instantiateVar = (instantiate) obj;
        instantiateVar.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.write(0, instantiateVar.unreadMessageCount, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, instantiateVar.active);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = read + 7;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0046 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0049 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x003b A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = write + 65;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        int i6 = 0;
        int iIconCompatParcelizer = 0;
        boolean zWrite = false;
        boolean z = true;
        while (z) {
            int i7 = write + 101;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                i = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                int i8 = 65 / 0;
                if (i == -1) {
                    z = false;
                } else if (i != 0) {
                    i2 = write + 91;
                    read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        if (i != 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                            return null;
                        }
                        zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i6 |= 2;
                    } else {
                        if (i != 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                            return null;
                        }
                        zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i6 |= 2;
                    }
                } else {
                    iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i6 |= 1;
                }
            } else {
                i = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                if (i == -1) {
                    z = false;
                } else if (i != 0) {
                    i2 = write + 91;
                    read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        if (i != 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                            return null;
                        }
                        zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i6 |= 2;
                    } else {
                        if (i != 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                            return null;
                        }
                        zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i6 |= 2;
                    }
                } else {
                    iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i6 |= 1;
                }
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new instantiate(i6, iIconCompatParcelizer, zWrite);
    }
}
