package fwfd.com.fwfsdk.model.api;

import fwfd.com.fwfsdk.util.FWFSubscribeObserverCallback;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class FWFSubscribeObservable {
    private List<FWFSubscribeResultObserver> observers = new ArrayList();

    public static class FWFSubscribeResultObserver {
        private FWFSubscribeObserverCallback callback;
        private String environmentToken;

        public FWFSubscribeObserverCallback getCallback() {
            return this.callback;
        }

        public String getEnvironmentToken() {
            return this.environmentToken;
        }

        public FWFSubscribeResultObserver(FWFSubscribeObserverCallback fWFSubscribeObserverCallback, String str) {
            this.callback = fWFSubscribeObserverCallback;
            this.environmentToken = str;
        }
    }

    public void addObserver(FWFSubscribeResultObserver fWFSubscribeResultObserver) {
        this.observers.add(fWFSubscribeResultObserver);
    }

    public void notify(String str, FWFSubscribeResult fWFSubscribeResult) {
        for (FWFSubscribeResultObserver fWFSubscribeResultObserver : this.observers) {
            if (fWFSubscribeResultObserver.getEnvironmentToken() == null) {
                fWFSubscribeResultObserver.getCallback().onFwfResponse(fWFSubscribeResult);
            } else if (fWFSubscribeResultObserver.getEnvironmentToken().equals(str)) {
                fWFSubscribeResultObserver.getCallback().onFwfResponse(fWFSubscribeResult);
            }
        }
    }
}
