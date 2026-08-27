package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.database.entity.state.Courier$VehicleType;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class getSpanStyle implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    public static final getSpanStyle RemoteActionCompatParcelizer;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;

    static {
        getSpanStyle getspanstyle = new getSpanStyle();
        RemoteActionCompatParcelizer = getspanstyle;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.database.entity.state.Courier.VehicleType", getspanstyle, 5);
        oncloseactionlambda1.read("id", false);
        oncloseactionlambda1.read("name", false);
        oncloseactionlambda1.read("icon", false);
        oncloseactionlambda1.read("defaultSpeed", false);
        oncloseactionlambda1.read("profile", false);
        descriptor = oncloseactionlambda1;
        int i = serializer + 77;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 1;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 3;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambda92m0p9sit5uf70mvjf4rwmruda;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = read + 67;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Courier$VehicleType courier$VehicleType = (Courier$VehicleType) obj;
            courier$VehicleType.getClass();
            r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            Courier$VehicleType.write$Self$database(courier$VehicleType, defaultInAppMessageSlideupViewFactorySerializer, r8lambda92m0p9sit5uf70mvjf4rwmruda);
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            return;
        }
        Courier$VehicleType courier$VehicleType2 = (Courier$VehicleType) obj;
        courier$VehicleType2.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda2 = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer2 = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2);
        Courier$VehicleType.write$Self$database(courier$VehicleType2, defaultInAppMessageSlideupViewFactorySerializer2, r8lambda92m0p9sit5uf70mvjf4rwmruda2);
        defaultInAppMessageSlideupViewFactorySerializer2.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda2);
        int i3 = 84 / 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 45;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1ArrAccess$get$childSerializers$cp = Courier$VehicleType.access$get$childSerializers$cp();
        onDismissed ondismissed = onDismissed.write;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {LazyKt__LazyJVMKt.read(ondismissed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(ondismissed), onviewdetachedfromwindowlambda1ArrAccess$get$childSerializers$cp[4].MediaSessionCompatResultReceiverWrapper()};
        int i4 = read + 93;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 99;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1ArrAccess$get$childSerializers$cp = Courier$VehicleType.access$get$childSerializers$cp();
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = true;
        int i4 = 0;
        Long l = null;
        String str = null;
        String str2 = null;
        Long l2 = null;
        PlatformTextStyle platformTextStyle = null;
        while (z) {
            int i5 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i5 != -1) {
                int i6 = read;
                int i7 = i6 + 9;
                IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (i5 != 0) {
                    int i8 = i6 + 7;
                    int i9 = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    IconCompatParcelizer = i9;
                    int i10 = i8 % 2;
                    if (i5 == 1) {
                        str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                        i4 |= 2;
                        int i11 = IconCompatParcelizer + 109;
                        read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                    } else if (i5 != 2) {
                        int i13 = i9 + 97;
                        read = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i14 = i13 % 2;
                        if (i5 == 3) {
                            l2 = (Long) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, onDismissed.write, l2);
                            i4 |= 8;
                        } else {
                            if (i5 != 4) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                                return null;
                            }
                            platformTextStyle = (PlatformTextStyle) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1ArrAccess$get$childSerializers$cp[4].MediaSessionCompatResultReceiverWrapper(), platformTextStyle);
                            i4 |= 16;
                        }
                    } else {
                        str2 = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
                        i4 |= 4;
                    }
                } else {
                    l = (Long) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, onDismissed.write, l);
                    i4 |= 1;
                }
            } else {
                int i15 = IconCompatParcelizer + 7;
                read = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i16 = i15 % 2;
                z = false;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new Courier$VehicleType(i4, l, str, str2, l2, platformTextStyle, null);
    }
}
