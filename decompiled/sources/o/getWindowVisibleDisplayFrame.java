package o;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getWindowVisibleDisplayFrame implements setGraphicModalMaxWidthDp {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    public final Set IconCompatParcelizer;
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA RemoteActionCompatParcelizer;
    public final Set read;
    public final executeAsList serializer;
    public final setGraphicModalMaxWidthDp write;

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = RatingCompat + 71;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.RemoteActionCompatParcelizer;
        }
        throw null;
    }

    public getWindowVisibleDisplayFrame(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp, executeAsList executeaslist, Set set, Set set2) {
        setgraphicmodalmaxwidthdp.getClass();
        executeaslist.getClass();
        set.getClass();
        set2.getClass();
        this.write = setgraphicmodalmaxwidthdp;
        this.serializer = executeaslist;
        this.IconCompatParcelizer = set;
        this.read = set2;
        this.RemoteActionCompatParcelizer = (InAppMessageJavascriptInterfaceCompanion) new setWasCloseMessageCalled(setgraphicmodalmaxwidthdp, 0).write;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 55;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        List list = (List) obj;
        list.getClass();
        LazyKt__LazyJVMKt.serializer(this.write).serialize(defaultInAppMessageViewWrapperFactory, list);
        int i4 = MediaBrowserCompatMediaItem + 79;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0088  */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        Object objIconCompatParcelizer;
        int i = 2 % 2;
        executeAsList executeaslist = this.serializer;
        setTouchListener settouchlistener = (setTouchListener) defaultInAppMessageModalViewFactoryCompanion;
        SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection = settouchlistener.read();
        try {
            requestDisallowParentIntercept requestdisallowparentinterceptIconCompatParcelizer = TouchAwareSwipeDismissTouchListener.IconCompatParcelizer(swipeDismissTouchListenerVerticalDismissDirection);
            ArrayList arrayList = new ArrayList();
            for (SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection2 : requestdisallowparentinterceptIconCompatParcelizer.content) {
                int i2 = MediaBrowserCompatMediaItem + 1;
                RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                Object obj = null;
                try {
                    resetTransientState resettransientstateSerializer = settouchlistener.serializer();
                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = this.write;
                    objIconCompatParcelizer = resettransientstateSerializer.IconCompatParcelizer(setgraphicmodalmaxwidthdp, swipeDismissTouchListenerVerticalDismissDirection2);
                } catch (SerializationException e) {
                    Object obj2 = TouchAwareSwipeDismissTouchListener.RemoteActionCompatParcelizer(swipeDismissTouchListenerVerticalDismissDirection2).get("type");
                    r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0 r8lambdagbekcaskecamm7h9dyqnzofon0 = obj2 instanceof r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0 ? (r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0) obj2 : null;
                    String strIconCompatParcelizer = r8lambdagbekcaskecamm7h9dyqnzofon0 != null ? r8lambdagbekcaskecamm7h9dyqnzofon0.IconCompatParcelizer() : null;
                    if (onContentCardDismissed.write(this.IconCompatParcelizer, strIconCompatParcelizer)) {
                        access1001.RemoteActionCompatParcelizer(true, swipeDismissTouchListenerVerticalDismissDirection2, e, strIconCompatParcelizer, executeaslist);
                        throw e;
                    }
                    int i4 = RatingCompat + 17;
                    MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        int i5 = 53 / 0;
                        if (!onContentCardDismissed.write(this.read, strIconCompatParcelizer)) {
                            access1001.RemoteActionCompatParcelizer(false, swipeDismissTouchListenerVerticalDismissDirection2, e, strIconCompatParcelizer, executeaslist);
                        }
                    } else if (!onContentCardDismissed.write(this.read, strIconCompatParcelizer)) {
                        access1001.RemoteActionCompatParcelizer(false, swipeDismissTouchListenerVerticalDismissDirection2, e, strIconCompatParcelizer, executeaslist);
                    }
                    objIconCompatParcelizer = null;
                }
                if (objIconCompatParcelizer != null) {
                    int i6 = RatingCompat + 81;
                    MediaBrowserCompatMediaItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i6 % 2 != 0) {
                        arrayList.add(objIconCompatParcelizer);
                        obj.hashCode();
                        throw null;
                    }
                    arrayList.add(objIconCompatParcelizer);
                }
            }
            return arrayList;
        } catch (Exception e2) {
            access1001.IconCompatParcelizer(true, swipeDismissTouchListenerVerticalDismissDirection, e2, executeaslist);
            return instance_delegatelambda0.write;
        }
    }
}
