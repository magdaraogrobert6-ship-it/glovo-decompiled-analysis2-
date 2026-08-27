package com.mapbox.common;

import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes5.dex */
public class DownloadStatus implements Serializable {
    private long downloadId;
    private DownloadOptions downloadOptions;
    private TransferError error;
    private Expected<HttpRequestError, HttpResponseData> httpResult;
    private long receivedBytes;
    private TransferState state;
    private Long totalBytes;
    private long transferredBytes;

    public long getDownloadId() {
        return this.downloadId;
    }

    public DownloadOptions getDownloadOptions() {
        return this.downloadOptions;
    }

    public TransferError getError() {
        return this.error;
    }

    public Expected<HttpRequestError, HttpResponseData> getHttpResult() {
        return this.httpResult;
    }

    public long getReceivedBytes() {
        return this.receivedBytes;
    }

    public TransferState getState() {
        return this.state;
    }

    public Long getTotalBytes() {
        return this.totalBytes;
    }

    public long getTransferredBytes() {
        return this.transferredBytes;
    }

    public void setDownloadId(long j) {
        this.downloadId = j;
    }

    public void setDownloadOptions(DownloadOptions downloadOptions) {
        this.downloadOptions = downloadOptions;
    }

    public void setError(TransferError transferError) {
        this.error = transferError;
    }

    public void setHttpResult(Expected<HttpRequestError, HttpResponseData> expected) {
        this.httpResult = expected;
    }

    public void setReceivedBytes(long j) {
        this.receivedBytes = j;
    }

    public void setState(TransferState transferState) {
        this.state = transferState;
    }

    public void setTotalBytes(Long l) {
        this.totalBytes = l;
    }

    public void setTransferredBytes(long j) {
        this.transferredBytes = j;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public DownloadStatus(TransferError transferError, Long l, DownloadOptions downloadOptions, Expected<HttpRequestError, HttpResponseData> expected) {
        this.error = transferError;
        this.totalBytes = l;
        this.downloadOptions = downloadOptions;
        this.httpResult = expected;
        this.downloadId = 0L;
        this.state = TransferState.PENDING;
        this.receivedBytes = 0L;
        this.transferredBytes = 0L;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[downloadId: ");
        af$$ExternalSyntheticOutline1.m(this.downloadId, ", state: ", sb);
        sb.append(RecordUtils.fieldToString(this.state));
        sb.append(", error: ");
        sb.append(RecordUtils.fieldToString(this.error));
        sb.append(", totalBytes: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(this.totalBytes, sb, ", receivedBytes: ");
        af$$ExternalSyntheticOutline1.m(this.receivedBytes, ", transferredBytes: ", sb);
        af$$ExternalSyntheticOutline1.m(this.transferredBytes, ", downloadOptions: ", sb);
        sb.append(RecordUtils.fieldToString(this.downloadOptions));
        sb.append(", httpResult: ");
        sb.append(RecordUtils.fieldToString(this.httpResult));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        long j = this.downloadId;
        TransferState transferState = this.state;
        TransferError transferError = this.error;
        Long l = this.totalBytes;
        long j2 = this.receivedBytes;
        long j3 = this.transferredBytes;
        return Objects.hash(Long.valueOf(j), transferState, transferError, l, Long.valueOf(j2), Long.valueOf(j3), this.downloadOptions, this.httpResult);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadStatus downloadStatus = (DownloadStatus) obj;
        return this.downloadId == downloadStatus.downloadId && Objects.equals(this.state, downloadStatus.state) && Objects.equals(this.error, downloadStatus.error) && Objects.equals(this.totalBytes, downloadStatus.totalBytes) && this.receivedBytes == downloadStatus.receivedBytes && this.transferredBytes == downloadStatus.transferredBytes && Objects.equals(this.downloadOptions, downloadStatus.downloadOptions) && Objects.equals(this.httpResult, downloadStatus.httpResult);
    }

    public DownloadStatus(long j, TransferState transferState, TransferError transferError, Long l, long j2, long j3, DownloadOptions downloadOptions, Expected<HttpRequestError, HttpResponseData> expected) {
        this.downloadId = j;
        this.state = transferState;
        this.error = transferError;
        this.totalBytes = l;
        this.receivedBytes = j2;
        this.transferredBytes = j3;
        this.downloadOptions = downloadOptions;
        this.httpResult = expected;
    }
}
