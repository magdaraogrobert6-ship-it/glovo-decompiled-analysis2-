package com.braze.ui;

import android.util.Base64;
import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.foundation.gestures.UpdatableAnimationState;
import com.braze.enums.Month;
import java.nio.charset.StandardCharsets;
import o.PlatformSelectionBehaviorsImpl;
import o.SimpleLayoutKtSimpleLayout11;
import o.cancelPendingWebViewPauselambda0;
import o.notifyFocusedRectfoundation;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class UserJavascriptInterfaceBase$$ExternalSyntheticLambda12 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int RemoteActionCompatParcelizer = 1;
    private static byte read = -112;
    private static int write;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(ContentInViewNode contentInViewNode, UpdatableAnimationState updatableAnimationState, setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0, SimpleLayoutKtSimpleLayout11 simpleLayoutKtSimpleLayout11) {
        this.$r8$classId = 2;
        this.f$0 = contentInViewNode;
        this.f$2 = setallviewgroupchildrenasnonaccessibilityimportantlambda0;
        this.f$1 = simpleLayoutKtSimpleLayout11;
    }

    public /* synthetic */ UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(Integer num, Month month, Integer num2) {
        this.$r8$classId = 0;
        this.f$0 = num;
        this.f$1 = month;
        this.f$2 = num2;
    }

    public /* synthetic */ UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = obj3;
    }

    public /* synthetic */ UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda0, PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda1, notifyFocusedRectfoundation notifyfocusedrectfoundation) {
        this.$r8$classId = 3;
        this.f$0 = cancelpendingwebviewpauselambda0;
        this.f$2 = platformSelectionBehaviorsImpl;
        this.f$1 = cancelpendingwebviewpauselambda1;
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ read);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:388:0x0ae5, code lost:
    
        if (androidx.compose.ui.text.TextRange.m3070getCollapsedimpl(r0.MediaDescriptionCompat) != true) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0aee, code lost:
    
        if (androidx.compose.ui.text.TextRange.m3070getCollapsedimpl(r0.MediaDescriptionCompat) != false) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0af0, code lost:
    
        r0.RatingCompat();
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0af4, code lost:
    
        r2 = r0.write();
        r4 = r0.MediaDescriptionCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0afa, code lost:
    
        if (r2 == false) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0afc, code lost:
    
        r2 = androidx.compose.ui.text.TextRange.m3073getMaximpl(r4);
        r0.read(r2, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0b04, code lost:
    
        r2 = androidx.compose.ui.text.TextRange.m3074getMinimpl(r4);
        r0.read(r2, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 3800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda12.invoke(java.lang.Object):java.lang.Object");
    }
}
