package com.roadrunner.rider.recruitment.accountcreation.otp_verification.data;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import com.huawei.location.gwi.util.GwiErrorCode;
import com.huawei.riemann.location.common.utils.Constant;
import com.roadrunner.common.data.api.UniqueHttpException;
import o.ActivityHandlerExternalSyntheticLambda11;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OtpApiError extends Exception {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final Integer RemoteActionCompatParcelizer;

    public static final class InvalidRequestId extends OtpApiError {
        private static int IconCompatParcelizer = 1;
        private static int write;
        public final int read;
        public final UniqueHttpException serializer;

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            UniqueHttpException uniqueHttpException;
            int i = 2 % 2;
            int i2 = write + 35;
            int i3 = i2 % Fields.SpotShadowColor;
            IconCompatParcelizer = i3;
            if (i2 % 2 == 0) {
                uniqueHttpException = this.serializer;
                int i4 = 8 / 0;
            } else {
                uniqueHttpException = this.serializer;
            }
            int i5 = i3 + 65;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return uniqueHttpException;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.OtpApiError
        public final Integer IconCompatParcelizer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 67;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            Integer numValueOf = Integer.valueOf(this.read);
            int i4 = write + 119;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return numValueOf;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public InvalidRequestId(UniqueHttpException uniqueHttpException) {
            super(uniqueHttpException, Integer.valueOf(Constant.ERROR_ALGO_NULL_RESULT), "otpInvalidRequestId");
            this.serializer = uniqueHttpException;
            this.read = Constant.ERROR_ALGO_NULL_RESULT;
        }

        public final int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 27;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                iHashCode = Integer.hashCode(this.read) >>> (this.serializer.hashCode() >> GwiErrorCode.ALG_LIBRARY_NOT_EXIST);
            } else {
                iHashCode = (this.serializer.hashCode() * 31) + Integer.hashCode(this.read);
            }
            int i3 = write + 105;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return iHashCode;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x001d  */
        /* JADX WARN: Code duplicated, block: B:15:0x004a  */
        /* JADX WARN: Code duplicated, block: B:9:0x0018  */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
        
            if (r11.read == r12.read) goto L18;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(java.lang.Object r12) {
            /*
                r11 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.OtpApiError.InvalidRequestId.write
                int r1 = r1 + 69
                int r2 = r1 % 128
                com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.OtpApiError.InvalidRequestId.IconCompatParcelizer = r2
                int r1 = r1 % r0
                r2 = 0
                if (r1 != 0) goto L15
                r1 = 57
                int r1 = r1 / r2
                if (r11 != r12) goto L18
                goto L51
            L15:
                if (r11 != r12) goto L18
                goto L51
            L18:
                boolean r1 = r12 instanceof com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.OtpApiError.InvalidRequestId
                if (r1 != 0) goto L1d
                goto L50
            L1d:
                com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.OtpApiError$InvalidRequestId r12 = (com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.OtpApiError.InvalidRequestId) r12
                com.roadrunner.common.data.api.UniqueHttpException r1 = r11.serializer
                com.roadrunner.common.data.api.UniqueHttpException r3 = r12.serializer
                java.lang.Object[] r9 = new java.lang.Object[]{r1, r3}
                int r4 = o.getCieXyz.write()
                int r8 = o.getCieXyz.write()
                int r10 = o.getCieXyz.write()
                int r7 = o.getCieXyz.write()
                r5 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
                r6 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
                java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r4, r5, r6, r7, r8, r9, r10)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 != 0) goto L4a
                goto L50
            L4a:
                int r1 = r11.read
                int r12 = r12.read
                if (r1 == r12) goto L51
            L50:
                return r2
            L51:
                int r12 = com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.OtpApiError.InvalidRequestId.IconCompatParcelizer
                int r12 = r12 + 95
                int r1 = r12 % 128
                com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.OtpApiError.InvalidRequestId.write = r1
                int r12 = r12 % r0
                r12 = 1
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.OtpApiError.InvalidRequestId.equals(java.lang.Object):boolean");
        }

        @Override // java.lang.Throwable
        public final String toString() {
            int i = 2 % 2;
            String str = "InvalidRequestId(cause=" + this.serializer + ", statusCode=" + this.read + ")";
            int i2 = write + 11;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return str;
        }
    }

    public static final class ServerError extends OtpApiError {
        private static int IconCompatParcelizer = 0;
        private static int read = 1;
        public final int serializer;
        public final UniqueHttpException write;

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            int i = 2 % 2;
            int i2 = read;
            int i3 = i2 + 19;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            UniqueHttpException uniqueHttpException = this.write;
            int i5 = i2 + 63;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 42 / 0;
            }
            return uniqueHttpException;
        }

        public ServerError(UniqueHttpException uniqueHttpException, int i) {
            super(uniqueHttpException, Integer.valueOf(i), "otpServerError");
            this.write = uniqueHttpException;
            this.serializer = i;
        }

        @Override // com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.OtpApiError
        public final Integer IconCompatParcelizer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 69;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            Integer numValueOf = Integer.valueOf(this.serializer);
            int i4 = IconCompatParcelizer + 27;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return numValueOf;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = read + 125;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int iHashCode = Integer.hashCode(this.serializer) + (this.write.hashCode() * 31);
            int i4 = read + 61;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x001d  */
        /* JADX WARN: Code duplicated, block: B:15:0x004a  */
        /* JADX WARN: Code duplicated, block: B:9:0x0018  */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
        
            if (r11.serializer == r12.serializer) goto L18;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(java.lang.Object r12) {
            /*
                r11 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.OtpApiError.ServerError.IconCompatParcelizer
                int r1 = r1 + 9
                int r2 = r1 % 128
                com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.OtpApiError.ServerError.read = r2
                int r1 = r1 % r0
                r2 = 0
                if (r1 != 0) goto L15
                r1 = 16
                int r1 = r1 / r2
                if (r11 != r12) goto L18
                goto L51
            L15:
                if (r11 != r12) goto L18
                goto L51
            L18:
                boolean r1 = r12 instanceof com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.OtpApiError.ServerError
                if (r1 != 0) goto L1d
                goto L50
            L1d:
                com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.OtpApiError$ServerError r12 = (com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.OtpApiError.ServerError) r12
                com.roadrunner.common.data.api.UniqueHttpException r1 = r11.write
                com.roadrunner.common.data.api.UniqueHttpException r3 = r12.write
                java.lang.Object[] r9 = new java.lang.Object[]{r1, r3}
                int r4 = o.getCieXyz.write()
                int r8 = o.getCieXyz.write()
                int r10 = o.getCieXyz.write()
                int r7 = o.getCieXyz.write()
                r5 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
                r6 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
                java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r4, r5, r6, r7, r8, r9, r10)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 != 0) goto L4a
                goto L50
            L4a:
                int r1 = r11.serializer
                int r12 = r12.serializer
                if (r1 == r12) goto L51
            L50:
                return r2
            L51:
                int r12 = com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.OtpApiError.ServerError.read
                int r12 = r12 + 37
                int r1 = r12 % 128
                com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.OtpApiError.ServerError.IconCompatParcelizer = r1
                int r12 = r12 % r0
                if (r12 != 0) goto L5e
                r12 = 1
                return r12
            L5e:
                r12 = 0
                r12.hashCode()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.OtpApiError.ServerError.equals(java.lang.Object):boolean");
        }

        @Override // java.lang.Throwable
        public final String toString() {
            int i = 2 % 2;
            String str = "ServerError(cause=" + this.write + ", statusCode=" + this.serializer + ")";
            int i2 = read + 35;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 99 / 0;
            }
            return str;
        }
    }

    public static final class TooEarly extends OtpApiError {
        private static int read = 0;
        private static int write = 1;
        public final int IconCompatParcelizer;
        public final UniqueHttpException serializer;

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            int i = 2 % 2;
            int i2 = write;
            int i3 = i2 + 41;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            UniqueHttpException uniqueHttpException = this.serializer;
            int i5 = i2 + 13;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return uniqueHttpException;
        }

        @Override // com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.OtpApiError
        public final Integer IconCompatParcelizer() {
            int i = 2 % 2;
            int i2 = read + 81;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            Integer numValueOf = Integer.valueOf(this.IconCompatParcelizer);
            int i4 = write + 1;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return numValueOf;
        }

        public TooEarly(UniqueHttpException uniqueHttpException) {
            super(uniqueHttpException, 425, "otpTooEarly");
            this.serializer = uniqueHttpException;
            this.IconCompatParcelizer = 425;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = read + 95;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int iHashCode = Integer.hashCode(this.IconCompatParcelizer) + (this.serializer.hashCode() * 31);
            int i4 = read + 103;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return iHashCode;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x001d  */
        /* JADX WARN: Code duplicated, block: B:15:0x004a  */
        /* JADX WARN: Code duplicated, block: B:9:0x0018  */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
        
            if (r11.IconCompatParcelizer == r12.IconCompatParcelizer) goto L18;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(java.lang.Object r12) {
            /*
                r11 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.OtpApiError.TooEarly.read
                int r1 = r1 + 71
                int r2 = r1 % 128
                com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.OtpApiError.TooEarly.write = r2
                int r1 = r1 % r0
                r2 = 0
                if (r1 != 0) goto L15
                r1 = 42
                int r1 = r1 / r2
                if (r11 != r12) goto L18
                goto L51
            L15:
                if (r11 != r12) goto L18
                goto L51
            L18:
                boolean r1 = r12 instanceof com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.OtpApiError.TooEarly
                if (r1 != 0) goto L1d
                goto L50
            L1d:
                com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.OtpApiError$TooEarly r12 = (com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.OtpApiError.TooEarly) r12
                com.roadrunner.common.data.api.UniqueHttpException r1 = r11.serializer
                com.roadrunner.common.data.api.UniqueHttpException r3 = r12.serializer
                java.lang.Object[] r9 = new java.lang.Object[]{r1, r3}
                int r4 = o.getCieXyz.write()
                int r8 = o.getCieXyz.write()
                int r10 = o.getCieXyz.write()
                int r7 = o.getCieXyz.write()
                r5 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
                r6 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
                java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r4, r5, r6, r7, r8, r9, r10)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 != 0) goto L4a
                goto L50
            L4a:
                int r1 = r11.IconCompatParcelizer
                int r12 = r12.IconCompatParcelizer
                if (r1 == r12) goto L51
            L50:
                return r2
            L51:
                int r12 = com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.OtpApiError.TooEarly.write
                int r12 = r12 + 113
                int r1 = r12 % 128
                com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.OtpApiError.TooEarly.read = r1
                int r12 = r12 % r0
                r0 = 1
                if (r12 == 0) goto L5f
                r12 = 4
                int r12 = r12 / r2
            L5f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.OtpApiError.TooEarly.equals(java.lang.Object):boolean");
        }

        @Override // java.lang.Throwable
        public final String toString() {
            int i = 2 % 2;
            String str = "TooEarly(cause=" + this.serializer + ", statusCode=" + this.IconCompatParcelizer + ")";
            int i2 = write + 31;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return str;
        }
    }

    public static final class ValidationError extends OtpApiError {
        private static int MediaMetadataCompat = 1;
        private static int serializer;
        public final UniqueHttpException IconCompatParcelizer;
        public final int read;
        public final ActivityHandlerExternalSyntheticLambda11 write;

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            int i = 2 % 2;
            int i2 = serializer;
            int i3 = i2 + 69;
            MediaMetadataCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            UniqueHttpException uniqueHttpException = this.IconCompatParcelizer;
            int i5 = i2 + 95;
            MediaMetadataCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return uniqueHttpException;
        }

        @Override // com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.OtpApiError
        public final Integer IconCompatParcelizer() {
            int i = 2 % 2;
            int i2 = MediaMetadataCompat + 9;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            Integer numValueOf = Integer.valueOf(this.read);
            int i4 = serializer + 61;
            MediaMetadataCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return numValueOf;
        }

        public ValidationError(ActivityHandlerExternalSyntheticLambda11 activityHandlerExternalSyntheticLambda11, UniqueHttpException uniqueHttpException) {
            super(uniqueHttpException, 400, "otpValidationError");
            this.write = activityHandlerExternalSyntheticLambda11;
            this.IconCompatParcelizer = uniqueHttpException;
            this.read = 400;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = serializer + 49;
            MediaMetadataCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int iHashCode = this.write.hashCode();
            int iHashCode2 = Integer.hashCode(this.read) + ((this.IconCompatParcelizer.hashCode() + (iHashCode * 31)) * 31);
            int i4 = serializer + 37;
            MediaMetadataCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return iHashCode2;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            int i = 2 % 2;
            StringBuilder sb = new StringBuilder("ValidationError(response=");
            sb.append(this.write);
            sb.append(", cause=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", statusCode=");
            String strM = af$$ExternalSyntheticOutline0.m(this.read, ")", sb);
            int i2 = MediaMetadataCompat + 119;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return strM;
            }
            throw null;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = MediaMetadataCompat + 25;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this != obj) {
                if (!(obj instanceof ValidationError)) {
                    return false;
                }
                ValidationError validationError = (ValidationError) obj;
                Object[] objArr = {this.write, validationError.write};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                Object[] objArr2 = {this.IconCompatParcelizer, validationError.IconCompatParcelizer};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue() || this.read != validationError.read) {
                    return false;
                }
            }
            int i3 = MediaMetadataCompat + 23;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return true;
        }
    }

    public Integer IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 123;
        int i3 = i2 % Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        Integer num = this.RemoteActionCompatParcelizer;
        int i5 = i3 + 1;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return num;
    }

    public OtpApiError(UniqueHttpException uniqueHttpException, Integer num, String str) {
        super(str, uniqueHttpException);
        this.RemoteActionCompatParcelizer = num;
    }
}
