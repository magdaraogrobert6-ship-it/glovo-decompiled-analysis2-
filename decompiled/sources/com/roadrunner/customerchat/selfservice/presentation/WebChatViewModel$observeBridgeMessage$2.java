package com.roadrunner.customerchat.selfservice.presentation;

import androidx.compose.ui.graphics.Fields;
import com.huawei.riemann.gnsslocation.core.bean.log.GpsRtiItem;
import kotlinx.coroutines.flow.FlowCollector;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.onViewAttachedToWindowlambda0;
import o.updateOffsetsLDcG7Xg;

/* JADX INFO: loaded from: classes3.dex */
public final class WebChatViewModel$observeBridgeMessage$2 implements FlowCollector {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ WebChatViewModel serializer;

    public /* synthetic */ WebChatViewModel$observeBridgeMessage$2(WebChatViewModel webChatViewModel, int i) {
        this.IconCompatParcelizer = i;
        this.serializer = webChatViewModel;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0029  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00dd, code lost:
    
        if (r4.sendHostEncounteredErrorMessage$1("Handshaking for bridge connection timed out", r6) == r7) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e6, code lost:
    
        if (r4.sendHostEncounteredErrorMessage$1("Handshaking for bridge connection timed out", r6) == r7) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e8, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object emit(o.onViewAttachedToWindowlambda0 r20, o.ShortNewsContentCardView r21) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$observeBridgeMessage$2.emit(o.onViewAttachedToWindowlambda0, o.ShortNewsContentCardView):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0046 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a4, code lost:
    
        if (r4.sendHostEncounteredErrorMessage$1(r11, r1) == r2) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object emit(o.updateOffsetsLDcG7Xg r11, o.ShortNewsContentCardView r12) {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$observeBridgeMessage$2.write
            int r1 = r1 + 69
            int r2 = r1 % 128
            com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$observeBridgeMessage$2.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L17
            boolean r1 = r12 instanceof o.toLocalLineIndex
            r2 = 66
            int r2 = r2 / 0
            if (r1 == 0) goto L33
            goto L1b
        L17:
            boolean r1 = r12 instanceof o.toLocalLineIndex
            if (r1 == 0) goto L33
        L1b:
            r1 = r12
            o.toLocalLineIndex r1 = (o.toLocalLineIndex) r1
            int r2 = r1.serializer
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L33
            int r12 = com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$observeBridgeMessage$2.write
            int r12 = r12 + 77
            int r4 = r12 % 128
            com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$observeBridgeMessage$2.RemoteActionCompatParcelizer = r4
            int r12 = r12 % r0
            int r2 = r2 + r3
            r1.serializer = r2
            goto L38
        L33:
            o.toLocalLineIndex r1 = new o.toLocalLineIndex
            r1.<init>(r10, r12)
        L38:
            java.lang.Object r12 = r1.read
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.serializer
            com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel r4 = r10.serializer
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L58
            if (r3 == r6) goto L52
            if (r3 != r0) goto L4c
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)
            goto La7
        L4c:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r11)
            return r5
        L52:
            o.updateOffsetsLDcG7Xg r11 = r1.IconCompatParcelizer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)     // Catch: java.lang.Exception -> L73
            goto La7
        L58:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)
            r1.IconCompatParcelizer = r11     // Catch: java.lang.Exception -> L73
            r1.serializer = r6     // Catch: java.lang.Exception -> L73
            java.lang.Object r11 = com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel.access$handleMessage(r4, r11, r1)     // Catch: java.lang.Exception -> L73
            if (r11 != r2) goto La7
            int r11 = com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$observeBridgeMessage$2.write
            int r11 = r11 + 99
            int r12 = r11 % 128
            com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$observeBridgeMessage$2.RemoteActionCompatParcelizer = r12
            int r11 = r11 % r0
            if (r11 == 0) goto La6
            int r0 = r0 / 5
            goto La6
        L73:
            r12 = move-exception
            o.toAnnotatedStringdefault r3 = r4._init_lambda4
            o.fromHtml r7 = o.fromHtml.ERROR
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Failed to handle bridge message: "
            r8.<init>(r9)
            r8.append(r11)
            java.lang.String r11 = r8.toString()
            o.addSpans r3 = (o.addSpans) r3
            java.lang.String r8 = "WEB_CHAT_OPEN_ERROR"
            r3.serializer(r7, r8, r11, r12)
            boolean r11 = r4.MediaDescriptionCompat()
            if (r11 == r6) goto L94
            goto La7
        L94:
            java.lang.String r11 = r12.getMessage()
            java.lang.String r11 = o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(r9, r11)
            r1.IconCompatParcelizer = r5
            r1.serializer = r0
            java.lang.Object r11 = r4.sendHostEncounteredErrorMessage$1(r11, r1)
            if (r11 != r2) goto La7
        La6:
            return r2
        La7:
            o.createFromParcel r11 = o.createFromParcel.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$observeBridgeMessage$2.emit(o.updateOffsetsLDcG7Xg, o.ShortNewsContentCardView):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        if (i2 == 0) {
            return emit((updateOffsetsLDcG7Xg) obj, shortNewsContentCardView);
        }
        if (i2 != 1) {
            Object objEmit = emit((onViewAttachedToWindowlambda0) obj, shortNewsContentCardView);
            int i3 = RemoteActionCompatParcelizer + 81;
            write = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return objEmit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        WebChatViewModel webChatViewModel = this.serializer;
        int iWrite = GpsRtiItem.write();
        WebChatViewModel.IconCompatParcelizer(-1308807263, new Object[]{webChatViewModel, (String) obj}, GpsRtiItem.write(), 1308807265, GpsRtiItem.write(), iWrite, GpsRtiItem.write());
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = RemoteActionCompatParcelizer + 107;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }
}
