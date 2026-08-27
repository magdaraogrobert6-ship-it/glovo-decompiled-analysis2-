package o;

import com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel;
import com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$trackEvent$$inlined$exceptionHandler$1$1;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: loaded from: classes3.dex */
public final class Paragraphdefault extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ asComposePaint serializer;
    public final /* synthetic */ WebChatViewModel write;

    /* JADX WARN: Illegal instructions before constructor call */
    public Paragraphdefault(asComposePaint ascomposepaint, WebChatViewModel webChatViewModel, int i) {
        this.RemoteActionCompatParcelizer = i;
        getOnBackInvokedCallback getonbackinvokedcallback = getOnBackInvokedCallback.RemoteActionCompatParcelizer;
        this.serializer = ascomposepaint;
        this.write = webChatViewModel;
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
        MainCoroutineDispatcher mainCoroutineDispatcher;
        MainCoroutineDispatcher mainCoroutineDispatcherIconCompatParcelizer;
        MainCoroutineDispatcher mainCoroutineDispatcher2;
        MainCoroutineDispatcher mainCoroutineDispatcherIconCompatParcelizer2;
        MainCoroutineDispatcher mainCoroutineDispatcher3;
        MainCoroutineDispatcher mainCoroutineDispatcherIconCompatParcelizer3;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.RemoteActionCompatParcelizer;
        WebChatViewModel webChatViewModel = this.write;
        ShortNewsContentCardViewCompanion shortNewsContentCardViewCompanion = ShortNewsContentCardViewCompanion.serializer;
        asComposePaint ascomposepaint = this.serializer;
        int i4 = 0;
        int i5 = 1;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i3 == 0) {
            ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder = ascomposepaint.RemoteActionCompatParcelizer.get(shortNewsContentCardViewCompanion);
            if (!(!(shortNewsContentCardViewViewHolder instanceof MainCoroutineDispatcher))) {
                mainCoroutineDispatcher = (MainCoroutineDispatcher) shortNewsContentCardViewViewHolder;
            } else {
                int i6 = read + 121;
                IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                mainCoroutineDispatcher = null;
            }
            if (mainCoroutineDispatcher == null || (mainCoroutineDispatcherIconCompatParcelizer = mainCoroutineDispatcher.IconCompatParcelizer()) == null) {
                return;
            }
            BuildersKt.RemoteActionCompatParcelizer(ascomposepaint, mainCoroutineDispatcherIconCompatParcelizer, null, new WebChatViewModel$trackEvent$$inlined$exceptionHandler$1$1(th, shortNewsContentCardView, webChatViewModel, i4), 2);
            return;
        }
        if (i3 == 1) {
            ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder2 = ascomposepaint.RemoteActionCompatParcelizer.get(shortNewsContentCardViewCompanion);
            if (!(shortNewsContentCardViewViewHolder2 instanceof MainCoroutineDispatcher)) {
                mainCoroutineDispatcher2 = null;
            } else {
                int i8 = IconCompatParcelizer + 103;
                read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                mainCoroutineDispatcher2 = (MainCoroutineDispatcher) shortNewsContentCardViewViewHolder2;
            }
            if (mainCoroutineDispatcher2 == null || (mainCoroutineDispatcherIconCompatParcelizer2 = mainCoroutineDispatcher2.IconCompatParcelizer()) == null) {
                return;
            }
            BuildersKt.RemoteActionCompatParcelizer(ascomposepaint, mainCoroutineDispatcherIconCompatParcelizer2, null, new WebChatViewModel$trackEvent$$inlined$exceptionHandler$1$1(th, shortNewsContentCardView, webChatViewModel, i5), 2);
            return;
        }
        if (i3 != 2) {
            ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder3 = ascomposepaint.RemoteActionCompatParcelizer.get(shortNewsContentCardViewCompanion);
            MainCoroutineDispatcher mainCoroutineDispatcher4 = shortNewsContentCardViewViewHolder3 instanceof MainCoroutineDispatcher ? (MainCoroutineDispatcher) shortNewsContentCardViewViewHolder3 : null;
            if (mainCoroutineDispatcher4 != null) {
                int i10 = IconCompatParcelizer + 23;
                read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
                MainCoroutineDispatcher mainCoroutineDispatcherIconCompatParcelizer4 = mainCoroutineDispatcher4.IconCompatParcelizer();
                if (mainCoroutineDispatcherIconCompatParcelizer4 != null) {
                    BuildersKt.RemoteActionCompatParcelizer(ascomposepaint, mainCoroutineDispatcherIconCompatParcelizer4, null, new WebChatViewModel$trackEvent$$inlined$exceptionHandler$1$1(th, shortNewsContentCardView, webChatViewModel, 3), 2);
                    return;
                }
                return;
            }
            return;
        }
        ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder4 = ascomposepaint.RemoteActionCompatParcelizer.get(shortNewsContentCardViewCompanion);
        if (shortNewsContentCardViewViewHolder4 instanceof MainCoroutineDispatcher) {
            int i12 = IconCompatParcelizer + 81;
            read = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i12 % 2 == 0) {
                mainCoroutineDispatcher3 = (MainCoroutineDispatcher) shortNewsContentCardViewViewHolder4;
                int i13 = 2 / 0;
            } else {
                mainCoroutineDispatcher3 = (MainCoroutineDispatcher) shortNewsContentCardViewViewHolder4;
            }
        } else {
            mainCoroutineDispatcher3 = null;
        }
        if (mainCoroutineDispatcher3 != null && (mainCoroutineDispatcherIconCompatParcelizer3 = mainCoroutineDispatcher3.IconCompatParcelizer()) != null) {
            BuildersKt.RemoteActionCompatParcelizer(ascomposepaint, mainCoroutineDispatcherIconCompatParcelizer3, null, new WebChatViewModel$trackEvent$$inlined$exceptionHandler$1$1(th, shortNewsContentCardView, webChatViewModel, i), 2);
            int i14 = read + 55;
            IconCompatParcelizer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i14 % 2 != 0) {
                int i15 = 5 / 5;
            }
        }
        int i16 = IconCompatParcelizer + 27;
        read = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i17 = i16 % 2;
    }
}
