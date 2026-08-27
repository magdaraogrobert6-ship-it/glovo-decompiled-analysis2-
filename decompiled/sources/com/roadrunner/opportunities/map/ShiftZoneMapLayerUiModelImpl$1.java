package com.roadrunner.opportunities.map;

import androidx.compose.ui.graphics.Fields;
import androidx.work.impl.WorkerWrapper;
import com.roadrunner.appreview.AppReviewLifecycleObserverImpl;
import com.roadrunner.nafath.VerificationStatusLifecycleObserverImpl;
import com.roadrunner.notifications.PushWithAppStateDataStoreImpl;
import com.roadrunner.permission.location.permission.LocationPermissionLifecycleHandler;
import com.roadrunner.rider.state.ondemand.bonus.OnDemandWithBonusUiModelImpl;
import com.roadrunner.rider.state.ondemand.outsideactivearea.OnDemandOutsideActiveAreaUiModelImpl;
import com.roadrunner.rider.state.onpause.presentation.OnPauseUiModelImpl;
import com.roadrunner.rider.state.searchshifts.presentation.SearchShiftsWithBonusUiModelImpl;
import com.roadrunner.rider.state.suspension.presentation.SuspensionUiModelImpl;
import com.roadrunner.startingarea.presentation.StartingAreaNavigateViewUiModelImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C;
import o.ShortNewsContentCardView;
import o.T;
import o.Util;
import o.buildInstallReferrerSdkClickPackage;
import o.createFromParcel;
import o.endFirstSessionDelay;
import o.getABI;
import o.getContentViewGroupParentLayout;
import o.getOsName;
import o.r8lambdaGDT82k101pFrQcAu5KuS7n_2ZU;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.readAndInitOrPropagateAndThrowFailure;
import o.setTimerStart;
import o.x5;
import o.x8;

