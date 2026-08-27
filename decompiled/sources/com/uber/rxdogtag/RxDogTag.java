package com.uber.rxdogtag;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.huawei.hms.android.SystemUtils;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.observers.LambdaConsumerIntrospection;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;

/* JADX INFO: loaded from: classes4.dex */
public final class RxDogTag {
    public static final String STACK_ELEMENT_SOURCE_DELEGATE = "[[ Originating callback: %s ]]";
    public static final String STACK_ELEMENT_SOURCE_HEADER = "[[ ↑↑ Inferred subscribe point ↑↑ ]]";
    public static final String STACK_ELEMENT_TRACE_HEADER = "[[ ↓↓ Original trace ↓↓ ]]";

    public static final class Builder {
        boolean guardObserverCallbacks = true;
        boolean disableAnnotations = false;
        List<ObserverHandler> observerHandlers = new ArrayList();
        Set<String> ignoredPackages = new LinkedHashSet();
        boolean repackageOnErrorNotImplementedExceptions = true;

        public Builder configureWith(Configurer configurer) {
            configurer.apply(this);
            return this;
        }

        public Builder disableAnnotations() {
            this.disableAnnotations = true;
            return this;
        }

        public Builder disableRepackagingOnErrorNotImplementedExceptions() {
            this.repackageOnErrorNotImplementedExceptions = false;
            return this;
        }

        public Builder guardObserverCallbacks(boolean z) {
            this.guardObserverCallbacks = z;
            return this;
        }

        public void install() {
            RxDogTag.installWithBuilder(new Configuration(this));
        }

        public Builder addIgnoredPackages(String... strArr) {
            return addIgnoredPackages(Arrays.asList(strArr));
        }

        public Builder addObserverHandlers(ObserverHandler... observerHandlerArr) {
            return addObserverHandlers(Arrays.asList(observerHandlerArr));
        }

        public Builder addIgnoredPackages(Collection<String> collection) {
            this.ignoredPackages.addAll(collection);
            return this;
        }

        public Builder addObserverHandlers(Collection<ObserverHandler> collection) {
            this.observerHandlers.addAll(collection);
            return this;
        }
    }

    public interface Configurer {
        void apply(Builder builder);
    }

    public interface NonCheckingConsumer<T> {
        void accept(T t);
    }

    public interface NonCheckingPredicate<T> {
        boolean test(T t);
    }

    public static class Configuration {
        final boolean disableAnnotations;
        final boolean guardObserverCallbacks;
        final Set<String> ignoredPackages;
        final List<ObserverHandler> observerHandlers;
        final boolean repackageOnErrorNotImplementedExceptions;
        private static final Collection<String> DEFAULT_IGNORED_PACKAGES = Arrays.asList(Observable.class.getPackage().getName(), DogTagObserver.class.getPackage().getName());
        private static final ObserverHandler DEFAULT_HANDLER = new ObserverHandler() { // from class: com.uber.rxdogtag.RxDogTag.Configuration.1
        };

