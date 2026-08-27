package com.roadrunner.rrds.compose.component.actions.links;

import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class LinkKt$LinkText$1$1$invoke$$inlined$actionHandler$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 IconCompatParcelizer;
    public int MediaDescriptionCompat;
    public AnnotatedString.Range RatingCompat;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM RemoteActionCompatParcelizer;
    public final /* synthetic */ TextLayoutResult read;
    public final /* synthetic */ AnnotatedString serializer;
    public final /* synthetic */ PointerInputScope write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkKt$LinkText$1$1$invoke$$inlined$actionHandler$1$1(PointerInputScope pointerInputScope, TextLayoutResult textLayoutResult, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, AnnotatedString annotatedString, ShortNewsContentCardView shortNewsContentCardView, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7) {
        super(2, shortNewsContentCardView);
        this.read = textLayoutResult;
        this.RemoteActionCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.serializer = annotatedString;
        this.IconCompatParcelizer = populateViewStructure_androidKtpopulate7;
        this.write = pointerInputScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        LinkKt$LinkText$1$1$invoke$$inlined$actionHandler$1$1 linkKt$LinkText$1$1$invoke$$inlined$actionHandler$1$1 = new LinkKt$LinkText$1$1$invoke$$inlined$actionHandler$1$1(this.write, this.read, this.RemoteActionCompatParcelizer, this.serializer, shortNewsContentCardView, this.IconCompatParcelizer);
        int i2 = MediaSessionCompatQueueItem + 43;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return linkKt$LinkText$1$1$invoke$$inlined$actionHandler$1$1;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        Object objInvokeSuspend;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 113;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            objInvokeSuspend = ((LinkKt$LinkText$1$1$invoke$$inlined$actionHandler$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
            int i3 = 9 / 0;
        } else {
            objInvokeSuspend = ((LinkKt$LinkText$1$1$invoke$$inlined$actionHandler$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        }
        int i4 = MediaSessionCompatQueueItem + 125;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009d  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c0  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cd, code lost:
    
        if (r10 == r1) goto L38;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rrds.compose.component.actions.links.LinkKt$LinkText$1$1$invoke$$inlined$actionHandler$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
