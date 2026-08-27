package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.TrackingEvent$$serializer;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.SerializationException;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final class getOffscreenke2Ky5w implements setGraphicModalMaxWidthDp {
    private static int read = 1;
    private static int write;
    public final Object IconCompatParcelizer;
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public getOffscreenke2Ky5w(int i) {
        this.serializer = i;
        if (i == 1) {
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = setFitInsetsSides.Companion.serializer();
            setgraphicmodalmaxwidthdpSerializer.getClass();
            this.IconCompatParcelizer = setgraphicmodalmaxwidthdpSerializer;
            r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor = setgraphicmodalmaxwidthdpSerializer.getDescriptor();
            descriptor.getClass();
            this.RemoteActionCompatParcelizer = descriptor.MediaBrowserCompatMediaItem() ? descriptor : new onOtherUrlActionlambda2(descriptor);
            return;
        }
        if (i != 2) {
            this.IconCompatParcelizer = DateTimeFormatter.ISO_DATE_TIME;
            this.RemoteActionCompatParcelizer = RangesKt.read("ZonedDateTime");
        } else {
            setWasCloseMessageCalled setwasclosemessagecalled = new setWasCloseMessageCalled(TrackingEvent$$serializer.write, 0);
            this.IconCompatParcelizer = setwasclosemessagecalled;
            this.RemoteActionCompatParcelizer = (InAppMessageJavascriptInterfaceCompanion) setwasclosemessagecalled.write;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = write + 49;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        int i5 = this.serializer;
        if (i5 != 0) {
            return i5 != 1 ? this.RemoteActionCompatParcelizer : this.RemoteActionCompatParcelizer;
        }
        DefaultInAppMessageWebViewClientListenerCompanion defaultInAppMessageWebViewClientListenerCompanion = (DefaultInAppMessageWebViewClientListenerCompanion) this.RemoteActionCompatParcelizer;
        int i6 = i3 + 105;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 45 / 0;
        }
        return defaultInAppMessageWebViewClientListenerCompanion;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = read + 1;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        Object obj2 = this.IconCompatParcelizer;
        if (i4 == 0) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            zonedDateTime.getClass();
            String str = ((DateTimeFormatter) obj2).format(zonedDateTime);
            str.getClass();
            defaultInAppMessageViewWrapperFactory.IconCompatParcelizer(str);
            return;
        }
        if (i4 != 1) {
            List list = (List) obj;
            list.getClass();
            ((setWasCloseMessageCalled) obj2).serialize(defaultInAppMessageViewWrapperFactory, list);
            return;
        }
        if (obj == null) {
            defaultInAppMessageViewWrapperFactory.IconCompatParcelizer();
            int i5 = write + 37;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } else {
            defaultInAppMessageViewWrapperFactory.read((setGraphicModalMaxWidthDp) obj2, obj);
        }
        int i7 = read + 47;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            int i8 = 73 / 0;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        setTouchListener settouchlistener;
        Object objIconCompatParcelizer;
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 11;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.serializer;
        Object obj = this.IconCompatParcelizer;
        if (i5 == 0) {
            Object obj2 = ((DateTimeFormatter) obj).parse(defaultInAppMessageModalViewFactoryCompanion.ResultReceiver(), new useConnection(1));
            obj2.getClass();
            return (ZonedDateTime) obj2;
        }
        if (i5 != 1) {
            setTouchListener settouchlistener2 = (setTouchListener) defaultInAppMessageModalViewFactoryCompanion;
            try {
                requestDisallowParentIntercept requestdisallowparentinterceptIconCompatParcelizer = TouchAwareSwipeDismissTouchListener.IconCompatParcelizer(settouchlistener2.read());
                ArrayList arrayList = new ArrayList();
                for (SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection : requestdisallowparentinterceptIconCompatParcelizer.content) {
                    try {
                        objIconCompatParcelizer = settouchlistener2.serializer().IconCompatParcelizer((setGraphicModalMaxWidthDp) TrackingEvent$$serializer.write, swipeDismissTouchListenerVerticalDismissDirection);
                        int i6 = read + 29;
                        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                    } catch (SerializationException e) {
                        Object obj3 = TouchAwareSwipeDismissTouchListener.RemoteActionCompatParcelizer(swipeDismissTouchListenerVerticalDismissDirection).get("type");
                        r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0 r8lambdagbekcaskecamm7h9dyqnzofon0 = obj3 instanceof r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0 ? (r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0) obj3 : null;
                        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to deserialize tracking event. Type from payload: ", r8lambdagbekcaskecamm7h9dyqnzofon0 != null ? r8lambdagbekcaskecamm7h9dyqnzofon0.IconCompatParcelizer() : null), new Object[0]);
                        objIconCompatParcelizer = null;
                    }
                    if (objIconCompatParcelizer != null) {
                        arrayList.add(objIconCompatParcelizer);
                    }
                }
                return arrayList;
            } catch (Exception e2) {
                Timber.RemoteActionCompatParcelizer.write(e2);
                return instance_delegatelambda0.write;
            }
        }
        if (defaultInAppMessageModalViewFactoryCompanion instanceof setTouchListener) {
            int i8 = i2 + 69;
            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                throw null;
            }
            settouchlistener = (setTouchListener) defaultInAppMessageModalViewFactoryCompanion;
        } else {
            settouchlistener = null;
        }
        if (settouchlistener == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("ForgivingNullableSerializer can only be used with Json format");
            return null;
        }
        resetTransientState resettransientstateSerializer = settouchlistener.serializer();
        try {
            SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection2 = settouchlistener.read();
            if (swipeDismissTouchListenerVerticalDismissDirection2 instanceof r8lambdaOVm5S_u8QUSoMXvJUOeZHUBFeHc) {
                return null;
            }
            try {
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) obj;
                return resettransientstateSerializer.IconCompatParcelizer(setgraphicmodalmaxwidthdp, swipeDismissTouchListenerVerticalDismissDirection2);
            } catch (Exception e3) {
                access1001.IconCompatParcelizer(false, swipeDismissTouchListenerVerticalDismissDirection2, e3, executeAsList.DF);
                return null;
            }
        } catch (Exception e4) {
            access1001.IconCompatParcelizer(false, null, e4, executeAsList.DF);
            Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
            forest.RemoteActionCompatParcelizer("ForgivingNullableSerializer");
            forest.serializer(e4, "Failed to decode JSON element for nullable field. Returning null.", new Object[0]);
            return null;
        }
    }
}
