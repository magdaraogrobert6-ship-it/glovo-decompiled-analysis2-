package com.roadrunner.location.toggle.presentation;

import androidx.compose.ui.graphics.Fields;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.sentiance.core.model.events.C$b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AndroidMultiParagraphDraw_androidKt;
import o.ShortNewsContentCardView;
import o.WorkDatabase;
import o.WorkDatabase_Impl;
import o.WorkSpecDaoKtdedupinlinedmap1;
import o.WorkerKtExternalSyntheticLambda2;
import o.buildStyledTypefaceFO1MlWM;
import o.createFromParcel;
import o.createVectorPainterFromImageVector;
import o.intercept;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.resolveTextDirection;
import o.unpackInt2;
import o.updateAdidI;

/* JADX INFO: loaded from: classes3.dex */
public final class GetLocationToggleUiState$invoke$1 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public /* synthetic */ Object IconCompatParcelizer;
    public /* synthetic */ boolean serializer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLocationToggleUiState$invoke$1(C$b c$b, ShortNewsContentCardView shortNewsContentCardView) {
        super(3, shortNewsContentCardView);
        this.write = 4;
        this.IconCompatParcelizer = c$b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetLocationToggleUiState$invoke$1(int i, int i2, ShortNewsContentCardView shortNewsContentCardView) {
        super(i, shortNewsContentCardView);
        this.write = i2;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 63;
        read = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj4 = null;
            obj4.hashCode();
            throw null;
        }
        int i4 = this.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        int i5 = 3;
        if (i4 == 0) {
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            GetLocationToggleUiState$invoke$1 getLocationToggleUiState$invoke$1 = new GetLocationToggleUiState$invoke$1(i5, 0, (ShortNewsContentCardView) obj3);
            getLocationToggleUiState$invoke$1.IconCompatParcelizer = (WorkDatabase_Impl) obj;
            getLocationToggleUiState$invoke$1.serializer = zBooleanValue;
            return getLocationToggleUiState$invoke$1.invokeSuspend(createfromparcel2);
        }
        int i6 = 1;
        if (i4 == 1) {
            boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
            GetLocationToggleUiState$invoke$1 getLocationToggleUiState$invoke$2 = new GetLocationToggleUiState$invoke$1(i5, i6, (ShortNewsContentCardView) obj3);
            getLocationToggleUiState$invoke$2.serializer = zBooleanValue2;
            getLocationToggleUiState$invoke$2.IconCompatParcelizer = (createVectorPainterFromImageVector) obj2;
            return getLocationToggleUiState$invoke$2.invokeSuspend(createfromparcel2);
        }
        if (i4 == 2) {
            boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
            GetLocationToggleUiState$invoke$1 getLocationToggleUiState$invoke$3 = new GetLocationToggleUiState$invoke$1(i5, i, (ShortNewsContentCardView) obj3);
            getLocationToggleUiState$invoke$3.serializer = zBooleanValue3;
            getLocationToggleUiState$invoke$3.IconCompatParcelizer = (resolveTextDirection) obj2;
            Object objInvokeSuspend = getLocationToggleUiState$invoke$3.invokeSuspend(createfromparcel2);
            int i7 = RemoteActionCompatParcelizer + 67;
            read = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return objInvokeSuspend;
        }
        if (i4 == 3) {
            boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
            GetLocationToggleUiState$invoke$1 getLocationToggleUiState$invoke$4 = new GetLocationToggleUiState$invoke$1(i5, i5, (ShortNewsContentCardView) obj3);
            getLocationToggleUiState$invoke$4.IconCompatParcelizer = (buildStyledTypefaceFO1MlWM) obj;
            getLocationToggleUiState$invoke$4.serializer = zBooleanValue4;
            return getLocationToggleUiState$invoke$4.invokeSuspend(createfromparcel2);
        }
        boolean zBooleanValue5 = ((Boolean) obj2).booleanValue();
        GetLocationToggleUiState$invoke$1 getLocationToggleUiState$invoke$5 = new GetLocationToggleUiState$invoke$1((C$b) this.IconCompatParcelizer, (ShortNewsContentCardView) obj3);
        getLocationToggleUiState$invoke$5.serializer = zBooleanValue5;
        return getLocationToggleUiState$invoke$5.invokeSuspend(createfromparcel2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 7;
        read = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i3 = this.write;
        if (i3 == 0) {
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.IconCompatParcelizer;
            boolean z = this.serializer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            switch (WorkSpecDaoKtdedupinlinedmap1.IconCompatParcelizer[workDatabase_Impl.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    return new WorkerKtExternalSyntheticLambda2(z);
                case 5:
                case 6:
                    return WorkDatabase.write;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
            }
        }
        if (i3 == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return new onViewAttachedToWindowlambda0(Boolean.valueOf(this.serializer), (createVectorPainterFromImageVector) this.IconCompatParcelizer);
        }
        if (i3 == 2) {
            boolean z2 = this.serializer;
            resolveTextDirection resolvetextdirection = (resolveTextDirection) this.IconCompatParcelizer;
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return new onViewAttachedToWindowlambda0(Boolean.valueOf(z2), resolvetextdirection);
        }
        if (i3 == 3) {
            buildStyledTypefaceFO1MlWM buildstyledtypefacefo1mlwm = (buildStyledTypefaceFO1MlWM) this.IconCompatParcelizer;
            boolean z3 = this.serializer;
            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (!(buildstyledtypefacefo1mlwm instanceof AndroidMultiParagraphDraw_androidKt)) {
                return buildstyledtypefacefo1mlwm;
            }
            AndroidMultiParagraphDraw_androidKt androidMultiParagraphDraw_androidKt = (AndroidMultiParagraphDraw_androidKt) buildstyledtypefacefo1mlwm;
            String str = androidMultiParagraphDraw_androidKt.RemoteActionCompatParcelizer;
            int i4 = androidMultiParagraphDraw_androidKt.IconCompatParcelizer;
            boolean z4 = androidMultiParagraphDraw_androidKt.serializer;
            str.getClass();
            return new AndroidMultiParagraphDraw_androidKt(str, i4, z3, z4);
        }
        boolean z5 = this.serializer;
        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        C$b c$b = (C$b) this.IconCompatParcelizer;
        intercept interceptVar = (intercept) c$b.serializer;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) interceptVar.IconCompatParcelizer.write;
        String strSerializer = firebaseRemoteConfigImpl.RemoteActionCompatParcelizer.serializer();
        boolean z6 = false;
        if (strSerializer != null) {
            if (m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_NOTIFICATION_OVERLAY_ENABLED, firebaseRemoteConfigImpl.IconCompatParcelizer, strSerializer, firebaseRemoteConfigImpl) && (!interceptVar.read.read())) {
                int i5 = read + 83;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    ((FirebaseRemoteConfigImpl) ((unpackInt2) c$b.write).RemoteActionCompatParcelizer).IconCompatParcelizer(updateAdidI.IS_OVERLAY_VISIBILITY_BANNER_ENABLED);
                    throw null;
                }
                if (((FirebaseRemoteConfigImpl) ((unpackInt2) c$b.write).RemoteActionCompatParcelizer).IconCompatParcelizer(updateAdidI.IS_OVERLAY_VISIBILITY_BANNER_ENABLED) && z5) {
                    int i6 = RemoteActionCompatParcelizer + 87;
                    read = i6 % Fields.SpotShadowColor;
                    z6 = i6 % 2 == 0;
                }
            }
        }
        return Boolean.valueOf(z6);
    }
}
