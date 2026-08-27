package o;

import bo.app.af$$ExternalSyntheticOutline1;
import com.deliveryhero.fwf_http.ConstantKt;
import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.network.InstrURLConnectionBase;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class invalidateLayers extends HttpURLConnection {
    public final InstrURLConnectionBase write;

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        this.write.write.addRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public final void connect() throws IOException {
        this.write.IconCompatParcelizer();
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        InstrURLConnectionBase instrURLConnectionBase = this.write;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = instrURLConnectionBase.IconCompatParcelizer;
        networkRequestMetricBuilder.IconCompatParcelizer(instrURLConnectionBase.RatingCompat.read());
        networkRequestMetricBuilder.RemoteActionCompatParcelizer();
        instrURLConnectionBase.write.disconnect();
    }

    public final boolean equals(Object obj) {
        return this.write.write.equals(obj);
    }

    @Override // java.net.URLConnection
    public final boolean getAllowUserInteraction() {
        return this.write.write.getAllowUserInteraction();
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.write.write.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public final Object getContent() {
        return this.write.serializer();
    }

    @Override // java.net.URLConnection
    public final String getContentEncoding() {
        InstrURLConnectionBase instrURLConnectionBase = this.write;
        instrURLConnectionBase.MediaBrowserCompatMediaItem();
        return instrURLConnectionBase.write.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public final int getContentLength() {
        InstrURLConnectionBase instrURLConnectionBase = this.write;
        instrURLConnectionBase.MediaBrowserCompatMediaItem();
        return instrURLConnectionBase.write.getContentLength();
    }

    @Override // java.net.URLConnection
    public final long getContentLengthLong() {
        InstrURLConnectionBase instrURLConnectionBase = this.write;
        instrURLConnectionBase.MediaBrowserCompatMediaItem();
        return instrURLConnectionBase.write.getContentLengthLong();
    }

    @Override // java.net.URLConnection
    public final String getContentType() {
        InstrURLConnectionBase instrURLConnectionBase = this.write;
        instrURLConnectionBase.MediaBrowserCompatMediaItem();
        return instrURLConnectionBase.write.getContentType();
    }

    @Override // java.net.URLConnection
    public final long getDate() {
        InstrURLConnectionBase instrURLConnectionBase = this.write;
        instrURLConnectionBase.MediaBrowserCompatMediaItem();
        return instrURLConnectionBase.write.getDate();
    }

    @Override // java.net.URLConnection
    public final boolean getDefaultUseCaches() {
        return this.write.write.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public final boolean getDoInput() {
        return this.write.write.getDoInput();
    }

    @Override // java.net.URLConnection
    public final boolean getDoOutput() {
        return this.write.write.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        return this.write.write();
    }

    @Override // java.net.URLConnection
    public final long getExpiration() {
        InstrURLConnectionBase instrURLConnectionBase = this.write;
        instrURLConnectionBase.MediaBrowserCompatMediaItem();
        return instrURLConnectionBase.write.getExpiration();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        InstrURLConnectionBase instrURLConnectionBase = this.write;
        instrURLConnectionBase.MediaBrowserCompatMediaItem();
        return instrURLConnectionBase.write.getHeaderField(i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final long getHeaderFieldDate(String str, long j) {
        InstrURLConnectionBase instrURLConnectionBase = this.write;
        instrURLConnectionBase.MediaBrowserCompatMediaItem();
        return instrURLConnectionBase.write.getHeaderFieldDate(str, j);
    }

    @Override // java.net.URLConnection
    public final int getHeaderFieldInt(String str, int i) {
        InstrURLConnectionBase instrURLConnectionBase = this.write;
        instrURLConnectionBase.MediaBrowserCompatMediaItem();
        return instrURLConnectionBase.write.getHeaderFieldInt(str, i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) {
        InstrURLConnectionBase instrURLConnectionBase = this.write;
        instrURLConnectionBase.MediaBrowserCompatMediaItem();
        return instrURLConnectionBase.write.getHeaderFieldKey(i);
    }

    @Override // java.net.URLConnection
    public final long getHeaderFieldLong(String str, long j) {
        InstrURLConnectionBase instrURLConnectionBase = this.write;
        instrURLConnectionBase.MediaBrowserCompatMediaItem();
        return instrURLConnectionBase.write.getHeaderFieldLong(str, j);
    }

    @Override // java.net.URLConnection
    public final Map getHeaderFields() {
        InstrURLConnectionBase instrURLConnectionBase = this.write;
        instrURLConnectionBase.MediaBrowserCompatMediaItem();
        return instrURLConnectionBase.write.getHeaderFields();
    }

    @Override // java.net.URLConnection
    public final long getIfModifiedSince() {
        return this.write.write.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        return this.write.RemoteActionCompatParcelizer();
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.write.write.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public final long getLastModified() {
        InstrURLConnectionBase instrURLConnectionBase = this.write;
        instrURLConnectionBase.MediaBrowserCompatMediaItem();
        return instrURLConnectionBase.write.getLastModified();
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        return this.write.read();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() throws IOException {
        InstrURLConnectionBase instrURLConnectionBase = this.write;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = instrURLConnectionBase.IconCompatParcelizer;
        try {
            return instrURLConnectionBase.write.getPermission();
        } catch (IOException e) {
            af$$ExternalSyntheticOutline1.m(instrURLConnectionBase.RatingCompat, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        return this.write.write.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public final String getRequestMethod() {
        return this.write.write.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public final Map getRequestProperties() {
        return this.write.write.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        return this.write.write.getRequestProperty(str);
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        return this.write.RatingCompat();
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        return this.write.MediaDescriptionCompat();
    }

    @Override // java.net.URLConnection
    public final URL getURL() {
        return this.write.write.getURL();
    }

    @Override // java.net.URLConnection
    public final boolean getUseCaches() {
        return this.write.write.getUseCaches();
    }

    public final int hashCode() {
        return this.write.write.hashCode();
    }

    @Override // java.net.URLConnection
    public final void setAllowUserInteraction(boolean z) {
        this.write.write.setAllowUserInteraction(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setChunkedStreamingMode(int i) {
        this.write.write.setChunkedStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i) {
        this.write.write.setConnectTimeout(i);
    }

    @Override // java.net.URLConnection
    public final void setDefaultUseCaches(boolean z) {
        this.write.write.setDefaultUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final void setDoInput(boolean z) {
        this.write.write.setDoInput(z);
    }

    @Override // java.net.URLConnection
    public final void setDoOutput(boolean z) {
        this.write.write.setDoOutput(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i) {
        this.write.write.setFixedLengthStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j) {
        this.write.write.setIfModifiedSince(j);
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z) {
        this.write.write.setInstanceFollowRedirects(z);
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i) {
        this.write.write.setReadTimeout(i);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) throws ProtocolException {
        this.write.write.setRequestMethod(str);
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        InstrURLConnectionBase instrURLConnectionBase = this.write;
        instrURLConnectionBase.getClass();
        if (ConstantKt.USER_AGENT_HEADER.equalsIgnoreCase(str)) {
            instrURLConnectionBase.IconCompatParcelizer.MediaBrowserCompatMediaItem = str2;
        }
        instrURLConnectionBase.write.setRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public final void setUseCaches(boolean z) {
        this.write.write.setUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final String toString() {
        return this.write.write.toString();
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return this.write.write.usingProxy();
    }

    public invalidateLayers(HttpURLConnection httpURLConnection, com.google.firebase.perf.util.Timer timer, NetworkRequestMetricBuilder networkRequestMetricBuilder) {
        super(httpURLConnection.getURL());
        this.write = new InstrURLConnectionBase(httpURLConnection, timer, networkRequestMetricBuilder);
    }

    @Override // java.net.URLConnection
    public final Object getContent(Class[] clsArr) {
        return this.write.write(clsArr);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j) {
        this.write.write.setFixedLengthStreamingMode(j);
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        InstrURLConnectionBase instrURLConnectionBase = this.write;
        instrURLConnectionBase.MediaBrowserCompatMediaItem();
        return instrURLConnectionBase.write.getHeaderField(str);
    }
}