/* JADX INFO: loaded from: classes3.dex */
public final class ShiftZoneMapLayerUiModelImpl$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 0;
    private static int write = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShiftZoneMapLayerUiModelImpl$1(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = read + 59;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = this.serializer;
        Object obj3 = this.RemoteActionCompatParcelizer;
        switch (i4) {
            case 0:
                return new ShiftZoneMapLayerUiModelImpl$1((x8) obj3, shortNewsContentCardView, 0);
            case 1:
                return new ShiftZoneMapLayerUiModelImpl$1((T) obj3, shortNewsContentCardView, 1);
            case 2:
                return new ShiftZoneMapLayerUiModelImpl$1((C) obj3, shortNewsContentCardView, i);
            case 3:
                return new ShiftZoneMapLayerUiModelImpl$1((WorkerWrapper.Builder) obj3, shortNewsContentCardView, 3);
            case 4:
                return new ShiftZoneMapLayerUiModelImpl$1((PushWithAppStateDataStoreImpl) obj3, shortNewsContentCardView, 4);
            case 5:
                return new ShiftZoneMapLayerUiModelImpl$1((x8) obj3, shortNewsContentCardView, 5);
            case 6:
                return new ShiftZoneMapLayerUiModelImpl$1((x5) obj3, shortNewsContentCardView, 6);
            case 7:
                return new ShiftZoneMapLayerUiModelImpl$1((AppReviewLifecycleObserverImpl) obj3, shortNewsContentCardView, 7);
            case 8:
                return new ShiftZoneMapLayerUiModelImpl$1((r8lambdaGDT82k101pFrQcAu5KuS7n_2ZU) obj3, shortNewsContentCardView, 8);
            case 9:
                return new ShiftZoneMapLayerUiModelImpl$1((VerificationStatusLifecycleObserverImpl) obj3, shortNewsContentCardView, 9);
            case 10:
                return new ShiftZoneMapLayerUiModelImpl$1((LocationPermissionLifecycleHandler) obj3, shortNewsContentCardView, 10);
            case 11:
                return new ShiftZoneMapLayerUiModelImpl$1((endFirstSessionDelay) obj3, shortNewsContentCardView, 11);
            case 12:
                return new ShiftZoneMapLayerUiModelImpl$1((setTimerStart) obj3, shortNewsContentCardView, 12);
            case 13:
                return new ShiftZoneMapLayerUiModelImpl$1((OnDemandWithBonusUiModelImpl) obj3, shortNewsContentCardView, 13);
            case 14:
                ShiftZoneMapLayerUiModelImpl$1 shiftZoneMapLayerUiModelImpl$1 = new ShiftZoneMapLayerUiModelImpl$1((getABI) obj3, shortNewsContentCardView, 14);
                int i5 = write + 31;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return shiftZoneMapLayerUiModelImpl$1;
            case 15:
                ShiftZoneMapLayerUiModelImpl$1 shiftZoneMapLayerUiModelImpl$2 = new ShiftZoneMapLayerUiModelImpl$1((OnDemandOutsideActiveAreaUiModelImpl) obj3, shortNewsContentCardView, 15);
                int i7 = write + 25;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return shiftZoneMapLayerUiModelImpl$2;
            case 16:
                return new ShiftZoneMapLayerUiModelImpl$1((getOsName) obj3, shortNewsContentCardView, 16);
            case 17:
                return new ShiftZoneMapLayerUiModelImpl$1((OnPauseUiModelImpl) obj3, shortNewsContentCardView, 17);
            case 18:
                return new ShiftZoneMapLayerUiModelImpl$1((buildInstallReferrerSdkClickPackage) obj3, shortNewsContentCardView, 18);
            case 19:
                return new ShiftZoneMapLayerUiModelImpl$1((SearchShiftsWithBonusUiModelImpl) obj3, shortNewsContentCardView, 19);
            case 20:
                return new ShiftZoneMapLayerUiModelImpl$1((SuspensionUiModelImpl) obj3, shortNewsContentCardView, 20);
            case 21:
                return new ShiftZoneMapLayerUiModelImpl$1((Util) obj3, shortNewsContentCardView, 21);
            case 22:
                return new ShiftZoneMapLayerUiModelImpl$1((readAndInitOrPropagateAndThrowFailure) obj3, shortNewsContentCardView, 22);
            default:
                return new ShiftZoneMapLayerUiModelImpl$1((StartingAreaNavigateViewUiModelImpl) obj3, shortNewsContentCardView, 23);
        }
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        switch (i2) {
            case 0:
                return ((ShiftZoneMapLayerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 1:
                return ((ShiftZoneMapLayerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 2:
                return ((ShiftZoneMapLayerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 3:
                return ((ShiftZoneMapLayerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 4:
                return ((ShiftZoneMapLayerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 5:
                return ((ShiftZoneMapLayerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 6:
                return ((ShiftZoneMapLayerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 7:
                return ((ShiftZoneMapLayerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 8:
                return ((ShiftZoneMapLayerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 9:
                return ((ShiftZoneMapLayerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 10:
                return ((ShiftZoneMapLayerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 11:
                return ((ShiftZoneMapLayerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 12:
                Object objInvokeSuspend = ((ShiftZoneMapLayerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                int i3 = write + 69;
                read = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return objInvokeSuspend;
            case 13:
                return ((ShiftZoneMapLayerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 14:
                return ((ShiftZoneMapLayerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 15:
                return ((ShiftZoneMapLayerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 16:
                return ((ShiftZoneMapLayerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 17:
                return ((ShiftZoneMapLayerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 18:
                return ((ShiftZoneMapLayerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 19:
                return ((ShiftZoneMapLayerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 20:
                Object objInvokeSuspend2 = ((ShiftZoneMapLayerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                int i5 = read + 45;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return objInvokeSuspend2;
            case 21:
                return ((ShiftZoneMapLayerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 22:
                return ((ShiftZoneMapLayerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            default:
                return ((ShiftZoneMapLayerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:268:0x05d5, code lost:
    
        if (r0 == r2) goto L269;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 1850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.opportunities.map.ShiftZoneMapLayerUiModelImpl$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
