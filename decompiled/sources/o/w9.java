package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w9 implements getInAppMessageManager {
    public static final w9 IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;

    static {
        w9 w9Var = new w9();
        IconCompatParcelizer = w9Var;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.opportunities.data.Subzone", w9Var, 6);
        oncloseactionlambda1.read("id", false);
        oncloseactionlambda1.read("name", false);
        oncloseactionlambda1.read("zone_ids", false);
        oncloseactionlambda1.read("center_geo_json", false);
        oncloseactionlambda1.read("h3_indexes", false);
        oncloseactionlambda1.read("payment", true);
        descriptor = oncloseactionlambda1;
        int i = write + 111;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 15;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = read + 29;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = waExternalSyntheticLambda0.$childSerializers;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {afterClosed.IconCompatParcelizer, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), w0.serializer, onviewdetachedfromwindowlambda1Arr[4].MediaSessionCompatResultReceiverWrapper(), LazyKt__LazyJVMKt.read(Y.serializer)};
        int i4 = RemoteActionCompatParcelizer + 65;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
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
        int i2 = RemoteActionCompatParcelizer + 97;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        waExternalSyntheticLambda0 waexternalsyntheticlambda0 = (waExternalSyntheticLambda0) obj;
        waexternalsyntheticlambda0.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = waExternalSyntheticLambda0.$childSerializers;
        int i4 = waexternalsyntheticlambda0.id;
        w6ExternalSyntheticLambda0 w6externalsyntheticlambda0 = waexternalsyntheticlambda0.paymentResponse;
        defaultInAppMessageSlideupViewFactorySerializer.write(0, i4, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, waexternalsyntheticlambda0.name);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), waexternalsyntheticlambda0.zoneIds);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, w0.serializer, waexternalsyntheticlambda0.centerGeoJson);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[4].MediaSessionCompatResultReceiverWrapper(), waexternalsyntheticlambda0.h3Indexes);
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (w6externalsyntheticlambda0 != null) {
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        } else {
            int i5 = RemoteActionCompatParcelizer + 49;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, Y.serializer, w6externalsyntheticlambda0);
        int i7 = read + 89;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            int i8 = 3 % 3;
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        int i2 = read + 101;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = waExternalSyntheticLambda0.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        int i4 = 0;
        int iIconCompatParcelizer = 0;
        boolean z = true;
        String strMediaMetadataCompat = null;
        List list = null;
        vf vfVar = null;
        List list2 = null;
        w6ExternalSyntheticLambda0 w6externalsyntheticlambda0 = null;
        while (z) {
            int i5 = read + 71;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                Object obj = null;
                createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                obj.hashCode();
                throw null;
            }
            int i6 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            switch (i6) {
                case -1:
                    z = false;
                    break;
                case 0:
                    iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i4 |= 1;
                    break;
                case 1:
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i4 |= 2;
                    break;
                case 2:
                    list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), list);
                    i4 |= 4;
                    break;
                case 3:
                    vfVar = (vf) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, w0.serializer, vfVar);
                    i4 |= 8;
                    int i7 = RemoteActionCompatParcelizer + 49;
                    read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    break;
                case 4:
                    list2 = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[4].MediaSessionCompatResultReceiverWrapper(), list2);
                    i4 |= 16;
                    break;
                case 5:
                    w6externalsyntheticlambda0 = (w6ExternalSyntheticLambda0) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, Y.serializer, w6externalsyntheticlambda0);
                    i4 |= 32;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i6);
                    return null;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new waExternalSyntheticLambda0(i4, iIconCompatParcelizer, strMediaMetadataCompat, list, vfVar, list2, w6externalsyntheticlambda0);
    }
}
