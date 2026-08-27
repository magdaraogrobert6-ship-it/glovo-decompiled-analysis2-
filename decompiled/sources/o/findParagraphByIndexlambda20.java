package o;

import com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class findParagraphByIndexlambda20 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int read;
    public final /* synthetic */ Object serializer;

    /* JADX WARN: Illegal instructions before constructor call */
    public findParagraphByIndexlambda20(WebChatViewModel webChatViewModel, int i) {
        this.read = i;
        getOnBackInvokedCallback getonbackinvokedcallback = getOnBackInvokedCallback.RemoteActionCompatParcelizer;
        this.serializer = webChatViewModel;
        if (i != 2) {
            super(getonbackinvokedcallback);
        } else {
            super(getonbackinvokedcallback);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public findParagraphByIndexlambda20(getHasStaleResolvedFonts gethasstaleresolvedfonts) {
        super(getOnBackInvokedCallback.RemoteActionCompatParcelizer);
        this.read = 0;
        this.serializer = gethasstaleresolvedfonts;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (r0 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        ((o.addSpans) ((com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel) r2)._init_lambda4).serializer("WEB_CHAT_TOKEN_UPDATE_FAILED_EVENT", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        ((o.addSpans) ((com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel) r2)._init_lambda4).serializer(o.fromHtml.ERROR, "selfServiceChat", "Exception in Web chat ViewModel", r6);
        r6 = o.findParagraphByIndexlambda20.write + 47;
        o.findParagraphByIndexlambda20.IconCompatParcelizer = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r0 != 1) goto L11;
     */
    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleException(o.TextAnnouncementContentCardView r5, java.lang.Throwable r6) {
        /*
            r4 = this;
            r5 = 2
            int r0 = r5 % r5
            int r0 = o.findParagraphByIndexlambda20.write
            int r0 = r0 + 97
            int r1 = r0 % 128
            o.findParagraphByIndexlambda20.IconCompatParcelizer = r1
            int r0 = r0 % r5
            r1 = 1
            if (r0 == 0) goto L1c
            int r0 = r4.read
            java.lang.Object r2 = r4.serializer
            r3 = 52
            int r3 = r3 / 0
            if (r0 == 0) goto L49
            if (r0 == r1) goto L30
            goto L24
        L1c:
            int r0 = r4.read
            java.lang.Object r2 = r4.serializer
            if (r0 == 0) goto L49
            if (r0 == r1) goto L30
        L24:
            com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel r2 = (com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel) r2
            o.toAnnotatedStringdefault r5 = r2._init_lambda4
            o.addSpans r5 = (o.addSpans) r5
            java.lang.String r0 = "WEB_CHAT_TOKEN_UPDATE_FAILED_EVENT"
            r5.serializer(r0, r6)
            return
        L30:
            com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel r2 = (com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel) r2
            o.toAnnotatedStringdefault r0 = r2._init_lambda4
            o.fromHtml r1 = o.fromHtml.ERROR
            o.addSpans r0 = (o.addSpans) r0
            java.lang.String r2 = "selfServiceChat"
            java.lang.String r3 = "Exception in Web chat ViewModel"
            r0.serializer(r1, r2, r3, r6)
            int r6 = o.findParagraphByIndexlambda20.write
            int r6 = r6 + 47
            int r0 = r6 % 128
            o.findParagraphByIndexlambda20.IconCompatParcelizer = r0
            int r6 = r6 % r5
            return
        L49:
            o.getHasStaleResolvedFonts r2 = (o.getHasStaleResolvedFonts) r2
            o.toAnnotatedStringdefault r5 = r2.PlaybackStateCompat
            o.addSpans r5 = (o.addSpans) r5
            java.lang.String r0 = "WEB_CHAT_TRACKING_ERROR_EVENT"
            r5.serializer(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.findParagraphByIndexlambda20.handleException(o.TextAnnouncementContentCardView, java.lang.Throwable):void");
    }
}