        public Configuration(Builder builder) {
            this.disableAnnotations = builder.disableAnnotations;
            ArrayList arrayList = new ArrayList(builder.observerHandlers);
            arrayList.add(DEFAULT_HANDLER);
            LinkedHashSet linkedHashSet = new LinkedHashSet(builder.ignoredPackages);
            linkedHashSet.addAll(DEFAULT_IGNORED_PACKAGES);
            this.observerHandlers = Collections.unmodifiableList(arrayList);
            this.ignoredPackages = Collections.unmodifiableSet(linkedHashSet);
            this.repackageOnErrorNotImplementedExceptions = builder.repackageOnErrorNotImplementedExceptions;
            this.guardObserverCallbacks = builder.guardObserverCallbacks;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnErrorNotImplementedException createException(Configuration configuration, Throwable th, Throwable th2, String str) {
        OnErrorNotImplementedException onErrorNotImplementedException;
        StackTraceElement[] stackTraceElementArr;
        StackTraceElement stackTraceElementExtractStackElementTag = extractStackElementTag(th, configuration.ignoredPackages);
        if (configuration.repackageOnErrorNotImplementedExceptions && (th2 instanceof OnErrorNotImplementedException)) {
            th2 = th2.getCause();
        }
        if (th2 instanceof OnErrorNotImplementedException) {
            OnErrorNotImplementedException onErrorNotImplementedException2 = (OnErrorNotImplementedException) th2;
            onErrorNotImplementedException = onErrorNotImplementedException2;
            th2 = onErrorNotImplementedException2.getCause();
        } else {
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            onErrorNotImplementedException = new OnErrorNotImplementedException(message, th2);
            onErrorNotImplementedException.setStackTrace(new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = th2.getStackTrace();
        char c = 3;
        int i = str != null ? 4 : 3;
        if (configuration.disableAnnotations) {
            stackTraceElementArr = new StackTraceElement[stackTrace.length + 1];
            stackTraceElementArr[0] = stackTraceElementExtractStackElementTag;
            if (stackTrace.length != 0) {
                System.arraycopy(stackTrace, 0, stackTraceElementArr, 1, stackTrace.length);
            }
        } else {
            int iIndexOfLast = indexOfLast(stackTrace, new NonCheckingPredicate() { // from class: com.uber.rxdogtag.RxDogTag$$ExternalSyntheticLambda5
                @Override // com.uber.rxdogtag.RxDogTag.NonCheckingPredicate
                public final boolean test(Object obj) {
                    return RxDogTag.lambda$createException$6((StackTraceElement) obj);
                }
            });
            int i2 = iIndexOfLast != -1 ? iIndexOfLast + 1 : 0;
            StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[(stackTrace.length + i) - i2];
            stackTraceElementArr2[0] = stackTraceElementExtractStackElementTag;
            stackTraceElementArr2[1] = new StackTraceElement(STACK_ELEMENT_SOURCE_HEADER, "", "", 0);
            if (str != null) {
                Locale locale = Locale.US;
                stackTraceElementArr2[2] = new StackTraceElement(ff$$ExternalSyntheticOutline0.m("[[ Originating callback: ", str, " ]]"), "", "", 0);
            } else {
                c = 2;
            }
            stackTraceElementArr2[c] = new StackTraceElement(STACK_ELEMENT_TRACE_HEADER, "", "", 0);
            if (stackTrace.length != 0) {
                System.arraycopy(stackTrace, i2, stackTraceElementArr2, i, stackTrace.length - i2);
            }
            stackTraceElementArr = stackTraceElementArr2;
        }
        th2.setStackTrace(stackTraceElementArr);
        return onErrorNotImplementedException;
    }

    public static void install() {
        new Builder().install();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void installWithBuilder(Configuration configuration) {
        synchronized (RxDogTag.class) {
            RxJavaPlugins.RatingCompat = new RxDogTag$$ExternalSyntheticLambda0(configuration, 0);
            RxJavaPlugins.IconCompatParcelizer = new RxDogTag$$ExternalSyntheticLambda0(configuration, 1);
            RxJavaPlugins.MediaDescriptionCompat = new RxDogTag$$ExternalSyntheticLambda0(configuration, 2);
            RxJavaPlugins.MediaSessionCompatQueueItem = new RxDogTag$$ExternalSyntheticLambda0(configuration, 3);
            RxJavaPlugins.serializer = new RxDogTag$$ExternalSyntheticLambda0(configuration, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$createException$6(StackTraceElement stackTraceElement) {
        return STACK_ELEMENT_TRACE_HEADER.equals(stackTraceElement.getClassName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Observer lambda$installWithBuilder$0(Configuration configuration, Observable observable, Observer observer) throws Exception {
        Iterator<ObserverHandler> it = configuration.observerHandlers.iterator();
        while (it.hasNext()) {
            if (shouldDecorate(it.next().handle(observable, observer))) {
                return new DogTagObserver(configuration, observer);
            }
        }
        return observer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FwFClientaddFeatureKeysfeaturesUpdated1 lambda$installWithBuilder$1(Configuration configuration, Flowable flowable, FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) throws Exception {
        Iterator<ObserverHandler> it = configuration.observerHandlers.iterator();
        while (it.hasNext()) {
            if (shouldDecorate(it.next().handle(flowable, fwFClientaddFeatureKeysfeaturesUpdated1))) {
                return new DogTagSubscriber(configuration, fwFClientaddFeatureKeysfeaturesUpdated1);
            }
        }
        return fwFClientaddFeatureKeysfeaturesUpdated1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SingleObserver lambda$installWithBuilder$2(Configuration configuration, Single single, SingleObserver singleObserver) throws Exception {
        Iterator<ObserverHandler> it = configuration.observerHandlers.iterator();
        while (it.hasNext()) {
            if (shouldDecorate(it.next().handle(single, singleObserver))) {
                return new DogTagSingleObserver(configuration, singleObserver);
            }
        }
        return singleObserver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ MaybeObserver lambda$installWithBuilder$3(Configuration configuration, Maybe maybe, MaybeObserver maybeObserver) throws Exception {
        Iterator<ObserverHandler> it = configuration.observerHandlers.iterator();
        while (it.hasNext()) {
            if (shouldDecorate(it.next().handle(maybe, maybeObserver))) {
                return new DogTagMaybeObserver(configuration, maybeObserver);
            }
        }
        return maybeObserver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CompletableObserver lambda$installWithBuilder$4(Configuration configuration, Completable completable, CompletableObserver completableObserver) throws Exception {
        Iterator<ObserverHandler> it = configuration.observerHandlers.iterator();
        while (it.hasNext()) {
            if (shouldDecorate(it.next().handle(completable, completableObserver))) {
                return new DogTagCompletableObserver(configuration, completableObserver);
            }
        }
        return completableObserver;
    }

    public static void reset() {
        synchronized (RxDogTag.class) {
            RxJavaPlugins.IconCompatParcelizer = null;
            RxJavaPlugins.RatingCompat = null;
            RxJavaPlugins.MediaSessionCompatQueueItem = null;
            RxJavaPlugins.MediaDescriptionCompat = null;
            RxJavaPlugins.serializer = null;
        }
    }

    private static boolean containsAnyPackages(String str, Set<String> set) {
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    private static StackTraceElement extractStackElementTag(Throwable th, Set<String> set) {
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!containsAnyPackages(stackTraceElement.getClassName(), set)) {
                return stackTraceElement;
            }
        }
        return new StackTraceElement("Unknown", SystemUtils.UNKNOWN, SystemUtils.UNKNOWN, 0);
    }

    public static void guardedDelegateCall(final NonCheckingConsumer<Throwable> nonCheckingConsumer, Runnable runnable) {
        final Thread.UncaughtExceptionHandler uncaughtExceptionHandler = Thread.currentThread().getUncaughtExceptionHandler();
        try {
            Thread.currentThread().setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.uber.rxdogtag.RxDogTag$$ExternalSyntheticLambda6
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    RxDogTag.lambda$guardedDelegateCall$5(uncaughtExceptionHandler, nonCheckingConsumer, thread, th);
                }
            });
            runnable.run();
        } catch (OnErrorNotImplementedException e) {
            nonCheckingConsumer.accept(e.getCause());
        } catch (Throwable th) {
            nonCheckingConsumer.accept(th);
        } finally {
            Thread.currentThread().setUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$guardedDelegateCall$5(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, NonCheckingConsumer nonCheckingConsumer, Thread thread, Throwable th) {
        Thread.currentThread().setUncaughtExceptionHandler(uncaughtExceptionHandler);
        if (th instanceof OnErrorNotImplementedException) {
            nonCheckingConsumer.accept(th);
        } else if ((th instanceof NullPointerException) && "subscribeActual failed".equals(th.getMessage())) {
            nonCheckingConsumer.accept(th.getCause());
        } else {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    public static void reportError(Configuration configuration, Throwable th, Throwable th2, String str) {
        RxJavaPlugins.IconCompatParcelizer(createException(configuration, th, th2, str));
    }

    private RxDogTag() {
        throw new InstantiationError();
    }

    private static <T> int indexOfLast(T[] tArr, NonCheckingPredicate<T> nonCheckingPredicate) {
        for (int length = tArr.length - 1; length >= 0; length--) {
            if (nonCheckingPredicate.test(tArr[length])) {
                return length;
            }
        }
        return -1;
    }

    private static boolean shouldDecorate(Object obj) {
        if (obj instanceof RxDogTagErrorReceiver) {
            return true;
        }
        if (obj instanceof LambdaConsumerIntrospection) {
            return !((LambdaConsumerIntrospection) obj).hasCustomOnError();
        }
        return false;
    }
}
