package o;

import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.coroutines.channels.ProducerCoroutine;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getGlobalChangeEntries implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 read;
    public final /* synthetic */ ArrayList write;

    public /* synthetic */ getGlobalChangeEntries(InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, ArrayList arrayList, int i) {
        this.IconCompatParcelizer = i;
        this.read = inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
        this.write = arrayList;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        Object next;
        Object next2;
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ArrayList<fireWithUpdatedRectui> arrayList = this.write;
        InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 = this.read;
        if (i2 == 0) {
            LinkInteractionListener linkInteractionListener = (LinkInteractionListener) obj;
            ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
            for (fireWithUpdatedRectui firewithupdatedrectui : arrayList) {
                Iterator it = linkInteractionListener.read.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((getUrl) next).RemoteActionCompatParcelizer, firewithupdatedrectui.IconCompatParcelizer}, getCieXyz.write())).booleanValue());
                getUrl geturl = (getUrl) next;
                arrayList2.add(fireWithUpdatedRectui.RemoteActionCompatParcelizer(firewithupdatedrectui, geturl != null ? geturl.serializer : 0));
            }
            ProducerCoroutine producerCoroutine = (ProducerCoroutine) inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
            producerCoroutine.b_(arrayList2);
            producerCoroutine.IconCompatParcelizer((Throwable) null);
            return createfromparcel;
        }
        com.deliveryhero.chatsdk.domain.model.messages.UnreadCountDetails unreadCountDetails = (com.deliveryhero.chatsdk.domain.model.messages.UnreadCountDetails) obj;
        ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        int i3 = serializer + 107;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        for (fireWithUpdatedRectui firewithupdatedrectui2 : arrayList) {
            int i5 = RemoteActionCompatParcelizer + 21;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            Iterator<T> it2 = unreadCountDetails.getChats().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((com.deliveryhero.chatsdk.domain.model.messages.UnreadCountDetails.Chat) next2).getOrderId(), firewithupdatedrectui2.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    int i7 = RemoteActionCompatParcelizer + 125;
                    serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i7 % 2 == 0) {
                        break;
                    }
                    int i8 = 3 % 3;
                    break;
                }
            }
            com.deliveryhero.chatsdk.domain.model.messages.UnreadCountDetails.Chat chat = (com.deliveryhero.chatsdk.domain.model.messages.UnreadCountDetails.Chat) next2;
            arrayList3.add(fireWithUpdatedRectui.RemoteActionCompatParcelizer(firewithupdatedrectui2, chat != null ? chat.getUnreadMessageCount() : 0));
        }
        ProducerCoroutine producerCoroutine2 = (ProducerCoroutine) inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
        producerCoroutine2.b_(arrayList3);
        producerCoroutine2.IconCompatParcelizer((Throwable) null);
        return createfromparcel;
    }
}
