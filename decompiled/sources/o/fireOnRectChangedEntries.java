package o;

import com.roadrunner.customerchat.legacy.core.manager.CustomerChatManagerImpl;
import com.roadrunner.database.dao.SessionDao_Impl$$ExternalSyntheticLambda1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class fireOnRectChangedEntries extends ContinuationImpl {
    private static int MediaSessionCompatQueueItem = 1;
    private static int write;
    public final /* synthetic */ CustomerChatManagerImpl IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public SessionDao_Impl$$ExternalSyntheticLambda1 serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fireOnRectChangedEntries(CustomerChatManagerImpl customerChatManagerImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = customerChatManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 49;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.read = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            this.IconCompatParcelizer.sendMessage(null, null, null, this);
            obj2.hashCode();
            throw null;
        }
        this.read = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objSendMessage = this.IconCompatParcelizer.sendMessage(null, null, null, this);
        int i3 = write + 49;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return objSendMessage;
        }
        obj2.hashCode();
        throw null;
    }
}
