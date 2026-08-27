package com.roadrunner.rider.recruitment.data;

import android.content.SharedPreferences;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ActivityPackage;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class ApplicationUrlRepository$getApplicationUrl$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int read;
    public final /* synthetic */ ActivityPackage serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ApplicationUrlRepository$getApplicationUrl$2(ActivityPackage activityPackage, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.serializer = activityPackage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 45;
        write = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.read;
        ActivityPackage activityPackage = this.serializer;
        if (i3 == 0) {
            return new ApplicationUrlRepository$getApplicationUrl$2(activityPackage, shortNewsContentCardView, 0);
        }
        ApplicationUrlRepository$getApplicationUrl$2 applicationUrlRepository$getApplicationUrl$2 = new ApplicationUrlRepository$getApplicationUrl$2(activityPackage, shortNewsContentCardView, 1);
        int i4 = RemoteActionCompatParcelizer + 23;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return applicationUrlRepository$getApplicationUrl$2;
        }
        obj2.hashCode();
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 67;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 != 0) {
            ((ApplicationUrlRepository$getApplicationUrl$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        Object objInvokeSuspend = ((ApplicationUrlRepository$getApplicationUrl$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = write + 85;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 25;
        write = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i3 = this.read;
        ActivityPackage activityPackage = this.serializer;
        if (i3 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return activityPackage.serializer.serializer.getString("SHARED_PREF_APPLICATION", null);
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        SharedPreferences.Editor editorEdit = activityPackage.serializer.serializer.edit();
        editorEdit.putString("SHARED_PREF_APPLICATION", null);
        editorEdit.apply();
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = write + 67;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }
}
