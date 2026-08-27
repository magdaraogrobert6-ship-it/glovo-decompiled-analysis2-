package com.roadrunner.delivery.pickupdropoff.tasks.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.wisesecurity.ucs_credential.g0;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AsyncTypefaceCacheAsyncTypefaceResult;
import o.isItemDismissable;
import o.isPermanentFailureimpl;
import o.onItemDismiss;
import o.setParameterizedContentlambda0100;
import o.setParameterizedContentlambda02;
import o.setTransactionSuccessful;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class ConfirmDeliveryStepUseCaseImpl {
    private static int read = 1;
    private static int serializer;
    public final setTransactionSuccessful IconCompatParcelizer;
    public final ConfirmationRepository RemoteActionCompatParcelizer;
    public final g0 write;

    public ConfirmDeliveryStepUseCaseImpl(ConfirmationRepository confirmationRepository, g0 g0Var, setTransactionSuccessful settransactionsuccessful) {
        confirmationRepository.getClass();
        g0Var.getClass();
        settransactionsuccessful.getClass();
        this.RemoteActionCompatParcelizer = confirmationRepository;
        this.write = g0Var;
        this.IconCompatParcelizer = settransactionsuccessful;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0029  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    public final Object m4938invokegIAlus(setParameterizedContentlambda02 setparameterizedcontentlambda02, ContinuationImpl continuationImpl) {
        ConfirmDeliveryStepUseCaseImpl$invoke$1 confirmDeliveryStepUseCaseImpl$invoke$1;
        int i = 2 % 2;
        if (continuationImpl instanceof ConfirmDeliveryStepUseCaseImpl$invoke$1) {
            int i2 = read + 41;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            confirmDeliveryStepUseCaseImpl$invoke$1 = (ConfirmDeliveryStepUseCaseImpl$invoke$1) continuationImpl;
            int i4 = confirmDeliveryStepUseCaseImpl$invoke$1.RemoteActionCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = read + 1;
                serializer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                confirmDeliveryStepUseCaseImpl$invoke$1.RemoteActionCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                confirmDeliveryStepUseCaseImpl$invoke$1 = new ConfirmDeliveryStepUseCaseImpl$invoke$1(this, continuationImpl);
            }
        } else {
            confirmDeliveryStepUseCaseImpl$invoke$1 = new ConfirmDeliveryStepUseCaseImpl$invoke$1(this, continuationImpl);
        }
        Object obj = confirmDeliveryStepUseCaseImpl$invoke$1.read;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = confirmDeliveryStepUseCaseImpl$invoke$1.RemoteActionCompatParcelizer;
        if (i7 != 0) {
            if (i7 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return ((onItemDismiss) obj).IconCompatParcelizer;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        confirmDeliveryStepUseCaseImpl$invoke$1.RemoteActionCompatParcelizer = 1;
        Object objM4937confirmDeliveryStepV3gIAlus = m4937confirmDeliveryStepV3gIAlus(setparameterizedcontentlambda02, confirmDeliveryStepUseCaseImpl$invoke$1);
        if (objM4937confirmDeliveryStepV3gIAlus != obj2) {
            return objM4937confirmDeliveryStepV3gIAlus;
        }
        int i8 = serializer + 113;
        read = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            int i9 = 41 / 0;
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0038 A[PHI: r1 r5
  0x0038: PHI (r1v10 com.roadrunner.delivery.pickupdropoff.tasks.domain.ConfirmDeliveryStepUseCaseImpl$confirmDeliveryStepV3$1) = 
  (r1v9 com.roadrunner.delivery.pickupdropoff.tasks.domain.ConfirmDeliveryStepUseCaseImpl$confirmDeliveryStepV3$1)
  (r1v12 com.roadrunner.delivery.pickupdropoff.tasks.domain.ConfirmDeliveryStepUseCaseImpl$confirmDeliveryStepV3$1)
 binds: [B:13:0x0036, B:10:0x002c] A[DONT_GENERATE, DONT_INLINE]
  0x0038: PHI (r5v6 int) = (r5v5 int), (r5v8 int) binds: [B:13:0x0036, B:10:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    /* JADX WARN: Code duplicated, block: B:33:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0094  */
    /* JADX WARN: Code duplicated, block: B:37:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0099  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b6  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: confirmDeliveryStepV3-gIAlu-s, reason: not valid java name */
    public final Object m4937confirmDeliveryStepV3gIAlus(setParameterizedContentlambda02 setparameterizedcontentlambda02, ContinuationImpl continuationImpl) {
        ConfirmDeliveryStepUseCaseImpl$confirmDeliveryStepV3$1 confirmDeliveryStepUseCaseImpl$confirmDeliveryStepV3$1;
        double dDoubleValue;
        int i;
        int i2 = 2 % 2;
        int i3 = read;
        int i4 = i3 + 105;
        serializer = i4 % Fields.SpotShadowColor;
        String str = null;
        isPermanentFailureimpl ispermanentfailureimpl = null;
        if (i4 % 2 != 0) {
            boolean z = continuationImpl instanceof ConfirmDeliveryStepUseCaseImpl$confirmDeliveryStepV3$1;
            throw null;
        }
        if (!(continuationImpl instanceof ConfirmDeliveryStepUseCaseImpl$confirmDeliveryStepV3$1)) {
            confirmDeliveryStepUseCaseImpl$confirmDeliveryStepV3$1 = new ConfirmDeliveryStepUseCaseImpl$confirmDeliveryStepV3$1(this, continuationImpl);
        } else {
            int i5 = i3 + 3;
            serializer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                confirmDeliveryStepUseCaseImpl$confirmDeliveryStepV3$1 = (ConfirmDeliveryStepUseCaseImpl$confirmDeliveryStepV3$1) continuationImpl;
                i = confirmDeliveryStepUseCaseImpl$confirmDeliveryStepV3$1.serializer;
                int i6 = 14 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    int i7 = serializer + 61;
                    read = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    confirmDeliveryStepUseCaseImpl$confirmDeliveryStepV3$1.serializer = i - Integer.MIN_VALUE;
                } else {
                    confirmDeliveryStepUseCaseImpl$confirmDeliveryStepV3$1 = new ConfirmDeliveryStepUseCaseImpl$confirmDeliveryStepV3$1(this, continuationImpl);
                }
            } else {
                confirmDeliveryStepUseCaseImpl$confirmDeliveryStepV3$1 = (ConfirmDeliveryStepUseCaseImpl$confirmDeliveryStepV3$1) continuationImpl;
                i = confirmDeliveryStepUseCaseImpl$confirmDeliveryStepV3$1.serializer;
                if ((i & Integer.MIN_VALUE) != 0) {
                    int i9 = serializer + 61;
                    read = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    confirmDeliveryStepUseCaseImpl$confirmDeliveryStepV3$1.serializer = i - Integer.MIN_VALUE;
                } else {
                    confirmDeliveryStepUseCaseImpl$confirmDeliveryStepV3$1 = new ConfirmDeliveryStepUseCaseImpl$confirmDeliveryStepV3$1(this, continuationImpl);
                }
            }
        }
        ConfirmDeliveryStepUseCaseImpl$confirmDeliveryStepV3$1 confirmDeliveryStepUseCaseImpl$confirmDeliveryStepV3$2 = confirmDeliveryStepUseCaseImpl$confirmDeliveryStepV3$1;
        Object obj = confirmDeliveryStepUseCaseImpl$confirmDeliveryStepV3$2.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = confirmDeliveryStepUseCaseImpl$confirmDeliveryStepV3$2.serializer;
        if (i11 != 0) {
            if (i11 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return ((onItemDismiss) obj).IconCompatParcelizer;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        String str2 = setparameterizedcontentlambda02.read;
        setParameterizedContentlambda0100 setparameterizedcontentlambda0100 = setparameterizedcontentlambda02.IconCompatParcelizer;
        if (str2 == null) {
            Timber.RemoteActionCompatParcelizer.read(new IllegalStateException("Url is null. params: " + setparameterizedcontentlambda02));
            return new isItemDismissable(new IllegalStateException(this.IconCompatParcelizer.IconCompatParcelizer(R.string.all_error_message)));
        }
        int i12 = read + 91;
        serializer = i12 % Fields.SpotShadowColor;
        if (i12 % 2 != 0) {
            String str3 = setparameterizedcontentlambda02.serializer;
            boolean z2 = setparameterizedcontentlambda0100.IconCompatParcelizer;
            Double d = setparameterizedcontentlambda0100.RemoteActionCompatParcelizer;
            Double d2 = setparameterizedcontentlambda0100.write;
            String str4 = setparameterizedcontentlambda0100.serializer;
            str.hashCode();
            throw null;
        }
        String str5 = setparameterizedcontentlambda02.serializer;
        boolean z3 = setparameterizedcontentlambda0100.IconCompatParcelizer;
        Double d3 = setparameterizedcontentlambda0100.RemoteActionCompatParcelizer;
        Double d4 = setparameterizedcontentlambda0100.write;
        String str6 = setparameterizedcontentlambda0100.serializer;
        if (d3 == null) {
            int i13 = serializer + 73;
            read = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            if (z3) {
                if (!z3) {
                    d4 = d3;
                }
                if (z3) {
                    if (d3 == null) {
                        int i15 = read + 27;
                        serializer = i15 % Fields.SpotShadowColor;
                        int i16 = i15 % 2;
                        str = "";
                    } else {
                        str = str6;
                    }
                }
                if (d4 != null) {
                    int i17 = read + 59;
                    serializer = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    dDoubleValue = d4.doubleValue();
                } else {
                    int i19 = serializer + 53;
                    read = i19 % Fields.SpotShadowColor;
                    int i20 = i19 % 2;
                    dDoubleValue = 0.0d;
                }
                this.write.getClass();
                ispermanentfailureimpl = new isPermanentFailureimpl(new AsyncTypefaceCacheAsyncTypefaceResult(g0.IconCompatParcelizer(dDoubleValue), str));
            }
        } else {
            if (!z3) {
                d4 = d3;
            }
            if (z3) {
                if (d3 == null) {
                    int i110 = read + 27;
                    serializer = i110 % Fields.SpotShadowColor;
                    int i111 = i110 % 2;
                    str = "";
                } else {
                    str = str6;
                }
            }
            if (d4 != null) {
                int i112 = read + 59;
                serializer = i112 % Fields.SpotShadowColor;
                int i113 = i112 % 2;
                dDoubleValue = d4.doubleValue();
            } else {
                int i114 = serializer + 53;
                read = i114 % Fields.SpotShadowColor;
                int i21 = i114 % 2;
                dDoubleValue = 0.0d;
            }
            this.write.getClass();
            ispermanentfailureimpl = new isPermanentFailureimpl(new AsyncTypefaceCacheAsyncTypefaceResult(g0.IconCompatParcelizer(dDoubleValue), str));
        }
        isPermanentFailureimpl ispermanentfailureimpl2 = ispermanentfailureimpl;
        Map map = setparameterizedcontentlambda0100.read;
        confirmDeliveryStepUseCaseImpl$confirmDeliveryStepV3$2.serializer = 1;
        Object objM4923confirmDeliveryStepyxL6bBk = this.RemoteActionCompatParcelizer.m4923confirmDeliveryStepyxL6bBk(str2, str5, ispermanentfailureimpl2, map, confirmDeliveryStepUseCaseImpl$confirmDeliveryStepV3$2);
        if (objM4923confirmDeliveryStepyxL6bBk != coroutineSingletons) {
            return objM4923confirmDeliveryStepyxL6bBk;
        }
        int i22 = read + 35;
        serializer = i22 % Fields.SpotShadowColor;
        if (i22 % 2 != 0) {
            int i23 = 56 / 0;
        }
        return coroutineSingletons;
    }
}
