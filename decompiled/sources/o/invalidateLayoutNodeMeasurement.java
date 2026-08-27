package o;

import bo.app.af$$ExternalSyntheticOutline1;
import com.deliveryhero.fwf_http.ConstantKt;
import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.network.InstrURLConnectionBase;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class invalidateLayoutNodeMeasurement extends HttpsURLConnection {
    public final HttpsURLConnection RemoteActionCompatParcelizer;
    public final InstrURLConnectionBase serializer;

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        this.serializer.write.addRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public final void connect() throws IOException {
        this.serializer.IconCompatParcelizer();
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        InstrURLConnectionBase instrURLConnectionBase = this.serializer;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = instrURLConnectionBase.IconCompatParcelizer;
        networkRequestMetricBuilder.IconCompatParcelizer(instrURLConnectionBase.RatingCompat.read());
        networkRequestMetricBuilder.RemoteActionCompatParcelizer();
        instrURLConnectionBase.write.disconnect();
    }

    public final boolean equals(Object obj) {
        return this.serializer.write.equals(obj);
    }

    @Override // java.net.URLConnection
    public final boolean getAllowUserInteraction() {
        return this.serializer.write.getAllowUserInteraction();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final String getCipherSuite() {
        return this.RemoteActionCompatParcelizer.getCipherSuite();
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.serializer.write.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public final Object getContent() {
        return this.serializer.serializer();
    }

    @Override // java.net.URLConnection
    public final String getContentEncoding() {
        InstrURLConnectionBase instrURLConnectionBase = this.serializer;
        instrURLConnectionBase.MediaBrowserCompatMediaItem();
        return instrURLConnectionBase.write.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public final int getContentLength() {
        InstrURLConnectionBase instrURLConnectionBase = this.serializer;
        instrURLConnectionBase.MediaBrowserCompatMediaItem();
        return instrURLConnectionBase.write.getContentLength();
    }

    @Override // java.net.URLConnection
    public final long getContentLengthLong() {
        InstrURLConnectionBase instrURLConnectionBase = this.serializer;
        instrURLConnectionBase.MediaBrowserCompatMediaItem();
        return instrURLConnectionBase.write.getContentLengthLong();
    }

    @Override // java.net.URLConnection
    public final String getContentType() {
        InstrURLConnectionBase instrURLConnectionBase = this.serializer;
        instrURLConnectionBase.MediaBrowserCompatMediaItem();
        return instrURLConnectionBase.write.getContentType();
    }

    @Override // java.net.URLConnection
    public final long getDate() {
        InstrURLConnectionBase instrURLConnectionBase = this.serializer;
        instrURLConnectionBase.MediaBrowserCompatMediaItem();
        return instrURLConnectionBase.write.getDate();
    }

    @Override // java.net.URLConnection
    public final boolean getDefaultUseCaches() {
        return this.serializer.write.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public final boolean getDoInput() {
        return this.serializer.write.getDoInput();
    }

    @Override // java.net.URLConnection
    public final boolean getDoOutput() {
        return this.serializer.write.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        return this.serializer.write();
    }

    @Override // java.net.URLConnection
    public final long getExpiration() {
        InstrURLConnectionBase instrURLConnectionBase = this.serializer;
        instrURLConnectionBase.MediaBrowserCompatMediaItem();
        return instrURLConnectionBase.write.getExpiration();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        InstrURLConnectionBase instrURLConnectionBase = this.serializer;
        instrURLConnectionBase.MediaBrowserCompatMediaItem();
        return instrURLConnectionBase.write.getHeaderField(i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final long getHeaderFieldDate(String str, long j) {
        InstrURLConnectionBase instrURLConnectionBase = this.serializer;
        instrURLConnectionBase.MediaBrowserCompatMediaItem();
        return instrURLConnectionBase.write.getHeaderFieldDate(str, j);
    }

    @Override // java.net.URLConnection
    public final int getHeaderFieldInt(String str, int i) {
        InstrURLConnectionBase instrURLConnectionBase = this.serializer;
        instrURLConnectionBase.MediaBrowserCompatMediaItem();
        return instrURLConnectionBase.write.getHeaderFieldInt(str, i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) {
        InstrURLConnectionBase instrURLConnectionBase = this.serializer;
        instrURLConnectionBase.MediaBrowserCompatMediaItem();
        return instrURLConnectionBase.write.getHeaderFieldKey(i);
    }

    @Override // java.net.URLConnection
    public final long getHeaderFieldLong(String str, long j) {
        InstrURLConnectionBase instrURLConnectionBase = this.serializer;
        instrURLConnectionBase.MediaBrowserCompatMediaItem();
        return instrURLConnectionBase.write.getHeaderFieldLong(str, j);
    }

    @Override // java.net.URLConnection
    public final Map getHeaderFields() {
        InstrURLConnectionBase instrURLConnectionBase = this.serializer;
        instrURLConnectionBase.MediaBrowserCompatMediaItem();
        return instrURLConnectionBase.write.getHeaderFields();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final HostnameVerifier getHostnameVerifier() {
        return this.RemoteActionCompatParcelizer.getHostnameVerifier();
    }

    @Override // java.net.URLConnection
    public final long getIfModifiedSince() {
        return this.serializer.write.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        return this.serializer.RemoteActionCompatParcelizer();
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.serializer.write.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public final long getLastModified() {
        InstrURLConnectionBase instrURLConnectionBase = this.serializer;
        instrURLConnectionBase.MediaBrowserCompatMediaItem();
        return instrURLConnectionBase.write.getLastModified();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Certificate[] getLocalCertificates() {
        return this.RemoteActionCompatParcelizer.getLocalCertificates();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Principal getLocalPrincipal() {
        return this.RemoteActionCompatParcelizer.getLocalPrincipal();
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        return this.serializer.read();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Principal getPeerPrincipal() {
        return this.RemoteActionCompatParcelizer.getPeerPrincipal();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() throws IOException {
        InstrURLConnectionBase instrURLConnectionBase = this.serializer;
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
        return this.serializer.write.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public final String getRequestMethod() {
        return this.serializer.write.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public final Map getRequestProperties() {
        return this.serializer.write.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        return this.serializer.write.getRequestProperty(str);
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        return this.serializer.RatingCompat();
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        return this.serializer.MediaDescriptionCompat();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final SSLSocketFactory getSSLSocketFactory() {
        return this.RemoteActionCompatParcelizer.getSSLSocketFactory();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Certificate[] getServerCertificates() {
        return this.RemoteActionCompatParcelizer.getServerCertificates();
    }

    @Override // java.net.URLConnection
    public final URL getURL() {
        return this.serializer.write.getURL();
    }

    @Override // java.net.URLConnection
    public final boolean getUseCaches() {
        return this.serializer.write.getUseCaches();
    }

    public final int hashCode() {
        return this.serializer.write.hashCode();
    }

    @Override // java.net.URLConnection
    public final void setAllowUserInteraction(boolean z) {
        this.serializer.write.setAllowUserInteraction(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setChunkedStreamingMode(int i) {
        this.serializer.write.setChunkedStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i) {
        this.serializer.write.setConnectTimeout(i);
    }

    @Override // java.net.URLConnection
    public final void setDefaultUseCaches(boolean z) {
        this.serializer.write.setDefaultUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final void setDoInput(boolean z) {
        this.serializer.write.setDoInput(z);
    }

    @Override // java.net.URLConnection
    public final void setDoOutput(boolean z) {
        this.serializer.write.setDoOutput(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i) {
        this.serializer.write.setFixedLengthStreamingMode(i);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.RemoteActionCompatParcelizer.setHostnameVerifier(hostnameVerifier);
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j) {
        this.serializer.write.setIfModifiedSince(j);
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z) {
        this.serializer.write.setInstanceFollowRedirects(z);
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i) {
        this.serializer.write.setReadTimeout(i);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) throws ProtocolException {
        this.serializer.write.setRequestMethod(str);
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        InstrURLConnectionBase instrURLConnectionBase = this.serializer;
        instrURLConnectionBase.getClass();
        if (ConstantKt.USER_AGENT_HEADER.equalsIgnoreCase(str)) {
            instrURLConnectionBase.IconCompatParcelizer.MediaBrowserCompatMediaItem = str2;
        }
        instrURLConnectionBase.write.setRequestProperty(str, str2);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.RemoteActionCompatParcelizer.setSSLSocketFactory(sSLSocketFactory);
    }

    @Override // java.net.URLConnection
    public final void setUseCaches(boolean z) {
        this.serializer.write.setUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final String toString() {
        return this.serializer.write.toString();
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return this.serializer.write.usingProxy();
    }

    public invalidateLayoutNodeMeasurement(HttpsURLConnection httpsURLConnection, com.google.firebase.perf.util.Timer timer, NetworkRequestMetricBuilder networkRequestMetricBuilder) {
        super(httpsURLConnection.getURL());
        this.RemoteActionCompatParcelizer = httpsURLConnection;
        this.serializer = new InstrURLConnectionBase(httpsURLConnection, timer, networkRequestMetricBuilder);
    }

    @Override // java.net.URLConnection
    public final Object getContent(Class[] clsArr) {
        return this.serializer.write(clsArr);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j) {
        this.serializer.write.setFixedLengthStreamingMode(j);
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        InstrURLConnectionBase instrURLConnectionBase = this.serializer;
        instrURLConnectionBase.MediaBrowserCompatMediaItem();
        return instrURLConnectionBase.write.getHeaderField(str);
    }
}
