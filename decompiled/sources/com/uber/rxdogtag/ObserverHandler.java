package com.uber.rxdogtag;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;

/* JADX INFO: loaded from: classes4.dex */
public interface ObserverHandler {
    default CompletableObserver handle(Completable completable, CompletableObserver completableObserver) {
        return completableObserver;
    }

    default MaybeObserver handle(Maybe maybe, MaybeObserver maybeObserver) {
        return maybeObserver;
    }

    default Observer handle(Observable observable, Observer observer) {
        return observer;
    }

    default SingleObserver handle(Single single, SingleObserver singleObserver) {
        return singleObserver;
    }

    default FwFClientaddFeatureKeysfeaturesUpdated1 handle(Flowable flowable, FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        return fwFClientaddFeatureKeysfeaturesUpdated1;
    }
}
