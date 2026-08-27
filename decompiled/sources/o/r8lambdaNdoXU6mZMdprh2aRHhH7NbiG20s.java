package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8lambdaNdoXU6mZMdprh2aRHhH7NbiG20s implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    public static final r8lambdaNdoXU6mZMdprh2aRHhH7NbiG20s RemoteActionCompatParcelizer;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;

    static {
        r8lambdaNdoXU6mZMdprh2aRHhH7NbiG20s r8lambdandoxu6mzmdprh2arhhh7nbig20s = new r8lambdaNdoXU6mZMdprh2aRHhH7NbiG20s();
        RemoteActionCompatParcelizer = r8lambdandoxu6mzmdprh2arhhh7nbig20s;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.settings.data.model.SettingsComponent", r8lambdandoxu6mzmdprh2arhhh7nbig20s, 3);
        oncloseactionlambda1.read("label", false);
        oncloseactionlambda1.read("link", true);
        oncloseactionlambda1.read("icon", false);
        descriptor = oncloseactionlambda1;
        int i = serializer + 109;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 17;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i3 + 119;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 57;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), beforeinappmessageviewclosed};
        int i4 = write + 47;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return setgraphicmodalmaxwidthdpArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = write + 105;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambdaMl5NQY1S6pYVxo4nai_kgBEGI r8lambdaml5nqy1s6pyvxo4nai_kgbegi = (r8lambdaMl5NQY1S6pYVxo4nai_kgBEGI) obj;
        r8lambdaml5nqy1s6pyvxo4nai_kgbegi.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        String str = r8lambdaml5nqy1s6pyvxo4nai_kgbegi.label;
        String str2 = r8lambdaml5nqy1s6pyvxo4nai_kgbegi.link;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (str2 != null) {
            }
            defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, r8lambdaml5nqy1s6pyvxo4nai_kgbegi.icon);
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        } else {
            int i4 = IconCompatParcelizer + 41;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, r8lambdaml5nqy1s6pyvxo4nai_kgbegi.icon);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        String strMediaMetadataCompat = null;
        String str = null;
        String strMediaMetadataCompat2 = null;
        int i2 = 0;
        boolean z = true;
        while (z) {
            int i3 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i3 != -1) {
                int i4 = IconCompatParcelizer + 109;
                int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                write = i5;
                int i6 = i4 % 2;
                if (i3 == 0) {
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i2 |= 1;
                } else if (i3 != 1) {
                    int i7 = i5 + 75;
                    IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    if (i3 != 2) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i3);
                        return null;
                    }
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                    i2 |= 4;
                } else {
                    str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                    i2 |= 2;
                }
            } else {
                z = false;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new r8lambdaMl5NQY1S6pYVxo4nai_kgBEGI(i2, strMediaMetadataCompat, str, strMediaMetadataCompat2);
    }
}
