package app.cash.sqldelight.db;

import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getCieXyz;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public interface QueryResult<T> {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: loaded from: classes4.dex */
    @r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
    public static final class AsyncValue<T> implements QueryResult<T> {
        private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getter;

        /* JADX INFO: renamed from: await-impl, reason: not valid java name */
        public static Object m3954awaitimpl(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ShortNewsContentCardView<? super T> shortNewsContentCardView) {
            return r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(shortNewsContentCardView);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static <T> r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM m3956constructorimpl(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            return r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m3958equalsimpl0(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2}, iWrite3)).booleanValue();
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m3960hashCodeimpl(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            return r8lambdaunavo3sxub_pc9xroryotnrlvsm.hashCode();
        }

        @Override // app.cash.sqldelight.db.QueryResult
        public T getValue() {
            return (T) DefaultImpls.getValue(this);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM m3962unboximpl() {
            return this.getter;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ AsyncValue m3955boximpl(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            return new AsyncValue(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }

        @Override // app.cash.sqldelight.db.QueryResult
        public Object await(ShortNewsContentCardView<? super T> shortNewsContentCardView) {
            return m3954awaitimpl(this.getter, shortNewsContentCardView);
        }

        public boolean equals(Object obj) {
            return m3957equalsimpl(this.getter, obj);
        }

        public int hashCode() {
            return m3960hashCodeimpl(this.getter);
        }

        public String toString() {
            return m3961toStringimpl(this.getter);
        }

        private /* synthetic */ AsyncValue(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            this.getter = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        }

        /* JADX INFO: renamed from: getValue-impl, reason: not valid java name */
        public static T m3959getValueimpl(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            return (T) m3955boximpl(r8lambdaunavo3sxub_pc9xroryotnrlvsm).getValue();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m3961toStringimpl(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            return "AsyncValue(getter=" + r8lambdaunavo3sxub_pc9xroryotnrlvsm + ')';
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m3957equalsimpl(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Object obj) {
            if (!(obj instanceof AsyncValue)) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r8lambdaunavo3sxub_pc9xroryotnrlvsm, ((AsyncValue) obj).m3962unboximpl()}, getCieXyz.write())).booleanValue();
        }
    }

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Object Unit = Value.m3966constructorimpl(createFromParcel.INSTANCE);

        private Companion() {
        }

        /* JADX INFO: renamed from: getUnit-mlR-ZEE, reason: not valid java name */
        public final Object m3963getUnitmlRZEE() {
            return Unit;
        }
    }

    @r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
    public static final class Value<T> implements QueryResult<T> {
        private final T value;

        /* JADX INFO: renamed from: await-impl, reason: not valid java name */
        public static Object m3964awaitimpl(Object obj, ShortNewsContentCardView<? super T> shortNewsContentCardView) {
            return obj;
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static <T> Object m3966constructorimpl(T t) {
            return t;
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m3968equalsimpl0(Object obj, Object obj2) {
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{obj, obj2}, iWrite3)).booleanValue();
        }

        @Override // app.cash.sqldelight.db.QueryResult
        public T getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ Object m3971unboximpl() {
            return this.value;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Value m3965boximpl(Object obj) {
            return new Value(obj);
        }

        @Override // app.cash.sqldelight.db.QueryResult
        public Object await(ShortNewsContentCardView<? super T> shortNewsContentCardView) {
            return m3964awaitimpl(this.value, shortNewsContentCardView);
        }

        public boolean equals(Object obj) {
            return m3967equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m3969hashCodeimpl(this.value);
        }

        public String toString() {
            return m3970toStringimpl(this.value);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private /* synthetic */ Value(Object obj) {
            this.value = obj;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m3969hashCodeimpl(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m3970toStringimpl(Object obj) {
            return "Value(value=" + obj + ')';
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m3967equalsimpl(Object obj, Object obj2) {
            if (!(obj2 instanceof Value)) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, ((Value) obj2).m3971unboximpl()}, getCieXyz.write())).booleanValue();
        }
    }

    Object await(ShortNewsContentCardView<? super T> shortNewsContentCardView);

    T getValue();

    /* JADX INFO: loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static <T> T getValue(QueryResult<T> queryResult) {
            throw new IllegalStateException("The driver used with SQLDelight is asynchronous, so SQLDelight should be configured for\nasynchronous usage:\n\nsqldelight {\n  databases {\n    MyDatabase {\n      generateAsync = true\n    }\n  }\n}");
        }
    }
}
