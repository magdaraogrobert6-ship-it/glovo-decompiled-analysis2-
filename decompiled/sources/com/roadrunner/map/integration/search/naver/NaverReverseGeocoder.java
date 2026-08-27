package com.roadrunner.map.integration.search.naver;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.ef;
import o.ne;
import o.o5;
import o.o6;
import o.o6ExternalSyntheticLambda20;
import o.onItemDismiss;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaaAzn5eL4WKW0o5J25K1E0csgpOI;

/* JADX INFO: loaded from: classes3.dex */
public final class NaverReverseGeocoder implements ne {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final ExecuteApiRequest IconCompatParcelizer;
    public final o6ExternalSyntheticLambda20 serializer;

    /* JADX INFO: renamed from: com.roadrunner.map.integration.search.naver.NaverReverseGeocoder$invoke$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        private static int MediaMetadataCompat = 1;
        private static int serializer;
        public final /* synthetic */ double IconCompatParcelizer;
        public int RemoteActionCompatParcelizer;
        public final /* synthetic */ double write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(double d, double d2, ShortNewsContentCardView shortNewsContentCardView) {
            super(1, shortNewsContentCardView);
            this.write = d;
            this.IconCompatParcelizer = d2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2 % 2;
            AnonymousClass2 anonymousClass2 = NaverReverseGeocoder.this.new AnonymousClass2(this.write, this.IconCompatParcelizer, shortNewsContentCardView);
            int i2 = serializer + 47;
            MediaMetadataCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return anonymousClass2;
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = serializer + 69;
            MediaMetadataCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return ((AnonymousClass2) create((ShortNewsContentCardView) obj)).invokeSuspend(createFromParcel.INSTANCE);
            }
            ((AnonymousClass2) create((ShortNewsContentCardView) obj)).invokeSuspend(createFromParcel.INSTANCE);
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = MediaMetadataCompat + 47;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                throw null;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.RemoteActionCompatParcelizer;
            if (i3 != 0) {
                if (i3 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            o6ExternalSyntheticLambda20 o6externalsyntheticlambda20 = NaverReverseGeocoder.this.serializer;
            this.RemoteActionCompatParcelizer = 1;
            Object obj2 = o6externalsyntheticlambda20.read(this.write, this.IconCompatParcelizer, this);
            if (obj2 == coroutineSingletons2) {
                int i4 = serializer + 49;
                MediaMetadataCompat = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return coroutineSingletons2;
                }
                throw null;
            }
            int i5 = serializer + 41;
            MediaMetadataCompat = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return obj2;
            }
            throw null;
        }
    }

    public NaverReverseGeocoder(o6ExternalSyntheticLambda20 o6externalsyntheticlambda20, ExecuteApiRequest executeApiRequest) {
        this.serializer = o6externalsyntheticlambda20;
        this.IconCompatParcelizer = executeApiRequest;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    @Override // o.ne
    public final Object invoke(double d, double d2, r8lambdaaAzn5eL4WKW0o5J25K1E0csgpOI r8lambdaaazn5el4wkw0o5j25k1e0csgpoi, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, ShortNewsContentCardView shortNewsContentCardView) {
        o6 o6Var;
        r8lambdaaAzn5eL4WKW0o5J25K1E0csgpOI r8lambdaaazn5el4wkw0o5j25k1e0csgpoi2;
        Object objM4875invokegIAlus;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        int i = 2 % 2;
        if (shortNewsContentCardView instanceof o6) {
            o6Var = (o6) shortNewsContentCardView;
            int i2 = o6Var.IconCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o6Var.IconCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                o6Var = new o6(this, (ContinuationImpl) shortNewsContentCardView);
            }
        } else {
            o6Var = new o6(this, (ContinuationImpl) shortNewsContentCardView);
        }
        o6 o6Var2 = o6Var;
        Object obj = o6Var2.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = o6Var2.IconCompatParcelizer;
        boolean z = true;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(d, d2, null);
            r8lambdaaazn5el4wkw0o5j25k1e0csgpoi2 = r8lambdaaazn5el4wkw0o5j25k1e0csgpoi;
            o6Var2.RemoteActionCompatParcelizer = r8lambdaaazn5el4wkw0o5j25k1e0csgpoi2;
            o6Var2.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
            o6Var2.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm4;
            o6Var2.IconCompatParcelizer = 1;
            objM4875invokegIAlus = this.IconCompatParcelizer.m4875invokegIAlus(anonymousClass2, o6Var2);
            if (objM4875invokegIAlus == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm5 = o6Var2.serializer;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm6 = o6Var2.read;
            r8lambdaaAzn5eL4WKW0o5J25K1E0csgpOI r8lambdaaazn5el4wkw0o5j25k1e0csgpoi3 = o6Var2.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = r8lambdaunavo3sxub_pc9xroryotnrlvsm5;
            r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = r8lambdaunavo3sxub_pc9xroryotnrlvsm6;
            objM4875invokegIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
            r8lambdaaazn5el4wkw0o5j25k1e0csgpoi2 = r8lambdaaazn5el4wkw0o5j25k1e0csgpoi3;
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4875invokegIAlus);
        if (thSerializer == null) {
            int i4 = RemoteActionCompatParcelizer + 109;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            o5 o5Var = (o5) objM4875invokegIAlus;
            ef efVar = ef.NAVER;
            if (o5Var.formattedAddress != null) {
                int i6 = RemoteActionCompatParcelizer + 45;
                read = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            } else {
                z = false;
            }
            r8lambdaaazn5el4wkw0o5j25k1e0csgpoi2.invoke(efVar, Boolean.valueOf(z));
            r8lambdaunavo3sxub_pc9xroryotnrlvsm3.invoke(o5Var.formattedAddress);
        } else {
            r8lambdaaazn5el4wkw0o5j25k1e0csgpoi2.invoke(ef.NAVER, Boolean.FALSE);
            r8lambdaunavo3sxub_pc9xroryotnrlvsm4.invoke(thSerializer);
        }
        return createFromParcel.INSTANCE;
    }
}
