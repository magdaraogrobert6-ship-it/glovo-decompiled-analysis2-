package com.roadrunner.sidemenu.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.realtime.domain.GetAppStateImpl$invoke$$inlined$map$1;
import com.roadrunner.sidemenu.data.SideMenuRepository;
import com.roadrunner.web.presentation.WebViewViewModel$viewState$1;
import com.sentiance.core.model.thrift.O$b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;
import o.DrawableTransformation;
import o.ShortNewsContentCardView;
import o._set_registeredPushToken_lambda12;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdaeEn0GUG5cGviZ6WG1OS4uJPKt0;

/* JADX INFO: loaded from: classes3.dex */
public final class SideMenuViewModel$observeSideMenuCache$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public int serializer;
    public final /* synthetic */ SideMenuViewModel write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SideMenuViewModel$observeSideMenuCache$1(SideMenuViewModel sideMenuViewModel, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.write = sideMenuViewModel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r0 != 3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        r0 = new com.roadrunner.sidemenu.presentation.SideMenuViewModel$observeSideMenuCache$1(r4, r8, 4);
        r8 = com.roadrunner.sidemenu.presentation.SideMenuViewModel$observeSideMenuCache$1.read + 71;
        com.roadrunner.sidemenu.presentation.SideMenuViewModel$observeSideMenuCache$1.IconCompatParcelizer = r8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        return new com.roadrunner.sidemenu.presentation.SideMenuViewModel$observeSideMenuCache$1(r4, r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.ShortNewsContentCardView create(java.lang.Object r7, o.ShortNewsContentCardView r8) {
        /*
            r6 = this;
            r7 = 2
            int r0 = r7 % r7
            int r0 = com.roadrunner.sidemenu.presentation.SideMenuViewModel$observeSideMenuCache$1.read
            int r0 = r0 + 73
            int r1 = r0 % 128
            com.roadrunner.sidemenu.presentation.SideMenuViewModel$observeSideMenuCache$1.IconCompatParcelizer = r1
            int r0 = r0 % r7
            r1 = 0
            r2 = 3
            r3 = 1
            if (r0 != 0) goto L21
            int r0 = r6.RemoteActionCompatParcelizer
            com.roadrunner.sidemenu.presentation.SideMenuViewModel r4 = r6.write
            r5 = 26
            int r5 = r5 / r1
            if (r0 == 0) goto L4f
            if (r0 == r3) goto L49
            if (r0 == r7) goto L43
            if (r0 == r2) goto L3d
            goto L2d
        L21:
            int r0 = r6.RemoteActionCompatParcelizer
            com.roadrunner.sidemenu.presentation.SideMenuViewModel r4 = r6.write
            if (r0 == 0) goto L4f
            if (r0 == r3) goto L49
            if (r0 == r7) goto L43
            if (r0 == r2) goto L3d
        L2d:
            com.roadrunner.sidemenu.presentation.SideMenuViewModel$observeSideMenuCache$1 r0 = new com.roadrunner.sidemenu.presentation.SideMenuViewModel$observeSideMenuCache$1
            r1 = 4
            r0.<init>(r4, r8, r1)
            int r8 = com.roadrunner.sidemenu.presentation.SideMenuViewModel$observeSideMenuCache$1.read
            int r8 = r8 + 71
            int r1 = r8 % 128
            com.roadrunner.sidemenu.presentation.SideMenuViewModel$observeSideMenuCache$1.IconCompatParcelizer = r1
            int r8 = r8 % r7
            return r0
        L3d:
            com.roadrunner.sidemenu.presentation.SideMenuViewModel$observeSideMenuCache$1 r7 = new com.roadrunner.sidemenu.presentation.SideMenuViewModel$observeSideMenuCache$1
            r7.<init>(r4, r8, r2)
            return r7
        L43:
            com.roadrunner.sidemenu.presentation.SideMenuViewModel$observeSideMenuCache$1 r0 = new com.roadrunner.sidemenu.presentation.SideMenuViewModel$observeSideMenuCache$1
            r0.<init>(r4, r8, r7)
            return r0
        L49:
            com.roadrunner.sidemenu.presentation.SideMenuViewModel$observeSideMenuCache$1 r7 = new com.roadrunner.sidemenu.presentation.SideMenuViewModel$observeSideMenuCache$1
            r7.<init>(r4, r8, r3)
            return r7
        L4f:
            com.roadrunner.sidemenu.presentation.SideMenuViewModel$observeSideMenuCache$1 r7 = new com.roadrunner.sidemenu.presentation.SideMenuViewModel$observeSideMenuCache$1
            r7.<init>(r4, r8, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.sidemenu.presentation.SideMenuViewModel$observeSideMenuCache$1.create(java.lang.Object, o.ShortNewsContentCardView):o.ShortNewsContentCardView");
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = read + 97;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 == 0) {
            return ((SideMenuViewModel$observeSideMenuCache$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object obj3 = null;
        if (i4 == 1) {
            Object objInvokeSuspend = ((SideMenuViewModel$observeSideMenuCache$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i5 = IconCompatParcelizer + 117;
            read = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return objInvokeSuspend;
            }
            obj3.hashCode();
            throw null;
        }
        if (i4 == 2) {
            return ((SideMenuViewModel$observeSideMenuCache$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i4 == 3) {
            return ((SideMenuViewModel$observeSideMenuCache$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend2 = ((SideMenuViewModel$observeSideMenuCache$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i6 = IconCompatParcelizer + 113;
        read = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return objInvokeSuspend2;
        }
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        SideMenuViewModel sideMenuViewModel = this.write;
        int i4 = 0;
        int i5 = 3;
        ShortNewsContentCardView shortNewsContentCardView = null;
        int i6 = 1;
        if (i3 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i7 = this.serializer;
            if (i7 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                O$b o$b = sideMenuViewModel.RatingCompat;
                FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(((SideMenuRepository) o$b.write).read(), FlowKt.serializer(new GetAppStateImpl$invoke$$inlined$map$1(((r8lambdaeEn0GUG5cGviZ6WG1OS4uJPKt0) o$b.read).read, 11)), new WebViewViewModel$viewState$1(o$b, shortNewsContentCardView, i5));
                _set_registeredPushToken_lambda12 _set_registeredpushtoken_lambda12 = new _set_registeredPushToken_lambda12(sideMenuViewModel, i4);
                this.serializer = 1;
                return flowKt__ZipKt$combine$$inlined$unsafeFlow$1.collect(_set_registeredpushtoken_lambda12, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
            }
            if (i7 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i8 = IconCompatParcelizer + 27;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i10 = IconCompatParcelizer + 73;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return null;
        }
        if (i3 == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i12 = this.serializer;
            if (i12 != 0) {
                int i13 = read;
                int i14 = i13 + 91;
                IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                if (i12 != 1) {
                    int i16 = i13 + 75;
                    IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                    if (i16 % 2 != 0) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    throw null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                SharedFlowImpl sharedFlowImpl = sideMenuViewModel.PlaybackStateCompat.read;
                _set_registeredPushToken_lambda12 _set_registeredpushtoken_lambda13 = new _set_registeredPushToken_lambda12(sideMenuViewModel, i6);
                this.serializer = 1;
                sharedFlowImpl.getClass();
                if (SharedFlowImpl.collect$suspendImpl(sharedFlowImpl, _set_registeredpushtoken_lambda13, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
            }
            DrawableTransformation.read();
            return null;
        }
        if (i3 == 2) {
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i17 = this.serializer;
            if (i17 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                StateFlow stateFlow = sideMenuViewModel.PlaybackStateCompatCustomAction.write;
                _set_registeredPushToken_lambda12 _set_registeredpushtoken_lambda14 = new _set_registeredPushToken_lambda12(sideMenuViewModel, i);
                this.serializer = 1;
                if (stateFlow.collect(_set_registeredpushtoken_lambda14, this) == coroutineSingletons3) {
                    return coroutineSingletons3;
                }
            } else {
                if (i17 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            DrawableTransformation.read();
            return null;
        }
        if (i3 == 3) {
            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i18 = this.serializer;
            if (i18 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$2 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(sideMenuViewModel.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer, sideMenuViewModel.serializer, new SideMenuViewModel$observeSideMenuDrawerState$1$1(3, 0, null));
                _set_registeredPushToken_lambda12 _set_registeredpushtoken_lambda15 = new _set_registeredPushToken_lambda12(sideMenuViewModel, i5);
                this.serializer = 1;
                return flowKt__ZipKt$combine$$inlined$unsafeFlow$2.collect(_set_registeredpushtoken_lambda15, this) == coroutineSingletons4 ? coroutineSingletons4 : createfromparcel;
            }
            if (i18 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i19 = read + 83;
            IconCompatParcelizer = i19 % Fields.SpotShadowColor;
            if (i19 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            throw null;
        }
        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i20 = this.serializer;
        if (i20 != 0) {
            int i21 = read + 57;
            IconCompatParcelizer = i21 % Fields.SpotShadowColor;
            if (i21 % 2 != 0 ? i20 != 1 : i20 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            SharedFlowImpl sharedFlowImpl2 = sideMenuViewModel.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer;
            _set_registeredPushToken_lambda12 _set_registeredpushtoken_lambda16 = new _set_registeredPushToken_lambda12(sideMenuViewModel, 4);
            this.serializer = 1;
            sharedFlowImpl2.getClass();
            if (SharedFlowImpl.collect$suspendImpl(sharedFlowImpl2, _set_registeredpushtoken_lambda16, this) == coroutineSingletons5) {
                return coroutineSingletons5;
            }
        }
        DrawableTransformation.read();
        return null;
    }
}
