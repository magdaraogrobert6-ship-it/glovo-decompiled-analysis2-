package io.reactivex.internal.functions;

import androidx.compose.ui.node.LayoutNode$$ExternalSyntheticLambda1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Functions {
    public static final Function IconCompatParcelizer = new Identity();
    public static final Runnable write = new EmptyRunnable();
    public static final Action read = new EmptyAction();
    public static final Consumer serializer = new EmptyConsumer();
    public static final Consumer RemoteActionCompatParcelizer = new OnErrorMissingConsumer();

    public static final class Array2Func<T1, T2, R> implements Function<Object[], R> {
        public final BiFunction serializer;

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write(objArr.length, "Array of size 2 expected but got ");
                return null;
            }
            return this.serializer.apply(objArr[0], objArr[1]);
        }

        public Array2Func(BiFunction biFunction) {
            this.serializer = biFunction;
        }
    }

    public static final class EmptyAction implements Action {
        @Override // io.reactivex.functions.Action
        public final void run() {
        }

        public final String toString() {
            return "EmptyAction";
        }
    }

    public static final class EmptyConsumer implements Consumer<Object> {
        @Override // io.reactivex.functions.Consumer
        public final void accept(Object obj) {
        }

        public final String toString() {
            return "EmptyConsumer";
        }
    }

    public static final class EmptyRunnable implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
        }

        public final String toString() {
            return "EmptyRunnable";
        }
    }

    public static final class Identity implements Function<Object, Object> {
        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            return obj;
        }

        public final String toString() {
            return "IdentityFunction";
        }
    }

    public static final class ListSorter<T> implements Function<List<T>, List<T>> {
        public final LayoutNode$$ExternalSyntheticLambda1 IconCompatParcelizer;

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            List list = (List) obj;
            Collections.sort(list, this.IconCompatParcelizer);
            return list;
        }

        public ListSorter(LayoutNode$$ExternalSyntheticLambda1 layoutNode$$ExternalSyntheticLambda1) {
            this.IconCompatParcelizer = layoutNode$$ExternalSyntheticLambda1;
        }
    }

    public static final class EqualsPredicate<T> implements Predicate<T> {
        public final String serializer;

        public EqualsPredicate(String str) {
            this.serializer = str;
        }

        @Override // io.reactivex.functions.Predicate
        public final boolean read(Object obj) {
            String str = this.serializer;
            if (obj != str) {
                return obj != null && obj.equals(str);
            }
            return true;
        }
    }

    public static final class JustValue<T, U> implements Callable<U>, Function<T, U> {
        public final Object RemoteActionCompatParcelizer;

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            return this.RemoteActionCompatParcelizer;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            return this.RemoteActionCompatParcelizer;
        }

        public JustValue(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
        }
    }

    public static Function IconCompatParcelizer(LayoutNode$$ExternalSyntheticLambda1 layoutNode$$ExternalSyntheticLambda1) {
        return new ListSorter(layoutNode$$ExternalSyntheticLambda1);
    }

    public static Callable RemoteActionCompatParcelizer(Throwable th) {
        return new JustValue(th);
    }

    public static Function read(Object obj) {
        return new JustValue(obj);
    }

    public static Function serializer(BiFunction biFunction) {
        return new Array2Func(biFunction);
    }

    public static Predicate serializer(String str) {
        return new EqualsPredicate(str);
    }

    public static final class OnErrorMissingConsumer implements Consumer<Throwable> {
        @Override // io.reactivex.functions.Consumer
        public final void accept(Object obj) {
            RxJavaPlugins.IconCompatParcelizer(new OnErrorNotImplementedException((Throwable) obj));
        }
    }
}
