package com.roadrunner.delivery.accept.laststop.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.roadrunner.delivery.common.analytics.DeliveryAcceptanceLogger;
import com.roadrunner.delivery.state.TrackingEvent;
import com.roadrunner.delivery.state.Trigger;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.drawText;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class LastStopOptionUiModelImpl$trackEvent$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 1;
    private static int write;
    public final /* synthetic */ LastStopOptionUiModelImpl IconCompatParcelizer;
    public final /* synthetic */ Trigger serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LastStopOptionUiModelImpl$trackEvent$1(LastStopOptionUiModelImpl lastStopOptionUiModelImpl, Trigger trigger, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = lastStopOptionUiModelImpl;
        this.serializer = trigger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        LastStopOptionUiModelImpl$trackEvent$1 lastStopOptionUiModelImpl$trackEvent$1 = new LastStopOptionUiModelImpl$trackEvent$1(this.IconCompatParcelizer, this.serializer, shortNewsContentCardView);
        int i2 = write + 87;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return lastStopOptionUiModelImpl$trackEvent$1;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = read + 99;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        LastStopOptionUiModelImpl$trackEvent$1 lastStopOptionUiModelImpl$trackEvent$1 = (LastStopOptionUiModelImpl$trackEvent$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        lastStopOptionUiModelImpl$trackEvent$1.invokeSuspend(createfromparcel);
        int i4 = read + 1;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        drawText drawtext;
        int i = 2 % 2;
        int i2 = read + 15;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        LastStopOptionUiModelImpl lastStopOptionUiModelImpl = this.IconCompatParcelizer;
        Object obj2 = lastStopOptionUiModelImpl.PlaybackStateCompat.read();
        Object obj3 = null;
        if (obj2 instanceof drawText) {
            int i4 = read + 115;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                obj3.hashCode();
                throw null;
            }
            drawtext = (drawText) obj2;
        } else {
            drawtext = null;
        }
        if (drawtext != null) {
            ArrayList arrayList = drawtext.MediaDescriptionCompat;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj4 : arrayList) {
                Trigger.Companion companion = Trigger.Companion;
                String str = ((TrackingEvent) obj4).trigger;
                companion.getClass();
                if (Trigger.Companion.write(str) == this.serializer) {
                    int i5 = read + 71;
                    write = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        arrayList2.add(obj4);
                        throw null;
                    }
                    arrayList2.add(obj4);
                }
            }
            DeliveryAcceptanceLogger deliveryAcceptanceLogger = lastStopOptionUiModelImpl.IconCompatParcelizer;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                int i6 = read + 107;
                write = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    deliveryAcceptanceLogger.serializer((TrackingEvent) it.next());
                    int i7 = 2 / 0;
                } else {
                    deliveryAcceptanceLogger.serializer((TrackingEvent) it.next());
                }
            }
        }
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i8 = read + 21;
        write = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return createfromparcel;
    }
}
