package com.roadrunner.rrds.compose.component.pin;

import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import coil3.ExtrasKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class PinValidationRowKt$PinInputField$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatQueueItem = 1;
    private static int write;
    public final /* synthetic */ boolean IconCompatParcelizer;
    public final /* synthetic */ SoftwareKeyboardController RemoteActionCompatParcelizer;
    public final /* synthetic */ FocusRequester read;
    public final /* synthetic */ boolean serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinValidationRowKt$PinInputField$1$1(boolean z, boolean z2, FocusRequester focusRequester, SoftwareKeyboardController softwareKeyboardController, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = z;
        this.serializer = z2;
        this.read = focusRequester;
        this.RemoteActionCompatParcelizer = softwareKeyboardController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        PinValidationRowKt$PinInputField$1$1 pinValidationRowKt$PinInputField$1$1 = new PinValidationRowKt$PinInputField$1$1(this.IconCompatParcelizer, this.serializer, this.read, this.RemoteActionCompatParcelizer, shortNewsContentCardView);
        int i2 = MediaSessionCompatQueueItem + 89;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 42 / 0;
        }
        return pinValidationRowKt$PinInputField$1$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = write + 93;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        PinValidationRowKt$PinInputField$1$1 pinValidationRowKt$PinInputField$1$1 = (PinValidationRowKt$PinInputField$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        pinValidationRowKt$PinInputField$1$1.invokeSuspend(createfromparcel);
        int i4 = write + 107;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return createfromparcel;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 41;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (this.IconCompatParcelizer && this.serializer) {
            FocusRequester.m380requestFocus3ESFkO8$default(this.read, 0, 1, null);
            SoftwareKeyboardController softwareKeyboardController = this.RemoteActionCompatParcelizer;
            if (softwareKeyboardController != null) {
                softwareKeyboardController.show();
            }
        }
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = write + 11;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }
}
