package com.mapbox.search.base.result;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.huawei.location.resp.Vw;
import java.util.ArrayList;
import java.util.Iterator;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class BaseSearchResponse implements Parcelable {
    public static final Parcelable.Creator<BaseSearchResponse> CREATOR = new Vw.yn(12);
    public final String responseUUID;
    public final Result result;

    public static abstract class Result implements Parcelable {

        public static abstract class Error extends Result {

            public static final class ConnectionError extends Error {
                public static final Parcelable.Creator<ConnectionError> CREATOR = new Creator();
                public final String message;

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final int hashCode() {
                    return this.message.hashCode();
                }

                public ConnectionError(String str) {
                    str.getClass();
                    this.message = str;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeString(this.message);
                }

                public final class Creator implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new ConnectionError[i];
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        parcel.getClass();
                        return new ConnectionError(parcel.readString());
                    }
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ConnectionError)) {
                        return false;
                    }
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.message, ((ConnectionError) obj).message}, getCieXyz.write())).booleanValue();
                }

                public final String toString() {
                    return ff$$ExternalSyntheticOutline0.m(new StringBuilder("ConnectionError(message="), this.message, ')');
                }
            }

            public static final class HttpError extends Error {
                public static final Parcelable.Creator<HttpError> CREATOR = new Creator();
                public final int httpCode;
                public final String message;

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final int hashCode() {
                    return this.message.hashCode() + (Integer.hashCode(this.httpCode) * 31);
                }

                public HttpError(int i, String str) {
                    str.getClass();
                    this.httpCode = i;
                    this.message = str;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeInt(this.httpCode);
                    parcel.writeString(this.message);
                }

                public final class Creator implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new HttpError[i];
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        parcel.getClass();
                        return new HttpError(parcel.readInt(), parcel.readString());
                    }
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof HttpError)) {
                        return false;
                    }
                    HttpError httpError = (HttpError) obj;
                    if (this.httpCode != httpError.httpCode) {
                        return false;
                    }
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.message, httpError.message}, getCieXyz.write())).booleanValue();
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("HttpError(httpCode=");
                    sb.append(this.httpCode);
                    sb.append(", message=");
                    return ff$$ExternalSyntheticOutline0.m(sb, this.message, ')');
                }
            }

            public static final class InternalError extends Error {
                public static final Parcelable.Creator<InternalError> CREATOR = new Creator();
                public final String message;

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final int hashCode() {
                    return this.message.hashCode();
                }

                public InternalError(String str) {
                    str.getClass();
                    this.message = str;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeString(this.message);
                }

                public final class Creator implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new InternalError[i];
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        parcel.getClass();
                        return new InternalError(parcel.readString());
                    }
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof InternalError)) {
                        return false;
                    }
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.message, ((InternalError) obj).message}, getCieXyz.write())).booleanValue();
                }

                public final String toString() {
                    return ff$$ExternalSyntheticOutline0.m(new StringBuilder("InternalError(message="), this.message, ')');
                }
            }

            public static final class RequestCancelled extends Error {
                public static final Parcelable.Creator<RequestCancelled> CREATOR = new Creator();
                public final String reason;

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final int hashCode() {
                    return this.reason.hashCode();
                }

                public RequestCancelled(String str) {
                    str.getClass();
                    this.reason = str;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeString(this.reason);
                }

                public final class Creator implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new RequestCancelled[i];
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        parcel.getClass();
                        return new RequestCancelled(parcel.readString());
                    }
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof RequestCancelled)) {
                        return false;
                    }
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.reason, ((RequestCancelled) obj).reason}, getCieXyz.write())).booleanValue();
                }

                public final String toString() {
                    return ff$$ExternalSyntheticOutline0.m(new StringBuilder("RequestCancelled(reason="), this.reason, ')');
                }
            }
        }

        public static final class Success extends Result {
            public static final Parcelable.Creator<Success> CREATOR = new Creator();
            public final ArrayList result;

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final class Creator implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Success[i];
                }

                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(BaseRawSearchResult.CREATOR.createFromParcel(parcel));
                    }
                    return new Success(arrayList);
                }
            }

            public final int hashCode() {
                return this.result.hashCode();
            }

            public Success(ArrayList arrayList) {
                this.result = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && this.result.equals(((Success) obj).result);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                ArrayList arrayList = this.result;
                parcel.writeInt(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((BaseRawSearchResult) it.next()).writeToParcel(parcel, i);
                }
            }

            public final String toString() {
                return af$$ExternalSyntheticOutline1.m(new StringBuilder("Success(result="), this.result, ')');
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return this.responseUUID.hashCode() + (this.result.hashCode() * 31);
    }

    public BaseSearchResponse(Result result, String str) {
        result.getClass();
        str.getClass();
        this.result = result;
        this.responseUUID = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.result, i);
        parcel.writeString(this.responseUUID);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseSearchResponse)) {
            return false;
        }
        BaseSearchResponse baseSearchResponse = (BaseSearchResponse) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.result, baseSearchResponse.result}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.responseUUID, baseSearchResponse.responseUUID}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseSearchResponse(result=");
        sb.append(this.result);
        sb.append(", responseUUID=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.responseUUID, ')');
    }
}
