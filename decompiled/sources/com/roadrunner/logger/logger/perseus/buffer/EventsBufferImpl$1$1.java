package com.roadrunner.logger.logger.perseus.buffer;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.perseus.Perseus;
import com.deliveryhero.perseus.PerseusEvent;
import com.logistics.rider.glovo.R;
import com.roadrunner.nafath.VerificationStatusLifecycleObserverImpl;
import io.grpc.internal.CallTracer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.ColumnAdapter;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.accessstartTrackingTable;
import o.createFromParcel;
import o.drawOutlinewDX37Ww;
import o.getContentViewGroupParentLayout;
import o.getData;
import o.getMenu;
import o.onContentCardDismissed;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.performStart;
import o.r8lambdaFqEZAUBkFnfJgz2iX0ulE6_FGM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdaeEn0GUG5cGviZ6WG1OS4uJPKt0;
import o.setTransactionSuccessful;
import o.transactionWithWrapper;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class EventsBufferImpl$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public /* synthetic */ boolean RemoteActionCompatParcelizer;
    public final /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventsBufferImpl$1$1(boolean z, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = 6;
        this.RemoteActionCompatParcelizer = z;
        this.serializer = populateViewStructure_androidKtpopulate7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EventsBufferImpl$1$1(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.serializer = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = read + 123;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.IconCompatParcelizer;
        Object obj2 = this.serializer;
        if (i4 == 0) {
            EventsBufferImpl$1$1 eventsBufferImpl$1$1 = new EventsBufferImpl$1$1((transactionWithWrapper) obj2, shortNewsContentCardView, 0);
            eventsBufferImpl$1$1.RemoteActionCompatParcelizer = ((Boolean) obj).booleanValue();
            return eventsBufferImpl$1$1;
        }
        int i5 = 1;
        if (i4 == 1) {
            EventsBufferImpl$1$1 eventsBufferImpl$1$2 = new EventsBufferImpl$1$1((Context) obj2, shortNewsContentCardView, i5);
            eventsBufferImpl$1$2.RemoteActionCompatParcelizer = ((Boolean) obj).booleanValue();
            return eventsBufferImpl$1$2;
        }
        if (i4 == 2) {
            EventsBufferImpl$1$1 eventsBufferImpl$1$3 = new EventsBufferImpl$1$1((CallTracer) obj2, shortNewsContentCardView, i);
            eventsBufferImpl$1$3.RemoteActionCompatParcelizer = ((Boolean) obj).booleanValue();
            int i6 = read + 61;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return eventsBufferImpl$1$3;
        }
        int i8 = 3;
        if (i4 == 3) {
            EventsBufferImpl$1$1 eventsBufferImpl$1$4 = new EventsBufferImpl$1$1((VerificationStatusLifecycleObserverImpl) obj2, shortNewsContentCardView, i8);
            eventsBufferImpl$1$4.RemoteActionCompatParcelizer = ((Boolean) obj).booleanValue();
            return eventsBufferImpl$1$4;
        }
        int i9 = 4;
        if (i4 == 4) {
            EventsBufferImpl$1$1 eventsBufferImpl$1$5 = new EventsBufferImpl$1$1((performStart) obj2, shortNewsContentCardView, i9);
            eventsBufferImpl$1$5.RemoteActionCompatParcelizer = ((Boolean) obj).booleanValue();
            return eventsBufferImpl$1$5;
        }
        int i10 = 5;
        if (i4 != 5) {
            return new EventsBufferImpl$1$1(this.RemoteActionCompatParcelizer, (PopulateViewStructure_androidKtpopulate7) obj2, shortNewsContentCardView);
        }
        EventsBufferImpl$1$1 eventsBufferImpl$1$6 = new EventsBufferImpl$1$1((ColumnAdapter) obj2, shortNewsContentCardView, i10);
        eventsBufferImpl$1$6.RemoteActionCompatParcelizer = ((Boolean) obj).booleanValue();
        return eventsBufferImpl$1$6;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i2 == 0) {
            Object obj3 = (Boolean) obj;
            obj3.getClass();
            ((EventsBufferImpl$1$1) create(obj3, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            int i3 = read + 11;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return createfromparcel;
        }
        if (i2 == 1) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            ((EventsBufferImpl$1$1) create(bool, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        if (i2 == 2) {
            Boolean bool2 = (Boolean) obj;
            bool2.booleanValue();
            ((EventsBufferImpl$1$1) create(bool2, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        if (i2 == 3) {
            Boolean bool3 = (Boolean) obj;
            bool3.booleanValue();
            ((EventsBufferImpl$1$1) create(bool3, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        if (i2 == 4) {
            Boolean bool4 = (Boolean) obj;
            bool4.booleanValue();
            ((EventsBufferImpl$1$1) create(bool4, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        if (i2 == 5) {
            Boolean bool5 = (Boolean) obj;
            bool5.booleanValue();
            ((EventsBufferImpl$1$1) create(bool5, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        ((EventsBufferImpl$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        int i5 = read + 5;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return createfromparcel;
        }
        Object obj4 = null;
        obj4.hashCode();
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        LinkedHashMap linkedHashMap;
        Object obj3;
        int i = 2 % 2;
        int i2 = write + 93;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj4 = this.serializer;
        if (i4 == 0) {
            boolean z = this.RemoteActionCompatParcelizer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (z) {
                ArrayList arrayList = ((transactionWithWrapper) obj4).IconCompatParcelizer;
                List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(arrayList);
                arrayList.clear();
                if (!listPlaybackStateCompat.isEmpty()) {
                    Iterator it = listPlaybackStateCompat.iterator();
                    while (it.hasNext()) {
                        int i5 = write + 9;
                        read = i5 % Fields.SpotShadowColor;
                        if (i5 % 2 != 0) {
                            Perseus.execute((PerseusEvent) it.next());
                            throw null;
                        }
                        Perseus.execute((PerseusEvent) it.next());
                    }
                    Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                    forest.RemoteActionCompatParcelizer("PerseusEventBuffer");
                    forest.IconCompatParcelizer(d$$ExternalSyntheticOutline0.m(listPlaybackStateCompat.size(), "Event buffer has successfully sent ", " pre initialization events to perseus."), new Object[0]);
                    forest.RemoteActionCompatParcelizer("PerseusEventBuffer");
                    forest.read(new accessstartTrackingTable(listPlaybackStateCompat));
                }
            } else {
                int i6 = read + 83;
                write = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
            return createfromparcel;
        }
        if (i4 == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            drawOutlinewDX37Ww.RemoteActionCompatParcelizer((Context) obj4, getData.class, this.RemoteActionCompatParcelizer);
            return createfromparcel;
        }
        if (i4 == 2) {
            boolean z2 = this.RemoteActionCompatParcelizer;
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            CallTracer callTracer = (CallTracer) obj4;
            r8lambdaeEn0GUG5cGviZ6WG1OS4uJPKt0 r8lambdaeen0gug5cgviz6wg1os4ujpkt0 = (r8lambdaeEn0GUG5cGviZ6WG1OS4uJPKt0) callTracer.serializer;
            if (z2) {
                int i8 = write + 17;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                r8lambdaFqEZAUBkFnfJgz2iX0ulE6_FGM r8lambdafqezaubkfnfjgz2ix0ule6_fgm = r8lambdaFqEZAUBkFnfJgz2iX0ulE6_FGM.NAVIGATION;
                String strIconCompatParcelizer = ((setTransactionSuccessful) callTracer.write).IconCompatParcelizer(R.string.turn_by_turn_settings_new_tag);
                r8lambdafqezaubkfnfjgz2ix0ule6_fgm.getClass();
                MutableStateFlow mutableStateFlow = r8lambdaeen0gug5cgviz6wg1os4ujpkt0.RemoteActionCompatParcelizer;
                do {
                    obj3 = mutableStateFlow.read();
                } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj3, onMove.serializer((Map) obj3, new onViewAttachedToWindowlambda0(r8lambdafqezaubkfnfjgz2ix0ule6_fgm, strIconCompatParcelizer))));
            } else {
                r8lambdaFqEZAUBkFnfJgz2iX0ulE6_FGM r8lambdafqezaubkfnfjgz2ix0ule6_fgm2 = r8lambdaFqEZAUBkFnfJgz2iX0ulE6_FGM.NAVIGATION;
                r8lambdafqezaubkfnfjgz2ix0ule6_fgm2.getClass();
                MutableStateFlow mutableStateFlow2 = r8lambdaeen0gug5cgviz6wg1os4ujpkt0.RemoteActionCompatParcelizer;
                do {
                    obj2 = mutableStateFlow2.read();
                    Map map = (Map) obj2;
                    map.getClass();
                    linkedHashMap = new LinkedHashMap(map);
                    linkedHashMap.remove(r8lambdafqezaubkfnfjgz2ix0ule6_fgm2);
                } while (!mutableStateFlow2.RemoteActionCompatParcelizer(obj2, onMove.read(linkedHashMap)));
            }
            return createfromparcel;
        }
        if (i4 == 3) {
            boolean z3 = this.RemoteActionCompatParcelizer;
            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (z3) {
                int i10 = write + 111;
                read = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    getMenu.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(((AppCompatActivity) ((VerificationStatusLifecycleObserverImpl) obj4).write).getSupportFragmentManager(), "com.roadrunner.delivery.pickupdropoff.blockingui.presentation.dialog.TimeChangedBlockingDialogFragment");
                    throw null;
                }
                getMenu.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(((AppCompatActivity) ((VerificationStatusLifecycleObserverImpl) obj4).write).getSupportFragmentManager(), "com.roadrunner.delivery.pickupdropoff.blockingui.presentation.dialog.TimeChangedBlockingDialogFragment");
            }
            return createfromparcel;
        }
        if (i4 == 4) {
            boolean z4 = this.RemoteActionCompatParcelizer;
            CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ((performStart) obj4).write.IconCompatParcelizer(Boolean.valueOf(z4));
            return createfromparcel;
        }
        if (i4 != 5) {
            CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ((PopulateViewStructure_androidKtpopulate7) obj4).setValue(Boolean.valueOf(this.RemoteActionCompatParcelizer));
            return createfromparcel;
        }
        boolean z5 = this.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (z5) {
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("LocationServiceLifecycleObserver Stopping Location Service when app is in background", new Object[0]);
            ((ColumnAdapter) obj4).write.RemoteActionCompatParcelizer();
        }
        return createfromparcel;
    }
}
