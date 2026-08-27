package o;

import androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1;
import bo.app.ah$$ExternalSyntheticLambda0;
import com.deliveryhero.selfServiceChat.domain.exceptions.UnreadEndpointException;
import java.util.Collections;
import java.util.Map;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes2.dex */
public final class VectorPainterKtrememberVectorPainter211 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    public final /* synthetic */ int IconCompatParcelizer = 0;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorPainterKtrememberVectorPainter211(getRectangleGoahg getrectanglegoahg, updateSemanticsCopy updatesemanticscopy) {
        super(getOnBackInvokedCallback.RemoteActionCompatParcelizer);
        this.write = getrectanglegoahg;
        this.serializer = updatesemanticscopy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(TextAnnouncementContentCardView textAnnouncementContentCardView, Throwable th) throws Throwable {
        MainCoroutineDispatcher mainCoroutineDispatcherIconCompatParcelizer;
        MainCoroutineDispatcher mainCoroutineDispatcherIconCompatParcelizer2;
        int i = this.IconCompatParcelizer;
        ShortNewsContentCardViewCompanion shortNewsContentCardViewCompanion = ShortNewsContentCardViewCompanion.serializer;
        Object obj = this.write;
        Object obj2 = this.serializer;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (i == 0) {
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
            ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder = getcontentviewgroupparentlayout.getCoroutineContext().get(shortNewsContentCardViewCompanion);
            MainCoroutineDispatcher mainCoroutineDispatcher = shortNewsContentCardViewViewHolder instanceof MainCoroutineDispatcher ? (MainCoroutineDispatcher) shortNewsContentCardViewViewHolder : null;
            if (mainCoroutineDispatcher == null || (mainCoroutineDispatcherIconCompatParcelizer = mainCoroutineDispatcher.IconCompatParcelizer()) == null) {
                return;
            }
            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, mainCoroutineDispatcherIconCompatParcelizer, null, new FlowLiveDataConversions$asFlow$1$1(th, (ShortNewsContentCardView) (objArr == true ? 1 : 0), obj2, 11), 2);
            return;
        }
        if (i == 1) {
            updateSemanticsCopy updatesemanticscopy = (updateSemanticsCopy) obj2;
            getLayoutDirection.read(th, new ah$$ExternalSyntheticLambda0((getRectangleGoahg) obj, 16, updatesemanticscopy));
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) updatesemanticscopy.write.get(getOnBackInvokedCallback.RemoteActionCompatParcelizer);
            if (coroutineExceptionHandler == null) {
                throw th;
            }
            coroutineExceptionHandler.handleException(textAnnouncementContentCardView, th);
            return;
        }
        if (i == 2) {
            asComposePaint ascomposepaint = (asComposePaint) obj;
            ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder2 = ascomposepaint.RemoteActionCompatParcelizer.get(shortNewsContentCardViewCompanion);
            MainCoroutineDispatcher mainCoroutineDispatcher2 = shortNewsContentCardViewViewHolder2 instanceof MainCoroutineDispatcher ? (MainCoroutineDispatcher) shortNewsContentCardViewViewHolder2 : null;
            if (mainCoroutineDispatcher2 == null || (mainCoroutineDispatcherIconCompatParcelizer2 = mainCoroutineDispatcher2.IconCompatParcelizer()) == null) {
                return;
            }
            BuildersKt.RemoteActionCompatParcelizer(ascomposepaint, mainCoroutineDispatcherIconCompatParcelizer2, null, new FlowLiveDataConversions$asFlow$1$1(th, (ShortNewsContentCardView) (objArr2 == true ? 1 : 0), obj2, 5), 2);
            return;
        }
        com.deliveryhero.customerchat.service.ChatService chatService = (com.deliveryhero.customerchat.service.ChatService) obj2;
        th.printStackTrace();
        ((getMinDebounceDeadline) obj).invoke(th);
        if (th instanceof UnreadEndpointException) {
            LayerSnapshotV21 layerSnapshotV21Write = ((ViewLayerVerificationHelper31) chatService.serializer).write();
            String str = layerSnapshotV21Write != null ? layerSnapshotV21Write.read().id : null;
            isIdentityannotations isidentityannotations = chatService.read.serializer;
            if (isidentityannotations != null) {
                Map mapSingletonMap = Collections.singletonMap("USER_ID", String.valueOf(str));
                mapSingletonMap.getClass();
                isidentityannotations.serializer("GCC_USER_UNREAD_COUNT_EVENT", mapSingletonMap, UnreadEndpointException.IconCompatParcelizer);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorPainterKtrememberVectorPainter211(asComposePaint ascomposepaint, com.deliveryhero.chatui.view.root.CustomerChatViewModel customerChatViewModel) {
        super(getOnBackInvokedCallback.RemoteActionCompatParcelizer);
        this.write = ascomposepaint;
        this.serializer = customerChatViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorPainterKtrememberVectorPainter211(getMinDebounceDeadline getmindebouncedeadline, com.deliveryhero.customerchat.service.ChatService chatService) {
        super(getOnBackInvokedCallback.RemoteActionCompatParcelizer);
        this.write = getmindebouncedeadline;
        this.serializer = chatService;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorPainterKtrememberVectorPainter211(ContextScope contextScope, obtainSizePxVpY3zN4 obtainsizepxvpy3zn4) {
        super(getOnBackInvokedCallback.RemoteActionCompatParcelizer);
        this.write = contextScope;
        this.serializer = obtainsizepxvpy3zn4;
    }
}
