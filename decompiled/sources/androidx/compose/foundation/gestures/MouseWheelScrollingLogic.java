package androidx.compose.foundation.gestures;

import android.view.ViewConfiguration;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import androidx.lifecycle.BlockRunner$cancel$1;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.util.ContextsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.sequences.SequenceBuilderIterator;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.BufferedChannel;
import o.BaseTextPreparedSelection;
import o.HandlePopup;
import o.IInAppMessageViewWrapper;
import o.SelectionHandleIcon;
import o.ShortNewsContentCardView;
import o.SimpleLayoutKtSimpleLayout11;
import o.TextFieldSelectionManagermaybeSuggestSelection1;
import o.TextFieldSizeElement;
import o.autoInvalidateUpdatedNode;
import o.cancelPendingWebViewPauselambda0;
import o.createFromParcel;
import o.createHandleImage;
import o.createInAppMessageEventSubscriber;
import o.getAdjustedCoordinatesk4lQ0M;
import o.getKey;
import o.onContentCardDismissed;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.resolveUnregisterDisplayedMessagelambda0;

/* JADX INFO: loaded from: classes.dex */
public final class MouseWheelScrollingLogic extends NonTouchScrollingLogic {
    public final getKey IconCompatParcelizer;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU RemoteActionCompatParcelizer;
    public final BufferedChannel read;

