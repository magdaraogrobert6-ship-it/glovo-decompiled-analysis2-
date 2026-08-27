package com.deliveryhero.perseus;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel;
import com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.presentation.PinValidationTaskUiModelImpl;
import java.util.LinkedHashMap;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getOffsetX;
import o.getPlatformAndroidManager;
import o.notifyContentCaptureChanges;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes2.dex */
public final class RemoteFunctionKt$onRemoteFunction$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;
    public Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteFunctionKt$onRemoteFunction$1(getContentViewGroupParentLayout getcontentviewgroupparentlayout, int i, int i2, getPlatformAndroidManager getplatformandroidmanager, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = 2;
        this.serializer = getcontentviewgroupparentlayout;
        this.read = i;
        this.write = i2;
        this.RemoteActionCompatParcelizer = getplatformandroidmanager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteFunctionKt$onRemoteFunction$1(WebChatViewModel webChatViewModel, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = 1;
        this.RemoteActionCompatParcelizer = webChatViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteFunctionKt$onRemoteFunction$1(PinValidationTaskUiModelImpl pinValidationTaskUiModelImpl, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = 4;
        this.serializer = pinValidationTaskUiModelImpl;
        this.RemoteActionCompatParcelizer = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RemoteFunctionKt$onRemoteFunction$1(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteFunctionKt$onRemoteFunction$1(int i, String str, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = 5;
        this.RemoteActionCompatParcelizer = str;
        this.write = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 107;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        Object obj2 = this.RemoteActionCompatParcelizer;
        if (i4 == 0) {
            RemoteFunctionKt$onRemoteFunction$1 remoteFunctionKt$onRemoteFunction$1 = new RemoteFunctionKt$onRemoteFunction$1((LinkedHashMap) obj2, shortNewsContentCardView, 0);
            int i5 = MediaSessionCompatQueueItem + 21;
            RatingCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return remoteFunctionKt$onRemoteFunction$1;
        }
        if (i4 == 1) {
            RemoteFunctionKt$onRemoteFunction$1 remoteFunctionKt$onRemoteFunction$2 = new RemoteFunctionKt$onRemoteFunction$1((WebChatViewModel) obj2, shortNewsContentCardView);
            remoteFunctionKt$onRemoteFunction$2.serializer = obj;
            return remoteFunctionKt$onRemoteFunction$2;
        }
        if (i4 == 2) {
            return new RemoteFunctionKt$onRemoteFunction$1((getContentViewGroupParentLayout) this.serializer, this.read, this.write, (getPlatformAndroidManager) obj2, shortNewsContentCardView);
        }
        int i7 = 3;
        if (i4 == 3) {
            return new RemoteFunctionKt$onRemoteFunction$1((getOffsetX) obj2, shortNewsContentCardView, i7);
        }
        if (i4 != 4) {
            RemoteFunctionKt$onRemoteFunction$1 remoteFunctionKt$onRemoteFunction$3 = new RemoteFunctionKt$onRemoteFunction$1(this.write, (String) obj2, shortNewsContentCardView);
            remoteFunctionKt$onRemoteFunction$3.serializer = obj;
            return remoteFunctionKt$onRemoteFunction$3;
        }
        RemoteFunctionKt$onRemoteFunction$1 remoteFunctionKt$onRemoteFunction$4 = new RemoteFunctionKt$onRemoteFunction$1((PinValidationTaskUiModelImpl) this.serializer, (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) obj2, shortNewsContentCardView);
        int i8 = MediaSessionCompatQueueItem + 11;
        RatingCompat = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return remoteFunctionKt$onRemoteFunction$4;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 31;
        RatingCompat = i2 % Fields.SpotShadowColor;
        Object obj3 = null;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        if (i3 == 0) {
            return ((RemoteFunctionKt$onRemoteFunction$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
        }
        if (i3 == 1) {
            return ((RemoteFunctionKt$onRemoteFunction$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
        }
        if (i3 == 2) {
            ((RemoteFunctionKt$onRemoteFunction$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            return createfromparcel2;
        }
        if (i3 == 3) {
            return ((RemoteFunctionKt$onRemoteFunction$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
        }
        if (i3 != 4) {
            Object objInvokeSuspend = ((RemoteFunctionKt$onRemoteFunction$1) create((notifyContentCaptureChanges) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            int i4 = RatingCompat + 105;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            obj3.hashCode();
            throw null;
        }
        Object objInvokeSuspend2 = ((RemoteFunctionKt$onRemoteFunction$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
        int i5 = MediaSessionCompatQueueItem + 75;
        RatingCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return objInvokeSuspend2;
        }
        obj3.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:127:0x0298  */
    /* JADX WARN: Code duplicated, block: B:129:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:132:0x02af  */
    /* JADX WARN: Code duplicated, block: B:141:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:172:0x0362  */
    /* JADX WARN: Code duplicated, block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:55:0x0100  */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x028a, code lost:
    
        if (r2.sendHostEncounteredErrorMessage$1("P2P chat start loading timed out", r19) == r4) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013f, code lost:
    
        if (r0 == r11) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v30, types: [int] */
    /* JADX WARN: Type inference failed for: r3v34, types: [int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 897
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.perseus.RemoteFunctionKt$onRemoteFunction$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
