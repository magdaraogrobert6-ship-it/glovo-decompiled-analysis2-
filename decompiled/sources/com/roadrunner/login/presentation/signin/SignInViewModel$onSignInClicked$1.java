package com.roadrunner.login.presentation.signin;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.accept.laststop.domain.LastStopSelectionCoordinator$$ExternalSyntheticLambda1;
import com.roadrunner.delivery.accept.laststop.domain.LastStopSelectionCoordinator$$ExternalSyntheticLambda2;
import com.roadrunner.map.integration.search.SelectorReverseGeocoder;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.isInvalidIndex;
import o.nd;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class SignInViewModel$onSignInClicked$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ int IconCompatParcelizer = 2;
    public int MediaDescriptionCompat;
    public Object MediaMetadataCompat;
    public final /* synthetic */ Object MediaSessionCompatQueueItem;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ boolean read;
    public final /* synthetic */ isInvalidIndex serializer;
    public final /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignInViewModel$onSignInClicked$1(SelectorReverseGeocoder selectorReverseGeocoder, nd ndVar, LastStopSelectionCoordinator$$ExternalSyntheticLambda2 lastStopSelectionCoordinator$$ExternalSyntheticLambda2, boolean z, LastStopSelectionCoordinator$$ExternalSyntheticLambda1 lastStopSelectionCoordinator$$ExternalSyntheticLambda1, LastStopSelectionCoordinator$$ExternalSyntheticLambda2 lastStopSelectionCoordinator$$ExternalSyntheticLambda3, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.MediaMetadataCompat = selectorReverseGeocoder;
        this.RemoteActionCompatParcelizer = ndVar;
        this.write = lastStopSelectionCoordinator$$ExternalSyntheticLambda2;
        this.read = z;
        this.MediaSessionCompatQueueItem = lastStopSelectionCoordinator$$ExternalSyntheticLambda1;
        this.serializer = lastStopSelectionCoordinator$$ExternalSyntheticLambda3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignInViewModel$onSignInClicked$1(String str, String str2, SignInViewModel signInViewModel, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = str;
        this.write = str2;
        this.MediaSessionCompatQueueItem = signInViewModel;
        this.read = z;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignInViewModel$onSignInClicked$1(boolean z, Animatable animatable, Animatable animatable2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = z;
        this.write = animatable;
        this.MediaSessionCompatQueueItem = animatable2;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RatingCompat + 1;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i3 == 0) {
            return ((SignInViewModel$onSignInClicked$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        if (i3 != 1) {
            return ((SignInViewModel$onSignInClicked$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((SignInViewModel$onSignInClicked$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = MediaBrowserCompatMediaItem + 71;
        RatingCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        isInvalidIndex isinvalidindex = this.serializer;
        Object obj2 = this.MediaSessionCompatQueueItem;
        Object obj3 = this.write;
        if (i2 == 0) {
            SignInViewModel$onSignInClicked$1 signInViewModel$onSignInClicked$1 = new SignInViewModel$onSignInClicked$1((String) this.RemoteActionCompatParcelizer, (String) obj3, (SignInViewModel) obj2, this.read, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) isinvalidindex, shortNewsContentCardView);
            int i3 = RatingCompat + 53;
            MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 49 / 0;
            }
            return signInViewModel$onSignInClicked$1;
        }
        if (i2 != 1) {
            return new SignInViewModel$onSignInClicked$1((SelectorReverseGeocoder) this.MediaMetadataCompat, (nd) this.RemoteActionCompatParcelizer, (LastStopSelectionCoordinator$$ExternalSyntheticLambda2) obj3, this.read, (LastStopSelectionCoordinator$$ExternalSyntheticLambda1) obj2, (LastStopSelectionCoordinator$$ExternalSyntheticLambda2) isinvalidindex, shortNewsContentCardView);
        }
        SignInViewModel$onSignInClicked$1 signInViewModel$onSignInClicked$2 = new SignInViewModel$onSignInClicked$1(this.read, (Animatable) obj3, (Animatable) obj2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) isinvalidindex, shortNewsContentCardView);
        signInViewModel$onSignInClicked$2.RemoteActionCompatParcelizer = obj;
        int i5 = RatingCompat + 19;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 19 / 0;
        }
        return signInViewModel$onSignInClicked$2;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0177 A[PHI: r0 r6
  0x0177: PHI (r0v8 o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU) = (r0v10 o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU), (r0v12 o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU) binds: [B:76:0x0174, B:64:0x011a] A[DONT_GENERATE, DONT_INLINE]
  0x0177: PHI (r6v8 o.ShortNewsContentCardView) = (r6v9 o.ShortNewsContentCardView), (r6v10 o.ShortNewsContentCardView) binds: [B:76:0x0174, B:64:0x011a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0181, code lost:
    
        if (r0.join(r36) == r1) goto L80;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.login.presentation.signin.SignInViewModel$onSignInClicked$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
