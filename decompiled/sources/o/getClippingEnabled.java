package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public final class getClippingEnabled implements setGraphicModalMaxWidthDp {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public final setWasCloseMessageCalled IconCompatParcelizer;
    public final setGraphicModalMaxWidthDp serializer;
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA write;
    public static final Set read = onContentCardClicked.MediaSessionCompatQueueItem(new String[]{"b2b", "error_message"});
    public static final Set RemoteActionCompatParcelizer = RangesKt.write((Object) "customer_chat");

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 1;
        MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = this.write;
        int i5 = i2 + 91;
        MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    public getClippingEnabled(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp) {
        setgraphicmodalmaxwidthdp.getClass();
        this.serializer = setgraphicmodalmaxwidthdp;
        setWasCloseMessageCalled setwasclosemessagecalled = new setWasCloseMessageCalled(setgraphicmodalmaxwidthdp, 0);
        this.IconCompatParcelizer = setwasclosemessagecalled;
        this.write = (InAppMessageJavascriptInterfaceCompanion) setwasclosemessagecalled.write;
    }

    static {
        int i = RatingCompat + 9;
        MediaSessionCompatQueueItem = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 25;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        List list = (List) obj;
        list.getClass();
        this.IconCompatParcelizer.serialize(defaultInAppMessageViewWrapperFactory, list);
        int i4 = MediaDescriptionCompat + 39;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        Object objIconCompatParcelizer;
        executeAsList executeaslist;
        int i = 2 % 2;
        setTouchListener settouchlistener = (setTouchListener) defaultInAppMessageModalViewFactoryCompanion;
        SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection = settouchlistener.read();
        try {
            requestDisallowParentIntercept requestdisallowparentinterceptIconCompatParcelizer = TouchAwareSwipeDismissTouchListener.IconCompatParcelizer(swipeDismissTouchListenerVerticalDismissDirection);
            ArrayList arrayList = new ArrayList();
            Iterator it = requestdisallowparentinterceptIconCompatParcelizer.content.iterator();
            while (it.hasNext()) {
                int i2 = MediaDescriptionCompat + 81;
                MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                Object obj = null;
                if (i2 % 2 == 0) {
                    SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection2 = (SwipeDismissTouchListenerVerticalDismissDirection) it.next();
                    try {
                        resetTransientState resettransientstateSerializer = settouchlistener.serializer();
                        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = this.serializer;
                        objIconCompatParcelizer = resettransientstateSerializer.IconCompatParcelizer(setgraphicmodalmaxwidthdp, swipeDismissTouchListenerVerticalDismissDirection2);
                        int i3 = 45 / 0;
                    } catch (SerializationException e) {
                        Object obj2 = TouchAwareSwipeDismissTouchListener.RemoteActionCompatParcelizer(swipeDismissTouchListenerVerticalDismissDirection2).get("type");
                        r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0 r8lambdagbekcaskecamm7h9dyqnzofon0 = obj2 instanceof r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0 ? (r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0) obj2 : null;
                        String strIconCompatParcelizer = r8lambdagbekcaskecamm7h9dyqnzofon0 != null ? r8lambdagbekcaskecamm7h9dyqnzofon0.IconCompatParcelizer() : null;
                        if (onContentCardDismissed.write(read, strIconCompatParcelizer)) {
                            executeaslist = executeAsList.OA;
                        } else if (onContentCardDismissed.write(RemoteActionCompatParcelizer, strIconCompatParcelizer)) {
                            int i4 = MediaBrowserCompatMediaItem + 71;
                            MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i4 % 2 != 0) {
                                executeAsList executeaslist2 = executeAsList.OTW;
                                throw null;
                            }
                            executeaslist = executeAsList.OTW;
                        } else {
                            executeaslist = executeAsList.DF;
                        }
                        getDefaultViewModelCreationExtras.RemoteActionCompatParcelizer(swipeDismissTouchListenerVerticalDismissDirection2, e, strIconCompatParcelizer, executeaslist);
                        objIconCompatParcelizer = null;
                    }
                } else {
                    SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection3 = (SwipeDismissTouchListenerVerticalDismissDirection) it.next();
                    resetTransientState resettransientstateSerializer2 = settouchlistener.serializer();
                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2 = this.serializer;
                    objIconCompatParcelizer = resettransientstateSerializer2.IconCompatParcelizer(setgraphicmodalmaxwidthdp2, swipeDismissTouchListenerVerticalDismissDirection3);
                }
                if (objIconCompatParcelizer != null) {
                    int i5 = MediaDescriptionCompat + 89;
                    MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        arrayList.add(objIconCompatParcelizer);
                        obj.hashCode();
                        throw null;
                    }
                    arrayList.add(objIconCompatParcelizer);
                }
            }
            return arrayList;
        } catch (Exception e2) {
            getDefaultViewModelCreationExtras.RemoteActionCompatParcelizer(swipeDismissTouchListenerVerticalDismissDirection, e2, executeAsList.DF);
            return instance_delegatelambda0.write;
        }
    }
}
