package o;

import com.roadrunner.customerchat.legacy.core.manager.CustomerChatManagerImpl;
import com.roadrunner.customerchat.legacy.core.manager.CustomerChatProviderImpl;
import com.roadrunner.customerchat.legacy.core.manager.CustomerChatRepository;
import com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity;
import java.util.List;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class runFor implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ CustomerChatProviderImpl IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ runFor(CustomerChatProviderImpl customerChatProviderImpl, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = customerChatProviderImpl;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        boolean zWrite;
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        CustomerChatProviderImpl customerChatProviderImpl = this.IconCompatParcelizer;
        if (i2 == 0) {
            Throwable th = (Throwable) obj;
            th.getClass();
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(customerChatProviderImpl.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer(th), "CustomerChat startChat failed", new Object[0]);
            setViewToWindowMatrixQ8lPUPs setviewtowindowmatrixq8lpups = customerChatProviderImpl.write;
            String string = th.toString();
            string.getClass();
            setviewtowindowmatrixq8lpups.read("chat_start_failed", string);
            return createfromparcel;
        }
        List list = (List) obj;
        CustomerChatManagerImpl customerChatManagerImpl = customerChatProviderImpl.read;
        if (customerChatManagerImpl.MediaMetadataCompat.write()) {
            SelfServiceCustomerChatActivity.MediaBrowserCompatMediaItem.getClass();
            zWrite = findParagraphByLineIndex.read();
        } else {
            customerChatManagerImpl.read();
            com.deliveryhero.chatui.view.root.CustomerChatActivity.RatingCompat.getClass();
            zWrite = updateClipBounds.write();
        }
        if (!zWrite) {
            int i3 = write + 7;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("CustomerChat getUnreadCounts disconnect", new Object[1]);
            } else {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("CustomerChat getUnreadCounts disconnect", new Object[0]);
            }
            customerChatManagerImpl.read().PlaybackStateCompat.get();
            int i4 = write + 3;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        customerChatProviderImpl.MediaSessionCompatToken = false;
        CustomerChatRepository customerChatRepository = customerChatProviderImpl.serializer;
        list.getClass();
        customerChatRepository.read.onNext(list);
        return createfromparcel;
    }
}
