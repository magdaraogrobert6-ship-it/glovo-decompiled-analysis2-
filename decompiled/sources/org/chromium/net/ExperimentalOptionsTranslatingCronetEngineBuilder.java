package org.chromium.net;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ExperimentalOptionsTranslatingCronetEngineBuilder extends ICronetEngineBuilder {
    public static final Set SUPPORTED_OPTIONS = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 3)));
    public final ICronetEngineBuilder mDelegate;
    public final ArrayList mExperimentalOptionsPatches = new ArrayList();
    public JSONObject mParsedExperimentalOptions;

    @Override // org.chromium.net.ICronetEngineBuilder
    public final Set getSupportedConfigOptions() {
        return SUPPORTED_OPTIONS;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z, Date date) {
        this.mDelegate.addPublicKeyPins(str, set, z, date);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder addQuicHint(String str, int i, int i2) {
        this.mDelegate.addQuicHint(str, i, i2);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ExperimentalCronetEngine build() {
        JSONObject jSONObject = this.mParsedExperimentalOptions;
        ArrayList arrayList = this.mExperimentalOptionsPatches;
        ICronetEngineBuilder iCronetEngineBuilder = this.mDelegate;
        if (jSONObject == null && arrayList.isEmpty()) {
            return iCronetEngineBuilder.build();
        }
        if (this.mParsedExperimentalOptions == null) {
            this.mParsedExperimentalOptions = new JSONObject();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((ExperimentalOptionsTranslatingCronetEngineBuilder$$ExternalSyntheticLambda0) it.next()).applyTo(this.mParsedExperimentalOptions);
            } catch (JSONException e) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Unable to apply JSON patch!", e);
                return null;
            }
        }
        iCronetEngineBuilder.setExperimentalOptions(this.mParsedExperimentalOptions.toString());
        return iCronetEngineBuilder.build();
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableBrotli(boolean z) {
        this.mDelegate.enableBrotli(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableHttp2(boolean z) {
        this.mDelegate.enableHttp2(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableHttpCache(int i, long j) {
        this.mDelegate.enableHttpCache(i, j);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        this.mDelegate.enableNetworkQualityEstimator(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.mDelegate.enablePublicKeyPinningBypassForLocalTrustAnchors(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableQuic(boolean z) {
        this.mDelegate.enableQuic(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableSdch(boolean z) {
        this.mDelegate.enableSdch(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final String getDefaultUserAgent() {
        return this.mDelegate.getDefaultUserAgent();
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setConnectionMigrationOptions(ConnectionMigrationOptions connectionMigrationOptions) {
        ICronetEngineBuilder iCronetEngineBuilder = this.mDelegate;
        if (iCronetEngineBuilder.getSupportedConfigOptions().contains(1)) {
            iCronetEngineBuilder.setConnectionMigrationOptions(connectionMigrationOptions);
            return this;
        }
        this.mExperimentalOptionsPatches.add(new ExperimentalOptionsTranslatingCronetEngineBuilder$$ExternalSyntheticLambda0(1, connectionMigrationOptions));
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setDnsOptions(DnsOptions dnsOptions) {
        ICronetEngineBuilder iCronetEngineBuilder = this.mDelegate;
        if (iCronetEngineBuilder.getSupportedConfigOptions().contains(2)) {
            iCronetEngineBuilder.setDnsOptions(dnsOptions);
            return this;
        }
        this.mExperimentalOptionsPatches.add(new ExperimentalOptionsTranslatingCronetEngineBuilder$$ExternalSyntheticLambda0(0, dnsOptions));
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setExperimentalOptions(String str) {
        if (str == null || str.isEmpty()) {
            this.mParsedExperimentalOptions = null;
            return this;
        }
        try {
            this.mParsedExperimentalOptions = new JSONObject(str);
            return this;
        } catch (JSONException e) {
            throw new IllegalArgumentException("Experimental options parsing failed", e);
        }
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        this.mDelegate.setLibraryLoader(libraryLoader);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setQuicOptions(QuicOptions quicOptions) {
        ICronetEngineBuilder iCronetEngineBuilder = this.mDelegate;
        if (iCronetEngineBuilder.getSupportedConfigOptions().contains(3)) {
            iCronetEngineBuilder.setQuicOptions(quicOptions);
            return this;
        }
        this.mExperimentalOptionsPatches.add(new ExperimentalOptionsTranslatingCronetEngineBuilder$$ExternalSyntheticLambda0(2, quicOptions));
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setStoragePath(String str) {
        this.mDelegate.setStoragePath(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setThreadPriority(int i) {
        this.mDelegate.setThreadPriority(i);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setUserAgent(String str) {
        this.mDelegate.setUserAgent(str);
        return this;
    }

    public ExperimentalOptionsTranslatingCronetEngineBuilder(ICronetEngineBuilder iCronetEngineBuilder) {
        this.mDelegate = iCronetEngineBuilder;
    }

    public static JSONObject createDefaultIfAbsent(String str, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalArgumentException(ff$$ExternalSyntheticOutline0.m("Failed adding a default object for key [", str, "]"), e);
        }
    }
}
