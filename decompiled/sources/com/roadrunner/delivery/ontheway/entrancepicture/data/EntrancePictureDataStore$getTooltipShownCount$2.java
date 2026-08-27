package com.roadrunner.delivery.ontheway.entrancepicture.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.AndroidFontListTypeface;
import o.ShortNewsContentCardView;
import o.getNoActiveChildannotations;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class EntrancePictureDataStore$getTooltipShownCount$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ AndroidFontListTypeface RemoteActionCompatParcelizer;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EntrancePictureDataStore$getTooltipShownCount$2(int i, AndroidFontListTypeface androidFontListTypeface, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = androidFontListTypeface;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = read + 85;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = 0;
        if (this.IconCompatParcelizer == 0) {
            return new EntrancePictureDataStore$getTooltipShownCount$2(i4, this.RemoteActionCompatParcelizer, shortNewsContentCardView);
        }
        EntrancePictureDataStore$getTooltipShownCount$2 entrancePictureDataStore$getTooltipShownCount$2 = new EntrancePictureDataStore$getTooltipShownCount$2(1, this.RemoteActionCompatParcelizer, shortNewsContentCardView);
        int i5 = read + 85;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 79 / 0;
        }
        return entrancePictureDataStore$getTooltipShownCount$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        return ((com.roadrunner.delivery.ontheway.entrancepicture.data.EntrancePictureDataStore$getTooltipShownCount$2) create(r5, r6)).invokeSuspend(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r5 = ((com.roadrunner.delivery.ontheway.entrancepicture.data.EntrancePictureDataStore$getTooltipShownCount$2) create(r5, r6)).invokeSuspend(r2);
        r6 = com.roadrunner.delivery.ontheway.entrancepicture.data.EntrancePictureDataStore$getTooltipShownCount$2.write + 47;
        com.roadrunner.delivery.ontheway.entrancepicture.data.EntrancePictureDataStore$getTooltipShownCount$2.read = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        if ((r6 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        r6 = 75 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
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
            int r1 = com.roadrunner.delivery.ontheway.entrancepicture.data.EntrancePictureDataStore$getTooltipShownCount$2.write
            int r1 = r1 + 73
            int r2 = r1 % 128
            com.roadrunner.delivery.ontheway.entrancepicture.data.EntrancePictureDataStore$getTooltipShownCount$2.read = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1d
            int r1 = r4.IconCompatParcelizer
            o.createFromParcel r2 = o.createFromParcel.INSTANCE
            o.getContentViewGroupParentLayout r5 = (o.getContentViewGroupParentLayout) r5
            o.ShortNewsContentCardView r6 = (o.ShortNewsContentCardView) r6
            r3 = 39
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
            com.roadrunner.delivery.ontheway.entrancepicture.data.EntrancePictureDataStore$getTooltipShownCount$2 r5 = (com.roadrunner.delivery.ontheway.entrancepicture.data.EntrancePictureDataStore$getTooltipShownCount$2) r5
            java.lang.Object r5 = r5.invokeSuspend(r2)
            return r5
        L32:
            o.ShortNewsContentCardView r5 = r4.create(r5, r6)
            com.roadrunner.delivery.ontheway.entrancepicture.data.EntrancePictureDataStore$getTooltipShownCount$2 r5 = (com.roadrunner.delivery.ontheway.entrancepicture.data.EntrancePictureDataStore$getTooltipShownCount$2) r5
            java.lang.Object r5 = r5.invokeSuspend(r2)
            int r6 = com.roadrunner.delivery.ontheway.entrancepicture.data.EntrancePictureDataStore$getTooltipShownCount$2.write
            int r6 = r6 + 47
            int r1 = r6 % 128
            com.roadrunner.delivery.ontheway.entrancepicture.data.EntrancePictureDataStore$getTooltipShownCount$2.read = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L4b
            r6 = 75
            int r6 = r6 / 0
        L4b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.ontheway.entrancepicture.data.EntrancePictureDataStore$getTooltipShownCount$2.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Integer num;
        int i = 2 % 2;
        int i2 = read + 15;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        AndroidFontListTypeface androidFontListTypeface = this.RemoteActionCompatParcelizer;
        Object obj2 = null;
        if (i4 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.serializer;
            if (i5 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Flow flowSerializer = androidFontListTypeface.RemoteActionCompatParcelizer.serializer();
                this.serializer = 1;
                obj = FlowKt.firstOrNull(flowSerializer, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    int i6 = write + 9;
                    read = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            getNoActiveChildannotations getnoactivechildannotations = (getNoActiveChildannotations) obj;
            return new Integer((getnoactivechildannotations == null || (num = (Integer) getnoactivechildannotations.serializer(androidFontListTypeface.write)) == null) ? 0 : num.intValue());
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = this.serializer;
        if (i8 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Flow flowSerializer2 = androidFontListTypeface.RemoteActionCompatParcelizer.serializer();
            this.serializer = 1;
            obj = FlowKt.firstOrNull(flowSerializer2, this);
            if (obj == coroutineSingletons2) {
                int i9 = write + 19;
                read = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return coroutineSingletons2;
            }
        } else {
            if (i8 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i11 = read + 41;
            write = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                obj2.hashCode();
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        getNoActiveChildannotations getnoactivechildannotations2 = (getNoActiveChildannotations) obj;
        if (getnoactivechildannotations2 == null) {
            return null;
        }
        int i12 = write + 97;
        read = i12 % Fields.SpotShadowColor;
        if (i12 % 2 != 0) {
            return (String) getnoactivechildannotations2.serializer(androidFontListTypeface.read);
        }
        obj2.hashCode();
        throw null;
    }
}
