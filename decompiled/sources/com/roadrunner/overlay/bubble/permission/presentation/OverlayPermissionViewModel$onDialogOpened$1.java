package com.roadrunner.overlay.bubble.permission.presentation;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.accessexecute;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class OverlayPermissionViewModel$onDialogOpened$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ accessexecute RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OverlayPermissionViewModel$onDialogOpened$1(accessexecute accessexecuteVar, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.RemoteActionCompatParcelizer = accessexecuteVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 7;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = this.serializer;
        accessexecute accessexecuteVar = this.RemoteActionCompatParcelizer;
        if (i3 == 0) {
            return new OverlayPermissionViewModel$onDialogOpened$1(accessexecuteVar, shortNewsContentCardView, 0);
        }
        OverlayPermissionViewModel$onDialogOpened$1 overlayPermissionViewModel$onDialogOpened$1 = new OverlayPermissionViewModel$onDialogOpened$1(accessexecuteVar, shortNewsContentCardView, 1);
        int i4 = IconCompatParcelizer + 119;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return overlayPermissionViewModel$onDialogOpened$1;
        }
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i2 != 0) {
            ((OverlayPermissionViewModel$onDialogOpened$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i3 = read + 41;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return createfromparcel;
        }
        ((OverlayPermissionViewModel$onDialogOpened$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = IconCompatParcelizer + 57;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        accessexecute accessexecuteVar = this.RemoteActionCompatParcelizer;
        Object obj2 = null;
        if (i2 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            accessexecuteVar.serializer.serializer.IconCompatParcelizer("Overlay Permissions Dialog", null);
            int i3 = read + 69;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return createfromparcel;
            }
            throw null;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        ff$$ExternalSyntheticOutline0.m("screenName", "Overlay Permissions Dialog", accessexecuteVar.serializer.serializer, "overlay_go_to_settings");
        int i4 = read + 57;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return createfromparcel;
        }
        obj2.hashCode();
        throw null;
    }
}
