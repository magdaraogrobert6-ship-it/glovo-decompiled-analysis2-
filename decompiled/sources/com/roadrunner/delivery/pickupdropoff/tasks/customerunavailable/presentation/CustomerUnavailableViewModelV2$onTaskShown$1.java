package com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation;

import android.os.SystemClock;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.agconnect.config.impl.m;
import com.incognia.internal.pcn;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.GetTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.domain.util.IsFixableByRetry;
import com.roadrunner.home.nest.divider.DividerUiModelImpl$1;
import com.roadrunner.nafath.NafathTimerManager$observeCountdown$1;
import com.roadrunner.settings.SettingsViewModel$special$$inlined$map$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import o.AnimationSearchAnimateXAsStateSearch;
import o.ConstraintsKt;
import o.ShortNewsContentCardView;
import o.accessgetInstancedelegatecp;
import o.accessibleField;
import o.asComposePaint;
import o.bitOffsetToIndex;
import o.bitsNeedForSizeUnchecked;
import o.constrainWidthK40F9xA;
import o.createFromParcel;
import o.fixedHeightOenEA2s;
import o.fixedJhjzzOo;
import o.fixedWidthOenEA2s;
import o.getCieXyz;
import o.inCompatibilityMode;
import o.onItemDismiss;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.restrictConstraintsxF2OJ5Q;
import o.toBitmapConfig1JJdX4A;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomerUnavailableViewModelV2$onTaskShown$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ CustomerUnavailableViewModelV2 RemoteActionCompatParcelizer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CustomerUnavailableViewModelV2$onTaskShown$1(CustomerUnavailableViewModelV2 customerUnavailableViewModelV2, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = customerUnavailableViewModelV2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = read + 109;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        CustomerUnavailableViewModelV2 customerUnavailableViewModelV2 = this.RemoteActionCompatParcelizer;
        if (i4 == 0) {
            return new CustomerUnavailableViewModelV2$onTaskShown$1(customerUnavailableViewModelV2, shortNewsContentCardView, 0);
        }
        CustomerUnavailableViewModelV2$onTaskShown$1 customerUnavailableViewModelV2$onTaskShown$1 = new CustomerUnavailableViewModelV2$onTaskShown$1(customerUnavailableViewModelV2, shortNewsContentCardView, 1);
        int i5 = read + 69;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return customerUnavailableViewModelV2$onTaskShown$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        return ((com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModelV2$onTaskShown$1) create(r5, r6)).invokeSuspend(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r5 = ((com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModelV2$onTaskShown$1) create(r5, r6)).invokeSuspend(r2);
        r6 = com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModelV2$onTaskShown$1.read + 25;
        com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModelV2$onTaskShown$1.serializer = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r1 != 0) goto L9;
     */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModelV2$onTaskShown$1.serializer
            int r1 = r1 + 125
            int r2 = r1 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModelV2$onTaskShown$1.read = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1d
            int r1 = r4.IconCompatParcelizer
            o.createFromParcel r2 = o.createFromParcel.INSTANCE
            o.getContentViewGroupParentLayout r5 = (o.getContentViewGroupParentLayout) r5
            o.ShortNewsContentCardView r6 = (o.ShortNewsContentCardView) r6
            r3 = 61
            int r3 = r3 / 0
            if (r1 == 0) goto L32
            goto L27
        L1d:
            int r1 = r4.IconCompatParcelizer
            o.createFromParcel r2 = o.createFromParcel.INSTANCE
            o.getContentViewGroupParentLayout r5 = (o.getContentViewGroupParentLayout) r5
            o.ShortNewsContentCardView r6 = (o.ShortNewsContentCardView) r6
            if (r1 == 0) goto L32
        L27:
            o.ShortNewsContentCardView r5 = r4.create(r5, r6)
            com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModelV2$onTaskShown$1 r5 = (com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModelV2$onTaskShown$1) r5
            java.lang.Object r5 = r5.invokeSuspend(r2)
            return r5
        L32:
            o.ShortNewsContentCardView r5 = r4.create(r5, r6)
            com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModelV2$onTaskShown$1 r5 = (com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModelV2$onTaskShown$1) r5
            java.lang.Object r5 = r5.invokeSuspend(r2)
            int r6 = com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModelV2$onTaskShown$1.read
            int r6 = r6 + 25
            int r1 = r6 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModelV2$onTaskShown$1.serializer = r1
            int r6 = r6 % r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModelV2$onTaskShown$1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:111:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:113:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:115:0x0302  */
    /* JADX WARN: Code duplicated, block: B:117:0x0351  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM4940invokeyxL6bBk;
        CustomerUnavailableViewModelV2 customerUnavailableViewModelV2;
        Object next;
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu;
        Object next2;
        fixedWidthOenEA2s fixedwidthoenea2s;
        Iterator it;
        Object next3;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = 1;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i3 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.write;
            if (i5 != 0) {
                if (i5 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            CustomerUnavailableViewModelV2 customerUnavailableViewModelV3 = this.RemoteActionCompatParcelizer;
            SettingsViewModel$special$$inlined$map$1 settingsViewModel$special$$inlined$map$1 = new SettingsViewModel$special$$inlined$map$1(customerUnavailableViewModelV3.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.write(), i, customerUnavailableViewModelV3);
            DividerUiModelImpl$1.AnonymousClass1 anonymousClass1 = new DividerUiModelImpl$1.AnonymousClass1(customerUnavailableViewModelV3, shortNewsContentCardView, 4);
            this.write = 1;
            return FlowKt.collectLatest(settingsViewModel$special$$inlined$map$1, anonymousClass1, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = this.write;
        CustomerUnavailableViewModelV2 customerUnavailableViewModelV4 = this.RemoteActionCompatParcelizer;
        if (i6 != 0) {
            int i7 = serializer + 81;
            read = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0 ? i6 != 1 : i6 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                objM4940invokeyxL6bBk = ((onItemDismiss) obj).IconCompatParcelizer;
            }
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        GetTaskByTypeAndIdUseCaseImpl getTaskByTypeAndIdUseCaseImpl = customerUnavailableViewModelV4.MediaSessionCompatToken;
        long jLongValue = ((Long) CustomerUnavailableViewModelV2.RemoteActionCompatParcelizer(1764155832, pcn.serializer(), new Object[]{customerUnavailableViewModelV4}, -1764155832, pcn.serializer(), pcn.serializer(), pcn.serializer())).longValue();
        String str = (String) customerUnavailableViewModelV4.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper();
        String str2 = (String) customerUnavailableViewModelV4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.MediaSessionCompatResultReceiverWrapper();
        this.write = 1;
        objM4940invokeyxL6bBk = getTaskByTypeAndIdUseCaseImpl.m4940invokeyxL6bBk(jLongValue, str, str2, accessibleField.class, this);
        if (objM4940invokeyxL6bBk == coroutineSingletons2) {
            return coroutineSingletons2;
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4940invokeyxL6bBk);
        boolean z = false;
        if (thSerializer == null) {
            accessibleField accessiblefield = (accessibleField) objM4940invokeyxL6bBk;
            m mVar = customerUnavailableViewModelV4.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
            mVar.getClass();
            accessiblefield.getClass();
            List list = accessiblefield.utccComponents;
            fixedHeightOenEA2s fixedheightoenea2s = accessiblefield.taskState;
            if (!fixedheightoenea2s.componentStatus.isEmpty()) {
                List<fixedWidthOenEA2s> list2 = list;
                ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
                for (fixedWidthOenEA2s fixedwidthoenea2s2 : list2) {
                    String str3 = (String) fixedheightoenea2s.componentStatus.get(fixedwidthoenea2s2.RemoteActionCompatParcelizer());
                    if (str3 != null) {
                        if (fixedwidthoenea2s2 instanceof fixedJhjzzOo) {
                            int i8 = serializer + 95;
                            read = i8 % Fields.SpotShadowColor;
                            if (i8 % 2 == 0) {
                                restrictConstraintsxF2OJ5Q.Companion.getClass();
                                it = restrictConstraintsxF2OJ5Q.getEntries().iterator();
                                int i9 = 64 / 0;
                            } else {
                                restrictConstraintsxF2OJ5Q.Companion.getClass();
                                it = restrictConstraintsxF2OJ5Q.getEntries().iterator();
                            }
                            do {
                                if (!it.hasNext()) {
                                    next3 = null;
                                    break;
                                }
                                int i10 = serializer + 49;
                                read = i10 % Fields.SpotShadowColor;
                                int i11 = i10 % 2;
                                next3 = it.next();
                            } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((restrictConstraintsxF2OJ5Q) next3).getKey(), str3}, getCieXyz.write())).booleanValue());
                            restrictConstraintsxF2OJ5Q restrictconstraintsxf2oj5q = (restrictConstraintsxF2OJ5Q) next3;
                            if (restrictconstraintsxf2oj5q == null) {
                                int i12 = read + 21;
                                serializer = i12 % Fields.SpotShadowColor;
                                if (i12 % 2 != 0) {
                                    restrictconstraintsxf2oj5q = restrictConstraintsxF2OJ5Q.NOT_INITIATED;
                                    int i13 = 10 / 0;
                                } else {
                                    restrictconstraintsxf2oj5q = restrictConstraintsxF2OJ5Q.NOT_INITIATED;
                                }
                            }
                            fixedJhjzzOo fixedjhjzzoo = (fixedJhjzzOo) fixedwidthoenea2s2;
                            fixedwidthoenea2s = fixedJhjzzOo.read(fixedjhjzzoo, (ConstraintsKt) fixedjhjzzoo.availableStates.get(restrictconstraintsxf2oj5q), restrictconstraintsxf2oj5q, false, false, 207);
                        } else {
                            if (!(fixedwidthoenea2s2 instanceof bitOffsetToIndex)) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                return null;
                            }
                            bitsNeedForSizeUnchecked.Companion.getClass();
                            Iterator<E> it2 = bitsNeedForSizeUnchecked.getEntries().iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it2.next();
                            } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((bitsNeedForSizeUnchecked) next2).getKey(), str3}, getCieXyz.write())).booleanValue());
                            bitsNeedForSizeUnchecked bitsneedforsizeunchecked = (bitsNeedForSizeUnchecked) next2;
                            if (bitsneedforsizeunchecked == null) {
                                bitsneedforsizeunchecked = bitsNeedForSizeUnchecked.DISABLED;
                            }
                            bitOffsetToIndex bitoffsettoindex = (bitOffsetToIndex) fixedwidthoenea2s2;
                            constrainWidthK40F9xA constrainwidthk40f9xa = (constrainWidthK40F9xA) bitoffsettoindex.availableStates.get(bitsneedforsizeunchecked);
                            if (constrainwidthk40f9xa == null) {
                                constrainwidthk40f9xa = bitoffsettoindex.currentState;
                            }
                            fixedwidthoenea2s = bitOffsetToIndex.read(bitoffsettoindex, null, constrainwidthk40f9xa, bitsneedforsizeunchecked, false, 319);
                        }
                        fixedwidthoenea2s2 = fixedwidthoenea2s;
                    }
                    arrayList.add(fixedwidthoenea2s2);
                }
                list = arrayList;
            }
            Set setWrite = m.write(list);
            ((IsFixableByRetry) mVar.RemoteActionCompatParcelizer).getClass();
            accessibleField accessiblefieldWrite = accessibleField.write(accessiblefield, IsFixableByRetry.IconCompatParcelizer(setWrite, list), null, 111);
            fixedHeightOenEA2s fixedheightoenea2s2 = accessiblefieldWrite.taskState;
            Long l = fixedheightoenea2s2.firstOpenedTimeStamp;
            if (l == null) {
                accessiblefieldWrite = accessibleField.write(accessiblefieldWrite, null, fixedHeightOenEA2s.serializer(fixedheightoenea2s2, null, new Long(customerUnavailableViewModelV4.RemoteActionCompatParcelizer.millis()), null, null, 13), 63);
            }
            customerUnavailableViewModelV4.IconCompatParcelizer.IconCompatParcelizer(accessiblefieldWrite);
            fixedHeightOenEA2s fixedheightoenea2s3 = accessiblefieldWrite.taskState;
            Long l2 = fixedheightoenea2s3.timerEndingTimeStamp;
            Long l3 = fixedheightoenea2s3.timerStartingTimeStamp;
            customerUnavailableViewModelV4.MediaSessionCompatResultReceiverWrapper.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            List list3 = accessiblefieldWrite.utccComponents;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list3) {
                int i14 = serializer + 41;
                read = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                if (obj2 instanceof bitOffsetToIndex) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                bitOffsetToIndex bitoffsettoindex2 = (bitOffsetToIndex) next;
                if (bitoffsettoindex2.isEnabled && bitoffsettoindex2.currentStateType != bitsNeedForSizeUnchecked.COMPLETED) {
                    break;
                }
            }
            bitOffsetToIndex bitoffsettoindex3 = (bitOffsetToIndex) next;
            if (bitoffsettoindex3 == null) {
                createfromparcel = createfromparcel;
                customerUnavailableViewModelV2 = customerUnavailableViewModelV4;
            } else if (l2 != null && l3 != null) {
                int i16 = read + 123;
                serializer = i16 % Fields.SpotShadowColor;
                if (i16 % 2 != 0) {
                    l3.longValue();
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                if (l3.longValue() > jElapsedRealtime) {
                    int i17 = serializer + 83;
                    read = i17 % Fields.SpotShadowColor;
                    if (i17 % 2 == 0) {
                        customerUnavailableViewModelV4.read(bitoffsettoindex3);
                        int i18 = 90 / 0;
                    } else {
                        customerUnavailableViewModelV4.read(bitoffsettoindex3);
                    }
                    customerUnavailableViewModelV2 = customerUnavailableViewModelV4;
                } else if (l2 != null) {
                    long jLongValue2 = l2.longValue();
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = customerUnavailableViewModelV4.RatingCompat;
                    if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                        r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                    }
                    createfromparcel = createfromparcel;
                    customerUnavailableViewModelV4.write(bitoffsettoindex3.id, customerUnavailableViewModelV4.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.read((int) Math.max(0L, (jLongValue2 - SystemClock.elapsedRealtime()) / 1000)));
                    asComposePaint ascomposepaintIconCompatParcelizer = toBitmapConfig1JJdX4A.IconCompatParcelizer(customerUnavailableViewModelV4);
                    ((inCompatibilityMode) customerUnavailableViewModelV4.PlaybackStateCompat).getClass();
                    customerUnavailableViewModelV2 = customerUnavailableViewModelV4;
                    customerUnavailableViewModelV2.RatingCompat = BuildersKt.RemoteActionCompatParcelizer(ascomposepaintIconCompatParcelizer, prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer, null, new NafathTimerManager$observeCountdown$1(customerUnavailableViewModelV4, jLongValue2, bitoffsettoindex3, (ShortNewsContentCardView) null, 10), 2);
                    int i19 = serializer + 73;
                    read = i19 % Fields.SpotShadowColor;
                    int i20 = i19 % 2;
                } else {
                    customerUnavailableViewModelV2 = customerUnavailableViewModelV4;
                    customerUnavailableViewModelV2.read(bitoffsettoindex3);
                }
                z = true;
            } else if (l2 != null) {
                long jLongValue3 = l2.longValue();
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = customerUnavailableViewModelV4.RatingCompat;
                if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                }
                createfromparcel = createfromparcel;
                customerUnavailableViewModelV4.write(bitoffsettoindex3.id, customerUnavailableViewModelV4.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.read((int) Math.max(0L, (jLongValue3 - SystemClock.elapsedRealtime()) / 1000)));
                asComposePaint ascomposepaintIconCompatParcelizer2 = toBitmapConfig1JJdX4A.IconCompatParcelizer(customerUnavailableViewModelV4);
                ((inCompatibilityMode) customerUnavailableViewModelV4.PlaybackStateCompat).getClass();
                customerUnavailableViewModelV2 = customerUnavailableViewModelV4;
                customerUnavailableViewModelV2.RatingCompat = BuildersKt.RemoteActionCompatParcelizer(ascomposepaintIconCompatParcelizer2, prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer, null, new NafathTimerManager$observeCountdown$1(customerUnavailableViewModelV4, jLongValue3, bitoffsettoindex3, (ShortNewsContentCardView) null, 10), 2);
                int i110 = serializer + 73;
                read = i110 % Fields.SpotShadowColor;
                int i21 = i110 % 2;
            } else {
                customerUnavailableViewModelV2 = customerUnavailableViewModelV4;
                customerUnavailableViewModelV2.read(bitoffsettoindex3);
                z = true;
            }
            if (l == null && !z) {
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(customerUnavailableViewModelV2), null, null, new CustomerUnavailableViewModelV2$applyAndPersist$1(customerUnavailableViewModelV2, accessiblefieldWrite, null, i4), 3);
            }
        } else {
            createfromparcel = createfromparcel;
            customerUnavailableViewModelV2 = customerUnavailableViewModelV4;
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, "CustomerUnavailableViewModelV2: Failed to load task", new Object[0]);
            customerUnavailableViewModelV2.ComponentActivity.serializer(AnimationSearchAnimateXAsStateSearch.write);
        }
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(customerUnavailableViewModelV2), null, null, new CustomerUnavailableViewModelV2$onTaskShown$1(customerUnavailableViewModelV2, null, i4), 3);
        return createfromparcel;
    }
}
