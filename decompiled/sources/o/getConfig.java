package o;

import com.deliveryhero.selfServiceChat.ui.WebChatViewmodel;
import com.deliveryhero.selfServiceChat.ui.WebChatViewmodel$trackEvent$$inlined$exceptionHandler$1$1;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: loaded from: classes2.dex */
public final class getConfig extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    public final /* synthetic */ asComposePaint IconCompatParcelizer;
    public final /* synthetic */ WebChatViewmodel RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    /* JADX WARN: Illegal instructions before constructor call */
    public getConfig(asComposePaint ascomposepaint, WebChatViewmodel webChatViewmodel, int i) {
        this.serializer = i;
        getOnBackInvokedCallback getonbackinvokedcallback = getOnBackInvokedCallback.RemoteActionCompatParcelizer;
        this.IconCompatParcelizer = ascomposepaint;
        this.RemoteActionCompatParcelizer = webChatViewmodel;
        if (i == 1) {
            super(getonbackinvokedcallback);
            return;
        }
        if (i == 2) {
            super(getonbackinvokedcallback);
        } else if (i != 3) {
            super(getonbackinvokedcallback);
        } else {
            super(getonbackinvokedcallback);
        }
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(TextAnnouncementContentCardView textAnnouncementContentCardView, Throwable th) {
        MainCoroutineDispatcher mainCoroutineDispatcherIconCompatParcelizer;
        MainCoroutineDispatcher mainCoroutineDispatcherIconCompatParcelizer2;
        MainCoroutineDispatcher mainCoroutineDispatcherIconCompatParcelizer3;
        MainCoroutineDispatcher mainCoroutineDispatcherIconCompatParcelizer4;
        int i = this.serializer;
        WebChatViewmodel webChatViewmodel = this.RemoteActionCompatParcelizer;
        ShortNewsContentCardViewCompanion shortNewsContentCardViewCompanion = ShortNewsContentCardViewCompanion.serializer;
        asComposePaint ascomposepaint = this.IconCompatParcelizer;
        int i2 = 2;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i == 0) {
            ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder = ascomposepaint.RemoteActionCompatParcelizer.get(shortNewsContentCardViewCompanion);
            MainCoroutineDispatcher mainCoroutineDispatcher = shortNewsContentCardViewViewHolder instanceof MainCoroutineDispatcher ? (MainCoroutineDispatcher) shortNewsContentCardViewViewHolder : null;
            if (mainCoroutineDispatcher == null || (mainCoroutineDispatcherIconCompatParcelizer = mainCoroutineDispatcher.IconCompatParcelizer()) == null) {
                return;
            }
            BuildersKt.RemoteActionCompatParcelizer(ascomposepaint, mainCoroutineDispatcherIconCompatParcelizer, null, new WebChatViewmodel$trackEvent$$inlined$exceptionHandler$1$1(th, shortNewsContentCardView, webChatViewmodel, 0), 2);
            return;
        }
        int i3 = 1;
        if (i == 1) {
            ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder2 = ascomposepaint.RemoteActionCompatParcelizer.get(shortNewsContentCardViewCompanion);
            MainCoroutineDispatcher mainCoroutineDispatcher2 = shortNewsContentCardViewViewHolder2 instanceof MainCoroutineDispatcher ? (MainCoroutineDispatcher) shortNewsContentCardViewViewHolder2 : null;
            if (mainCoroutineDispatcher2 == null || (mainCoroutineDispatcherIconCompatParcelizer2 = mainCoroutineDispatcher2.IconCompatParcelizer()) == null) {
                return;
            }
            BuildersKt.RemoteActionCompatParcelizer(ascomposepaint, mainCoroutineDispatcherIconCompatParcelizer2, null, new WebChatViewmodel$trackEvent$$inlined$exceptionHandler$1$1(th, shortNewsContentCardView, webChatViewmodel, i3), 2);
            return;
        }
        if (i != 2) {
            ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder3 = ascomposepaint.RemoteActionCompatParcelizer.get(shortNewsContentCardViewCompanion);
            MainCoroutineDispatcher mainCoroutineDispatcher3 = shortNewsContentCardViewViewHolder3 instanceof MainCoroutineDispatcher ? (MainCoroutineDispatcher) shortNewsContentCardViewViewHolder3 : null;
            if (mainCoroutineDispatcher3 == null || (mainCoroutineDispatcherIconCompatParcelizer4 = mainCoroutineDispatcher3.IconCompatParcelizer()) == null) {
                return;
            }
            BuildersKt.RemoteActionCompatParcelizer(ascomposepaint, mainCoroutineDispatcherIconCompatParcelizer4, null, new WebChatViewmodel$trackEvent$$inlined$exceptionHandler$1$1(th, shortNewsContentCardView, webChatViewmodel, 3), 2);
            return;
        }
        ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder4 = ascomposepaint.RemoteActionCompatParcelizer.get(shortNewsContentCardViewCompanion);
        MainCoroutineDispatcher mainCoroutineDispatcher4 = shortNewsContentCardViewViewHolder4 instanceof MainCoroutineDispatcher ? (MainCoroutineDispatcher) shortNewsContentCardViewViewHolder4 : null;
        if (mainCoroutineDispatcher4 == null || (mainCoroutineDispatcherIconCompatParcelizer3 = mainCoroutineDispatcher4.IconCompatParcelizer()) == null) {
            return;
        }
        BuildersKt.RemoteActionCompatParcelizer(ascomposepaint, mainCoroutineDispatcherIconCompatParcelizer3, null, new WebChatViewmodel$trackEvent$$inlined$exceptionHandler$1$1(th, shortNewsContentCardView, webChatViewmodel, i2), 2);
    }
}
