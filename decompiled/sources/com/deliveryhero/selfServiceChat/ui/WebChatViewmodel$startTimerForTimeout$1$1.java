package com.deliveryhero.selfServiceChat.ui;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.VectorPainter;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes2.dex */
public final class WebChatViewmodel$startTimerForTimeout$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ WebChatViewmodel serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebChatViewmodel$startTimerForTimeout$1$1(WebChatViewmodel webChatViewmodel, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.serializer = webChatViewmodel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.RemoteActionCompatParcelizer;
        WebChatViewmodel webChatViewmodel = this.serializer;
        switch (i) {
            case 0:
                WebChatViewmodel$startTimerForTimeout$1$1 webChatViewmodel$startTimerForTimeout$1$1 = new WebChatViewmodel$startTimerForTimeout$1$1(webChatViewmodel, shortNewsContentCardView, 0);
                webChatViewmodel$startTimerForTimeout$1$1.IconCompatParcelizer = obj;
                return webChatViewmodel$startTimerForTimeout$1$1;
            case 1:
                WebChatViewmodel$startTimerForTimeout$1$1 webChatViewmodel$startTimerForTimeout$1$2 = new WebChatViewmodel$startTimerForTimeout$1$1(shortNewsContentCardView, webChatViewmodel, 1);
                webChatViewmodel$startTimerForTimeout$1$2.IconCompatParcelizer = obj;
                return webChatViewmodel$startTimerForTimeout$1$2;
            case 2:
                WebChatViewmodel$startTimerForTimeout$1$1 webChatViewmodel$startTimerForTimeout$1$3 = new WebChatViewmodel$startTimerForTimeout$1$1(webChatViewmodel, shortNewsContentCardView, 2);
                webChatViewmodel$startTimerForTimeout$1$3.IconCompatParcelizer = obj;
                return webChatViewmodel$startTimerForTimeout$1$3;
            case 3:
                WebChatViewmodel$startTimerForTimeout$1$1 webChatViewmodel$startTimerForTimeout$1$4 = new WebChatViewmodel$startTimerForTimeout$1$1(webChatViewmodel, shortNewsContentCardView, 3);
                webChatViewmodel$startTimerForTimeout$1$4.IconCompatParcelizer = obj;
                return webChatViewmodel$startTimerForTimeout$1$4;
            case 4:
                WebChatViewmodel$startTimerForTimeout$1$1 webChatViewmodel$startTimerForTimeout$1$5 = new WebChatViewmodel$startTimerForTimeout$1$1(webChatViewmodel, shortNewsContentCardView, 4);
                webChatViewmodel$startTimerForTimeout$1$5.IconCompatParcelizer = obj;
                return webChatViewmodel$startTimerForTimeout$1$5;
            case 5:
                WebChatViewmodel$startTimerForTimeout$1$1 webChatViewmodel$startTimerForTimeout$1$6 = new WebChatViewmodel$startTimerForTimeout$1$1(webChatViewmodel, shortNewsContentCardView, 5);
                webChatViewmodel$startTimerForTimeout$1$6.IconCompatParcelizer = obj;
                return webChatViewmodel$startTimerForTimeout$1$6;
            case 6:
                WebChatViewmodel$startTimerForTimeout$1$1 webChatViewmodel$startTimerForTimeout$1$7 = new WebChatViewmodel$startTimerForTimeout$1$1(shortNewsContentCardView, webChatViewmodel, 6);
                webChatViewmodel$startTimerForTimeout$1$7.IconCompatParcelizer = obj;
                return webChatViewmodel$startTimerForTimeout$1$7;
            case 7:
                WebChatViewmodel$startTimerForTimeout$1$1 webChatViewmodel$startTimerForTimeout$1$8 = new WebChatViewmodel$startTimerForTimeout$1$1(shortNewsContentCardView, webChatViewmodel, 7);
                webChatViewmodel$startTimerForTimeout$1$8.IconCompatParcelizer = obj;
                return webChatViewmodel$startTimerForTimeout$1$8;
            case 8:
                WebChatViewmodel$startTimerForTimeout$1$1 webChatViewmodel$startTimerForTimeout$1$9 = new WebChatViewmodel$startTimerForTimeout$1$1(shortNewsContentCardView, webChatViewmodel, 8);
                webChatViewmodel$startTimerForTimeout$1$9.IconCompatParcelizer = obj;
                return webChatViewmodel$startTimerForTimeout$1$9;
            case 9:
                WebChatViewmodel$startTimerForTimeout$1$1 webChatViewmodel$startTimerForTimeout$1$10 = new WebChatViewmodel$startTimerForTimeout$1$1(shortNewsContentCardView, webChatViewmodel, 9);
                webChatViewmodel$startTimerForTimeout$1$10.IconCompatParcelizer = obj;
                return webChatViewmodel$startTimerForTimeout$1$10;
            default:
                WebChatViewmodel$startTimerForTimeout$1$1 webChatViewmodel$startTimerForTimeout$1$11 = new WebChatViewmodel$startTimerForTimeout$1$1(shortNewsContentCardView, webChatViewmodel, 10);
                webChatViewmodel$startTimerForTimeout$1$11.IconCompatParcelizer = obj;
                return webChatViewmodel$startTimerForTimeout$1$11;
        }
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        switch (i) {
            case 0:
                return ((WebChatViewmodel$startTimerForTimeout$1$1) create((VectorPainter) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 1:
                return ((WebChatViewmodel$startTimerForTimeout$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 2:
                return ((WebChatViewmodel$startTimerForTimeout$1$1) create((VectorPainter) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 3:
                return ((WebChatViewmodel$startTimerForTimeout$1$1) create((String) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 4:
                return ((WebChatViewmodel$startTimerForTimeout$1$1) create((VectorPainter) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 5:
                return ((WebChatViewmodel$startTimerForTimeout$1$1) create((VectorPainter) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 6:
                return ((WebChatViewmodel$startTimerForTimeout$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 7:
                return ((WebChatViewmodel$startTimerForTimeout$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 8:
                return ((WebChatViewmodel$startTimerForTimeout$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 9:
                return ((WebChatViewmodel$startTimerForTimeout$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            default:
                return ((WebChatViewmodel$startTimerForTimeout$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
    }

    /* JADX WARN: Code duplicated, block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x012c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0133  */
    /* JADX WARN: Code duplicated, block: B:83:0x015c  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r2.sendHostEncounteredErrorMessage("P2P chat start loading timed out", r11) == r9) goto L22;
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
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.selfServiceChat.ui.WebChatViewmodel$startTimerForTimeout$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebChatViewmodel$startTimerForTimeout$1$1(ShortNewsContentCardView shortNewsContentCardView, WebChatViewmodel webChatViewmodel, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.serializer = webChatViewmodel;
    }
}
