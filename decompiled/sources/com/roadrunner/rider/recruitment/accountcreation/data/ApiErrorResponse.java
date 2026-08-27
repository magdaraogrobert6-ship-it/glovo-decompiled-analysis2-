package com.roadrunner.rider.recruitment.accountcreation.data;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import com.roadrunner.common.data.api.UniqueHttpException;
import o.ActivityHandler17;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ApiErrorResponse extends Exception {
    private static int serializer = 1;
    private static int write;
    public final UniqueHttpException RemoteActionCompatParcelizer;

    public static final class AccountCreationFailureResponse extends ApiErrorResponse {
        private static int MediaMetadataCompat = 1;
        private static int serializer;
        public final int IconCompatParcelizer;
        public final UniqueHttpException read;
        public final ActivityHandler17 write;

        public AccountCreationFailureResponse(ActivityHandler17 activityHandler17, UniqueHttpException uniqueHttpException, int i) {
            super(uniqueHttpException, "accountCreationError");
            this.write = activityHandler17;
            this.read = uniqueHttpException;
            this.IconCompatParcelizer = i;
        }

        @Override // com.roadrunner.rider.recruitment.accountcreation.data.ApiErrorResponse, java.lang.Throwable
        public final Throwable getCause() {
            int i = 2 % 2;
            int i2 = serializer + 119;
            int i3 = i2 % Fields.SpotShadowColor;
            MediaMetadataCompat = i3;
            int i4 = i2 % 2;
            UniqueHttpException uniqueHttpException = this.read;
            int i5 = i3 + 1;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return uniqueHttpException;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = serializer + 3;
            MediaMetadataCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int iHashCode = this.write.hashCode();
            int iHashCode2 = Integer.hashCode(this.IconCompatParcelizer) + ((this.read.hashCode() + (iHashCode * 31)) * 31);
            int i4 = serializer + 57;
            MediaMetadataCompat = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return iHashCode2;
            }
            throw null;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            int i = 2 % 2;
            StringBuilder sb = new StringBuilder("AccountCreationFailureResponse(accountCreationResponse=");
            sb.append(this.write);
            sb.append(", cause=");
            sb.append(this.read);
            sb.append(", statusCode=");
            String strM = af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, ")", sb);
            int i2 = MediaMetadataCompat + 81;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return strM;
        }

        public final boolean equals(Object obj) {
            int i;
            int i2 = 2 % 2;
            if (this != obj) {
                if (obj instanceof AccountCreationFailureResponse) {
                    AccountCreationFailureResponse accountCreationFailureResponse = (AccountCreationFailureResponse) obj;
                    Object[] objArr = {this.write, accountCreationFailureResponse.write};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                        Object[] objArr2 = {this.read, accountCreationFailureResponse.read};
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue() || this.IconCompatParcelizer != accountCreationFailureResponse.IconCompatParcelizer) {
                            return false;
                        }
                    } else {
                        i = serializer + 9;
                        MediaMetadataCompat = i % Fields.SpotShadowColor;
                    }
                } else {
                    i = MediaMetadataCompat + 105;
                    serializer = i % Fields.SpotShadowColor;
                }
                int i3 = i % 2;
                return false;
            }
            int i4 = serializer + 109;
            MediaMetadataCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
    }

    public static final class PhoneValidationFailureResponse extends ApiErrorResponse {
        private static int read = 0;
        private static int write = 1;
        public final int IconCompatParcelizer;
        public final UniqueHttpException serializer;

        public PhoneValidationFailureResponse(UniqueHttpException uniqueHttpException, int i) {
            super(uniqueHttpException, "phoneValidationError");
            this.serializer = uniqueHttpException;
            this.IconCompatParcelizer = i;
        }

        @Override // com.roadrunner.rider.recruitment.accountcreation.data.ApiErrorResponse, java.lang.Throwable
        public final Throwable getCause() {
            int i = 2 % 2;
            int i2 = write + 105;
            int i3 = i2 % Fields.SpotShadowColor;
            read = i3;
            int i4 = i2 % 2;
            UniqueHttpException uniqueHttpException = this.serializer;
            int i5 = i3 + 53;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return uniqueHttpException;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = read + 101;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return Integer.hashCode(this.IconCompatParcelizer) << (this.serializer.hashCode() >> 125);
            }
            return (this.serializer.hashCode() * 31) + Integer.hashCode(this.IconCompatParcelizer);
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = write + 59;
            read = i2 % Fields.SpotShadowColor;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            if (this != obj) {
                if (!(obj instanceof PhoneValidationFailureResponse)) {
                    return false;
                }
                PhoneValidationFailureResponse phoneValidationFailureResponse = (PhoneValidationFailureResponse) obj;
                Object[] objArr = {this.serializer, phoneValidationFailureResponse.serializer};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() || this.IconCompatParcelizer != phoneValidationFailureResponse.IconCompatParcelizer) {
                    return false;
                }
            }
            int i3 = read + 43;
            write = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return true;
            }
            throw null;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            int i = 2 % 2;
            String str = "PhoneValidationFailureResponse(cause=" + this.serializer + ", statusCode=" + this.IconCompatParcelizer + ")";
            int i2 = write + 43;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return str;
        }
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        int i = 2 % 2;
        int i2 = serializer + 79;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.RemoteActionCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ApiErrorResponse(UniqueHttpException uniqueHttpException, String str) {
        super(str, uniqueHttpException);
        this.RemoteActionCompatParcelizer = uniqueHttpException;
    }
}
