package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import o.ShortNewsContentCardView;

/* JADX INFO: loaded from: classes.dex */
public interface NestedScrollConnection {

    /* JADX INFO: loaded from: classes4.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* JADX INFO: renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
        public static Object m1915onPostFlingRZ2iAVY(NestedScrollConnection nestedScrollConnection, long j, long j2, ShortNewsContentCardView<? super Velocity> shortNewsContentCardView) {
            return NestedScrollConnection.super.mo54onPostFlingRZ2iAVY(j, j2, shortNewsContentCardView);
        }

        @Deprecated
        /* JADX INFO: renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
        public static long m1916onPostScrollDzOQY0M(NestedScrollConnection nestedScrollConnection, long j, long j2, int i) {
            return NestedScrollConnection.super.mo55onPostScrollDzOQY0M(j, j2, i);
        }

        @Deprecated
        /* JADX INFO: renamed from: onPreFling-QWom1Mo, reason: not valid java name */
        public static Object m1917onPreFlingQWom1Mo(NestedScrollConnection nestedScrollConnection, long j, ShortNewsContentCardView<? super Velocity> shortNewsContentCardView) {
            return NestedScrollConnection.super.mo123onPreFlingQWom1Mo(j, shortNewsContentCardView);
        }

        @Deprecated
        /* JADX INFO: renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
        public static long m1918onPreScrollOzD1aCk(NestedScrollConnection nestedScrollConnection, long j, int i) {
            return NestedScrollConnection.super.mo93onPreScrollOzD1aCk(j, i);
        }
    }

    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    default Object mo54onPostFlingRZ2iAVY(long j, long j2, ShortNewsContentCardView<? super Velocity> shortNewsContentCardView) {
        return m1913onPostFlingRZ2iAVY$suspendImpl(this, j, j2, shortNewsContentCardView);
    }

    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    default Object mo123onPreFlingQWom1Mo(long j, ShortNewsContentCardView<? super Velocity> shortNewsContentCardView) {
        return m1914onPreFlingQWom1Mo$suspendImpl(this, j, shortNewsContentCardView);
    }

    /* JADX INFO: renamed from: onPostFling-RZ2iAVY$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m1913onPostFlingRZ2iAVY$suspendImpl(NestedScrollConnection nestedScrollConnection, long j, long j2, ShortNewsContentCardView<? super Velocity> shortNewsContentCardView) {
        return Velocity.m3902boximpl(Velocity.Companion.m3922getZero9UxMQ8M());
    }

    /* JADX INFO: renamed from: onPreFling-QWom1Mo$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m1914onPreFlingQWom1Mo$suspendImpl(NestedScrollConnection nestedScrollConnection, long j, ShortNewsContentCardView<? super Velocity> shortNewsContentCardView) {
        return Velocity.m3902boximpl(Velocity.Companion.m3922getZero9UxMQ8M());
    }

    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    default long mo55onPostScrollDzOQY0M(long j, long j2, int i) {
        return Offset.Companion.m493getZeroF1C5BW0();
    }

    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    default long mo93onPreScrollOzD1aCk(long j, int i) {
        return Offset.Companion.m493getZeroF1C5BW0();
    }
}