    public final boolean read(PointerEvent pointerEvent) {
        getKey getkey = this.IconCompatParcelizer;
        ViewConfiguration viewConfiguration = getkey.write;
        float f = -viewConfiguration.getScaledVerticalScrollFactor();
        float f2 = -viewConfiguration.getScaledHorizontalScrollFactor();
        List<PointerInputChange> changes = pointerEvent.getChanges();
        Offset offsetM466boximpl = Offset.m466boximpl(Offset.Companion.m493getZeroF1C5BW0());
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            offsetM466boximpl = Offset.m466boximpl(Offset.m482plusMKHz9U(offsetM466boximpl.m487unboximpl(), changes.get(i).m2073getScrollDeltaF1C5BW0()));
        }
        long jM487unboximpl = offsetM466boximpl.m487unboximpl();
        long jM469constructorimpl = Offset.m469constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM487unboximpl & 4294967295L)) * f)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM487unboximpl >> 32)) * f2)) << 32));
        ScrollingLogic scrollingLogic = this.MediaMetadataCompat;
        float fM60toSingleAxisDeltaFromAnglek4lQ0M = scrollingLogic.m60toSingleAxisDeltaFromAnglek4lQ0M(scrollingLogic.write(jM469constructorimpl));
        if (fM60toSingleAxisDeltaFromAnglek4lQ0M != 0.0f) {
            getAdjustedCoordinatesk4lQ0M getadjustedcoordinatesk4lq0m = scrollingLogic.ParcelableVolumeInfo;
            if (fM60toSingleAxisDeltaFromAnglek4lQ0M > 0.0f ? getadjustedcoordinatesk4lq0m.write() : getadjustedcoordinatesk4lq0m.RemoteActionCompatParcelizer()) {
                long uptimeMillis = ((PointerInputChange) onContentCardDismissed.read((List) pointerEvent.getChanges())).getUptimeMillis();
                getkey.getClass();
                return !(this.read.b_(new createHandleImage(jM469constructorimpl, uptimeMillis, false)) instanceof resolveUnregisterDisplayedMessagelambda0);
            }
        }
        return this.serializer;
    }

    public final float write(SimpleLayoutKtSimpleLayout11 simpleLayoutKtSimpleLayout11, float f) {
        ScrollingLogic scrollingLogic = this.MediaMetadataCompat;
        long jM59toOffsettuRUvjQ = scrollingLogic.m59toOffsettuRUvjQ(scrollingLogic.RemoteActionCompatParcelizer(f));
        int iM1938getUserInputWNlRxjI = NestedScrollSource.Companion.m1938getUserInputWNlRxjI();
        ScrollingLogic scrollingLogic2 = simpleLayoutKtSimpleLayout11.write;
        return scrollingLogic.m58toFloatk4lQ0M(scrollingLogic.write(scrollingLogic2.serializer(scrollingLogic2.RatingCompat, jM59toOffsettuRUvjQ, iM1938getUserInputWNlRxjI)));
    }

    public MouseWheelScrollingLogic(ScrollingLogic scrollingLogic, getKey getkey, autoInvalidateUpdatedNode autoinvalidateupdatednode, Density density) {
        super(scrollingLogic, autoinvalidateupdatednode, density);
        this.IconCompatParcelizer = getkey;
        this.read = SQLite.IconCompatParcelizer(Integer.MAX_VALUE, 6, (IInAppMessageViewWrapper) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static createHandleImage read(BufferedChannel bufferedChannel) {
        createHandleImage createhandleimage = null;
        SequenceBuilderIterator sequenceBuilderIterator = LazyKt__LazyJVMKt.read(new ForEachGestureKt.C00342(new TextFieldSelectionManagermaybeSuggestSelection1(bufferedChannel, 1), 0 == true ? 1 : 0, 1));
        while (sequenceBuilderIterator.hasNext()) {
            createHandleImage createhandleimageRemoteActionCompatParcelizer = (createHandleImage) sequenceBuilderIterator.next();
            if (createhandleimage != null) {
                createhandleimageRemoteActionCompatParcelizer = createhandleimage.RemoteActionCompatParcelizer(createhandleimageRemoteActionCompatParcelizer);
            }
            createhandleimage = createhandleimageRemoteActionCompatParcelizer;
        }
        return createhandleimage;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static final Object access$dispatchMouseWheelScroll$waitNextScrollDelta(MouseWheelScrollingLogic mouseWheelScrollingLogic, createInAppMessageEventSubscriber createinappmessageeventsubscriber, cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda0, ScrollingLogic scrollingLogic, createInAppMessageEventSubscriber createinappmessageeventsubscriber2, long j, ContinuationImpl continuationImpl) {
        HandlePopup handlePopup;
        ScrollingLogic scrollingLogic2;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber3;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber4;
        cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda1;
        boolean z;
        MouseWheelScrollingLogic mouseWheelScrollingLogic2 = mouseWheelScrollingLogic;
        if (continuationImpl instanceof HandlePopup) {
            handlePopup = (HandlePopup) continuationImpl;
            int i = handlePopup.MediaBrowserCompatMediaItem;
            if ((i & Integer.MIN_VALUE) != 0) {
                handlePopup.MediaBrowserCompatMediaItem = i - Integer.MIN_VALUE;
            } else {
                handlePopup = new HandlePopup(continuationImpl);
            }
        } else {
            handlePopup = new HandlePopup(continuationImpl);
        }
        Object objWithTimeoutOrNull = handlePopup.MediaSessionCompatQueueItem;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = handlePopup.MediaBrowserCompatMediaItem;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objWithTimeoutOrNull);
            if (j < 0) {
                return Boolean.FALSE;
            }
            BlockRunner$cancel$1 blockRunner$cancel$1 = new BlockRunner$cancel$1(mouseWheelScrollingLogic, shortNewsContentCardView, 6);
            handlePopup.read = mouseWheelScrollingLogic2;
            handlePopup.write = createinappmessageeventsubscriber;
            handlePopup.IconCompatParcelizer = cancelpendingwebviewpauselambda0;
            scrollingLogic2 = scrollingLogic;
            handlePopup.RemoteActionCompatParcelizer = scrollingLogic2;
            createinappmessageeventsubscriber3 = createinappmessageeventsubscriber2;
            handlePopup.serializer = createinappmessageeventsubscriber3;
            handlePopup.MediaBrowserCompatMediaItem = 1;
            objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(j, blockRunner$cancel$1, handlePopup);
            if (objWithTimeoutOrNull == coroutineSingletons) {
                return coroutineSingletons;
            }
            createinappmessageeventsubscriber4 = createinappmessageeventsubscriber;
            cancelpendingwebviewpauselambda1 = cancelpendingwebviewpauselambda0;
        } else if (i2 == 1) {
            createInAppMessageEventSubscriber createinappmessageeventsubscriber5 = handlePopup.serializer;
            ScrollingLogic scrollingLogic3 = handlePopup.RemoteActionCompatParcelizer;
            cancelpendingwebviewpauselambda1 = handlePopup.IconCompatParcelizer;
            createinappmessageeventsubscriber4 = handlePopup.write;
            MouseWheelScrollingLogic mouseWheelScrollingLogic3 = handlePopup.read;
            ExtrasKt.RemoteActionCompatParcelizer(objWithTimeoutOrNull);
            createinappmessageeventsubscriber3 = createinappmessageeventsubscriber5;
            scrollingLogic2 = scrollingLogic3;
            mouseWheelScrollingLogic2 = mouseWheelScrollingLogic3;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        createHandleImage createhandleimage = (createHandleImage) objWithTimeoutOrNull;
        if (createhandleimage != null) {
            boolean z2 = ((createHandleImage) createinappmessageeventsubscriber4.IconCompatParcelizer).read;
            long j2 = createhandleimage.serializer;
            createinappmessageeventsubscriber4.IconCompatParcelizer = new createHandleImage(j2, createhandleimage.IconCompatParcelizer, z2);
            cancelpendingwebviewpauselambda1.write = scrollingLogic2.m60toSingleAxisDeltaFromAnglek4lQ0M(scrollingLogic2.write(j2));
            createinappmessageeventsubscriber3.IconCompatParcelizer = ContextsKt.RemoteActionCompatParcelizer(0.0f, 0.0f, 30);
            TextFieldSizeElement textFieldSizeElement = mouseWheelScrollingLogic2.MediaDescriptionCompat;
            long j3 = createhandleimage.IconCompatParcelizer;
            long j4 = createhandleimage.serializer;
            textFieldSizeElement.read.addDataPoint(j3, Float.intBitsToFloat((int) (j4 >> 32)));
            textFieldSizeElement.IconCompatParcelizer.addDataPoint(j3, Float.intBitsToFloat((int) (j4 & 4294967295L)));
            z = !MouseWheelScrollingLogicKt.write(cancelpendingwebviewpauselambda1.write);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    public static final Object access$dispatchMouseWheelScroll(MouseWheelScrollingLogic mouseWheelScrollingLogic, ScrollingLogic scrollingLogic, createHandleImage createhandleimage, float f, float f2, ContinuationImpl continuationImpl) {
        BaseTextPreparedSelection baseTextPreparedSelection;
        float f3;
        cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda0;
        TextFieldSizeElement textFieldSizeElement;
        long jVelocity;
        ScrollingLogic scrollingLogic2 = scrollingLogic;
        mouseWheelScrollingLogic.getClass();
        TextFieldSizeElement textFieldSizeElement2 = mouseWheelScrollingLogic.MediaDescriptionCompat;
        if (continuationImpl instanceof BaseTextPreparedSelection) {
            baseTextPreparedSelection = (BaseTextPreparedSelection) continuationImpl;
            int i = baseTextPreparedSelection.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                baseTextPreparedSelection.write = i - Integer.MIN_VALUE;
            } else {
                baseTextPreparedSelection = new BaseTextPreparedSelection(mouseWheelScrollingLogic, continuationImpl);
            }
        } else {
            baseTextPreparedSelection = new BaseTextPreparedSelection(mouseWheelScrollingLogic, continuationImpl);
        }
        BaseTextPreparedSelection baseTextPreparedSelection2 = baseTextPreparedSelection;
        Object obj = baseTextPreparedSelection2.RemoteActionCompatParcelizer;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = baseTextPreparedSelection2.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i2 == 0) {
            createInAppMessageEventSubscriber createinappmessageeventsubscriberM3979m = c8$$ExternalSyntheticOutline0.m3979m(obj);
            createinappmessageeventsubscriberM3979m.IconCompatParcelizer = createhandleimage;
            long j = createhandleimage.IconCompatParcelizer;
            long j2 = createhandleimage.serializer;
            textFieldSizeElement2.read.addDataPoint(j, Float.intBitsToFloat((int) (j2 >> 32)));
            textFieldSizeElement2.IconCompatParcelizer.addDataPoint(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
            createHandleImage createhandleimage2 = read(mouseWheelScrollingLogic.read);
            if (createhandleimage2 != null) {
                long j3 = createhandleimage2.IconCompatParcelizer;
                long j4 = createhandleimage2.serializer;
                textFieldSizeElement2.read.addDataPoint(j3, Float.intBitsToFloat((int) (j4 >> 32)));
                textFieldSizeElement2.IconCompatParcelizer.addDataPoint(j3, Float.intBitsToFloat((int) (j4 & 4294967295L)));
                createinappmessageeventsubscriberM3979m.IconCompatParcelizer = ((createHandleImage) createinappmessageeventsubscriberM3979m.IconCompatParcelizer).RemoteActionCompatParcelizer(createhandleimage2);
            }
            cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda1 = new cancelPendingWebViewPauselambda0(0);
            float fM58toFloatk4lQ0M = scrollingLogic2.m58toFloatk4lQ0M(scrollingLogic2.write(((createHandleImage) createinappmessageeventsubscriberM3979m.IconCompatParcelizer).serializer));
            cancelpendingwebviewpauselambda1.write = fM58toFloatk4lQ0M;
            if (MouseWheelScrollingLogicKt.write(fM58toFloatk4lQ0M)) {
                return createfromparcel;
            }
            createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
            createinappmessageeventsubscriber.IconCompatParcelizer = ContextsKt.RemoteActionCompatParcelizer(0.0f, 0.0f, 30);
            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(cancelpendingwebviewpauselambda1, createinappmessageeventsubscriber, createinappmessageeventsubscriberM3979m, f, mouseWheelScrollingLogic, f2, scrollingLogic, null);
            baseTextPreparedSelection2.IconCompatParcelizer = scrollingLogic2;
            baseTextPreparedSelection2.serializer = cancelpendingwebviewpauselambda1;
            f3 = f2;
            baseTextPreparedSelection2.read = f3;
            baseTextPreparedSelection2.write = 1;
            if (mouseWheelScrollingLogic.userScroll$foundation(mouseWheelScrollingLogic$dispatchMouseWheelScroll$3, baseTextPreparedSelection2) != obj2) {
                cancelpendingwebviewpauselambda0 = cancelpendingwebviewpauselambda1;
                textFieldSizeElement = textFieldSizeElement2;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        f3 = baseTextPreparedSelection2.read;
        cancelpendingwebviewpauselambda0 = baseTextPreparedSelection2.serializer;
        ScrollingLogic scrollingLogic3 = baseTextPreparedSelection2.IconCompatParcelizer;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        scrollingLogic2 = scrollingLogic3;
        textFieldSizeElement = textFieldSizeElement2;
        long jVelocity2 = VelocityKt.Velocity(textFieldSizeElement.read.calculateVelocity(Float.MAX_VALUE), textFieldSizeElement.IconCompatParcelizer.calculateVelocity(Float.MAX_VALUE));
        Velocity.Companion companion = Velocity.Companion;
        if (Velocity.m3910equalsimpl0(jVelocity2, companion.m3922getZero9UxMQ8M())) {
            float fRemoteActionCompatParcelizer = scrollingLogic2.RemoteActionCompatParcelizer(Math.signum(cancelpendingwebviewpauselambda0.write)) * Math.min(Math.abs(cancelpendingwebviewpauselambda0.write) / 100.0f, f3) * 1000.0f;
            if (fRemoteActionCompatParcelizer == 0.0f) {
                jVelocity = companion.m3922getZero9UxMQ8M();
            } else if (scrollingLogic2.MediaBrowserCompatMediaItem == SelectionHandleIcon.Horizontal) {
                jVelocity = VelocityKt.Velocity(fRemoteActionCompatParcelizer, 0.0f);
            } else {
                jVelocity = VelocityKt.Velocity(0.0f, fRemoteActionCompatParcelizer);
            }
            jVelocity2 = jVelocity;
        }
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = mouseWheelScrollingLogic.MediaBrowserCompatMediaItem;
        Velocity velocityM3902boximpl = Velocity.m3902boximpl(jVelocity2);
        baseTextPreparedSelection2.IconCompatParcelizer = null;
        baseTextPreparedSelection2.serializer = null;
        baseTextPreparedSelection2.write = 2;
        return r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(velocityM3902boximpl, baseTextPreparedSelection2) == obj2 ? obj2 : createfromparcel;
    }
}
