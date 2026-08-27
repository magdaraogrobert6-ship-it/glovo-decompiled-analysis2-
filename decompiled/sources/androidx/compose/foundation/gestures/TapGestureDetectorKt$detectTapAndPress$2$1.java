package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda2;
import com.roadrunner.delivery.pickupdropoff.tasks.data.MergedTaskStateRepositoryImpl$getMergedState$2;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import o.ActivityPackageSender;
import o.AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl;
import o.RemoteActionCompatParcelizer;
import o.SelectionMagnifierKt;
import o.ShortNewsContentCardView;
import o.Util1;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.isInvalidIndex;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class TapGestureDetectorKt$detectTapAndPress$2$1 extends RestrictedSuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ isInvalidIndex IconCompatParcelizer;
    public Object MediaBrowserCompatMediaItem;
    public /* synthetic */ Object MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ isInvalidIndex read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$detectTapAndPress$2$1(RemoteActionCompatParcelizer remoteActionCompatParcelizer, SubcomposeAsyncImageKt$$ExternalSyntheticLambda2 subcomposeAsyncImageKt$$ExternalSyntheticLambda2, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl androidTextContextMenuToolbarProviderTextActionModeCallbackImpl, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.serializer = 1;
        this.MediaBrowserCompatMediaItem = remoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = subcomposeAsyncImageKt$$ExternalSyntheticLambda2;
        this.IconCompatParcelizer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.write = androidTextContextMenuToolbarProviderTextActionModeCallbackImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.serializer;
        Object obj2 = this.write;
        isInvalidIndex isinvalidindex = this.read;
        isInvalidIndex isinvalidindex2 = this.IconCompatParcelizer;
        Object obj3 = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            TapGestureDetectorKt$detectTapAndPress$2$1 tapGestureDetectorKt$detectTapAndPress$2$1 = new TapGestureDetectorKt$detectTapAndPress$2$1((getContentViewGroupParentLayout) obj3, (MergedTaskStateRepositoryImpl$getMergedState$2) isinvalidindex2, (SelectionMagnifierKt) isinvalidindex, (PressGestureScopeImpl) obj2, shortNewsContentCardView, 0);
            tapGestureDetectorKt$detectTapAndPress$2$1.MediaDescriptionCompat = obj;
            return tapGestureDetectorKt$detectTapAndPress$2$1;
        }
        if (i != 1) {
            TapGestureDetectorKt$detectTapAndPress$2$1 tapGestureDetectorKt$detectTapAndPress$2$2 = new TapGestureDetectorKt$detectTapAndPress$2$1((SelectionMagnifierKt) obj3, (ActivityPackageSender) isinvalidindex2, (Util1) isinvalidindex, (RemoteActionCompatParcelizer) obj2, shortNewsContentCardView, 2);
            tapGestureDetectorKt$detectTapAndPress$2$2.MediaDescriptionCompat = obj;
            return tapGestureDetectorKt$detectTapAndPress$2$2;
        }
        TapGestureDetectorKt$detectTapAndPress$2$1 tapGestureDetectorKt$detectTapAndPress$2$3 = new TapGestureDetectorKt$detectTapAndPress$2$1((RemoteActionCompatParcelizer) this.MediaBrowserCompatMediaItem, (SubcomposeAsyncImageKt$$ExternalSyntheticLambda2) obj3, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) isinvalidindex2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) isinvalidindex, (AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl) obj2, shortNewsContentCardView);
        tapGestureDetectorKt$detectTapAndPress$2$3.MediaDescriptionCompat = obj;
        return tapGestureDetectorKt$detectTapAndPress$2$3;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i != 0) {
            return i != 1 ? ((TapGestureDetectorKt$detectTapAndPress$2$1) create(awaitPointerEventScope, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((TapGestureDetectorKt$detectTapAndPress$2$1) create(awaitPointerEventScope, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        return ((TapGestureDetectorKt$detectTapAndPress$2$1) create(awaitPointerEventScope, shortNewsContentCardView)).invokeSuspend(createfromparcel);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0092  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bd, code lost:
    
        if (r0 == r14) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TapGestureDetectorKt$detectTapAndPress$2$1(Object obj, isInvalidIndex isinvalidindex, isInvalidIndex isinvalidindex2, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer = isinvalidindex;
        this.read = isinvalidindex2;
        this.write = obj2;
    }
}
