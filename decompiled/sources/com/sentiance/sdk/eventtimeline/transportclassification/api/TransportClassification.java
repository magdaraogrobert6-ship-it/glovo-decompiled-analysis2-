package com.sentiance.sdk.eventtimeline.transportclassification.api;

import com.sentiance.sdk.DontObfuscate;
import java.util.HashMap;
import java.util.Map;
import o.runlambda0;

/* JADX INFO: loaded from: classes5.dex */
@runlambda0
@DontObfuscate
public class TransportClassification {
    private String mMode;
    private Map<String, Integer> mProbabilities;
    private long mTime;

    public String getMode() {
        return this.mMode;
    }

    public Map<String, Integer> getProbabilities() {
        return this.mProbabilities;
    }

    public long getTime() {
        return this.mTime;
    }

    public TransportClassification(long j, String str, Map<String, Integer> map) {
        this.mTime = j;
        this.mMode = str;
        this.mProbabilities = new HashMap(map);
    }
}
