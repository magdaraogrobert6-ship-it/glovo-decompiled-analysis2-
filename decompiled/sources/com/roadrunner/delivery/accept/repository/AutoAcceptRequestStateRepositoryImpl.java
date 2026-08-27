package com.roadrunner.delivery.accept.repository;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.PlaceholderSpan_androidKt;
import o.SkewXSpan;
import o.getNoActiveChildannotations;
import o.getOffsetY;
import o.isRoot;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoAcceptRequestStateRepositoryImpl {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    private static int read = 1;
    private static int write;
    public final PlaceholderSpan_androidKt RemoteActionCompatParcelizer;
    public static final isRoot serializer = new isRoot("key_auto_accept_is_request_running");
    public static final isRoot IconCompatParcelizer = new isRoot("key_auto_accept_last_request_time");

    public AutoAcceptRequestStateRepositoryImpl(PlaceholderSpan_androidKt placeholderSpan_androidKt) {
        this.RemoteActionCompatParcelizer = placeholderSpan_androidKt;
    }

    static {
        int i = read + 9;
        write = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    public final Object getIsRequestRunning(ContinuationImpl continuationImpl) {
        getOffsetY getoffsety;
        int i = 2 % 2;
        int i2 = RatingCompat + 23;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof getOffsetY) {
            getoffsety = (getOffsetY) continuationImpl;
            int i4 = getoffsety.read;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = RatingCompat + 13;
                MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                getoffsety.read = i4 - Integer.MIN_VALUE;
            } else {
                getoffsety = new getOffsetY(this, continuationImpl);
            }
        } else {
            getoffsety = new getOffsetY(this, continuationImpl);
        }
        Object objFirst = getoffsety.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = getoffsety.read;
        if (i7 != 0) {
            int i8 = MediaBrowserCompatMediaItem + 87;
            RatingCompat = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objFirst);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objFirst);
            Flow flowSerializer = this.RemoteActionCompatParcelizer.read().serializer();
            getoffsety.read = 1;
            objFirst = FlowKt.first(flowSerializer, getoffsety);
            if (objFirst == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        Boolean bool = (Boolean) ((getNoActiveChildannotations) objFirst).serializer(serializer);
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    public final Object getLastRequestTime(ContinuationImpl continuationImpl) {
        SkewXSpan skewXSpan;
        int i = 2 % 2;
        Object obj = null;
        if (continuationImpl instanceof SkewXSpan) {
            int i2 = RatingCompat + 25;
            MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = ((SkewXSpan) continuationImpl).IconCompatParcelizer;
                throw null;
            }
            skewXSpan = (SkewXSpan) continuationImpl;
            int i4 = skewXSpan.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                skewXSpan.IconCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                skewXSpan = new SkewXSpan(this, continuationImpl);
            }
        } else {
            skewXSpan = new SkewXSpan(this, continuationImpl);
        }
        Object objFirst = skewXSpan.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = skewXSpan.IconCompatParcelizer;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objFirst);
            Flow flowSerializer = this.RemoteActionCompatParcelizer.read().serializer();
            skewXSpan.IconCompatParcelizer = 1;
            objFirst = FlowKt.first(flowSerializer, skewXSpan);
            if (objFirst == coroutineSingletons) {
                int i6 = MediaBrowserCompatMediaItem + 121;
                RatingCompat = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    return coroutineSingletons;
                }
                obj.hashCode();
                throw null;
            }
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objFirst);
        }
        Long l = (Long) ((getNoActiveChildannotations) objFirst).serializer(IconCompatParcelizer);
        if (l != null && l.longValue() == -1) {
            return null;
        }
        return l;
    }
}
