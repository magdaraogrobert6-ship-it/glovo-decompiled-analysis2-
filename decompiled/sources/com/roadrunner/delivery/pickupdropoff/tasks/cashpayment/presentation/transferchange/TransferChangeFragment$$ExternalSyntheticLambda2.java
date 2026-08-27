package com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange;

import androidx.compose.ui.graphics.Fields;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.compose.TransferChangeScreenKt;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import o.AndroidContentCaptureManager;
import o.asComposePaint;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getPostalCode;
import o.onShowTranslationui;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8;
import o.removeNodeAtDepth;
import o.supportedSearch;
import o.toBitmapConfig1JJdX4A;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class TransferChangeFragment$$ExternalSyntheticLambda2 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ TransferChangeFragment IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ TransferChangeFragment$$ExternalSyntheticLambda2(TransferChangeFragment transferChangeFragment, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = transferChangeFragment;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0164  */
    /* JADX WARN: Code duplicated, block: B:42:0x0184  */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = 2 % 2;
        int i2 = read + 61;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        final TransferChangeFragment transferChangeFragment = this.IconCompatParcelizer;
        final int i5 = 1;
        if (i4 != 0) {
            String str = (String) obj;
            double dDoubleValue = ((Double) obj2).doubleValue();
            str.getClass();
            TransferChangeViewModel transferChangeViewModelSerializer = transferChangeFragment.serializer();
            asComposePaint ascomposepaintIconCompatParcelizer = toBitmapConfig1JJdX4A.IconCompatParcelizer(transferChangeViewModelSerializer);
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{transferChangeViewModelSerializer.write().RemoteActionCompatParcelizer.read, str}, getCieXyz.write())).booleanValue()) {
                TransferChangeViewState transferChangeViewStateWrite = transferChangeViewModelSerializer.write();
                AmountTextInputState amountTextInputState = transferChangeViewModelSerializer.write().RemoteActionCompatParcelizer;
                boolean z2 = amountTextInputState.write;
                boolean z3 = amountTextInputState.IconCompatParcelizer;
                boolean z4 = amountTextInputState.RemoteActionCompatParcelizer;
                String str2 = amountTextInputState.serializer;
                str2.getClass();
                AmountTextInputState amountTextInputState2 = new AmountTextInputState(str, z2, z3, z4, str2);
                CalculatorState calculatorState = transferChangeViewModelSerializer.write().serializer;
                boolean z5 = calculatorState.read;
                String str3 = calculatorState.RemoteActionCompatParcelizer;
                str3.getClass();
                CalculatorState calculatorState2 = new CalculatorState(str3, z5, true);
                TransferButtonState transferButtonState = transferChangeViewStateWrite.IconCompatParcelizer;
                transferButtonState.getClass();
                ((onShowTranslationui) transferChangeViewModelSerializer.PlaybackStateCompat).setValue(new TransferChangeViewState(amountTextInputState2, calculatorState2, transferButtonState));
                r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = transferChangeViewModelSerializer.MediaBrowserCompatMediaItem;
                if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                    int i6 = read + 89;
                    write = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                }
                transferChangeViewModelSerializer.MediaBrowserCompatMediaItem = BuildersKt.RemoteActionCompatParcelizer(ascomposepaintIconCompatParcelizer, null, null, new TransferChangeViewModel$onAmountTextChange$1(transferChangeViewModelSerializer, str, dDoubleValue, null), 3);
            }
            int i8 = read + 51;
            write = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return createfromparcel;
        }
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Integer) obj2).intValue();
        final int i10 = 0;
        if ((iIntValue & 3) != 2) {
            int i11 = read + 67;
            write = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            z = true;
        } else {
            z = false;
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, z)) {
            int i13 = read + 111;
            write = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            TransferChangeViewState transferChangeViewStateWrite2 = transferChangeFragment.serializer().write();
            r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8 r8lambdacmvjstjhw3hzog60vfqxbrs6hs8 = ((supportedSearch) transferChangeFragment.getOnBackPressedDispatcher.MediaSessionCompatResultReceiverWrapper()).serializer;
            p0 p0Var = transferChangeFragment.getSavedStateRegistry;
            if (p0Var == null) {
                removeNodeAtDepth.serializer("amountSectionTextInputBigComposableFactory");
                throw null;
            }
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(transferChangeFragment);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (zIconCompatParcelizer || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeFragment$$ExternalSyntheticLambda3
                    private static int IconCompatParcelizer = 1;
                    private static int serializer;

                    /* JADX WARN: Code restructure failed: missing block: B:10:0x0049, code lost:
                    
                        if ((r1 % 2) != 0) goto L12;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
                    
                        return r2;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
                    
                        r6.hashCode();
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
                    
                        throw null;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
                    
                        r3.serializer().IconCompatParcelizer();
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
                    
                        return r2;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
                    
                        if (r1 != 0) goto L9;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
                    
                        if (r1 != 0) goto L9;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
                    
                        r1 = r3.serializer();
                        r3 = ((o.supportedSearch) r3.getOnBackPressedDispatcher.MediaSessionCompatResultReceiverWrapper()).serializer.taskId;
                        r3.getClass();
                        r6 = null;
                        o.r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(r1, new androidx.compose.animation.core.Animatable.AnonymousClass2(r1, r3, null, 1));
                        r1 = com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeFragment$$ExternalSyntheticLambda3.IconCompatParcelizer + 31;
                        com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeFragment$$ExternalSyntheticLambda3.serializer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                     */
                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke() {
                        /*
                            r7 = this;
                            r0 = 2
                            int r1 = r0 % r0
                            int r1 = com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeFragment$$ExternalSyntheticLambda3.IconCompatParcelizer
                            int r1 = r1 + 25
                            int r2 = r1 % 128
                            com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeFragment$$ExternalSyntheticLambda3.serializer = r2
                            int r1 = r1 % r0
                            if (r1 == 0) goto L1b
                            int r1 = r2
                            o.createFromParcel r2 = o.createFromParcel.INSTANCE
                            com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeFragment r3 = r1
                            r4 = 99
                            int r4 = r4 / 0
                            if (r1 == 0) goto L50
                            goto L23
                        L1b:
                            int r1 = r2
                            o.createFromParcel r2 = o.createFromParcel.INSTANCE
                            com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeFragment r3 = r1
                            if (r1 == 0) goto L50
                        L23:
                            com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeViewModel r1 = r3.serializer()
                            androidx.navigation.NavArgsLazy r3 = r3.getOnBackPressedDispatcher
                            java.lang.Object r3 = r3.MediaSessionCompatResultReceiverWrapper()
                            o.supportedSearch r3 = (o.supportedSearch) r3
                            o.r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8 r3 = r3.serializer
                            java.lang.String r3 = r3.taskId
                            r3.getClass()
                            androidx.compose.animation.core.Animatable$snapTo$2 r4 = new androidx.compose.animation.core.Animatable$snapTo$2
                            r5 = 1
                            r6 = 0
                            r4.<init>(r1, r3, r6, r5)
                            o.r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(r1, r4)
                            int r1 = com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeFragment$$ExternalSyntheticLambda3.IconCompatParcelizer
                            int r1 = r1 + 31
                            int r3 = r1 % 128
                            com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeFragment$$ExternalSyntheticLambda3.serializer = r3
                            int r1 = r1 % r0
                            if (r1 != 0) goto L4c
                            return r2
                        L4c:
                            r6.hashCode()
                            throw r6
                        L50:
                            com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeViewModel r0 = r3.serializer()
                            r0.IconCompatParcelizer()
                            return r2
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeFragment$$ExternalSyntheticLambda3.invoke():java.lang.Object");
                    }
                };
                getpostalcode.write(objComponentActivity);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity;
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(transferChangeFragment);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (!(!zIconCompatParcelizer2) || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new TransferChangeFragment$$ExternalSyntheticLambda2(transferChangeFragment, i5);
                getpostalcode.write(objComponentActivity2);
            }
            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity2;
            boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(transferChangeFragment);
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer3) {
                objComponentActivity3 = new TransferChangeFragment$$ExternalSyntheticLambda0(transferChangeFragment, 2);
                getpostalcode.write(objComponentActivity3);
            } else {
                int i15 = read + 87;
                write = i15 % Fields.SpotShadowColor;
                if (i15 % 2 == 0) {
                    int i16 = 61 / 0;
                    if (objComponentActivity3 == androidContentCaptureManager) {
                        objComponentActivity3 = new TransferChangeFragment$$ExternalSyntheticLambda0(transferChangeFragment, 2);
                        getpostalcode.write(objComponentActivity3);
                    }
                } else if (objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = new TransferChangeFragment$$ExternalSyntheticLambda0(transferChangeFragment, 2);
                    getpostalcode.write(objComponentActivity3);
                }
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3;
            boolean zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(transferChangeFragment);
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer4) {
                objComponentActivity4 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeFragment$$ExternalSyntheticLambda3
                    private static int IconCompatParcelizer = 1;
                    private static int serializer;

                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final java.lang.Object invoke() {
                        /*
                            r7 = this;
                            r0 = 2
                            int r1 = r0 % r0
                            int r1 = com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeFragment$$ExternalSyntheticLambda3.IconCompatParcelizer
                            int r1 = r1 + 25
                            int r2 = r1 % 128
                            com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeFragment$$ExternalSyntheticLambda3.serializer = r2
                            int r1 = r1 % r0
                            if (r1 == 0) goto L1b
                            int r1 = r2
                            o.createFromParcel r2 = o.createFromParcel.INSTANCE
                            com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeFragment r3 = r1
                            r4 = 99
                            int r4 = r4 / 0
                            if (r1 == 0) goto L50
                            goto L23
                        L1b:
                            int r1 = r2
                            o.createFromParcel r2 = o.createFromParcel.INSTANCE
                            com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeFragment r3 = r1
                            if (r1 == 0) goto L50
                        L23:
                            com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeViewModel r1 = r3.serializer()
                            androidx.navigation.NavArgsLazy r3 = r3.getOnBackPressedDispatcher
                            java.lang.Object r3 = r3.MediaSessionCompatResultReceiverWrapper()
                            o.supportedSearch r3 = (o.supportedSearch) r3
                            o.r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8 r3 = r3.serializer
                            java.lang.String r3 = r3.taskId
                            r3.getClass()
                            androidx.compose.animation.core.Animatable$snapTo$2 r4 = new androidx.compose.animation.core.Animatable$snapTo$2
                            r5 = 1
                            r6 = 0
                            r4.<init>(r1, r3, r6, r5)
                            o.r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(r1, r4)
                            int r1 = com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeFragment$$ExternalSyntheticLambda3.IconCompatParcelizer
                            int r1 = r1 + 31
                            int r3 = r1 % 128
                            com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeFragment$$ExternalSyntheticLambda3.serializer = r3
                            int r1 = r1 % r0
                            if (r1 != 0) goto L4c
                            return r2
                        L4c:
                            r6.hashCode()
                            throw r6
                        L50:
                            com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeViewModel r0 = r3.serializer()
                            r0.IconCompatParcelizer()
                            return r2
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeFragment$$ExternalSyntheticLambda3.invoke():java.lang.Object");
                    }
                };
                getpostalcode.write(objComponentActivity4);
            } else {
                int i17 = read + 1;
                write = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                if (objComponentActivity4 == androidContentCaptureManager) {
                    objComponentActivity4 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeFragment$$ExternalSyntheticLambda3
                        private static int IconCompatParcelizer = 1;
                        private static int serializer;

                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public final java.lang.Object invoke() {
                            /*
                                r7 = this;
                                r0 = 2
                                int r1 = r0 % r0
                                int r1 = com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeFragment$$ExternalSyntheticLambda3.IconCompatParcelizer
                                int r1 = r1 + 25
                                int r2 = r1 % 128
                                com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeFragment$$ExternalSyntheticLambda3.serializer = r2
                                int r1 = r1 % r0
                                if (r1 == 0) goto L1b
                                int r1 = r2
                                o.createFromParcel r2 = o.createFromParcel.INSTANCE
                                com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeFragment r3 = r1
                                r4 = 99
                                int r4 = r4 / 0
                                if (r1 == 0) goto L50
                                goto L23
                            L1b:
                                int r1 = r2
                                o.createFromParcel r2 = o.createFromParcel.INSTANCE
                                com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeFragment r3 = r1
                                if (r1 == 0) goto L50
                            L23:
                                com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeViewModel r1 = r3.serializer()
                                androidx.navigation.NavArgsLazy r3 = r3.getOnBackPressedDispatcher
                                java.lang.Object r3 = r3.MediaSessionCompatResultReceiverWrapper()
                                o.supportedSearch r3 = (o.supportedSearch) r3
                                o.r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8 r3 = r3.serializer
                                java.lang.String r3 = r3.taskId
                                r3.getClass()
                                androidx.compose.animation.core.Animatable$snapTo$2 r4 = new androidx.compose.animation.core.Animatable$snapTo$2
                                r5 = 1
                                r6 = 0
                                r4.<init>(r1, r3, r6, r5)
                                o.r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(r1, r4)
                                int r1 = com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeFragment$$ExternalSyntheticLambda3.IconCompatParcelizer
                                int r1 = r1 + 31
                                int r3 = r1 % 128
                                com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeFragment$$ExternalSyntheticLambda3.serializer = r3
                                int r1 = r1 % r0
                                if (r1 != 0) goto L4c
                                return r2
                            L4c:
                                r6.hashCode()
                                throw r6
                            L50:
                                com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeViewModel r0 = r3.serializer()
                                r0.IconCompatParcelizer()
                                return r2
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeFragment$$ExternalSyntheticLambda3.invoke():java.lang.Object");
                        }
                    };
                    getpostalcode.write(objComponentActivity4);
                }
            }
            TransferChangeScreenKt.TransferChangeScreen(transferChangeViewStateWrite2, r8lambdacmvjstjhw3hzog60vfqxbrs6hs8, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity4, p0Var, null, getpostalcode, r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8.$stable << 3);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createfromparcel;
    }
}
