package com.mapbox.common;

import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes5.dex */
public class UploadStatus implements Serializable {
    private TransferError error;
    private Expected<HttpRequestError, HttpResponseData> httpResult;
    private long sentBytes;
    private TransferState state;
    private Long totalBytes;
    private long totalSentBytes;
    private long uploadId;

    public TransferError getError() {
        return this.error;
    }

    public Expected<HttpRequestError, HttpResponseData> getHttpResult() {
        return this.httpResult;
    }

    public long getSentBytes() {
        return this.sentBytes;
    }

    public TransferState getState() {
        return this.state;
    }

    public Long getTotalBytes() {
        return this.totalBytes;
    }

    public long getTotalSentBytes() {
        return this.totalSentBytes;
    }

    public long getUploadId() {
        return this.uploadId;
    }

    public void setError(TransferError transferError) {
        this.error = transferError;
    }

    public void setHttpResult(Expected<HttpRequestError, HttpResponseData> expected) {
        this.httpResult = expected;
    }

    public void setSentBytes(long j) {
        this.sentBytes = j;
    }

    public void setState(TransferState transferState) {
        this.state = transferState;
    }

    public void setTotalBytes(Long l) {
        this.totalBytes = l;
    }

    public void setTotalSentBytes(long j) {
        this.totalSentBytes = j;
    }

    public void setUploadId(long j) {
        this.uploadId = j;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public UploadStatus(TransferError transferError, Long l, Expected<HttpRequestError, HttpResponseData> expected) {
        this.error = transferError;
        this.totalBytes = l;
        this.httpResult = expected;
        this.uploadId = 0L;
        this.state = TransferState.PENDING;
        this.sentBytes = 0L;
        this.totalSentBytes = 0L;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[uploadId: ");
        af$$ExternalSyntheticOutline1.m(this.uploadId, ", state: ", sb);
        sb.append(RecordUtils.fieldToString(this.state));
        sb.append(", error: ");
        sb.append(RecordUtils.fieldToString(this.error));
        sb.append(", totalBytes: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(this.totalBytes, sb, ", sentBytes: ");
        af$$ExternalSyntheticOutline1.m(this.sentBytes, ", totalSentBytes: ", sb);
        af$$ExternalSyntheticOutline1.m(this.totalSentBytes, ", httpResult: ", sb);
        sb.append(RecordUtils.fieldToString(this.httpResult));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        long j = this.uploadId;
        TransferState transferState = this.state;
        TransferError transferError = this.error;
        Long l = this.totalBytes;
        long j2 = this.sentBytes;
        long j3 = this.totalSentBytes;
        return Objects.hash(Long.valueOf(j), transferState, transferError, l, Long.valueOf(j2), Long.valueOf(j3), this.httpResult);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UploadStatus uploadStatus = (UploadStatus) obj;
        return this.uploadId == uploadStatus.uploadId && Objects.equals(this.state, uploadStatus.state) && Objects.equals(this.error, uploadStatus.error) && Objects.equals(this.totalBytes, uploadStatus.totalBytes) && this.sentBytes == uploadStatus.sentBytes && this.totalSentBytes == uploadStatus.totalSentBytes && Objects.equals(this.httpResult, uploadStatus.httpResult);
    }

    public UploadStatus(long j, TransferState transferState, TransferError transferError, Long l, long j2, long j3, Expected<HttpRequestError, HttpResponseData> expected) {
        this.uploadId = j;
        this.state = transferState;
        this.error = transferError;
        this.totalBytes = l;
        this.sentBytes = j2;
        this.totalSentBytes = j3;
        this.httpResult = expected;
    }
}
