package com.roadrunner.web.presentation;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel;
import com.roadrunner.delivery.accept.autoaccept.presentation.DeliveryAutoAcceptUiModelImpl;
import com.roadrunner.util.sound.DefaultForegroundSoundManager;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambda9WmZxQ0wdyigcPoXrobdieYXRv8;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class WebViewViewModel$handleWebViewError$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaSessionCompatQueueItem;
    public final /* synthetic */ int IconCompatParcelizer;
    public Object MediaDescriptionCompat;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewViewModel$handleWebViewError$1(WebViewViewModel webViewViewModel, String str, int i, r8lambda9WmZxQ0wdyigcPoXrobdieYXRv8 r8lambda9wmzxq0wdyigcpoxrobdieyxrv8, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = 0;
        this.MediaDescriptionCompat = webViewViewModel;
        this.serializer = str;
        this.RemoteActionCompatParcelizer = i;
        this.read = r8lambda9wmzxq0wdyigcpoxrobdieyxrv8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewViewModel$handleWebViewError$1(WebChatViewModel webChatViewModel, String str, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = 1;
        this.read = webChatViewModel;
        this.serializer = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebViewViewModel$handleWebViewError$1(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.read = obj;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 31;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 == 0) {
            return ((WebViewViewModel$handleWebViewError$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i4 != 1) {
            return i4 != 2 ? ((WebViewViewModel$handleWebViewError$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((WebViewViewModel$handleWebViewError$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((WebViewViewModel$handleWebViewError$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = MediaSessionCompatQueueItem + 123;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaItem + 107;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = this.IconCompatParcelizer;
        Object obj3 = this.read;
        if (i4 == 0) {
            return new WebViewViewModel$handleWebViewError$1((WebViewViewModel) this.MediaDescriptionCompat, (String) this.serializer, this.RemoteActionCompatParcelizer, (r8lambda9WmZxQ0wdyigcPoXrobdieYXRv8) obj3, shortNewsContentCardView);
        }
        if (i4 == 1) {
            WebViewViewModel$handleWebViewError$1 webViewViewModel$handleWebViewError$1 = new WebViewViewModel$handleWebViewError$1((WebChatViewModel) obj3, (String) this.serializer, shortNewsContentCardView);
            webViewViewModel$handleWebViewError$1.MediaDescriptionCompat = obj;
            return webViewViewModel$handleWebViewError$1;
        }
        if (i4 == 2) {
            return new WebViewViewModel$handleWebViewError$1((DeliveryAutoAcceptUiModelImpl) obj3, shortNewsContentCardView, i);
        }
        WebViewViewModel$handleWebViewError$1 webViewViewModel$handleWebViewError$2 = new WebViewViewModel$handleWebViewError$1((DefaultForegroundSoundManager) obj3, shortNewsContentCardView, 3);
        int i5 = MediaSessionCompatQueueItem + 75;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return webViewViewModel$handleWebViewError$2;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0235 A[LOOP:0: B:102:0x022f->B:104:0x0235, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:162:0x036c  */
    /* JADX WARN: Code duplicated, block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x010b A[Catch: all -> 0x0142, TRY_LEAVE, TryCatch #0 {all -> 0x0142, blocks: (B:23:0x0065, B:25:0x0069, B:27:0x006f, B:28:0x007a, B:30:0x0087, B:31:0x008f, B:33:0x0093, B:34:0x009a, B:44:0x0107, B:46:0x010b, B:51:0x011d, B:54:0x012c, B:37:0x00ab, B:39:0x00dd, B:42:0x00f8), top: B:184:0x0065 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0112  */
    /* JADX WARN: Code duplicated, block: B:51:0x011d A[Catch: all -> 0x0142, TRY_ENTER, TryCatch #0 {all -> 0x0142, blocks: (B:23:0x0065, B:25:0x0069, B:27:0x006f, B:28:0x007a, B:30:0x0087, B:31:0x008f, B:33:0x0093, B:34:0x009a, B:44:0x0107, B:46:0x010b, B:51:0x011d, B:54:0x012c, B:37:0x00ab, B:39:0x00dd, B:42:0x00f8), top: B:184:0x0065 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x012b  */
    /* JADX WARN: Code duplicated, block: B:54:0x012c A[Catch: all -> 0x0142, TRY_LEAVE, TryCatch #0 {all -> 0x0142, blocks: (B:23:0x0065, B:25:0x0069, B:27:0x006f, B:28:0x007a, B:30:0x0087, B:31:0x008f, B:33:0x0093, B:34:0x009a, B:44:0x0107, B:46:0x010b, B:51:0x011d, B:54:0x012c, B:37:0x00ab, B:39:0x00dd, B:42:0x00f8), top: B:184:0x0065 }] */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0138, code lost:
    
        if (com.roadrunner.util.sound.DefaultForegroundSoundManager.access$scheduleAudioFocusAbandonment(r8, r9, r22) == r0) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 961
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.web.presentation.WebViewViewModel$handleWebViewError$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
