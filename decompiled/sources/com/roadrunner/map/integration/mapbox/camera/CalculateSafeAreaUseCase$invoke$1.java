package com.roadrunner.map.integration.mapbox.camera;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.maps.EdgeInsets;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.g6;
import o.getHeadingrAG3T2kannotations;
import o.getStrictnessusljTpc;
import o.i4;
import o.onPrimaryNavigationFragmentChanged;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.serialize;

/* JADX INFO: loaded from: classes3.dex */
public final class CalculateSafeAreaUseCase$invoke$1 extends SuspendLambda implements r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;
    public final /* synthetic */ CalculateSafeAreaUseCase IconCompatParcelizer;
    public /* synthetic */ g6 RemoteActionCompatParcelizer;
    public final /* synthetic */ getStrictnessusljTpc read;
    public /* synthetic */ onPrimaryNavigationFragmentChanged serializer;
    public /* synthetic */ serialize write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalculateSafeAreaUseCase$invoke$1(CalculateSafeAreaUseCase calculateSafeAreaUseCase, getStrictnessusljTpc getstrictnessusljtpc, ShortNewsContentCardView shortNewsContentCardView) {
        super(4, shortNewsContentCardView);
        this.IconCompatParcelizer = calculateSafeAreaUseCase;
        this.read = getstrictnessusljtpc;
    }

    @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 2 % 2;
        CalculateSafeAreaUseCase$invoke$1 calculateSafeAreaUseCase$invoke$1 = new CalculateSafeAreaUseCase$invoke$1(this.IconCompatParcelizer, this.read, (ShortNewsContentCardView) obj4);
        calculateSafeAreaUseCase$invoke$1.RemoteActionCompatParcelizer = (g6) obj;
        calculateSafeAreaUseCase$invoke$1.serializer = (onPrimaryNavigationFragmentChanged) obj2;
        calculateSafeAreaUseCase$invoke$1.write = (serialize) obj3;
        Object objInvokeSuspend = calculateSafeAreaUseCase$invoke$1.invokeSuspend(createFromParcel.INSTANCE);
        int i2 = MediaMetadataCompat + 67;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return objInvokeSuspend;
        }
        Object obj5 = null;
        obj5.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    /* JADX WARN: Code duplicated, block: B:19:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0057  */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        g6 g6VarIconCompatParcelizer;
        int i;
        int i2 = 2 % 2;
        g6 g6Var = this.RemoteActionCompatParcelizer;
        onPrimaryNavigationFragmentChanged onprimarynavigationfragmentchanged = this.serializer;
        serialize serializeVar = this.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        int i3 = CalculateSafeAreaUseCase.write + g6Var.read;
        getStrictnessusljTpc getstrictnessusljtpc = this.read;
        int i4 = 0;
        if (!(getstrictnessusljtpc instanceof getHeadingrAG3T2kannotations)) {
            g6VarIconCompatParcelizer = g6.IconCompatParcelizer(g6Var, i3, 0, 11);
        } else {
            int i5 = MediaMetadataCompat + 9;
            MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                boolean z = ((getHeadingrAG3T2kannotations) getstrictnessusljtpc).IconCompatParcelizer;
                throw null;
            }
            if (((getHeadingrAG3T2kannotations) getstrictnessusljtpc).IconCompatParcelizer) {
                int i6 = MediaBrowserCompatMediaItem + 81;
                MediaMetadataCompat = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    int i7 = 81 / 0;
                    if (serializeVar == serialize.OVERVIEW) {
                        g6VarIconCompatParcelizer = g6.IconCompatParcelizer(g6Var, i3, 0, 11);
                    } else {
                        i = i4.serializer[onprimarynavigationfragmentchanged.ordinal()];
                        if (i != 1) {
                            i4 = CalculateSafeAreaUseCase.read;
                        } else if (i != 2) {
                            i4 = CalculateSafeAreaUseCase.serializer;
                            int i8 = MediaMetadataCompat + 73;
                            MediaBrowserCompatMediaItem = i8 % Fields.SpotShadowColor;
                            int i9 = i8 % 2;
                        } else if (i != 3) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                        }
                        g6VarIconCompatParcelizer = g6.IconCompatParcelizer(g6Var, i3, g6Var.write + i4, 3);
                    }
                } else if (serializeVar == serialize.OVERVIEW) {
                    g6VarIconCompatParcelizer = g6.IconCompatParcelizer(g6Var, i3, 0, 11);
                } else {
                    i = i4.serializer[onprimarynavigationfragmentchanged.ordinal()];
                    if (i != 1) {
                        i4 = CalculateSafeAreaUseCase.read;
                    } else if (i != 2) {
                        i4 = CalculateSafeAreaUseCase.serializer;
                        int i10 = MediaMetadataCompat + 73;
                        MediaBrowserCompatMediaItem = i10 % Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                    } else if (i != 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    g6VarIconCompatParcelizer = g6.IconCompatParcelizer(g6Var, i3, g6Var.write + i4, 3);
                }
            } else {
                g6VarIconCompatParcelizer = g6.IconCompatParcelizer(g6Var, i3, 0, 11);
            }
        }
        return new EdgeInsets(g6VarIconCompatParcelizer.read, g6VarIconCompatParcelizer.IconCompatParcelizer, g6VarIconCompatParcelizer.write, g6VarIconCompatParcelizer.serializer);
    }
}
